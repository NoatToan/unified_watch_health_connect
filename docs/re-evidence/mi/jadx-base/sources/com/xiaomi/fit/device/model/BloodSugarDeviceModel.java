package com.xiaomi.fit.device.model;

import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarDeviceApi;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0003H\u0014J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/device/model/BloodSugarDeviceModel;", "Lcom/xiaomi/fit/device/model/BaseDeviceModel;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "wearApiCall", "Lcom/xiaomi/fitness/blood_sugar/BloodSugarDeviceApi;", "onCoreServiceState", "", "state", "", "onUpdate", "device", "destroy", "isRemoved", "", "onBindSuccess", "rebind", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodSugarDeviceModel extends BaseDeviceModel {

    @NotNull
    private final BloodSugarDeviceApi wearApiCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BloodSugarDeviceModel(@NotNull WearableDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.wearApiCall = BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).getBloodSugarDeviceApi(DeviceModelExtKt.convert(deviceInfo));
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        super.destroy(isRemoved);
        IMiWearCoreClient.INSTANCE.getInstance().removeDeviceInfo(getDeviceInfo().getDid());
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void onBindSuccess(boolean rebind) {
        super.onBindSuccess(rebind);
        connectDevice();
    }

    @Override // com.xiaomi.wearable.core.client.ServiceStateListener
    public void onCoreServiceState(int state) {
        if (state == 1) {
            IMiWearCoreClient.INSTANCE.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(getDeviceInfo()), this.wearApiCall);
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel
    public void onUpdate(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        super.onUpdate(device);
    }
}
