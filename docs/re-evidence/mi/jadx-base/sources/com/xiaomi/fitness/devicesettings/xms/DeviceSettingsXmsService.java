package com.xiaomi.fitness.devicesettings.xms;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\"\u0010\u000f\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/xms/DeviceSettingsXmsService;", "Landroid/app/Service;", "<init>", "()V", "binder", "Lcom/xiaomi/fitness/devicesettings/xms/DeviceSettingsXmsApiImpl;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onUnbind", "", LifecycleConstantKt.ON_DESTROY, "onStartCommand", "", "flags", "startId", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceSettingsXmsService extends Service {

    @NotNull
    public static final String PARAM_FIND_DEVICE_STATUS = "PARAM_FIND_DEVICE_STATUS";

    @NotNull
    public static final String TAG = "DeviceSettingsXmsService";

    @Nullable
    private DeviceSettingsXmsApiImpl binder;

    @Override // android.app.Service
    @NotNull
    public IBinder onBind(@Nullable Intent intent) {
        Logger.i(TAG, "onBind");
        DeviceSettingsXmsApiImpl deviceSettingsXmsApiImpl = this.binder;
        Intrinsics.checkNotNull(deviceSettingsXmsApiImpl);
        return deviceSettingsXmsApiImpl;
    }

    @Override // android.app.Service
    public void onCreate() {
        Logger.i(TAG, "onCreate");
        this.binder = new DeviceSettingsXmsApiImpl();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Logger.i(TAG, LifecycleConstantKt.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        DeviceSettingsXmsApiImpl deviceSettingsXmsApiImpl;
        if (intent == null) {
            return 1;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        int intExtra = intent.getIntExtra(PARAM_FIND_DEVICE_STATUS, -1);
        if (wearableDeviceModel != null && (deviceSettingsXmsApiImpl = this.binder) != null) {
            Intrinsics.checkNotNull(deviceSettingsXmsApiImpl);
            deviceSettingsXmsApiImpl.updateFindDeviceStatus(wearableDeviceModel.getDid(), intExtra);
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Override // android.app.Service
    public boolean onUnbind(@Nullable Intent intent) {
        Logger.i(TAG, "onUnbind");
        return super.onUnbind(intent);
    }
}
