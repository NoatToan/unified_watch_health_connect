package com.huami.nfc.ble;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Parcelize
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003JA\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\t\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001c\u0010\u000b\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001eR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/huami/nfc/ble/AppletEntity;", "Landroid/os/Parcelable;", "", "component1", "component2", "", "component3", "component4", "component5", "aid", "imageUrl", "type", "appCode", "name", "copy", "toString", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", DataCacher.j, "", "writeToParcel", "a", "Ljava/lang/String;", "getAid", "()Ljava/lang/String;", "b", "getImageUrl", "c", LogUtil.I, "getType", "()I", GoogleApiAvailabilityLight.a, "getAppCode", "e", "getName", "setName", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "nfc-ble_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppletEntity implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AppletEntity> CREATOR = new Creator();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("id")
    @NotNull
    private final String aid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("imageUrl")
    @Nullable
    private final String imageUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("type")
    private final int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("appCode")
    @Nullable
    private final String appCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("name")
    @Nullable
    private String name;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class Creator implements Parcelable.Creator<AppletEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AppletEntity createFromParcel(@NotNull Parcel parcel) {
            return new AppletEntity(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final AppletEntity[] newArray(int i) {
            return new AppletEntity[i];
        }
    }

    public AppletEntity(@NotNull String str, @Nullable String str2, int i, @Nullable String str3, @Nullable String str4) {
        this.aid = str;
        this.imageUrl = str2;
        this.type = i;
        this.appCode = str3;
        this.name = str4;
    }

    public static /* synthetic */ AppletEntity copy$default(AppletEntity appletEntity, String str, String str2, int i, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = appletEntity.aid;
        }
        if ((i2 & 2) != 0) {
            str2 = appletEntity.imageUrl;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = appletEntity.type;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = appletEntity.appCode;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            str4 = appletEntity.name;
        }
        return appletEntity.copy(str, str5, i3, str6, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final AppletEntity copy(@NotNull String aid, @Nullable String imageUrl, int type, @Nullable String appCode, @Nullable String name) {
        return new AppletEntity(aid, imageUrl, type, appCode, name);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppletEntity)) {
            return false;
        }
        AppletEntity appletEntity = (AppletEntity) other;
        return Intrinsics.areEqual(this.aid, appletEntity.aid) && Intrinsics.areEqual(this.imageUrl, appletEntity.imageUrl) && this.type == appletEntity.type && Intrinsics.areEqual(this.appCode, appletEntity.appCode) && Intrinsics.areEqual(this.name, appletEntity.name);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @Nullable
    public final String getAppCode() {
        return this.appCode;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.aid.hashCode() * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type) * 31;
        String str2 = this.appCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @NotNull
    public String toString() {
        return "AppletEntity(aid=" + this.aid + ", imageUrl=" + ((Object) this.imageUrl) + ", type=" + this.type + ", appCode=" + ((Object) this.appCode) + ", name=" + ((Object) this.name) + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        parcel.writeString(this.aid);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.type);
        parcel.writeString(this.appCode);
        parcel.writeString(this.name);
    }

    public /* synthetic */ AppletEntity(String str, String str2, int i, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4);
    }
}
