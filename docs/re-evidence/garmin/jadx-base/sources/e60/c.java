package e60;

import am.i1;
import an1.i;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import gl1.y;
import h4.r;
import i3.e5;
import java.text.DecimalFormat;
import kotlin.t1;
import l72.p2;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import p5.v;
import u4.d;
import v62.h9;
import v62.z4;
import w2.a0;
import z20.e;
import z3.f;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
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
    public static final void a(e eVar, boolean z14, e23.a<Unit> aVar, m mVar, int i14) {
        o0 o0Var;
        String strP;
        d dVarA;
        String strJ;
        String str;
        eVar.getClass();
        boolean z15 = eVar.f201902f;
        aVar.getClass();
        o0 o0VarE = mVar.E(-1781108988);
        int i15 = i14 | (o0VarE.B(eVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            a aVar2 = new a(a0.s(o0VarE), false, null, 6, null);
            String string = eVar.f201898b;
            l22.b bVar = aVar2.f63147a;
            if (string == null || string.length() == 0) {
                string = bVar.getString(R.string.txt_untitle);
            }
            String strA = aVar2.a(eVar.f201900d, bVar.getString(R.string.no_value));
            String strP2 = y.P(R.string.title_course_distance, new Object[]{strA}, o0VarE);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new dv0.n(27);
                o0VarE.K(objQ);
            }
            String strB = oi0.c.B(strP2, (l) objQ, o0VarE);
            double d14 = eVar.f201901e;
            String string2 = bVar.getString(R.string.no_value);
            if (!Double.isNaN(d14)) {
                l3.a aVar3 = l3.f23124b;
                DecimalFormat decimalFormat = l3.f23126d;
                aVar3.getClass();
                string2 = l3.a.b0(aVar2.f63147a, d14, aVar2.f63149c, false, decimalFormat);
            }
            String strP3 = y.P(R.string.lbl_elevation_value, new Object[]{string2}, o0VarE);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new dv0.n(28);
                o0VarE.K(objQ2);
            }
            String strB2 = oi0.c.B(strP3, (l) objQ2, o0VarE);
            String strG = e5.g(strA, "     ", string2);
            if (z15) {
                o0VarE.C(-990973121);
                strP = y.P(R.string.lbl_privacy_value, new Object[]{y.Q(o0VarE, R.string.lbl_public)}, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-990872898);
                strP = y.P(R.string.lbl_privacy_value, new Object[]{y.Q(o0VarE, R.string.lbl_private)}, o0VarE);
                o0VarE.g0(false);
            }
            if (z15) {
                s62.a.f157643a.getClass();
                dVarA = h9.a(t62.b.f162798a);
            } else {
                s62.a.f157643a.getClass();
                dVarA = z4.a(t62.b.f162798a);
            }
            String strG2 = e5.g(y.Q(o0VarE, R.string.lbl_course_type), StringUtils.SPACE, y.Q(o0VarE, eVar.f201899c.f32979a));
            z3.e eVarC = f.c(-93491113, new dh1.a(eVar, 7), o0VarE);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 2046267817, R.string.lbl_selected, o0VarE, false);
            } else {
                o0VarE.C(-990165542);
                o0VarE.g0(false);
                strJ = "";
            }
            z3.e eVarC2 = f.c(-119603297, new i(z14, 18), o0VarE);
            p2 p2Var = p2.f111205a;
            r.a aVar4 = r.S;
            boolean zB = o0VarE.B(string) | o0VarE.B(strB) | o0VarE.B(strB2) | o0VarE.B(strG2) | o0VarE.B(strP) | o0VarE.B(strJ);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                str = string;
                objQ3 = new b(str, 0, strB, strB2, strG2, strP, strJ);
                o0VarE.K(objQ3);
            } else {
                str = string;
            }
            o0Var = o0VarE;
            p2Var.h(str, strG, dVarA, v.c((l) objQ3, aVar4, false), null, false, false, eVarC, eVarC2, null, aVar, o0Var, 113270784, (i15 >> 6) & 14, 608);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(eVar, z14, aVar, i14, 11);
        }
    }

    public static final r b(r rVar, m mVar) {
        x1 x1Var = n.f135158a;
        float f75992b = ((g6.c) mVar.A(t1.f91490h)).getF75992b();
        if (f75992b <= 1.0f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            return x2.q(rVar, j92.b.f97901d.f97905d);
        }
        if (f75992b <= 1.5f) {
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97901d.f97905d * f75992b;
            g6.f.a aVar = g6.f.f75994b;
            return x2.q(rVar, f14);
        }
        d92.b.f58623a.getClass();
        d92.b.f58625c.getClass();
        float f15 = j92.b.f97901d.f97905d * 1.5f;
        g6.f.a aVar2 = g6.f.f75994b;
        return x2.q(rVar, f15);
    }
}
