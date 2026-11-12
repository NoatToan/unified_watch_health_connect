package zs1;

import c2.x2;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import u1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class i implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f206866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f206867b;

    public i(List list, e23.l lVar) {
        this.f206866a = list;
        this.f206867b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, p3.m mVar, Integer num2) {
        int i14;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        p3.m mVar2 = mVar;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i14 = (mVar2.B(dVar2) ? 4 : 2) | iIntValue2;
        } else {
            i14 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i14 |= mVar2.k(iIntValue) ? 32 : 16;
        }
        if (mVar2.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            pt1.t tVar = (pt1.t) this.f206866a.get(iIntValue);
            mVar2.C(228051536);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            e23.l lVar = this.f206867b;
            boolean zB = mVar2.B(lVar) | mVar2.B(tVar);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new e(lVar, tVar);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new e(lVar, tVar);
                    mVar2.K(objQ);
                }
            }
            h4.r rVarD = w.d(rVarF, false, null, null, (e23.a) objQ, 15);
            pt1.q qVar = tVar.f140969c;
            gt1.r.a(rVarD, 0L, qVar, false, false, qVar.f140960h || qVar.f140959g, false, null, null, mVar2, 3072, 466);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
