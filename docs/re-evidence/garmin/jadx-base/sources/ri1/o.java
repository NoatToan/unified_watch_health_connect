package ri1;

import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationRedirectActivity;
import p005kotlin.Unit;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152855a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InReachLTEActivationRedirectActivity f152856b;

    public /* synthetic */ o(InReachLTEActivationRedirectActivity inReachLTEActivationRedirectActivity) {
        this.f152856b = inReachLTEActivationRedirectActivity;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f152855a;
        InReachLTEActivationRedirectActivity inReachLTEActivationRedirectActivity = this.f152856b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                InReachLTEActivationRedirectActivity.a aVar = InReachLTEActivationRedirectActivity.f43507a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    boolean zR = mVar.r(inReachLTEActivationRedirectActivity);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new n(inReachLTEActivationRedirectActivity, i15);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new n(inReachLTEActivationRedirectActivity, i15);
                            mVar.K(objQ);
                        }
                    }
                    z02.f.c(0, 55, null, (e23.a) objQ, null, null, mVar, null);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                InReachLTEActivationRedirectActivity.a aVar2 = InReachLTEActivationRedirectActivity.f43507a;
                inReachLTEActivationRedirectActivity.ca((p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(InReachLTEActivationRedirectActivity inReachLTEActivationRedirectActivity, int i14) {
        this.f152856b = inReachLTEActivationRedirectActivity;
    }
}
