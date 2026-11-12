package com.xiaomi.hm.health.bt.profile.gdsp.breathrate;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/breathrate/BreathRateData;", "", "Ljava/util/Calendar;", "component1", "", "component2", "component3", "component4", "calendar", "breathRate", "snr", "channel", "copy", "", "toString", "hashCode", "other", "", "equals", "a", "Ljava/util/Calendar;", "getCalendar", "()Ljava/util/Calendar;", "b", LogUtil.I, "getBreathRate", "()I", "c", "getSnr", GoogleApiAvailabilityLight.a, "getChannel", "<init>", "(Ljava/util/Calendar;III)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BreathRateData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final Calendar calendar;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int breathRate;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int snr;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int channel;

    public BreathRateData(@NotNull Calendar calendar, int i, int i2, int i3) {
        this.calendar = calendar;
        this.breathRate = i;
        this.snr = i2;
        this.channel = i3;
    }

    public static /* synthetic */ BreathRateData copy$default(BreathRateData breathRateData, Calendar calendar, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            calendar = breathRateData.calendar;
        }
        if ((i4 & 2) != 0) {
            i = breathRateData.breathRate;
        }
        if ((i4 & 4) != 0) {
            i2 = breathRateData.snr;
        }
        if ((i4 & 8) != 0) {
            i3 = breathRateData.channel;
        }
        return breathRateData.copy(calendar, i, i2, i3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Calendar getCalendar() {
        return this.calendar;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBreathRate() {
        return this.breathRate;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSnr() {
        return this.snr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getChannel() {
        return this.channel;
    }

    @NotNull
    public final BreathRateData copy(@NotNull Calendar calendar, int breathRate, int snr, int channel) {
        return new BreathRateData(calendar, breathRate, snr, channel);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BreathRateData)) {
            return false;
        }
        BreathRateData breathRateData = (BreathRateData) other;
        return Intrinsics.areEqual(this.calendar, breathRateData.calendar) && this.breathRate == breathRateData.breathRate && this.snr == breathRateData.snr && this.channel == breathRateData.channel;
    }

    public final int getBreathRate() {
        return this.breathRate;
    }

    @NotNull
    public final Calendar getCalendar() {
        return this.calendar;
    }

    public final int getChannel() {
        return this.channel;
    }

    public final int getSnr() {
        return this.snr;
    }

    public int hashCode() {
        return (((((this.calendar.hashCode() * 31) + this.breathRate) * 31) + this.snr) * 31) + this.channel;
    }

    @NotNull
    public String toString() {
        return "BreathRateData(calendar=" + this.calendar + ", breathRate=" + this.breathRate + ", snr=" + this.snr + ", channel=" + this.channel + ')';
    }
}
