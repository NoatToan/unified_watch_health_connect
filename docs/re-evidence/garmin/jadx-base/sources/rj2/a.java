package rj2;

import android.annotation.SuppressLint;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrj2/a;", "", "Landroid/bluetooth/le/BluetoothLeScanner;", "scanner", "<init>", "(Landroid/bluetooth/le/BluetoothLeScanner;)V", "a", "ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingPermission"})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BluetoothLeScanner f153005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f153006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentityHashMap<ScanCallback, C2893a> f153007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Logger f153008d;

    /* JADX INFO: renamed from: rj2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrj2/a$a;", "Landroid/bluetooth/le/ScanCallback;", "callback", "", "Landroid/bluetooth/le/ScanFilter;", "filters", "<init>", "(Landroid/bluetooth/le/ScanCallback;Ljava/util/List;)V", "ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C2893a extends ScanCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScanCallback f153009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<ScanFilter> f153010b;

        public C2893a(ScanCallback scanCallback, List<ScanFilter> list) {
            scanCallback.getClass();
            list.getClass();
            this.f153009a = scanCallback;
            this.f153010b = list;
        }

        public final boolean a(ScanResult scanResult) {
            if (scanResult != null && scanResult.getDevice() != null && scanResult.getScanRecord() != null) {
                List<ScanFilter> list = this.f153010b;
                if (list.isEmpty()) {
                    return true;
                }
                Iterator<ScanFilter> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().matches(scanResult)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onBatchScanResults(List<ScanResult> list) {
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (ScanResult scanResult : list) {
                if (a(scanResult)) {
                    arrayList.add(scanResult);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f153009a.onBatchScanResults(arrayList);
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i14) {
            this.f153009a.onScanFailed(i14);
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanResult(int i14, ScanResult scanResult) {
            if (a(scanResult)) {
                this.f153009a.onScanResult(i14, scanResult);
            }
        }
    }

    public a(BluetoothLeScanner bluetoothLeScanner) {
        bluetoothLeScanner.getClass();
        this.f153005a = bluetoothLeScanner;
        this.f153006b = new Object();
        this.f153007c = new IdentityHashMap<>();
        Logger logger = LoggerFactory.getLogger(pj2.a.a("CompatBluetoothLeScanner", null, this));
        logger.getClass();
        this.f153008d = logger;
    }
}
