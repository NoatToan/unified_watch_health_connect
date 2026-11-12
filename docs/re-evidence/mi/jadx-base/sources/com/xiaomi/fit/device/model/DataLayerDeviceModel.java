package com.xiaomi.fit.device.model;

import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fit.device.model.DataLayerDeviceModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.fitness.wearos.export.WearOSApi;
import com.xiaomi.fitness.wearos.export.WearOSUtil;
import com.xiaomi.fitness.wearos.export.WearOsExtKt;
import com.xiaomi.wearable.core.client.IDataHandler;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0014J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/device/model/DataLayerDeviceModel;", "Lcom/xiaomi/fit/device/model/BaseDeviceModel;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "dataHandler", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;Lcom/xiaomi/wearable/core/client/IDataHandler;)V", "wearApiCall", "Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "getWearApiCall", "()Lcom/xiaomi/fitness/wearos/export/WearOSApi;", "wearApiCall$delegate", "Lkotlin/Lazy;", "onUpdate", "", "device", "setCurrentStatus", "isCurrent", "", "onCoreServiceState", "state", "", "destroy", "isRemoved", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DataLayerDeviceModel extends BaseDeviceModel {

    @NotNull
    private final IDataHandler dataHandler;

    /* JADX INFO: renamed from: wearApiCall$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy wearApiCall;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataLayerDeviceModel(@NotNull final WearableDeviceInfo deviceInfo, @NotNull IDataHandler dataHandler) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        this.dataHandler = dataHandler;
        this.wearApiCall = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: yl5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DataLayerDeviceModel.wearApiCall_delegate$lambda$0(deviceInfo);
            }
        });
    }

    private final WearOSApi getWearApiCall() {
        return (WearOSApi) this.wearApiCall.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WearOSApi wearApiCall_delegate$lambda$0(WearableDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
        try {
            return WearOsExtKt.getInstance(WearOSUtil.INSTANCE).getWearOSApi(DeviceModelExtKt.convert(deviceInfo));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        super.destroy(isRemoved);
        IMiWearCoreClient.INSTANCE.getInstance().removeDeviceInfo(getDeviceInfo().getDid());
    }

    @Override // com.xiaomi.wearable.core.client.ServiceStateListener
    public void onCoreServiceState(int state) {
        if (state == 1) {
            WearOSApi wearApiCall = getWearApiCall();
            if (wearApiCall != null) {
                IMiWearCoreClient.INSTANCE.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(getDeviceInfo()), wearApiCall);
            }
            IMiWearCoreClient.INSTANCE.getInstance().addDeviceDataHandler(getDeviceInfo().getDid(), 199, this.dataHandler);
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel
    public void onUpdate(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        Logger.i(BaseDeviceModel.TAG, "onUpdate() called with: device = " + device);
        WearOSApi wearApiCall = getWearApiCall();
        if (wearApiCall != null) {
            IMiWearCoreClient.INSTANCE.getInstance().addThirdDeviceInfo(DeviceModelExtKt.convert(device), wearApiCall);
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setCurrentStatus(boolean isCurrent) {
        super.setCurrentStatus(isCurrent);
        if (isCurrent) {
            return;
        }
        IMiWearCoreClient.INSTANCE.getInstance().disconnect(getDid());
    }
}
