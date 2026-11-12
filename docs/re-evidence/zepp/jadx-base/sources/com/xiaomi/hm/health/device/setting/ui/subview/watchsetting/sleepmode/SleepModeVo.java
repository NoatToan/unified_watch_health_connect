package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sleepmode;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeVo;", "", "", "component1", "()Ljava/lang/Boolean;", "component2", "sleepScreen", "smartEnable", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sleepmode/SleepModeVo;", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/Boolean;", "getSleepScreen", "b", "getSmartEnable", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepModeVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean sleepScreen;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @Nullable
    private final Boolean smartEnable;

    public SleepModeVo(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.sleepScreen = bool;
        this.smartEnable = bool2;
    }

    public static /* synthetic */ SleepModeVo copy$default(SleepModeVo sleepModeVo, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = sleepModeVo.sleepScreen;
        }
        if ((i & 2) != 0) {
            bool2 = sleepModeVo.smartEnable;
        }
        return sleepModeVo.copy(bool, bool2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getSleepScreen() {
        return this.sleepScreen;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSmartEnable() {
        return this.smartEnable;
    }

    @NotNull
    public final SleepModeVo copy(@Nullable Boolean sleepScreen, @Nullable Boolean smartEnable) {
        return new SleepModeVo(sleepScreen, smartEnable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepModeVo)) {
            return false;
        }
        SleepModeVo sleepModeVo = (SleepModeVo) other;
        return Intrinsics.areEqual(this.sleepScreen, sleepModeVo.sleepScreen) && Intrinsics.areEqual(this.smartEnable, sleepModeVo.smartEnable);
    }

    @Nullable
    public final Boolean getSleepScreen() {
        return this.sleepScreen;
    }

    @Nullable
    public final Boolean getSmartEnable() {
        return this.smartEnable;
    }

    public int hashCode() {
        Boolean bool = this.sleepScreen;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.smartEnable;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SleepModeVo(sleepScreen=" + this.sleepScreen + ", smartEnable=" + this.smartEnable + ")";
    }
}
