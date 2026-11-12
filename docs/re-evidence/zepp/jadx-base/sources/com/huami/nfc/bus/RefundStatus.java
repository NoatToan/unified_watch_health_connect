package com.huami.nfc.bus;

import com.alipay.sdk.m.f0.c;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/huami/nfc/bus/RefundStatus;", "", "", "status", LogUtil.I, "getStatus", "()I", "setStatus", "(I)V", "<init>", "(Ljava/lang/String;II)V", "INIT", c.p, "FAIL", "FORBID", "nfc-bus_release"}, k = 1, mv = {1, 5, 1})
public enum RefundStatus {
    INIT(0),
    SUCCESS(1),
    FAIL(2),
    FORBID(-1);

    private int status;

    RefundStatus(int i) {
        this.status = i;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }
}
