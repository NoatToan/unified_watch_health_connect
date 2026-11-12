package com.xiaomi.hm.health.ui.smartplay.logsit;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/logsit/LongSitMode;", "", "", "isLongSit", "isFakeStandAlert", "isStandAlert", "<init>", "(Ljava/lang/String;I)V", "LONG_SIT", "FAKE_STAND_ALERT", "STAND_ALERT", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public enum LongSitMode {
    LONG_SIT,
    FAKE_STAND_ALERT,
    STAND_ALERT;

    public final boolean isFakeStandAlert() {
        return this == FAKE_STAND_ALERT;
    }

    public final boolean isLongSit() {
        return this == LONG_SIT;
    }

    public final boolean isStandAlert() {
        return this == STAND_ALERT;
    }
}
