package com.huami.watchfacesstore.bean;

import com.google.gson.annotations.SerializedName;
import com.huami.ad.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003JE\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/huami/watchfacesstore/bean/Metas;", "", "", "component1", "component2", "component3", "component4", "component5", Constants.GIF_PATH, "minimumFirmwareVersion", "transparentBackground", "deviceImage", "previewImage", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getGif", "()Ljava/lang/String;", "getMinimumFirmwareVersion", "getTransparentBackground", "getDeviceImage", "getPreviewImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Metas {

    @SerializedName("device_image")
    @Nullable
    private final String deviceImage;

    @Nullable
    private final String gif;

    @SerializedName("minimum_firmware_version")
    @Nullable
    private final String minimumFirmwareVersion;

    @SerializedName("preview_image")
    @Nullable
    private final String previewImage;

    @SerializedName("transparent_background")
    @Nullable
    private final String transparentBackground;

    public Metas() {
        this(null, null, null, null, null, 31, null);
    }

    public Metas(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.gif = str;
        this.minimumFirmwareVersion = str2;
        this.transparentBackground = str3;
        this.deviceImage = str4;
        this.previewImage = str5;
    }

    public static /* synthetic */ Metas copy$default(Metas metas, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = metas.gif;
        }
        if ((i & 2) != 0) {
            str2 = metas.minimumFirmwareVersion;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = metas.transparentBackground;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = metas.deviceImage;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = metas.previewImage;
        }
        return metas.copy(str, str6, str7, str8, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTransparentBackground() {
        return this.transparentBackground;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceImage() {
        return this.deviceImage;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPreviewImage() {
        return this.previewImage;
    }

    @NotNull
    public final Metas copy(@Nullable String gif, @Nullable String minimumFirmwareVersion, @Nullable String transparentBackground, @Nullable String deviceImage, @Nullable String previewImage) {
        return new Metas(gif, minimumFirmwareVersion, transparentBackground, deviceImage, previewImage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Metas)) {
            return false;
        }
        Metas metas = (Metas) other;
        return Intrinsics.areEqual(this.gif, metas.gif) && Intrinsics.areEqual(this.minimumFirmwareVersion, metas.minimumFirmwareVersion) && Intrinsics.areEqual(this.transparentBackground, metas.transparentBackground) && Intrinsics.areEqual(this.deviceImage, metas.deviceImage) && Intrinsics.areEqual(this.previewImage, metas.previewImage);
    }

    @Nullable
    public final String getDeviceImage() {
        return this.deviceImage;
    }

    @Nullable
    public final String getGif() {
        return this.gif;
    }

    @Nullable
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    @Nullable
    public final String getPreviewImage() {
        return this.previewImage;
    }

    @Nullable
    public final String getTransparentBackground() {
        return this.transparentBackground;
    }

    public int hashCode() {
        String str = this.gif;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.minimumFirmwareVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.transparentBackground;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.deviceImage;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.previewImage;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Metas(gif=" + this.gif + ", minimumFirmwareVersion=" + this.minimumFirmwareVersion + ", transparentBackground=" + this.transparentBackground + ", deviceImage=" + this.deviceImage + ", previewImage=" + this.previewImage + ")";
    }

    public /* synthetic */ Metas(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
