package com.xiaomi.fitness.device.manager.internal;

import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.bean.DeviceInfo;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\bH&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\u0013\u001a\u00020\u0014X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/device/manager/internal/DeviceModelInternal;", "", "initByModelDevice", "", "device", "Lcom/xiaomi/fitness/device/manager/bean/DeviceInfo;", "Lcom/xiaomi/fitness/device/manager/bean/Device;", "isReAdded", "", "()Z", "setReAdded", "(Z)V", "setCurrentStatus", "isCurrent", "onBindSuccess", "rebind", "removeUserDevice", "connectDevice", "disconnectDevice", "remote", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "device-manager_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceModelInternal {
    void connectDevice();

    void disconnectDevice();

    @NotNull
    DeviceModelRemote getRemote();

    void initByModelDevice(@NotNull DeviceInfo<Device> device);

    boolean isReAdded();

    void onBindSuccess(boolean rebind);

    void removeUserDevice();

    void setCurrentStatus(boolean isCurrent);

    void setReAdded(boolean z);
}
