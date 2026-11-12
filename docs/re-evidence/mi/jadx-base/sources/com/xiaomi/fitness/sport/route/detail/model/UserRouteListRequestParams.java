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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/model/UserRouteListRequestParams;", "Landroid/os/Parcelable;", "routeId", "", "time", "", "originType", "<init>", "(IJI)V", "getRouteId", "()I", "setRouteId", "(I)V", "getTime", "()J", "setTime", "(J)V", "getOriginType", "setOriginType", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class UserRouteListRequestParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserRouteListRequestParams> CREATOR = new Creator();

    @SerializedName("origin_type")
    private int originType;

    @SerializedName("route_id")
    private int routeId;

    @SerializedName("time")
    private long time;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserRouteListRequestParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserRouteListRequestParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserRouteListRequestParams(parcel.readInt(), parcel.readLong(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UserRouteListRequestParams[] newArray(int i) {
            return new UserRouteListRequestParams[i];
        }
    }

    public UserRouteListRequestParams() {
        this(0, 0L, 0, 7, null);
    }

    public static /* synthetic */ UserRouteListRequestParams copy$default(UserRouteListRequestParams userRouteListRequestParams, int i, long j, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userRouteListRequestParams.routeId;
        }
        if ((i3 & 2) != 0) {
            j = userRouteListRequestParams.time;
        }
        if ((i3 & 4) != 0) {
            i2 = userRouteListRequestParams.originType;
        }
        return userRouteListRequestParams.copy(i, j, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRouteId() {
        return this.routeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getOriginType() {
        return this.originType;
    }

    @NotNull
    public final UserRouteListRequestParams copy(int routeId, long time, int originType) {
        return new UserRouteListRequestParams(routeId, time, originType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserRouteListRequestParams)) {
            return false;
        }
        UserRouteListRequestParams userRouteListRequestParams = (UserRouteListRequestParams) other;
        return this.routeId == userRouteListRequestParams.routeId && this.time == userRouteListRequestParams.time && this.originType == userRouteListRequestParams.originType;
    }

    public final int getOriginType() {
        return this.originType;
    }

    public final int getRouteId() {
        return this.routeId;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.routeId) * 31) + Long.hashCode(this.time)) * 31) + Integer.hashCode(this.originType);
    }

    public final void setOriginType(int i) {
        this.originType = i;
    }

    public final void setRouteId(int i) {
        this.routeId = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @NotNull
    public String toString() {
        return "UserRouteListRequestParams(routeId=" + this.routeId + ", time=" + this.time + ", originType=" + this.originType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.routeId);
        dest.writeLong(this.time);
        dest.writeInt(this.originType);
    }

    public UserRouteListRequestParams(int i, long j, int i2) {
        this.routeId = i;
        this.time = j;
        this.originType = i2;
    }

    public /* synthetic */ UserRouteListRequestParams(int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i2);
    }
}
