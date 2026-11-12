package b82;

import i3.uf;
import java.util.Iterator;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class s1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.c f16774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f16775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f16776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f16777e;

    public /* synthetic */ s1(i53.c cVar, p3.n1 n1Var, long j8, long j14, int i14) {
        this.f16773a = i14;
        this.f16774b = cVar;
        this.f16775c = n1Var;
        this.f16776d = j8;
        this.f16777e = j14;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b4  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16773a;
        p3.m.a aVar = p3.m.f135153a;
        p3.n1 n1Var = this.f16775c;
        i53.c cVar = this.f16774b;
        int i15 = 1;
        int i16 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                y1 y1Var = y1.f16902a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    int i17 = 0;
                    for (Object obj3 : cVar) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str = (String) obj3;
                        boolean z14 = str.length() > 0 && n1Var.getIntValue() == i17;
                        boolean zB = mVar.B(str) | mVar.B(n1Var) | mVar.k(i17);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new u1(str, i17, n1Var, i16);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new u1(str, i17, n1Var, i16);
                                mVar.K(objQ);
                            }
                        }
                        uf.c(z14, (e23.a) objQ, null, false, z3.f.c(399520031, new as.p(str, 3), mVar), this.f16776d, this.f16777e, mVar, 24576, 300);
                        i17 = i18;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y1 y1Var2 = y1.f16902a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    int i19 = 0;
                    for (Object obj4 : cVar) {
                        int i24 = i19 + 1;
                        if (i19 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        y1.f16902a.b(i19, (y1.a) obj4, this.f16775c, this.f16776d, this.f16777e, mVar2, 196608);
                        i19 = i24;
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                y1 y1Var3 = y1.f16902a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    int i25 = 0;
                    for (Object obj5 : cVar) {
                        int i26 = i25 + 1;
                        if (i25 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        y1.f16902a.b(i25, (y1.a) obj5, this.f16775c, this.f16776d, this.f16777e, mVar3, 196608);
                        i25 = i26;
                    }
                    p3.x1 x1Var6 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                y1 y1Var4 = y1.f16902a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    Iterator it = cVar.iterator();
                    int i27 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str2 = (String) next;
                        boolean z15 = str2.length() > 0 && n1Var.getIntValue() == i27;
                        boolean zB2 = mVar4.B(str2) | mVar4.B(n1Var) | mVar4.k(i27);
                        Object objQ2 = mVar4.q();
                        if (zB2) {
                            objQ2 = new u1(str2, i27, n1Var, i15);
                            mVar4.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new u1(str2, i27, n1Var, i15);
                                mVar4.K(objQ2);
                            }
                        }
                        uf.c(z15, (e23.a) objQ2, null, false, z3.f.c(-1395724642, new as.p(str2, 4), mVar4), this.f16776d, this.f16777e, mVar4, 24576, 300);
                        it = it;
                        i27 = i28;
                    }
                    p3.x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
        }
    }
}
