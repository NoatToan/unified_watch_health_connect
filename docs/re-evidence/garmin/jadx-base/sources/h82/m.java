package h82;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f82477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f82478c;

    public /* synthetic */ m(r rVar, int i14, int i15) {
        this.f82476a = i15;
        this.f82477b = rVar;
        this.f82478c = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f82476a;
        int i15 = this.f82478c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                r rVar = r.f82497a;
                this.f82477b.c((p3.m) obj, p0.t(i15 | 1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = qn0.i.f145805f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_understanding_outliers);
                    r rVar2 = this.f82477b;
                    rVar2.s(0, 2, strQ, null, mVar);
                    rVar2.q(y.Q(mVar, i15), mVar, 0);
                    rVar2.g(z3.f.c(1268082674, new pk1.g(rVar2, 23), mVar), mVar, 6);
                    rVar2.q(y.Q(mVar, R.string.msg_understanding_metric_outliers), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
