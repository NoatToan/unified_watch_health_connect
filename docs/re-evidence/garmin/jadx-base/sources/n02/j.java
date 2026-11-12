package n02;

import a11.f0;
import androidx.room.a0;
import aq.m2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import l72.c1;
import p3.n;
import p3.n1;
import p3.o0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class j {
    /* JADX WARN: Code duplicated, block: B:58:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x010b  */
    /* JADX WARN: Code duplicated, block: B:80:0x017c  */
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
        e23.l lVar4;
        boolean z16;
        o0 o0VarP = a0.p(lVar2, aVar, mVar, 612678228);
        int i18 = i17 | (o0VarP.k(i14) ? 4 : 2) | (o0VarP.k(i15) ? 32 : 16) | (o0VarP.k(i16) ? 256 : 128) | 3072 | (o0VarP.B(str) ? 16384 : 8192) | (o0VarP.B(str2) ? 131072 : 65536) | 1572864 | (o0VarP.r(lVar2) ? 8388608 : 4194304) | (o0VarP.r(aVar) ? 67108864 : 33554432);
        if (o0VarP.n(i18 & 1, (38347923 & i18) != 38347922)) {
            o0VarP.G0();
            int i19 = i17 & 1;
            p3.m.a aVar2 = p3.m.f135153a;
            if (i19 == 0 || o0VarP.o0()) {
                Object objQ = o0VarP.q();
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new mi0.i(18);
                    o0VarP.K(objQ);
                }
                lVar4 = (e23.l) objQ;
                z16 = true;
            } else {
                o0VarP.e();
                z16 = z14;
                lVar4 = lVar;
            }
            o0VarP.h0();
            x1 x1Var = n.f135158a;
            Object[] objArr = new Object[0];
            boolean z17 = (((i18 & 896) ^ 384) > 256 && o0VarP.k(i16)) || (i18 & 384) == 256;
            Object objQ2 = o0VarP.q();
            if (z17) {
                objQ2 = new a51.c(i16, 7);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a51.c(i16, 7);
                    o0VarP.K(objQ2);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ2, o0VarP, 0);
            Object[] objArr2 = {Integer.valueOf(n1Var.getIntValue())};
            boolean zB = o0VarP.B(n1Var);
            Object objQ3 = o0VarP.q();
            if (zB) {
                objQ3 = new mh1.i(n1Var, 18);
                o0VarP.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new mh1.i(n1Var, 18);
                    o0VarP.K(objQ3);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr2, (e23.a) objQ3, o0VarP, 0);
            c1 c1Var = c1.f110940a;
            String str3 = str == null ? (String) p1Var.getF182175a() : str;
            e23.l lVar5 = lVar4;
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("title", str2 == null ? (String) p1Var.getF182175a() : str2);
            b92.a aVarB = c0235a.b();
            String strQ = y.Q(o0VarP, R.string.lbl_ok);
            z3.e eVarC = z3.f.c(1584763512, new m2(i14, i15, i16, n1Var, lVar5), o0VarP);
            boolean zB2 = ((29360128 & i18) == 8388608) | o0VarP.B(n1Var);
            Object objQ4 = o0VarP.q();
            if (zB2) {
                objQ4 = new f0(lVar2, n1Var, 6);
                o0VarP.K(objQ4);
            } else {
                aVar2.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new f0(lVar2, n1Var, 6);
                    o0VarP.K(objQ4);
                }
            }
            int i24 = b92.a.f16960b;
            o0Var = o0VarP;
            boolean z18 = z16;
            c1Var.a(z18, str3, null, eVarC, aVarB, strQ, false, false, (e23.a) objQ4, null, aVar, o0Var, 3078, (i18 >> 24) & 14, 708);
            lVar3 = lVar5;
            z15 = z18;
        } else {
            o0Var = o0VarP;
            o0Var.e();
            z15 = z14;
            lVar3 = lVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new h(i14, i15, i16, z15, str, str2, lVar3, lVar2, aVar, i17, 0);
        }
    }
}
