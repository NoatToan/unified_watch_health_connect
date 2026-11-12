package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class Profile extends Entity {

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName(Configs.Params.COUNTRY_STATE)
    private String countryState;

    @SerializedName(Configs.Params.PHONE_NUMBER)
    private String phoneNumber;

    @SerializedName("region")
    private String region;

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryState() {
        return this.countryState;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getRegion() {
        return this.region;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCountryState(String str) {
        this.countryState = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public String toString() {
        return "Profile{phoneNumber='" + this.phoneNumber + "', countryCode='" + this.countryCode + "', region='" + this.region + "'}";
    }
}
