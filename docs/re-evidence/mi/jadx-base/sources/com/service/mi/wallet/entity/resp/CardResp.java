package com.service.mi.wallet.entity.resp;

import com.service.mi.BankCard;

/* JADX INFO: loaded from: classes6.dex */
public class CardResp extends BaseWalletResponse {
    private BankCard cardDetail;

    public CardResp(String str, String str2) {
        super(str, str2);
    }

    public BankCard getCardDetail() {
        return this.cardDetail;
    }

    public void setCardDetail(BankCard bankCard) {
        this.cardDetail = bankCard;
    }

    public CardResp() {
    }
}
