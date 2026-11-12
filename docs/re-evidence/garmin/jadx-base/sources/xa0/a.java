package xa0;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import c2.b0;
import c2.j;
import c2.l;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import da0.p;
import h4.d;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.i7;
import i3.mh;
import j92.e;
import j92.f;
import java.util.List;
import o4.r1;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.c;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import u1.w;
import v.h;
import wv0.v;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0187  */
    /* JADX WARN: Code duplicated, block: B:50:0x018e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0192  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:64:0x0213  */
    /* JADX WARN: Code duplicated, block: B:66:0x021b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0223  */
    /* JADX WARN: Code duplicated, block: B:69:0x0267  */
    /* JADX WARN: Code duplicated, block: B:71:0x0277  */
    public static final void a(String str, n90.b bVar, r1 r1Var, e23.a<Unit> aVar, m mVar, int i14) {
        c<?> cVar;
        g.a.f fVar;
        int i15;
        int i16;
        int i17;
        int i18;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        boolean z14;
        String strP;
        f fVar2;
        boolean z15;
        String strJ;
        o0 o0VarE = mVar.E(1443786513);
        c<?> cVar2 = o0VarE.f135177b;
        int i19 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.k(bVar.ordinal()) ? 32 : 16) | (o0VarE.B(r1Var) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024);
        if (o0VarE.n(i19 & 1, (i19 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            r.a aVar2 = r.S;
            r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            r rVarE = u1.n.e(rVarF, d92.b.a(o0VarE).c().f(), r1Var);
            boolean z16 = (i19 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new v(aVar, 12);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new v(aVar, 12);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(rVarE, false, null, null, (e23.a) objQ, 15);
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            e eVar = j92.b.f97899b;
            r rVarY = l.y(rVarD, eVar.f97920e);
            d.f81522a.getClass();
            h4.g.b bVar3 = d.a.f81534l;
            j.f22691a.getClass();
            s2 s2VarA = q2.a(j.f22692b, bVar3, o0VarE, 48);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = k.c(rVarY, o0VarE);
            g.V.getClass();
            e0.a aVar3 = g.a.f81805b;
            if (cVar2 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            g.a.e eVar2 = g.a.f81810g;
            b4.c(eVar2, s2VarA, o0VarE);
            g.a.C1623g c1623g = g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            g.a.b bVar4 = g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                u2 u2Var = u2.f22900a;
                u4.d dVar = bVar.f125034e;
                i15 = bVar.f125033d;
                i16 = bVar.f125032c;
                i17 = bVar.f125030a;
                i18 = bVar.f125031b;
                long jB = d92.b.a(o0VarE).f().b();
                bVar2.getClass();
                r rVarC3 = l.C(aVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
                bVar2.getClass();
                i7.b(dVar, null, x2.q(rVarC3, j92.b.f97901d.f97905d), jB, o0VarE, 48, 0);
                zVarA = y.a(j.f22694d, d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(aVar2, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar3);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    h.A(iHashCode, o0VarE, iHashCode, bVar4);
                }
                b4.c(fVar, rVarC, o0VarE);
                b0 b0Var = b0.f22601a;
                if (i18 == 0) {
                    z14 = false;
                    strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -937950344, i17, o0VarE, false);
                } else {
                    z14 = false;
                    o0VarE.C(-937880749);
                    strP = gl1.y.P(i17, new Object[]{gl1.y.Q(o0VarE, i18)}, o0VarE);
                    o0VarE.g0(false);
                }
                String str2 = strP;
                fVar2 = d92.b.f58624b;
                fVar2.getClass();
                z15 = z14;
                mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                if (i16 != 0) {
                    o0VarE.C(-937592201);
                    if (i15 != 0) {
                        strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -937507354, i15, o0VarE, z15);
                    } else {
                        o0VarE.C(-937422011);
                        o0VarE.g0(z15);
                        strJ = str;
                    }
                    String strP2 = gl1.y.P(i16, new Object[]{strJ}, o0VarE);
                    fVar2.getClass();
                    mh.c(strP2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(z15);
                } else {
                    o0VarE.C(-937130921);
                    o0VarE.g0(z15);
                }
                o0VarE.g0(true);
                o0VarE.g0(true);
            }
            h.A(iHashCode2, o0VarE, iHashCode2, bVar4);
            fVar = g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            u2 u2Var2 = u2.f22900a;
            u4.d dVar2 = bVar.f125034e;
            i15 = bVar.f125033d;
            i16 = bVar.f125032c;
            i17 = bVar.f125030a;
            i18 = bVar.f125031b;
            long jB2 = d92.b.a(o0VarE).f().b();
            bVar2.getClass();
            r rVarC4 = l.C(aVar2, 0.0f, 0.0f, eVar.f97920e, 0.0f, 11);
            bVar2.getClass();
            i7.b(dVar2, null, x2.q(rVarC4, j92.b.f97901d.f97905d), jB2, o0VarE, 48, 0);
            zVarA = y.a(j.f22694d, d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(aVar2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            } else {
                h.A(iHashCode, o0VarE, iHashCode, bVar4);
            }
            b4.c(fVar, rVarC, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if (i18 == 0) {
                z14 = false;
                strP = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -937950344, i17, o0VarE, false);
            } else {
                z14 = false;
                o0VarE.C(-937880749);
                strP = gl1.y.P(i17, new Object[]{gl1.y.Q(o0VarE, i18)}, o0VarE);
                o0VarE.g0(false);
            }
            String str3 = strP;
            fVar2 = d92.b.f58624b;
            fVar2.getClass();
            z15 = z14;
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(f.f97931h, o0VarE), o0VarE, 0, 0, 131070);
            o0VarE = o0VarE;
            if (i16 != 0) {
                o0VarE.C(-937592201);
                if (i15 != 0) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, -937507354, i15, o0VarE, z15);
                } else {
                    o0VarE.C(-937422011);
                    o0VarE.g0(z15);
                    strJ = str;
                }
                String strP3 = gl1.y.P(i16, new Object[]{strJ}, o0VarE);
                fVar2.getClass();
                mh.c(strP3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(f.f97932i, o0VarE), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(z15);
            } else {
                o0VarE.C(-937130921);
                o0VarE.g0(z15);
            }
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w21.d(str, bVar, r1Var, aVar, i14, 22);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    public static final void b(String str, List<? extends n90.b> list, e23.l<? super n90.b, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1032874753);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(aVar) ? 2048 : 1024;
        }
        int i16 = 1;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = n.f135158a;
            String strQ = gl1.y.Q(o0VarE, R.string.title_complete_setup);
            String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_complete_setup);
            boolean z14 = (i15 & 7168) == 2048;
            Object objQ = o0VarE.q();
            if (z14) {
                objQ = new v(aVar, 11);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new v(aVar, 11);
                    o0VarE.K(objQ);
                }
            }
            o0Var = o0VarE;
            p.b("launchpad_screen", strQ, null, null, null, strQ2, (e23.a) objQ, false, null, null, false, null, null, false, false, null, null, null, null, null, null, z3.f.c(-1291350017, new c82.a(list, str, lVar, i16), o0VarE), o0Var, 6, 0, 384, 4194204);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ug0.c((Object) str, (Object) list, (Object) lVar, (Object) aVar, i14, 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(q90.c cVar, e23.l<? super n90.b, Unit> lVar, e23.a<Unit> aVar, m mVar, int i14) {
        cVar.getClass();
        lVar.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1799411038);
        int i15 = i14 | (o0VarE.r(cVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            boolean zR = o0VarE.r(cVar);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zR) {
                objQ = new a90.d(cVar, 5);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a90.d(cVar, 5);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            o0VarE.L(-1614864554);
            v9.a.f176280a.getClass();
            ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
            if (viewModelStoreOwnerA == null) {
                vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(b.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), aVar3);
            o0VarE.g0(false);
            p1 p1VarC = p0.c(((b) u1VarResolveViewModel).f189720c, o0VarE, 0);
            String str = cVar.f143495c.f111521f;
            List<n90.b> list = ((b.a) p1VarC.getF182175a()).f189722b;
            boolean z14 = (i15 & 896) == 256;
            Object objQ2 = o0VarE.q();
            if (z14) {
                objQ2 = new v(aVar, 10);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new v(aVar, 10);
                    o0VarE.K(objQ2);
                }
            }
            b(str, list, lVar, (e23.a) objQ2, o0VarE, (i15 << 3) & 896);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new vx1.b(cVar, lVar, aVar, i14, 26);
        }
    }
}
