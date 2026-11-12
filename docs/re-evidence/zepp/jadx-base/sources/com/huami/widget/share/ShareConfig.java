package com.huami.widget.share;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u001b\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\rR\u0016\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\rR\u001c\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b\u0018\u0010\r\u0012\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/huami/widget/share/ShareConfig;", "Landroid/os/Parcelable;", "", "toString", "", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "", "isOnlyImage", "Z", "qqZoneShareType", LogUtil.I, "shareItemType", "", "shareItems", "[I", "title", "Ljava/lang/String;", "hasShare", "isBlocked", "isFaceBookForbidden", "isFaceBookForbidden$annotations", "()V", "<init>", "Companion", "share_release"}, k = 1, mv = {1, 5, 1})
public final class ShareConfig implements Parcelable {
    public static final int QZONE_SHARE_AS_IMAGE = 19;
    public static final int QZONE_SHARE_AS_LINK = 18;

    @JvmField
    public boolean isBlocked;

    @JvmField
    public boolean isFaceBookForbidden;

    @JvmField
    public boolean isOnlyImage;

    @JvmField
    public int qqZoneShareType;

    @JvmField
    @Nullable
    public String title;

    @NotNull
    public static final Parcelable.Creator<ShareConfig> CREATOR = new Creator();

    @JvmField
    public int shareItemType = 2;

    @JvmField
    @NotNull
    public int[] shareItems = new int[0];

    @JvmField
    public boolean hasShare = true;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<ShareConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShareConfig createFromParcel(@NotNull Parcel parcel) {
            parcel.readInt();
            return new ShareConfig();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final ShareConfig[] newArray(int i) {
            return new ShareConfig[i];
        }
    }

    @Deprecated(message = "通过addDisplayConditions 设定")
    public static /* synthetic */ void isFaceBookForbidden$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public String toString() {
        return "{ isOnlyImage : " + this.isOnlyImage + ", qqZoneShareType : " + this.qqZoneShareType + ", title : " + this.title + ", hasShare : " + this.hasShare + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeInt(1);
    }
}
