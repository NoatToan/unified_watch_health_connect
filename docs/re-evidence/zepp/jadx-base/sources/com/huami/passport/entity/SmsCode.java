package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class SmsCode implements Serializable {

    @SerializedName("code")
    private String code;

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }
}
