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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003J\t\u0010\n\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003Je\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b#\u0010!R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\u0013\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b(\u0010\u001e¨\u0006+"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/AtrialFibrillationExtra;", "", "", "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "eventType", "duration", "lowHr", "highHr", EcgData.DIAGNOSIS, "deviceSource", "deviceId", "sn", "appName", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", LogUtil.I, "getDuration", "()I", "getLowHr", "getHighHr", "getDiagnosis", "getDeviceSource", "getDeviceId", "getSn", "getAppName", "<init>", "(Ljava/lang/String;IIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AtrialFibrillationExtra {

    @NotNull
    private final String appName;

    @NotNull
    private final String deviceId;
    private final int deviceSource;

    @Nullable
    private final String diagnosis;
    private final int duration;

    @NotNull
    private final String eventType;
    private final int highHr;
    private final int lowHr;

    @NotNull
    private final String sn;

    public AtrialFibrillationExtra() {
        this(null, 0, 0, 0, null, 0, null, null, null, 511, null);
    }

    public AtrialFibrillationExtra(@NotNull String str, int i, int i2, int i3, @Nullable String str2, int i4, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this.eventType = str;
        this.duration = i;
        this.lowHr = i2;
        this.highHr = i3;
        this.diagnosis = str2;
        this.deviceSource = i4;
        this.deviceId = str3;
        this.sn = str4;
        this.appName = str5;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEventType() {
        return this.eventType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLowHr() {
        return this.lowHr;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getHighHr() {
        return this.highHr;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final AtrialFibrillationExtra copy(@NotNull String eventType, int duration, int lowHr, int highHr, @Nullable String diagnosis, int deviceSource, @NotNull String deviceId, @NotNull String sn, @NotNull String appName) {
        return new AtrialFibrillationExtra(eventType, duration, lowHr, highHr, diagnosis, deviceSource, deviceId, sn, appName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AtrialFibrillationExtra)) {
            return false;
        }
        AtrialFibrillationExtra atrialFibrillationExtra = (AtrialFibrillationExtra) other;
        return Intrinsics.areEqual(this.eventType, atrialFibrillationExtra.eventType) && this.duration == atrialFibrillationExtra.duration && this.lowHr == atrialFibrillationExtra.lowHr && this.highHr == atrialFibrillationExtra.highHr && Intrinsics.areEqual(this.diagnosis, atrialFibrillationExtra.diagnosis) && this.deviceSource == atrialFibrillationExtra.deviceSource && Intrinsics.areEqual(this.deviceId, atrialFibrillationExtra.deviceId) && Intrinsics.areEqual(this.sn, atrialFibrillationExtra.sn) && Intrinsics.areEqual(this.appName, atrialFibrillationExtra.appName);
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

    @Nullable
    public final String getDiagnosis() {
        return this.diagnosis;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getEventType() {
        return this.eventType;
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
        int iHashCode = ((((((this.eventType.hashCode() * 31) + this.duration) * 31) + this.lowHr) * 31) + this.highHr) * 31;
        String str = this.diagnosis;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.deviceSource) * 31) + this.deviceId.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.appName.hashCode();
    }

    @NotNull
    public String toString() {
        return "AtrialFibrillationExtra(eventType=" + this.eventType + ", duration=" + this.duration + ", lowHr=" + this.lowHr + ", highHr=" + this.highHr + ", diagnosis=" + ((Object) this.diagnosis) + ", deviceSource=" + this.deviceSource + ", deviceId=" + this.deviceId + ", sn=" + this.sn + ", appName=" + this.appName + ')';
    }

    public /* synthetic */ AtrialFibrillationExtra(String str, int i, int i2, int i3, String str2, int i4, String str3, String str4, String str5, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? 0 : i, (i5 & 4) != 0 ? 0 : i2, (i5 & 8) != 0 ? 0 : i3, (i5 & 16) != 0 ? "" : str2, (i5 & 32) == 0 ? i4 : 0, (i5 & 64) != 0 ? "" : str3, (i5 & 128) != 0 ? "" : str4, (i5 & 256) == 0 ? str5 : "");
    }
}
