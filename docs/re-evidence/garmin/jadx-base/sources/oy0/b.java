package oy0;

import a42.f0;
import android.content.Context;
import b82.t0;
import c2.b0;
import c2.j;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import c22.o2;
import ca0.u1;
import com.airbnb.lottie.LottieComposition;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart.wrapper.BaseLineChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.l;
import e23.p;
import et1.g1;
import f5.z0;
import gs1.t;
import h4.k;
import h4.r;
import h5.e0;
import i3.a1;
import i3.e5;
import i3.fe;
import i3.mc;
import i3.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l72.c1;
import l72.i3;
import l72.j0;
import l72.p2;
import l72.v2;
import o4.m1;
import o70.d0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
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
import p40.k0;
import rk0.w;
import s5.x0;
import s70.a0;
import s70.b1;
import s70.r1;
import sk0.i1;
import sk0.j1;
import sk0.l1;
import t21.i0;
import t21.o;
import u1.a2;
import v62.fa;
import x5.l0;
import x5.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f134368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f134369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f134370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f134371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f134372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f134373g;

    public /* synthetic */ b(String str, String str2, String str3, l lVar, e23.a aVar, p1 p1Var) {
        this.f134367a = 26;
        this.f134369c = str;
        this.f134370d = str2;
        this.f134371e = str3;
        this.f134372f = lVar;
        this.f134373g = aVar;
        this.f134368b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x024f  */
    /* JADX WARN: Code duplicated, block: B:97:0x033b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final Object a(Object obj, Object obj2) {
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        h5.g.a.C1623g c1623g2;
        h5.g.a.b bVar2;
        h5.g.a.f fVar2;
        String strH;
        h5.g.a.b bVar3;
        int iIndexOf;
        r rVar = (r) this.f134369c;
        p1 p1Var = (p1) this.f134368b;
        p1 p1Var2 = (p1) this.f134370d;
        final dy1.b bVar4 = (dy1.b) this.f134371e;
        p1 p1Var3 = (p1) this.f134372f;
        l lVar = (l) this.f134373g;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        final int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            r rVarC = k.c(rVar, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, mVar);
            h5.g.a.C1623g c1623g3 = h5.g.a.f81809f;
            b4.c(c1623g3, i2VarX, mVar);
            h5.g.a.b bVar5 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar5);
            }
            h5.g.a.f fVar3 = h5.g.a.f81807d;
            b4.c(fVar3, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            p2 p2Var = p2.f111205a;
            String strQ = gl1.y.Q(mVar, R.string.workout_step_reps);
            z3.e eVarC = z3.f.c(-1304013961, new p() { // from class: rx1.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    String strH2;
                    int i15 = i14;
                    dy1.b bVar6 = bVar4;
                    switch (i15) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                Object objValueOf = bVar6 != null ? String.valueOf(bVar6.f61532e) : null;
                                if (objValueOf == null) {
                                    objValueOf = sn.a.h(mVar2, 973037277, R.string.no_value, mVar2);
                                } else {
                                    mVar2.C(973035882);
                                    mVar2.f();
                                }
                                String str = objValueOf;
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                if ((bVar6 != null ? bVar6.f61529b : null) != null) {
                                    mVar3.C(792046380);
                                    mVar3.f();
                                    l3.f23124b.getClass();
                                    strH2 = e5.g(l3.f23130h.format(bVar6.f61529b.doubleValue()), StringUtils.SPACE, bVar6.f61530c);
                                } else {
                                    strH2 = sn.a.h(mVar3, 792230396, R.string.no_value, mVar3);
                                }
                                String str2 = strH2;
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, mVar);
            boolean zB = mVar.B(p1Var);
            Object objQ = mVar.q();
            m.a aVar2 = m.f135153a;
            if (zB) {
                objQ = new w(p1Var, 4);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new w(p1Var, 4);
                    mVar.K(objQ);
                }
            }
            p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ, mVar, 24576, 238);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(1064425522);
                r.a aVar3 = r.S;
                r rVarE = u1.n.e(x2.f(aVar3, 1.0f), p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
                z0 z0VarD = q.d(h4.d.a.f81528f, false);
                int iHashCode2 = Long.hashCode(mVar.getU());
                i2 i2VarX2 = mVar.x();
                r rVarC2 = k.c(rVarE, mVar);
                if (mVar.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar);
                } else {
                    mVar.c();
                }
                eVar = eVar2;
                b4.c(eVar, z0VarD, mVar);
                c1623g = c1623g3;
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    bVar = bVar5;
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                } else {
                    bVar = bVar5;
                }
                fVar = fVar3;
                b4.c(fVar, rVarC2, mVar);
                u uVar = u.f22885a;
                i53.c cVarH = ds.e0.h(1, 20);
                if (h0.R(cVarH, bVar4 != null ? Integer.valueOf(bVar4.f61532e) : null)) {
                    iIndexOf = cVarH.indexOf(bVar4 != null ? Integer.valueOf(bVar4.f61532e) : null);
                } else {
                    iIndexOf = 0;
                }
                boolean zB2 = mVar.B(p1Var3) | mVar.B(cVarH) | mVar.B(lVar);
                Object objQ2 = mVar.q();
                if (zB2) {
                    objQ2 = new pk0.i(cVarH, p1Var3, lVar);
                    mVar.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new pk0.i(cVarH, p1Var3, lVar);
                        mVar.K(objQ2);
                    }
                }
                r82.k.c(null, i53.a.a(new r82.p(cVarH, iIndexOf, null, null, null, 0.0f, false, false, null, null, (l) objQ2, 1020, null)), mVar, 0, 1);
                mVar.y();
                d92.b.f58625c.getClass();
                c2.l.f(x2.h(aVar3, j92.b.f97899b.f97920e), mVar);
                mVar.f();
            } else {
                eVar = eVar2;
                c1623g = c1623g3;
                bVar = bVar5;
                fVar = fVar3;
                mVar.C(1066560864);
                mVar.f();
            }
            String strQ2 = gl1.y.Q(mVar, R.string.lbl_weight);
            final int i15 = 1;
            z3.e eVarC2 = z3.f.c(-716353952, new p() { // from class: rx1.a
                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.p
                public final Object invoke(Object obj3, Object obj4) {
                    String strH2;
                    int i16 = i15;
                    dy1.b bVar6 = bVar4;
                    switch (i16) {
                        case 0:
                            p3.m mVar2 = (p3.m) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                x1 x1Var2 = p3.n.f135158a;
                                Object objValueOf = bVar6 != null ? String.valueOf(bVar6.f61532e) : null;
                                if (objValueOf == null) {
                                    objValueOf = sn.a.h(mVar2, 973037277, R.string.no_value, mVar2);
                                } else {
                                    mVar2.C(973035882);
                                    mVar2.f();
                                }
                                String str = objValueOf;
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar2), mVar2, 0, 0, 131070);
                            } else {
                                mVar2.e();
                            }
                            break;
                        default:
                            p3.m mVar3 = (p3.m) obj3;
                            int iIntValue3 = ((Integer) obj4).intValue();
                            if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                x1 x1Var3 = p3.n.f135158a;
                                if ((bVar6 != null ? bVar6.f61529b : null) != null) {
                                    mVar3.C(792046380);
                                    mVar3.f();
                                    l3.f23124b.getClass();
                                    strH2 = e5.g(l3.f23130h.format(bVar6.f61529b.doubleValue()), StringUtils.SPACE, bVar6.f61530c);
                                } else {
                                    strH2 = sn.a.h(mVar3, 792230396, R.string.no_value, mVar3);
                                }
                                String str2 = strH2;
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar3), mVar3, 0, 0, 131070);
                            } else {
                                mVar3.e();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, mVar);
            boolean zB3 = mVar.B(p1Var2);
            Object objQ3 = mVar.q();
            if (zB3) {
                objQ3 = new w(p1Var2, 5);
                mVar.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new w(p1Var2, 5);
                    mVar.K(objQ3);
                }
            }
            h5.g.a.f fVar4 = fVar;
            h5.g.a.C1623g c1623g4 = c1623g;
            h5.g.a.b bVar6 = bVar;
            h5.g.a.e eVar3 = eVar;
            p2Var.g(strQ2, null, null, null, eVarC2, false, false, (e23.a) objQ3, mVar, 24576, 238);
            m mVar2 = mVar;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                mVar2.C(1067413147);
                r rVarE2 = u1.n.e(x2.f(r.S, 1.0f), p6.b.a(d92.b.f58623a, mVar2), m1.f128891a);
                z0 z0VarD2 = q.d(h4.d.a.f81528f, false);
                int iHashCode3 = Long.hashCode(mVar2.getU());
                i2 i2VarX3 = mVar2.x();
                r rVarC3 = k.c(rVarE2, mVar2);
                if (mVar2.F() == null) {
                    p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                b4.c(eVar3, z0VarD2, mVar2);
                b4.c(c1623g4, i2VarX3, mVar2);
                if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode3))) {
                    bVar3 = bVar6;
                    v.h.z(iHashCode3, mVar2, iHashCode3, bVar3);
                } else {
                    bVar3 = bVar6;
                }
                b4.c(fVar4, rVarC3, mVar2);
                u uVar2 = u.f22885a;
                Double d14 = bVar4 != null ? bVar4.f61529b : null;
                double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
                boolean z14 = bVar4 != null ? bVar4.f61531d : true;
                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_kg);
                String strQ4 = gl1.y.Q(mVar2, R.string.lbl_lbs);
                boolean zB4 = mVar2.B(p1Var3) | mVar2.B(lVar);
                Object objQ4 = mVar2.q();
                if (zB4) {
                    objQ4 = new c(p1Var3, lVar);
                    mVar2.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new c(p1Var3, lVar);
                        mVar2.K(objQ4);
                    }
                }
                bVar2 = bVar3;
                fVar2 = fVar4;
                c1623g2 = c1623g4;
                r82.u.a(null, z14, false, strQ3, strQ4, null, null, dDoubleValue, 453.5d, 999.5d, 0, 0.0d, (l) objQ4, null, null, true, false, mVar2, 905969664, 1769472, 27749);
                mVar2 = mVar2;
                mVar2.y();
                mVar2.f();
            } else {
                c1623g2 = c1623g4;
                bVar2 = bVar6;
                fVar2 = fVar4;
                mVar2.C(1068924800);
                mVar2.f();
            }
            r.a aVar4 = r.S;
            r rVarF = x2.f(aVar4, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar4 = j92.b.f97899b;
            r rVarC4 = c2.l.C(c2.l.A(rVarF, eVar4.f97920e, 0.0f, 2), 0.0f, eVar4.f97921f, 0.0f, 0.0f, 13);
            s2 s2VarA = q2.a(j.f22692b, h4.d.a.f81533k, mVar2, 0);
            int iHashCode4 = Long.hashCode(mVar2.getU());
            i2 i2VarX4 = mVar2.x();
            r rVarC5 = k.c(rVarC4, mVar2);
            if (mVar2.F() == null) {
                p0.l();
                throw null;
            }
            mVar2.z();
            if (mVar2.getT()) {
                mVar2.M(aVar);
            } else {
                mVar2.c();
            }
            b4.c(eVar3, s2VarA, mVar2);
            b4.c(c1623g2, i2VarX4, mVar2);
            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode4))) {
                v.h.z(iHashCode4, mVar2, iHashCode4, bVar2);
            }
            b4.c(fVar2, rVarC5, mVar2);
            u2 u2Var = u2.f22900a;
            String strQ5 = gl1.y.Q(mVar2, R.string.lbl_estimated_one_rep_max_equals);
            d92.b.f58624b.getClass();
            x0 x0Var = j92.f.f97936m;
            m mVar3 = mVar2;
            mh.c(strQ5, u2Var.a(aVar4, 0.75f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar2), mVar3, 0, 0, 131068);
            if ((bVar4 != null ? bVar4.f61533f : null) != null) {
                mVar3.C(-1790638195);
                mVar3.f();
                l3.f23124b.getClass();
                strH = e5.g(l3.f23130h.format(bVar4.f61533f.doubleValue()), StringUtils.SPACE, bVar4.f61530c);
            } else {
                if ((bVar4 != null ? bVar4.f61530c : null) != null) {
                    mVar3.C(-1790403525);
                    strH = gl1.y.Q(mVar3, R.string.no_value) + StringUtils.SPACE + bVar4.f61530c;
                    mVar3.f();
                } else {
                    strH = sn.a.h(mVar3, -1790263002, R.string.no_value, mVar3);
                }
            }
            x0 x0VarB = d92.c.b(x0Var, mVar3);
            r rVarA = u2Var.a(aVar4, 0.25f, true);
            d6.h.f57752b.getClass();
            mh.c(strH, rVarA, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarB, mVar3, 0, 0, 130044);
            mVar3.y();
            mVar3.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x009b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0107  */
    /* JADX WARN: Code duplicated, block: B:35:0x0125  */
    /* JADX WARN: Code duplicated, block: B:40:0x013a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0145  */
    /* JADX WARN: Code duplicated, block: B:45:0x014c  */
    /* JADX WARN: Code duplicated, block: B:53:0x018e  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        m mVar;
        int i14;
        boolean z14;
        boolean zR;
        Object objQ;
        i1 i1Var = (i1) this.f134369c;
        p1 p1Var = (p1) this.f134368b;
        p1 p1Var2 = (p1) this.f134370d;
        e23.a aVar = (e23.a) this.f134371e;
        p1 p1Var3 = (p1) this.f134372f;
        Context context = (Context) this.f134373g;
        m mVar2 = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean z15 = ((sk0.m1) p1Var2.getF182175a()).f159757c;
            m.a aVar2 = m.f135153a;
            if (z15) {
                mVar2.C(1408936028);
                s62.a.f157643a.getClass();
                u4.d dVarA = fa.a(t62.b.f162798a);
                String strQ = gl1.y.Q(mVar2, R.string.lbl_error_occurred);
                String strQ2 = gl1.y.Q(mVar2, R.string.loading_error_message);
                r.a aVar3 = r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                r rVarC = c2.l.C(aVar3, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                String strQ3 = gl1.y.Q(mVar2, R.string.lbl_try_again);
                boolean zR2 = mVar2.r(i1Var);
                Object objQ2 = mVar2.q();
                if (zR2) {
                    objQ2 = new j1(i1Var, 1);
                    mVar2.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == m.a.f135155b) {
                        objQ2 = new j1(i1Var, 1);
                        mVar2.K(objQ2);
                    }
                }
                i14 = 0;
                b82.n.d(dVarA, strQ, strQ2, rVarC, strQ3, (e23.a) objQ2, null, null, mVar2, 0, 192);
                mVar = mVar2;
                mVar.f();
            } else {
                mVar = mVar2;
                i14 = 0;
                if (((sk0.m1) p1Var2.getF182175a()).f159758d.isEmpty()) {
                    sk0.m1 m1Var = (sk0.m1) p1Var2.getF182175a();
                    if (!m1Var.f159755a || m1Var.f159756b) {
                        mVar.C(1409492943);
                        sk0.m1 m1Var2 = (sk0.m1) p1Var2.getF182175a();
                        z14 = m1Var2.f159755a && m1Var2.f159756b;
                        boolean zR3 = mVar.r(i1Var);
                        Object objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new j1(i1Var, 2);
                            mVar.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new j1(i1Var, 2);
                                mVar.K(objQ3);
                            }
                        }
                        l1.c(z14, (e23.a) objQ3, z3.f.c(-1134413095, new a0(aVar, 5), mVar), mVar, 384);
                        mVar.f();
                    } else {
                        mVar.C(1410541611);
                        sk0.m1 m1Var3 = (sk0.m1) p1Var2.getF182175a();
                        z14 = !m1Var3.f159755a && m1Var3.f159756b;
                        zR = mVar.r(i1Var);
                        objQ = mVar.q();
                        if (zR) {
                            objQ = new j1(i1Var, 3);
                            mVar.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new j1(i1Var, 3);
                                mVar.K(objQ);
                            }
                        }
                        l1.c(z14, (e23.a) objQ, z3.f.c(-1255244551, new sg2.g((Object) p1Var3, (Object) p1Var, aVar, (Object) p1Var2, (Object) context, 5), mVar), mVar, 384);
                        mVar.f();
                    }
                } else {
                    mVar.C(1410541611);
                    sk0.m1 m1Var4 = (sk0.m1) p1Var2.getF182175a();
                    if (m1Var4.f159755a) {
                    }
                    zR = mVar.r(i1Var);
                    objQ = mVar.q();
                    if (zR) {
                        aVar2.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new j1(i1Var, 3);
                            mVar.K(objQ);
                        }
                    } else {
                        objQ = new j1(i1Var, 3);
                        mVar.K(objQ);
                    }
                    l1.c(z14, (e23.a) objQ, z3.f.c(-1255244551, new sg2.g((Object) p1Var3, (Object) p1Var, aVar, (Object) p1Var2, (Object) context, 5), mVar), mVar, 384);
                    mVar.f();
                }
            }
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(1413947302);
                boolean zB = mVar.B(p1Var);
                Object objQ4 = mVar.q();
                if (zB) {
                    objQ4 = new sg0.l(p1Var, 17);
                    mVar.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == m.a.f135155b) {
                        objQ4 = new sg0.l(p1Var, 17);
                        mVar.K(objQ4);
                    }
                }
                uk0.h.b((e23.a) objQ4, mVar, i14);
                mVar.f();
            } else {
                mVar.C(1414090491);
                mVar.f();
            }
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2) {
        String str = (String) this.f134369c;
        String str2 = (String) this.f134370d;
        String str3 = (String) this.f134371e;
        l<? super String, Unit> lVar = (l) this.f134372f;
        e23.a aVar = (e23.a) this.f134373g;
        p1 p1Var = (p1) this.f134368b;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            t0 t0Var = t0.f16792a;
            if (!((Boolean) p1Var.getF182175a()).booleanValue()) {
                str = str2;
            }
            v.f188954b.getClass();
            int i14 = v.f188963k;
            Object objQ = mVar.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new t21.u(6);
                mVar.K(objQ);
            }
            l<? super l0, l0> lVar2 = (l) objQ;
            boolean zB = mVar.B(aVar);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new o(aVar, p1Var, 1);
                mVar.K(objQ2);
            }
            t0Var.k(null, str3, str, null, false, 8, false, lVar2, lVar, (l) objQ2, i14, 0, null, null, mVar, 12804096, 6, 6153);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        t21.j1.a((s21.b0) this.f134368b, (Boolean) this.f134369c, (l) this.f134370d, (l) this.f134371e, (l) this.f134372f, (v21.e) this.f134373g, (m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0072  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a6  */
    private final Object e(Object obj, Object obj2) {
        CustomCombinedChart customCombinedChart = (CustomCombinedChart) this.f134368b;
        sz.a aVar = (sz.a) this.f134369c;
        l42.e eVar = (l42.e) this.f134370d;
        l42.d dVar = (l42.d) this.f134371e;
        zk0.g gVar = (zk0.g) this.f134372f;
        Context context = (Context) this.f134373g;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarH = x2.h(c2.l.A(x2.f(u1.n.e(r.S, vb.h.e(d92.b.f58623a, mVar), m1.f128891a), 1.0f), 16, 0.0f, 2), 330);
            boolean zR = mVar.r(customCombinedChart);
            Object objQ = mVar.q();
            m.a aVar3 = m.f135153a;
            if (zR) {
                objQ = new hn1.j(customCombinedChart, 7);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new hn1.j(customCombinedChart, 7);
                    mVar.K(objQ);
                }
            }
            l lVar = (l) objQ;
            boolean zR2 = mVar.r(aVar) | mVar.r(eVar) | mVar.k(dVar.ordinal()) | mVar.r(gVar) | mVar.r(context);
            Object objQ2 = mVar.q();
            if (zR2) {
                jv0.c cVar = new jv0.c(aVar, eVar, context, dVar, gVar, 26);
                mVar.K(cVar);
                objQ2 = cVar;
            } else {
                aVar3.getClass();
                if (objQ2 == m.a.f135155b) {
                    jv0.c cVar2 = new jv0.c(aVar, eVar, context, dVar, gVar, 26);
                    mVar.K(cVar2);
                    objQ2 = cVar2;
                }
            }
            p002j6.c.b(lVar, rVarH, (l) objQ2, mVar, 0, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:124:0x050d  */
    /* JADX WARN: Code duplicated, block: B:147:0x060f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0657  */
    /* JADX WARN: Code duplicated, block: B:240:0x0a5c  */
    /* JADX WARN: Code duplicated, block: B:245:0x0a7b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:279:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:30:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0258  */
    /* JADX WARN: Code duplicated, block: B:97:0x0420  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        List listN0;
        int i14 = this.f134367a;
        ArrayList<o13.p> arrayList = null;
        m.a aVar = m.f135153a;
        int i15 = 2;
        int i16 = 1;
        Object obj3 = this.f134373g;
        Object obj4 = this.f134372f;
        Object obj5 = this.f134371e;
        Object obj6 = this.f134370d;
        Object obj7 = this.f134369c;
        int i17 = 7;
        Object obj8 = this.f134368b;
        switch (i14) {
            case 0:
                p1 p1Var = (p1) obj8;
                o53.b0 b0Var = (o53.b0) obj7;
                e23.q qVar = (e23.q) obj6;
                Map map = (Map) obj5;
                Set set = (Set) obj4;
                Set set2 = (Set) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    String strQ = gl1.y.Q(mVar, R.string.lbl_save);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    long jE = ds.e0.e(mVar);
                    r rVarA = v2.a(v2.a(r.S, ((Boolean) p1Var.getF182175a()).booleanValue(), new ku1.l(b0Var, qVar, map, set, set2, 12), mVar, 6), !((Boolean) p1Var.getF182175a()).booleanValue(), new o72.i1(22), mVar, 0);
                    d92.b.f58625c.getClass();
                    mh.c(strQ, c2.l.y(rVarA, j92.b.f97899b.f97920e), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131064);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                f.a((String) obj8, (String) obj7, (List) obj6, (fy0.e) obj5, (l) obj4, (p) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                f.d((sy0.i) obj8, (sy0.i) obj7, (sy0.i) obj5, (i53.c) obj4, (e23.a) obj3, (e23.q) obj6, (m) obj, p0.t(24577));
                return Unit.INSTANCE;
            case 3:
                q21.p pVar = (q21.p) obj8;
                v21.e eVar = (v21.e) obj7;
                l lVar = (l) obj6;
                l lVar2 = (l) obj5;
                l lVar3 = (l) obj4;
                l lVar4 = (l) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r.a aVar2 = r.S;
                    r rVarB = a2.b(x2.d(aVar2, 1.0f), a2.a(mVar2), true);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(rVarB, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var2 = b0.f22601a;
                    p21.g.d(pVar.f142275g, eVar, lVar, x2.f(aVar2, 1.0f), mVar2, 3072);
                    p21.g.e(24576, lVar2, lVar3, x2.f(aVar2, 1.0f), mVar2, pVar.f142276h, pVar.f142277i, eVar, pVar.f142270b);
                    if (pVar.f142274f) {
                        mVar2.C(795748669);
                        c1 c1Var = c1.f110940a;
                        String strB = g22.n.b(gl1.y.Q(mVar2, R.string.delete_food_entries));
                        String strQ2 = gl1.y.Q(mVar2, R.string.msg_updating_your_meal_windows_warning);
                        String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                        String strQ4 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                        boolean zB = mVar2.B(lVar4);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new me2.d(lVar4, i17);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == m.a.f135155b) {
                                objQ = new me2.d(lVar4, i17);
                                mVar2.K(objQ);
                            }
                        }
                        e23.a<Unit> aVar4 = (e23.a) objQ;
                        boolean zB2 = mVar2.B(lVar4);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new me2.d(lVar4, 8);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == m.a.f135155b) {
                                objQ2 = new me2.d(lVar4, 8);
                                mVar2.K(objQ2);
                            }
                        }
                        c1Var.a(false, strB, strQ2, null, null, strQ3, false, false, aVar4, strQ4, (e23.a) objQ2, mVar2, 0, 0, 217);
                        mVar2.f();
                    } else {
                        mVar2.C(796243057);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 4:
                q42.i iVar = (q42.i) obj7;
                p1 p1Var2 = (p1) obj8;
                p1 p1Var3 = (p1) obj6;
                e23.a aVar5 = (e23.a) obj5;
                Context context = (Context) obj4;
                x3 x3Var = (x3) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    z02.d.a(((q42.f) p1Var3.getF182175a()).f142633a, z3.f.c(582113902, new oo0.f(26, aVar5, iVar), mVar3), null, null, null, z3.f.c(468383210, new na0.a(p1Var2, iVar, context, x3Var, 25), mVar3), mVar3, 196656, 28);
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar3.C(1880154531);
                        l3.a aVar6 = l3.f23124b;
                        zk0.e eVar2 = (zk0.e) x3Var.getF182175a();
                        double goalValue = eVar2 != null ? eVar2.getGoalValue() : 0.0d;
                        aVar6.getClass();
                        double dP1 = l3.a.P1(goalValue);
                        iVar.getClass();
                        k42.b.f102880a.getClass();
                        int iL = k42.b.l();
                        boolean zB3 = mVar3.B(p1Var2);
                        Object objQ3 = mVar3.q();
                        if (zB3) {
                            objQ3 = new k0(p1Var2, 21);
                            mVar3.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == m.a.f135155b) {
                                objQ3 = new k0(p1Var2, 21);
                                mVar3.K(objQ3);
                            }
                        }
                        e23.a aVar7 = (e23.a) objQ3;
                        boolean zR = mVar3.r(iVar);
                        Object objQ4 = mVar3.q();
                        if (zR) {
                            objQ4 = new q42.b(iVar, i16);
                            mVar3.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == m.a.f135155b) {
                                objQ4 = new q42.b(iVar, i16);
                                mVar3.K(objQ4);
                            }
                        }
                        u42.b.a(dP1, iL, aVar7, (l) objQ4, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(1880504335);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                q80.b bVar2 = q80.b.f143300a;
                ((q80.b) obj8).b((o53.b0) obj7, (a1) obj6, (p1.z) obj5, (l) obj4, (z3.e) obj3, (m) obj, p0.t(24577));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                qb0.g.a((String) obj8, (o90.a) obj7, (z90.b) obj6, (e23.a) obj5, (u1) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                qb0.p.a((String) obj8, (o90.a) obj7, (bd0.b0) obj6, (e23.a) obj5, (e23.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                i53.f fVar = (i53.f) obj8;
                o82.g gVar = (o82.g) obj7;
                n82.f fVar2 = (n82.f) obj6;
                Context context2 = (Context) obj5;
                qw.g gVar2 = (qw.g) obj4;
                c.q qVar2 = (c.q) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    r.a aVar8 = r.S;
                    r rVarE = u1.n.e(x2.f(aVar8, 1.0f), vb.h.e(d92.b.f58623a, mVar4), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar9 = h4.d.a.f81537o;
                    j.f22691a.getClass();
                    z zVarA2 = y.a(j.f22694d, aVar9, mVar4, 48);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    r rVarC2 = k.c(rVarE, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar10);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                    b0 b0Var3 = b0.f22601a;
                    g6.f.a aVar11 = g6.f.f75994b;
                    c2.l.f(c2.l.C(aVar8, 0.0f, 16, 0.0f, 0.0f, 13), mVar4);
                    Object objQ5 = mVar4.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ5 == c2565a) {
                        objQ5 = new yd1.a(context2);
                        mVar4.K(objQ5);
                    }
                    yd1.a aVar12 = (yd1.a) objQ5;
                    i53.c cVarE = i53.a.e(o2.b(fVar, mVar4));
                    int iIndexOf = fVar.indexOf(gVar);
                    boolean zB4 = mVar4.B(fVar2);
                    Object objQ6 = mVar4.q();
                    if (zB4 || objQ6 == c2565a) {
                        objQ6 = new f0(fVar2, fVar, 13);
                        mVar4.K(objQ6);
                    }
                    t82.c.a(cVarE, null, iIndexOf, 0.0f, (l) objQ6, mVar4, 3072, 18);
                    q82.a.a(x2.f(aVar8, 1.0f), new n82.n(fVar2, aVar12), null, mVar4, 6, 4);
                    n82.c.a(b0Var3.a(aVar8, 1.0f, true), fVar2, 3, false, z3.f.c(-1219687329, new qw.b(gVar2, fVar2, context2, qVar2, 0), mVar4), mVar4, 24960, 8);
                    mVar4.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 9:
                bx.b bVar4 = (bx.b) obj8;
                t tVar = (t) obj7;
                Interval interval = (Interval) obj6;
                ix.j jVar = (ix.j) obj5;
                DateTimeZone dateTimeZone = (DateTimeZone) obj4;
                x3 x3Var2 = (x3) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    List<bx.g> listH = bVar4.h();
                    ArrayList arrayList2 = new ArrayList(p13.y.r(listH, 10));
                    for (bx.g gVar3 : listH) {
                        DateTime dateTime = new DateTime(gVar3.f21637a, dateTimeZone);
                        gs1.e.d.c cVar = gs1.e.d.f78738b;
                        String str = gVar3.f21638b;
                        cVar.getClass();
                        arrayList2.add(new gs1.e.a(dateTime, gs1.e.d.c.a(str), gVar3.f21639c, gVar3.f21640d));
                    }
                    List<bx.j> listJ = bVar4.j();
                    ArrayList arrayList3 = new ArrayList(p13.y.r(listJ, 10));
                    for (bx.j jVar2 : listJ) {
                        arrayList3.add(new gs1.e.C1588e(new DateTime(jVar2.f21645a, dateTimeZone), jVar2.f21646b));
                    }
                    jx.a aVar13 = new jx.a(tVar, interval.getStart(), arrayList2);
                    gt.a aVar14 = new gt.a(tVar, interval.getStart(), arrayList3);
                    boolean zA = jx.b.a(aVar13);
                    boolean zA2 = gt.b.a(aVar14);
                    boolean z14 = gt.b.b(aVar14) || gt.b.c(aVar14);
                    jVar.getClass();
                    ArrayList<jx.c> arrayListY4 = ix.j.y4(zA, z14, zA2);
                    List<jx.c> list = ((ix.l) x3Var2.getF182175a()).f95669i;
                    mVar5.C(1232786118);
                    ArrayList arrayList4 = new ArrayList(p13.y.r(arrayListY4, 10));
                    for (jx.c cVar2 : arrayListY4) {
                        arrayList4.add(new j0(gl1.y.Q(mVar5, cVar2.f101393b), null, null, false, list.contains(cVar2), 14, null));
                    }
                    mVar5.f();
                    m92.o.a(u1.n.e(r.S, vb.h.e(d92.b.f58623a, mVar5), m1.f128891a), gl1.y.Q(mVar5, R.string.body_battery_impact), null, null, z3.f.c(-1512918126, new na0.a(aVar13, aVar14, jVar, interval, 29), mVar5), z3.f.c(-280786831, new ox.b(i53.a.e(arrayList4), jVar, arrayListY4, i16), mVar5), null, mVar5, 221184, 76);
                    x1 x1Var6 = n.f135158a;
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                e23.a aVar15 = (e23.a) obj8;
                String str2 = (String) obj7;
                Long l14 = (Long) obj6;
                Long l15 = (Long) obj5;
                e23.a aVar16 = (e23.a) obj4;
                l lVar5 = (l) obj3;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    c22.x0.f23314a.getClass();
                    String strW = gl1.d.W(c22.x0.f23377da);
                    boolean zB5 = mVar6.B(aVar15);
                    Object objQ7 = mVar6.q();
                    if (zB5) {
                        objQ7 = new qk0.o(aVar15, 2);
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new qk0.o(aVar15, 2);
                            mVar6.K(objQ7);
                        }
                    }
                    e23.a aVar17 = (e23.a) objQ7;
                    i53.f fVarA = i53.a.a(new i3("MENU_ITEM_SAVE", gl1.y.Q(mVar6, R.string.lbl_save), (!g22.n.d(str2) || l14 == null || l15 == null) ? false : true, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB6 = mVar6.B(aVar16);
                    Object objQ8 = mVar6.q();
                    if (zB6) {
                        objQ8 = new g1(4, aVar16, lVar5);
                        mVar6.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new g1(4, aVar16, lVar5);
                            mVar6.K(objQ8);
                        }
                    }
                    z02.f.d(strW, null, null, aVar17, fVarA, null, (l) objQ8, mVar6, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                r60.d.a((LocalDate) obj8, (LocalDate) obj7, (o82.g) obj6, (n60.b) obj5, (e23.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                r82.g.a((r) obj8, (List) obj7, (Calendar) obj6, (l) obj5, (Calendar) obj4, (Calendar) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                rb0.h.b((String) obj8, (String) obj7, (String) obj6, (u1) obj5, (l) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                rr0.m.a((String) obj8, (r) obj7, (String) obj6, (Integer) obj5, (l) obj4, (l) obj3, (m) obj, p0.t(224257));
                return Unit.INSTANCE;
            case 15:
                BaseLineChart baseLineChart = (BaseLineChart) obj8;
                pr0.f fVar3 = (pr0.f) obj7;
                Context context3 = (Context) obj6;
                o13.p pVar2 = (o13.p) obj5;
                ArrayList arrayList5 = (ArrayList) obj4;
                hz.a aVar18 = (hz.a) obj3;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    g6.f.a aVar19 = g6.f.f75994b;
                    r rVarH = x2.h(c2.l.C(rVarF, eVar3.f97920e, 0.0f, eVar3.f97918c, 0.0f, 10), 290);
                    boolean zR2 = mVar7.r(baseLineChart);
                    Object objQ9 = mVar7.q();
                    if (zR2) {
                        objQ9 = new rr0.o(baseLineChart, 0);
                        mVar7.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new rr0.o(baseLineChart, 0);
                            mVar7.K(objQ9);
                        }
                    }
                    l lVar6 = (l) objQ9;
                    boolean zR3 = mVar7.r(fVar3) | mVar7.r(baseLineChart) | mVar7.r(context3) | mVar7.B(pVar2) | mVar7.r(arrayList5) | mVar7.r(aVar18);
                    Object objQ10 = mVar7.q();
                    if (zR3) {
                        aa2.p pVar3 = new aa2.p(fVar3, baseLineChart, context3, pVar2, arrayList5, aVar18, 24);
                        mVar7.K(pVar3);
                        objQ10 = pVar3;
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            aa2.p pVar4 = new aa2.p(fVar3, baseLineChart, context3, pVar2, arrayList5, aVar18, 24);
                            mVar7.K(pVar4);
                            objQ10 = pVar4;
                        }
                    }
                    p002j6.c.b(lVar6, rVarH, (l) objQ10, mVar7, 0, 0);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 16:
                return a(obj, obj2);
            case 17:
                e23.a aVar20 = (e23.a) obj7;
                p1 p1Var4 = (p1) obj8;
                p1 p1Var5 = (p1) obj6;
                p1 p1Var6 = (p1) obj5;
                l lVar7 = (l) obj4;
                j70.r rVar = (j70.r) obj3;
                m mVar8 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    int i18 = r1.e.f157791a[((g3) p1Var4.getF182175a()).f35300a.ordinal()];
                    if (i18 == 1) {
                        mVar8.C(310511331);
                        r.a aVar21 = r.S;
                        r rVarB2 = a2.b(x2.d(aVar21, 1.0f), a2.a(mVar8), true);
                        j.f22691a.getClass();
                        j.k kVar2 = j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA3 = y.a(kVar2, h4.d.a.f81536n, mVar8, 0);
                        int iHashCode3 = Long.hashCode(mVar8.getU());
                        i2 i2VarX3 = mVar8.x();
                        r rVarC3 = k.c(rVarB2, mVar8);
                        h5.g.V.getClass();
                        e0.a aVar22 = h5.g.a.f81805b;
                        if (mVar8.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar8.z();
                        if (mVar8.getT()) {
                            mVar8.M(aVar22);
                        } else {
                            mVar8.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA3, mVar8);
                        b4.c(h5.g.a.f81809f, i2VarX3, mVar8);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar8, iHashCode3, bVar5);
                        }
                        b4.c(h5.g.a.f81807d, rVarC3, mVar8);
                        b0 b0Var4 = b0.f22601a;
                        String strQ5 = gl1.y.Q(mVar8, R.string.msg_preset_options_reset);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97931h, mVar8);
                        d92.b.f58625c.getClass();
                        mh.c(strQ5, c2.l.y(aVar21, j92.b.f97899b.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 131068);
                        d0 d0Var = (d0) ((g3) p1Var4.getF182175a()).f35301b;
                        if (d0Var != null && (listN0 = h0.N0(j70.z.c(d0Var.f129950b), new r1.d())) != null) {
                            arrayList = new ArrayList();
                            for (Object obj9 : listN0) {
                                if (((j70.r) ((o13.p) obj9).f128594a).f97640e) {
                                    arrayList.add(obj9);
                                }
                            }
                        }
                        if (arrayList == null) {
                            mVar8.C(1892873836);
                            mVar8.f();
                        } else {
                            mVar8.C(1892873837);
                            for (o13.p pVar5 : arrayList) {
                                j70.r rVar2 = (j70.r) pVar5.f128594a;
                                Boolean bool = (Boolean) pVar5.f128595b;
                                r.a aVar23 = r.S;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                j92.e eVar4 = j92.b.f97899b;
                                r rVarC4 = c2.l.C(c2.l.A(aVar23, eVar4.f97920e, 0.0f, i15), 0.0f, 0.0f, 0.0f, eVar4.f97918c, 7);
                                int i19 = rVar2.f97637b;
                                int i24 = rVar2.f97638c;
                                String strQ6 = gl1.y.Q(mVar8, i19);
                                if (i24 != 0) {
                                    strH = sn.a.h(mVar8, -1641549261, i24, mVar8);
                                } else {
                                    mVar8.C(651629720);
                                    mVar8.f();
                                    strH = "";
                                }
                                z3.e eVarC = z3.f.c(-1913613466, new s5.a(rVar2, 6), mVar8);
                                z3.e eVarC2 = z3.f.c(1733170727, new rk0.a1(11, rVar2, rVar), mVar8);
                                boolean zK = mVar8.k(rVar2.ordinal()) | mVar8.B(bool) | mVar8.B(p1Var5) | mVar8.B(p1Var6) | mVar8.B(lVar7);
                                Object objQ11 = mVar8.q();
                                if (zK) {
                                    objQ11 = new p50.d(bool, rVar2, lVar7, p1Var5, p1Var6, 7);
                                    mVar8.K(objQ11);
                                } else {
                                    aVar.getClass();
                                    if (objQ11 == m.a.f135155b) {
                                        objQ11 = new p50.d(bool, rVar2, lVar7, p1Var5, p1Var6, 7);
                                        mVar8.K(objQ11);
                                    }
                                }
                                b1.a(strQ6, strH, rVarC4, false, eVarC, eVarC2, (e23.a) objQ11, mVar8, 1769472);
                                i15 = 2;
                            }
                            mVar8.f();
                        }
                        mVar8.y();
                        mVar8.f();
                    } else if (i18 == 2) {
                        mVar8.C(564331319);
                        Unit unit = Unit.INSTANCE;
                        boolean zB7 = mVar8.B(aVar20);
                        Object objQ12 = mVar8.q();
                        if (zB7) {
                            objQ12 = new r1.c(aVar20, null);
                            mVar8.K(objQ12);
                        } else {
                            aVar.getClass();
                            if (objQ12 == m.a.f135155b) {
                                objQ12 = new r1.c(aVar20, null);
                                mVar8.K(objQ12);
                            }
                        }
                        p3.l0.e((p) objQ12, unit, mVar8);
                        mVar8.f();
                    } else {
                        if (i18 != 3) {
                            throw n23.j.m(mVar8, 564204137);
                        }
                        mVar8.C(314473813);
                        mVar8.f();
                    }
                    x1 x1Var10 = n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                sg0.h.b((ve2.e) obj8, (String) obj7, (e23.a) obj5, (e23.q) obj6, (l) obj4, (e23.a) obj3, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                sg2.b.a((r) obj8, (yg2.o) obj7, (yg2.h0) obj6, (Map) obj5, (fg2.c) obj4, (e23.a) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                sg2.b.b((r) obj8, (LottieComposition) obj7, (e23.a) obj6, (yg2.h0) obj5, (String) obj4, (s5.c) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                sg2.o.a((r) obj8, (lt2.a) obj7, (ah2.e) obj6, (String) obj5, (ag2.c.a) obj4, (String) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 22:
                si1.k kVar3 = (si1.k) obj8;
                fe feVar = (fe) obj7;
                e23.a aVar24 = (e23.a) obj6;
                e23.a aVar25 = (e23.a) obj5;
                e23.a aVar26 = (e23.a) obj4;
                e23.a aVar27 = (e23.a) obj3;
                m mVar9 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    if (kVar3.f159398e != null) {
                        mVar9.C(-963103270);
                        si1.q.e(kVar3.f159398e, kVar3.f159396c, kVar3.f159399f, kVar3.f159400g, kVar3.f159401h, kVar3.f159403j, kVar3.f159402i, kVar3.f159404k, feVar, aVar24, aVar25, aVar26, mVar9, 100663296);
                        mVar9.f();
                    } else {
                        mVar9.C(-962273369);
                        Boolean boolValueOf = Boolean.valueOf(kVar3.f159395b);
                        boolean zR4 = mVar9.r(kVar3) | mVar9.B(aVar27);
                        Object objQ13 = mVar9.q();
                        if (zR4) {
                            objQ13 = new si1.p(kVar3, aVar27, null);
                            mVar9.K(objQ13);
                        } else {
                            aVar.getClass();
                            if (objQ13 == m.a.f135155b) {
                                objQ13 = new si1.p(kVar3, aVar27, null);
                                mVar9.K(objQ13);
                            }
                        }
                        p3.l0.e((p) objQ13, boolValueOf, mVar9);
                        mVar9.f();
                    }
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                si1.q.c((si1.k) obj8, (r53.i) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                return b(obj, obj2);
            case 25:
                ((Integer) obj2).getClass();
                i0.a((u21.m) obj8, (fe) obj7, (p) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 26:
                return c(obj, obj2);
            case 27:
                return d(obj, obj2);
            case 28:
                return e(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                t91.c.b((mc) obj8, (i53.c) obj7, (r) obj6, (q91.b) obj5, (e23.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14, int i15) {
        this.f134367a = i15;
        this.f134368b = obj;
        this.f134369c = obj2;
        this.f134370d = obj3;
        this.f134371e = obj4;
        this.f134372f = obj5;
        this.f134373g = obj6;
    }

    public /* synthetic */ b(Object obj, p1 p1Var, p1 p1Var2, Object obj2, Object obj3, Object obj4, int i14) {
        this.f134367a = i14;
        this.f134369c = obj;
        this.f134368b = p1Var;
        this.f134370d = p1Var2;
        this.f134371e = obj2;
        this.f134372f = obj3;
        this.f134373g = obj4;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i14) {
        this.f134367a = i14;
        this.f134368b = obj;
        this.f134369c = obj2;
        this.f134370d = obj3;
        this.f134371e = obj4;
        this.f134372f = obj5;
        this.f134373g = obj6;
    }

    public /* synthetic */ b(sy0.i iVar, sy0.i iVar2, sy0.i iVar3, i53.c cVar, e23.a aVar, e23.q qVar, int i14) {
        this.f134367a = 2;
        this.f134368b = iVar;
        this.f134369c = iVar2;
        this.f134371e = iVar3;
        this.f134372f = cVar;
        this.f134373g = aVar;
        this.f134370d = qVar;
    }

    public /* synthetic */ b(ve2.e eVar, String str, e23.a aVar, e23.q qVar, l lVar, e23.a aVar2, int i14) {
        this.f134367a = 18;
        this.f134368b = eVar;
        this.f134369c = str;
        this.f134371e = aVar;
        this.f134370d = qVar;
        this.f134372f = lVar;
        this.f134373g = aVar2;
    }
}
