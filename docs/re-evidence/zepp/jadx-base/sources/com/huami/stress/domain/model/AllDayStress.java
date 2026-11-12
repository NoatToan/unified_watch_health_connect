package com.huami.stress.domain.model;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\bV\u0010WJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J¥\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u0018\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010\u0019\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106R\u0019\u0010\u001a\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b9\u00104\u001a\u0004\b:\u00106R\u0019\u0010\u001b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u00106R\u0019\u0010\u001c\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b=\u00104\u001a\u0004\b>\u00106R\u0019\u0010\u001d\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b?\u00104\u001a\u0004\b@\u00106R\u0019\u0010\u001e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u00106R\u0019\u0010\u001f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\bC\u00104\u001a\u0004\bD\u00106R\u0019\u0010 \u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\bE\u00104\u001a\u0004\bF\u00106R\u0019\u0010!\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\u0019\u0010\"\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bJ\u00102R\u0019\u0010#\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\bK\u00100\u001a\u0004\bL\u00102R\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\"\u0010U\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u00100\u001a\u0004\bR\u00102\"\u0004\bS\u0010T¨\u0006X"}, d2 = {"Lcom/huami/stress/domain/model/AllDayStress;", "", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "", "Lcom/huami/stress/domain/model/Stress;", "component15", "timestamp", "userId", "maxStress", "minStress", "avgStress", "relaxProportion", "normalProportion", "mediumProportion", "highProportion", "deviceSource", "deviceType", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "stressList", "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", LogUtil.I, "getMaxStress", "()I", GoogleApiAvailabilityLight.a, "getMinStress", "e", "getAvgStress", "f", "getRelaxProportion", "g", "getNormalProportion", "h", "getMediumProportion", "i", "getHighProportion", z.j, "getDeviceSource", hl.k, "getDeviceType", "l", "getDeviceId", "m", "getDeviceMac", GoogleApiAvailabilityLight.b, "getDeviceSn", "o", "Ljava/util/List;", "getStressList", "()Ljava/util/List;", b.r, "getDateStr", "setDateStr", "(Ljava/lang/String;)V", "dateStr", "<init>", "(JLjava/lang/String;IIIIIIIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AllDayStress {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int maxStress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int minStress;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int avgStress;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int relaxProportion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    private final int normalProportion;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final int mediumProportion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    private final int highProportion;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<Stress> stressList;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private String dateStr;

    public AllDayStress(long j, @NotNull String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<Stress> list) {
        this.timestamp = j;
        this.userId = str;
        this.maxStress = i;
        this.minStress = i2;
        this.avgStress = i3;
        this.relaxProportion = i4;
        this.normalProportion = i5;
        this.mediumProportion = i6;
        this.highProportion = i7;
        this.deviceSource = i8;
        this.deviceType = i9;
        this.deviceId = str2;
        this.deviceMac = str3;
        this.deviceSn = str4;
        this.stressList = list;
        this.dateStr = new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    @NotNull
    public final List<Stress> component15() {
        return this.stressList;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getRelaxProportion() {
        return this.relaxProportion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getNormalProportion() {
        return this.normalProportion;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getMediumProportion() {
        return this.mediumProportion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getHighProportion() {
        return this.highProportion;
    }

    @NotNull
    public final AllDayStress copy(long timestamp, @NotNull String userId, int maxStress, int minStress, int avgStress, int relaxProportion, int normalProportion, int mediumProportion, int highProportion, int deviceSource, int deviceType, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn, @NotNull List<Stress> stressList) {
        return new AllDayStress(timestamp, userId, maxStress, minStress, avgStress, relaxProportion, normalProportion, mediumProportion, highProportion, deviceSource, deviceType, deviceId, deviceMac, deviceSn, stressList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AllDayStress)) {
            return false;
        }
        AllDayStress allDayStress = (AllDayStress) other;
        return this.timestamp == allDayStress.timestamp && Intrinsics.areEqual(this.userId, allDayStress.userId) && this.maxStress == allDayStress.maxStress && this.minStress == allDayStress.minStress && this.avgStress == allDayStress.avgStress && this.relaxProportion == allDayStress.relaxProportion && this.normalProportion == allDayStress.normalProportion && this.mediumProportion == allDayStress.mediumProportion && this.highProportion == allDayStress.highProportion && this.deviceSource == allDayStress.deviceSource && this.deviceType == allDayStress.deviceType && Intrinsics.areEqual(this.deviceId, allDayStress.deviceId) && Intrinsics.areEqual(this.deviceMac, allDayStress.deviceMac) && Intrinsics.areEqual(this.deviceSn, allDayStress.deviceSn) && Intrinsics.areEqual(this.stressList, allDayStress.stressList);
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    @NotNull
    public final String getDateStr() {
        return this.dateStr;
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

    @NotNull
    public final List<Stress> getStressList() {
        return this.stressList;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((defpackage.b.a(this.timestamp) * 31) + this.userId.hashCode()) * 31) + this.maxStress) * 31) + this.minStress) * 31) + this.avgStress) * 31) + this.relaxProportion) * 31) + this.normalProportion) * 31) + this.mediumProportion) * 31) + this.highProportion) * 31) + this.deviceSource) * 31) + this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.stressList.hashCode();
    }

    public final void setDateStr(@NotNull String str) {
        this.dateStr = str;
    }

    @NotNull
    public String toString() {
        return "AllDayStress(timestamp=" + this.timestamp + ", userId=" + this.userId + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", avgStress=" + this.avgStress + ", relaxProportion=" + this.relaxProportion + ", normalProportion=" + this.normalProportion + ", mediumProportion=" + this.mediumProportion + ", highProportion=" + this.highProportion + ", deviceSource=" + this.deviceSource + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", stressList=" + this.stressList + ')';
    }
}
