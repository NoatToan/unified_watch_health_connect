package com.xiaomi.fitness.route.track.view;

import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/InstallResultData;", "", SportDataTypeKt.DIMEN_TOTAL, "", "value", "routeId", "", "<init>", "(IILjava/lang/String;)V", "getTotal", "()I", "setTotal", "(I)V", "getValue", "getRouteId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class InstallResultData {

    @NotNull
    private final String routeId;
    private int total;
    private final int value;

    public InstallResultData(int i, int i2, @NotNull String routeId) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.total = i;
        this.value = i2;
        this.routeId = routeId;
    }

    public static /* synthetic */ InstallResultData copy$default(InstallResultData installResultData, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = installResultData.total;
        }
        if ((i3 & 2) != 0) {
            i2 = installResultData.value;
        }
        if ((i3 & 4) != 0) {
            str = installResultData.routeId;
        }
        return installResultData.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    @NotNull
    public final InstallResultData copy(int total, int value, @NotNull String routeId) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        return new InstallResultData(total, value, routeId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstallResultData)) {
            return false;
        }
        InstallResultData installResultData = (InstallResultData) other;
        return this.total == installResultData.total && this.value == installResultData.value && Intrinsics.areEqual(this.routeId, installResultData.routeId);
    }

    @NotNull
    public final String getRouteId() {
        return this.routeId;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.total) * 31) + Integer.hashCode(this.value)) * 31) + this.routeId.hashCode();
    }

    public final void setTotal(int i) {
        this.total = i;
    }

    @NotNull
    public String toString() {
        return "InstallResultData(total=" + this.total + ", value=" + this.value + ", routeId=" + this.routeId + ")";
    }

    public /* synthetic */ InstallResultData(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, i2, (i3 & 4) != 0 ? "" : str);
    }
}
