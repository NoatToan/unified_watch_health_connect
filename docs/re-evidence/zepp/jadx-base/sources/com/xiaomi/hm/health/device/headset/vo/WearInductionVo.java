package com.xiaomi.hm.health.device.headset.vo;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0007\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/vo/WearInductionVo;", "", "", "component1", "()Ljava/lang/Boolean;", "component2", "wearInduction", "isEnable", "copy", "(Ljava/lang/Boolean;Z)Lcom/xiaomi/hm/health/device/headset/vo/WearInductionVo;", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getWearInduction", "setWearInduction", "(Ljava/lang/Boolean;)V", "b", "Z", "()Z", "setEnable", "(Z)V", "<init>", "(Ljava/lang/Boolean;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class WearInductionVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private Boolean wearInduction;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean isEnable;

    /* JADX WARN: Multi-variable type inference failed */
    public WearInductionVo() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public WearInductionVo(@Nullable Boolean bool, boolean z) {
        this.wearInduction = bool;
        this.isEnable = z;
    }

    public static /* synthetic */ WearInductionVo copy$default(WearInductionVo wearInductionVo, Boolean bool, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = wearInductionVo.wearInduction;
        }
        if ((i & 2) != 0) {
            z = wearInductionVo.isEnable;
        }
        return wearInductionVo.copy(bool, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getWearInduction() {
        return this.wearInduction;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsEnable() {
        return this.isEnable;
    }

    @NotNull
    public final WearInductionVo copy(@Nullable Boolean wearInduction, boolean isEnable) {
        return new WearInductionVo(wearInduction, isEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WearInductionVo)) {
            return false;
        }
        WearInductionVo wearInductionVo = (WearInductionVo) other;
        return Intrinsics.areEqual(this.wearInduction, wearInductionVo.wearInduction) && this.isEnable == wearInductionVo.isEnable;
    }

    @Nullable
    public final Boolean getWearInduction() {
        return this.wearInduction;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        Boolean bool = this.wearInduction;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
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

    public final void setWearInduction(@Nullable Boolean bool) {
        this.wearInduction = bool;
    }

    @NotNull
    public String toString() {
        return "WearInductionVo(wearInduction=" + this.wearInduction + ", isEnable=" + this.isEnable + ")";
    }

    public /* synthetic */ WearInductionVo(Boolean bool, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? false : z);
    }
}
