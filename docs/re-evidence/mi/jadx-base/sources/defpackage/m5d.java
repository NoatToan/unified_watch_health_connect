package defpackage;

import android.content.Context;
import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class m5d {
    public static final Class<?> t = m5d.class;
    public static m5d u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final scp f25766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k5d f25767b;
    public final x14 c;
    public yl4<c93, u14> d;
    public ecd<c93, u14> e;
    public yl4<c93, PooledByteBuffer> f;
    public ecd<c93, PooledByteBuffer> g;
    public z53 h;
    public kl9 i;
    public n3d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j5d f25768k;
    public y5d l;
    public gbi m;
    public ibi n;
    public z53 o;
    public kl9 p;
    public f0i q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h0i f25769r;
    public vb1 s;

    public m5d(k5d k5dVar) {
        if (epa.d()) {
            epa.a("ImagePipelineConfig()");
        }
        this.f25767b = (k5d) b6i.g(k5dVar);
        this.f25766a = new scp(k5dVar.j().a());
        this.c = new x14(k5dVar.e());
        if (epa.d()) {
            epa.b();
        }
    }

    public static m5d k() {
        return (m5d) b6i.h(u, "ImagePipelineFactory was not initialized!");
    }

    public static synchronized void t(k5d k5dVar) {
        try {
            if (u != null) {
                cm8.y(t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            u = new m5d(k5dVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized void u(Context context) {
        try {
            if (epa.d()) {
                epa.a("ImagePipelineFactory#initialize");
            }
            t(k5d.F(context).D());
            if (epa.d()) {
                epa.b();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public m47 a(Context context) {
        vb1 vb1VarB = b();
        if (vb1VarB == null) {
            return null;
        }
        return vb1VarB.a(context);
    }

    public final vb1 b() {
        if (this.s == null) {
            this.s = wb1.a(n(), this.f25767b.j(), c(), this.f25767b.k().p());
        }
        return this.s;
    }

    public yl4<c93, u14> c() {
        if (this.d == null) {
            this.d = kp2.a(this.f25767b.b(), this.f25767b.w(), this.f25767b.c());
        }
        return this.d;
    }

    public ecd<c93, u14> d() {
        if (this.e == null) {
            this.e = vp2.a(c(), this.f25767b.m());
        }
        return this.e;
    }

    public x14 e() {
        return this.c;
    }

    public yl4<c93, PooledByteBuffer> f() {
        if (this.f == null) {
            this.f = n98.a(this.f25767b.i(), this.f25767b.w());
        }
        return this.f;
    }

    public ecd<c93, PooledByteBuffer> g() {
        if (this.g == null) {
            this.g = p98.a(f(), this.f25767b.m());
        }
        return this.g;
    }

    public final n3d h() {
        n3d n3dVarB;
        n3d n3dVarC;
        if (this.j == null) {
            if (this.f25767b.n() != null) {
                this.j = this.f25767b.n();
            } else {
                vb1 vb1VarB = b();
                if (vb1VarB != null) {
                    n3dVarB = vb1VarB.b(this.f25767b.a());
                    n3dVarC = vb1VarB.c(this.f25767b.a());
                } else {
                    n3dVarB = null;
                    n3dVarC = null;
                }
                this.f25767b.o();
                this.j = new nv5(n3dVarB, n3dVarC, o());
            }
        }
        return this.j;
    }

    public j5d i() {
        if (this.f25768k == null) {
            this.f25768k = new j5d(q(), this.f25767b.A(), this.f25767b.s(), d(), g(), l(), r(), this.f25767b.d(), this.f25766a, upo.a(Boolean.FALSE), this.f25767b.k().l());
        }
        return this.f25768k;
    }

    public final y5d j() {
        if (this.l == null) {
            if (this.f25767b.p() == null && this.f25767b.r() == null && this.f25767b.k().m()) {
                this.l = new ucm(this.f25767b.k().d());
            } else {
                this.l = new gag(this.f25767b.k().d(), this.f25767b.k().g(), this.f25767b.p(), this.f25767b.r());
            }
        }
        return this.l;
    }

    public z53 l() {
        if (this.h == null) {
            this.h = new z53(m(), this.f25767b.y().h(this.f25767b.u()), this.f25767b.y().i(), this.f25767b.j().c(), this.f25767b.j().d(), this.f25767b.m());
        }
        return this.h;
    }

    public kl9 m() {
        if (this.i == null) {
            this.i = this.f25767b.l().a(this.f25767b.t());
        }
        return this.i;
    }

    public f0i n() {
        if (this.q == null) {
            this.q = g0i.a(this.f25767b.y(), o(), e());
        }
        return this.q;
    }

    public h0i o() {
        if (this.f25769r == null) {
            this.f25769r = i0i.a(this.f25767b.y(), this.f25767b.k().k());
        }
        return this.f25769r;
    }

    public final gbi p() {
        if (this.m == null) {
            this.m = this.f25767b.k().e().a(this.f25767b.f(), this.f25767b.y().j(), h(), this.f25767b.z(), this.f25767b.D(), this.f25767b.E(), this.f25767b.k().j(), this.f25767b.j(), this.f25767b.y().h(this.f25767b.u()), d(), g(), l(), r(), this.f25767b.d(), n(), this.f25767b.k().c(), this.f25767b.k().b(), this.f25767b.k().a(), this.f25767b.k().d(), e());
        }
        return this.m;
    }

    public final ibi q() {
        boolean zF = this.f25767b.k().f();
        if (this.n == null) {
            this.n = new ibi(this.f25767b.f().getApplicationContext().getContentResolver(), p(), this.f25767b.x(), this.f25767b.E(), this.f25767b.k().o(), this.f25766a, this.f25767b.D(), zF, this.f25767b.k().n(), this.f25767b.C(), j());
        }
        return this.n;
    }

    public final z53 r() {
        if (this.o == null) {
            this.o = new z53(s(), this.f25767b.y().h(this.f25767b.u()), this.f25767b.y().i(), this.f25767b.j().c(), this.f25767b.j().d(), this.f25767b.m());
        }
        return this.o;
    }

    public kl9 s() {
        if (this.p == null) {
            this.p = this.f25767b.l().a(this.f25767b.B());
        }
        return this.p;
    }
}
