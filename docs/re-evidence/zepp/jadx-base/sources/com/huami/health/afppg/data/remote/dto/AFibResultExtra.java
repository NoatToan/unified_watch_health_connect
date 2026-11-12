package com.huami.health.afppg.data.remote.dto;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB/\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/data/remote/dto/AFibResultExtra;", "", "", "component1", "component2", "component3", "", "component4", "sn", "deviceId", "appName", "deviceSource", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getSn", "()Ljava/lang/String;", "getDeviceId", "getAppName", LogUtil.I, "getDeviceSource", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AFibResultExtra {

    @NotNull
    private static final String DEFAULT_APP_NAME = "com.huami.shushan";
    private static final int DEFAULT_DEVICE_SOURCE = -1;

    @NotNull
    private final String appName;

    @NotNull
    private final String deviceId;
    private final int deviceSource;

    @NotNull
    private final String sn;

    public AFibResultExtra() {
        this(null, null, null, 0, 15, null);
    }

    public AFibResultExtra(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        this.sn = str;
        this.deviceId = str2;
        this.appName = str3;
        this.deviceSource = i;
    }

    public static /* synthetic */ AFibResultExtra copy$default(AFibResultExtra aFibResultExtra, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = aFibResultExtra.sn;
        }
        if ((i2 & 2) != 0) {
            str2 = aFibResultExtra.deviceId;
        }
        if ((i2 & 4) != 0) {
            str3 = aFibResultExtra.appName;
        }
        if ((i2 & 8) != 0) {
            i = aFibResultExtra.deviceSource;
        }
        return aFibResultExtra.copy(str, str2, str3, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final AFibResultExtra copy(@NotNull String sn, @NotNull String deviceId, @NotNull String appName, int deviceSource) {
        return new AFibResultExtra(sn, deviceId, appName, deviceSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AFibResultExtra)) {
            return false;
        }
        AFibResultExtra aFibResultExtra = (AFibResultExtra) other;
        return Intrinsics.areEqual(this.sn, aFibResultExtra.sn) && Intrinsics.areEqual(this.deviceId, aFibResultExtra.deviceId) && Intrinsics.areEqual(this.appName, aFibResultExtra.appName) && this.deviceSource == aFibResultExtra.deviceSource;
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
    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return (((((this.sn.hashCode() * 31) + this.deviceId.hashCode()) * 31) + this.appName.hashCode()) * 31) + this.deviceSource;
    }

    @NotNull
    public String toString() {
        return "AFibResultExtra(sn=" + this.sn + ", deviceId=" + this.deviceId + ", appName=" + this.appName + ", deviceSource=" + this.deviceSource + ')';
    }

    public /* synthetic */ AFibResultExtra(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? DEFAULT_APP_NAME : str3, (i2 & 8) != 0 ? -1 : i);
    }
}
