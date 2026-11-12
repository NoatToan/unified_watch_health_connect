package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public class lnd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static lnd f40482b;
    private static final Object d = new Object();
    private static final Object e = new Object();
    private Context j;
    private HandlerThread g = new HandlerThread("BluetoothDeviceAutoScanUtil");
    private Handler h = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothAdapter f40484c = null;
    private lms i = null;
    private lnf f = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BtDeviceDiscoverCallback f40483a = null;

    private static int b(int i) {
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

    private lnd(Context context) {
        this.j = null;
        this.j = context;
        f();
    }

    public static lnd e(Context context) {
        lnd lndVar;
        synchronized (d) {
            if (f40482b == null) {
                f40482b = new lnd(context);
            }
            lndVar = f40482b;
        }
        return lndVar;
    }

    public void b(final BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        LogUtil.b("BluetoothDeviceAutoScanUtil", "Enter startAutoScanDiscovery.");
        if (btDeviceDiscoverCallback == null) {
            LogUtil.e("BluetoothDeviceAutoScanUtil", "startAutoScanDiscovery callback is null.");
            return;
        }
        f();
        try {
            this.h.post(new Runnable() { // from class: lnd.4
                @Override // java.lang.Runnable
                public void run() {
                    lnd.this.d(btDeviceDiscoverCallback);
                }
            });
        } catch (IllegalStateException unused) {
            LogUtil.d("BluetoothDeviceAutoScanUtil", "startAutoScanDiscovery IllegalStateException");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        if (c()) {
            c(btDeviceDiscoverCallback);
        } else {
            LogUtil.e("BluetoothDeviceAutoScanUtil", "startDiscoverBleDevice sdk version is not support.");
        }
    }

    private boolean c() {
        Context context = this.j;
        return context != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    private void c(BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        BluetoothAdapter bluetoothAdapter;
        LogUtil.b("BluetoothDeviceAutoScanUtil", "Enter discoverBleDevice.");
        if (!i()) {
            LogUtil.e("BluetoothDeviceAutoScanUtil", "discoverBleDevice is not support.");
            return;
        }
        b();
        synchronized (e) {
            this.f40483a = btDeviceDiscoverCallback;
        }
        try {
            this.f = new lnf(this.f40483a);
            boolean zG = false;
            for (int i = 0; i < 3 && (bluetoothAdapter = this.f40484c) != null && bluetoothAdapter.isEnabled() && this.f40484c.getState() == 12; i++) {
                try {
                    zG = g();
                } catch (IllegalStateException unused) {
                    LogUtil.b("BluetoothDeviceAutoScanUtil", "discoverBleDevice IllegalStateException version :", Integer.valueOf(Build.VERSION.SDK_INT));
                } catch (NullPointerException unused2) {
                    LogUtil.b("BluetoothDeviceAutoScanUtil", "discoverBleDevice exception version :", Integer.valueOf(Build.VERSION.SDK_INT));
                }
                if (zG) {
                    break;
                }
            }
            if (zG) {
                return;
            }
            this.i = null;
        } catch (IllegalThreadStateException unused3) {
            LogUtil.d("BluetoothDeviceAutoScanUtil", "discoverBleDevice IllegalThreadStateException.");
        }
    }

    private boolean i() {
        if (this.f40484c == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f40484c = defaultAdapter;
            if (defaultAdapter == null) {
                LogUtil.e("BluetoothDeviceAutoScanUtil", "isSupportScanCondition mAdapter is null.");
                return false;
            }
        }
        e();
        return true;
    }

    private boolean g() {
        BluetoothLeScanner bluetoothLeScanner = this.f40484c.getBluetoothLeScanner();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new ScanFilter.Builder().build());
        if (bluetoothLeScanner != null) {
            ReleaseLogUtil.c("BTSDK_BluetoothDeviceAutoScanUtil", "startBleScan");
            try {
                bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(2).build(), this.f);
            } catch (SecurityException unused) {
                LogUtil.d("BluetoothDeviceAutoScanUtil", "startBleScan SecurityException");
            }
        }
        return true;
    }

    public void a() {
        LogUtil.b("BluetoothDeviceAutoScanUtil", "Enter cancelBleDeviceDiscovery().");
        if (c()) {
            e(1);
        }
        LogUtil.b("BluetoothDeviceAutoScanUtil", "Leave cancelBleDeviceDiscovery().");
    }

    public void e(int i) {
        if (this.i == null) {
            this.i = new lms(this.f40483a);
        }
        if (this.f40484c == null) {
            this.f40484c = BluetoothAdapter.getDefaultAdapter();
        }
        LogUtil.b("BluetoothDeviceAutoScanUtil", "handleBleDeviceDiscover stop ble device scan.");
        if (this.f40484c.isEnabled()) {
            try {
                j();
            } catch (Exception unused) {
                LogUtil.d("BluetoothDeviceAutoScanUtil", "handleBleDeviceDiscover Exception.");
            }
        }
        synchronized (e) {
            if (this.f40483a != null) {
                if (i == 1) {
                    LogUtil.b("BluetoothDeviceAutoScanUtil", "handleBleDeviceDiscover report ble discover cancel.");
                    this.f40483a.onDeviceDiscoveryCanceled();
                } else if (i == 2) {
                    LogUtil.b("BluetoothDeviceAutoScanUtil", "handleBleDeviceDiscover report ble discover finish.");
                    this.f40483a.onDeviceDiscoveryFinished();
                } else {
                    LogUtil.e("BluetoothDeviceAutoScanUtil", "handleBleDeviceDiscover ble scan handle type is incorrect.");
                }
                HandlerThread handlerThread = this.g;
                if (handlerThread != null && handlerThread.getLooper() != null) {
                    this.g.getLooper().quit();
                    this.g = null;
                    this.h = null;
                }
                this.f40483a = null;
            }
        }
    }

    private void j() {
        ReleaseLogUtil.c("BTSDK_BluetoothDeviceAutoScanUtil", "stopBleScan mScanCallback:", Boolean.valueOf(this.f != null));
        BluetoothLeScanner bluetoothLeScanner = this.f40484c.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.f);
        }
        lnf lnfVar = this.f;
        if (lnfVar != null) {
            lnfVar.d();
        }
    }

    public int d() {
        BluetoothAdapter bluetoothAdapter = this.f40484c;
        if (bluetoothAdapter == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f40484c = defaultAdapter;
            if (defaultAdapter == null) {
                return 1;
            }
            return b(defaultAdapter.getState());
        }
        return b(bluetoothAdapter.getState());
    }

    private void b() {
        if (this.f40484c == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.f40484c = defaultAdapter;
            if (defaultAdapter == null) {
                LogUtil.e("BluetoothDeviceAutoScanUtil", "mAdapter is null.");
                return;
            }
        }
        e();
        if (this.f != null) {
            e(2);
        } else {
            LogUtil.e("BluetoothDeviceAutoScanUtil", "cancelScanIfExist default");
        }
    }

    private void e() {
        try {
            if (this.f40484c.isDiscovering()) {
                this.f40484c.cancelDiscovery();
            }
        } catch (SecurityException e2) {
            LogUtil.d("BluetoothDeviceAutoScanUtil", "cancelDiscoveryScan SecurityException:", ExceptionUtils.c(e2));
        }
    }

    private void f() {
        HandlerThread handlerThread = this.g;
        if (handlerThread == null || !handlerThread.isAlive()) {
            HandlerThread handlerThread2 = new HandlerThread("BluetoothDeviceAutoScanUtil");
            this.g = handlerThread2;
            handlerThread2.start();
            this.h = new Handler(this.g.getLooper());
        }
    }
}
