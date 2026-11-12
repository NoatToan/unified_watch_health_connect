package cw1;

import i3.uf;
import o72.h3;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i53.f f56215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.n1 f56216c;

    public /* synthetic */ t0(i53.f fVar, p3.n1 n1Var, int i14) {
        this.f56214a = i14;
        this.f56215b = fVar;
        this.f56216c = n1Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fe  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f56214a;
        p3.m.a aVar = p3.m.f135153a;
        p3.n1 n1Var = this.f56216c;
        i53.f fVar = this.f56215b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    int i15 = 0;
                    for (Object obj3 : fVar) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str = (String) obj3;
                        boolean z14 = str.length() > 0 && n1Var.getIntValue() == i15;
                        long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
                        long jB = sn.a.b(mVar);
                        boolean zB = mVar.B(str) | mVar.k(i15);
                        Object objQ = mVar.q();
                        if (zB) {
                            objQ = new b82.u1(str, i15, n1Var, 2);
                            mVar.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new b82.u1(str, i15, n1Var, 2);
                                mVar.K(objQ);
                            }
                        }
                        uf.c(z14, (e23.a) objQ, null, false, z3.f.c(2068180914, new as.p(str, 10), mVar), jA, jB, mVar, 24576, 300);
                        i15 = i16;
                    }
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    int i17 = 0;
                    for (Object obj4 : fVar) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            p13.x.q();
                            throw null;
                        }
                        String str2 = (String) obj4;
                        boolean z15 = n1Var.getIntValue() == i17;
                        long jA2 = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar2);
                        long jB2 = sn.a.b(mVar2);
                        boolean zK = mVar2.k(i17);
                        Object objQ2 = mVar2.q();
                        if (zK) {
                            objQ2 = new b82.v1(i17, n1Var, 3);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new b82.v1(i17, n1Var, 3);
                                mVar2.K(objQ2);
                            }
                        }
                        uf.c(z15, (e23.a) objQ2, null, false, z3.f.c(552850449, new h3(str2, 27), mVar2), jA2, jB2, mVar2, 24576, 300);
                        i17 = i18;
                    }
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
