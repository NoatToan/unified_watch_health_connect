package com.huami.phn.core.device.impl;

import com.huami.phn.core.device.BleException;
import com.huami.phn.core.device.DeviceChecker;
import com.huami.phn.core.device.DeviceManager;
import com.huami.phn.util.Result;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/phn/core/device/impl/DeviceCheckerImpl;", "Lcom/huami/phn/core/device/DeviceChecker;", "Lcom/huami/phn/util/Result;", "", "Lcom/huami/phn/core/device/BleException;", "isPhnEnable", "Lcom/huami/phn/core/device/DeviceManager;", "a", "Lcom/huami/phn/core/device/DeviceManager;", "manager", "<init>", "(Lcom/huami/phn/core/device/DeviceManager;)V", "phn_coach_release"}, k = 1, mv = {1, 5, 1})
public final class DeviceCheckerImpl implements DeviceChecker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceManager manager;

    public DeviceCheckerImpl(@NotNull DeviceManager deviceManager) {
        this.manager = deviceManager;
    }

    @Override // com.huami.phn.core.device.DeviceChecker
    @NotNull
    public Result<Boolean, BleException> isPhnEnable() {
        Throwable th;
        if (this.manager.getActiveBleDevice() == null) {
            th = BleException.NoActiveDevice.INSTANCE;
        } else if (this.manager.isActiveDeviceConnected()) {
            th = !this.manager.isActiveDeviceSupportPhn() ? BleException.ActiveDeviceVersionNoPhn.INSTANCE : null;
        } else {
            th = BleException.DeviceDisconnected.INSTANCE;
        }
        return th == null ? Result.INSTANCE.success$phn_coach_release(Boolean.TRUE) : Result.INSTANCE.failure$phn_coach_release(th);
    }
}
