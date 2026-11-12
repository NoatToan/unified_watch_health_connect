package com.service.mi.wallet.entity.resp;

/* JADX INFO: loaded from: classes6.dex */
public class UnSuspendResp extends BaseWalletResponse {
    private int tokenStatus;

    public UnSuspendResp(String str, String str2) {
        super(str, str2);
    }

    public int getTokenStatus() {
        return this.tokenStatus;
    }

    public void setTokenStatus(int i) {
        this.tokenStatus = i;
    }
}
