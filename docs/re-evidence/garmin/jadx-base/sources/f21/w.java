package f21;

import android.annotation.SuppressLint;
import b82.d2;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import ew1.r1;
import i3.e5;
import i3.mh;
import i3.v5;
import java.util.Arrays;
import java.util.List;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class w {
    public static final void a(t2 t2Var, String str, @SuppressLint({"ModifierParameter"}) h4.r rVar, h4.d.b bVar, int i14, int i15, p3.m mVar, int i16) {
        int i17;
        h4.r rVarA;
        h4.d.b bVar2;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        p3.o0 o0VarE = mVar.E(1273888303);
        if ((i16 & 6) == 0) {
            i17 = (o0VarE.B(t2Var) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i17 |= 128;
        }
        int i27 = i17 | 224256;
        if (o0VarE.n(i27 & 1, (74899 & i27) != 74898)) {
            o0VarE.G0();
            if ((i16 & 1) == 0 || o0VarE.o0()) {
                d2.f16532a.getClass();
                rVarA = t2Var.a(d2.h(), 1.0f, true);
                i24 = i27 & (-897);
                h4.d.f81522a.getClass();
                bVar2 = h4.d.a.f81536n;
                d6.p.f57793b.getClass();
                i25 = d6.p.f57794c;
                i26 = Integer.MAX_VALUE;
            } else {
                o0VarE.e();
                i24 = i27 & (-897);
                rVarA = rVar;
                bVar2 = bVar;
                i26 = i14;
                i25 = i15;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            int i28 = i24 >> 3;
            c2.z zVarA = c2.y.a(c2.j.f22696f, bVar2, o0VarE, ((((i28 & 896) | 48) >> 3) & 112) | 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, i25, false, i26, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, i28 & 14, ((i24 >> 9) & 896) | (i24 & 57344), 110590);
            o0VarE.g0(true);
            i19 = i25;
            i18 = i26;
        } else {
            o0VarE.e();
            rVarA = rVar;
            bVar2 = bVar;
            i18 = i14;
            i19 = i15;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u(t2Var, str, rVarA, bVar2, i18, i19, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x015e  */
    /* JADX WARN: Code duplicated, block: B:51:0x01d8  */
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
    public static final void b(List<g21.q> list, v21.e eVar, p3.m mVar, int i14) {
        eVar.getClass();
        p3.o0 o0VarE = mVar.E(1856231004);
        int i15 = (o0VarE.r(list) ? 4 : 2) | i14 | (o0VarE.r(eVar) ? 32 : 16);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarE, R.string.meal);
            int i17 = R.string.avg_daily_calories;
            String strQ2 = gl1.y.Q(o0VarE, R.string.avg_daily_calories);
            int i18 = R.string.avg_daily_percent;
            c(z3.f.c(1800176348, new a42.y(strQ, eVar, strQ2, gl1.y.Q(o0VarE, R.string.avg_daily_percent), 25), o0VarE), o0VarE, 6);
            p3.m.a aVar3 = p3.m.f135153a;
            if (list == null || list.isEmpty()) {
                o0VarE.C(1305727640);
                String strQ3 = gl1.y.Q(o0VarE, R.string.no_value);
                x0 x0Var = x0.f105818a;
                String str = String.format(gl1.y.Q(o0VarE, R.string.lbl_value_percent), Arrays.copyOf(new Object[]{strQ3}, 1));
                String strQ4 = gl1.y.Q(o0VarE, R.string.txt_empty_page_no_data);
                d2 d2Var = d2.f16532a;
                boolean zB = o0VarE.B(strQ4);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new cq.t(strQ4, 23);
                    o0VarE.K(objQ);
                } else {
                    aVar3.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cq.t(strQ4, 23);
                        o0VarE.K(objQ);
                    }
                }
                d2Var.g(1, 390, 0, p5.v.b(aVar, (e23.l) objQ), o0VarE, z3.f.c(-1291805656, new c40.i(strQ3, str, 4), o0VarE));
                o0VarE.g0(false);
            } else {
                o0VarE.C(1306319120);
                int i19 = 0;
                for (Object obj : list) {
                    int i24 = i19 + 1;
                    if (i19 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    g21.q qVar = (g21.q) obj;
                    l22.a aVarS = w2.a0.s(o0VarE);
                    qVar.getClass();
                    b11.c.a aVar4 = b11.c.f14245d;
                    String str2 = qVar.f75477a;
                    boolean z14 = qVar.f75478b;
                    aVar4.getClass();
                    String strB = b11.c.a.b(str2, aVarS, z14);
                    String strC = eVar.c(qVar.f75480d);
                    String strG = eVar.g(qVar.f75481e);
                    strC.getClass();
                    l22.a aVar5 = eVar.f175325b;
                    String strH = e5.h(e5.l(strB, ". ", eVar.N(aVar5.getString(i17)), ": ", strC), ". ", eVar.N(aVar5.getString(i18)), ": ", strG);
                    aVar5.getClass();
                    oi0.b bVar2 = new oi0.b(aVar5, strH);
                    int i25 = v21.e.f175323i;
                    bVar2.M();
                    Unit unit = Unit.INSTANCE;
                    String str3 = bVar2.f132238b;
                    d2 d2Var2 = d2.f16532a;
                    h4.r.a aVar6 = h4.r.S;
                    boolean zB2 = o0VarE.B(str3);
                    Object objQ2 = o0VarE.q();
                    if (zB2) {
                        objQ2 = new cq.t(str3, 24);
                        o0VarE.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cq.t(str3, 24);
                            o0VarE.K(objQ2);
                        }
                    }
                    d2Var2.g(i24, 384, 0, p5.v.b(aVar6, (e23.l) objQ2), o0VarE, z3.f.c(191208262, new v(strB, strC, strG, i16), o0VarE));
                    i17 = R.string.avg_daily_calories;
                    i19 = i24;
                    i18 = R.string.avg_daily_percent;
                    i16 = i16;
                }
                o0VarE.g0(i16);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r1(list, eVar, i14, 8);
        }
    }

    public static final void c(z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-1684364794);
        p3.c<?> cVar = o0VarE.f135177b;
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), am.j.c(d92.b.f58623a, o0VarE), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            eVar.invoke(u2.f22900a, o0VarE, 54);
            o0VarE.g0(true);
            g6.f.a aVar3 = g6.f.f75994b;
            v5.a(2, 48, 1, sn.a.c(o0VarE), null, o0VarE);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new aa2.o(eVar, i14, 4);
        }
    }
}
