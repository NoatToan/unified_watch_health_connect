package xy;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import b63.v;
import b82.d1;
import c2.b0;
import c2.t0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import e23.p;
import g01.u;
import g01.w;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.List;
import l30.a1;
import lc.u0;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import v62.s6;
import xd2.m0;
import z20.c0;
import z20.t;
import z20.x;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192620a;

    public /* synthetic */ f(int i14) {
        this.f192620a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f192620a;
        m.a aVar = m.f135153a;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g gVar = g.f192621a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    t0.a(c2.l.A(rVarF, 0.0f, j92.b.f97899b.f97918c, 1), cVar, null, null, 0, 0, g.f192622b, mVar, 1572912, 60);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                xz1.a aVar2 = xz1.a.f192853a;
                return s1.l.d(220, 0, null, 6);
            case 2:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                y01.b bVar = y01.b.f192985a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    d1 d1Var = d1.f16531a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    float f14 = cVar2.f97905d;
                    s62.a.f157643a.getClass();
                    d1Var.b(f14, s6.a(t62.b.f162798a), cVar2.f97903b, a0.c(mVar2), d92.b.a(mVar2).d().a().b(), mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                y01.b bVar2 = y01.b.f192985a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r.a aVar3 = r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar3, 0);
                    int iHashCode = Long.hashCode(mVar3.getU());
                    i2 i2VarX = mVar3.x();
                    r rVarC = h4.k.c(aVar3, mVar3);
                    h5.g.V.getClass();
                    e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar4);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar3);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar3.getT() || !s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar3);
                    b0 b0Var = b0.f22601a;
                    Object objQ = mVar3.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new xh0.d(10);
                        mVar3.K(objQ);
                    }
                    y01.a.a(null, "Meal 1", true, null, (e23.a) objQ, mVar3, 25008, 9);
                    Object objQ2 = mVar3.q();
                    if (objQ2 == c2565a) {
                        objQ2 = new xh0.d(11);
                        mVar3.K(objQ2);
                    }
                    y01.a.a(null, "Meal with a very long name very long name", true, null, (e23.a) objQ2, mVar3, 25008, 9);
                    Object objQ3 = mVar3.q();
                    if (objQ3 == c2565a) {
                        objQ3 = new xh0.d(12);
                        mVar3.K(objQ3);
                    }
                    y01.a.a(null, "Meal block without add button", false, null, (e23.a) objQ3, mVar3, 25008, 9);
                    Object objQ4 = mVar3.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new xh0.d(13);
                        mVar3.K(objQ4);
                    }
                    y01.a.a(null, "Meal block without add button with a very long name very long name", false, null, (e23.a) objQ4, mVar3, 25008, 9);
                    mVar3.y();
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                y01.c cVar3 = y01.c.f192987a;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strQ = gl1.y.Q(mVar4, R.string.move_food);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 5:
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                y01.c cVar4 = y01.c.f192987a;
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    String strQ2 = gl1.y.Q(mVar5, R.string.lbl_copy_food);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar5), mVar5, 0, 0, 131070);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 6:
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                y01.c cVar5 = y01.c.f192987a;
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    String strQ3 = gl1.y.Q(mVar6, R.string.remove_food);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar6), mVar6, 0, 0, 131070);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 7:
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                y01.c cVar6 = y01.c.f192987a;
                Double dValueOf = Double.valueOf(0.0d);
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    b11.i.a aVar5 = new b11.i.a(null, i01.i.REGULAR_LOG, g22.l.f(v.INSTANCE), 2.0d, false, 0L, new b11.d("3422", "Bread", w.GENERIC, null, u.FATSECRET, LocaleUnitResolver.ImperialCountryCode.US, "en", null, 128, null), new b11.s("13177", "regular slice", 1.0d, new b11.f(69, Double.valueOf(13.16d), Double.valueOf(1.99d), Double.valueOf(0.86d), Double.valueOf(0.6d), Double.valueOf(1.12d), dValueOf, Double.valueOf(0.186d), Double.valueOf(0.177d), Double.valueOf(0.352d), null, dValueOf, Double.valueOf(177.0d), Double.valueOf(26.0d), dValueOf, dValueOf, null, Double.valueOf(39.0d), Double.valueOf(0.97d))), false, null, 512, null);
                    v21.e eVar = new v21.e((Context) mVar7.A(AndroidCompositionLocals_androidKt.f6042b));
                    Object objQ5 = mVar7.q();
                    aVar.getClass();
                    m.a.C2565a c2565a2 = m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = new m0(15);
                        mVar7.K(objQ5);
                    }
                    e23.l lVar = (e23.l) objQ5;
                    Object objQ6 = mVar7.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new m0(16);
                        mVar7.K(objQ6);
                    }
                    e23.l lVar2 = (e23.l) objQ6;
                    Object objQ7 = mVar7.q();
                    if (objQ7 == c2565a2) {
                        objQ7 = new m0(17);
                        mVar7.K(objQ7);
                    }
                    e23.l lVar3 = (e23.l) objQ7;
                    Object objQ8 = mVar7.q();
                    if (objQ8 == c2565a2) {
                        objQ8 = new m0(18);
                        mVar7.K(objQ8);
                    }
                    y01.f.a(eVar, aVar5, lVar, lVar2, lVar3, (e23.l) objQ8, mVar7, 224640, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 8:
                Scope scope = (Scope) obj;
                y20.b bVar4 = y20.b.f194205a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var = s0.f105811a;
                return new b30.p((d60.b) scope.get((k23.d<?>) t0Var.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.l) scope.get((k23.d<?>) t0Var.b(z20.l.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 9:
                Scope scope2 = (Scope) obj;
                y20.b bVar5 = y20.b.f194205a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.a0((r41.a) scope2.get((k23.d<?>) s0.f105811a.b(r41.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 10:
                y20.b bVar6 = y20.b.f194205a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return gn0.b.a.a(gn0.b.f78058b);
            case 11:
                Scope scope3 = (Scope) obj;
                y20.b bVar7 = y20.b.f194205a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.g((sa1.m) scope3.get((k23.d<?>) s0.f105811a.b(sa1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 12:
                Scope scope4 = (Scope) obj;
                y20.b bVar8 = y20.b.f194205a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                return new c0((sa1.m) scope4.get((k23.d<?>) s0.f105811a.b(sa1.m.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 13:
                Scope scope5 = (Scope) obj;
                y20.b bVar9 = y20.b.f194205a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = s0.f105811a;
                return new b30.k((d60.b) scope5.get((k23.d<?>) t0Var2.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.r) scope5.get((k23.d<?>) t0Var2.b(z20.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.c) scope5.get((k23.d<?>) t0Var2.b(b30.c.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 14:
                Scope scope6 = (Scope) obj;
                y20.b bVar10 = y20.b.f194205a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.d((d60.b) scope6.get((k23.d<?>) s0.f105811a.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope7 = (Scope) obj;
                y20.b bVar11 = y20.b.f194205a;
                scope7.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var3 = s0.f105811a;
                return new b30.n((d60.b) scope7.get((k23.d<?>) t0Var3.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.r) scope7.get((k23.d<?>) t0Var3.b(z20.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope8 = (Scope) obj;
                y20.b bVar12 = y20.b.f194205a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                return new b30.r((z20.r) scope8.get((k23.d<?>) s0.f105811a.b(z20.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 17:
                Scope scope9 = (Scope) obj;
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                y20.b bVar13 = y20.b.f194205a;
                scope9.getClass();
                parametersHolder.getClass();
                p005kotlin.jvm.internal.t0 t0Var4 = s0.f105811a;
                w20.a aVar6 = (w20.a) parametersHolder.elementAt(0, t0Var4.b(w20.a.class));
                n30.e eVar2 = (n30.e) parametersHolder.elementAt(1, t0Var4.b(n30.e.class));
                List list = (List) parametersHolder.elementAt(2, t0Var4.b(List.class));
                return new l30.z(aVar6, eVar2, list != null ? new ArrayList(list) : null, (ab1.g) parametersHolder.elementAt(3, t0Var4.b(ab1.g.class)), (b30.h) scope9.get((k23.d<?>) t0Var4.b(b30.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope9.get((k23.d<?>) t0Var4.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.v) scope9.get((k23.d<?>) t0Var4.b(z20.v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (x) scope9.get((k23.d<?>) t0Var4.b(x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.n) scope9.get((k23.d<?>) t0Var4.b(z20.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.u) scope9.get((k23.d<?>) t0Var4.b(b30.u.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.w) scope9.get((k23.d<?>) t0Var4.b(b30.w.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.s) scope9.get((k23.d<?>) t0Var4.b(b30.s.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.a) scope9.get((k23.d<?>) t0Var4.b(b30.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.e) scope9.get((k23.d<?>) t0Var4.b(b30.e.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.d) scope9.get((k23.d<?>) t0Var4.b(b30.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.p) scope9.get((k23.d<?>) t0Var4.b(b30.p.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.a0) scope9.get((k23.d<?>) t0Var4.b(z20.a0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.g) scope9.get((k23.d<?>) t0Var4.b(z20.g.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (c0) scope9.get((k23.d<?>) t0Var4.b(c0.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.k) scope9.get((k23.d<?>) t0Var4.b(b30.k.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.d) scope9.get((k23.d<?>) t0Var4.b(z20.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 18:
                y20.b bVar14 = y20.b.f194205a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return u0.g(d60.b.f57806c);
            case 19:
                Scope scope10 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                y20.b bVar15 = y20.b.f194205a;
                scope10.getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var5 = s0.f105811a;
                return new a1((com.garmin.android.apps.connectmobile.courses.model.i) parametersHolder2.elementAt(0, t0Var5.b(com.garmin.android.apps.connectmobile.courses.model.i.class)), (String) parametersHolder2.elementAt(1, t0Var5.b(String.class)), (n30.e) parametersHolder2.elementAt(2, t0Var5.b(n30.e.class)), (b30.n) scope10.get((k23.d<?>) t0Var5.b(b30.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t) scope10.get((k23.d<?>) t0Var5.b(t.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.v) scope10.get((k23.d<?>) t0Var5.b(z20.v.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (x) scope10.get((k23.d<?>) t0Var5.b(x.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (z20.n) scope10.get((k23.d<?>) t0Var5.b(z20.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (b30.r) scope10.get((k23.d<?>) t0Var5.b(b30.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 20:
                y20.b bVar16 = y20.b.f194205a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return sa1.m.a.a(sa1.m.f158284b);
            case 21:
                y20.b bVar17 = y20.b.f194205a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                r41.a.f150289c.getClass();
                return r41.a.C2825a.a();
            case 22:
                Scope scope11 = (Scope) obj;
                y20.b bVar18 = y20.b.f194205a;
                scope11.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.r((d60.b) scope11.get((k23.d<?>) s0.f105811a.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                Scope scope12 = (Scope) obj;
                y20.b bVar19 = y20.b.f194205a;
                scope12.getClass();
                ((ParametersHolder) obj2).getClass();
                return new b30.h((z20.r) scope12.get((k23.d<?>) s0.f105811a.b(z20.r.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 24:
                Scope scope13 = (Scope) obj;
                y20.b bVar20 = y20.b.f194205a;
                scope13.getClass();
                ((ParametersHolder) obj2).getClass();
                return new t((d60.b) scope13.get((k23.d<?>) s0.f105811a.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                Scope scope14 = (Scope) obj;
                y20.b bVar21 = y20.b.f194205a;
                scope14.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.v((d60.b) scope14.get((k23.d<?>) s0.f105811a.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                Scope scope15 = (Scope) obj;
                y20.b bVar22 = y20.b.f194205a;
                scope15.getClass();
                ((ParametersHolder) obj2).getClass();
                return new x((d60.b) scope15.get((k23.d<?>) s0.f105811a.b(d60.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 27:
                Scope scope16 = (Scope) obj;
                y20.b bVar23 = y20.b.f194205a;
                scope16.getClass();
                ((ParametersHolder) obj2).getClass();
                return new z20.n((gn0.b) scope16.get((k23.d<?>) s0.f105811a.b(gn0.b.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 28:
                y20.b bVar24 = y20.b.f194205a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new b30.c();
            default:
                y20.b bVar25 = y20.b.f194205a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return new b30.a();
        }
    }
}
