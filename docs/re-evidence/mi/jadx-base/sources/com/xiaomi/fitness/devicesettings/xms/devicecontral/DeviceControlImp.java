package com.xiaomi.fitness.devicesettings.xms.devicecontral;

import com.miui.circulate.device.api.DeviceInfo;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\rH&J\u0016\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/xms/devicecontral/DeviceControlImp;", "", "getDeviceListOnDeviceControl", "", "Lcom/miui/circulate/device/api/DeviceInfo;", "addOrUpdateDevice", "", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deleteDevice", "did", "", "clearDevices", "", "atomicInsertDeviceByCategory", "", TSMAuthContants.PARAM_DEVICE_MODELS, "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeviceControlImp {
    boolean addOrUpdateDevice(@NotNull WearableDeviceModel deviceModel);

    int atomicInsertDeviceByCategory(@NotNull List<? extends WearableDeviceModel> deviceModels);

    void clearDevices();

    boolean deleteDevice(@NotNull String did);

    @NotNull
    List<DeviceInfo> getDeviceListOnDeviceControl();
}
