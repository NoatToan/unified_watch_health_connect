package z71;

import com.garmin.android.apps.connectmobile.performancescores.endurancescore.presentation.EnduranceScoreActivity;
import d81.y;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import yr.o0;
import z02.b;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EnduranceScoreActivity f202872b;

    public /* synthetic */ a(EnduranceScoreActivity enduranceScoreActivity, int i14) {
        this.f202871a = i14;
        this.f202872b = enduranceScoreActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f202871a;
        EnduranceScoreActivity enduranceScoreActivity = this.f202872b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                EnduranceScoreActivity.a aVar = EnduranceScoreActivity.f40255b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    b.a(false, null, null, null, false, f.c(-2014070173, new a(enduranceScoreActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                EnduranceScoreActivity.a aVar2 = EnduranceScoreActivity.f40255b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    i81.a aVar3 = (i81.a) enduranceScoreActivity.f40256a.getValue();
                    boolean zR = mVar2.r(enduranceScoreActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new o0(enduranceScoreActivity, 13);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new o0(enduranceScoreActivity, 13);
                            mVar2.K(objQ);
                        }
                    }
                    y.a(aVar3, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
