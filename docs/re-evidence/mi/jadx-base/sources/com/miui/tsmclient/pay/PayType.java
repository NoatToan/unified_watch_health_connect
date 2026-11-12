package com.miui.tsmclient.pay;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public enum PayType {
    Mipay("MIPAY"),
    UCashier("UCASHIER"),
    EntryPay("ENTRYPAY"),
    UPInAppPay("UPINAPPPAY"),
    WxPay("WECHAT_PAY"),
    AliPay("ALIPAY");

    private String mPayType;

    PayType(String str) {
        this.mPayType = str;
    }

    public static PayType getInstance(String str) {
        for (PayType payType : values()) {
            if (TextUtils.equals(payType.mPayType, str)) {
                return payType;
            }
        }
        return EntryPay;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mPayType;
    }
}
