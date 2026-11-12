package com.huawei.watchface.mvp.model.datatype;

/* JADX INFO: loaded from: classes45.dex */
public class ReservedInfor {
    private AccountInfo accountInfo;
    private OrderPurchaseExtensionInformation orderPurchaseExtensionInformation;
    private PromotionalOffer promotionalOffer;

    public AccountInfo getAccountInfo() {
        return this.accountInfo;
    }

    public OrderPurchaseExtensionInformation getOrderPurchaseExtensionInformation() {
        return this.orderPurchaseExtensionInformation;
    }

    public PromotionalOffer getPromotionalOffer() {
        return this.promotionalOffer;
    }

    public void setAccountInfo(AccountInfo accountInfo) {
        this.accountInfo = accountInfo;
    }

    public void setOrderPurchaseExtensionInformation(OrderPurchaseExtensionInformation orderPurchaseExtensionInformation) {
        this.orderPurchaseExtensionInformation = orderPurchaseExtensionInformation;
    }

    public void setPromotionalOffer(PromotionalOffer promotionalOffer) {
        this.promotionalOffer = promotionalOffer;
    }
}
