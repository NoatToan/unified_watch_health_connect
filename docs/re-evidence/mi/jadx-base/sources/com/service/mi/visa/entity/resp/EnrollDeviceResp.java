package com.service.mi.visa.entity.resp;

import com.service.mi.wallet.entity.resp.BaseWalletResponse;

/* JADX INFO: loaded from: classes6.dex */
public class EnrollDeviceResp extends BaseWalletResponse {
    private String visaPK;

    public EnrollDeviceResp(String str, String str2) {
        super(str, str2);
    }

    public String getVisaPK() {
        return this.visaPK;
    }

    public void setVisaPK(String str) {
        this.visaPK = str;
    }
}
