package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureStatusVo;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "component1", "", "component2", "gesture", "status", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "getGesture", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "b", "Z", "getStatus", "()Z", "setStatus", "(Z)V", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GestureStatusVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final GestureType gesture;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private boolean status;

    public GestureStatusVo(@NotNull GestureType gestureType, boolean z) {
        this.gesture = gestureType;
        this.status = z;
    }

    public static /* synthetic */ GestureStatusVo copy$default(GestureStatusVo gestureStatusVo, GestureType gestureType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            gestureType = gestureStatusVo.gesture;
        }
        if ((i & 2) != 0) {
            z = gestureStatusVo.status;
        }
        return gestureStatusVo.copy(gestureType, z);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GestureType getGesture() {
        return this.gesture;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    @NotNull
    public final GestureStatusVo copy(@NotNull GestureType gesture, boolean status) {
        return new GestureStatusVo(gesture, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GestureStatusVo)) {
            return false;
        }
        GestureStatusVo gestureStatusVo = (GestureStatusVo) other;
        return this.gesture == gestureStatusVo.gesture && this.status == gestureStatusVo.status;
    }

    @NotNull
    public final GestureType getGesture() {
        return this.gesture;
    }

    public final boolean getStatus() {
        return this.status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.gesture.hashCode() * 31;
        boolean z = this.status;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }

    @NotNull
    public String toString() {
        return "GestureStatusVo(gesture=" + this.gesture + ", status=" + this.status + ")";
    }
}
