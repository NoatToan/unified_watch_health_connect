package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.facebook.common.internal.ImmutableList;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class axh extends m00<w14<u14>, p4d> {
    public static final Class<?> H = axh.class;
    public tpo<cp5<w14<u14>>> A;
    public boolean B;
    public ImmutableList<m47> C;
    public f5d D;
    public Set<ook> E;
    public y4d F;
    public nr5 G;
    public final Resources v;
    public final m47 w;
    public final ImmutableList<m47> x;
    public final gpf<c93, u14> y;
    public c93 z;

    public axh(Resources resources, jy5 jy5Var, m47 m47Var, Executor executor, gpf<c93, u14> gpfVar, ImmutableList<m47> immutableList) {
        super(jy5Var, executor, null, null);
        this.v = resources;
        this.w = new iu5(resources, m47Var);
        this.x = immutableList;
        this.y = gpfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m00
    public void D(Drawable drawable) {
        if (drawable instanceof c57) {
            ((c57) drawable).a();
        }
    }

    public synchronized void P(y4d y4dVar) {
        try {
            y4d y4dVar2 = this.F;
            if (y4dVar2 instanceof o1a) {
                ((o1a) y4dVar2).b(y4dVar);
            } else if (y4dVar2 != null) {
                this.F = new o1a(y4dVar2, y4dVar);
            } else {
                this.F = y4dVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void Q(ook ookVar) {
        try {
            if (this.E == null) {
                this.E = new HashSet();
            }
            this.E.add(ookVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void R() {
        synchronized (this) {
            this.F = null;
        }
    }

    @Override // defpackage.m00
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public Drawable i(w14<u14> w14Var) {
        try {
            if (epa.d()) {
                epa.a("PipelineDraweeController#createDrawable");
            }
            b6i.i(w14.y(w14Var));
            u14 u14VarN = w14Var.n();
            b0(u14VarN);
            Drawable drawableA0 = a0(this.C, u14VarN);
            if (drawableA0 != null) {
                if (epa.d()) {
                    epa.b();
                }
                return drawableA0;
            }
            Drawable drawableA1 = a0(this.x, u14VarN);
            if (drawableA1 != null) {
                if (epa.d()) {
                    epa.b();
                }
                return drawableA1;
            }
            Drawable drawableA = this.w.a(u14VarN);
            if (drawableA != null) {
                if (epa.d()) {
                    epa.b();
                }
                return drawableA;
            }
            throw new UnsupportedOperationException("Unrecognized image class: " + u14VarN);
        } catch (Throwable th) {
            if (epa.d()) {
                epa.b();
            }
            throw th;
        }
    }

    @Override // defpackage.m00
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public w14<u14> k() {
        c93 c93Var;
        if (epa.d()) {
            epa.a("PipelineDraweeController#getCachedImage");
        }
        try {
            gpf<c93, u14> gpfVar = this.y;
            if (gpfVar != null && (c93Var = this.z) != null) {
                w14<u14> w14Var = gpfVar.get(c93Var);
                if (w14Var == null || w14Var.n().a().a()) {
                    return w14Var;
                }
                w14Var.close();
                return null;
            }
            return null;
        } finally {
            if (epa.d()) {
                epa.b();
            }
        }
    }

    @Override // defpackage.m00
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public int r(w14<u14> w14Var) {
        if (w14Var != null) {
            return w14Var.p();
        }
        return 0;
    }

    @Override // defpackage.m00
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public p4d s(w14<u14> w14Var) {
        b6i.i(w14.y(w14Var));
        return w14Var.n();
    }

    public synchronized ook W() {
        try {
            z4d z4dVar = this.F != null ? new z4d(p(), this.F) : null;
            Set<ook> set = this.E;
            if (set == null) {
                return z4dVar;
            }
            v1a v1aVar = new v1a(set);
            if (z4dVar != null) {
                v1aVar.l(z4dVar);
            }
            return v1aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void X(tpo<cp5<w14<u14>>> tpoVar) {
        this.A = tpoVar;
        b0(null);
    }

    public void Y(tpo<cp5<w14<u14>>> tpoVar, String str, c93 c93Var, Object obj, ImmutableList<m47> immutableList, y4d y4dVar) {
        if (epa.d()) {
            epa.a("PipelineDraweeController#initialize");
        }
        super.v(str, obj);
        X(tpoVar);
        this.z = c93Var;
        g0(immutableList);
        R();
        b0(null);
        P(y4dVar);
        if (epa.d()) {
            epa.b();
        }
    }

    public synchronized void Z(d5d d5dVar) {
        try {
            f5d f5dVar = this.D;
            if (f5dVar != null) {
                f5dVar.f();
            }
            if (d5dVar != null) {
                if (this.D == null) {
                    this.D = new f5d(AwakeTimeSinceBootClock.get(), this);
                }
                this.D.a(d5dVar);
                this.D.g(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable a0(ImmutableList<m47> immutableList, u14 u14Var) {
        Drawable drawableA;
        if (immutableList == null) {
            return null;
        }
        for (m47 m47Var : immutableList) {
            if (m47Var.b(u14Var) && (drawableA = m47Var.a(u14Var)) != null) {
                return drawableA;
            }
        }
        return null;
    }

    public final void b0(u14 u14Var) {
        ibl iblVarA;
        if (this.B) {
            if (m() == null) {
                jr5 jr5Var = new jr5();
                u4d u4dVar = new u4d(jr5Var);
                this.G = new nr5();
                h(u4dVar);
                I(jr5Var);
            }
            if (this.F == null) {
                P(this.G);
            }
            if (m() instanceof jr5) {
                jr5 jr5Var2 = (jr5) m();
                jr5Var2.f(p());
                h57 h57VarD = d();
                rbl.b bVarR = null;
                if (h57VarD != null && (iblVarA = rbl.a(h57VarD.b())) != null) {
                    bVarR = iblVarA.r();
                }
                jr5Var2.j(bVarR);
                jr5Var2.i(this.G.b());
                if (u14Var == null) {
                    jr5Var2.e();
                } else {
                    jr5Var2.g(u14Var.getWidth(), u14Var.getHeight());
                    jr5Var2.h(u14Var.b());
                }
            }
        }
    }

    @Override // defpackage.m00, defpackage.g57
    public void c(h57 h57Var) {
        super.c(h57Var);
        b0(null);
    }

    @Override // defpackage.m00
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void A(String str, w14<u14> w14Var) {
        super.A(str, w14Var);
        synchronized (this) {
            try {
                y4d y4dVar = this.F;
                if (y4dVar != null) {
                    y4dVar.a(str, 5, true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m00
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void F(w14<u14> w14Var) {
        w14.l(w14Var);
    }

    public synchronized void e0(y4d y4dVar) {
        try {
            y4d y4dVar2 = this.F;
            if (y4dVar2 instanceof o1a) {
                ((o1a) y4dVar2).c(y4dVar);
            } else if (y4dVar2 != null) {
                this.F = new o1a(y4dVar2, y4dVar);
            } else {
                this.F = y4dVar;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f0(ook ookVar) {
        Set<ook> set = this.E;
        if (set == null) {
            return;
        }
        set.remove(ookVar);
    }

    public void g0(ImmutableList<m47> immutableList) {
        this.C = immutableList;
    }

    public void h0(boolean z) {
        this.B = z;
    }

    @Override // defpackage.m00
    public cp5<w14<u14>> n() {
        if (epa.d()) {
            epa.a("PipelineDraweeController#getDataSource");
        }
        if (cm8.o(2)) {
            cm8.r(H, "controller %x: getDataSource", Integer.valueOf(System.identityHashCode(this)));
        }
        cp5<w14<u14>> cp5Var = this.A.get();
        if (epa.d()) {
            epa.b();
        }
        return cp5Var;
    }

    @Override // defpackage.m00
    public String toString() {
        return i4h.d(this).b("super", super.toString()).b("dataSourceSupplier", this.A).toString();
    }
}
