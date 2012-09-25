training-calculator-rest
========================

to run : 

1. checkout the project ecms 
2. search file core-connector-configuration.xml, add in this file all service you want export by Rest service  for Example : 

        <component>
		<type>org.exoplatform.cross.rest.CalculService</type>
	</component>

	<component>
		<type>org.exoplatform.cross.rest.HelloService</type>
	</component>

	<component>
		<type>org.exoplatform.cross.rest.DateService</type>
	</component>
3. build and run 
4. access the url : 
-- rest Service for helloworld

http://localhost:8080/ecmdemo/rest-ecmdemo/rest/helloworld

 
-- Rest Service for calcul the different between two date in several format as Minutes, Hours, Day with 3 url following

http://localhost:8080/ecmdemo/rest-ecmdemo/dateService/diffDate/11-05-2011/11-07-2012/Min
http://localhost:8080/ecmdemo/rest-ecmdemo/dateService/diffDate/11-05-2011/11-07-2012/Hour
http://localhost:8080/ecmdemo/rest-ecmdemo/dateService/diffDate/11-05-2011/11-07-2012/Day

-- Calculator Rest Service : 
4 operators add multiplication, addition, soutraction, division with 4 url following

http://localhost:8080/ecmdemo/rest-ecmdemo/calculService/multi/1/2
http://localhost:8080/ecmdemo/rest-ecmdemo/calculService/plus/1/2
http://localhost:8080/ecmdemo/rest-ecmdemo/calculService/subs/1/2
http://localhost:8080/ecmdemo/rest-ecmdemo/calculService/div/1/2





WebService calculator
