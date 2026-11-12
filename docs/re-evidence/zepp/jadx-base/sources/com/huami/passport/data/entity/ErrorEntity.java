package com.huami.passport.data.entity;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes12.dex */
public class ErrorEntity {

    @SerializedName("error_code")
    private String errorCode;

    public ErrorEntity() {
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public ErrorEntity(String str) {
        this.errorCode = str;
    }
}
