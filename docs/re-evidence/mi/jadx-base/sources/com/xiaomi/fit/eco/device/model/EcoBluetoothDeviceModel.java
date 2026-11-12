package com.xiaomi.fit.eco.device.model;

import android.annotation.SuppressLint;
import com.xiaomi.fit.eco.device.extensions.EcoDeviceModelExtKt;
import com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel;
import com.xiaomi.fit.eco.device.utils.EcoBleUtil;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDevice;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoDeviceInfo;
import defpackage.asc;
import defpackage.et7;
import defpackage.qj7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\b\u0010\u0014\u001a\u00020\tH\u0014J\b\u0010\u0015\u001a\u00020\tH\u0016J\b\u0010\u0016\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fit/eco/device/model/EcoBluetoothDeviceModel;", "Lcom/xiaomi/fit/eco/device/model/EcoBaseDeviceModel;", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;", "<init>", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDeviceInfo;)V", "isRebindOnHomeByUser", "", "destroy", "", "isRemoved", "isNeedReset", "device", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoDevice;", "initSpecial", "onBindSuccess", "rebind", "mergeDeviceStatus", "status", "", "resetToInitialStatus", "connectDevice", "disconnectDevice", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class EcoBluetoothDeviceModel extends EcoBaseDeviceModel {
    private boolean isRebindOnHomeByUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoBluetoothDeviceModel(@NotNull EcoDeviceInfo deviceInfo) {
        super(deviceInfo);
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void connectDevice$lambda$0(int i, String str) {
        Logger.i("onConnectStatus: status=" + i + ",message:" + str, new Object[0]);
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void connectDevice() {
        Device.Detail detail;
        if (getMEcoApiCall().connectionType() != 2) {
            EcoBleUtil.INSTANCE.discovery();
        }
        String userId = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserId();
        EcoDevice ecoDevice = (EcoDevice) getDeviceInfo().device;
        String encryptKey = (ecoDevice == null || (detail = ecoDevice.getDetail()) == null) ? null : detail.getEncryptKey();
        Logger.i("connectDevice encryptKey : " + encryptKey, new Object[0]);
        asc mEcoApiCall = getMEcoApiCall();
        if (encryptKey == null) {
            encryptKey = "";
        }
        mEcoApiCall.d(userId, ByteUtil.stringToBytes(encryptKey), new qj7() { // from class: ti7
            @Override // defpackage.qj7
            public final void b(int i, String str) {
                EcoBluetoothDeviceModel.connectDevice$lambda$0(i, str);
            }
        });
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel, com.xiaomi.fitness.device.manager.DeviceModel
    public void destroy(boolean isRemoved) {
        super.destroy(isRemoved);
        if (isRemoved) {
            resetToInitialStatus();
        }
    }

    @Override // com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void disconnectDevice() {
        Logger.i(EcoBaseDeviceModel.TAG, "disconnect: ");
        getMEcoApiCall().e(new et7() { // from class: com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel.disconnectDevice.1
            @Override // defpackage.et7
            public /* bridge */ /* synthetic */ void onDisconnectFailure(int i) {
                super.onDisconnectFailure(i);
            }

            @Override // defpackage.et7
            public /* bridge */ /* synthetic */ void onDisconnectSuccess() {
                super.onDisconnectSuccess();
            }
        });
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel
    public void initSpecial(@Nullable EcoDevice device) {
        super.initSpecial(device);
        if (getIsReAdded()) {
            getMEcoApiCall().e(new et7() { // from class: com.xiaomi.fit.eco.device.model.EcoBluetoothDeviceModel.initSpecial.1
                @Override // defpackage.et7
                public /* bridge */ /* synthetic */ void onDisconnectFailure(int i) {
                    super.onDisconnectFailure(i);
                }

                @Override // defpackage.et7
                public /* bridge */ /* synthetic */ void onDisconnectSuccess() {
                    super.onDisconnectSuccess();
                }
            });
            getMEcoApiCall().destroy();
            setMEcoApiCall(newEcoApiCall());
            Logger.i("create new ecoApiCall = " + getMEcoApiCall(), new Object[0]);
        }
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel
    public boolean isNeedReset(@Nullable EcoDevice device) {
        EcoDevice ecoDevice = (EcoDevice) getDeviceInfo().device;
        setReAdded(!Intrinsics.areEqual(ecoDevice != null ? ecoDevice.getMac() : null, device != null ? device.getMac() : null) || getIsReAdded());
        return !this.isRebindOnHomeByUser && getIsReAdded();
    }

    @SuppressLint({"DefaultLocale"})
    public void mergeDeviceStatus(int status) {
        EcoDeviceModelExtKt.logi(EcoBaseDeviceModel.TAG, "mergeDeviceStatus:" + status);
        getMEcoApiCall().f(this);
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel, com.xiaomi.fitness.eco.device.model.api.EcoDeviceModelInternal
    public void onBindSuccess(boolean rebind) {
        super.onBindSuccess(rebind);
        if (rebind) {
            this.isRebindOnHomeByUser = true;
        }
    }

    @Override // com.xiaomi.fit.eco.device.model.EcoBaseDeviceModel
    public void resetToInitialStatus() {
    }
}
