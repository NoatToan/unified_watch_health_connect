package com.xiaomi.fit.fitness.device.cgm.thirdparty;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.export.data.annotation.BloodSugarTrend;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/thirdparty/ThirdPartyGlucoseItem;", "", "time", "", "value", "", "trend", "", "<init>", "(JFI)V", "getTime", "()J", "getValue", "()F", "getTrend", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ThirdPartyGlucoseItem {

    @SerializedName("time")
    private final long time;

    @SerializedName("trend")
    private final int trend;

    @SerializedName("value")
    private final float value;

    public ThirdPartyGlucoseItem(long j, float f, @BloodSugarTrend int i) {
        this.time = j;
        this.value = f;
        this.trend = i;
    }

    public static /* synthetic */ ThirdPartyGlucoseItem copy$default(ThirdPartyGlucoseItem thirdPartyGlucoseItem, long j, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = thirdPartyGlucoseItem.time;
        }
        if ((i2 & 2) != 0) {
            f = thirdPartyGlucoseItem.value;
        }
        if ((i2 & 4) != 0) {
            i = thirdPartyGlucoseItem.trend;
        }
        return thirdPartyGlucoseItem.copy(j, f, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTrend() {
        return this.trend;
    }

    @NotNull
    public final ThirdPartyGlucoseItem copy(long time, float value, @BloodSugarTrend int trend) {
        return new ThirdPartyGlucoseItem(time, value, trend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ThirdPartyGlucoseItem)) {
            return false;
        }
        ThirdPartyGlucoseItem thirdPartyGlucoseItem = (ThirdPartyGlucoseItem) other;
        return this.time == thirdPartyGlucoseItem.time && Float.compare(this.value, thirdPartyGlucoseItem.value) == 0 && this.trend == thirdPartyGlucoseItem.trend;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getTrend() {
        return this.trend;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((Long.hashCode(this.time) * 31) + Float.hashCode(this.value)) * 31) + Integer.hashCode(this.trend);
    }

    @NotNull
    public String toString() {
        return "ThirdPartyGlucoseItem(time=" + this.time + ", value=" + this.value + ", trend=" + this.trend + ")";
    }
}
