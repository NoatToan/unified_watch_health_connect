package bv1;

import b21.s4;
import com.garmin.android.apps.connectmobile.R;
import f72.d2;
import p005kotlin.Unit;
import p3.c2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f21412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f21413c;

    public /* synthetic */ h(c2 c2Var, i iVar, int i14) {
        this.f21411a = i14;
        this.f21412b = c2Var;
        this.f21413c = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x007d  */
    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21411a;
        i iVar = this.f21413c;
        c2 c2Var = this.f21412b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1391569507, new h(c2Var, iVar, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    l72.s.f111232a.a(((Boolean) c2Var.getF182175a()).booleanValue(), z3.f.c(-1019700992, new h(c2Var, iVar, i15), mVar2), mVar2, 48);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l72.s sVar = l72.s.f111232a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = c2.l.y(aVar, j92.b.f97899b.f97920e);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = d2.a(t62.c.f162799a);
                    String strQ = gl1.y.Q(mVar3, R.string.change_training_level);
                    String strQ2 = gl1.y.Q(mVar3, R.string.switch_to_challenger_level_message);
                    String strP = gl1.y.P(R.string.change_to_training_level, new Object[]{gl1.y.Q(mVar3, R.string.coach_difficulty_challenger)}, mVar3);
                    boolean zB = mVar3.B(c2Var);
                    Object objQ = mVar3.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new s4(c2Var, 24);
                        mVar3.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s4(c2Var, 24);
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    boolean zR = mVar3.r(iVar);
                    Object objQ2 = mVar3.q();
                    if (zR) {
                        objQ2 = new s4(iVar, 25);
                        mVar3.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new s4(iVar, 25);
                            mVar3.K(objQ2);
                        }
                    }
                    sVar.c(rVarY, dVarA, null, null, strQ, strQ2, strP, false, aVar3, (e23.a) objQ2, mVar3, 0, 0, 396);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
