package com.miui.tsmclient.refund.auth;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public enum RefundAuthType {
    ALIPAY("ALIPAY"),
    NONE("NONE");

    private String mRefundAuthType;

    RefundAuthType(String str) {
        this.mRefundAuthType = str;
    }

    public static RefundAuthType getInstance(String str) {
        for (RefundAuthType refundAuthType : values()) {
            if (TextUtils.equals(refundAuthType.mRefundAuthType, str)) {
                return refundAuthType;
            }
        }
        return NONE;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.mRefundAuthType;
    }
}
