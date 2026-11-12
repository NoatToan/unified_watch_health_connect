package n02;

import a11.f0;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import com.garmin.android.apps.connectmobile.R;
import f21.u;
import gl1.y;
import l72.c1;
import mt0.s1;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class k {
    /* JADX WARN: Code duplicated, block: B:61:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x01df  */
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
    public static final void a(int i14, int i15, int i16, boolean z14, String str, String str2, e23.l lVar, e23.l lVar2, e23.a aVar, p3.m mVar, int i17) {
        o0 o0Var;
        boolean z15;
        e23.l lVar3;
        boolean z16;
        o0 o0VarP = a0.p(lVar2, aVar, mVar, -1584494218);
        int i18 = (o0VarP.r(lVar2) ? 536870912 : 268435456) | i17 | (o0VarP.k(i14) ? 4 : 2) | (o0VarP.k(i15) ? 32 : 16) | (o0VarP.k(i16) ? 256 : 128) | 224256 | (o0VarP.B(str) ? 1048576 : 524288) | (o0VarP.B(str2) ? 8388608 : 4194304) | 100663296;
        int i19 = o0VarP.r(aVar) ? 4 : 2;
        if (o0VarP.n(i18 & 1, ((306783379 & i18) == 306783378 && (i19 & 3) == 2) ? false : true)) {
            o0VarP.G0();
            int i24 = i17 & 1;
            p3.m.a aVar2 = p3.m.f135153a;
            if (i24 == 0 || o0VarP.o0()) {
                Object objQ = o0VarP.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new mi0.i(19);
                    o0VarP.K(objQ);
                }
                lVar3 = (e23.l) objQ;
                z16 = true;
            } else {
                o0VarP.e();
                z16 = z14;
                lVar3 = lVar;
            }
            o0VarP.h0();
            x1 x1Var = n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            Object[] objArr = new Object[0];
            boolean z17 = (((i18 & 896) ^ 384) > 256 && o0VarP.k(i16)) || (i18 & 384) == 256;
            Object objQ2 = o0VarP.q();
            if (z17) {
                objQ2 = new a51.c(i16, 8);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a51.c(i16, 8);
                    o0VarP.K(objQ2);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ2, o0VarP, 0);
            Object[] objArr2 = {Integer.valueOf(n1Var.getIntValue())};
            boolean zB = o0VarP.B(n1Var) | ((i18 & 3670016) == 1048576);
            Object objQ3 = o0VarP.q();
            if (zB) {
                objQ3 = new s1(4, str, n1Var);
                o0VarP.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new s1(4, str, n1Var);
                    o0VarP.K(objQ3);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarP, 0);
            Object[] objArr3 = {Integer.valueOf(n1Var.getIntValue())};
            boolean zR = ((((29360128 & i18) ^ 12582912) > 8388608 && o0VarP.B(str2)) || (i18 & 12582912) == 8388608) | o0VarP.r(context) | o0VarP.B(n1Var);
            Object objQ4 = o0VarP.q();
            if (zR) {
                objQ4 = new kk1.a(context, 26, str2, n1Var);
                o0VarP.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new kk1.a(context, 26, str2, n1Var);
                    o0VarP.K(objQ4);
                }
            }
            p1 p1Var2 = (p1) d4.a.e(objArr3, (e23.a) objQ4, o0VarP, 0);
            c1 c1Var = c1.f110940a;
            String str3 = (String) p1Var.getF182175a();
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("title", (String) p1Var2.getF182175a());
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarP, R.string.lbl_ok);
            z3.e eVarC = z3.f.c(1507702426, new u(str, str2, i14, i15, i16, n1Var, lVar3), o0VarP);
            boolean zB2 = o0VarP.B(n1Var) | ((1879048192 & i18) == 536870912);
            Object objQ5 = o0VarP.q();
            if (zB2) {
                objQ5 = new f0(lVar2, n1Var, 7);
                o0VarP.K(objQ5);
            } else {
                aVar2.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    objQ5 = new f0(lVar2, n1Var, 7);
                    o0VarP.K(objQ5);
                }
            }
            int i25 = b92.a.f16960b;
            o0Var = o0VarP;
            boolean z18 = z16;
            c1Var.a(z18, str3, null, eVarC, aVarB, strQ, false, false, (e23.a) objQ5, null, aVar, o0Var, 3078, i19 & 14, 708);
            z15 = z18;
        } else {
            o0Var = o0VarP;
            o0Var.e();
            z15 = z14;
            lVar3 = lVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(i14, i15, i16, z15, str, str2, lVar3, lVar2, aVar, i17, 1);
        }
    }
}
