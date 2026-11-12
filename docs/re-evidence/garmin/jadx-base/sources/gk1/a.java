package gk1;

import com.garmin.android.apps.connectmobile.settings.thirdparty.google.GoogleHealthConnectActivity;
import e23.l;
import e23.p;
import g2.m1;
import gl1.y;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GoogleHealthConnectActivity f77736b;

    public /* synthetic */ a(GoogleHealthConnectActivity googleHealthConnectActivity, int i14) {
        this.f77735a = i14;
        this.f77736b = googleHealthConnectActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f77735a;
        GoogleHealthConnectActivity googleHealthConnectActivity = this.f77736b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                GoogleHealthConnectActivity.a aVar = GoogleHealthConnectActivity.f43979c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(-1383542756, new a(googleHealthConnectActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                GoogleHealthConnectActivity.a aVar2 = GoogleHealthConnectActivity.f43979c;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar2);
                    String str = lk1.e.a.f113146b.f113145a;
                    boolean zR = mVar2.r(googleHealthConnectActivity) | mVar2.r(m0VarI);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new m1(6, googleHealthConnectActivity, m0VarI);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new m1(6, googleHealthConnectActivity, m0VarI);
                            mVar2.K(objQ);
                        }
                    }
                    nc.y.b(m0VarI, str, null, null, null, null, null, null, (l) objQ, mVar2, 0, 1020);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
