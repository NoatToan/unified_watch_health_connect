package com.huami.third.wechat.ui.bind.bind;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\r¢\u0006\u0004\b5\u00106J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J[\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\rHÆ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0012\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0013\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b1\u0010\u001fR\u0019\u0010\u0016\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b\u0016\u00104¨\u00067"}, d2 = {"Lcom/huami/third/wechat/ui/bind/bind/DeviceBindInfo;", "", "", "component1", "component2", "", "component3", "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState;", "component4", "Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;", "component5", "component6", "component7", "", "component8", "deviceName", ParamKey.deviceSn, "deviceSource", "bindState", "deviceShape", "wxDeviceId", "bleAddress", "isActive", "copy", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getDeviceName", "()Ljava/lang/String;", "b", "getDeviceSn", "c", LogUtil.I, "getDeviceSource", "()I", GoogleApiAvailabilityLight.a, "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState;", "getBindState", "()Lcom/huami/third/wechat/ui/bind/bind/DeviceBindState;", "e", "Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;", "getDeviceShape", "()Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;", "f", "getWxDeviceId", "g", "getBleAddress", "h", "Z", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/huami/third/wechat/ui/bind/bind/DeviceBindState;Lcom/huami/third/wechat/ui/bind/bind/DeviceShape;Ljava/lang/String;Ljava/lang/String;Z)V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceBindInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String deviceSn;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int deviceSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final DeviceBindState bindState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    private final DeviceShape deviceShape;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    @Nullable
    private final String wxDeviceId;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @NotNull
    private final String bleAddress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    private final boolean isActive;

    public DeviceBindInfo(@NotNull String str, @NotNull String str2, int i, @NotNull DeviceBindState deviceBindState, @NotNull DeviceShape deviceShape, @Nullable String str3, @NotNull String str4, boolean z) {
        this.deviceName = str;
        this.deviceSn = str2;
        this.deviceSource = i;
        this.bindState = deviceBindState;
        this.deviceShape = deviceShape;
        this.wxDeviceId = str3;
        this.bleAddress = str4;
        this.isActive = z;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DeviceBindState getBindState() {
        return this.bindState;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DeviceShape getDeviceShape() {
        return this.deviceShape;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWxDeviceId() {
        return this.wxDeviceId;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getBleAddress() {
        return this.bleAddress;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final DeviceBindInfo copy(@NotNull String deviceName, @NotNull String deviceSn, int deviceSource, @NotNull DeviceBindState bindState, @NotNull DeviceShape deviceShape, @Nullable String wxDeviceId, @NotNull String bleAddress, boolean isActive) {
        return new DeviceBindInfo(deviceName, deviceSn, deviceSource, bindState, deviceShape, wxDeviceId, bleAddress, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceBindInfo)) {
            return false;
        }
        DeviceBindInfo deviceBindInfo = (DeviceBindInfo) other;
        return Intrinsics.areEqual(this.deviceName, deviceBindInfo.deviceName) && Intrinsics.areEqual(this.deviceSn, deviceBindInfo.deviceSn) && this.deviceSource == deviceBindInfo.deviceSource && this.bindState == deviceBindInfo.bindState && this.deviceShape == deviceBindInfo.deviceShape && Intrinsics.areEqual(this.wxDeviceId, deviceBindInfo.wxDeviceId) && Intrinsics.areEqual(this.bleAddress, deviceBindInfo.bleAddress) && this.isActive == deviceBindInfo.isActive;
    }

    @NotNull
    public final DeviceBindState getBindState() {
        return this.bindState;
    }

    @NotNull
    public final String getBleAddress() {
        return this.bleAddress;
    }

    @NotNull
    public final String getDeviceName() {
        return this.deviceName;
    }

    @NotNull
    public final DeviceShape getDeviceShape() {
        return this.deviceShape;
    }

    @NotNull
    public final String getDeviceSn() {
        return this.deviceSn;
    }

    public final int getDeviceSource() {
        return this.deviceSource;
    }

    @Nullable
    public final String getWxDeviceId() {
        return this.wxDeviceId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    public int hashCode() {
        int iHashCode = ((((((((this.deviceName.hashCode() * 31) + this.deviceSn.hashCode()) * 31) + this.deviceSource) * 31) + this.bindState.hashCode()) * 31) + this.deviceShape.hashCode()) * 31;
        String str = this.wxDeviceId;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.bleAddress.hashCode()) * 31;
        boolean z = this.isActive;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode2 + r1;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "DeviceBindInfo(deviceName=" + this.deviceName + ", deviceSn=" + this.deviceSn + ", deviceSource=" + this.deviceSource + ", bindState=" + this.bindState + ", deviceShape=" + this.deviceShape + ", wxDeviceId=" + this.wxDeviceId + ", bleAddress=" + this.bleAddress + ", isActive=" + this.isActive + ")";
    }
}
