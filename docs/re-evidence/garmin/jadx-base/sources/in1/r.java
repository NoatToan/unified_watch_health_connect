package in1;

import c2.t2;
import java.util.List;
import l72.x0;
import p005kotlin.Unit;
import p13.h0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f94552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ km1.c f94553c;

    public /* synthetic */ r(List list, km1.c cVar, int i14) {
        this.f94551a = i14;
        this.f94552b = list;
        this.f94553c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f94551a;
        km1.c cVar = this.f94553c;
        List list = this.f94552b;
        switch (i14) {
            case 0:
                h4.r rVar = (h4.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    s.l(list, rVar, cVar, mVar, ((iIntValue << 3) & 112) | (km1.c.B << 6));
                } else {
                    mVar.e();
                }
                break;
            default:
                t2 t2Var = (t2) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(t2Var) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    o13.p pVar = new o13.p(h0.e0(0, list), h0.e0(1, list));
                    en1.d dVar = (en1.d) pVar.f128594a;
                    en1.d dVar2 = (en1.d) pVar.f128595b;
                    int i15 = iIntValue2 & 14;
                    int i16 = (km1.c.B << 6) | i15;
                    s.f(t2Var, dVar, cVar, mVar2, i16);
                    if (dVar2 != null) {
                        mVar2.C(1364035313);
                        s.f(t2Var, dVar2, cVar, mVar2, i16);
                        mVar2.f();
                    } else {
                        mVar2.C(1364111697);
                        x0.f111346a.h(t2Var, mVar2, i15 | (x0.f111348c << 3));
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
