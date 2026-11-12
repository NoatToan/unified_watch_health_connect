package defpackage;

import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.ui.tab.DeviceTabV4ViewModel;
import com.xiaomi.hm.health.bt.sdk.IBatteryChangeCallback;
import com.xiaomi.hm.health.bt.sdk.data.DeviceBatteryInfo;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ht6 implements IBatteryChangeCallback, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceTabV4ViewModel f20424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WearableDeviceModel f20425b;

    public /* synthetic */ ht6(DeviceTabV4ViewModel deviceTabV4ViewModel, WearableDeviceModel wearableDeviceModel) {
        this.f20424a = deviceTabV4ViewModel;
        this.f20425b = wearableDeviceModel;
    }

    @Override // com.xiaomi.hm.health.bt.sdk.IBatteryChangeCallback
    public final void onBatteryInfo(DeviceBatteryInfo deviceBatteryInfo) {
        DeviceTabV4ViewModel.onConnectSuccess$lambda$16(this.f20424a, this.f20425b, deviceBatteryInfo);
    }
}
