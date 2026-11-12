package com.xiaomi.hm.health.bt.profile.gdsp.spo2;

import com.miui.tsmclient.net.TSMAuthContants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 &2\u00020\u0001:\u0001'BI\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003JW\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\"\u0010!R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/LowOsaNotificationData;", "Ljava/io/Serializable;", "", "component1", "component2", "component3", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/LowOsaValue;", "component4", "component5", "component6", "startTime", "endTime", TSMAuthContants.PARAM_THRESHOLD, "realTimeOsa", "avgOsaPerMin", "osaValue", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "J", "getStartTime", "()J", "getEndTime", "getThreshold", "Ljava/util/List;", "getRealTimeOsa", "()Ljava/util/List;", "getAvgOsaPerMin", "getOsaValue", "<init>", "(JJJLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class LowOsaNotificationData implements Serializable {
    private static final long serialVersionUID = 1;

    @NotNull
    private final List<LowOsaValue> avgOsaPerMin;
    private final long endTime;

    @NotNull
    private final List<LowOsaValue> osaValue;

    @NotNull
    private final List<LowOsaValue> realTimeOsa;
    private final long startTime;
    private final long threshold;

    public LowOsaNotificationData(long j, long j2, long j3, @NotNull List<LowOsaValue> realTimeOsa, @NotNull List<LowOsaValue> avgOsaPerMin, @NotNull List<LowOsaValue> osaValue) {
        Intrinsics.checkNotNullParameter(realTimeOsa, "realTimeOsa");
        Intrinsics.checkNotNullParameter(avgOsaPerMin, "avgOsaPerMin");
        Intrinsics.checkNotNullParameter(osaValue, "osaValue");
        this.startTime = j;
        this.endTime = j2;
        this.threshold = j3;
        this.realTimeOsa = realTimeOsa;
        this.avgOsaPerMin = avgOsaPerMin;
        this.osaValue = osaValue;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getThreshold() {
        return this.threshold;
    }

    @NotNull
    public final List<LowOsaValue> component4() {
        return this.realTimeOsa;
    }

    @NotNull
    public final List<LowOsaValue> component5() {
        return this.avgOsaPerMin;
    }

    @NotNull
    public final List<LowOsaValue> component6() {
        return this.osaValue;
    }

    @NotNull
    public final LowOsaNotificationData copy(long startTime, long endTime, long threshold, @NotNull List<LowOsaValue> realTimeOsa, @NotNull List<LowOsaValue> avgOsaPerMin, @NotNull List<LowOsaValue> osaValue) {
        Intrinsics.checkNotNullParameter(realTimeOsa, "realTimeOsa");
        Intrinsics.checkNotNullParameter(avgOsaPerMin, "avgOsaPerMin");
        Intrinsics.checkNotNullParameter(osaValue, "osaValue");
        return new LowOsaNotificationData(startTime, endTime, threshold, realTimeOsa, avgOsaPerMin, osaValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LowOsaNotificationData)) {
            return false;
        }
        LowOsaNotificationData lowOsaNotificationData = (LowOsaNotificationData) other;
        return this.startTime == lowOsaNotificationData.startTime && this.endTime == lowOsaNotificationData.endTime && this.threshold == lowOsaNotificationData.threshold && Intrinsics.areEqual(this.realTimeOsa, lowOsaNotificationData.realTimeOsa) && Intrinsics.areEqual(this.avgOsaPerMin, lowOsaNotificationData.avgOsaPerMin) && Intrinsics.areEqual(this.osaValue, lowOsaNotificationData.osaValue);
    }

    @NotNull
    public final List<LowOsaValue> getAvgOsaPerMin() {
        return this.avgOsaPerMin;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final List<LowOsaValue> getOsaValue() {
        return this.osaValue;
    }

    @NotNull
    public final List<LowOsaValue> getRealTimeOsa() {
        return this.realTimeOsa;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final long getThreshold() {
        return this.threshold;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.startTime) * 31) + Long.hashCode(this.endTime)) * 31) + Long.hashCode(this.threshold)) * 31) + this.realTimeOsa.hashCode()) * 31) + this.avgOsaPerMin.hashCode()) * 31) + this.osaValue.hashCode();
    }

    @NotNull
    public String toString() {
        return "LowOsaNotificationData(startTime=" + this.startTime + ", endTime=" + this.endTime + ", threshold=" + this.threshold + ", realTimeOsa=" + this.realTimeOsa + ", avgOsaPerMin=" + this.avgOsaPerMin + ", osaValue=" + this.osaValue + ')';
    }
}
