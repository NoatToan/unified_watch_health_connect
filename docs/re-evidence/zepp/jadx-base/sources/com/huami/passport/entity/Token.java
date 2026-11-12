package com.huami.passport.entity;

import com.huami.passport.ErrorCode;

/* JADX INFO: loaded from: classes12.dex */
public class Token extends Entity {
    private String accessToken;
    private ErrorCode error;
    private String provider;
    private String uid;

    public String getAccessToken() {
        return this.accessToken;
    }

    public ErrorCode getError() {
        return this.error;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setError(ErrorCode errorCode) {
        this.error = errorCode;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }

    public String toString() {
        return "Token [provider=" + this.provider + ", uid=" + this.uid + ", accessToken=" + this.accessToken + ", errorCode=" + getErrorCode() + "]";
    }
}
