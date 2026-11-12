package com.xiaomi.fitness.sport.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/sport/utils/WrapperSportDistanceModel;", "", "distance", "", "title", "", "unit", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getDistance", "()I", "getTitle", "()Ljava/lang/String;", "getUnit", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WrapperSportDistanceModel {
    private final int distance;

    @NotNull
    private final String title;

    @NotNull
    private final String unit;

    public WrapperSportDistanceModel(int i, @NotNull String title, @NotNull String unit) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.distance = i;
        this.title = title;
        this.unit = unit;
    }

    public static /* synthetic */ WrapperSportDistanceModel copy$default(WrapperSportDistanceModel wrapperSportDistanceModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = wrapperSportDistanceModel.distance;
        }
        if ((i2 & 2) != 0) {
            str = wrapperSportDistanceModel.title;
        }
        if ((i2 & 4) != 0) {
            str2 = wrapperSportDistanceModel.unit;
        }
        return wrapperSportDistanceModel.copy(i, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    @NotNull
    public final WrapperSportDistanceModel copy(int distance, @NotNull String title, @NotNull String unit) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(unit, "unit");
        return new WrapperSportDistanceModel(distance, title, unit);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WrapperSportDistanceModel)) {
            return false;
        }
        WrapperSportDistanceModel wrapperSportDistanceModel = (WrapperSportDistanceModel) other;
        return this.distance == wrapperSportDistanceModel.distance && Intrinsics.areEqual(this.title, wrapperSportDistanceModel.title) && Intrinsics.areEqual(this.unit, wrapperSportDistanceModel.unit);
    }

    public final int getDistance() {
        return this.distance;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUnit() {
        return this.unit;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.distance) * 31) + this.title.hashCode()) * 31) + this.unit.hashCode();
    }

    @NotNull
    public String toString() {
        return "WrapperSportDistanceModel(distance=" + this.distance + ", title=" + this.title + ", unit=" + this.unit + ")";
    }

    public /* synthetic */ WrapperSportDistanceModel(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2);
    }
}
