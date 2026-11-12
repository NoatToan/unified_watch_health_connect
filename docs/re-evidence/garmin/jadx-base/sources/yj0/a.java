package yj0;

import com.garmin.android.apps.connectmobile.gcplus.presentation.dev.SubscriptionDevMenuActivity;
import e23.p;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import xn.r;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f197474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SubscriptionDevMenuActivity f197475b;

    public /* synthetic */ a(SubscriptionDevMenuActivity subscriptionDevMenuActivity, int i14) {
        this.f197474a = i14;
        this.f197475b = subscriptionDevMenuActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f197474a;
        SubscriptionDevMenuActivity subscriptionDevMenuActivity = this.f197475b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = SubscriptionDevMenuActivity.f35309d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1876265636, new a(subscriptionDevMenuActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = SubscriptionDevMenuActivity.f35309d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(g02.d.f74342a.c(subscriptionDevMenuActivity.getOnBackPressedDispatcher()), z3.f.c(-433926684, new a(subscriptionDevMenuActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = SubscriptionDevMenuActivity.f35309d;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zR = mVar3.r(subscriptionDevMenuActivity);
                    Object objQ = mVar3.q();
                    m.a aVar = m.f135153a;
                    if (zR) {
                        objQ = new r(subscriptionDevMenuActivity, 20);
                        mVar3.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new r(subscriptionDevMenuActivity, 20);
                            mVar3.K(objQ);
                        }
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    f fVar = (f) subscriptionDevMenuActivity.f35311b.getValue();
                    boolean zR2 = mVar3.r(subscriptionDevMenuActivity);
                    Object objQ2 = mVar3.q();
                    if (zR2) {
                        objQ2 = new SubscriptionDevMenuActivity.b(subscriptionDevMenuActivity);
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new SubscriptionDevMenuActivity.b(subscriptionDevMenuActivity);
                            mVar3.K(objQ2);
                        }
                    }
                    e.a(aVar2, fVar, (p) ((k23.g) objQ2), mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
