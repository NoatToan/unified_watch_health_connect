package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.ecg.core.db.entity.EcgData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\n\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003JY\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0019\u0010\u000f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0019\u0010\u0011\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0012\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\u0013\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001f\u001a\u0004\b%\u0010!¨\u0006("}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/HeartHealthExtra;", "", "", "component1", "component2", "component3", "", "component4", "component5", "component6", "component7", "component8", "duration", "highHr", "lowHr", EcgData.DIAGNOSIS, "deviceSource", "appName", "sn", "deviceId", "copy", "toString", "hashCode", "other", "", "equals", LogUtil.I, "getDuration", "()I", "getHighHr", "getLowHr", "Ljava/lang/String;", "getDiagnosis", "()Ljava/lang/String;", "getDeviceSource", "getAppName", "getSn", "getDeviceId", "<init>", "(IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HeartHealthExtra {

    @NotNull
    private final String appName;

    @NotNull
    private final String deviceId;
    private final int deviceSource;

    @NotNull
    private final String diagnosis;
    private final int duration;
    private final int highHr;
    private final int lowHr;

    @NotNull
    private final String sn;

    public HeartHealthExtra() {
        this(0, 0, 0, null, 0, null, null, null, 255, null);
    }

    public HeartHealthExtra(int i, int i2, int i3, @NotNull String str, int i4, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.duration = i;
        this.highHr = i2;
        this.lowHr = i3;
        this.diagnosis = str;
        this.deviceSource = i4;
        this.appName = str2;
        this.sn = str3;
        this.deviceId = str4;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHighHr() {
        return this.highHr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowHr() {
        return this.lowHr;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final HeartHealthExtra copy(int duration, int highHr, int lowHr, @NotNull String diagnosis, int deviceSource, @NotNull String appName, @NotNull String sn, @NotNull String deviceId) {
        return new HeartHealthExtra(duration, highHr, lowHr, diagnosis, deviceSource, appName, sn, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartHealthExtra)) {
            return false;
        }
        HeartHealthExtra heartHealthExtra = (HeartHealthExtra) other;
        return this.duration == heartHealthExtra.duration && this.highHr == heartHealthExtra.highHr && this.lowHr == heartHealthExtra.lowHr && Intrinsics.areEqual(this.diagnosis, heartHealthExtra.diagnosis) && this.deviceSource == heartHealthExtra.deviceSource && Intrinsics.areEqual(this.appName, heartHealthExtra.appName) && Intrinsics.areEqual(this.sn, heartHealthExtra.sn) && Intrinsics.areEqual(this.deviceId, heartHealthExtra.deviceId);
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getHighHr() {
        return this.highHr;
    }

    public final int getLowHr() {
        return this.lowHr;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((((((((((((this.duration * 31) + this.highHr) * 31) + this.lowHr) * 31) + this.diagnosis.hashCode()) * 31) + this.deviceSource) * 31) + this.appName.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "HeartHealthExtra(duration=" + this.duration + ", highHr=" + this.highHr + ", lowHr=" + this.lowHr + ", diagnosis=" + this.diagnosis + ", deviceSource=" + this.deviceSource + ", appName=" + this.appName + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ')';
    }

    public /* synthetic */ HeartHealthExtra(int i, int i2, int i3, String str, int i4, String str2, String str3, String str4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? -1 : i, (i5 & 2) != 0 ? -1 : i2, (i5 & 4) != 0 ? -1 : i3, (i5 & 8) != 0 ? "" : str, (i5 & 16) == 0 ? i4 : -1, (i5 & 32) != 0 ? "" : str2, (i5 & 64) != 0 ? "" : str3, (i5 & 128) == 0 ? str4 : "");
    }
}
