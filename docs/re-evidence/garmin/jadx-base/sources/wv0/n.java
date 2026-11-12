package wv0;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class n implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f187441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f187442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.r f187443c;

    public n(List list, e23.l lVar, e23.r rVar) {
        this.f187441a = list;
        this.f187442b = lVar;
        this.f187443c = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
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
            pv0.d dVar3 = (pv0.d) this.f187441a.get(iIntValue);
            mVar2.C(-814218591);
            String str = dVar3.f141361d;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            boolean zF = pv0.f.f(dVar3);
            e23.l lVar = this.f187442b;
            boolean zB = mVar2.B(lVar) | mVar2.r(dVar3);
            Object objQ = mVar2.q();
            if (zB) {
                objQ = new j(lVar, dVar3);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new j(lVar, dVar3);
                    mVar2.K(objQ);
                }
            }
            i.i(str2, zF, (e23.a) objQ, z3.f.c(2044994477, new k(this.f187443c, dVar3), mVar2), mVar2, 3072);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
