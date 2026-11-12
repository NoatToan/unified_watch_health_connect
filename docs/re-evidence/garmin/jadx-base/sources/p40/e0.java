package p40;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import java.util.Iterator;
import o4.m1;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final class e0 {
    /* JADX WARN: Code duplicated, block: B:46:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
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
    public static final void a(int i14, e23.a aVar, e23.l lVar, i53.c cVar, p3.m mVar, boolean z14) {
        p3.m.a aVar2;
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(213152625);
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(h4.r.S, vb.h.f(d92.b.f58623a, o0VarE), m1.f128891a);
            d92.b.f58625c.getClass();
            h4.r rVarB = a2.b(c2.l.A(rVarE, 0.0f, j92.b.f97899b.f97917b, 1), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            o0VarE.C(1033120784);
            Iterator<E> it = cVar.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar2 = p3.m.f135153a;
                if (!zHasNext) {
                    break;
                }
                q40.a aVar4 = (q40.a) it.next();
                boolean zB = ((i15 & 896) == 256) | o0VarE.B(aVar4);
                Object objQ = o0VarE.q();
                if (zB) {
                    objQ = new oe.j(29, lVar, aVar4);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new oe.j(29, lVar, aVar4);
                        o0VarE.K(objQ);
                    }
                }
                n.a(aVar4, (e23.a) objQ, o0VarE, 0);
            }
            o0VarE.g0(false);
            if (z14) {
                o0VarE.C(1962246468);
                l72.f0 f0Var = l72.f0.f110999a;
                String strQ = gl1.y.Q(o0VarE, R.string.add_course_point);
                h4.r rVarF = x2.f(h4.r.S, 1.0f);
                d92.b.f58623a.getClass();
                j92.b bVar2 = d92.b.f58625c;
                bVar2.getClass();
                j92.e eVar = j92.b.f97899b;
                float f14 = eVar.f97920e;
                bVar2.getClass();
                g6.f.a aVar5 = g6.f.f75994b;
                h4.r rVarH = x2.h(c2.l.z(rVarF, f14, eVar.f97918c), 64);
                boolean z15 = (i15 & 7168) == 2048;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new ov1.o(aVar, 20);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new ov1.o(aVar, 20);
                        o0VarE.K(objQ2);
                    }
                }
                f0Var.i(strQ, rVarH, false, (e23.a) objQ2, o0VarE, 0, 4);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1962649127);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(cVar, z14, lVar, aVar, i14);
        }
    }
}
