package com.xiaomi.hm.health.sleep.notify;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/sleep/notify/SleepRecord;", "", "", "component1", "", "component2", "component3", "isMain", "startMinutes", "endMinutes", "copy", "", "toString", "hashCode", "other", "equals", "Z", "()Z", LogUtil.I, "getStartMinutes", "()I", "getEndMinutes", "notified", "getNotified", "setNotified", "(Z)V", "<init>", "(ZII)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepRecord {
    private final int endMinutes;
    private final boolean isMain;
    private boolean notified;
    private final int startMinutes;

    public SleepRecord(boolean z, int i, int i2) {
        this.isMain = z;
        this.startMinutes = i;
        this.endMinutes = i2;
    }

    public static /* synthetic */ SleepRecord copy$default(SleepRecord sleepRecord, boolean z, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = sleepRecord.isMain;
        }
        if ((i3 & 2) != 0) {
            i = sleepRecord.startMinutes;
        }
        if ((i3 & 4) != 0) {
            i2 = sleepRecord.endMinutes;
        }
        return sleepRecord.copy(z, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsMain() {
        return this.isMain;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartMinutes() {
        return this.startMinutes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndMinutes() {
        return this.endMinutes;
    }

    @NotNull
    public final SleepRecord copy(boolean isMain, int startMinutes, int endMinutes) {
        return new SleepRecord(isMain, startMinutes, endMinutes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRecord)) {
            return false;
        }
        SleepRecord sleepRecord = (SleepRecord) other;
        return this.isMain == sleepRecord.isMain && this.startMinutes == sleepRecord.startMinutes && this.endMinutes == sleepRecord.endMinutes;
    }

    public final int getEndMinutes() {
        return this.endMinutes;
    }

    public final boolean getNotified() {
        return this.notified;
    }

    public final int getStartMinutes() {
        return this.startMinutes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.isMain;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.startMinutes) * 31) + this.endMinutes;
    }

    public final boolean isMain() {
        return this.isMain;
    }

    public final void setNotified(boolean z) {
        this.notified = z;
    }

    @NotNull
    public String toString() {
        return "SleepRecord(isMain=" + this.isMain + ", startMinutes=" + this.startMinutes + ", endMinutes=" + this.endMinutes + ")";
    }

    public /* synthetic */ SleepRecord(boolean z, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, i, i2);
    }
}
