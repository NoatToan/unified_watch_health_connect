package com.xiaomi.fitness.eco.device.model.api;

import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import com.xiaomi.fitness.eco.device.manager.remote.EcoDeviceModelRemote;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&R\u0018\u0010\u0006\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/eco/device/model/api/EcoDeviceModelInternal;", "", "initByModelDevice", "", "device", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "isReAdded", "", "()Z", "setReAdded", "(Z)V", "onBindSuccess", "rebind", "removeUserDevice", "connectDevice", "disconnectDevice", "remote", "Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "getRemote", "()Lcom/xiaomi/fitness/eco/device/manager/remote/EcoDeviceModelRemote;", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface EcoDeviceModelInternal {
    void connectDevice();

    void disconnectDevice();

    @NotNull
    EcoDeviceModelRemote getRemote();

    void initByModelDevice(@NotNull EcoDeviceInfo device);

    boolean isReAdded();

    void onBindSuccess(boolean rebind);

    void removeUserDevice();

    void setReAdded(boolean z);
}
