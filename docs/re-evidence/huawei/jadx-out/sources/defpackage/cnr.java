package defpackage;

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
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.huawei.devicesdk.entity.DeviceInfo;
import com.huawei.devicesdk.reconnect.BleReconnectScanCallback;
import com.huawei.devicesdk.reconnect.PeriodScanService;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class cnr {
    private static final Object e = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f1866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothAdapter f1867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothManager f1868c;
    private boolean d;
    private ExtendHandler f;
    private ScanCallback g;
    private PendingIntent h;
    private BleReconnectScanCallback i;

    private boolean b(int i) {
        return (i == 1 || i == 2) ? false : true;
    }

    private cnr() {
        this.f1866a = new e(this);
        this.d = false;
        this.g = new ScanCallback() { // from class: cnr.5
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int i, ScanResult scanResult) {
                super.onScanResult(i, scanResult);
                ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "high version onScanResult");
                b(scanResult);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(List<ScanResult> list) {
                super.onBatchScanResults(list);
                LogUtil.b("BleReconnectManager", "high version onBatchScanResults");
                if (list == null) {
                    return;
                }
                Iterator<ScanResult> it = list.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int i) {
                ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "onScanFailed: ", Integer.valueOf(i));
                super.onScanFailed(i);
                cnr.this.o();
            }

            private void b(ScanResult scanResult) {
                if (scanResult == null) {
                    LogUtil.e("BleReconnectManager", "reportDiscoveryDevice error. scan result is invalid.");
                    return;
                }
                try {
                    BluetoothDevice device = scanResult.getDevice();
                    LogUtil.b("BleReconnectManager", "high version onDeviceDiscovered ", device != null ? device.getName() : Integer.valueOf(scanResult.getRssi()));
                    if (device != null && cnk.c().j(device.getAddress()) != null) {
                        coy.e(scanResult.getDevice().getAddress(), new cmc(scanResult.getRssi(), scanResult.getDevice().getAddress(), true));
                    }
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    cnr.this.c(scanResult.getDevice(), scanResult.getRssi(), scanRecord == null ? null : scanRecord.getBytes());
                } catch (SecurityException e2) {
                    LogUtil.d("BleReconnectManager", "mBleScanCallback SecurityException ", ExceptionUtils.c(e2));
                }
            }
        };
        Object systemService = BaseApplication.b().getSystemService("bluetooth");
        if (systemService instanceof BluetoothManager) {
            this.f1868c = (BluetoothManager) systemService;
        } else {
            LogUtil.e("BleReconnectManager", "bluetoothManager is not BluetoothManager");
        }
        this.f1868c = (BluetoothManager) BaseApplication.b().getSystemService("bluetooth");
        this.f1867b = BluetoothAdapter.getDefaultAdapter();
        m();
    }

    public static cnr d() {
        return d.f1870b;
    }

    public boolean b() {
        Iterator<Map.Entry<String, DeviceInfo>> it = cno.a().e().entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo value = it.next().getValue();
            if (b(value.getDeviceConnectState())) {
                LogUtil.b("BleReconnectManager", "find need to reconnect device.", cpl.a(value));
                return true;
            }
        }
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "not found need to reconnect device.");
        return false;
    }

    public String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.b("BleReconnectManager", "getGattTimeoutDeviceName deviceMac is empty.");
            return "";
        }
        Iterator<Map.Entry<String, DeviceInfo>> it = cno.a().e().entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo value = it.next().getValue();
            if (str.equals(value.getDeviceMac())) {
                return value.getDeviceName();
            }
        }
        return "";
    }

    public void a(BleReconnectScanCallback bleReconnectScanCallback, int i) {
        if (Build.VERSION.SDK_INT >= 33 && !cpp.e(BaseApplication.b(), new String[]{"android.permission.BLUETOOTH_CONNECT"})) {
            LogUtil.e("BleReconnectManager", "startReconnect failed, no permission");
            return;
        }
        this.i = bleReconnectScanCallback;
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "Enter startReconnect.");
        Iterator<Map.Entry<String, DeviceInfo>> it = cno.a().e().entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo value = it.next().getValue();
            if (value.getDeviceType() == 275) {
                cno.a().c(value);
            }
        }
        if (2 != i) {
            cns.c();
        }
        if (b()) {
            c();
            f();
        }
    }

    public void j() {
        c();
    }

    private boolean a(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || TextUtils.isEmpty(bluetoothDevice.getAddress())) {
            LogUtil.e("BleReconnectManager", "isNeedReconnect device is null or address is null.");
            return false;
        }
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "isNeedReconnect", cpl.a(bluetoothDevice.getAddress()));
        Iterator<Map.Entry<String, DeviceInfo>> it = cno.a().e().entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo value = it.next().getValue();
            if (bluetoothDevice.getAddress().equalsIgnoreCase(value.getDeviceMac())) {
                return b(value.getDeviceConnectState());
            }
        }
        return false;
    }

    private Map<String, DeviceInfo> l() {
        HashMap map = new HashMap(2);
        Iterator<Map.Entry<String, DeviceInfo>> it = cno.a().e().entrySet().iterator();
        while (it.hasNext()) {
            DeviceInfo value = it.next().getValue();
            if (b(value.getDeviceConnectState())) {
                map.put(value.getDeviceMac(), value);
            }
        }
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "getReconnectDevice. size:", Integer.valueOf(map.size()));
        return map;
    }

    public void f() {
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "Enter startScanDiscovery");
        if (!coj.d()) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "startDiscoverBleDevice sdk version is not support.");
        } else {
            h();
        }
    }

    private void h() {
        boolean zK;
        n();
        try {
            zK = k();
        } catch (IllegalStateException unused) {
            ReleaseLogUtil.b("DEVMGR_BleReconnectManager", "discoverBleDevice IllegalStateException version :", Integer.valueOf(Build.VERSION.SDK_INT));
            zK = false;
        }
        LogUtil.b("BleReconnectManager", "startBleScan result: ", Boolean.valueOf(zK), " isSystemSupportFreezing: ", Boolean.valueOf(cop.f()));
        if (!zK) {
            o();
        } else {
            if (this.d) {
                return;
            }
            c(1, C.DEFAULT_SEEK_FORWARD_INCREMENT_MS);
        }
    }

    private boolean k() {
        int i;
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "Enter startBleScan");
        BluetoothLeScanner bluetoothLeScanner = this.f1867b.getBluetoothLeScanner();
        int i2 = 2;
        ArrayList arrayList = new ArrayList(2);
        for (DeviceInfo deviceInfo : l().values()) {
            if (deviceInfo != null && !TextUtils.isEmpty(deviceInfo.getDeviceMac())) {
                ScanFilter.Builder builder = new ScanFilter.Builder();
                builder.setDeviceAddress(deviceInfo.getDeviceMac());
                arrayList.add(builder.build());
            }
        }
        if (bluetoothLeScanner != null) {
            ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "startBleScan isEmui110: ", Boolean.valueOf(cop.d()));
            boolean zA = false;
            try {
                i = cpz.a("02:00:00", "05:00:00") ? 0 : 2;
                try {
                    LogUtil.b("BleReconnectManager", "scanMode: ", Integer.valueOf(i));
                } catch (ParseException unused) {
                    i2 = i;
                    LogUtil.d("BleReconnectManager", "Time ParseException occur.");
                    i = i2;
                }
            } catch (ParseException unused2) {
            }
            if (cop.d()) {
                i = 0;
            }
            ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "final scanMode: ", Integer.valueOf(i));
            try {
                zA = cpz.a("00:00:00", "06:00:00");
            } catch (ParseException unused3) {
                LogUtil.d("BleReconnectManager", "isValidDateSix ParseException occur.");
            }
            a(bluetoothLeScanner, arrayList, i, zA);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c A[Catch: NullPointerException | SecurityException -> 0x006e, SecurityException -> 0x0070, TryCatch #3 {NullPointerException | SecurityException -> 0x006e, blocks: (B:4:0x0006, B:10:0x0016, B:12:0x0035, B:6:0x000c, B:8:0x0010, B:13:0x0051), top: B:22:0x0006, inners: #1 }] */
    private void a(BluetoothLeScanner bluetoothLeScanner, List<ScanFilter> list, int i, boolean z) {
        if (!z) {
            if (this.d) {
            }
            ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "scan device default logic.");
            bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(i).build(), this.g);
            return;
        }
        try {
            if (!cop.f()) {
                if (this.d || !cop.f()) {
                    ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "scan device default logic.");
                    bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(i).build(), this.g);
                    return;
                }
            }
        } catch (NullPointerException | SecurityException e2) {
            ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "startScanBleDevice SecurityException or NullPointerException : ", ExceptionUtils.c(e2));
            return;
        }
        try {
            ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "scanDevice harmony 3.0 start 1003.");
            bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(1003).build(), this.g);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            ReleaseLogUtil.b("DEVMGR_BleReconnectManager", "IllegalStateException or IllegalArgumentException 3.0 start.");
            bluetoothLeScanner.startScan(list, new ScanSettings.Builder().setScanMode(i).build(), this.g);
        }
    }

    public void c() {
        LogUtil.b("BleReconnectManager", "Enter cancelBleReconnect");
        r();
        if (this.f == null) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "mScanHandler is null");
            m();
        }
        if (this.f == null) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "Failed to initialize mScanHandler");
        } else if (cop.f()) {
            c(2);
        } else {
            this.f.removeMessages(2);
        }
        c(1);
    }

    public void e() {
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "Enter nextBleReconnect");
        c(2, -1L);
    }

    void e(long j) {
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "Enter nextBleReconnect with period:", Long.valueOf(j));
        c();
        cns.c();
        c(2, j);
    }

    private void c(int i, long j) {
        Context contextB = BaseApplication.b();
        if (j == -1) {
            j = cns.e();
        }
        ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "sendPendingIntentTask type: ", Integer.valueOf(i), ", delay: ", Long.valueOf(j));
        cqp.a(100058, "", String.valueOf(i), String.valueOf(j));
        if (i == 1) {
            Object systemService = contextB.getSystemService(NotificationCompat.CATEGORY_ALARM);
            if (!(systemService instanceof AlarmManager)) {
                LogUtil.e("BleReconnectManager", "alarmManagerObject is not AlarmManager");
                return;
            }
            AlarmManager alarmManager = (AlarmManager) systemService;
            PendingIntent pendingIntent = this.h;
            if (pendingIntent != null) {
                alarmManager.cancel(pendingIntent);
                LogUtil.b("BleReconnectManager", "alarmTimeStop alarmManager cancel");
            }
            Intent intent = new Intent();
            intent.putExtra("type", i);
            intent.setClass(contextB, PeriodScanService.class);
            this.h = PendingIntent.getService(contextB, i, intent, 335544320);
            try {
                alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + j, this.h);
                return;
            } catch (IllegalStateException | SecurityException e2) {
                ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "wearLink sendPendingIntentTask exception ", e2.getMessage());
                return;
            }
        }
        if (cop.f()) {
            LogUtil.b("BleReconnectManager", "harmony 3.0 free  start.");
            c(i, contextB, j);
        } else {
            LogUtil.b("BleReconnectManager", "previous start scan logic.");
            d(j);
        }
    }

    private void d(long j) {
        if (this.f == null) {
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "mScanHandler is null");
            m();
        }
        ExtendHandler extendHandler = this.f;
        if (extendHandler == null) {
            ReleaseLogUtil.b("DEVMGR_BleReconnectManager", "Failed to initialize mScanHandler");
        } else {
            extendHandler.sendEmptyMessage(2, j);
        }
    }

    private void c(int i, Context context, long j) {
        Object systemService = context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (systemService instanceof AlarmManager) {
            AlarmManager alarmManager = (AlarmManager) systemService;
            LogUtil.b("BleReconnectManager", "alarmTimeScan set alarmClock");
            PendingIntent pendingIntent = this.h;
            if (pendingIntent != null) {
                alarmManager.cancel(pendingIntent);
                LogUtil.b("BleReconnectManager", "alarmTimeScan alarmManager cancel");
            }
            Intent intent = new Intent();
            intent.putExtra("type", i);
            intent.setClass(context, PeriodScanService.class);
            this.h = PendingIntent.getService(context, i, intent, 335544320);
            try {
                alarmManager.setExactAndAllowWhileIdle(0, System.currentTimeMillis() + j, this.h);
                return;
            } catch (SecurityException e2) {
                ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "wearLink alarmTimeScan exception ", e2.getMessage());
                return;
            }
        }
        LogUtil.e("BleReconnectManager", "alarmManagerObject is not AlarmManager");
    }

    private void c(int i) {
        Object systemService;
        Context contextB = BaseApplication.b();
        if (contextB == null || (systemService = contextB.getSystemService(NotificationCompat.CATEGORY_ALARM)) == null) {
            return;
        }
        try {
            if (systemService instanceof AlarmManager) {
                Intent intent = new Intent();
                intent.putExtra("type", i);
                intent.setClass(contextB, PeriodScanService.class);
                ((AlarmManager) systemService).cancel(PendingIntent.getService(contextB, i, intent, 335544320));
            }
        } catch (Exception unused) {
            LogUtil.d("BleReconnectManager", "cancelPendingIntentTask occur exception.");
            lng.c("ConnectMessage", "cancelPendingIntentTask occur exception");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        LogUtil.b("BleReconnectManager", "Enter scan failed.");
        c();
        e();
    }

    private void r() {
        LogUtil.b("BleReconnectManager", "stopBleScan");
        try {
            BluetoothLeScanner bluetoothLeScanner = this.f1867b.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.g);
            }
        } catch (IllegalStateException e2) {
            LogUtil.d("BleReconnectManager", "stopLeScan IllegalStateException: ", cpc.c(e2));
        } catch (NullPointerException unused) {
            LogUtil.d("BleReconnectManager", "stopLeScan NullPointerException:");
        } catch (SecurityException e3) {
            LogUtil.d("BleReconnectManager", "stopLeScan SecurityException: ", cpc.c(e3));
        }
    }

    private void n() {
        LogUtil.b("BleReconnectManager", "Enter reportConnectedDevice");
        List<BluetoothDevice> listI = i();
        synchronized (e) {
            Iterator<BluetoothDevice> it = listI.iterator();
            while (it.hasNext()) {
                c(it.next(), 0, (byte[]) null);
            }
        }
    }

    private List<BluetoothDevice> i() {
        Set<BluetoothDevice> bondedDevices;
        boolean zBooleanValue;
        ArrayList arrayList = new ArrayList(16);
        try {
            try {
                BluetoothManager bluetoothManager = this.f1868c;
                if (bluetoothManager != null) {
                    arrayList.addAll(bluetoothManager.getConnectedDevices(7));
                }
                try {
                    bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
                } catch (SecurityException e2) {
                    LogUtil.d("BleReconnectManager", "getConnectedDeviceList SecurityException", cpc.c(e2));
                    bondedDevices = null;
                }
                if (bondedDevices == null) {
                    LogUtil.e("BleReconnectManager", "get bonded devices is null.");
                } else {
                    Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("isConnected", new Class[0]);
                    declaredMethod.setAccessible(true);
                    for (BluetoothDevice bluetoothDevice : bondedDevices) {
                        Object objInvoke = declaredMethod.invoke(bluetoothDevice, new Object[0]);
                        if (!(objInvoke instanceof Boolean)) {
                            LogUtil.e("BleReconnectManager", "connectState is not Boolean");
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = ((Boolean) objInvoke).booleanValue();
                        }
                        LogUtil.c("BleReconnectManager", "getBondDevice:", bluetoothDevice.getName(), ";connect status:", Boolean.valueOf(zBooleanValue));
                        if (zBooleanValue) {
                            arrayList.add(bluetoothDevice);
                        }
                    }
                }
            } catch (SecurityException e3) {
                LogUtil.d("BleReconnectManager", "getConnectedDeviceList with exception SecurityException: ", cpc.c(e3));
            }
        } catch (IllegalAccessException e4) {
            LogUtil.d("BleReconnectManager", "getConnectedDeviceList with exception IllegalAccessException: ", cpc.c(e4));
        } catch (IllegalArgumentException e5) {
            LogUtil.d("BleReconnectManager", "getConnectedDeviceList with exception IllegalArgumentException: ", cpc.c(e5));
        } catch (NoSuchMethodException e6) {
            LogUtil.d("BleReconnectManager", "getConnectedDeviceList with exception NoSuchMethodException: ", cpc.c(e6));
        } catch (InvocationTargetException e7) {
            LogUtil.d("BleReconnectManager", "getConnectedDeviceList with exception InvocationTargetException: ", cpc.c(e7));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (this.i == null || !a(bluetoothDevice)) {
            return;
        }
        this.i.onLeScan(bluetoothDevice, i, bArr);
        LogUtil.b("BleReconnectManager", "reportDiscoveryDevice mIsAllTimeScan: ", Boolean.valueOf(this.d));
        if (this.d) {
            g();
        }
    }

    public void g() {
        b(false);
        c();
    }

    public void b(boolean z) {
        this.d = z;
    }

    public boolean a() {
        return this.d;
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static cnr f1870b = new cnr();
    }

    static class e implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<cnr> f1871b;

        e(cnr cnrVar) {
            this.f1871b = new WeakReference<>(cnrVar);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 2) {
                WeakReference<cnr> weakReference = this.f1871b;
                if (weakReference == null) {
                    return false;
                }
                if (weakReference.get() == null) {
                    LogUtil.e("BleReconnectManager", "handleMessage bleReconnectManager is null");
                    return false;
                }
                e();
                return true;
            }
            ReleaseLogUtil.d("DEVMGR_BleReconnectManager", "handleMessage default");
            return false;
        }

        private void e() {
            ReleaseLogUtil.c("DEVMGR_BleReconnectManager", "onStartScan");
            cnr.d().c();
            if (cnr.d().b()) {
                cnr.d().f();
            }
        }
    }

    private void m() {
        if (this.f == null) {
            this.f = HandlerCenter.b(this.f1866a, "BleReconnectManager");
        }
    }
}
