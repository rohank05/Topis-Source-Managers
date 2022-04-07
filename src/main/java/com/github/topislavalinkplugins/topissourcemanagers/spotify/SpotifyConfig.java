package com.github.topislavalinkplugins.topissourcemanagers.spotify;

import com.neovisionaries.i18n.CountryCode;

public class SpotifyConfig{

	private String clientId;
	private String clientSecret;
	private CountryCode countryCode = CountryCode.US;

	public SpotifyConfig(){}

	public SpotifyConfig(String clientId, String clientSecret, CountryCode countryCode){
		this.clientId = clientId;
		this.clientSecret = clientSecret;
		this.countryCode = countryCode;
	}

	public String getClientId(){
		return this.clientId;
	}

	public SpotifyConfig setClientId(String clientId){
		this.clientId = clientId;
		return this;
	}

	public String getClientSecret(){
		return this.clientSecret;
	}

	public SpotifyConfig setClientSecret(String clientSecret){
		this.clientSecret = clientSecret;
		return this;
	}

	public CountryCode getCountryCode(){
		return this.countryCode;
	}

	public SpotifyConfig setCountryCode(String countryCode){
		this.countryCode = CountryCode.getByCode(countryCode);
		return this;
	}

}
