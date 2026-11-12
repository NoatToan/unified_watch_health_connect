package com.service.mi.wallet.entity;

import android.text.TextUtils;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes6.dex */
public class AuthenticationMethod {
    private String id;
    private String type;
    private String value;

    public static String toJson(AuthenticationMethod authenticationMethod) {
        return new Gson().toJson(authenticationMethod);
    }

    public AuthenticationMethod fromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (AuthenticationMethod) new Gson().fromJson(str, AuthenticationMethod.class);
    }

    public String getId() {
        return this.id;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
