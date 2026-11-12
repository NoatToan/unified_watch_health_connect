package com.huami.stress.domain.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.utils.TimeFormatUtils;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import defpackage.b;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b>\u0010?J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003JY\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0019\u0010\u0013\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010!\u001a\u0004\b/\u0010#R\u0019\u0010\u0014\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u0010#R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010!\u001a\u0004\b3\u0010#\"\u0004\b4\u00105R\"\u0010=\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006@"}, d2 = {"Lcom/huami/stress/domain/model/SingleStress;", "Ljava/io/Serializable;", "", "component1", "", "component2", "", "component3", "component4", "component5", "component6", "component7", "component8", "timestamp", "userId", "value", "deviceSource", "deviceType", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "copy", "toString", "hashCode", "", "other", "", "equals", "a", "J", "getTimestamp", "()J", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", LogUtil.I, "getValue", "()I", GoogleApiAvailabilityLight.a, "getDeviceSource", "e", "getDeviceType", "f", "getDeviceId", "g", "getDeviceMac", "h", "getDeviceSn", "i", "getDateStr", "setDateStr", "(Ljava/lang/String;)V", "dateStr", z.j, "Z", "getRawSingle", "()Z", "setRawSingle", "(Z)V", "rawSingle", "<init>", "(JLjava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SingleStress implements Serializable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final int deviceType;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceMac;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private String dateStr;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private boolean rawSingle = true;

    public SingleStress(long j, @NotNull String str, int i, int i2, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.timestamp = j;
        this.userId = str;
        this.value = i;
        this.deviceSource = i2;
        this.deviceType = i3;
        this.deviceId = str2;
        this.deviceMac = str3;
        this.deviceSn = str4;
        this.dateStr = new SimpleDateFormat(TimeFormatUtils.PATTERN_YYY_MM_DD, Locale.getDefault()).format(new Date(j));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceType() {
        return this.deviceType;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
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

    @NotNull
    public final SingleStress copy(long timestamp, @NotNull String userId, int value, int deviceSource, int deviceType, @NotNull String deviceId, @NotNull String deviceMac, @NotNull String deviceSn) {
        return new SingleStress(timestamp, userId, value, deviceSource, deviceType, deviceId, deviceMac, deviceSn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleStress)) {
            return false;
        }
        SingleStress singleStress = (SingleStress) other;
        return this.timestamp == singleStress.timestamp && Intrinsics.areEqual(this.userId, singleStress.userId) && this.value == singleStress.value && this.deviceSource == singleStress.deviceSource && this.deviceType == singleStress.deviceType && Intrinsics.areEqual(this.deviceId, singleStress.deviceId) && Intrinsics.areEqual(this.deviceMac, singleStress.deviceMac) && Intrinsics.areEqual(this.deviceSn, singleStress.deviceSn);
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

    public final boolean getRawSingle() {
        return this.rawSingle;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((((((((((((b.a(this.timestamp) * 31) + this.userId.hashCode()) * 31) + this.value) * 31) + this.deviceSource) * 31) + this.deviceType) * 31) + this.deviceId.hashCode()) * 31) + this.deviceMac.hashCode()) * 31) + this.deviceSn.hashCode();
    }

    public final void setDateStr(@NotNull String str) {
        this.dateStr = str;
    }

    public final void setRawSingle(boolean z) {
        this.rawSingle = z;
    }

    @NotNull
    public String toString() {
        return "SingleStress(timestamp=" + this.timestamp + ", userId=" + this.userId + ", value=" + this.value + ", deviceSource=" + this.deviceSource + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceMac=" + this.deviceMac + ", deviceSn=" + this.deviceSn + ')';
    }
}
