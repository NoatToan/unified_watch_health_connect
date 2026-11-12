package e11;

import c2.x2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f61934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v21.e f61935c;

    public /* synthetic */ o(boolean z14, v21.e eVar, int i14) {
        this.f61933a = i14;
        this.f61934b = z14;
        this.f61935c = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0113  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f61933a;
        v21.e eVar = this.f61935c;
        boolean z14 = this.f61934b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        mVar.C(-1049693603);
                        x0.f23314a.getClass();
                        String strP = gl1.y.P(R.string.value_is_required, new Object[]{gl1.d.W(x0.Ae)}, mVar);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarZ = c2.l.z(rVarF, eVar2.f97920e, eVar2.f97917b);
                        boolean zR = mVar.r(eVar) | mVar.B(strP);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new r(eVar, strP, 0);
                            mVar.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new r(eVar, strP, 0);
                                mVar.K(objQ);
                            }
                        }
                        h4.r rVarC = p5.v.c((e23.l) objQ, rVarZ, false);
                        int i15 = v21.e.f175323i;
                        String strL = eVar.L(strP, false);
                        d6.h.f57752b.getClass();
                        int i16 = d6.h.f57757g;
                        d92.b.f58624b.getClass();
                        mh.c(strL, rVarC, 0L, null, 0L, null, 0L, d6.h.a(i16), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 130044);
                        mVar.f();
                    } else {
                        mVar.C(-1048921920);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (z14) {
                        mVar2.C(-2015716746);
                        h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(c2.l.C(rVarF2, 0.0f, eVar3.f97917b, 0.0f, eVar3.f97918c, 5), eVar3.f97920e, 0.0f, 2);
                        String strL2 = eVar.l(R.string.lbl_custom_active_calories_error);
                        d6.h.f57752b.getClass();
                        int i17 = d6.h.f57757g;
                        d92.b.f58624b.getClass();
                        mh.c(strL2, rVarA, 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar2), mVar2, 0, 0, 130044);
                        mVar2.f();
                    } else {
                        mVar2.C(-2015213709);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
