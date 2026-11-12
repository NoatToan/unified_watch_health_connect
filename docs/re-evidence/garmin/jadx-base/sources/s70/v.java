package s70;

import c2.k3;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.i7;
import i3.mh;
import i3.ve;
import org.joda.time.DateTime;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import v62.d3;
import v62.l2;
import v62.s6;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157810a;

    public /* synthetic */ v(int i14) {
        this.f157810a = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f157810a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                w wVar = w.f157813a;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    i7.a(n5.c.a(R.drawable.close_circle, mVar, 0), gl1.y.Q(mVar, R.string.lbl_close), x2.d(h4.r.S, 1.0f), com.airbnb.lottie.animation.keyframe.a.a(d92.b.f58623a, mVar), mVar, 384, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x xVar = x.f157821a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    h4.r.a aVar = h4.r.S;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    u2 u2Var = u2.f22900a;
                    String strQ = gl1.y.Q(mVar2, R.string.txt_add_device);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                    h4.r rVarA = u2Var.a(aVar, 1.0f, true);
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    c2.l.f(x2.b(rVarA, 0.0f, eVar.f97921f, 1), mVar2);
                    s62.a.f157643a.getClass();
                    i7.b(s6.a(t62.b.f162798a), null, x2.q(c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), j92.b.f97901d.f97905d), lc.u0.f(mVar2), mVar2, 48, 0);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                z zVar = z.f157837a;
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                z zVar2 = z.f157837a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_reset_home);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 0, 0, 131070);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                z zVar3 = z.f157837a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    b3.b.f15502a.getClass();
                    u4.d dVarA = d3.h.a();
                    String strQ3 = gl1.y.Q(mVar5, R.string.lbl_close);
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar = j92.b.f97901d;
                    i7.b(dVarA, strQ3, x2.u(x2.h(aVar3, cVar.f97905d), cVar.f97905d), 0L, mVar5, 0, 8);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar6 = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar6.C(-2038049963);
                p3.x1 x1Var6 = p3.n.f135158a;
                int i14 = k3.f22728a;
                c2.g gVarD = q3.d(mVar6);
                p3.f22815b.getClass();
                c2.x1 x1VarD = n3.d(gVarD, p3.f22823j);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                c2.a aVar4 = new c2.a(x1VarD, n3.b(0.0f, j92.b.f97899b.f97922g, 0.0f, 0.0f, 13));
                mVar6.f();
                return aVar4;
            case 6:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                sa0.c cVar2 = sa0.c.f158169a;
                if (mVar7.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    Object objQ = mVar7.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ro0.h(29);
                        mVar7.K(objQ);
                    }
                    sa0.h.a((e23.a) objQ, mVar7, 6);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                sa0.c cVar3 = sa0.c.f158169a;
                if (mVar8.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    ve.a(x2.d(h4.r.S, 1.0f), null, tn.k.a(d92.b.f58623a, mVar8), 0L, 0.0f, 0.0f, null, sa0.c.f158171c, mVar8, 12582918, 122);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                sa0.h.c((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                sa1.f fVar = sa1.f.f158268a;
                if (mVar9.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA2 = x62.n.a(l2.f175943a);
                    String strQ4 = gl1.y.Q(mVar9, R.string.lbl_send_to_device);
                    d92.b.f58623a.getClass();
                    long jA = d92.b.a(mVar9).k().a();
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA2, strQ4, x2.q(aVar5, j92.b.f97901d.f97905d), jA, mVar9, 0, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                sa1.f fVar2 = sa1.f.f158268a;
                if (mVar10.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, sa1.f.f158269b, mVar10, 196608, 31);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 11:
                ab1.o oVar = (ab1.o) obj;
                ab1.o oVar2 = (ab1.o) obj2;
                int i15 = com.garmin.android.apps.connectmobile.powerguide.a.f40362e;
                oVar.getClass();
                long millis = new DateTime(((ab1.o.c) oVar).f2627g).getMillis();
                oVar2.getClass();
                return Integer.valueOf(p005kotlin.jvm.internal.s.i(new DateTime(((ab1.o.c) oVar2).f2627g).getMillis(), millis));
            case 12:
                se0.b bVar3 = se0.b.f158742a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (re0.n) ez0.b.a(ez0.b.f67468a, ez0.c.GC, re0.n.class, new c83.h.a[0], null, null, null, 120);
            case 13:
                Scope scope = (Scope) obj;
                se0.b bVar4 = se0.b.f158742a;
                scope.getClass();
                ((ParametersHolder) obj2).getClass();
                return new re0.h0((re0.n) scope.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(re0.n.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), null, 2, null);
            case 14:
                Scope scope2 = (Scope) obj;
                se0.b bVar5 = se0.b.f158742a;
                scope2.getClass();
                ((ParametersHolder) obj2).getClass();
                return new te0.b((re0.o) scope2.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(re0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 15:
                Scope scope3 = (Scope) obj;
                se0.b bVar6 = se0.b.f158742a;
                scope3.getClass();
                ((ParametersHolder) obj2).getClass();
                return new te0.j((re0.o) scope3.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(re0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 16:
                Scope scope4 = (Scope) obj;
                se0.b bVar7 = se0.b.f158742a;
                scope4.getClass();
                ((ParametersHolder) obj2).getClass();
                re0.o oVar3 = (re0.o) scope4.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(re0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                re0.a.f152088a.getClass();
                return new te0.e(oVar3, new re0.g((re0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, re0.a.class, new c83.h.a[0], null, null, null, 120)));
            case 17:
                Scope scope5 = (Scope) obj;
                se0.b bVar8 = se0.b.f158742a;
                scope5.getClass();
                ((ParametersHolder) obj2).getClass();
                re0.o oVar4 = (re0.o) scope5.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(re0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                f12.l.f68084a.getClass();
                f12.l lVarA = f12.l.a.a();
                bv.b.f21239a.getClass();
                bv.b.a();
                return new te0.d(oVar4, lVarA, com.garmin.android.apps.connectmobile.k1.f37122a);
            case 18:
                Scope scope6 = (Scope) obj;
                se0.b bVar9 = se0.b.f158742a;
                scope6.getClass();
                ((ParametersHolder) obj2).getClass();
                re0.o oVar5 = (re0.o) scope6.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(re0.o.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
                f12.l.f68084a.getClass();
                return new te0.h(oVar5, f12.l.a.a());
            case 19:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                se1.a aVar6 = se1.a.f158744a;
                ((Scope) obj).getClass();
                parametersHolder.getClass();
                return new ze1.a(new ue1.b((r53.i) parametersHolder.elementAt(0, p005kotlin.jvm.internal.s0.f105811a.b(r53.i.class))));
            case 20:
                Scope scope7 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                se1.a aVar7 = se1.a.f158744a;
                scope7.getClass();
                parametersHolder2.getClass();
                p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
                return new ye1.a((ze1.a) parametersHolder2.elementAt(0, t0Var.b(ze1.a.class)), (we1.d) scope7.get((k23.d<?>) t0Var.b(we1.d.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 21:
                se1.b bVar10 = se1.b.f158746a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (pe1.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, pe1.a.class, new c83.h.a[0], null, null, null, 120);
            case 22:
                Scope scope8 = (Scope) obj;
                se1.b bVar11 = se1.b.f158746a;
                scope8.getClass();
                ((ParametersHolder) obj2).getClass();
                return new re1.h((pe1.a) scope8.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(pe1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 23:
                se1.b bVar12 = se1.b.f158746a;
                ((Scope) obj).getClass();
                ((ParametersHolder) obj2).getClass();
                return (rc0.a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, rc0.a.class, new c83.h.a[0], null, null, null, 120);
            case 24:
                Scope scope9 = (Scope) obj;
                se1.b bVar13 = se1.b.f158746a;
                scope9.getClass();
                ((ParametersHolder) obj2).getClass();
                return new tc0.d((rc0.a) scope9.get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(rc0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 25:
                Scope scope10 = (Scope) obj;
                se1.b bVar14 = se1.b.f158746a;
                scope10.getClass();
                ((ParametersHolder) obj2).getClass();
                p005kotlin.jvm.internal.t0 t0Var2 = p005kotlin.jvm.internal.s0.f105811a;
                return new we1.d((re1.a) scope10.get((k23.d<?>) t0Var2.b(re1.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (t60.h) scope10.get((k23.d<?>) t0Var2.b(t60.h.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null), (tc0.a) scope10.get((k23.d<?>) t0Var2.b(tc0.a.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null));
            case 26:
                p3.m mVar11 = (p3.m) obj;
                ((Integer) obj2).getClass();
                mVar11.C(-998589173);
                p3.x1 x1Var11 = p3.n.f135158a;
                float f14 = 0;
                g6.f.a aVar8 = g6.f.f75994b;
                c2.n0 n0Var = n3.f22788a;
                c2.m0 m0Var = new c2.m0(f14, f14, f14, f14, null);
                mVar11.f();
                return m0Var;
            case 27:
                ((Integer) obj2).getClass();
                sg0.t.a((p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 28:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                sg0.v vVar = sg0.v.f159171a;
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = d3.a(t62.b.f162798a);
                    long jB = ds.e0.b(d92.b.f58623a, mVar12);
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58625c.getClass();
                    i7.b(dVarA3, null, x2.q(aVar9, j92.b.f97901d.f97904c), jB, mVar12, 48, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                sg0.x xVar2 = sg0.x.f159180a;
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ v(int i14, int i15) {
        this.f157810a = i15;
    }
}
