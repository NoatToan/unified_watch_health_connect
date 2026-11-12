package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.health.device.callback.IDeviceEventHandler;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes7.dex */
public class efm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ExtendHandler f32878a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ScanCallback f32880c;
    private Handler d;
    private ScanFilter f;
    private IDeviceEventHandler g;
    private int j;
    private ScheduledFuture l;
    private final Object h = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32879b = false;
    private Runnable i = new Runnable() { // from class: efu
        @Override // java.lang.Runnable
        public final void run() {
            this.f32891b.b();
        }
    };
    private BroadcastReceiver e = new BroadcastReceiver() { // from class: efm.3
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!"android.bluetooth.device.action.FOUND".equals(intent.getAction())) {
                LogUtil.j("DeviceScanner", "onReceive intent action is not FOUND");
                return;
            }
            try {
                Parcelable parcelableExtra = intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (!(parcelableExtra instanceof BluetoothDevice)) {
                    LogUtil.j("DeviceScanner", "onReceive intent ParcelableExtra is null");
                    return;
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) parcelableExtra;
                if (efm.this.f == null || efm.this.f.c(bluetoothDevice)) {
                    efm.this.c(dmu.a(bluetoothDevice));
                }
            } catch (RuntimeException e) {
                LogUtil.e("DeviceScanner", "onReceive ", e.getMessage());
            }
        }
    };

    /* synthetic */ void b() {
        LogUtil.a("DeviceScanner", "ScheduledStopTask");
        h();
        this.d.post(new Runnable() { // from class: efp
            @Override // java.lang.Runnable
            public final void run() {
                this.d.a();
            }
        });
    }

    /* synthetic */ void a() {
        IDeviceEventHandler iDeviceEventHandler = this.g;
        if (iDeviceEventHandler != null) {
            iDeviceEventHandler.onScanFailed(1);
            this.g = null;
        }
    }

    efm() {
        synchronized (this) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                this.d = new Handler(Looper.getMainLooper());
            } else {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                    Looper.loop();
                }
                this.d = new Handler(Looper.myLooper());
            }
            this.f32878a = HandlerCenter.e("DeviceScanner");
        }
    }

    public boolean e(dmm dmmVar, ScanFilter scanFilter, IDeviceEventHandler iDeviceEventHandler) {
        this.f = scanFilter;
        synchronized (this.h) {
            this.g = iDeviceEventHandler;
            int iC = dmmVar.c();
            this.j = iC;
            this.f32879b = true;
            if (iC == 1) {
                i();
            } else if (iC == 2) {
                o();
            } else if (iC != 4) {
                LogUtil.j("DeviceScanner", "scanDevice other scan mode = ", Integer.valueOf(iC));
            } else if (iDeviceEventHandler != null) {
                iDeviceEventHandler.onDeviceFound(new dmr());
            }
        }
        ScheduledFuture scheduledFuture = this.l;
        if (scheduledFuture != null) {
            LogUtil.a("DeviceScanner", "scanDevice cancel the existing task result is ", Boolean.valueOf(scheduledFuture.cancel(true)));
        }
        if (dmmVar.e() > 0) {
            this.l = dxw.e(this.i, dmmVar.e());
        }
        return true;
    }

    public void j() {
        synchronized (this) {
            LogUtil.a("DeviceScanner", "stopScan");
            h();
            dxw.a(this.i);
            this.d.post(new Runnable() { // from class: efr
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d();
                }
            });
            ExtendHandler extendHandler = this.f32878a;
            if (extendHandler != null) {
                extendHandler.removeTasksAndMessages();
                this.f32878a.quit(true);
            }
        }
    }

    /* synthetic */ void d() {
        IDeviceEventHandler iDeviceEventHandler = this.g;
        if (iDeviceEventHandler != null) {
            iDeviceEventHandler.onScanFailed(5);
            this.g = null;
        }
    }

    private void h() {
        synchronized (this.h) {
            if (this.f32879b) {
                this.f32879b = false;
                this.f = null;
                int i = this.j;
                if (i == 1) {
                    n();
                } else if (i == 2) {
                    k();
                } else {
                    LogUtil.j("DeviceScanner", "cancelScan other scan mode = ", Integer.valueOf(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final HealthDevice healthDevice) {
        if (healthDevice == null) {
            return;
        }
        LogUtil.a("DeviceScanner", "DeviceScanner onDeviceFound ", healthDevice.getDeviceName());
        this.d.post(new Runnable() { // from class: efv
            @Override // java.lang.Runnable
            public final void run() {
                this.f32892b.d(healthDevice);
            }
        });
    }

    /* synthetic */ void d(HealthDevice healthDevice) {
        IDeviceEventHandler iDeviceEventHandler = this.g;
        if (iDeviceEventHandler != null) {
            iDeviceEventHandler.onDeviceFound(healthDevice);
        }
    }

    private void i() {
        List<BluetoothDevice> connectedDevices;
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isEnabled()) {
                LogUtil.a("DeviceScanner", "scanBleDevice DeviceScanner begin scan");
                Object systemService = dxw.d().getSystemService("bluetooth");
                if ((systemService instanceof BluetoothManager) && (connectedDevices = ((BluetoothManager) systemService).getConnectedDevices(7)) != null) {
                    LogUtil.a("DeviceScanner", "scanBleDevice getConnectedDevices = ", Integer.valueOf(connectedDevices.size()));
                    Iterator<BluetoothDevice> it = connectedDevices.iterator();
                    while (it.hasNext()) {
                        a(it.next());
                    }
                }
                BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
                ArrayList arrayList = new ArrayList(16);
                arrayList.add(new android.bluetooth.le.ScanFilter.Builder().build());
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.startScan(arrayList, new ScanSettings.Builder().setScanMode(2).build(), f());
                }
            }
        } catch (SecurityException e) {
            LogUtil.e("DeviceScanner", "scanBleDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    private void a(BluetoothDevice bluetoothDevice) {
        ScanFilter scanFilter;
        if (bluetoothDevice == null || (scanFilter = this.f) == null || !scanFilter.c(bluetoothDevice)) {
            return;
        }
        efx efxVarB = efx.b(bluetoothDevice);
        if (efxVarB.getDeviceName() != null) {
            c(efxVarB);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(ScanResult scanResult) {
        if (scanResult != null) {
            c(scanResult.getDevice(), scanResult.getScanRecord());
        } else {
            LogUtil.j("DeviceScanner", "the scan result is null ");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Object obj) {
        if (!(obj instanceof List)) {
            LogUtil.j("DeviceScanner", "the results is not a list");
            return;
        }
        List list = (List) obj;
        if (njy.e(list)) {
            LogUtil.j("DeviceScanner", "the result is empty");
            return;
        }
        for (Object obj2 : list) {
            if (obj2 instanceof ScanResult) {
                ScanResult scanResult = (ScanResult) obj2;
                c(scanResult.getDevice(), scanResult.getScanRecord());
            } else {
                LogUtil.j("DeviceScanner", "onBatchScanResult is ", obj2.toString());
            }
        }
    }

    private ScanCallback f() {
        ScanCallback scanCallback = this.f32880c;
        if (scanCallback != null) {
            return scanCallback;
        }
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        this.f32880c = anonymousClass5;
        return anonymousClass5;
    }

    /* JADX INFO: renamed from: efm$5, reason: invalid class name */
    class AnonymousClass5 extends ScanCallback {
        AnonymousClass5() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, final ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            if (efm.this.f32878a == null) {
                return;
            }
            efm.this.f32878a.postTask(new Runnable() { // from class: eft
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32889b.d(scanResult);
                }
            });
        }

        /* synthetic */ void d(ScanResult scanResult) {
            efm.this.d(scanResult);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(final List<ScanResult> list) {
            super.onBatchScanResults(list);
            if (list != null) {
                if (efm.this.f32878a == null) {
                    return;
                }
                efm.this.f32878a.postTask(new Runnable() { // from class: efw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32894c.e(list);
                    }
                });
                return;
            }
            LogUtil.a("DeviceScanner", "the results is null");
        }

        /* synthetic */ void e(List list) {
            efm.this.b(list);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
            LogUtil.j("DeviceScanner", "scan fail", "the system error code is ", Integer.valueOf(i));
        }
    }

    private void o() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isEnabled()) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.device.action.FOUND");
                LogUtil.a("DeviceScanner", "scanClassicDevice registerReceiver");
                dxw.d().registerReceiver(this.e, intentFilter);
                dxw.c(new Runnable() { // from class: efq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32887b.c();
                    }
                });
                defaultAdapter.startDiscovery();
            }
        } catch (SecurityException e) {
            LogUtil.e("DeviceScanner", "scanClassicDevice SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* synthetic */ void c() {
        ScanFilter scanFilter;
        Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        if (bondedDevices != null) {
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                if (bluetoothDevice != null && ((scanFilter = this.f) == null || scanFilter.c(bluetoothDevice))) {
                    c(dmu.a(bluetoothDevice));
                }
            }
        }
    }

    private void n() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!defaultAdapter.isEnabled()) {
                LogUtil.j("DeviceScanner", "stopBleScan bluetoothAdapter is not enable");
                this.d.post(new Runnable() { // from class: efo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32886b.e();
                    }
                });
            } else {
                BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
                if (bluetoothLeScanner != null) {
                    bluetoothLeScanner.stopScan(this.f32880c);
                }
            }
        } catch (SecurityException e) {
            LogUtil.e("DeviceScanner", "stopBleScan SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* synthetic */ void e() {
        IDeviceEventHandler iDeviceEventHandler = this.g;
        if (iDeviceEventHandler != null) {
            iDeviceEventHandler.onScanFailed(1);
            this.g = null;
        }
    }

    private void k() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter.isDiscovering()) {
                LogUtil.a("DeviceScanner", "stopScanClassic scanClassicDevice unregisterReceiver");
                defaultAdapter.cancelDiscovery();
                dxw.d().unregisterReceiver(this.e);
            } else {
                LogUtil.j("DeviceScanner", "stopScanClassic bluetoothAdapter is not discover");
                this.d.post(new Runnable() { // from class: efs
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32888b.g();
                    }
                });
            }
        } catch (SecurityException e) {
            LogUtil.e("DeviceScanner", "stopScanClassic SecurityException:", ExceptionUtils.c(e));
        }
    }

    /* synthetic */ void g() {
        IDeviceEventHandler iDeviceEventHandler = this.g;
        if (iDeviceEventHandler != null) {
            iDeviceEventHandler.onScanFailed(1);
            this.g = null;
        }
    }

    private void c(BluetoothDevice bluetoothDevice, ScanRecord scanRecord) {
        if (bluetoothDevice == null) {
            LogUtil.j("DeviceScanner", "reportDeviceScanResult device is null.");
            return;
        }
        try {
            LogUtil.a("DeviceScanner", "reportDeviceScanResult onLeScan found device ", bluetoothDevice.getName());
        } catch (SecurityException e) {
            LogUtil.e("DeviceScanner", "reportDeviceScanResult SecurityException:", ExceptionUtils.c(e));
        }
        d(bluetoothDevice, c(scanRecord));
    }

    private void d(BluetoothDevice bluetoothDevice, byte[] bArr) {
        ScanFilter scanFilter = this.f;
        efx efxVarB = efx.b(bluetoothDevice);
        if (efxVarB == null) {
            return;
        }
        try {
            if (bluetoothDevice.getName() == null && CommonUtil.at()) {
                String strC = lnk.d().d(bArr).c();
                LogUtil.a("DeviceScanner", "parseScanResult onLeScan found node ", strC);
                efxVarB.setDeviceName(strC);
                if (this.f32879b) {
                    if (scanFilter == null || scanFilter.b(bArr) || scanFilter.c(efxVarB)) {
                        c(efxVarB);
                        return;
                    }
                    return;
                }
                return;
            }
            if (this.f32879b) {
                if (scanFilter == null || scanFilter.b(bArr) || scanFilter.c(bluetoothDevice)) {
                    if (efxVarB.getDeviceName() == null) {
                        LogUtil.j("DeviceScanner", "parseScanResult onLeScan deviceName is null");
                    } else {
                        c(efxVarB);
                    }
                }
            }
        } catch (SecurityException e) {
            LogUtil.e("DeviceScanner", "parseScanResult SecurityException:", ExceptionUtils.c(e));
        }
    }

    private byte[] c(ScanRecord scanRecord) {
        if (scanRecord == null) {
            LogUtil.j("DeviceScanner", "parseScanRecord scanRecord is null");
            return null;
        }
        return scanRecord.getBytes();
    }
}
