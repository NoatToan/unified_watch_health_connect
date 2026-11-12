package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.passport.Configs;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class AccessToken implements Serializable {

    @SerializedName("token")
    private String token;

    @SerializedName(Configs.Params.TOKEN_ID)
    private String tokenId;

    public String getToken() {
        return this.token;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public void setTokenId(String str) {
        this.tokenId = str;
    }

    public String toString() {
        return "AccessToken{token='" + this.token + "', tokenId='" + this.tokenId + "'}";
    }
}
