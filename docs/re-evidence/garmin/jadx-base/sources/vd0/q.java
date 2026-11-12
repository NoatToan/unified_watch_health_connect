package vd0;

import c22.s3;
import com.garmin.android.apps.connectmobile.dogs.presentation.AllDogsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f177359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AllDogsActivity f177360b;

    public /* synthetic */ q(AllDogsActivity allDogsActivity, int i14) {
        this.f177359a = i14;
        this.f177360b = allDogsActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object hVar;
        int i14 = this.f177359a;
        AllDogsActivity allDogsActivity = this.f177360b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                AllDogsActivity.a aVar = AllDogsActivity.f34686g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-223893647, new q(allDogsActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                AllDogsActivity.a aVar2 = AllDogsActivity.f34686g;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    allDogsActivity.f34692f = gl1.y.I(new lc.v0[0], mVar2);
                    boolean zR = mVar2.r(allDogsActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new v(allDogsActivity, 6);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v(allDogsActivity, 6);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zB = s3.b();
                    lc.m0 m0Var = allDogsActivity.f34692f;
                    if (m0Var == null) {
                        p005kotlin.jvm.internal.s.m("navController");
                        throw null;
                    }
                    if (allDogsActivity.getIntent().getBooleanExtra("extra_start_at_add_dog", false)) {
                        hVar = xd0.a.C3539a.INSTANCE;
                    } else {
                        hVar = allDogsActivity.getIntent().getBooleanExtra("extra_start_at_dog_profile", false) ? new xd0.a.h(allDogsActivity.getIntent().getLongExtra("extra_dog_id", -1L)) : xd0.a.f.INSTANCE;
                    }
                    boolean zR2 = mVar2.r(allDogsActivity) | mVar2.h(zB) | mVar2.B(aVar4);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new ad0.f(allDogsActivity, zB, aVar4, 26);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ad0.f(allDogsActivity, zB, aVar4, 26);
                            mVar2.K(objQ2);
                        }
                    }
                    nc.y.a(m0Var, hVar, null, null, null, null, null, null, null, (e23.l) objQ2, mVar2, 0, 2044);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
