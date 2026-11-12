package com.service.mi.wallet.entity.resp;

/* JADX INFO: loaded from: classes6.dex */
public class CardStatusResp extends BaseWalletResponse {
    private boolean cardStatus;
    private boolean transactionStatus;

    public CardStatusResp(String str, String str2) {
        super(str, str2);
    }

    public boolean cardStatus() {
        return this.cardStatus;
    }

    public void setCardStatus(boolean z) {
        this.cardStatus = z;
    }

    public void setTransactionStatus(boolean z) {
        this.transactionStatus = z;
    }

    public boolean transactionStatus() {
        return this.transactionStatus;
    }
}
