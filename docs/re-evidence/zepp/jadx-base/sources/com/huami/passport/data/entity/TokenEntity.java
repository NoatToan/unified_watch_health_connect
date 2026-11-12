package com.huami.passport.data.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class TokenEntity {

    @SerializedName(Configs.Params.APP_TOKEN)
    private String appToken;

    @SerializedName(Configs.Params.APP_TTL)
    private long appTtl;
    private long lastUpdateAppTtl;
    private long lastUpdateTtl;

    @SerializedName("login_token")
    private String loginToken;

    @SerializedName("region")
    private String region;

    @SerializedName("ttl")
    private long ttl;

    @SerializedName("user_id")
    private String userId;

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

    public String getRegion() {
        return this.region;
    }

    public long getTtl() {
        return this.ttl;
    }

    public String getUserId() {
        return this.userId;
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

    public void setRegion(String str) {
        this.region = str;
    }

    public void setTtl(long j) {
        this.ttl = j;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
