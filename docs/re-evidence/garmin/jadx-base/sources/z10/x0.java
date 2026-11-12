package z10;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y0 f201291b;

    public /* synthetic */ x0(y0 y0Var, int i14) {
        this.f201290a = i14;
        this.f201291b = y0Var;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f201290a;
        int i15 = 3;
        int i16 = 1;
        y0 y0Var = this.f201291b;
        switch (i14) {
            case 0:
                q92.v vVar = (q92.v) obj;
                int i17 = y0.f201310q;
                if (vVar == null) {
                    y0Var.sa();
                } else if (q92.c.c(vVar)) {
                    y0Var.f32248f = vVar;
                    y0Var.ya();
                } else if (vVar.f143783a != q92.x.DI_CONNECT_UPLOAD || y0Var.oa() == v92.e0.NO_ACTION) {
                    y0Var.ta();
                } else {
                    e1 e1Var = (e1) y0Var.f201312p.getValue();
                    androidx.lifecycle.y0 y0Var2 = new androidx.lifecycle.y0();
                    ge1.b.T(androidx.lifecycle.v1.a(e1Var), null, null, new i1(y0Var2, null), 3);
                    y0Var2.f(y0Var, new y0.a(new x0(y0Var, i16)));
                }
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                int i18 = y0.f201310q;
                if (bool == null) {
                    y0Var.sa();
                } else if (bool.booleanValue()) {
                    y0Var.ta();
                } else if (d1.f()) {
                    d1.o(y0Var, new w0(y0Var, i16));
                } else {
                    d1.q(y0Var, new w0(y0Var, 2), new w0(y0Var, i15));
                }
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                int i19 = y0.f201310q;
                if (bool2 == null) {
                    y0Var.displayFailedMessage();
                }
                y0Var.ta();
                break;
        }
        return Unit.INSTANCE;
    }
}
