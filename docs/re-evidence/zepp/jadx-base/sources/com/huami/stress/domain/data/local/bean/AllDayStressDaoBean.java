package com.huami.stress.domain.data.local.bean;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Entity(tableName = "AllDayStress")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0014¢\u0006\u0004\bU\u0010VJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J©\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u0014HÆ\u0001J\t\u0010'\u001a\u00020\u0004HÖ\u0001J\t\u0010(\u001a\u00020\u0006HÖ\u0001J\u0013\u0010*\u001a\u00020\u00142\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0017\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0018\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0019\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u001c\u0010\u001a\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u00102R\u001c\u0010\u001b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R\u001c\u0010\u001c\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00100\u001a\u0004\b>\u00102R\u001c\u0010\u001d\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u001c\u0010\u001e\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u00106R\u001c\u0010\u001f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u001c\u0010 \u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u001c\u0010!\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00104\u001a\u0004\bH\u00106R\u001c\u0010\"\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00104\u001a\u0004\bJ\u00106R\u001c\u0010#\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00104\u001a\u0004\bL\u00106R\u001c\u0010$\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bN\u00102R\"\u0010%\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006W"}, d2 = {"Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "", "component16", "timestamp", "userId", "deviceSource", "deviceType", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "maxStress", "minStress", "avgStress", "relaxProportion", "normalProportion", "mediumProportion", "highProportion", "data", "syncStatus", "copy", "toString", "hashCode", "other", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", LogUtil.I, "getDeviceSource", "()I", GoogleApiAvailabilityLight.a, "getDeviceType", "e", "getDeviceId", "f", "getDeviceMac", "g", "getDeviceSn", "h", "getMaxStress", "i", "getMinStress", z.j, "getAvgStress", hl.k, "getRelaxProportion", "l", "getNormalProportion", "m", "getMediumProportion", GoogleApiAvailabilityLight.b, "getHighProportion", "o", "getData", b.r, "Z", "getSyncStatus", "()Z", "setSyncStatus", "(Z)V", "<init>", "(JLjava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIIIILjava/lang/String;Z)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AllDayStressDaoBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @PrimaryKey
    @ColumnInfo(name = "timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "userId")
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "deviceSource")
    private final int deviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "deviceType")
    private final int deviceType;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "deviceId")
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = ParamKey.deviceMac)
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = ParamKey.deviceSn)
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "maxStress")
    private final int maxStress;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "minStress")
    private final int minStress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "avgStress")
    private final int avgStress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "relaxProportion")
    private final int relaxProportion;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "normalProportion")
    private final int normalProportion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "mediumProportion")
    private final int mediumProportion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "highProportion")
    private final int highProportion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "data")
    @NotNull
    private final String data;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @ColumnInfo(name = "syncStatus")
    private boolean syncStatus;

    public AllDayStressDaoBean(long j, @NotNull String str, int i, int i2, @NotNull String str2, @NotNull String str3, @NotNull String str4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NotNull String str5, boolean z) {
        this.timestamp = j;
        this.userId = str;
        this.deviceSource = i;
        this.deviceType = i2;
        this.deviceId = str2;
        this.deviceMac = str3;
        this.deviceSn = str4;
        this.maxStress = i3;
        this.minStress = i4;
        this.avgStress = i5;
        this.relaxProportion = i6;
        this.normalProportion = i7;
        this.mediumProportion = i8;
        this.highProportion = i9;
        this.data = str5;
        this.syncStatus = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getRelaxProportion() {
        return this.relaxProportion;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getNormalProportion() {
        return this.normalProportion;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMediumProportion() {
        return this.mediumProportion;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getHighProportion() {
        return this.highProportion;
    }

    @NotNull
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    @NotNull
    public final AllDayStressDaoBean copy(long timestamp, @NotNull String userId, int deviceSource, int deviceType, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, int maxStress, int minStress, int avgStress, int relaxProportion, int normalProportion, int mediumProportion, int highProportion, @NotNull String data, boolean syncStatus) {
        return new AllDayStressDaoBean(timestamp, userId, deviceSource, deviceType, deviceId, deviceMac, deviceSn, maxStress, minStress, avgStress, relaxProportion, normalProportion, mediumProportion, highProportion, data, syncStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayStressDaoBean)) {
            return false;
        }
        AllDayStressDaoBean allDayStressDaoBean = (AllDayStressDaoBean) other;
        return this.timestamp == allDayStressDaoBean.timestamp && Intrinsics.areEqual(this.userId, allDayStressDaoBean.userId) && this.deviceSource == allDayStressDaoBean.deviceSource && this.deviceType == allDayStressDaoBean.deviceType && Intrinsics.areEqual(this.deviceId, allDayStressDaoBean.deviceId) && Intrinsics.areEqual(this.deviceMac, allDayStressDaoBean.deviceMac) && Intrinsics.areEqual(this.deviceSn, allDayStressDaoBean.deviceSn) && this.maxStress == allDayStressDaoBean.maxStress && this.minStress == allDayStressDaoBean.minStress && this.avgStress == allDayStressDaoBean.avgStress && this.relaxProportion == allDayStressDaoBean.relaxProportion && this.normalProportion == allDayStressDaoBean.normalProportion && this.mediumProportion == allDayStressDaoBean.mediumProportion && this.highProportion == allDayStressDaoBean.highProportion && Intrinsics.areEqual(this.data, allDayStressDaoBean.data) && this.syncStatus == allDayStressDaoBean.syncStatus;
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    public final int getHighProportion() {
        return this.highProportion;
    }

    public final int getMaxStress() {
        return this.maxStress;
    }

    public final int getMediumProportion() {
        return this.mediumProportion;
    }

    public final int getMinStress() {
        return this.minStress;
    }

    public final int getNormalProportion() {
        return this.normalProportion;
    }

    public final int getRelaxProportion() {
        return this.relaxProportion;
    }

    public final boolean getSyncStatus() {
        return this.syncStatus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    public int hashCode() {
        int iA = ((((((((((((((((((((((((((((defpackage.b.a(this.timestamp) * 31) + this.userId.hashCode()) * 31) + this.deviceSource) * 31) + this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.maxStress) * 31) + this.minStress) * 31) + this.avgStress) * 31) + this.relaxProportion) * 31) + this.normalProportion) * 31) + this.mediumProportion) * 31) + this.highProportion) * 31) + this.data.hashCode()) * 31;
        boolean z = this.syncStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iA + r1;
    }

    public final void setSyncStatus(boolean z) {
        this.syncStatus = z;
    }

    @NotNull
    public String toString() {
        return "AllDayStressDaoBean(timestamp=" + this.timestamp + ", userId=" + this.userId + ", deviceSource=" + this.deviceSource + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", avgStress=" + this.avgStress + ", relaxProportion=" + this.relaxProportion + ", normalProportion=" + this.normalProportion + ", mediumProportion=" + this.mediumProportion + ", highProportion=" + this.highProportion + ", data=" + this.data + ", syncStatus=" + this.syncStatus + ')';
    }
}
