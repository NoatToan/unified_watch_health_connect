package qw;

import a42.e0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.o;
import c.q;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import i3.e9;
import i3.mc;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148178a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f148179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f148180c;

    public /* synthetic */ a(g gVar, e23.a aVar) {
        this.f148179b = gVar;
        this.f148180c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String string;
        switch (this.f148178a) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
                    g gVar = this.f148179b;
                    p1 p1VarC = s9.c.c(gVar.f148249d, mVar);
                    p1 p1VarC2 = s9.c.c(gVar.f148251f, mVar);
                    mc mcVarF = e9.f(false, null, mVar, 0, 3);
                    Object objQ = mVar.q();
                    m.f135153a.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = l0.j(t13.h.f161748a, mVar);
                        mVar.K(objQ);
                    }
                    b0 b0Var = (b0) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = i53.a.a(o82.g.f130850c, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                        mVar.K(objQ2);
                    }
                    i53.f fVar = (i53.f) objQ2;
                    Object objQ3 = mVar.q();
                    if (objQ3 == c2565a) {
                        n82.f.a aVar = new n82.f.a(((l) p1VarC.getF182175a()).f148285b, null, ((l) p1VarC.getF182175a()).f148286c, 2, null);
                        mVar.K(aVar);
                        objQ3 = aVar;
                    }
                    n82.f fVarA = n82.j.a((n82.f.a) objQ3, null, mVar, 2);
                    o82.g gVarA = fVarA.f124961b.a();
                    int i14 = f.g.f148244a[gVarA.ordinal()];
                    if (i14 == 1) {
                        string = context.getString(R.string.lbl_one_day_abbr);
                        string.getClass();
                    } else if (i14 == 2) {
                        string = context.getString(R.string.lbl_seven_days);
                        string.getClass();
                    } else if (i14 == 3) {
                        string = context.getString(R.string.lbl_four_weeks);
                        string.getClass();
                    } else if (i14 != 4) {
                        string = "";
                    } else {
                        string = context.getString(R.string.lbl_one_year_abbr);
                        string.getClass();
                    }
                    String str = string;
                    g.h hVar = new g.h();
                    boolean zR = mVar.r(gVar);
                    Object objQ4 = mVar.q();
                    if (zR || objQ4 == c2565a) {
                        objQ4 = new d(gVar, 0);
                        mVar.K(objQ4);
                    }
                    q qVarC = w.c(hVar, (e23.l) objQ4, mVar, 0);
                    z02.d.a(false, z3.f.c(1836680515, new e0(this.f148180c, gVarA, str, fVarA, context, qVarC, p1VarC2, b0Var, mcVarF, gVar, p1VarC), mVar), null, null, null, z3.f.c(1037667655, new oy0.b(fVar, gVarA, fVarA, context, gVar, qVarC, 8), mVar), mVar, 196656, 29);
                    if (mcVarF.e()) {
                        mVar.C(-405328096);
                        i53.c cVar = (i53.c) p1VarC2.getF182175a();
                        boolean zR2 = mVar.r(b0Var) | mVar.B(mcVarF) | mVar.r(gVar);
                        Object objQ5 = mVar.q();
                        if (zR2 || objQ5 == c2565a) {
                            objQ5 = new p90.h(b0Var, 17, gVar, mcVarF);
                            mVar.K(objQ5);
                        }
                        tw.e.a(mcVarF, b0Var, cVar, (e23.l) objQ5, mVar, pw.a.f141687m << 6);
                        mVar.f();
                    } else {
                        mVar.C(-405047484);
                        mVar.f();
                    }
                    if (((l) p1VarC.getF182175a()).f148287d != null) {
                        mVar.C(-404987840);
                        pw.a aVar2 = ((l) p1VarC.getF182175a()).f148287d;
                        Long lValueOf = aVar2 != null ? Long.valueOf(aVar2.k()) : null;
                        boolean zR3 = mVar.r(gVar);
                        Object objQ6 = mVar.q();
                        if (zR3 || objQ6 == c2565a) {
                            objQ6 = new e(gVar, 0);
                            mVar.K(objQ6);
                        }
                        e23.a aVar3 = (e23.a) objQ6;
                        boolean zR4 = mVar.r(gVar);
                        Object objQ7 = mVar.q();
                        if (zR4 || objQ7 == c2565a) {
                            objQ7 = new e(gVar, 1);
                            mVar.K(objQ7);
                        }
                        og2.k.f(lValueOf, aVar3, (e23.a) objQ7, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-404676476);
                        mVar.f();
                    }
                    o oVar = ((l) p1VarC.getF182175a()).f148284a;
                    boolean zB = mVar.B(p1VarC) | mVar.k(gVarA.ordinal()) | mVar.B(fVarA);
                    Object objQ8 = mVar.q();
                    if (zB || objQ8 == c2565a) {
                        objQ8 = new f.C2794f(p1VarC, gVarA, fVarA, null);
                        mVar.K(objQ8);
                    }
                    l0.e((p) objQ8, oVar, mVar);
                } else {
                    mVar.e();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f.a(this.f148179b, this.f148180c, (m) obj, p0.t(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(g gVar, e23.a aVar, int i14) {
        this.f148179b = gVar;
        this.f148180c = aVar;
    }
}
