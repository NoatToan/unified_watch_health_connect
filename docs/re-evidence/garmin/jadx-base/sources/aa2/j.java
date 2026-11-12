package aa2;

import l72.h3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f2341b;

    public /* synthetic */ j(e23.l lVar, int i14) {
        this.f2340a = i14;
        this.f2341b = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d3  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14;
        int i15 = this.f2340a;
        e23.l lVar = this.f2341b;
        switch (i15) {
            case 0:
                u4.d dVar = (u4.d) obj;
                String str = (String) obj2;
                p3.m mVar = (p3.m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                str.getClass();
                if ((iIntValue & 6) == 0) {
                    i14 = (mVar.B(dVar) ? 4 : 2) | iIntValue;
                } else {
                    i14 = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i14 |= mVar.B(str) ? 32 : 16;
                }
                if (mVar.n(i14 & 1, (i14 & 147) != 146)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new a40.a(lVar, 6);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a40.a(lVar, 6);
                            mVar.K(objQ);
                        }
                    }
                    h3.e(dVar, str, null, null, (e23.a) objQ, null, null, mVar, i14 & 126, 108);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                o82.a aVar = (o82.a) obj2;
                p3.m mVar2 = (p3.m) obj3;
                int iD = vb.h.d((Integer) obj4, (o82.g) obj, aVar);
                if ((iD & 48) == 0) {
                    iD |= mVar2.B(aVar) ? 32 : 16;
                }
                if (mVar2.n(iD & 1, (iD & 145) != 144)) {
                    x1 x1Var2 = p3.n.f135158a;
                    lVar.invoke(aVar);
                } else {
                    mVar2.e();
                }
                break;
            default:
                u82.f fVar = (u82.f) obj2;
                p3.m mVar3 = (p3.m) obj3;
                int iC = vb.h.c((Integer) obj4, (c2.t) obj, fVar);
                if ((iC & 48) == 0) {
                    iC |= (iC & 64) == 0 ? mVar3.B(fVar) : mVar3.r(fVar) ? 32 : 16;
                }
                if (mVar3.n(iC & 1, (iC & 145) != 144)) {
                    x1 x1Var3 = p3.n.f135158a;
                    wl.d.a((yl.f) fVar.a(), lVar, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
