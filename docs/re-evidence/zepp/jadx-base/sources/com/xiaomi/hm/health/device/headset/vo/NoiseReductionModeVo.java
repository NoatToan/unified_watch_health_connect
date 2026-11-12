package com.xiaomi.hm.health.device.headset.vo;

import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/vo/NoiseReductionModeVo;", "", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "component1", "", "component2", "noiseControl", "isEnable", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "getNoiseControl", "()Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", "setNoiseControl", "(Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;)V", "b", "Z", "()Z", "setEnable", "(Z)V", "<init>", "(Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NoiseReductionModeVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private NoiseControl noiseControl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public NoiseReductionModeVo() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public NoiseReductionModeVo(@Nullable NoiseControl noiseControl, boolean z) {
        this.noiseControl = noiseControl;
        this.isEnable = z;
    }

    public static /* synthetic */ NoiseReductionModeVo copy$default(NoiseReductionModeVo noiseReductionModeVo, NoiseControl noiseControl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            noiseControl = noiseReductionModeVo.noiseControl;
        }
        if ((i & 2) != 0) {
            z = noiseReductionModeVo.isEnable;
        }
        return noiseReductionModeVo.copy(noiseControl, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NoiseControl getNoiseControl() {
        return this.noiseControl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final NoiseReductionModeVo copy(@Nullable NoiseControl noiseControl, boolean isEnable) {
        return new NoiseReductionModeVo(noiseControl, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NoiseReductionModeVo)) {
            return false;
        }
        NoiseReductionModeVo noiseReductionModeVo = (NoiseReductionModeVo) other;
        return Intrinsics.areEqual(this.noiseControl, noiseReductionModeVo.noiseControl) && this.isEnable == noiseReductionModeVo.isEnable;
    }

    @Nullable
    public final NoiseControl getNoiseControl() {
        return this.noiseControl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        NoiseControl noiseControl = this.noiseControl;
        int iHashCode = (noiseControl == null ? 0 : noiseControl.hashCode()) * 31;
        boolean z = this.isEnable;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final boolean isEnable() {
        return this.isEnable;
    }

    public final void setEnable(boolean z) {
        this.isEnable = z;
    }

    public final void setNoiseControl(@Nullable NoiseControl noiseControl) {
        this.noiseControl = noiseControl;
    }

    @NotNull
    public String toString() {
        return "NoiseReductionModeVo(noiseControl=" + this.noiseControl + ", isEnable=" + this.isEnable + ")";
    }

    public /* synthetic */ NoiseReductionModeVo(NoiseControl noiseControl, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : noiseControl, (i & 2) != 0 ? false : z);
    }
}
