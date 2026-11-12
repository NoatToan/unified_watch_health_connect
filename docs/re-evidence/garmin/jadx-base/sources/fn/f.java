package fn;

import android.content.Context;
import android.content.DialogInterface;
import au0.z;
import by0.g2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.live.activity.q;
import e23.l;
import e23.p;
import ep0.c0;
import f02.a0;
import f02.g0;
import f72.ma;
import f72.oe;
import f72.rb;
import fb1.d0;
import fo.w;
import fo.y;
import fp0.j;
import gn.o;
import gn.t;
import h4.r;
import i3.i7;
import java.util.List;
import kotlin.t1;
import org.joda.time.DateTimeConstants;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.j0;
import p13.x;
import p3.m;
import p3.n;
import p3.x1;
import u1.y0;
import v62.e1;
import v62.g4;
import v62.s6;
import yc.m1;
import yc.v2;
import yc.w2;
import yz1.u;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f72144a;

    public /* synthetic */ f(int i14) {
        this.f72144a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f72144a;
        int i15 = 14;
        m.a aVar = m.f135153a;
        int i16 = 5;
        int i17 = 2;
        switch (i14) {
            case 0:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                g gVar = g.f72145a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new o((j70.d) parametersHolder.elementAt(0, s0.f105811a.b(j70.d.class)));
            case 1:
                Scope scope = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                g gVar2 = g.f72145a;
                scope.getClass();
                parametersHolder2.getClass();
                t0 t0Var = s0.f105811a;
                if (((Boolean) ((j70.d) parametersHolder2.elementAt(0, t0Var.b(j70.d.class))).f97521b) != null) {
                    return (hp.c) scope.get((k23.d<?>) t0Var.b(hp.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                }
                return null;
            case 2:
                Scope scope2 = (Scope) obj;
                g gVar3 = g.f72145a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                Context contextAndroidContext = ModuleExtKt.androidContext(scope2);
                t0 t0Var2 = s0.f105811a;
                return new hp.c(contextAndroidContext, (z) scope2.get((k23.d<?>) t0Var2.b(z.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ah2.g) scope2.get((k23.d<?>) t0Var2.b(ah2.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (kr.a) scope2.get((k23.d<?>) t0Var2.b(kr.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 3:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                g gVar4 = g.f72145a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new gp.m((hp.c) parametersHolder3.elementAt(0, s0.f105811a.b(hp.c.class)));
            case 4:
                Scope scope3 = (Scope) obj;
                g gVar5 = g.f72145a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new q((kr.a) scope3.get((k23.d<?>) s0.f105811a.b(kr.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 5:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                h hVar = h.f72147a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new t((j70.d) parametersHolder4.elementAt(0, s0.f105811a.b(j70.d.class)));
            case 6:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                h hVar2 = h.f72147a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                j70.d dVar = (j70.d) parametersHolder5.elementAt(0, s0.f105811a.b(j70.d.class));
                sn.h hVar3 = (sn.h) dVar.f97521b;
                if (hVar3 != null) {
                    return new hp.f(dVar.f97520a, hVar3);
                }
                return null;
            case 7:
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                h hVar4 = h.f72147a;
                ((Scope) obj).getClass();
                parametersHolder6.getClass();
                return new gp.t((hp.f) parametersHolder6.elementAt(0, s0.f105811a.b(hp.f.class)));
            case 8:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                fn1.a aVar2 = fn1.a.f72180a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = s6.a(t62.b.f162798a);
                    long jG = fb1.c.g(d92.b.f58623a, mVar);
                    r.a aVar3 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(aVar3, j92.b.f97899b.f97920e), jG, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 9:
                fo.t tVar = (fo.t) obj;
                fo.t tVar2 = (fo.t) obj2;
                int i18 = fo.r.f72415i;
                tVar.getClass();
                tVar2.getClass();
                return Boolean.valueOf(s.g(tVar.f72439a, tVar2.f72439a) && s.g(tVar.f72440b, tVar2.f72440b) && s.g(tVar.f72441c, tVar2.f72441c));
            case 10:
                ((Integer) obj).intValue();
                y yVar = y.f72452a;
                ((wo0.a) obj2).getClass();
                return Unit.INSTANCE;
            case 11:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y yVar2 = y.f72452a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, null, 0L, mVar2, 48, 12);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 12:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                y yVar3 = y.f72452a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    List listK = x.k(w.b("Morning Run"), w.b("Evening Ride"));
                    v2.f196535e.getClass();
                    zc.d dVarA2 = zc.g.a(new r53.m(v2.d.a(listK)), mVar3);
                    fo.q qVar = new fo.q(am.g.f3942f, null, false, false, 0, false, null, null, null, null, null, false, null, 8190, null);
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new f(i15);
                        mVar3.K(objQ);
                    }
                    p pVar = (p) objQ;
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new fo.x(3);
                        mVar3.K(objQ2);
                    }
                    l lVar = (l) objQ2;
                    Object objQ3 = mVar3.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new d0(15);
                        mVar3.K(objQ3);
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new fo.x(4);
                        mVar3.K(objQ4);
                    }
                    l lVar2 = (l) objQ4;
                    Object objQ5 = mVar3.q();
                    if (objQ5 == c2565a) {
                        objQ5 = new fo.x(i16);
                        mVar3.K(objQ5);
                    }
                    l lVar3 = (l) objQ5;
                    Object objQ6 = mVar3.q();
                    if (objQ6 == c2565a) {
                        objQ6 = new fo.x(6);
                        mVar3.K(objQ6);
                    }
                    l lVar4 = (l) objQ6;
                    Object objQ7 = mVar3.q();
                    if (objQ7 == c2565a) {
                        objQ7 = new fh0.b(25);
                        mVar3.K(objQ7);
                    }
                    l lVar5 = (l) objQ7;
                    Object objQ8 = mVar3.q();
                    if (objQ8 == c2565a) {
                        objQ8 = new d0(12);
                        mVar3.K(objQ8);
                    }
                    e23.a aVar5 = (e23.a) objQ8;
                    Object objQ9 = mVar3.q();
                    if (objQ9 == c2565a) {
                        objQ9 = new fh0.b(26);
                        mVar3.K(objQ9);
                    }
                    fo.d.c(null, dVarA2, qVar, pVar, lVar, aVar4, lVar2, lVar3, lVar4, lVar5, aVar5, (l) objQ9, mVar3, 920349760, 54, 1);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 13:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                y yVar4 = y.f72452a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    v2.f196535e.getClass();
                    zc.d dVarA3 = zc.g.a(new r53.m(new v2(new r53.m(new m1.d(j0.f134944a, null, null)), v2.f196536f, v2.f196537g, w2.f196571a)), mVar4);
                    fo.q qVar2 = new fo.q(am.g.f3942f, null, false, false, 0, false, null, null, null, null, null, false, null, 8190, null);
                    Object objQ10 = mVar4.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ10 == c2565a2) {
                        objQ10 = new f(10);
                        mVar4.K(objQ10);
                    }
                    p pVar2 = (p) objQ10;
                    Object objQ11 = mVar4.q();
                    if (objQ11 == c2565a2) {
                        objQ11 = new fh0.b(27);
                        mVar4.K(objQ11);
                    }
                    l lVar6 = (l) objQ11;
                    Object objQ12 = mVar4.q();
                    if (objQ12 == c2565a2) {
                        objQ12 = new d0(13);
                        mVar4.K(objQ12);
                    }
                    e23.a aVar6 = (e23.a) objQ12;
                    Object objQ13 = mVar4.q();
                    if (objQ13 == c2565a2) {
                        objQ13 = new fh0.b(28);
                        mVar4.K(objQ13);
                    }
                    l lVar7 = (l) objQ13;
                    Object objQ14 = mVar4.q();
                    if (objQ14 == c2565a2) {
                        objQ14 = new fh0.b(29);
                        mVar4.K(objQ14);
                    }
                    l lVar8 = (l) objQ14;
                    Object objQ15 = mVar4.q();
                    if (objQ15 == c2565a2) {
                        objQ15 = new fo.x(false ? 1 : 0);
                        mVar4.K(objQ15);
                    }
                    l lVar9 = (l) objQ15;
                    Object objQ16 = mVar4.q();
                    if (objQ16 == c2565a2) {
                        objQ16 = new fo.x(1 == true ? 1 : 0);
                        mVar4.K(objQ16);
                    }
                    l lVar10 = (l) objQ16;
                    Object objQ17 = mVar4.q();
                    if (objQ17 == c2565a2) {
                        objQ17 = new d0(i15);
                        mVar4.K(objQ17);
                    }
                    e23.a aVar7 = (e23.a) objQ17;
                    Object objQ18 = mVar4.q();
                    if (objQ18 == c2565a2) {
                        objQ18 = new fo.x(i17);
                        mVar4.K(objQ18);
                    }
                    fo.d.c(null, dVarA3, qVar2, pVar2, lVar6, aVar6, lVar7, lVar8, lVar9, lVar10, aVar7, (l) objQ18, mVar4, 920349760, 54, 1);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj).intValue();
                y yVar5 = y.f72452a;
                ((wo0.a) obj2).getClass();
                return Unit.INSTANCE;
            case 15:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                fo.z zVar = fo.z.f72455a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = g4.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar5);
                    r.a aVar8 = r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA4, null, x2.q(aVar8, j92.b.f97901d.f97905d), jA, mVar5, 48, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 16:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                fp0.a aVar9 = fp0.a.f73142a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 17:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                fp0.a aVar10 = fp0.a.f73142a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    t4.d dVarA5 = n5.c.a(R.drawable.ic_chackmark, mVar7, 0);
                    d92.b.f58623a.getClass();
                    long jE = d92.b.a(mVar7).f().e();
                    r.a aVar11 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA5, null, x2.q(x2.c(c2.l.y(aVar11, j92.b.f97899b.f97917b), 1.0f), j92.b.f97901d.f97904c), jE, mVar7, 48, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 18:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                fp0.a aVar12 = fp0.a.f73142a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVarB = j.b(r.S, ((g6.c) mVar8.A(t1.f91490h)).getF69051c());
                    s62.a.f157643a.getClass();
                    u4.d dVarA6 = rb.a(t62.c.f162799a);
                    a0.f67723a.getClass();
                    gl.c.f77766a.getClass();
                    j.a(rVarB, dVarA6, gl.c.a(mVar8).c(), gl1.y.Q(mVar8, R.string.lbl_steps), "1000", null, "2000", null, null, fp0.a.f73144c, null, mVar8, 806903808, DateTimeConstants.MINUTES_PER_DAY);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 19:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                fp0.a aVar13 = fp0.a.f73142a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r rVarB2 = j.b(r.S, ((g6.c) mVar9.A(t1.f91490h)).getF69051c());
                    s62.a.f157643a.getClass();
                    u4.d dVarA7 = oe.a(t62.c.f162799a);
                    g0.f67735a.getClass();
                    gl.c.f77766a.getClass();
                    j.a(rVarB2, dVarA7, gl.c.a(mVar9).c(), gl1.y.Q(mVar9, R.string.lbl_weight), "55", null, null, null, new c0(0, o70.t.Q0.f130082a), null, null, mVar9, 24576, 1760);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 20:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                fr1.a aVar14 = fr1.a.f73287a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    t4.d dVarA8 = n5.c.a(2131232339, mVar10, 0);
                    r.a aVar15 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    y0.a(dVarA8, null, c2.l.y(aVar15, j92.b.f97899b.f97919d), null, null, 0.0f, null, mVar10, 48, 120);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 21:
                m mVar11 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                fr1.a aVar16 = fr1.a.f73287a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    b82.n.a(fr1.a.f73288b, gl1.y.Q(mVar11, R.string.lbl_feature_not_supported), gl1.y.Q(mVar11, R.string.msg_third_party_not_supported), null, null, mVar11, 6, 24);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 22:
                m mVar12 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                fs.a aVar17 = fs.a.f73352a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).intValue();
                cx2.h hVar5 = fv2.h.f73755f;
                ((DialogInterface) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                m mVar13 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                fx0.b bVar = fx0.b.f73785a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    r rVarJ = yz1.y.j(r.S, ((g6.c) mVar13.A(t1.f91490h)).getF69051c());
                    String strQ = gl1.y.Q(mVar13, R.string.pregnancy_title);
                    s62.a.f157643a.getClass();
                    fx0.j.a(rVarJ, strQ, ma.a(t62.c.f162799a), new bx0.d.e(new yz1.d(u.SUCCESS, null, false, 6, null), 191, Float.valueOf(0.5f), 5, Integer.valueOf(R.string.pregnancy_papaya), ww0.q.SECOND), mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                fy0.d dVar2 = fy0.d.f73881a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new g2();
            case 26:
                Scope scope4 = (Scope) obj;
                fy0.d dVar3 = fy0.d.f73881a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new gy0.t1((by0.a) scope4.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                Scope scope5 = (Scope) obj;
                fy0.d dVar4 = fy0.d.f73881a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new gy0.j((ey0.g0) scope5.get((k23.d<?>) s0.f105811a.b(ey0.g0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                Scope scope6 = (Scope) obj;
                fy0.d dVar5 = fy0.d.f73881a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new gy0.e1((by0.a) scope6.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                Scope scope7 = (Scope) obj;
                fy0.d dVar6 = fy0.d.f73881a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                return new gy0.j0((by0.a) scope7.get((k23.d<?>) s0.f105811a.b(by0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
        }
    }
}
