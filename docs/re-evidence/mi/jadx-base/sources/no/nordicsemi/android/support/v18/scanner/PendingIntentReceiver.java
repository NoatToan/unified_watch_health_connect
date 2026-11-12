package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class PendingIntentReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    @RequiresApi(api = 26)
    public void onReceive(Context context, Intent intent) {
        PendingIntent pendingIntent;
        c.a aVarO;
        c cVar;
        if (context == null || intent == null || (pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT")) == null) {
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
        android.bluetooth.le.ScanSettings scanSettings = (android.bluetooth.le.ScanSettings) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
        if (parcelableArrayListExtra == null || scanSettings == null) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_BATCHING", true);
        boolean booleanExtra2 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_FILTERING", true);
        boolean booleanExtra3 = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_USE_HARDWARE_CALLBACK_TYPES", true);
        long longExtra = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_TIMEOUT", 10000L);
        long longExtra2 = intent.getLongExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_LOST_INTERVAL", 10000L);
        int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_MATCH_MODE", 1);
        int intExtra2 = intent.getIntExtra("no.nordicsemi.android.support.v18.EXTRA_NUM_OF_MATCHES", 3);
        a aVarA = a.a();
        c cVar2 = (c) aVarA;
        ArrayList<ScanFilter> arrayListM = cVar2.m(parcelableArrayListExtra);
        ScanSettings scanSettingsN = cVar2.n(scanSettings, booleanExtra, booleanExtra2, booleanExtra3, longExtra, longExtra2, intExtra, intExtra2);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        boolean zIsOffloadedScanBatchingSupported = defaultAdapter.isOffloadedScanBatchingSupported();
        boolean zIsOffloadedFilteringSupported = defaultAdapter.isOffloadedFilteringSupported();
        synchronized (aVarA) {
            try {
                try {
                    aVarO = cVar2.o(pendingIntent);
                    if (aVarO == null) {
                        cVar = cVar2;
                        c.a aVar = new c.a(zIsOffloadedScanBatchingSupported, zIsOffloadedFilteringSupported, arrayListM, scanSettingsN, pendingIntent);
                        cVar.k(pendingIntent, aVar);
                        aVarO = aVar;
                    } else {
                        cVar = cVar2;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        aVarO.n.a(context);
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("android.bluetooth.le.extra.LIST_SCAN_RESULT");
        if (parcelableArrayListExtra2 != null) {
            ArrayList<ScanResult> arrayListG = cVar.g(parcelableArrayListExtra2);
            if (scanSettingsN.j() > 0) {
                aVarO.h(arrayListG);
            } else if (!arrayListG.isEmpty()) {
                aVarO.g(intent.getIntExtra("android.bluetooth.le.extra.CALLBACK_TYPE", 1), arrayListG.get(0));
            }
        } else {
            int intExtra3 = intent.getIntExtra("android.bluetooth.le.extra.ERROR_CODE", 0);
            if (intExtra3 != 0) {
                aVarO.f(intExtra3);
            }
        }
        aVarO.n.a(null);
    }
}
