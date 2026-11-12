package sg0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.familyaccounts.presentation.managefamily.ManageFamilyActivity;
import i3.e9;
import i3.mc;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ManageFamilyActivity f159148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f159149c;

    public /* synthetic */ r0(ManageFamilyActivity manageFamilyActivity, String str, int i14) {
        this.f159147a = i14;
        this.f159148b = manageFamilyActivity;
        this.f159149c = str;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        mc mcVar;
        int i14 = this.f159147a;
        String str = this.f159149c;
        ManageFamilyActivity manageFamilyActivity = this.f159148b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ManageFamilyActivity.a aVar = ManageFamilyActivity.f35178j;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1808364613, new r0(manageFamilyActivity, str, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ManageFamilyActivity.a aVar2 = ManageFamilyActivity.f35178j;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x.f159180a.getClass();
                    z02.d.a(false, x.f159181b, null, null, null, z3.f.c(380415886, new r0(manageFamilyActivity, str, i15), mVar2), mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ManageFamilyActivity.a aVar3 = ManageFamilyActivity.f35178j;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    Object objQ = mVar3.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.l0.j(t13.h.f161748a, mVar3);
                        mVar3.K(objQ);
                    }
                    o53.b0 b0Var = (o53.b0) objQ;
                    Context context = (Context) mVar3.A(AndroidCompositionLocals_androidKt.f6042b);
                    lc.m0 m0VarI = gl1.y.I(new lc.v0[0], mVar3);
                    ManageFamilyActivity manageFamilyActivity2 = this.f159148b;
                    manageFamilyActivity2.f35182d = m0VarI;
                    mc mcVarF = e9.f(true, null, mVar3, 6, 2);
                    boolean zR = mVar3.r(manageFamilyActivity2);
                    Object objQ2 = mVar3.q();
                    if (zR || objQ2 == c2565a) {
                        objQ2 = new p0(manageFamilyActivity2, 4);
                        mVar3.K(objQ2);
                    }
                    e23.a aVar4 = (e23.a) objQ2;
                    String str2 = this.f159149c;
                    boolean zB = mVar3.B(str2) | mVar3.r(b0Var) | mVar3.B(mcVarF);
                    Object objQ3 = mVar3.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = new ManageFamilyActivity.b(str2, b0Var, mcVarF, null);
                        mVar3.K(objQ3);
                    }
                    p3.l0.e((e23.p) objQ3, str2, mVar3);
                    lc.m0 m0Var = manageFamilyActivity2.f35182d;
                    if (m0Var == null) {
                        p005kotlin.jvm.internal.s.m("navController");
                        throw null;
                    }
                    y yVar = y.INSTANCE;
                    boolean zR2 = mVar3.r(manageFamilyActivity2) | mVar3.B(aVar4) | mVar3.r(b0Var) | mVar3.B(mcVarF) | mVar3.r(context);
                    Object objQ4 = mVar3.q();
                    if (zR2 || objQ4 == c2565a) {
                        objQ4 = new jv0.c((Object) manageFamilyActivity2, (Object) aVar4, b0Var, (Object) mcVarF, (Object) context, 24);
                        mcVar = mcVarF;
                        mVar3.K(objQ4);
                    } else {
                        mcVar = mcVarF;
                    }
                    nc.y.a(m0Var, yVar, null, null, null, null, null, null, null, (e23.l) objQ4, mVar3, 0, 2044);
                    if (mcVar.e()) {
                        mVar3.C(-1441929333);
                        ve2.e eVarH = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).h();
                        boolean zR3 = mVar3.r(manageFamilyActivity2) | mVar3.r(context);
                        Object objQ5 = mVar3.q();
                        if (zR3 || objQ5 == c2565a) {
                            objQ5 = new ry0.g(8, manageFamilyActivity2, context);
                            mVar3.K(objQ5);
                        }
                        e23.q qVar = (e23.q) objQ5;
                        boolean zR4 = mVar3.r(manageFamilyActivity2);
                        Object objQ6 = mVar3.q();
                        if (zR4 || objQ6 == c2565a) {
                            objQ6 = new o0(manageFamilyActivity2, 0);
                            mVar3.K(objQ6);
                        }
                        h.a(eVarH, str2, mcVar, qVar, (e23.l) objQ6, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(-1440453516);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
        }
    }
}
