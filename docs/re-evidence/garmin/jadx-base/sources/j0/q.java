package j0;

import androidx.lifecycle.s0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import h0.r0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B#\u0012\u0006\u0010\u0004\u001a\u00028\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lj0/q;", "I", "O", "Landroidx/lifecycle/w0;", "initialValue", "Lp/a;", "mapFunction", "<init>", "(Ljava/lang/Object;Lp/a;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class q<I, O> extends w0<O> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f95959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p.a<I, O> f95960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s0<I> f95961o;

    public q(O o7, p.a<I, O> aVar) {
        aVar.getClass();
        this.f95959m = o7;
        this.f95960n = aVar;
    }

    public static void p(q qVar, s0 s0Var) {
        super.n(s0Var, new iz1.g(new iz1.f(qVar, 2), 1));
    }

    @Override // androidx.lifecycle.s0
    public final O d() {
        s0<I> s0Var = this.f95961o;
        return s0Var == null ? this.f95959m : this.f95960n.mo330apply(s0Var.d());
    }

    @Override // androidx.lifecycle.w0
    public final <S> void n(s0<S> s0Var, z0<? super S> z0Var) {
        s0Var.getClass();
        throw new UnsupportedOperationException();
    }

    public final void q(s0<I> s0Var) {
        s0Var.getClass();
        s0<I> s0Var2 = this.f95961o;
        if (s0Var2 != null) {
            o(s0Var2);
        }
        this.f95961o = s0Var;
        u.c(new r0(16, this, s0Var));
    }
}
