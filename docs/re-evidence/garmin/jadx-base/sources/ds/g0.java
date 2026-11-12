package ds;

import h2.o0;
import p3.a2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2.j0 f60937b;

    public /* synthetic */ g0(h2.j0 j0Var, int i14) {
        this.f60936a = i14;
        this.f60937b = j0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int iL;
        int iL2;
        switch (this.f60936a) {
            case 0:
                iL = this.f60937b.l();
                break;
            case 1:
                iL = this.f60937b.o();
                break;
            case 2:
                iL = this.f60937b.o();
                break;
            case 3:
                h2.j0 j0Var = this.f60937b;
                return Integer.valueOf(j0Var.f80935k.a() ? j0Var.f80945u.getIntValue() : j0Var.l());
            case 4:
                h2.j0 j0Var2 = this.f60937b;
                boolean zA = j0Var2.f80935k.a();
                a2 a2Var = j0Var2.f80944t;
                if (!zA) {
                    iL2 = j0Var2.l();
                } else if (a2Var.getIntValue() != -1) {
                    iL2 = a2Var.getIntValue();
                } else if (Math.abs(j0Var2.m()) >= Math.abs(Math.min(j0Var2.f80941q.s0(o0.f80983a), j0Var2.p() / 2.0f) / j0Var2.p())) {
                    boolean zBooleanValue = ((Boolean) j0Var2.J.getF182175a()).booleanValue();
                    int i14 = j0Var2.f80929e;
                    iL2 = zBooleanValue ? i14 + 1 : i14;
                } else {
                    iL2 = j0Var2.l();
                }
                iL = j0Var2.k(iL2);
                break;
            case 5:
                iL = this.f60937b.o();
                break;
            case 6:
                iL = ((Number) this.f60937b.f80946v.getF182175a()).intValue();
                break;
            case 7:
                iL = this.f60937b.l();
                break;
            case 8:
                iL = this.f60937b.l();
                break;
            case 9:
                iL = this.f60937b.l();
                break;
            case 10:
                iL = this.f60937b.l();
                break;
            default:
                iL = this.f60937b.l();
                break;
        }
        return Integer.valueOf(iL);
    }
}
