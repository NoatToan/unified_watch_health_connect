package ri1;

import com.garmin.android.apps.connectmobile.settings.lte.cwsactivation.InReachLTEActivationRedirectActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f152848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InReachLTEActivationRedirectActivity f152849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f152850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f152851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f152852f;

    public /* synthetic */ m(boolean z14, InReachLTEActivationRedirectActivity inReachLTEActivationRedirectActivity, long j8, boolean z15, boolean z16, int i14) {
        this.f152847a = i14;
        this.f152848b = z14;
        this.f152849c = inReachLTEActivationRedirectActivity;
        this.f152850d = j8;
        this.f152851e = z15;
        this.f152852f = z16;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object[] objArr = 0;
        switch (this.f152847a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                InReachLTEActivationRedirectActivity.a aVar = InReachLTEActivationRedirectActivity.f43507a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1499412070, new m(this.f152848b, this.f152849c, this.f152850d, this.f152851e, this.f152852f, 1), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                InReachLTEActivationRedirectActivity.a aVar2 = InReachLTEActivationRedirectActivity.f43507a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean z14 = this.f152848b;
                    InReachLTEActivationRedirectActivity inReachLTEActivationRedirectActivity = this.f152849c;
                    if (z14) {
                        mVar2.C(-1325059288);
                        inReachLTEActivationRedirectActivity.ca(mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-1324982563);
                        boolean zR = mVar2.r(inReachLTEActivationRedirectActivity);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new n(inReachLTEActivationRedirectActivity, objArr == true ? 1 : 0);
                            mVar2.K(objQ);
                        } else {
                            p3.m.f135153a.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new n(inReachLTEActivationRedirectActivity, objArr == true ? 1 : 0);
                                mVar2.K(objQ);
                            }
                        }
                        i.a(0, this.f152850d, (e23.a) objQ, mVar2, this.f152851e, this.f152852f);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
