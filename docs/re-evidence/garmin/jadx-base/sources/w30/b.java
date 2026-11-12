package w30;

import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import vu0.h;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f181826b;

    public /* synthetic */ b(e eVar, int i14) {
        this.f181825a = i14;
        this.f181826b = eVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f181825a;
        e eVar = this.f181826b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = e.f181832f;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    eVar.k(mVar, h82.c.f82429e);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = e.f181832f;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    eVar.i(mVar2, h82.c.f82429e);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = e.f181832f;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    eVar.g(mVar3, h82.c.f82429e);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = e.f181832f;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    eVar.j(mVar4, h82.c.f82429e);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i19 = e.f181832f;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = n.f135158a;
                    eVar.h(mVar5, h82.c.f82429e);
                } else {
                    mVar5.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar6 = (m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                int i24 = e.f181832f;
                rVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(rVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    int i25 = ((iIntValue6 << 3) & 112) | 6;
                    rVar.k(f.c(-500836716, new h(rVar, 15), mVar6), mVar6, i25);
                    rVar.a(f.c(-886183733, new vq0.a(18, rVar, eVar), mVar6), mVar6, i25);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
