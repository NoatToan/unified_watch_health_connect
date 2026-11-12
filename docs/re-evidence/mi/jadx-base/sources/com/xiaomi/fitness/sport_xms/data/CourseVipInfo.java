package com.xiaomi.fitness.sport_xms.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.modules.appstate.AppStateModule;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/CourseVipInfo;", "Landroid/os/Parcelable;", AppStateModule.APP_STATE_ACTIVE, "", "expired_at", "", "<init>", "(ILjava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getActive", "()I", "getExpired_at", "()Ljava/lang/String;", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CourseVipInfo implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int active;

    @Nullable
    private final String expired_at;

    /* JADX INFO: renamed from: com.xiaomi.fitness.sport_xms.data.CourseVipInfo$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport_xms/data/CourseVipInfo$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/sport_xms/data/CourseVipInfo;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/sport_xms/data/CourseVipInfo;", "sport-xms_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<CourseVipInfo> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CourseVipInfo createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CourseVipInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CourseVipInfo[] newArray(int size) {
            return new CourseVipInfo[size];
        }
    }

    public CourseVipInfo(int i, @Nullable String str) {
        this.active = i;
        this.expired_at = str;
    }

    public static /* synthetic */ CourseVipInfo copy$default(CourseVipInfo courseVipInfo, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = courseVipInfo.active;
        }
        if ((i2 & 2) != 0) {
            str = courseVipInfo.expired_at;
        }
        return courseVipInfo.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActive() {
        return this.active;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExpired_at() {
        return this.expired_at;
    }

    @NotNull
    public final CourseVipInfo copy(int active, @Nullable String expired_at) {
        return new CourseVipInfo(active, expired_at);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CourseVipInfo)) {
            return false;
        }
        CourseVipInfo courseVipInfo = (CourseVipInfo) other;
        return this.active == courseVipInfo.active && Intrinsics.areEqual(this.expired_at, courseVipInfo.expired_at);
    }

    public final int getActive() {
        return this.active;
    }

    @Nullable
    public final String getExpired_at() {
        return this.expired_at;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.active) * 31;
        String str = this.expired_at;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "CourseVipInfo(active=" + this.active + ", expired_at=" + this.expired_at + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.active);
        parcel.writeString(this.expired_at);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CourseVipInfo(@NotNull Parcel parcel) {
        this(parcel.readInt(), parcel.readString());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
