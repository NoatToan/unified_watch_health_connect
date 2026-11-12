package com.xiaomi.fitness.share.amap.utils;

import com.amap.api.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J:\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "", "maxRateMarkerPosition", "Lcom/amap/api/maps/model/LatLng;", "maxRateMarkerRatioByDis", "", "maxRate", "", "startTime", "", "<init>", "(Lcom/amap/api/maps/model/LatLng;Ljava/lang/Float;IJ)V", "getMaxRateMarkerPosition", "()Lcom/amap/api/maps/model/LatLng;", "setMaxRateMarkerPosition", "(Lcom/amap/api/maps/model/LatLng;)V", "getMaxRateMarkerRatioByDis", "()Ljava/lang/Float;", "setMaxRateMarkerRatioByDis", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getMaxRate", "()I", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "(Lcom/amap/api/maps/model/LatLng;Ljava/lang/Float;IJ)Lcom/xiaomi/fitness/share/amap/utils/MaxRateMarker;", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MaxRateMarker {
    private final int maxRate;

    @Nullable
    private LatLng maxRateMarkerPosition;

    @Nullable
    private Float maxRateMarkerRatioByDis;
    private final long startTime;

    public MaxRateMarker(@Nullable LatLng latLng, @Nullable Float f, int i, long j) {
        this.maxRateMarkerPosition = latLng;
        this.maxRateMarkerRatioByDis = f;
        this.maxRate = i;
        this.startTime = j;
    }

    public static /* synthetic */ MaxRateMarker copy$default(MaxRateMarker maxRateMarker, LatLng latLng, Float f, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            latLng = maxRateMarker.maxRateMarkerPosition;
        }
        if ((i2 & 2) != 0) {
            f = maxRateMarker.maxRateMarkerRatioByDis;
        }
        Float f2 = f;
        if ((i2 & 4) != 0) {
            i = maxRateMarker.maxRate;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = maxRateMarker.startTime;
        }
        return maxRateMarker.copy(latLng, f2, i3, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLng getMaxRateMarkerPosition() {
        return this.maxRateMarkerPosition;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getMaxRateMarkerRatioByDis() {
        return this.maxRateMarkerRatioByDis;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxRate() {
        return this.maxRate;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final MaxRateMarker copy(@Nullable LatLng maxRateMarkerPosition, @Nullable Float maxRateMarkerRatioByDis, int maxRate, long startTime) {
        return new MaxRateMarker(maxRateMarkerPosition, maxRateMarkerRatioByDis, maxRate, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxRateMarker)) {
            return false;
        }
        MaxRateMarker maxRateMarker = (MaxRateMarker) other;
        return Intrinsics.areEqual(this.maxRateMarkerPosition, maxRateMarker.maxRateMarkerPosition) && Intrinsics.areEqual((Object) this.maxRateMarkerRatioByDis, (Object) maxRateMarker.maxRateMarkerRatioByDis) && this.maxRate == maxRateMarker.maxRate && this.startTime == maxRateMarker.startTime;
    }

    public final int getMaxRate() {
        return this.maxRate;
    }

    @Nullable
    public final LatLng getMaxRateMarkerPosition() {
        return this.maxRateMarkerPosition;
    }

    @Nullable
    public final Float getMaxRateMarkerRatioByDis() {
        return this.maxRateMarkerRatioByDis;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        LatLng latLng = this.maxRateMarkerPosition;
        int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
        Float f = this.maxRateMarkerRatioByDis;
        return ((((iHashCode + (f != null ? f.hashCode() : 0)) * 31) + Integer.hashCode(this.maxRate)) * 31) + Long.hashCode(this.startTime);
    }

    public final void setMaxRateMarkerPosition(@Nullable LatLng latLng) {
        this.maxRateMarkerPosition = latLng;
    }

    public final void setMaxRateMarkerRatioByDis(@Nullable Float f) {
        this.maxRateMarkerRatioByDis = f;
    }

    @NotNull
    public String toString() {
        return "MaxRateMarker(maxRateMarkerPosition=" + this.maxRateMarkerPosition + ", maxRateMarkerRatioByDis=" + this.maxRateMarkerRatioByDis + ", maxRate=" + this.maxRate + ", startTime=" + this.startTime + ")";
    }
}
