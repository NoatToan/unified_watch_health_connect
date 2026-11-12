package com.service.mi.wallet.entity.tds;

/* JADX INFO: loaded from: classes6.dex */
public class RegisterResp extends BaseTdsResp {
    private String authenticationCode;
    private String tdsUrl;

    public RegisterResp(String str, String str2) {
        super(str, str2);
    }

    public String getAuthenticationCode() {
        return this.authenticationCode;
    }

    public String getTdsUrl() {
        return this.tdsUrl;
    }

    public void setAuthenticationCode(String str) {
        this.authenticationCode = str;
    }

    public void setTdsUrl(String str) {
        this.tdsUrl = str;
    }
}
