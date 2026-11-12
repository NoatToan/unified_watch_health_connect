package defpackage;

import android.R;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes16.dex */
public class res {
    private static res j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected WeakReference<Activity> f47238a;
    private String g;
    private int i;
    private edn k;
    private String m;
    private boolean o;
    private boolean r;
    private String t;
    private int u;
    private static final String[] d = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f47237c = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.READ_PHONE_STATE"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f47236b = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};
    private static final Object e = new Object();
    private boolean q = false;
    private Timer l = null;
    private Timer p = null;
    private BroadcastReceiver s = new BroadcastReceiver() { // from class: res.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null) {
                LogUtil.j("CloudDeviceConnectManager", "mPairBroadcastReceiver intent is null");
                return;
            }
            LogUtil.j("CloudDeviceConnectManager", "mPairBroadcastReceiver intent is : ", intent.getAction());
            if ("com.huawei.health.action.PAIR_DEVICE_SUCCESS".equals(intent.getAction())) {
                LogUtil.a("CloudDeviceConnectManager", "pair device success");
                Activity activity = res.this.f47238a.get();
                if (activity == null || activity.isFinishing()) {
                    LogUtil.a("CloudDeviceConnectManager", "activity is finish");
                } else if (intent.getBooleanExtra(BasePairManagerJsApi.FROM_H5_KEY, false)) {
                    activity.finish();
                }
            }
        }
    };
    private BtDeviceResponseCallback n = new BtDeviceResponseCallback() { // from class: rfb
        @Override // com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback
        public final void onResponse(int i, Object obj) {
            this.d.e(i, obj);
        }
    };
    private BtSwitchStateCallback f = new BtSwitchStateCallback() { // from class: res.3
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
        public void onBtSwitchStateCallback(int i) {
            if (i == 1) {
                res.this.l();
                res.this.f();
                BTDeviceMgrUtil.c().e(res.this.f);
            } else if (i == 3) {
                BTDeviceMgrUtil.c().d(BaseApplication.getContext(), res.this.n);
            } else {
                LogUtil.j("CloudDeviceConnectManager", "Bluetooth unknown state.");
            }
        }
    };
    private BtDeviceDiscoverCallback h = new BtDeviceDiscoverCallback() { // from class: res.1
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
            if (bluetoothDeviceNode != null) {
                try {
                    BluetoothDevice btDevice = bluetoothDeviceNode.getBtDevice();
                    if (btDevice == null) {
                        LogUtil.j("CloudDeviceConnectManager", "btDevice is null");
                        return;
                    }
                    String name = btDevice.getName();
                    String address = btDevice.getAddress();
                    if (name == null) {
                        name = bluetoothDeviceNode.getRecordName();
                    }
                    LogUtil.a("CloudDeviceConnectManager", "device name:", CommonUtil.n(name), ", mac: ", CommonUtil.n(address));
                    if ((address == null || !address.equals(res.this.g)) && (name == null || !name.equals(res.this.t))) {
                        return;
                    }
                    res.this.a(btDevice);
                } catch (SecurityException e2) {
                    LogUtil.e("CloudDeviceConnectManager", "onDeviceDiscovered SecurityException:", ExceptionUtils.c(e2));
                }
            }
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryFinished() {
            LogUtil.d("CloudDeviceConnectManager", "onDeviceDiscoveryFinished");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryCanceled() {
            LogUtil.d("CloudDeviceConnectManager", "onDeviceDiscoveryCanceled");
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onFailure(int i, String str) {
            LogUtil.d("CloudDeviceConnectManager", "onFailure");
        }
    };

    /* synthetic */ void e(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("CloudDeviceConnectManager", "mHfpService set ok.");
            this.q = true;
            g();
        } else {
            LogUtil.j("CloudDeviceConnectManager", "mHfpService is null.");
            this.q = false;
            if (Build.VERSION.SDK_INT < 34) {
                n();
            }
        }
    }

    private res() {
    }

    public static res d() {
        res resVar;
        synchronized (e) {
            if (j == null) {
                j = new res();
            }
            resVar = j;
        }
        return resVar;
    }

    private void g() {
        edn ednVarA = lvi.a(this.u);
        this.k = ednVarA;
        LogUtil.a("CloudDeviceConnectManager", "infoByType.getDeviceName() : ", CommonUtil.n(ednVarA.i()));
        if (TextUtils.isEmpty(this.k.i())) {
            n();
            return;
        }
        Timer timer = new Timer("CloudDeviceConnectManager");
        this.l = timer;
        timer.schedule(new TimerTask() { // from class: res.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                if (res.this.q) {
                    synchronized (res.e) {
                        if (res.this.l != null) {
                            LogUtil.j("CloudDeviceConnectManager", "mHfpTimer cancel");
                            res.this.l.cancel();
                        }
                    }
                    res resVar = res.this;
                    if (!resVar.c(resVar.t, res.this.g)) {
                        LogUtil.a("CloudDeviceConnectManager", "mHfpTimer enter infoByType.getBtType()", Integer.valueOf(res.this.k.b()));
                        BTDeviceMgrUtil.c().c(rcy.e(res.this.u), res.this.k.b(), res.this.h);
                        return;
                    } else {
                        LogUtil.j("CloudDeviceConnectManager", "checkHfpDeviceList");
                        return;
                    }
                }
                LogUtil.j("CloudDeviceConnectManager", "HfpService is not ok.");
            }
        }, 1000L, 1000L);
        f();
        Timer timer2 = new Timer("CloudDeviceConnectManager");
        this.p = timer2;
        timer2.schedule(new TimerTask() { // from class: res.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                res.this.l();
            }
        }, 20000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        n();
        this.o = false;
        LogUtil.a("CloudDeviceConnectManager", "stop scan ble.");
        synchronized (e) {
            Timer timer = this.l;
            if (timer != null) {
                timer.cancel();
                this.l = null;
            }
        }
        BTDeviceMgrUtil.c().d();
        this.q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Timer timer = this.p;
        if (timer != null) {
            timer.cancel();
            this.p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str, String str2) {
        List<BluetoothDevice> listI = BTDeviceMgrUtil.c().i();
        if (listI != null && listI.size() > 0) {
            for (BluetoothDevice bluetoothDevice : listI) {
                if (str2 != null) {
                    try {
                        if (!str2.equalsIgnoreCase(bluetoothDevice.getAddress())) {
                        }
                        LogUtil.a("CloudDeviceConnectManager", "checkHfpDeviceList deviceName:", str, ", deviceMac: ", CommonUtil.n(str2));
                        a(bluetoothDevice);
                        return true;
                    } catch (SecurityException e2) {
                        LogUtil.e("CloudDeviceConnectManager", "checkHfpDeviceList SecurityException:", ExceptionUtils.c(e2));
                    }
                }
                if (str.equalsIgnoreCase(bluetoothDevice.getName())) {
                    LogUtil.a("CloudDeviceConnectManager", "checkHfpDeviceList deviceName:", str, ", deviceMac: ", CommonUtil.n(str2));
                    a(bluetoothDevice);
                    return true;
                }
                LogUtil.j("CloudDeviceConnectManager", "hfp device is : ", bluetoothDevice.getName());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice) {
        try {
            if (TextUtils.isEmpty(bluetoothDevice.getAddress())) {
                LogUtil.j("CloudDeviceConnectManager", "device address is null");
                return;
            }
            if (this.o) {
                return;
            }
            this.o = true;
            LogUtil.a("CloudDeviceConnectManager", "device address:", CommonUtil.n(bluetoothDevice.getAddress()));
            this.g = bluetoothDevice.getAddress();
            if (TextUtils.isEmpty(bluetoothDevice.getName())) {
                rdt.d(100116, "1");
            }
            this.m = bluetoothDevice.getName() != null ? bluetoothDevice.getName() : this.t;
            if (bluetoothDevice.getType() != 1 && bluetoothDevice.getType() != 2) {
                this.i = this.k.b();
            } else {
                this.i = bluetoothDevice.getType();
            }
            e();
        } catch (SecurityException e2) {
            LogUtil.e("CloudDeviceConnectManager", "connectAboutNormalDevice SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public void e() {
        WeakReference<Activity> weakReference = this.f47238a;
        if (weakReference == null) {
            ReleaseLogUtil.e("R_CloudDeviceConnectManager", "checkConnectDevice mActivity == null");
            return;
        }
        Activity activity = weakReference.get();
        if (activity == null) {
            ReleaseLogUtil.e("R_CloudDeviceConnectManager", "checkConnectDevice activity == null");
            return;
        }
        BluetoothAdapter.getDefaultAdapter();
        if (!BluetoothAdapter.checkBluetoothAddress(this.g)) {
            ReleaseLogUtil.e("R_CloudDeviceConnectManager", "checkConnectDevice mDeviceMac is invalid.");
            return;
        }
        if (rdp.a(activity, this.i) && this.u != 75) {
            coi.b().e(BluetoothAdapter.getDefaultAdapter().getRemoteDevice(this.g));
            e((Context) activity);
            return;
        }
        b();
    }

    /* synthetic */ void c(View view) {
        b();
    }

    public void e(Context context) {
        rdp.d(this.g, context, this.i, new View.OnClickListener() { // from class: rex
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47253c.c(view);
            }
        });
    }

    public void c(String str) {
        cqp.a(100112, this.m, str, String.valueOf(100010));
    }

    public void a(String str, Intent intent) {
        ReleaseLogUtil.d(str, "startObservingDevicePresence");
        if (!TextUtils.isEmpty(this.g)) {
            BluetoothAdapter.getDefaultAdapter();
            if (BluetoothAdapter.checkBluetoothAddress(this.g)) {
                rdp.d(str, this.g, intent);
                SharedPreferenceManager.a("HEARTBEAT_INFO", "companion_device_manager_flag", true);
                return;
            }
        }
        ReleaseLogUtil.e(str, "startObservingDevicePresence deviceMac: " + CommonUtil.n(this.g) + " is invalid.");
    }

    public void b() {
        LogUtil.a("CloudDeviceConnectManager", "Enter pairBleDevice.");
        if (CommonUtil.f(BaseApplication.getContext(), "com.huawei.ui.device.activity.pairing.DevicePairGuideActivity")) {
            LogUtil.j("CloudDeviceConnectManager", "DevicePairGuideActivity is aready in task");
            n();
            return;
        }
        WeakReference<Activity> weakReference = this.f47238a;
        if (weakReference == null) {
            LogUtil.j("CloudDeviceConnectManager", "goDevicePairPage, mActivity is null");
            return;
        }
        final Activity activity = weakReference.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: rev
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(activity);
                }
            });
        }
    }

    /* synthetic */ void b(Activity activity) {
        rcw.b(BaseApplication.getContext()).g(this.g);
        String strI = lvi.a(this.u).i();
        if (cjk.d().isSupportH5Pair(this.m)) {
            String strJ = lvi.j(this.u);
            ArrayList arrayList = new ArrayList();
            arrayList.add(strJ);
            StartPairOption startPairOptionA = StartPairOption.builder().c(this.g).d(arrayList).d(this.m).a("wear_watch").e(true).a();
            BroadcastReceiver broadcastReceiver = this.s;
            if (broadcastReceiver != null && this.r) {
                d(broadcastReceiver);
            }
            cjk.d().startPair(activity, startPairOptionA);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) DevicePairGuideActivity.class);
        intent.putExtra("pairGuideProductType", this.u);
        intent.putExtra("pairGuideProductName", strI);
        intent.putExtra("pairGuideFromScanList", true);
        intent.putExtra("pairGuideSelectName", this.m);
        intent.putExtra("pairGuideSelectAddress", this.g);
        intent.putExtra("pairGuideDeviceMode", 100010);
        intent.putExtra("cloudDevicePair", true);
        activity.startActivityForResult(intent, 1);
    }

    private void d(BroadcastReceiver broadcastReceiver) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
            LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("CloudDeviceConnectManager", "resisterReceiver, broadcastReceiver is error");
        }
    }

    public void c() {
        this.r = false;
        try {
            if (this.s != null) {
                LocalBroadcastManager.getInstance().unregisterReceiver(this.s);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("CloudDeviceConnectManager", "unregisterPairBroadcast is error");
        }
    }

    public void b(boolean z) {
        this.r = z;
    }

    public void a(int i, String str, String str2, Activity activity) {
        if (TextUtils.isEmpty(str) || activity == null) {
            return;
        }
        this.o = false;
        this.f47238a = new WeakReference<>(activity);
        this.u = i;
        this.t = str;
        if (TextUtils.isEmpty(str)) {
            rdt.d(100116, "0");
        }
        this.g = str2;
        int i2 = this.u;
        LogUtil.a("CloudDeviceConnectManager", "mTargetType:", Integer.valueOf(i2), "mTargetDeviceName:", this.t, "mDeviceMac:", CommonUtil.n(str2));
        lvl.b(this.u, this.t, true);
        Activity activity2 = this.f47238a.get();
        if (activity2 != null) {
            edn ednVarA = lvi.a(this.u);
            if (Build.VERSION.SDK_INT > 30) {
                d(f47236b, activity2);
            } else if (ednVarA.b() == 2) {
                d(f47237c, activity2);
            } else {
                d(d, activity2);
            }
        }
    }

    private void d(String[] strArr, Activity activity) {
        if (!lsg.d(activity, strArr)) {
            if (Arrays.asList(strArr).contains("android.permission.READ_PHONE_STATE")) {
                d(PermissionUtil.PermissionType.PHONE_STATE, activity);
                return;
            } else if (Arrays.asList(strArr).contains("android.permission.BLUETOOTH_SCAN")) {
                d(PermissionUtil.PermissionType.SCAN, activity);
                return;
            } else {
                d(PermissionUtil.PermissionType.LOCATION, activity);
                return;
            }
        }
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final PermissionUtil.PermissionType permissionType, final Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: res.9

            /* JADX INFO: renamed from: res$9$5, reason: invalid class name */
            class AnonymousClass5 extends CustomPermissionAction {
                AnonymousClass5(Context context) {
                    super(context);
                }

                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    LogUtil.a("CloudDeviceConnectManager", "permission allowed permissionType:", permissionType);
                    if (permissionType == PermissionUtil.PermissionType.LOCATION || permissionType == PermissionUtil.PermissionType.SCAN) {
                        res.this.j();
                    } else {
                        res.this.d(PermissionUtil.PermissionType.LOCATION, activity);
                    }
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onDenied(String str) {
                    super.onDenied(str);
                    res.this.n();
                    LogUtil.a("CloudDeviceConnectManager", "permission onDenied permission:", str);
                }

                @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                    LogUtil.a("CloudDeviceConnectManager", "permission onDenied permission onForeverDenied");
                    res.this.n();
                    if (activity.isFinishing()) {
                        return;
                    }
                    super.onForeverDenied(permissionType, new View.OnClickListener() { // from class: rey
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LogUtil.d("CloudDeviceConnectManager", "permission onClick");
                        }
                    }, new View.OnClickListener() { // from class: rfg
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LogUtil.d("CloudDeviceConnectManager", "onClick");
                        }
                    });
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                PermissionUtil.d(activity, permissionType, new AnonymousClass5(activity));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        lvl.b(this.u, this.t, false);
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.CLOUD_CONNECTION_STATE_CHANGED");
        CloudDeviceInfo cloudDeviceInfoE = lvl.e(this.u, this.t);
        if (cloudDeviceInfoE != null) {
            LogUtil.a("CloudDeviceConnectManager", "cloudDeviceInfo is not null");
            intent.putExtra("deviceinfo", cloudDeviceInfoE);
        }
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public void b(int i, String str) {
        this.u = i;
        this.t = str;
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        final Activity activity = this.f47238a.get();
        if (activity == null) {
            LogUtil.j("CloudDeviceConnectManager", "getHarmonyStatus runActivity is null");
        } else if (DevicePairGuideUtil.b() == null) {
            ThreadPoolManager.c().a("CloudDeviceConnectManager", new Runnable() { // from class: ret
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47248b.d(activity);
                }
            });
        } else {
            activity.runOnUiThread(new Runnable() { // from class: rfc
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.a(activity);
                }
            });
        }
    }

    /* synthetic */ void a(Activity activity) {
        if (Build.VERSION.SDK_INT > 30) {
            o();
        } else {
            j(activity);
        }
    }

    /* synthetic */ void d(final Activity activity) {
        LogUtil.a("CloudDeviceConnectManager", "getHarmonyStatus getValue");
        String strD = lon.c().d("scale_share_harmony_tips");
        DevicePairGuideUtil.e(strD);
        LogUtil.a("CloudDeviceConnectManager", "getHarmonyStatus scale_share_harmony_tips:", strD);
        activity.runOnUiThread(new Runnable() { // from class: res.8
            @Override // java.lang.Runnable
            public void run() {
                if (Build.VERSION.SDK_INT > 30) {
                    res.this.o();
                } else {
                    res.this.j(activity);
                }
            }
        });
    }

    private boolean a(int i) {
        return PermissionUtil.a() && i == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(Activity activity) {
        String string;
        edn ednVarA = lvi.a(this.u);
        if ((a(ednVarA.b()) || ednVarA.b() == 2) && !rdp.b()) {
            n();
            LogUtil.j("CloudDeviceConnectManager", "checkGpsState open gps switch.");
            String string2 = BaseApplication.getContext().getString(R.string.ok);
            if ("on".equals(DevicePairGuideUtil.b())) {
                string = BaseApplication.getContext().getString(com.huawei.ui.device.R.string.IDS_btsdk_turn_on_location_harmony);
            } else {
                string = BaseApplication.getContext().getString(com.huawei.ui.device.R.string.IDS_btsdk_turn_on_location);
            }
            c(activity, string2, string);
            return;
        }
        LogUtil.j("CloudDeviceConnectManager", "checkGpsState startScan");
        o();
    }

    private void c(final Activity activity, String str, String str2) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f47238a.get()).a(str2).a(str, new View.OnClickListener() { // from class: rez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                res.a(activity, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void a(Activity activity, View view) {
        try {
            activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("CloudDeviceConnectManager", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.a("CloudDeviceConnectManager", "start scan ble.");
        int iH = BTDeviceMgrUtil.c().h();
        if (iH == 1 || iH == 2) {
            h();
        } else if (iH == 3 || iH == 4) {
            BTDeviceMgrUtil.c().d(BaseApplication.getContext(), this.n);
        } else {
            LogUtil.j("CloudDeviceConnectManager", "unknown state.");
            i();
        }
    }

    private void i() {
        final Activity activity = this.f47238a.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: rfa
                @Override // java.lang.Runnable
                public final void run() {
                    qpx.e(activity, qrs.ah(BaseApplication.getContext()) ? com.huawei.ui.device.R.string.IDS_blite_pair_reopen_bt_pad : com.huawei.ui.device.R.string.IDS_blite_guide_paire_fail_help_no_band_string);
                }
            });
        }
    }

    private void h() {
        final Activity activity = this.f47238a.get();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: rew
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47252b.e(activity);
                }
            });
        }
    }

    /* synthetic */ void e(Activity activity) {
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activity);
        builder.b(com.huawei.ui.device.R.string.IDS_btsdk_turn_on_BT).c(com.huawei.ui.device.R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: rep
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(view);
            }
        }).a(com.huawei.ui.device.R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: reu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.d("CloudDeviceConnectManager", "bluetoothSwitch onClick");
            }
        });
        if (activity.isFinishing()) {
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void e(View view) {
        BTDeviceMgrUtil.c().c(this.f);
    }
}
