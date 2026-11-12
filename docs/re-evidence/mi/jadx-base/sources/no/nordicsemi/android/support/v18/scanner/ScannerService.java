package no.nordicsemi.android.support.v18.scanner;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.RequiresPermission;
import defpackage.mqh;
import defpackage.sbl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ScannerService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f28179a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public HashMap<Integer, sbl> f28180b;
    public Handler c;

    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public final void a(List<ScanFilter> list, ScanSettings scanSettings, PendingIntent pendingIntent, int i) {
        mqh mqhVar = new mqh(pendingIntent, scanSettings, this);
        synchronized (this.f28179a) {
            this.f28180b.put(Integer.valueOf(i), mqhVar);
        }
        try {
            a.a().c(list, scanSettings, mqhVar, this.c);
        } catch (Exception unused) {
        }
    }

    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public final void b(int i) {
        sbl sblVarRemove;
        boolean zIsEmpty;
        synchronized (this.f28179a) {
            sblVarRemove = this.f28180b.remove(Integer.valueOf(i));
            zIsEmpty = this.f28180b.isEmpty();
        }
        if (sblVarRemove == null) {
            return;
        }
        try {
            a.a().d(sblVarRemove);
        } catch (Exception unused) {
        }
        if (zIsEmpty) {
            stopSelf();
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.f28180b = new HashMap<>();
        this.c = new Handler();
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public void onDestroy() {
        a aVarA = a.a();
        Iterator<sbl> it = this.f28180b.values().iterator();
        while (it.hasNext()) {
            try {
                aVarA.d(it.next());
            } catch (Exception unused) {
            }
        }
        this.f28180b.clear();
        this.f28180b = null;
        this.c = null;
        super.onDestroy();
    }

    @Override // android.app.Service
    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public int onStartCommand(Intent intent, int i, int i2) {
        boolean zContainsKey;
        boolean zIsEmpty;
        if (intent != null) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_PENDING_INTENT");
            int intExtra = intent.getIntExtra("no.nordicsemi.android.support.v18.REQUEST_CODE", 0);
            boolean booleanExtra = intent.getBooleanExtra("no.nordicsemi.android.support.v18.EXTRA_START", false);
            boolean z = !booleanExtra;
            if (pendingIntent == null) {
                synchronized (this.f28179a) {
                    zIsEmpty = this.f28180b.isEmpty();
                }
                if (zIsEmpty) {
                    stopSelf();
                }
                return 2;
            }
            synchronized (this.f28179a) {
                zContainsKey = this.f28180b.containsKey(Integer.valueOf(intExtra));
            }
            if (booleanExtra && !zContainsKey) {
                List<ScanFilter> parcelableArrayListExtra = intent.getParcelableArrayListExtra("no.nordicsemi.android.support.v18.EXTRA_FILTERS");
                ScanSettings scanSettingsA = (ScanSettings) intent.getParcelableExtra("no.nordicsemi.android.support.v18.EXTRA_SETTINGS");
                if (parcelableArrayListExtra == null) {
                    parcelableArrayListExtra = Collections.emptyList();
                }
                if (scanSettingsA == null) {
                    scanSettingsA = new ScanSettings.b().a();
                }
                a(parcelableArrayListExtra, scanSettingsA, pendingIntent, intExtra);
            } else if (z && zContainsKey) {
                b(intExtra);
            }
        }
        return 2;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
    }
}
