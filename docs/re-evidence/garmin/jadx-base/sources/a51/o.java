package a51;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import p005kotlin.Unit;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class o {
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
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
    public static final void a(t41.i iVar, i53.c<? extends t41.i> cVar, e23.l<? super t41.i, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0Var;
        iVar.getClass();
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1928686558);
        int i15 = i14 | (o0VarE.k(iVar.ordinal()) ? 4 : 2) | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = {iVar};
            boolean z14 = (i15 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new a03.e(iVar, 1);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a03.e(iVar, 1);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            c1 c1Var = c1.f110940a;
            String strQ = y.Q(o0VarE, R.string.pacepro_lbl_plan_splits_type);
            String strQ2 = y.Q(o0VarE, R.string.common_cancel);
            String strQ3 = y.Q(o0VarE, R.string.lbl_ok);
            z3.e eVarC = z3.f.c(-1223929730, new a3.e(cVar, 4, context, p1Var), o0VarE);
            boolean zB = ((i15 & 896) == 256) | o0VarE.B(p1Var);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new k(lVar, p1Var, 0);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new k(lVar, p1Var, 0);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(true, strQ, null, eVarC, null, strQ3, false, false, (e23.a) objQ2, strQ2, aVar, o0Var, 3078, (i15 >> 9) & 14, 212);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new l(iVar, cVar, lVar, aVar, i14, 0);
        }
    }
}
