package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class MailInfo implements Serializable {

    @SerializedName("email")
    private String email;

    @SerializedName(Configs.Params.EXPIRATION)
    private long expiration;

    @SerializedName(Configs.Params.OAUTH_ID)
    private String oauthId;

    @SerializedName("refresh")
    private String refresh;

    @SerializedName("region")
    private String region;

    @SerializedName("state")
    private String state;

    @SerializedName("token")
    private String token;

    public String getEmail() {
        return this.email;
    }

    public long getExpiration() {
        return this.expiration;
    }

    public String getOauthId() {
        return this.oauthId;
    }

    public String getRefresh() {
        return this.refresh;
    }

    @Deprecated
    public String getRegion() {
        return this.region;
    }

    public String getState() {
        return this.state;
    }

    public String getToken() {
        return this.token;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public void setExpiration(long j) {
        this.expiration = j;
    }

    public void setOauthId(String str) {
        this.oauthId = str;
    }

    public void setRefresh(String str) {
        this.refresh = str;
    }

    @Deprecated
    public void setRegion(String str) {
        this.region = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public String toString() {
        return "MailInfo{email='" + this.email + "', token='" + this.token + "', region='" + this.region + "', state='" + this.state + "', oauth_id='" + this.oauthId + "', expiration=" + this.expiration + ", refresh='" + this.refresh + "'}";
    }
}
