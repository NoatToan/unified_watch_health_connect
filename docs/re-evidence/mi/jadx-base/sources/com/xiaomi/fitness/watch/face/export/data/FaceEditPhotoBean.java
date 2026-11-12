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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 $2\u00020\u0001:\u0001$B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "Landroid/os/Parcelable;", "positionIndex", "", "backgroundImage", "Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "foregroundImage", "<init>", "(ILcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getPositionIndex", "()I", "setPositionIndex", "(I)V", "getBackgroundImage", "()Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;", "getForegroundImage", "setForegroundImage", "(Lcom/xiaomi/fitness/watch/face/export/data/WatchFaceImage;)V", "writeToParcel", "", "flags", "describeContents", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "", "CREATOR", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FaceEditPhotoBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final WatchFaceImage backgroundImage;

    @Nullable
    private WatchFaceImage foregroundImage;
    private int positionIndex;

    /* JADX INFO: renamed from: com.xiaomi.fitness.watch.face.export.data.FaceEditPhotoBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", MediaStoreUtil.MediaInfo.SIZE, "", "(I)[Lcom/xiaomi/fitness/watch/face/export/data/FaceEditPhotoBean;", "watch-face-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<FaceEditPhotoBean> {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceEditPhotoBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FaceEditPhotoBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public FaceEditPhotoBean[] newArray(int size) {
            return new FaceEditPhotoBean[size];
        }
    }

    public FaceEditPhotoBean(int i, @NotNull WatchFaceImage backgroundImage, @Nullable WatchFaceImage watchFaceImage) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.positionIndex = i;
        this.backgroundImage = backgroundImage;
        this.foregroundImage = watchFaceImage;
    }

    public static /* synthetic */ FaceEditPhotoBean copy$default(FaceEditPhotoBean faceEditPhotoBean, int i, WatchFaceImage watchFaceImage, WatchFaceImage watchFaceImage2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = faceEditPhotoBean.positionIndex;
        }
        if ((i2 & 2) != 0) {
            watchFaceImage = faceEditPhotoBean.backgroundImage;
        }
        if ((i2 & 4) != 0) {
            watchFaceImage2 = faceEditPhotoBean.foregroundImage;
        }
        return faceEditPhotoBean.copy(i, watchFaceImage, watchFaceImage2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPositionIndex() {
        return this.positionIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WatchFaceImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WatchFaceImage getForegroundImage() {
        return this.foregroundImage;
    }

    @NotNull
    public final FaceEditPhotoBean copy(int positionIndex, @NotNull WatchFaceImage backgroundImage, @Nullable WatchFaceImage foregroundImage) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        return new FaceEditPhotoBean(positionIndex, backgroundImage, foregroundImage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FaceEditPhotoBean)) {
            return false;
        }
        FaceEditPhotoBean faceEditPhotoBean = (FaceEditPhotoBean) other;
        return this.positionIndex == faceEditPhotoBean.positionIndex && Intrinsics.areEqual(this.backgroundImage, faceEditPhotoBean.backgroundImage) && Intrinsics.areEqual(this.foregroundImage, faceEditPhotoBean.foregroundImage);
    }

    @NotNull
    public final WatchFaceImage getBackgroundImage() {
        return this.backgroundImage;
    }

    @Nullable
    public final WatchFaceImage getForegroundImage() {
        return this.foregroundImage;
    }

    public final int getPositionIndex() {
        return this.positionIndex;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.positionIndex) * 31) + this.backgroundImage.hashCode()) * 31;
        WatchFaceImage watchFaceImage = this.foregroundImage;
        return iHashCode + (watchFaceImage == null ? 0 : watchFaceImage.hashCode());
    }

    public final void setForegroundImage(@Nullable WatchFaceImage watchFaceImage) {
        this.foregroundImage = watchFaceImage;
    }

    public final void setPositionIndex(int i) {
        this.positionIndex = i;
    }

    @NotNull
    public String toString() {
        return "FaceEditPhotoBean(positionIndex=" + this.positionIndex + ", backgroundImage=" + this.backgroundImage + ", foregroundImage=" + this.foregroundImage + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.positionIndex);
        parcel.writeParcelable(this.backgroundImage, flags);
        parcel.writeParcelable(this.foregroundImage, flags);
    }

    public /* synthetic */ FaceEditPhotoBean(int i, WatchFaceImage watchFaceImage, WatchFaceImage watchFaceImage2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, watchFaceImage, (i2 & 4) != 0 ? null : watchFaceImage2);
    }

    public FaceEditPhotoBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        int i = parcel.readInt();
        WatchFaceImage watchFaceImage = (WatchFaceImage) parcel.readParcelable(WatchFaceImage.class.getClassLoader());
        if (watchFaceImage == null) {
            watchFaceImage = new WatchFaceImage("", null, null, null, null, null, null, null, 254, null);
        }
        this(i, watchFaceImage, (WatchFaceImage) parcel.readParcelable(WatchFaceImage.class.getClassLoader()));
    }
}
