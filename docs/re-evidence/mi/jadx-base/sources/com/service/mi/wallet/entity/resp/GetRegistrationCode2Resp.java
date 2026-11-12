package com.service.mi.wallet.entity.resp;

/* JADX INFO: loaded from: classes6.dex */
public class GetRegistrationCode2Resp extends BaseWalletResponse {
    private String registrationCode2;
    private String tdsUrl;

    public GetRegistrationCode2Resp(String str, String str2) {
        super(str, str2);
    }

    public String getRegistrationCode2() {
        return this.registrationCode2;
    }

    public String getTdsUrl() {
        return this.tdsUrl;
    }

    public void setRegistrationCode2(String str) {
        this.registrationCode2 = str;
    }

    public void setTdsUrl(String str) {
        this.tdsUrl = str;
    }
}
