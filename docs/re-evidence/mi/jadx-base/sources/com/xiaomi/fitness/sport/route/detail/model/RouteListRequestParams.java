package com.xiaomi.fitness.sport.route.detail.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Parcelize
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\u0003J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/RouteListRequestParams;", "Landroid/os/Parcelable;", "strategyId", "", "<init>", "(I)V", "getStrategyId", "()I", "setStrategyId", "component1", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RouteListRequestParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RouteListRequestParams> CREATOR = new Creator();

    @SerializedName("strategy_id")
    private int strategyId;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RouteListRequestParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteListRequestParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RouteListRequestParams(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RouteListRequestParams[] newArray(int i) {
            return new RouteListRequestParams[i];
        }
    }

    public RouteListRequestParams() {
        this(0, 1, null);
    }

    public static /* synthetic */ RouteListRequestParams copy$default(RouteListRequestParams routeListRequestParams, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = routeListRequestParams.strategyId;
        }
        return routeListRequestParams.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStrategyId() {
        return this.strategyId;
    }

    @NotNull
    public final RouteListRequestParams copy(int strategyId) {
        return new RouteListRequestParams(strategyId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RouteListRequestParams) && this.strategyId == ((RouteListRequestParams) other).strategyId;
    }

    public final int getStrategyId() {
        return this.strategyId;
    }

    public int hashCode() {
        return Integer.hashCode(this.strategyId);
    }

    public final void setStrategyId(int i) {
        this.strategyId = i;
    }

    @NotNull
    public String toString() {
        return "RouteListRequestParams(strategyId=" + this.strategyId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.strategyId);
    }

    public RouteListRequestParams(int i) {
        this.strategyId = i;
    }

    public /* synthetic */ RouteListRequestParams(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i);
    }
}
