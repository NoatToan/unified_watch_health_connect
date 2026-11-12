package com.huawei.health.manager.reconnect;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.BaseHandlerCallback;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class BleReconnectManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f8109b = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothAdapter f8110a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScanHandler f8111c;
    private BluetoothManager d;
    private ScanCallback e;
    private BleReconnectScanCallback f;
    private ExtendHandler j;

    private BleReconnectManager() {
        this.f8111c = new ScanHandler(this);
        this.e = new ScanCallback() { // from class: com.huawei.health.manager.reconnect.BleReconnectManager.1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, ScanResult scanResult) {
                super.onScanResult(i, scanResult);
                ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "high version onScanResult");
                a(scanResult);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> list) {
                super.onBatchScanResults(list);
                LogUtil.a("BleReconnectManager", "high version onBatchScanResults");
                if (list == null) {
                    return;
                }
                Iterator<ScanResult> it = list.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "onScanFailed: ", Integer.valueOf(i));
                super.onScanFailed(i);
                BleReconnectManager.this.n();
            }

            private void a(ScanResult scanResult) {
                if (scanResult == null) {
                    LogUtil.j("BleReconnectManager", "reportDiscoveryDevice error. scan result is invalid.");
                    return;
                }
                try {
                    LogUtil.a("BleReconnectManager", "high version onDeviceDiscovered ", scanResult.getDevice() != null ? scanResult.getDevice().getName() : Integer.valueOf(scanResult.getRssi()));
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    BleReconnectManager.this.e(scanResult.getDevice(), scanResult.getRssi(), scanRecord == null ? null : scanRecord.getBytes());
                } catch (SecurityException e) {
                    LogUtil.e("BleReconnectManager", "mBleScanCallback SecurityException ", ExceptionUtils.c(e));
                }
            }
        };
        Object systemService = BaseApplication.getContext().getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            this.d = (BluetoothManager) systemService;
        } else {
            LogUtil.j("BleReconnectManager", "bluetoothManager is not BluetoothManager");
        }
        this.d = (BluetoothManager) BaseApplication.getContext().getSystemService("bluetooth");
        this.f8110a = BluetoothAdapter.getDefaultAdapter();
        i();
    }

    static BleReconnectManager e() {
        return InstanceHolder.f8113c;
    }

    boolean b() {
        if (!ReconnectManager.d().c().isEmpty()) {
            LogUtil.a("BleReconnectManager", "find need to reconnect device.");
            return true;
        }
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "not found need to reconnect device.");
        return false;
    }

    void e(BleReconnectScanCallback bleReconnectScanCallback) {
        if (Build.VERSION.SDK_INT >= 33 && !PermissionUtil.b(BaseApplication.getContext(), new String[]{"android.permission.BLUETOOTH_CONNECT"})) {
            LogUtil.j("BleReconnectManager", "plugin deamon startReconnect failed, no permission");
            return;
        }
        this.f = bleReconnectScanCallback;
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "Enter startReconnect.");
        ScanTimeUtil.a();
        if (b()) {
            c();
            a();
        }
    }

    void j() {
        c();
    }

    private boolean d(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.j("BleReconnectManager", "isNeedReconnect device is null or address is null.");
            return false;
        }
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "isNeedReconnect", CommonUtil.n(bluetoothDevice.getAddress()));
        Iterator<Map.Entry<String, Map<String, String>>> it = ReconnectManager.d().c().entrySet().iterator();
        while (it.hasNext()) {
            if (bluetoothDevice.getAddress().equalsIgnoreCase(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    void a() {
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "Enter startScanDiscovery");
        if (!BaseApplication.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
            ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "startDiscoverBleDevice sdk version is not support.");
        } else {
            h();
        }
    }

    private void h() {
        boolean zM;
        f();
        try {
            zM = m();
        } catch (IllegalStateException unused) {
            ReleaseLogUtil.a("DEVMGR_BleReconnectManager", "discoverBleDevice IllegalStateException version :", Integer.valueOf(Build.VERSION.SDK_INT));
            zM = false;
        }
        LogUtil.a("BleReconnectManager", "startBleScan result: ", Boolean.valueOf(zM));
        if (!zM) {
            n();
        } else {
            b(1, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        }
    }

    private boolean m() {
        int i;
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "Enter startBleScan");
        Map<String, Map<String, String>> mapC = ReconnectManager.d().c();
        if (mapC.isEmpty()) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "BleReconnectDevices isEmpty");
            return true;
        }
        BluetoothLeScanner bluetoothLeScanner = this.f8110a.getBluetoothLeScanner();
        int i2 = 2;
        ArrayList arrayList = new ArrayList(2);
        for (String str : mapC.keySet()) {
            if (!TextUtils.isEmpty(str)) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                builder.setDeviceAddress(str);
                arrayList.add(builder.build());
            }
        }
        if (bluetoothLeScanner != null) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "startBleScan isEmui110: ", Boolean.valueOf(CommonUtil.av()));
            boolean zE = false;
            try {
                i = TimeDateFormatUtils.e("02:00:00", "05:00:00") ? 0 : 2;
                try {
                    LogUtil.a("BleReconnectManager", "scanMode: ", Integer.valueOf(i));
                } catch (ParseException unused) {
                    i2 = i;
                    LogUtil.e("BleReconnectManager", "Time ParseException occur.");
                    i = i2;
                }
            } catch (ParseException unused2) {
            }
            if (CommonUtil.av()) {
                i = 0;
            }
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "final scanMode: ", Integer.valueOf(i));
            try {
                zE = TimeDateFormatUtils.e("00:00:00", "06:00:00");
            } catch (ParseException unused3) {
                LogUtil.e("BleReconnectManager", "isValidDateSix ParseException occur.");
            }
            a(bluetoothLeScanner, arrayList, i, zE);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0047 A[Catch: SecurityException -> 0x0064, TRY_LEAVE, TryCatch #0 {SecurityException -> 0x0064, blocks: (B:4:0x0006, B:6:0x000c, B:8:0x002b, B:9:0x0047), top: B:15:0x0006, inners: #1 }] */
    private void a(BluetoothLeScanner bluetoothLeScanner, List<ScanFilter> list, int i, boolean z) {
        if (!z) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "scan device default logic.");
            bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(i).build(), this.e);
        } else {
            try {
                if (EnvironmentInfo.l()) {
                    try {
                        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "scanDevice harmony 3.0 start 1003.");
                        bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(1003).build(), this.e);
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                        ReleaseLogUtil.a("DEVMGR_BleReconnectManager", "IllegalStateException or IllegalArgumentException 3.0 start.");
                        bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(i).build(), this.e);
                    }
                } else {
                    ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "scan device default logic.");
                    bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(i).build(), this.e);
                }
            } catch (SecurityException e) {
                LogUtil.e("BleReconnectManager", "btSwitchEnable SecurityException:", ExceptionUtils.c(e));
            }
        }
    }

    void c() {
        LogUtil.a("BleReconnectManager", "Enter cancelBleReconnect");
        l();
        if (this.j == null) {
            ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "mScanHandler is null");
            i();
        }
        if (this.j == null) {
            ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "Failed to initialize mScanHandler");
        } else if (EnvironmentInfo.l()) {
            a(2);
        } else {
            this.j.removeMessages(2);
        }
        a(1);
    }

    void d() {
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "Enter nextBleReconnect");
        b(2, -1L);
    }

    private void b(int i, long j) {
        Context context = BaseApplication.getContext();
        if (j == -1) {
            j = ScanTimeUtil.e();
        }
        ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "sendPendingIntentTask type: ", Integer.valueOf(i), ", delay: ", Long.valueOf(j));
        if (i == 1) {
            Intent intent = new Intent();
            intent.putExtra("type", i);
            intent.setClass(context, PeriodScanService.class);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (!(systemService instanceof AlarmManager)) {
                LogUtil.j("BleReconnectManager", "alarmManagerObject is not AlarmManager");
                return;
            }
            try {
                ((AlarmManager) systemService).setExactAndAllowWhileIdle(0, jCurrentTimeMillis + j, service);
                return;
            } catch (SecurityException e) {
                ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "pluginDameon sendPendingIntentTask exception ", e.getMessage());
                return;
            }
        }
        if (EnvironmentInfo.l()) {
            LogUtil.a("BleReconnectManager", "harmony 3.0 free  start.");
            d(i, context, j);
        } else {
            LogUtil.a("BleReconnectManager", "previous start scan logic.");
            a(j);
        }
    }

    private void a(long j) {
        if (this.j == null) {
            ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "mScanHandler is null");
            i();
        }
        ExtendHandler extendHandler = this.j;
        if (extendHandler == null) {
            ReleaseLogUtil.a("DEVMGR_BleReconnectManager", "Failed to initialize mScanHandler");
        } else {
            extendHandler.sendEmptyMessage(2, j);
        }
    }

    private void d(int i, Context context, long j) {
        Intent intent = new Intent();
        intent.putExtra("type", i);
        intent.setClass(context, PeriodScanService.class);
        PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService instanceof AlarmManager) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            LogUtil.a("BleReconnectManager", "alarmTimeScan set alarmClock");
            try {
                alarmManager.setExactAndAllowWhileIdle(0, jCurrentTimeMillis + j, service);
                return;
            } catch (SecurityException e) {
                ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "PluginDameon alarmTimeScan exception ", e.getMessage());
                return;
            }
        }
        LogUtil.j("BleReconnectManager", "alarmManagerObject is not AlarmManager");
    }

    private void a(int i) {
        Object systemService;
        Context context = BaseApplication.getContext();
        if (context == null || (systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM)) == null || !(systemService instanceof AlarmManager)) {
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("type", i);
        intent.setClass(context, PeriodScanService.class);
        ((AlarmManager) systemService).cancel(PendingIntent.getService(context, i, intent, 201326592));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        LogUtil.a("BleReconnectManager", "Enter scan failed.");
        c();
        d();
    }

    private void l() {
        LogUtil.a("BleReconnectManager", "stopBleScan");
        try {
            BluetoothLeScanner bluetoothLeScanner = this.f8110a.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.e);
            }
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            LogUtil.e("BleReconnectManager", "stopLeScan Exception:", ExceptionUtils.c(e));
        }
    }

    private void f() {
        LogUtil.a("BleReconnectManager", "Enter reportConnectedDevice");
        List<BluetoothDevice> listG = g();
        synchronized (f8109b) {
            Iterator<BluetoothDevice> it = listG.iterator();
            while (it.hasNext()) {
                e(it.next(), 0, null);
            }
        }
    }

    private List<BluetoothDevice> g() {
        boolean zBooleanValue;
        ArrayList arrayList = new ArrayList(16);
        try {
            BluetoothManager bluetoothManager = this.d;
            if (bluetoothManager != null) {
                arrayList.addAll(bluetoothManager.getConnectedDevices(7));
            }
            Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
            if (bondedDevices == null) {
                LogUtil.j("BleReconnectManager", "get bonded devices is null.");
                return arrayList;
            }
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("isConnected", new Class[0]);
            declaredMethod.setAccessible(true);
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                Object objInvoke = declaredMethod.invoke(bluetoothDevice, new Object[0]);
                if (!(objInvoke instanceof Boolean)) {
                    LogUtil.j("BleReconnectManager", "connectState is not Boolean");
                    zBooleanValue = false;
                } else {
                    zBooleanValue = ((Boolean) objInvoke).booleanValue();
                }
                LogUtil.a("BleReconnectManager", "getBondDevice:", bluetoothDevice.getName(), ";connect status:", Boolean.valueOf(zBooleanValue));
                if (zBooleanValue) {
                    arrayList.add(bluetoothDevice);
                }
            }
            return arrayList;
        } catch (IllegalAccessException e) {
            LogUtil.e("BleReconnectManager", "getConnectedDeviceList with exception IllegalAccessException: ", ExceptionUtils.c(e));
        } catch (IllegalArgumentException e2) {
            LogUtil.e("BleReconnectManager", "getConnectedDeviceList with exception IllegalArgumentException: ", ExceptionUtils.c(e2));
        } catch (NoSuchMethodException e3) {
            LogUtil.e("BleReconnectManager", "getConnectedDeviceList with exception NoSuchMethodException: ", ExceptionUtils.c(e3));
        } catch (SecurityException e4) {
            LogUtil.e("BleReconnectManager", "getConnectedDeviceList with exception SecurityException: ", ExceptionUtils.c(e4));
        } catch (InvocationTargetException e5) {
            LogUtil.e("BleReconnectManager", "getConnectedDeviceList with exception InvocationTargetException: ", ExceptionUtils.c(e5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (this.f == null || !d(bluetoothDevice)) {
            return;
        }
        this.f.onLeScan(bluetoothDevice, i, bArr);
    }

    static class InstanceHolder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static BleReconnectManager f8113c = new BleReconnectManager();

        private InstanceHolder() {
        }
    }

    static class ScanHandler extends BaseHandlerCallback<BleReconnectManager> {
        ScanHandler(BleReconnectManager bleReconnectManager) {
            super(bleReconnectManager);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.huawei.haf.handler.BaseHandlerCallback
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean handleMessageWhenReferenceNotNull(BleReconnectManager bleReconnectManager, Message message) {
            if (message.what == 2) {
                a();
                return true;
            }
            ReleaseLogUtil.e("DEVMGR_BleReconnectManager", "handleMessage default");
            return false;
        }

        private void a() {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "onStartScan");
            BleReconnectManager.e().c();
            if (BleReconnectManager.e().b()) {
                BleReconnectManager.e().a();
            }
        }
    }

    private void i() {
        if (this.j == null) {
            this.j = HandlerCenter.b(this.f8111c, "BleReconnectManager");
        }
    }
}
