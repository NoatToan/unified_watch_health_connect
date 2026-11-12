package com.huami.ecg.service;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.watch.companion.dataflow.Constant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003JK\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0019\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%¨\u00060"}, d2 = {"Lcom/huami/ecg/service/EcgEntity;", "", "", "component1", "", "component2", "", "component3", "", "Lcom/huami/ecg/service/CurveChartPoint;", "component4", "component5", "component6", "timestamp", "hrv", Constant.KEY_HR_VALUE, "chartPoints", "aFib", Constants.DATA_KEY_HR, "copy", "", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "F", "getHrv", "()F", "c", LogUtil.I, "getHeartRate", "()I", GoogleApiAvailabilityLight.a, "Ljava/util/List;", "getChartPoints", "()Ljava/util/List;", "e", "getAFib", "f", "getHr", "<init>", "(JFILjava/util/List;II)V", "ecg-service_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class EcgEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final float hrv;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int heartRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<CurveChartPoint> chartPoints;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int aFib;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int hr;

    public EcgEntity(long j, float f, int i, @NotNull List<CurveChartPoint> list, int i2, int i3) {
        this.timestamp = j;
        this.hrv = f;
        this.heartRate = i;
        this.chartPoints = list;
        this.aFib = i2;
        this.hr = i3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getHrv() {
        return this.hrv;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHeartRate() {
        return this.heartRate;
    }

    @NotNull
    public final List<CurveChartPoint> component4() {
        return this.chartPoints;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAFib() {
        return this.aFib;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getHr() {
        return this.hr;
    }

    @NotNull
    public final EcgEntity copy(long timestamp, float hrv, int heartRate, @NotNull List<CurveChartPoint> chartPoints, int aFib, int hr) {
        return new EcgEntity(timestamp, hrv, heartRate, chartPoints, aFib, hr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EcgEntity)) {
            return false;
        }
        EcgEntity ecgEntity = (EcgEntity) other;
        return this.timestamp == ecgEntity.timestamp && Float.compare(this.hrv, ecgEntity.hrv) == 0 && this.heartRate == ecgEntity.heartRate && Intrinsics.areEqual(this.chartPoints, ecgEntity.chartPoints) && this.aFib == ecgEntity.aFib && this.hr == ecgEntity.hr;
    }

    public final int getAFib() {
        return this.aFib;
    }

    @NotNull
    public final List<CurveChartPoint> getChartPoints() {
        return this.chartPoints;
    }

    public final int getHeartRate() {
        return this.heartRate;
    }

    public final int getHr() {
        return this.hr;
    }

    public final float getHrv() {
        return this.hrv;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j = this.timestamp;
        int iFloatToIntBits = ((((((int) (j ^ (j >>> 32))) * 31) + Float.floatToIntBits(this.hrv)) * 31) + this.heartRate) * 31;
        List<CurveChartPoint> list = this.chartPoints;
        return ((((iFloatToIntBits + (list != null ? list.hashCode() : 0)) * 31) + this.aFib) * 31) + this.hr;
    }

    @NotNull
    public String toString() {
        return "EcgEntity(timestamp=" + this.timestamp + ", hrv=" + this.hrv + ", heartRate=" + this.heartRate + ", chartPoints=" + this.chartPoints + ", aFib=" + this.aFib + ", hr=" + this.hr + ")";
    }
}
