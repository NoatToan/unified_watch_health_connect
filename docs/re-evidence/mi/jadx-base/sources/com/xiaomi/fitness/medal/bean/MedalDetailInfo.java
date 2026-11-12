package com.xiaomi.fitness.medal.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0014HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/medal/bean/MedalDetailInfo;", "Landroid/os/Parcelable;", "medalId", "", "medalType", "", "<init>", "(JLjava/lang/String;)V", "getMedalId", "()J", "setMedalId", "(J)V", "getMedalType", "()Ljava/lang/String;", "setMedalType", "(Ljava/lang/String;)V", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "medal_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedalDetailInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MedalDetailInfo> CREATOR = new Creator();

    @SerializedName("medalId")
    private long medalId;

    @SerializedName("medalType")
    @NotNull
    private String medalType;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MedalDetailInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MedalDetailInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MedalDetailInfo(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MedalDetailInfo[] newArray(int i) {
            return new MedalDetailInfo[i];
        }
    }

    public MedalDetailInfo(long j, @NotNull String medalType) {
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        this.medalId = j;
        this.medalType = medalType;
    }

    public static /* synthetic */ MedalDetailInfo copy$default(MedalDetailInfo medalDetailInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = medalDetailInfo.medalId;
        }
        if ((i & 2) != 0) {
            str = medalDetailInfo.medalType;
        }
        return medalDetailInfo.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMedalId() {
        return this.medalId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMedalType() {
        return this.medalType;
    }

    @NotNull
    public final MedalDetailInfo copy(long medalId, @NotNull String medalType) {
        Intrinsics.checkNotNullParameter(medalType, "medalType");
        return new MedalDetailInfo(medalId, medalType);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalDetailInfo)) {
            return false;
        }
        MedalDetailInfo medalDetailInfo = (MedalDetailInfo) other;
        return this.medalId == medalDetailInfo.medalId && Intrinsics.areEqual(this.medalType, medalDetailInfo.medalType);
    }

    public final long getMedalId() {
        return this.medalId;
    }

    @NotNull
    public final String getMedalType() {
        return this.medalType;
    }

    public int hashCode() {
        return (Long.hashCode(this.medalId) * 31) + this.medalType.hashCode();
    }

    public final void setMedalId(long j) {
        this.medalId = j;
    }

    public final void setMedalType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.medalType = str;
    }

    @NotNull
    public String toString() {
        return "MedalDetailInfo(medalId=" + this.medalId + ", medalType=" + this.medalType + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.medalId);
        dest.writeString(this.medalType);
    }
}
