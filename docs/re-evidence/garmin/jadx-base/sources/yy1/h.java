package yy1;

import androidx.room.a0;
import c2.b0;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.c1;
import l72.r1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.x0;
import yg2.l0;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
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
    public static final void a(boolean z14, List<q51.e> list, e23.l<? super Long, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        List<q51.e> list2;
        o0 o0Var;
        p3.m.a.C2565a c2565a;
        int i16;
        boolean z15;
        boolean z16;
        e23.a<Unit> aVar2 = aVar;
        o0 o0VarP = a0.p(lVar, aVar2, mVar, -1881513743);
        if ((i14 & 6) == 0) {
            i15 = (o0VarP.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            list2 = list;
            i15 |= o0VarP.r(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarP.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarP.r(aVar2) ? 2048 : 1024;
        }
        if (o0VarP.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarP.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ == c2565a2) {
                objQ = p0.n(Boolean.FALSE);
                o0VarP.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarP, 0);
            int iHashCode = Long.hashCode(o0VarP.U);
            i2 i2VarA0 = o0VarP.a0();
            h4.r rVarC = h4.k.c(aVar3, o0VarP);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (o0VarP.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarP.z();
            if (o0VarP.T) {
                o0VarP.M(aVar4);
            } else {
                o0VarP.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarP);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarP);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarP.T || !p005kotlin.jvm.internal.s.g(o0VarP.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarP, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarP);
            b0 b0Var = b0.f22601a;
            if (z14) {
                o0VarP.C(1509134627);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
                String strQ = gl1.y.Q(o0VarP, R.string.msg_strategies_header);
                d92.b.f58624b.getClass();
                x0 x0VarB = d92.c.b(j92.f.f97932i, o0VarP);
                z16 = true;
                c2565a = c2565a2;
                z15 = false;
                i16 = 2048;
                mh.c(strQ, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarP, 0, 0, 131068);
                o0Var = o0VarP;
                o0Var.g0(false);
            } else {
                o0Var = o0VarP;
                c2565a = c2565a2;
                i16 = 2048;
                z15 = false;
                z16 = true;
                o0Var.C(1509352123);
                o0Var.g0(false);
            }
            String strQ2 = gl1.y.Q(o0Var, R.string.pacepro_title);
            int i17 = i16;
            boolean z17 = z15;
            boolean z18 = z16;
            p3.m.a.C2565a c2565a3 = c2565a;
            int i18 = i15;
            f fVar = new f(list2, z14, aVar2, lVar, p1Var, 0);
            aVar2 = aVar2;
            r1.b(strQ2, z3.f.c(-1149616126, fVar, o0Var), o0Var, 48, z17 ? 1 : 0);
            o0Var.g0(z18);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0Var.C(1443657230);
                c1 c1Var = c1.f110940a;
                String strQ3 = gl1.y.Q(o0Var, R.string.pacepro_lbl_create_plan);
                String strQ4 = gl1.y.Q(o0Var, R.string.create_pacepro_strategy_message);
                String strQ5 = gl1.y.Q(o0Var, R.string.lbl_common_continue);
                boolean z19 = (i18 & 7168) == i17 ? z18 : z17 ? 1 : 0;
                Object objQ2 = o0Var.q();
                if (z19 || objQ2 == c2565a3) {
                    objQ2 = new w52.p1(aVar2, p1Var, 7);
                    o0Var.K(objQ2);
                }
                e23.a<Unit> aVar5 = (e23.a) objQ2;
                String strQ6 = gl1.y.Q(o0Var, R.string.lbl_cancel);
                Object objQ3 = o0Var.q();
                if (objQ3 == c2565a3) {
                    objQ3 = new l0(p1Var, 9);
                    o0Var.K(objQ3);
                }
                o0 o0Var2 = o0Var;
                c1Var.a(false, strQ3, strQ4, null, null, strQ5, false, false, aVar5, strQ6, (e23.a) objQ3, o0Var2, 0, 6, 217);
                o0Var = o0Var2;
                o0Var.g0(z17);
            } else {
                o0Var.C(1444182897);
                o0Var.g0(z17);
            }
        } else {
            o0Var = o0VarP;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g(z14, list, lVar, aVar2, i14);
        }
    }
}
