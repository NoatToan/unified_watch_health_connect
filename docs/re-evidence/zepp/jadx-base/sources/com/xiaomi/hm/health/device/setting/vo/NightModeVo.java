package com.xiaomi.hm.health.device.setting.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/vo/NightModeVo;", "", "", "component1", "", "component2", "component3", "component4", "isSupport", "mode", "startTime", "endTime", "copy", "", "toString", "hashCode", "other", "equals", "a", "Z", "()Z", "b", LogUtil.I, "getMode", "()I", "c", "getStartTime", GoogleApiAvailabilityLight.a, "getEndTime", "<init>", "(ZIII)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NightModeVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final boolean isSupport;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int startTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int endTime;

    public NightModeVo(boolean z, int i, int i2, int i3) {
        this.isSupport = z;
        this.mode = i;
        this.startTime = i2;
        this.endTime = i3;
    }

    public static /* synthetic */ NightModeVo copy$default(NightModeVo nightModeVo, boolean z, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z = nightModeVo.isSupport;
        }
        if ((i4 & 2) != 0) {
            i = nightModeVo.mode;
        }
        if ((i4 & 4) != 0) {
            i2 = nightModeVo.startTime;
        }
        if ((i4 & 8) != 0) {
            i3 = nightModeVo.endTime;
        }
        return nightModeVo.copy(z, i, i2, i3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSupport() {
        return this.isSupport;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    @NotNull
    public final NightModeVo copy(boolean isSupport, int mode, int startTime, int endTime) {
        return new NightModeVo(isSupport, mode, startTime, endTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NightModeVo)) {
            return false;
        }
        NightModeVo nightModeVo = (NightModeVo) other;
        return this.isSupport == nightModeVo.isSupport && this.mode == nightModeVo.mode && this.startTime == nightModeVo.startTime && this.endTime == nightModeVo.endTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getStartTime() {
        return this.startTime;
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
        return (((((r0 * 31) + this.mode) * 31) + this.startTime) * 31) + this.endTime;
    }

    public final boolean isSupport() {
        return this.isSupport;
    }

    @NotNull
    public String toString() {
        return "NightModeVo(isSupport=" + this.isSupport + ", mode=" + this.mode + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }
}
