package com.garmin.android.apps.connectmobile.live.activity;

import p005kotlin.Unit;
import p3.v;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class g implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveActivityDevMenuActivity f38423b;

    public /* synthetic */ g(LiveActivityDevMenuActivity liveActivityDevMenuActivity, int i14) {
        this.f38422a = i14;
        this.f38423b = liveActivityDevMenuActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f38422a;
        LiveActivityDevMenuActivity liveActivityDevMenuActivity = this.f38423b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = LiveActivityDevMenuActivity.f38382b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(252521084, new g(liveActivityDevMenuActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = LiveActivityDevMenuActivity.f38382b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    v.a(g02.d.f74342a.c(liveActivityDevMenuActivity.getOnBackPressedDispatcher()), z3.f.c(-314999364, new g(liveActivityDevMenuActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = LiveActivityDevMenuActivity.f38382b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zR = mVar3.r(liveActivityDevMenuActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new c32.k(liveActivityDevMenuActivity, 21);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new c32.k(liveActivityDevMenuActivity, 21);
                            mVar3.K(objQ);
                        }
                    }
                    xy2.b.d((e23.a) objQ, (h) liveActivityDevMenuActivity.f38383a.getValue(), mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
