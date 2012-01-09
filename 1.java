
package com.dbcc.ecomm.webservices.output;

import java.io.Serializable;


public class CoResponse implements Serializable {
    

    /**
     * 
     */
    private static final long serialVersionUID = 8505991271096086827L;

     /**
     * Business Name
     */
    private String companyName;
    
    /**
     * Phone Number
     */
    private String phone;
    
    /**
     * Street City
     */
    private String city;
    
    /**
     * State
     */
    private String state;
    
    /**
     * Type
     */
    private String type;
    
    /**
     * StreetAddress
     */
    private String streetAddress;
    
    /**
     * @return the duns
     */
    public String getDuns() {

        return duns;
    }
    
    /**
     * @param duns
     *            the duns to set
     */
    public void setDuns(String duns) {

        this.duns = duns;
    }
    
    /**
     * @return the companyName
     */
    public String getCompanyName() {

        return companyName;
    }
    
    /**
     * @param companyName
     *            the companyName to set
     */
    public void setCompanyName(String companyName) {

        this.companyName = companyName;
    }
    
    /**
     * @return the phone
     */
    public String getPhone() {

        return phone;
    }
    
    /**
     * @param phone
     *            the phone to set
     */
    public void setPhone(String phone) {

        this.phone = phone;
    }
    
    /**
     * @return the city
     */
    public String getCity() {

        return city;
    }
    
    /**
     * @param city
     *            the city to set
     */
    public void setCity(String city) {

        this.city = city;
    }
    
    /**
     * @return the state
     */
    public String getState() {

        return state;
    }
    
    /**
     * @param state
     *            the state to set
     */
    public void setState(String state) {

        this.state = state;
    }
    
    /**
     * @return the type
     */
    public String getType() {

        return type;
    }
    
    /**
     * @param type
     *            the type to set
     */
    public void setType(String type) {

        this.type = type;
    }
    
    /**
     * @return the streetAddress
     */
    public String getStreetAddress() {

        return streetAddress;
    }
    
    /**
     * @param streetAddress
     *            the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {

        this.streetAddress = streetAddress;
    }
    
    /**
     * @return the zipCode
     */
    public String getZipCode() {

        return zipCode;
    }
    
    /**
     * @param zipCode
     *            the zipCode to set
     */
    public void setZipCode(String zipCode) {

        this.zipCode = zipCode;
    }
    
    /**
     * @return the cityState
     */
    public String getCityState() {

        return cityState;
    }
    
    /**
     * @param cityState
     *            the cityState to set
     */
    public void setCityState(String cityState) {

        this.cityState = cityState;
    }
    
    /**
     * Zipcode
     */
    private String zipCode;
    
    /**
     * cityState
     */
    private String cityState;
    
}
