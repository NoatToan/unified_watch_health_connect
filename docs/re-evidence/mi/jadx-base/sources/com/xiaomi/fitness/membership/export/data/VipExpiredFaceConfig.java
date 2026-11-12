package com.xiaomi.fitness.membership.export.data;

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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0003J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/fitness/membership/export/data/VipExpiredFaceConfig;", "Landroid/os/Parcelable;", "shape", "", "albumRepeatDownload", "", "<init>", "(IZ)V", "getShape", "()I", "getAlbumRepeatDownload", "()Z", "component1", "component2", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "membership-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VipExpiredFaceConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VipExpiredFaceConfig> CREATOR = new Creator();

    @SerializedName("album_repeat_download")
    private final boolean albumRepeatDownload;
    private final int shape;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VipExpiredFaceConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExpiredFaceConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VipExpiredFaceConfig(parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VipExpiredFaceConfig[] newArray(int i) {
            return new VipExpiredFaceConfig[i];
        }
    }

    public VipExpiredFaceConfig(int i, boolean z) {
        this.shape = i;
        this.albumRepeatDownload = z;
    }

    public static /* synthetic */ VipExpiredFaceConfig copy$default(VipExpiredFaceConfig vipExpiredFaceConfig, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = vipExpiredFaceConfig.shape;
        }
        if ((i2 & 2) != 0) {
            z = vipExpiredFaceConfig.albumRepeatDownload;
        }
        return vipExpiredFaceConfig.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAlbumRepeatDownload() {
        return this.albumRepeatDownload;
    }

    @NotNull
    public final VipExpiredFaceConfig copy(int shape, boolean albumRepeatDownload) {
        return new VipExpiredFaceConfig(shape, albumRepeatDownload);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipExpiredFaceConfig)) {
            return false;
        }
        VipExpiredFaceConfig vipExpiredFaceConfig = (VipExpiredFaceConfig) other;
        return this.shape == vipExpiredFaceConfig.shape && this.albumRepeatDownload == vipExpiredFaceConfig.albumRepeatDownload;
    }

    public final boolean getAlbumRepeatDownload() {
        return this.albumRepeatDownload;
    }

    public final int getShape() {
        return this.shape;
    }

    public int hashCode() {
        return (Integer.hashCode(this.shape) * 31) + Boolean.hashCode(this.albumRepeatDownload);
    }

    @NotNull
    public String toString() {
        return "VipExpiredFaceConfig(shape=" + this.shape + ", albumRepeatDownload=" + this.albumRepeatDownload + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.shape);
        dest.writeInt(this.albumRepeatDownload ? 1 : 0);
    }
}
