package com.service.mi.wallet.entity.tds;

/* JADX INFO: loaded from: classes6.dex */
public class GetRegistrationCodeResp extends BaseTdsResp {
    private String registrationCode1;

    public GetRegistrationCodeResp(String str, String str2) {
        super(str, str2);
    }

    public String getRegistrationCode1() {
        return this.registrationCode1;
    }

    public void setRegistrationCode1(String str) {
        this.registrationCode1 = str;
    }
}
