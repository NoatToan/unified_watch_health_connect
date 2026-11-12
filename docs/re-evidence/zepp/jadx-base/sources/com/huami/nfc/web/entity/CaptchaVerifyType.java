package com.huami.nfc.web.entity;

import com.huami.nfc.bus.NoticesEntity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/huami/nfc/web/entity/CaptchaVerifyType;", "", "", "code", "", "decs", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", NoticesEntity.LOOP_TYPE_NONE, "NOT_VERIFY", "NEED_VERIFY", "TRUST", "web_release"}, k = 1, mv = {1, 5, 1})
public enum CaptchaVerifyType {
    NONE(0, ""),
    NOT_VERIFY(1, "不需要验证"),
    NEED_VERIFY(2, "需要验证"),
    TRUST(3, "信赖小米渠道确认");

    CaptchaVerifyType(int i, String str) {
    }
}
