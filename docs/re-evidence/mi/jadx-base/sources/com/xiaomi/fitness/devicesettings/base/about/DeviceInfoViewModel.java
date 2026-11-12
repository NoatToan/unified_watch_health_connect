package com.xiaomi.fitness.devicesettings.base.about;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.contact.export.OnSyncCallback;
import com.xiaomi.fitness.device.contact.export.SyncResult;
import com.xiaomi.fitness.device.manager.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WatchInfo;
import com.xiaomi.fitness.devicesettings.common.extensions.SyncResultExitKt;
import defpackage.eu6;
import defpackage.wzi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0006\u0010\u000f\u001a\u00020\fJ\f\u0010\u0010\u001a\u00020\f*\u00020\bH\u0002J\u0006\u0010\u0011\u001a\u00020\fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/base/about/DeviceInfoViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "deviceInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/devicesettings/base/about/DeviceInfoModel;", "getDeviceInfo", "()Landroidx/lifecycle/MutableLiveData;", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadDeviceInfo", "fixFwVersion", "dumpDeviceLog", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoViewModel extends AbsViewModel {

    @NotNull
    public static final String TAG = "DeviceInfoViewModel";

    @NotNull
    private final MutableLiveData<DeviceInfoModel> deviceInfo = new MutableLiveData<>();

    @Nullable
    private WearableDeviceModel deviceModel;

    /* JADX INFO: Access modifiers changed from: private */
    public final void fixFwVersion(DeviceInfoModel deviceInfoModel) {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel == null || !DeviceModelExtKt.isHuaMi(wearableDeviceModel)) {
            return;
        }
        deviceInfoModel.setFwVersion(deviceInfoModel.getFwVersion() + "_android_245");
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
        this.deviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
    }

    public final void dumpDeviceLog() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            Intrinsics.checkNotNull(wearableDeviceModel);
            if (DeviceModelExtKt.isBluetooth(wearableDeviceModel)) {
                WearableDeviceModel wearableDeviceModel2 = this.deviceModel;
                Intrinsics.checkNotNull(wearableDeviceModel2);
                com.xiaomi.fitness.devicesettings.common.extensions.DeviceModelExtKt.doFactoryDump(wearableDeviceModel2, new OnSyncCallback() { // from class: com.xiaomi.fitness.devicesettings.base.about.DeviceInfoViewModel.dumpDeviceLog.1
                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onError(String did, int type, int code) {
                        ToastUtil.showShortToast(wzi.common_set_error);
                    }

                    @Override // com.xiaomi.fitness.device.contact.export.OnSyncCallback
                    public void onSuccess(String did, int type, SyncResult result) {
                        if (result == null || !SyncResultExitKt.isSuccess(result)) {
                            ToastUtil.showShortToast(wzi.common_set_error);
                        } else {
                            ToastUtil.showShortToast(wzi.s3);
                        }
                    }
                });
                return;
            }
        }
        Logger.d("dump device log error " + this.deviceModel, new Object[0]);
    }

    @NotNull
    public final MutableLiveData<DeviceInfoModel> getDeviceInfo() {
        return this.deviceInfo;
    }

    public final void loadDeviceInfo() {
        WearableDeviceModel wearableDeviceModel = this.deviceModel;
        if (wearableDeviceModel != null) {
            wearableDeviceModel.readWatchInfo(new eu6<WatchInfo>() { // from class: com.xiaomi.fitness.devicesettings.base.about.DeviceInfoViewModel.loadDeviceInfo.1
                @Override // defpackage.eu6
                public void onError(int errorCode) {
                    Logger.e(DeviceInfoViewModel.TAG, "readWatchInfo error:" + errorCode);
                }

                @Override // defpackage.eu6
                public void onResult(WatchInfo result) {
                    DeviceInfoModel.Companion companion = DeviceInfoModel.INSTANCE;
                    WearableDeviceModel wearableDeviceModel2 = DeviceInfoViewModel.this.deviceModel;
                    Intrinsics.checkNotNull(wearableDeviceModel2);
                    DeviceInfoModel deviceInfoModelValueOf = companion.valueOf(wearableDeviceModel2.getDeviceInfo());
                    if (result != null) {
                        deviceInfoModelValueOf.setModel(result.getModel());
                        deviceInfoModelValueOf.setFwVersion(result.getFirmwareVersion());
                        deviceInfoModelValueOf.setSn(result.getSerialNumber());
                    }
                    DeviceInfoViewModel.this.fixFwVersion(deviceInfoModelValueOf);
                    Logger.d(DeviceInfoViewModel.TAG, "readDeviceInfo " + deviceInfoModelValueOf);
                    DeviceInfoViewModel.this.getDeviceInfo().postValue(deviceInfoModelValueOf);
                }
            });
        } else {
            Logger.e(TAG, "readDeviceInfo error: device model is null");
        }
    }
}
