package ew1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f66865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f66867d;

    public /* synthetic */ y1(e23.p pVar, p3.p1 p1Var, p3.p1 p1Var2, int i14) {
        this.f66864a = i14;
        this.f66865b = pVar;
        this.f66866c = p1Var;
        this.f66867d = p1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f66864a;
        p3.p1 p1Var = this.f66867d;
        p3.p1 p1Var2 = this.f66866c;
        e23.p pVar = this.f66865b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                a2.a aVar = a2.f66311e;
                int i15 = 0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    l72.f0 f0Var = l72.f0.f110999a;
                    h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
                    String strQ = gl1.y.Q(mVar, R.string.lbl_next);
                    boolean zB = mVar.B(pVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new z1(pVar, p1Var2, p1Var, i15);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new z1(pVar, p1Var2, p1Var, i15);
                            mVar.K(objQ);
                        }
                    }
                    f0Var.d(384, 9, (e23.a) objQ, rVarF, strQ, mVar, null, false);
                } else {
                    mVar.e();
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.courses.model.b bVar = (com.garmin.android.apps.connectmobile.courses.model.b) obj;
                com.garmin.android.apps.connectmobile.courses.model.b bVar2 = (com.garmin.android.apps.connectmobile.courses.model.b) obj2;
                bVar.getClass();
                bVar2.getClass();
                p1Var2.setValue(bVar);
                p1Var.setValue(bVar2);
                pVar.invoke(bVar, bVar2);
                break;
        }
        return Unit.INSTANCE;
    }
}
