package com.huami.heartrate.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/huami/heartrate/model/UserOfHeartRate;", "Landroid/os/Parcelable;", "", "component1", "", "component2", "", "component3", "userId", "registerTime", "userAge", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "b", "J", "getRegisterTime", "()J", "c", LogUtil.I, "getUserAge", "()I", "<init>", "(Ljava/lang/String;JI)V", "heartrate-service_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class UserOfHeartRate implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserOfHeartRate> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long registerTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int userAge;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<UserOfHeartRate> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserOfHeartRate createFromParcel(@NotNull Parcel parcel) {
            return new UserOfHeartRate(parcel.readString(), parcel.readLong(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final UserOfHeartRate[] newArray(int i) {
            return new UserOfHeartRate[i];
        }
    }

    public UserOfHeartRate(@NotNull String str, long j, int i) {
        this.userId = str;
        this.registerTime = j;
        this.userAge = i;
    }

    public static /* synthetic */ UserOfHeartRate copy$default(UserOfHeartRate userOfHeartRate, String str, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userOfHeartRate.userId;
        }
        if ((i2 & 2) != 0) {
            j = userOfHeartRate.registerTime;
        }
        if ((i2 & 4) != 0) {
            i = userOfHeartRate.userAge;
        }
        return userOfHeartRate.copy(str, j, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getRegisterTime() {
        return this.registerTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getUserAge() {
        return this.userAge;
    }

    @NotNull
    public final UserOfHeartRate copy(@NotNull String userId, long registerTime, int userAge) {
        return new UserOfHeartRate(userId, registerTime, userAge);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserOfHeartRate)) {
            return false;
        }
        UserOfHeartRate userOfHeartRate = (UserOfHeartRate) other;
        return Intrinsics.areEqual(this.userId, userOfHeartRate.userId) && this.registerTime == userOfHeartRate.registerTime && this.userAge == userOfHeartRate.userAge;
    }

    public final long getRegisterTime() {
        return this.registerTime;
    }

    public final int getUserAge() {
        return this.userAge;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + b.a(this.registerTime)) * 31) + this.userAge;
    }

    @NotNull
    public String toString() {
        return "UserOfHeartRate(userId=" + this.userId + ", registerTime=" + this.registerTime + ", userAge=" + this.userAge + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.userId);
        parcel.writeLong(this.registerTime);
        parcel.writeInt(this.userAge);
    }
}
