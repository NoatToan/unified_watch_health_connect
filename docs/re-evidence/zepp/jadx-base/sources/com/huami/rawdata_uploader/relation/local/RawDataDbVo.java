package com.huami.rawdata_uploader.relation.local;

import androidx.annotation.Keep;
import androidx.room.Entity;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Entity(primaryKeys = {BloodPressureConst.ParamKey.MEASURETIME, "userId", "dataType"}, tableName = RawDataDbVo.TABLE_NAME)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018\u0000 N2\u00020\u0001:\u0001NB\u0093\u0001\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u0004¢\u0006\u0004\bL\u0010MJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u0095\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u0004HÆ\u0001J\t\u0010\"\u001a\u00020\u0004HÖ\u0001J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0015\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b6\u0010.\"\u0004\b7\u00100R\"\u0010\u0017\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u00101\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\"\u0010\u0018\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\"\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010,\u001a\u0004\b<\u0010.\"\u0004\b=\u00100R\"\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010,\u001a\u0004\b>\u0010.\"\u0004\b?\u00100R\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010,\u001a\u0004\b@\u0010.\"\u0004\bA\u00100R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010,\u001a\u0004\bB\u0010.\"\u0004\bC\u00100R\"\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010,\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010'\u001a\u0004\bF\u0010)\"\u0004\bG\u0010+R\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010,\u001a\u0004\bH\u0010.\"\u0004\bI\u00100R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010,\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100¨\u0006O"}, d2 = {"Lcom/huami/rawdata_uploader/relation/local/RawDataDbVo;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", BloodPressureConst.ParamKey.MEASURETIME, "userId", "dataType", "zipName", "deviceSource", "deviceType", "deviceId", ParamKey.deviceMac, "firmVersion", "sn", EcgData.LOCAL_ECG_RAW_FILE_PATH, "rawLocalFileSize", "extra", "extra1", "copy", "toString", "hashCode", "other", "", "equals", "J", "getMeasureTime", "()J", "setMeasureTime", "(J)V", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", LogUtil.I, "getDataType", "()I", "setDataType", "(I)V", "getZipName", "setZipName", "getDeviceSource", "setDeviceSource", "getDeviceType", "setDeviceType", "getDeviceId", "setDeviceId", "getDeviceMac", "setDeviceMac", "getFirmVersion", "setFirmVersion", "getSn", "setSn", "getRawLocalPath", "setRawLocalPath", "getRawLocalFileSize", "setRawLocalFileSize", "getExtra", "setExtra", "getExtra1", "setExtra1", "<init>", "(JLjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "Companion", "rawdata-uploader_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RawDataDbVo {
    public static final int DEFAULT_VALUE_NUM = -1;

    @NotNull
    public static final String DEFAULT_VALUE_STRING = "0";

    @NotNull
    public static final String TABLE_NAME = "RawDataDbVo";
    private int dataType;

    @NotNull
    private String deviceId;

    @NotNull
    private String deviceMac;
    private int deviceSource;
    private int deviceType;

    @NotNull
    private String extra;

    @NotNull
    private String extra1;

    @NotNull
    private String firmVersion;
    private long measureTime;
    private long rawLocalFileSize;

    @NotNull
    private String rawLocalPath;

    @NotNull
    private String sn;

    @NotNull
    private String userId;

    @NotNull
    private String zipName;

    public RawDataDbVo() {
        this(0L, null, 0, null, 0, 0, null, null, null, null, null, 0L, null, null, 16383, null);
    }

    public RawDataDbVo(long j, @NotNull String str, int i, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, long j2, @NotNull String str8, @NotNull String str9) {
        this.measureTime = j;
        this.userId = str;
        this.dataType = i;
        this.zipName = str2;
        this.deviceSource = i2;
        this.deviceType = i3;
        this.deviceId = str3;
        this.deviceMac = str4;
        this.firmVersion = str5;
        this.sn = str6;
        this.rawLocalPath = str7;
        this.rawLocalFileSize = j2;
        this.extra = str8;
        this.extra1 = str9;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getMeasureTime() {
        return this.measureTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRawLocalPath() {
        return this.rawLocalPath;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getRawLocalFileSize() {
        return this.rawLocalFileSize;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getExtra1() {
        return this.extra1;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getZipName() {
        return this.zipName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    @NotNull
    public final RawDataDbVo copy(long measureTime, @NotNull String userId, int dataType, @NotNull String zipName, int deviceSource, int deviceType, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String firmVersion, @NotNull String sn, @NotNull String rawLocalPath, long rawLocalFileSize, @NotNull String extra, @NotNull String extra1) {
        return new RawDataDbVo(measureTime, userId, dataType, zipName, deviceSource, deviceType, deviceId, deviceMac, firmVersion, sn, rawLocalPath, rawLocalFileSize, extra, extra1);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RawDataDbVo)) {
            return false;
        }
        RawDataDbVo rawDataDbVo = (RawDataDbVo) other;
        return this.measureTime == rawDataDbVo.measureTime && Intrinsics.areEqual(this.userId, rawDataDbVo.userId) && this.dataType == rawDataDbVo.dataType && Intrinsics.areEqual(this.zipName, rawDataDbVo.zipName) && this.deviceSource == rawDataDbVo.deviceSource && this.deviceType == rawDataDbVo.deviceType && Intrinsics.areEqual(this.deviceId, rawDataDbVo.deviceId) && Intrinsics.areEqual(this.deviceMac, rawDataDbVo.deviceMac) && Intrinsics.areEqual(this.firmVersion, rawDataDbVo.firmVersion) && Intrinsics.areEqual(this.sn, rawDataDbVo.sn) && Intrinsics.areEqual(this.rawLocalPath, rawDataDbVo.rawLocalPath) && this.rawLocalFileSize == rawDataDbVo.rawLocalFileSize && Intrinsics.areEqual(this.extra, rawDataDbVo.extra) && Intrinsics.areEqual(this.extra1, rawDataDbVo.extra1);
    }

    public final int getDataType() {
        return this.dataType;
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
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final String getExtra1() {
        return this.extra1;
    }

    @NotNull
    public final String getFirmVersion() {
        return this.firmVersion;
    }

    public final long getMeasureTime() {
        return this.measureTime;
    }

    public final long getRawLocalFileSize() {
        return this.rawLocalFileSize;
    }

    @NotNull
    public final String getRawLocalPath() {
        return this.rawLocalPath;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    public final String getZipName() {
        return this.zipName;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((b.a(this.measureTime) * 31) + this.userId.hashCode()) * 31) + this.dataType) * 31) + this.zipName.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.firmVersion.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.rawLocalPath.hashCode()) * 31) + b.a(this.rawLocalFileSize)) * 31) + this.extra.hashCode()) * 31) + this.extra1.hashCode();
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceMac(@NotNull String str) {
        this.deviceMac = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setExtra(@NotNull String str) {
        this.extra = str;
    }

    public final void setExtra1(@NotNull String str) {
        this.extra1 = str;
    }

    public final void setFirmVersion(@NotNull String str) {
        this.firmVersion = str;
    }

    public final void setMeasureTime(long j) {
        this.measureTime = j;
    }

    public final void setRawLocalFileSize(long j) {
        this.rawLocalFileSize = j;
    }

    public final void setRawLocalPath(@NotNull String str) {
        this.rawLocalPath = str;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setZipName(@NotNull String str) {
        this.zipName = str;
    }

    @NotNull
    public String toString() {
        return "RawDataDbVo(measureTime=" + this.measureTime + ", userId=" + this.userId + ", dataType=" + this.dataType + ", zipName=" + this.zipName + ", deviceSource=" + this.deviceSource + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", firmVersion=" + this.firmVersion + ", sn=" + this.sn + ", rawLocalPath=" + this.rawLocalPath + ", rawLocalFileSize=" + this.rawLocalFileSize + ", extra=" + this.extra + ", extra1=" + this.extra1 + ")";
    }

    public /* synthetic */ RawDataDbVo(long j, String str, int i, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, long j2, String str8, String str9, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1L : j, (i4 & 2) != 0 ? "0" : str, (i4 & 4) != 0 ? -1 : i, (i4 & 8) != 0 ? "0" : str2, (i4 & 16) != 0 ? -1 : i2, (i4 & 32) == 0 ? i3 : -1, (i4 & 64) != 0 ? "0" : str3, (i4 & 128) != 0 ? "0" : str4, (i4 & 256) != 0 ? "0" : str5, (i4 & 512) != 0 ? "0" : str6, (i4 & 1024) != 0 ? "0" : str7, (i4 & 2048) != 0 ? -1L : j2, (i4 & 4096) != 0 ? "0" : str8, (i4 & 8192) == 0 ? str9 : "0");
    }
}
