package com.xiaomi.fitness.sport_export.bean;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J/\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport_export/bean/ClockData;", "", "score", "", "", "route_id", "status", "<init>", "(Ljava/util/List;II)V", "getScore", "()Ljava/util/List;", "getRoute_id", "()I", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ClockData {
    private final int route_id;

    @Nullable
    private final List<Integer> score;
    private final int status;

    public ClockData(@Nullable List<Integer> list, int i, int i2) {
        this.score = list;
        this.route_id = i;
        this.status = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClockData copy$default(ClockData clockData, List list, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = clockData.score;
        }
        if ((i3 & 2) != 0) {
            i = clockData.route_id;
        }
        if ((i3 & 4) != 0) {
            i2 = clockData.status;
        }
        return clockData.copy(list, i, i2);
    }

    @Nullable
    public final List<Integer> component1() {
        return this.score;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRoute_id() {
        return this.route_id;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final ClockData copy(@Nullable List<Integer> score, int route_id, int status) {
        return new ClockData(score, route_id, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClockData)) {
            return false;
        }
        ClockData clockData = (ClockData) other;
        return Intrinsics.areEqual(this.score, clockData.score) && this.route_id == clockData.route_id && this.status == clockData.status;
    }

    public final int getRoute_id() {
        return this.route_id;
    }

    @Nullable
    public final List<Integer> getScore() {
        return this.score;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        List<Integer> list = this.score;
        return ((((list == null ? 0 : list.hashCode()) * 31) + Integer.hashCode(this.route_id)) * 31) + Integer.hashCode(this.status);
    }

    @NotNull
    public String toString() {
        return "ClockData(score=" + this.score + ", route_id=" + this.route_id + ", status=" + this.status + ")";
    }

    public /* synthetic */ ClockData(List list, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : list, i, i2);
    }
}
