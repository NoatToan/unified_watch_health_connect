package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class lmz {
    private BluetoothManager g;
    private String h;
    private long r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f40471b = new Object();
    private static final Object e = new Object();
    private static final Object d = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Semaphore f40472c = new Semaphore(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static lmz f40470a = null;
    private ExtendHandler l = null;
    private e k = new e(this);
    private BluetoothAdapter i = null;
    private lms f = null;
    private lnf m = null;
    private BtDeviceDiscoverCallback j = null;
    private d t = null;
    private ConcurrentHashMap<String, Boolean> n = new ConcurrentHashMap<>();
    private BtDeviceDiscoverCallback o = new BtDeviceDiscoverCallback() { // from class: lmz.1
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
                synchronized (lmz.e) {
                    if (lmz.this.j != null) {
                        lmz.this.j.onDeviceDiscovered(bluetoothDeviceNode, i, bArr);
                    }
                }
            }
        }
    };

    private lmz() {
        this.g = null;
        Object systemService = BaseApplication.b().getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            this.g = (BluetoothManager) systemService;
        } else {
            LogUtil.e("BluetoothDeviceReconnectScanUtil", "bluetoothManager is not BluetoothManager");
        }
        h();
    }

    public static lmz b() {
        lmz lmzVar;
        synchronized (f40471b) {
            if (f40470a == null) {
                f40470a = new lmz();
            }
            lmzVar = f40470a;
        }
        return lmzVar;
    }

    public void c(final String str, final BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        try {
            f40472c.acquire();
        } catch (InterruptedException unused) {
            LogUtil.d("BluetoothDeviceReconnectScanUtil", "startReconnectScanDiscovery InterruptedException");
        }
        LogUtil.b("BluetoothDeviceReconnectScanUtil", "Enter startReconnectScanDiscovery callback is null:", Boolean.valueOf(btDeviceDiscoverCallback == null));
        if (btDeviceDiscoverCallback == null) {
            f40472c.release();
            return;
        }
        if (!BTDeviceMgrUtil.a()) {
            LogUtil.e("BluetoothDeviceReconnectScanUtil", "startDiscoverBleDevice sdk version is not support.");
            f40472c.release();
            return;
        }
        h();
        this.l.postTask(new Runnable() { // from class: lmz.3
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.b("BluetoothDeviceReconnectScanUtil", "startReconnectScanDiscovery identify: ", BTDeviceMgrUtil.c().e(str));
                lmz.this.d(str, btDeviceDiscoverCallback);
            }
        });
        try {
            Boolean bool = true;
            this.n.put(str, true);
            int i = 0;
            while (i < 15 && bool.booleanValue()) {
                LogUtil.c("BluetoothDeviceReconnectScanUtil", "startReconnectScanDiscovery tryAcquire isAcquired:", Boolean.valueOf(f40472c.tryAcquire(1000L, TimeUnit.MILLISECONDS)));
                i++;
                bool = this.n.get(str);
                if (bool == null) {
                    bool = true;
                }
            }
        } catch (InterruptedException unused2) {
            LogUtil.d("BluetoothDeviceReconnectScanUtil", "startReconnectScanDiscovery InterruptedException");
        }
        f40472c.release();
        LogUtil.b("BluetoothDeviceReconnectScanUtil", "Enter startReconnectScanDiscovery end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        BluetoothAdapter bluetoothAdapter;
        boolean zF = f();
        LogUtil.b("BluetoothDeviceReconnectScanUtil", "Enter discoverBleDevice isSupportScan:", Boolean.valueOf(zF));
        if (zF) {
            a();
            synchronized (e) {
                this.j = btDeviceDiscoverCallback;
            }
            try {
                e();
                this.m = new lnf(this.o);
                boolean zC = false;
                for (int i = 0; i < 3 && (bluetoothAdapter = this.i) != null && bluetoothAdapter.isEnabled() && this.i.getState() == 12; i++) {
                    try {
                        zC = c(str);
                    } catch (IllegalStateException unused) {
                        LogUtil.d("BluetoothDeviceReconnectScanUtil", "discoverBleDevice IllegalStateException version :", Integer.valueOf(Build.VERSION.SDK_INT));
                    } catch (NullPointerException unused2) {
                        LogUtil.d("BluetoothDeviceReconnectScanUtil", "discoverBleDevice exception version :", Integer.valueOf(Build.VERSION.SDK_INT));
                    }
                    if (zC) {
                        break;
                    }
                }
                e(zC, str);
            } catch (IllegalThreadStateException | SecurityException e2) {
                LogUtil.d("BluetoothDeviceReconnectScanUtil", "discoverBleDevice Exception:", ExceptionUtils.c(e2));
            }
        }
    }

    private void e(boolean z, String str) {
        if (!z) {
            this.f = null;
            return;
        }
        h();
        d dVar = new d();
        this.t = dVar;
        this.l.postTask(dVar, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.l.sendEmptyMessage(messageObtain.what, 1000L);
        this.h = str;
    }

    private boolean f() {
        if (this.i != null) {
            return true;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.i = defaultAdapter;
        if (defaultAdapter != null) {
            return true;
        }
        LogUtil.e("BluetoothDeviceReconnectScanUtil", "isSupportScanCondition mAdapter is null.");
        return false;
    }

    private boolean c(String str) {
        int i;
        BluetoothLeScanner bluetoothLeScanner = this.i.getBluetoothLeScanner();
        ArrayList arrayList = new ArrayList(1);
        ScanFilter.Builder builder = new ScanFilter.Builder();
        builder.setDeviceAddress(str);
        arrayList.add(builder.build());
        if (bluetoothLeScanner != null) {
            ReleaseLogUtil.c("BTSDK_BluetoothDeviceReconnectScanUtil", "startBleScan isEmui110: ", Boolean.valueOf(cop.d()));
            this.r = System.currentTimeMillis();
            try {
                i = cpz.a("02:00:00", "05:00:00") ? 0 : 2;
                try {
                    LogUtil.b("BluetoothDeviceReconnectScanUtil", "scanMode: ", Integer.valueOf(i));
                } catch (ParseException unused) {
                    LogUtil.d("BluetoothDeviceReconnectScanUtil", "Time ParseException occur.");
                }
            } catch (ParseException unused2) {
                i = 2;
            }
            if (cop.d()) {
                i = 0;
            }
            try {
                LogUtil.b("BluetoothDeviceReconnectScanUtil", "final scanMode: ", Integer.valueOf(i));
                bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(i).build(), this.m);
            } catch (SecurityException e2) {
                LogUtil.d("BluetoothDeviceReconnectScanUtil", "startBleScan SecurityException:", cpc.c(e2));
            }
        }
        return true;
    }

    public void e(String str) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        LogUtil.b("BluetoothDeviceReconnectScanUtil", "Enter cancelBleDeviceDiscovery(), mCurrentDevice:", BTDeviceMgrUtil.c().e(this.h), ",identify:", BTDeviceMgrUtil.c().e(str), "mScanDeviceMap:", Boolean.valueOf(this.n == null));
        String str2 = this.h;
        if (TextUtils.isEmpty(str2) || !str2.equals(str) || (concurrentHashMap = this.n) == null) {
            return;
        }
        concurrentHashMap.put(str, false);
        LogUtil.b("BluetoothDeviceReconnectScanUtil", "cancelBleDeviceDiscovery remove");
        if (this.t != null) {
            c(1);
        }
    }

    class d extends Thread {
        d() {
            super.setName("StopBleDiscoveryThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "Start to stop ble discover for time arrive.");
            lmz.this.c(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        this.t = null;
        if (this.f == null) {
            this.f = new lms(this.o);
        }
        if (this.i == null) {
            this.i = BluetoothAdapter.getDefaultAdapter();
        }
        LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "Start to stopLeScan.");
        if (this.i.isEnabled()) {
            try {
                g();
            } catch (Exception unused) {
                LogUtil.d("BluetoothDeviceReconnectScanUtil", "unknown Exception");
            }
        }
        synchronized (e) {
            if (this.j != null) {
                LogUtil.b(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "handleBleDeviceDiscover handleBleScanType: ", Integer.valueOf(i));
                if (i == 1) {
                    this.j.onDeviceDiscoveryCanceled();
                } else if (i == 2) {
                    this.j.onDeviceDiscoveryFinished();
                } else {
                    LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "Ble scan handle type is incorrect.");
                }
                this.j = null;
            }
        }
    }

    private void g() {
        ReleaseLogUtil.c("BTSDK_BluetoothDeviceReconnectScanUtil", "stopBleScan mScanCallback:", Boolean.valueOf(this.m != null));
        BluetoothLeScanner bluetoothLeScanner = this.i.getBluetoothLeScanner();
        if (bluetoothLeScanner != null) {
            bluetoothLeScanner.stopScan(this.m);
        }
        ExtendHandler extendHandler = this.l;
        if (extendHandler != null) {
            extendHandler.removeTasksAndMessages();
        }
        lnf lnfVar = this.m;
        if (lnfVar != null) {
            lnfVar.d();
        }
        this.h = null;
    }

    private void a() {
        if (this.i == null) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            this.i = defaultAdapter;
            if (defaultAdapter == null) {
                LogUtil.e(HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "mAdapter is null.");
                return;
            }
        }
        if (this.t != null) {
            c(2);
        }
    }

    private void h() {
        synchronized (d) {
            this.l = HandlerCenter.b(this.k, "BluetoothDeviceReconnectScanUtil");
        }
    }

    private void e() {
        ArrayList<BluetoothDeviceNode> arrayListD = d();
        synchronized (e) {
            for (BluetoothDeviceNode bluetoothDeviceNode : arrayListD) {
                if (bluetoothDeviceNode != null && this.j != null) {
                    if (bluetoothDeviceNode.getBtDevice() != null) {
                        LogUtil.c("BluetoothDeviceReconnectScanUtil", "connected device:", bluetoothDeviceNode.getBtDevice().getName());
                    }
                    this.j.onDeviceDiscovered(bluetoothDeviceNode, 0, null);
                }
            }
        }
    }

    private ArrayList d() {
        ArrayList<BluetoothDeviceNode> arrayList = new ArrayList<>(16);
        BluetoothManager bluetoothManager = this.g;
        if (bluetoothManager != null) {
            for (BluetoothDevice bluetoothDevice : bluetoothManager.getConnectedDevices(7)) {
                BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
                bluetoothDeviceNode.setBtDevice(bluetoothDevice);
                arrayList.add(bluetoothDeviceNode);
            }
        }
        c(arrayList);
        return arrayList;
    }

    private void c(ArrayList<BluetoothDeviceNode> arrayList) {
        Set<BluetoothDevice> bondedDevices;
        boolean zBooleanValue;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            try {
                Method declaredMethod = BluetoothAdapter.class.getDeclaredMethod("getConnectionState", new Class[0]);
                declaredMethod.setAccessible(true);
                try {
                    bondedDevices = defaultAdapter.getBondedDevices();
                } catch (SecurityException e2) {
                    LogUtil.d("BluetoothDeviceReconnectScanUtil", "getDeviceList SecurityException", cpc.c(e2));
                    bondedDevices = null;
                }
                if (bondedDevices == null) {
                    LogUtil.e("BluetoothDeviceReconnectScanUtil", "getConnectedDeviceList() devices is null.");
                    return;
                }
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    Method declaredMethod2 = BluetoothDevice.class.getDeclaredMethod("isConnected", new Class[0]);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod2.invoke(bluetoothDevice, new Object[0]);
                    if (objInvoke instanceof Boolean) {
                        zBooleanValue = ((Boolean) objInvoke).booleanValue();
                    } else {
                        LogUtil.e("BluetoothDeviceReconnectScanUtil", "connectState is not Boolean");
                        zBooleanValue = false;
                    }
                    LogUtil.c("BluetoothDeviceReconnectScanUtil", "getConnectDevice:", bluetoothDevice.getName(), ";connect status:", Boolean.valueOf(zBooleanValue));
                    if (zBooleanValue) {
                        BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
                        bluetoothDeviceNode.setBtDevice(bluetoothDevice);
                        arrayList.add(bluetoothDeviceNode);
                    }
                }
            } catch (SecurityException unused) {
                LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "btDevicePair with exception SecurityException");
            }
        } catch (IllegalAccessException unused2) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "btDevicePair with exception IllegalAccessException");
        } catch (IllegalArgumentException unused3) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "btDevicePair with exception IllegalArgumentException");
        } catch (NoSuchMethodException unused4) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "btDevicePair with exception NoSuchMethodException");
        } catch (InvocationTargetException unused5) {
            LogUtil.d("0xA0200001", HiAnalyticsConstant.KeyAndValue.NUMBER_01, 1, "BluetoothDeviceReconnectScanUtil", "btDevicePair with exception InvocationTargetException");
        }
    }

    static class e implements Handler.Callback {
        private WeakReference<lmz> d;

        e(lmz lmzVar) {
            this.d = new WeakReference<>(lmzVar);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message == null) {
                return false;
            }
            if (message.what == 1) {
                WeakReference<lmz> weakReference = this.d;
                if (weakReference == null) {
                    return false;
                }
                lmz lmzVar = weakReference.get();
                if (lmzVar != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - lmzVar.r;
                    if (jCurrentTimeMillis > C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) {
                        LogUtil.b("BluetoothDeviceReconnectScanUtil", "ScanHandler handleMessage offset:", Long.valueOf(jCurrentTimeMillis));
                        lmzVar.c(2);
                        return true;
                    }
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    if (lmzVar.l != null) {
                        lmzVar.l.sendEmptyMessage(messageObtain.what, 1000L);
                    }
                    return true;
                }
                LogUtil.e("BluetoothDeviceReconnectScanUtil", "handleMessage scanUtil is null");
                return false;
            }
            LogUtil.e("BluetoothDeviceReconnectScanUtil", "handleMessage default");
            return false;
        }
    }
}
