package com.huami.heartrate.repository.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.mifit.sportlib.common.Constants;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(primaryKeys = {"time"}, tableName = "HEART_RATE")
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002Ba\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0015\u001a\u00020\n\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\bC\u0010DJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\u0007J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jz\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0015\u001a\u00020\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u001d\u001a\u00020\u000fHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\u0019\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004HÖ\u0001R$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010,R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0007R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010)\u001a\u0004\b0\u0010\u0007R\u0019\u0010\u0015\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010)\u001a\u0004\b6\u0010\u0007R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010\u0007R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010)\u001a\u0004\b:\u0010\u0007R\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R$\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010<\u001a\u0004\b@\u0010>\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "", "Landroid/os/Parcelable;", "other", "", "compareTo", "component1", "()Ljava/lang/Integer;", "component2", "component3", "", "component4", "component5", "component6", "component7", "", "component8", "component9", "type", "deviceType", "deviceSource", "time", Constants.DATA_KEY_HR, "state", "timeZone", "deviceId", "userId", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/huami/heartrate/repository/entity/HeartRateEntity;", "toString", "hashCode", "", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/Integer;", "getType", "setType", "(Ljava/lang/Integer;)V", "b", "getDeviceType", "c", "getDeviceSource", GoogleApiAvailabilityLight.a, "J", "getTime", "()J", "e", "getHr", "f", "getState", "g", "getTimeZone", "h", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "i", "getUserId", "setUserId", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "heartrate_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartRateEntity implements Comparable<HeartRateEntity>, Parcelable {

    @NotNull
    public static final Parcelable.Creator<HeartRateEntity> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Integer type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer deviceType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer deviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer hr;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer state;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer timeZone;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final String deviceId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private String userId;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<HeartRateEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeartRateEntity createFromParcel(@NotNull Parcel parcel) {
            return new HeartRateEntity(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readLong(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final HeartRateEntity[] newArray(int i) {
            return new HeartRateEntity[i];
        }
    }

    public HeartRateEntity(@Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, long j, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str, @Nullable String str2) {
        this.type = num;
        this.deviceType = num2;
        this.deviceSource = num3;
        this.time = j;
        this.hr = num4;
        this.state = num5;
        this.timeZone = num6;
        this.deviceId = str;
        this.userId = str2;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getHr() {
        return this.hr;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final HeartRateEntity copy(@Nullable Integer type, @Nullable Integer deviceType, @Nullable Integer deviceSource, long time, @Nullable Integer hr, @Nullable Integer state, @Nullable Integer timeZone, @Nullable String deviceId, @Nullable String userId) {
        return new HeartRateEntity(type, deviceType, deviceSource, time, hr, state, timeZone, deviceId, userId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateEntity)) {
            return false;
        }
        HeartRateEntity heartRateEntity = (HeartRateEntity) other;
        return Intrinsics.areEqual(this.type, heartRateEntity.type) && Intrinsics.areEqual(this.deviceType, heartRateEntity.deviceType) && Intrinsics.areEqual(this.deviceSource, heartRateEntity.deviceSource) && this.time == heartRateEntity.time && Intrinsics.areEqual(this.hr, heartRateEntity.hr) && Intrinsics.areEqual(this.state, heartRateEntity.state) && Intrinsics.areEqual(this.timeZone, heartRateEntity.timeZone) && Intrinsics.areEqual(this.deviceId, heartRateEntity.deviceId) && Intrinsics.areEqual(this.userId, heartRateEntity.userId);
    }

    @Nullable
    public final String getDeviceId() {
        return this.deviceId;
    }

    @Nullable
    public final Integer getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final Integer getDeviceType() {
        return this.deviceType;
    }

    @Nullable
    public final Integer getHr() {
        return this.hr;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    public final long getTime() {
        return this.time;
    }

    @Nullable
    public final Integer getTimeZone() {
        return this.timeZone;
    }

    @Nullable
    public final Integer getType() {
        return this.type;
    }

    @Nullable
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        Integer num = this.type;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.deviceType;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.deviceSource;
        int iHashCode3 = (((iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31) + b.a(this.time)) * 31;
        Integer num4 = this.hr;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.state;
        int iHashCode5 = (iHashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.timeZone;
        int iHashCode6 = (iHashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.deviceId;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.userId;
        return iHashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setType(@Nullable Integer num) {
        this.type = num;
    }

    public final void setUserId(@Nullable String str) {
        this.userId = str;
    }

    @NotNull
    public String toString() {
        return "HeartRateEntity(type=" + this.type + ", deviceType=" + this.deviceType + ", deviceSource=" + this.deviceSource + ", time=" + this.time + ", hr=" + this.hr + ", state=" + this.state + ", timeZone=" + this.timeZone + ", deviceId=" + this.deviceId + ", userId=" + this.userId + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Integer num = this.type;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.deviceType;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.deviceSource;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        parcel.writeLong(this.time);
        Integer num4 = this.hr;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        Integer num5 = this.state;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num5.intValue());
        }
        Integer num6 = this.timeZone;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num6.intValue());
        }
        parcel.writeString(this.deviceId);
        parcel.writeString(this.userId);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull HeartRateEntity other) {
        return this.time > other.time ? -1 : 1;
    }

    public /* synthetic */ HeartRateEntity(Integer num, Integer num2, Integer num3, long j, Integer num4, Integer num5, Integer num6, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, num2, num3, j, num4, num5, num6, str, (i & 256) != 0 ? null : str2);
    }
}
