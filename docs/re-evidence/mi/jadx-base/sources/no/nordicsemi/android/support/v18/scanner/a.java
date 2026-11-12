package no.nordicsemi.android.support.v18.scanner;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.RequiresPermission;
import defpackage.sbl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f28181a;

    /* JADX INFO: renamed from: no.nordicsemi.android.support.v18.scanner.a$a, reason: collision with other inner class name */
    public static class C1049a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f28183b;
        public final boolean c;
        public final boolean d;
        public final List<ScanFilter> f;
        public final ScanSettings g;
        public final sbl h;
        public final Handler i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f28182a = new Object();
        public final List<ScanResult> j = new ArrayList();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Set<String> f28184k = new HashSet();
        public final Map<String, ScanResult> l = new HashMap();
        public final Runnable m = new RunnableC1050a();
        public boolean e = false;

        /* JADX INFO: renamed from: no.nordicsemi.android.support.v18.scanner.a$a$a, reason: collision with other inner class name */
        public class RunnableC1050a implements Runnable {
            public RunnableC1050a() {
            }

            public final /* synthetic */ void b(ScanResult scanResult) {
                C1049a.this.h.onScanResult(4, scanResult);
            }

            @Override // java.lang.Runnable
            public void run() {
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                synchronized (C1049a.this.f28182a) {
                    try {
                        Iterator it = C1049a.this.l.values().iterator();
                        while (it.hasNext()) {
                            final ScanResult scanResult = (ScanResult) it.next();
                            if (scanResult.e() < jElapsedRealtimeNanos - C1049a.this.g.e()) {
                                it.remove();
                                C1049a.this.i.post(new Runnable() { // from class: j23
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f22344a.b(scanResult);
                                    }
                                });
                            }
                        }
                        if (!C1049a.this.l.isEmpty()) {
                            C1049a c1049a = C1049a.this;
                            c1049a.i.postDelayed(this, c1049a.g.f());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: no.nordicsemi.android.support.v18.scanner.a$a$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Handler f28186a;

            public b(Handler handler) {
                this.f28186a = handler;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C1049a.this.e) {
                    return;
                }
                C1049a.this.e();
                this.f28186a.postDelayed(this, C1049a.this.g.j());
            }
        }

        public C1049a(boolean z, boolean z2, List<ScanFilter> list, ScanSettings scanSettings, sbl sblVar, Handler handler) {
            this.f = Collections.unmodifiableList(list);
            this.g = scanSettings;
            this.h = sblVar;
            this.i = handler;
            boolean z3 = false;
            this.d = (scanSettings.c() == 1 || scanSettings.m()) ? false : true;
            this.f28183b = (list.isEmpty() || (z2 && scanSettings.o())) ? false : true;
            long j = scanSettings.j();
            if (j > 0 && (!z || !scanSettings.l())) {
                z3 = true;
            }
            this.c = z3;
            if (z3) {
                handler.postDelayed(new b(handler), j);
            }
        }

        public void d() {
            this.e = true;
            this.i.removeCallbacksAndMessages(null);
            synchronized (this.f28182a) {
                this.l.clear();
                this.f28184k.clear();
                this.j.clear();
            }
        }

        public void e() {
            if (!this.c || this.e) {
                return;
            }
            synchronized (this.f28182a) {
                this.h.onBatchScanResults(new ArrayList(this.j));
                this.j.clear();
                this.f28184k.clear();
            }
        }

        public void f(int i) {
            this.h.onScanFailed(i);
        }

        public void g(int i, ScanResult scanResult) {
            boolean zIsEmpty;
            ScanResult scanResultPut;
            if (this.e) {
                return;
            }
            if (this.f.isEmpty() || i(scanResult)) {
                String address = scanResult.a().getAddress();
                if (!this.d) {
                    if (!this.c) {
                        this.h.onScanResult(i, scanResult);
                        return;
                    }
                    synchronized (this.f28182a) {
                        try {
                            if (!this.f28184k.contains(address)) {
                                this.j.add(scanResult);
                                this.f28184k.add(address);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                synchronized (this.l) {
                    zIsEmpty = this.l.isEmpty();
                    scanResultPut = this.l.put(address, scanResult);
                }
                if (scanResultPut == null && (this.g.c() & 2) > 0) {
                    this.h.onScanResult(2, scanResult);
                }
                if (!zIsEmpty || (this.g.c() & 4) <= 0) {
                    return;
                }
                this.i.removeCallbacks(this.m);
                this.i.postDelayed(this.m, this.g.f());
            }
        }

        public void h(List<ScanResult> list) {
            if (this.e) {
                return;
            }
            if (this.f28183b) {
                ArrayList arrayList = new ArrayList();
                for (ScanResult scanResult : list) {
                    if (i(scanResult)) {
                        arrayList.add(scanResult);
                    }
                }
                list = arrayList;
            }
            this.h.onBatchScanResults(list);
        }

        public final boolean i(ScanResult scanResult) {
            Iterator<ScanFilter> it = this.f.iterator();
            while (it.hasNext()) {
                if (it.next().l(scanResult)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static synchronized a a() {
        a aVar = f28181a;
        if (aVar != null) {
            return aVar;
        }
        c cVar = new c();
        f28181a = cVar;
        return cVar;
    }

    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public final void b(List<ScanFilter> list, ScanSettings scanSettings, sbl sblVar) {
        if (sblVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        Handler handler = new Handler(Looper.getMainLooper());
        if (list == null) {
            list = Collections.emptyList();
        }
        if (scanSettings == null) {
            scanSettings = new ScanSettings.b().a();
        }
        c(list, scanSettings, sblVar, handler);
    }

    @RequiresPermission(allOf = {"android.permission.BLUETOOTH_ADMIN", "android.permission.BLUETOOTH"})
    public abstract void c(List<ScanFilter> list, ScanSettings scanSettings, sbl sblVar, Handler handler);

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public final void d(sbl sblVar) {
        if (sblVar == null) {
            throw new IllegalArgumentException("callback is null");
        }
        e(sblVar);
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public abstract void e(sbl sblVar);
}
