package com.xiaomi.fitness.eco.device.manager.ui.bind;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.entity.CardInfo;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.manager.export.bean.EcoBindDeviceInfo;
import com.xiaomi.fitness.electronic.scale.export.ElectronicScaleManagerExtKt;
import defpackage.bv7;
import defpackage.sh7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fitness/eco/device/manager/ui/bind/BindEcoViewModel;", "Lcom/xiaomi/fitness/eco/device/manager/ui/bind/EcoBindViewModel;", "<init>", "()V", "isStartBindScale", "", "isBindSuccess", "did", "", "getDid", "()Ljava/lang/String;", "setDid", "(Ljava/lang/String;)V", "oobStatus", "Landroidx/lifecycle/MutableLiveData;", "", "getOobStatus$eco_device_manager_chinaProductRelease", "()Landroidx/lifecycle/MutableLiveData;", "startBind", "", "deviceInfo", "Lcom/xiaomi/fitness/eco/device/manager/export/bean/EcoBindDeviceInfo;", LifecycleConstantKt.ON_STOP, CardInfo.KEY_OWNER, "Landroidx/lifecycle/LifecycleOwner;", LifecycleConstantKt.ON_DESTROY, "eco-device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BindEcoViewModel extends EcoBindViewModel {

    @Nullable
    private String did;
    private boolean isBindSuccess;
    private boolean isStartBindScale;

    @NotNull
    private final MutableLiveData<Integer> oobStatus = new MutableLiveData<>();

    @Nullable
    public final String getDid() {
        return this.did;
    }

    @NotNull
    public final MutableLiveData<Integer> getOobStatus$eco_device_manager_chinaProductRelease() {
        return this.oobStatus;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onDestroy(owner);
        if (!getMDeviceInfo().isEcoScale() || this.isBindSuccess) {
            return;
        }
        getMEcoDeviceManager().cancelBind(getMDeviceInfo().getBleMac());
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel, androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (isInitializedDeviceInfo() && getMDeviceInfo().isEcoScale() && !this.isStartBindScale) {
            return;
        }
        Integer value = getBindStatus$eco_device_manager_chinaProductRelease().getValue();
        if ((value == null || value.intValue() != 6) && isInitializedDeviceInfo()) {
            Logger.i(EcoBindViewModel.TAG, "onStop() called with: cancel eco bind bindState = " + getBindStatus$eco_device_manager_chinaProductRelease().getValue());
            getMEcoDeviceManager().cancelBind(getMDeviceInfo().getBleMac());
            getIsFail().set(0);
            this.isStartBindScale = false;
            this.oobStatus.postValue(104);
        }
        showErrorIfLoading(getConnectDeviceStatus$eco_device_manager_chinaProductRelease(), getPairDeviceStatus$eco_device_manager_chinaProductRelease(), getBindAccountStatus$eco_device_manager_chinaProductRelease());
    }

    public final void setDid(@Nullable String str) {
        this.did = str;
    }

    @Override // com.xiaomi.fitness.eco.device.manager.ui.bind.EcoBindViewModel
    public void startBind(@NotNull final EcoBindDeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.isStartBindScale = true;
        getConnectDeviceStatus$eco_device_manager_chinaProductRelease().setValue(100);
        getBindStatus$eco_device_manager_chinaProductRelease().setValue(0);
        getMEcoDeviceManager().bindDevice(deviceInfo.getBleMac(), deviceInfo.getModel(), deviceInfo.getBleName(), deviceInfo.getOob(), deviceInfo.getShareId(), deviceInfo.getShareUserId(), deviceInfo.getShareDid(), deviceInfo.getShareModel(), new sh7.a() { // from class: com.xiaomi.fitness.eco.device.manager.ui.bind.BindEcoViewModel.startBind.1
            @Override // defpackage.sh7
            public void dismissPairingCode() {
                Logger.i(EcoBindViewModel.TAG, "dismissPairingCode() called");
                if (deviceInfo.isEcoScale()) {
                    BindEcoViewModel.this.getOobStatus$eco_device_manager_chinaProductRelease().postValue(104);
                } else {
                    BindEcoViewModel.this.getPairCode$eco_device_manager_chinaProductRelease().postValue(null);
                }
            }

            @Override // defpackage.sh7
            public void onBindFailure(int status) {
                int i;
                Logger.i(EcoBindViewModel.TAG, "onBindFailure() called with: status = " + status);
                MutableLiveData<Integer> bindStatus$eco_device_manager_chinaProductRelease = BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease();
                if (status == 1003) {
                    BindEcoViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    BindEcoViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    i = 7;
                } else {
                    BindEcoViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    BindEcoViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    i = 12;
                    if (status != 12) {
                        i = 5;
                    }
                }
                bindStatus$eco_device_manager_chinaProductRelease.postValue(Integer.valueOf(i));
                BindEcoViewModel.this.onBoundFail(status);
                BindEcoViewModel.this.getIsFail().set(0);
                BindEcoViewModel.this.isStartBindScale = false;
                BindEcoViewModel.this.isBindSuccess = false;
            }

            @Override // defpackage.sh7
            public void onBindSuccess(String did) {
                BindEcoViewModel.this.setDid(did);
                BindEcoViewModel.this.isBindSuccess = true;
                Logger.i(EcoBindViewModel.TAG, "onBindSuccess() called");
                BindEcoViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(101);
                BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(6);
                BindEcoViewModel.this.onBoundSuccess(did);
                ElectronicScaleManagerExtKt.initElectronicScale(ApplicationExtKt.getApplication(), did);
            }

            @Override // defpackage.sh7
            public void onConnectFailure(int status) {
                Logger.i(EcoBindViewModel.TAG, "onConnectFailure() called with: status = " + status);
                Integer value = BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue();
                if (value != null && value.intValue() == 0) {
                    BindEcoViewModel.this.onBoundFail(status);
                    BindEcoViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                    BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(1);
                    BindEcoViewModel.this.getIsFail().set(0);
                    BindEcoViewModel.this.isStartBindScale = false;
                    BindEcoViewModel.this.isBindSuccess = false;
                }
            }

            @Override // defpackage.sh7
            public void onConnectSuccess() {
                Integer value;
                Logger.i(EcoBindViewModel.TAG, "onConnectSuccess() called");
                Integer value2 = BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue();
                if ((value2 != null && value2.intValue() == 0) || ((value = BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().getValue()) != null && value.intValue() == 1)) {
                    BindEcoViewModel.this.getConnectDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
                    BindEcoViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(100);
                    BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(2);
                }
            }

            @Override // defpackage.sh7
            public void onPairingFailure(int status) {
                Logger.i(EcoBindViewModel.TAG, "onPairingFailure() called with: status = " + status);
                BindEcoViewModel.this.onBoundFail(status);
                BindEcoViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(102);
                BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(3);
                BindEcoViewModel.this.getIsFail().set(0);
                BindEcoViewModel.this.isStartBindScale = false;
                BindEcoViewModel.this.isBindSuccess = false;
            }

            @Override // defpackage.sh7
            public void onPairingSuccess(byte[] key) {
                Logger.i(EcoBindViewModel.TAG, "onPairingSuccess() called with: key = " + key);
                BindEcoViewModel.this.getPairDeviceStatus$eco_device_manager_chinaProductRelease().postValue(101);
                BindEcoViewModel.this.getBindAccountStatus$eco_device_manager_chinaProductRelease().postValue(100);
                BindEcoViewModel.this.getBindStatus$eco_device_manager_chinaProductRelease().postValue(4);
            }

            @Override // defpackage.sh7
            public void showPairingCode(String code, bv7 listener) {
                Logger.i(EcoBindViewModel.TAG, "showPairingCode() called with: code = " + code + ", listener = " + listener);
                BindEcoViewModel.this.setOobResultListener(listener);
                if (deviceInfo.isEcoScale()) {
                    BindEcoViewModel.this.getOobStatus$eco_device_manager_chinaProductRelease().postValue(103);
                } else {
                    BindEcoViewModel.this.getPairCode$eco_device_manager_chinaProductRelease().postValue(code);
                }
            }
        });
    }
}
