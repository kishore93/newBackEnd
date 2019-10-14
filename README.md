# OSDM Up &amp; Running

# SCCT Technologies used

**Front end:**

| **S.no** | **Technology used** | **version** |
| --- | --- | --- |
| **1** | Angular | 8 |
| **2** | Typescript | 3.4 |
| **3** | D3 | 5 |
| **4** | Types/d3 | 5 |
| **5** | Node | 10 |
| **6** | MdBootstap | 4 |
| **7** | Bootstrap | 4 |

**Back end:**

| **S.no** | **Technology used** | **version** |
| --- | --- | --- |
| 1 | Java | 1.8 |
| 2 | Spring Boot | 2.1.5 |
| 3 | MongoDB | 4.0 |

**Applications need to install in local:**

1. **Java (JDK)**
2. **Maven**
3. **Node**
4. **Angular**
5. **Install Mongo DB**

OSDM Application Up &amp; Running

**Cloning the project from GIT:  ** git clone [https://github.com/kishore93/osdm.git](https://github.com/kishore93/osdm.git)

**Running the Spring Boot application in local:       **

1. Go to **OSDMBackendAPI** folder and open Command prompt
2. Type **mvn clean install  -Dmaven.test.skip=true** and enter
3. Open **Target folder** and open **Command Prompt**
4. Type **java –jar zoomable-map-data-api-1.0.0.jar** and enter (or) Type **java –jar osdm-spring-boot-app-1.0.0.jar** and enter

Now the Spring Boot application is up and running.

**Running the Angular application in local:**

1. Go to **OSDMDashboard** folder and open Command prompt
2. Type **npm install**
3. Wait for the node to install in your project and if any vulnerability comes up fix it using the suggestion given in the CMD
4. And then run the angular application using **ng serve**
5. Go to. / osdm/OSDMDashboard/src/app/heat-map/ heat-map.component.ts and comment the line **160 if the given suggestion is at the line 160 .range([&#39;#fff&#39;,&#39;red&#39;]);**.
6. The application automatically runs.
7. Once the application is up and running again un-comment the line **160 if the given suggestion is at the line 160** in the same file.
8. Open chrome browser and type **localhost:4200** and enter.



Import data to MongoDB Compass:

&quot;C:\Program Files\MongoDB\Server\4.2\bin\mongoimport&quot; --host localhost --db OSDM --collection Inventory --file &quot;C:\Users\nmukara\Documents\MyJabberFiles\vtavva@cisco.com\data.json&quot;

Start MongoDB server :

&quot;C:\Program Files\MongoDB\Server\4.2\bin\mongo&quot; --dbpath &quot;C:\Users\nmukara\git\Mongo Data&quot;