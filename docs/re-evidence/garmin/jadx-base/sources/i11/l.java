package i11;

import c2.a0;
import c2.t2;
import e23.q;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b11.q f87098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21.e f87099c;

    public /* synthetic */ l(b11.q qVar, v21.e eVar, int i14) {
        this.f87097a = i14;
        this.f87098b = qVar;
        this.f87099c = eVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f87097a;
        b11.q qVar = this.f87098b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    i53.c<b11.q> cVar = qVar.f14371e;
                    int i16 = qVar.f14370d;
                    int i17 = qVar.f14369c;
                    int i18 = qVar.f14367a;
                    boolean zIsEmpty = cVar.isEmpty();
                    v21.e eVar = this.f87099c;
                    if (zIsEmpty) {
                        mVar.C(-539774769);
                        h.a(null, y.Q(mVar, i18), v21.e.e(eVar, qVar.f14368b, y.Q(mVar, i17), false, false, 28), v21.e.e(eVar, qVar.f14368b, y.Q(mVar, i16), false, true, 20), mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-541273216);
                        h.b(y.Q(mVar, i18), v21.e.e(eVar, qVar.f14368b, y.Q(mVar, i17), false, false, 28), v21.e.e(eVar, qVar.f14368b, y.Q(mVar, i16), false, true, 20), z3.f.c(1637720740, new l(qVar, eVar, i15), mVar), mVar, 3072);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    for (b11.q qVar2 : qVar.f14371e) {
                        String strQ = y.Q(mVar2, qVar2.f14367a);
                        Double d14 = qVar2.f14368b;
                        String strQ2 = y.Q(mVar2, qVar2.f14369c);
                        v21.e eVar2 = this.f87099c;
                        h.c(null, null, strQ, v21.e.e(eVar2, d14, strQ2, false, false, 28), v21.e.e(eVar2, qVar2.f14368b, y.Q(mVar2, qVar2.f14370d), false, true, 20), mVar2, 0, 3);
                    }
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
