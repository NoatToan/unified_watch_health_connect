package com.xiaomi.fitness.watch.face.db;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Entity(tableName = "photo_bean")
@Parcelize
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\"\u0010\u0017\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u0019J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0011HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0016\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0011R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006,"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/PhotoBean;", "Landroid/os/Parcelable;", "cropPath", "", "oriPath", "nodeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCropPath", "()Ljava/lang/String;", "setCropPath", "(Ljava/lang/String;)V", "getOriPath", "setOriPath", "getNodeId", "setNodeId", "type", "", "getType", "()I", "setType", "(I)V", "describeContents", "instance", "isChanged", "", "isAdd", "isUpdate", "isDelete", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PhotoBean implements Parcelable {

    @PrimaryKey
    @NotNull
    private String cropPath;

    @Nullable
    private String nodeId;

    @Nullable
    private String oriPath;
    private int type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<PhotoBean> CREATOR = new Creator();
    private static final int TYPE_ADD = 11;
    private static final int TYPE_UPDATE = 44;
    private static final int TYPE_DELETE = 22;
    private static final int TYPE_EXIST = 33;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/watch/face/db/PhotoBean$Companion;", "", "<init>", "()V", "TYPE_ADD", "", "getTYPE_ADD", "()I", "TYPE_UPDATE", "getTYPE_UPDATE", "TYPE_DELETE", "getTYPE_DELETE", "TYPE_EXIST", "getTYPE_EXIST", "watch-face_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getTYPE_ADD() {
            return PhotoBean.TYPE_ADD;
        }

        public final int getTYPE_DELETE() {
            return PhotoBean.TYPE_DELETE;
        }

        public final int getTYPE_EXIST() {
            return PhotoBean.TYPE_EXIST;
        }

        public final int getTYPE_UPDATE() {
            return PhotoBean.TYPE_UPDATE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PhotoBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PhotoBean(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhotoBean[] newArray(int i) {
            return new PhotoBean[i];
        }
    }

    public PhotoBean(@NotNull String cropPath, @Nullable String str, @Nullable String str2) {
        Intrinsics.checkNotNullParameter(cropPath, "cropPath");
        this.cropPath = cropPath;
        this.oriPath = str;
        this.nodeId = str2;
        this.type = 33;
    }

    public static /* synthetic */ PhotoBean copy$default(PhotoBean photoBean, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = photoBean.cropPath;
        }
        if ((i & 2) != 0) {
            str2 = photoBean.oriPath;
        }
        if ((i & 4) != 0) {
            str3 = photoBean.nodeId;
        }
        return photoBean.copy(str, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCropPath() {
        return this.cropPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOriPath() {
        return this.oriPath;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNodeId() {
        return this.nodeId;
    }

    @NotNull
    public final PhotoBean copy(@NotNull String cropPath, @Nullable String oriPath, @Nullable String nodeId) {
        Intrinsics.checkNotNullParameter(cropPath, "cropPath");
        return new PhotoBean(cropPath, oriPath, nodeId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhotoBean)) {
            return false;
        }
        PhotoBean photoBean = (PhotoBean) other;
        return Intrinsics.areEqual(this.cropPath, photoBean.cropPath) && Intrinsics.areEqual(this.oriPath, photoBean.oriPath) && Intrinsics.areEqual(this.nodeId, photoBean.nodeId);
    }

    @NotNull
    public final String getCropPath() {
        return this.cropPath;
    }

    @Nullable
    public final String getNodeId() {
        return this.nodeId;
    }

    @Nullable
    public final String getOriPath() {
        return this.oriPath;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.cropPath.hashCode() * 31;
        String str = this.oriPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nodeId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final PhotoBean instance(@Nullable String nodeId, @NotNull String cropPath, @Nullable String oriPath) {
        Intrinsics.checkNotNullParameter(cropPath, "cropPath");
        return new PhotoBean(cropPath, oriPath, nodeId);
    }

    public final boolean isAdd() {
        return this.type == TYPE_ADD;
    }

    public final boolean isChanged() {
        int i = this.type;
        return (i == 0 || i == TYPE_EXIST) ? false : true;
    }

    public final boolean isDelete() {
        return this.type == TYPE_DELETE;
    }

    public final boolean isUpdate() {
        return this.type == TYPE_UPDATE;
    }

    public final void setCropPath(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cropPath = str;
    }

    public final void setNodeId(@Nullable String str) {
        this.nodeId = str;
    }

    public final void setOriPath(@Nullable String str) {
        this.oriPath = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "PhotoBean(cropPath=" + this.cropPath + ", oriPath=" + this.oriPath + ", nodeId=" + this.nodeId + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.cropPath);
        dest.writeString(this.oriPath);
        dest.writeString(this.nodeId);
    }

    public /* synthetic */ PhotoBean(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, str2, str3);
    }
}
