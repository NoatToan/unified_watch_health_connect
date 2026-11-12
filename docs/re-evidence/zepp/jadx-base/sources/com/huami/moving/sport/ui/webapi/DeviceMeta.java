package com.huami.moving.sport.ui.webapi;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJz\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010%R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b/\u0010%R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\rR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b3\u00101\u001a\u0004\b4\u0010\r¨\u00067"}, d2 = {"Lcom/huami/moving/sport/ui/webapi/DeviceMeta;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()Ljava/lang/Boolean;", "component9", "source", DeviceSettingApiImpl.META_KEY_PRODUCT_NAME, "productId", "productVersion", DeviceSettingApiImpl.META_KEY_BLUETOOTH, "category", DeviceSettingApiImpl.META_KEY_THUMBNAIL, "nfcEnable", "gpsEnable", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/huami/moving/sport/ui/webapi/DeviceMeta;", "toString", "hashCode", "other", "equals", "a", LogUtil.I, "getSource", "()I", "b", "Ljava/lang/String;", "getProductName", "()Ljava/lang/String;", "c", "getProductId", GoogleApiAvailabilityLight.a, "getProductVersion", "e", "getBluetooth", "f", "getCategory", "g", "getThumbnail", "h", "Ljava/lang/Boolean;", "getNfcEnable", "i", "getGpsEnable", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceMeta {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final String productName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final String productId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    private final String productVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @Nullable
    private final String bluetooth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String category;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    private final String thumbnail;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean nfcEnable;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean gpsEnable;

    public DeviceMeta(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Boolean bool, @Nullable Boolean bool2) {
        this.source = i;
        this.productName = str;
        this.productId = str2;
        this.productVersion = str3;
        this.bluetooth = str4;
        this.category = str5;
        this.thumbnail = str6;
        this.nfcEnable = bool;
        this.gpsEnable = bool2;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProductVersion() {
        return this.productVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBluetooth() {
        return this.bluetooth;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getThumbnail() {
        return this.thumbnail;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getNfcEnable() {
        return this.nfcEnable;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getGpsEnable() {
        return this.gpsEnable;
    }

    @NotNull
    public final DeviceMeta copy(int source, @Nullable String productName, @Nullable String productId, @Nullable String productVersion, @Nullable String bluetooth, @Nullable String category, @Nullable String thumbnail, @Nullable Boolean nfcEnable, @Nullable Boolean gpsEnable) {
        return new DeviceMeta(source, productName, productId, productVersion, bluetooth, category, thumbnail, nfcEnable, gpsEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMeta)) {
            return false;
        }
        DeviceMeta deviceMeta = (DeviceMeta) other;
        return this.source == deviceMeta.source && Intrinsics.areEqual(this.productName, deviceMeta.productName) && Intrinsics.areEqual(this.productId, deviceMeta.productId) && Intrinsics.areEqual(this.productVersion, deviceMeta.productVersion) && Intrinsics.areEqual(this.bluetooth, deviceMeta.bluetooth) && Intrinsics.areEqual(this.category, deviceMeta.category) && Intrinsics.areEqual(this.thumbnail, deviceMeta.thumbnail) && Intrinsics.areEqual(this.nfcEnable, deviceMeta.nfcEnable) && Intrinsics.areEqual(this.gpsEnable, deviceMeta.gpsEnable);
    }

    @Nullable
    public final String getBluetooth() {
        return this.bluetooth;
    }

    @Nullable
    public final String getCategory() {
        return this.category;
    }

    @Nullable
    public final Boolean getGpsEnable() {
        return this.gpsEnable;
    }

    @Nullable
    public final Boolean getNfcEnable() {
        return this.nfcEnable;
    }

    @Nullable
    public final String getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    @Nullable
    public final String getProductVersion() {
        return this.productVersion;
    }

    public final int getSource() {
        return this.source;
    }

    @Nullable
    public final String getThumbnail() {
        return this.thumbnail;
    }

    public int hashCode() {
        int i = this.source * 31;
        String str = this.productName;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.productId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productVersion;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bluetooth;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.category;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thumbnail;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.nfcEnable;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.gpsEnable;
        return iHashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "DeviceMeta(source=" + this.source + ", productName=" + this.productName + ", productId=" + this.productId + ", productVersion=" + this.productVersion + ", bluetooth=" + this.bluetooth + ", category=" + this.category + ", thumbnail=" + this.thumbnail + ", nfcEnable=" + this.nfcEnable + ", gpsEnable=" + this.gpsEnable + ")";
    }

    public /* synthetic */ DeviceMeta(int i, String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, Boolean bool2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : str6, (i2 & 128) != 0 ? null : bool, (i2 & 256) == 0 ? bool2 : null);
    }
}
