package wb1;

import com.garmin.android.apps.connectmobile.presentation.dev.PromotionsDevMenuActivity;
import e23.p;
import lc.m0;
import nc.y;
import p005kotlin.Unit;
import p3.v;
import p3.x1;
import tn2.s0;
import zd0.q0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f183891a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f183892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PromotionsDevMenuActivity f183893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q0 f183894d;

    public /* synthetic */ m(PromotionsDevMenuActivity promotionsDevMenuActivity, m0 m0Var, q0 q0Var) {
        this.f183893c = promotionsDevMenuActivity;
        this.f183892b = m0Var;
        this.f183894d = q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f183891a;
        q0 q0Var = this.f183894d;
        PromotionsDevMenuActivity promotionsDevMenuActivity = this.f183893c;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = PromotionsDevMenuActivity.f41027b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    v.a(g02.d.f74342a.c(promotionsDevMenuActivity.getOnBackPressedDispatcher()), z3.f.c(-1770187230, new m(this.f183892b, promotionsDevMenuActivity, q0Var), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = PromotionsDevMenuActivity.f41027b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    m0 m0Var = this.f183892b;
                    boolean zR = mVar2.r(m0Var) | mVar2.r(promotionsDevMenuActivity) | mVar2.r(q0Var);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new s0(m0Var, 27, promotionsDevMenuActivity, q0Var);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s0(m0Var, 27, promotionsDevMenuActivity, q0Var);
                            mVar2.K(objQ);
                        }
                    }
                    y.b(m0Var, "promoListRoute", null, null, null, null, null, null, (e23.l) objQ, mVar2, 48, 1020);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m(m0 m0Var, PromotionsDevMenuActivity promotionsDevMenuActivity, q0 q0Var) {
        this.f183892b = m0Var;
        this.f183893c = promotionsDevMenuActivity;
        this.f183894d = q0Var;
    }
}
