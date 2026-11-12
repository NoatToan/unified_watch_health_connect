package we;

import af.m;
import android.content.Context;
import android.text.TextUtils;
import cf.t;
import df.q;
import java.util.HashMap;
import java.util.HashSet;
import o53.l1;
import p005kotlin.jvm.internal.s;
import ue.e0;
import ue.f;
import ue.h0;
import ue.u;
import ve.e;
import ve.p;
import ve.q0;
import ve.r;
import ve.v;
import ve.w;
import ve.x;
import ye.g;
import ye.j;
import ye.l;

/* JADX INFO: loaded from: classes7.dex */
public class c implements r, g, e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f184707a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final we.b f184709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f184710d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f184712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f184713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q0 f184714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.work.a f184715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f184716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f184717k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f184718l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ef.b f184719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f184720n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f184708b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f184711e = new Object();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f184721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f184722b;

        private b(int i14, long j8) {
            this.f184721a = i14;
            this.f184722b = j8;
        }
    }

    static {
        u.b("GreedyScheduler");
    }

    public c(Context context, androidx.work.a aVar, m mVar, p pVar, q0 q0Var, ef.b bVar) {
        v.f177616a.getClass();
        this.f184712f = new x(new w());
        this.f184716j = new HashMap();
        this.f184707a = context;
        e0 e0Var = aVar.f11441g;
        this.f184709c = new we.b(this, e0Var, aVar.f11438d);
        this.f184720n = new d(e0Var, q0Var);
        this.f184719m = bVar;
        this.f184718l = new j(mVar);
        this.f184715i = aVar;
        this.f184713g = pVar;
        this.f184714h = q0Var;
    }

    @Override // ve.r
    public final boolean a() {
        return false;
    }

    @Override // ve.e
    public final void b(cf.m mVar, boolean z14) {
        l1 l1Var;
        ve.u uVarB = this.f184712f.b(mVar);
        if (uVarB != null) {
            this.f184720n.a(uVarB);
        }
        synchronized (this.f184711e) {
            l1Var = (l1) this.f184708b.remove(mVar);
        }
        if (l1Var != null) {
            u uVarA = u.a();
            mVar.toString();
            uVarA.getClass();
            l1Var.c(null);
        }
        if (z14) {
            return;
        }
        synchronized (this.f184711e) {
            this.f184716j.remove(mVar);
        }
    }

    @Override // ve.r
    public final void c(String str) {
        Runnable runnable;
        if (this.f184717k == null) {
            this.f184717k = Boolean.valueOf(q.a(this.f184707a, this.f184715i));
        }
        if (!this.f184717k.booleanValue()) {
            u.a().getClass();
            return;
        }
        if (!this.f184710d) {
            this.f184713g.a(this);
            this.f184710d = true;
        }
        u.a().getClass();
        we.b bVar = this.f184709c;
        if (bVar != null && (runnable = (Runnable) bVar.f184706d.remove(str)) != null) {
            bVar.f184704b.b(runnable);
        }
        for (ve.u uVar : this.f184712f.remove(str)) {
            this.f184720n.a(uVar);
            this.f184714h.c(uVar, -512);
        }
    }

    @Override // ye.g
    public final void d(t tVar, ye.b bVar) {
        cf.m mVarW = jg.b.w(tVar);
        boolean z14 = bVar instanceof ye.b.a;
        q0 q0Var = this.f184714h;
        d dVar = this.f184720n;
        v vVar = this.f184712f;
        if (z14) {
            if (vVar.a(mVarW)) {
                return;
            }
            u uVarA = u.a();
            mVarW.toString();
            uVarA.getClass();
            ve.u uVarC = vVar.c(mVarW);
            dVar.b(uVarC);
            q0Var.a(uVarC);
            return;
        }
        u uVarA2 = u.a();
        mVarW.toString();
        uVarA2.getClass();
        ve.u uVarB = vVar.b(mVarW);
        if (uVarB != null) {
            dVar.a(uVarB);
            q0Var.c(uVarB, ((ye.b.C3684b) bVar).f196779a);
        }
    }

    @Override // ve.r
    public final void e(t... tVarArr) {
        long jMax;
        if (this.f184717k == null) {
            this.f184717k = Boolean.valueOf(q.a(this.f184707a, this.f184715i));
        }
        if (!this.f184717k.booleanValue()) {
            u.a().getClass();
            return;
        }
        if (!this.f184710d) {
            this.f184713g.a(this);
            this.f184710d = true;
        }
        HashSet<t> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (t tVar : tVarArr) {
            if (!this.f184712f.a(jg.b.w(tVar))) {
                synchronized (this.f184711e) {
                    try {
                        cf.m mVarW = jg.b.w(tVar);
                        b bVar = (b) this.f184716j.get(mVarW);
                        if (bVar == null) {
                            bVar = new b(tVar.f26951k, this.f184715i.f11438d.currentTimeMillis());
                            this.f184716j.put(mVarW, bVar);
                        }
                        jMax = (((long) Math.max((tVar.f26951k - bVar.f184721a) - 5, 0)) * 30000) + bVar.f184722b;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                long jMax2 = Math.max(tVar.a(), jMax);
                long jCurrentTimeMillis = this.f184715i.f11438d.currentTimeMillis();
                if (tVar.f26942b == h0.c.ENQUEUED) {
                    if (jCurrentTimeMillis < jMax2) {
                        we.b bVar2 = this.f184709c;
                        if (bVar2 != null) {
                            e0 e0Var = bVar2.f184704b;
                            HashMap map = bVar2.f184706d;
                            Runnable runnable = (Runnable) map.remove(tVar.f26941a);
                            if (runnable != null) {
                                e0Var.b(runnable);
                            }
                            we.a aVar = new we.a(bVar2, tVar);
                            map.put(tVar.f26941a, aVar);
                            e0Var.a(jMax2 - bVar2.f184705c.currentTimeMillis(), aVar);
                        }
                    } else if (!s.g(f.f170042j, tVar.f26950j)) {
                        f fVar = tVar.f26950j;
                        if (fVar.f170046d) {
                            u uVarA = u.a();
                            tVar.toString();
                            uVarA.getClass();
                        } else if (fVar.f170051i.isEmpty()) {
                            hashSet.add(tVar);
                            hashSet2.add(tVar.f26941a);
                        } else {
                            u uVarA2 = u.a();
                            tVar.toString();
                            uVarA2.getClass();
                        }
                    } else if (!this.f184712f.a(jg.b.w(tVar))) {
                        u.a().getClass();
                        v vVar = this.f184712f;
                        vVar.getClass();
                        ve.u uVarC = vVar.c(jg.b.w(tVar));
                        this.f184720n.b(uVarC);
                        this.f184714h.a(uVarC);
                    }
                }
            }
        }
        synchronized (this.f184711e) {
            try {
                if (!hashSet.isEmpty()) {
                    TextUtils.join(",", hashSet2);
                    u.a().getClass();
                    for (t tVar2 : hashSet) {
                        cf.m mVarW2 = jg.b.w(tVar2);
                        if (!this.f184708b.containsKey(mVarW2)) {
                            this.f184708b.put(mVarW2, l.a(this.f184718l, tVar2, this.f184719m.a(), this));
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
