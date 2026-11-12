package com.xiaomi.fitness.sport.route.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\t\"\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/ProgressRouteStatus;", "", "strategyId", "", "routeStatus", "sceneType", "<init>", "(III)V", "getStrategyId", "()I", "getRouteStatus", "setRouteStatus", "(I)V", "getSceneType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProgressRouteStatus {

    @SerializedName("route_status")
    private int routeStatus;

    @SerializedName("scene_type")
    private final int sceneType;

    @SerializedName("strategy_id")
    private final int strategyId;

    public ProgressRouteStatus(int i, int i2, int i3) {
        this.strategyId = i;
        this.routeStatus = i2;
        this.sceneType = i3;
    }

    public static /* synthetic */ ProgressRouteStatus copy$default(ProgressRouteStatus progressRouteStatus, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = progressRouteStatus.strategyId;
        }
        if ((i4 & 2) != 0) {
            i2 = progressRouteStatus.routeStatus;
        }
        if ((i4 & 4) != 0) {
            i3 = progressRouteStatus.sceneType;
        }
        return progressRouteStatus.copy(i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStrategyId() {
        return this.strategyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRouteStatus() {
        return this.routeStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSceneType() {
        return this.sceneType;
    }

    @NotNull
    public final ProgressRouteStatus copy(int strategyId, int routeStatus, int sceneType) {
        return new ProgressRouteStatus(strategyId, routeStatus, sceneType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressRouteStatus)) {
            return false;
        }
        ProgressRouteStatus progressRouteStatus = (ProgressRouteStatus) other;
        return this.strategyId == progressRouteStatus.strategyId && this.routeStatus == progressRouteStatus.routeStatus && this.sceneType == progressRouteStatus.sceneType;
    }

    public final int getRouteStatus() {
        return this.routeStatus;
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    public final int getStrategyId() {
        return this.strategyId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.strategyId) * 31) + Integer.hashCode(this.routeStatus)) * 31) + Integer.hashCode(this.sceneType);
    }

    public final void setRouteStatus(int i) {
        this.routeStatus = i;
    }

    @NotNull
    public String toString() {
        return "ProgressRouteStatus(strategyId=" + this.strategyId + ", routeStatus=" + this.routeStatus + ", sceneType=" + this.sceneType + ")";
    }
}
