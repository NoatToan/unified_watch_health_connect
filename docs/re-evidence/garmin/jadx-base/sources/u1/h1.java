package u1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f167532b;

    public /* synthetic */ h1(i1 i1Var, int i14) {
        this.f167531a = i14;
        this.f167532b = i1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        long jE;
        switch (this.f167531a) {
            case 0:
                this.f167532b.W1();
                return Unit.INSTANCE;
            case 1:
                return n4.c.a(this.f167532b.f167562p);
            default:
                f5.c0 c0Var = (f5.c0) this.f167532b.f167560n.getF182175a();
                if (c0Var != null) {
                    jE = f5.d0.e(c0Var);
                } else {
                    n4.c.f123541b.getClass();
                    jE = n4.c.f123543d;
                }
                return n4.c.a(jE);
        }
    }
}
