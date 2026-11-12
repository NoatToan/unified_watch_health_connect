package com.huawei.hwbtsdk.btcommon;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ParcelUuid;
import android.text.TextUtils;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.deviceconnect.callback.BtDeviceResponseCallback;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceBondStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceHfpStateCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtDevicePairCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import defpackage.coq;
import defpackage.cpc;
import defpackage.lms;
import defpackage.lmz;
import defpackage.lnc;
import defpackage.lnf;
import defpackage.lng;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class BTDeviceMgrUtil {
    private Handler ac;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f17003a = new Object();
    private static final int e = Build.VERSION.SDK_INT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BTDeviceMgrUtil f17004b = null;
    private Context p = null;
    private BtDevicePairCallback m = null;
    private final List<BtSwitchStateCallback> l = new ArrayList(10);
    private BluetoothAdapter d = null;
    private HandlerThread ad = new HandlerThread("scan_thread");
    private BluetoothHeadset q = null;
    private BtDeviceHfpStateCallback o = null;
    private BtDeviceBondStateCallback n = null;
    private BluetoothProfile.ServiceListener u = null;
    private BtDeviceDiscoverCallback k = null;
    private lms w = null;
    private lnf v = null;
    private List<BluetoothDeviceNode> h = new ArrayList(10);
    private BluetoothManager j = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17005c = false;
    private boolean i = false;
    private boolean y = false;
    private d ab = null;
    private BtDeviceResponseCallback s = null;
    private BroadcastReceiver x = new BroadcastReceiver() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            int type;
            if (BTDeviceMgrUtil.this.d(context, intent)) {
                String action = intent.getAction();
                if ("android.bluetooth.device.action.FOUND".equals(action)) {
                    try {
                        bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    } catch (BadParcelableException unused) {
                        LogUtil.d("BTDeviceMgrUtil", "mReceiver found BadParcelableException");
                        bluetoothDevice = null;
                    }
                    if (bluetoothDevice == null) {
                        return;
                    }
                    try {
                        type = bluetoothDevice.getType();
                    } catch (SecurityException e2) {
                        LogUtil.d("BTDeviceMgrUtil", "BroadcastReceiver SecurityException:", ExceptionUtils.c(e2));
                        type = 0;
                    }
                    if (type == 0 || type == 2) {
                        return;
                    }
                    synchronized (BTDeviceMgrUtil.f17003a) {
                        BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
                        bluetoothDeviceNode.setBtDevice(bluetoothDevice);
                        BTDeviceMgrUtil.this.h.add(bluetoothDeviceNode);
                        if (BTDeviceMgrUtil.this.k != null) {
                            BTDeviceMgrUtil.this.k.onDeviceDiscovered(bluetoothDeviceNode, 0, null);
                        }
                    }
                    return;
                }
                if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals(action)) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter ACTION_DISCOVERY_FINISHED.");
                    synchronized (BTDeviceMgrUtil.f17003a) {
                        if (BTDeviceMgrUtil.this.k != null) {
                            BTDeviceMgrUtil.this.k.onDeviceDiscoveryFinished();
                        }
                    }
                    return;
                }
                if ("android.bluetooth.device.action.BOND_STATE_CHANGED".equals(action)) {
                    BTDeviceMgrUtil.this.b(intent);
                } else {
                    LogUtil.b("BTDeviceMgrUtil", "no new status");
                }
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            int bondState;
            if (BTDeviceMgrUtil.this.d(context, intent) && "android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                try {
                    bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                } catch (BadParcelableException unused) {
                    LogUtil.d("BTDeviceMgrUtil", "mBondStateReceiver onReceive BadParcelableException");
                    bluetoothDevice = null;
                }
                if (bluetoothDevice == null) {
                    LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "btDevice is null.");
                    return;
                }
                try {
                    bondState = bluetoothDevice.getBondState();
                } catch (SecurityException e2) {
                    LogUtil.d("BTDeviceMgrUtil", "reportBondState SecurityException:", ExceptionUtils.c(e2));
                    bondState = 0;
                }
                if (bondState != 0 && bondState == 10) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Device is unPaired, mBtDeviceBondStateCallback :", Boolean.valueOf(BTDeviceMgrUtil.this.n == null));
                    if (BTDeviceMgrUtil.this.n != null) {
                        BTDeviceMgrUtil.this.n.onBtDeviceBondNone(bluetoothDevice.getAddress());
                    }
                }
            }
        }
    };
    private BtDeviceDiscoverCallback t = new BtDeviceDiscoverCallback() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.2
        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryCanceled() {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscoveryFinished() {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onFailure(int i, String str) {
        }

        @Override // com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback
        public void onDeviceDiscovered(BluetoothDeviceNode bluetoothDeviceNode, int i, byte[] bArr) {
            if (bluetoothDeviceNode != null) {
                synchronized (BTDeviceMgrUtil.f17003a) {
                    BTDeviceMgrUtil.this.h.add(bluetoothDeviceNode);
                    if (BTDeviceMgrUtil.this.k != null) {
                        BTDeviceMgrUtil.this.k.onDeviceDiscovered(bluetoothDeviceNode, i, bArr);
                    }
                }
            }
        }
    };
    private BroadcastReceiver r = new BroadcastReceiver() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            if (BTDeviceMgrUtil.this.d(context, intent)) {
                String action = intent.getAction();
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "EMUI mHFPStateReceiver action :", action, ", mBtDeviceHfpStateCallback :", Boolean.valueOf(BTDeviceMgrUtil.this.o == null));
                BluetoothDevice bluetoothDevice2 = null;
                if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action) || "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    try {
                        bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    } catch (BadParcelableException unused) {
                        LogUtil.d("BTDeviceMgrUtil", "mHFPStateReceiver hfp BadParcelableException");
                        bluetoothDevice = null;
                    }
                    if (bluetoothDevice != null) {
                        if (BTDeviceMgrUtil.this.o != null && intExtra == 2) {
                            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "HFP device connected.");
                            BTDeviceMgrUtil.this.o.onBtDeviceHfpConnected(bluetoothDevice, action);
                        }
                    } else {
                        LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "btDevice is null so return.");
                        return;
                    }
                }
                if ("android.bluetooth.device.action.ACL_CONNECTED".equals(action)) {
                    try {
                        bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    } catch (BadParcelableException unused2) {
                        LogUtil.d("BTDeviceMgrUtil", "mHFPStateReceiver acl BadParcelableException");
                    }
                    if (bluetoothDevice2 != null) {
                        if (BTDeviceMgrUtil.this.o != null) {
                            BTDeviceMgrUtil.this.o.onBtDeviceHfpConnected(bluetoothDevice2, action);
                            return;
                        }
                        return;
                    }
                    LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "btDevice is null so return.");
                }
            }
        }
    };
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (BTDeviceMgrUtil.this.d(context, intent) && "android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                try {
                    if (BTDeviceMgrUtil.this.d != null) {
                        int state = BTDeviceMgrUtil.this.d.getState();
                        switch (state) {
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                                synchronized (BTDeviceMgrUtil.this.l) {
                                    try {
                                        if (!coq.d(BTDeviceMgrUtil.this.l)) {
                                            for (int i = 0; i < BTDeviceMgrUtil.this.l.size(); i++) {
                                                ((BtSwitchStateCallback) BTDeviceMgrUtil.this.l.get(i)).onBtSwitchStateCallback(BTDeviceMgrUtil.d(state));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                    break;
                                }
                                return;
                            default:
                                return;
                        }
                        LogUtil.d("BTDeviceMgrUtil", "mBTSwitchStateReceiver getState exception");
                        lng.c("ConnectMessage", "mBTSwitchStateReceiver getState exception");
                    }
                } catch (Exception unused) {
                    LogUtil.d("BTDeviceMgrUtil", "mBTSwitchStateReceiver getState exception");
                    lng.c("ConnectMessage", "mBTSwitchStateReceiver getState exception");
                }
            }
        }
    };

    /* JADX INFO: loaded from: classes10.dex */
    public interface OpenBluetoothSwitchCallback {
        void onDone(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 3;
            case 13:
                return 2;
            default:
                return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Intent intent) {
        BluetoothDevice bluetoothDevice;
        int bondState;
        try {
            bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
        } catch (BadParcelableException unused) {
            LogUtil.d("BTDeviceMgrUtil", "mReceiver bond state BadParcelableException");
            bluetoothDevice = null;
        }
        if (bluetoothDevice == null) {
            return;
        }
        try {
            bondState = bluetoothDevice.getBondState();
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "reportBondState SecurityException:", ExceptionUtils.c(e2));
            bondState = 0;
        }
        if (bondState == 0) {
            return;
        }
        if (bondState == 12) {
            BtDevicePairCallback btDevicePairCallback = this.m;
            if (btDevicePairCallback != null) {
                btDevicePairCallback.onDevicePaired(bluetoothDevice);
            }
            c(this.x, "DeviceBonded");
            return;
        }
        if (bondState == 11) {
            BtDevicePairCallback btDevicePairCallback2 = this.m;
            if (btDevicePairCallback2 != null) {
                btDevicePairCallback2.onDevicePairing(bluetoothDevice);
                return;
            }
            return;
        }
        if (bondState != 10) {
            LogUtil.e("BTDeviceMgrUtil", "reportBondState on receive else");
            return;
        }
        BtDevicePairCallback btDevicePairCallback3 = this.m;
        if (btDevicePairCallback3 != null) {
            btDevicePairCallback3.onDevicePairNone(bluetoothDevice);
        }
    }

    private BTDeviceMgrUtil() {
        this.ad.start();
        this.ac = new Handler(this.ad.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d(Context context, Intent intent) {
        if (intent != null) {
            return true;
        }
        LogUtil.b("BTDeviceMgrUtil", "intent is null");
        return false;
    }

    public static BTDeviceMgrUtil c() {
        if (f17004b == null) {
            f17004b = new BTDeviceMgrUtil();
        }
        return f17004b;
    }

    public void b(Context context) {
        if (context != null) {
            this.p = context;
            Object systemService = context.getSystemService("bluetooth");
            if (systemService instanceof BluetoothManager) {
                this.j = (BluetoothManager) systemService;
            }
            g();
            m();
            if (this.d == null) {
                try {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    this.d = defaultAdapter;
                    if (defaultAdapter != null) {
                        if (!defaultAdapter.getProfileProxy(context, this.u, 1)) {
                            LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Get HFP Profile handle fail.");
                        }
                        if (!this.d.getProfileProxy(context, this.u, 4)) {
                            LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Get HID Profile handle fail.");
                        }
                    } else {
                        LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "mAdapter is null.");
                    }
                } catch (SecurityException e2) {
                    LogUtil.d("BTDeviceMgrUtil", "get profile failed reason: " + e2.getMessage());
                }
            }
            f();
        }
    }

    private void m() {
        if (this.u != null) {
            return;
        }
        this.u = new BluetoothProfile.ServiceListener() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.7
            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
                if (i == 1 && (bluetoothProfile instanceof BluetoothHeadset)) {
                    BTDeviceMgrUtil.this.q = (BluetoothHeadset) bluetoothProfile;
                    if (BTDeviceMgrUtil.this.s != null) {
                        BTDeviceMgrUtil.this.s.onResponse(0, "success");
                    }
                }
            }

            @Override // android.bluetooth.BluetoothProfile.ServiceListener
            public void onServiceDisconnected(int i) {
                if (i != 1) {
                    return;
                }
                BTDeviceMgrUtil.this.q = null;
                if (BTDeviceMgrUtil.this.s != null) {
                    BTDeviceMgrUtil.this.s.onResponse(-1, "set null");
                }
            }
        };
    }

    public void d(Context context, BtDeviceResponseCallback btDeviceResponseCallback) {
        this.s = btDeviceResponseCallback;
        b(context);
    }

    public void f() {
        if (this.y) {
            LogUtil.b("BTDeviceMgrUtil", "Already registered");
            return;
        }
        if (this.p == null) {
            LogUtil.e("BTDeviceMgrUtil", "mContext is null");
            this.p = BaseApplication.b();
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        BroadcastManagerUtil.a(BaseApplication.b(), this.r, intentFilter);
        BroadcastManagerUtil.a(BaseApplication.b(), this.f, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
        BroadcastManagerUtil.a(BaseApplication.b(), this.g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        LogUtil.b("BTDeviceMgrUtil", "Set already registered");
        this.y = true;
    }

    public void j() {
        c(this.r, "HFPState");
        c(this.f, "BondState");
        c(this.g, "BTSwitch");
        c(this.x, "DiscoveryFinished");
        t();
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceMgrUtil", "destroy finish.");
    }

    private static void t() {
        f17004b = null;
    }

    private void c(BroadcastReceiver broadcastReceiver, String str) {
        try {
            BaseApplication.b().unregisterReceiver(broadcastReceiver);
        } catch (IllegalArgumentException unused) {
            LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "destroy error", str);
        }
    }

    public void g() {
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.closeProfileProxy(1, this.q);
            this.d = null;
            this.q = null;
            this.u = null;
        }
    }

    public int h() {
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.d = defaultAdapter;
            if (defaultAdapter == null) {
                return 1;
            }
            return d(defaultAdapter.getState());
        }
        return d(bluetoothAdapter.getState());
    }

    public void e(BtSwitchStateCallback btSwitchStateCallback, Handler handler) {
        b(btSwitchStateCallback, handler);
    }

    /* JADX INFO: Removed unreachable split cross block B:21:0x0060 */
    public void c(BtSwitchStateCallback btSwitchStateCallback) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                b(BaseApplication.b());
                a(btSwitchStateCallback);
                try {
                    Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
                    Activity activityJ = BaseApplication.j();
                    if (activityJ != null) {
                        activityJ.startActivityForResult(intent, 23954);
                    } else {
                        intent.setFlags(268435456);
                        BaseApplication.b().startActivity(intent);
                    }
                } catch (ActivityNotFoundException unused) {
                    btSwitchStateCallback.onBtSwitchStateCallback(1);
                    LogUtil.d(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "btSwitchEnable ActivityNotFoundException");
                }
            } else {
                b(btSwitchStateCallback, (Handler) null);
            }
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "btSwitchEnable SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public static boolean a() {
        return BaseApplication.b().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BtDeviceDiscoverCallback btDeviceDiscoverCallback, boolean z, boolean z2) {
        boolean zA = a();
        if (e >= 18 && zA) {
            a(btDeviceDiscoverCallback, z, z2);
        } else {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Android version less than JELLY_BEAN_MR2.");
        }
    }

    public void c(final List<String> list, final int i, final BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter startBTDeviceDiscovery(), callback :", Boolean.valueOf(btDeviceDiscoverCallback == null));
        if (btDeviceDiscoverCallback == null) {
            return;
        }
        this.ac.post(new Runnable() { // from class: com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.9
            @Override // java.lang.Runnable
            public void run() {
                int i2 = i;
                if (i2 != 1) {
                    if (i2 == 2) {
                        BTDeviceMgrUtil.this.e(btDeviceDiscoverCallback, false, true);
                        return;
                    } else {
                        if (i2 != 4) {
                            return;
                        }
                        LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "BT Type is BT_DUAL and not support.");
                        return;
                    }
                }
                List list2 = list;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 0, "BTDeviceMgrUtil", "start basic rate bluetooth discovery filter name = ", (String) it.next());
                    }
                }
                BTDeviceMgrUtil.this.a(btDeviceDiscoverCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        BtDeviceDiscoverCallback btDeviceDiscoverCallback2;
        d dVar;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter discoverClassicDevice().");
        if (this.d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.d = defaultAdapter;
            if (defaultAdapter == null) {
                LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "mAdapter is null for br discover.");
                return;
            }
        }
        try {
            if (this.d.isDiscovering()) {
                this.d.cancelDiscovery();
            }
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "discoverClassicDevice SecurityException:", ExceptionUtils.c(e2));
        }
        if (this.f17005c && (dVar = this.ab) != null) {
            dVar.e(2);
        }
        lmz.b().e("");
        Object obj = f17003a;
        synchronized (obj) {
            this.k = btDeviceDiscoverCallback;
        }
        this.i = true;
        synchronized (obj) {
            this.h.clear();
        }
        if (this.p != null) {
            try {
                BroadcastManagerUtil.a(BaseApplication.b(), this.x, new IntentFilter("android.bluetooth.device.action.FOUND"));
                BroadcastManagerUtil.a(BaseApplication.b(), this.x, new IntentFilter("android.bluetooth.adapter.action.DISCOVERY_FINISHED"));
            } catch (SecurityException e3) {
                LogUtil.d("BTDeviceMgrUtil", "discoverClassicDevice SecurityException:", ExceptionUtils.c(e3));
            }
        }
        synchronized (f17003a) {
            this.h.addAll(k());
            for (BluetoothDeviceNode bluetoothDeviceNode : this.h) {
                if (bluetoothDeviceNode != null && (btDeviceDiscoverCallback2 = this.k) != null) {
                    btDeviceDiscoverCallback2.onDeviceDiscovered(bluetoothDeviceNode, 0, null);
                }
            }
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.d;
            if (bluetoothAdapter == null) {
                LogUtil.e("BTDeviceMgrUtil", "discoverClassicDevice mAdapter is null");
            } else {
                bluetoothAdapter.startDiscovery();
            }
        } catch (SecurityException e4) {
            LogUtil.d("BTDeviceMgrUtil", "discoverClassicDevice SecurityException", cpc.c(e4));
        }
    }

    private void a(BtDeviceDiscoverCallback btDeviceDiscoverCallback, boolean z, boolean z2) {
        BtDeviceDiscoverCallback btDeviceDiscoverCallback2;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter discoverBLEDevice().");
        n();
        Object obj = f17003a;
        synchronized (obj) {
            this.k = btDeviceDiscoverCallback;
        }
        try {
            this.f17005c = true;
            synchronized (obj) {
                if (z2) {
                    this.h.clear();
                }
                throw th;
            }
            if (this.j != null && !z) {
                synchronized (obj) {
                    this.h.addAll(o());
                }
            }
            synchronized (obj) {
                if (!z) {
                    this.h.addAll(k());
                    for (BluetoothDeviceNode bluetoothDeviceNode : this.h) {
                        if (bluetoothDeviceNode != null && (btDeviceDiscoverCallback2 = this.k) != null) {
                            btDeviceDiscoverCallback2.onDeviceDiscovered(bluetoothDeviceNode, 0, null);
                        }
                    }
                }
            }
            this.v = new lnf(this.t);
            if (!r()) {
                this.w = null;
                return;
            }
            d dVar = new d();
            this.ab = dVar;
            dVar.start();
        } catch (IllegalThreadStateException e2) {
            LogUtil.d("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "discoverBLEDevice exception:", ExceptionUtils.c(e2));
        }
    }

    private boolean r() {
        BluetoothAdapter bluetoothAdapter;
        boolean zS = false;
        for (int i = 0; i < 3 && (bluetoothAdapter = this.d) != null && bluetoothAdapter.isEnabled() && this.d.getState() == 12; i++) {
            try {
                zS = s();
            } catch (IllegalStateException unused) {
                LogUtil.d("BTDeviceMgrUtil", "IllegalStateException now version is", Integer.valueOf(Build.VERSION.SDK_INT));
            } catch (NullPointerException unused2) {
                LogUtil.d("BTDeviceMgrUtil", "exception now version is", Integer.valueOf(Build.VERSION.SDK_INT));
            }
            if (zS) {
                break;
            }
        }
        return zS;
    }

    private boolean s() {
        BluetoothLeScanner bluetoothLeScanner = this.d.getBluetoothLeScanner();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ScanFilter.Builder().build());
        if (bluetoothLeScanner != null) {
            try {
                ReleaseLogUtil.c("BTSDK_BTDeviceMgrUtil", "startBleScan");
                bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(2).build(), this.v);
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "startBleScan SecurityException:", cpc.c(e2));
            }
        }
        return true;
    }

    private List<BluetoothDeviceNode> o() {
        ArrayList arrayList = new ArrayList(10);
        try {
            for (BluetoothDevice bluetoothDevice : this.j.getConnectedDevices(7)) {
                BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
                bluetoothDeviceNode.setBtDevice(bluetoothDevice);
                arrayList.add(bluetoothDeviceNode);
            }
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "getDeviceNodesList SecurityException", cpc.c(e2));
        }
        return arrayList;
    }

    private ArrayList k() {
        Set<BluetoothDevice> bondedDevices;
        boolean zBooleanValue;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        ArrayList arrayList = new ArrayList(10);
        try {
            try {
                Method declaredMethod = BluetoothAdapter.class.getDeclaredMethod("getConnectionState", new Class[0]);
                declaredMethod.setAccessible(true);
                try {
                    bondedDevices = defaultAdapter.getBondedDevices();
                } catch (SecurityException e2) {
                    LogUtil.d("BTDeviceMgrUtil", "getConnectedDeviceList SecurityException", cpc.c(e2));
                    bondedDevices = null;
                }
                if (bondedDevices == null) {
                    LogUtil.b("BTDeviceMgrUtil", "getConnectedDeviceList() devices is null.");
                } else {
                    for (BluetoothDevice bluetoothDevice : bondedDevices) {
                        Method declaredMethod2 = BluetoothDevice.class.getDeclaredMethod("isConnected", new Class[0]);
                        declaredMethod.setAccessible(true);
                        Object objInvoke = declaredMethod2.invoke(bluetoothDevice, new Object[0]);
                        if (objInvoke instanceof Boolean) {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        } else {
                            LogUtil.e("BTDeviceMgrUtil", "connectedState is not boolean");
                            zBooleanValue = false;
                        }
                        LogUtil.b("BTDeviceMgrUtil", "getConnectDevice:" + bluetoothDevice.getName(), ";connectstatus:" + zBooleanValue);
                        if (zBooleanValue) {
                            BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
                            bluetoothDeviceNode.setBtDevice(bluetoothDevice);
                            arrayList.add(bluetoothDeviceNode);
                        }
                    }
                }
            } catch (SecurityException unused) {
                LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getConnectedDeviceList SecurityException");
            }
        } catch (IllegalAccessException unused2) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getConnectedDeviceList IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getConnectedDeviceList IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getConnectedDeviceList NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getConnectedDeviceList InvocationTargetException");
        }
        return arrayList;
    }

    private void n() {
        if (this.d == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.d = defaultAdapter;
            if (defaultAdapter == null) {
                LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "mAdapter is null.");
                return;
            }
        }
        try {
            if (this.d.isDiscovering()) {
                this.d.cancelDiscovery();
            }
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "doSearch SecurityException:", ExceptionUtils.c(e2));
        }
        d dVar = this.ab;
        if (dVar != null) {
            dVar.e(2);
        }
        lmz.b().e("");
    }

    /* JADX INFO: loaded from: classes10.dex */
    class d extends Thread {
        private int e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f17009a = false;

        d() {
            super.setName("StopBLEDiscoveryThread");
        }

        public void e() {
            this.e = 0;
        }

        public void d(boolean z) {
            this.f17009a = z;
        }

        public boolean b() {
            return this.f17009a;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.e = 0;
            while (!b()) {
                if (15 > this.e) {
                    try {
                        Thread.sleep(1000L);
                        this.e++;
                    } catch (InterruptedException unused) {
                        LogUtil.d("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "stop ble discover with sleep occur exception");
                    }
                } else {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Start to stop ble discover for time arrive.");
                    e(2);
                }
            }
        }

        public void e(int i) {
            BTDeviceMgrUtil.this.f17005c = false;
            this.f17009a = true;
            if (BTDeviceMgrUtil.this.ab != null) {
                BTDeviceMgrUtil.this.ab.e();
                BTDeviceMgrUtil.this.ab.d(true);
            }
            BTDeviceMgrUtil.this.ab = null;
            if (BTDeviceMgrUtil.this.w == null) {
                BTDeviceMgrUtil bTDeviceMgrUtil = BTDeviceMgrUtil.this;
                bTDeviceMgrUtil.w = new lms(bTDeviceMgrUtil.t);
            }
            if (BTDeviceMgrUtil.this.d == null) {
                BTDeviceMgrUtil.this.d = BluetoothAdapter.getDefaultAdapter();
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Start to stopLeScan.");
            if (BTDeviceMgrUtil.this.d.isEnabled()) {
                try {
                    BTDeviceMgrUtil.this.q();
                } catch (Exception unused) {
                    LogUtil.d("BTDeviceMgrUtil", "unknow Exception");
                }
            }
            synchronized (BTDeviceMgrUtil.f17003a) {
                if (BTDeviceMgrUtil.this.k != null) {
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Start to report ble discover handleBLEScanType :", Integer.valueOf(i));
                    if (1 == i) {
                        BTDeviceMgrUtil.this.k.onDeviceDiscoveryCanceled();
                    } else if (2 == i) {
                        BTDeviceMgrUtil.this.k.onDeviceDiscoveryFinished();
                    } else {
                        LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "BLE scan handle type is incorrect.");
                    }
                    BTDeviceMgrUtil.this.k = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        ReleaseLogUtil.c("BTSDK_BTDeviceMgrUtil", "stopBleScan mScanCallback:", Boolean.valueOf(this.v != null));
        BluetoothLeScanner bluetoothLeScanner = this.d.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            try {
                bluetoothLeScanner.stopScan(this.v);
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "stopLeScan SecurityException:", ExceptionUtils.c(e2));
            }
        }
        lnf lnfVar = this.v;
        if (lnfVar != null) {
            lnfVar.d();
        }
    }

    public void d() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter cancelBTDeviceDiscovery().");
        this.s = null;
        if (this.i) {
            if (this.p != null) {
                try {
                    BaseApplication.b().unregisterReceiver(this.x);
                } catch (IllegalArgumentException e2) {
                    LogUtil.d("BTDeviceMgrUtil", "cancelBTDeviceDiscovery exception : ", e2.getMessage());
                }
            }
            try {
                BluetoothAdapter bluetoothAdapter = this.d;
                if (bluetoothAdapter != null && bluetoothAdapter.isDiscovering()) {
                    this.d.cancelDiscovery();
                }
            } catch (SecurityException e3) {
                LogUtil.d("BTDeviceMgrUtil", "cancelBTDeviceDiscovery SecurityException:", ExceptionUtils.c(e3));
            }
            synchronized (f17003a) {
                BtDeviceDiscoverCallback btDeviceDiscoverCallback = this.k;
                if (btDeviceDiscoverCallback != null) {
                    btDeviceDiscoverCallback.onDeviceDiscoveryCanceled();
                    this.k = null;
                }
            }
            this.i = false;
        }
        if (this.f17005c) {
            boolean zA = a();
            if (e >= 18 && zA) {
                this.f17005c = false;
                d dVar = this.ab;
                if (dVar != null) {
                    dVar.e(1);
                }
            }
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Leave cancelBTDeviceDiscovery().");
    }

    public boolean e(BluetoothDevice bluetoothDevice, BtDevicePairCallback btDevicePairCallback) {
        LogUtil.b("BTDeviceMgrUtil", "Start to Pair device.");
        return e(bluetoothDevice, btDevicePairCallback, "createBond");
    }

    public void d(String str) {
        LogUtil.b("BTDeviceMgrUtil", "Start to cancel bond process device.");
        e(b(str), (BtDevicePairCallback) null, "cancelBondProcess");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002d A[Catch: InvocationTargetException -> 0x000c, IllegalArgumentException -> 0x000f, IllegalAccessException -> 0x0012, SecurityException -> 0x0015, NoSuchMethodException -> 0x0018, TryCatch #4 {IllegalAccessException -> 0x0012, IllegalArgumentException -> 0x000f, NoSuchMethodException -> 0x0018, SecurityException -> 0x0015, InvocationTargetException -> 0x000c, blocks: (B:4:0x0009, B:16:0x001d, B:19:0x0025, B:21:0x002d, B:24:0x0033, B:25:0x0043), top: B:45:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0031  */
    /* JADX WARN: Code duplicated, block: B:24:0x0033 A[Catch: InvocationTargetException -> 0x000c, IllegalArgumentException -> 0x000f, IllegalAccessException -> 0x0012, SecurityException -> 0x0015, NoSuchMethodException -> 0x0018, TryCatch #4 {IllegalAccessException -> 0x0012, IllegalArgumentException -> 0x000f, NoSuchMethodException -> 0x0018, SecurityException -> 0x0015, InvocationTargetException -> 0x000c, blocks: (B:4:0x0009, B:16:0x001d, B:19:0x0025, B:21:0x002d, B:24:0x0033, B:25:0x0043), top: B:45:0x0009 }] */
    private boolean e(BluetoothDevice bluetoothDevice, BtDevicePairCallback btDevicePairCallback, String str) {
        boolean zD;
        boolean z = false;
        if (btDevicePairCallback != null) {
            try {
                this.m = btDevicePairCallback;
                if (bluetoothDevice != null && !TextUtils.isEmpty(str)) {
                    if (TextUtils.equals(str, "createBond")) {
                        if (this.p == null) {
                            BroadcastManagerUtil.a(BaseApplication.b(), this.x, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                        }
                    }
                    LogUtil.b("BTDeviceMgrUtil", "bondOperation start");
                    zD = lnc.d(bluetoothDevice, str);
                    try {
                        LogUtil.b("BTDeviceMgrUtil", "bondOperation result: ", Boolean.valueOf(zD));
                        return zD;
                    } catch (IllegalAccessException e2) {
                        z = zD;
                        e = e2;
                        LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                        return z;
                    } catch (IllegalArgumentException e3) {
                        z = zD;
                        e = e3;
                        LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                        return z;
                    } catch (NoSuchMethodException e4) {
                        z = zD;
                        e = e4;
                        LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                        return z;
                    } catch (SecurityException e5) {
                        z = zD;
                        e = e5;
                        LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                        return z;
                    } catch (InvocationTargetException e6) {
                        z = zD;
                        e = e6;
                        LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                        return z;
                    }
                }
            } catch (IllegalAccessException e7) {
                e = e7;
                LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                return z;
            } catch (IllegalArgumentException e8) {
                e = e8;
                LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                return z;
            } catch (NoSuchMethodException e9) {
                e = e9;
                LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                return z;
            } catch (SecurityException e10) {
                e = e10;
                LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                return z;
            } catch (InvocationTargetException e11) {
                e = e11;
                LogUtil.d("BTDeviceMgrUtil", "0xA0200001", " bondOperation exception:", ExceptionUtils.c(e));
                return z;
            }
        } else if (bluetoothDevice != null) {
            if (TextUtils.equals(str, "createBond")) {
                if (this.p == null) {
                    BroadcastManagerUtil.a(BaseApplication.b(), this.x, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
                }
            }
            LogUtil.b("BTDeviceMgrUtil", "bondOperation start");
            zD = lnc.d(bluetoothDevice, str);
            LogUtil.b("BTDeviceMgrUtil", "bondOperation result: ", Boolean.valueOf(zD));
            return zD;
        }
        return z;
    }

    public boolean b(BluetoothDevice bluetoothDevice) {
        LogUtil.b("BTDeviceMgrUtil", "Start to unPair device with btDevice.");
        return e(bluetoothDevice, (BtDevicePairCallback) null, "removeBond");
    }

    public boolean a(String str) {
        LogUtil.b("BTDeviceMgrUtil", "Start to unPair device with mac address.");
        BluetoothDevice bluetoothDeviceB = b(str);
        if (bluetoothDeviceB != null) {
            try {
                if (bluetoothDeviceB.getBondState() != 12) {
                    LogUtil.b("BTDeviceMgrUtil", "device is not bond.");
                    return true;
                }
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "unPairByMacAddress SecurityException:", ExceptionUtils.c(e2));
            }
        }
        return e(bluetoothDeviceB, (BtDevicePairCallback) null, "removeBond");
    }

    public boolean e(BluetoothDevice bluetoothDevice) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter isHfpConnected().");
        BluetoothHeadset bluetoothHeadset = this.q;
        if (bluetoothHeadset != null && bluetoothDevice != null) {
            try {
                int connectionState = bluetoothHeadset.getConnectionState(bluetoothDevice);
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "HFP connect state :", Integer.valueOf(connectionState));
                if (2 == connectionState) {
                    return true;
                }
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "isHfpConnected SecurityException:", ExceptionUtils.c(e2));
            }
        } else {
            LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "mHfpService or btDevice is null.");
        }
        return false;
    }

    public BluetoothDevice c(List<String> list) {
        BluetoothAdapter bluetoothAdapter;
        Set<BluetoothDevice> bondedDevices;
        String strA;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter getHFPConnectedDevice(), mAdapter :", Boolean.valueOf(this.d == null));
        if (list == null || list.size() == 0 || (bluetoothAdapter = this.d) == null) {
            return null;
        }
        try {
            bondedDevices = bluetoothAdapter.getBondedDevices();
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "getHFPConnectedDevice SecurityException", ExceptionUtils.c(e2));
            bondedDevices = null;
        }
        if (bondedDevices != null && bondedDevices.size() != 0) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                if (e(bluetoothDevice)) {
                    for (String str : list) {
                        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "after toUpperCase mNameFilter[] = " + str.toUpperCase(Locale.ENGLISH));
                        if (!TextUtils.isEmpty(str) && (strA = a(bluetoothDevice)) != null && strA.toUpperCase(Locale.ENGLISH).contains(str.toUpperCase(Locale.ENGLISH))) {
                            return bluetoothDevice;
                        }
                    }
                }
            }
        }
        return null;
    }

    private String a(BluetoothDevice bluetoothDevice) {
        try {
            return bluetoothDevice.getName();
        } catch (SecurityException unused) {
            LogUtil.d("BTDeviceMgrUtil", "get device name when filter failed with SecurityException");
            return null;
        }
    }

    public List<BluetoothDevice> i() {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter getHFPConnectedDeviceList(), mAdapter :", Boolean.valueOf(this.d == null));
        Set<BluetoothDevice> bondedDevices = null;
        if (this.d == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(10);
        try {
            try {
                bondedDevices = this.d.getBondedDevices();
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "getHFPConnectedDeviceList SecurityException", cpc.c(e2));
            }
            if (bondedDevices != null && bondedDevices.size() > 0) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    if (e(bluetoothDevice)) {
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (SecurityException e3) {
            LogUtil.d("BTDeviceMgrUtil", "getHFPConnectedDeviceList SecurityException,", ExceptionUtils.c(e3));
        }
        return arrayList;
    }

    public boolean d(List<String> list) {
        String name;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter isWantedDeviceConnected().");
        boolean z = false;
        if (list == null || list.size() == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "parameter is incorrect.");
            return false;
        }
        List<BluetoothDevice> listI = i();
        if (listI == null) {
            return false;
        }
        for (BluetoothDevice bluetoothDevice : listI) {
            try {
                name = bluetoothDevice.getName();
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "isWantedBRDeviceConnected SecurityException", ExceptionUtils.c(e2));
                name = "";
            }
            if (bluetoothDevice == null || TextUtils.isEmpty(name)) {
                break;
            }
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "strDeviceName :", name);
            for (String str : list) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "after toUpperCase mNameFilter[] = " + str.toUpperCase(Locale.ENGLISH));
                if (!DeviceTypes.WATCH.equals(str) && !"BAND".equals(str) && !TextUtils.isEmpty(str) && name.toUpperCase(Locale.ENGLISH).contains(str.toUpperCase(Locale.ENGLISH))) {
                    z = true;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    public boolean d(BluetoothDevice bluetoothDevice) {
        boolean zE;
        boolean zD = false;
        if (bluetoothDevice == null) {
            return false;
        }
        try {
            BluetoothHeadset bluetoothHeadset = this.q;
            if (bluetoothHeadset != null) {
                zE = lnc.e(bluetoothHeadset, bluetoothDevice, 100);
                zD = lnc.d(this.q, bluetoothDevice);
            } else {
                zE = false;
            }
            return zD & zE;
        } catch (IllegalAccessException e2) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "connectHFPProfile with exception:", ExceptionUtils.c(e2));
            return false;
        } catch (IllegalArgumentException e3) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "connectHFPProfile with exception:", ExceptionUtils.c(e3));
            return false;
        } catch (NoSuchMethodException e4) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "connectHFPProfile with exception:", ExceptionUtils.c(e4));
            return false;
        } catch (SecurityException e5) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "connectHFPProfile with exception:", ExceptionUtils.c(e5));
            return false;
        } catch (InvocationTargetException e6) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "connectHFPProfile with exception:", ExceptionUtils.c(e6));
            return false;
        }
    }

    private int j(BluetoothDevice bluetoothDevice) {
        ParcelUuid[] uuids;
        int i;
        if (bluetoothDevice == null) {
            return -1;
        }
        try {
            uuids = bluetoothDevice.getUuids();
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "getDeviceTypeByUUID SecurityException", ExceptionUtils.c(e2));
            uuids = null;
        }
        if (uuids == null) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "uuids is null.");
            return -1;
        }
        for (ParcelUuid parcelUuid : uuids) {
            if ("82ff3820-8411-400c-b85a-55bdb32cf057".equalsIgnoreCase(parcelUuid.toString())) {
                return 1;
            }
            if ("82ff3820-8411-400c-b85a-55bdb32cf059".equalsIgnoreCase(parcelUuid.toString())) {
                i = 4;
            } else if ("82ff3820-8411-400c-b85a-55bdb32cf060".equalsIgnoreCase(parcelUuid.toString())) {
                i = 7;
            } else {
                LogUtil.b("BTDeviceMgrUtil", "ParcelUuid else");
            }
            return i;
        }
        return -1;
    }

    public int c(String str) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getDeviceTypeByName with name :", str);
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (!TextUtils.isEmpty(upperCase)) {
            if (upperCase.startsWith("HUAWEI B2")) {
                return 1;
            }
            if (g(upperCase)) {
                return 5;
            }
            if (upperCase.equalsIgnoreCase("HUAWEI WATCH")) {
                return 3;
            }
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Do not match product name, may be they are new type device.");
        }
        return -1;
    }

    public boolean b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("BTDeviceMgrUtil", "isSupportHfp deviceInfo is null.");
            return true;
        }
        String manufacture = deviceInfo.getManufacture();
        if (TextUtils.isEmpty(manufacture)) {
            LogUtil.e("BTDeviceMgrUtil", "isSupportHfp manufactureInfo is empty.");
            return true;
        }
        if (!manufacture.contains("010303")) {
            return true;
        }
        LogUtil.b("BTDeviceMgrUtil", "isSupportHfp is false.");
        return false;
    }

    private boolean g(String str) {
        return (str.startsWith("HONOR ZERO") || str.startsWith("HONOR BAND Z1")) || (str.startsWith("HUAWEI B0") || str.startsWith("HUAWEI BAND-"));
    }

    public int c(BluetoothDevice bluetoothDevice) {
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter getDeviceType(), btDevice :", Boolean.valueOf(bluetoothDevice == null));
        if (bluetoothDevice == null) {
            return -1;
        }
        int iJ = j(bluetoothDevice);
        if (-1 == iJ) {
            LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Do not get product type by UUID.");
            try {
                iJ = c(bluetoothDevice.getName());
            } catch (SecurityException e2) {
                LogUtil.d("BTDeviceMgrUtil", "getDeviceType SecurityException", ExceptionUtils.c(e2));
            }
            if (-1 == iJ) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Do not get product type by Device Name.");
            }
        }
        return iJ;
    }

    public void e() {
        try {
            BluetoothAdapter bluetoothAdapter = this.d;
            if (bluetoothAdapter == null || !bluetoothAdapter.isDiscovering()) {
                return;
            }
            this.d.cancelDiscovery();
        } catch (SecurityException e2) {
            LogUtil.d("BTDeviceMgrUtil", "cancelBRDiscoveryForConnect SecurityException:", ExceptionUtils.c(e2));
        }
    }

    public BluetoothDevice b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getBluetoothDeviceByMac with parameter incorrect.");
            return null;
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.d;
            if (bluetoothAdapter != null) {
                return bluetoothAdapter.getRemoteDevice(str);
            }
            return null;
        } catch (IllegalArgumentException e2) {
            LogUtil.d("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "getBluetoothDeviceByMac exception:", ExceptionUtils.c(e2));
            return null;
        }
    }

    public void d(BtDeviceHfpStateCallback btDeviceHfpStateCallback) {
        if (btDeviceHfpStateCallback != null) {
            this.o = btDeviceHfpStateCallback;
        }
    }

    public void a(BtDeviceBondStateCallback btDeviceBondStateCallback) {
        if (btDeviceBondStateCallback != null) {
            this.n = btDeviceBondStateCallback;
        }
    }

    private List<BtSwitchStateCallback> l() {
        List<BtSwitchStateCallback> list;
        synchronized (this) {
            list = this.l;
        }
        return list;
    }

    public void a(BtSwitchStateCallback btSwitchStateCallback) {
        synchronized (l()) {
            if (btSwitchStateCallback != null) {
                if (!this.l.contains(btSwitchStateCallback)) {
                    this.l.add(btSwitchStateCallback);
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Register mBtSwitchStateCallbackList size = ", Integer.valueOf(this.l.size()));
                }
            }
        }
    }

    public void e(BtSwitchStateCallback btSwitchStateCallback) {
        synchronized (l()) {
            if (btSwitchStateCallback != null) {
                if (this.l.contains(btSwitchStateCallback)) {
                    this.l.remove(btSwitchStateCallback);
                    LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Unregister mBtSwitchStateCallbackList size = ", Integer.valueOf(this.l.size()));
                }
            }
        }
    }

    public int a(List<String> list) {
        int i = 1;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Enter getDeviceTypeByNameFilter().");
        if (list == null || list.size() == 0) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "parameter is incorrect.");
            return -1;
        }
        for (String str : list) {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "after toUpperCase mNameFilter[] = " + str.toUpperCase(Locale.ENGLISH));
            if (!TextUtils.isEmpty(str)) {
                String upperCase = str.toUpperCase(Locale.ENGLISH);
                if (!upperCase.equalsIgnoreCase("HUAWEI B2")) {
                    if (g(upperCase)) {
                        i = 5;
                    } else {
                        LogUtil.b("BTDeviceMgrUtil", "getDeviceTypeByNameFilter else");
                    }
                }
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Product Type :", Integer.valueOf(i));
                return i;
            }
        }
        i = -1;
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BTDeviceMgrUtil", "Product Type :", Integer.valueOf(i));
        return i;
    }

    public String e(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 4) {
            return str.substring(str.length() - 4, str.length());
        }
        return "";
    }

    private void b(BtSwitchStateCallback btSwitchStateCallback, Handler handler) {
        LogUtil.b("BTDeviceMgrUtil", "BT_GPS btSwitchEnable, callback :", Boolean.valueOf(btSwitchStateCallback == null));
        if (btSwitchStateCallback == null) {
            return;
        }
        f();
        BluetoothAdapter bluetoothAdapter = this.d;
        if (bluetoothAdapter == null) {
            LogUtil.b("BTDeviceMgrUtil", "====BT_GPS mAdapter == NULL");
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.d = defaultAdapter;
            if (defaultAdapter == null) {
                btSwitchStateCallback.onBtSwitchStateCallback(1);
                return;
            }
            if (defaultAdapter.isEnabled()) {
                LogUtil.b("BTDeviceMgrUtil", "====BT_GPS BT is open1");
                btSwitchStateCallback.onBtSwitchStateCallback(3);
                return;
            }
            LogUtil.b("BTDeviceMgrUtil", "====BT_GPS BT is close1");
            a(btSwitchStateCallback);
            if (handler != null) {
                handler.sendEmptyMessage(9);
                return;
            } else {
                d(new OpenBluetoothSwitchCallback() { // from class: lmx
                    @Override // com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.OpenBluetoothSwitchCallback
                    public final void onDone(boolean z) {
                        LogUtil.b("BTDeviceMgrUtil", "====BT_GPS BT isEnable1 = ", Boolean.valueOf(z));
                    }
                });
                return;
            }
        }
        if (bluetoothAdapter.isEnabled()) {
            LogUtil.b("BTDeviceMgrUtil", "====BT_GPS BT is open2");
            btSwitchStateCallback.onBtSwitchStateCallback(3);
            return;
        }
        LogUtil.b("BTDeviceMgrUtil", "====BT_GPS BT is close2");
        a(btSwitchStateCallback);
        if (handler != null) {
            handler.sendEmptyMessage(9);
        } else {
            d(new OpenBluetoothSwitchCallback() { // from class: lmy
                @Override // com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil.OpenBluetoothSwitchCallback
                public final void onDone(boolean z) {
                    LogUtil.b("BTDeviceMgrUtil", "====BT_GPS BT isEnable2 = ", Boolean.valueOf(z));
                }
            });
        }
    }

    private void d(final OpenBluetoothSwitchCallback openBluetoothSwitchCallback) {
        ThreadPoolManager.c().execute(new Runnable() { // from class: lmr
            @Override // java.lang.Runnable
            public final void run() {
                this.f40461b.a(openBluetoothSwitchCallback);
            }
        });
    }

    public /* synthetic */ void a(OpenBluetoothSwitchCallback openBluetoothSwitchCallback) {
        openBluetoothSwitchCallback.onDone(p());
    }

    private boolean p() {
        try {
            return this.d.enable();
        } catch (SecurityException unused) {
            LogUtil.d("BTDeviceMgrUtil", "openBluetoothSwitch occur SecurityException");
            return false;
        }
    }
}
