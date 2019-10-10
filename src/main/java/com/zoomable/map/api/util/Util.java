package com.zoomable.map.api.util;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

public class Util {

	public static boolean isNullOrEmptyorAll(String value) {
		if(value == null || "".equals(value) || "ALL".equals(value)) {
			return false;
		}
		return true;
	}
	
	public static Query addBooleanCriteria(boolean excessQty30Days, boolean excessQty60Days, boolean excessQty90Days,
			boolean excessValue30Days, boolean excessValue60Days, boolean excessValue90Days, boolean obsoleteQty,
			boolean obsoleteValue) {
		
		Query query = new Query();
				
		Criteria excessCriteria = new Criteria();
		

		Criteria excess30 = new Criteria();
		Criteria excess60 = new Criteria();
		Criteria excess90 = new Criteria();
		
		if(excessQty30Days) {
						
			excess30 = Criteria.where("ExcessQty30Days").gt(0);
			
			//query.addCriteria(Criteria.where("ExcessQty30Days").gt(0));
		}
		
		if(excessQty60Days) {
			
			excess60 = Criteria.where("ExcessQty60Days").gt(0);
			
			//query.addCriteria(Criteria.where("ExcessQty60Days").gt(0));
		}
		
		if(excessQty90Days) {
			
			excess90 = Criteria.where("ExcessQty90Days").gt(0);
			
			//query.addCriteria(Criteria.where("ExcessQty90Days").gt(0));
		}
		
		excessCriteria.orOperator(excess30,excess60,excess90);
		
		query.addCriteria(excessCriteria);
		
		if(excessValue30Days) {
			query.addCriteria(Criteria.where("ExcessValue30Days").gt(0));
		}
		
		if(excessValue60Days) {
			query.addCriteria(Criteria.where("ExcessValue60Days").gt(0));
		}
		
		if(excessValue90Days) {
			query.addCriteria(Criteria.where("ExcessValue90Days").gt(0));
		}
		
		if(obsoleteQty) {
			query.addCriteria(Criteria.where("ObsoleteQty").gt(0));
		}
		
		if(obsoleteValue) {
			query.addCriteria(Criteria.where("ObsoleteValue").gt(0));
		}
		
		return query;
	}
	
}
