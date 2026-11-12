package in1;

import b82.t0;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import java.util.Locale;
import kotlin.t1;
import o53.b0;
import p005kotlin.Unit;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class i {
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
    public static final void a(String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        int i15;
        lVar.getClass();
        o0 o0VarE = mVar.E(-331748500);
        if ((i14 & 6) == 0) {
            i15 = i14 | (o0VarE.B(str) ? 4 : 2);
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarA = s02.a.a(o0VarE);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                Boolean bool = (Boolean) p1VarA.getF182175a();
                bool.getClass();
                objQ = p0.n(bool);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            m4.q qVar = (m4.q) o0VarE.A(t1.f91491i);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new i2.c();
                o0VarE.K(objQ2);
            }
            i2.a aVar = (i2.a) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0 b0Var = (b0) objQ3;
            String strJ = "";
            String str2 = str == null ? "" : str;
            boolean zB = o0VarE.B(str2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = p0.n(str2);
                o0VarE.K(objQ4);
            }
            p1 p1Var2 = (p1) objQ4;
            if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                p1Var.setValue(Boolean.TRUE);
            } else if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                p1Var.setValue(Boolean.FALSE);
                qVar.y(false);
                if (!str2.equals((String) p1Var2.getF182175a())) {
                    lVar.invoke((String) p1Var2.getF182175a());
                }
            }
            h4.r.a aVar2 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            c2.l.f(x2.h(aVar2, j92.b.f97899b.f97920e), o0VarE);
            if (((Boolean) p1VarA.getF182175a()).booleanValue() && ((String) p1Var2.getF182175a()).length() == 0) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -982695548, R.string.msg_how_well_did_you_sleep, o0VarE, false);
            } else if (((Boolean) p1VarA.getF182175a()).booleanValue() || ((String) p1Var2.getF182175a()).length() != 0) {
                o0VarE.C(-398631886);
                o0VarE.g0(false);
            } else {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -982692297, R.string.mct_add_notes, o0VarE, false);
            }
            t0 t0Var = t0.f16792a;
            h4.r rVarA = i2.d.a(h4.p.b(aVar2, 0.0f), aVar);
            String str3 = (String) p1Var2.getF182175a();
            String upperCase = y.Q(o0VarE, R.string.activity_summary_activity_notes).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            x5.p.f188918b.getClass();
            String str4 = strJ;
            int i16 = x5.p.f188926j;
            boolean zR = o0VarE.r(b0Var) | o0VarE.r(aVar);
            Object objQ5 = o0VarE.q();
            if (zR || objQ5 == c2565a) {
                objQ5 = new g(b0Var, aVar, 0);
                o0VarE.K(objQ5);
            }
            e23.l lVar2 = (e23.l) objQ5;
            boolean zB2 = o0VarE.B(p1Var2) | o0VarE.r(b0Var) | o0VarE.r(aVar);
            Object objQ6 = o0VarE.q();
            if (zB2 || objQ6 == c2565a) {
                objQ6 = new dv0.k(p1Var2, b0Var, aVar);
                o0VarE.K(objQ6);
            }
            t0Var.b(str3, rVarA, upperCase, str4, 0, i16, lVar2, (e23.l) objQ6, o0VarE, 1597440, 32);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f40.c(str, lVar, i14, 2, (byte) 0);
        }
    }
}
