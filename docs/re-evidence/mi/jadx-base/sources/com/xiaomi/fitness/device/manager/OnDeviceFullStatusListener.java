package com.xiaomi.fitness.device.manager;

import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u001a\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\u000f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0013\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/device/manager/OnDeviceFullStatusListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "onInit", "", "did", "", "isReadded", "", "onBind", "isRebind", LifecycleConstantKt.ON_DESTROY, "isRemoved", "onConnectStart", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OnDeviceFullStatusListener implements OnDeviceStatusListener {
    public void onBind(@Nullable String did, boolean isRebind) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
    }

    public void onDestroy(@Nullable String did, boolean isRemoved) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
    }

    public void onInit(@Nullable String did, boolean isReadded) {
    }
}
