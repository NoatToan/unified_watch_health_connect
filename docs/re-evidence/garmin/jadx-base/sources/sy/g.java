package sy;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.p;
import gl1.y;
import l72.i3;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.x1;
import sg0.q0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161167a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f161168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f161169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f161170d;

    public /* synthetic */ g(e23.a aVar, e23.l lVar, k kVar) {
        this.f161168b = aVar;
        this.f161169c = lVar;
        this.f161170d = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f161167a;
        k kVar = this.f161170d;
        e23.l lVar = this.f161169c;
        e23.a aVar = this.f161168b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                j.a(kVar, aVar, lVar, (p3.m) obj, p0.t(1));
                break;
            default:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strQ = y.Q(mVar, R.string.lbl_calories_burned);
                    boolean zB = mVar.B(aVar);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new q0(aVar, 24);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new q0(aVar, 24);
                            mVar.K(objQ);
                        }
                    }
                    e23.a aVar3 = (e23.a) objQ;
                    i53.f fVarA = i53.a.a(new i3("HELP", y.Q(mVar, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB2 = mVar.B(lVar) | mVar.r(kVar);
                    Object objQ2 = mVar.q();
                    if (zB2) {
                        objQ2 = new i(0, lVar, kVar);
                        mVar.K(objQ2);
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new i(0, lVar, kVar);
                            mVar.K(objQ2);
                        }
                    }
                    z02.f.d(strQ, null, null, aVar3, fVarA, null, (e23.l) objQ2, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ g(k kVar, e23.a aVar, e23.l lVar, int i14) {
        this.f161170d = kVar;
        this.f161168b = aVar;
        this.f161169c = lVar;
    }
}
