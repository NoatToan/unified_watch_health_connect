package com.xiaomi.hm.health.device.setting.vo;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0007\u0010\u0012R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\b\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/DeviceUnlockScreenVo;", "", "", "component1", "component2", "component3", "isSupport", "isMIUI", "isEnable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Z", "()Z", "b", "c", "<init>", "(ZZZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class DeviceUnlockScreenVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean isMIUI;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean isEnable;

    public DeviceUnlockScreenVo(boolean z, boolean z2, boolean z3) {
        this.isSupport = z;
        this.isMIUI = z2;
        this.isEnable = z3;
    }

    public static /* synthetic */ DeviceUnlockScreenVo copy$default(DeviceUnlockScreenVo deviceUnlockScreenVo, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = deviceUnlockScreenVo.isSupport;
        }
        if ((i & 2) != 0) {
            z2 = deviceUnlockScreenVo.isMIUI;
        }
        if ((i & 4) != 0) {
            z3 = deviceUnlockScreenVo.isEnable;
        }
        return deviceUnlockScreenVo.copy(z, z2, z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsMIUI() {
        return this.isMIUI;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final DeviceUnlockScreenVo copy(boolean isSupport, boolean isMIUI, boolean isEnable) {
        return new DeviceUnlockScreenVo(isSupport, isMIUI, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceUnlockScreenVo)) {
            return false;
        }
        DeviceUnlockScreenVo deviceUnlockScreenVo = (DeviceUnlockScreenVo) other;
        return this.isSupport == deviceUnlockScreenVo.isSupport && this.isMIUI == deviceUnlockScreenVo.isMIUI && this.isEnable == deviceUnlockScreenVo.isEnable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.isMIUI;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.isEnable;
        return i2 + (z3 ? 1 : z3);
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final boolean isMIUI() {
        return this.isMIUI;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "DeviceUnlockScreenVo(isSupport=" + this.isSupport + ", isMIUI=" + this.isMIUI + ", isEnable=" + this.isEnable + ")";
    }
}
