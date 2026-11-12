package com.google.maps.android.compose;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import java.util.Objects;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016Jd\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001a¨\u0006#"}, d2 = {"Lcom/google/maps/android/compose/MapProperties;", "", "isBuildingEnabled", "", "isIndoorEnabled", "isMyLocationEnabled", "isTrafficEnabled", "latLngBoundsForCameraTarget", "Lcom/google/android/gms/maps/model/LatLngBounds;", "mapStyleOptions", "Lcom/google/android/gms/maps/model/MapStyleOptions;", "mapType", "Lcom/google/maps/android/compose/MapType;", "maxZoomPreference", "", "minZoomPreference", "<init>", "(ZZZZLcom/google/android/gms/maps/model/LatLngBounds;Lcom/google/android/gms/maps/model/MapStyleOptions;Lcom/google/maps/android/compose/MapType;FF)V", "()Z", "getLatLngBoundsForCameraTarget", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "getMapStyleOptions", "()Lcom/google/android/gms/maps/model/MapStyleOptions;", "getMapType", "()Lcom/google/maps/android/compose/MapType;", "getMaxZoomPreference", "()F", "getMinZoomPreference", "toString", "", "equals", "other", "hashCode", "", "copy", "maps-compose_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MapProperties {
    public static final int $stable = 0;
    private final boolean isBuildingEnabled;
    private final boolean isIndoorEnabled;
    private final boolean isMyLocationEnabled;
    private final boolean isTrafficEnabled;
    private final LatLngBounds latLngBoundsForCameraTarget;
    private final MapStyleOptions mapStyleOptions;
    private final MapType mapType;
    private final float maxZoomPreference;
    private final float minZoomPreference;

    public /* synthetic */ MapProperties(boolean z14, boolean z15, boolean z16, boolean z17, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, MapType mapType, float f14, float f15, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16, (i14 & 8) != 0 ? false : z17, (i14 & 16) != 0 ? null : latLngBounds, (i14 & 32) != 0 ? null : mapStyleOptions, (i14 & 64) != 0 ? MapType.NORMAL : mapType, (i14 & 128) != 0 ? 21.0f : f14, (i14 & 256) != 0 ? 3.0f : f15);
    }

    public static /* synthetic */ MapProperties copy$default(MapProperties mapProperties, boolean z14, boolean z15, boolean z16, boolean z17, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, MapType mapType, float f14, float f15, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = mapProperties.isBuildingEnabled;
        }
        if ((i14 & 2) != 0) {
            z15 = mapProperties.isIndoorEnabled;
        }
        if ((i14 & 4) != 0) {
            z16 = mapProperties.isMyLocationEnabled;
        }
        if ((i14 & 8) != 0) {
            z17 = mapProperties.isTrafficEnabled;
        }
        if ((i14 & 16) != 0) {
            latLngBounds = mapProperties.latLngBoundsForCameraTarget;
        }
        if ((i14 & 32) != 0) {
            mapStyleOptions = mapProperties.mapStyleOptions;
        }
        if ((i14 & 64) != 0) {
            mapType = mapProperties.mapType;
        }
        if ((i14 & 128) != 0) {
            f14 = mapProperties.maxZoomPreference;
        }
        if ((i14 & 256) != 0) {
            f15 = mapProperties.minZoomPreference;
        }
        float f16 = f14;
        float f17 = f15;
        MapStyleOptions mapStyleOptions2 = mapStyleOptions;
        MapType mapType2 = mapType;
        LatLngBounds latLngBounds2 = latLngBounds;
        boolean z18 = z16;
        return mapProperties.copy(z14, z15, z18, z17, latLngBounds2, mapStyleOptions2, mapType2, f16, f17);
    }

    public final MapProperties copy(boolean isBuildingEnabled, boolean isIndoorEnabled, boolean isMyLocationEnabled, boolean isTrafficEnabled, LatLngBounds latLngBoundsForCameraTarget, MapStyleOptions mapStyleOptions, MapType mapType, float maxZoomPreference, float minZoomPreference) {
        mapType.getClass();
        return new MapProperties(isBuildingEnabled, isIndoorEnabled, isMyLocationEnabled, isTrafficEnabled, latLngBoundsForCameraTarget, mapStyleOptions, mapType, maxZoomPreference, minZoomPreference);
    }

    public boolean equals(Object other) {
        if (!(other instanceof MapProperties)) {
            return false;
        }
        MapProperties mapProperties = (MapProperties) other;
        return this.isBuildingEnabled == mapProperties.isBuildingEnabled && this.isIndoorEnabled == mapProperties.isIndoorEnabled && this.isMyLocationEnabled == mapProperties.isMyLocationEnabled && this.isTrafficEnabled == mapProperties.isTrafficEnabled && p005kotlin.jvm.internal.s.g(this.latLngBoundsForCameraTarget, mapProperties.latLngBoundsForCameraTarget) && p005kotlin.jvm.internal.s.g(this.mapStyleOptions, mapProperties.mapStyleOptions) && this.mapType == mapProperties.mapType && this.maxZoomPreference == mapProperties.maxZoomPreference && this.minZoomPreference == mapProperties.minZoomPreference;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.latLngBoundsForCameraTarget;
    }

    public final MapStyleOptions getMapStyleOptions() {
        return this.mapStyleOptions;
    }

    public final MapType getMapType() {
        return this.mapType;
    }

    public final float getMaxZoomPreference() {
        return this.maxZoomPreference;
    }

    public final float getMinZoomPreference() {
        return this.minZoomPreference;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isBuildingEnabled), Boolean.valueOf(this.isIndoorEnabled), Boolean.valueOf(this.isMyLocationEnabled), Boolean.valueOf(this.isTrafficEnabled), this.latLngBoundsForCameraTarget, this.mapStyleOptions, this.mapType, Float.valueOf(this.maxZoomPreference), Float.valueOf(this.minZoomPreference));
    }

    /* JADX INFO: renamed from: isBuildingEnabled, reason: from getter */
    public final boolean getIsBuildingEnabled() {
        return this.isBuildingEnabled;
    }

    /* JADX INFO: renamed from: isIndoorEnabled, reason: from getter */
    public final boolean getIsIndoorEnabled() {
        return this.isIndoorEnabled;
    }

    /* JADX INFO: renamed from: isMyLocationEnabled, reason: from getter */
    public final boolean getIsMyLocationEnabled() {
        return this.isMyLocationEnabled;
    }

    /* JADX INFO: renamed from: isTrafficEnabled, reason: from getter */
    public final boolean getIsTrafficEnabled() {
        return this.isTrafficEnabled;
    }

    public String toString() {
        StringBuilder sb3 = new StringBuilder("MapProperties(isBuildingEnabled=");
        sb3.append(this.isBuildingEnabled);
        sb3.append(", isIndoorEnabled=");
        sb3.append(this.isIndoorEnabled);
        sb3.append(", isMyLocationEnabled=");
        sb3.append(this.isMyLocationEnabled);
        sb3.append(", isTrafficEnabled=");
        sb3.append(this.isTrafficEnabled);
        sb3.append(", latLngBoundsForCameraTarget=");
        sb3.append(this.latLngBoundsForCameraTarget);
        sb3.append(", mapStyleOptions=");
        sb3.append(this.mapStyleOptions);
        sb3.append(", mapType=");
        sb3.append(this.mapType);
        sb3.append(", maxZoomPreference=");
        sb3.append(this.maxZoomPreference);
        sb3.append(", minZoomPreference=");
        return q6.f.p(sb3, this.minZoomPreference, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public MapProperties(boolean z14, boolean z15, boolean z16, boolean z17, LatLngBounds latLngBounds, MapStyleOptions mapStyleOptions, MapType mapType, float f14, float f15) {
        mapType.getClass();
        this.isBuildingEnabled = z14;
        this.isIndoorEnabled = z15;
        this.isMyLocationEnabled = z16;
        this.isTrafficEnabled = z17;
        this.latLngBoundsForCameraTarget = latLngBounds;
        this.mapStyleOptions = mapStyleOptions;
        this.mapType = mapType;
        this.maxZoomPreference = f14;
        this.minZoomPreference = f15;
    }

    public MapProperties() {
        this(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
    }
}
