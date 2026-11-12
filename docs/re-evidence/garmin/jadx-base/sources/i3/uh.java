package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uh implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f89949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f89950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f89951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f89952d;

    public /* synthetic */ uh(p3.p1 p1Var, p3.p1 p1Var2, p3.p1 p1Var3, int i14) {
        this.f89949a = i14;
        this.f89950b = p1Var;
        this.f89951c = p1Var2;
        this.f89952d = p1Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        long jB;
        switch (this.f89949a) {
            case 0:
                f5.c0 c0Var = (f5.c0) obj;
                f5.c0 c0VarC0 = c0Var.c0();
                if (c0VarC0 != null) {
                    jB = g6.n.b(c0VarC0.a());
                } else {
                    g6.k.f76003b.getClass();
                    jB = 0;
                }
                this.f89950b.setValue(g6.k.a(jB));
                n4.d dVarA = f5.d0.a(c0Var);
                p3.p1 p1Var = this.f89951c;
                p1Var.setValue(dVarA);
                this.f89952d.setValue(n4.c.a(((n4.d) p1Var.getF182175a()).f()));
                break;
            default:
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    this.f89950b.setValue(Boolean.TRUE);
                    this.f89951c.setValue(Boolean.FALSE);
                }
                this.f89952d.setValue(bool);
                break;
        }
        return Unit.INSTANCE;
    }
}
