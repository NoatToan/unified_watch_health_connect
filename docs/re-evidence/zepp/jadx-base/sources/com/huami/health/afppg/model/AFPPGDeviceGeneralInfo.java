package com.huami.health.afppg.model;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/model/AFPPGDeviceGeneralInfo;", "", "", "isNull", "", "component1", "", "component2", "component3", "component4", "deviceSource", "fwVerStr", "sn", "deviceId", "copy", "toString", "hashCode", "other", "equals", LogUtil.I, "getDeviceSource", "()I", "Ljava/lang/String;", "getFwVerStr", "()Ljava/lang/String;", "getSn", "getDeviceId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AFPPGDeviceGeneralInfo {

    @NotNull
    private final String deviceId;
    private final int deviceSource;

    @NotNull
    private final String fwVerStr;

    @NotNull
    private final String sn;

    public AFPPGDeviceGeneralInfo() {
        this(0, null, null, null, 15, null);
    }

    public AFPPGDeviceGeneralInfo(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        this.deviceSource = i;
        this.fwVerStr = str;
        this.sn = str2;
        this.deviceId = str3;
    }

    public static /* synthetic */ AFPPGDeviceGeneralInfo copy$default(AFPPGDeviceGeneralInfo aFPPGDeviceGeneralInfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aFPPGDeviceGeneralInfo.deviceSource;
        }
        if ((i2 & 2) != 0) {
            str = aFPPGDeviceGeneralInfo.fwVerStr;
        }
        if ((i2 & 4) != 0) {
            str2 = aFPPGDeviceGeneralInfo.sn;
        }
        if ((i2 & 8) != 0) {
            str3 = aFPPGDeviceGeneralInfo.deviceId;
        }
        return aFPPGDeviceGeneralInfo.copy(i, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFwVerStr() {
        return this.fwVerStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    public final AFPPGDeviceGeneralInfo copy(int deviceSource, @NotNull String fwVerStr, @NotNull String sn, @NotNull String deviceId) {
        return new AFPPGDeviceGeneralInfo(deviceSource, fwVerStr, sn, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFPPGDeviceGeneralInfo)) {
            return false;
        }
        AFPPGDeviceGeneralInfo aFPPGDeviceGeneralInfo = (AFPPGDeviceGeneralInfo) other;
        return this.deviceSource == aFPPGDeviceGeneralInfo.deviceSource && Intrinsics.areEqual(this.fwVerStr, aFPPGDeviceGeneralInfo.fwVerStr) && Intrinsics.areEqual(this.sn, aFPPGDeviceGeneralInfo.sn) && Intrinsics.areEqual(this.deviceId, aFPPGDeviceGeneralInfo.deviceId);
    }

    @NotNull
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final String getFwVerStr() {
        return this.fwVerStr;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((((this.deviceSource * 31) + this.fwVerStr.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode();
    }

    public final boolean isNull() {
        return this.deviceSource == -1 && Intrinsics.areEqual(this.sn, "");
    }

    @NotNull
    public String toString() {
        return "AFPPGDeviceGeneralInfo(deviceSource=" + this.deviceSource + ", fwVerStr=" + this.fwVerStr + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ')';
    }

    public /* synthetic */ AFPPGDeviceGeneralInfo(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }
}
