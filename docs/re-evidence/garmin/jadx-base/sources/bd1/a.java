package bd1;

import b21.s4;
import com.garmin.android.apps.connectmobile.racepredictor.presentation.activity.RacePredictorTrendsActivity;
import e23.l;
import e23.p;
import fd1.e;
import g02.d;
import i53.c;
import k23.g;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.v;
import p3.x1;
import p3.x3;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17668a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gd1.a f17669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RacePredictorTrendsActivity f17670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f17671d;

    public /* synthetic */ a(RacePredictorTrendsActivity racePredictorTrendsActivity, gd1.a aVar, p1 p1Var) {
        this.f17670c = racePredictorTrendsActivity;
        this.f17669b = aVar;
        this.f17671d = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x006a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f17668a;
        x3 x3Var = this.f17671d;
        RacePredictorTrendsActivity racePredictorTrendsActivity = this.f17670c;
        gd1.a aVar = this.f17669b;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = RacePredictorTrendsActivity.f41087a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    v.a(d.f74342a.c(racePredictorTrendsActivity.getOnBackPressedDispatcher()), f.c(-1518445088, new a(aVar, racePredictorTrendsActivity, x3Var), mVar), mVar, 56);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i16 = RacePredictorTrendsActivity.f41087a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    u82.a<o82.a, fd1.d> aVar2 = aVar.f76969f;
                    u82.a<o82.a, e> aVar3 = aVar.f76970g;
                    u82.a<o82.a, e> aVar4 = aVar.f76971h;
                    c cVar = (c) x3Var.getF182175a();
                    boolean zR = mVar2.r(aVar);
                    Object objQ = mVar2.q();
                    m.a aVar5 = m.f135153a;
                    if (zR) {
                        objQ = new RacePredictorTrendsActivity.a(aVar);
                        mVar2.K(objQ);
                    } else {
                        aVar5.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new RacePredictorTrendsActivity.a(aVar);
                            mVar2.K(objQ);
                        }
                    }
                    l lVar = (l) ((g) objQ);
                    boolean zR2 = mVar2.r(racePredictorTrendsActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new s4(racePredictorTrendsActivity, 12);
                        mVar2.K(objQ2);
                    } else {
                        aVar5.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new s4(racePredictorTrendsActivity, 12);
                            mVar2.K(objQ2);
                        }
                    }
                    dd1.e.a(aVar2, aVar3, aVar4, cVar, lVar, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(gd1.a aVar, RacePredictorTrendsActivity racePredictorTrendsActivity, x3 x3Var) {
        this.f17669b = aVar;
        this.f17670c = racePredictorTrendsActivity;
        this.f17671d = x3Var;
    }
}
