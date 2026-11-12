package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;

/* JADX INFO: loaded from: classes12.dex */
public class Result extends Entity {

    @SerializedName(Configs.Params.ACCESSTOKEN_INFO)
    private AccessToken accessToken;

    @SerializedName("domain")
    private Domain domain;

    public Result() {
    }

    public AccessToken getAccessToken() {
        return this.accessToken;
    }

    public Domain getDomain() {
        return this.domain;
    }

    public void setAccessToken(AccessToken accessToken) {
        this.accessToken = accessToken;
    }

    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    public String toString() {
        return "Result{domain=" + this.domain + ", accessToken=" + this.accessToken + '}';
    }

    public Result(String str) {
        setErrorCode(str);
    }
}
