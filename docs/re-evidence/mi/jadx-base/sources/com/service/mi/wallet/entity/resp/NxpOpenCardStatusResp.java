package com.service.mi.wallet.entity.resp;

/* JADX INFO: loaded from: classes6.dex */
public class NxpOpenCardStatusResp extends BaseWalletResponse {
    private boolean hasOpenCard;

    public NxpOpenCardStatusResp(String str, String str2) {
        super(str, str2);
    }

    public boolean isHasOpenCard() {
        return this.hasOpenCard;
    }

    public void setHasOpenCard(boolean z) {
        this.hasOpenCard = z;
    }
}
