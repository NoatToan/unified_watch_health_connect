package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/detail/model/RouteDetailResult;", "", "routeDetail", "Lcom/xiaomi/fitness/detail/model/RouteInfo;", "createInfo", "Lcom/xiaomi/fitness/detail/model/RankInfo;", "<init>", "(Lcom/xiaomi/fitness/detail/model/RouteInfo;Lcom/xiaomi/fitness/detail/model/RankInfo;)V", "getRouteDetail", "()Lcom/xiaomi/fitness/detail/model/RouteInfo;", "getCreateInfo", "()Lcom/xiaomi/fitness/detail/model/RankInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteDetailResult {

    @SerializedName("creator_info")
    @NotNull
    private final RankInfo createInfo;

    @SerializedName("route_detail")
    @NotNull
    private final RouteInfo routeDetail;

    public RouteDetailResult(@NotNull RouteInfo routeDetail, @NotNull RankInfo createInfo) {
        Intrinsics.checkNotNullParameter(routeDetail, "routeDetail");
        Intrinsics.checkNotNullParameter(createInfo, "createInfo");
        this.routeDetail = routeDetail;
        this.createInfo = createInfo;
    }

    public static /* synthetic */ RouteDetailResult copy$default(RouteDetailResult routeDetailResult, RouteInfo routeInfo, RankInfo rankInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            routeInfo = routeDetailResult.routeDetail;
        }
        if ((i & 2) != 0) {
            rankInfo = routeDetailResult.createInfo;
        }
        return routeDetailResult.copy(routeInfo, rankInfo);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RouteInfo getRouteDetail() {
        return this.routeDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RankInfo getCreateInfo() {
        return this.createInfo;
    }

    @NotNull
    public final RouteDetailResult copy(@NotNull RouteInfo routeDetail, @NotNull RankInfo createInfo) {
        Intrinsics.checkNotNullParameter(routeDetail, "routeDetail");
        Intrinsics.checkNotNullParameter(createInfo, "createInfo");
        return new RouteDetailResult(routeDetail, createInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteDetailResult)) {
            return false;
        }
        RouteDetailResult routeDetailResult = (RouteDetailResult) other;
        return Intrinsics.areEqual(this.routeDetail, routeDetailResult.routeDetail) && Intrinsics.areEqual(this.createInfo, routeDetailResult.createInfo);
    }

    @NotNull
    public final RankInfo getCreateInfo() {
        return this.createInfo;
    }

    @NotNull
    public final RouteInfo getRouteDetail() {
        return this.routeDetail;
    }

    public int hashCode() {
        return (this.routeDetail.hashCode() * 31) + this.createInfo.hashCode();
    }

    @NotNull
    public String toString() {
        return "RouteDetailResult(routeDetail=" + this.routeDetail + ", createInfo=" + this.createInfo + ")";
    }
}
