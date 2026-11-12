package fo;

import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.util.Iterator;
import l72.p2;
import l72.r1;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.x1;
import u1.a2;
import v62.o7;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {
    /* JADX WARN: Code duplicated, block: B:41:0x0149  */
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
    public static final void a(int i14, e23.l lVar, h4.r rVar, i53.c cVar, p3.m mVar) {
        boolean z14;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1742382837);
        int i15 = 32;
        int i16 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16);
        int i17 = 1;
        int i18 = 0;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarB = a2.b(x2.f(rVar, 1.0f), a2.a(o0VarE), true);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (cVar.isEmpty()) {
                o0VarE.C(-1822481039);
                s62.a.f157643a.getClass();
                u4.d dVarA = o7.a(t62.b.f162798a);
                String strQ = gl1.y.Q(o0VarE, R.string.more_menu_search_no_recent_searches_title);
                String strQ2 = gl1.y.Q(o0VarE, R.string.activity_list_search_no_recent_searches_message);
                h4.r.a aVar2 = h4.r.S;
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                b82.n.c(dVarA, strQ, strQ2, c2.l.C(aVar2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13), null, o0VarE, 0, 16);
                o0VarE.g0(false);
                z14 = true;
            } else {
                o0VarE.C(-1822100204);
                r1.b(gl1.y.Q(o0VarE, R.string.more_menu_search_results_section_header), null, o0VarE, 0, 2);
                Iterator<E> it = cVar.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    p2 p2Var = p2.f111205a;
                    z.f72455a.getClass();
                    e23.p pVar = z.f72456b;
                    int i19 = ((i16 & 112) == i15 ? i17 : i18) | (o0VarE.B(str) ? 1 : 0);
                    Object objQ = o0VarE.q();
                    if (i19 == 0) {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new bb1.d(lVar, str, i17);
                            o0VarE.K(objQ);
                        }
                    } else {
                        objQ = new bb1.d(lVar, str, i17);
                        o0VarE.K(objQ);
                    }
                    p2Var.g(str, null, null, pVar, null, false, false, (e23.a) objQ, o0VarE, 3072, 246);
                    i18 = i18;
                    i17 = 1;
                    i15 = 32;
                }
                o0VarE.g0(i18);
                z14 = true;
            }
            o0VarE.g0(z14);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b0(cVar, lVar, rVar, i14, 0);
        }
    }
}
