package y2;

import f5.c0;
import p005kotlin.Metadata;
import p006l2.p2;
import z2.d0;
import z2.q1;
import z2.s1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly2/n;", "Ll2/p2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f194126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f194127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d0 f194128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a<c0> f194129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f194130e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f194131f;

    /* JADX WARN: Multi-variable type inference failed */
    public n(e23.a<? extends c0> aVar, q1 q1Var, long j8) {
        this.f194129d = aVar;
        this.f194130e = q1Var;
        this.f194131f = j8;
        n4.c.f123541b.getClass();
        this.f194126a = 0L;
        this.f194127b = 0L;
        d0.f201550a.getClass();
        this.f194128c = d0.a.f201552b;
    }

    @Override // p006l2.p2
    public final void a() {
    }

    @Override // p006l2.p2
    public final void b(long j8, d0 d0Var) {
        this.f194128c = d0Var;
        c0 c0VarInvoke = this.f194129d.invoke();
        if (c0VarInvoke != null) {
            if (!c0VarInvoke.isAttached()) {
                return;
            }
            this.f194130e.d(c0VarInvoke, j8, this.f194128c, true);
            this.f194126a = j8;
        }
        if (s1.a(this.f194130e, this.f194131f)) {
            n4.c.f123541b.getClass();
            this.f194127b = 0L;
        }
    }

    @Override // p006l2.p2
    public final void c() {
    }

    @Override // p006l2.p2
    public final void d(long j8) {
        c0 c0VarInvoke = this.f194129d.invoke();
        if (c0VarInvoke == null || !c0VarInvoke.isAttached()) {
            return;
        }
        q1 q1Var = this.f194130e;
        if (s1.a(q1Var, this.f194131f)) {
            long j14 = n4.c.j(this.f194127b, j8);
            this.f194127b = j14;
            long j15 = n4.c.j(this.f194126a, j14);
            if (q1Var.g(c0VarInvoke, j15, this.f194126a, this.f194128c, true)) {
                this.f194126a = j15;
                n4.c.f123541b.getClass();
                this.f194127b = 0L;
            }
        }
    }

    @Override // p006l2.p2
    public final void onCancel() {
        long j8 = this.f194131f;
        q1 q1Var = this.f194130e;
        if (s1.a(q1Var, j8)) {
            q1Var.c();
        }
    }

    @Override // p006l2.p2
    public final void onStop() {
        long j8 = this.f194131f;
        q1 q1Var = this.f194130e;
        if (s1.a(q1Var, j8)) {
            q1Var.c();
        }
    }
}
