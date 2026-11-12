package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class BindAccount extends Entity {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName(Configs.Params.BOND_DATE)
    private String bondDate;

    @SerializedName("expires_in")
    private long expiresIn;

    @SerializedName("nick_name")
    private String nickName;

    @SerializedName("refresh_token")
    private String refreshToken;

    @SerializedName(Configs.Params.THIRD_ID)
    private String thirdId;

    @SerializedName(Configs.Params.THIRD_TYPE)
    private String thirdType;

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getBondDate() {
        return this.bondDate;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getNickName() {
        return this.nickName;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getThirdId() {
        return this.thirdId;
    }

    public String getThirdType() {
        return this.thirdType;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setBondDate(String str) {
        this.bondDate = str;
    }

    public void setExpiresIn(long j) {
        this.expiresIn = j;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setRefreshToken(String str) {
        this.refreshToken = str;
    }

    public void setThirdId(String str) {
        this.thirdId = str;
    }

    public void setThirdType(String str) {
        this.thirdType = str;
    }

    public String toString() {
        return "BindAccount{result='" + getResult() + "' ,errorCode='" + getErrorCode() + "', nickName='" + this.nickName + "', thirdType='" + this.thirdType + "', bondDate='" + this.bondDate + "', thirdId='" + this.thirdId + "'}";
    }
}
