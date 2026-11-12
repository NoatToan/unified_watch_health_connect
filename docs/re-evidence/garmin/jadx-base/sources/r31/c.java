package r31;

import androidx.lifecycle.n0;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.onboarding.presentation.DeviceOnboardingActivity;
import p005kotlin.Unit;
import p3.l0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceOnboardingActivity f149991b;

    public /* synthetic */ c(DeviceOnboardingActivity deviceOnboardingActivity, int i14) {
        this.f149990a = i14;
        this.f149991b = deviceOnboardingActivity;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:39:0x012b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, o13.l] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f149990a;
        DeviceOnboardingActivity deviceOnboardingActivity = this.f149991b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                DeviceOnboardingActivity.a aVar = DeviceOnboardingActivity.f39726b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1513567639, new c(deviceOnboardingActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ?? r14 = deviceOnboardingActivity.f39727a;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                DeviceOnboardingActivity.a aVar2 = DeviceOnboardingActivity.f39726b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    p1 p1VarC = s9.c.c(((g) r14.getValue()).f150014e, mVar2);
                    p1 p1VarC2 = s9.c.c(((g) r14.getValue()).f150015f, mVar2);
                    n0 n0Var = (n0) mVar2.A(s9.j.f158018a);
                    boolean zR = mVar2.r(deviceOnboardingActivity) | mVar2.r(n0Var);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new ph1.d(26, n0Var, deviceOnboardingActivity);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ph1.d(26, n0Var, deviceOnboardingActivity);
                            mVar2.K(objQ);
                        }
                    }
                    l0.a(n0Var, (e23.l) objQ, mVar2);
                    boolean zBooleanValue = ((Boolean) p1VarC2.getF182175a()).booleanValue();
                    j jVar = (j) p1VarC.getF182175a();
                    boolean zR2 = mVar2.r(deviceOnboardingActivity);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new c(deviceOnboardingActivity, i15);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new c(deviceOnboardingActivity, i15);
                            mVar2.K(objQ2);
                        }
                    }
                    e23.p pVar = (e23.p) objQ2;
                    boolean zR3 = mVar2.r(deviceOnboardingActivity);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new b(deviceOnboardingActivity, i16);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new b(deviceOnboardingActivity, i16);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    boolean zR4 = mVar2.r(deviceOnboardingActivity);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        objQ4 = new b(deviceOnboardingActivity, i15);
                        mVar2.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new b(deviceOnboardingActivity, i15);
                            mVar2.K(objQ4);
                        }
                    }
                    f.a(zBooleanValue, jVar, pVar, aVar4, (e23.a) objQ4, mVar2, 0);
                    j jVar2 = (j) p1VarC.getF182175a();
                    boolean zB = mVar2.B(p1VarC);
                    Object objQ5 = mVar2.q();
                    if (zB) {
                        objQ5 = new DeviceOnboardingActivity.b(p1VarC, null);
                        mVar2.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new DeviceOnboardingActivity.b(p1VarC, null);
                            mVar2.K(objQ5);
                        }
                    }
                    l0.e((e23.p) objQ5, jVar2, mVar2);
                } else {
                    mVar2.e();
                }
                break;
            default:
                k31.c cVar = (k31.c) obj;
                d31.c cVar2 = (d31.c) obj2;
                DeviceOnboardingActivity.a aVar5 = DeviceOnboardingActivity.f39726b;
                cVar.getClass();
                cVar2.getClass();
                g gVar = (g) deviceOnboardingActivity.f39727a.getValue();
                gVar.getClass();
                if (((j) gVar.f150014e.f150540a.getValue()).f150028a != -1) {
                    ge1.b.T(v1.a(gVar), null, null, new i(gVar, cVar, cVar2, null), 3);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
