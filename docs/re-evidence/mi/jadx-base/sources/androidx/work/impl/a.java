package androidx.work.impl;

import android.content.Context;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import defpackage.lhe;
import defpackage.m1p;
import defpackage.ni4;
import defpackage.ppe;
import defpackage.q0a;
import defpackage.r0a;
import defpackage.tf8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class a implements r0a {
    public static final String l = ppe.i("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3193b;
    public Configuration c;
    public m1p d;
    public WorkDatabase e;
    public Map<String, WorkerWrapper> g = new HashMap();
    public Map<String, WorkerWrapper> f = new HashMap();
    public Set<String> i = new HashSet();
    public final List<tf8> j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f3192a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f3194k = new Object();
    public Map<String, Set<StartStopToken>> h = new HashMap();

    public a(Context context, Configuration configuration, m1p m1pVar, WorkDatabase workDatabase) {
        this.f3193b = context;
        this.c = configuration;
        this.d = m1pVar;
        this.e = workDatabase;
    }

    public static boolean i(String str, WorkerWrapper workerWrapper, int i) {
        if (workerWrapper == null) {
            ppe.e().a(l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        workerWrapper.interrupt(i);
        ppe.e().a(l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // defpackage.r0a
    public void a(String str, q0a q0aVar) {
        synchronized (this.f3194k) {
            try {
                ppe.e().f(l, "Moving WorkSpec (" + str + ") to the foreground");
                WorkerWrapper workerWrapperRemove = this.g.remove(str);
                if (workerWrapperRemove != null) {
                    if (this.f3192a == null) {
                        PowerManager.WakeLock wakeLockNewWakeLock = WakeLocks.newWakeLock(this.f3193b, "ProcessorForegroundLck");
                        this.f3192a = wakeLockNewWakeLock;
                        wakeLockNewWakeLock.acquire();
                    }
                    this.f.put(str, workerWrapperRemove);
                    ni4.o(this.f3193b, androidx.work.impl.foreground.a.f(this.f3193b, workerWrapperRemove.getWorkGenerationalId(), q0aVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(tf8 tf8Var) {
        synchronized (this.f3194k) {
            this.j.add(tf8Var);
        }
    }

    public final WorkerWrapper f(String str) {
        WorkerWrapper workerWrapperRemove = this.f.remove(str);
        boolean z = workerWrapperRemove != null;
        if (!z) {
            workerWrapperRemove = this.g.remove(str);
        }
        this.h.remove(str);
        if (z) {
            u();
        }
        return workerWrapperRemove;
    }

    public WorkSpec g(String str) {
        synchronized (this.f3194k) {
            try {
                WorkerWrapper workerWrapperH = h(str);
                if (workerWrapperH == null) {
                    return null;
                }
                return workerWrapperH.getWorkSpec();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final WorkerWrapper h(String str) {
        WorkerWrapper workerWrapper = this.f.get(str);
        return workerWrapper == null ? this.g.get(str) : workerWrapper;
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f3194k) {
            zContains = this.i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z;
        synchronized (this.f3194k) {
            z = h(str) != null;
        }
        return z;
    }

    public final /* synthetic */ void l(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.f3194k) {
            try {
                Iterator<tf8> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().c(workGenerationalId, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ WorkSpec m(ArrayList arrayList, String str) throws Exception {
        arrayList.addAll(this.e.workTagDao().getTagsForWorkSpecId(str));
        return this.e.workSpecDao().getWorkSpec(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void n(lhe lheVar, WorkerWrapper workerWrapper) {
        boolean zBooleanValue;
        try {
            zBooleanValue = ((Boolean) lheVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        o(workerWrapper, zBooleanValue);
    }

    public final void o(WorkerWrapper workerWrapper, boolean z) {
        synchronized (this.f3194k) {
            try {
                WorkGenerationalId workGenerationalId = workerWrapper.getWorkGenerationalId();
                String workSpecId = workGenerationalId.getWorkSpecId();
                if (h(workSpecId) == workerWrapper) {
                    f(workSpecId);
                }
                ppe.e().a(l, getClass().getSimpleName() + " " + workSpecId + " executed; reschedule = " + z);
                Iterator<tf8> it = this.j.iterator();
                while (it.hasNext()) {
                    it.next().c(workGenerationalId, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void p(tf8 tf8Var) {
        synchronized (this.f3194k) {
            this.j.remove(tf8Var);
        }
    }

    public final void q(final WorkGenerationalId workGenerationalId, final boolean z) {
        this.d.c().execute(new Runnable() { // from class: bbi
            @Override // java.lang.Runnable
            public final void run() {
                this.f4020a.l(workGenerationalId, z);
            }
        });
    }

    public boolean r(StartStopToken startStopToken) {
        return s(startStopToken, null);
    }

    public boolean s(StartStopToken startStopToken, WorkerParameters.a aVar) {
        WorkGenerationalId id = startStopToken.getId();
        final String workSpecId = id.getWorkSpecId();
        final ArrayList arrayList = new ArrayList();
        WorkSpec workSpec = (WorkSpec) this.e.runInTransaction(new Callable() { // from class: zai
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f41077a.m(arrayList, workSpecId);
            }
        });
        if (workSpec == null) {
            ppe.e().k(l, "Didn't find WorkSpec for id " + id);
            q(id, false);
            return false;
        }
        synchronized (this.f3194k) {
            try {
                if (k(workSpecId)) {
                    Set<StartStopToken> set = this.h.get(workSpecId);
                    if (set.iterator().next().getId().getGeneration() == id.getGeneration()) {
                        set.add(startStopToken);
                        ppe.e().a(l, "Work " + id + " is already enqueued for processing");
                    } else {
                        q(id, false);
                    }
                    return false;
                }
                if (workSpec.getGeneration() != id.getGeneration()) {
                    q(id, false);
                    return false;
                }
                final WorkerWrapper workerWrapperBuild = new WorkerWrapper.Builder(this.f3193b, this.c, this.d, this, this.e, workSpec, arrayList).withRuntimeExtras(aVar).build();
                final lhe<Boolean> lheVarLaunch = workerWrapperBuild.launch();
                lheVarLaunch.addListener(new Runnable() { // from class: abi
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f861a.n(lheVarLaunch, workerWrapperBuild);
                    }
                }, this.d.c());
                this.g.put(workSpecId, workerWrapperBuild);
                HashSet hashSet = new HashSet();
                hashSet.add(startStopToken);
                this.h.put(workSpecId, hashSet);
                ppe.e().a(l, getClass().getSimpleName() + ": processing " + id);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean t(String str, int i) {
        WorkerWrapper workerWrapperF;
        synchronized (this.f3194k) {
            ppe.e().a(l, "Processor cancelling " + str);
            this.i.add(str);
            workerWrapperF = f(str);
        }
        return i(str, workerWrapperF, i);
    }

    public final void u() {
        synchronized (this.f3194k) {
            try {
                if (!(!this.f.isEmpty())) {
                    try {
                        this.f3193b.startService(androidx.work.impl.foreground.a.g(this.f3193b));
                    } catch (Throwable th) {
                        ppe.e().d(l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f3192a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f3192a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean v(StartStopToken startStopToken, int i) {
        WorkerWrapper workerWrapperF;
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.f3194k) {
            workerWrapperF = f(workSpecId);
        }
        return i(workSpecId, workerWrapperF, i);
    }

    public boolean w(StartStopToken startStopToken, int i) {
        String workSpecId = startStopToken.getId().getWorkSpecId();
        synchronized (this.f3194k) {
            try {
                if (this.f.get(workSpecId) == null) {
                    Set<StartStopToken> set = this.h.get(workSpecId);
                    if (set != null && set.contains(startStopToken)) {
                        return i(workSpecId, f(workSpecId), i);
                    }
                    return false;
                }
                ppe.e().a(l, "Ignored stopWork. WorkerWrapper " + workSpecId + " is in foreground");
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
