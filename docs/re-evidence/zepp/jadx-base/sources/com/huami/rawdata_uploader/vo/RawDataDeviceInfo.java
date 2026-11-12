package com.huami.rawdata_uploader.vo;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005HÆ\u0001J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001c¨\u0006\""}, d2 = {"Lcom/huami/rawdata_uploader/vo/RawDataDeviceInfo;", "", "", "component1", "component2", "", "component3", "component4", "component5", "component6", "deviceSource", "deviceType", "deviceId", ParamKey.deviceMac, "firmVersion", "sn", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getDeviceSource", "()I", "getDeviceType", "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "getDeviceMac", "getFirmVersion", "getSn", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataDeviceInfo {

    @NotNull
    private final String deviceId;

    @NotNull
    private final String deviceMac;
    private final int deviceSource;
    private final int deviceType;

    @NotNull
    private final String firmVersion;

    @NotNull
    private final String sn;

    public RawDataDeviceInfo() {
        this(0, 0, null, null, null, null, 63, null);
    }

    public RawDataDeviceInfo(int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.deviceSource = i;
        this.deviceType = i2;
        this.deviceId = str;
        this.deviceMac = str2;
        this.firmVersion = str3;
        this.sn = str4;
    }

    public static /* synthetic */ RawDataDeviceInfo copy$default(RawDataDeviceInfo rawDataDeviceInfo, int i, int i2, String str, String str2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = rawDataDeviceInfo.deviceSource;
        }
        if ((i3 & 2) != 0) {
            i2 = rawDataDeviceInfo.deviceType;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = rawDataDeviceInfo.deviceId;
        }
        String str5 = str;
        if ((i3 & 8) != 0) {
            str2 = rawDataDeviceInfo.deviceMac;
        }
        String str6 = str2;
        if ((i3 & 16) != 0) {
            str3 = rawDataDeviceInfo.firmVersion;
        }
        String str7 = str3;
        if ((i3 & 32) != 0) {
            str4 = rawDataDeviceInfo.sn;
        }
        return rawDataDeviceInfo.copy(i, i4, str5, str6, str7, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final RawDataDeviceInfo copy(int deviceSource, int deviceType, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String firmVersion, @NotNull String sn) {
        return new RawDataDeviceInfo(deviceSource, deviceType, deviceId, deviceMac, firmVersion, sn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataDeviceInfo)) {
            return false;
        }
        RawDataDeviceInfo rawDataDeviceInfo = (RawDataDeviceInfo) other;
        return this.deviceSource == rawDataDeviceInfo.deviceSource && this.deviceType == rawDataDeviceInfo.deviceType && Intrinsics.areEqual(this.deviceId, rawDataDeviceInfo.deviceId) && Intrinsics.areEqual(this.deviceMac, rawDataDeviceInfo.deviceMac) && Intrinsics.areEqual(this.firmVersion, rawDataDeviceInfo.firmVersion) && Intrinsics.areEqual(this.sn, rawDataDeviceInfo.sn);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((((((((this.deviceSource * 31) + this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.firmVersion.hashCode()) * 31) + this.sn.hashCode();
    }

    @NotNull
    public String toString() {
        return "RawDataDeviceInfo(deviceSource=" + this.deviceSource + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", firmVersion=" + this.firmVersion + ", sn=" + this.sn + ")";
    }

    public /* synthetic */ RawDataDeviceInfo(int i, int i2, String str, String str2, String str3, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) == 0 ? i2 : -1, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4);
    }
}
