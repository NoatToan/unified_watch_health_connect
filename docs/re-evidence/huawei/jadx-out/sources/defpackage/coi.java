package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BadParcelableException;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.devicesdk.callback.BtDeviceHfpStateCallback;
import com.huawei.devicesdk.callback.BtDevicePairCallback;
import com.huawei.devicesdk.callback.BtSwitchCallback;
import com.huawei.devicesdk.entity.ConnectMode;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class coi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static coi f1900b;
    private static final Object e = new Object();
    private Context i;
    private boolean n = false;
    private BluetoothAdapter d = null;
    private ExtendHandler k = null;
    private d o = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BtDeviceHfpStateCallback f1901a = null;
    private Map<String, BtDevicePairCallback> j = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Vector<String> f1902c = new Vector<>(16);
    private final List<BtSwitchCallback> h = new ArrayList(10);
    private Map<String, Boolean> l = new ConcurrentHashMap(16);
    private DeviceInfo s = null;
    private Map<String, Boolean> q = new ConcurrentHashMap(16);
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: coi.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.e("BtCommonAdapterUtil", "mBtSwitchStateReceiver context and intent is null.");
                return;
            }
            if (!"android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction()) || coi.this.d == null) {
                return;
            }
            int state = coi.this.d.getState();
            LogUtil.b("BtCommonAdapterUtil", "btSwitchState:", Integer.valueOf(state));
            cqp.a(100053, String.valueOf(state), "", "");
            switch (state) {
                case 10:
                case 11:
                case 12:
                case 13:
                    synchronized (coi.this.h) {
                        Iterator it = coi.this.h.iterator();
                        while (it.hasNext()) {
                            ((BtSwitchCallback) it.next()).onBtSwitchStateCallback(coi.c(state));
                        }
                        break;
                    }
                    return;
                default:
                    LogUtil.e("BtCommonAdapterUtil", "default branch");
                    return;
            }
        }
    };
    private BroadcastReceiver f = new BroadcastReceiver() { // from class: coi.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.e("BtCommonAdapterUtil", "context and intent is null.");
                return;
            }
            try {
                if (!"android.bluetooth.device.action.BOND_STATE_CHANGED".equals(intent.getAction())) {
                    LogUtil.e("BtCommonAdapterUtil", "this is not bond state change action, and return");
                    return;
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (coi.this.c(bluetoothDevice)) {
                    return;
                }
                String address = bluetoothDevice.getAddress();
                int bondState = bluetoothDevice.getBondState();
                ReleaseLogUtil.c("DEVMGR_BtCommonAdapterUtil", "ReceiverMac: ", cpl.a(address), " bondState: ", Integer.valueOf(bondState));
                cqp.a(100028, cqc.a((Object) bluetoothDevice.getName()), cqc.a(Integer.valueOf(bondState)), "");
                if (bondState == 10) {
                    coi.this.e(bluetoothDevice, 1);
                    return;
                }
                coi.this.e(bluetoothDevice, 2);
                BtDevicePairCallback btDevicePairCallback = (BtDevicePairCallback) coi.this.j.get(address);
                if (btDevicePairCallback == null) {
                    LogUtil.d("BtCommonAdapterUtil", "get pairCallback is null.");
                    return;
                }
                if (bondState == 12) {
                    btDevicePairCallback.onDevicePaired(bluetoothDevice);
                    coi.this.j(address);
                } else if (bondState != 11) {
                    LogUtil.e("BtCommonAdapterUtil", "unKnown bond state: ", Integer.valueOf(bondState));
                } else {
                    btDevicePairCallback.onDevicePairing(bluetoothDevice);
                }
            } catch (BadParcelableException | SecurityException e2) {
                LogUtil.d("BtCommonAdapterUtil", "mBtDeviceReceiver onReceive BadParcelableException", ExceptionUtils.c(e2));
            }
        }
    };
    private BroadcastReceiver m = new BroadcastReceiver() { // from class: coi.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || context == null) {
                LogUtil.e("BtCommonAdapterUtil", "context or intent is null");
                return;
            }
            String action = intent.getAction();
            ReleaseLogUtil.c("DEVMGR_BtCommonAdapterUtil", "EMUI mHfpStateReceiver action: ", action, ", mBtDeviceHfpStateCallback: ", Boolean.valueOf(coi.this.f1901a == null));
            try {
                if ("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED".equals(action) || "android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED".equals(action)) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice == null) {
                        LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtCommonAdapterUtil", "btDevice is null so return.");
                        return;
                    }
                    DeviceInfo deviceInfoJ = cnk.c().j(bluetoothDevice.getAddress());
                    if (deviceInfoJ != null) {
                        coi.this.a(deviceInfoJ.getDeviceMac(), false);
                    }
                    int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                    if ("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED".equals(action) && deviceInfoJ != null && intExtra == 2) {
                        ReleaseLogUtil.c("DEVMGR_BtCommonAdapterUtil", "hid action occur");
                        coi.this.a(deviceInfoJ.getDeviceMac(), true);
                    }
                    boolean z = coi.this.s != null && bluetoothDevice.getAddress().equals(coi.this.s.getDeviceMac());
                    if (deviceInfoJ != null || intExtra != 2 || !z) {
                        if (coi.this.f1901a != null && intExtra == 2) {
                            ReleaseLogUtil.c("DEVMGR_BtCommonAdapterUtil", "HFP device connected.");
                            cqp.a(100031, cqc.a((Object) bluetoothDevice.getName()), "", cqc.a(Integer.valueOf(intExtra)));
                            coi.this.f1901a.onBtDeviceHfpConnected(bluetoothDevice, action);
                        }
                    } else {
                        LogUtil.b("BtCommonAdapterUtil", "reset factory device HFP connected, try to connect again");
                        cju.d().connectDevice(coi.this.s, false, ConnectMode.GENERAL);
                        coi.this.b(bluetoothDevice.getAddress());
                        return;
                    }
                }
                coi.this.e(intent, action);
            } catch (SecurityException e2) {
                LogUtil.d("BtCommonAdapterUtil", "isDeviceInBonded SecurityException", ExceptionUtils.c(e2));
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i) {
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

    class d implements Handler.Callback {
        private d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                LogUtil.e("BtCommonAdapterUtil", "handleMessage, message is null");
                return false;
            }
            LogUtil.b("BtCommonAdapterUtil", "receive message:", Integer.valueOf(message.what));
            if (message.what != 1 || !(message.obj instanceof BluetoothDevice)) {
                return false;
            }
            coi.this.a((BluetoothDevice) message.obj);
            return true;
        }
    }

    public void e(DeviceInfo deviceInfo) {
        LogUtil.b("BtCommonAdapterUtil", "addResetFactoryDeviceInfo");
        this.s = deviceInfo;
    }

    public void b(String str) {
        if (this.s == null) {
            return;
        }
        if (!TextUtils.isEmpty(str) && str.equals(this.s.getDeviceMac())) {
            LogUtil.b("BtCommonAdapterUtil", "removeResetFactoryDeviceInfo address: ", cpl.a(str));
            this.s = null;
        } else {
            LogUtil.e("BtCommonAdapterUtil", "removeResetFactoryDeviceInfo should not remove device");
        }
    }

    private coi() {
        d(BaseApplication.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Intent intent, String str) {
        if ("android.bluetooth.device.action.ACL_CONNECTED".equals(str)) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            if (bluetoothDevice == null) {
                LogUtil.e("0xA0200006", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtCommonAdapterUtil", "btDevice is null so return.");
                return;
            }
            cqp.a(100029, cqc.a((Object) bluetoothDevice.getName()), "", "");
            BtDeviceHfpStateCallback btDeviceHfpStateCallback = this.f1901a;
            if (btDeviceHfpStateCallback != null) {
                btDeviceHfpStateCallback.onBtDeviceHfpConnected(bluetoothDevice, str);
            }
        }
    }

    public void a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            LogUtil.b("BtCommonAdapterUtil", "setIsHidStatus address: ", cpl.a(str), " , isHidStatus: ", Boolean.valueOf(z));
            this.l.put(str, Boolean.valueOf(z));
        } else {
            LogUtil.e("BtCommonAdapterUtil", "address is null");
        }
    }

    public void e(String str) {
        this.q.put(str, true);
    }

    public boolean d(String str) {
        if (!this.l.containsKey(str)) {
            LogUtil.e("BtCommonAdapterUtil", "mIsHidStatus is not contains this address.");
            a(str, false);
            return false;
        }
        return this.l.get(str).booleanValue();
    }

    private List<BtSwitchCallback> g() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothDevice bluetoothDevice, int i) {
        if (c(bluetoothDevice)) {
            return;
        }
        String address = bluetoothDevice.getAddress();
        if (i != 1) {
            if (i == 2) {
                this.f1902c.remove(address);
                return;
            } else {
                LogUtil.e("BtCommonAdapterUtil", "unKnown bondType.");
                return;
            }
        }
        this.f1902c.add(address);
        Message messageObtain = Message.obtain();
        messageObtain.obj = bluetoothDevice;
        messageObtain.what = 1;
        this.k.sendMessage(messageObtain, 2000L);
    }

    public Vector<String> d() {
        return this.f1902c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BluetoothDevice bluetoothDevice) {
        boolean zBooleanValue;
        if (c(bluetoothDevice)) {
            return;
        }
        String address = bluetoothDevice.getAddress();
        LogUtil.b("BtCommonAdapterUtil", "start deal bondNone device: ", cpl.a(address));
        if (!this.f1902c.contains(address)) {
            LogUtil.e("BtCommonAdapterUtil", "device again bond");
            return;
        }
        this.f1902c.remove(address);
        DeviceInfo deviceInfoJ = cnk.c().j(address);
        if (deviceInfoJ != null && deviceInfoJ.getDeviceBtType() != 2) {
            LogUtil.b("BtCommonAdapterUtil", "deleteStorageDevice getDeviceSn: ", cpl.e(deviceInfoJ.getDeviceSn()), "getDeviceMac: ", cpl.e(deviceInfoJ.getDeviceMac()), "getIdToServerType: ", Integer.valueOf(deviceInfoJ.getIdToServerType()));
            Intent intent = new Intent("com.huawei.bone.action.SYSTEM_BLUETOOTH_UNBIND_DEVICE");
            intent.putExtra("DEVICE_SECURITY_UUID", d(deviceInfoJ.getIdToServerType(), deviceInfoJ.getDeviceSn(), deviceInfoJ.getDeviceMac()));
            this.i.sendBroadcast(intent, clx.e);
            if (deviceInfoJ.getDeviceConnectState() != 1) {
                if (!TextUtils.isEmpty(deviceInfoJ.getDeviceMac()) && this.q.containsKey(deviceInfoJ.getDeviceMac())) {
                    zBooleanValue = this.q.get(deviceInfoJ.getDeviceMac()).booleanValue();
                    if (!zBooleanValue) {
                        cju.d().unPairDevice(deviceInfoJ);
                    } else {
                        this.q.remove(deviceInfoJ.getDeviceMac());
                    }
                } else {
                    cju.d().unPairDevice(deviceInfoJ);
                    zBooleanValue = false;
                }
                LogUtil.b("BtCommonAdapterUtil", "dealBondNoneMsg isNotificationHide: ", Boolean.valueOf(zBooleanValue));
            }
        }
        BtDevicePairCallback btDevicePairCallback = this.j.get(address);
        if (btDevicePairCallback == null) {
            LogUtil.e("BtCommonAdapterUtil", "get pairCallback is null.");
        } else {
            btDevicePairCallback.onDevicePairNone(bluetoothDevice);
        }
    }

    public static String d(int i, String str, String str2) {
        if (i == 1 || i == 10) {
            return i == 1 ? cph.a(str) : str;
        }
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            LogUtil.e("BtCommonAdapterUtil", "btDevice is null.");
            return true;
        }
        if (!TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            return false;
        }
        LogUtil.e("BtCommonAdapterUtil", "onReceive: deviceIdentify is null.");
        return true;
    }

    public static coi b() {
        coi coiVar;
        synchronized (e) {
            if (f1900b == null) {
                f1900b = new coi();
            }
            coiVar = f1900b;
        }
        return coiVar;
    }

    private void d(Context context) {
        this.i = context;
        this.k = HandlerCenter.b(this.o, "BtCommonAdapterUtil");
        this.d = BluetoothAdapter.getDefaultAdapter();
        f();
    }

    private void f() {
        if (this.i == null) {
            LogUtil.e("BtCommonAdapterUtil", "mContext is null, registerBtDeviceReceiver fail.");
            return;
        }
        try {
            this.i.registerReceiver(this.f, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"));
            LogUtil.b("BtCommonAdapterUtil", "mBtDeviceReceiver already registered");
        } catch (IllegalArgumentException unused) {
            LogUtil.d("BtCommonAdapterUtil", "registerBtDeviceReceiver exception: IllegalArgumentException");
        } catch (SecurityException unused2) {
            LogUtil.d("BtCommonAdapterUtil", "registerBtDeviceReceiver exception: SecurityException");
        }
    }

    public BluetoothDevice a(String str) {
        LogUtil.b("BtCommonAdapterUtil", "getBluetoothDeviceByMac");
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("BtCommonAdapterUtil", "getBluetoothDeviceByMac with parameter incorrect.");
            return null;
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.d;
            if (bluetoothAdapter != null) {
                return bluetoothAdapter.getRemoteDevice(str);
            }
            return null;
        } catch (IllegalArgumentException e2) {
            LogUtil.d("BtCommonAdapterUtil", "getBluetoothDeviceByMac exception: ", e2.getMessage());
            return null;
        }
    }

    public boolean c(BluetoothDevice bluetoothDevice, BtDevicePairCallback btDevicePairCallback) {
        LogUtil.b("BtCommonAdapterUtil", "btDevicePair");
        boolean z = false;
        if (bluetoothDevice == null) {
            return false;
        }
        if (btDevicePairCallback != null) {
            try {
                this.j.put(bluetoothDevice.getAddress(), btDevicePairCallback);
            } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
                LogUtil.d("BtCommonAdapterUtil", "btDevicePair with exception.");
                return z;
            }
        }
        f();
        boolean zC = coj.c(bluetoothDevice);
        try {
            ReleaseLogUtil.c("DEVMGR_BtCommonAdapterUtil", "btDevicePair result: ", Boolean.valueOf(zC));
            cqp.a(100025, cqc.a((Object) bluetoothDevice.getName()), cqc.a(Boolean.valueOf(zC)), "");
            return zC;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused2) {
            z = zC;
            LogUtil.d("BtCommonAdapterUtil", "btDevicePair with exception.");
            return z;
        }
    }

    public void b(BluetoothDevice bluetoothDevice) {
        LogUtil.b("BtCommonAdapterUtil", "disconnect device.");
        if (bluetoothDevice == null) {
            return;
        }
        j(bluetoothDevice.getAddress());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        LogUtil.b("BtCommonAdapterUtil", "remove pair callback.");
        if (this.j.containsKey(str)) {
            this.j.remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean e(BluetoothDevice bluetoothDevice) {
        boolean z = 0;
        z = 0;
        z = 0;
        z = 0;
        if (bluetoothDevice == null) {
            return false;
        }
        j(bluetoothDevice.getAddress());
        b(bluetoothDevice.getAddress());
        try {
            int bondState = bluetoothDevice.getBondState();
            try {
                if (bondState == 12) {
                    boolean zA = coj.a(bluetoothDevice);
                    LogUtil.b("BtCommonAdapterUtil", "btDevice.getBondState() is BOND_BONDED");
                    cqp.a(100062, cqc.a((Object) bluetoothDevice.getName()), cqc.a(Boolean.valueOf(zA)), "");
                    return zA;
                }
                if (bluetoothDevice.getBondState() == 10) {
                    LogUtil.b("BtCommonAdapterUtil", "btDevice.getBondState() is BOND_NONE");
                    return true;
                }
                boolean zB = coj.b(bluetoothDevice);
                LogUtil.e("BtCommonAdapterUtil", "btDevice.getBondState() is BOND_BONDING");
                cqp.a(100063, cqc.a((Object) bluetoothDevice.getName()), cqc.a(Boolean.valueOf(zB)), "");
                return zB;
            } catch (IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
                e = e2;
                z = bondState;
                LogUtil.d("BtCommonAdapterUtil", "btDeviceUnPair Exception: ", ExceptionUtils.c(e));
                return z;
            }
        } catch (IllegalAccessException e3) {
            e = e3;
        } catch (NoSuchMethodException e4) {
            e = e4;
        } catch (SecurityException e5) {
            e = e5;
        } catch (InvocationTargetException e6) {
            e = e6;
        }
    }

    public boolean c() {
        BluetoothAdapter bluetoothAdapter = this.d;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled() && this.d.getState() == 12;
    }

    public BluetoothAdapter a() {
        return this.d;
    }

    public void d(BtSwitchCallback btSwitchCallback) {
        if (btSwitchCallback == null || this.h.contains(btSwitchCallback)) {
            return;
        }
        synchronized (g()) {
            this.h.add(btSwitchCallback);
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BtCommonAdapterUtil", "Register mBtSwitchStateCallbackList size: ", Integer.valueOf(this.h.size()));
        }
    }

    public void a(BtDeviceHfpStateCallback btDeviceHfpStateCallback) {
        if (btDeviceHfpStateCallback != null) {
            this.f1901a = btDeviceHfpStateCallback;
        }
    }

    public void i() {
        if (this.n) {
            LogUtil.e("BtCommonAdapterUtil", "Already registered");
            return;
        }
        if (this.i == null) {
            LogUtil.e("BtCommonAdapterUtil", "mContext is null");
            this.i = BaseApplication.b();
        }
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.input.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
        intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
        try {
            this.i.registerReceiver(this.m, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.d("BtCommonAdapterUtil", "register HfpStateReceiver: IllegalArgumentException");
        } catch (SecurityException unused2) {
            LogUtil.d("BtCommonAdapterUtil", "register HfpStateReceiver: SecurityException");
        }
        try {
            this.i.registerReceiver(this.g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        } catch (IllegalArgumentException unused3) {
            LogUtil.d("BtCommonAdapterUtil", "register BtSwitchStateReceiver: IllegalArgumentException");
        } catch (SecurityException unused4) {
            LogUtil.d("BtCommonAdapterUtil", "register BtSwitchStateReceiver: SecurityException");
        }
        LogUtil.b("BtCommonAdapterUtil", "Set already registered");
        this.n = true;
    }

    public static boolean e() {
        int iIntValue;
        try {
            Integer num = (Integer) Class.forName("android.os.UserHandle").getDeclaredMethod("myUserId", new Class[0]).invoke(null, new Object[0]);
            iIntValue = num.intValue();
            try {
                LogUtil.b("BtCommonAdapterUtil", "isSubUserId myUserId: ", num);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                LogUtil.d("BtCommonAdapterUtil", "get myUserId reflect failed");
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            iIntValue = 0;
        }
        return iIntValue != 0;
    }

    public void c(String str) {
        cml cmlVarC = cnk.c().c(str);
        if (cmlVarC == null) {
            LogUtil.e("BtCommonAdapterUtil", "createBondDevice parameter is null");
            return;
        }
        int iA = cmlVarC.a();
        LogUtil.b("BtCommonAdapterUtil", "createBondDevice parameter:", Integer.valueOf(iA), ",device:", cpl.a(str));
        if (iA == 0) {
            return;
        }
        try {
            BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(str);
            if (remoteDevice == null) {
                LogUtil.e("BtCommonAdapterUtil", "pair device error. mBluetoothDevice is null.");
                return;
            }
            int bondState = remoteDevice.getBondState();
            LogUtil.b("BtCommonAdapterUtil", "smp createBondDevice bondState:", Integer.valueOf(bondState));
            if (bondState == 10) {
                boolean zC = c(remoteDevice, null);
                cqp.a(100088, cqc.a((Object) remoteDevice.getName()), cqc.a(Boolean.valueOf(zC)), "");
                LogUtil.b("BtCommonAdapterUtil", "pair device. ", cpl.a(str), " result:", Boolean.valueOf(zC));
            }
        } catch (SecurityException e2) {
            LogUtil.d("BtCommonAdapterUtil", "isDeviceInBonded SecurityException", ExceptionUtils.c(e2));
        }
    }
}
