package xv0;

import b82.p;
import c2.b0;
import c2.j;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import d92.b;
import e23.l;
import ew1.v1;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.gf;
import i3.mh;
import i53.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l72.p2;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.x;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import pv0.w;
import s5.x0;
import u1.a2;
import v.h;
import w2.a0;
import z3.e;
import z3.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(String str, String str2, c<? extends w> cVar, boolean z14, boolean z15, l<? super Boolean, Unit> lVar, m mVar, int i14, int i15) {
        boolean z16;
        int i16;
        o0 o0Var;
        List listK;
        str.getClass();
        str2.getClass();
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-411550785);
        int i17 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(cVar) ? 256 : 128) | (o0VarE.h(z14) ? 2048 : 1024);
        int i18 = i15 & 16;
        if (i18 != 0) {
            i16 = i17 | 24576;
            z16 = z15;
        } else {
            z16 = z15;
            i16 = i17 | (o0VarE.h(z16) ? 16384 : 8192);
        }
        int i19 = i16 | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i19 & 1, (74899 & i19) != 74898)) {
            boolean z17 = i18 != 0 ? true : z16;
            x1 x1Var = n.f135158a;
            boolean z18 = (i19 & 7168) == 2048;
            Object objQ = o0VarE.q();
            m.a aVar = m.f135153a;
            if (z18) {
                objQ = hb.a.n(z14, o0VarE);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = hb.a.n(z14, o0VarE);
                }
            }
            p1 p1Var = (p1) objQ;
            if (cVar.isEmpty()) {
                w.f141433b.getClass();
                listK = x.k(w.LIGHT_EXERCISE, w.MODERATE_EXERCISE, w.VIGOROUS_EXERCISE, w.LIGHT_EXERCISE_BEFORE_BED, w.MODERATE_EXERCISE_BEFORE_BED, w.VIGOROUS_EXERCISE_BEFORE_BED);
            } else {
                listK = cVar;
            }
            c cVarE = i53.a.e(listK);
            r.a aVar2 = r.S;
            r rVarB = a2.b(aVar2, a2.a(o0VarE), true);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarB, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            wv0.y.a(str, str2, o0VarE, i19 & 126);
            c(cVarE, o0VarE, 0);
            p2 p2Var = p2.f111205a;
            b.f58623a.getClass();
            b.f58625c.getClass();
            r rVarC2 = c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_auto_log_behaviors);
            boolean z19 = z17 && !cVar.isEmpty();
            e eVarC = f.c(-1527168192, new hn1.b(z17, p1Var, 3), o0VarE);
            boolean zB = o0VarE.B(p1Var) | ((i19 & 458752) == 131072);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new v1(lVar, p1Var, 27);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new v1(lVar, p1Var, 27);
                    o0VarE.K(objQ2);
                }
            }
            p2Var.g(strQ, rVarC2, null, null, eVarC, z19, false, (e23.a) objQ2, o0VarE, 24576, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
            o0Var = o0VarE;
            o0Var.g0(true);
            z16 = z17;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new gf(str, str2, cVar, z14, z16, lVar, i14, i15);
        }
    }

    public static final void b(String str, m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(348749090);
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            r.a aVar = r.S;
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, d.a.f81533k, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(aVar, o0VarE);
            g.V.getClass();
            e0.a aVar2 = g.a.f81805b;
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
            b4.c(g.a.f81810g, s2VarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            b.f58623a.getClass();
            j92.f fVar = b.f58624b;
            fVar.getClass();
            x0 x0Var = j92.f.f97933j;
            x0 x0VarF = d92.c.f(x0Var, o0VarE);
            b.f58625c.getClass();
            mh.c("•", c2.l.A(aVar, j92.b.f97899b.f97918c, 0.0f, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 6, 0, 131068);
            fVar.getClass();
            mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, o0VarE), o0VarE, i15 & 14, 0, 131070);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vd0.b(str, i14, 16);
        }
    }

    public static final void c(c<? extends w> cVar, m mVar, int i14) {
        o0 o0VarE = mVar.E(-967770465);
        int i15 = (o0VarE.B(cVar) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(1980490454);
            ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
            for (w wVar : cVar) {
                zv0.a aVar = zv0.a.f207158a;
                l22.a aVarS = a0.s(o0VarE);
                aVar.getClass();
                arrayList.add(zv0.a.b(wVar, aVarS));
            }
            o0VarE.g0(false);
            r.a aVar2 = r.S;
            b.f58623a.getClass();
            b.f58625c.getClass();
            r rVarA = c2.l.A(aVar2, j92.b.f97899b.f97920e, 0.0f, 2);
            j.f22691a.getClass();
            j.k kVar = j.f22694d;
            d.f81522a.getClass();
            z zVarA = y.a(kVar, d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarA, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
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
            b4.c(g.a.f81810g, zVarA, o0VarE);
            b4.c(g.a.f81809f, i2VarA0, o0VarE);
            g.a.b bVar = g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            o0VarE.C(-1168494941);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b((String) it.next(), o0VarE, 0);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            x1 x1Var3 = n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(cVar, i14, 18);
        }
    }
}
