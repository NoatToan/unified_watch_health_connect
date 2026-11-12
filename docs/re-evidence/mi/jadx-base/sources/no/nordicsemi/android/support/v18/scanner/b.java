package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.os.Handler;
import android.os.SystemClock;
import androidx.annotation.RequiresPermission;
import defpackage.sbl;
import defpackage.ydl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(21)
public class b extends no.nordicsemi.android.support.v18.scanner.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<sbl, C1051b> f28188b = new HashMap();

    /* JADX INFO: renamed from: no.nordicsemi.android.support.v18.scanner.b$b, reason: collision with other inner class name */
    public static class C1051b extends no.nordicsemi.android.support.v18.scanner.a.C1049a {
        public final ScanCallback n;

        /* JADX INFO: renamed from: no.nordicsemi.android.support.v18.scanner.b$b$a */
        public class a extends ScanCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f28189a;

            public a() {
            }

            public final /* synthetic */ void d(List list) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f28189a > (jElapsedRealtime - C1051b.this.g.j()) + 5) {
                    return;
                }
                this.f28189a = jElapsedRealtime;
                C1051b.this.h(((b) no.nordicsemi.android.support.v18.scanner.a.a()).g(list));
            }

            public final /* synthetic */ void e(int i) {
                if (!C1051b.this.g.m() || C1051b.this.g.c() == 1) {
                    C1051b.this.f(i);
                    return;
                }
                C1051b.this.g.a();
                no.nordicsemi.android.support.v18.scanner.a aVarA = no.nordicsemi.android.support.v18.scanner.a.a();
                try {
                    aVarA.d(C1051b.this.h);
                } catch (Exception unused) {
                }
                try {
                    C1051b c1051b = C1051b.this;
                    aVarA.c(c1051b.f, c1051b.g, c1051b.h, c1051b.i);
                } catch (Exception unused2) {
                }
            }

            public final /* synthetic */ void f(android.bluetooth.le.ScanResult scanResult, int i) {
                C1051b.this.g(i, ((b) no.nordicsemi.android.support.v18.scanner.a.a()).f(scanResult));
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onBatchScanResults(final List<android.bluetooth.le.ScanResult> list) {
                C1051b.this.i.post(new Runnable() { // from class: l23
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f24558a.d(list);
                    }
                });
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(final int i) {
                C1051b.this.i.post(new Runnable() { // from class: k23
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f23352a.e(i);
                    }
                });
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(final int i, final android.bluetooth.le.ScanResult scanResult) {
                C1051b.this.i.post(new Runnable() { // from class: m23
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25668a.f(scanResult, i);
                    }
                });
            }
        }

        public C1051b(boolean z, boolean z2, List<ScanFilter> list, ScanSettings scanSettings, sbl sblVar, Handler handler) {
            super(z, z2, list, scanSettings, sblVar, handler);
            this.n = new a();
        }
    }

    @Override // no.nordicsemi.android.support.v18.scanner.a
    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public void c(List<ScanFilter> list, ScanSettings scanSettings, sbl sblVar, Handler handler) {
        C1051b c1051b;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        if (bluetoothLeScanner == null) {
            throw new IllegalStateException("BT le scanner not available");
        }
        boolean zIsOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
        boolean zIsOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
        synchronized (this.f28188b) {
            if (this.f28188b.containsKey(sblVar)) {
                throw new IllegalArgumentException("scanner already started with given callback");
            }
            c1051b = new C1051b(zIsOffloadedScanBatchingSupported, zIsOffloadedFilteringSupported, list, scanSettings, sblVar, handler);
            this.f28188b.put(sblVar, c1051b);
        }
        bluetoothLeScanner.startScan((!list.isEmpty() && zIsOffloadedFilteringSupported && scanSettings.o()) ? i(list) : null, j(defaultAdapter, scanSettings, false), c1051b.n);
    }

    @Override // no.nordicsemi.android.support.v18.scanner.a
    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public void e(sbl sblVar) {
        C1051b c1051bRemove;
        BluetoothLeScanner bluetoothLeScanner;
        synchronized (this.f28188b) {
            c1051bRemove = this.f28188b.remove(sblVar);
        }
        if (c1051bRemove == null) {
            return;
        }
        c1051bRemove.d();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || (bluetoothLeScanner = defaultAdapter.getBluetoothLeScanner()) == null) {
            return;
        }
        bluetoothLeScanner.stopScan(c1051bRemove.n);
    }

    public ScanResult f(android.bluetooth.le.ScanResult scanResult) {
        return new ScanResult(scanResult.getDevice(), ydl.h(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getRssi(), scanResult.getTimestampNanos());
    }

    public ArrayList<ScanResult> g(List<android.bluetooth.le.ScanResult> list) {
        ArrayList<ScanResult> arrayList = new ArrayList<>();
        Iterator<android.bluetooth.le.ScanResult> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f(it.next()));
        }
        return arrayList;
    }

    public android.bluetooth.le.ScanFilter h(ScanFilter scanFilter) {
        android.bluetooth.le.ScanFilter.Builder builder = new android.bluetooth.le.ScanFilter.Builder();
        builder.setServiceUuid(scanFilter.j(), scanFilter.k()).setManufacturerData(scanFilter.f(), scanFilter.d(), scanFilter.e());
        if (scanFilter.a() != null) {
            builder.setDeviceAddress(scanFilter.a());
        }
        if (scanFilter.c() != null) {
            builder.setDeviceName(scanFilter.c());
        }
        if (scanFilter.i() != null) {
            builder.setServiceData(scanFilter.i(), scanFilter.g(), scanFilter.h());
        }
        return builder.build();
    }

    public ArrayList<android.bluetooth.le.ScanFilter> i(List<ScanFilter> list) {
        ArrayList<android.bluetooth.le.ScanFilter> arrayList = new ArrayList<>();
        Iterator<ScanFilter> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        return arrayList;
    }

    public android.bluetooth.le.ScanSettings j(BluetoothAdapter bluetoothAdapter, ScanSettings scanSettings, boolean z) {
        android.bluetooth.le.ScanSettings.Builder builder = new android.bluetooth.le.ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && scanSettings.l())) {
            builder.setReportDelay(scanSettings.j());
        }
        if (scanSettings.k() != -1) {
            builder.setScanMode(scanSettings.k());
        } else {
            builder.setScanMode(0);
        }
        scanSettings.a();
        return builder.build();
    }
}
