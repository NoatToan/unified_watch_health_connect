package com.xiaomi.fitness.device.manager;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J$\u0010\u000b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/device/manager/OnSpecificDeviceStatusListener;", "Lcom/xiaomi/fitness/device/manager/OnDeviceFullStatusListener;", "<init>", "()V", "onSpecificDeviceConnectStart", "", "did", "", "model", "onSpecificDeviceConnectSuccess", "onSpecificDeviceDisconnect", "onSpecificDeviceConnectFailure", "errorCode", "", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class OnSpecificDeviceStatusListener extends OnDeviceFullStatusListener {
    public void onSpecificDeviceConnectFailure(@Nullable String did, @Nullable String model, int errorCode) {
    }

    public void onSpecificDeviceConnectStart(@Nullable String did, @Nullable String model) {
    }

    public void onSpecificDeviceConnectSuccess(@Nullable String did, @Nullable String model) {
    }

    public void onSpecificDeviceDisconnect(@Nullable String did, @Nullable String model) {
    }
}
