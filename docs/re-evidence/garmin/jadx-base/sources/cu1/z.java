package cu1;

import com.garmin.android.apps.connectmobile.R;
import l72.u1;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class z implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.training.atp.dashboard.c f55728b;

    public /* synthetic */ z(com.garmin.android.apps.connectmobile.training.atp.dashboard.c cVar, int i14) {
        this.f55727a = i14;
        this.f55728b = cVar;
    }

    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s5.c cVarG;
        int i14 = this.f55727a;
        com.garmin.android.apps.connectmobile.training.atp.dashboard.c cVar = this.f55728b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.training.atp.dashboard.c.a aVar = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.f45406k;
                if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                    x1 x1Var = p3.n.f135158a;
                    cVar.h(mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                h82.r rVar = (h82.r) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                com.garmin.android.apps.connectmobile.training.atp.dashboard.c.a aVar2 = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.f45406k;
                rVar.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.B(rVar) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = p3.n.f135158a;
                    Integer num = cVar.f45407f;
                    if (num == null || num.intValue() <= 10) {
                        mVar2.C(867848705);
                        cVarG = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.g(R.string.msg_confidence_score_not_confident, 0, cVar.f45411j, mVar2);
                        mVar2.f();
                    } else if (num.intValue() <= 50) {
                        mVar2.C(868010432);
                        cVarG = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.g(R.string.msg_confidence_score_somewhat_confident, 0, cVar.f45410i, mVar2);
                        mVar2.f();
                    } else if (num.intValue() <= 90) {
                        mVar2.C(868204492);
                        cVarG = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.g(R.string.msg_confidence_score_confident, 0, cVar.f45409h, mVar2);
                        mVar2.f();
                    } else {
                        mVar2.C(1690579210);
                        cVarG = com.garmin.android.apps.connectmobile.training.atp.dashboard.c.g(R.string.msg_confidence_score_extremely_confident, 0, cVar.f45408g, mVar2);
                        mVar2.f();
                    }
                    rVar.F(cVarG, mVar2, (iIntValue2 << 3) & 112);
                    rVar.o(R.string.msg_confidence_score_details, (iIntValue2 << 6) & 896, 2, null, mVar2);
                    u1.b(R.string.lbl_extremely_confident_with_score, R.string.msg_extremely_confident_details, 48, 0, cVar.f45408g, mVar2, true);
                    u1.b(R.string.lbl_confident_with_score, R.string.msg_confident_details, 48, 0, cVar.f45409h, mVar2, true);
                    u1.b(R.string.lbl_somewhat_confident_with_score, R.string.msg_somewhat_confident_details, 48, 0, cVar.f45410i, mVar2, true);
                    u1.b(R.string.lbl_not_confident_with_score, R.string.msg_not_confident_details, 48, 0, cVar.f45411j, mVar2, true);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
