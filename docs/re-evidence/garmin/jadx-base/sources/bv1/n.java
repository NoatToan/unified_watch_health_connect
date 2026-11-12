package bv1;

import b21.s4;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ tw1.a f21422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f21423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o f21424d;

    public /* synthetic */ n(tw1.a aVar, String str, o oVar, int i14) {
        this.f21421a = i14;
        this.f21422b = aVar;
        this.f21423c = str;
        this.f21424d = oVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f21421a;
        o oVar = this.f21424d;
        tw1.a aVar = this.f21422b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(851600429, new n(aVar, this.f21423c, oVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC = c2.l.C(c2.l.A(aVar2, eVar.f97920e, 0.0f, 2), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    hv1.g.a aVar3 = hv1.g.f85858c;
                    String trainingPhase = aVar.getTrainingPhase();
                    aVar3.getClass();
                    hv1.g gVarA = hv1.g.a.a(trainingPhase);
                    String strH = null;
                    Integer numValueOf = gVarA != null ? Integer.valueOf(gVarA.f85861a) : null;
                    if (numValueOf == null) {
                        mVar2.C(-343156613);
                        mVar2.f();
                    } else {
                        mVar2.C(-343156612);
                        strH = gl1.y.Q(mVar2, numValueOf.intValue()) + StringUtils.SPACE + gl1.y.Q(mVar2, R.string.mct_phase);
                        mVar2.f();
                    }
                    if (strH == null) {
                        strH = sn.a.h(mVar2, -1950728305, R.string.mct_phase, mVar2);
                    } else {
                        mVar2.C(-1950734381);
                        mVar2.f();
                    }
                    String str = strH;
                    boolean zR = mVar2.r(oVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new s4(oVar, 26);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new s4(oVar, 26);
                            mVar2.K(objQ);
                        }
                    }
                    String str2 = this.f21423c;
                    ku1.j.a(0, (e23.a) objQ, rVarC, str, str2, str2, mVar2);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
