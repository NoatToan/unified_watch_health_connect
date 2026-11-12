package p3;

import com.google.mlkit.common.MlKitException;
import i3.e5;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class v {
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
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
    public static final void a(n2<?> n2Var, e23.p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        c4<?> c4Var;
        boolean z14;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(-149765515);
        u0 u0Var = o0VarE.f135200y;
        x1 x1Var = n.f135158a;
        i2 i2VarA0 = o0VarE.a0();
        o0VarE.H0(201, n.f135159b);
        Object objQ = o0VarE.q();
        m.f135153a.getClass();
        if (p005kotlin.jvm.internal.s.g(objQ, m.a.f135155b)) {
            c4Var = null;
        } else {
            objQ.getClass();
            c4Var = (c4) objQ;
        }
        t<?> tVar = n2Var.f135167a;
        tVar.getClass();
        c4<?> c4VarB = tVar.b(n2Var, c4Var);
        boolean zEquals = c4VarB.equals(c4Var);
        if (!zEquals) {
            o0VarE.K(c4VarB);
        }
        if (!o0VarE.T) {
            s3.h hVar = o0VarE.H;
            Object objB = hVar.b(hVar.f156340g, hVar.f156335b);
            objB.getClass();
            i2 i2Var = (i2) objB;
            if (!(o0VarE.b() && zEquals) && (n2Var.f135174h || !i2VarA0.containsKey(tVar))) {
                i2VarA0 = i2VarA0.c0(tVar, c4VarB);
            } else if ((zEquals && !o0VarE.f135199x) || !o0VarE.f135199x) {
                i2VarA0 = i2Var;
            }
            if (o0VarE.f135201z || i2Var != i2VarA0) {
                z14 = true;
            }
            if (z14 && !o0VarE.T) {
                o0VarE.x0(i2VarA0);
            }
            u0Var.c(o0VarE.f135199x ? 1 : 0);
            o0VarE.f135199x = z14;
            o0VarE.L = i2VarA0;
            x1 x1Var2 = n.f135160c;
            r3.c.f149972b.getClass();
            o0VarE.F0(202, x1Var2, i2VarA0, 0);
            e5.r((i14 >> 3) & 14, pVar, o0VarE, false, false);
            o0VarE.f135199x = u0Var.b() != 0;
            o0VarE.L = null;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new mg2.o(n2Var, pVar, i14, 13);
            }
        }
        if (n2Var.f135174h || !i2VarA0.containsKey(tVar)) {
            i2VarA0 = i2VarA0.c0(tVar, c4VarB);
        }
        o0VarE.K = true;
        z14 = false;
        if (z14) {
            o0VarE.x0(i2VarA0);
        }
        u0Var.c(o0VarE.f135199x ? 1 : 0);
        o0VarE.f135199x = z14;
        o0VarE.L = i2VarA0;
        x1 x1Var3 = n.f135160c;
        r3.c.f149972b.getClass();
        o0VarE.F0(202, x1Var3, i2VarA0, 0);
        e5.r((i14 >> 3) & 14, pVar, o0VarE, false, false);
        o0VarE.f135199x = u0Var.b() != 0;
        o0VarE.L = null;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(n2Var, pVar, i14, 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [w3.f, z3.i$a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [w3.f, z3.i$a] */
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
    public static final void b(n2<?>[] n2VarArr, e23.p<? super m, ? super Integer, Unit> pVar, m mVar, int i14) {
        i2 i2VarBuild;
        boolean z14;
        int i15;
        p2 p2VarI0;
        o0 o0VarE = mVar.E(415205898);
        u0 u0Var = o0VarE.f135200y;
        x1 x1Var = n.f135158a;
        i2 i2VarA0 = o0VarE.a0();
        o0VarE.H0(201, n.f135159b);
        if (o0VarE.T) {
            i2 i2VarB = x.b(n2VarArr, i2VarA0, z3.j.a());
            ?? Builder = i2VarA0.builder();
            Builder.putAll(i2VarB);
            i2VarBuild = Builder.build();
            o0VarE.H0(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, n.f135161d);
            o0VarE.s0();
            o0VarE.O0(i2VarBuild);
            o0VarE.s0();
            o0VarE.O0(i2VarB);
            o0VarE.g0(false);
            o0VarE.K = true;
        } else {
            s3.h hVar = o0VarE.H;
            Object objH = hVar.h(hVar.f156340g, 0);
            objH.getClass();
            i2 i2Var = (i2) objH;
            s3.h hVar2 = o0VarE.H;
            Object objH2 = hVar2.h(hVar2.f156340g, 1);
            objH2.getClass();
            i2 i2Var2 = (i2) objH2;
            i2 i2VarB2 = x.b(n2VarArr, i2VarA0, i2Var2);
            if (!o0VarE.b() || o0VarE.f135201z || !i2Var2.equals(i2VarB2)) {
                ?? Builder2 = i2VarA0.builder();
                Builder2.putAll(i2VarB2);
                i2VarBuild = Builder2.build();
                o0VarE.H0(MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, n.f135161d);
                o0VarE.s0();
                o0VarE.O0(i2VarBuild);
                o0VarE.s0();
                o0VarE.O0(i2VarB2);
                o0VarE.g0(false);
                if (o0VarE.f135201z || !p005kotlin.jvm.internal.s.g(i2VarBuild, i2Var)) {
                    z14 = true;
                }
                if (z14 && !o0VarE.T) {
                    o0VarE.x0(i2VarBuild);
                }
                u0Var.c(o0VarE.f135199x ? 1 : 0);
                o0VarE.f135199x = z14;
                o0VarE.L = i2VarBuild;
                Object obj = n.f135160c;
                r3.c.f149972b.getClass();
                o0VarE.F0(202, obj, i2VarBuild, 0);
                i15 = 14;
                e5.r((i14 >> 3) & 14, pVar, o0VarE, false, false);
                o0VarE.f135199x = u0Var.b() != 0;
                o0VarE.L = null;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new mg2.o(n2VarArr, pVar, i14, i15);
                }
            }
            o0VarE.f135188m = o0VarE.H.s() + o0VarE.f135188m;
            i2VarBuild = i2Var;
        }
        z14 = false;
        if (z14) {
            o0VarE.x0(i2VarBuild);
        }
        u0Var.c(o0VarE.f135199x ? 1 : 0);
        o0VarE.f135199x = z14;
        o0VarE.L = i2VarBuild;
        Object obj2 = n.f135160c;
        r3.c.f149972b.getClass();
        o0VarE.F0(202, obj2, i2VarBuild, 0);
        i15 = 14;
        e5.r((i14 >> 3) & 14, pVar, o0VarE, false, false);
        o0VarE.f135199x = u0Var.b() != 0;
        o0VarE.L = null;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mg2.o(n2VarArr, pVar, i14, i15);
        }
    }

    public static j0 c(e23.a aVar) {
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        return new j0(a4Var, aVar);
    }
}
