package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class CompatEntity implements Serializable {

    @SerializedName("mutimelong")
    private long mutimeLong;

    @SerializedName("provider")
    private String provider;

    @SerializedName("registinfo")
    private RegistInfo registInfo;

    @SerializedName("result")
    private String result;

    @SerializedName("thirdpartyinfo")
    private ThirdPartyInfo thirdPartyInfo;

    @SerializedName("tokeninfo")
    private TokenInfo tokenInfo;

    public static class RegistInfo {

        @SerializedName("isnewuser")
        private int newUser;

        @SerializedName("registdate")
        private long registDate;

        public int getNewUser() {
            return this.newUser;
        }

        public long getRegistDate() {
            return this.registDate;
        }

        public void setNewUser(int i) {
            this.newUser = i;
        }

        public void setRegistDate(long j) {
            this.registDate = j;
        }
    }

    public static class ThirdPartyInfo {

        @SerializedName("icon")
        private String icon;

        @SerializedName("nickname")
        private String nickName;

        @SerializedName(Configs.Params.THIRD_ID)
        private String thirdId;

        public String getIcon() {
            return this.icon;
        }

        public String getNickName() {
            return this.nickName;
        }

        public String getThirdId() {
            return this.thirdId;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setNickName(String str) {
            this.nickName = str;
        }

        public void setThirdId(String str) {
            this.thirdId = str;
        }
    }

    public static class TokenInfo {

        @SerializedName("apptoken")
        private String appToken;

        @SerializedName("appttl")
        private long appTtl;

        @SerializedName("lu_app_ttl")
        private long lastUpdateAppTtl;

        @SerializedName("lu_ttl")
        private long lastUpdateTtl;

        @SerializedName("logintoken")
        private String loginToken;

        @SerializedName("mutimelong")
        private long mutimeLong;

        @SerializedName("ttl")
        private long ttl;

        @SerializedName("userid")
        private String userId;

        public String getAppToken() {
            return this.appToken;
        }

        public long getAppTtl() {
            return this.appTtl;
        }

        public long getLastUpdateAppTtl() {
            return this.lastUpdateAppTtl;
        }

        public long getLastUpdateTtl() {
            return this.lastUpdateTtl;
        }

        public String getLoginToken() {
            return this.loginToken;
        }

        public long getMutimeLong() {
            return this.mutimeLong;
        }

        public long getTtl() {
            return this.ttl;
        }

        public String getUserId() {
            return this.userId;
        }

        public void setAppToken(String str) {
            this.appToken = str;
        }

        public void setAppTtl(long j) {
            this.appTtl = j;
        }

        public void setLastUpdateAppTtl(long j) {
            this.lastUpdateAppTtl = j;
        }

        public void setLastUpdateTtl(long j) {
            this.lastUpdateTtl = j;
        }

        public void setLoginToken(String str) {
            this.loginToken = str;
        }

        public void setMutimeLong(long j) {
            this.mutimeLong = j;
        }

        public void setTtl(long j) {
            this.ttl = j;
        }

        public void setUserId(String str) {
            this.userId = str;
        }
    }

    public LoginToken buildLoginToken() {
        LoginToken loginToken = new LoginToken();
        loginToken.setProvider(this.provider);
        loginToken.setResult(this.result);
        loginToken.setMutimeLong(this.mutimeLong);
        UserInfo.RegistInfo registInfo = new UserInfo.RegistInfo();
        RegistInfo registInfo2 = this.registInfo;
        if (registInfo2 != null) {
            registInfo.setRegistDate(registInfo2.getRegistDate());
            registInfo.setNewUser(this.registInfo.getNewUser());
        }
        loginToken.setRegistInfo(registInfo);
        com.huami.passport.entity.TokenInfo tokenInfo = new com.huami.passport.entity.TokenInfo();
        TokenInfo tokenInfo2 = this.tokenInfo;
        if (tokenInfo2 != null) {
            tokenInfo.setAppToken(tokenInfo2.getAppToken());
            tokenInfo.setUserId(this.tokenInfo.getUserId());
            tokenInfo.setLoginToken(this.tokenInfo.getLoginToken());
            tokenInfo.setLastUpdateTtl(this.tokenInfo.getLastUpdateTtl());
            tokenInfo.setLastUpdateAppTtl(this.tokenInfo.getLastUpdateAppTtl());
            tokenInfo.setTtl(this.tokenInfo.getTtl());
            tokenInfo.setAppTtl(this.tokenInfo.appTtl);
            tokenInfo.setMutimeLong(this.tokenInfo.mutimeLong);
        }
        loginToken.setTokenInfo(tokenInfo);
        UserInfo userInfo = new UserInfo();
        ThirdPartyInfo thirdPartyInfo = this.thirdPartyInfo;
        if (thirdPartyInfo != null) {
            userInfo.setAvatar(thirdPartyInfo.getIcon());
            userInfo.setNickName(this.thirdPartyInfo.getNickName());
            userInfo.setThirdId(this.thirdPartyInfo.thirdId);
        }
        loginToken.setUserInfo(userInfo);
        return loginToken;
    }

    public long getMutimeLong() {
        return this.mutimeLong;
    }

    public String getProvider() {
        return this.provider;
    }

    public RegistInfo getRegistInfo() {
        return this.registInfo;
    }

    public String getResult() {
        return this.result;
    }

    public ThirdPartyInfo getThirdPartyInfo() {
        return this.thirdPartyInfo;
    }

    public TokenInfo getTokenInfo() {
        return this.tokenInfo;
    }

    public void setMutimeLong(long j) {
        this.mutimeLong = j;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setRegistInfo(RegistInfo registInfo) {
        this.registInfo = registInfo;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setThirdPartyInfo(ThirdPartyInfo thirdPartyInfo) {
        this.thirdPartyInfo = thirdPartyInfo;
    }

    public void setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
    }
}
