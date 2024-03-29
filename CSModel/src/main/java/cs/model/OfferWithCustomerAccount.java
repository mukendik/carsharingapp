package cs.model;

import java.io.Serializable;
import java.text.ParseException;

import org.json.JSONException;
import org.json.JSONObject;


public class OfferWithCustomerAccount implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Integer id;
	
//	private String startingCity;
//	private String finishingCity;
//    private Integer numberOfPlaceRemaining;
//    private Float pricePerPassenger;
//    private Date datetimeStarted;
//    
    private Offer offer;
	private CustomerAccount customerAccount;
    
    
    public OfferWithCustomerAccount()
    {
    	
    }
    
    public OfferWithCustomerAccount(JSONObject jsonObjectOfferWithCustomerAccount) throws JSONException, ParseException
    {
    	id        	           = jsonObjectOfferWithCustomerAccount.getInt("id");
    	
    	offer                  = new Offer(jsonObjectOfferWithCustomerAccount.getJSONObject("offer"));
    	customerAccount        = new CustomerAccount(jsonObjectOfferWithCustomerAccount.getJSONObject("customerAccount"));
    	
//        startingCity 		   = jsonObjectOfferWithCustomerAccount.getString("startingCity");
//        finishingCity          = jsonObjectOfferWithCustomerAccount.getString("finishingCity");                
//		
//		numberOfPlaceRemaining = jsonObjectOfferWithCustomerAccount.getInt("numberOfPlaceRemaining");
//		pricePerPassenger      = Float.parseFloat(jsonObjectOfferWithCustomerAccount.getString("pricePerPassenger"));
//
//		// Ugly part
//		SimpleDateFormat datetimeStartedFormatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
//		datetimeStarted        = datetimeStartedFormatter.parse(jsonObjectOfferWithCustomerAccount.getString("datetimeStarted"));
    }
    
    public Integer getId() {
            return id;
    }
    
    public void setId(Integer id) {
            this.id = id;
    }

	public Offer getOffer() {
		return offer;
	}

	public void setOffer(Offer offer) {
		this.offer = offer;
	}
    
    public CustomerAccount getCustomerAccount() {
		return customerAccount;
	}

	public void setCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccount = customerAccount;
	}
//	
//    public String getStartingCity() {
//            return startingCity;
//    }
//
//    public void setStartingCity(String startingCity) {
//            this.startingCity = startingCity;
//    }
//
//    public String getFinishingCity() {
//            return finishingCity;
//    }
//
//    public void setFinishingCity(String finishingCity) {
//            this.finishingCity = finishingCity;
//    }
//    
//    public Float getPricePerPassenger() {
//            return pricePerPassenger;
//    }
//    
//    public void setPricePerPassenger(Float pricePerPassenger) {
//            this.pricePerPassenger = pricePerPassenger;
//    }
//
//    public Integer getNumberOfPlaceRemaining() {
//            return numberOfPlaceRemaining;
//    }
//
//    public void setNumberOfPlaceRemaining(Integer numberOfPlaceRemaining) {
//            this.numberOfPlaceRemaining = numberOfPlaceRemaining;
//    }
//
//    /**
//     * Ugly part
//     * TODO: return a date object
//     */
//    public String getDatetimeStarted()
//    {
//    	SimpleDateFormat simpleFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
//    	System.out.println(simpleFormat.format(datetimeStarted));
//    	
//    	return simpleFormat.format(datetimeStarted);
//    }
//    
//    /**
//     * Ugly part
//     * TO BE DELETED
//     */
//    public String getDatetimeStartedToDisplay()
//    {
//    	SimpleDateFormat simpleFormat = new SimpleDateFormat("EEE dd MMM - HH:mm", new Locale("fr"));
//    	
//    	return simpleFormat.format(datetimeStarted);
//    }
//
//    public void setDatetimeStarted(Date datetimeStarted) {
//            this.datetimeStarted = datetimeStarted;
//    }
}
