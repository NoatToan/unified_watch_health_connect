package da0;

import b82.u0;
import c2.k3;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import i3.mh;
import i3.nj;
import i3.p7;
import java.util.Iterator;
import java.util.Locale;
import l72.i3;
import okhttp3.internal.http2.Http2Connection;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.y3;
import s5.x0;

/* JADX INFO: loaded from: classes8.dex */
public final class m0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public static final void a(h4.r rVar, i53.c cVar, i53.c cVar2, String str, e23.l lVar, p3.m mVar, int i14) {
        h4.r rVar2;
        o0 o0Var;
        p2 p2VarI0;
        i0 i0Var;
        p1 p1Var;
        h4.r.a aVar;
        ?? r14;
        long jC;
        boolean z14;
        int i15;
        float f14;
        h4.r.a aVar2;
        p1 p1Var2;
        o0 o0Var2;
        p1 p1Var3;
        o0 o0VarE = mVar.E(1438098627);
        p3.c<?> cVar3 = o0VarE.f135177b;
        int i16 = i14 | 6;
        if ((i14 & 48) == 0) {
            i16 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(cVar2) : o0VarE.r(cVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(str) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if (o0VarE.n(i16 & 1, (i16 & 9363) != 9362)) {
            h4.r.a aVar3 = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            boolean z15 = cVar2 == null || cVar2.isEmpty();
            boolean z16 = cVar == null || cVar.isEmpty();
            if (z15 && z16) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                } else {
                    i0Var = new i0(aVar3, cVar, cVar2, str, lVar, i14, 0);
                }
            } else {
                e23.l lVar2 = lVar;
                Object objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ);
                }
                p1 p1Var4 = (p1) objQ;
                float f15 = 8;
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarC = c2.l.C(aVar3, f15, 0.0f, 0.0f, 0.0f, 14);
                h4.r.a aVar5 = aVar3;
                float f16 = f15;
                h4.d.f81522a.getClass();
                h4.r rVarY = x2.y(rVarC, h4.d.a.f81526d, 2);
                z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(o0VarE.U);
                i2 i2VarA0 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarY, o0VarE);
                h5.g.V.getClass();
                h5.e0.a aVar6 = h5.g.a.f81805b;
                if (cVar3 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                h5.g.a.e eVar = h5.g.a.f81810g;
                b4.c(eVar, z0VarD, o0VarE);
                h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                h5.g.a.f fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarY2 = c2.l.y(aVar5, f16);
                c2.j.f22691a.getClass();
                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, o0VarE, 0);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarY2, o0VarE);
                if (cVar3 == null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar6);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                u2 u2Var = u2.f22900a;
                int i17 = 56;
                if (cVar == null) {
                    o0VarE.C(946612519);
                    o0VarE.g0(false);
                    r14 = 0;
                    p1Var = p1Var4;
                    aVar = aVar5;
                } else {
                    o0VarE.C(946612520);
                    Iterator<E> it = cVar.iterator();
                    o0 o0Var3 = o0VarE;
                    while (it.hasNext()) {
                        i3 i3Var = (i3) it.next();
                        u4.d dVar = i3Var.f111066d;
                        if (dVar != null) {
                            o0Var3.C(-636682896);
                            y3 y3Var = p7.f89282d;
                            g6.f.f75994b.getClass();
                            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-297753857, new j0(lVar2, i3Var, dVar, 0), o0Var3), o0Var3, i17);
                            o0Var3.g0(false);
                            i15 = i16;
                            p1Var2 = p1Var4;
                            aVar2 = aVar5;
                            f14 = f16;
                        } else {
                            o0Var3.C(-635928170);
                            if (i3Var.f111065c) {
                                o0Var3.C(-20511967);
                                d92.b.f58623a.getClass();
                                jC = d92.b.a(o0Var3).k().b();
                            } else {
                                o0Var3.C(-20510772);
                                d92.b.f58623a.getClass();
                                jC = o4.d0.c(0.5f, d92.b.a(o0Var3).k().b(), 14);
                            }
                            o0Var3.g0(false);
                            String upperCase = i3Var.f111064b.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0Var = j92.f.f97932i;
                            d6.h.f57752b.getClass();
                            int i18 = d6.h.f57758h;
                            h4.r.a aVar7 = h4.r.S;
                            boolean z17 = i3Var.f111065c;
                            boolean zR = ((57344 & i16) == 16384) | o0Var3.r(i3Var);
                            Object objQ2 = o0Var3.q();
                            if (zR || objQ2 == p3.m.a.f135155b) {
                                z14 = true;
                                objQ2 = new d0(lVar2, i3Var, 1);
                                o0Var3.K(objQ2);
                            } else {
                                z14 = true;
                            }
                            i15 = i16;
                            o0 o0Var4 = o0Var3;
                            f14 = f16;
                            aVar2 = aVar5;
                            p1Var2 = p1Var4;
                            mh.c(upperCase, c2.l.y(u1.w.d(aVar7, z17, null, null, (e23.a) objQ2, 14), f16), jC, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0Var, o0Var4, 0, 0, 130040);
                            o0Var3 = o0Var4;
                            o0Var3.g0(false);
                        }
                        lVar2 = lVar;
                        i16 = i15;
                        f16 = f14;
                        aVar5 = aVar2;
                        p1Var4 = p1Var2;
                        i17 = 56;
                        o0Var3 = o0Var3;
                    }
                    p1Var = p1Var4;
                    aVar = aVar5;
                    r14 = 0;
                    o0Var3.g0(false);
                    Unit unit = Unit.INSTANCE;
                    o0Var2 = o0Var3;
                }
                if (z15) {
                    o0Var2 = o0VarE;
                    p1Var3 = p1Var;
                    o0Var2.C(948541557);
                    o0Var2.g0(r14);
                } else {
                    o0Var2 = o0VarE;
                    o0Var2.C(948084121);
                    y3 y3Var2 = p7.f89282d;
                    g6.f.f75994b.getClass();
                    p1Var3 = p1Var;
                    p3.v.a(y3Var2.c(g6.f.a(g6.f.f75996d)), z3.f.c(526538440, new k0(r14, str, p1Var3), o0Var2), o0Var2, 56);
                    o0Var2.g0(r14);
                }
                o0Var2.g0(true);
                if (z15) {
                    o0Var2.C(-109144263);
                    o0Var2.g0(r14);
                } else {
                    o0Var2.C(-109883582);
                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    d92.b.f58623a.getClass();
                    long jG = d92.b.a(o0Var2).c().g();
                    Object objQ3 = o0Var2.q();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new cw1.k(p1Var3, 23);
                        o0Var2.K(objQ3);
                    }
                    i3.u.a(zBooleanValue, (e23.a) objQ3, null, 0L, null, null, null, jG, 0.0f, 0.0f, z3.f.c(-904845175, new l0(cVar2, lVar, p1Var3, r14), o0Var2), o0Var2, 48, 48, 1916);
                    o0Var2.g0(r14);
                }
                o0Var2.g0(true);
                x1 x1Var2 = p3.n.f135158a;
                rVar2 = aVar;
                o0Var = o0Var2;
            }
            p2VarI0.f135219d = i0Var;
        }
        o0VarE.e();
        rVar2 = rVar;
        o0Var = o0VarE;
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            i0Var = new i0(rVar2, cVar, cVar2, str, lVar, i14, 1);
            p2VarI0.f135219d = i0Var;
        }
    }

    public static final void b(int i14, e23.a aVar, String str, p3.m mVar, u4.d dVar) {
        int i15;
        e23.a aVar2;
        String str2;
        u4.d dVar2;
        o0 o0VarE = mVar.E(690117009);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(dVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(str) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(aVar) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            if (dVar == null) {
                p2 p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b0(i14, 0, aVar, str, dVar);
                    return;
                }
                return;
            }
            aVar2 = aVar;
            str2 = str;
            dVar2 = dVar;
            y3 y3Var = p7.f89282d;
            g6.f.f75994b.getClass();
            p3.v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-963109679, new c0(aVar2, dVar2, str2, 0), o0VarE), o0VarE, 56);
        } else {
            aVar2 = aVar;
            str2 = str;
            dVar2 = dVar;
            o0VarE.e();
        }
        p2 p2VarI1 = o0VarE.i0();
        if (p2VarI1 != null) {
            p2VarI1.f135219d = new b0(i14, 1, aVar2, str2, dVar2);
        }
    }

    public static final void c(float f14, p3.m mVar, int i14) {
        int i15;
        p2 p2VarI0;
        h hVar;
        o0 o0VarE = mVar.E(339337825);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(null) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.B(null) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            } else {
                hVar = new h(f14, i14, 1);
            }
        } else {
            o0VarE.e();
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 == null) {
                return;
            } else {
                hVar = new h(f14, i14, 2);
            }
        }
        p2VarI0.f135219d = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0185  */
    /* JADX WARN: Code duplicated, block: B:78:0x0189  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ed  */
    public static final void d(u4.d dVar, e23.a aVar, k3 k3Var, i53.c cVar, i53.c cVar2, e23.l lVar, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        e23.l lVar2;
        int i18;
        i53.c cVar3;
        i53.c cVar4;
        e23.l lVar3;
        k3 k3Var2;
        int i19;
        i53.c cVar5;
        k3 k3Var3;
        i53.c cVar6;
        e23.l lVar4;
        p3.c<?> cVar7;
        h5.g.a.f fVar;
        s2 s2VarA;
        i53.c cVar8;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        int i24;
        i53.c cVar9 = cVar;
        i53.c cVar10 = cVar2;
        o0 o0VarE = mVar.E(1858990205);
        p3.c<?> cVar11 = o0VarE.f135177b;
        int i25 = i14 | (o0VarE.B(dVar) ? 4 : 2) | 3504 | (o0VarE.r(aVar) ? 16384 : 8192);
        int i26 = 65536 | i25;
        int i27 = i15 & 64;
        if (i27 != 0) {
            i16 = i25 | 1638400;
        } else {
            i16 = ((i14 & 2097152) == 0 ? o0VarE.B(cVar9) : o0VarE.r(cVar9) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | i26;
        }
        int i28 = i15 & 128;
        if (i28 != 0) {
            i17 = 12582912;
        } else {
            i17 = (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) == 0 ? o0VarE.B(cVar10) : o0VarE.r(cVar10) ? 8388608 : 4194304;
        }
        int i29 = i16 | i17;
        int i30 = i15 & 256;
        if (i30 != 0) {
            i18 = i29 | 100663296;
            lVar2 = lVar;
        } else {
            lVar2 = lVar;
            i18 = i29 | (o0VarE.r(lVar2) ? 67108864 : 33554432);
        }
        if (o0VarE.n(i18 & 1, (38347923 & i18) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                nj.f89109a.getClass();
                c2.x1 x1VarA = nj.a(o0VarE);
                i19 = i18 & (-458753);
                if (i27 != 0) {
                    cVar9 = null;
                }
                if (i28 != 0) {
                    cVar10 = null;
                }
                if (i30 != 0) {
                    cVar5 = cVar9;
                    k3Var3 = x1VarA;
                    cVar6 = cVar10;
                    lVar4 = null;
                } else {
                    e23.l lVar5 = lVar2;
                    cVar5 = cVar9;
                    k3Var3 = x1VarA;
                    cVar6 = cVar10;
                    lVar4 = lVar5;
                }
            } else {
                o0VarE.e();
                i19 = i18 & (-458753);
                cVar6 = cVar10;
                lVar4 = lVar2;
                cVar5 = cVar9;
                k3Var3 = k3Var;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarB = x2.b(c2.l.G(x2.f(aVar2, 1.0f), k3Var3), 0.0f, 56, 1);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA2 = q2.a(c2.j.f22698h, bVar, o0VarE, 54);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar4 = h5.g.a.f81805b;
            if (cVar11 == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            k3 k3Var4 = k3Var3;
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA1, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            e23.l lVar6 = lVar4;
            if (o0VarE.T) {
                cVar7 = cVar11;
            } else {
                cVar7 = cVar11;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC2, o0VarE);
                h4.r rVarA = u2.f22900a.a(aVar2, 1.0f, true);
                s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
                cVar8 = cVar5;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarA, o0VarE);
                if (cVar7 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar4);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                }
                b4.c(fVar, rVarC, o0VarE);
                b((i19 & 14) | ((i19 >> 6) & 896), aVar, null, o0VarE, dVar);
                if (dVar != null) {
                    i24 = 8;
                } else {
                    i24 = 16;
                }
                c(i24, o0VarE, 54);
                o0VarE.g0(true);
                int i34 = i19 >> 15;
                a(null, cVar8, cVar6, null, lVar6, o0VarE, (i34 & 896) | (i34 & 112) | 576 | ((i19 >> 12) & 57344));
                o0VarE.g0(true);
                k3Var2 = k3Var4;
                cVar3 = cVar8;
                cVar4 = cVar6;
                lVar3 = lVar6;
            }
            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC2, o0VarE);
            h4.r rVarA2 = u2.f22900a.a(aVar2, 1.0f, true);
            s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            cVar8 = cVar5;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarA2, o0VarE);
            if (cVar7 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar4);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(fVar, rVarC, o0VarE);
            b((i19 & 14) | ((i19 >> 6) & 896), aVar, null, o0VarE, dVar);
            if (dVar != null) {
                i24 = 8;
            } else {
                i24 = 16;
            }
            c(i24, o0VarE, 54);
            o0VarE.g0(true);
            int i35 = i19 >> 15;
            a(null, cVar8, cVar6, null, lVar6, o0VarE, (i35 & 896) | (i35 & 112) | 576 | ((i19 >> 12) & 57344));
            o0VarE.g0(true);
            k3Var2 = k3Var4;
            cVar3 = cVar8;
            cVar4 = cVar6;
            lVar3 = lVar6;
        } else {
            o0VarE.e();
            cVar3 = cVar9;
            cVar4 = cVar10;
            lVar3 = lVar2;
            k3Var2 = k3Var;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0(dVar, aVar, k3Var2, cVar3, cVar4, lVar3, i14, i15, 2);
        }
    }
}
