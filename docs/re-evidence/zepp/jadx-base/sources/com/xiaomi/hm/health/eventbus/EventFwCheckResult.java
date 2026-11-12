package com.xiaomi.hm.health.eventbus;

/* JADX INFO: loaded from: classes21.dex */
public class EventFwCheckResult {
    public static final int ERROR_FAILED = 1;
    public static final int ERROR_NONE = 0;
    public int error;
    public boolean isSuccess;

    public EventFwCheckResult(boolean z) {
        this.error = 0;
        this.isSuccess = z;
    }

    public EventFwCheckResult(boolean z, @Error int i) {
        this.error = 0;
        this.isSuccess = z;
        this.error = i;
    }
}
