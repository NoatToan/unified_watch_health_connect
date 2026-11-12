package com.huami.passport.auth.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class TokenInfo extends Entity {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("expires_in")
    private int expiresIn;

    @SerializedName("refresh_token")
    private String refreshToken;
    private String region;

    @SerializedName("token_type")
    private String tokenType;

    public String getAccessToken() {
        return this.accessToken;
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getRegion() {
        return this.region;
    }

    public String getTokenType() {
        return this.tokenType;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setExpiresIn(int i) {
        this.expiresIn = i;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setTokenType(String str) {
        this.tokenType = str;
    }

    public String toString() {
        return "TokenInfo{accessToken='" + this.accessToken + "', expiresIn=" + this.expiresIn + ", refreshToken='" + this.refreshToken + "', tokenType='" + this.tokenType + "', region='" + this.region + "'}";
    }
}
