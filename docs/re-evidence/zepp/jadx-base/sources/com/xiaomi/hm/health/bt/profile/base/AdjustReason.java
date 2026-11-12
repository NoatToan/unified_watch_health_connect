package com.xiaomi.hm.health.bt.profile.base;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/AdjustReason;", "", "", "reason", LogUtil.I, "getReason", "()I", "setReason", "(I)V", "<init>", "(Ljava/lang/String;II)V", "CTS_AR_NO_CHANGE", "CTS_AR_MANUAL_TIME_UPDATE", "CTS_AR_EXTERNAL_REFERENCE_TIME_UPDATE", "CTS_AR_CHANGE_OF_TIME_ZONE", "CTS_AR_CHANGE_OF_DST", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum AdjustReason {
    CTS_AR_NO_CHANGE(0),
    CTS_AR_MANUAL_TIME_UPDATE(1),
    CTS_AR_EXTERNAL_REFERENCE_TIME_UPDATE(2),
    CTS_AR_CHANGE_OF_TIME_ZONE(3),
    CTS_AR_CHANGE_OF_DST(8);

    private int reason;

    AdjustReason(int i) {
        this.reason = i;
    }

    public final int getReason() {
        return this.reason;
    }

    public final void setReason(int i) {
        this.reason = i;
    }
}
