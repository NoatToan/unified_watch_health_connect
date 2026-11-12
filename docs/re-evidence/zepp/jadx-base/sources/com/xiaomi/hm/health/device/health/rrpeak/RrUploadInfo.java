package com.xiaomi.hm.health.device.health.rrpeak;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import defpackage.b;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0015\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0005HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\t\u0010\r\u001a\u00020\fHÆ\u0003J[\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR%\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0010\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0012\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0019\u0010\u0013\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u0019\u0010\u0014\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/health/rrpeak/RrUploadInfo;", "", "", "component1", "", "", "component2", "", "component3", "component4", "component5", "component6", "", "component7", "time", "params", "source", "deviceId", "sn", "fwVer", HTTP.CONTENT_RANGE_BYTES, "copy", "toString", "hashCode", "other", "", "equals", "a", "J", "getTime", "()J", "b", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "c", LogUtil.I, "getSource", "()I", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getDeviceId", "()Ljava/lang/String;", "e", "getSn", "f", "getFwVer", "g", "[B", "getBytes", "()[B", "<init>", "(JLjava/util/Map;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RrUploadInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long time;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final Map<String, Object> params;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fwVer;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] bytes;

    public RrUploadInfo(long j, @NotNull Map<String, Object> map, int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull byte[] bArr) {
        this.time = j;
        this.params = map;
        this.source = i;
        this.deviceId = str;
        this.sn = str2;
        this.fwVer = str3;
        this.bytes = bArr;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @NotNull
    public final Map<String, Object> component2() {
        return this.params;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSource() {
        return this.source;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFwVer() {
        return this.fwVer;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final RrUploadInfo copy(long time, @NotNull Map<String, Object> params, int source, @NotNull String deviceId, @NotNull String sn, @NotNull String fwVer, @NotNull byte[] bytes) {
        return new RrUploadInfo(time, params, source, deviceId, sn, fwVer, bytes);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RrUploadInfo)) {
            return false;
        }
        RrUploadInfo rrUploadInfo = (RrUploadInfo) other;
        return this.time == rrUploadInfo.time && Intrinsics.areEqual(this.params, rrUploadInfo.params) && this.source == rrUploadInfo.source && Intrinsics.areEqual(this.deviceId, rrUploadInfo.deviceId) && Intrinsics.areEqual(this.sn, rrUploadInfo.sn) && Intrinsics.areEqual(this.fwVer, rrUploadInfo.fwVer) && Intrinsics.areEqual(this.bytes, rrUploadInfo.bytes);
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final String getFwVer() {
        return this.fwVer;
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final int getSource() {
        return this.source;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return (((((((((((b.a(this.time) * 31) + this.params.hashCode()) * 31) + this.source) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.fwVer.hashCode()) * 31) + Arrays.hashCode(this.bytes);
    }

    @NotNull
    public String toString() {
        return "RrUploadInfo(time=" + this.time + ", params=" + this.params + ", source=" + this.source + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", fwVer=" + this.fwVer + ", bytes=" + Arrays.toString(this.bytes) + ")";
    }
}
