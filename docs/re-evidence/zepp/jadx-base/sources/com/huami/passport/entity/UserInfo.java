package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class UserInfo implements Serializable {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("icon")
    private String avatar;

    @SerializedName("email")
    private String email;

    @SerializedName("expires_in")
    private long expiresIn;

    @SerializedName("nickname")
    private String nickName;

    @SerializedName("refresh_token")
    private String refreshToken;
    private RegistInfo registInfo;

    @SerializedName(Configs.Params.THIRD_ID)
    private String thirdId;

    public static class RegistInfo {

        @SerializedName("country_code")
        private String countryCode;

        @SerializedName(Configs.Params.COUNTRY_STATE)
        private String countryState;

        @SerializedName(Configs.Params.IS_NEW_USER)
        private int newUser;

        @SerializedName("region")
        private String region;

        @SerializedName(Configs.Params.REGIST_DATE)
        private long registDate;

        public String getCountryCode() {
            return this.countryCode;
        }

        public String getCountryState() {
            return this.countryState;
        }

        public int getNewUser() {
            return this.newUser;
        }

        public String getRegion() {
            return this.region;
        }

        public long getRegistDate() {
            return this.registDate;
        }

        public void setCountryCode(String str) {
            this.countryCode = str;
        }

        public void setCountryState(String str) {
            this.countryState = str;
        }

        public void setNewUser(int i) {
            this.newUser = i;
        }

        public void setRegion(String str) {
            this.region = str;
        }

        public void setRegistDate(long j) {
            this.registDate = j;
        }

        public String toString() {
            return "RegistInfo [newUser=" + getNewUser() + ", registDate=" + this.registDate + ", region=" + this.region + ", countryCode=" + this.countryCode + "]";
        }
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getEmail() {
        return this.email;
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

    public RegistInfo getRegistInfo() {
        return this.registInfo;
    }

    public String getThirdId() {
        return this.thirdId;
    }

    public void setAccessToken(String str) {
        this.accessToken = str;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setEmail(String str) {
        this.email = str;
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

    public void setRegistInfo(RegistInfo registInfo) {
        this.registInfo = registInfo;
    }

    public void setThirdId(String str) {
        this.thirdId = str;
    }

    public String toString() {
        return "UserInfo{nickName='" + this.nickName + "', avatar='" + this.avatar + "', thirdId='" + this.thirdId + "', email='" + this.email + "', registInfo=" + this.registInfo + '}';
    }
}
