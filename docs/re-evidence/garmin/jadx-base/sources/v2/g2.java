package v2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv2/g2;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f174995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.p<? super g6.c, ? super e23.a<s5.q0>, Unit> f174996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f174997c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f174998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p3.c2 f174999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p3.c2 f175000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p3.c2 f175001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i2.c f175002h;

    public g2() {
        c2 c2Var = new c2();
        this.f174995a = c2Var;
        this.f174997c = c2Var;
        p3.t1 t1Var = p3.t1.f135313a;
        t1Var.getClass();
        this.f174998d = new p3.c2(null, t1Var);
        this.f174999e = new p3.c2(null, t1Var);
        this.f175000f = new p3.c2(null, t1Var);
        this.f175001g = p3.p0.n(g6.f.a(0));
        this.f175002h = new i2.c();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0023  */
    public final long a(long j8) {
        n4.d dVarJ0;
        f5.c0 c0VarE = e();
        if (c0VarE == null) {
            n4.d.f123545e.getClass();
            dVarJ0 = n4.d.f123546f;
        } else {
            if (c0VarE.isAttached()) {
                f5.c0 c0VarB = b();
                dVarJ0 = c0VarB != null ? c0VarB.j0(c0VarE, true) : null;
            } else {
                n4.d.f123545e.getClass();
                dVarJ0 = n4.d.f123546f;
            }
            if (dVarJ0 == null) {
                n4.d.f123545e.getClass();
                dVarJ0 = n4.d.f123546f;
            }
        }
        return i.c(j8, dVarJ0);
    }

    public final f5.c0 b() {
        return (f5.c0) this.f175000f.getF182175a();
    }

    public final s5.q0 c() {
        return (s5.q0) this.f174997c.getF182175a();
    }

    public final int d(long j8, boolean z14) {
        s5.q0 q0VarC = c();
        if (q0VarC == null) {
            return -1;
        }
        if (z14) {
            j8 = a(j8);
        }
        return q0VarC.f157281b.g(i.e(this, j8));
    }

    public final f5.c0 e() {
        return (f5.c0) this.f174998d.getF182175a();
    }

    public final boolean f(long j8) {
        s5.q0 q0VarC = c();
        if (q0VarC == null) {
            return false;
        }
        long jE = i.e(this, a(j8));
        int iE = q0VarC.f157281b.e(Float.intBitsToFloat((int) (4294967295L & jE)));
        int i14 = (int) (jE >> 32);
        return Float.intBitsToFloat(i14) >= q0VarC.g(iE) && Float.intBitsToFloat(i14) <= q0VarC.h(iE);
    }

    public final void g(h2 h2Var, s5.x0 x0Var, boolean z14, boolean z15, p006l2.a2 a2Var) {
        c2 c2Var = this.f174995a;
        c2Var.getClass();
        int i14 = a2Var.f108344c;
        x5.v.f188954b.getClass();
        c2Var.f174910a.setValue(new c2.c(h2Var, x0Var, z14, z15, i14 == x5.v.f188958f));
    }
}
