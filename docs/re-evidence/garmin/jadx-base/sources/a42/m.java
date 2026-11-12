package a42;

import android.content.Context;
import c2.q2;
import c2.s2;
import c2.u2;
import c22.x0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.g3;
import i3.a1;
import i3.fe;
import i3.mc;
import i3.mj;
import i3.nj;
import i3.t2;
import lc.u0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class m implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1047f;

    public /* synthetic */ m(int i14, String str, String str2, String str3, String str4) {
        this.f1042a = 5;
        this.f1044c = str;
        this.f1045d = str2;
        this.f1046e = str3;
        this.f1047f = str4;
        this.f1043b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        e23.a aVar;
        int i14 = this.f1042a;
        int i15 = this.f1043b;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj4 = this.f1047f;
        Object obj5 = this.f1046e;
        Object obj6 = this.f1045d;
        Object obj7 = this.f1044c;
        switch (i14) {
            case 0:
                boolean z14 = false;
                Context context = (Context) obj7;
                s sVar = (s) obj6;
                o53.b0 b0Var = (o53.b0) obj5;
                a1 a1Var = (a1) obj4;
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                s.a aVar3 = s.f1073g;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                int i16 = iIntValue;
                if ((i16 & 19) != 18) {
                    z14 = true;
                }
                if (mVar.n(i16 & 1, z14)) {
                    x1 x1Var = p3.n.f135158a;
                    x0.f23314a.getClass();
                    rVar.m((i16 << 6) & 896, 2, gl1.d.W(x0.f23692wb), null, mVar);
                    rVar.j(z3.f.c(2134384110, new n(rVar, context, this.f1043b, sVar, b0Var, a1Var, 0), mVar), mVar, ((i16 << 3) & 112) | 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ou0.b bVar = (ou0.b) obj7;
                e23.l lVar = (e23.l) obj6;
                e23.a aVar4 = (e23.a) obj5;
                p1 p1Var = (p1) obj4;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((fe) obj).getClass();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    x1 x1Var2 = p3.n.f135158a;
                    if (((g3) p1Var.getF182175a()).f35300a == fw.p.SUCCESS) {
                        mVar2.C(-1872728187);
                        hv0.c.b(bVar, this.f1043b, lVar, aVar4, mVar2, 0);
                        mVar2.f();
                    } else {
                        mVar2.C(-1872457185);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                o53.b0 b0Var2 = (o53.b0) obj5;
                mc mcVar = (mc) obj7;
                e23.p pVar = (e23.p) obj6;
                e23.p pVar2 = (e23.p) obj4;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c2.a0) obj).getClass();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x1 x1Var3 = p3.n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.f fVar = c2.j.f22699i;
                    h4.r.a aVar5 = h4.r.S;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(fVar, h4.d.a.f81533k, mVar3, 6);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    h4.r rVarC = h4.k.c(aVar5, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar6);
                    } else {
                        mVar3.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar3);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC, mVar3);
                    u2 u2Var = u2.f22900a;
                    nj njVar = nj.f89109a;
                    long jE = vb.h.e(d92.b.f58623a, mVar3);
                    long jF = u0.f(mVar3);
                    long jB = d92.b.a(mVar3).k().b();
                    njVar.getClass();
                    mj mjVarB = nj.b(jE, jF, jB, mVar3, 50);
                    z3.e eVarC = z3.f.c(-1077319598, new ba2.e(i15, 6), mVar3);
                    z3.e eVarC2 = z3.f.c(1386942992, new fn1.n(b0Var2, mcVar, 2), mVar3);
                    kn1.a.f105643a.getClass();
                    i3.y.b(eVarC, null, eVarC2, kn1.a.f105647e, 0.0f, null, mjVarB, mVar3, 3462, 178);
                    mVar3.y();
                    h4.r rVarB = a2.b(aVar5, a2.a(mVar3), true);
                    c2.z zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarB, mVar3);
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar6);
                    } else {
                        mVar3.c();
                    }
                    b4.c(eVar, zVarA, mVar3);
                    b4.c(c1623g, i2VarX2, mVar3);
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    b4.c(fVar2, rVarC2, mVar3);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    pVar.invoke(mVar3, 0);
                    pVar2.invoke(mVar3, 0);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                String str = (String) obj7;
                String str2 = (String) obj6;
                i53.f fVar3 = (i53.f) obj5;
                String str3 = (String) obj4;
                h4.r rVar2 = (h4.r) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                rVar2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.B(rVar2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = p3.n.f135158a;
                    boolean zB = mVar4.B(str) | mVar4.B(str2);
                    Object objQ = mVar4.q();
                    if (zB) {
                        objQ = new cn1.j(str, str2, 12);
                        mVar4.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new cn1.j(str, str2, 12);
                            mVar4.K(objQ);
                        }
                    }
                    z72.k.b(i15 / 100.0f, yz1.k.d(mVar4), 3.0f, 102236160, SyslogConstants.LOG_LOCAL2, fb1.c.i(gl.c.f77766a, mVar4), z3.f.c(891041412, new j21.p(str3, 10), mVar4), p5.v.c((e23.l) objQ, rVar2, false), fVar3, mVar4, false);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                sm1.s sVar2 = (sm1.s) obj6;
                o53.b0 b0Var4 = (o53.b0) obj5;
                Context context2 = (Context) obj7;
                p1 p1Var2 = (p1) obj4;
                e23.a aVar7 = (e23.a) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                aVar7.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.r(aVar7) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i17 = iIntValue5 & 14;
                    boolean z15 = i17 == 4;
                    int i18 = this.f1043b;
                    boolean zK = z15 | mVar5.k(i18) | mVar5.r(sVar2) | mVar5.r(b0Var4) | mVar5.r(context2);
                    Object objQ2 = mVar5.q();
                    if (zK) {
                        aVar = aVar7;
                        t2 t2Var = new t2(aVar, i18, sVar2, p1Var2, b0Var4, context2);
                        mVar5.K(t2Var);
                        objQ2 = t2Var;
                    } else {
                        aVar2.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            aVar = aVar7;
                            t2 t2Var2 = new t2(aVar, i18, sVar2, p1Var2, b0Var4, context2);
                            mVar5.K(t2Var2);
                            objQ2 = t2Var2;
                        } else {
                            aVar = aVar7;
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ2;
                    boolean z16 = i17 == 4;
                    Object objQ3 = mVar5.q();
                    if (z16) {
                        objQ3 = new pf0.j(aVar, 9);
                        mVar5.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new pf0.j(aVar, 9);
                            mVar5.K(objQ3);
                        }
                    }
                    pn1.e.a(aVar8, (e23.a) objQ3, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            default:
                String str4 = (String) obj7;
                String str5 = (String) obj6;
                String str6 = (String) obj5;
                String str7 = (String) obj4;
                c2.t tVar = (c2.t) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                tVar.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.B(tVar) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = p3.n.f135158a;
                    tw.c.c(tVar, str4, str5, str6, str7, this.f1043b, mVar6, iIntValue6 & 14);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(int i14, Object obj, Object obj2, Object obj3, Object obj4, int i15) {
        this.f1042a = i15;
        this.f1044c = obj;
        this.f1043b = i14;
        this.f1045d = obj2;
        this.f1046e = obj3;
        this.f1047f = obj4;
    }

    public /* synthetic */ m(int i14, o53.b0 b0Var, mc mcVar, e23.p pVar, e23.p pVar2) {
        this.f1042a = 2;
        this.f1043b = i14;
        this.f1046e = b0Var;
        this.f1044c = mcVar;
        this.f1045d = pVar;
        this.f1047f = pVar2;
    }

    public /* synthetic */ m(int i14, sm1.s sVar, o53.b0 b0Var, Context context, p1 p1Var) {
        this.f1042a = 4;
        this.f1043b = i14;
        this.f1045d = sVar;
        this.f1046e = b0Var;
        this.f1044c = context;
        this.f1047f = p1Var;
    }

    public /* synthetic */ m(String str, String str2, i53.f fVar, int i14, String str3) {
        this.f1042a = 3;
        this.f1044c = str;
        this.f1045d = str2;
        this.f1046e = fVar;
        this.f1043b = i14;
        this.f1047f = str3;
    }
}
