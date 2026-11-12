package com.huami.health.afppg.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/huami/health/afppg/model/DeviceConfig;", "", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "fwVer", "sn", "deviceId", "userId", "appName", "deviceSource", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getFwVer", "()Ljava/lang/String;", "b", "getSn", "c", "getDeviceId", GoogleApiAvailabilityLight.a, "getUserId", "e", "getAppName", "f", LogUtil.I, "getDeviceSource", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceConfig {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String fwVer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String sn;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final String appName;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    public DeviceConfig() {
        this(null, null, null, null, null, 0, 63, null);
    }

    public DeviceConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i) {
        this.fwVer = str;
        this.sn = str2;
        this.deviceId = str3;
        this.userId = str4;
        this.appName = str5;
        this.deviceSource = i;
    }

    public static /* synthetic */ DeviceConfig copy$default(DeviceConfig deviceConfig, String str, String str2, String str3, String str4, String str5, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceConfig.fwVer;
        }
        if ((i2 & 2) != 0) {
            str2 = deviceConfig.sn;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = deviceConfig.deviceId;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = deviceConfig.userId;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            str5 = deviceConfig.appName;
        }
        String str9 = str5;
        if ((i2 & 32) != 0) {
            i = deviceConfig.deviceSource;
        }
        return deviceConfig.copy(str, str6, str7, str8, str9, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFwVer() {
        return this.fwVer;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final DeviceConfig copy(@NotNull String fwVer, @NotNull String sn, @NotNull String deviceId, @NotNull String userId, @NotNull String appName, int deviceSource) {
        return new DeviceConfig(fwVer, sn, deviceId, userId, appName, deviceSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceConfig)) {
            return false;
        }
        DeviceConfig deviceConfig = (DeviceConfig) other;
        return Intrinsics.areEqual(this.fwVer, deviceConfig.fwVer) && Intrinsics.areEqual(this.sn, deviceConfig.sn) && Intrinsics.areEqual(this.deviceId, deviceConfig.deviceId) && Intrinsics.areEqual(this.userId, deviceConfig.userId) && Intrinsics.areEqual(this.appName, deviceConfig.appName) && this.deviceSource == deviceConfig.deviceSource;
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
    public final String getFwVer() {
        return this.fwVer;
    }

    @NotNull
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return (((((((((this.fwVer.hashCode() * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.deviceSource;
    }

    @NotNull
    public String toString() {
        return "DeviceConfig(fwVer=" + this.fwVer + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ", userId=" + this.userId + ", appName=" + this.appName + ", deviceSource=" + this.deviceSource + ')';
    }

    public /* synthetic */ DeviceConfig(String str, String str2, String str3, String str4, String str5, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) == 0 ? str5 : "", (i2 & 32) != 0 ? 0 : i);
    }
}
