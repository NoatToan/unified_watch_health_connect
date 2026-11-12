package com.xiaomi.fitness.device.manager.remote;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.DevicePreference;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.bean.Device;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.device.manager.export.bean.WearableDevice;
import com.xiaomi.fitness.device.manager.extensions.InstanceExtKt;
import com.xiaomi.fitness.device.manager.remote.DeviceInfoUpdater;
import com.xiaomi.fitness.device.model.api.DeviceManagerInternalRemote;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\u0016\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u001b\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/device/manager/remote/DeviceInfoUpdater;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "<init>", "()V", "mDeviceManager", "Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "getMDeviceManager", "()Lcom/xiaomi/fitness/device/model/api/DeviceManagerInternalRemote;", "mDeviceManager$delegate", "Lkotlin/Lazy;", "TAG", "", "NOTIFY_NEW_BIND_ACTION", "upload", "", "bindNewReceiver", "com/xiaomi/fitness/device/manager/remote/DeviceInfoUpdater$bindNewReceiver$1", "Lcom/xiaomi/fitness/device/manager/remote/DeviceInfoUpdater$bindNewReceiver$1;", "registerBindNewReceiver", "", "onConnectStart", "did", "onConnectFailure", "errorCode", "", "retryTimes", "onConnectSuccess", "onDisconnect", "device-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceInfoUpdater implements OnDeviceStatusListener {

    @NotNull
    private static final String NOTIFY_NEW_BIND_ACTION = "com.mi.health.notify_new_bind";

    @NotNull
    private static final String TAG = "DeviceInfoUpdater";
    private static boolean upload;

    @NotNull
    public static final DeviceInfoUpdater INSTANCE = new DeviceInfoUpdater();

    /* JADX INFO: renamed from: mDeviceManager$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mDeviceManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: k66
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DeviceInfoUpdater.mDeviceManager_delegate$lambda$0();
        }
    });

    @NotNull
    private static final DeviceInfoUpdater$bindNewReceiver$1 bindNewReceiver = new BroadcastReceiver() { // from class: com.xiaomi.fitness.device.manager.remote.DeviceInfoUpdater$bindNewReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Logger.i("DeviceInfoUpdater", "onReceive() called bind new action " + (intent != null ? intent.getAction() : null));
            if (Intrinsics.areEqual("com.mi.health.notify_new_bind", intent != null ? intent.getAction() : null)) {
                DeviceInfoUpdater.upload = true;
            }
        }
    };

    private DeviceInfoUpdater() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DeviceManagerRemoteImpl mDeviceManager_delegate$lambda$0() {
        return InstanceExtKt.getInstance(DeviceManagerRemoteImpl.INSTANCE);
    }

    @NotNull
    public final DeviceManagerInternalRemote getMDeviceManager() {
        return (DeviceManagerInternalRemote) mDeviceManager.getValue();
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        WearableDevice wearableDevice;
        if (TextUtils.isEmpty(did)) {
            return;
        }
        WearableDeviceManager.Companion companion = WearableDeviceManager.INSTANCE;
        WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(companion);
        Intrinsics.checkNotNull(did);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(did);
        if (Intrinsics.areEqual(wearableDeviceModel != null ? wearableDeviceModel.getDid() : null, did) && (wearableDevice = (WearableDevice) wearableDeviceModel.getDeviceInfo().device) != null) {
            Device.Detail detail = wearableDevice.getDetail();
            String phoneId = detail != null ? detail.getPhoneId() : null;
            String uniqueIdentify = DeviceManagerExtKt.getInstance(companion).getUniqueIdentify();
            Logger.i(TAG, "onConnectSuccess: report id = " + uniqueIdentify + ", phone id = " + phoneId);
            if (phoneId == null || !Intrinsics.areEqual(uniqueIdentify, phoneId) || upload) {
                Device.Detail detail2 = wearableDevice.getDetail();
                if (detail2 != null) {
                    detail2.setPhoneId(uniqueIdentify);
                }
                if (AccountManagerExtKt.getInstance(AccountManager.INSTANCE).isLogin()) {
                    getMDeviceManager().updateDevice(wearableDevice);
                    DevicePreference.INSTANCE.setCONNECT_NEW_PHONE(false);
                    upload = false;
                }
            }
        }
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable String did) {
    }

    public final void registerBindNewReceiver() {
        Logger.i(TAG, "registerBindNewReceiver() called");
        IntentFilter intentFilter = new IntentFilter(NOTIFY_NEW_BIND_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            ApplicationExtKt.getApplication().registerReceiver(bindNewReceiver, intentFilter, 2);
        } else {
            ApplicationExtKt.getApplication().registerReceiver(bindNewReceiver, intentFilter);
        }
    }
}
