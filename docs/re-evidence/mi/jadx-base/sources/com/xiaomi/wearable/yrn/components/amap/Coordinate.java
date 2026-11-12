package com.xiaomi.wearable.yrn.components.amap;

import com.amap.api.maps.model.LatLng;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "", "latitude", "", "longitude", "<init>", "(DD)V", "getLatitude", "()D", "getLongitude", "toLatLng", "Lcom/amap/api/maps/model/LatLng;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Coordinate {
    private final double latitude;
    private final double longitude;

    public Coordinate(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = coordinate.latitude;
        }
        if ((i & 2) != 0) {
            d2 = coordinate.longitude;
        }
        return coordinate.copy(d, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLongitude() {
        return this.longitude;
    }

    @NotNull
    public final Coordinate copy(double latitude, double longitude) {
        return new Coordinate(latitude, longitude);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) other;
        return Double.compare(this.latitude, coordinate.latitude) == 0 && Double.compare(this.longitude, coordinate.longitude) == 0;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (Double.hashCode(this.latitude) * 31) + Double.hashCode(this.longitude);
    }

    @NotNull
    public final LatLng toLatLng() {
        return new LatLng(this.latitude, this.longitude);
    }

    @NotNull
    public String toString() {
        return "Coordinate(latitude=" + this.latitude + ", longitude=" + this.longitude + ")";
    }
}
