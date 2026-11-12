package com.xiaomi.fit.device.model;

import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.wearable.core.client.IDataHandler;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fit/device/model/LocalSportDeviceModel;", "Lcom/xiaomi/fit/device/model/BaseDeviceModel;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "dataHandler", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;Lcom/xiaomi/wearable/core/client/IDataHandler;)V", "onCoreServiceState", "", "state", "", "onBindSuccess", "rebind", "", "onUpdate", "device", "Companion", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LocalSportDeviceModel extends BaseDeviceModel {

    @NotNull
    private static final String TAG = "[LocalSportDeviceModel]";

    @NotNull
    private final IDataHandler dataHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSportDeviceModel(@NotNull WearableDeviceInfo deviceInfo, @NotNull IDataHandler dataHandler) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        this.dataHandler = dataHandler;
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void onBindSuccess(boolean rebind) {
        super.onBindSuccess(rebind);
        Logger.i(TAG, "onBindSuccess() called with: rebind = " + rebind);
        connectDevice();
    }

    @Override // com.xiaomi.wearable.core.client.ServiceStateListener
    public void onCoreServiceState(int state) {
        if (state == 1) {
            IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
            companion.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(getDeviceInfo()), null);
            companion.getInstance().addDeviceDataHandler(getDeviceInfo().getDid(), 199, this.dataHandler);
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel
    public void onUpdate(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        super.onUpdate(device);
        IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
        companion.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(device), null);
        companion.getInstance().addDeviceDataHandler(device.getDid(), 199, this.dataHandler);
    }
}
