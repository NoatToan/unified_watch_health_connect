package com.huami.stress.domain.data.remote.bean;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\b\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b\u0012\b\b\u0002\u0010\"\u001a\u00020\b\u0012\b\b\u0002\u0010#\u001a\u00020\b\u0012\b\b\u0002\u0010$\u001a\u00020\u0002¢\u0006\u0004\bQ\u0010RJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\bHÆ\u0003J\t\u0010\u000e\u001a\u00020\bHÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\bHÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\t\u0010\u0014\u001a\u00020\u0002HÆ\u0003J©\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u0002HÆ\u0001J\t\u0010&\u001a\u00020\u0002HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001J\u0013\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0015\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0016\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0017\u001a\u00020\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b6\u0010.R\u001c\u0010\u0019\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001c\u0010\u001a\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u001c\u0010\u001b\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010.R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010.R\u001c\u0010\u001d\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\bB\u0010:R\u001c\u0010\u001e\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bD\u0010:R\u001c\u0010\u001f\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u00108\u001a\u0004\bF\u0010:R\u001c\u0010 \u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00108\u001a\u0004\bH\u0010:R\u001c\u0010!\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00108\u001a\u0004\bJ\u0010:R\u001c\u0010\"\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u00108\u001a\u0004\bL\u0010:R\u001c\u0010#\u001a\u00020\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00108\u001a\u0004\bN\u0010:R\u001c\u0010$\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010,\u001a\u0004\bP\u0010.¨\u0006S"}, d2 = {"Lcom/huami/stress/domain/data/remote/bean/GetAllDayStressResponse;", "", "", "component1", "component2", "", "component3", "component4", "", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "eventType", "userId", "timestamp", "deviceId", "deviceType", "deviceSource", ParamKey.deviceMac, ParamKey.deviceSn, "maxStress", "minStress", "avgStress", "relaxProportion", "normalProportion", "mediumProportion", "highProportion", "data", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "b", "getUserId", "c", "J", "getTimestamp", "()J", GoogleApiAvailabilityLight.a, "getDeviceId", "e", LogUtil.I, "getDeviceType", "()I", "f", "getDeviceSource", "g", "getDeviceMac", "h", "getDeviceSn", "i", "getMaxStress", z.j, "getMinStress", hl.k, "getAvgStress", "l", "getRelaxProportion", "m", "getNormalProportion", GoogleApiAvailabilityLight.b, "getMediumProportion", "o", "getHighProportion", b.r, "getData", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIIIIIILjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GetAllDayStressResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("eventType")
    @NotNull
    private final String eventType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("userId")
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @SerializedName("timestamp")
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @SerializedName("deviceId")
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @SerializedName("deviceType")
    private final int deviceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @SerializedName("deviceSource")
    private final int deviceSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @SerializedName(ParamKey.deviceMac)
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @SerializedName(ParamKey.deviceSn)
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    @SerializedName("maxStress")
    private final int maxStress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata and from toString */
    @SerializedName("minStress")
    private final int minStress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @SerializedName("avgStress")
    private final int avgStress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata and from toString */
    @SerializedName("relaxProportion")
    private final int relaxProportion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata and from toString */
    @SerializedName("normalProportion")
    private final int normalProportion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata and from toString */
    @SerializedName("mediumProportion")
    private final int mediumProportion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata and from toString */
    @SerializedName("highProportion")
    private final int highProportion;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata and from toString */
    @SerializedName("data")
    @NotNull
    private final String data;

    public GetAllDayStressResponse() {
        this(null, null, 0L, null, 0, 0, null, null, 0, 0, 0, 0, 0, 0, 0, null, 65535, null);
    }

    public GetAllDayStressResponse(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, int i, int i2, @NotNull String str4, @NotNull String str5, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NotNull String str6) {
        this.eventType = str;
        this.userId = str2;
        this.timestamp = j;
        this.deviceId = str3;
        this.deviceType = i;
        this.deviceSource = i2;
        this.deviceMac = str4;
        this.deviceSn = str5;
        this.maxStress = i3;
        this.minStress = i4;
        this.avgStress = i5;
        this.relaxProportion = i6;
        this.normalProportion = i7;
        this.mediumProportion = i8;
        this.highProportion = i9;
        this.data = str6;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getMinStress() {
        return this.minStress;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAvgStress() {
        return this.avgStress;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getRelaxProportion() {
        return this.relaxProportion;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getNormalProportion() {
        return this.normalProportion;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMediumProportion() {
        return this.mediumProportion;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getHighProportion() {
        return this.highProportion;
    }

    @NotNull
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceMac() {
        return this.deviceMac;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMaxStress() {
        return this.maxStress;
    }

    @NotNull
    public final GetAllDayStressResponse copy(@NotNull String eventType, @NotNull String userId, long timestamp, @NotNull String deviceId, int deviceType, int deviceSource, @NotNull String deviceMac, @NotNull String deviceSn, int maxStress, int minStress, int avgStress, int relaxProportion, int normalProportion, int mediumProportion, int highProportion, @NotNull String data) {
        return new GetAllDayStressResponse(eventType, userId, timestamp, deviceId, deviceType, deviceSource, deviceMac, deviceSn, maxStress, minStress, avgStress, relaxProportion, normalProportion, mediumProportion, highProportion, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetAllDayStressResponse)) {
            return false;
        }
        GetAllDayStressResponse getAllDayStressResponse = (GetAllDayStressResponse) other;
        return Intrinsics.areEqual(this.eventType, getAllDayStressResponse.eventType) && Intrinsics.areEqual(this.userId, getAllDayStressResponse.userId) && this.timestamp == getAllDayStressResponse.timestamp && Intrinsics.areEqual(this.deviceId, getAllDayStressResponse.deviceId) && this.deviceType == getAllDayStressResponse.deviceType && this.deviceSource == getAllDayStressResponse.deviceSource && Intrinsics.areEqual(this.deviceMac, getAllDayStressResponse.deviceMac) && Intrinsics.areEqual(this.deviceSn, getAllDayStressResponse.deviceSn) && this.maxStress == getAllDayStressResponse.maxStress && this.minStress == getAllDayStressResponse.minStress && this.avgStress == getAllDayStressResponse.avgStress && this.relaxProportion == getAllDayStressResponse.relaxProportion && this.normalProportion == getAllDayStressResponse.normalProportion && this.mediumProportion == getAllDayStressResponse.mediumProportion && this.highProportion == getAllDayStressResponse.highProportion && Intrinsics.areEqual(this.data, getAllDayStressResponse.data);
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

    @NotNull
    public final String getEventType() {
        return this.eventType;
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

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.eventType.hashCode() * 31) + this.userId.hashCode()) * 31) + defpackage.b.a(this.timestamp)) * 31) + this.deviceId.hashCode()) * 31) + this.deviceType) * 31) + this.deviceSource) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode()) * 31) + this.maxStress) * 31) + this.minStress) * 31) + this.avgStress) * 31) + this.relaxProportion) * 31) + this.normalProportion) * 31) + this.mediumProportion) * 31) + this.highProportion) * 31) + this.data.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetAllDayStressResponse(eventType=" + this.eventType + ", userId=" + this.userId + ", timestamp=" + this.timestamp + ", deviceId=" + this.deviceId + ", deviceType=" + this.deviceType + ", deviceSource=" + this.deviceSource + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ", maxStress=" + this.maxStress + ", minStress=" + this.minStress + ", avgStress=" + this.avgStress + ", relaxProportion=" + this.relaxProportion + ", normalProportion=" + this.normalProportion + ", mediumProportion=" + this.mediumProportion + ", highProportion=" + this.highProportion + ", data=" + this.data + ')';
    }

    public /* synthetic */ GetAllDayStressResponse(String str, String str2, long j, String str3, int i, int i2, String str4, String str5, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "all_day_stress" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? 0L : j, (i10 & 8) != 0 ? "" : str3, (i10 & 16) != 0 ? 0 : i, (i10 & 32) != 0 ? 0 : i2, (i10 & 64) != 0 ? "" : str4, (i10 & 128) != 0 ? "" : str5, (i10 & 256) != 0 ? 0 : i3, (i10 & 512) != 0 ? 0 : i4, (i10 & 1024) != 0 ? 0 : i5, (i10 & 2048) != 0 ? 0 : i6, (i10 & 4096) != 0 ? 0 : i7, (i10 & 8192) != 0 ? 0 : i8, (i10 & 16384) != 0 ? 0 : i9, (i10 & 32768) != 0 ? "" : str6);
    }
}
