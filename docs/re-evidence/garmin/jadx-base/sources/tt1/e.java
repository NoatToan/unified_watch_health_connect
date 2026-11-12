package tt1;

import am.x0;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.c f166423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f166425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f166426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f166427f;

    public /* synthetic */ e(ww1.c cVar, ActiveTrainingPlansActivity activeTrainingPlansActivity, int i14, int i15, String str, int i16) {
        this.f166422a = i16;
        this.f166423b = cVar;
        this.f166424c = activeTrainingPlansActivity;
        this.f166425d = i14;
        this.f166426e = i15;
        this.f166427f = str;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f166422a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    u4.d dVar = x0.f4312o.f4362e;
                    ww1.c cVar = this.f166423b;
                    String str = cVar.f187756b;
                    ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166424c;
                    String strPa = activeTrainingPlansActivity.pa(this.f166425d, this.f166426e, this.f166427f, false);
                    boolean zR = mVar.r(activeTrainingPlansActivity) | mVar.r(cVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new tb0.d(9, activeTrainingPlansActivity, cVar);
                        mVar.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new tb0.d(9, activeTrainingPlansActivity, cVar);
                            mVar.K(objQ);
                        }
                    }
                    ku1.n.b(null, dVar, null, str, strPa, (e23.a) objQ, mVar, 384);
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
                    z02.b.a(false, null, null, null, false, z3.f.c(1034108068, new e(this.f166423b, this.f166424c, this.f166425d, this.f166426e, this.f166427f, 0), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
