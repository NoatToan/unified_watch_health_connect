package wv0;

import c2.b0;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import h5.e0;
import java.util.Iterator;
import l72.f0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import v62.s6;

/* JADX INFO: loaded from: classes9.dex */
public final class q {
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:68:0x0166  */
    public static final void a(i53.c<String> cVar, e23.l<? super Integer, Unit> lVar, e23.a<Unit> aVar, p3.m mVar, int i14) {
        int i15;
        int i16;
        cVar.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-1395010353);
        int i17 = i14 | (o0VarE.B(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i17 & 1, (i17 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (cVar.isEmpty() && aVar == null) {
                o0VarE.C(-649100333);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-649657713);
                h4.r.a aVar2 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC = h4.k.c(aVar2, o0VarE);
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
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                o0VarE.C(-1595598109);
                Iterator<String> it = cVar.iterator();
                int i18 = 0;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    p3.m.a aVar4 = p3.m.f135153a;
                    if (!zHasNext) {
                        o0VarE.g0(false);
                        if (aVar != null) {
                            o0VarE.C(2076272449);
                            f0.a aVar5 = f0.a.f111000a;
                            s62.a.f157643a.getClass();
                            u4.d dVarA = s6.a(t62.b.f162798a);
                            if (cVar.isEmpty()) {
                                i15 = -1595585560;
                                i16 = R.string.lte_add_details;
                            } else {
                                i15 = -1595586939;
                                i16 = R.string.lbl_add_more;
                            }
                            String strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, i15, i16, o0VarE, false);
                            boolean z14 = (i17 & 896) == 256;
                            Object objQ = o0VarE.q();
                            if (z14) {
                                objQ = new w51.j(aVar, 29);
                                o0VarE.K(objQ);
                            } else {
                                aVar4.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new w51.j(aVar, 29);
                                    o0VarE.K(objQ);
                                }
                            }
                            aVar5.k(0, 12, (e23.a) objQ, null, strJ, o0VarE, dVarA, false);
                            o0VarE = o0VarE;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(2076580930);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(true);
                        o0VarE.g0(false);
                        break;
                    }
                    String next = it.next();
                    int i19 = i18 + 1;
                    if (i18 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    String str = next;
                    f0.a aVar6 = f0.a.f111000a;
                    boolean zK = ((i17 & 112) == 32) | o0VarE.k(i18);
                    Object objQ2 = o0VarE.q();
                    if (zK) {
                        objQ2 = new au0.m(lVar, i18, 19);
                        o0VarE.K(objQ2);
                    } else {
                        aVar4.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new au0.m(lVar, i18, 19);
                            o0VarE.K(objQ2);
                        }
                    }
                    aVar6.m(str, null, false, (e23.a) objQ2, o0VarE, 0, 6);
                    i18 = i19;
                }
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(cVar, lVar, aVar, i14, 20);
        }
    }
}
