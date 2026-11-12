package c82;

import android.annotation.SuppressLint;
import b63.o;
import c2.b0;
import c2.q;
import c2.t;
import c2.v;
import c2.x2;
import c2.y;
import c2.z;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import f5.z0;
import h4.r;
import h5.e0;
import i3.e5;
import i3.i7;
import i3.mh;
import java.time.LocalDate;
import java.util.List;
import kotlin.t1;
import l4.k;
import l72.v2;
import o4.d0;
import o4.m1;
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
import p3.y3;
import s5.x0;
import u1.u;

/* JADX INFO: loaded from: classes9.dex */
public final class g {
    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void a(int i14, l lVar, r rVar, List list, m mVar) {
        int i15;
        list.getClass();
        o0 o0VarE = mVar.E(-1926809021);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = n.f135158a;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            if (objQ == m.a.f135155b) {
                objQ = new c63.n(21);
                o0VarE.K(objQ);
            }
            v.a(p5.v.c((l) objQ, rVar, true), null, false, z3.f.c(-479696359, new e(list, lVar, 0), o0VarE), o0VarE, 3072, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f(rVar, list, lVar, i14);
        }
    }

    @SuppressLint({"UnusedBoxWithConstraintsScope"})
    public static final void b(r rVar, List list, String str, l lVar, m mVar, int i14) {
        r rVar2;
        list.getClass();
        o0 o0VarE = mVar.E(256198140);
        int i15 = i14 | 6;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(list) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(str) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(lVar) ? 2048 : 1024;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            r.a aVar = r.S;
            x1 x1Var = n.f135158a;
            v.a(aVar, null, false, z3.f.c(-1956857498, new a(list, str, lVar, i16), o0VarE), o0VarE, (i15 & 14) | 3072, 6);
            rVar2 = aVar;
        } else {
            o0VarE.e();
            rVar2 = rVar;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a03.g(rVar2, list, str, lVar, i14, 28);
        }
    }

    public static final void c(r rVar, List list, m mVar, int i14) {
        list.getClass();
        o0 o0VarE = mVar.E(1939407664);
        int i15 = (o0VarE.B(rVar) ? 4 : 2) | i14 | (o0VarE.r(list) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            a((i15 & 112) | (i15 & 14) | 384, null, rVar, list, o0VarE);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(rVar, list, i14, 0, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:102:0x0305  */
    /* JADX WARN: Code duplicated, block: B:107:0x0323  */
    /* JADX WARN: Code duplicated, block: B:111:0x034a  */
    /* JADX WARN: Code duplicated, block: B:93:0x01df  */
    /* JADX WARN: Code duplicated, block: B:95:0x0213  */
    /* JADX WARN: Code duplicated, block: B:98:0x02f6  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(r rVar, boolean z14, h hVar, String str, String str2, boolean z15, e23.a<Unit> aVar, m mVar, int i14, int i15) {
        String str3;
        int i16;
        e23.a<Unit> aVar2;
        int i17;
        o0 o0Var;
        String str4;
        e23.a<Unit> aVar3;
        u uVarA;
        u uVar;
        h5.g.a.f fVar;
        boolean z16;
        e23.a<Unit> aVar4;
        String str5;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        h hVar2 = hVar;
        o0 o0VarE = mVar.E(1890827264);
        p3.c<?> cVar = o0VarE.f135177b;
        int i18 = i14 | (o0VarE.B(rVar) ? 4 : 2) | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.B(hVar2) ? 256 : 128) | (o0VarE.B(str) ? 2048 : 1024);
        int i19 = i15 & 16;
        if (i19 != 0) {
            i16 = i18 | 24576;
            str3 = str2;
        } else {
            str3 = str2;
            i16 = i18 | (o0VarE.B(str3) ? 16384 : 8192);
        }
        int i24 = i16 | (o0VarE.h(z15) ? 131072 : 65536);
        int i25 = i15 & 64;
        if (i25 != 0) {
            i17 = i24 | 1572864;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i17 = i24 | (o0VarE.r(aVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        if (o0VarE.n(i17 & 1, (599187 & i17) != 599186)) {
            String str6 = i19 != 0 ? "" : str3;
            if (i25 != 0) {
                aVar2 = null;
            }
            x1 x1Var = n.f135158a;
            d92.b.f58623a.getClass();
            long jG = d92.b.a(o0VarE).c().g();
            d92.b.f58624b.getClass();
            x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
            if (z14) {
                x0VarF = d92.c.e(x0VarF);
            }
            x0 x0VarA = x0VarF;
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar = (a2.j) objQ;
            p1 p1VarI = zf.b.i(jVar, o0VarE, 6);
            p1 p1VarK = xy2.b.k(jVar, o0VarE, 6);
            long j8 = d92.b.d(o0VarE) ? zl.a.b(o0VarE, 313856299, o0VarE).f63508c : zl.a.b(o0VarE, 313857355, o0VarE).f63509d;
            o0VarE.g0(false);
            if (((Boolean) p1VarI.getF182175a()).booleanValue() || ((Boolean) p1VarK.getF182175a()).booleanValue() || z15) {
                g6.f.a aVar5 = g6.f.f75994b;
                uVarA = u1.n.a(2, j8);
            } else {
                uVarA = null;
            }
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            k2.h hVarA = k2.i.a(eVar.f97917b);
            r rVarB = k.b(rVar, hVarA);
            d0.f128823b.getClass();
            r rVarE = u1.n.e(rVarB, d0.f128831j, hVarA);
            boolean z17 = (57344 & i17) == 16384;
            Object objQ2 = o0VarE.q();
            if (z17 || objQ2 == c2565a) {
                objQ2 = new b(str6, 0);
                o0VarE.K(objQ2);
            }
            r rVarC2 = p5.v.c((l) objQ2, rVarE, true);
            h4.d.f81522a.getClass();
            h4.g.a aVar6 = h4.d.a.f81537o;
            c2.j jVar2 = c2.j.f22691a;
            bVar.getClass();
            float f14 = eVar.f97917b;
            jVar2.getClass();
            z zVarA = y.a(c2.j.i(f14), aVar6, o0VarE, 48);
            int i26 = i17;
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC3 = h4.k.c(rVarC2, o0VarE);
            h5.g.V.getClass();
            e0.a aVar7 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                uVar = uVarA;
            } else {
                uVar = uVarA;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                b0 b0Var = b0.f22601a;
                if (z14) {
                    o0VarE.C(-215410734);
                    x0VarA = x0.a(x0VarA, d92.b.a(o0VarE).h().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    z16 = false;
                } else {
                    z16 = false;
                    o0VarE.C(-215409292);
                }
                o0VarE.g0(z16);
                x0 x0Var = x0VarA;
                r.a aVar8 = r.S;
                g6.f.a aVar9 = g6.f.f75994b;
                aVar4 = aVar2;
                str5 = str6;
                mh.c(str, c2.l.z(v2.a(aVar8, z14, new bk0.i(6), o0VarE, (i26 & 112) | 6), 4, (float) 2.5d), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i26 >> 9) & 14, 0, 131068);
                r rVarT = x2.t(aVar8, 46, 40, 0.0f, 12);
                bVar.getClass();
                r rVarE2 = u1.n.e(v2.b(v2.b(k.b(c2.l.C(rVarT, 0.0f, eVar.f97916a, 0.0f, 0.0f, 13), hVarA), aVar4, new a6.c(jVar, 3), o0VarE, (i26 >> 15) & 112), uVar, new a6.c(hVarA, 4), o0VarE, 0), jG, m1.f128891a);
                bVar.getClass();
                r rVarY = c2.l.y(rVarE2, eVar.f97918c);
                z0VarD = q.d(h4.d.a.f81524b, false);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarY, o0VarE);
                if (cVar != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar7);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                hVar2 = hVar;
                e(c2.u.f22885a, hVar2, o0VarE, 6 | ((i26 >> 3) & 112));
                o0VarE.g0(true);
                o0VarE.g0(true);
                str4 = str5;
                o0Var = o0VarE;
                aVar3 = aVar4;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            b0 b0Var2 = b0.f22601a;
            if (z14) {
                o0VarE.C(-215410734);
                x0VarA = x0.a(x0VarA, d92.b.a(o0VarE).h().a(), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                z16 = false;
            } else {
                z16 = false;
                o0VarE.C(-215409292);
            }
            o0VarE.g0(z16);
            x0 x0Var2 = x0VarA;
            r.a aVar10 = r.S;
            g6.f.a aVar11 = g6.f.f75994b;
            aVar4 = aVar2;
            str5 = str6;
            mh.c(str, c2.l.z(v2.a(aVar10, z14, new bk0.i(6), o0VarE, (i26 & 112) | 6), 4, (float) 2.5d), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var2, o0VarE, (i26 >> 9) & 14, 0, 131068);
            r rVarT2 = x2.t(aVar10, 46, 40, 0.0f, 12);
            bVar.getClass();
            r rVarE3 = u1.n.e(v2.b(v2.b(k.b(c2.l.C(rVarT2, 0.0f, eVar.f97916a, 0.0f, 0.0f, 13), hVarA), aVar4, new a6.c(jVar, 3), o0VarE, (i26 >> 15) & 112), uVar, new a6.c(hVarA, 4), o0VarE, 0), jG, m1.f128891a);
            bVar.getClass();
            r rVarY2 = c2.l.y(rVarE3, eVar.f97918c);
            z0VarD = q.d(h4.d.a.f81524b, false);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarY2, o0VarE);
            if (cVar != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar7);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            hVar2 = hVar;
            e(c2.u.f22885a, hVar2, o0VarE, 6 | ((i26 >> 3) & 112));
            o0VarE.g0(true);
            o0VarE.g0(true);
            str4 = str5;
            o0Var = o0VarE;
            aVar3 = aVar4;
        } else {
            o0VarE.e();
            o0Var = o0VarE;
            str4 = str3;
            aVar3 = aVar2;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(rVar, z14, hVar2, str, str4, z15, aVar3, i14, i15);
        }
    }

    public static final void e(t tVar, h hVar, m mVar, int i14) {
        int i15;
        float f75992b;
        u4.d dVar;
        boolean z14;
        float f75992b2;
        o0 o0VarE = mVar.E(-1010877108);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(tVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(hVar) ? 32 : 16;
        }
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = n.f135158a;
            y3 y3Var = t1.f91490h;
            if (((g6.c) o0VarE.A(y3Var)).getF75992b() > 1.2d) {
                o0VarE.C(1270973552);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f75992b = ((g6.c) o0VarE.A(y3Var)).getF75992b() * j92.b.f97901d.f97903b;
                g6.f.a aVar = g6.f.f75994b;
                o0VarE.g0(false);
            } else {
                o0VarE.C(1271047921);
                o0VarE.g0(false);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f75992b = j92.b.f97901d.f97903b;
            }
            r.a aVar2 = r.S;
            r rVarQ = x2.q(aVar2, f75992b);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81528f;
            r rVarC = tVar.c(rVarQ, gVar);
            if (hVar instanceof h.f) {
                o0VarE.C(1272705398);
                o0VarE.g0(false);
            } else {
                o0VarE.C(1271273508);
                if (hVar instanceof h.d) {
                    dVar = ((h.d) hVar).f25733a;
                } else if (hVar instanceof h.a) {
                    dVar = ((h.a) hVar).f25730a;
                } else {
                    dVar = hVar instanceof h.e ? ((h.e) hVar).f25734a : null;
                }
                if (dVar != null) {
                    o0VarE.C(1271549873);
                    i7.b(dVar, null, rVarC, hb.a.d(d92.b.f58623a, o0VarE), o0VarE, 48, 0);
                    o0VarE.g0(false);
                    z14 = false;
                } else if (hVar instanceof h.g) {
                    o0VarE.C(1271815481);
                    r rVarC2 = tVar.c(aVar2, gVar);
                    String strValueOf = String.valueOf(((h.g) hVar).f25736a);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(strValueOf, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, o0VarE), o0VarE, 0, 0, 131068);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                    z14 = false;
                } else {
                    z14 = false;
                    if (hVar instanceof h.c) {
                        o0VarE.C(1272065558);
                        if (((g6.c) o0VarE.A(y3Var)).getF75992b() > 1.2d) {
                            o0VarE.C(1272141663);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f75992b2 = ((g6.c) o0VarE.A(y3Var)).getF75992b() * j92.b.f97901d.f97902a;
                            g6.f.a aVar3 = g6.f.f75994b;
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(1272232896);
                            o0VarE.g0(false);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            f75992b2 = j92.b.f97901d.f97902a;
                        }
                        q.a(x2.q(u1.n.e(tVar.c(aVar2, gVar), hb.a.d(d92.b.f58623a, o0VarE), k2.i.f102406a), f75992b2), o0VarE, 0);
                        o0VarE.g0(false);
                    } else if (hVar instanceof h.b) {
                        o0VarE.C(1272577399);
                        r rVarC3 = tVar.c(aVar2, gVar);
                        z0 z0VarD = q.d(h4.d.a.f81524b, false);
                        int iHashCode = Long.hashCode(o0VarE.U);
                        i2 i2VarA0 = o0VarE.a0();
                        r rVarC4 = h4.k.c(rVarC3, o0VarE);
                        h5.g.V.getClass();
                        e0.a aVar4 = h5.g.a.f81805b;
                        if (o0VarE.f135177b == null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar4);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        h5.g.a.b bVar = h5.g.a.f81813j;
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC4, o0VarE);
                        c2.u uVar = c2.u.f22885a;
                        e5.r(0, ((h.b) hVar).f25731a, o0VarE, true, false);
                    } else {
                        o0VarE.C(1272699446);
                        o0VarE.g0(false);
                    }
                }
                o0VarE.g0(z14);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.r(tVar, hVar, i14, 10);
        }
    }

    public static final boolean f(o oVar, o oVar2) {
        LocalDate localDate = oVar.f16206a;
        if (oVar2 != null) {
            LocalDate localDate2 = oVar2.f16206a;
            boolean z14 = localDate.getYear() == localDate2.getYear();
            boolean z15 = oVar.c() == oVar2.c();
            boolean z16 = localDate.getDayOfMonth() == localDate2.getDayOfMonth();
            if (z14 && z15 && z16) {
                return true;
            }
        }
        return false;
    }
}
