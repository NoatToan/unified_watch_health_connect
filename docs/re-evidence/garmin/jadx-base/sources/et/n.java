package et;

import c2.a0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e11.c0;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.p2;
import l72.r1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;
import u1.a2;

/* JADX INFO: loaded from: classes7.dex */
public final class n {
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
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
    public static final void a(a0 a0Var, List<vs.e> list, e23.l<? super vs.e, Unit> lVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1463194808);
        int i15 = i14 | (o0VarE.r(list) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            for (vs.e eVar : list) {
                p2 p2Var = p2.f111205a;
                z3.e eVarC = z3.f.c(852190009, new c0(5, eVar, a0Var), o0VarE);
                boolean z14 = eVar.f179707b;
                boolean zR = ((i15 & 896) == 256) | o0VarE.r(eVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new dl0.g(15, lVar, eVar);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new dl0.g(15, lVar, eVar);
                        o0VarE.K(objQ);
                    }
                }
                p2Var.f(null, eVarC, null, false, z14, null, (e23.a) objQ, o0VarE, 48, 45);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new m(a0Var, list, lVar, i14, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x018d  */
    /* JADX WARN: Code duplicated, block: B:59:0x01d1  */
    public static final void b(ys.b bVar, e23.l<? super vs.e, Unit> lVar, p3.m mVar, int i14) {
        ys.b bVar2;
        o0 o0Var;
        int i15;
        bVar.getClass();
        List<vs.e> list = bVar.f199163e;
        lVar.getClass();
        o0 o0VarE = mVar.E(-263284361);
        p3.c<?> cVar = o0VarE.f135177b;
        int i16 = i14 | (o0VarE.r(bVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarB = a2.b(x2.c(aVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81536n;
            z zVarA = y.a(gVar, aVar2, o0VarE, 6);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar3);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            z zVarA2 = y.a(c2.j.f22694d, aVar2, o0VarE, 0);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar3);
            }
            b4.c(fVar, rVarC2, o0VarE);
            String strQ = gl1.y.Q(o0VarE, R.string.msg_select_activity_to_record);
            d92.b.f58623a.getClass();
            j92.b bVar4 = d92.b.f58625c;
            bVar4.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f14 = eVar2.f97920e;
            bVar4.getClass();
            r rVarZ = c2.l.z(aVar, eVar2.f97920e, f14);
            d92.b.f58624b.getClass();
            mh.c(strQ, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
            o0Var = o0VarE;
            boolean zIsEmpty = list.isEmpty();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zIsEmpty) {
                i15 = 6;
                o0Var.C(481445015);
                o0Var.g0(false);
            } else {
                o0Var.C(481184584);
                r1.b(gl1.y.Q(o0Var, R.string.lbl_recent_activities), null, o0Var, 0, 2);
                boolean z14 = (i16 & 112) == 32;
                Object objQ = o0Var.q();
                if (z14) {
                    objQ = new ci0.f(lVar, 21);
                    o0Var.K(objQ);
                } else {
                    aVar4.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new ci0.f(lVar, 21);
                        o0Var.K(objQ);
                    }
                }
                i15 = 6;
                a(b0Var, list, (e23.l) objQ, o0Var, 6);
                o0Var.g0(false);
            }
            r1.b(gl1.y.Q(o0Var, R.string.activity_title_all_activities), null, o0Var, 0, 2);
            bVar2 = bVar;
            List<vs.e> list2 = bVar2.f199164f;
            boolean z15 = (i16 & 112) == 32;
            Object objQ2 = o0Var.q();
            if (z15) {
                objQ2 = new ci0.f(lVar, 22);
                o0Var.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ci0.f(lVar, 22);
                    o0Var.K(objQ2);
                }
            }
            a(b0Var, list2, (e23.l) objQ2, o0Var, i15);
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            bVar2 = bVar;
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d81.h(bVar2, lVar, i14, 21);
        }
    }
}
