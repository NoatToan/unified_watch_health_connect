package p40;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class l0 {
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
    public static final void a(e23.a<Unit> aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        h5.e0.a aVar3;
        h5.g.a.b bVar;
        int i16;
        p1 p1Var;
        e23.a<Unit> aVar4 = aVar;
        p3.o0 o0VarP = fb1.c.p(aVar4, aVar2, mVar, 59502424);
        p3.c<?> cVar = o0VarP.f135177b;
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarP.r(aVar4) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarP.r(aVar2) ? 32 : 16;
        }
        int i17 = i15;
        if (o0VarP.n(i17 & 1, (i17 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            Object obj = p3.m.a.f135155b;
            if (objQ == obj) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarP.K(objQ);
            }
            p1 p1Var2 = (p1) objQ;
            h4.r.a aVar5 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar2.getClass();
            h4.r rVarF = x2.f(c2.l.z(aVar5, eVar.f97921f, f14), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.b bVar3 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22698h, bVar3, o0VarP, 54);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(rVarF, o0VarP);
            h5.g.V.getClass();
            h5.e0.a aVar6 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar6);
            } else {
                o0VarP.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarP);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarP);
            h5.g.a.b bVar4 = h5.g.a.f81813j;
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar4);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarP);
            u2 u2Var = u2.f22900a;
            h4.g.a aVar7 = h4.d.a.f81536n;
            c2.j.k kVar = c2.j.f22694d;
            c2.z zVarA = c2.y.a(kVar, aVar7, o0VarP, 48);
            int iHashCode2 = Long.hashCode(o0VarP.U);
            i2 i2VarA1 = o0VarP.a0();
            h4.r rVarC2 = h4.k.c(aVar5, o0VarP);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar6);
            } else {
                o0VarP.c();
            }
            b4.c(eVar2, zVarA, o0VarP);
            b4.c(c1623g, i2VarA1, o0VarP);
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarP, iHashCode2, bVar4);
            }
            b4.c(fVar, rVarC2, o0VarP);
            c2.b0 b0Var = c2.b0.f22601a;
            String strQ = gl1.y.Q(o0VarP, R.string.lbl_cancel);
            j92.f fVar2 = d92.b.f58624b;
            fVar2.getClass();
            x0 x0Var = j92.f.f97936m;
            long jE = hb.a.e(o0VarP);
            Object objQ2 = o0VarP.q();
            if (objQ2 == obj) {
                objQ2 = new om0.h(p1Var2, 29);
                o0VarP.K(objQ2);
            }
            mh.c(strQ, u1.w.d(aVar5, false, null, null, (e23.a) objQ2, 15), jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarP, 0, 0, 131064);
            o0VarP.g0(true);
            c2.z zVarA2 = c2.y.a(kVar, h4.d.a.f81537o, o0VarP, 48);
            int iHashCode3 = Long.hashCode(o0VarP.U);
            i2 i2VarA2 = o0VarP.a0();
            h4.r rVarC3 = h4.k.c(aVar5, o0VarP);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                aVar3 = aVar6;
                o0VarP.M(aVar3);
            } else {
                aVar3 = aVar6;
                o0VarP.c();
            }
            b4.c(eVar2, zVarA2, o0VarP);
            b4.c(c1623g, i2VarA2, o0VarP);
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode3))) {
                bVar = bVar4;
                v.h.A(iHashCode3, o0VarP, iHashCode3, bVar);
            } else {
                bVar = bVar4;
            }
            b4.c(fVar, rVarC3, o0VarP);
            String strQ2 = gl1.y.Q(o0VarP, R.string.lbl_edit_course_point);
            fVar2.getClass();
            long jB = d92.b.a(o0VarP).k().b();
            w5.f0.f182097b.getClass();
            h5.g.a.b bVar5 = bVar;
            h5.e0.a aVar8 = aVar3;
            mh.c(strQ2, null, jB, null, 0L, w5.f0.f182104i, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarP, 1572864, 0, 131002);
            o0VarP.g0(true);
            c2.z zVarA3 = c2.y.a(kVar, h4.d.a.f81538p, o0VarP, 48);
            int iHashCode4 = Long.hashCode(o0VarP.U);
            i2 i2VarA3 = o0VarP.a0();
            h4.r rVarC4 = h4.k.c(aVar5, o0VarP);
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar8);
            } else {
                o0VarP.c();
            }
            b4.c(eVar2, zVarA3, o0VarP);
            b4.c(c1623g, i2VarA3, o0VarP);
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode4))) {
                v.h.A(iHashCode4, o0VarP, iHashCode4, bVar5);
            }
            b4.c(fVar, rVarC4, o0VarP);
            String strQ3 = gl1.y.Q(o0VarP, R.string.common_button_done);
            fVar2.getClass();
            long jA = d92.b.a(o0VarP).k().a();
            boolean z14 = (i17 & 112) == 32;
            Object objQ3 = o0VarP.q();
            if (z14 || objQ3 == obj) {
                objQ3 = new ov1.o(aVar2, 21);
                o0VarP.K(objQ3);
            }
            mh.c(strQ3, u1.w.d(aVar5, false, null, null, (e23.a) objQ3, 15), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarP, 0, 0, 131064);
            p3.o0 o0Var2 = o0VarP;
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var2.C(-195515943);
                g82.c cVar2 = g82.c.f76436a;
                String strQ4 = gl1.y.Q(o0Var2, R.string.lbl_course_point);
                String strQ5 = gl1.y.Q(o0Var2, R.string.lbl_yes);
                String strQ6 = gl1.y.Q(o0Var2, R.string.lbl_cancel);
                g.f135661a.getClass();
                e23.p<? super p3.m, ? super Integer, Unit> pVar = g.f135662b;
                boolean z15 = (i17 & 14) == 4;
                Object objQ4 = o0Var2.q();
                if (z15 || objQ4 == obj) {
                    i16 = 0;
                    aVar4 = aVar;
                    p1Var = p1Var2;
                    objQ4 = new j0(aVar4, p1Var, 0);
                    o0Var2.K(objQ4);
                } else {
                    i16 = 0;
                    aVar4 = aVar;
                    p1Var = p1Var2;
                }
                e23.a<Unit> aVar9 = (e23.a) objQ4;
                Object objQ5 = o0Var2.q();
                if (objQ5 == obj) {
                    objQ5 = new k0(p1Var, i16);
                    o0Var2.K(objQ5);
                }
                e23.a<Unit> aVar10 = (e23.a) objQ5;
                Object objQ6 = o0Var2.q();
                if (objQ6 == obj) {
                    objQ6 = new k0(p1Var, 1);
                    o0Var2.K(objQ6);
                }
                cVar2.b(null, strQ4, pVar, strQ5, aVar9, strQ6, aVar10, false, (e23.a) objQ6, o0Var2, 102236544, 129);
                o0Var2.g0(i16);
            } else {
                aVar4 = aVar;
                o0Var2.C(-194484356);
                o0Var2.g0(false);
            }
            o0Var2.g0(true);
            o0Var2.g0(true);
            o0Var = o0Var2;
        } else {
            o0VarP.e();
            o0Var = o0VarP;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new com.google.maps.android.compose.l(aVar4, aVar2, i14, 8, (byte) 0);
        }
    }
}
