package n72;

import c2.x2;
import i3.d7;
import i3.p6;
import i3.t6;
import p005kotlin.Unit;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import s1.a2;
import s1.d2;
import s1.e2;
import s1.t1;
import s1.w1;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
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
    public static final void a(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        h4.r rVar2;
        Object objA;
        f4.f fVarA;
        e23.l<Object, Unit> f68799i;
        f4.f fVarB;
        aVar.getClass();
        o0 o0VarE = mVar.E(1617305991);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16) | (o0VarE.B(rVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            t1 t1VarE = w1.e(z14 ? s.VISIBLE : s.GONE, "jump transition", o0VarE, 48, 0);
            a2<S> a2Var = t1VarE.f155744a;
            l lVar = l.f124901a;
            g6.f.a aVar2 = g6.f.f75994b;
            d2 d2Var = e2.f155570c;
            boolean zI = t1VarE.i();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zI) {
                o0VarE.C(1666853325);
                o0VarE.g0(false);
                objA = a2Var.a();
            } else {
                o0VarE.C(1666599280);
                boolean zB = o0VarE.B(t1VarE);
                objA = o0VarE.q();
                if (zB) {
                    f4.f.f68735e.getClass();
                    fVarA = f4.f.a.a();
                    if (fVarA != null) {
                        f68799i = fVarA.getF68799i();
                    } else {
                        f68799i = null;
                    }
                    fVarB = f4.f.a.b(fVarA);
                    Object objA2 = a2Var.a();
                    f4.f.a.e(fVarA, fVarB, f68799i);
                    o0VarE.K(objA2);
                    objA = objA2;
                } else {
                    aVar3.getClass();
                    if (objA == p3.m.a.f135155b) {
                        f4.f.f68735e.getClass();
                        fVarA = f4.f.a.a();
                        if (fVarA != null) {
                            f68799i = fVarA.getF68799i();
                        } else {
                            f68799i = null;
                        }
                        fVarB = f4.f.a.b(fVarA);
                        try {
                            Object objA3 = a2Var.a();
                            f4.f.a.e(fVarA, fVarB, f68799i);
                            o0VarE.K(objA3);
                            objA = objA3;
                        } catch (Throwable th3) {
                            f4.f.a.e(fVarA, fVarB, f68799i);
                            throw th3;
                        }
                    }
                }
                o0VarE.g0(false);
            }
            s sVar = (s) objA;
            o0VarE.C(609012685);
            s sVar2 = s.GONE;
            float f14 = sVar == sVar2 ? -28 : 28;
            o0VarE.g0(false);
            g6.f fVarA2 = g6.f.a(f14);
            boolean zB2 = o0VarE.B(t1VarE);
            Object objQ = o0VarE.q();
            if (zB2) {
                objQ = p0.f(new m(t1VarE));
                o0VarE.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.f(new m(t1VarE));
                    o0VarE.K(objQ);
                }
            }
            s sVar3 = (s) ((x3) objQ).getF182175a();
            o0VarE.C(609012685);
            float f15 = sVar3 == sVar2 ? -28 : 28;
            o0VarE.g0(false);
            g6.f fVarA3 = g6.f.a(f15);
            boolean zB3 = o0VarE.B(t1VarE);
            Object objQ2 = o0VarE.q();
            if (zB3) {
                objQ2 = p0.f(new n(t1VarE));
                o0VarE.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = p0.f(new n(t1VarE));
                    o0VarE.K(objQ2);
                }
            }
            t1.d dVarC = w1.c(t1VarE, fVarA2, fVarA3, lVar.invoke(((x3) objQ2).getF182175a(), o0VarE, 0), d2Var, "bottom offset", o0VarE, 196608);
            float f16 = 0;
            if (g6.f.b(((g6.f) dVarC.f155775j.getF182175a()).f75997a, f16) > 0) {
                o0VarE.C(220194816);
                p6.f89278a.getClass();
                t6 t6VarA = p6.a(4, 8, 12);
                d92.b.f58623a.getClass();
                long jA = d92.b.a(o0VarE).f().a();
                h4.r rVarU = c2.l.u(c2.l.s(x2.q(c2.l.C(rVar, 0.0f, 0.0f, 10, 0.0f, 11), 48)), f16, -((g6.f) dVarC.f155775j.getF182175a()).f75997a);
                f.f124886a.getClass();
                int i16 = ((i15 >> 3) & 14) | 12582912;
                rVar2 = rVar;
                d7.b(aVar, rVarU, null, jA, 0L, t6VarA, f.f124887b, o0VarE, i16, 84);
                o0VarE.g0(false);
            } else {
                rVar2 = rVar;
                o0VarE.C(220903259);
                o0VarE.g0(false);
            }
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(z14, aVar, rVar2, i14);
        }
    }
}
