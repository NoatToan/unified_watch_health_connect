package com.baidu.ocr.sdk.model;

/* JADX INFO: loaded from: classes2.dex */
public class AccessToken {
    private String accessToken;
    private int expiresIn;
    private String lic;
    private String tokenJson;
    private final int preExpiredTime = 10000;
    private volatile long expiresTime = -1;

    public AccessToken() {
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public int getExpiresIn() {
        return this.expiresIn;
    }

    public long getExpiresTime() {
        return this.expiresTime;
    }

    public String getLic() {
        return this.lic;
    }

    public String getTokenJson() {
        return this.tokenJson;
    }

    public synchronized boolean hasExpired() {
        return this.expiresTime != -1 && System.currentTimeMillis() - (this.expiresTime - 10000) > 0;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setExpireTime(long j) {
        this.expiresTime = j;
    }

    public void setExpiresIn(int i) {
        this.expiresIn = i;
        this.expiresTime = System.currentTimeMillis() + (((long) i) * 1000);
    }

    public void setLic(String str) {
        this.lic = str;
    }

    public void setTokenJson(String str) {
        this.tokenJson = str;
    }

    public AccessToken(String str) {
        this.accessToken = str;
    }
}
