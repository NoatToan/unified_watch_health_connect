package com.xiaomi.hm.health.sleep.writeback;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/sleep/writeback/SleepSummary;", "", "Lcom/xiaomi/hm/health/sleep/writeback/Sleep;", "component1", "", "component2", "slp", "tz", "copy", "", "toString", "hashCode", "other", "", "equals", "Lcom/xiaomi/hm/health/sleep/writeback/Sleep;", "getSlp", "()Lcom/xiaomi/hm/health/sleep/writeback/Sleep;", LogUtil.I, "getTz", "()I", "<init>", "(Lcom/xiaomi/hm/health/sleep/writeback/Sleep;I)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepSummary {

    @Nullable
    private final Sleep slp;
    private final int tz;

    public SleepSummary(@Nullable Sleep sleep, int i) {
        this.slp = sleep;
        this.tz = i;
    }

    public static /* synthetic */ SleepSummary copy$default(SleepSummary sleepSummary, Sleep sleep, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            sleep = sleepSummary.slp;
        }
        if ((i2 & 2) != 0) {
            i = sleepSummary.tz;
        }
        return sleepSummary.copy(sleep, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Sleep getSlp() {
        return this.slp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTz() {
        return this.tz;
    }

    @NotNull
    public final SleepSummary copy(@Nullable Sleep slp, int tz) {
        return new SleepSummary(slp, tz);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSummary)) {
            return false;
        }
        SleepSummary sleepSummary = (SleepSummary) other;
        return Intrinsics.areEqual(this.slp, sleepSummary.slp) && this.tz == sleepSummary.tz;
    }

    @Nullable
    public final Sleep getSlp() {
        return this.slp;
    }

    public final int getTz() {
        return this.tz;
    }

    public int hashCode() {
        Sleep sleep = this.slp;
        return ((sleep == null ? 0 : sleep.hashCode()) * 31) + this.tz;
    }

    @NotNull
    public String toString() {
        return "SleepSummary(slp=" + this.slp + ", tz=" + this.tz + ")";
    }
}
