package com.huami.third.wechat.entity;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JQ\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\nHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000e\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u000e\u0010\u001fR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0019\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010\u001bR\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010\u001bR\u0019\u0010\u0012\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u0012\u0010)¨\u0006,"}, d2 = {"Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "", "component7", "sn", "deviceSource", "isSupport", "iLnkImSdkId", "deviceDisplayName", "bleAddress", "isActive", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "b", LogUtil.I, "getDeviceSource", "()I", "c", GoogleApiAvailabilityLight.a, "getILnkImSdkId", "e", "getDeviceDisplayName", "f", "getBleAddress", "g", "Z", "()Z", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "wechat_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceListApiEntity {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("sn")
    @Expose
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("deviceSource")
    @Expose
    private final int deviceSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("isSupport")
    @Expose
    private final int isSupport;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("ilinkImSdkId")
    @Expose
    @Nullable
    private final String iLnkImSdkId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceDisplayName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String bleAddress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final boolean isActive;

    public DeviceListApiEntity(@NotNull String str, int i, int i2, @Nullable String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        this.sn = str;
        this.deviceSource = i;
        this.isSupport = i2;
        this.iLnkImSdkId = str2;
        this.deviceDisplayName = str3;
        this.bleAddress = str4;
        this.isActive = z;
    }

    public static /* synthetic */ DeviceListApiEntity copy$default(DeviceListApiEntity deviceListApiEntity, String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = deviceListApiEntity.sn;
        }
        if ((i3 & 2) != 0) {
            i = deviceListApiEntity.deviceSource;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = deviceListApiEntity.isSupport;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str2 = deviceListApiEntity.iLnkImSdkId;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = deviceListApiEntity.deviceDisplayName;
        }
        String str6 = str3;
        if ((i3 & 32) != 0) {
            str4 = deviceListApiEntity.bleAddress;
        }
        String str7 = str4;
        if ((i3 & 64) != 0) {
            z = deviceListApiEntity.isActive;
        }
        return deviceListApiEntity.copy(str, i4, i5, str5, str6, str7, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getIsSupport() {
        return this.isSupport;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getILnkImSdkId() {
        return this.iLnkImSdkId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBleAddress() {
        return this.bleAddress;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final DeviceListApiEntity copy(@NotNull String sn, int deviceSource, int isSupport, @Nullable String iLnkImSdkId, @NotNull String deviceDisplayName, @NotNull String bleAddress, boolean isActive) {
        return new DeviceListApiEntity(sn, deviceSource, isSupport, iLnkImSdkId, deviceDisplayName, bleAddress, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceListApiEntity)) {
            return false;
        }
        DeviceListApiEntity deviceListApiEntity = (DeviceListApiEntity) other;
        return Intrinsics.areEqual(this.sn, deviceListApiEntity.sn) && this.deviceSource == deviceListApiEntity.deviceSource && this.isSupport == deviceListApiEntity.isSupport && Intrinsics.areEqual(this.iLnkImSdkId, deviceListApiEntity.iLnkImSdkId) && Intrinsics.areEqual(this.deviceDisplayName, deviceListApiEntity.deviceDisplayName) && Intrinsics.areEqual(this.bleAddress, deviceListApiEntity.bleAddress) && this.isActive == deviceListApiEntity.isActive;
    }

    @NotNull
    public final String getBleAddress() {
        return this.bleAddress;
    }

    @NotNull
    public final String getDeviceDisplayName() {
        return this.deviceDisplayName;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final String getILnkImSdkId() {
        return this.iLnkImSdkId;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public int hashCode() {
        int iHashCode = ((((this.sn.hashCode() * 31) + this.deviceSource) * 31) + this.isSupport) * 31;
        String str = this.iLnkImSdkId;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.deviceDisplayName.hashCode()) * 31) + this.bleAddress.hashCode()) * 31;
        boolean z = this.isActive;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final int isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "DeviceListApiEntity(sn=" + this.sn + ", deviceSource=" + this.deviceSource + ", isSupport=" + this.isSupport + ", iLnkImSdkId=" + this.iLnkImSdkId + ", deviceDisplayName=" + this.deviceDisplayName + ", bleAddress=" + this.bleAddress + ", isActive=" + this.isActive + ")";
    }
}
