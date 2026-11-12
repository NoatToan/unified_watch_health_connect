package gw1;

import a42.f0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import b63.o;
import c.q;
import c2.b0;
import c2.h2;
import c2.l;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import c22.o2;
import c80.s0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import e23.p;
import f5.b1;
import f5.k2;
import f5.y0;
import f72.b2;
import f72.b3;
import f72.ib;
import f72.id;
import f72.nb;
import f72.oe;
import f72.rb;
import f72.yc;
import fo1.o0;
import h4.r;
import h5.e0;
import hl1.t;
import hl1.v;
import i3.a1;
import i3.bi;
import i3.mh;
import i3.ph;
import i3.rg;
import i3.ri;
import i3.uf;
import i3.vb;
import i3.wf;
import ib0.w;
import java.util.ArrayList;
import java.util.List;
import l72.j0;
import lc.u0;
import lc.y;
import o4.m1;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import s5.r0;
import s5.x0;
import sm1.a0;
import u62.o5;
import zd0.g1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f79834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f79835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f79836d;

    public /* synthetic */ c(y yVar, jf1.b bVar, of1.a aVar, p1 p1Var) {
        this.f79833a = 25;
        this.f79834b = yVar;
        this.f79835c = bVar;
        this.f79836d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        y yVar = (y) this.f79834b;
        jf1.b bVar = (jf1.b) this.f79835c;
        p1 p1Var = (p1) this.f79836d;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.d(aVar, 1.0f), vb.h.e(d92.b.f58623a, mVar), m1.f128891a);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            com.garmin.android.apps.connectmobile.running_tolerance.presentation.a.a(yVar, bVar, mVar, 0);
            d92.b.f58625c.getClass();
            l.f(l.C(aVar, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), mVar);
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = i53.a.a(o82.g.f130849b, o82.g.f130854g, o82.g.f130856i);
                mVar.K(objQ);
            }
            i53.f fVar = (i53.f) objQ;
            Object objQ2 = mVar.q();
            if (objQ2 == c2565a) {
                n82.f.a aVar4 = new n82.f.a((o82.g) fVar.get(0), null, null, 6, null);
                mVar.K(aVar4);
                objQ2 = aVar4;
            }
            n82.f.a aVar5 = (n82.f.a) objQ2;
            o82.g gVar = aVar5.f124963a;
            o82.a aVar6 = aVar5.f124964b;
            int dayOfWeek = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c - new LocalDate().getDayOfWeek();
            if (dayOfWeek <= 0) {
                dayOfWeek += 7;
            }
            LocalDate localDateMinusDays = new LocalDate().plusDays(dayOfWeek).minusDays(1);
            localDateMinusDays.getClass();
            o oVarT = g22.k.t(localDateMinusDays);
            o oVar = aVar6.f130843a;
            oVar.getClass();
            o82.a aVar7 = new o82.a(oVar, oVarT);
            o oVar2 = aVar5.f124965c;
            gVar.getClass();
            oVar2.getClass();
            n82.f fVarA = n82.j.a(new n82.f.a(gVar, aVar7, oVar2), null, mVar, 2);
            n82.b bVar3 = fVarA.f124961b;
            Context context = (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = new yd1.a(context);
                mVar.K(objQ3);
            }
            yd1.a aVar8 = (yd1.a) objQ3;
            i53.c cVarE = i53.a.e(o2.b(fVar, mVar));
            int iIndexOf = fVar.indexOf(bVar3.a());
            boolean zB = mVar.B(fVarA);
            Object objQ4 = mVar.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new f0(fVarA, fVar, 9);
                mVar.K(objQ4);
            }
            t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) objQ4, mVar, 3072, 18);
            if (bVar3.a() != o82.g.f130849b) {
                mVar.C(-121076439);
                nf1.g.a(x2.f(aVar, 1.0f), new n82.n(fVarA, aVar8), fVarA.b(), bVar3.a(), mVar, 6);
                mVar = mVar;
                mVar.f();
            } else {
                mVar.C(-120608432);
                mVar.f();
            }
            n82.c.a(b0Var.a(aVar, 1.0f, true), fVarA, 0, false, z3.f.c(-633634124, new ao1.f(23, bVar, p1Var), mVar), mVar, 24960, 8);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:124:0x041a  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:319:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0233  */
    /* JADX WARN: Code duplicated, block: B:91:0x0323  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        g21.h hVar;
        u4.d dVarA;
        Object obj3;
        Object obj4;
        Object obj5;
        int i14 = this.f79833a;
        int i15 = 6;
        m.a aVar = m.f135153a;
        int i16 = 2;
        int i17 = 1;
        Object obj6 = this.f79836d;
        Object obj7 = this.f79835c;
        Object obj8 = this.f79834b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.training.fbtap.workouts.a aVar2 = (com.garmin.android.apps.connectmobile.training.fbtap.workouts.a) obj8;
                pi0.e eVar = (pi0.e) obj7;
                q qVar = (q) obj6;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.C0878a c0878a = com.garmin.android.apps.connectmobile.training.fbtap.workouts.a.f45566c;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f14 = eVar2.f97918c;
                    float f15 = eVar2.f97920e;
                    r rVarC = l.C(rVarF, f15, f14, f15, 0.0f, 8);
                    boolean zR = mVar.r(aVar2) | mVar.r(eVar) | mVar.r(qVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new d(aVar2, false ? 1 : 0, eVar, qVar);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new d(aVar2, false ? 1 : 0, eVar, qVar);
                            mVar.K(objQ);
                        }
                    }
                    e2.c.b(rVarC, null, null, null, null, null, false, null, (e23.l) objQ, mVar, 0, 510);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.r rVar = (e23.r) obj7;
                g21.g gVar = (g21.g) obj6;
                b11.i iVar = (b11.i) obj;
                g21.o oVar = (g21.o) obj2;
                iVar.getClass();
                String f14315a = iVar.getF14315a();
                g21.i iVar2 = (g21.i) ((u82.f) obj8).a();
                o oVar2 = (iVar2 == null || (hVar = iVar2.f75433a) == null) ? null : hVar.f75424a;
                if (oVar2 != null && f14315a != null) {
                    rVar.invoke(b63.q.a(oVar2, iVar.getF14317c()), oVar != null ? lg.d.L(oVar) : null, iVar, Boolean.valueOf(gVar.f75423c));
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                h50.m.b((i50.g) obj8, (e23.l) obj7, (r) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ha0.f.d((ha0.k) obj8, (e23.a) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                t.b((v) obj8, (p) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                p1 p1Var = (p1) obj7;
                p1 p1Var2 = (p1) obj6;
                int iIntValue2 = ho.e0.f84614a.get(((Integer) obj).intValue()).intValue() + (ho.e0.f84615b.get(((Integer) obj2).intValue()).intValue() * 60);
                eo.e eVar3 = (eo.e) ((p1) obj8).getF182175a();
                int i18 = eVar3 == null ? -1 : ho.e0.c.f84624a[eVar3.ordinal()];
                if (i18 == 1) {
                    p1Var.setValue(Integer.valueOf(iIntValue2));
                } else if (i18 == 2) {
                    p1Var2.setValue(Integer.valueOf(iIntValue2));
                }
                return Unit.INSTANCE;
            case 6:
                ho0.h hVar2 = (ho0.h) obj8;
                o53.b0 b0Var = (o53.b0) obj7;
                a1 a1Var = (a1) obj6;
                m mVar2 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = ho0.h.f84713l;
                if (mVar2.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    h82.e.a(z3.f.c(753618755, new e(hVar2, 7, b0Var, a1Var), mVar2), mVar2, 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 7:
                p1 p1Var3 = (p1) obj8;
                zc.d dVar = (zc.d) obj7;
                o0 o0Var = (o0) obj6;
                m mVar3 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    ho1.a.f84780a.getClass();
                    z02.d.a(zBooleanValue, ho1.a.f84781b, null, null, null, z3.f.c(323757540, new g80.e(25, dVar, o0Var), mVar3), mVar3, 196656, 28);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ht1.e0.a((pt1.m) obj8, (e23.a) obj7, (e23.l) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                g1 g1Var = (g1) obj8;
                ComposeView composeView = (ComposeView) obj7;
                m0 m0Var = (m0) obj6;
                m mVar4 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                MenstrualCycleDetailsActivity.a aVar3 = MenstrualCycleDetailsActivity.f38784t;
                if (mVar4.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    ub1.l lVarU = g1.u(g1Var, s0.MCT_REPORT, null, 6);
                    if (lVarU == null) {
                        mVar4.C(-1830559092);
                        mVar4.f();
                    } else {
                        mVar4.C(-1830559091);
                        composeView.setVisibility(0);
                        m0Var.f105804a = true;
                        z02.b.a(false, null, null, null, false, z3.f.c(-1253849792, new hx0.a(lVarU, 1), mVar4), mVar4, 196608, 31);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                float f16 = com.garmin.android.apps.connectmobile.newsfeed.d.f39492d;
                ((com.garmin.android.apps.connectmobile.newsfeed.d) obj8).g((r) obj7, (com.garmin.android.apps.connectmobile.newsfeed.d.j) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                a11.r rVar2 = (a11.r) obj;
                Double d14 = (Double) obj2;
                d14.getClass();
                rVar2.getClass();
                ((e23.l) obj8).invoke(rVar2);
                ((e23.l) obj7).invoke(d14);
                ((p1) obj6).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                i11.m.b((Integer) obj8, (i53.c) obj7, (v21.e) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                vb.b((p) obj8, (p) obj7, (h2) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                final p pVar = (p) obj7;
                final e23.q qVar2 = (e23.q) obj6;
                final k2 k2Var = (k2) obj;
                final g6.a aVar4 = (g6.a) obj2;
                final int iJ = g6.a.j(aVar4.f75988a);
                List listF0 = k2Var.F0((p) obj8, rg.Tabs);
                int size = listF0.size();
                final p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                if (size > 0) {
                    p0Var.f105807a = iJ / size;
                }
                Integer numValueOf = 0;
                int size2 = listF0.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    numValueOf = Integer.valueOf(Math.max(((y0) listF0.get(i24)).a0(p0Var.f105807a), numValueOf.intValue()));
                }
                final int iIntValue6 = numValueOf.intValue();
                final ArrayList arrayList = new ArrayList(listF0.size());
                int size3 = listF0.size();
                for (int i25 = 0; i25 < size3; i25++) {
                    y0 y0Var = (y0) listF0.get(i25);
                    int i26 = p0Var.f105807a;
                    arrayList.add(y0Var.Q(g6.a.b(i26, i26, iIntValue6, iIntValue6)));
                }
                final ArrayList arrayList2 = new ArrayList(size);
                for (int i27 = 0; i27 < size; i27++) {
                    arrayList2.add(new wf(k2Var.c1(p0Var.f105807a) * i27, k2Var.c1(p0Var.f105807a), ((g6.f) r13.b.d(g6.f.a(k2Var.c1(Math.min(((y0) listF0.get(i27)).l0(iIntValue6), p0Var.f105807a)) - (uf.f89933c * 2)), g6.f.a(24))).f75997a, null));
                }
                return b1.h0(k2Var, iJ, iIntValue6, new e23.l() { // from class: i3.ng
                    @Override // e23.l
                    public final Object invoke(Object obj9) {
                        int i28;
                        f5.v1.a aVar5 = (f5.v1.a) obj9;
                        ArrayList arrayList3 = arrayList;
                        int size4 = arrayList3.size();
                        for (int i29 = 0; i29 < size4; i29++) {
                            f5.v1.a.B(aVar5, (f5.v1) arrayList3.get(i29), p0Var.f105807a * i29, 0);
                        }
                        rg rgVar = rg.Divider;
                        f5.k2 k2Var2 = k2Var;
                        List listF1 = k2Var2.F0(pVar, rgVar);
                        int size5 = listF1.size();
                        int i30 = 0;
                        while (true) {
                            i28 = iIntValue6;
                            if (i30 >= size5) {
                                break;
                            }
                            f5.v1 v1VarQ = ((f5.y0) listF1.get(i30)).Q(g6.a.c(0, 0, 0, 0, 11, aVar4.f75988a));
                            f5.v1.a.B(aVar5, v1VarQ, 0, i28 - v1VarQ.f69145b);
                            i30++;
                        }
                        List listF2 = k2Var2.F0(new z3.e(1918742627, true, new og(qVar2, arrayList2)), rg.Indicator);
                        int size6 = listF2.size();
                        for (int i34 = 0; i34 < size6; i34++) {
                            f5.y0 y0Var2 = (f5.y0) listF2.get(i34);
                            g6.a.f75987b.getClass();
                            f5.v1.a.B(aVar5, y0Var2.Q(g6.a.C1525a.c(iJ, i28)), 0, 0);
                        }
                        return Unit.INSTANCE;
                    }
                });
            case 15:
                ((Integer) obj2).getClass();
                bi.j(p0.t(1), (r) obj7, (ph) obj6, (ri) obj8, (m) obj);
                return Unit.INSTANCE;
            case 16:
                d91.h hVar3 = (d91.h) obj8;
                String str = (String) obj7;
                String str2 = (String) obj6;
                m mVar5 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    r.a aVar5 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    r rVarY = l.y(aVar5, eVar4.f97920e);
                    h4.d.f81522a.getClass();
                    h4.g.b bVar = h4.d.a.f81534l;
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22692b, bVar, mVar5, 48);
                    int iHashCode = Long.hashCode(mVar5.getU());
                    i2 i2VarX = mVar5.x();
                    r rVarC2 = h4.k.c(rVarY, mVar5);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    h5.g.a.e eVar5 = h5.g.a.f81810g;
                    b4.c(eVar5, s2VarA, mVar5);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar5);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar5, iHashCode, bVar2);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar5);
                    u2 u2Var = u2.f22900a;
                    switch (d91.a.C1249a.f58496a[hVar3.f58540a.ordinal()]) {
                        case 1:
                            s62.a.f157643a.getClass();
                            dVarA = f72.s2.a(t62.c.f162799a);
                            break;
                        case 2:
                            s62.a.f157643a.getClass();
                            dVarA = f72.a.a(t62.c.f162799a);
                            break;
                        case 3:
                            s62.a.f157643a.getClass();
                            dVarA = yc.a(t62.c.f162799a);
                            break;
                        case 4:
                            s62.a.f157643a.getClass();
                            dVarA = f72.k.a(t62.c.f162799a);
                            break;
                        case 5:
                            s62.a.f157643a.getClass();
                            dVarA = id.a(t62.c.f162799a);
                            break;
                        case 6:
                            s62.a.f157643a.getClass();
                            dVarA = f72.i2.a(t62.c.f162799a);
                            break;
                        case 7:
                            s62.a.f157643a.getClass();
                            dVarA = b2.a(t62.c.f162799a);
                            break;
                        case 8:
                            s62.a.f157643a.getClass();
                            dVarA = rb.a(t62.c.f162799a);
                            break;
                        case 9:
                            s62.a.f157643a.getClass();
                            dVarA = u62.a.a(t62.a.f162797a);
                            break;
                        case 10:
                            s62.a.f157643a.getClass();
                            dVarA = oe.a(t62.c.f162799a);
                            break;
                        case 11:
                            s62.a.f157643a.getClass();
                            dVarA = ib.a(t62.c.f162799a);
                            break;
                        case 12:
                            s62.a.f157643a.getClass();
                            dVarA = nb.a(t62.c.f162799a);
                            break;
                        case 13:
                            s62.a.f157643a.getClass();
                            dVarA = b3.a(t62.c.f162799a);
                            break;
                        case 14:
                            s62.a.f157643a.getClass();
                            dVarA = o5.a(t62.a.f162797a);
                            break;
                        case 15:
                            s62.a.f157643a.getClass();
                            dVarA = f72.a1.a(t62.c.f162799a);
                            break;
                        default:
                            u0.r();
                            return null;
                    }
                    g02.i.a(null, dVarA, d92.b.a(mVar5).f().f63508c, fb1.c.i(gl.c.f77766a, mVar5), j92.b.f97901d.f97906e, 0.0f, null, mVar5, 0, 225);
                    r rVarC3 = l.C(aVar5, eVar4.f97919d, 0.0f, 0.0f, 0.0f, 14);
                    z zVarA = c2.y.a(c2.j.i(eVar4.f97917b), h4.d.a.f81536n, mVar5, 0);
                    int iHashCode2 = Long.hashCode(mVar5.getU());
                    i2 i2VarX2 = mVar5.x();
                    r rVarC4 = h4.k.c(rVarC3, mVar5);
                    if (mVar5.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar5.z();
                    if (mVar5.getT()) {
                        mVar5.M(aVar6);
                    } else {
                        mVar5.c();
                    }
                    b4.c(eVar5, zVarA, mVar5);
                    b4.c(c1623g, i2VarX2, mVar5);
                    if (mVar5.getT() || !s.g(mVar5.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar5, iHashCode2, bVar2);
                    }
                    b4.c(fVar, rVarC4, mVar5);
                    b0 b0Var2 = b0.f22601a;
                    if (str == null) {
                        mVar5.C(257328454);
                        mVar5.f();
                    } else {
                        mVar5.C(257328455);
                        d92.b.f58624b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97932i, mVar5)), mVar5, 0, 0, 131070);
                        mVar5.f();
                    }
                    if (str2 == null) {
                        mVar5.C(257526699);
                        mVar5.f();
                    } else {
                        mVar5.C(257526700);
                        d92.b.f58624b.getClass();
                        mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar5), mVar5, 0, 0, 131070);
                        mVar5.f();
                    }
                    mVar5.y();
                    mVar5.y();
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ib0.d.b((i53.c) obj8, (e23.a) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                w.d((t2) obj8, (jb0.b) obj7, (e23.a) obj6, (m) obj, p0.t(55));
                return Unit.INSTANCE;
            case 19:
                ih0.s sVar = (ih0.s) obj8;
                x3 x3Var = (x3) obj7;
                y yVar = (y) obj6;
                m mVar6 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    r.a aVar7 = r.S;
                    r rVarE = u1.n.e(x2.f(aVar7, 1.0f), vb.h.e(d92.b.f58623a, mVar6), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar8 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA2 = c2.y.a(c2.j.f22694d, aVar8, mVar6, 48);
                    int iHashCode3 = Long.hashCode(mVar6.getU());
                    i2 i2VarX3 = mVar6.x();
                    r rVarC5 = h4.k.c(rVarE, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar9 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar9);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar6);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar6, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar6);
                    b0 b0Var3 = b0.f22601a;
                    if (((ih0.t) x3Var.getF182175a()).f93507a) {
                        mVar6.C(164996088);
                        boolean zR2 = mVar6.r(sVar);
                        Object objQ2 = mVar6.q();
                        if (zR2) {
                            obj3 = objQ2;
                            ih0.r rVar3 = new ih0.r(sVar, false ? 1 : 0);
                            mVar6.K(rVar3);
                            obj3 = rVar3;
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                obj3 = objQ2;
                                ih0.r rVar4 = new ih0.r(sVar, false ? 1 : 0);
                                mVar6.K(rVar4);
                                obj3 = rVar4;
                            }
                        }
                        obj3 = objQ2;
                        e23.a aVar10 = (e23.a) obj3;
                        boolean zR3 = mVar6.r(sVar) | mVar6.B(aVar10);
                        Object objQ3 = mVar6.q();
                        if (zR3) {
                            obj4 = objQ3;
                            i91.c cVar = new i91.c(i15, sVar, aVar10);
                            mVar6.K(cVar);
                            obj4 = cVar;
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                obj4 = objQ3;
                                i91.c cVar2 = new i91.c(i15, sVar, aVar10);
                                mVar6.K(cVar2);
                                obj4 = cVar2;
                            }
                        }
                        obj4 = objQ3;
                        kh0.i.a(aVar10, (e23.a) obj4, mVar6, 0);
                        mVar6.f();
                    } else {
                        mVar6.C(165357424);
                        mVar6.f();
                    }
                    g6.f.a aVar11 = g6.f.f75994b;
                    l.f(l.C(aVar7, 0.0f, 16, 0.0f, 0.0f, 13), mVar6);
                    Object objQ4 = mVar6.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    Object obj9 = objQ4;
                    if (objQ4 == c2565a) {
                        i53.f fVarA = i53.a.a(o82.g.f130849b, o82.g.f130851d, o82.g.f130853f, o82.g.f130856i);
                        mVar6.K(fVarA);
                        obj9 = fVarA;
                    }
                    i53.f fVar2 = (i53.f) obj9;
                    Object objQ5 = mVar6.q();
                    if (objQ5 == c2565a) {
                        n82.f.a aVar12 = new n82.f.a((o82.g) fVar2.get(0), null, null, 6, null);
                        mVar6.K(aVar12);
                        objQ5 = aVar12;
                    }
                    n82.f fVarA2 = n82.j.a((n82.f.a) objQ5, null, mVar6, 2);
                    n82.b bVar4 = fVarA2.f124961b;
                    Context context = (Context) mVar6.A(AndroidCompositionLocals_androidKt.f6042b);
                    Object objQ6 = mVar6.q();
                    Object obj10 = objQ6;
                    if (objQ6 == c2565a) {
                        yd1.a aVar13 = new yd1.a(context);
                        mVar6.K(aVar13);
                        obj10 = aVar13;
                    }
                    yd1.a aVar14 = (yd1.a) obj10;
                    i53.c cVarE = i53.a.e(o2.b(fVar2, mVar6));
                    int iIndexOf = fVar2.indexOf(bVar4.a());
                    boolean zB = mVar6.B(fVarA2);
                    Object objQ7 = mVar6.q();
                    Object obj11 = objQ7;
                    if (zB || objQ7 == c2565a) {
                        f0 f0Var = new f0(fVarA2, fVar2, 8);
                        mVar6.K(f0Var);
                        obj11 = f0Var;
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (e23.l) obj11, mVar6, 3072, 18);
                    if (bVar4.a() != o82.g.f130849b) {
                        mVar6.C(166657347);
                        q82.a.a(x2.f(aVar7, 1.0f), new n82.n(fVarA2, aVar14), null, mVar6, 6, 4);
                        mVar6.f();
                    } else {
                        mVar6.C(166885104);
                        mVar6.f();
                    }
                    n82.c.a(b0Var3.a(aVar7, 1.0f, true), fVarA2, 3, false, z3.f.c(-1700407116, new i91.e(sVar, 5, yVar, fVarA2), mVar6), mVar6, 24960, 8);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 20:
                km1.c cVar3 = (km1.c) obj8;
                sm1.s sVar2 = (sm1.s) obj7;
                x3 x3Var2 = (x3) obj6;
                m mVar7 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    Integer num = ((a0) x3Var2.getF182175a()).f160097m;
                    int iIntValue10 = num != null ? num.intValue() : 0;
                    rl1.i iVar3 = ((a0) x3Var2.getF182175a()).f160091g;
                    boolean zR4 = mVar7.r(sVar2);
                    Object objQ8 = mVar7.q();
                    if (zR4) {
                        objQ8 = new in1.c(sVar2, i17);
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new in1.c(sVar2, i17);
                            mVar7.K(objQ8);
                        }
                    }
                    in1.k.a(cVar3, iIntValue10, iVar3, (e23.l) objQ8, mVar7, km1.c.B);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 21:
                ArrayList arrayList3 = (ArrayList) obj8;
                e23.l lVar = (e23.l) obj7;
                p1 p1Var4 = (p1) obj6;
                List list = (List) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                list.getClass();
                Object obj12 = ((j0) list.get(iIntValue11)).f111076e ? (rl1.i) h0.e0(iIntValue11, arrayList3) : null;
                p1Var4.setValue(obj12);
                lVar.invoke(obj12);
                return Unit.INSTANCE;
            case 22:
                gv0.y yVar2 = (gv0.y) obj8;
                wd2.l lVar2 = (wd2.l) obj7;
                Context context2 = (Context) obj6;
                m mVar8 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    if (yVar2 == gv0.y.Receiver) {
                        mVar8.C(1721649563);
                        mVar8.C(471180012);
                        s5.c.b bVar5 = new s5.c.b(0, 1, null);
                        String strQ = gl1.y.Q(mVar8, R.string.lbl_garmin_messenger_app_name);
                        String strP = gl1.y.P(R.string.msg_this_contact_is_on_garmin_messenger, new Object[]{strQ}, mVar8);
                        int iL = d53.w.L(0, 6, strP, strQ);
                        String string = d53.w.P(iL, strP.length(), strP).toString();
                        String string2 = d53.w.P(0, strQ.length() + iL, strP).toString();
                        bVar5.b(string);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97933j;
                        r0 r0Var = new r0(x0.a(x0Var, ds.e0.e(mVar8), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214).f157322a, null, null, null, 14, null);
                        boolean zR5 = mVar8.r(lVar2) | mVar8.r(context2);
                        Object objQ9 = mVar8.q();
                        if (zR5) {
                            objQ9 = new hl1.k(i16, lVar2, context2);
                            mVar8.K(objQ9);
                        } else {
                            aVar.getClass();
                            if (objQ9 == m.a.f135155b) {
                                objQ9 = new hl1.k(i16, lVar2, context2);
                                mVar8.K(objQ9);
                            }
                        }
                        int iG = bVar5.g(new s5.m.a(strQ, r0Var, (s5.n) objQ9));
                        try {
                            bVar5.b(strQ);
                            Unit unit = Unit.INSTANCE;
                            bVar5.f(iG);
                            bVar5.b(string2);
                            s5.c cVarK = bVar5.k();
                            mVar8.f();
                            r.a aVar15 = r.S;
                            d92.b.f58625c.getClass();
                            j92.e eVar6 = j92.b.f97899b;
                            mh.d(cVarK, l.z(aVar15, eVar6.f97920e, eVar6.f97917b), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.f(x0Var, mVar8), mVar8, 0, 0, 262140);
                            mVar8.f();
                        } catch (Throwable th3) {
                            bVar5.f(iG);
                            throw th3;
                        }
                    } else {
                        mVar8.C(1723039169);
                        mVar8.f();
                    }
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 23:
                DateTime dateTime = (DateTime) obj8;
                DateTime dateTime2 = (DateTime) obj7;
                i53.c cVar4 = (i53.c) obj6;
                m mVar9 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    sz1.k.a(dateTime, dateTime2, cVar4, mVar9, oz1.b.F << 6);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.running_tolerance.presentation.b.a((jf1.b) obj8, (y) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                return a(obj, obj2);
            case 26:
                jk1.f fVar3 = (jk1.f) obj8;
                p1 p1Var5 = (p1) obj7;
                String str3 = (String) obj6;
                m mVar10 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    hk1.r rVar5 = ((jk1.e) p1Var5.getF182175a()).f99390d;
                    if (rVar5 == null || !(!rVar5.getIsAuthProhibited())) {
                        mVar10.C(-553953543);
                        mVar10.f();
                    } else {
                        mVar10.C(-555655474);
                        hk1.r rVar6 = ((jk1.e) p1Var5.getF182175a()).f99390d;
                        hk1.c cVar5 = ((jk1.e) p1Var5.getF182175a()).f99393g;
                        if (cVar5 == null || ((jk1.e) p1Var5.getF182175a()).f99392f.isEmpty() || rVar6 == null) {
                            mVar10.f();
                            return Unit.INSTANCE;
                        }
                        i53.d<hk1.d, Boolean> dVar2 = ((jk1.e) p1Var5.getF182175a()).f99392f;
                        hk1.c cVar6 = ((jk1.e) p1Var5.getF182175a()).f99393g;
                        boolean zC = fVar3.f99403g.c("third_party_apps_logo_in_details_page_enabled");
                        boolean zR6 = mVar10.r(fVar3) | mVar10.r(rVar6);
                        Object objQ10 = mVar10.q();
                        if (zR6) {
                            obj5 = objQ10;
                            hv0.d dVar3 = new hv0.d(10, fVar3, rVar6);
                            mVar10.K(dVar3);
                            obj5 = dVar3;
                        } else {
                            aVar.getClass();
                            if (objQ10 == m.a.f135155b) {
                                obj5 = objQ10;
                                hv0.d dVar4 = new hv0.d(10, fVar3, rVar6);
                                mVar10.K(dVar4);
                                obj5 = dVar4;
                            }
                        }
                        obj5 = objQ10;
                        ik1.b.a(rVar6, dVar2, cVar6, zC, (e23.q) obj5, z3.f.c(1441839963, new jj2.c(rVar6, cVar5, fVar3, str3), mVar10), mVar10, 196608);
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                jk1.b.b((String) obj8, (jk1.f) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                jt1.g.a((r) obj8, (String) obj7, (ro0.l) obj6, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                jt1.k.c((kt1.b) obj8, (r) obj7, (e23.a) obj6, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f79833a = i15;
        this.f79834b = obj;
        this.f79835c = obj2;
        this.f79836d = obj3;
    }

    public /* synthetic */ c(Object obj, int i14, Object obj2, Object obj3) {
        this.f79833a = i14;
        this.f79834b = obj;
        this.f79835c = obj2;
        this.f79836d = obj3;
    }
}
