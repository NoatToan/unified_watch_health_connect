package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u000eHÆ\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006("}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/LocationOption;", "", "locationMode", "", "interval", "", "isOnceLocation", "", "isLocationCacheEnable", "isNeedAddress", "isGpsFirst", "gpsFirstTimeout", "isSensorEnable", "deviceModeDistanceFilter", "", "<init>", "(Ljava/lang/String;JZZZZJZF)V", "getLocationMode", "()Ljava/lang/String;", "getInterval", "()J", "()Z", "getGpsFirstTimeout", "getDeviceModeDistanceFilter", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class LocationOption {
    private final float deviceModeDistanceFilter;
    private final long gpsFirstTimeout;
    private final long interval;
    private final boolean isGpsFirst;
    private final boolean isLocationCacheEnable;
    private final boolean isNeedAddress;
    private final boolean isOnceLocation;
    private final boolean isSensorEnable;

    @NotNull
    private final String locationMode;

    public LocationOption(@NotNull String locationMode, long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, boolean z5, float f) {
        Intrinsics.checkNotNullParameter(locationMode, "locationMode");
        this.locationMode = locationMode;
        this.interval = j;
        this.isOnceLocation = z;
        this.isLocationCacheEnable = z2;
        this.isNeedAddress = z3;
        this.isGpsFirst = z4;
        this.gpsFirstTimeout = j2;
        this.isSensorEnable = z5;
        this.deviceModeDistanceFilter = f;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocationMode() {
        return this.locationMode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getInterval() {
        return this.interval;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsOnceLocation() {
        return this.isOnceLocation;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsLocationCacheEnable() {
        return this.isLocationCacheEnable;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsNeedAddress() {
        return this.isNeedAddress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getIsGpsFirst() {
        return this.isGpsFirst;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getGpsFirstTimeout() {
        return this.gpsFirstTimeout;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsSensorEnable() {
        return this.isSensorEnable;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getDeviceModeDistanceFilter() {
        return this.deviceModeDistanceFilter;
    }

    @NotNull
    public final LocationOption copy(@NotNull String locationMode, long interval, boolean isOnceLocation, boolean isLocationCacheEnable, boolean isNeedAddress, boolean isGpsFirst, long gpsFirstTimeout, boolean isSensorEnable, float deviceModeDistanceFilter) {
        Intrinsics.checkNotNullParameter(locationMode, "locationMode");
        return new LocationOption(locationMode, interval, isOnceLocation, isLocationCacheEnable, isNeedAddress, isGpsFirst, gpsFirstTimeout, isSensorEnable, deviceModeDistanceFilter);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocationOption)) {
            return false;
        }
        LocationOption locationOption = (LocationOption) other;
        return Intrinsics.areEqual(this.locationMode, locationOption.locationMode) && this.interval == locationOption.interval && this.isOnceLocation == locationOption.isOnceLocation && this.isLocationCacheEnable == locationOption.isLocationCacheEnable && this.isNeedAddress == locationOption.isNeedAddress && this.isGpsFirst == locationOption.isGpsFirst && this.gpsFirstTimeout == locationOption.gpsFirstTimeout && this.isSensorEnable == locationOption.isSensorEnable && Float.compare(this.deviceModeDistanceFilter, locationOption.deviceModeDistanceFilter) == 0;
    }

    public final float getDeviceModeDistanceFilter() {
        return this.deviceModeDistanceFilter;
    }

    public final long getGpsFirstTimeout() {
        return this.gpsFirstTimeout;
    }

    public final long getInterval() {
        return this.interval;
    }

    @NotNull
    public final String getLocationMode() {
        return this.locationMode;
    }

    public int hashCode() {
        return (((((((((((((((this.locationMode.hashCode() * 31) + Long.hashCode(this.interval)) * 31) + Boolean.hashCode(this.isOnceLocation)) * 31) + Boolean.hashCode(this.isLocationCacheEnable)) * 31) + Boolean.hashCode(this.isNeedAddress)) * 31) + Boolean.hashCode(this.isGpsFirst)) * 31) + Long.hashCode(this.gpsFirstTimeout)) * 31) + Boolean.hashCode(this.isSensorEnable)) * 31) + Float.hashCode(this.deviceModeDistanceFilter);
    }

    public final boolean isGpsFirst() {
        return this.isGpsFirst;
    }

    public final boolean isLocationCacheEnable() {
        return this.isLocationCacheEnable;
    }

    public final boolean isNeedAddress() {
        return this.isNeedAddress;
    }

    public final boolean isOnceLocation() {
        return this.isOnceLocation;
    }

    public final boolean isSensorEnable() {
        return this.isSensorEnable;
    }

    @NotNull
    public String toString() {
        return "LocationOption(locationMode=" + this.locationMode + ", interval=" + this.interval + ", isOnceLocation=" + this.isOnceLocation + ", isLocationCacheEnable=" + this.isLocationCacheEnable + ", isNeedAddress=" + this.isNeedAddress + ", isGpsFirst=" + this.isGpsFirst + ", gpsFirstTimeout=" + this.gpsFirstTimeout + ", isSensorEnable=" + this.isSensorEnable + ", deviceModeDistanceFilter=" + this.deviceModeDistanceFilter + ")";
    }
}
