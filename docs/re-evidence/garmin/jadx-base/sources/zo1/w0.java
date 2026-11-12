package zo1;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.q1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class w0 {
    /* JADX WARN: Code duplicated, block: B:27:0x00ba  */
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
    public static final void a(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(-1237158461);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_remove_me);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = c2.l.E(aVar2, q1.Max);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            l72.f0.a aVar4 = l72.f0.a.f111000a;
            z3.e eVarC = z3.f.c(39419732, new rw0.g(z14, 25), o0VarE);
            h4.r rVarF = x2.f(aVar2, 1.0f);
            boolean zB = o0VarE.B(strQ);
            Object objQ = o0VarE.q();
            p3.m.a aVar5 = p3.m.f135153a;
            if (zB) {
                objQ = new y01.k(strQ, 28);
                o0VarE.K(objQ);
            } else {
                aVar5.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new y01.k(strQ, 28);
                    o0VarE.K(objQ);
                }
            }
            h4.r rVarC2 = p5.v.c((e23.l) objQ, rVarF, false);
            boolean z15 = !z14;
            Object objQ2 = o0VarE.q();
            aVar5.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new yy1.d(aVar, 27);
                o0VarE.K(objQ2);
            }
            aVar4.i(eVarC, strQ, rVarC2, z15, (e23.a) objQ2, o0VarE, 6, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e(i14, 25, aVar, z14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(yo1.j jVar, o53.b0 b0Var, mc mcVar, q qVar, e23.a aVar, e23.a aVar2, e23.l lVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        jVar.getClass();
        b0Var.getClass();
        mcVar.getClass();
        qVar.getClass();
        aVar.getClass();
        p3.o0 o0VarE = mVar.E(1129270746);
        int i15 = i14 | ((i14 & 8) == 0 ? o0VarE.B(jVar) : o0VarE.r(jVar) ? 4 : 2) | (o0VarE.r(b0Var) ? 32 : 16) | (o0VarE.B(mcVar) ? 256 : 128) | (o0VarE.r(qVar) ? 2048 : 1024) | (o0VarE.r(aVar) ? 16384 : 8192) | (o0VarE.r(aVar2) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(qVar.f206417d, o0VarE);
            p1 p1VarC2 = p3.p0.c(qVar.f206419f, o0VarE, 0);
            p1 p1VarC3 = p3.p0.c(qVar.f206426m, o0VarE, 0);
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            p1 p1VarB = s9.c.b(qVar.f206430q, p13.j0.f134944a, o0VarE, 48);
            g.h hVar = new g.h();
            boolean zR = ((458752 & i15) == 131072) | o0VarE.r(qVar);
            Object objQ3 = o0VarE.q();
            if (zR || objQ3 == c2565a) {
                objQ3 = new yt.f(17, aVar2, qVar);
                o0VarE.K(objQ3);
            }
            c.q qVarC = c.w.c(hVar, (e23.l) objQ3, o0VarE, 0);
            List<yo1.i> listG = jVar.g();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listG.iterator();
            while (it.hasNext()) {
                li0.d0 d0VarH = ((yo1.i) it.next()).h();
                if (d0VarH != null) {
                    arrayList.add(d0VarH);
                }
            }
            qVar.f206415b.k(null, arrayList);
            r53.p2 p2Var = qVar.f206428o;
            p13.k0 k0Var = p13.k0.f134949a;
            k0Var.getClass();
            p2Var.k(null, k0Var);
            if (((Boolean) p1VarC2.getF182175a()).booleanValue()) {
                o0VarE.C(-372462819);
                Unit unit = Unit.INSTANCE;
                boolean zR2 = ((i15 & 57344) == 16384) | o0VarE.r(b0Var) | ((i15 & 896) == 256) | o0VarE.r(qVar);
                Object objQ4 = o0VarE.q();
                if (zR2 || objQ4 == p3.m.a.f135155b) {
                    v0 v0Var = new v0(b0Var, aVar, qVar, mcVar, null);
                    o0VarE.K(v0Var);
                    objQ4 = v0Var;
                }
                p3.l0.e((e23.p) objQ4, unit, o0VarE);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-372267736);
                o0VarE.g0(false);
            }
            o0Var = o0VarE;
            g02.s0.a(null, ((p) p1VarC.getF182175a()).f206409a, z3.f.c(-1120885596, new u0(qVar, jVar, p1VarB, p1VarC3, context, lVar, qVarC, p1Var, p1Var2, 0), o0VarE), o0Var, 384, 1);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z3.d(jVar, b0Var, mcVar, qVar, aVar, aVar2, lVar, i14, 1);
        }
    }
}
