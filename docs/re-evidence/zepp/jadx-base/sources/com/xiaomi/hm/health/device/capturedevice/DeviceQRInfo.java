package com.xiaomi.hm.health.device.capturedevice;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/capturedevice/DeviceQRInfo;", "", "", "component1", "", "component2", "component3", "mac", "pnpNum", "pnpVersion", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getMac", "()Ljava/lang/String;", "b", LogUtil.I, "getPnpNum", "()I", "c", "getPnpVersion", "<init>", "(Ljava/lang/String;II)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceQRInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String mac;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int pnpNum;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int pnpVersion;

    public DeviceQRInfo(@NotNull String str, int i, int i2) {
        this.mac = str;
        this.pnpNum = i;
        this.pnpVersion = i2;
    }

    public static /* synthetic */ DeviceQRInfo copy$default(DeviceQRInfo deviceQRInfo, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = deviceQRInfo.mac;
        }
        if ((i3 & 2) != 0) {
            i = deviceQRInfo.pnpNum;
        }
        if ((i3 & 4) != 0) {
            i2 = deviceQRInfo.pnpVersion;
        }
        return deviceQRInfo.copy(str, i, i2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMac() {
        return this.mac;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPnpNum() {
        return this.pnpNum;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPnpVersion() {
        return this.pnpVersion;
    }

    @NotNull
    public final DeviceQRInfo copy(@NotNull String mac, int pnpNum, int pnpVersion) {
        return new DeviceQRInfo(mac, pnpNum, pnpVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceQRInfo)) {
            return false;
        }
        DeviceQRInfo deviceQRInfo = (DeviceQRInfo) other;
        return Intrinsics.areEqual(this.mac, deviceQRInfo.mac) && this.pnpNum == deviceQRInfo.pnpNum && this.pnpVersion == deviceQRInfo.pnpVersion;
    }

    @NotNull
    public final String getMac() {
        return this.mac;
    }

    public final int getPnpNum() {
        return this.pnpNum;
    }

    public final int getPnpVersion() {
        return this.pnpVersion;
    }

    public int hashCode() {
        return (((this.mac.hashCode() * 31) + this.pnpNum) * 31) + this.pnpVersion;
    }

    @NotNull
    public String toString() {
        return "DeviceQRInfo(mac=" + this.mac + ", pnpNum=" + this.pnpNum + ", pnpVersion=" + this.pnpVersion + ")";
    }
}
