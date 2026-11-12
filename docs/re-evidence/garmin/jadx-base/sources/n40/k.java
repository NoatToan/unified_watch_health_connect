package n40;

import a11.b0;
import c2.q;
import c2.u;
import com.garmin.android.apps.connectmobile.R;
import ew1.v1;
import f5.z0;
import gl1.y;
import h4.r;
import h5.e0;
import java.util.ArrayList;
import l72.p2;
import li0.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.x1;
import qw0.x;

/* JADX INFO: loaded from: classes8.dex */
public final class k {
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
    public static final void a(m40.h hVar, e23.l<? super com.garmin.android.library.mapsdkadapter.i.d, Unit> lVar, e23.l<? super Boolean, Unit> lVar2, e23.l<? super Integer, Unit> lVar3, p3.m mVar, int i14) {
        boolean z14;
        com.garmin.android.library.mapsdkadapter.i.d dVar = hVar.f116595b;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        o0 o0VarE = mVar.E(1024041639);
        int i15 = i14 | (o0VarE.B(hVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(lVar3) ? 2048 : 1024);
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            i53.c cVarB = x.b(dVar == com.garmin.android.library.mapsdkadapter.i.d.GOOGLE || dVar == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX);
            o0VarE.C(72233024);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(dVar);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            r rVarC = c2.l.C(aVar, 0.0f, f14, 0.0f, eVar.f97918c, 5);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            u uVar = u.f22885a;
            ArrayList arrayListC = qw0.r.c();
            com.garmin.android.library.mapsdkadapter.i.d dVar2 = (com.garmin.android.library.mapsdkadapter.i.d) p1Var.getF182175a();
            boolean z15 = (i15 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new b0(lVar, p1Var, 26);
                o0VarE.K(objQ2);
            }
            qw0.r.a(arrayListC, dVar2, (e23.l) objQ2, o0VarE, 0);
            o0VarE.g0(true);
            x.a(cVarB, lVar3, o0VarE, hVar.f116594a, (i15 >> 3) & 896);
            if (hVar.f116596c && ((com.garmin.android.library.mapsdkadapter.i.d) p1Var.getF182175a()) == com.garmin.android.library.mapsdkadapter.i.d.MAPBOX) {
                o0VarE.C(73007404);
                Object[] objArr = new Object[0];
                boolean z16 = (i15 & 14) == 4;
                Object objQ3 = o0VarE.q();
                if (z16 || objQ3 == c2565a) {
                    objQ3 = new mh1.i(hVar, 22);
                    o0VarE.K(objQ3);
                }
                p1 p1Var2 = (p1) d4.a.e(objArr, (e23.a) objQ3, o0VarE, 0);
                p2 p2Var = p2.f111205a;
                String strQ = y.Q(o0VarE, R.string.lbl_3d_map);
                z3.e eVarC = z3.f.c(-826771642, new w(p1Var2, 10), o0VarE);
                boolean zB = ((i15 & 896) == 256) | o0VarE.B(p1Var2);
                Object objQ4 = o0VarE.q();
                if (zB || objQ4 == c2565a) {
                    objQ4 = new v1(lVar2, p1Var2, 14);
                    o0VarE.K(objQ4);
                }
                z14 = false;
                p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ4, o0VarE, 24576, 238);
                o0VarE.g0(false);
            } else {
                z14 = false;
                o0VarE.C(73606107);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jj2.c(hVar, lVar, lVar2, lVar3, i14, 28);
        }
    }
}
