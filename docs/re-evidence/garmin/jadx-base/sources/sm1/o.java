package sm1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import i3.e9;
import i3.mc;
import o53.b0;
import org.apache.commons.lang3.CharUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import r1.c0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160134a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f160135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f160136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f160137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f160138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.a f160139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e23.a f160140g;

    public /* synthetic */ o(s sVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5) {
        this.f160135b = sVar;
        this.f160136c = aVar;
        this.f160137d = aVar2;
        this.f160138e = aVar3;
        this.f160139f = aVar4;
        this.f160140g = aVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        km1.v vVar;
        b0 b0Var;
        km1.v vVar2;
        mc mcVar;
        switch (this.f160134a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    pm1.f fVar = (pm1.f) KoinJavaComponent.get$default(pm1.f.class, null, null, 6, null);
                    nm1.m mVarC = fVar.c();
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    s sVar = this.f160135b;
                    p1 p1VarC = s9.c.c(sVar.f160188h, mVar);
                    p1 p1VarC2 = s9.c.c(sVar.f160191k, mVar);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = l0.j(t13.h.f161748a, mVar);
                        mVar.K(objQ);
                    }
                    b0 b0Var2 = (b0) objQ;
                    mc mcVarF = e9.f(true, null, mVar, 6, 2);
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new n82.f.a(((a0) p1VarC.getF182175a()).f160087c, null, ((a0) p1VarC.getF182175a()).f160088d, 2, null);
                        mVar.K(objQ2);
                    }
                    n82.f.a aVar = (n82.f.a) objQ2;
                    n82.f fVarA = n82.j.a(aVar, null, mVar, 2);
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = p0.n(Boolean.FALSE);
                        mVar.K(objQ3);
                    }
                    p1 p1Var = (p1) objQ3;
                    sn1.b.f160414a.getClass();
                    z02.d.a(((a0) p1VarC.getF182175a()).f160085a, z3.f.c(649961736, new ka0.e((!sn1.b.g() || sn1.b.f()) ? R.string.sleep_lbl_sleep : R.string.lbl_sleep_score, this.f160136c, this.f160137d, b0Var2, mcVarF, p1VarC), mVar), null, null, null, z3.f.c(-750171004, new a11.j(fVarA, context, sVar, aVar, this.f160138e, this.f160139f, this.f160140g, p1VarC2, p1VarC, p1Var), mVar), mVar, 196656, 28);
                    boolean zE = mcVarF.e();
                    char c14 = CharUtils.CR;
                    if (zE) {
                        mVar.C(1585323062);
                        o82.a aVarB = fVarA.b();
                        km1.c cVar = (km1.c) ((u82.f) sVar.f160192l.c(aVarB, mVar).getF182175a()).a();
                        if (cVar == null || (vVar = cVar.getDailySleep()) == null) {
                            vVar = new km1.v(0L, 0L, null, 0, 0, false, null, 0L, 0L, 0L, 0L, null, null, null, null, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 8191, null);
                        }
                        boolean z14 = !p005kotlin.jvm.internal.s.g(g22.l.h(aVarB.f130843a).toDateTimeAtStartOfDay(), DateTime.now().withTimeAtStartOfDay());
                        boolean zR = mVar.r(b0Var2) | mVar.B(mcVarF);
                        Object objQ4 = mVar.q();
                        if (zR || objQ4 == c2565a) {
                            objQ4 = new nw0.n(b0Var2, mcVarF, 13);
                            mVar.K(objQ4);
                        }
                        e23.a aVar2 = (e23.a) objQ4;
                        boolean zR2 = mVar.r(vVar) | mVar.r(sVar) | mVar.r(b0Var2) | mVar.B(mcVarF) | mVar.B(fVarA);
                        Object objQ5 = mVar.q();
                        if (zR2 || objQ5 == c2565a) {
                            b0Var = b0Var2;
                            vVar2 = vVar;
                            mcVar = mcVarF;
                            objQ5 = new jv0.c((Object) vVar2, (Object) sVar, b0Var, (Object) fVarA, (Object) mcVar, 25);
                            mVar.K(objQ5);
                        } else {
                            b0Var = b0Var2;
                            vVar2 = vVar;
                            mcVar = mcVarF;
                        }
                        in1.b.a(false, z14, vVar2, b0Var, mcVar, aVar2, (e23.l) objQ5, mVar, km1.v.P0 << 6, 1);
                        mVar.f();
                    } else {
                        mVar.C(1586951957);
                        mVar.f();
                    }
                    c0.e(((a0) p1VarC.getF182175a()).f160093i, null, null, null, null, z3.f.c(-2002149627, new ry0.g(c14, sVar, mVarC), mVar), mVar, 196608, 30);
                    c0.e(((a0) p1VarC.getF182175a()).f160094j, null, null, null, null, z3.f.c(-682455236, new mw0.h(fVar, context, sVar, mVarC, 21), mVar), mVar, 196608, 30);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                r.a(this.f160135b, this.f160136c, this.f160137d, this.f160138e, this.f160139f, this.f160140g, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(s sVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, e23.a aVar5, int i14) {
        this.f160135b = sVar;
        this.f160136c = aVar;
        this.f160137d = aVar2;
        this.f160138e = aVar3;
        this.f160139f = aVar4;
        this.f160140g = aVar5;
    }
}
