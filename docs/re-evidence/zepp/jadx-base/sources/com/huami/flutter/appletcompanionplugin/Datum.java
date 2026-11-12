package com.huami.flutter.appletcompanionplugin;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\u0083\u0001\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u001d\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001f\u001a\u00020\u001eHÖ\u0001J\u0013\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0011\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b)\u0010(R\u001c\u0010\u0013\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b*\u0010(R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b+\u0010(R\u001c\u0010\u0015\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010&\u001a\u0004\b,\u0010(R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010&\u001a\u0004\b-\u0010(R\u001c\u0010\u0017\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b.\u0010(R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010#\u001a\u0004\b/\u0010%R\u001c\u0010\u0019\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010#\u001a\u0004\b0\u0010%R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010&\u001a\u0004\b1\u0010(R\u0019\u0010\u001b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b2\u0010(¨\u00065"}, d2 = {"Lcom/huami/flutter/appletcompanionplugin/Datum;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "appid", "name", "image", "briefDescription", "version", "deviceSupportVersion", "md5", "downloadURL", "size", "fwSize", "minimumFirmwareVersion", "config", "copy", "toString", "", "hashCode", "other", "", "equals", "F", "getAppid", "()F", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "getImage", "getBriefDescription", "getVersion", "getDeviceSupportVersion", "getMd5", "getDownloadURL", "getSize", "getFwSize", "getMinimumFirmwareVersion", "getConfig", "<init>", "(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;Ljava/lang/String;)V", "applet_companion_plugin_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Datum {
    private final float appid;

    @SerializedName("brief_description")
    @NotNull
    private final String briefDescription;

    @NotNull
    private final String config;

    @SerializedName("device_support_version")
    @NotNull
    private final String deviceSupportVersion;

    @SerializedName("download_url")
    @NotNull
    private final String downloadURL;

    @SerializedName("fw_size")
    private final float fwSize;

    @NotNull
    private final String image;

    @Nullable
    private final String md5;

    @SerializedName("minimum_firmware_version")
    @NotNull
    private final String minimumFirmwareVersion;

    @NotNull
    private final String name;
    private final float size;

    @NotNull
    private final String version;

    public Datum(float f, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6, @NotNull String str7, float f2, float f3, @NotNull String str8, @NotNull String str9) {
        this.appid = f;
        this.name = str;
        this.image = str2;
        this.briefDescription = str3;
        this.version = str4;
        this.deviceSupportVersion = str5;
        this.md5 = str6;
        this.downloadURL = str7;
        this.size = f2;
        this.fwSize = f3;
        this.minimumFirmwareVersion = str8;
        this.config = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getAppid() {
        return this.appid;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final float getFwSize() {
        return this.fwSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getConfig() {
        return this.config;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBriefDescription() {
        return this.briefDescription;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceSupportVersion() {
        return this.deviceSupportVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDownloadURL() {
        return this.downloadURL;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    @NotNull
    public final Datum copy(float appid, @NotNull String name, @NotNull String image, @NotNull String briefDescription, @NotNull String version, @NotNull String deviceSupportVersion, @Nullable String md5, @NotNull String downloadURL, float size, float fwSize, @NotNull String minimumFirmwareVersion, @NotNull String config) {
        return new Datum(appid, name, image, briefDescription, version, deviceSupportVersion, md5, downloadURL, size, fwSize, minimumFirmwareVersion, config);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Datum)) {
            return false;
        }
        Datum datum = (Datum) other;
        return Intrinsics.areEqual((Object) Float.valueOf(this.appid), (Object) Float.valueOf(datum.appid)) && Intrinsics.areEqual(this.name, datum.name) && Intrinsics.areEqual(this.image, datum.image) && Intrinsics.areEqual(this.briefDescription, datum.briefDescription) && Intrinsics.areEqual(this.version, datum.version) && Intrinsics.areEqual(this.deviceSupportVersion, datum.deviceSupportVersion) && Intrinsics.areEqual(this.md5, datum.md5) && Intrinsics.areEqual(this.downloadURL, datum.downloadURL) && Intrinsics.areEqual((Object) Float.valueOf(this.size), (Object) Float.valueOf(datum.size)) && Intrinsics.areEqual((Object) Float.valueOf(this.fwSize), (Object) Float.valueOf(datum.fwSize)) && Intrinsics.areEqual(this.minimumFirmwareVersion, datum.minimumFirmwareVersion) && Intrinsics.areEqual(this.config, datum.config);
    }

    public final float getAppid() {
        return this.appid;
    }

    @NotNull
    public final String getBriefDescription() {
        return this.briefDescription;
    }

    @NotNull
    public final String getConfig() {
        return this.config;
    }

    @NotNull
    public final String getDeviceSupportVersion() {
        return this.deviceSupportVersion;
    }

    @NotNull
    public final String getDownloadURL() {
        return this.downloadURL;
    }

    public final float getFwSize() {
        return this.fwSize;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getMd5() {
        return this.md5;
    }

    @NotNull
    public final String getMinimumFirmwareVersion() {
        return this.minimumFirmwareVersion;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getSize() {
        return this.size;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iFloatToIntBits = ((((((((((Float.floatToIntBits(this.appid) * 31) + this.name.hashCode()) * 31) + this.image.hashCode()) * 31) + this.briefDescription.hashCode()) * 31) + this.version.hashCode()) * 31) + this.deviceSupportVersion.hashCode()) * 31;
        String str = this.md5;
        return ((((((((((iFloatToIntBits + (str == null ? 0 : str.hashCode())) * 31) + this.downloadURL.hashCode()) * 31) + Float.floatToIntBits(this.size)) * 31) + Float.floatToIntBits(this.fwSize)) * 31) + this.minimumFirmwareVersion.hashCode()) * 31) + this.config.hashCode();
    }

    @NotNull
    public String toString() {
        return "Datum(appid=" + this.appid + ", name=" + this.name + ", image=" + this.image + ", briefDescription=" + this.briefDescription + ", version=" + this.version + ", deviceSupportVersion=" + this.deviceSupportVersion + ", md5=" + ((Object) this.md5) + ", downloadURL=" + this.downloadURL + ", size=" + this.size + ", fwSize=" + this.fwSize + ", minimumFirmwareVersion=" + this.minimumFirmwareVersion + ", config=" + this.config + ')';
    }
}
