
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String


 /**
	 * Refresh browser
	 */ 
def static "radarHomepage.RadarHomePage.refreshBrowser"() {
    (new radarHomepage.RadarHomePage()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "radarHomepage.RadarHomePage.clickElement"(
    	TestObject to	) {
    (new radarHomepage.RadarHomePage()).clickElement(
        	to)
}

 /**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */ 
def static "radarHomepage.RadarHomePage.getHtmlTableRows"(
    	TestObject table	
     , 	String outerTagName	) {
    (new radarHomepage.RadarHomePage()).getHtmlTableRows(
        	table
         , 	outerTagName)
}

 /**
	 * Page verification
	 */ 
def static "radarHomepage.RadarHomePage.verifyRadarModel"() {
    (new radarHomepage.RadarHomePage()).verifyRadarModel()
}

 /**
	 * Close browser
	 */ 
def static "radarHomepage.RadarHomePage.browserClose"() {
    (new radarHomepage.RadarHomePage()).browserClose()
}
