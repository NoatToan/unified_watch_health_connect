package com.miui.tsmclient.account;

import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class AccountInfo {
    private String mAuthToken;
    private Intent mIntent;
    private String mPh;
    private String mSecurity;
    private String mServiceToken;
    private String mUserId;

    public String getAuthToken() {
        return this.mAuthToken;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getPh() {
        return this.mPh;
    }

    public String getSecurity() {
        return this.mSecurity;
    }

    public String getServiceToken() {
        return this.mServiceToken;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.mUserId) || TextUtils.isEmpty(this.mAuthToken)) ? false : true;
    }

    public void setAuthToken(String str) {
        this.mAuthToken = str;
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }

    public void setPh(String str) {
        this.mPh = str;
    }

    public void setSecurity(String str) {
        this.mSecurity = str;
    }

    public void setServiceToken(String str) {
        this.mServiceToken = str;
    }

    public void setUserId(String str) {
        this.mUserId = str;
    }
}
