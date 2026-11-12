package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.gesture;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainStateVo;", "", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "component1", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainState;", "component2", "gesture", "trainState", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "getGesture", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainState;", "getTrainState", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainState;", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureType;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/gesture/GestureTrainState;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final /* data */ class GestureTrainStateVo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final GestureType gesture;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final GestureTrainState trainState;

    public GestureTrainStateVo(@NotNull GestureType gestureType, @NotNull GestureTrainState gestureTrainState) {
        this.gesture = gestureType;
        this.trainState = gestureTrainState;
    }

    public static /* synthetic */ GestureTrainStateVo copy$default(GestureTrainStateVo gestureTrainStateVo, GestureType gestureType, GestureTrainState gestureTrainState, int i, Object obj) {
        if ((i & 1) != 0) {
            gestureType = gestureTrainStateVo.gesture;
        }
        if ((i & 2) != 0) {
            gestureTrainState = gestureTrainStateVo.trainState;
        }
        return gestureTrainStateVo.copy(gestureType, gestureTrainState);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GestureType getGesture() {
        return this.gesture;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GestureTrainState getTrainState() {
        return this.trainState;
    }

    @NotNull
    public final GestureTrainStateVo copy(@NotNull GestureType gesture, @NotNull GestureTrainState trainState) {
        return new GestureTrainStateVo(gesture, trainState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GestureTrainStateVo)) {
            return false;
        }
        GestureTrainStateVo gestureTrainStateVo = (GestureTrainStateVo) other;
        return this.gesture == gestureTrainStateVo.gesture && this.trainState == gestureTrainStateVo.trainState;
    }

    @NotNull
    public final GestureType getGesture() {
        return this.gesture;
    }

    @NotNull
    public final GestureTrainState getTrainState() {
        return this.trainState;
    }

    public int hashCode() {
        return (this.gesture.hashCode() * 31) + this.trainState.hashCode();
    }

    @NotNull
    public String toString() {
        return "GestureTrainStateVo(gesture=" + this.gesture + ", trainState=" + this.trainState + ")";
    }
}
