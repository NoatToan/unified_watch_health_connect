package lh0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import kotlin.t1;
import kotlin.t3;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static final void a(Double d14, Double d15, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1428180300);
        int i15 = (o0VarE.B(d14) ? 4 : 2) | i14 | (o0VarE.B(d15) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            ih0.i iVar = new ih0.i((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            h4.r.a aVar = h4.r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            n.f(c2.l.C(aVar, f14, 0.0f, f14, 0.0f, 10), z3.f.c(-1765908976, new d(d14, iVar, d15, 0), o0VarE), o0VarE, 54);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(i14, 0, d14, d15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x0178  */
    /* JADX WARN: Code duplicated, block: B:55:0x01aa  */
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
    public static final void b(r rVar, dh0.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        int i15;
        rVar.getClass();
        aVar2.getClass();
        o0 o0VarE = mVar.E(-264281561);
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
            dh0.d dVarA = ih0.g.a(aVar.f59546e, dh0.g.BMI);
            if (dVarA != null) {
                Double d14 = dVarA.f59566c;
                o0VarE.C(-536690365);
                Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
                t3 t3Var = (t3) o0VarE.A(t1.f91501s);
                new ih0.i(context);
                int i16 = i15 & 14;
                rVar.a(o0VarE, i16);
                h4.r.a aVar3 = h4.r.S;
                float f14 = 24;
                g6.f.a aVar4 = g6.f.f75994b;
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                a(d14, dVarA.f59565b, o0VarE, 0);
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                rVar.a(o0VarE, i16);
                int i17 = (i15 << 3) & 112;
                rVar.h(y.P(R.string.msg_reducing_bmi_fitness_age, new Object[]{ih0.i.d(d14)}, o0VarE), o0VarE, i17);
                rVar.g(z3.f.c(1352515899, new b(rVar, 0), o0VarE), o0VarE, i17 | 6);
                int id3 = xx0.a.EnumC3592a.MAYO_CLINIC.getId();
                boolean zR = o0VarE.r(t3Var);
                Object objQ = o0VarE.q();
                p3.m.a aVar5 = p3.m.f135153a;
                if (zR) {
                    objQ = new by1.q(t3Var, 4);
                    o0VarE.K(objQ);
                } else {
                    aVar5.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new by1.q(t3Var, 4);
                        o0VarE.K(objQ);
                    }
                }
                int i18 = (i15 << 6) & 896;
                rVar.f((e23.a) objQ, id3, o0VarE, i18);
                rVar.k(R.string.title_body_mass_index, o0VarE, i17);
                rVar.i(R.string.msg_bmi_metric_educational, o0VarE, i18);
                rVar.i(R.string.msg_bmi_metric_educational_2, o0VarE, i18);
                rVar.i(R.string.msg_bmi_metric_educational_3, o0VarE, i18);
                int id4 = xx0.a.EnumC3592a.WORLD_HEALTH_ORGANIZATION.getId();
                boolean zR2 = o0VarE.r(t3Var);
                Object objQ2 = o0VarE.q();
                if (zR2) {
                    objQ2 = new by1.q(t3Var, 5);
                    o0VarE.K(objQ2);
                } else {
                    aVar5.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new by1.q(t3Var, 5);
                        o0VarE.K(objQ2);
                    }
                }
                rVar.f((e23.a) objQ2, id4, o0VarE, i18);
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                gh0.a aVar6 = (gh0.a) KoinJavaComponent.get$default(gh0.a.class, null, null, 6, null);
                g.h hVar = new g.h();
                boolean zR3 = ((i15 & 896) == 256) | o0VarE.r(aVar6);
                Object objQ3 = o0VarE.q();
                if (zR3) {
                    objQ3 = new kh0.v(aVar6, aVar2, 1);
                    o0VarE.K(objQ3);
                } else {
                    aVar5.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new kh0.v(aVar6, aVar2, 1);
                        o0VarE.K(objQ3);
                    }
                }
                c.q qVarC = w.c(hVar, (e23.l) objQ3, o0VarE, 0);
                l72.p2 p2Var = l72.p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.lbl_add_weight);
                boolean zR4 = o0VarE.r(qVarC) | o0VarE.r(aVar6) | o0VarE.r(context);
                Object objQ4 = o0VarE.q();
                if (zR4) {
                    objQ4 = new kh0.u(qVarC, aVar6, context, 2);
                    o0VarE.K(objQ4);
                } else {
                    aVar5.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new kh0.u(qVarC, aVar6, context, 2);
                        o0VarE.K(objQ4);
                    }
                }
                p2Var.g(strQ, null, null, null, null, false, false, (e23.a) objQ4, o0VarE, 0, 254);
                c2.l.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-534883685);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, aVar, aVar2, i14, 0);
        }
    }
}
