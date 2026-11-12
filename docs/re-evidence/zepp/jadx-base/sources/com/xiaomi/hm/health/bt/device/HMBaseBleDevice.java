package com.xiaomi.hm.health.bt.device;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.huami.bluetooth.business.IDeviceLifeCycle;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.ChannelModuleFactory;
import com.huami.bluetooth.profile.channel.module.ChannelModuleStore;
import com.huami.bluetooth.profile.channel.module.activity.RealTimeStepApiFactory;
import com.huami.bluetooth.profile.channel.module.activity.RealtimeStepApi;
import com.huami.bluetooth.profile.channel.module.battery.BatteryApi;
import com.huami.bluetooth.profile.channel.module.battery.BatteryApiFactory;
import com.huami.bluetooth.profile.channel.module.battery.BatteryModule;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.connect.ConnectParam;
import com.huami.bluetooth.profile.channel.module.connect.IConnectParamListener;
import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.huami.bluetooth.profile.channel.module.settings.EcfImpl;
import com.huami.bluetooth.profile.channel.module.settings.GroupVersionCache;
import com.huami.bluetooth.profile.channel.module.settings.SettingsCallback;
import com.huami.bluetooth.profile.channel.module.settings.SettingsImpl;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.HMBleModule;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.error.HMDeviceSyncDataError;
import com.xiaomi.hm.health.bt.gatt.BluetoothSwitcher;
import com.xiaomi.hm.health.bt.gatt.DeviceAndBleBridge;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.gatt.Phy;
import com.xiaomi.hm.health.bt.gatt.a0;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.SyncStatus;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.auth.IHMAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.TinkerAuthCallback;
import com.xiaomi.hm.health.bt.profile.auth.behavior.AuthBehaviorFactory;
import com.xiaomi.hm.health.bt.profile.auth.behavior.IAuthBehavior;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.AuthResult;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.NewProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldAppAuthError;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.OldProtocolSuccess;
import com.xiaomi.hm.health.bt.profile.auth.errorcode.Success;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.ConnectionParameters;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMBaseTask;
import com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback;
import com.xiaomi.hm.health.bt.profile.base.IRealtimeStepCallback;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareUpgradeTask;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.ActivityDataFragment;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.base.GDSPErrorCode;
import com.xiaomi.hm.health.bt.profile.gdsp.common.CommonGdspSyncTask;
import com.xiaomi.hm.health.bt.profile.gdsp.common.GdspFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.IGdspCancelApi;
import com.xiaomi.hm.health.bt.profile.gdsp.common.callback.IGdspSyncCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.common.data.GdspResultData;
import com.xiaomi.hm.health.bt.profile.gdsp.common.param.GdspDeviceParam;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GDSPSyncApiFactory;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfile;
import com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GdspSyncProfileImpl;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.scan.AdvData;
import com.xiaomi.hm.health.bt.scan.BleScanCenter;
import com.xiaomi.hm.health.bt.scan.BleScanOption;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback2;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@SuppressLint({"NewApi"})
public abstract class HMBaseBleDevice extends HMBaseDevice implements IGattCallback.IConnectionStateChangeCallback, IHMBatteryInfoCallback, IBleScanCallback2, IRealtimeStepCallback, IBleInterface, SettingsCallback, DeviceAndBleBridge, GDSPSyncApiFactory {
    public static final String q = "HMBaseBleDevice";
    private static final String r = "RE_SCAN_TAG";
    private static final int s = 0;
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private static final int w = 30000;
    private static final int x = 120000;
    private final Object a;
    public e b;
    private BatteryApi c;
    public volatile DeviceInfo d;
    private BatteryInfo e;
    private Status f;
    private Handler g;
    private BleScanOption h;
    public HuamiOSDeviceDelegate hmOSDelegate;
    private TinkerAuthCallback i;
    private boolean j;
    private HMDeviceSource k;
    private RealtimeStep l;
    private HMCallback<RealtimeStep> m;
    public BaseProfile mProfile;
    public Future mSyncFuture;
    public final Object mSyncObj;
    public volatile SyncStatus mSyncStatus;
    private HMBaseTask n;
    private boolean o;
    private int p;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            int i = msg.what;
            if (i == 0) {
                HMBaseBleDevice.this.handleStatusChanged((Status) msg.obj);
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    HMBaseBleDevice.this.initChannel(((Boolean) msg.obj).booleanValue());
                    return;
                }
                Object obj = msg.obj;
                if (obj == null) {
                    Debug.fi(HMBaseBleDevice.q, "ERROR:not accept null battery info");
                    return;
                }
                BatteryInfo batteryInfo = (BatteryInfo) obj;
                Debug.fi(HMBaseBleDevice.q, "OnBattery Notify" + HMBaseBleDevice.this.getDeviceType() + "," + HMBaseBleDevice.this.supportModule(BatteryModule.class) + ", " + HMBaseBleDevice.this.hashCode());
                if (HMBaseBleDevice.this.getDeviceType() != HMDeviceType.WEIGHT && batteryInfo.getLastCharge() == null && HMBaseBleDevice.this.c != null) {
                    batteryInfo = HMBaseBleDevice.this.c.getBatteryInfo();
                }
                if (batteryInfo != null) {
                    HMBaseBleDevice.this.e = batteryInfo;
                    HMBaseBleDevice hMBaseBleDevice = HMBaseBleDevice.this;
                    hMBaseBleDevice.notifyBatteryChanged(hMBaseBleDevice.e);
                    return;
                }
                return;
            }
            GroupVersionCache.INSTANCE.clearCache(HMBaseBleDevice.this);
            AuthResult authResultAuth = null;
            IAuthBehavior iAuthBehaviorCreateAuthBehavior = AuthBehaviorFactory.createAuthBehavior(HMBaseBleDevice.this.getAuthInfo(), HMBaseBleDevice.this);
            int i2 = 7;
            try {
                HMBaseBleDevice.this.handleStatusChanged(Status.AUTH_START);
                HMBaseBleDevice hMBaseBleDevice2 = HMBaseBleDevice.this;
                authResultAuth = hMBaseBleDevice2.auth(hMBaseBleDevice2.getAuthInfo(), HMBaseBleDevice.this);
                int originCode = authResultAuth.getOriginCode();
                Debug.fi(HMBaseBleDevice.q, "auth:" + originCode);
                if (authResultAuth.getAuthError() instanceof Success) {
                    HMBaseBleDevice hMBaseBleDevice3 = HMBaseBleDevice.this;
                    Status status = Status.AUTH_PROTOCOL_SUCCESS;
                    hMBaseBleDevice3.f = status;
                    HMBaseBleDevice.this.y(status);
                    boolean dateTimeSync = HMBaseBleDevice.this.setDateTimeSync(Calendar.getInstance());
                    Debug.fi(HMBaseBleDevice.q, "setDateTime:" + dateTimeSync);
                    if (dateTimeSync) {
                        HMBaseBleDevice hMBaseBleDevice4 = HMBaseBleDevice.this;
                        Status status2 = Status.SET_TIME_SUCCESS;
                        hMBaseBleDevice4.f = status2;
                        HMBaseBleDevice.this.y(status2);
                        HMBaseBleDevice hMBaseBleDevice5 = HMBaseBleDevice.this;
                        hMBaseBleDevice5.B(hMBaseBleDevice5.mProfile);
                        HMBaseBleDevice hMBaseBleDevice6 = HMBaseBleDevice.this;
                        hMBaseBleDevice6.d = iAuthBehaviorCreateAuthBehavior.readDeviceInfo(hMBaseBleDevice6.mProfile);
                        Debug.fi(HMBaseBleDevice.q, "device info:" + HMBaseBleDevice.this.d);
                        if (HMBaseBleDevice.this.d == null) {
                            originCode = 9;
                            if (authResultAuth.getAuthError() instanceof NewProtocolSuccess) {
                                authResultAuth.setAuthError(AppAuthError.GET_DEVICE_INFO_FAIL);
                            } else {
                                authResultAuth.setAuthError(OldAppAuthError.GET_DEVICE_INFO_FAIL);
                            }
                        } else {
                            Set<HMDeviceSource> supportBindDeviceSource = HMBleModule.getSupportBindDeviceSource();
                            HMDeviceSource deviceSource = HMBaseBleDevice.this.d.getDeviceSource();
                            if (supportBindDeviceSource != null && !supportBindDeviceSource.isEmpty() && !supportBindDeviceSource.contains(deviceSource)) {
                                Debug.fi(HMBaseBleDevice.q, "unSupport device source:" + deviceSource);
                                originCode = 7;
                            }
                        }
                    } else {
                        originCode = 8;
                        if (authResultAuth.getAuthError() instanceof NewProtocolSuccess) {
                            authResultAuth.setAuthError(AppAuthError.SET_TIME_FAIL);
                        } else {
                            authResultAuth.setAuthError(OldAppAuthError.SET_TIME_FAIL);
                        }
                    }
                }
                if (authResultAuth.getAuthError() instanceof Success) {
                    HMBaseBleDevice.this.z();
                    HMBaseBleDevice hMBaseBleDevice7 = HMBaseBleDevice.this;
                    Status status3 = Status.GET_DEVICE_INFO_SUCCESS;
                    hMBaseBleDevice7.f = status3;
                    HMBaseBleDevice.this.y(status3);
                }
                i2 = originCode;
            } catch (Exception e) {
                Debug.fi(HMBaseBleDevice.q, "auth exception:" + e.getMessage());
                if (authResultAuth.getAuthError() instanceof NewProtocolSuccess) {
                    authResultAuth.setAuthError(AppAuthError.AUTH_EXCEPTION);
                } else {
                    authResultAuth.setAuthError(OldAppAuthError.AUTH_EXCEPTION);
                }
            }
            authResultAuth.setOriginCode(i2);
            boolean z = authResultAuth.getAuthError() instanceof Success;
            if (!z && HMBaseBleDevice.this.i != null) {
                HMBaseBleDevice.this.i.onAuthFail(HMBaseBleDevice.this, authResultAuth);
            }
            iAuthBehaviorCreateAuthBehavior.sendAuthResultMessage(authResultAuth, HMBaseBleDevice.this);
            if (z) {
                HMBaseBleDevice.this.initInfoAfterAuthSuccess();
            }
            if (z) {
                if (HMBaseBleDevice.this.e != null) {
                    HMBaseBleDevice hMBaseBleDevice8 = HMBaseBleDevice.this;
                    hMBaseBleDevice8.notifyBatteryChanged(hMBaseBleDevice8.e);
                    return;
                }
                return;
            }
            Debug.fi(HMBaseBleDevice.q, "disconnect by app!!!");
            BaseProfile baseProfile = HMBaseBleDevice.this.mProfile;
            if (baseProfile != null) {
                baseProfile.disconnect();
            }
        }
    }

    public class b implements IConnectParamListener {
        public b() {
        }

        @Override // com.huami.bluetooth.profile.channel.module.connect.IConnectParamListener
        public void onConnectParamChanged(@NotNull ConnectParam param) {
            HMBaseBleDevice.this.getMtu().setAttMtuSize(param.getMtu());
        }
    }

    public class c implements IHMActivityDataCallback {
        private PowerManager.WakeLock a = null;
        public final /* synthetic */ IHMActivityDataCallback b;

        public c(final IHMActivityDataCallback val$callback) {
            this.b = val$callback;
        }

        private void a() {
            PowerManager powerManager = (PowerManager) HMBaseBleDevice.this.getContext().getSystemService("power");
            if (powerManager != null) {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "mifit:IHMActivityDataCallback");
                this.a = wakeLockNewWakeLock;
                wakeLockNewWakeLock.acquire(60000L);
            }
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
            HMBaseBleDevice.this.mSyncStatus.setProgress(null);
            HMBaseBleDevice.this.mSyncStatus.setError(error);
            b();
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncProgress(Progress progress) {
            this.b.onSyncProgress(progress);
            HMBaseBleDevice.this.mSyncStatus.setProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStart() {
            a();
            this.b.onSyncStart();
            HMBaseBleDevice.this.mSyncStatus.setProgress(new Progress());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.activity.IHMActivityDataCallback
        public void onSyncStop(List<ActivityDataFragment> dataFragmentList) {
            this.b.onSyncStop(dataFragmentList);
        }
    }

    public class d implements SyncDataCallback<List<? extends GpsRecord>> {
        public final /* synthetic */ SyncDataCallback a;

        public d(final SyncDataCallback val$callback) {
            this.a = val$callback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<? extends GpsRecord> data) {
            this.a.onData(new ArrayList(data));
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onFinish(@NotNull HMDeviceError error) {
            this.a.onFinish(error);
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

    public HMBaseBleDevice(Context context, final e device) {
        super(context.getApplicationContext(), device.b());
        this.mSyncObj = new Object();
        this.a = new Object();
        this.mProfile = null;
        this.c = null;
        this.d = null;
        this.mSyncFuture = null;
        this.e = null;
        this.f = Status.UNKNOWN;
        this.i = null;
        this.j = false;
        this.k = HMDeviceSource.VDEVICE;
        this.mSyncStatus = new SyncStatus();
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = false;
        this.p = -1;
        this.b = device;
        this.hmOSDelegate = new HuamiOSDeviceDelegate(this);
        HandlerThread handlerThread = new HandlerThread(q);
        handlerThread.start();
        this.g = new a(handlerThread.getLooper());
        this.h = new BleScanOption.Builder().callback(this).needConnectedDevices(false).filterAddress(this.b.a()).scanTimeout(30000).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A(BaseProfile profile) {
        if (profile instanceof EcfCmdProvider) {
            profile.setSettingsApi(new EcfImpl((EcfCmdProvider) profile));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B(BaseProfile profile) {
        this.j = false;
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        if (settingsModule == null) {
            Debug.fi(q, "settingsModule null");
            A(profile);
            return;
        }
        settingsModule.resetSettingsImpl();
        if (x(settingsModule) >= 2) {
            this.j = true;
            profile.setSettingsApi(new SettingsImpl(settingsModule, this));
        } else {
            settingsModule.initDefaultSettings();
            A(profile);
        }
    }

    private boolean C(e wrapper) {
        Debug.fi(q, "ble device type:" + wrapper.c());
        if (GattUtils.hasConnectedDevice(this.mContext, wrapper.a())) {
            Debug.fi(q, "connect direct as connected device~");
            return true;
        }
        if (wrapper.d()) {
            Debug.fi(q, "connect direct as has scaned~");
            return true;
        }
        if (wrapper.f() || wrapper.e()) {
            return false;
        }
        Debug.fi(q, "connect direct as without scan and device type known~");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(boolean z) {
        RealtimeStepApi realtimeStepApiCreate;
        if (!isConnected() || (realtimeStepApiCreate = RealTimeStepApiFactory.INSTANCE.create(this.mProfile)) == null) {
            return;
        }
        if (z) {
            realtimeStepApiCreate.registerRealtimeStepCallback(this);
        } else {
            realtimeStepApiCreate.unregisterRealtimeStepCallback(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(w());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        Calendar dateTime = this.mProfile.getDateTime();
        hMCallback.sendOnDataMessage(dateTime);
        hMCallback.sendOnFinishMessage(dateTime != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G(HMCallback hMCallback) {
        hMCallback.sendOnStartMessage();
        HMStatisticInfo statisticInfoInternal = getStatisticInfoInternal();
        hMCallback.sendOnDataMessage(statisticInfoInternal);
        hMCallback.sendOnFinishMessage(statisticInfoInternal != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String H() {
        return "Base Profile is null while init channel";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(O(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(HMCallback hMCallback, int i) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(Integer.valueOf(P(i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(HMCallback hMCallback, ConnectionParameters connectionParameters) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setConnectionParameters(connectionParameters));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(HMCallback hMCallback, int i, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(setLatency(i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(HMCallback hMCallback, int i, int i2, int i3) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(S(i, i2, i3));
    }

    private void N() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(Status.CONNECTING_TIMEOUT);
        }
    }

    private boolean O(int connectionPriority) {
        return isConnected() && this.mProfile.requestConnectionPriority(connectionPriority);
    }

    private int P(int mtu) {
        if (isConnected()) {
            return this.mProfile.requestMtu(mtu);
        }
        return -1;
    }

    private void R() {
        Handler handler = this.g;
        if (handler != null) {
            Status status = Status.CONNECTING_TIMEOUT;
            if (handler.hasMessages(0, status)) {
                return;
            }
            Message message = new Message();
            message.what = 0;
            message.obj = status;
            this.g.sendMessageDelayed(message, 120000L);
        }
    }

    private Phy S(int txPhy, int rxPhy, int phyOptions) {
        if (isConnected()) {
            return this.mProfile.setPreferredPhy(txPhy, rxPhy, phyOptions);
        }
        return null;
    }

    private synchronized void T() {
        Debug.fi(r, "133等情况重新扫描，成功后触发连接: " + this.b.a());
        if (!BluetoothAdapter.checkBluetoothAddress(this.b.a())) {
            Debug.fi(q, "return as invalid address~");
            return;
        }
        if (!isBluetoothEnable()) {
            Debug.fi(q, "return as has bluetooth off~");
            return;
        }
        if (hasDestroy()) {
            Debug.fi(q, "return as has destroy~");
            return;
        }
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile == null) {
            Debug.fi(q, "mProfile null~");
        } else {
            baseProfile.connect();
        }
    }

    private synchronized void disconnect() {
        Debug.fi(q, "disconnect:" + this.mProfile);
        this.f = Status.UNKNOWN;
        BleScanCenter.getInstance().stopScan(this.h);
        this.b.g(false);
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile != null) {
            baseProfile.destroy();
            this.mProfile = null;
        }
        BatteryApi batteryApi = this.c;
        if (batteryApi != null) {
            batteryApi.unregisterBatteryListener(this);
        }
    }

    public static boolean isBluetoothSwitching() {
        return a0.isBluetoothSwitching();
    }

    private void u() {
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile != null) {
            baseProfile.cleanup();
            this.mProfile.cleanupGatt();
        }
    }

    private synchronized void v(boolean forceDirectly, ScanReason reason, boolean forceScan) {
        Debug.fi(q, "connect:" + this.b.a());
        if (!BluetoothAdapter.checkBluetoothAddress(this.b.a())) {
            Debug.fi(q, "return as invalid address~");
            return;
        }
        if (!isBluetoothEnable()) {
            Debug.fi(q, "return as has bluetooth off~");
            return;
        }
        if (hasDestroy()) {
            Debug.fi(q, "return as has destroy~");
            return;
        }
        if (forceScan) {
            this.o = false;
            Debug.fi(q, "force scan device for profile~");
            BleScanCenter.getInstance().startScan(this.h);
            Q(Status.SCANNING.setScanReason(reason));
            return;
        }
        if (this.mProfile != null) {
            Debug.fi(q, "return as profile not null!!!");
            return;
        }
        if (forceDirectly || C(this.b)) {
            Debug.fi(q, "Create profile for connect~");
            BaseProfile baseProfileCreateProfile = createProfile(getContext(), this.b.b());
            this.mProfile = baseProfileCreateProfile;
            baseProfileCreateProfile.setAutoReconnect(isAutoReconnect());
            this.mProfile.connect();
        } else {
            Debug.fi(q, "Scan device for profile~");
            BleScanCenter.getInstance().startScan(this.h);
            Q(Status.SCANNING.setScanReason(reason));
        }
    }

    private ConnectionParameters w() {
        return null;
    }

    private int x(SettingsModule settingsModule) {
        Integer numQueryVersionSync = settingsModule.queryVersionSync();
        if (numQueryVersionSync == null) {
            return -1;
        }
        return numQueryVersionSync.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y(Status status) {
        return onDetailedConnectionStatusChangedInternal(getBluetoothDevice(), getDeviceType(), status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        BatteryApi batteryApi = this.c;
        if (batteryApi != null) {
            batteryApi.unregisterBatteryListener(this);
        }
        BatteryApi batteryApiCreate = BatteryApiFactory.INSTANCE.create(getBaseProfile());
        this.c = batteryApiCreate;
        if (batteryApiCreate == null) {
            return;
        }
        this.e = batteryApiCreate.getBatteryInfo();
        Debug.fi(q, "battery info:" + this.e);
        if (Build.VERSION.SDK_INT >= 19) {
            this.c.registerBatteryInfoCallback(this);
        }
    }

    public void Q(Status status) {
        if (this.g != null) {
            Message message = new Message();
            message.what = 0;
            message.obj = status;
            this.g.sendMessage(message);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public AuthResult auth(AuthInfo info, IHMAuthCallback callback) {
        return new AuthResult(0, OldProtocolSuccess.INSTANCE);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
        super.create(forceDirectly);
        Debug.fi(q, "create:" + forceDirectly);
        v(forceDirectly, ScanReason.NORMAL, false);
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onCreate(forceDirectly);
        }
    }

    abstract BaseProfile createProfile(Context context, BluetoothDevice device);

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
        super.destroy();
        Debug.fi(q, "destroy:" + this);
        N();
        disconnect();
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onDestroy();
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.IBleInterface
    public void enableConnectedAdv(final boolean enable, final HMCallback callback) {
        callback.sendOnStartMessage();
        callback.sendOnFinishMessage(false);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void enableRealtimeStep(final boolean enable) {
        runOnDeviceMultiThread(new Runnable() { // from class: nk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.D(enable);
            }
        });
    }

    public BaseProfile getBaseProfile() {
        return this.mProfile;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public BatteryInfo getBatteryInfo() {
        return this.e;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public IBleInterface getBleInterface() {
        return this;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    public ChannelModuleFactory getChannelModuleFactory() {
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile == null) {
            return null;
        }
        return baseProfile.getChannelModuleFactory();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    @Nullable
    public ChannelModuleStore getChannelModuleStore() {
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile == null) {
            return null;
        }
        return baseProfile.getChannelModuleStore();
    }

    public void getConnectionParameters(final HMCallback<ConnectionParameters> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: hk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.E(callback);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDateTime(final HMCallback<Calendar> callBack) {
        if (callNonConnected(callBack)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: gk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.F(callBack);
            }
        });
    }

    public Calendar getDateTimeSync() {
        if (isConnected()) {
            return this.mProfile.getDateTime();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public DeviceInfo getDeviceInfo() {
        return this.d;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void getDeviceLog(File file, final IHMDataCallback<File> callback) {
        if (!isConnected()) {
            callback.onStart();
            callback.onStop(file, new HMDeviceError(3));
            return;
        }
        if (getDeviceFeature() == null) {
            callback.onStart();
            callback.onStop(file, new HMDeviceError(100));
            return;
        }
        CommonGdspSyncTask<File> logTask = GdspFactory.INSTANCE.getLogTask(this.mProfile, file, getGdspVersion(), callback);
        this.n = logTask;
        if (logTask != null) {
            runOnDeviceOnlyThread(logTask);
        } else {
            callback.onStart();
            callback.onStop(file, new HMDeviceError(100));
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public HMDeviceSource getDeviceSource() {
        HMDeviceSource deviceSource = super.getDeviceSource();
        return deviceSource == HMDeviceSource.VDEVICE ? this.k : deviceSource;
    }

    public Status getDeviceStatus() {
        return this.f;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public abstract HMDeviceType getDeviceType();

    public int getGdspVersion() {
        return getDeviceFeature().hasBase(4) ? 1 : 0;
    }

    @Override // com.xiaomi.hm.health.bt.device.IBleInterface
    public Mtu getMtu() {
        BaseProfile baseProfile = this.mProfile;
        return baseProfile != null ? baseProfile.getMtu() : Mtu.createDefault();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    /* JADX INFO: renamed from: getRealtimeStep */
    public RealtimeStep getStep() {
        return this.l;
    }

    public RealtimeStep getRealtimeStepSync() {
        RealtimeStepApi realtimeStepApiCreate = RealTimeStepApiFactory.INSTANCE.create(this.mProfile);
        if (realtimeStepApiCreate != null) {
            return realtimeStepApiCreate.getRealtimeStep();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public final void getStatisticInfo(final HMCallback<HMStatisticInfo> callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: fk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G(callback);
            }
        });
    }

    public abstract HMStatisticInfo getStatisticInfoInternal();

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public Status getStatus() {
        return this.f;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public SyncStatus getSyncStatus() {
        return this.mSyncStatus;
    }

    public int getWatchSystemSettingsProtocolVersion() {
        return this.p;
    }

    public void handleStatusChanged(Status status) {
        Debug.fi(q, "handleStatusChanged:" + this.b.b() + "," + getDeviceType() + "," + status);
        if (status.isDetailedMessage()) {
            y(status);
        }
        if (this.f == status) {
            return;
        }
        this.f = status;
        Status status2 = Status.DISCONNECTED;
        if (status == status2) {
            onDeviceDisconnected();
        } else if (status == Status.INIT_FAILED || status == Status.GATT_CONNECT_FAILED || status == Status.GATT_DISCONNECT || status == Status.AUTH_FAILED || status == Status.DISCOVERY_FAILED) {
            if (isAutoReconnect()) {
                onDeviceConnecting();
                R();
            } else {
                y(status);
                onDeviceDisconnected();
                status = status2;
            }
        } else if (status == Status.SCANNING || status == Status.GATT_CONNECTING || status == Status.GATT_CONNECTED || status == Status.INIT_START || status == Status.INIT_SUCCESS || status == Status.DISCOVERY_START || status == Status.DISCOVERY_SUCCESS || status == Status.AUTH_START) {
            onDeviceConnecting();
            R();
        } else if (status == Status.AUTH_SUCCESS) {
            N();
            try {
                onDeviceConnected();
            } catch (Exception e2) {
                Debug.fi(q, "onDeviceConnected exception:" + e2.getMessage());
            }
        } else if (status == Status.CONNECTING_TIMEOUT) {
            onDeviceConnectTimeout();
        }
        onConnectionStatusChangedInternal(getBluetoothDevice(), getDeviceType(), status);
    }

    public void initChannel(boolean initCharacteristicsResult) {
        BaseProfile baseProfile = getBaseProfile();
        if (baseProfile == null) {
            HMLog.error(q, new Function0() { // from class: ok2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return HMBaseBleDevice.H();
                }
            });
            Q(Status.INIT_FAILED);
            return;
        }
        boolean zInitChannel = baseProfile.initChannel();
        boolean zIsBaseOnHuamiOS = baseProfile.isBaseOnHuamiOS();
        if ((zIsBaseOnHuamiOS && !zInitChannel) || (!zIsBaseOnHuamiOS && !initCharacteristicsResult)) {
            Q(Status.INIT_FAILED);
            baseProfile.disconnect();
            return;
        }
        Q(Status.INIT_SUCCESS);
        Handler handler = this.g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    public void initInfoAfterAuthSuccess() {
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isConnected() {
        boolean z;
        Status status;
        synchronized (this.a) {
            z = this.mProfile != null && ((status = this.f) == Status.AUTH_SUCCESS || status == Status.AUTH_PROTOCOL_SUCCESS || status == Status.AUTH_SUCCESS_WITHOUT_DEVICE_INFO || status == Status.SET_TIME_SUCCESS || status == Status.GET_DEVICE_INFO_SUCCESS);
        }
        return z;
    }

    public boolean isHuamiOs() {
        return this.j;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean isSyncingData() {
        boolean z;
        synchronized (this.mSyncObj) {
            Future future = this.mSyncFuture;
            z = (future == null || future.isDone()) ? false : true;
            Debug.i(q, "isSyncingData:" + z);
        }
        return z;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean needReconnect() {
        return (hasDestroy() || isAutoReconnect() || isConnected()) ? false : true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.IHMBatteryInfoCallback
    public void onBatteryChanged(BatteryInfo info) {
        Debug.fi(q, "onBatteryChanged:" + info + ",hash code:" + hashCode());
        if (info == null) {
            Debug.fi(q, "ERROR:battery in is null");
            return;
        }
        Message message = new Message();
        message.what = 2;
        message.obj = info;
        this.g.sendMessage(message);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onBtOff() {
        super.onBtOff();
        disconnect();
        Q(Status.DISCONNECTED);
        BluetoothSwitcher.offOn(0);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void onBtOn() {
        super.onBtOn();
        v(false, ScanReason.NORMAL, false);
    }

    public void onDeviceConnectTimeout() {
        Debug.fi(q, "onDeviceConnectTimeout:" + this.b.a());
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onConnectTimeout();
        }
    }

    void onDeviceConnected() {
        ConnectModule connectModule;
        Debug.fi(q, "onDeviceConnected:" + this.b.a());
        if (supportModule(ConnectModule.class) && (connectModule = (ConnectModule) getChannelModule(ConnectModule.class)) != null) {
            connectModule.registerConnectParamListener(new b());
        }
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onConnected();
        }
        GdspFactory.INSTANCE.resetGdspSyncProfile();
    }

    public void onDeviceConnecting() {
        Debug.fi(q, "onDeviceConnecting:" + this.b.a());
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onConnecting();
        }
    }

    public void onDeviceConnectionFailed(BluetoothDevice device, int status) {
        BatteryApi batteryApi = this.c;
        if (batteryApi != null) {
            batteryApi.unregisterBatteryListener(this);
        }
        Status status2 = Status.GATT_CONNECT_FAILED;
        if (!y(status2.setValue(status))) {
            Q(status2.setValue(status));
        }
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onConnectFailed();
        }
    }

    void onDeviceDisconnected() {
        Debug.fi(q, "onDeviceDisconnected:" + this.b.a());
        BatteryApi batteryApi = this.c;
        if (batteryApi != null) {
            batteryApi.unregisterBatteryListener(this);
        }
        Iterator<IDeviceLifeCycle> it2 = this.lifeCycleObservers.iterator();
        while (it2.hasNext()) {
            it2.next().onDisConnect();
        }
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDiscovering(BluetoothDevice device) {
        Q(Status.DISCOVERY_START);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDiscoveryFailed(BluetoothDevice device, int status) {
        Q(Status.DISCOVERY_FAILED.setValue(status));
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDiscoverySuccess(BluetoothDevice device) {
        Q(Status.DISCOVERY_SUCCESS);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onInitializationResult(BluetoothDevice device, boolean result) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = Boolean.valueOf(result);
        this.g.sendMessage(messageObtain);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onInitializing(BluetoothDevice device) {
        Q(Status.INIT_START);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanError(BleScanOption option) {
        Debug.fi(q, "onScanError:" + option);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanStart(BleScanOption option) {
        Debug.fi(q, "onScanStart:" + option);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanStop(BleScanOption option) {
        boolean zHasConnectedDevice = GattUtils.hasConnectedDevice(this.mContext, this.b.a());
        boolean z = (this.b.f() || this.b.e()) ? false : true;
        Debug.fi(q, "onScanStop:" + option + "connected: " + zHasConnectedDevice + ", knownType: " + z);
        if (this.mProfile != null) {
            Debug.fi(q, "pauseConnectForScan: " + this.mProfile.isPauseConnectForScan() + ", scanedDevice: " + this.o);
        }
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile == null || !baseProfile.isPauseConnectForScan()) {
            v(false, ScanReason.NORMAL, false);
            return;
        }
        if (this.o) {
            return;
        }
        if (zHasConnectedDevice || z) {
            T();
        } else {
            v(false, ScanReason.NORMAL, true);
        }
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback2
    public void onScanTimeout(@NotNull BleScanOption scanOption) {
        boolean zE = this.b.e();
        boolean zHasConnectedDevice = GattUtils.hasConnectedDevice(this.mContext, this.b.a());
        Debug.fi(q, "isUnKnownType: " + zE + ", connected: " + zHasConnectedDevice);
        Q(Status.SCAN_FAIL.setValue(ScanErrorCode.from(zE, zHasConnectedDevice).getCode()));
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanedDevice(AdvData data, BleScanOption option) {
        Debug.fi(q, "onScanedDevice:" + data);
        if (data.device.getAddress().equals(this.b.a())) {
            Q(Status.SCAN_SUCCESS.setAdvConnectable(GattUtils.isConnectableAdv(data)));
            this.o = true;
            this.b.g(true);
            BleScanCenter.getInstance().stopScan(this.h);
            BaseProfile baseProfile = this.mProfile;
            if (baseProfile == null || !baseProfile.isPauseConnectForScan()) {
                v(false, ScanReason.NORMAL, false);
            } else {
                T();
            }
        }
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.IRealtimeStepCallback
    public void onStepChanged(RealtimeStep step) {
        this.l = step;
        Debug.i(q, "onStepChanged:" + step);
        HMCallback<RealtimeStep> hMCallback = this.m;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(step);
        }
    }

    public void reConnect() {
        reConnect(false);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.DeviceAndBleBridge
    public boolean reConnectWithScan(@NotNull ScanReason reason) {
        Debug.fi(q, "reconnectWithScan, reason: " + reason);
        u();
        v(false, reason, true);
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public int readRemoteRssi() {
        if (isConnected()) {
            return this.mProfile.readRemoteRssi();
        }
        return -1;
    }

    @Override // com.xiaomi.hm.health.bt.device.IBleInterface
    public void requestConnectionPriority(final int connectionPriority, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: ik2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.I(callback, connectionPriority);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.IBleInterface
    public void requestMtu(final int mtu, final HMCallback<Integer> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: jk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.J(callback, mtu);
            }
        });
    }

    public boolean sendUpgradeInfo(List<HMFirmwareInfo> firmwares) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setAutoReconnect(boolean autoReconnect) {
        super.setAutoReconnect(autoReconnect);
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile != null) {
            baseProfile.setAutoReconnect(autoReconnect);
        }
    }

    public void setBackenSource(HMDeviceSource backenSource) {
        this.k = backenSource;
    }

    public void setConnectScanOption(BleScanOption option) {
        this.h = option;
    }

    @Override // com.xiaomi.hm.health.bt.device.IBleInterface
    public void setConnectionParameters(final ConnectionParameters parameters, final HMCallback callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: mk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.K(callback, parameters);
            }
        });
    }

    public boolean setConnectionParameters(ConnectionParameters parameters) {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean setDateTimeSync(Calendar calendar) {
        return isConnected() && this.mProfile.setDateTime(calendar);
    }

    public void setLatency(final int minLatency, final int maxLatency, final HMCallback callback) {
        if (callNonConnected(callback)) {
            return;
        }
        runOnDeviceMultiThread(new Runnable() { // from class: kk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.L(callback, minLatency, maxLatency);
            }
        });
    }

    public boolean setLatency(int minLatency, int maxLatency) {
        return true;
    }

    @Override // com.xiaomi.hm.health.bt.device.IBleInterface
    public void setPreferredPhy(final int txPhy, final int rxPhy, final int phyOptions, final HMCallback<Phy> callback) {
        runOnDeviceMultiThread(new Runnable() { // from class: lk2
            @Override // java.lang.Runnable
            public final void run() {
                this.a.M(callback, txPhy, rxPhy, phyOptions);
            }
        });
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void setRealtimeStepCallback(HMCallback<RealtimeStep> callback) {
        this.m = callback;
    }

    public void setTinkerAuthCallback(TinkerAuthCallback tinkerAuthCallback) {
        this.i = tinkerAuthCallback;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncData(final Calendar calendar, final IHMActivityDataCallback callback) {
        synchronized (this.mSyncObj) {
            if (!isConnected()) {
                Debug.fi(q, "startSyncData return as not connected!!!");
                callback.onSyncStart();
                callback.onSyncFinish(new HMDeviceSyncDataError(3));
                return;
            }
            Future future = this.mSyncFuture;
            if (future != null && !future.isDone()) {
                Debug.fi(q, "startSyncData return as syncing now!!!");
                return;
            }
            Future futureSyncData = syncData(calendar, new c(callback));
            this.mSyncFuture = futureSyncData;
            if (futureSyncData == null) {
                Debug.fi(q, "startSyncData return as null future!!!");
                callback.onSyncStart();
                callback.onSyncFinish(new HMDeviceSyncDataError(100));
            }
        }
    }

    public void startSyncGdspData(Calendar calendar, int type, IGdspSyncCallback<GdspResultData> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getGdspSyncTask(new GdspDeviceParam(this, this.mProfile, calendar, (byte) type), callback));
        } else {
            callback.onStart();
            callback.onResult(GDSPErrorCode.OPERATION_FAILED);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void startSyncGpsData(Calendar calendar, final SyncDataCallback<List<GpsRecord>> callback) {
        if (isConnected()) {
            runOnDeviceOnlyThread(GdspFactory.INSTANCE.getGpsTask(this.mProfile, getDeviceSource(), calendar, getGdspVersion(), new d(callback)));
        } else {
            callback.onStart();
            callback.onFinish(new HMDeviceError(3));
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public boolean supportModule(int moduleId) {
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile == null) {
            return false;
        }
        return baseProfile.supportModule(moduleId);
    }

    public boolean supportWatchSettings() {
        if (supportModule(10)) {
            return true;
        }
        try {
            return getDeviceInfo().getDeviceFeature().hasSw(19);
        } catch (Exception e2) {
            Debug.fi(q, "supportWatchSettings e: " + e2);
            return false;
        }
    }

    public Future syncData(Calendar calendar, IHMActivityDataCallback callback) {
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void terminateDeviceLog() {
        Object obj = this.n;
        if (obj instanceof IGdspCancelApi) {
            ((IGdspCancelApi) obj).stopSync();
        }
    }

    public void updateDeviceInfo(DeviceInfo info) {
        this.d = info;
    }

    public void updateExternalDeviceInfo() {
        DeviceInfo deviceInfo = getDeviceInfo();
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile != null) {
            baseProfile.updateExternalDeviceInfo(deviceInfo);
        }
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(HMFirmwareInfo firmwareInfo, final IHMFirmwareUpgradeCallback callback) {
        setLatency(39, 49, new HMCallback());
        runOnDeviceOnlyThread(new HMFirmwareUpgradeTask(this.mProfile, firmwareInfo, callback));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public synchronized void reConnect(boolean force) {
        Debug.fi(q, "reConnect:" + this.mProfile);
        if (!BluetoothAdapter.checkBluetoothAddress(this.b.a())) {
            Debug.fi(q, "return as invalid address!!!");
            return;
        }
        if (hasDestroy()) {
            Debug.fi(q, "return as destroy!!!");
            return;
        }
        if (!force && isAutoReconnect()) {
            Debug.fi(q, "return as auto reconnect!!!");
            return;
        }
        if (!force && isConnected()) {
            Debug.fi(q, "return as connected!!!");
            return;
        }
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile != null) {
            baseProfile.destroy();
            this.mProfile = null;
        }
        BaseProfile baseProfileCreateProfile = createProfile(getContext(), this.b.b());
        this.mProfile = baseProfileCreateProfile;
        baseProfileCreateProfile.setAutoReconnect(isAutoReconnect());
        this.mProfile.connect();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    @WorkerThread
    public final HMStatisticInfo getStatisticInfo() {
        HMStatisticInfo statisticInfoInternal;
        synchronized (q) {
            statisticInfoInternal = getStatisticInfoInternal();
        }
        return statisticInfoInternal;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice, com.huami.bluetooth.profile.channel.module.ChannelModuleStoreOwner
    public <T extends BaseModule> boolean supportModule(@NotNull Class<T> clazz) {
        BaseProfile baseProfile = this.mProfile;
        if (baseProfile == null) {
            Debug.fi(q, "WARN: do not check support module while profile is null");
            return false;
        }
        return baseProfile.supportModule(clazz);
    }

    public static class e {
        private BluetoothDevice a;
        private boolean b;
        private boolean c;

        public e(BluetoothDevice device) {
            this.b = true;
            this.c = false;
            this.a = device;
        }

        public String a() {
            return this.a.getAddress();
        }

        public BluetoothDevice b() {
            return this.a;
        }

        public int c() {
            return GattUtils.getBluetoothDeviceType(this.a);
        }

        public boolean d() {
            return this.c;
        }

        public boolean e() {
            return GattUtils.getBluetoothDeviceType(this.a) == 0;
        }

        public boolean f() {
            return this.b;
        }

        public void g(boolean hasScan) {
            this.c = hasScan;
        }

        public e(BluetoothDevice device, boolean needScan) {
            this.b = true;
            this.c = false;
            this.a = device;
            this.b = needScan;
        }
    }

    public void onDeviceConnecting(BluetoothDevice device) {
        String str;
        boolean zHasConnectedDevice = GattUtils.hasConnectedDevice(this.mContext, device.getAddress());
        boolean z = GattUtils.getBluetoothDeviceType(device) != 0;
        if (zHasConnectedDevice) {
            str = Status.PRE_CONNECT_STATE_CONNECTED;
        } else {
            str = z ? Status.PRE_CONNECT_STATE_KNOWN : "none";
        }
        Q(Status.GATT_CONNECTING.setPreConnectState(str));
    }

    @Override // com.xiaomi.hm.health.bt.profile.gdsp.common.profile.GDSPSyncApiFactory
    @Nullable
    public GdspSyncProfile create() {
        int gdspVersion = getGdspVersion();
        if (gdspVersion == 0 || gdspVersion == 1) {
            return new GdspSyncProfileImpl(this.mProfile, gdspVersion);
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceDisconnected(BluetoothDevice device, int status) {
        BatteryApi batteryApi = this.c;
        if (batteryApi != null) {
            batteryApi.unregisterBatteryListener(this);
        }
        Status status2 = Status.GATT_DISCONNECT;
        if (y(status2.setValue(status))) {
            return;
        }
        Q(status2.setValue(status));
    }

    @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnected(BluetoothDevice device) {
        Q(Status.GATT_CONNECTED);
    }
}
