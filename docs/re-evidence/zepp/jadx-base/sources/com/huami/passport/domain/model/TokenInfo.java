package com.huami.passport.domain.model;

/* JADX INFO: loaded from: classes12.dex */
public class TokenInfo {
    private String appToken;
    private long appTtl;
    private String loginToken;
    private String region;
    private long ttl;
    private String userId;

    public String getAppToken() {
        return this.appToken;
    }

    public long getAppTtl() {
        return this.appTtl;
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

    public String toString() {
        return "TokenInfo{userId='" + this.userId + "', loginToken='" + this.loginToken + "', appToken='" + this.appToken + "', ttl=" + this.ttl + ", appTtl=" + this.appTtl + ", region='" + this.region + "'}";
    }
}
