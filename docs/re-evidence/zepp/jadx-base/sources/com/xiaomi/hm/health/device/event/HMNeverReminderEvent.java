package com.xiaomi.hm.health.device.event;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/event/HMNeverReminderEvent;", "", "", "a", "Z", "getSame", "()Z", "same", "", "b", "J", "getStatus", "()J", "status", "<init>", "(ZJ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMNeverReminderEvent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean same;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long status;

    public HMNeverReminderEvent(boolean z, long j) {
        this.same = z;
        this.status = j;
    }

    public final boolean getSame() {
        return this.same;
    }

    public final long getStatus() {
        return this.status;
    }

    public /* synthetic */ HMNeverReminderEvent(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, j);
    }
}
