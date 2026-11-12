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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u001b\u001a\u00020\u0003J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteStyleListResult;", "Landroid/os/Parcelable;", "routeId", "", "timeAwait", "routeStatus", "routeName", "", "<init>", "(IIILjava/lang/String;)V", "getRouteId", "()I", "setRouteId", "(I)V", "getTimeAwait", "setTimeAwait", "getRouteStatus", "setRouteStatus", "getRouteName", "()Ljava/lang/String;", "setRouteName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserRouteStyleListResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserRouteStyleListResult> CREATOR = new Creator();

    @SerializedName("strategy_id")
    private int routeId;

    @SerializedName("route_name")
    @Nullable
    private String routeName;

    @SerializedName("route_status")
    private int routeStatus;

    @SerializedName("time_await")
    private int timeAwait;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserRouteStyleListResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserRouteStyleListResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserRouteStyleListResult(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserRouteStyleListResult[] newArray(int i) {
            return new UserRouteStyleListResult[i];
        }
    }

    public UserRouteStyleListResult() {
        this(0, 0, 0, null, 15, null);
    }

    public static /* synthetic */ UserRouteStyleListResult copy$default(UserRouteStyleListResult userRouteStyleListResult, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = userRouteStyleListResult.routeId;
        }
        if ((i4 & 2) != 0) {
            i2 = userRouteStyleListResult.timeAwait;
        }
        if ((i4 & 4) != 0) {
            i3 = userRouteStyleListResult.routeStatus;
        }
        if ((i4 & 8) != 0) {
            str = userRouteStyleListResult.routeName;
        }
        return userRouteStyleListResult.copy(i, i2, i3, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRouteId() {
        return this.routeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTimeAwait() {
        return this.timeAwait;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRouteStatus() {
        return this.routeStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRouteName() {
        return this.routeName;
    }

    @NotNull
    public final UserRouteStyleListResult copy(int routeId, int timeAwait, int routeStatus, @Nullable String routeName) {
        return new UserRouteStyleListResult(routeId, timeAwait, routeStatus, routeName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRouteStyleListResult)) {
            return false;
        }
        UserRouteStyleListResult userRouteStyleListResult = (UserRouteStyleListResult) other;
        return this.routeId == userRouteStyleListResult.routeId && this.timeAwait == userRouteStyleListResult.timeAwait && this.routeStatus == userRouteStyleListResult.routeStatus && Intrinsics.areEqual(this.routeName, userRouteStyleListResult.routeName);
    }

    public final int getRouteId() {
        return this.routeId;
    }

    @Nullable
    public final String getRouteName() {
        return this.routeName;
    }

    public final int getRouteStatus() {
        return this.routeStatus;
    }

    public final int getTimeAwait() {
        return this.timeAwait;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.routeId) * 31) + Integer.hashCode(this.timeAwait)) * 31) + Integer.hashCode(this.routeStatus)) * 31;
        String str = this.routeName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final void setRouteId(int i) {
        this.routeId = i;
    }

    public final void setRouteName(@Nullable String str) {
        this.routeName = str;
    }

    public final void setRouteStatus(int i) {
        this.routeStatus = i;
    }

    public final void setTimeAwait(int i) {
        this.timeAwait = i;
    }

    @NotNull
    public String toString() {
        return "UserRouteStyleListResult(routeId=" + this.routeId + ", timeAwait=" + this.timeAwait + ", routeStatus=" + this.routeStatus + ", routeName=" + this.routeName + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.routeId);
        dest.writeInt(this.timeAwait);
        dest.writeInt(this.routeStatus);
        dest.writeString(this.routeName);
    }

    public UserRouteStyleListResult(int i, int i2, int i3, @Nullable String str) {
        this.routeId = i;
        this.timeAwait = i2;
        this.routeStatus = i3;
        this.routeName = str;
    }

    public /* synthetic */ UserRouteStyleListResult(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? null : str);
    }
}
