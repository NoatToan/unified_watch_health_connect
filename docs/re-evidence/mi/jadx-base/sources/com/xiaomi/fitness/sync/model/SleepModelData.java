package com.xiaomi.fitness.sync.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000b\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000b\"\u0004\b\u0012\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\u000e¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sync/model/SleepModelData;", "", "bedtime_state", "", "sleep_hour", "sleep_minute", "wake_hour", "wake_minute", "<init>", "(IIIII)V", "getBedtime_state", "()I", "getSleep_hour", "setSleep_hour", "(I)V", "getSleep_minute", "setSleep_minute", "getWake_hour", "setWake_hour", "getWake_minute", "setWake_minute", "getupClock", "getGetupClock", "setGetupClock", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "sync_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SleepModelData {
    private final int bedtime_state;
    private int getupClock;
    private int sleep_hour;
    private int sleep_minute;
    private int wake_hour;
    private int wake_minute;

    public SleepModelData() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    public static /* synthetic */ SleepModelData copy$default(SleepModelData sleepModelData, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = sleepModelData.bedtime_state;
        }
        if ((i6 & 2) != 0) {
            i2 = sleepModelData.sleep_hour;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = sleepModelData.sleep_minute;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = sleepModelData.wake_hour;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = sleepModelData.wake_minute;
        }
        return sleepModelData.copy(i, i7, i8, i9, i5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBedtime_state() {
        return this.bedtime_state;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSleep_hour() {
        return this.sleep_hour;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSleep_minute() {
        return this.sleep_minute;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getWake_hour() {
        return this.wake_hour;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWake_minute() {
        return this.wake_minute;
    }

    @NotNull
    public final SleepModelData copy(int bedtime_state, int sleep_hour, int sleep_minute, int wake_hour, int wake_minute) {
        return new SleepModelData(bedtime_state, sleep_hour, sleep_minute, wake_hour, wake_minute);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepModelData)) {
            return false;
        }
        SleepModelData sleepModelData = (SleepModelData) other;
        return this.bedtime_state == sleepModelData.bedtime_state && this.sleep_hour == sleepModelData.sleep_hour && this.sleep_minute == sleepModelData.sleep_minute && this.wake_hour == sleepModelData.wake_hour && this.wake_minute == sleepModelData.wake_minute;
    }

    public final int getBedtime_state() {
        return this.bedtime_state;
    }

    public final int getGetupClock() {
        return this.getupClock;
    }

    public final int getSleep_hour() {
        return this.sleep_hour;
    }

    public final int getSleep_minute() {
        return this.sleep_minute;
    }

    public final int getWake_hour() {
        return this.wake_hour;
    }

    public final int getWake_minute() {
        return this.wake_minute;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.bedtime_state) * 31) + Integer.hashCode(this.sleep_hour)) * 31) + Integer.hashCode(this.sleep_minute)) * 31) + Integer.hashCode(this.wake_hour)) * 31) + Integer.hashCode(this.wake_minute);
    }

    public final void setGetupClock(int i) {
        this.getupClock = i;
    }

    public final void setSleep_hour(int i) {
        this.sleep_hour = i;
    }

    public final void setSleep_minute(int i) {
        this.sleep_minute = i;
    }

    public final void setWake_hour(int i) {
        this.wake_hour = i;
    }

    public final void setWake_minute(int i) {
        this.wake_minute = i;
    }

    @NotNull
    public String toString() {
        return "SleepModelData(bedtime_state=" + this.bedtime_state + ", sleep_hour=" + this.sleep_hour + ", sleep_minute=" + this.sleep_minute + ", wake_hour=" + this.wake_hour + ", wake_minute=" + this.wake_minute + ")";
    }

    public SleepModelData(int i, int i2, int i3, int i4, int i5) {
        this.bedtime_state = i;
        this.sleep_hour = i2;
        this.sleep_minute = i3;
        this.wake_hour = i4;
        this.wake_minute = i5;
    }

    public /* synthetic */ SleepModelData(int i, int i2, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 22 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 8 : i4, (i6 & 16) != 0 ? 0 : i5);
    }
}
