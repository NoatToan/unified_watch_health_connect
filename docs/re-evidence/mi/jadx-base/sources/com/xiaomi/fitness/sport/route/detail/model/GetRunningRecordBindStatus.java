package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.sport_export.data.RouteInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/GetRunningRecordBindStatus;", "", "bindStatus", "", "routeInfo", "Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "score", "<init>", "(ILcom/xiaomi/fitness/sport_export/data/RouteInfo;I)V", "getBindStatus", "()I", "getRouteInfo", "()Lcom/xiaomi/fitness/sport_export/data/RouteInfo;", "getScore", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class GetRunningRecordBindStatus {

    @SerializedName("status")
    private final int bindStatus;

    @SerializedName("route_info")
    @Nullable
    private final RouteInfo routeInfo;

    @SerializedName("score")
    private final int score;

    public GetRunningRecordBindStatus(int i, @Nullable RouteInfo routeInfo, int i2) {
        this.bindStatus = i;
        this.routeInfo = routeInfo;
        this.score = i2;
    }

    public static /* synthetic */ GetRunningRecordBindStatus copy$default(GetRunningRecordBindStatus getRunningRecordBindStatus, int i, RouteInfo routeInfo, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = getRunningRecordBindStatus.bindStatus;
        }
        if ((i3 & 2) != 0) {
            routeInfo = getRunningRecordBindStatus.routeInfo;
        }
        if ((i3 & 4) != 0) {
            i2 = getRunningRecordBindStatus.score;
        }
        return getRunningRecordBindStatus.copy(i, routeInfo, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBindStatus() {
        return this.bindStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final GetRunningRecordBindStatus copy(int bindStatus, @Nullable RouteInfo routeInfo, int score) {
        return new GetRunningRecordBindStatus(bindStatus, routeInfo, score);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetRunningRecordBindStatus)) {
            return false;
        }
        GetRunningRecordBindStatus getRunningRecordBindStatus = (GetRunningRecordBindStatus) other;
        return this.bindStatus == getRunningRecordBindStatus.bindStatus && Intrinsics.areEqual(this.routeInfo, getRunningRecordBindStatus.routeInfo) && this.score == getRunningRecordBindStatus.score;
    }

    public final int getBindStatus() {
        return this.bindStatus;
    }

    @Nullable
    public final RouteInfo getRouteInfo() {
        return this.routeInfo;
    }

    public final int getScore() {
        return this.score;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.bindStatus) * 31;
        RouteInfo routeInfo = this.routeInfo;
        return ((iHashCode + (routeInfo == null ? 0 : routeInfo.hashCode())) * 31) + Integer.hashCode(this.score);
    }

    @NotNull
    public String toString() {
        return "GetRunningRecordBindStatus(bindStatus=" + this.bindStatus + ", routeInfo=" + this.routeInfo + ", score=" + this.score + ")";
    }
}
