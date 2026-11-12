package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\b\u001a\u00020\u0007HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/AppsItemVo;", "", "", "component1", "", "component2", "component3", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "component4", "isSupport", "titleResId", "summaryResId", "deviceSource", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", LogUtil.I, "getTitleResId", "()I", "c", "getSummaryResId", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "getDeviceSource", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<init>", "(ZIILcom/xiaomi/hm/health/bt/device/HMDeviceSource;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class AppsItemVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int titleResId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int summaryResId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final HMDeviceSource deviceSource;

    public AppsItemVo(boolean z, int i, int i2, @NotNull HMDeviceSource hMDeviceSource) {
        this.isSupport = z;
        this.titleResId = i;
        this.summaryResId = i2;
        this.deviceSource = hMDeviceSource;
    }

    public static /* synthetic */ AppsItemVo copy$default(AppsItemVo appsItemVo, boolean z, int i, int i2, HMDeviceSource hMDeviceSource, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = appsItemVo.isSupport;
        }
        if ((i3 & 2) != 0) {
            i = appsItemVo.titleResId;
        }
        if ((i3 & 4) != 0) {
            i2 = appsItemVo.summaryResId;
        }
        if ((i3 & 8) != 0) {
            hMDeviceSource = appsItemVo.deviceSource;
        }
        return appsItemVo.copy(z, i, i2, hMDeviceSource);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSummaryResId() {
        return this.summaryResId;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    @NotNull
    public final AppsItemVo copy(boolean isSupport, int titleResId, int summaryResId, @NotNull HMDeviceSource deviceSource) {
        return new AppsItemVo(isSupport, titleResId, summaryResId, deviceSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppsItemVo)) {
            return false;
        }
        AppsItemVo appsItemVo = (AppsItemVo) other;
        return this.isSupport == appsItemVo.isSupport && this.titleResId == appsItemVo.titleResId && this.summaryResId == appsItemVo.summaryResId && this.deviceSource == appsItemVo.deviceSource;
    }

    @NotNull
    public final HMDeviceSource getDeviceSource() {
        return this.deviceSource;
    }

    public final int getSummaryResId() {
        return this.summaryResId;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.isSupport;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((((r0 * 31) + this.titleResId) * 31) + this.summaryResId) * 31) + this.deviceSource.hashCode();
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "AppsItemVo(isSupport=" + this.isSupport + ", titleResId=" + this.titleResId + ", summaryResId=" + this.summaryResId + ", deviceSource=" + this.deviceSource + ")";
    }
}
