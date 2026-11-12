package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b@\u0010AJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\t\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003Jw\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0002HÆ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0002HÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010!\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\"\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u0014\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010-\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\"\u0010\u0015\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R\"\u0010\u0016\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010!\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%R\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b8\u0010#\"\u0004\b9\u0010%R\"\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\"\u0010\u0019\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010(\u001a\u0004\b<\u0010*\"\u0004\b=\u0010,R\"\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b>\u0010#\"\u0004\b?\u0010%¨\u0006B"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/RRPeakSummary;", "", "", "component1", "component2", "", "component3", "", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "deviceSource", "dataType", "fwVer", SessionDescription.p, "lastRrPackageTime", "afData", "rrRecordSize", "afResult", "sn", "deviceId", "timeZone", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getDeviceSource", "()I", "setDeviceSource", "(I)V", "getDataType", "setDataType", "Ljava/lang/String;", "getFwVer", "()Ljava/lang/String;", "setFwVer", "(Ljava/lang/String;)V", "J", "getLength", "()J", "setLength", "(J)V", "getLastRrPackageTime", "setLastRrPackageTime", "getAfData", "setAfData", "getRrRecordSize", "setRrRecordSize", "getAfResult", "setAfResult", "getSn", "setSn", "getDeviceId", "setDeviceId", "getTimeZone", "setTimeZone", "<init>", "(IILjava/lang/String;JJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;I)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RRPeakSummary {

    @NotNull
    private String afData;
    private int afResult;
    private int dataType;

    @NotNull
    private String deviceId;
    private int deviceSource;

    @NotNull
    private String fwVer;
    private long lastRrPackageTime;
    private long length;
    private int rrRecordSize;

    @NotNull
    private String sn;
    private int timeZone;

    public RRPeakSummary() {
        this(0, 0, null, 0L, 0L, null, 0, 0, null, null, 0, 2047, null);
    }

    public RRPeakSummary(int i, int i2, @NotNull String str, long j, long j2, @NotNull String str2, int i3, int i4, @NotNull String str3, @NotNull String str4, int i5) {
        this.deviceSource = i;
        this.dataType = i2;
        this.fwVer = str;
        this.length = j;
        this.lastRrPackageTime = j2;
        this.afData = str2;
        this.rrRecordSize = i3;
        this.afResult = i4;
        this.sn = str3;
        this.deviceId = str4;
        this.timeZone = i5;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getTimeZone() {
        return this.timeZone;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFwVer() {
        return this.fwVer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLength() {
        return this.length;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastRrPackageTime() {
        return this.lastRrPackageTime;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAfData() {
        return this.afData;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getRrRecordSize() {
        return this.rrRecordSize;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getAfResult() {
        return this.afResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final RRPeakSummary copy(int deviceSource, int dataType, @NotNull String fwVer, long length, long lastRrPackageTime, @NotNull String afData, int rrRecordSize, int afResult, @NotNull String sn, @NotNull String deviceId, int timeZone) {
        return new RRPeakSummary(deviceSource, dataType, fwVer, length, lastRrPackageTime, afData, rrRecordSize, afResult, sn, deviceId, timeZone);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RRPeakSummary)) {
            return false;
        }
        RRPeakSummary rRPeakSummary = (RRPeakSummary) other;
        return this.deviceSource == rRPeakSummary.deviceSource && this.dataType == rRPeakSummary.dataType && Intrinsics.areEqual(this.fwVer, rRPeakSummary.fwVer) && this.length == rRPeakSummary.length && this.lastRrPackageTime == rRPeakSummary.lastRrPackageTime && Intrinsics.areEqual(this.afData, rRPeakSummary.afData) && this.rrRecordSize == rRPeakSummary.rrRecordSize && this.afResult == rRPeakSummary.afResult && Intrinsics.areEqual(this.sn, rRPeakSummary.sn) && Intrinsics.areEqual(this.deviceId, rRPeakSummary.deviceId) && this.timeZone == rRPeakSummary.timeZone;
    }

    @NotNull
    public final String getAfData() {
        return this.afData;
    }

    public final int getAfResult() {
        return this.afResult;
    }

    public final int getDataType() {
        return this.dataType;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getFwVer() {
        return this.fwVer;
    }

    public final long getLastRrPackageTime() {
        return this.lastRrPackageTime;
    }

    public final long getLength() {
        return this.length;
    }

    public final int getRrRecordSize() {
        return this.rrRecordSize;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public final int getTimeZone() {
        return this.timeZone;
    }

    public int hashCode() {
        return (((((((((((((((((((this.deviceSource * 31) + this.dataType) * 31) + this.fwVer.hashCode()) * 31) + b.a(this.length)) * 31) + b.a(this.lastRrPackageTime)) * 31) + this.afData.hashCode()) * 31) + this.rrRecordSize) * 31) + this.afResult) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.timeZone;
    }

    public final void setAfData(@NotNull String str) {
        this.afData = str;
    }

    public final void setAfResult(int i) {
        this.afResult = i;
    }

    public final void setDataType(int i) {
        this.dataType = i;
    }

    public final void setDeviceId(@NotNull String str) {
        this.deviceId = str;
    }

    public final void setDeviceSource(int i) {
        this.deviceSource = i;
    }

    public final void setFwVer(@NotNull String str) {
        this.fwVer = str;
    }

    public final void setLastRrPackageTime(long j) {
        this.lastRrPackageTime = j;
    }

    public final void setLength(long j) {
        this.length = j;
    }

    public final void setRrRecordSize(int i) {
        this.rrRecordSize = i;
    }

    public final void setSn(@NotNull String str) {
        this.sn = str;
    }

    public final void setTimeZone(int i) {
        this.timeZone = i;
    }

    @NotNull
    public String toString() {
        return "RRPeakSummary(deviceSource=" + this.deviceSource + ", dataType=" + this.dataType + ", fwVer=" + this.fwVer + ", length=" + this.length + ", lastRrPackageTime=" + this.lastRrPackageTime + ", afData=" + this.afData + ", rrRecordSize=" + this.rrRecordSize + ", afResult=" + this.afResult + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ", timeZone=" + this.timeZone + ')';
    }

    public /* synthetic */ RRPeakSummary(int i, int i2, String str, long j, long j2, String str2, int i3, int i4, String str3, String str4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 32 : i, (i6 & 2) != 0 ? -1 : i2, (i6 & 4) != 0 ? "0" : str, (i6 & 8) != 0 ? -1L : j, (i6 & 16) == 0 ? j2 : -1L, (i6 & 32) != 0 ? "0" : str2, (i6 & 64) != 0 ? -1 : i3, (i6 & 128) == 0 ? i4 : -1, (i6 & 256) != 0 ? "0" : str3, (i6 & 512) == 0 ? str4 : "0", (i6 & 1024) != 0 ? 8 : i5);
    }
}
