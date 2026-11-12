package com.xiaomi.hm.health.device.setting.vo;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\u0004HÆ\u0003JE\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0019\u0010\r\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0019\u0010\u000e\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\u000f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001e¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/VersionItemVo;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component1", "", "component2", "component3", "component4", "component5", "component6", "deviceSource", "showFwUpgrade", "showRedDot", "hasFwUpgrade", "supportBatchUpgrade", "supportContinueUpgrade", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "b", "Z", "getShowFwUpgrade", "()Z", "c", "getShowRedDot", GoogleApiAvailabilityLight.a, "getHasFwUpgrade", "e", "getSupportBatchUpgrade", "f", "getSupportContinueUpgrade", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;ZZZZZ)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class VersionItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceSource deviceSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final boolean showFwUpgrade;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean showRedDot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean hasFwUpgrade;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    private final boolean supportBatchUpgrade;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    private final boolean supportContinueUpgrade;

    public VersionItemVo(@NotNull HMDeviceSource hMDeviceSource, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.deviceSource = hMDeviceSource;
        this.showFwUpgrade = z;
        this.showRedDot = z2;
        this.hasFwUpgrade = z3;
        this.supportBatchUpgrade = z4;
        this.supportContinueUpgrade = z5;
    }

    public static /* synthetic */ VersionItemVo copy$default(VersionItemVo versionItemVo, HMDeviceSource hMDeviceSource, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            hMDeviceSource = versionItemVo.deviceSource;
        }
        if ((i & 2) != 0) {
            z = versionItemVo.showFwUpgrade;
        }
        boolean z6 = z;
        if ((i & 4) != 0) {
            z2 = versionItemVo.showRedDot;
        }
        boolean z7 = z2;
        if ((i & 8) != 0) {
            z3 = versionItemVo.hasFwUpgrade;
        }
        boolean z8 = z3;
        if ((i & 16) != 0) {
            z4 = versionItemVo.supportBatchUpgrade;
        }
        boolean z9 = z4;
        if ((i & 32) != 0) {
            z5 = versionItemVo.supportContinueUpgrade;
        }
        return versionItemVo.copy(hMDeviceSource, z6, z7, z8, z9, z5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getShowFwUpgrade() {
        return this.showFwUpgrade;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasFwUpgrade() {
        return this.hasFwUpgrade;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSupportBatchUpgrade() {
        return this.supportBatchUpgrade;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getSupportContinueUpgrade() {
        return this.supportContinueUpgrade;
    }

    @NotNull
    public final VersionItemVo copy(@NotNull HMDeviceSource deviceSource, boolean showFwUpgrade, boolean showRedDot, boolean hasFwUpgrade, boolean supportBatchUpgrade, boolean supportContinueUpgrade) {
        return new VersionItemVo(deviceSource, showFwUpgrade, showRedDot, hasFwUpgrade, supportBatchUpgrade, supportContinueUpgrade);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VersionItemVo)) {
            return false;
        }
        VersionItemVo versionItemVo = (VersionItemVo) other;
        return this.deviceSource == versionItemVo.deviceSource && this.showFwUpgrade == versionItemVo.showFwUpgrade && this.showRedDot == versionItemVo.showRedDot && this.hasFwUpgrade == versionItemVo.hasFwUpgrade && this.supportBatchUpgrade == versionItemVo.supportBatchUpgrade && this.supportContinueUpgrade == versionItemVo.supportContinueUpgrade;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    public final boolean getHasFwUpgrade() {
        return this.hasFwUpgrade;
    }

    public final boolean getShowFwUpgrade() {
        return this.showFwUpgrade;
    }

    public final boolean getShowRedDot() {
        return this.showRedDot;
    }

    public final boolean getSupportBatchUpgrade() {
        return this.supportBatchUpgrade;
    }

    public final boolean getSupportContinueUpgrade() {
        return this.supportContinueUpgrade;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.deviceSource.hashCode() * 31;
        boolean z = this.showFwUpgrade;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.showRedDot;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (i + r2) * 31;
        boolean z3 = this.hasFwUpgrade;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i3 = (i2 + r3) * 31;
        boolean z4 = this.supportBatchUpgrade;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int i4 = (i3 + r4) * 31;
        boolean z5 = this.supportContinueUpgrade;
        return i4 + (z5 ? 1 : z5);
    }

    @NotNull
    public String toString() {
        return "VersionItemVo(deviceSource=" + this.deviceSource + ", showFwUpgrade=" + this.showFwUpgrade + ", showRedDot=" + this.showRedDot + ", hasFwUpgrade=" + this.hasFwUpgrade + ", supportBatchUpgrade=" + this.supportBatchUpgrade + ", supportContinueUpgrade=" + this.supportContinueUpgrade + ")";
    }

    public /* synthetic */ VersionItemVo(HMDeviceSource hMDeviceSource, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hMDeviceSource, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) == 0 ? z5 : false);
    }
}
