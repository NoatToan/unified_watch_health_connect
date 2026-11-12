package n40;

import am.i1;
import b21.m9;
import c2.b0;
import c2.y;
import c2.z;
import c22.x0;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import ew0.u;
import ew1.z1;
import h4.r;
import h5.e0;
import ho.d0;
import java.util.List;
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

/* JADX INFO: loaded from: classes8.dex */
public final class n {
    public static final void a(com.garmin.android.apps.connectmobile.courses.model.h hVar, boolean z14, boolean z15, e23.a<Unit> aVar, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(674612240);
        int i15 = 2;
        int i16 = i14 | (o0VarE.k(hVar.ordinal()) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.h(z15) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i16 & 1, (i16 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = i16 << 15;
            p2.f111205a.g(gl1.d.T(hVar.f32967c, o0VarE, 0), null, null, z3.f.c(898617444, new ap2.f(hVar, z15, 11), o0VarE), z3.f.c(1074945701, new u(i15, z15, z14), o0VarE), z15, z14, aVar, o0VarE, ((i16 << 9) & 458752) | 27648 | (3670016 & i17) | (i17 & 234881024), TsExtractor.TS_STREAM_TYPE_SPLICE_INFO);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ha0.e(hVar, z14, z15, aVar, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(boolean z14, i53.c<? extends com.garmin.android.apps.connectmobile.courses.model.h> cVar, p<? super Boolean, ? super i53.c<? extends com.garmin.android.apps.connectmobile.courses.model.h>, Unit> pVar, p3.m mVar, int i14) {
        p<? super Boolean, ? super i53.c<? extends com.garmin.android.apps.connectmobile.courses.model.h>, Unit> pVar2;
        Object d0Var;
        int i15;
        com.garmin.android.apps.connectmobile.courses.model.h hVar;
        p<? super Boolean, ? super i53.c<? extends com.garmin.android.apps.connectmobile.courses.model.h>, Unit> pVar3 = pVar;
        cVar.getClass();
        pVar3.getClass();
        o0 o0VarE = mVar.E(-1907592559);
        int i16 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.B(cVar) ? 32 : 16) | (o0VarE.r(pVar3) ? 256 : 128);
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            boolean z15 = (i16 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z15) {
                objQ = new m9(z14, 1);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new m9(z14, 1);
                    o0VarE.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            boolean z16 = (i16 & 112) == 32;
            Object objQ2 = o0VarE.q();
            if (z16) {
                objQ2 = new m82.a(cVar, 1);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new m82.a(cVar, 1);
                    o0VarE.K(objQ2);
                }
            }
            p1 p1Var2 = (p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 0);
            r.a aVar2 = r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(aVar2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            p2 p2Var = p2.f111205a;
            x0.f23314a.getClass();
            String strW = gl1.d.W(x0.Zc);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(aVar2, 0.0f, j92.b.f97899b.f97920e, 1);
            z3.e eVarC = z3.f.c(1839021360, new w(p1Var, 11), o0VarE);
            int i17 = i16 & 896;
            boolean zB = o0VarE.B(p1Var) | (i17 == 256) | o0VarE.B(p1Var2);
            Object objQ3 = o0VarE.q();
            if (zB) {
                objQ3 = new z1(pVar3, p1Var, p1Var2, 2);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new z1(pVar3, p1Var, p1Var2, 2);
                    o0VarE.K(objQ3);
                }
            }
            int i18 = 256;
            boolean z17 = false;
            p2Var.g(strW, rVarA, null, null, eVarC, false, false, (e23.a) objQ3, o0VarE, 24576, 236);
            o0VarE.C(148127408);
            w13.c cVar2 = com.garmin.android.apps.connectmobile.courses.model.h.f32964x;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            while (bVarN.hasNext()) {
                com.garmin.android.apps.connectmobile.courses.model.h hVar2 = (com.garmin.android.apps.connectmobile.courses.model.h) bVarN.next();
                boolean zContains = ((List) p1Var2.getF182175a()).contains(hVar2);
                boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                boolean zK = o0VarE.k(hVar2.ordinal()) | o0VarE.B(p1Var2) | (i17 == i18 ? true : z17) | o0VarE.B(p1Var);
                Object objQ4 = o0VarE.q();
                if (zK) {
                    i15 = i17;
                    hVar = hVar2;
                    d0Var = new d0((Object) hVar, (Object) pVar3, (Object) p1Var2, (Object) p1Var, 23, (byte) 0);
                    o0VarE.K(d0Var);
                } else {
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        i15 = i17;
                        hVar = hVar2;
                        d0Var = new d0((Object) hVar, (Object) pVar3, (Object) p1Var2, (Object) p1Var, 23, (byte) 0);
                        o0VarE.K(d0Var);
                    } else {
                        hVar = hVar2;
                        i15 = i17;
                        d0Var = objQ4;
                    }
                }
                a(hVar, zContains, zBooleanValue, (e23.a) d0Var, o0VarE, 0);
                pVar3 = pVar;
                i17 = i15;
                z17 = z17;
                p1Var = p1Var;
                i18 = i18;
                p1Var2 = p1Var2;
            }
            pVar2 = pVar3;
            o0VarE = o0VarE;
            o0VarE.g0(z17);
            o0VarE.g0(true);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            pVar2 = pVar3;
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i1(z14, (i53.c) cVar, (p) pVar2, i14);
        }
    }
}
