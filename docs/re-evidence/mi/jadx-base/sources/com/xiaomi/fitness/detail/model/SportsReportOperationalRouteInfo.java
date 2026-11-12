package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportsReportOperationalRouteInfo;", "", "bindStatus", "", "routeInfo", "Lcom/xiaomi/fitness/detail/model/RouteInfo;", "<init>", "(ILcom/xiaomi/fitness/detail/model/RouteInfo;)V", "getBindStatus", "()I", "getRouteInfo", "()Lcom/xiaomi/fitness/detail/model/RouteInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportsReportOperationalRouteInfo {

    @SerializedName("bind_status")
    private final int bindStatus;

    @SerializedName("route_detail")
    @NotNull
    private final RouteInfo routeInfo;

    public SportsReportOperationalRouteInfo(int i, @NotNull RouteInfo routeInfo) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        this.bindStatus = i;
        this.routeInfo = routeInfo;
    }

    public static /* synthetic */ SportsReportOperationalRouteInfo copy$default(SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo, int i, RouteInfo routeInfo, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportsReportOperationalRouteInfo.bindStatus;
        }
        if ((i2 & 2) != 0) {
            routeInfo = sportsReportOperationalRouteInfo.routeInfo;
        }
        return sportsReportOperationalRouteInfo.copy(i, routeInfo);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBindStatus() {
        return this.bindStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @NotNull
    public final SportsReportOperationalRouteInfo copy(int bindStatus, @NotNull RouteInfo routeInfo) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        return new SportsReportOperationalRouteInfo(bindStatus, routeInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsReportOperationalRouteInfo)) {
            return false;
        }
        SportsReportOperationalRouteInfo sportsReportOperationalRouteInfo = (SportsReportOperationalRouteInfo) other;
        return this.bindStatus == sportsReportOperationalRouteInfo.bindStatus && Intrinsics.areEqual(this.routeInfo, sportsReportOperationalRouteInfo.routeInfo);
    }

    public final int getBindStatus() {
        return this.bindStatus;
    }

    @NotNull
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    public int hashCode() {
        return (Integer.hashCode(this.bindStatus) * 31) + this.routeInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportsReportOperationalRouteInfo(bindStatus=" + this.bindStatus + ", routeInfo=" + this.routeInfo + ")";
    }
}
