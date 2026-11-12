package ex;

import android.content.DialogInterface;
import c2.b0;
import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import dx.e;
import e23.p;
import ey.j;
import ey.u;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import i3.mh;
import j92.f;
import k2.i;
import k23.d;
import lc.u0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v.h;
import v62.d2;
import v62.h1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66911a;

    public /* synthetic */ b(int i14) {
        this.f66911a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f66911a) {
            case 0:
                Scope scope = (Scope) obj;
                c cVar = c.f66912a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new e((ax.a) scope.get((d<?>) s0.f105811a.b(ax.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 1:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                j jVar = j.f67095a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    u.b(new xx.c(), mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                f10.a aVar = f10.a.f67802a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar2 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA = l.A(aVar2, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar2 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(cVar2, h4.d.a.f81537o, mVar2, 54);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(rVarA, mVar2);
                    g.V.getClass();
                    e0.a aVar3 = g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar3);
                    } else {
                        mVar2.c();
                    }
                    b4.c(g.a.f81810g, zVarA, mVar2);
                    b4.c(g.a.f81809f, i2VarX, mVar2);
                    g.a.b bVar = g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(":", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, f.f97932i, mVar2, 6, 0, 131070);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                f10.a aVar4 = f10.a.f67802a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarA2 = l.A(aVar5, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar3 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(cVar3, h4.d.a.f81537o, mVar3, 54);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    r rVarC2 = k.c(rVarA2, mVar3);
                    g.V.getClass();
                    e0.a aVar6 = g.a.f81805b;
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
                    b4.c(g.a.f81810g, zVarA2, mVar3);
                    b4.c(g.a.f81809f, i2VarX2, mVar3);
                    g.a.b bVar2 = g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    b4.c(g.a.f81807d, rVarC2, mVar3);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(".", null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, f.f97932i, mVar3, 6, 0, 131070);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).intValue();
                b bVar3 = f2.l.f68229d;
                return f2.c.a(dh.b.f(1));
            case 5:
                f2.p0 p0Var = (f2.p0) obj2;
                f2.p0.a aVar7 = f2.p0.f68259w;
                return x.k(Integer.valueOf(p0Var.g()), Integer.valueOf(p0Var.h()));
            case 6:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                f20.a aVar8 = f20.a.f68344a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar9 = r.S;
                    d92.b.f58623a.getClass();
                    r rVarE = u1.n.e(aVar9, d92.b.a(mVar4).e().g(), i.f102406a);
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97901d.f97905d;
                    g6.f.a aVar10 = g6.f.f75994b;
                    r rVarQ = x2.q(rVarE, f14 + f14);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode3 = Long.hashCode(mVar4.getU());
                    i2 i2VarX3 = mVar4.x();
                    r rVarC3 = k.c(rVarQ, mVar4);
                    g.V.getClass();
                    e0.a aVar11 = g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar11);
                    } else {
                        mVar4.c();
                    }
                    b4.c(g.a.f81810g, z0VarD, mVar4);
                    b4.c(g.a.f81809f, i2VarX3, mVar4);
                    g.a.b bVar4 = g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                        h.z(iHashCode3, mVar4, iHashCode3, bVar4);
                    }
                    b4.c(g.a.f81807d, rVarC3, mVar4);
                    c2.u uVar = c2.u.f22885a;
                    s62.a.f157643a.getClass();
                    i7.b(d2.a(t62.b.f162798a), gl1.y.Q(mVar4, R.string.default_image_view_content_description), uVar.c(x2.q(aVar9, f14), h4.d.a.f81528f), u0.f(mVar4), mVar4, 0, 0);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                f20.a aVar12 = f20.a.f68344a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    z02.b.a(false, null, null, null, false, f20.a.f68345b, mVar5, 196608, 31);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                f21.d dVar = f21.d.f68493a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    c2.j jVar2 = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f15 = j92.b.f97899b.f97918c;
                    jVar2.getClass();
                    c2.j.i iVarI = c2.j.i(f15);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar5 = h4.d.a.f81534l;
                    r.a aVar13 = r.S;
                    s2 s2VarA = q2.a(iVarI, bVar5, mVar6, 48);
                    int iHashCode4 = Long.hashCode(mVar6.getU());
                    i2 i2VarX4 = mVar6.x();
                    r rVarC4 = k.c(aVar13, mVar6);
                    g.V.getClass();
                    e0.a aVar14 = g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar14);
                    } else {
                        mVar6.c();
                    }
                    b4.c(g.a.f81810g, s2VarA, mVar6);
                    b4.c(g.a.f81809f, i2VarX4, mVar6);
                    g.a.b bVar6 = g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode4))) {
                        h.z(iHashCode4, mVar6, iHashCode4, bVar6);
                    }
                    b4.c(g.a.f81807d, rVarC4, mVar6);
                    u2 u2Var = u2.f22900a;
                    String strQ = gl1.y.Q(mVar6, R.string.lbl_edit);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97933j, mVar6), mVar6, 0, 0, 131070);
                    s62.a.f157643a.getClass();
                    i7.b(h1.a(t62.b.f162798a), null, x2.q(aVar13, j92.b.f97901d.f97903b), u0.f(mVar6), mVar6, 48, 0);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                f21.d dVar2 = f21.d.f68493a;
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    mh.c(gl1.y.Q(mVar7, R.string.lbl_quick_add), null, com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar7), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar7, 0, 0, 262138);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                f21.d dVar3 = f21.d.f68493a;
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    mh.c(gl1.y.Q(mVar8, R.string.find_food), null, com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar8), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar8, 0, 0, 262138);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 11:
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                f40.a aVar15 = f40.a.f68846a;
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    t4.d dVarA = n5.c.a(R.drawable.icon_add_climb, mVar9, 0);
                    long jB = ds.e0.b(d92.b.f58623a, mVar9);
                    r.a aVar16 = r.S;
                    d92.b.f58625c.getClass();
                    i7.a(dVarA, null, x2.q(aVar16, j92.b.f97901d.f97904c), jB, mVar9, 48, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 12:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                f41.a aVar17 = f41.a.f68858a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new l41.a(new h41.d((r53.i) parametersHolder.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 13:
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                f41.a aVar18 = f41.a.f68858a;
                ((Scope) obj).getClass();
                parametersHolder2.getClass();
                return new k41.d((l41.a) parametersHolder2.elementAt(0, s0.f105811a.b(l41.a.class)));
            case 14:
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                f41.a aVar19 = f41.a.f68858a;
                ((Scope) obj).getClass();
                parametersHolder3.getClass();
                return new l41.b(new h41.d((r53.i) parametersHolder3.elementAt(0, s0.f105811a.b(r53.i.class))));
            case 15:
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                f41.a aVar20 = f41.a.f68858a;
                ((Scope) obj).getClass();
                parametersHolder4.getClass();
                return new k41.a((l41.b) parametersHolder4.elementAt(0, s0.f105811a.b(l41.b.class)));
            case 16:
                Scope scope2 = (Scope) obj;
                f41.b bVar7 = f41.b.f68860a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new g41.b((f12.l) Scope.get$default(scope2, s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a) null, 6, (Object) null));
            case 17:
                m mVar10 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                f62.e eVar = f62.e.f69229a;
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    r.a aVar21 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    r rVarZ = l.z(aVar21, eVar2.f97920e, eVar2.f97918c);
                    String strQ2 = gl1.y.Q(mVar10, R.string.workout_empty_repeat);
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, d92.c.b(f.f97931h, mVar10), mVar10, 0, 24576, 114684);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 18:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.a aVar22 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.b.f40456y;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                return Unit.INSTANCE;
            case 19:
                DialogInterface dialogInterface2 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar23 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface2.getClass();
                dialogInterface2.dismiss();
                return Unit.INSTANCE;
            case 20:
                DialogInterface dialogInterface3 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar24 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface3.getClass();
                dialogInterface3.dismiss();
                return Unit.INSTANCE;
            case 21:
                DialogInterface dialogInterface4 = (DialogInterface) obj;
                ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.a aVar25 = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.h.B;
                dialogInterface4.getClass();
                dialogInterface4.dismiss();
                return Unit.INSTANCE;
            case 22:
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                fh0.a aVar26 = fh0.a.f71578a;
                ((Scope) obj).getClass();
                parametersHolder5.getClass();
                r53.i iVar = (r53.i) parametersHolder5.elementAt(0, s0.f105811a.b(r53.i.class));
                f12.l.f68084a.getClass();
                return new nh0.a(new hh0.c(iVar, f12.l.a.a()));
            case 23:
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                fh0.a aVar27 = fh0.a.f71578a;
                ((Scope) obj).getClass();
                parametersHolder6.getClass();
                return new mh0.a((nh0.a) parametersHolder6.elementAt(0, s0.f105811a.b(nh0.a.class)));
            case 24:
                fh0.c cVar4 = fh0.c.f71581a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new eh0.c(null, 1, null);
            case 25:
                Scope scope3 = (Scope) obj;
                fh0.c cVar5 = fh0.c.f71581a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new bh0.b((f12.l) scope3.get((d<?>) s0.f105811a.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                Scope scope4 = (Scope) obj;
                fh0.c cVar6 = fh0.c.f71581a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                t0 t0Var = s0.f105811a;
                return new ih0.s((eh0.b) scope4.get((d<?>) t0Var.b(eh0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (bh0.a) scope4.get((d<?>) t0Var.b(bh0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t60.h) scope4.get((d<?>) t0Var.b(t60.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (f12.l) scope4.get((d<?>) t0Var.b(f12.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                Object obj3 = fl2.a.f72029k;
                ((rs2.c) obj).getClass();
                ((String) obj2).getClass();
                return Boolean.TRUE;
            case 28:
                Object obj4 = fl2.a.f72029k;
                ((rs2.c) obj).getClass();
                ((String) obj2).getClass();
                return Boolean.TRUE;
            default:
                Scope scope5 = (Scope) obj;
                fn.b bVar8 = fn.b.f72136a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                return new co.i((co.l) scope5.get((d<?>) s0.f105811a.b(co.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
        }
    }
}
