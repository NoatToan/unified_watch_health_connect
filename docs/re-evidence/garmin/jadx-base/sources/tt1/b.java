package tt1;

import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f166412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.d f166414d;

    public /* synthetic */ b(o oVar, ActiveTrainingPlansActivity activeTrainingPlansActivity, ww1.d dVar, int i14) {
        this.f166411a = i14;
        this.f166412b = oVar;
        this.f166413c = activeTrainingPlansActivity;
        this.f166414d = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0060  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f166411a;
        ww1.d dVar = this.f166414d;
        ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166413c;
        o oVar = this.f166412b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(358262837, new b(oVar, activeTrainingPlansActivity, dVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar2 = ActiveTrainingPlansActivity.f45098w;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    u4.d dVar2 = oVar.b().f4362e;
                    String strE = oVar.e(activeTrainingPlansActivity);
                    String str = dVar.f187756b;
                    String strPa = activeTrainingPlansActivity.pa(dVar.f187757c, dVar.f187758d, activeTrainingPlansActivity.qa(dVar.f187759e), dVar.f187742g);
                    boolean zR = mVar2.r(activeTrainingPlansActivity) | mVar2.r(dVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new tb0.d(8, activeTrainingPlansActivity, dVar);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new tb0.d(8, activeTrainingPlansActivity, dVar);
                            mVar2.K(objQ);
                        }
                    }
                    ku1.n.b(null, dVar2, strE, str, strPa, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
