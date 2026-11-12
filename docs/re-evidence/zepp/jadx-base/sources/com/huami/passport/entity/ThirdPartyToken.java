package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class ThirdPartyToken extends Entity {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("expires_in")
    private long expiresIn;

    @SerializedName("icon")
    private String icon;

    @SerializedName("nickname")
    private String nickName;

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName("scope")
    private String scope;

    @SerializedName(Configs.Params.THIRD_ID)
    private String thirdId;

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getScope() {
        return this.scope;
    }

    public String getThirdId() {
        return this.thirdId;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setExpiresIn(long j) {
        this.expiresIn = j;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public void setScope(String str) {
        this.scope = str;
    }

    public void setThirdId(String str) {
        this.thirdId = str;
    }

    public String toString() {
        return "ThirdPartyToken{nickName='" + this.nickName + "', icon='" + this.icon + "', thirdId='" + this.thirdId + "', expiresIn=" + this.expiresIn + ", accessToken='" + this.accessToken + "', refreshToken='" + this.refreshToken + "', scope='" + this.scope + "'}";
    }
}
