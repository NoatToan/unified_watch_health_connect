package mt0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p f120834b;

    public /* synthetic */ r0(com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar, int i14) {
        this.f120833a = i14;
        this.f120834b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:48:0x010e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f120833a;
        p3.m.a aVar = p3.m.f135153a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar = this.f120834b;
        int i15 = 2;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.c2 c2Var = pVar.f37706m;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = v62.w0.a(t62.b.f162798a);
                    String string = pVar.getString(((Boolean) c2Var.getF182175a()).booleanValue() ? R.string.challenge_pending_title : R.string.no_leaderboard_data_title);
                    String string2 = pVar.getString(((Boolean) c2Var.getF182175a()).booleanValue() ? R.string.challenge_pending_description : R.string.no_leaderboard_data_description);
                    string2.getClass();
                    b82.n.c(dVarA, string, string2, null, null, mVar, 0, 24);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-152276793, new r0(pVar, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    String string3 = pVar.getString(R.string.title_challenges_step_up_to_the_challenge);
                    String string4 = pVar.getString(R.string.mgs_challenges_first_use);
                    string4.getClass();
                    String string5 = pVar.getString(R.string.lbl_join_now);
                    boolean zR = mVar3.r(pVar);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new u0(pVar, z14 ? 1 : 0);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new u0(pVar, z14 ? 1 : 0);
                            mVar3.K(objQ);
                        }
                    }
                    b82.n.d(null, string3, string4, null, string5, (e23.a) objQ, null, null, mVar3, 0, 201);
                } else {
                    mVar3.e();
                }
                break;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-630701464, new r0(pVar, 5), mVar4), mVar4, 196608, 31);
                } else {
                    mVar4.e();
                }
                break;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar5 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1258405665, new r0(pVar, z14 ? 1 : 0), mVar5), mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                break;
            default:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar6 = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    pt0.g gVarS6 = pVar.S6();
                    boolean zR2 = mVar6.r(pVar);
                    Object objQ2 = mVar6.q();
                    if (zR2) {
                        objQ2 = new t0(pVar, z14 ? 1 : 0);
                        mVar6.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new t0(pVar, z14 ? 1 : 0);
                            mVar6.K(objQ2);
                        }
                    }
                    p0.a(gVarS6, (e23.l) objQ2, mVar6, 0);
                } else {
                    mVar6.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
