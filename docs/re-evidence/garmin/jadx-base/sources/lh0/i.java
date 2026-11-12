package lh0;

import c2.a0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dh0.g f112410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dh0.a f112411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f112412d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f112413e;

    public /* synthetic */ i(dh0.g gVar, dh0.a aVar, e23.l lVar, e23.a aVar2, int i14) {
        this.f112409a = i14;
        this.f112410b = gVar;
        this.f112411c = aVar;
        this.f112412d = lVar;
        this.f112413e = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f112409a) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    j.b(z3.f.c(66235358, new i(this.f112410b, this.f112411c, this.f112412d, this.f112413e, 1), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                r rVar = (r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    int[] iArr = j.b.f112416a;
                    dh0.g gVar = this.f112410b;
                    int i14 = iArr[gVar.ordinal()];
                    dh0.a aVar = this.f112411c;
                    if (i14 != 1) {
                        p3.m.a aVar2 = p3.m.f135153a;
                        if (i14 != 2) {
                            e23.a aVar3 = this.f112413e;
                            if (i14 == 3) {
                                mVar2.C(1827957899);
                                boolean zB = mVar2.B(aVar3);
                                Object objQ = mVar2.q();
                                if (zB) {
                                    objQ = new l72.t(aVar3, 20);
                                    mVar2.K(objQ);
                                } else {
                                    aVar2.getClass();
                                    if (objQ == p3.m.a.f135155b) {
                                        objQ = new l72.t(aVar3, 20);
                                        mVar2.K(objQ);
                                    }
                                }
                                u.a(rVar, aVar, (e23.a) objQ, mVar2, iIntValue2 & 14);
                                mVar2.f();
                            } else if (i14 == 4) {
                                mVar2.C(1828231784);
                                boolean zB2 = mVar2.B(aVar3);
                                Object objQ2 = mVar2.q();
                                if (zB2) {
                                    objQ2 = new l72.t(aVar3, 21);
                                    mVar2.K(objQ2);
                                } else {
                                    aVar2.getClass();
                                    if (objQ2 == p3.m.a.f135155b) {
                                        objQ2 = new l72.t(aVar3, 21);
                                        mVar2.K(objQ2);
                                    }
                                }
                                v.a(rVar, aVar, (e23.a) objQ2, mVar2, iIntValue2 & 14);
                                mVar2.f();
                            } else {
                                if (i14 != 5) {
                                    throw n23.j.m(mVar2, -772328986);
                                }
                                mVar2.C(-772300232);
                                t.b(rVar, aVar, mVar2, iIntValue2 & 14);
                                mVar2.f();
                            }
                        } else {
                            mVar2.C(1827717835);
                            e23.l lVar = this.f112412d;
                            boolean zB3 = mVar2.B(lVar) | mVar2.k(gVar.ordinal());
                            Object objQ3 = mVar2.q();
                            if (zB3) {
                                objQ3 = new kh0.m(lVar, gVar, 6);
                                mVar2.K(objQ3);
                            } else {
                                aVar2.getClass();
                                if (objQ3 == p3.m.a.f135155b) {
                                    objQ3 = new kh0.m(lVar, gVar, 6);
                                    mVar2.K(objQ3);
                                }
                            }
                            f.b(rVar, aVar, (e23.a) objQ3, mVar2, iIntValue2 & 14);
                            mVar2.f();
                        }
                    } else {
                        mVar2.C(-772327722);
                        h.b(rVar, aVar, mVar2, iIntValue2 & 14);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
