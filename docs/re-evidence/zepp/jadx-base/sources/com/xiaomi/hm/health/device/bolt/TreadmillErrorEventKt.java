package com.xiaomi.hm.health.device.bolt;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\"\u0016\u0010\u0004\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u00008\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"", "errorCode", "", "ignore", "TREADMILL_ERROR_NONE", LogUtil.I, "TREADMILL_ERROR_EMERGENCY_BRAKING", "TREADMILL_ERROR_STOP", "devicex_zeppRelease"}, k = 2, mv = {1, 5, 1})
public final class TreadmillErrorEventKt {
    public static final int TREADMILL_ERROR_EMERGENCY_BRAKING = 7;
    public static final int TREADMILL_ERROR_NONE = -1;
    public static final int TREADMILL_ERROR_STOP = 8;

    public static final boolean ignore(int i) {
        return i == -1 || i == 7 || i == 8;
    }
}
