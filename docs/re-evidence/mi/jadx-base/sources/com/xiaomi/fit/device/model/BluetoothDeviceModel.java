package com.xiaomi.fit.device.model;

import com.miui.tsmclient.model.ErrorCode;
import com.xiaomi.fit.device.extensions.DeviceModelExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.device.manager.export.bean.WearableDeviceInfo;
import com.xiaomi.wearable.core.client.IDataHandler;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import defpackage.eu6;
import defpackage.s7r;
import defpackage.swo;
import defpackage.txo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u001f\u0010\u0013\u001a\u00020\u00042\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fit/device/model/BluetoothDeviceModel;", "Lcom/xiaomi/fit/device/model/BaseDeviceModel;", "Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;", "device", "", "onUpdate", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;)V", "", "isRemoved", "destroy", "(Z)V", "", "getDeviceCapability", "()I", "isCurrent", "setCurrentStatus", "Leu6;", "Lcom/xiaomi/fitness/device/manager/export/bean/WatchInfo;", "callback", "readWatchInfo", "(Leu6;)V", "state", "onCoreServiceState", "(I)V", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "dataHandler", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "deviceInfo", "<init>", "(Lcom/xiaomi/fitness/device/manager/export/bean/WearableDeviceInfo;Lcom/xiaomi/wearable/core/client/IDataHandler;)V", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public class BluetoothDeviceModel extends BaseDeviceModel {

    @NotNull
    private final IDataHandler dataHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothDeviceModel(@NotNull WearableDeviceInfo deviceInfo, @NotNull IDataHandler dataHandler) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        this.dataHandler = dataHandler;
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        super.destroy(isRemoved);
        IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
        companion.getInstance().removeDeviceInfo(getDeviceInfo().getDid());
        companion.getInstance().removeDeviceDataHandler(getDeviceInfo().getDid(), 199, this.dataHandler);
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public int getDeviceCapability() {
        return IMiWearCoreClient.INSTANCE.getInstance().getDeviceCapabilities(getDid());
    }

    @Override // com.xiaomi.wearable.core.client.ServiceStateListener
    public void onCoreServiceState(int state) {
        Logger.i(BaseDeviceModel.TAG, "onCoreServiceState() called with: state = " + state + ", isCurrent " + getIsCurrent());
        if (state == 1 || state == 3) {
            IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
            companion.getInstance().addDeviceInfo(DeviceModelExtKt.convert(getDeviceInfo()));
            companion.getInstance().addDeviceDataHandler(getDeviceInfo().getDid(), 199, this.dataHandler);
            if (getIsCurrent()) {
                companion.getInstance().setCurrentDevice(getDid(), true);
                connectDevice();
            }
        }
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel
    public void onUpdate(@NotNull WearableDeviceInfo device) {
        Intrinsics.checkNotNullParameter(device, "device");
        super.onUpdate(device);
        IMiWearCoreClient.Companion companion = IMiWearCoreClient.INSTANCE;
        companion.getInstance().addDeviceInfo(DeviceModelExtKt.convert(device));
        companion.getInstance().addDeviceDataHandler(device.getDid(), 199, this.dataHandler);
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.manager.export.WearableDeviceModel
    public void readWatchInfo(@Nullable final eu6<WatchInfo> callback) {
        s7r s7rVar = new s7r();
        s7rVar.e = 2;
        s7rVar.f = 2;
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).call(getDid(), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fit.device.model.BluetoothDeviceModel.readWatchInfo.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                DeviceModelExtKt.logi(BaseDeviceModel.TAG, "read ble watch info onError() called with: did = " + did + ", type = " + type + ", code = " + code);
                eu6<WatchInfo> eu6Var = callback;
                if (eu6Var != null) {
                    eu6Var.onError(code);
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                s7r packet;
                txo txoVarE;
                swo swoVarR;
                DeviceModelExtKt.logi("read ble watch info(" + did + "), and result is " + (result != null ? Boolean.valueOf(result.isSuccess()) : null));
                if (result == null || !result.isSuccess() || (packet = result.getPacket()) == null || (txoVarE = packet.E()) == null || (swoVarR = txoVarE.r()) == null) {
                    eu6<WatchInfo> eu6Var = callback;
                    if (eu6Var != null) {
                        eu6Var.onError(result != null ? result.getCode() : -2);
                        return;
                    }
                    return;
                }
                BluetoothDeviceModel bluetoothDeviceModel = this;
                eu6<WatchInfo> eu6Var2 = callback;
                Intrinsics.checkNotNull(did);
                String model = swoVarR.f;
                Intrinsics.checkNotNullExpressionValue(model, "model");
                String str = swoVarR.d;
                String serialNumber = swoVarR.c;
                Intrinsics.checkNotNullExpressionValue(serialNumber, "serialNumber");
                WatchInfo watchInfo = new WatchInfo(did, model, str, serialNumber);
                bluetoothDeviceModel.getDeviceInfo().setFirmwareVersion(swoVarR.d);
                if (eu6Var2 != null) {
                    eu6Var2.onResult(watchInfo);
                }
            }
        }, ErrorCode.ERROR_CODE_INVALID_PARAM);
    }

    @Override // com.xiaomi.fit.device.model.BaseDeviceModel, com.xiaomi.fitness.device.model.api.DeviceModelInternal
    public void setCurrentStatus(boolean isCurrent) {
        super.setCurrentStatus(isCurrent);
        if (isCurrent || isAccessory()) {
            return;
        }
        IMiWearCoreClient.INSTANCE.getInstance().disconnect(getDid());
    }
}
