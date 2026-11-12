package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class TokenInfo extends Entity {

    @SerializedName(Configs.Params.APP_TOKEN)
    private String appToken;

    @SerializedName(Configs.Params.APP_TTL)
    private long appTtl;

    @SerializedName("lu_app_ttl")
    private long lastUpdateAppTtl;

    @SerializedName("lu_ttl")
    private long lastUpdateTtl;

    @SerializedName("login_token")
    private String loginToken;

    @SerializedName(Configs.Params.THIRD_ID)
    private String thirdId;

    @SerializedName("third_name")
    private String thirdName;

    @SerializedName("ttl")
    private long ttl;

    public String getAppToken() {
        return this.appToken;
    }

    public long getAppTtl() {
        return this.appTtl;
    }

    public long getLastUpdateAppTtl() {
        return this.lastUpdateAppTtl;
    }

    public long getLastUpdateTtl() {
        return this.lastUpdateTtl;
    }

    public String getLoginToken() {
        return this.loginToken;
    }

    public String getThirdId() {
        return this.thirdId;
    }

    public String getThirdName() {
        return this.thirdName;
    }

    public long getTtl() {
        return this.ttl;
    }

    public void setAppToken(String str) {
        this.appToken = str;
    }

    public void setAppTtl(long j) {
        this.appTtl = j;
    }

    public void setLastUpdateAppTtl(long j) {
        this.lastUpdateAppTtl = j;
    }

    public void setLastUpdateTtl(long j) {
        this.lastUpdateTtl = j;
    }

    public void setLoginToken(String str) {
        this.loginToken = str;
    }

    public void setThirdId(String str) {
        this.thirdId = str;
    }

    public void setThirdName(String str) {
        this.thirdName = str;
    }

    public void setTtl(long j) {
        this.ttl = j;
    }

    public String toString() {
        return "TokenInfo{loginToken='" + this.loginToken + "', appToken='" + this.appToken + "', userId='" + getUserId() + "', thirdName='" + this.thirdName + "', thirdId='" + this.thirdId + "', ttl=" + this.ttl + ", appTtl=" + this.appTtl + ", lastUpdateTtl=" + this.lastUpdateTtl + ", lastUpdateAppTtl=" + this.lastUpdateAppTtl + '}';
    }
}
