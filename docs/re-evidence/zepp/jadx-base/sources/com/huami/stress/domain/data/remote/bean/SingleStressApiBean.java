package com.huami.stress.domain.data.remote.bean;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.annotations.SerializedName;
import com.huami.stress.domain.data.remote.StressApiConst;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u00002\u00020\u0001BI\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\u0016\u0012\u0006\u0010!\u001a\u00020\u0016\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0016\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u00103R\"\u0010\t\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00168F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001cR\"\u0010%\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\"\u0010)\u001a\u00020\u00168F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001a\"\u0004\b(\u0010\u001cR\"\u0010-\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\"\u00101\u001a\u00020\u00028F@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u0010\u0006\"\u0004\b0\u0010\b¨\u00064"}, d2 = {"Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "", "", "a", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "setEventType", "(Ljava/lang/String;)V", "eventType", "b", "getUserId", "setUserId", "userId", "", "c", "J", "getTimestamp", "()J", "setTimestamp", "(J)V", "timestamp", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getValue", "()I", "setValue", "(I)V", "value", "e", "getDeviceType", "setDeviceType", "deviceType", "f", "getDeviceId", "setDeviceId", "deviceId", "g", "getDeviceSource", "setDeviceSource", "deviceSource", "h", "getDeviceMac", "setDeviceMac", ParamKey.deviceMac, "i", "getDeviceSn", "setDeviceSn", ParamKey.deviceSn, "<init>", "(Ljava/lang/String;JIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class SingleStressApiBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("eventType")
    @NotNull
    private String eventType = StressApiConst.EVENT_SINGLE_STRESS;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("userId")
    @NotNull
    private String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("timestamp")
    private long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("value")
    private int value;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("deviceType")
    private int deviceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("deviceId")
    @NotNull
    private String deviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("deviceSource")
    private int deviceSource;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @SerializedName(ParamKey.deviceMac)
    @NotNull
    private String deviceMac;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @SerializedName(ParamKey.deviceSn)
    @NotNull
    private String deviceSn;

    public SingleStressApiBean(@NotNull String str, long j, int i, int i2, @NotNull String str2, int i3, @NotNull String str3, @NotNull String str4) {
        this.userId = "";
        this.deviceId = "";
        this.deviceMac = "";
        this.deviceSn = "";
        this.userId = str;
        this.timestamp = j;
        this.value = i;
        this.deviceType = i2;
        this.deviceId = str2;
        this.deviceSource = i3;
        this.deviceMac = str3;
        this.deviceSn = str4;
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
        return str == null ? StressApiConst.EVENT_SINGLE_STRESS : str;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        String str = this.userId;
        return str == null ? "" : str;
    }

    public final int getValue() {
        return this.value;
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

    public final void setTimestamp(long j) {
        this.timestamp = j;
    }

    public final void setUserId(@NotNull String str) {
        this.userId = str;
    }

    public final void setValue(int i) {
        this.value = i;
    }
}
