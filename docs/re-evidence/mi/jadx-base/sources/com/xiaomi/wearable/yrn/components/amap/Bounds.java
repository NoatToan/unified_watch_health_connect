package com.xiaomi.wearable.yrn.components.amap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/wearable/yrn/components/amap/Bounds;", "", "northEast", "Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "southWest", "<init>", "(Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;)V", "getNorthEast", "()Lcom/xiaomi/wearable/yrn/components/amap/Coordinate;", "getSouthWest", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "components_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Bounds {

    @NotNull
    private final Coordinate northEast;

    @NotNull
    private final Coordinate southWest;

    public Bounds(@NotNull Coordinate northEast, @NotNull Coordinate southWest) {
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        this.northEast = northEast;
        this.southWest = southWest;
    }

    public static /* synthetic */ Bounds copy$default(Bounds bounds, Coordinate coordinate, Coordinate coordinate2, int i, Object obj) {
        if ((i & 1) != 0) {
            coordinate = bounds.northEast;
        }
        if ((i & 2) != 0) {
            coordinate2 = bounds.southWest;
        }
        return bounds.copy(coordinate, coordinate2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Coordinate getNorthEast() {
        return this.northEast;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Coordinate getSouthWest() {
        return this.southWest;
    }

    @NotNull
    public final Bounds copy(@NotNull Coordinate northEast, @NotNull Coordinate southWest) {
        Intrinsics.checkNotNullParameter(northEast, "northEast");
        Intrinsics.checkNotNullParameter(southWest, "southWest");
        return new Bounds(northEast, southWest);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bounds)) {
            return false;
        }
        Bounds bounds = (Bounds) other;
        return Intrinsics.areEqual(this.northEast, bounds.northEast) && Intrinsics.areEqual(this.southWest, bounds.southWest);
    }

    @NotNull
    public final Coordinate getNorthEast() {
        return this.northEast;
    }

    @NotNull
    public final Coordinate getSouthWest() {
        return this.southWest;
    }

    public int hashCode() {
        return (this.northEast.hashCode() * 31) + this.southWest.hashCode();
    }

    @NotNull
    public String toString() {
        return "Bounds(northEast=" + this.northEast + ", southWest=" + this.southWest + ")";
    }
}
