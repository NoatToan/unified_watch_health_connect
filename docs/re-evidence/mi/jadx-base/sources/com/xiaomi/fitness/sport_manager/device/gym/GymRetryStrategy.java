package com.xiaomi.fitness.sport_manager.device.gym;

import android.os.Handler;
import android.os.Looper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.OnDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceModelExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import com.xiaomi.fitness.sport_manager.device.gym.GymRetryStrategy;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.miot.core.bluetooth.BluetoothManager;
import com.xiaomi.wearable.wear.api.ExternalRetryStrategy;
import defpackage.a33;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000bJ\u0019\u0010\u0012\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/sport_manager/device/gym/GymRetryStrategy;", "Lcom/xiaomi/wearable/wear/api/ExternalRetryStrategy;", "Lcom/xiaomi/fitness/device/manager/OnDeviceStatusListener;", "La33;", "", "needRetry", "()Z", "", "did", "", "onConnectStart", "(Ljava/lang/String;)V", "", "errorCode", "retryTimes", "onConnectFailure", "(Ljava/lang/String;II)V", "onConnectSuccess", "onDisconnect", "state", "onStateChanged", "(I)V", "TAG", "Ljava/lang/String;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "localGymDeviceDid", "<init>", "()V", "sport-manager_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GymRetryStrategy implements ExternalRetryStrategy, OnDeviceStatusListener, a33 {

    @NotNull
    public static final GymRetryStrategy INSTANCE;

    @NotNull
    private static final String TAG = "GymRetryStrategy";

    @NotNull
    private static final Handler handler;

    @Nullable
    private static String localGymDeviceDid;

    static {
        GymRetryStrategy gymRetryStrategy = new GymRetryStrategy();
        INSTANCE = gymRetryStrategy;
        handler = new Handler(Looper.getMainLooper());
        BluetoothManager.INSTANCE.get().addBluetoothStateListener(gymRetryStrategy);
    }

    private GymRetryStrategy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onDisconnect$lambda$0(WearableDeviceModel wearableDeviceModel, String str) {
        if (wearableDeviceModel.getIsDeviceConnected()) {
            return;
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStateChanged$lambda$1(WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "$deviceModel");
        if (deviceModel.getIsDeviceConnected()) {
            return;
        }
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).connectDevice(deviceModel.getDid());
    }

    @NotNull
    public final Handler getHandler() {
        return handler;
    }

    @Override // com.xiaomi.wearable.wear.api.ExternalRetryStrategy
    public boolean needRetry() {
        int localSportState = SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).getLocalSportState();
        Logger.i(TAG, "needRetry: " + localSportState);
        return localSportState == 1 || localSportState == 2 || localSportState == 3;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectFailure(@Nullable String did, int errorCode, int retryTimes) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectStart(@Nullable String did) {
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onConnectSuccess(@Nullable String did) {
        WearableDeviceModel wearableDeviceModel;
        if (did == null || did.length() == 0 || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null || !DeviceModelExtKt.isTreadmill(wearableDeviceModel)) {
            return;
        }
        localGymDeviceDid = did;
    }

    @Override // com.xiaomi.fitness.device.manager.OnDeviceStatusListener
    public void onDisconnect(@Nullable final String did) {
        final WearableDeviceModel wearableDeviceModel;
        if (did == null || did.length() == 0 || (wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceModel(did)) == null || !DeviceModelExtKt.isTreadmill(wearableDeviceModel) || !needRetry()) {
            return;
        }
        Logger.i(TAG, "onDisconnect() treadmill retry connect = " + did);
        handler.postDelayed(new Runnable() { // from class: ncb
            @Override // java.lang.Runnable
            public final void run() {
                GymRetryStrategy.onDisconnect$lambda$0(wearableDeviceModel, did);
            }
        }, VibrateModeProgressBar.sLongToLong);
    }

    @Override // defpackage.a33
    public void onStateChanged(int state) {
        String str = localGymDeviceDid;
        if (str == null || str.length() == 0) {
            return;
        }
        String str2 = localGymDeviceDid;
        if (state == 12 && needRetry()) {
            WearableDeviceManager deviceManagerExtKt = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE);
            Intrinsics.checkNotNull(str2);
            final WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) deviceManagerExtKt.getDeviceModel(str2);
            if (wearableDeviceModel == null) {
                return;
            }
            Logger.i(TAG, "onStateChanged() called with: state = " + state + ", " + wearableDeviceModel + ", " + DeviceModelExtKt.isTreadmill(wearableDeviceModel) + ", " + wearableDeviceModel.getIsDeviceConnected());
            if (DeviceModelExtKt.isTreadmill(wearableDeviceModel)) {
                handler.postDelayed(new Runnable() { // from class: mcb
                    @Override // java.lang.Runnable
                    public final void run() {
                        GymRetryStrategy.onStateChanged$lambda$1(wearableDeviceModel);
                    }
                }, VibrateModeProgressBar.sLongToLong);
            }
        }
    }
}
