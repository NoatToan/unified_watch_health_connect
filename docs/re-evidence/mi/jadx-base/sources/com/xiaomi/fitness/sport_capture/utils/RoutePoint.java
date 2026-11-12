package com.xiaomi.fitness.sport_capture.utils;

import com.xiaomi.fitness.sport_eco.SportConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/sport_capture/utils/RoutePoint;", "", SportConstants.KEY_TIMESTAMP, "", "lon", "", "lat", "<init>", "(JDD)V", "getTimeStamp", "()J", "getLon", "()D", "getLat", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-capture_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RoutePoint {
    private final double lat;
    private final double lon;
    private final long timeStamp;

    public RoutePoint(long j, double d, double d2) {
        this.timeStamp = j;
        this.lon = d;
        this.lat = d2;
    }

    public static /* synthetic */ RoutePoint copy$default(RoutePoint routePoint, long j, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = routePoint.timeStamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = routePoint.lon;
        }
        double d3 = d;
        if ((i & 4) != 0) {
            d2 = routePoint.lat;
        }
        return routePoint.copy(j2, d3, d2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLon() {
        return this.lon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getLat() {
        return this.lat;
    }

    @NotNull
    public final RoutePoint copy(long timeStamp, double lon, double lat) {
        return new RoutePoint(timeStamp, lon, lat);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RoutePoint)) {
            return false;
        }
        RoutePoint routePoint = (RoutePoint) other;
        return this.timeStamp == routePoint.timeStamp && Double.compare(this.lon, routePoint.lon) == 0 && Double.compare(this.lat, routePoint.lat) == 0;
    }

    public final double getLat() {
        return this.lat;
    }

    public final double getLon() {
        return this.lon;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((Long.hashCode(this.timeStamp) * 31) + Double.hashCode(this.lon)) * 31) + Double.hashCode(this.lat);
    }

    @NotNull
    public String toString() {
        return "RoutePoint(timeStamp=" + this.timeStamp + ", lon=" + this.lon + ", lat=" + this.lat + ")";
    }
}
