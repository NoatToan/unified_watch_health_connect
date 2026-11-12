package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.business.IDeviceLifeCycle;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleFactory;
import com.huami.bluetooth.profile.channel.module.ChannelModuleProvider;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStore;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner;
import com.huami.bluetooth.profile.channel.module.settings.GroupVersionCache;
import com.huami.bluetooth.profile.channel.module.settings.SettingsCallback;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.ife.IDetailedConnectionCallback;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.SyncStatus;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.base.AGpsDto;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.DfuApi;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.utils.ThreadUtil;
import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public abstract class HMBaseDevice implements IHMAuthCallback, ChannelModuleStoreOwner, SettingsCallback {
    public static final int DEFAULT_VERSION_CODE = -1;
    public static final String TAG = "HMBaseDevice";
    private IHMAuthCallback mAuthCallback;
    public IHMConnectionCallback mConnectionCallback;
    public Context mContext;
    private BluetoothDevice mDevice;
    public ConcurrentLinkedQueue<IDeviceLifeCycle> lifeCycleObservers = new ConcurrentLinkedQueue<>();
    private ReentrantLock deviceLock = new ReentrantLock();
    private final Handler handler = new Handler(Looper.getMainLooper());
    private AtomicBoolean mIsBluetoothEnable = new AtomicBoolean(true);
    private AtomicBoolean mHasDestroy = new AtomicBoolean(true);
    private boolean mAutoReconnect = true;
    private AuthInfo mAuthInfo = null;
    private HMCallback<BatteryInfo> mBatteryChangedCallback = null;
    private ExecutorService fixedThreadPool = ThreadUtil.newSingleThreadExecutor(TAG, 10);
    private ExecutorService multiThreadPool = ThreadUtil.newMultiThreadExecutor(TAG);
    private BroadcastReceiver mBroadcastReceiver = new a();
    private final Map<String, Object> moduleMap = new HashMap();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            Debug.fi(HMBaseDevice.TAG, "action:" + action);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                Debug.fi(HMBaseDevice.TAG, "state:" + HMBaseDevice.this.getBluetoothStateString(intExtra));
                if (intExtra != 10) {
                    if (intExtra == 12) {
                        HMBaseDevice.this.onBtOn();
                        return;
                    } else if (intExtra != 13) {
                        return;
                    }
                }
                HMBaseDevice.this.onBtOff();
            }
        }
    }

    public class b implements SyncDataCallback<List<GpsRecord>> {
        public final /* synthetic */ HMCallback a;

        public b(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<GpsRecord> records) {
            this.a.onData(records);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onFinish(@NotNull HMDeviceError error) {
            this.a.onFinish(error.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onProgress(@NotNull Progress progress) {
            this.a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onStart() {
            this.a.onStart();
        }
    }

    public HMBaseDevice(Context context, BluetoothDevice device) {
        this.mContext = context;
        this.mDevice = device;
        this.mIsBluetoothEnable.getAndSet(GattUtils.isBluetoothEnable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getBluetoothStateString(int state) {
        if (state == Integer.MIN_VALUE) {
            return "STATE_ERROR";
        }
        switch (state) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "STATE Unknown:" + state;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reset$1(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(reset());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setDateTime$0(HMCallback hMCallback, Calendar calendar) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setDateTimeSync(calendar));
    }

    public abstract AuthResult auth(AuthInfo info, IHMAuthCallback callback);

    public boolean callNonConnected(HMCallback callback) {
        if (isConnected()) {
            return false;
        }
        if (callback == null) {
            return true;
        }
        callback.sendOnStartMessage();
        callback.sendOnFinishMessage(false);
        return true;
    }

    public void clearModule() {
        synchronized (this.moduleMap) {
            this.moduleMap.clear();
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.SettingsCallback
    public boolean connected() {
        return isConnected();
    }

    public void create(boolean forceDirectly) {
        this.deviceLock.lock();
        try {
            try {
                this.mHasDestroy.set(false);
                this.mIsBluetoothEnable.getAndSet(GattUtils.isBluetoothEnable());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                this.mContext.registerReceiver(this.mBroadcastReceiver, intentFilter);
            } catch (Exception e) {
                Debug.fi(TAG, e.getLocalizedMessage());
            }
        } finally {
            this.deviceLock.unlock();
        }
    }

    @Nullable
    public <T> T createModule(Class<T> clazz) {
        return null;
    }

    public void destroy() {
        this.deviceLock.lock();
        try {
            try {
                GroupVersionCache.INSTANCE.clearCache(this);
                if (this.mBroadcastReceiver != null && this.mHasDestroy.compareAndSet(false, true)) {
                    this.mContext.unregisterReceiver(this.mBroadcastReceiver);
                    this.mBroadcastReceiver = null;
                }
                this.mAuthCallback = null;
                this.mConnectionCallback = null;
            } catch (Exception e) {
                Debug.fi(TAG, e.getLocalizedMessage());
            }
        } finally {
            this.deviceLock.unlock();
        }
    }

    public void enableRealtimeStep(boolean enable) {
    }

    @Nullable
    @WorkerThread
    public AGpsDto getAGpsDto() {
        return null;
    }

    @Nullable
    public String getAddress() {
        BluetoothDevice bluetoothDevice = this.mDevice;
        if (bluetoothDevice == null) {
            return null;
        }
        return bluetoothDevice.getAddress();
    }

    public AuthInfo getAuthInfo() {
        return this.mAuthInfo;
    }

    public BatteryInfo getBatteryInfo() {
        return null;
    }

    public IBleInterface getBleInterface() {
        return null;
    }

    public BluetoothDevice getBluetoothDevice() {
        return this.mDevice;
    }

    @Nullable
    public <T extends BaseModule> T getChannelModule(Class<T> cls) {
        return (T) ChannelModuleProvider.INSTANCE.of(this).get(cls);
    }

    @Nullable
    public ChannelModuleFactory getChannelModuleFactory() {
        return null;
    }

    @Nullable
    public ChannelModuleStore getChannelModuleStore() {
        return null;
    }

    @Nullable
    public Pair<Integer, Integer> getCoeff() {
        return null;
    }

    Context getContext() {
        return this.mContext;
    }

    public void getDateTime(final HMCallback<Calendar> callBack) {
    }

    public Feature getDeviceFeature() {
        DeviceInfo deviceInfo = getDeviceInfo();
        return deviceInfo == null ? new Feature() : deviceInfo.getDeviceFeature();
    }

    public abstract DeviceInfo getDeviceInfo();

    public void getDeviceLog(File file, final IHMDataCallback<File> callback) {
    }

    public HMDeviceSource getDeviceSource() {
        DeviceInfo deviceInfo = getDeviceInfo();
        return deviceInfo == null ? HMDeviceSource.VDEVICE : deviceInfo.getDeviceSource();
    }

    public abstract HMDeviceType getDeviceType();

    @Nullable
    public String getDeviceVersion() {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return deviceInfo.getFirmwareVersionStr();
    }

    public int getDeviceVersionCode() {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return -1;
        }
        return deviceInfo.getFirmwareVersion();
    }

    @Nullable
    public String getDeviceVersionFill() {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return deviceInfo.getFirmwareVersionStrFill();
    }

    @Nullable
    public DfuApi getDfuApi() {
        return null;
    }

    @Nullable
    public <T> T getModule(@NonNull Class<T> cls) {
        if (!isConnected()) {
            return null;
        }
        synchronized (this.moduleMap) {
            T t = (T) this.moduleMap.get(cls.getCanonicalName());
            if (t != null) {
                return t;
            }
            T t2 = (T) createModule(cls);
            if (t2 == null) {
                return null;
            }
            this.moduleMap.put(cls.getCanonicalName(), t2);
            return t2;
        }
    }

    public RealtimeStep getRealtimeStep() {
        return null;
    }

    public HMStatisticInfo getStatisticInfo() {
        return null;
    }

    public void getStatisticInfo(final HMCallback<HMStatisticInfo> callback) {
    }

    public abstract Status getStatus();

    public SyncStatus getSyncStatus() {
        return null;
    }

    public boolean hasDestroy() {
        return this.mHasDestroy.get();
    }

    public boolean hasFeatureSw(int feature) {
        Feature deviceFeature;
        DeviceInfo deviceInfo = getDeviceInfo();
        return (deviceInfo == null || (deviceFeature = deviceInfo.getDeviceFeature()) == null || !deviceFeature.hasSw(feature)) ? false : true;
    }

    public boolean isAutoReconnect() {
        return this.mAutoReconnect;
    }

    boolean isBluetoothEnable() {
        return this.mIsBluetoothEnable.get();
    }

    public abstract boolean isConnected();

    public boolean isSyncingData() {
        return false;
    }

    public boolean isTimexDevice() {
        return HMDeviceFeature.TIMEX_DEVICE.contains(getDeviceSource());
    }

    public boolean needReconnect() {
        return false;
    }

    public void notifyBatteryChanged(BatteryInfo info) {
        HMCallback<BatteryInfo> hMCallback = this.mBatteryChangedCallback;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(info);
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
    public void onAuthentication(HMAuthState state) {
        IHMAuthCallback iHMAuthCallback = this.mAuthCallback;
        if (iHMAuthCallback != null) {
            iHMAuthCallback.onAuthentication(state);
        }
    }

    public void onBtOff() {
        this.mIsBluetoothEnable.getAndSet(false);
    }

    public void onBtOn() {
        this.mIsBluetoothEnable.getAndSet(true);
    }

    public void onConnectionStatusChangedInternal(BluetoothDevice device, HMDeviceType type, Status status) {
        IHMConnectionCallback iHMConnectionCallback = this.mConnectionCallback;
        if (iHMConnectionCallback != null) {
            iHMConnectionCallback.onConnectionStatusChanged(device, type, status);
        }
    }

    public boolean onDetailedConnectionStatusChangedInternal(BluetoothDevice device, HMDeviceType type, Status status) {
        IHMConnectionCallback iHMConnectionCallback = this.mConnectionCallback;
        if (!(iHMConnectionCallback instanceof IDetailedConnectionCallback)) {
            return false;
        }
        iHMConnectionCallback.onConnectionStatusChanged(device, type, status);
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
    public byte[] onGetSignData(byte[] sha256, byte[] publicKeyHash, int hashAlgo) {
        IHMAuthCallback iHMAuthCallback = this.mAuthCallback;
        if (iHMAuthCallback != null) {
            return iHMAuthCallback.onGetSignData(sha256, publicKeyHash, hashAlgo);
        }
        return null;
    }

    public abstract void reConnect(boolean force);

    public int readRemoteRssi() {
        return 0;
    }

    public void registerLifeCycleListener(IDeviceLifeCycle lifeCycle) {
        this.lifeCycleObservers.add(lifeCycle);
    }

    public final void reset(final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: rk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$reset$1(callback);
            }
        });
    }

    public boolean reset() {
        return false;
    }

    public void runOnDeviceMultiThread(Runnable runnable) {
        this.multiThreadPool.execute(runnable);
    }

    public void runOnDeviceOnlyThread(Runnable runnable) {
        Debug.fi(TAG, "runOnDeviceOnlyThread:" + runnable.getClass().getName());
        this.fixedThreadPool.execute(runnable);
    }

    public void runOnMainThread(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void setAuthCallback(IHMAuthCallback callback) {
        this.mAuthCallback = callback;
    }

    public void setAuthInfo(AuthInfo info) {
        this.mAuthInfo = info;
    }

    public void setAutoReconnect(boolean autoReconnect) {
        this.mAutoReconnect = autoReconnect;
    }

    public void setBatteryChangedCallback(HMCallback<BatteryInfo> callback) {
        this.mBatteryChangedCallback = callback;
    }

    public void setConnectionCallback(IHMConnectionCallback connectionCallback) {
        this.mConnectionCallback = connectionCallback;
    }

    public void setDateTime(final Calendar calendar, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: sk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$setDateTime$0(callback, calendar);
            }
        });
    }

    public boolean setDateTimeSync(Calendar calendar) {
        return false;
    }

    public void setRealtimeStepCallback(HMCallback<RealtimeStep> callback) {
    }

    public void startSyncData(final Calendar calendar, final IHMActivityDataCallback callback) {
    }

    @Deprecated
    public void startSyncGpsData(Calendar calendar, final HMCallback<List<GpsRecord>> callback) {
        startSyncGpsData(calendar, new b(callback));
    }

    public <T> Future<T> submitOnDeviceMultiThread(Callable<T> callable) {
        return this.multiThreadPool.submit(callable);
    }

    public Future submitOnDeviceOnlyThread(Runnable runnable) {
        Debug.fi(TAG, "submitOnDeviceOnlyThread:" + runnable.getClass().getName());
        return this.fixedThreadPool.submit(runnable);
    }

    public boolean supportModule(int moduleId) {
        return false;
    }

    public <T extends BaseModule> boolean supportModule(@NotNull Class<T> clazz) {
        return false;
    }

    public void terminateDeviceLog() {
    }

    public boolean unbindSync(AuthInfo info) {
        return true;
    }

    public void unregisterLifeCycleListener(IDeviceLifeCycle lifeCycle) {
        this.lifeCycleObservers.remove(lifeCycle);
    }

    public void updateFwUpgrade(HMFirmwareInfo firmwareInfo, final IHMFirmwareUpgradeCallback callback) {
    }

    public void updateFwUpgrades(List<HMFirmwareInfo> firmwareInfo, final IHMFirmwareUpgradeCallback callback) {
    }

    public void startSyncGpsData(Calendar calendar, final SyncDataCallback<List<GpsRecord>> callback) {
        callback.onStart();
        callback.onFinish(new HMDeviceError(3));
    }

    public <T> Future<T> submitOnDeviceOnlyThread(Callable<T> callable) {
        Debug.fi(TAG, "submitOnDeviceOnlyThread:" + callable.getClass().getName());
        return this.fixedThreadPool.submit(callable);
    }
}
