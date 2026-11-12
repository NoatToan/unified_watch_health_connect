package no.nordicsemi.android.support.v18.scanner;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.os.Handler;
import defpackage.mqh;
import defpackage.n23;
import defpackage.ydl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(26)
public class c extends n23 {
    public final HashMap<PendingIntent, a> c = new HashMap<>();

    public static class a extends no.nordicsemi.android.support.v18.scanner.a.C1049a {
        public final mqh n;

        public a(boolean z, boolean z2, List<ScanFilter> list, ScanSettings scanSettings, PendingIntent pendingIntent) {
            super(z, z2, list, scanSettings, new mqh(pendingIntent, scanSettings), new Handler());
            this.n = (mqh) this.h;
        }
    }

    @Override // no.nordicsemi.android.support.v18.scanner.b
    public ScanResult f(android.bluetooth.le.ScanResult scanResult) {
        return new ScanResult(scanResult.getDevice(), (((scanResult.getDataStatus() << 5) | (scanResult.isLegacy() ? 16 : 0)) | (scanResult.isConnectable() ? 1 : 0)) == true ? 1 : 0, scanResult.getPrimaryPhy(), scanResult.getSecondaryPhy(), scanResult.getAdvertisingSid(), scanResult.getTxPower(), scanResult.getRssi(), scanResult.getPeriodicAdvertisingInterval(), ydl.h(scanResult.getScanRecord() != null ? scanResult.getScanRecord().getBytes() : null), scanResult.getTimestampNanos());
    }

    @Override // no.nordicsemi.android.support.v18.scanner.b
    public android.bluetooth.le.ScanSettings j(BluetoothAdapter bluetoothAdapter, ScanSettings scanSettings, boolean z) {
        android.bluetooth.le.ScanSettings.Builder builder = new android.bluetooth.le.ScanSettings.Builder();
        if (z || (bluetoothAdapter.isOffloadedScanBatchingSupported() && scanSettings.l())) {
            builder.setReportDelay(scanSettings.j());
        }
        if (z || scanSettings.m()) {
            builder.setCallbackType(scanSettings.c()).setMatchMode(scanSettings.g()).setNumOfMatches(scanSettings.h());
        }
        builder.setScanMode(scanSettings.k()).setLegacy(scanSettings.d()).setPhy(scanSettings.i());
        return builder.build();
    }

    public void k(PendingIntent pendingIntent, a aVar) {
        synchronized (this.c) {
            this.c.put(pendingIntent, aVar);
        }
    }

    public ScanFilter l(android.bluetooth.le.ScanFilter scanFilter) {
        ScanFilter.b bVar = new ScanFilter.b();
        bVar.b(scanFilter.getDeviceAddress()).c(scanFilter.getDeviceName()).i(scanFilter.getServiceUuid(), scanFilter.getServiceUuidMask()).e(scanFilter.getManufacturerId(), scanFilter.getManufacturerData(), scanFilter.getManufacturerDataMask());
        if (scanFilter.getServiceDataUuid() != null) {
            bVar.g(scanFilter.getServiceDataUuid(), scanFilter.getServiceData(), scanFilter.getServiceDataMask());
        }
        return bVar.a();
    }

    public ArrayList<ScanFilter> m(List<android.bluetooth.le.ScanFilter> list) {
        ArrayList<ScanFilter> arrayList = new ArrayList<>();
        Iterator<android.bluetooth.le.ScanFilter> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(l(it.next()));
        }
        return arrayList;
    }

    public ScanSettings n(android.bluetooth.le.ScanSettings scanSettings, boolean z, boolean z2, boolean z3, long j, long j2, int i, int i2) {
        return new ScanSettings.b().d(scanSettings.getLegacy()).h(scanSettings.getPhy()).c(scanSettings.getCallbackType()).j(scanSettings.getScanMode()).i(scanSettings.getReportDelayMillis()).k(z).m(z2).l(z3).f(j, j2).e(i).g(i2).a();
    }

    public a o(PendingIntent pendingIntent) {
        synchronized (this.c) {
            try {
                if (!this.c.containsKey(pendingIntent)) {
                    return null;
                }
                a aVar = this.c.get(pendingIntent);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("Scanning has been stopped");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
