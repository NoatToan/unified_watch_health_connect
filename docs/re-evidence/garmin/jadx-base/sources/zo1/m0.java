package zo1;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m0 implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f206403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f206404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bp1.a f206405c;

    public m0(List list, List list2, bp1.a aVar) {
        this.f206403a = list;
        this.f206404b = list2;
        this.f206405c = aVar;
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
            x1 x1Var = p3.n.f135158a;
            yo1.b bVar = (yo1.b) this.f206403a.get(iIntValue);
            mVar2.C(1460664444);
            yo1.i iVarJ = r0.j(bVar, this.f206404b);
            if (iVarJ != null) {
                mVar2.C(1460757660);
                r0.d(bVar, iVarJ, true, this.f206405c, mVar2, yo1.b.f198415i | 384 | (yo1.i.f198488o << 3));
                mVar2.f();
            } else {
                mVar2.C(1460978690);
                mVar2.f();
            }
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
