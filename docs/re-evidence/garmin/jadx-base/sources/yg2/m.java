package yg2;

import b82.y1;
import c2.q2;
import c2.s2;
import c2.u2;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import java.util.Comparator;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b((Character) t14, (Character) t7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0160  */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x022c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0233  */
    /* JADX WARN: Code duplicated, block: B:73:0x023b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0259  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:84:0x02a4  */
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
    public static final void a(i53.c<vf2.e> cVar, i53.c<vf2.e> cVar2, i53.c<vf2.e> cVar3, lc.y yVar, e23.l<? super vf2.e, Unit> lVar, p3.m mVar, int i14) {
        p3.c<?> cVar4;
        h5.g.a.f fVar;
        c2.j.C0343j c0343j;
        h4.g.b bVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        Object objQ;
        s2 s2VarA2;
        int iHashCode2;
        i2 i2VarA1;
        h4.r rVarC2;
        cVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        yVar.getClass();
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(-793532450);
        p3.c<?> cVar5 = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.B(cVar2) ? 32 : 16) | (o0VarE.B(cVar3) ? 256 : 128) | (o0VarE.r(yVar) ? 2048 : 1024) | (o0VarE.r(lVar) ? 16384 : 8192);
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ2 = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = p3.p0.n("");
                o0VarE.K(objQ2);
            }
            p1 p1Var = (p1) objQ2;
            i53.f fVarA = i53.a.a(gl1.y.Q(o0VarE, R.string.lbl_suggestions), gl1.y.Q(o0VarE, R.string.common_all));
            ArrayList arrayList = new ArrayList();
            for (vf2.e eVar : cVar2) {
                String str = eVar.f177933e;
                if (str != null && d53.w.z(str, (String) p1Var.getF182175a(), true)) {
                    arrayList.add(eVar);
                }
            }
            h4.r.a aVar = h4.r.S;
            h4.r rVarP = c2.l.p(aVar);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            x1 x1Var2 = p3.n.f135158a;
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarP, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar5 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar4 = cVar5;
            } else {
                cVar4 = cVar5;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                h4.r rVarE = u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
                c0343j = c2.j.f22692b;
                bVar = h4.d.a.f81533k;
                s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
                if (cVar4 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                u2 u2Var = u2.f22900a;
                d92.b.f58625c.getClass();
                h4.r rVarA = c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2);
                String str2 = (String) p1Var.getF182175a();
                String strQ = gl1.y.Q(o0VarE, R.string.lbl_search);
                b.f196952a.getClass();
                z3.e eVar3 = b.f196953b;
                objQ = o0VarE.q();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new xq1.c(p1Var, 8);
                    o0VarE.K(objQ);
                }
                l72.p1.a(str2, rVarA, strQ, null, false, false, null, 0L, null, null, eVar3, null, null, (e23.l) objQ, o0VarE, 0, 24582, 15352);
                o0VarE = o0VarE;
                o0VarE.g0(true);
                s2VarA2 = q2.a(c0343j, bVar, o0VarE, 0);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar4 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, s2VarA2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
                }
                b4.c(fVar, rVarC2, o0VarE);
                y1.f16902a.c(fVarA, arrayList.isEmpty() ? 1 : 0, false, true, false, 0L, 0L, z3.f.c(20134405, new ak0.h(arrayList, cVar3, cVar, lVar, yVar, p1Var, 29), o0VarE), o0VarE, 12586368, 112);
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            h4.r rVarE2 = u1.n.e(aVar, tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            c0343j = c2.j.f22692b;
            bVar = h4.d.a.f81533k;
            s2VarA = q2.a(c0343j, bVar, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE2, o0VarE);
            if (cVar4 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var2 = u2.f22900a;
            d92.b.f58625c.getClass();
            h4.r rVarA2 = c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2);
            String str3 = (String) p1Var.getF182175a();
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_search);
            b.f196952a.getClass();
            z3.e eVar4 = b.f196953b;
            objQ = o0VarE.q();
            if (objQ == p3.m.a.f135155b) {
                objQ = new xq1.c(p1Var, 8);
                o0VarE.K(objQ);
            }
            l72.p1.a(str3, rVarA2, strQ2, null, false, false, null, 0L, null, null, eVar4, null, null, (e23.l) objQ, o0VarE, 0, 24582, 15352);
            o0VarE = o0VarE;
            o0VarE.g0(true);
            s2VarA2 = q2.a(c0343j, bVar, o0VarE, 0);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar4 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, s2VarA2, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            y1.f16902a.c(fVarA, arrayList.isEmpty() ? 1 : 0, false, true, false, 0L, 0L, z3.f.c(20134405, new ak0.h(arrayList, cVar3, cVar, lVar, yVar, p1Var, 29), o0VarE), o0VarE, 12586368, 112);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new wv0.e(cVar, cVar2, cVar3, yVar, lVar, i14, 9);
        }
    }
}
