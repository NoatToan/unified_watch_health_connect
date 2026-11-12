package com.xiaomi.fitness.route.export.track;

import com.xiaomi.fitness.sport.route.detail.server.RouteRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/route/export/track/RouteListResponse;", "", "has_more", "", RouteRequest.KEY_NEXT_KEY, "", "route_list", "", "Lcom/xiaomi/fitness/route/export/track/Route;", "<init>", "(ZLjava/lang/String;Ljava/util/List;)V", "getHas_more", "()Z", "getNext_key", "()Ljava/lang/String;", "getRoute_list", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "route-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteListResponse {
    private final boolean has_more;

    @NotNull
    private final String next_key;

    @NotNull
    private final List<Route> route_list;

    public RouteListResponse(boolean z, @NotNull String next_key, @NotNull List<Route> route_list) {
        Intrinsics.checkNotNullParameter(next_key, "next_key");
        Intrinsics.checkNotNullParameter(route_list, "route_list");
        this.has_more = z;
        this.next_key = next_key;
        this.route_list = route_list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RouteListResponse copy$default(RouteListResponse routeListResponse, boolean z, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = routeListResponse.has_more;
        }
        if ((i & 2) != 0) {
            str = routeListResponse.next_key;
        }
        if ((i & 4) != 0) {
            list = routeListResponse.route_list;
        }
        return routeListResponse.copy(z, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getHas_more() {
        return this.has_more;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNext_key() {
        return this.next_key;
    }

    @NotNull
    public final List<Route> component3() {
        return this.route_list;
    }

    @NotNull
    public final RouteListResponse copy(boolean has_more, @NotNull String next_key, @NotNull List<Route> route_list) {
        Intrinsics.checkNotNullParameter(next_key, "next_key");
        Intrinsics.checkNotNullParameter(route_list, "route_list");
        return new RouteListResponse(has_more, next_key, route_list);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteListResponse)) {
            return false;
        }
        RouteListResponse routeListResponse = (RouteListResponse) other;
        return this.has_more == routeListResponse.has_more && Intrinsics.areEqual(this.next_key, routeListResponse.next_key) && Intrinsics.areEqual(this.route_list, routeListResponse.route_list);
    }

    public final boolean getHas_more() {
        return this.has_more;
    }

    @NotNull
    public final String getNext_key() {
        return this.next_key;
    }

    @NotNull
    public final List<Route> getRoute_list() {
        return this.route_list;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.has_more) * 31) + this.next_key.hashCode()) * 31) + this.route_list.hashCode();
    }

    @NotNull
    public String toString() {
        return "RouteListResponse(has_more=" + this.has_more + ", next_key=" + this.next_key + ", route_list=" + this.route_list + ")";
    }

    public /* synthetic */ RouteListResponse(boolean z, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, str, list);
    }
}
