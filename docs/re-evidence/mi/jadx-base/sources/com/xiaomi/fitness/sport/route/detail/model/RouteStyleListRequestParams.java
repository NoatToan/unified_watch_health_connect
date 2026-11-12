package com.xiaomi.fitness.sport.route.detail.model;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0018\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListRequestParams;", "", "dummy", "", "<init>", "(Lkotlin/Unit;)V", "getDummy", "()Lkotlin/Unit;", "Lkotlin/Unit;", "component1", "copy", "(Lkotlin/Unit;)Lcom/xiaomi/fitness/sport/route/detail/model/RouteStyleListRequestParams;", "equals", "", "other", "hashCode", "", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteStyleListRequestParams {

    @NotNull
    private final Unit dummy;

    /* JADX WARN: Multi-variable type inference failed */
    public RouteStyleListRequestParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RouteStyleListRequestParams copy$default(RouteStyleListRequestParams routeStyleListRequestParams, Unit unit, int i, Object obj) {
        if ((i & 1) != 0) {
            unit = routeStyleListRequestParams.dummy;
        }
        return routeStyleListRequestParams.copy(unit);
    }

    public final void component1() {
    }

    @NotNull
    public final RouteStyleListRequestParams copy(@NotNull Unit dummy) {
        Intrinsics.checkNotNullParameter(dummy, "dummy");
        return new RouteStyleListRequestParams(dummy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RouteStyleListRequestParams) && Intrinsics.areEqual(this.dummy, ((RouteStyleListRequestParams) other).dummy);
    }

    @NotNull
    public final Unit getDummy() {
        return this.dummy;
    }

    public int hashCode() {
        return this.dummy.hashCode();
    }

    @NotNull
    public String toString() {
        return "RouteStyleListRequestParams(dummy=" + this.dummy + ")";
    }

    public RouteStyleListRequestParams(@NotNull Unit dummy) {
        Intrinsics.checkNotNullParameter(dummy, "dummy");
        this.dummy = dummy;
    }

    public /* synthetic */ RouteStyleListRequestParams(Unit unit, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Unit.INSTANCE : unit);
    }
}
