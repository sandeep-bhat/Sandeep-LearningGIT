package com.dbcc.ecomm.webservices.output;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;


/**
 * 
 * @author rapandit
 * This class is used as the response data transfer object for the febrication service.
 */
@XmlRootElement(name = "AlertReport")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertReport")
public class AlertReportDTO {

	/** serial Version UID*/
	private static final long serialVersionUID = 5893465704788179643L;


	/** smopublicFilingSection */
    @XmlElement(name = "smoeventSections", namespace = "http://smoeventSections.section.report.core.ecomm.dbcc.com", required = true)
	private List<AlertEventSection> eventSections;
    
    /** smopublicFilingSection */
    @XmlElement(name = "smoinquirySections", namespace = "http://smoinquirySections.section.report.core.ecomm.dbcc.com", required = true)
    private List<AlertInquirySection> inquirySections;
    
    /** smopublicFilingSection */
    @XmlElement(name = "smoscoreSections", namespace = "http://smoscoreSections.section.report.core.ecomm.dbcc.com", required = true)
    private List<AlertScoreSection> scoreSections;

    /** smopublicFilingSection */
    @XmlElement(name = "smoalertSection", namespace = "http://smoalertSection.section.report.core.ecomm.dbcc.com", required = true)
    private AlertSection alertSection;

    
    
    /**
     * @return the eventSections
     */
    public List<AlertEventSection> getEventSections() {
    
        return eventSections;
    }

    
    
    /**
     * @param eventSections the eventSections to set
     */
    public void setEventSections(List<AlertEventSection> eventSections) {
    
        this.eventSections = eventSections;
    }

    
    
    /**
     * @return the inquirySections
     */
    public List<AlertInquirySection> getInquirySections() {
    
        return inquirySections;
    }

    
    
    /**
     * @param inquirySections the inquirySections to set
     */
    public void setInquirySections(List<AlertInquirySection> inquirySections) {
    
        this.inquirySections = inquirySections;
    }

    
    
    /**
     * @return the scoreSections
     */
    public List<AlertScoreSection> getScoreSections() {
    
        return scoreSections;
    }

    
    
    /**
     * @param scoreSections the scoreSections to set
     */
    public void setScoreSections(List<AlertScoreSection> scoreSections) {
    
        this.scoreSections = scoreSections;
    }

    
    
    /**
     * @return the alertSection
     */
    public AlertSection getAlertSection() {
    
        return alertSection;
    }

    
    
    /**
     * @param alertSection the alertSection to set
     */
    public void setAlertSection(AlertSection alertSection) {
    
        this.alertSection = alertSection;
    }
    
    
		
}
