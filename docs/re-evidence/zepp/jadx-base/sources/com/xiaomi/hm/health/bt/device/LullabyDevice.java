package com.xiaomi.hm.health.bt.device;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import android.os.PowerManager;
import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.device.function.MtuObtain;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeCallback;
import com.huami.bluetooth.device.function.upgrade.FirmwareUpgradeResult;
import com.huami.bluetooth.profile.channel.module.battery.BatteryApi;
import com.huami.bluetooth.profile.channel.module.battery.BatteryModule;
import com.huami.bluetooth.profile.channel.module.battery.impl.BatteryApiImpl;
import com.xiaomi.hm.health.bt.classic.HMSyncActivityDataTask;
import com.xiaomi.hm.health.bt.classic.NewDfuProfile;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.model.SyncStatus;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.dfu.NewDfuTask;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0011\u0012\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\b\u0010\u0005\u001a\u00020\u0004H\u0003J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u001c\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0011H\u0016J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0004H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dJ\u0012\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001bH\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R(\u0010+\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00102\u001a\u00020\r8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00108\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/bt/device/LullabyDevice;", "Lcom/xiaomi/hm/health/bt/device/MozartDevice;", "Lcom/huami/bluetooth/device/function/MtuObtain;", "Lcom/xiaomi/hm/health/bt/profile/base/IHMBatteryInfoCallback;", "", "H", "Ljava/util/Calendar;", "calendar", "Lcom/xiaomi/hm/health/bt/profile/gdsp/activity/IHMActivityDataCallback;", "callback", "startSyncData", "Ljava/util/concurrent/Future;", "syncData", "Lcom/xiaomi/hm/health/bt/model/SyncStatus;", "getSyncStatus", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmware", "Lcom/huami/bluetooth/device/function/upgrade/FirmwareUpgradeCallback;", "upgradeFirmware", "Lcom/xiaomi/hm/health/bt/profile/dfu/DfuApi;", "getDfuApi", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfoSync", "initDeviceInfo", "deInitDeviceInfo", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "getBatteryInfo", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryApi;", "createBatteryApi", "info", "onBatteryChanged", "", "O", "Ljava/lang/Object;", "mSyncObj", "P", "Ljava/util/concurrent/Future;", "getMSyncFuture", "()Ljava/util/concurrent/Future;", "setMSyncFuture", "(Ljava/util/concurrent/Future;)V", "mSyncFuture", "Q", "Lcom/xiaomi/hm/health/bt/model/SyncStatus;", "getMSyncStatus", "()Lcom/xiaomi/hm/health/bt/model/SyncStatus;", "setMSyncStatus", "(Lcom/xiaomi/hm/health/bt/model/SyncStatus;)V", "mSyncStatus", "R", "Lcom/huami/bluetooth/profile/channel/module/battery/BatteryApi;", "batteryApi", ExifInterface.LATITUDE_SOUTH, "Lcom/xiaomi/hm/health/bt/profile/base/BatteryInfo;", "mBatteryInfo", "Landroid/bluetooth/BluetoothDevice;", "device", "<init>", "(Landroid/bluetooth/BluetoothDevice;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LullabyDevice extends MozartDevice implements MtuObtain, IHMBatteryInfoCallback {

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final Object mSyncObj;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @Nullable
    private Future<?> mSyncFuture;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    private volatile SyncStatus mSyncStatus;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @Nullable
    private BatteryApi batteryApi;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @Nullable
    private BatteryInfo mBatteryInfo;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Mtu> {
        public a(LullabyDevice lullabyDevice) {
            super(0, lullabyDevice, LullabyDevice.class, "getMtu", "getMtu()Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Mtu invoke() {
            return ((LullabyDevice) this.receiver).getMtu();
        }
    }

    public LullabyDevice(@Nullable BluetoothDevice bluetoothDevice) {
        super(bluetoothDevice);
        this.mSyncObj = new Object();
        this.mSyncStatus = new SyncStatus();
    }

    @SuppressLint({"ObsoleteSdkInt"})
    private final void H() {
        BatteryApi batteryApi;
        BatteryApi batteryApi2 = this.batteryApi;
        if (batteryApi2 != null && batteryApi2 != null) {
            batteryApi2.unregisterBatteryListener(this);
        }
        BatteryApi batteryApiCreateBatteryApi = createBatteryApi();
        this.batteryApi = batteryApiCreateBatteryApi;
        if (batteryApiCreateBatteryApi == null) {
            return;
        }
        BatteryInfo batteryInfo = batteryApiCreateBatteryApi == null ? null : batteryApiCreateBatteryApi.getBatteryInfo();
        this.mBatteryInfo = batteryInfo;
        Debug.fi(HMBaseBleDevice.q, Intrinsics.stringPlus("battery info:", batteryInfo));
        if (Build.VERSION.SDK_INT < 19 || (batteryApi = this.batteryApi) == null) {
            return;
        }
        batteryApi.registerBatteryInfoCallback(this);
    }

    @Nullable
    public final BatteryApi createBatteryApi() {
        BatteryModule batteryModule;
        Integer version;
        if (supportModule(BatteryModule.class) && (batteryModule = (BatteryModule) getChannelModule(BatteryModule.class)) != null && (version = batteryModule.getVersion()) != null && version.intValue() == 1) {
            return new BatteryApiImpl(batteryModule);
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.MozartDevice
    public void deInitDeviceInfo() {
        this.batteryApi = null;
        this.mBatteryInfo = null;
        setDeviceInfoReady(false);
    }

    @Override // com.xiaomi.hm.health.bt.device.MozartDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public BatteryInfo getBatteryInfo() {
        if (isConnected()) {
            return this.mBatteryInfo;
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.MozartDevice, com.xiaomi.hm.health.bt.device.HMBaseClassicDevice
    @Nullable
    public DeviceInfo getDeviceInfoSync() {
        DeviceInfo deviceInfo = getDeviceInfoNewController().getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        deviceInfo.setDeviceFeature(this.mFeature);
        return deviceInfo;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @Nullable
    public DfuApi getDfuApi() {
        NewDfuProfile newDfuProfile = new NewDfuProfile(getTransport());
        newDfuProfile.setMtuFunc(new a(this));
        return newDfuProfile;
    }

    @Nullable
    public final Future<?> getMSyncFuture() {
        return this.mSyncFuture;
    }

    @NotNull
    public final SyncStatus getMSyncStatus() {
        return this.mSyncStatus;
    }

    @Override // com.huami.bluetooth.device.function.MtuObtain
    @Nullable
    public Mtu getMtu() {
        Mtu mtu;
        synchronized (this) {
            mtu = getEcfController().getMtu();
        }
        return mtu;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public SyncStatus getSyncStatus() {
        return this.mSyncStatus;
    }

    @Override // com.xiaomi.hm.health.bt.device.MozartDevice
    public void initDeviceInfo() {
        H();
        setDeviceInfoReady(true);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback
    public void onBatteryChanged(@Nullable BatteryInfo info) {
        BatteryApi batteryApi;
        if (info == null) {
            return;
        }
        if (info.getLastCharge() == null && (batteryApi = this.batteryApi) != null) {
            info = batteryApi == null ? null : batteryApi.getBatteryInfo();
        }
        if (info != null) {
            this.mBatteryInfo = info;
            notifyBatteryChanged(info);
        }
    }

    public final void setMSyncFuture(@Nullable Future<?> future) {
        this.mSyncFuture = future;
    }

    public final void setMSyncStatus(@NotNull SyncStatus syncStatus) {
        this.mSyncStatus = syncStatus;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncData(@Nullable Calendar calendar, @NotNull final IHMActivityDataCallback callback) {
        synchronized (this.mSyncObj) {
            if (!isConnected()) {
                Debug.fi(HMBaseDevice.TAG, "startSyncData return as not connected!!!");
                callback.onSyncStart();
                callback.onSyncFinish(new HMDeviceSyncDataError(3));
                return;
            }
            if (getMSyncFuture() != null) {
                Future<?> mSyncFuture = getMSyncFuture();
                if (!(mSyncFuture != null && mSyncFuture.isDone())) {
                    Debug.fi(HMBaseDevice.TAG, "startSyncData return as syncing now!!!");
                    return;
                }
            }
            setMSyncFuture(syncData(calendar, new IHMActivityDataCallback() { // from class: com.xiaomi.hm.health.bt.device.LullabyDevice$startSyncData$1$innerCb$1

                /* JADX INFO: renamed from: a, reason: from kotlin metadata */
                @Nullable
                private PowerManager.WakeLock mWakeLock;

                private final void a() {
                    Object systemService = this.getContext().getSystemService("power");
                    Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
                    PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, "mifit:IHMActivityDataCallback");
                    this.mWakeLock = wakeLockNewWakeLock;
                    if (wakeLockNewWakeLock == null) {
                        return;
                    }
                    wakeLockNewWakeLock.acquire(60000L);
                }

                private final void b() {
                    PowerManager.WakeLock wakeLock = this.mWakeLock;
                    if (wakeLock != null) {
                        wakeLock.release();
                    }
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
                public void onSyncFinish(@NotNull HMDeviceSyncDataError error) {
                    callback.onSyncFinish(error);
                    this.getMSyncStatus().setProgress(null);
                    this.getMSyncStatus().setError(error);
                    b();
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
                public void onSyncProgress(@NotNull Progress progress) {
                    callback.onSyncProgress(progress);
                    this.getMSyncStatus().setProgress(progress);
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
                public void onSyncStart() {
                    a();
                    callback.onSyncStart();
                    this.getMSyncStatus().setProgress(new Progress());
                }

                @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
                public void onSyncStop(@Nullable List<? extends ActivityDataFragment<?>> dataFragmentList) {
                    callback.onSyncStop(dataFragmentList);
                }
            }));
            if (getMSyncFuture() == null) {
                Debug.fi(HMBaseBleDevice.q, "startSyncData return as null future!!!");
                callback.onSyncStart();
                callback.onSyncFinish(new HMDeviceSyncDataError(100));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @Nullable
    public final Future<?> syncData(@NotNull Calendar calendar, @NotNull IHMActivityDataCallback callback) {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return submitOnDeviceOnlyThread(new HMSyncActivityDataTask(getTransport(), deviceInfo, calendar, callback));
    }

    @Override // com.xiaomi.hm.health.bt.device.MozartDevice, com.huami.bluetooth.device.function.upgrade.FirmwareUpgrade
    public void upgradeFirmware(@NotNull HMFirmwareInfo firmware, @NotNull final FirmwareUpgradeCallback callback) {
        runOnDeviceOnlyThread(new NewDfuTask(getDfuApi(), firmware, new IFirmwareUpgradeCallback() { // from class: com.xiaomi.hm.health.bt.device.LullabyDevice.upgradeFirmware.1
            @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
            public void onError(int i) {
                IFirmwareUpgradeCallback.DefaultImpls.onError(this, i);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwProgress(@Nullable Progress progress) {
                if (progress == null) {
                    return;
                }
                callback.onProgress(progress);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStart(int none) {
                callback.onStart();
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback
            public void onFwStop(boolean result) {
                callback.onComplete(result ? FirmwareUpgradeResult.COMPLETE : FirmwareUpgradeResult.FAILED);
            }

            @Override // com.xiaomi.hm.health.bt.profile.dfu.IFirmwareUpgradeCallback
            public void upgradingProgress(@NotNull HMFirmwareType hMFirmwareType, @NotNull Progress progress) {
                IFirmwareUpgradeCallback.DefaultImpls.upgradingProgress(this, hMFirmwareType, progress);
            }
        }));
    }
}
