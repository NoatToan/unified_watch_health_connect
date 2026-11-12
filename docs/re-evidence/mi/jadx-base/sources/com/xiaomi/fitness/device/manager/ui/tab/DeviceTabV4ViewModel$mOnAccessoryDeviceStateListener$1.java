package com.xiaomi.fitness.device.manager.ui.tab;

import androidx.lifecycle.MutableLiveData;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\"\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"com/xiaomi/fitness/device/manager/ui/tab/DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1", "Lcom/xiaomi/fitness/device/manager/export/OnAccessoryDeviceStateListener;", "onAccessoryDeviceModeChange", "", "did", "", "mode", "", Constants.EXTRA_FROM_APP, "", "onAccessoryDeviceModeDuplicate", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1 implements OnAccessoryDeviceStateListener {
    final /* synthetic */ DeviceTabV4ViewModel this$0;

    public DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1(DeviceTabV4ViewModel deviceTabV4ViewModel) {
        this.this$0 = deviceTabV4ViewModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccessoryDeviceModeChange$lambda$2$lambda$1(String str, DeviceTabV4ViewModel this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        if (DeviceManagerExtKt.getInstance(companion).getCurrentDeviceModel() != 0) {
            DeviceManagerExtKt.getInstance(companion).disconnectDevice(str);
            this$0.loadDevice(false);
        } else {
            DeviceManagerExtKt.getInstance(companion).switchDevice(DeviceManagerExtKt.getInstance(companion).getDeviceModel(str));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccessoryDeviceModeDuplicate$lambda$4$lambda$3(DeviceTabV4ViewModel this$0, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z2) {
            this$0.getExistAccessoryMode().postValue(new Pair<>(Integer.valueOf(i), Boolean.valueOf(z)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
    public void onAccessoryDeviceModeChange(final String did, int mode, boolean fromApp) {
        String name;
        Logger.i(this.this$0.getTAG(), "onAccessoryDeviceModeChange did=" + did + ",mode=" + mode + ", fromApp=" + fromApp);
        if (mode == 0) {
            if (fromApp || did == null) {
                return;
            }
            final DeviceTabV4ViewModel deviceTabV4ViewModel = this.this$0;
            deviceTabV4ViewModel.switchAccessoryMode(0, did, false, new Function1() { // from class: xt6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1.onAccessoryDeviceModeChange$lambda$2$lambda$1(did, deviceTabV4ViewModel, ((Boolean) obj).booleanValue());
                }
            });
            deviceTabV4ViewModel.getExitAccessoryModeFromDevice().postValue(new Pair<>(did, Integer.valueOf(mode)));
            return;
        }
        if (mode == 1 && did != null) {
            DeviceTabV4ViewModel deviceTabV4ViewModel2 = this.this$0;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did);
            MutableLiveData<Pair<String, Integer>> wearModeSwitchSuccess = deviceTabV4ViewModel2.getWearModeSwitchSuccess();
            if (wearableDeviceModel == null || (name = DeviceModelExtKt.getName(wearableDeviceModel)) == null) {
                name = "";
            }
            wearModeSwitchSuccess.postValue(new Pair<>(name, Integer.valueOf(mode)));
        }
    }

    @Override // com.xiaomi.fitness.device.manager.export.OnAccessoryDeviceStateListener
    public void onAccessoryDeviceModeDuplicate(String did, final int mode, final boolean fromApp) {
        Logger.i(this.this$0.getTAG(), "onAccessoryDeviceModeDuplicate did = " + did + ",mode = " + mode);
        if (did != null) {
            final DeviceTabV4ViewModel deviceTabV4ViewModel = this.this$0;
            deviceTabV4ViewModel.switchAccessoryMode(0, did, true, new Function1() { // from class: wt6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return DeviceTabV4ViewModel$mOnAccessoryDeviceStateListener$1.onAccessoryDeviceModeDuplicate$lambda$4$lambda$3(deviceTabV4ViewModel, mode, fromApp, ((Boolean) obj).booleanValue());
                }
            });
        }
    }
}
