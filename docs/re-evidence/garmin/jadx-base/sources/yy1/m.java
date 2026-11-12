package yy1;

import c2.x2;
import i3.mh;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class m implements e23.r<e2.d, Integer, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f200161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f200162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f200163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f200164d;

    public m(List list, List list2, e23.l lVar, List list3) {
        this.f200161a = list;
        this.f200162b = list2;
        this.f200163c = lVar;
        this.f200164d = list3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
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
            mVar2.C(-1793421199);
            String strValueOf = String.valueOf(((to0.a.AbstractC3116a.C3117a) this.f200162b.get(iIntValue)).f165833a.getTitle());
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            x0 x0VarB = d92.c.b(j92.f.f97931h, mVar2);
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
            e23.l lVar = this.f200163c;
            boolean zB = mVar2.B(lVar);
            List list = this.f200164d;
            boolean zR = zB | mVar2.r(list) | ((((i14 & 112) ^ 48) > 32 && mVar2.k(iIntValue)) || (i14 & 48) == 32);
            Object objQ = mVar2.q();
            if (zR) {
                objQ = new k(lVar, list, iIntValue);
                mVar2.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k(lVar, list, iIntValue);
                    mVar2.K(objQ);
                }
            }
            mh.c(strValueOf, u1.w.d(rVarY, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
            mVar2.f();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
