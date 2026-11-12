package vc0;

import android.content.DialogInterface;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gcplus.presentation.home.GCPlusHomeActivity;
import f5.z0;
import f72.o0;
import h5.e0;
import i3.i7;
import l72.u1;
import n70.h7;
import n70.k1;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.slf4j.Logger;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import v62.e1;
import v62.j1;
import vd0.l0;
import vd0.m0;
import vd0.q0;
import vd0.r0;
import vd0.t0;
import z70.j0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class i implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f176989a;

    public /* synthetic */ i(int i14) {
        this.f176989a = i14;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f176989a;
        p3.m.a aVar = p3.m.f135153a;
        rh0.a aVar2 = null;
        int i15 = 1;
        switch (i14) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                Logger logger = j.f176990h;
                dialogInterface.getClass();
                dialogInterface.cancel();
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                vd0.p.d((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                vd0.p.c((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                m0 m0Var = m0.f177325a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = o0.a(t62.c.f162799a);
                    d92.b.f58623a.getClass();
                    long jF = d92.b.a(mVar).f().f();
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA, null, x2.q(aVar3, j92.b.f97901d.f97904c), jF, mVar, 48, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                vd0.o0 o0Var = vd0.o0.f177343a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar4, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar5);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.u uVar = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = j1.a(t62.b.f162798a);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar2);
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, "", x2.q(aVar4, j92.b.f97901d.f97904c), jA, mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                vd0.o0 o0Var2 = vd0.o0.f177343a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new v10.a(22);
                        mVar3.K(objQ);
                    }
                    l0.g((e23.a) objQ, false, null, mVar3, 54, 4);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                vd0.o0 o0Var3 = vd0.o0.f177343a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    pe0.h.a aVar6 = pe0.h.f137441g;
                    i53.f<pe0.h> fVarB = aVar6.b();
                    i53.f<pe0.h> fVarB2 = aVar6.b();
                    pe0.i iVar = new pe0.i(Double.valueOf(10.0d), Double.valueOf(2000.0d), 8);
                    pe0.g gVar = pe0.g.MOST_RECENT;
                    Object objQ2 = mVar4.q();
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new v10.a(23);
                        mVar4.K(objQ2);
                    }
                    l0.f(fVarB, fVarB2, iVar, null, gVar, false, false, false, (e23.a) objQ2, null, null, null, null, null, mVar4, 113274240, 15968);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                vd0.p0 p0Var = vd0.p0.f177348a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, null, 0L, mVar5, 48, 12);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                vd0.p0 p0Var2 = vd0.p0.f177348a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    i7.b(e1.a(t62.b.f162798a), null, null, 0L, mVar6, 48, 12);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                q0 q0Var = q0.f177361a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar7, j92.b.f97899b.f97920e), mVar7);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                q0 q0Var2 = q0.f177361a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar8 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.u(aVar8, j92.b.f97899b.f97920e), mVar8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                r0 r0Var = r0.f177368a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = o0.a(t62.c.f162799a);
                    d92.b.f58623a.getClass();
                    long jF2 = d92.b.a(mVar9).f().f();
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, null, x2.q(aVar9, j92.b.f97901d.f97904c), jF2, mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                t0.c((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                t0.e((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                vh0.a aVar10 = vh0.a.f178404a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new bi0.a(new wh0.b((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class)), new ae0.b(), new ae0.e("FLOORS_CLIMBED", false, 2, null)));
            case 15:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                vh0.a aVar11 = vh0.a.f178404a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new ai0.a((bi0.a) parametersHolder2.elementAt(0, s0.f105811a.b(bi0.a.class)));
            case 16:
                Scope scope = (Scope) obj;
                vh0.a aVar12 = vh0.a.f178404a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new xh0.h(new uh0.d(aVar2, i15, null == true ? 1 : 0), new is1.e(null == true ? 1 : 0, i15, null == true ? 1 : 0), al0.a.C0064a.a(al0.a.f3717b), ci0.j.f27657b, (zd0.h) scope.get((k23.d<?>) s0.f105811a.b(zd0.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                Scope scope2 = (Scope) obj;
                vh0.b bVar2 = vh0.b.f178406a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new th0.b((f12.l) Scope.get$default(scope2, s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 18:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                vj0.a aVar13 = vj0.a.f178448a;
                scope3.getClass();
                parametersHolder3.getClass();
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                return new ck0.m((ck0.t) parametersHolder3.elementAt(0, t0Var.b(ck0.t.class)), (z70.j) scope3.get((k23.d<?>) t0Var.b(z70.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 19:
                vj0.a aVar14 = vj0.a.f178448a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new xj0.a();
            case 20:
                vj0.a aVar15 = vj0.a.f178448a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (qj0.m) ez0.b.a(ez0.b.f67468a, ez0.c.OMT_CMS, qj0.m.class, new c83.h.a[0], null, null, null, 120);
            case 21:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                vj0.a aVar16 = vj0.a.f178448a;
                scope4.getClass();
                parametersHolder4.getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                return new zj0.e(((Boolean) parametersHolder4.elementAt(0, t0Var2.b(Boolean.class))).booleanValue(), (zd0.u) scope4.get((k23.d<?>) t0Var2.b(zd0.u.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 22:
                vj0.a aVar17 = vj0.a.f178448a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new oj0.d();
            case 23:
                vj0.a aVar18 = vj0.a.f178448a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (oj0.x) ez0.b.a(ez0.b.f67468a, ez0.c.OMT, oj0.x.class, new c83.h.a[0], null, null, null, 120);
            case 24:
                Scope scope5 = (Scope) obj;
                vj0.a aVar19 = vj0.a.f178448a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = s0.f105811a;
                return new oj0.f((qj0.m) scope5.get((k23.d<?>) t0Var3.b(qj0.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (oj0.a) scope5.get((k23.d<?>) t0Var3.b(oj0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (oj0.x) scope5.get((k23.d<?>) t0Var3.b(oj0.x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (j0) scope5.get((k23.d<?>) t0Var3.b(j0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a80.b) scope5.get((k23.d<?>) t0Var3.b(a80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                Scope scope6 = (Scope) obj;
                vj0.a aVar20 = vj0.a.f178448a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return (oj0.w) scope6.get((k23.d<?>) s0.f105811a.b(oj0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
            case 26:
                vj0.a aVar21 = vj0.a.f178448a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new nj0.a();
            case 27:
                Scope scope7 = (Scope) obj;
                vj0.a aVar22 = vj0.a.f178448a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = s0.f105811a;
                return new yj0.f((a80.b) scope7.get((k23.d<?>) t0Var4.b(a80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (oj0.w) scope7.get((k23.d<?>) t0Var4.b(oj0.w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                vj0.a aVar23 = vj0.a.f178448a;
                scope8.getClass();
                parametersHolder5.getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = s0.f105811a;
                return new com.garmin.android.apps.connectmobile.gcplus.presentation.home.e((GCPlusHomeActivity.b) parametersHolder5.elementAt(0, t0Var5.b(GCPlusHomeActivity.b.class)), ((Boolean) parametersHolder5.elementAt(1, t0Var5.b(Boolean.class))).booleanValue(), (k1) scope8.get((k23.d<?>) t0Var5.b(k1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (h7) scope8.get((k23.d<?>) t0Var5.b(h7.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ze0.b) scope8.get((k23.d<?>) t0Var5.b(ze0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (oj0.f) scope8.get((k23.d<?>) t0Var5.b(oj0.f.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (a80.b) scope8.get((k23.d<?>) t0Var5.b(a80.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ht.i) scope8.get((k23.d<?>) t0Var5.b(ht.i.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (ak0.a) scope8.get((k23.d<?>) t0Var5.b(ak0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z70.j) scope8.get((k23.d<?>) t0Var5.b(z70.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (dj1.a) scope8.get((k23.d<?>) t0Var5.b(dj1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            default:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                vp1.b bVar3 = vp1.b.f179385a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    qp1.a.C2751a c2751a = qp1.a.f146016c;
                    qp1.a aVar24 = qp1.a.CHARGE;
                    c2751a.getClass();
                    u1.b(R.string.solar_intensity, R.string.solar_intensity, 0, 2, qp1.a.C2751a.a(aVar24), mVar10, false);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ i(int i14, int i15) {
        this.f176989a = i15;
    }
}
