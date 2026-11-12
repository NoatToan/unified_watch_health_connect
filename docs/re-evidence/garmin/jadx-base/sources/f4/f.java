package f4;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.u0;
import p3.q1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\fB\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0015\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lf4/f;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Lf4/j;", "invalid", "<init>", "(JLf4/j;)V", "", TtmlNode.ATTR_ID, "(ILf4/j;)V", "a", "Lf4/a;", "Lf4/c;", "Lf4/e;", "Lf4/n0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f68735e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f68736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f68737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f68738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f68739d;

    private f(long j8, j jVar) {
        int iA;
        int iNumberOfTrailingZeros;
        this.f68736a = jVar;
        this.f68737b = j8;
        f21.g0 g0Var = l.f68773a;
        if (j8 != 0) {
            j f68736a = getF68736a();
            long j14 = f68736a.f68755c;
            long[] jArr = f68736a.f68756d;
            if (jArr != null) {
                j8 = jArr[0];
            } else {
                long j15 = f68736a.f68754b;
                if (j15 != 0) {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j15);
                } else {
                    long j16 = f68736a.f68753a;
                    if (j16 != 0) {
                        j14 += (long) 64;
                        iNumberOfTrailingZeros = Long.numberOfTrailingZeros(j16);
                    }
                }
                j8 = ((long) iNumberOfTrailingZeros) + j14;
            }
            synchronized (l.f68775c) {
                iA = l.f68778f.a(j8);
            }
        } else {
            iA = -1;
        }
        this.f68739d = iA;
    }

    public static void q(f fVar) {
        l.f68774b.b(fVar);
    }

    public final void a() {
        synchronized (l.f68775c) {
            b();
            p();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void b() {
        l.f68776d = l.f68776d.b(getF68737b());
    }

    public void c() {
        this.f68738c = true;
        synchronized (l.f68775c) {
            o();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public j getF68736a() {
        return this.f68736a;
    }

    /* JADX INFO: renamed from: e */
    public abstract e23.l<Object, Unit> getF68793s();

    public abstract boolean f();

    /* JADX INFO: renamed from: g, reason: from getter */
    public long getF68737b() {
        return this.f68737b;
    }

    public int h() {
        return 0;
    }

    public abstract e23.l<Object, Unit> i();

    public final f j() {
        z3.m<f> mVar = l.f68774b;
        f fVarA = mVar.a();
        mVar.b(this);
        return fVarA;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(g0 g0Var);

    public final void o() {
        int i14 = this.f68739d;
        if (i14 >= 0) {
            l.t(i14);
            this.f68739d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(j jVar) {
        this.f68736a = jVar;
    }

    public void s(long j8) {
        this.f68737b = j8;
    }

    public void t(int i14) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract f u(e23.l<Object, Unit> lVar);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf4/f$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a() {
            return l.f68774b.a();
        }

        public static f b(f fVar) {
            if (fVar instanceof m0) {
                m0 m0Var = (m0) fVar;
                if (m0Var.f68795u == z3.k.a()) {
                    m0Var.f68793s = null;
                    return fVar;
                }
            }
            if (fVar instanceof n0) {
                n0 n0Var = (n0) fVar;
                if (n0Var.f68800j == z3.k.a()) {
                    n0Var.f68799i = null;
                    return fVar;
                }
            }
            f fVarF = l.f(fVar, null, false);
            fVarF.j();
            return fVarF;
        }

        public static Object c(cw1.k0 k0Var, e23.a aVar) {
            f m0Var;
            f fVarA = l.f68774b.a();
            if (fVarA instanceof m0) {
                m0 m0Var2 = (m0) fVarA;
                if (m0Var2.f68795u == z3.k.a()) {
                    e23.l<Object, Unit> lVar = m0Var2.f68793s;
                    e23.l<Object, Unit> lVar2 = m0Var2.f68794t;
                    try {
                        ((m0) fVarA).f68793s = l.j(k0Var, true, lVar);
                        ((m0) fVarA).f68794t = lVar2;
                        return aVar.invoke();
                    } finally {
                        m0Var2.f68793s = lVar;
                        m0Var2.f68794t = lVar2;
                    }
                }
            }
            if (fVarA == null || (fVarA instanceof f4.a)) {
                m0Var = new m0(fVarA instanceof f4.a ? (f4.a) fVarA : null, k0Var, null, true, false);
            } else {
                m0Var = fVarA.u(k0Var);
            }
            try {
                f fVarJ = m0Var.j();
                try {
                    Object objInvoke = aVar.invoke();
                    f.q(fVarJ);
                    m0Var.c();
                    return objInvoke;
                } catch (Throwable th3) {
                    f.q(fVarJ);
                    throw th3;
                }
            } catch (Throwable th4) {
                m0Var.c();
                throw th4;
            }
        }

        public static en0.n d(e23.p pVar) {
            l.d(l.f68773a);
            synchronized (l.f68775c) {
                l.f68780h = p13.h0.D0(l.f68780h, pVar);
                Unit unit = Unit.INSTANCE;
            }
            return new en0.n(pVar, 14);
        }

        public static void e(f fVar, f fVar2, e23.l lVar) {
            if (fVar != fVar2) {
                fVar2.getClass();
                f.q(fVar);
                fVar2.c();
            } else if (fVar instanceof m0) {
                ((m0) fVar).f68793s = lVar;
            } else if (fVar instanceof n0) {
                ((n0) fVar).f68799i = lVar;
            } else {
                ds.e0.t(fVar, "Non-transparent snapshot was reused: ");
            }
        }

        public static void f() {
            boolean z14;
            synchronized (l.f68775c) {
                u0<g0> u0Var = l.f68782j.f68710i;
                z14 = false;
                if (u0Var != null && u0Var.c()) {
                    z14 = true;
                }
            }
            if (z14) {
                l.d(l.f68773a);
            }
        }

        public static f4.a g(q1 q1Var, o50.a aVar) {
            f4.a aVarC;
            f fVarI = l.i();
            f4.a aVar2 = fVarI instanceof f4.a ? (f4.a) fVarI : null;
            if (aVar2 != null && (aVarC = aVar2.C(q1Var, aVar)) != null) {
                return aVarC;
            }
            vb.h.z("Cannot create a mutable snapshot of an read-only snapshot");
            return null;
        }

        private a() {
        }
    }

    public /* synthetic */ f(long j8, j jVar, p005kotlin.jvm.internal.j jVar2) {
        this(j8, jVar);
    }

    public /* synthetic */ f(int i14, j jVar, p005kotlin.jvm.internal.j jVar2) {
        this(i14, jVar);
    }

    @o13.e
    private f(int i14, j jVar) {
        this(i14, jVar, (p005kotlin.jvm.internal.j) null);
    }
}
