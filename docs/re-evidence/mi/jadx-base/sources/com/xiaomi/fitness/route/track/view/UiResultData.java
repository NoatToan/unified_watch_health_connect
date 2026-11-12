package com.xiaomi.fitness.route.track.view;

import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/UiResultData;", "", "percentage", "", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "", "routeId", "", "error", "<init>", "(IZLjava/lang/String;Ljava/lang/String;)V", "getPercentage", "()I", "setPercentage", "(I)V", "()Z", "setComplete", "(Z)V", "getRouteId", "()Ljava/lang/String;", "setRouteId", "(Ljava/lang/String;)V", "getError", "setError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UiResultData {

    @Nullable
    private String error;
    private boolean isComplete;
    private int percentage;

    @NotNull
    private String routeId;

    public UiResultData() {
        this(0, false, null, null, 15, null);
    }

    public static /* synthetic */ UiResultData copy$default(UiResultData uiResultData, int i, boolean z, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = uiResultData.percentage;
        }
        if ((i2 & 2) != 0) {
            z = uiResultData.isComplete;
        }
        if ((i2 & 4) != 0) {
            str = uiResultData.routeId;
        }
        if ((i2 & 8) != 0) {
            str2 = uiResultData.error;
        }
        return uiResultData.copy(i, z, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    @NotNull
    public final UiResultData copy(int percentage, boolean isComplete, @NotNull String routeId, @Nullable String error) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        return new UiResultData(percentage, isComplete, routeId, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiResultData)) {
            return false;
        }
        UiResultData uiResultData = (UiResultData) other;
        return this.percentage == uiResultData.percentage && this.isComplete == uiResultData.isComplete && Intrinsics.areEqual(this.routeId, uiResultData.routeId) && Intrinsics.areEqual(this.error, uiResultData.error);
    }

    @Nullable
    public final String getError() {
        return this.error;
    }

    public final int getPercentage() {
        return this.percentage;
    }

    @NotNull
    public final String getRouteId() {
        return this.routeId;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.percentage) * 31) + Boolean.hashCode(this.isComplete)) * 31) + this.routeId.hashCode()) * 31;
        String str = this.error;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean isComplete() {
        return this.isComplete;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    public final void setError(@Nullable String str) {
        this.error = str;
    }

    public final void setPercentage(int i) {
        this.percentage = i;
    }

    public final void setRouteId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.routeId = str;
    }

    @NotNull
    public String toString() {
        return "UiResultData(percentage=" + this.percentage + ", isComplete=" + this.isComplete + ", routeId=" + this.routeId + ", error=" + this.error + ")";
    }

    public UiResultData(int i, boolean z, @NotNull String routeId, @Nullable String str) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.percentage = i;
        this.isComplete = z;
        this.routeId = routeId;
        this.error = str;
    }

    public /* synthetic */ UiResultData(int i, boolean z, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2);
    }
}
