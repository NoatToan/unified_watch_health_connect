package com.xiaomi.hm.health.device.event;

import com.xiaomi.hm.health.bt.device.HMDeviceType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/event/HmDeviceResetEvent;", "Lcom/xiaomi/hm/health/device/event/HMDeviceEvent;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "b", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getType", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceType;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmDeviceResetEvent extends HMDeviceEvent {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMDeviceType type;

    public HmDeviceResetEvent(@NotNull HMDeviceType hMDeviceType) {
        super(hMDeviceType);
        this.type = hMDeviceType;
    }

    @NotNull
    public final HMDeviceType getType() {
        return this.type;
    }
}
