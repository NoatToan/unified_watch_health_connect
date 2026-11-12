package lh0;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import kotlin.t1;
import kotlin.t3;
import l72.p2;
import p005kotlin.Unit;
import p3.o0;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class v {
    /* JADX WARN: Code duplicated, block: B:36:0x0104  */
    /* JADX WARN: Code duplicated, block: B:45:0x0142  */
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
    public static final void a(r rVar, dh0.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-1275544761);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            dh0.d dVarA = ih0.g.a(aVar.f59546e, dh0.g.VIGOROUS_MINUTES);
            if (dVarA != null) {
                o0VarE.C(2116923249);
                t3 t3Var = (t3) o0VarE.A(t1.f91501s);
                int i16 = (i15 << 6) & 896;
                rVar.l(y.Q(o0VarE, R.string.lbl_vigorous_minutes_6w_avg), o0VarE, i16);
                h4.r.a aVar3 = h4.r.S;
                float f14 = 24;
                g6.f.a aVar4 = g6.f.f75994b;
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                a.a(dVarA.f59565b, Double.valueOf(75.0d), y.Q(o0VarE, R.string.lbl_avg_min_per_week), o0VarE, 48);
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                int i17 = (i15 << 3) & 112;
                rVar.h(y.Q(o0VarE, R.string.msg_vigorous_minutes_lower_fitness_age), o0VarE, i17);
                rVar.g(z3.f.c(-1699733925, new b(rVar, 6), o0VarE), o0VarE, i17 | 6);
                rVar.k(R.string.lbl_keeping_it_intense, o0VarE, i17);
                rVar.i(R.string.msg_vigorous_minutes_metric_educational_1, o0VarE, i16);
                rVar.i(R.string.msg_vigorous_intensity_metric_educational_2, o0VarE, i16);
                int id3 = xx0.a.EnumC3592a.MAYO_CLINIC.getId();
                boolean zR = o0VarE.r(t3Var);
                Object objQ = o0VarE.q();
                p3.m.a aVar5 = p3.m.f135153a;
                if (zR) {
                    objQ = new by1.q(t3Var, 10);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new by1.q(t3Var, 10);
                        o0VarE.K(objQ);
                    }
                }
                rVar.f((e23.a) objQ, id3, o0VarE, i16);
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                p2 p2Var = p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.lbl_find_training_plan);
                boolean z14 = (i15 & 896) == 256;
                Object objQ2 = o0VarE.q();
                if (z14) {
                    objQ2 = new l72.t(aVar2, 23);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new l72.t(aVar2, 23);
                        o0VarE.K(objQ2);
                    }
                }
                p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ2, o0VarE, 0, 254);
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(2118255195);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, aVar, aVar2, i14, 2);
        }
    }
}
