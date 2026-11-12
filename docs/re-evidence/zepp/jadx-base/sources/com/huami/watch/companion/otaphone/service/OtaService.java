package com.huami.watch.companion.otaphone.service;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.huami.passport.AccountManager;
import com.huami.passport.utils.Utils;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.CompanionApplication;
import com.huami.watch.companion.R;
import com.huami.watch.companion.account.Account;
import com.huami.watch.companion.cloud.Cloud;
import com.huami.watch.companion.cloud.CloudClient;
import com.huami.watch.companion.common.Actions;
import com.huami.watch.companion.device.Device;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.otaphone.InputPasswordActivity;
import com.huami.watch.companion.util.NotificationUtils;
import com.huami.watch.companion.wifi.AddWifiActivity;
import com.huami.watch.companion.xiaomiai.FileTransfer;
import com.huami.watch.companion.xiaomiai.FileTransferCallback;
import com.huami.watch.companion.xiaomiai.FileTransferInterruptCallback;
import com.huami.watch.ota.UpdateManager;
import com.huami.watch.ota.UpdateUtils;
import com.huami.watch.ota.cloud.RomInfo;
import com.huami.watch.util.Log;
import com.huami.watch.wifi.WifiTransportHandler;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.baseutil.SdkVersionUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class OtaService extends Service implements UpdateManager.managerCallback, OtaTransportCmd.callback {
    private static final int A = 7;
    public static final String ACTION = "com.huami.watch.otaphone.service.OtaService";
    public static final String ACTION_BIND_DEVICE_FAILED = "com.huami.watch.companion.action.BindDeviceFailed";
    public static final String ACTION_BIND_DEVIDE_FINISHED = "com.huami.watch.companion.action.BindDeviceFinished";
    private static final Object B = new Object();
    private static final int C = 43200000;
    private static String D = "otaservice";
    private static final int E = 131072;
    private static Handler F = null;
    private static WifiReceiver G = null;
    private static boolean H = false;
    private static OtaTransportCmd I = null;
    public static final String INTENT_WIFI_CONNECT_RESULT = "intent_result";
    public static final String INTENT_WIFI_SSID = "intent_ssid";
    private static final String s = "config_md5";
    private static final String t = "config_interrupt";
    private static final int u = 1;
    private static final int v = 2;
    private static final int w = 3;
    private static final int x = 4;
    private static final int y = 5;
    private static final int z = 6;
    private UpdateManager a;
    private Context b;
    private OtaModel c;
    private RomInfo e;
    private String g;
    private LocalBroadcastReceiver j;
    private Handler k;
    private FileTransfer m;
    private FileTransferCallback n;
    private FileTransferInterruptCallback o;
    private Handler q;
    private int d = 0;
    private boolean f = false;
    private int h = 0;
    private boolean i = false;
    private String l = "";
    private final HandlerThread p = new HandlerThread("ota-service-work-thread");
    private OtaModel.Callback r = new a();

    public class LocalBroadcastReceiver extends BroadcastReceiver {
        public LocalBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals(Actions.ACTION_LOGIN_SUCCESS)) {
                Log.i(OtaService.D, "ACTION_LOGIN_SUCCESS ", new Object[0]);
                if (OtaService.this.m != null) {
                    OtaService.this.m.changeEngineStyle();
                    return;
                }
                return;
            }
            Log.d(OtaService.D, "bind new devices", new Object[0]);
            if (UpdateUtils.getUpdateState(OtaService.this.b) != 65282) {
                OtaService.this.x();
            }
        }
    }

    public class WifiReceiver extends BroadcastReceiver {
        public WifiReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.STATE_CHANGE")) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo.getState().equals(NetworkInfo.State.CONNECTED) && !OtaService.this.i) {
                    OtaService.this.i = true;
                    Log.i(OtaService.D, "WIFI connected", new Object[0]);
                    OtaService.F.obtainMessage(3).sendToTarget();
                } else if (networkInfo.getState().equals(NetworkInfo.State.DISCONNECTED) && OtaService.this.i) {
                    Log.i(OtaService.D, "WIFI disconnected", new Object[0]);
                    OtaService.this.i = false;
                    OtaService.F.obtainMessage(4).sendToTarget();
                }
            }
        }
    }

    public class a implements OtaModel.Callback {
        public a() {
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void OnSendfileFinished(boolean z) {
            Log.d(OtaService.D, "OnSendfileFinished return : " + z, new Object[0]);
            OtaService.this.x();
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onCancelByWatch() {
            OtaService.this.x();
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onCancelForReceiveFile() {
            OtaService.this.x();
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onChannelAvailable(boolean z) {
            if (z && UpdateUtils.isWifiConnected(OtaService.this.b)) {
                Log.i(OtaService.D, "File transport channel available", new Object[0]);
                OtaService.F.obtainMessage(1).sendToTarget();
            }
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onConfirmForReceiveFile() {
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onSendFileProgress(int i) {
            if (OtaService.this.h == i) {
                return;
            }
            OtaService.this.h = i;
            Log.d(OtaService.D, "onSendFileProgress : " + i, new Object[0]);
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onTransferInterrupt(int i) {
            Log.d(OtaService.D, "onTransferInterrupt value : " + i, new Object[0]);
            if (OtaService.this.e == null) {
                return;
            }
            UpdateUtils.putStringToSP(OtaService.this.b, OtaService.s, OtaService.this.e.getMd5Content());
            UpdateUtils.putStringToSP(OtaService.this.b, OtaService.t, "" + i);
        }

        @Override // com.huami.watch.companion.otaphone.service.OtaModel.Callback
        public void onWatchRecovery(int i) {
            Log.d(OtaService.D, "receiver recovery action from watch ret : " + i, new Object[0]);
            File file = new File(UpdateUtils.UPDATE_ZIP_LOCAL);
            if (file.exists()) {
                file.delete();
            }
            OtaService.this.x();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Log.d(OtaService.D, "check rom update info by alarm", new Object[0]);
            OtaService.this.k.postDelayed(this, 43200000L);
            if (UpdateUtils.isWifiConnected(OtaService.this.b)) {
                if (Boolean.valueOf(DeviceManager.getManager(OtaService.this.b).isBoundDeviceConnected()).booleanValue()) {
                    OtaService.F.obtainMessage(1).sendToTarget();
                } else {
                    Log.d(OtaService.D, "current devices is not connected", new Object[0]);
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            OtaService otaService = OtaService.this;
            otaService.n = new FileTransferCallback(otaService.getApplicationContext());
            OtaService.this.o = new FileTransferInterruptCallback();
            OtaService otaService2 = OtaService.this;
            otaService2.m = new FileTransfer(otaService2, otaService2.n, OtaService.this.o, "ff883f4b-7f32-4ccc-8a8d-5f9c8459f6a6");
            OtaService.this.n.setFileTransfer(OtaService.this.m);
            OtaService.this.m.start();
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z = false;
            for (int i = 0; i < 2; i++) {
                OtaService otaService = OtaService.this;
                z = otaService.z(otaService.b);
                if (z) {
                    break;
                }
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!z) {
                OtaService.I.cmdPhoneDisconnect();
            } else if (OtaService.this.startUpdateCheck()) {
                OtaService.this.f = true;
            }
        }
    }

    public class e extends Handler {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (OtaService.this.startUpdateCheck()) {
                    Log.d(OtaService.D, "find new rom info on cloud", new Object[0]);
                } else {
                    UpdateUtils.setUpdateState(OtaService.this.b, 65535);
                }
            }
        }

        public e() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            switch (message.what) {
                case 1:
                    Log.d(OtaService.D, "checking update rom info ...", new Object[0]);
                    switch (UpdateUtils.getUpdateState(OtaService.this.b)) {
                        case 65281:
                        case 65282:
                        case UpdateUtils.STATE_FILE_TRANSING /* 65285 */:
                            break;
                        case UpdateUtils.STATE_DOWNLOAD_SUCCESS /* 65283 */:
                        case UpdateUtils.STATE_DOWNLOAD_FAIL /* 65284 */:
                        default:
                            UpdateUtils.setUpdateState(OtaService.this.b, 65281);
                            new Thread(new a()).start();
                            break;
                    }
                    break;
                case 2:
                    OtaService otaService = OtaService.this;
                    otaService.e = otaService.a.getLatestUpdateInfo();
                    if (OtaService.this.e == null) {
                        Log.d(OtaService.D, "No Update ROM for current ROM", new Object[0]);
                        UpdateUtils.setUpdateState(OtaService.this.b, 65535);
                    } else if (OtaService.this.e.getMd5Content() != null) {
                        Log.d(OtaService.D, "start to download update zip info : " + OtaService.this.e.getFirmwareVersion() + " md5 : " + OtaService.this.e.getMd5Content(), new Object[0]);
                        if (!UpdateUtils.updatezipIsExist(OtaService.this.e.getMd5Content(), UpdateUtils.UPDATE_ZIP_LOCAL)) {
                            UpdateUtils.setUpdateState(OtaService.this.b, 65282);
                            if (!UpdateUtils.isWifiConnected(OtaService.this.b)) {
                                Log.d(OtaService.D, "download will start in wifi env", new Object[0]);
                            } else {
                                OtaService.this.a.downloadUpatezip(OtaService.this.e, UpdateUtils.UPDATE_ZIP_LOCAL);
                            }
                        } else {
                            OtaService.F.obtainMessage(5).sendToTarget();
                        }
                    } else {
                        Log.d(OtaService.D, "Update ROM mistake", new Object[0]);
                        UpdateUtils.setUpdateState(OtaService.this.b, 65535);
                    }
                    break;
                case 3:
                    if (!Boolean.valueOf(DeviceManager.getManager(OtaService.this.b).isBoundDeviceConnected()).booleanValue()) {
                        Log.d(OtaService.D, "current devices is not connected", new Object[0]);
                    } else {
                        OtaService.F.obtainMessage(1).sendToTarget();
                    }
                    break;
                case 4:
                    if (UpdateUtils.getUpdateState(OtaService.this.b) == 65282) {
                        OtaService.this.a.stopDownload();
                    }
                    break;
                case 5:
                    UpdateUtils.setUpdateState(OtaService.this.b, UpdateUtils.STATE_DOWNLOAD_SUCCESS);
                    Device currentDevice = DeviceManager.getManager(OtaService.this.b).getCurrentDevice();
                    if (currentDevice == null || OtaService.this.l.equals(currentDevice.address())) {
                        OtaService.this.c.startTransaction();
                        OtaService.this.c.sendOtaInfo2watch(OtaService.this.e);
                        Log.d(OtaService.D, "send update zip to watch", new Object[0]);
                        if (OtaService.this.e != null && UpdateUtils.getStringFromSP(OtaService.this.b, OtaService.s).equals(OtaService.this.e.getMd5Content())) {
                            OtaService.F.obtainMessage(7, Integer.parseInt(UpdateUtils.getStringFromSP(OtaService.this.b, OtaService.t)), 0).sendToTarget();
                        } else {
                            OtaService.F.obtainMessage(7, 0, 0).sendToTarget();
                        }
                    } else {
                        Log.d(OtaService.D, "new device " + currentDevice.address() + " connected, restart to checking update info\n", new Object[0]);
                        UpdateUtils.setUpdateState(OtaService.this.b, 65535);
                        OtaService.F.obtainMessage(1).sendToTarget();
                    }
                    break;
                case 6:
                    Log.d(OtaService.D, "down load rom error romInfo : " + OtaService.this.e, new Object[0]);
                    break;
                case 7:
                    Log.d(OtaService.D, "start to send update package to watch by file index : " + message.arg1, new Object[0]);
                    OtaService.this.c.transferUpdateFiletoWatch(UpdateUtils.UPDATE_ZIP_LOCAL, message.arg1);
                    break;
            }
        }
    }

    public static boolean checkOtaServer(Context context, String str, boolean z2) {
        Log.d(D, "Get Settings : " + str + ", ByScope : " + z2, new Object[0]);
        HashMap map = new HashMap();
        map.put("propertyName", str);
        if (z2) {
            map.put("mode", "RANGE");
        } else {
            map.put("mode", "SINGLE");
        }
        try {
            return CloudClient.doRequest(context, CloudClient.newGet(Cloud.urlUserSettingsAPI(Account.getUID(context)), map)).isSuccessful();
        } catch (IOException e2) {
            Log.e(D, "Get Settings : " + str + ", ByScope : " + z2 + " Failed!!", e2, new Object[0]);
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        UpdateUtils.setUpdateState(this.b, 65535);
        UpdateUtils.putStringToSP(this.b, s, "");
        UpdateUtils.putStringToSP(this.b, t, "0");
    }

    private void y() {
        this.q.post(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean z(Context context) {
        return Utils.isNetworkAvailable(context);
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void actionAddEapWifi(String str) {
        Intent intent = new Intent(getBaseContext(), (Class<?>) AddWifiActivity.class);
        intent.addFlags(268435456);
        intent.putExtra(WifiTransportHandler.SSID_VALUE, str);
        startActivity(intent);
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void actionAddHidenWifi() {
        Intent intent = new Intent(getBaseContext(), (Class<?>) AddWifiActivity.class);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void actionAddWifiPassword(String str) {
        Intent intent = new Intent(getBaseContext(), (Class<?>) InputPasswordActivity.class);
        intent.putExtra(INTENT_WIFI_SSID, str);
        intent.addFlags(268435456);
        if (!SdkVersionUtil.isQ() || GlobalUtil.isRunningForeground(this, getPackageName())) {
            getApplication().startActivity(intent);
        } else {
            HMLog.i(D, "App in background, notify user open wifi password input page", new Object[0]);
            startForeground(131072, NotificationUtils.createNotificationForQ(this, intent, OtaService.class.getSimpleName(), getString(R.string.input_wifi_pwd_title)));
        }
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void actionCancelPasswordInput() {
        synchronized (B) {
            if (SdkVersionUtil.isQ()) {
                stopForeground(true);
            }
            InputPasswordActivity passwordActivity = ((CompanionApplication) getApplication()).getPasswordActivity();
            if (passwordActivity != null) {
                passwordActivity.finish();
                ((CompanionApplication) getApplication()).setPasswordActivity(null);
            }
        }
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void actionCancelWifiAdd() {
        synchronized (B) {
            AddWifiActivity wifiActivity = ((CompanionApplication) getApplication()).getWifiActivity();
            if (wifiActivity != null) {
                wifiActivity.finish();
                ((CompanionApplication) getApplication()).setWifiActivity(null);
            }
        }
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void actionCheckUpgrade() {
        new Thread(new d()).start();
    }

    @Override // com.huami.watch.companion.otaphone.service.OtaTransportCmd.callback
    public void dataChannelChanged(boolean z2) {
        Log.i(D, "otaService data channel = " + z2, new Object[0]);
        if (!z2) {
            H = false;
            if (UpdateUtils.getUpdateState(this.b) != 65282) {
                UpdateUtils.setUpdateState(this.b, 65535);
                return;
            }
            return;
        }
        H = true;
        Device currentDevice = DeviceManager.getManager(this.b).getCurrentDevice();
        if (currentDevice == null || !this.l.equals(currentDevice.address())) {
            return;
        }
        this.c.startTransaction();
    }

    @Override // com.huami.watch.ota.UpdateManager.managerCallback
    public void downloadUpgrade(int i) {
        if (i == 0) {
            F.obtainMessage(5).sendToTarget();
        } else {
            F.obtainMessage(6).sendToTarget();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        F = new e();
        this.p.start();
        this.q = new Handler(this.p.getLooper());
        Context applicationContext = getApplicationContext();
        this.b = applicationContext;
        OtaModel otaModel = OtaModel.getInstance(applicationContext);
        this.c = otaModel;
        otaModel.startTransaction();
        this.c.registCallback(this.r);
        UpdateManager updateManager = UpdateManager.getInstance(this.b);
        this.a = updateManager;
        updateManager.registCallback(this);
        OtaTransportCmd otaTransportCmd = OtaTransportCmd.getInstance(this.b);
        I = otaTransportCmd;
        otaTransportCmd.registerCallback(this);
        Log.d(D, "start otaservice", new Object[0]);
        UpdateUtils.setUpdateState(this.b, 65535);
        G = new WifiReceiver();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        registerReceiver(G, intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("com.huami.watch.companion.action.BindDeviceFinished");
        intentFilter2.addAction(Actions.ACTION_LOGIN_SUCCESS);
        this.j = new LocalBroadcastReceiver();
        LocalBroadcastManager.getInstance(this.b).registerReceiver(this.j, intentFilter2);
        Handler handler = new Handler();
        this.k = handler;
        handler.postDelayed(new b(), 43200000L);
        y();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Log.d(D, "onDestroy", new Object[0]);
        super.onDestroy();
        this.c.stopTransaction();
        UpdateUtils.setUpdateState(this.b, 65535);
        I.destroy();
        unregisterReceiver(G);
        LocalBroadcastManager.getInstance(this.b).unregisterReceiver(this.j);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    public boolean startUpdateCheck() {
        try {
            String currentUid = AccountManager.getDefault(this.b).getCurrentUid();
            this.g = currentUid;
            if (currentUid.isEmpty()) {
                Log.d(D, "user is not login", new Object[0]);
                return false;
            }
            Device currentDevice = DeviceManager.getManager(this.b).getCurrentDevice();
            if (currentDevice == null) {
                Log.d(D, "get current device null, please connect watch first", new Object[0]);
                return false;
            }
            if (currentDevice.info() == null) {
                Log.d(D, "get current device info null, please connect watch first", new Object[0]);
                return false;
            }
            String strModelNumber = currentDevice.info().modelNumber();
            String strBuildNumber = currentDevice.info().buildNumber();
            this.l = currentDevice.address();
            if (TextUtils.isEmpty(strModelNumber) || TextUtils.isEmpty(strBuildNumber)) {
                Log.d(D, "please connect to watch for update", new Object[0]);
                return false;
            }
            this.a.setCurrentSysInfo(strBuildNumber, strModelNumber, null);
            this.a.setOverSeaUser(Account.isOversea(this.b));
            this.a.setAppTokens(Cloud.getToken().getAccessToken());
            Log.d(D, "deviceMac + " + this.l + " userid " + this.g + " check update romVersion: " + strBuildNumber + " watchVersion: " + strModelNumber + "oversea:" + Account.isOversea(this.b), new Object[0]);
            this.a.setCurrentUid(this.g);
            this.a.setSerialNo(currentDevice.getSN());
            this.a.sync();
            return true;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.huami.watch.ota.UpdateManager.managerCallback
    public void syncFinished(int i) {
        if (!this.f) {
            F.obtainMessage(2).sendToTarget();
            return;
        }
        RomInfo latestUpdateInfo = this.a.getLatestUpdateInfo();
        if (latestUpdateInfo == null || latestUpdateInfo.getMd5Content() == null) {
            Log.d(D, "check update rom info : null ", new Object[0]);
            I.cmdSendRomInfo(null);
        } else if (latestUpdateInfo.getMd5Content().equals("null")) {
            Log.d(D, "check update rom info : null ", new Object[0]);
            I.cmdSendRomInfo(null);
        } else {
            Log.d(D, "check update rom info : " + latestUpdateInfo.toString(), new Object[0]);
            I.cmdSendRomInfo(latestUpdateInfo);
        }
        this.f = false;
    }

    @Override // com.huami.watch.ota.UpdateManager.managerCallback
    public void updateDownloadProgress(int i) {
        if (this.d == i) {
            return;
        }
        this.d = i;
        if (i == 100) {
            Log.d(D, "downloading update zip progress 100", new Object[0]);
        }
    }
}
