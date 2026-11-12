package et1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class p2 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f65757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f65758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p f65759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f65760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l f65761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.l f65762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.l f65763g;

    public p2(List list, e23.q qVar, e23.p pVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4) {
        this.f65757a = list;
        this.f65758b = qVar;
        this.f65759c = pVar;
        this.f65760d = lVar;
        this.f65761e = lVar2;
        this.f65762f = lVar3;
        this.f65763g = lVar4;
    }

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
            p3.x1 x1Var = p3.n.f135158a;
            pt1.x xVar = (pt1.x) this.f65757a.get(iIntValue);
            mVar2.C(-504713646);
            String str = xVar.f141018o;
            Object objQ = mVar2.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = h2.f65650a;
                mVar2.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            Object objQ2 = mVar2.q();
            if (objQ2 == c2565a) {
                objQ2 = i2.f65659a;
                mVar2.K(objQ2);
            }
            jt1.k.e(xVar, str, false, this.f65758b, this.f65759c, this.f65760d, this.f65761e, this.f65762f, lVar, this.f65763g, null, (e23.l) objQ2, mVar2, 100663680, 48, 1024);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
