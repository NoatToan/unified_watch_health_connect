package o72;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
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
    public static final void a(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1350984531);
        int i15 = 0;
        int i16 = 1;
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var = (p3.p1) objQ;
            l72.f0 f0Var = l72.f0.f110999a;
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarY = c2.l.y(aVar, f14);
            Object objQ2 = o0VarE.q();
            int i17 = 12;
            if (objQ2 == c2565a) {
                objQ2 = new n02.c(p1Var, i17);
                o0VarE.K(objQ2);
            }
            f0Var.d(25008, 9, (e23.a) objQ2, rVarY, "Toggle Card Visibility", o0VarE, null, false);
            l72.s sVar = l72.s.f111232a;
            sVar.a(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-1758127370, new e(context, p1Var, i15), o0VarE), o0VarE, 48);
            sVar.a(true, z3.f.c(-1593359699, new br2.a(context, 8), o0VarE), o0VarE, 54);
            sVar.a(true, z3.f.c(-1534138962, new br2.a(context, 9), o0VarE), o0VarE, 54);
            sVar.a(true, z3.f.c(-1474918225, new br2.a(context, 10), o0VarE), o0VarE, 54);
            sVar.a(true, z3.f.c(-1415697488, new br2.a(context, 11), o0VarE), o0VarE, 54);
            h4.r rVarZ = c2.l.z(aVar, f14, 4);
            boolean zR = o0VarE.r(context);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new f(context, i15);
                o0VarE.K(objQ3);
            }
            e23.a aVar3 = (e23.a) objQ3;
            boolean zR2 = o0VarE.r(context);
            Object objQ4 = o0VarE.q();
            if (zR2 || objQ4 == c2565a) {
                objQ4 = new f(context, i16);
                o0VarE.K(objQ4);
            }
            sVar.c(rVarZ, null, null, null, "Title", "Cras mattis consectetur purus sit amet amet fermentum.", "Action", false, aVar3, (e23.a) objQ4, o0VarE, 1794054, 0, 398);
            o0VarE = o0VarE;
            sVar.a(true, z3.f.c(-1356476751, new br2.a(context, 12), o0VarE), o0VarE, 54);
            sVar.a(true, z3.f.c(-1297256014, new br2.a(context, 7), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o01.e(i14, 19);
        }
    }
}
