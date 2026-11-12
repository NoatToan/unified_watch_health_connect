package by1;

import lc.m0;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ey1.a f22172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f22173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f22174d;

    public /* synthetic */ b(ey1.a aVar, m0 m0Var, p1 p1Var, int i14) {
        this.f22171a = i14;
        this.f22172b = aVar;
        this.f22173c = m0Var;
        this.f22174d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f22171a;
        p1 p1Var = this.f22174d;
        m0 m0Var = this.f22173c;
        ey1.a aVar = this.f22172b;
        switch (i14) {
            case 0:
                c cVar = c.f22175a;
                if (((dy1.p) p1Var.getF182175a()).f61595a == mx1.d.CUSTOM) {
                    aVar.R4(0);
                    lc.y.k(cy1.e.f56800a.c(), m0Var);
                } else {
                    lc.y.k(o.f22201a.c(), m0Var);
                }
                break;
            case 1:
                e eVar = e.f22178a;
                aVar.N4();
                mx1.f fVar = ((dy1.p) p1Var.getF182175a()).f61598d;
                int i15 = fVar != null ? fVar.f121398d : 0;
                for (int i16 = 0; i16 < i15; i16++) {
                    m0Var.m();
                }
                m0Var.i(new bt1.s(5), v.f22216a.c());
                break;
            default:
                x xVar = x.f22221a;
                aVar.U4(null);
                if (((dy1.p) p1Var.getF182175a()).f61595a == mx1.d.GET_FIT) {
                    lc.y.k(o.f22201a.c(), m0Var);
                } else {
                    lc.y.k(c.f22175a.c(), m0Var);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
