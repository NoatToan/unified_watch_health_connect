package q42;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import i3.e9;
import i3.mc;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.x1;
import p40.o0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f142671a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f142672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f142673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.a f142674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f142675e;

    public /* synthetic */ r(y yVar, e23.a aVar, e23.a aVar2, d0 d0Var) {
        this.f142672b = yVar;
        this.f142674d = aVar;
        this.f142675e = aVar2;
        this.f142673c = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f142671a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    y yVar = this.f142672b;
                    p1 p1VarC = s9.c.c(yVar.f142756l, mVar);
                    p1 p1VarC2 = s9.c.c(yVar.f142750f, mVar);
                    f12.l lVar = (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null);
                    mc mcVarF = e9.f(false, null, mVar, 0, 3);
                    Object objQ = mVar.q();
                    p3.m.f135153a.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = l0.j(t13.h.f161748a, mVar);
                        mVar.K(objQ);
                    }
                    o53.b0 b0Var = (o53.b0) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                        mVar.K(objQ2);
                    }
                    i53.f fVar = (i53.f) objQ2;
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new n82.f.a(((f0) p1VarC.getF182175a()).f142636b, null, ((f0) p1VarC.getF182175a()).f142635a, 2, null);
                        mVar.K(objQ3);
                    }
                    n82.f fVarA = n82.j.a((n82.f.a) objQ3, null, mVar, 2);
                    o82.g gVarA = fVarA.f124961b.a();
                    g.h hVar = new g.h();
                    boolean zR = mVar.r(yVar);
                    Object objQ4 = mVar.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new s(yVar, 1);
                        mVar.K(objQ4);
                    }
                    c.q qVarC = c.w.c(hVar, (e23.l) objQ4, mVar, 0);
                    mc mcVarF2 = e9.f(true, null, mVar, 6, 2);
                    Boolean boolValueOf = Boolean.valueOf(((f0) p1VarC.getF182175a()).f142640f);
                    boolean zB = mVar.B(p1VarC) | mVar.B(mcVarF2);
                    Object objQ5 = mVar.q();
                    if (zB || objQ5 == c2565a) {
                        objQ5 = new x.a(mcVarF2, p1VarC, null);
                        mVar.K(objQ5);
                    }
                    l0.e((e23.p) objQ5, boolValueOf, mVar);
                    if (((f0) p1VarC.getF182175a()).f142640f) {
                        mVar.C(863187691);
                        boolean zR2 = mVar.r(b0Var) | mVar.B(mcVarF2) | mVar.r(yVar);
                        Object objQ6 = mVar.q();
                        if (zR2 || objQ6 == c2565a) {
                            objQ6 = new v(b0Var, 0, mcVarF2, yVar);
                            mVar.K(objQ6);
                        }
                        t42.f.a((e23.a) objQ6, mcVarF2, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(863503860);
                        mVar.f();
                    }
                    z02.d.a(false, z3.f.c(-1264366093, new a42.e0(this.f142674d, gVarA, lVar, fVarA, yVar, context, qVarC, this.f142675e, b0Var, mcVarF, p1VarC2), mVar), null, null, null, z3.f.c(-1614610697, new b21.l0(fVar, (Object) gVarA, (Object) fVarA, (Object) context, (Object) yVar, (Object) this.f142673c, (Object) qVarC, 27), mVar), mVar, 196656, 29);
                    if (mcVarF.e()) {
                        mVar.C(872298095);
                        i53.c cVar = (i53.c) p1VarC2.getF182175a();
                        boolean zR3 = mVar.r(b0Var) | mVar.B(mcVarF) | mVar.r(yVar);
                        Object objQ7 = mVar.q();
                        if (zR3 || objQ7 == c2565a) {
                            objQ7 = new p90.h(b0Var, 11, yVar, mcVarF);
                            mVar.K(objQ7);
                        }
                        t42.e.a(mcVarF, b0Var, cVar, (e23.l) objQ7, mVar, l42.c.f109921p << 6);
                        mVar.f();
                    } else {
                        mVar.C(872579668);
                        mVar.f();
                    }
                    if (((f0) p1VarC.getF182175a()).f142638d != null) {
                        mVar.C(872645884);
                        l42.c cVar2 = ((f0) p1VarC.getF182175a()).f142638d;
                        Long lValueOf = cVar2 != null ? Long.valueOf(new DateTime(cVar2.m(), DateTimeZone.getDefault()).getMillis()) : null;
                        boolean zR4 = mVar.r(yVar);
                        Object objQ8 = mVar.q();
                        if (zR4 || objQ8 == c2565a) {
                            objQ8 = new w(yVar, 0);
                            mVar.K(objQ8);
                        }
                        e23.a aVar = (e23.a) objQ8;
                        boolean zR5 = mVar.r(yVar) | mVar.B(p1VarC);
                        Object objQ9 = mVar.q();
                        if (zR5 || objQ9 == c2565a) {
                            objQ9 = new o0(21, yVar, p1VarC);
                            mVar.K(objQ9);
                        }
                        og.a.c(lValueOf, aVar, (e23.a) objQ9, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(873160980);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                x.a(this.f142672b, this.f142673c, this.f142674d, this.f142675e, (p3.m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(y yVar, d0 d0Var, e23.a aVar, e23.a aVar2, int i14) {
        this.f142672b = yVar;
        this.f142673c = d0Var;
        this.f142674d = aVar;
        this.f142675e = aVar2;
    }
}
