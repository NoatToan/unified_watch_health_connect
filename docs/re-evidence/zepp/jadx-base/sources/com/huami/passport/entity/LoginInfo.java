package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import com.huami.passport.ErrorCode;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class LoginInfo extends ErrorCode implements Serializable {

    @SerializedName("access")
    private String access;

    @SerializedName("country_code")
    private String countryCode;

    @SerializedName(Configs.Params.COUNTRY_STATE)
    private String countryState;

    @SerializedName("email")
    private String email;

    @SerializedName(Configs.Params.EXPIRATION)
    private long expiration;

    @SerializedName("lu_ttl")
    private long lastUpdateTtl;

    @SerializedName(Configs.Params.OAUTH_ID)
    private String oauthId;

    @SerializedName(Configs.Params.PHONE_NUMBER)
    private String phoneNumber;

    @SerializedName("refresh")
    private String refresh;

    @SerializedName("region")
    private String region;

    @SerializedName("state")
    private String state;

    public String getAccess() {
        return this.access;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryState() {
        return this.countryState;
    }

    public String getEmail() {
        return this.email;
    }

    public long getExpiration() {
        return this.expiration;
    }

    public long getLastUpdateTtl() {
        return this.lastUpdateTtl;
    }

    public String getOauthId() {
        return this.oauthId;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getRefresh() {
        return this.refresh;
    }

    public String getRegion() {
        return this.region;
    }

    public String getState() {
        return this.state;
    }

    public void setAccess(String str) {
        this.access = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCountryState(String str) {
        this.countryState = str;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setExpiration(long j) {
        this.expiration = j;
    }

    public void setLastUpdateTtl(long j) {
        this.lastUpdateTtl = j;
    }

    public void setOauthId(String str) {
        this.oauthId = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setRefresh(String str) {
        this.refresh = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    @Override // com.huami.passport.ErrorCode
    public String toString() {
        return "LoginInfo{phoneNumber='" + this.phoneNumber + "'email='" + this.email + "', access='" + this.access + "', region='" + this.region + "', countryCode='" + this.countryCode + "', countryState='" + this.countryState + "', state='" + this.state + "', oauth_id='" + this.oauthId + "', expiration=" + this.expiration + ", refresh='" + this.refresh + "', lastUpdateTtl='" + this.lastUpdateTtl + "', errorCode='" + getErrorCode() + "', errorMsg='" + getErrorMsg() + "'}";
    }
}
