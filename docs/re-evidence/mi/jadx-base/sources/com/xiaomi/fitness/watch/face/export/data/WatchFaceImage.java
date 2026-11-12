package com.xiaomi.fitness.watch.face.export.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 82\u00020\u0001:\u00018Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\f\u0010\u0010J\u0018\u0010#\u001a\u00020$2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020&H\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jl\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105HÖ\u0003J\t\u00106\u001a\u00020&HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0012\"\u0004\b\"\u0010\u0014¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "Landroid/os/Parcelable;", "md5", "", "cropPath", "cropBinPath", "originImagePath", "originImageMd5", "thumbnailPath", "duration", "", "thumbnailCropPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getMd5", "()Ljava/lang/String;", "setMd5", "(Ljava/lang/String;)V", "getCropPath", "setCropPath", "getCropBinPath", "setCropBinPath", "getOriginImagePath", "setOriginImagePath", "getOriginImageMd5", "setOriginImageMd5", "getThumbnailPath", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getThumbnailCropPath", "setThumbnailCropPath", "writeToParcel", "", "flags", "", "describeContents", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "equals", "", "other", "", "hashCode", "toString", "CREATOR", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WatchFaceImage implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private String cropBinPath;

    @Nullable
    private String cropPath;

    @Nullable
    private final Long duration;

    @NotNull
    private String md5;

    @Nullable
    private String originImageMd5;

    @Nullable
    private String originImagePath;

    @Nullable
    private String thumbnailCropPath;

    @Nullable
    private final String thumbnailPath;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.data.WatchFaceImage$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<WatchFaceImage> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WatchFaceImage createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WatchFaceImage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public WatchFaceImage[] newArray(int size) {
            return new WatchFaceImage[size];
        }
    }

    public WatchFaceImage(@NotNull String md5, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Long l, @Nullable String str6) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        this.md5 = md5;
        this.cropPath = str;
        this.cropBinPath = str2;
        this.originImagePath = str3;
        this.originImageMd5 = str4;
        this.thumbnailPath = str5;
        this.duration = l;
        this.thumbnailCropPath = str6;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCropPath() {
        return this.cropPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCropBinPath() {
        return this.cropBinPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOriginImagePath() {
        return this.originImagePath;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getOriginImageMd5() {
        return this.originImageMd5;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Long getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getThumbnailCropPath() {
        return this.thumbnailCropPath;
    }

    @NotNull
    public final WatchFaceImage copy(@NotNull String md5, @Nullable String cropPath, @Nullable String cropBinPath, @Nullable String originImagePath, @Nullable String originImageMd5, @Nullable String thumbnailPath, @Nullable Long duration, @Nullable String thumbnailCropPath) {
        Intrinsics.checkNotNullParameter(md5, "md5");
        return new WatchFaceImage(md5, cropPath, cropBinPath, originImagePath, originImageMd5, thumbnailPath, duration, thumbnailCropPath);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchFaceImage)) {
            return false;
        }
        WatchFaceImage watchFaceImage = (WatchFaceImage) other;
        return Intrinsics.areEqual(this.md5, watchFaceImage.md5) && Intrinsics.areEqual(this.cropPath, watchFaceImage.cropPath) && Intrinsics.areEqual(this.cropBinPath, watchFaceImage.cropBinPath) && Intrinsics.areEqual(this.originImagePath, watchFaceImage.originImagePath) && Intrinsics.areEqual(this.originImageMd5, watchFaceImage.originImageMd5) && Intrinsics.areEqual(this.thumbnailPath, watchFaceImage.thumbnailPath) && Intrinsics.areEqual(this.duration, watchFaceImage.duration) && Intrinsics.areEqual(this.thumbnailCropPath, watchFaceImage.thumbnailCropPath);
    }

    @Nullable
    public final String getCropBinPath() {
        return this.cropBinPath;
    }

    @Nullable
    public final String getCropPath() {
        return this.cropPath;
    }

    @Nullable
    public final Long getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getMd5() {
        return this.md5;
    }

    @Nullable
    public final String getOriginImageMd5() {
        return this.originImageMd5;
    }

    @Nullable
    public final String getOriginImagePath() {
        return this.originImagePath;
    }

    @Nullable
    public final String getThumbnailCropPath() {
        return this.thumbnailCropPath;
    }

    @Nullable
    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public int hashCode() {
        int iHashCode = this.md5.hashCode() * 31;
        String str = this.cropPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cropBinPath;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.originImagePath;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.originImageMd5;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.thumbnailPath;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.duration;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        String str6 = this.thumbnailCropPath;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setCropBinPath(@Nullable String str) {
        this.cropBinPath = str;
    }

    public final void setCropPath(@Nullable String str) {
        this.cropPath = str;
    }

    public final void setMd5(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.md5 = str;
    }

    public final void setOriginImageMd5(@Nullable String str) {
        this.originImageMd5 = str;
    }

    public final void setOriginImagePath(@Nullable String str) {
        this.originImagePath = str;
    }

    public final void setThumbnailCropPath(@Nullable String str) {
        this.thumbnailCropPath = str;
    }

    @NotNull
    public String toString() {
        return "WatchFaceImage(md5=" + this.md5 + ", cropPath=" + this.cropPath + ", cropBinPath=" + this.cropBinPath + ", originImagePath=" + this.originImagePath + ", originImageMd5=" + this.originImageMd5 + ", thumbnailPath=" + this.thumbnailPath + ", duration=" + this.duration + ", thumbnailCropPath=" + this.thumbnailCropPath + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.md5);
        parcel.writeString(this.cropPath);
        parcel.writeString(this.cropBinPath);
        parcel.writeString(this.originImagePath);
        parcel.writeString(this.originImageMd5);
        parcel.writeString(this.thumbnailPath);
        Long l = this.duration;
        parcel.writeLong(l != null ? l.longValue() : 0L);
        parcel.writeString(this.thumbnailCropPath);
    }

    public /* synthetic */ WatchFaceImage(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? 0L : l, (i & 128) == 0 ? str7 : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WatchFaceImage(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        this(string == null ? "" : string, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Long.valueOf(parcel.readLong()), parcel.readString());
    }
}
