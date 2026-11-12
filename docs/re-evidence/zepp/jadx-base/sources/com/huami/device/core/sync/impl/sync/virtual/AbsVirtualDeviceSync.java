package com.huami.device.core.sync.impl.sync.virtual;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.Cancelable;
import com.huami.device.core.sync.api.SyncApi;
import com.huami.device.core.sync.api.SyncStrategy;
import com.huami.device.core.sync.impl.sync.inject.InjectDevice;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/huami/device/core/sync/impl/sync/virtual/AbsVirtualDeviceSync;", "Lcom/huami/device/core/sync/api/SyncApi;", "Lcom/huami/device/core/sync/impl/sync/inject/InjectDevice;", "Lcom/huami/device/core/sync/api/Cancelable;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "", "onInject", "Lcom/huami/device/core/sync/api/SyncStrategy;", "strategy", "Lcom/huami/device/core/sync/api/SyncStrategy;", "getStrategy", "()Lcom/huami/device/core/sync/api/SyncStrategy;", "setStrategy", "(Lcom/huami/device/core/sync/api/SyncStrategy;)V", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "getDevice", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "setDevice", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsVirtualDeviceSync implements SyncApi, InjectDevice, Cancelable {

    @Nullable
    private HMBaseDevice device;

    @Nullable
    private SyncStrategy strategy = SyncCenterFactory.INSTANCE.getSyncStrategy();

    @Nullable
    public final HMBaseDevice getDevice() {
        return this.device;
    }

    @Nullable
    public final SyncStrategy getStrategy() {
        return this.strategy;
    }

    @Override // com.huami.device.core.sync.impl.sync.inject.InjectDevice
    public void onInject(@NotNull HMBaseDevice device) {
        this.device = device;
    }

    public final void setDevice(@Nullable HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    public final void setStrategy(@Nullable SyncStrategy syncStrategy) {
        this.strategy = syncStrategy;
    }
}
