package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import defpackage.enr;
import defpackage.m1p;
import defpackage.mwl;
import defpackage.onr;
import defpackage.ppe;
import defpackage.tf8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class d implements tf8 {
    public static final String l = ppe.i("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1p f3212b;
    public final onr c;
    public final androidx.work.impl.a d;
    public final enr e;
    public final androidx.work.impl.background.systemalarm.a f;
    public final List<Intent> g;
    public Intent h;
    public c i;
    public StartStopTokens j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final WorkLauncher f3213k;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Executor executorC;
            RunnableC0084d runnableC0084d;
            synchronized (d.this.g) {
                d dVar = d.this;
                dVar.h = dVar.g.get(0);
            }
            Intent intent = d.this.h;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.h.getIntExtra("KEY_START_ID", 0);
                ppe ppeVarE = ppe.e();
                String str = d.l;
                ppeVarE.a(str, "Processing command " + d.this.h + ", " + intExtra);
                PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(d.this.f3211a, action + " (" + intExtra + ")");
                try {
                    ppe.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockNewWakeLock);
                    wakeLockNewWakeLock.acquire();
                    d dVar2 = d.this;
                    dVar2.f.o(dVar2.h, intExtra, dVar2);
                    ppe.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockNewWakeLock);
                    wakeLockNewWakeLock.release();
                    executorC = d.this.f3212b.c();
                    runnableC0084d = new RunnableC0084d(d.this);
                } catch (Throwable th) {
                    try {
                        ppe ppeVarE2 = ppe.e();
                        String str2 = d.l;
                        ppeVarE2.d(str2, "Unexpected error in onHandleIntent", th);
                        ppe.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockNewWakeLock);
                        wakeLockNewWakeLock.release();
                        executorC = d.this.f3212b.c();
                        runnableC0084d = new RunnableC0084d(d.this);
                    } catch (Throwable th2) {
                        ppe.e().a(d.l, "Releasing operation wake lock (" + action + ") " + wakeLockNewWakeLock);
                        wakeLockNewWakeLock.release();
                        d.this.f3212b.c().execute(new RunnableC0084d(d.this));
                        throw th2;
                    }
                }
                executorC.execute(runnableC0084d);
            }
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f3215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Intent f3216b;
        public final int c;

        public b(d dVar, Intent intent, int i) {
            this.f3215a = dVar;
            this.f3216b = intent;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3215a.a(this.f3216b, this.c);
        }
    }

    public interface c {
        void b();
    }

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0084d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f3217a;

        public RunnableC0084d(d dVar) {
            this.f3217a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3217a.d();
        }
    }

    public d(Context context) {
        this(context, null, null, null);
    }

    public boolean a(Intent intent, int i) {
        ppe ppeVarE = ppe.e();
        String str = l;
        ppeVarE.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            ppe.e().k(str, "Unknown command. Ignoring");
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && j("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.g) {
            try {
                boolean z = !this.g.isEmpty();
                this.g.add(intent);
                if (!z) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    public final void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // defpackage.tf8
    public void c(WorkGenerationalId workGenerationalId, boolean z) {
        this.f3212b.c().execute(new b(this, androidx.work.impl.background.systemalarm.a.d(this.f3211a, workGenerationalId, z), 0));
    }

    public void d() {
        ppe ppeVarE = ppe.e();
        String str = l;
        ppeVarE.a(str, "Checking if commands are complete.");
        b();
        synchronized (this.g) {
            try {
                if (this.h != null) {
                    ppe.e().a(str, "Removing command " + this.h);
                    if (!this.g.remove(0).equals(this.h)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    this.h = null;
                }
                mwl mwlVarD = this.f3212b.d();
                if (!this.f.n() && this.g.isEmpty() && !mwlVarD.m()) {
                    ppe.e().a(str, "No more commands & intents.");
                    c cVar = this.i;
                    if (cVar != null) {
                        cVar.b();
                    }
                } else if (!this.g.isEmpty()) {
                    l();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public androidx.work.impl.a e() {
        return this.d;
    }

    public m1p f() {
        return this.f3212b;
    }

    public enr g() {
        return this.e;
    }

    public onr h() {
        return this.c;
    }

    public WorkLauncher i() {
        return this.f3213k;
    }

    public final boolean j(String str) {
        b();
        synchronized (this.g) {
            try {
                Iterator<Intent> it = this.g.iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAction())) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k() {
        ppe.e().a(l, "Destroying SystemAlarmDispatcher");
        this.d.p(this);
        this.i = null;
    }

    public final void l() {
        b();
        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.f3211a, "ProcessCommand");
        try {
            wakeLockNewWakeLock.acquire();
            this.e.l().b(new a());
        } finally {
            wakeLockNewWakeLock.release();
        }
    }

    public void m(c cVar) {
        if (this.i != null) {
            ppe.e().c(l, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            this.i = cVar;
        }
    }

    @VisibleForTesting
    public d(Context context, androidx.work.impl.a aVar, enr enrVar, WorkLauncher workLauncher) {
        Context applicationContext = context.getApplicationContext();
        this.f3211a = applicationContext;
        this.j = StartStopTokens.create();
        enrVar = enrVar == null ? enr.e(context) : enrVar;
        this.e = enrVar;
        this.f = new androidx.work.impl.background.systemalarm.a(applicationContext, enrVar.getConfiguration().getClock(), this.j);
        this.c = new onr(enrVar.getConfiguration().getRunnableScheduler());
        aVar = aVar == null ? enrVar.g() : aVar;
        this.d = aVar;
        m1p m1pVarL = enrVar.l();
        this.f3212b = m1pVarL;
        this.f3213k = workLauncher == null ? new WorkLauncherImpl(aVar, m1pVarL) : workLauncher;
        aVar.e(this);
        this.g = new ArrayList();
        this.h = null;
    }
}
