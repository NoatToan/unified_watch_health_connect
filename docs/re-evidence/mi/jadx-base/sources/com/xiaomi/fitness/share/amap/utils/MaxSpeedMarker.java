package com.xiaomi.fitness.share.amap.utils;

import com.amap.api.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J:\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "", "maxSpeedMarkerPosition", "Lcom/amap/api/maps/model/LatLng;", "maxSpeedMarkerDisRatio", "", "maxSpeed", "startTime", "", "<init>", "(Lcom/amap/api/maps/model/LatLng;Ljava/lang/Float;FJ)V", "getMaxSpeedMarkerPosition", "()Lcom/amap/api/maps/model/LatLng;", "setMaxSpeedMarkerPosition", "(Lcom/amap/api/maps/model/LatLng;)V", "getMaxSpeedMarkerDisRatio", "()Ljava/lang/Float;", "setMaxSpeedMarkerDisRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getMaxSpeed", "()F", "setMaxSpeed", "(F)V", "getStartTime", "()J", "component1", "component2", "component3", "component4", "copy", "(Lcom/amap/api/maps/model/LatLng;Ljava/lang/Float;FJ)Lcom/xiaomi/fitness/share/amap/utils/MaxSpeedMarker;", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MaxSpeedMarker {
    private float maxSpeed;

    @Nullable
    private Float maxSpeedMarkerDisRatio;

    @Nullable
    private LatLng maxSpeedMarkerPosition;
    private final long startTime;

    public MaxSpeedMarker(@Nullable LatLng latLng, @Nullable Float f, float f2, long j) {
        this.maxSpeedMarkerPosition = latLng;
        this.maxSpeedMarkerDisRatio = f;
        this.maxSpeed = f2;
        this.startTime = j;
    }

    public static /* synthetic */ MaxSpeedMarker copy$default(MaxSpeedMarker maxSpeedMarker, LatLng latLng, Float f, float f2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            latLng = maxSpeedMarker.maxSpeedMarkerPosition;
        }
        if ((i & 2) != 0) {
            f = maxSpeedMarker.maxSpeedMarkerDisRatio;
        }
        Float f3 = f;
        if ((i & 4) != 0) {
            f2 = maxSpeedMarker.maxSpeed;
        }
        float f4 = f2;
        if ((i & 8) != 0) {
            j = maxSpeedMarker.startTime;
        }
        return maxSpeedMarker.copy(latLng, f3, f4, j);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LatLng getMaxSpeedMarkerPosition() {
        return this.maxSpeedMarkerPosition;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Float getMaxSpeedMarkerDisRatio() {
        return this.maxSpeedMarkerDisRatio;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @NotNull
    public final MaxSpeedMarker copy(@Nullable LatLng maxSpeedMarkerPosition, @Nullable Float maxSpeedMarkerDisRatio, float maxSpeed, long startTime) {
        return new MaxSpeedMarker(maxSpeedMarkerPosition, maxSpeedMarkerDisRatio, maxSpeed, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxSpeedMarker)) {
            return false;
        }
        MaxSpeedMarker maxSpeedMarker = (MaxSpeedMarker) other;
        return Intrinsics.areEqual(this.maxSpeedMarkerPosition, maxSpeedMarker.maxSpeedMarkerPosition) && Intrinsics.areEqual((Object) this.maxSpeedMarkerDisRatio, (Object) maxSpeedMarker.maxSpeedMarkerDisRatio) && Float.compare(this.maxSpeed, maxSpeedMarker.maxSpeed) == 0 && this.startTime == maxSpeedMarker.startTime;
    }

    public final float getMaxSpeed() {
        return this.maxSpeed;
    }

    @Nullable
    public final Float getMaxSpeedMarkerDisRatio() {
        return this.maxSpeedMarkerDisRatio;
    }

    @Nullable
    public final LatLng getMaxSpeedMarkerPosition() {
        return this.maxSpeedMarkerPosition;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        LatLng latLng = this.maxSpeedMarkerPosition;
        int iHashCode = (latLng == null ? 0 : latLng.hashCode()) * 31;
        Float f = this.maxSpeedMarkerDisRatio;
        return ((((iHashCode + (f != null ? f.hashCode() : 0)) * 31) + Float.hashCode(this.maxSpeed)) * 31) + Long.hashCode(this.startTime);
    }

    public final void setMaxSpeed(float f) {
        this.maxSpeed = f;
    }

    public final void setMaxSpeedMarkerDisRatio(@Nullable Float f) {
        this.maxSpeedMarkerDisRatio = f;
    }

    public final void setMaxSpeedMarkerPosition(@Nullable LatLng latLng) {
        this.maxSpeedMarkerPosition = latLng;
    }

    @NotNull
    public String toString() {
        return "MaxSpeedMarker(maxSpeedMarkerPosition=" + this.maxSpeedMarkerPosition + ", maxSpeedMarkerDisRatio=" + this.maxSpeedMarkerDisRatio + ", maxSpeed=" + this.maxSpeed + ", startTime=" + this.startTime + ")";
    }
}
