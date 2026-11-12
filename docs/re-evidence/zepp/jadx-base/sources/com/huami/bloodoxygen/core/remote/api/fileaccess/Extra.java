package com.huami.bloodoxygen.core.remote.api.fileaccess;

import androidx.annotation.Keep;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/huami/bloodoxygen/core/remote/api/fileaccess/Extra;", "", "", "component1", "", "component2", "component3", "component4", "appName", "deviceSource", "sn", "deviceId", "copy", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getAppName", "()Ljava/lang/String;", LogUtil.I, "getDeviceSource", "()I", "getSn", "getDeviceId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Extra {

    @NotNull
    private final String appName;

    @NotNull
    private final String deviceId;
    private final int deviceSource;

    @NotNull
    private final String sn;

    public Extra(@NotNull String str, int i, @NotNull String str2, @NotNull String str3) {
        this.appName = str;
        this.deviceSource = i;
        this.sn = str2;
        this.deviceId = str3;
    }

    public static /* synthetic */ Extra copy$default(Extra extra, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = extra.appName;
        }
        if ((i2 & 2) != 0) {
            i = extra.deviceSource;
        }
        if ((i2 & 4) != 0) {
            str2 = extra.sn;
        }
        if ((i2 & 8) != 0) {
            str3 = extra.deviceId;
        }
        return extra.copy(str, i, str2, str3);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
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
    public final Extra copy(@NotNull String appName, int deviceSource, @NotNull String sn, @NotNull String deviceId) {
        return new Extra(appName, deviceSource, sn, deviceId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Extra)) {
            return false;
        }
        Extra extra = (Extra) other;
        return Intrinsics.areEqual(this.appName, extra.appName) && this.deviceSource == extra.deviceSource && Intrinsics.areEqual(this.sn, extra.sn) && Intrinsics.areEqual(this.deviceId, extra.deviceId);
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
        return (((((this.appName.hashCode() * 31) + this.deviceSource) * 31) + this.sn.hashCode()) * 31) + this.deviceId.hashCode();
    }

    @NotNull
    public String toString() {
        return "Extra(appName=" + this.appName + ", deviceSource=" + this.deviceSource + ", sn=" + this.sn + ", deviceId=" + this.deviceId + ")";
    }
}
