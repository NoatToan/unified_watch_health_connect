package tt1;

import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f166416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b f166418d;

    public /* synthetic */ c(o oVar, ActiveTrainingPlansActivity activeTrainingPlansActivity, ww1.b bVar, int i14) {
        this.f166415a = i14;
        this.f166416b = oVar;
        this.f166417c = activeTrainingPlansActivity;
        this.f166418d = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f166415a;
        ww1.b bVar = this.f166418d;
        ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166417c;
        o oVar = this.f166416b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1355620055, new c(oVar, activeTrainingPlansActivity, bVar, i15), mVar), mVar, 196608, 31);
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
                    u4.d dVar = oVar.b().f4362e;
                    String strE = oVar.e(activeTrainingPlansActivity);
                    String str = bVar.f187756b;
                    String strPa = activeTrainingPlansActivity.pa(bVar.f187757c, bVar.f187758d, activeTrainingPlansActivity.qa(bVar.f187759e), false);
                    boolean zR = mVar2.r(activeTrainingPlansActivity) | mVar2.r(bVar) | mVar2.k(oVar.ordinal());
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new sg0.j(activeTrainingPlansActivity, 25, bVar, oVar);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new sg0.j(activeTrainingPlansActivity, 25, bVar, oVar);
                            mVar2.K(objQ);
                        }
                    }
                    ku1.n.b(null, dVar, strE, str, strPa, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
