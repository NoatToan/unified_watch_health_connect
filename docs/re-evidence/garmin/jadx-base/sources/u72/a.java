package u72;

import android.content.Context;
import e23.r;
import lc.v;
import m4.b0;
import m4.e;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import r1.l;
import t13.g;
import u1.a2;
import u1.d2;
import y01.k;
import z2.a0;
import z2.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f169450a;

    /* JADX WARN: Code duplicated, block: B:18:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bf  */
    @Override // e23.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i14 = this.f169450a;
        m.a aVar = m.f135153a;
        int i15 = 1;
        switch (i14) {
            case 0:
                ((Integer) obj4).intValue();
                b bVar = b.f169451a;
                ((l) obj).getClass();
                ((v) obj2).getClass();
                x1 x1Var = n.f135158a;
                c.d((m) obj3, 0);
                return Unit.INSTANCE;
            case 1:
                h4.r rVar = (h4.r) obj;
                d2 d2Var = (d2) obj2;
                m mVar = (m) obj3;
                ((Integer) obj4).getClass();
                rVar.getClass();
                d2Var.getClass();
                mVar.C(-801405937);
                x1 x1Var2 = n.f135158a;
                h4.r rVarB = a2.b(rVar, d2Var, true);
                mVar.f();
                return rVarB;
            case 2:
                h4.r rVar2 = (h4.r) obj;
                d2 d2Var2 = (d2) obj2;
                m mVar2 = (m) obj3;
                ((Integer) obj4).getClass();
                rVar2.getClass();
                d2Var2.getClass();
                mVar2.C(-659325646);
                x1 x1Var3 = n.f135158a;
                h4.r rVarB2 = a2.b(rVar2, d2Var2, true);
                mVar2.f();
                return rVarB2;
            case 3:
                h4.r rVar3 = (h4.r) obj;
                String str = (String) obj2;
                m mVar3 = (m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                rVar3.getClass();
                str.getClass();
                mVar3.C(-1900299050);
                x1 x1Var4 = n.f135158a;
                if ((((iIntValue & 112) ^ 48) <= 32 || !mVar3.B(str)) && (iIntValue & 48) != 32) {
                    i15 = 0;
                }
                Object objQ = mVar3.q();
                if (i15 == 0) {
                    aVar.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new u91.c(str, 3);
                        mVar3.K(objQ);
                    }
                } else {
                    objQ = new u91.c(str, 3);
                    mVar3.K(objQ);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVar3, false);
                mVar3.f();
                return rVarC;
            case 4:
                h4.r rVar4 = (h4.r) obj;
                b0 b0Var = (b0) obj2;
                m mVar4 = (m) obj3;
                ((Integer) obj4).getClass();
                rVar4.getClass();
                b0Var.getClass();
                mVar4.C(2086843138);
                x1 x1Var5 = n.f135158a;
                h4.r rVarA = e.a(rVar4, b0Var);
                mVar4.f();
                return rVarA;
            case 5:
                h4.r rVar5 = (h4.r) obj;
                String str2 = (String) obj2;
                m mVar5 = (m) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                rVar5.getClass();
                str2.getClass();
                mVar5.C(134831394);
                x1 x1Var6 = n.f135158a;
                boolean z14 = (((iIntValue2 & 112) ^ 48) > 32 && mVar5.B(str2)) || (iIntValue2 & 48) == 32;
                Object objQ2 = mVar5.q();
                if (z14) {
                    objQ2 = new k(str2, i15);
                    mVar5.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new k(str2, i15);
                        mVar5.K(objQ2);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVar5, false);
                mVar5.f();
                return rVarC2;
            default:
                return new w((g) obj, (Context) obj2, (a0) obj3, (z5.c) obj4);
        }
    }
}
