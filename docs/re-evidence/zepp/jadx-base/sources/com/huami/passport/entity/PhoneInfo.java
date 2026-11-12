package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class PhoneInfo extends MailInfo {

    @SerializedName(Configs.Params.PHONE_NUMBER)
    private String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    @Override // com.huami.passport.entity.MailInfo
    public String toString() {
        return "PhoneInfo{phoneNumber='" + this.phoneNumber + "', token='" + getToken() + "', region='" + getRegion() + "', state='" + getState() + "', oauth_id='" + getOauthId() + "', expiration=" + getExpiration() + ", refresh='" + getRefresh() + "'}";
    }
}
