package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/GetRouteHistoryResult;", "", "routeList", "", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "nextKey", "", "<init>", "(Ljava/util/List;I)V", "getRouteList", "()Ljava/util/List;", "getNextKey", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRouteHistoryResult {

    @SerializedName(RouteRequest.KEY_NEXT_KEY)
    private final int nextKey;

    @SerializedName("route_list")
    @NotNull
    private final List<RouteInfo> routeList;

    public GetRouteHistoryResult(@NotNull List<RouteInfo> routeList, int i) {
        Intrinsics.checkNotNullParameter(routeList, "routeList");
        this.routeList = routeList;
        this.nextKey = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetRouteHistoryResult copy$default(GetRouteHistoryResult getRouteHistoryResult, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = getRouteHistoryResult.routeList;
        }
        if ((i2 & 2) != 0) {
            i = getRouteHistoryResult.nextKey;
        }
        return getRouteHistoryResult.copy(list, i);
    }

    @NotNull
    public final List<RouteInfo> component1() {
        return this.routeList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final GetRouteHistoryResult copy(@NotNull List<RouteInfo> routeList, int nextKey) {
        Intrinsics.checkNotNullParameter(routeList, "routeList");
        return new GetRouteHistoryResult(routeList, nextKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRouteHistoryResult)) {
            return false;
        }
        GetRouteHistoryResult getRouteHistoryResult = (GetRouteHistoryResult) other;
        return Intrinsics.areEqual(this.routeList, getRouteHistoryResult.routeList) && this.nextKey == getRouteHistoryResult.nextKey;
    }

    public final int getNextKey() {
        return this.nextKey;
    }

    @NotNull
    public final List<RouteInfo> getRouteList() {
        return this.routeList;
    }

    public int hashCode() {
        return (this.routeList.hashCode() * 31) + Integer.hashCode(this.nextKey);
    }

    @NotNull
    public String toString() {
        return "GetRouteHistoryResult(routeList=" + this.routeList + ", nextKey=" + this.nextKey + ")";
    }
}
