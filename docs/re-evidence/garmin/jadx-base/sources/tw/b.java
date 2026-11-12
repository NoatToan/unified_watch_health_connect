package tw;

import b82.t0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import java.util.Locale;
import kotlin.t1;
import m4.q;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import x5.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    /* JADX WARN: Code duplicated, block: B:56:0x0124  */
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
    public static final void a(pw.a aVar, l<? super pw.a, Unit> lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        aVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1269133837);
        if ((i14 & 6) == 0) {
            i15 = ((i14 & 8) == 0 ? o0VarE.B(aVar) : o0VarE.r(aVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(lVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            p1 p1VarA = s02.a.a(o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                Boolean bool = (Boolean) p1VarA.getF182175a();
                bool.getClass();
                objQ = p0.n(bool);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            q qVar = (q) o0VarE.A(t1.f91491i);
            String notes = aVar.getNotes();
            String strJ = "";
            if (notes == null) {
                notes = "";
            }
            if (notes.equals("3X_reading_text")) {
                notes = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 169383665, R.string.lbl_3x_reading, o0VarE, false);
            } else {
                o0VarE.C(169449013);
                o0VarE.g0(false);
            }
            boolean zB = o0VarE.B(notes);
            Object objQ2 = o0VarE.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = p0.n(notes);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                p1Var.setValue(Boolean.TRUE);
            } else if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                p1Var.setValue(Boolean.FALSE);
                qVar.y(false);
                if (!s.g(notes, (String) p1Var2.getF182175a())) {
                    lVar.invoke(pw.a.b(aVar, null, null, null, (String) p1Var2.getF182175a(), 991));
                }
            }
            if (((Boolean) p1VarA.getF182175a()).booleanValue()) {
                o0VarE.C(169965905);
                o0VarE.g0(false);
            } else {
                if (((String) p1Var2.getF182175a()).length() == 0) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -133066568, R.string.mct_add_notes, o0VarE, false);
                } else {
                    o0VarE.C(169965905);
                    o0VarE.g0(false);
                }
            }
            t0 t0Var = t0.f16792a;
            String str = (String) p1Var2.getF182175a();
            String upperCase = y.Q(o0VarE, R.string.activity_summary_activity_notes).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            p.f188918b.getClass();
            int i16 = p.f188926j;
            boolean zB2 = o0VarE.B(p1Var2);
            Object objQ3 = o0VarE.q();
            if (zB2 || objQ3 == c2565a) {
                objQ3 = new sk0.n(p1Var2, 11);
                o0VarE.K(objQ3);
            }
            o0Var = o0VarE;
            t0Var.b(str, null, upperCase, strJ, 0, i16, null, (l) objQ3, o0Var, 1597440, 162);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new sg0.m(aVar, lVar, i14, 19);
        }
    }
}
