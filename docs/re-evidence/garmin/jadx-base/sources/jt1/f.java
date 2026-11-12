package jt1;

import am.c1;
import c2.b0;
import c2.l2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import f62.q0;
import h4.r;
import h5.e0;
import jk0.w;
import l72.f0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void a(final long j8, final us1.c cVar, final boolean z14, e23.a aVar, final p pVar, e23.l lVar, p3.m mVar, int i14) {
        cVar.getClass();
        aVar.getClass();
        pVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1056890772);
        int i15 = i14 | (o0VarE.l(j8) ? 4 : 2) | (o0VarE.k(cVar.ordinal()) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(pVar) ? 16384 : 8192) | (o0VarE.r(lVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new w(17);
                o0VarE.K(objQ);
            }
            final p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new w(18);
                o0VarE.K(objQ2);
            }
            final p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            r.a aVar2 = r.S;
            long jB = tn.k.b(d92.b.f58623a, o0VarE);
            m1.a aVar3 = m1.f128891a;
            r rVarE = u1.n.e(aVar2, jB, aVar3);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
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
            r rVarE2 = u1.n.e(x2.f(aVar2, 1.0f), d92.b.a(o0VarE).c().e(), aVar3);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            float f15 = eVar.f97920e;
            r rVarY = c2.l.y(rVarE2, f14);
            z3.e eVarC = z3.f.c(336278808, new gt1.l(lVar, 2), o0VarE);
            boolean zB = ((i15 & 7168) == 2048) | o0VarE.B(p1Var2) | o0VarE.B(p1Var);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new gv0.o0(p1Var2, aVar, p1Var, 7);
                o0VarE.K(objQ3);
            }
            ht1.d.a(eVarC, null, rVarY, (e23.a) objQ3, o0VarE, 6, 2);
            r rVarA = b0Var.a(aVar2, 1.0f, false);
            bVar2.getClass();
            r rVarA2 = c2.l.A(rVarA, f15, 0.0f, 2);
            bVar2.getClass();
            c2.j.i iVarI = c2.j.i(f15);
            bVar2.getClass();
            l2 l2VarE = c2.l.e(0.0f, f15, 0.0f, 0.0f, 13);
            boolean zB2 = o0VarE.B(p1Var) | o0VarE.B(p1Var2);
            Object objQ4 = o0VarE.q();
            if (zB2 || objQ4 == c2565a) {
                objQ4 = new c1(p1Var, p1Var2, 13);
                o0VarE.K(objQ4);
            }
            boolean z15 = false;
            e2.c.b(rVarA2, null, l2VarE, iVarI, null, null, false, null, (e23.l) objQ4, o0VarE, 0, 490);
            f0 f0Var = f0.f110999a;
            String strQ = gl1.y.Q(o0VarE, R.string.common_send);
            r rVarF = x2.f(aVar2, 1.0f);
            bVar2.getClass();
            r rVarY2 = c2.l.y(rVarF, f15);
            boolean z16 = (((us1.b) p1Var.getF182175a()) == null || (((us1.b) p1Var.getF182175a()) == us1.b.OTHER && d53.w.J((CharSequence) p1Var2.getF182175a()))) ? false : true;
            boolean zB3 = ((57344 & i15) == 16384) | o0VarE.B(p1Var) | ((i15 & 112) == 32) | ((i15 & 14) == 4) | o0VarE.B(p1Var2);
            if ((i15 & 896) == 256) {
                z15 = true;
            }
            boolean z17 = zB3 | z15;
            Object objQ5 = o0VarE.q();
            if (z17 || objQ5 == c2565a) {
                e23.a aVar5 = new e23.a() { // from class: jt1.e
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.a
                    public final Object invoke() {
                        us1.b bVar3 = (us1.b) p1Var.getF182175a();
                        if (bVar3 != null) {
                            CharSequence charSequence = (CharSequence) p1Var2.getF182175a();
                            if (charSequence.length() == 0) {
                                charSequence = null;
                            }
                            pVar.invoke(cVar, new pt1.f(j8, bVar3, (String) charSequence, z14));
                        }
                        return Unit.INSTANCE;
                    }
                };
                o0VarE.K(aVar5);
                objQ5 = aVar5;
            }
            f0Var.d(0, 1, (e23.a) objQ5, rVarY2, strQ, o0VarE, null, z16);
            o0VarE = o0VarE;
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new q0(j8, cVar, z14, aVar, pVar, lVar, i14);
        }
    }
}
