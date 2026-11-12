package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/ClockInResult;", "", "routeInfo", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "<init>", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;)V", "getRouteInfo", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClockInResult {

    @SerializedName("route_detail")
    @NotNull
    private final RouteInfo routeInfo;

    public ClockInResult(@NotNull RouteInfo routeInfo) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        this.routeInfo = routeInfo;
    }

    public static /* synthetic */ ClockInResult copy$default(ClockInResult clockInResult, RouteInfo routeInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            routeInfo = clockInResult.routeInfo;
        }
        return clockInResult.copy(routeInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    @NotNull
    public final ClockInResult copy(@NotNull RouteInfo routeInfo) {
        Intrinsics.checkNotNullParameter(routeInfo, "routeInfo");
        return new ClockInResult(routeInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ClockInResult) && Intrinsics.areEqual(this.routeInfo, ((ClockInResult) other).routeInfo);
    }

    @NotNull
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    public int hashCode() {
        return this.routeInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "ClockInResult(routeInfo=" + this.routeInfo + ")";
    }
}
