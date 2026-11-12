package dl0;

import com.garmin.android.apps.connectmobile.golf.badge.BadgeScorecardsActivity;
import com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f60270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BadgeScorecardsActivity f60271c;

    public /* synthetic */ b(i iVar, BadgeScorecardsActivity badgeScorecardsActivity, int i14) {
        this.f60269a = i14;
        this.f60270b = iVar;
        this.f60271c = badgeScorecardsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x005a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f60269a;
        BadgeScorecardsActivity badgeScorecardsActivity = this.f60271c;
        i iVar = this.f60270b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                BadgeScorecardsActivity.a aVar = BadgeScorecardsActivity.f35746a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(757621715, new b(iVar, badgeScorecardsActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                BadgeScorecardsActivity.a aVar2 = BadgeScorecardsActivity.f35746a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    zc.d dVarA = zc.g.a(iVar.f60294d, mVar2);
                    boolean zR = mVar2.r(badgeScorecardsActivity);
                    Object objQ = mVar2.q();
                    m.a aVar3 = m.f135153a;
                    if (zR) {
                        objQ = new cq0.g(badgeScorecardsActivity, 20);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new cq0.g(badgeScorecardsActivity, 20);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(badgeScorecardsActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new l(badgeScorecardsActivity, 23);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new l(badgeScorecardsActivity, 23);
                            mVar2.K(objQ2);
                        }
                    }
                    h.a(dVarA, aVar4, (e23.l) objQ2, mVar2, 8);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
