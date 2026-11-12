package pa0;

import android.content.Context;
import android.content.DialogInterface;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.j1;
import c2.u;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.ui.passcode.PasscodeEntryActivity;
import ds.e0;
import e23.p;
import f5.z0;
import gl1.y;
import h4.r;
import i3.i7;
import i3.mh;
import i3.ve;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import re0.o;
import s5.x0;
import sg0.e1;
import sg0.f0;
import ug0.q;
import v62.b8;
import v62.d3;
import v62.h2;
import v62.s8;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136706a;

    public /* synthetic */ a(int i14) {
        this.f136706a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f136706a;
        p3.m.a aVar = p3.m.f135153a;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                c cVar = c.f136708a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new p40.f(12);
                        mVar.K(objQ);
                    }
                    e23.a aVar2 = (e23.a) objQ;
                    Object objQ2 = mVar.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new p40.f(13);
                        mVar.K(objQ2);
                    }
                    g.c("Fenix 7", aVar2, (e23.a) objQ2, mVar, 438);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                c cVar2 = c.f136708a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar2), 0L, 0.0f, 0.0f, null, c.f136717j, mVar2, 12582918, 122);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                c cVar3 = c.f136708a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    Object objQ3 = mVar3.q();
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new p40.f(4);
                        mVar3.K(objQ3);
                    }
                    g.f((e23.a) objQ3, mVar3, 6);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                c cVar4 = c.f136708a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    ve.a(x2.d(r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar4), 0L, 0.0f, 0.0f, null, c.f136718k, mVar4, 12582918, 122);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                pb1.l.a aVar3 = pb1.l.f136861l;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 5:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                pf0.a aVar4 = pf0.a.f137464a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    wf.f.a aVar5 = new wf.f.a((Context) mVar5.A(AndroidCompositionLocals_androidKt.f6042b));
                    aVar5.f184930c = Integer.valueOf(R.drawable.ecg_intro_icon);
                    wf.g.a(aVar5);
                    jf.r.b(aVar5.a(), "", x2.q(r.S, wz1.b.f188181a), n5.c.a(2131231969, mVar5, 0), n5.c.a(2131231969, mVar5, 0), null, null, null, null, null, null, null, mVar5, 48, 0, 32736);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                pf0.c cVar5 = pf0.c.f137472a;
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.icon_ecg_list_item, mVar6, 0);
                    long jA = com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar6);
                    r.a aVar6 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, x2.q(aVar6, j92.b.f97901d.f97905d), jA, mVar6, 48, 0);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                og2.k.h((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                Scope scope = (Scope) obj;
                pg0.a aVar7 = pg0.a.f137594a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new e1((o) scope.get((k23.d<?>) t0Var.b(o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pu.h) scope.get((k23.d<?>) t0Var.b(pu.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 4, null);
            case 9:
                Scope scope2 = (Scope) obj;
                pg0.a aVar8 = pg0.a.f137594a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var2 = s0.f105811a;
                return new q((o) Scope.get$default(scope2, t0Var2.b(o.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (te0.e) Scope.get$default(scope2, t0Var2.b(te0.e.class), (Qualifier) null, (e23.a) null, 6, (Object) null), null, null, 12, null);
            case 10:
                Scope scope3 = (Scope) obj;
                pg0.a aVar9 = pg0.a.f137594a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var3 = s0.f105811a;
                return new f0((j1) scope3.get((k23.d<?>) t0Var3.b(j1.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (o) Scope.get$default(scope3, t0Var3.b(o.class), (Qualifier) null, (e23.a) null, 6, (Object) null), (te0.e) Scope.get$default(scope3, t0Var3.b(te0.e.class), (Qualifier) null, (e23.a) null, 6, (Object) null), ((ve0.b) Scope.get$default(scope3, t0Var3.b(ve0.b.class), (Qualifier) null, (e23.a) null, 6, (Object) null)).k(), null, 16, null);
            case 11:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                pk1.b bVar = pk1.b.f138273a;
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    String strQ = y.Q(mVar7, R.string.lbl_remove);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarA = x0.a(j92.f.f97931h, e0.e(mVar7), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    r.a aVar10 = r.S;
                    d92.b.f58625c.getClass();
                    mh.c(strQ, c2.l.y(aVar10, j92.b.f97899b.f97918c), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarA, mVar7, 0, 0, 131068);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                pl1.a aVar11 = pl1.a.f138520a;
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA2 = d3.a(t62.b.f162798a);
                    long jB = e0.b(d92.b.f58623a, mVar8);
                    r.a aVar12 = r.S;
                    float f14 = 20;
                    g6.f.a aVar13 = g6.f.f75994b;
                    i7.b(dVarA2, null, x2.u(x2.h(aVar12, f14), f14), jB, mVar8, 432, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                pn.b bVar2 = pn.b.f138643a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (on.k) ez0.b.a(ez0.b.f67468a, ez0.c.GC, on.k.class, new c83.h.a[0], null, null, null, 120);
            case 14:
                Scope scope4 = (Scope) obj;
                pn.b bVar3 = pn.b.f138643a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var4 = s0.f105811a;
                return new on.a((on.k) scope4.get((k23.d<?>) t0Var4.b(on.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (pc0.j) scope4.get((k23.d<?>) t0Var4.b(pc0.j.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                pn.b bVar4 = pn.b.f138643a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                f12.l.f68084a.getClass();
                return new on.n(f12.l.a.a());
            case 16:
                pn.b bVar5 = pn.b.f138643a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new com.garmin.android.apps.connectmobile.activities.health.presentation.e();
            case 17:
                pn.b bVar6 = pn.b.f138643a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new pn.a();
            case 18:
                ((Integer) obj2).getClass();
                po.r.a((p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 19:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                PasscodeEntryActivity.a aVar14 = PasscodeEntryActivity.f52121n;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 20:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                py.a aVar15 = py.a.f141871a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new vy.a(new qy.b((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class)), new ae0.b()));
            case 21:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                py.a aVar16 = py.a.f141871a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new uy.a((vy.a) parametersHolder2.elementAt(0, s0.f105811a.b(vy.a.class)));
            case 22:
                py.a aVar17 = py.a.f141871a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (my.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, my.a.class, new c83.h.a[0], null, null, null, 120);
            case 23:
                Scope scope5 = (Scope) obj;
                py.a aVar18 = py.a.f141871a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var5 = s0.f105811a;
                return new oy.d((my.a) scope5.get((k23.d<?>) t0Var5.b(my.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope5.get((k23.d<?>) t0Var5.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                Scope scope6 = (Scope) obj;
                py.a aVar19 = py.a.f141871a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new sy.k((oy.a) scope6.get((k23.d<?>) s0.f105811a.b(oy.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                q31.a aVar20 = q31.a.f142402a;
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    r.a aVar21 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarQ = x2.q(aVar21, j92.b.f97901d.f97905d);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar9.getU());
                    i2 i2VarX = mVar9.x();
                    r rVarC = h4.k.c(rVarQ, mVar9);
                    h5.g.V.getClass();
                    h5.e0.a aVar22 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar22);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar9);
                    h5.g.a.b bVar7 = h5.g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar9, iHashCode, bVar7);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar9);
                    g02.s0.b(u.f22885a.c(aVar21, h4.d.a.f81528f), 0.0f, mVar9, 0, 2);
                    mVar9.y();
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                q31.a aVar23 = q31.a.f142402a;
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    z02.b.a(false, null, null, null, false, q31.a.f142403b, mVar10, 196608, 31);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                q31.b bVar8 = q31.b.f142405a;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = h2.a(t62.b.f162798a);
                    r.a aVar24 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar6 = j92.b.f97901d;
                    i7.b(dVarA3, null, x2.u(x2.h(aVar24, cVar6.f97905d), cVar6.f97905d), 0L, mVar11, 48, 8);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                q31.b bVar9 = q31.b.f142405a;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA4 = s8.a(t62.b.f162798a);
                    r.a aVar25 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar7 = j92.b.f97901d;
                    i7.b(dVarA4, null, x2.u(x2.h(aVar25, cVar7.f97905d), cVar7.f97905d), 0L, mVar12, 48, 8);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                q31.b bVar10 = q31.b.f142405a;
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA5 = b8.a(t62.b.f162798a);
                    r.a aVar26 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar8 = j92.b.f97901d;
                    i7.b(dVarA5, null, x2.u(x2.h(aVar26, cVar8.f97905d), cVar8.f97905d), 0L, mVar13, 48, 8);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(int i14, int i15) {
        this.f136706a = i15;
    }
}
