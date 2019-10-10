/*package com.zoomable.map.api.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.zoomable.map.api.model.InventoryModel;
import com.zoomable.map.api.repository.ApiRepository;
import com.zoomable.map.api.util.Util;

public abstract class ApiRepositoryImpl implements ApiRepository {

	@Autowired
	MongoTemplate template;
	
	@Override
	public List<InventoryModel> findAll(boolean excessQty30Days, boolean excessQty60Days, boolean excessQty90Days,
			boolean excessValue30Days, boolean excessValue60Days, boolean excessValue90Days, boolean obsoleteQty,
			boolean obsoleteValue) {

		Query query = Util.addBooleanCriteria(excessQty30Days, excessQty60Days, excessQty90Days, excessValue30Days,
				excessValue60Days, excessValue90Days, obsoleteQty, obsoleteValue);

		return template.find(query, InventoryModel.class);
	}

	@Override
	public List<InventoryModel> findByRegion(String region, boolean excessQty30Days, boolean excessQty60Days,
			boolean excessQty90Days, boolean excessValue30Days, boolean excessValue60Days, boolean excessValue90Days,
			boolean obsoleteQty, boolean obsoleteValue) {
		
		Query query = Util.addBooleanCriteria(excessQty30Days, excessQty60Days, excessQty90Days, excessValue30Days,
				excessValue60Days, excessValue90Days, obsoleteQty, obsoleteValue);
		
		query.addCriteria(Criteria.where("Region").is(region));
		
		return template.find(query, InventoryModel.class);
	}
	
	

}
*/