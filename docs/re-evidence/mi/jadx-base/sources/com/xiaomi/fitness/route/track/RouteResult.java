package com.xiaomi.fitness.route.track;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/route/track/RouteResult;", "Ljava/io/Serializable;", "routeId", "", "code", "", "<init>", "(Ljava/lang/String;I)V", "getRouteId", "()Ljava/lang/String;", "getCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteResult implements Serializable {
    private final int code;

    @NotNull
    private final String routeId;

    public RouteResult(@NotNull String routeId, int i) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.routeId = routeId;
        this.code = i;
    }

    public static /* synthetic */ RouteResult copy$default(RouteResult routeResult, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = routeResult.routeId;
        }
        if ((i2 & 2) != 0) {
            i = routeResult.code;
        }
        return routeResult.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final RouteResult copy(@NotNull String routeId, int code) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        return new RouteResult(routeId, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteResult)) {
            return false;
        }
        RouteResult routeResult = (RouteResult) other;
        return Intrinsics.areEqual(this.routeId, routeResult.routeId) && this.code == routeResult.code;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getRouteId() {
        return this.routeId;
    }

    public int hashCode() {
        return (this.routeId.hashCode() * 31) + Integer.hashCode(this.code);
    }

    @NotNull
    public String toString() {
        return "RouteResult(routeId=" + this.routeId + ", code=" + this.code + ")";
    }
}
