package e11;

import c2.x2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v21.e f61937b;

    public /* synthetic */ p(v21.e eVar, int i14) {
        this.f61936a = i14;
        this.f61937b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0168  */
    /* JADX WARN: Code duplicated, block: B:24:0x0206  */
    /* JADX WARN: Code duplicated, block: B:8:0x006e  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i14 = this.f61936a;
        p3.m.a aVar = p3.m.f135153a;
        v21.e eVar = this.f61937b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var = p3.n.f135158a;
                x0.f23314a.getClass();
                String strW = gl1.d.W(x0.f23365cf);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar2 = j92.b.f97899b;
                h4.r rVarZ = c2.l.z(rVarF, eVar2.f97920e, eVar2.f97917b);
                boolean zR = mVar.r(eVar) | mVar.B(strW);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new r(eVar, strW, 1);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new r(eVar, strW, 1);
                        mVar.K(objQ);
                    }
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVarZ, false);
                int i15 = v21.e.f175323i;
                String strL = eVar.L(strW, false);
                d6.h.f57752b.getClass();
                int i16 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strL, rVarC, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var2 = p3.n.f135158a;
                x0.f23314a.getClass();
                String strW2 = gl1.d.W(x0.f23348bf);
                h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                j92.e eVar3 = j92.b.f97899b;
                h4.r rVarZ2 = c2.l.z(rVarF2, eVar3.f97920e, eVar3.f97917b);
                boolean zR2 = mVar2.r(eVar) | mVar2.B(strW2);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    objQ2 = new r(eVar, strW2, 2);
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new r(eVar, strW2, 2);
                        mVar2.K(objQ2);
                    }
                }
                h4.r rVarC2 = p5.v.c((e23.l) objQ2, rVarZ2, false);
                int i17 = v21.e.f175323i;
                String strL2 = eVar.L(strW2, false);
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57757g;
                d92.b.f58624b.getClass();
                mh.c(strL2, rVarC2, 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar2), mVar2, 0, 0, 130044);
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var3 = p3.n.f135158a;
                eVar.getClass();
                String strP = gl1.y.P(R.string.msg_serving_amt_invalid, new Object[]{v21.e.h(0.0d), v21.e.h(99999.999d)}, mVar3);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97933j, mVar3);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58625c.getClass();
                j92.e eVar4 = j92.b.f97899b;
                float f14 = eVar4.f97917b;
                float f15 = eVar4.f97920e;
                mh.c(strP, c2.l.B(aVar2, f15, f14, f15, f15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 131068);
                break;
            default:
                p3.m mVar4 = (p3.m) obj2;
                ((Integer) obj3).getClass();
                ((r1.e0) obj).getClass();
                x1 x1Var4 = p3.n.f135158a;
                String strP2 = gl1.y.P(R.string.servings_amount_must_be_greater_than, new Object[]{0}, mVar4);
                int i19 = v21.e.f175323i;
                String strL3 = eVar.L(strP2, false);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB2 = d92.c.b(j92.f.f97933j, mVar4);
                h4.r.a aVar3 = h4.r.S;
                d92.b.f58625c.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f16 = eVar5.f97917b;
                float f17 = eVar5.f97920e;
                h4.r rVarB = c2.l.B(aVar3, f17, f16, f17, f17);
                boolean zR3 = mVar4.r(eVar) | mVar4.B(strP2);
                Object objQ3 = mVar4.q();
                if (zR3) {
                    objQ3 = new r(eVar, strP2, 5);
                    mVar4.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new r(eVar, strP2, 5);
                        mVar4.K(objQ3);
                    }
                }
                mh.c(strL3, p5.v.c((e23.l) objQ3, rVarB, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar4, 0, 0, 131068);
                break;
        }
        return Unit.INSTANCE;
    }
}
