package com.xiaomi.hm.health.bt.device.smartwatch;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.PowerManager;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.device.Status;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.HMSmartWatchSyncFirstbeatTask;
import com.xiaomi.hm.health.bt.profile.smartwatch.firstbeat.IHMFirstbeatDataCallback;
import com.xiaomi.hm.health.bt.profile.smartwatch.health.BleHealthData;
import com.xiaomi.hm.health.bt.profile.smartwatch.health.HMSmartWatchSyncHealthDataTask;
import com.xiaomi.hm.health.bt.profile.smartwatch.health.IHMHealthDataCallback;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.BleSportData;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.HMSmartWatchSyncSportDataProfile;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.HMSmartWatchSyncSportDataTask;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.IHMSportDataCallback;
import com.xiaomi.hm.health.bt.profile.smartwatch.transport.HMSmartWatchTransportProfile;
import com.xiaomi.hm.health.bt.profile.smartwatch.weather.HMSmartWatchWeatherProfile;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes19.dex */
public class HMSmartWatchDevice extends HMMiLiProDevice {
    private static final String U = "Device-SmartWatch";
    private static final String V = "Amazfit Everest 2";
    private static final HashMap<String, HMDeviceSource> W = new a();
    private SmartWatchProfile P;
    private HMSmartWatchTransportProfile Q;
    private IHMConnectionCallback R;
    private HMCallback<HMLFEvent> S;
    private IHMAuthCallback T;

    public class a extends HashMap<String, HMDeviceSource> {
        public a() {
            putAll(ProxyContainer.getProxy().getSmartWatchNames());
        }
    }

    public class b implements IHMHealthDataCallback {
        private PowerManager.WakeLock a = null;
        public final /* synthetic */ IHMHealthDataCallback b;

        public b(final IHMHealthDataCallback val$callback) {
            this.b = val$callback;
        }

        private void a() {
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) HMSmartWatchDevice.this.mContext.getSystemService("power")).newWakeLock(1, "mifit:IHMActivityDataCallback");
            this.a = wakeLockNewWakeLock;
            wakeLockNewWakeLock.acquire(60000L);
        }

        private void b() {
            PowerManager.WakeLock wakeLock = this.a;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncFinish(HMDeviceSyncDataError error) {
            this.b.onSyncFinish(error);
            HMSmartWatchDevice.this.mSyncStatus.setProgress(null);
            HMSmartWatchDevice.this.mSyncStatus.setError(error);
            b();
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncProgress(Progress progress) {
            this.b.onSyncProgress(progress);
            HMSmartWatchDevice.this.mSyncStatus.setProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStart() {
            a();
            this.b.onSyncStart();
            HMSmartWatchDevice.this.mSyncStatus.setProgress(new Progress());
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.health.IHMHealthDataCallback
        public void onSyncStop(BleHealthData healthData) {
            this.b.onSyncStop(healthData);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStop(List<ActivityDataFragment> dataFragmentList) {
        }
    }

    public class c implements IHMHealthDataCallback {
        public final /* synthetic */ IHMActivityDataCallback a;

        public c(final IHMActivityDataCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncFinish(HMDeviceSyncDataError error) {
            this.a.onSyncFinish(error);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncProgress(Progress progress) {
            this.a.onSyncProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStart() {
            this.a.onSyncStart();
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.health.IHMHealthDataCallback
        public void onSyncStop(BleHealthData healthData) {
            this.a.onSyncStop(healthData.detailList);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStop(List<ActivityDataFragment> dataFragmentList) {
        }
    }

    public class d implements IHMSportDataCallback {
        public final /* synthetic */ HMCallback a;

        public d(final HMCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onData(List<GpsRecord> records) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onFinish(boolean ret) {
            this.a.onFinish(ret);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onProgress(Progress progress) {
            this.a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.sport.IHMSportDataCallback
        public void onSportData(List<BleSportData> data) {
            Log.d(HMSmartWatchDevice.U, "OnSync SportData: " + ArraysUtil.toString(data), new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onStart() {
            this.a.onStart();
        }
    }

    public class e implements IHMAuthCallback {
        public e() {
        }

        @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public void onAuthentication(HMAuthState state) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public byte[] onGetSignData(byte[] sha256, byte[] publicKeyHash, int hashAlgo) {
            return new byte[0];
        }
    }

    public class f extends HMCallback<HMLFEvent> {
        public f() {
        }

        @Override // com.xiaomi.hm.health.bt.device.HMCallback
        public void onData(HMLFEvent event) {
            if (HMSmartWatchDevice.this.S != null) {
                HMSmartWatchDevice.this.S.onData(event);
            }
        }
    }

    public class g implements IHMAuthCallback {
        public final /* synthetic */ IHMAuthCallback a;

        public g(final IHMAuthCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public void onAuthentication(HMAuthState state) {
            if (HMSmartWatchDevice.this.T != null) {
                HMSmartWatchDevice.this.T.onAuthentication(state);
            } else {
                this.a.onAuthentication(state);
            }
        }

        @Override // com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback
        public byte[] onGetSignData(byte[] sha256, byte[] publicKeyHash, int hashAlgo) {
            return HMSmartWatchDevice.this.T != null ? HMSmartWatchDevice.this.T.onGetSignData(sha256, publicKeyHash, hashAlgo) : this.a.onGetSignData(sha256, publicKeyHash, hashAlgo);
        }
    }

    public HMSmartWatchDevice(Context context, String device) {
        super(context, device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L8(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.enableAllDayPressure(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M8(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.enableHRAllDay(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N8(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.enableMusicControl(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O8(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.enableWeatherDailyNotify(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P8(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(getSmartWatchDeviceInfoSync());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q8(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.isAllDayPressureEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R8(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.isHRAllDayEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S8(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.isSedentaryReminderEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T8(IHMConnectionCallback iHMConnectionCallback, BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
        IHMConnectionCallback iHMConnectionCallback2 = this.R;
        if (iHMConnectionCallback2 != null) {
            iHMConnectionCallback2.onConnectionStatusChanged(bluetoothDevice, hMDeviceType, status);
        }
        iHMConnectionCallback.onConnectionStatusChanged(bluetoothDevice, hMDeviceType, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U8(HMCallback hMCallback, HMSedentaryConfig hMSedentaryConfig) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(this.P.setSedentary(hMSedentaryConfig));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void V8(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W8(HMCallback hMCallback, boolean z) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setWeatherTemperatureUnit(z));
    }

    private Future X8(Calendar calendar, IHMHealthDataCallback callback) {
        DeviceInfo deviceInfo = getDeviceInfo();
        if (deviceInfo == null) {
            return null;
        }
        return submitOnDeviceOnlyThread(new HMSmartWatchSyncHealthDataTask(this.miLiProProfile, deviceInfo, calendar, callback));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice, com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public BaseProfile createProfile(Context context, BluetoothDevice device) {
        BaseProfile baseProfileCreateProfile = super.createProfile(context, device);
        this.Q = new HMSmartWatchTransportProfile(baseProfileCreateProfile);
        return baseProfileCreateProfile;
    }

    public void enableAllDayPressure(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: fh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L8(callback, enable);
            }
        });
    }

    public void enableHRAllDay(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: oh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M8(callback, enable);
            }
        });
    }

    public void enableMusicControl(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: eh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.N8(callback, enable);
            }
        });
    }

    public void enableWeatherDailyNotify(final boolean enable, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: mh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.O8(callback, enable);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceType getDeviceType() {
        return HMDeviceType.WATCH;
    }

    public void getSmartWatchDeviceInfo(final HMCallback<Map<String, String>> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: hh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.P8(callback);
            }
        });
    }

    public Map<String, String> getSmartWatchDeviceInfoSync() {
        if (isConnected()) {
            return this.P.getSmartWatchDeviceInfo();
        }
        return null;
    }

    public List<SmartWatchProfile.BleWidget> getWidgetsAll() {
        return isConnected() ? this.P.getWidgetsAll() : new ArrayList();
    }

    public void isAllDayPressureEnabled(final HMCallback<Object> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: ih3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.Q8(callback);
            }
        });
    }

    public void isHRAllDayEnabled(final HMCallback<Object> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: jh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.R8(callback);
            }
        });
    }

    public void isSedentaryReminderEnabled(final HMCallback<Object> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: kh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.S8(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice, com.xiaomi.hm.health.bt.device.HMMiLiDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        this.Q.init();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDisconnected(BluetoothDevice device, int status) {
        super.onDeviceDisconnected(device, status);
        this.Q.deInit();
    }

    public void sendData(int id, byte[] data) {
        HMSmartWatchTransportProfile hMSmartWatchTransportProfile = this.Q;
        if (hMSmartWatchTransportProfile != null) {
            hMSmartWatchTransportProfile.send(id, data);
        }
    }

    public boolean sendLastSyncTime(long timeMillis) {
        if (!isConnected()) {
            return false;
        }
        HMSmartWatchSyncSportDataProfile hMSmartWatchSyncSportDataProfile = new HMSmartWatchSyncSportDataProfile(this.P);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeMillis);
        boolean z = hMSmartWatchSyncSportDataProfile.init() && hMSmartWatchSyncSportDataProfile.sendLastSyncTime(calendar);
        hMSmartWatchSyncSportDataProfile.deInit();
        Log.d(U, "Send Sport LastSyncTime: " + timeMillis + ", Success: " + z, new Object[0]);
        return z;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAuthCallback(IHMAuthCallback callback) {
        super.setAuthCallback(callback == null ? null : new g(callback));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setConnectionCallback(final IHMConnectionCallback callback) {
        super.setConnectionCallback(callback == null ? null : new IHMConnectionCallback() { // from class: dh3
            @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
            public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
                this.a.T8(callback, bluetoothDevice, hMDeviceType, status);
            }
        });
    }

    public void setDataListener(HMSmartWatchTransportProfile.DataListener listener) {
        HMSmartWatchTransportProfile hMSmartWatchTransportProfile = this.Q;
        if (hMSmartWatchTransportProfile != null) {
            hMSmartWatchTransportProfile.setDataListener(listener);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    public void setLFEventCallback(HMCallback<HMLFEvent> callback) {
        super.setLFEventCallback(callback == null ? null : new f());
    }

    public void setSedentaryReminder(final HMSedentaryConfig config, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: lh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.U8(callback, config);
            }
        });
    }

    public void setSmartWatchAuthCallback(IHMAuthCallback callback) {
        this.T = callback;
        setAuthCallback(new e());
    }

    public void setSmartWatchConnectionCallback(IHMConnectionCallback callback) {
        this.R = callback;
        setConnectionCallback(new IHMConnectionCallback() { // from class: gh3
            @Override // com.xiaomi.hm.health.bt.ife.IHMConnectionCallback
            public final void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, HMDeviceType hMDeviceType, Status status) {
                HMSmartWatchDevice.V8(bluetoothDevice, hMDeviceType, status);
            }
        });
    }

    public void setSmartWatchLfEventCallback(HMCallback<HMLFEvent> callback) {
        this.S = callback;
        setLFEventCallback(new HMCallback<>());
    }

    public boolean setWeatherTemperatureUnit(boolean isFahrenheit) {
        synchronized (this.weatherSyncObj) {
            if (!isConnected()) {
                return false;
            }
            HMSmartWatchWeatherProfile hMSmartWatchWeatherProfile = new HMSmartWatchWeatherProfile(this.miLiProProfile);
            if (!hMSmartWatchWeatherProfile.init()) {
                return false;
            }
            boolean unit = hMSmartWatchWeatherProfile.setUnit(isFahrenheit);
            hMSmartWatchWeatherProfile.deInit();
            return unit;
        }
    }

    public void setWeatherTemperatureUnitAsync(final boolean isFahrenheit, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: nh3
            @Override // java.lang.Runnable
            public final void run() {
                this.a.W8(callback, isFahrenheit);
            }
        });
    }

    public boolean setWidgets(List<SmartWatchProfile.BleWidget> widgets) {
        return isConnected() && this.P.setWidgets(widgets);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncData(Calendar calendar, IHMActivityDataCallback callback) {
        startSyncHealthData(calendar, new c(callback));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    public void startSyncFirstbeatData(Calendar startTime, Calendar endTime, IHMFirstbeatDataCallback callback) {
        Log.i(U, "Start Sync Firstbeat Data...", new Object[0]);
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSmartWatchSyncFirstbeatTask(this.P, startTime, endTime, callback));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncGpsData(Calendar calendar, final HMCallback<List<GpsRecord>> callback) {
        startSyncSportData(calendar, new d(callback));
    }

    public void startSyncHealthData(final Calendar calendar, final IHMHealthDataCallback callback) {
        Log.i(U, "Start Sync Health Data...", new Object[0]);
        synchronized (this.mSyncObj) {
            if (!isConnected()) {
                Debug.fi(U, "startSyncData return as not connected!!!");
                callback.onSyncStart();
                callback.onSyncFinish(new HMDeviceSyncDataError(3));
                return;
            }
            Future future = this.mSyncFuture;
            if (future != null && !future.isDone()) {
                Debug.fi(U, "startSyncData return as syncing now!!!");
                return;
            }
            Future futureX8 = X8(calendar, new b(callback));
            this.mSyncFuture = futureX8;
            if (futureX8 == null) {
                Debug.fi(U, "startSyncData return as null future!!!");
                callback.onSyncStart();
                callback.onSyncFinish(new HMDeviceSyncDataError(100));
            }
        }
    }

    public void startSyncSportData(Calendar calendar, IHMSportDataCallback callback) {
        Log.i(U, "Start Sync SportData...", new Object[0]);
        if (isConnected()) {
            runOnDeviceOnlyThread(new HMSmartWatchSyncSportDataTask(this.P, calendar, callback));
        } else {
            callback.onStart();
            callback.onFinish(false);
        }
    }

    public boolean syncLoginToken(String tokenJson) {
        return isConnected() && this.P.syncLoginToken(tokenJson);
    }

    public HMSmartWatchDevice(Context context, BluetoothDevice device) {
        super(context, device);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMMiLiProDevice
    public SmartWatchProfile newProfile(Context context, BluetoothDevice device) {
        SmartWatchProfile smartWatchProfile = new SmartWatchProfile(context, device, this);
        this.P = smartWatchProfile;
        smartWatchProfile.setDeviceAndBleBridge(this);
        return this.P;
    }
}
