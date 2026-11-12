package com.xiaomi.hm.health.bt.profile.gdsp.pressure;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "", "time", "", "value", "", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "inVaild", "repeat", "toString", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class HMPressureData {
    private long time;
    private int value;

    public HMPressureData(long j, int i) {
        this.time = j;
        this.value = i;
    }

    public static /* synthetic */ HMPressureData copy$default(HMPressureData hMPressureData, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = hMPressureData.time;
        }
        if ((i2 & 2) != 0) {
            i = hMPressureData.value;
        }
        return hMPressureData.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final HMPressureData copy(long time, int value) {
        return new HMPressureData(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HMPressureData)) {
            return false;
        }
        HMPressureData hMPressureData = (HMPressureData) other;
        return this.time == hMPressureData.time && this.value == hMPressureData.value;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.value);
    }

    public final boolean inVaild() {
        int i = this.value;
        return i > 100 || i < 0;
    }

    public final boolean repeat() {
        return this.value == 254;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "HMPressureData(time=" + this.time + ", value=" + this.value + ')';
    }
}
