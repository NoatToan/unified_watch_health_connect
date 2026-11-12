package pp;

import b82.f0;
import b82.u0;
import c2.j;
import c2.q;
import c2.u;
import c2.x2;
import c42.d0;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.h6;
import java.util.List;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    public static final void a(r rVar, mp.a aVar, l lVar, m mVar, int i14) {
        lVar.getClass();
        o0 o0VarE = mVar.E(2123137805);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.B(aVar) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            mp.b bVar = aVar != null ? aVar.f119946a : null;
            i53.c<mp.b> cVar = aVar != null ? aVar.f119947b : null;
            if (bVar != null && cVar != null) {
                boolean z14 = (i15 & 896) == 256;
                Object objQ = o0VarE.q();
                if (z14) {
                    objQ = new na0.l(lVar, 29);
                    o0VarE.K(objQ);
                } else {
                    m.f135153a.getClass();
                    if (objQ == m.a.f135155b) {
                        objQ = new na0.l(lVar, 29);
                        o0VarE.K(objQ);
                    }
                }
                b(rVar, bVar, cVar, (l) objQ, o0VarE, i15 & 14, 0);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(rVar, aVar, lVar, i14, 29);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    public static final void b(r rVar, mp.b bVar, List<? extends mp.b> list, l<? super mp.b, Unit> lVar, m mVar, int i14, int i15) {
        r rVar2;
        int i16;
        r rVar3;
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-535944033);
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 6;
            rVar2 = rVar;
        } else if ((i14 & 6) == 0) {
            rVar2 = rVar;
            i16 = i14 | (o0VarE.B(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i16 = i14;
        }
        int i18 = i16 | (o0VarE.B(bVar) ? 32 : 16) | (o0VarE.r(list) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024);
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            r rVar4 = i17 != 0 ? r.S : rVar2;
            x1 x1Var = n.f135158a;
            r rVarF = x2.f(rVar4, 1.0f);
            h4.d.f81522a.getClass();
            z0 z0VarD = q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
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
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar = u.f22885a;
            r rVarZ = x2.z(r.S, null, 3);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            r rVarA = c2.l.A(rVarZ, j92.b.f97899b.f97918c, 0.0f, 2);
            j.f22691a.getClass();
            j.C0343j c0343j = j.f22692b;
            pa0.b bVar3 = new pa0.b(21);
            boolean zR = o0VarE.r(list) | ((i18 & 7168) == 2048);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new d0(lVar, list, 5);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new d0(lVar, list, 5);
                    o0VarE.K(objQ);
                }
            }
            int i19 = i18 << 6;
            c(rVarA, c0343j, 0, bVar, list, bVar3, (l) objQ, o0VarE, (i19 & 7168) | 48 | (i19 & 57344));
            o0VarE.g0(true);
            rVar3 = rVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(rVar3, bVar, list, lVar, i14, i15, 23);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(r rVar, j.e eVar, int i14, mp.b bVar, List list, pa0.b bVar2, l lVar, m mVar, int i15) {
        int i16;
        o0 o0Var;
        int i17;
        rVar.getClass();
        eVar.getClass();
        list.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-814110206);
        if ((i15 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= o0VarE.B(eVar) ? 32 : 16;
        }
        int i18 = i16 | 384;
        if ((i15 & 3072) == 0) {
            i18 |= (i15 & 4096) == 0 ? o0VarE.B(bVar) : o0VarE.r(bVar) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= o0VarE.r(list) ? 16384 : 8192;
        }
        if ((196608 & i15) == 0) {
            i18 |= o0VarE.r(bVar2) ? 131072 : 65536;
        }
        if ((1572864 & i15) == 0) {
            i18 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i19 = i18;
        if (o0VarE.n(i19 & 1, (599187 & i19) != 599186)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(Boolean.FALSE);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) objQ;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = new b(p1Var, 0);
                o0VarE.K(objQ2);
            }
            z3.e eVarC = z3.f.c(-1605317480, new c(rVar, eVar, bVar2, bVar, i19, p1Var, list, lVar), o0VarE);
            int i24 = ((i19 << 6) & 896) | 3120;
            o0Var = o0VarE;
            h6.a(zBooleanValue, (l) objQ2, rVar, eVarC, o0Var, i24, 0);
            i17 = Integer.MAX_VALUE;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            i17 = i14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(rVar, eVar, i17, bVar, list, bVar2, lVar, i15);
        }
    }
}
