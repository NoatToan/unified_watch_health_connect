package cp1;

import c2.a0;
import c2.b0;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.x0;
import c42.c0;
import ca0.v0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mc;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.w;
import o4.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.d9;

/* JADX INFO: loaded from: classes10.dex */
public final class e {
    public static final void a(j jVar, r rVar, m mVar, int i14) {
        j jVar2 = jVar;
        o0 o0VarE = mVar.E(309809379);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(jVar2) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            r rVarThen = x2.f(aVar, 1.0f).then(rVar);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarThen, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            String str = jVar2.f54914c;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            jf.r.a(str, null, x2.q(aVar, j92.b.f97901d.f97906e), null, null, null, null, o0VarE, 48, 2040);
            g6.f.a aVar3 = g6.f.f75994b;
            r rVarC2 = l.C(aVar, 12, 0.0f, 0.0f, 0.0f, 14);
            z zVarA = y.a(c2.j.i(6), h4.d.a.f81536n, o0VarE, 6);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = k.c(rVarC2, o0VarE);
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
            b4.c(eVar, zVarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var = b0.f22601a;
            jVar2 = jVar;
            String str2 = jVar2.f54912a;
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97932i), o0VarE), o0VarE, 0, 0, 131070);
            String str3 = jVar2.f54913b;
            fVar2.getClass();
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c0(jVar2, rVar, i14, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c0  */
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
    public static final void b(a0 a0Var, i53.c<j> cVar, m mVar, int i14) {
        Object obj;
        o0 o0VarE = mVar.E(1088246867);
        int i15 = (o0VarE.B(cVar) ? 32 : 16) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 17) != 16)) {
            x1 x1Var = n.f135158a;
            d0.f128823b.getClass();
            d0 d0VarA = d0.a(d0.f128831j);
            d92.b.f58623a.getClass();
            List listK = x.k(d0VarA, d0.a(d92.b.a(o0VarE).c().c()));
            b82.s sVar = b82.s.f16758a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Sc);
            String strW2 = gl1.d.W(x0.Rc);
            s62.a.f157643a.getClass();
            sVar.c(new b82.s.b(strW, strW2, f72.x1.a(t62.c.f162799a), null, null, 24, null), true, o0VarE, 48);
            String strW3 = gl1.d.W(x0.Qc);
            String strW4 = gl1.d.W(x0.Pc);
            t62.b.f162798a.getClass();
            sVar.c(new b82.s.b(strW3, strW4, e72.a.a(d9.f175854a), null, false ? 1 : 0, 24, null), false, o0VarE, 48);
            r rVarF = x2.f(r.S, 1.0f);
            boolean zB = o0VarE.B(listK);
            Object objQ = o0VarE.q();
            if (zB) {
                obj = objQ;
                aq1.d0 d0Var = new aq1.d0(listK, 2);
                o0VarE.K(d0Var);
                obj = d0Var;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    obj = objQ;
                    aq1.d0 d0Var2 = new aq1.d0(listK, 2);
                    o0VarE.K(d0Var2);
                    obj = d0Var2;
                }
            }
            obj = objQ;
            r rVarE = l4.k.e(rVarF, (e23.l) obj);
            float f14 = 48;
            g6.f.a aVar = g6.f.f75994b;
            r rVarC = l.C(rVarE, f14, 0.0f, 0.0f, 0.0f, 14);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(1072757143);
            Iterator<j> it = cVar.iterator();
            while (it.hasNext()) {
                a(it.next(), l.C(r.S, 0.0f, 16, 0.0f, 0.0f, 13), o0VarE, 48);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            c(l.C(r.S, f14, 24, 0.0f, 0.0f, 12), o0VarE, 0);
            x1 x1Var2 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(a0Var, cVar, i14);
        }
    }

    public static final void c(r rVar, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-2026271920);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Tc);
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strW, x2.f(r.S, 1.0f).then(rVar), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.y(rVar, i14, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    public static final void d(i53.c<j> cVar, mc mcVar, e23.a<Unit> aVar, m mVar, int i14) {
        cVar.getClass();
        mcVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-352908765);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(mcVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            w wVar = w.f111301a;
            a.f54895a.getClass();
            z3.e eVar = a.f54896b;
            boolean z14 = (i15 & 896) == 256;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new v0(aVar, 16);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new v0(aVar, 16);
                    o0VarE.K(objQ);
                }
            }
            wVar.c(eVar, null, (e23.a) objQ, mcVar, null, null, z3.f.c(-377027995, new aa2.f(22, aVar, cVar), o0VarE), o0VarE, ((i15 << 6) & 7168) | 1572870, 50);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c50.f(cVar, mcVar, aVar, i14, 10);
        }
    }

    public static final void e(m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(670320537);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = n.f135158a;
            c2.j jVar = c2.j.f22691a;
            g6.f.a aVar = g6.f.f75994b;
            jVar.getClass();
            c2.j.i iVarI = c2.j.i(12);
            r.a aVar2 = r.S;
            h4.d.f81522a.getClass();
            z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Uc);
            Locale locale = Locale.ROOT;
            String upperCase = strW.toUpperCase(locale);
            upperCase.getClass();
            d92.b.f58623a.getClass();
            j92.f fVar = d92.b.f58624b;
            fVar.getClass();
            mh.c(upperCase, x2.f(aVar2, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97934k, o0VarE), o0VarE, 48, 0, 131068);
            String upperCase2 = gl1.d.W(x0.Vc).toUpperCase(locale);
            upperCase2.getClass();
            fVar.getClass();
            mh.c(upperCase2, x2.f(aVar2, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97927d), o0VarE), o0VarE, 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.garmin.android.apps.connectmobile.workouts.data.model.e0(i14, 5);
        }
    }
}
