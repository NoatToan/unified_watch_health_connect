package ve;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Collections;
import java.util.List;
import r53.m1;

/* JADX INFO: loaded from: classes7.dex */
public class t0 extends ue.i0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static t0 f177601l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static t0 f177602m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Object f177603n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f177604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.work.a f177605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f177606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ef.b f177607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<r> f177608f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f177609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final df.p f177610h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f177611i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f177612j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final af.m f177613k;

    static {
        ue.u.b("WorkManagerImpl");
        f177601l = null;
        f177602m = null;
        f177603n = new Object();
    }

    public t0(Context context, final androidx.work.a aVar, ef.b bVar, final WorkDatabase workDatabase, final List<r> list, p pVar, af.m mVar) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext.isDeviceProtectedStorage()) {
            vb.h.z("Cannot initialize WorkManager in direct boot mode");
            throw null;
        }
        ue.u.a aVar2 = new ue.u.a(aVar.f11443i);
        synchronized (ue.u.f170121a) {
            try {
                if (ue.u.f170122b == null) {
                    ue.u.f170122b = aVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f177604b = applicationContext;
        this.f177607e = bVar;
        this.f177606d = workDatabase;
        this.f177609g = pVar;
        this.f177613k = mVar;
        this.f177605c = aVar;
        this.f177608f = list;
        bVar.getClass();
        o53.z zVarA = bVar.a();
        zVarA.getClass();
        u53.d dVarA = o53.c0.a(zVarA);
        this.f177610h = new df.p(workDatabase);
        final df.r rVarD = bVar.d();
        int i14 = t.f177600a;
        pVar.a(new e() { // from class: ve.s
            @Override // ve.e
            public final void b(cf.m mVar2, boolean z14) {
                int i15 = t.f177600a;
                rVarD.execute(new at0.c(list, mVar2, aVar, workDatabase, 21));
            }
        });
        bVar.b(new ForceStopRunnable(applicationContext, this));
        int i15 = b0.f177544b;
        workDatabase.getClass();
        if (df.q.a(applicationContext, aVar)) {
            r53.s.C(new m1(r53.s.s(r53.s.o(new r53.z(workDatabase.j().A(), new z(null)))), new a0(applicationContext, null)), dVarA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static t0 g(Context context) {
        t0 t0VarG;
        Object obj = f177603n;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        t0VarG = f177601l;
                        if (t0VarG == null) {
                            t0VarG = f177602m;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return t0VarG;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (t0VarG == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof androidx.work.a.c)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            h(applicationContext, ((androidx.work.a.c) applicationContext).a());
            t0VarG = g(applicationContext);
        }
        return t0VarG;
    }

    public static void h(Context context, androidx.work.a aVar) {
        synchronized (f177603n) {
            try {
                t0 t0Var = f177601l;
                if (t0Var != null && f177602m != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (t0Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f177602m == null) {
                        f177602m = androidx.work.impl.a.a(applicationContext, aVar);
                    }
                    f177601l = f177602m;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // ue.i0
    public final c0 b(String str, ue.l lVar, List list) {
        if (!list.isEmpty()) {
            return new c0(this, str, lVar, list);
        }
        vb.h.s("beginUniqueWork needs at least one OneTimeWorkRequest.");
        return null;
    }

    public final ue.z d(String str) {
        ue.d dVar = this.f177605c.f11448n;
        String strConcat = "CancelWorkByTag_".concat(str);
        df.r rVarD = this.f177607e.d();
        rVarD.getClass();
        return ue.a0.a(dVar, strConcat, rVarD, new df.c(this, str));
    }

    public final ue.z e(String str) {
        ue.d dVar = this.f177605c.f11448n;
        String strConcat = "CancelWorkByName_".concat(str);
        df.r rVarD = this.f177607e.d();
        rVarD.getClass();
        return ue.a0.a(dVar, strConcat, rVarD, new df.c(str, this));
    }

    public final ue.y f(String str, ue.k kVar, ue.c0 c0Var) {
        if (kVar != ue.k.UPDATE) {
            return new c0(this, str, kVar == ue.k.KEEP ? ue.l.KEEP : ue.l.REPLACE, Collections.singletonList(c0Var)).a();
        }
        c0Var.getClass();
        ue.d dVar = this.f177605c.f11448n;
        String strConcat = "enqueueUniquePeriodic_".concat(str);
        df.r rVarD = this.f177607e.d();
        rVarD.getClass();
        return ue.a0.a(dVar, strConcat, rVarD, new ug2.b0(this, 7, str, c0Var));
    }

    public final void i() {
        synchronized (f177603n) {
            try {
                this.f177611i = true;
                BroadcastReceiver.PendingResult pendingResult = this.f177612j;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f177612j = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void j() {
        ue.d dVar = this.f177605c.f11448n;
        vc0.v vVar = new vc0.v(this, 6);
        dVar.getClass();
        boolean zC = dVar.c();
        if (zC) {
            try {
                dVar.a("ReschedulingWork");
            } finally {
                if (zC) {
                    dVar.b();
                }
            }
        }
        vVar.invoke();
    }
}
