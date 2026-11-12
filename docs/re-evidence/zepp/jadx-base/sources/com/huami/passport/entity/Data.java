package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class Data {

    @SerializedName("accessToken")
    private String accessToken;

    @SerializedName(Configs.Params.APP_TOKEN)
    @Nullable
    private String appToken;

    @SerializedName("countryCode")
    private String countryCode;

    @SerializedName("login_token")
    @Nullable
    private String loginToken;

    @SerializedName("refreshToken")
    private String refreshToken;

    public String getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public String getAppToken() {
        return this.appToken;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Nullable
    public String getLoginToken() {
        return this.loginToken;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void setAppToken(@Nullable String str) {
        this.appToken = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setLoginToken(@Nullable String str) {
        this.loginToken = str;
    }
}
