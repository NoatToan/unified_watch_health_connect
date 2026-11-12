package defpackage;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.SystemInfo;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class cok {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static cok f1907c = null;
    private static boolean d = true;
    private static final Object e = new Object();
    private Context g;
    private volatile BluetoothHeadset i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile BluetoothA2dp f1908a = null;
    private volatile BluetoothProfile f = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothAdapter f1909b = null;
    private BluetoothProfile.ServiceListener j = new BluetoothProfile.ServiceListener() { // from class: cok.5
        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
            LogUtil.b("BrDeviceAdapterUtil", "bluetooth profile onServiceConnected: ", Integer.valueOf(i));
            if (i == 1) {
                if (bluetoothProfile == null || !(bluetoothProfile instanceof BluetoothHeadset)) {
                    return;
                }
                cok.this.i = (BluetoothHeadset) bluetoothProfile;
                return;
            }
            if (i == 2) {
                if (bluetoothProfile == null || !(bluetoothProfile instanceof BluetoothA2dp)) {
                    return;
                }
                cok.this.f1908a = (BluetoothA2dp) bluetoothProfile;
                return;
            }
            if (i != 4) {
                LogUtil.e("BrDeviceAdapterUtil", "onServiceConnected else status.");
            } else if (bluetoothProfile != null) {
                cok.this.f = bluetoothProfile;
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i) {
            if (i == 1) {
                cok.this.i = null;
                return;
            }
            if (i == 2) {
                cok.this.f1908a = null;
            } else if (i == 4) {
                cok.this.f = null;
            } else {
                LogUtil.e("BrDeviceAdapterUtil", "onServiceDisconnected else status.");
            }
        }
    };

    private cok() {
    }

    public static cok d() {
        cok cokVar;
        synchronized (e) {
            cokVar = f1907c;
            if (cokVar == null) {
                cokVar = new cok();
                f1907c = cokVar;
                cokVar.c(BaseApplication.b());
            }
        }
        return cokVar;
    }

    private void c(Context context) {
        this.g = context;
        i();
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f1909b = defaultAdapter;
            if (defaultAdapter == null) {
                LogUtil.d("BrDeviceAdapterUtil", "mAdapter is null.");
                return;
            }
            if (!defaultAdapter.getProfileProxy(context, this.j, 1)) {
                LogUtil.e("BrDeviceAdapterUtil", "Get HFP Profile handle fail.");
            }
            if (!this.f1909b.getProfileProxy(context, this.j, 2)) {
                LogUtil.e("BrDeviceAdapterUtil", "Get A2dp Profile handle fail.");
            }
            if (this.f1909b.getProfileProxy(BaseApplication.b(), this.j, 4)) {
                return;
            }
            LogUtil.e("BrDeviceAdapterUtil", "Get HID Profile handle fail.");
        } catch (SecurityException e2) {
            f1907c = null;
            LogUtil.d("BrDeviceAdapterUtil", "init with exception SecurityException: ", cpc.c(e2));
        }
    }

    public boolean c(BluetoothDevice bluetoothDevice) {
        try {
            if (this.i == null || bluetoothDevice == null) {
                LogUtil.e("BrDeviceAdapterUtil", "mHfpService or btDevice is null.");
            } else {
                int connectionState = this.i.getConnectionState(bluetoothDevice);
                LogUtil.b("BrDeviceAdapterUtil", "HFP connect state: ", Integer.valueOf(connectionState));
                if (connectionState == 2) {
                    LogUtil.b("BrDeviceAdapterUtil", "HFP connected.");
                    return true;
                }
            }
        } catch (SecurityException e2) {
            LogUtil.d("BrDeviceAdapterUtil", "isHfpConnected SecurityException: ", cpc.c(e2));
        }
        return false;
    }

    public boolean e(BluetoothDevice bluetoothDevice) {
        Throwable e2;
        boolean zE;
        if (bluetoothDevice == null) {
            LogUtil.e("BrDeviceAdapterUtil", "btDevice is null");
            return false;
        }
        try {
            if (this.i == null) {
                return false;
            }
            h(bluetoothDevice);
            zE = coj.e(this.i, bluetoothDevice);
            try {
                LogUtil.b("BrDeviceAdapterUtil", "isRetHfp ", Boolean.valueOf(zE));
                return zE;
            } catch (IllegalAccessException e3) {
                e2 = e3;
            } catch (IllegalArgumentException e4) {
                e2 = e4;
            } catch (NoSuchMethodException e5) {
                e2 = e5;
            } catch (SecurityException e6) {
                e2 = e6;
            } catch (InvocationTargetException e7) {
                e2 = e7;
            }
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e8) {
            e2 = e8;
            zE = false;
        }
        LogUtil.d("BrDeviceAdapterUtil", "connectHFPProfile with exception: ", ExceptionUtils.d(e2, false, true));
        return zE;
    }

    private void h(BluetoothDevice bluetoothDevice) {
        try {
            LogUtil.d("BrDeviceAdapterUtil", "isSetHfp: ", Boolean.valueOf(coj.b(this.i, bluetoothDevice, 100)));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            LogUtil.d("BrDeviceAdapterUtil", "connectHFPProfile with exception: ", ExceptionUtils.d(e2, false, true));
        }
    }

    public boolean a(BluetoothDevice bluetoothDevice) {
        boolean zB;
        boolean zE = false;
        if (bluetoothDevice == null) {
            LogUtil.e("BrDeviceAdapterUtil", "btDevice is null");
            return false;
        }
        try {
            if (this.i != null) {
                zB = coj.b(this.i, bluetoothDevice, 100);
                zE = coj.e(this.i, bluetoothDevice);
            } else {
                zB = false;
            }
            return zE & zB;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            LogUtil.d("BrDeviceAdapterUtil", "connectHFPProfile with exception");
            return false;
        }
    }

    public boolean b(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            LogUtil.e("BrDeviceAdapterUtil", "connectA2dpProfile is null");
            return false;
        }
        try {
            if (this.f1908a == null) {
                return false;
            }
            LogUtil.b("BrDeviceAdapterUtil", "connectA2dpProfile.");
            return coj.c(this.f1908a, bluetoothDevice);
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | SecurityException | InvocationTargetException e2) {
            LogUtil.d("BrDeviceAdapterUtil", "connectA2dpProfile with exception: ", ExceptionUtils.d(e2, false, true));
            return false;
        }
    }

    public boolean d(BluetoothDevice bluetoothDevice) {
        try {
            BluetoothA2dp bluetoothA2dp = this.f1908a;
            if (bluetoothA2dp == null || bluetoothDevice == null) {
                LogUtil.e("BrDeviceAdapterUtil", "mA2dpService or btDevice is null.");
            } else {
                int connectionState = bluetoothA2dp.getConnectionState(bluetoothDevice);
                LogUtil.b("BrDeviceAdapterUtil", "A2DP connect state: ", Integer.valueOf(connectionState));
                if (connectionState == 2) {
                    return true;
                }
            }
        } catch (SecurityException e2) {
            LogUtil.d("BrDeviceAdapterUtil", "isA2dpConnected SecurityException:", ExceptionUtils.c(e2));
        }
        return false;
    }

    public void c() {
        try {
            BluetoothAdapter bluetoothAdapter = this.f1909b;
            if (bluetoothAdapter == null || !bluetoothAdapter.isDiscovering()) {
                return;
            }
            this.f1909b.cancelDiscovery();
        } catch (SecurityException e2) {
            LogUtil.d("BrDeviceAdapterUtil", "cancelDiscovery SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void i() {
        if (this.f1909b != null) {
            ReleaseLogUtil.b("DEVMGR_BrDeviceAdapterUtil", "Would never run.");
            this.f1909b.closeProfileProxy(1, this.i);
            this.f1909b.closeProfileProxy(2, this.f1908a);
            this.f1909b = null;
            this.i = null;
            this.j = null;
        }
    }

    public boolean a() {
        if (this.f1909b == null) {
            this.f1909b = BluetoothAdapter.getDefaultAdapter();
        }
        try {
            BluetoothAdapter bluetoothAdapter = this.f1909b;
            if (bluetoothAdapter != null) {
                return bluetoothAdapter.startDiscovery();
            }
            return false;
        } catch (SecurityException unused) {
            LogUtil.d("BrDeviceAdapterUtil", "discoveryBrDevice SecurityException");
            return false;
        }
    }

    public boolean a(BroadcastReceiver broadcastReceiver) {
        try {
            if (this.g != null && e()) {
                this.g.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.DISCOVERY_STARTED"));
                this.g.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.device.action.FOUND"));
                this.g.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.adapter.action.DISCOVERY_FINISHED"));
                return true;
            }
            return false;
        } catch (SecurityException e2) {
            LogUtil.d("BrDeviceAdapterUtil", "registerDeviceReceiver SecurityException:", cpc.c(e2));
            return false;
        }
    }

    public void c(BroadcastReceiver broadcastReceiver) {
        if (this.g == null) {
            this.g = BaseApplication.b();
        }
        Context context = this.g;
        if (context == null || broadcastReceiver == null) {
            return;
        }
        context.unregisterReceiver(broadcastReceiver);
    }

    public boolean e() {
        coi coiVarB = coi.b();
        if (coiVarB != null) {
            return coiVarB.c();
        }
        return false;
    }

    private void h() {
        boolean z = this.i == null || this.f == null;
        LogUtil.b("BrDeviceAdapterUtil", "initHfpAndHid isNeedInit： ", Boolean.valueOf(z));
        if (z) {
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused) {
                LogUtil.d("BrDeviceAdapterUtil", "Occur exception when thread sleeping");
            }
        }
    }

    public Set<String> b() {
        h();
        Set<String> setB = b(this.i);
        Set<String> setB2 = b(this.f);
        LogUtil.b("BrDeviceAdapterUtil", "HFP connectedDevices size: ", Integer.valueOf(setB.size()), "HID connectedDevices size: ", Integer.valueOf(setB2.size()));
        setB.addAll(setB2);
        return setB;
    }

    private Set<String> b(BluetoothProfile bluetoothProfile) {
        HashSet hashSet = new HashSet();
        if (bluetoothProfile != null) {
            try {
                List<BluetoothDevice> connectedDevices = bluetoothProfile.getConnectedDevices();
                if (coq.d(connectedDevices)) {
                    LogUtil.e("BrDeviceAdapterUtil", "getMacs connectedDevices is null or isEmpty");
                    return hashSet;
                }
                Iterator<BluetoothDevice> it = connectedDevices.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().getAddress());
                }
            } catch (SecurityException e2) {
                LogUtil.d("BrDeviceAdapterUtil", "getConnectedDevices SecurityException,", ExceptionUtils.c(e2));
                if (d) {
                    d = false;
                    StringBuilder sb = new StringBuilder("");
                    SystemInfo.d(sb);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(16);
                    linkedHashMap.put("monitorType", String.valueOf(100072));
                    linkedHashMap.put("SystemInfo", sb.toString());
                    lng.e("80020005", (LinkedHashMap<String, String>) linkedHashMap);
                }
            }
        }
        return hashSet;
    }
}
