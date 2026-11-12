package com.huami.stress.domain.data.remote.bean;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b6\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020\u001a\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u001a\u0012\u0006\u00105\u001a\u00020\u001a\u0012\u0006\u00109\u001a\u00020\u001a\u0012\u0006\u0010=\u001a\u00020\u001a\u0012\u0006\u0010A\u001a\u00020\u001a\u0012\u0006\u0010E\u001a\u00020\u001a\u0012\u0006\u0010I\u001a\u00020\u001a\u0012\u0006\u0010M\u001a\u00020\u0002¢\u0006\u0004\bN\u0010OR\"\u0010\t\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\"\u0010!\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\"\u0010)\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006\"\u0004\b(\u0010\bR\"\u0010-\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\"\u00101\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\"\u00105\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010\u001c\u001a\u0004\b3\u0010\u001e\"\u0004\b4\u0010 R\"\u00109\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u0010\u001c\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010 R\"\u0010=\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010\u001c\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010 R\"\u0010A\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001c\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010 R\"\u0010E\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010\u001e\"\u0004\bD\u0010 R\"\u0010I\u001a\u00020\u001a8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010\u001c\u001a\u0004\bG\u0010\u001e\"\u0004\bH\u0010 R\"\u0010M\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006\"\u0004\bL\u0010\b¨\u0006P"}, d2 = {"Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "", "", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "eventType", "b", "getUserId", "setUserId", "userId", "", "c", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "timestamp", GoogleApiAvailabilityLight.a, "getDeviceId", "setDeviceId", "deviceId", "", "e", LogUtil.I, "getDeviceType", "()I", "setDeviceType", "(I)V", "deviceType", "f", "getDeviceSource", "setDeviceSource", "deviceSource", "g", "getDeviceMac", "setDeviceMac", ParamKey.deviceMac, "h", "getDeviceSn", "setDeviceSn", ParamKey.deviceSn, "i", "getMaxStress", "setMaxStress", "maxStress", z.j, "getMinStress", "setMinStress", "minStress", hl.k, "getAvgStress", "setAvgStress", "avgStress", "l", "getRelaxProportion", "setRelaxProportion", "relaxProportion", "m", "getNormalProportion", "setNormalProportion", "normalProportion", GoogleApiAvailabilityLight.b, "getMediumProportion", "setMediumProportion", "mediumProportion", "o", "getHighProportion", "setHighProportion", "highProportion", b.r, "getData", "setData", "data", "<init>", "(Ljava/lang/String;JLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIIIIIILjava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class AllDayStressApiBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("eventType")
    @NotNull
    private String eventType = "all_day_stress";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("userId")
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("timestamp")
    private long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("deviceId")
    @NotNull
    private String deviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("deviceType")
    private int deviceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("deviceSource")
    private int deviceSource;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName(ParamKey.deviceMac)
    @NotNull
    private String deviceMac;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(ParamKey.deviceSn)
    @NotNull
    private String deviceSn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName("maxStress")
    private int maxStress;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @SerializedName("minStress")
    private int minStress;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @SerializedName("avgStress")
    private int avgStress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @SerializedName("relaxProportion")
    private int relaxProportion;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @SerializedName("normalProportion")
    private int normalProportion;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @SerializedName("mediumProportion")
    private int mediumProportion;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @SerializedName("highProportion")
    private int highProportion;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @SerializedName("data")
    @NotNull
    private String data;

    public AllDayStressApiBean(@NotNull String str, long j, @NotNull String str2, int i, int i2, @NotNull String str3, @NotNull String str4, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NotNull String str5) {
        this.userId = "";
        this.deviceId = "";
        this.deviceMac = "";
        this.deviceSn = "";
        this.data = "";
        this.userId = str;
        this.timestamp = j;
        this.deviceId = str2;
        this.deviceType = i;
        this.deviceSource = i2;
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
    }

    public final int getAvgStress() {
        return this.avgStress;
    }

    @NotNull
    public final String getData() {
        String str = this.data;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDeviceId() {
        String str = this.deviceId;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDeviceMac() {
        String str = this.deviceMac;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDeviceSn() {
        String str = this.deviceSn;
        return str == null ? "" : str;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    public final String getEventType() {
        String str = this.eventType;
        return str == null ? "all_day_stress" : str;
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
        String str = this.userId;
        return str == null ? "" : str;
    }

    public final void setAvgStress(int i) {
        this.avgStress = i;
    }

    public final void setData(@NotNull String str) {
        this.data = str;
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceMac(@NotNull String str) {
        this.deviceMac = str;
    }

    public final void setDeviceSn(@NotNull String str) {
        this.deviceSn = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setDeviceType(int i) {
        this.deviceType = i;
    }

    public final void setEventType(@NotNull String str) {
        this.eventType = str;
    }

    public final void setHighProportion(int i) {
        this.highProportion = i;
    }

    public final void setMaxStress(int i) {
        this.maxStress = i;
    }

    public final void setMediumProportion(int i) {
        this.mediumProportion = i;
    }

    public final void setMinStress(int i) {
        this.minStress = i;
    }

    public final void setNormalProportion(int i) {
        this.normalProportion = i;
    }

    public final void setRelaxProportion(int i) {
        this.relaxProportion = i;
    }

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }
}
