package y2;

import f5.c0;
import p005kotlin.Metadata;
import z2.d0;
import z2.q1;
import z2.s1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly2/o;", "Lz2/l;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o implements z2.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f194132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a<c0> f194133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q1 f194134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f194135d;

    /* JADX WARN: Multi-variable type inference failed */
    public o(e23.a<? extends c0> aVar, q1 q1Var, long j8) {
        this.f194133b = aVar;
        this.f194134c = q1Var;
        this.f194135d = j8;
        n4.c.f123541b.getClass();
        this.f194132a = 0L;
    }

    @Override // z2.l
    public final boolean a(long j8, d0 d0Var, int i14) {
        c0 c0VarInvoke = this.f194133b.invoke();
        if (c0VarInvoke == null || !c0VarInvoke.isAttached()) {
            return false;
        }
        q1 q1Var = this.f194134c;
        q1Var.d(c0VarInvoke, j8, d0Var, false);
        this.f194132a = j8;
        return s1.a(q1Var, this.f194135d);
    }

    @Override // z2.l
    public final void b() {
        this.f194134c.c();
    }

    @Override // z2.l
    public final boolean c(long j8) {
        c0 c0VarInvoke = this.f194133b.invoke();
        if (c0VarInvoke == null || !c0VarInvoke.isAttached()) {
            return false;
        }
        long j14 = this.f194132a;
        d0.f201550a.getClass();
        z2.c0 c0Var = d0.a.f201552b;
        q1 q1Var = this.f194134c;
        if (q1Var.g(c0VarInvoke, j8, j14, c0Var, false)) {
            this.f194132a = j8;
        }
        return s1.a(q1Var, this.f194135d);
    }

    @Override // z2.l
    public final boolean d(long j8, d0 d0Var) {
        c0 c0VarInvoke = this.f194133b.invoke();
        if (c0VarInvoke == null) {
            return true;
        }
        if (!c0VarInvoke.isAttached()) {
            return false;
        }
        q1 q1Var = this.f194134c;
        if (!s1.a(q1Var, this.f194135d)) {
            return false;
        }
        if (!q1Var.g(c0VarInvoke, j8, this.f194132a, d0Var, false)) {
            return true;
        }
        this.f194132a = j8;
        return true;
    }

    @Override // z2.l
    public final boolean e(long j8) {
        c0 c0VarInvoke = this.f194133b.invoke();
        if (c0VarInvoke == null) {
            return true;
        }
        if (!c0VarInvoke.isAttached()) {
            return false;
        }
        q1 q1Var = this.f194134c;
        if (!s1.a(q1Var, this.f194135d)) {
            return false;
        }
        long j14 = this.f194132a;
        d0.f201550a.getClass();
        if (!q1Var.g(c0VarInvoke, j8, j14, d0.a.f201552b, false)) {
            return true;
        }
        this.f194132a = j8;
        return true;
    }
}
