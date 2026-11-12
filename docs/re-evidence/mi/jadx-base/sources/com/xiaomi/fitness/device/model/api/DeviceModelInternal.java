package com.xiaomi.fitness.device.model.api;

import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.device.manager.remote.DeviceModelRemote;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\bH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\bH&J\b\u0010\u0018\u001a\u00020\u0003H&J\b\u0010\u0019\u001a\u00020\u0003H&J\b\u0010\u001a\u001a\u00020\u0003H&J\b\u0010\u001b\u001a\u00020\u000fH&J\b\u0010\u001c\u001a\u00020\u000fH&R\u0018\u0010\u0007\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0012\u0010\u001d\u001a\u00020\u001eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/device/model/api/DeviceModelInternal;", "", "init", "", "update", "device", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "isReAdded", "", "()Z", "setReAdded", "(Z)V", "isAccessory", "setAccessory", "accessoryMode", "", "getAccessoryMode", "()I", "setAccessoryMode", "(I)V", "setCurrentStatus", "isCurrent", "onBindSuccess", "rebind", "removeUserDevice", "connectDevice", "disconnectDevice", "getDeviceCapability", "getDeviceCapabilityV2", "remote", "Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/device/manager/remote/DeviceModelRemote;", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceModelInternal {
    void connectDevice();

    void disconnectDevice();

    int getAccessoryMode();

    int getDeviceCapability();

    int getDeviceCapabilityV2();

    @NotNull
    DeviceModelRemote getRemote();

    void init();

    boolean isAccessory();

    boolean isReAdded();

    void onBindSuccess(boolean rebind);

    void removeUserDevice();

    void setAccessory(boolean z);

    void setAccessoryMode(int i);

    void setCurrentStatus(boolean isCurrent);

    void setReAdded(boolean z);

    void update(@NotNull WearableDeviceInfo device);
}
