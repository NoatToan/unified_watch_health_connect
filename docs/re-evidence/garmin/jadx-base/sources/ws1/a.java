package ws1;

import com.garmin.android.apps.connectmobile.trails.presentation.GarminTrailsActivity;
import e23.l;
import e23.p;
import g02.d;
import mt1.g;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.v;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f186947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GarminTrailsActivity f186948b;

    public /* synthetic */ a(GarminTrailsActivity garminTrailsActivity, int i14) {
        this.f186947a = i14;
        this.f186948b = garminTrailsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f186947a;
        GarminTrailsActivity garminTrailsActivity = this.f186948b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = GarminTrailsActivity.f45085a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, f.c(-737643728, new a(garminTrailsActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = GarminTrailsActivity.f45085a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    v.a(d.f74342a.c(garminTrailsActivity.getOnBackPressedDispatcher()), f.c(1482425968, new a(garminTrailsActivity, i15), mVar2), mVar2, 56);
                } else {
                    mVar2.e();
                }
                break;
            default:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = GarminTrailsActivity.f45085a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zR = mVar3.r(garminTrailsActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new vu1.b(garminTrailsActivity, 20);
                        mVar3.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new vu1.b(garminTrailsActivity, 20);
                            mVar3.K(objQ);
                        }
                    }
                    g.a(garminTrailsActivity, null, (l) objQ, mVar3, 0);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
