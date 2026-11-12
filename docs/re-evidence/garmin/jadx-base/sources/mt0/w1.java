package mt0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class w1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Boolean f120907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f120908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f120909e;

    public /* synthetic */ w1(boolean z14, Boolean bool, e23.a aVar, boolean z15, int i14) {
        this.f120905a = i14;
        this.f120906b = z14;
        this.f120907c = bool;
        this.f120908d = aVar;
        this.f120909e = z15;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object[] objArr = 0;
        switch (this.f120905a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(331355070, new w1(this.f120906b, this.f120907c, this.f120908d, this.f120909e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = this.f120906b;
                    p3.m.a aVar = p3.m.f135153a;
                    if (z14) {
                        mVar2.C(1564185834);
                        a82.c cVar = a82.c.f1991a;
                        h4.r rVarZ = c2.x2.z(h4.r.S, null, 3);
                        String strQ = gl1.y.Q(mVar2, R.string.lbl_challenge_full);
                        Object objQ = mVar2.q();
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new mh1.q(12);
                            mVar2.K(objQ);
                        }
                        cVar.b(strQ, rVarZ, false, (e23.a) objQ, mVar2, 3504, 0);
                        mVar2.f();
                    } else {
                        if (p005kotlin.jvm.internal.s.g(this.f120907c, Boolean.TRUE)) {
                            mVar2.C(1564620299);
                            a82.c cVar2 = a82.c.f1991a;
                            h4.r rVarZ2 = c2.x2.z(h4.r.S, null, 3);
                            String strQ2 = gl1.y.Q(mVar2, R.string.lbl_join);
                            e23.p pVarC = z3.f.c(972538980, new j30.d(this.f120909e, 20, objArr == true ? 1 : 0), mVar2);
                            e23.a aVar2 = this.f120908d;
                            boolean zB = mVar2.B(aVar2);
                            Object objQ2 = mVar2.q();
                            if (zB) {
                                objQ2 = new ll0.a(aVar2, 22);
                                mVar2.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new ll0.a(aVar2, 22);
                                    mVar2.K(objQ2);
                                }
                            }
                            cVar2.a(pVarC, strQ2, rVarZ2, true, (e23.a) objQ2, mVar2, 3462);
                            mVar2.f();
                        } else {
                            mVar2.C(1565458322);
                            a82.c cVar3 = a82.c.f1991a;
                            h4.r rVarZ3 = c2.x2.z(h4.r.S, null, 3);
                            String strQ3 = gl1.y.Q(mVar2, R.string.lbl_joined);
                            Object objQ3 = mVar2.q();
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new mh1.q(13);
                                mVar2.K(objQ3);
                            }
                            cVar3.b(strQ3, rVarZ3, false, (e23.a) objQ3, mVar2, 3504, 0);
                            mVar2.f();
                        }
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
