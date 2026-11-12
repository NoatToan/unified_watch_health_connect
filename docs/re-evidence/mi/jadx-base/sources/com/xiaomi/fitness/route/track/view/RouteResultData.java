package com.xiaomi.fitness.route.track.view;

import com.miui.tsmclient.util.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/RouteResultData;", "", "success", "", "routeId", "", "code", "", Constants.EXTRA_ERROR_MESSAGE, "<init>", "(ZLjava/lang/String;ILjava/lang/String;)V", "getSuccess", "()Z", "getRouteId", "()Ljava/lang/String;", "getCode", "()I", "getErrorMsg", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteResultData {
    private final int code;

    @NotNull
    private final String errorMsg;

    @NotNull
    private final String routeId;
    private final boolean success;

    public RouteResultData(boolean z, @NotNull String routeId, int i, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        this.success = z;
        this.routeId = routeId;
        this.code = i;
        this.errorMsg = errorMsg;
    }

    public static /* synthetic */ RouteResultData copy$default(RouteResultData routeResultData, boolean z, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = routeResultData.success;
        }
        if ((i2 & 2) != 0) {
            str = routeResultData.routeId;
        }
        if ((i2 & 4) != 0) {
            i = routeResultData.code;
        }
        if ((i2 & 8) != 0) {
            str2 = routeResultData.errorMsg;
        }
        return routeResultData.copy(z, str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final RouteResultData copy(boolean success, @NotNull String routeId, int code, @NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        return new RouteResultData(success, routeId, code, errorMsg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteResultData)) {
            return false;
        }
        RouteResultData routeResultData = (RouteResultData) other;
        return this.success == routeResultData.success && Intrinsics.areEqual(this.routeId, routeResultData.routeId) && this.code == routeResultData.code && Intrinsics.areEqual(this.errorMsg, routeResultData.errorMsg);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    @NotNull
    public final String getRouteId() {
        return this.routeId;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.success) * 31) + this.routeId.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + this.errorMsg.hashCode();
    }

    @NotNull
    public String toString() {
        return "RouteResultData(success=" + this.success + ", routeId=" + this.routeId + ", code=" + this.code + ", errorMsg=" + this.errorMsg + ")";
    }

    public /* synthetic */ RouteResultData(boolean z, String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, i, (i2 & 8) != 0 ? "" : str2);
    }
}
