package com.xiaomi.fitness.view.setting.temperature;

import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import defpackage.pu9;
import defpackage.s7r;
import defpackage.ur9;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0013\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR*\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/view/setting/temperature/TemperatureSettingViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "", "getDeviceTemperatureSetting", "()V", "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "", "temperature", "setTemperatureSetting", "(ZI)V", "Landroidx/lifecycle/MutableLiveData;", "Lpu9;", "temperatureSettingLiveData", "Landroidx/lifecycle/MutableLiveData;", "getTemperatureSettingLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setTemperatureSettingLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "<init>", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class TemperatureSettingViewModel extends AbsViewModel {

    @NotNull
    private MutableLiveData<pu9> temperatureSettingLiveData = new MutableLiveData<>();

    public final void getDeviceTemperatureSetting() {
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 101;
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.view.setting.temperature.TemperatureSettingViewModel.getDeviceTemperatureSetting.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("TemperatureSettingViewModel", "getDeviceTemperatureSetting error did:" + did + ", type:" + type + ", code:" + code);
                TemperatureSettingViewModel.this.getTemperatureSettingLiveData().postValue(null);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                ur9 ur9VarU;
                Logger.i("TemperatureSettingViewModel", "getDeviceTemperatureSetting success did:" + did + ", type:" + type + ", result:" + result);
                if (result != null) {
                    TemperatureSettingViewModel temperatureSettingViewModel = TemperatureSettingViewModel.this;
                    pu9 pu9VarW = null;
                    if (!result.isSuccess()) {
                        temperatureSettingViewModel.getTemperatureSettingLiveData().postValue(null);
                        return;
                    }
                    MutableLiveData<pu9> temperatureSettingLiveData = temperatureSettingViewModel.getTemperatureSettingLiveData();
                    s7r packet = result.getPacket();
                    if (packet != null && (ur9VarU = packet.u()) != null) {
                        pu9VarW = ur9VarU.W();
                    }
                    temperatureSettingLiveData.postValue(pu9VarW);
                }
            }
        }, 0, 8, null);
    }

    @NotNull
    public final MutableLiveData<pu9> getTemperatureSettingLiveData() {
        return this.temperatureSettingLiveData;
    }

    public final void setTemperatureSetting(boolean on, int temperature) {
        Logger.i("TemperatureSettingViewModel", "setTemperatureSetting on:" + on + ",warning:" + temperature);
        s7r s7rVar = new s7r();
        s7rVar.e = 8;
        s7rVar.f = 102;
        ur9 ur9Var = new ur9();
        pu9 pu9Var = new pu9();
        pu9Var.c = on;
        pu9Var.d = temperature;
        ur9Var.Q0(pu9Var);
        s7rVar.S(ur9Var);
        DeviceContact.DefaultImpls.call$default(DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE), s7rVar, true, new OnSyncCallback() { // from class: com.xiaomi.fitness.view.setting.temperature.TemperatureSettingViewModel.setTemperatureSetting.1
            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onError(String did, int type, int code) {
                Logger.e("TemperatureSettingViewModel", "setTemperatureSetting error did:" + did + ", type:" + type + ", code:" + code);
            }

            @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
            public void onSuccess(String did, int type, SyncResult result) {
                Logger.i("TemperatureSettingViewModel", "setTemperatureSetting success did:" + did + ", type:" + type + ", result:" + result);
            }
        }, 0, 8, null);
    }

    public final void setTemperatureSettingLiveData(@NotNull MutableLiveData<pu9> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.temperatureSettingLiveData = mutableLiveData;
    }
}
