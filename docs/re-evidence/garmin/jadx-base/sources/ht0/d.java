package ht0;

import e23.q;
import h82.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f85517b;

    public /* synthetic */ d(e eVar, int i14) {
        this.f85516a = i14;
        this.f85517b = eVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f85516a;
        e eVar = this.f85517b;
        switch (i14) {
            case 0:
                m mVar = (m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = e.f85518g;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = n.f135158a;
                    eVar.i(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                int i16 = e.f85518g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = n.f135158a;
                    eVar.h(mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                m mVar3 = (m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                int i17 = e.f85518g;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = n.f135158a;
                    eVar.j(mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                m mVar4 = (m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                int i18 = e.f85518g;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = n.f135158a;
                    eVar.g(mVar4, 0);
                } else {
                    mVar4.e();
                }
                break;
            default:
                r rVar = (r) obj;
                m mVar5 = (m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                int i19 = e.f85518g;
                rVar.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.B(rVar) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    int i24 = ((iIntValue5 << 3) & 112) | 6;
                    rVar.k(z3.f.c(-1309699805, new fe1.a(rVar, 24), mVar5), mVar5, i24);
                    rVar.a(z3.f.c(-677007398, new g80.e(28, eVar, rVar), mVar5), mVar5, i24);
                } else {
                    mVar5.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
