package com.xiaomi.fitness.eco.device.manager.ui.bind;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.a;
import com.xiaomi.fitness.device.manager.e;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.rn.export.RNDeviceManager;
import com.xiaomi.fitness.rn.export.bean.RNDeviceParameter;
import com.xiaomi.fitness.rn.export.extensions.RNDeviceManagerExtKt;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothApi;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleConnectManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\tJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindMiHomeDeviceViewModel;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel;", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", "deviceInfo", "Lcom/xiaomi/fitness/device/manager/a;", "callback", "", "startBind", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;Lcom/xiaomi/fitness/device/manager/a;)V", "(Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;)V", "Landroidx/lifecycle/LifecycleOwner;", CardInfo.KEY_OWNER, LifecycleConstantKt.ON_STOP, "(Landroidx/lifecycle/LifecycleOwner;)V", "releaseDevice", "<init>", "()V", "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BindMiHomeDeviceViewModel extends EcoBindViewModel {
    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel
    public void releaseDevice(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        BleConnectManager.getInstance().disconnect(deviceInfo.getBleMac());
        BluetoothApi.unnotify(deviceInfo.getBleMac(), BluetoothConstants.MISERVICE, BluetoothConstants.CHARACTER_WIFISTATUS);
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel
    public void startBind(@NotNull EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(100);
        getBindStatus$eco_device_manager_chinaProductRelease().setValue(0);
        startBind(deviceInfo, new a.AbstractBinderC0419a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindMiHomeDeviceViewModel.startBind.1
            @Override // com.xiaomi.fitness.device.manager.a
            public void dismissPairingCode() {
                Logger.i(EcoBindViewModel.TAG, "dismissPairingCode() called");
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindFailure(int status) {
                int i;
                Logger.i(EcoBindViewModel.TAG, "onBindFailure() called with: status = " + status);
                MutableLiveData<Integer> bindStatus$eco_device_manager_chinaProductRelease = BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease();
                if (status == 1003) {
                    BindMiHomeDeviceViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    BindMiHomeDeviceViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    i = 7;
                } else {
                    BindMiHomeDeviceViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    BindMiHomeDeviceViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    i = 12;
                    if (status != 12) {
                        i = 5;
                    }
                }
                bindStatus$eco_device_manager_chinaProductRelease.postValue(Integer.valueOf(i));
                BindMiHomeDeviceViewModel.this.onBoundFail(status);
                BindMiHomeDeviceViewModel.this.getIsFail().set(0);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onBindSuccess(String did) {
                Logger.i(EcoBindViewModel.TAG, "onBindSuccess() called");
                BindMiHomeDeviceViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(101);
                BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(6);
                BindMiHomeDeviceViewModel.this.onBoundSuccess(did);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectFailure(int status) {
                Logger.i(EcoBindViewModel.TAG, "onConnectFailure() called with: status = " + status);
                Integer value = BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue();
                if (value != null && value.intValue() == 0) {
                    BindMiHomeDeviceViewModel.this.onBoundFail(status);
                    BindMiHomeDeviceViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
                    BindMiHomeDeviceViewModel.this.getIsFail().set(0);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onConnectSuccess() {
                Integer value;
                Logger.i(EcoBindViewModel.TAG, "onConnectSuccess() called");
                Integer value2 = BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue();
                if ((value2 != null && value2.intValue() == 0) || ((value = BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue()) != null && value.intValue() == 1)) {
                    BindMiHomeDeviceViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
                    BindMiHomeDeviceViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(100);
                    BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(2);
                }
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingFailure(int status) {
                Logger.i(EcoBindViewModel.TAG, "onPairingFailure() called with: status = " + status);
                BindMiHomeDeviceViewModel.this.onBoundFail(status);
                BindMiHomeDeviceViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(3);
                BindMiHomeDeviceViewModel.this.getIsFail().set(0);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onPairingSuccess(byte[] key) {
                Logger.i(EcoBindViewModel.TAG, "onPairingSuccess() called with: key = " + key);
                BindMiHomeDeviceViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
                BindMiHomeDeviceViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(100);
                BindMiHomeDeviceViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(4);
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceFailure() {
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void onRequestDeviceSuccess() {
                Logger.i(EcoBindViewModel.TAG, "onRequestDeviceSuccess() called");
            }

            @Override // com.xiaomi.fitness.device.manager.a
            public void showPairingCode(String code, e callback) {
                Logger.i(EcoBindViewModel.TAG, "showPairingCode() called with: code=" + code + ", callback=" + callback);
            }
        });
    }

    private final void startBind(EcoBindDeviceInfo deviceInfo, a callback) {
        RNDeviceManagerExtKt.getInstance(RNDeviceManager.INSTANCE).bindDevice(new RNDeviceParameter(deviceInfo.getModel(), deviceInfo.getBleMac(), deviceInfo.getBleName(), null, null, false, deviceInfo.getPacket()), callback);
    }
}
