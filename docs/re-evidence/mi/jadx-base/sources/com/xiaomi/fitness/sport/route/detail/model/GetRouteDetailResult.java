package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteDetailResult;", "", "routeDetail", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "createInfo", "Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "<init>", "(Lcom/xiaomi/fitness/sport_export/data/RouteInfo;Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;)V", "getRouteDetail", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getCreateInfo", "()Lcom/xiaomi/fitness/sport/route/detail/model/RankInfo;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRouteDetailResult {

    @SerializedName("creator_info")
    @Nullable
    private final RankInfo createInfo;

    @SerializedName("route_detail")
    @Nullable
    private final RouteInfo routeDetail;

    public GetRouteDetailResult(@Nullable RouteInfo routeInfo, @Nullable RankInfo rankInfo) {
        this.routeDetail = routeInfo;
        this.createInfo = rankInfo;
    }

    public static /* synthetic */ GetRouteDetailResult copy$default(GetRouteDetailResult getRouteDetailResult, RouteInfo routeInfo, RankInfo rankInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            routeInfo = getRouteDetailResult.routeDetail;
        }
        if ((i & 2) != 0) {
            rankInfo = getRouteDetailResult.createInfo;
        }
        return getRouteDetailResult.copy(routeInfo, rankInfo);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RouteInfo getRouteDetail() {
        return this.routeDetail;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RankInfo getCreateInfo() {
        return this.createInfo;
    }

    @NotNull
    public final GetRouteDetailResult copy(@Nullable RouteInfo routeDetail, @Nullable RankInfo createInfo) {
        return new GetRouteDetailResult(routeDetail, createInfo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRouteDetailResult)) {
            return false;
        }
        GetRouteDetailResult getRouteDetailResult = (GetRouteDetailResult) other;
        return Intrinsics.areEqual(this.routeDetail, getRouteDetailResult.routeDetail) && Intrinsics.areEqual(this.createInfo, getRouteDetailResult.createInfo);
    }

    @Nullable
    public final RankInfo getCreateInfo() {
        return this.createInfo;
    }

    @Nullable
    public final RouteInfo getRouteDetail() {
        return this.routeDetail;
    }

    public int hashCode() {
        RouteInfo routeInfo = this.routeDetail;
        int iHashCode = (routeInfo == null ? 0 : routeInfo.hashCode()) * 31;
        RankInfo rankInfo = this.createInfo;
        return iHashCode + (rankInfo != null ? rankInfo.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GetRouteDetailResult(routeDetail=" + this.routeDetail + ", createInfo=" + this.createInfo + ")";
    }
}
