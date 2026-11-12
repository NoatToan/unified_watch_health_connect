package ut0;

import e2.i0;
import e23.l;
import e23.r;
import java.util.List;
import l72.j0;
import l72.n0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.x;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class e implements r<e2.d, Integer, m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f172565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f172566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f172567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f172568d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b0 f172569e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i0 f172570f;

    public e(List list, List list2, List list3, l lVar, b0 b0Var, i0 i0Var) {
        this.f172565a = list;
        this.f172566b = list2;
        this.f172567c = list3;
        this.f172568d = lVar;
        this.f172569e = b0Var;
        this.f172570f = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00e3  */
    @Override // e23.r
    public final Unit invoke(e2.d dVar, Integer num, m mVar, Integer num2) {
        int i14;
        float f14;
        float f15;
        e2.d dVar2 = dVar;
        int iIntValue = num.intValue();
        m mVar2 = mVar;
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
            x1 x1Var = n.f135158a;
            j0 j0Var = (j0) this.f172565a.get(iIntValue);
            mVar2.C(-76064566);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            if (iIntValue == 0) {
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97920e;
            } else {
                d92.b.f58625c.getClass();
                f14 = j92.b.f97899b.f97917b;
            }
            List list = this.f172566b;
            if (iIntValue == x.j(list)) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97920e;
            } else {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f15 = j92.b.f97899b.f97917b;
            }
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f16 = j92.b.f97899b.f97920e;
            h4.r rVarB = c2.l.B(aVar, f14, f16, f15, f16);
            boolean zR = mVar2.r(j0Var) | mVar2.r(list) | mVar2.r(this.f172567c) | mVar2.B(this.f172568d) | mVar2.r(this.f172569e) | mVar2.B(this.f172570f);
            Object objQ = mVar2.q();
            if (zR) {
                c cVar = new c(j0Var, this.f172566b, this.f172567c, this.f172568d, this.f172569e, this.f172570f);
                mVar2.K(cVar);
                objQ = cVar;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    c cVar2 = new c(j0Var, this.f172566b, this.f172567c, this.f172568d, this.f172569e, this.f172570f);
                    mVar2.K(cVar2);
                    objQ = cVar2;
                }
            }
            n0.a(rVarB, j0Var, 0L, (l) objQ, mVar2, 0, 4);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
