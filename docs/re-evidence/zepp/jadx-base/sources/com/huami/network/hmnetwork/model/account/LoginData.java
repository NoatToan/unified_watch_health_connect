package com.huami.network.hmnetwork.model.account;

import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes6.dex */
public class LoginData {
    private String a = null;

    @SerializedName("userid")
    private String b = null;

    @SerializedName("security")
    private String c = null;

    public String getHuamiUid() {
        return this.a;
    }

    public String getSecurity() {
        return this.c;
    }

    public String getThirdUid() {
        return this.b;
    }

    public boolean isOldValid() {
        return (TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.c)) ? false : true;
    }

    public void setHuamiUid(String str) {
        this.a = str;
    }

    public void setSecurity(String str) {
        this.c = str;
    }

    public void setThirdUid(String str) {
        this.b = str;
    }

    public String toString() {
        return "LoginData: thirdUid:" + this.b + ", security:" + this.c;
    }
}
