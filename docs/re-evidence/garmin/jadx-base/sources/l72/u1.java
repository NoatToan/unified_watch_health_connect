package l72;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes9.dex */
public final class u1 {
    public static final void a(long j8, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(973519568);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 24, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar, 16), k2.i.f102406a), j8, o4.m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.h(j8, i14, i16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x009a  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0110  */
    /* JADX WARN: Code duplicated, block: B:55:0x0114  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:64:0x014b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0191  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:70:0x019c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    public static final void b(final int i14, final int i15, final int i16, final int i17, final long j8, p3.m mVar, boolean z14) {
        int i18;
        boolean z15;
        int i19;
        int i24;
        int i25;
        boolean z16;
        final boolean z17;
        p3.p2 p2VarI0;
        h4.r.a aVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.s2 s2VarA;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        h82.r rVar;
        f5.z0 z0VarD;
        int iHashCode3;
        p3.i2 i2VarA2;
        h4.r rVarC3;
        p3.o0 o0VarE = mVar.E(-785748759);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i16 & 6) == 0) {
            i18 = i16 | (o0VarE.l(j8) ? 4 : 2);
        } else {
            i18 = i16;
        }
        int i26 = i17 & 2;
        if (i26 == 0) {
            if ((i16 & 48) == 0) {
                z15 = z14;
                i18 |= o0VarE.h(z15) ? 32 : 16;
            }
            if (o0VarE.k(i14)) {
                i19 = 256;
            } else {
                i19 = 128;
            }
            int i27 = i18 | i19;
            if (o0VarE.k(i15)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i25 = i27 | i24;
            if ((i25 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i25 & 1, z16)) {
                if (i26 != 0) {
                    z15 = false;
                }
                p3.x1 x1Var = p3.n.f135158a;
                aVar = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    cVar = cVar2;
                } else {
                    cVar = cVar2;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.g.b bVar2 = h4.d.a.f81534l;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarC4 = c2.l.C(aVar, 16, 0.0f, 0.0f, 0.0f, 14);
                    s2VarA = c2.q2.a(c2.j.f22692b, bVar2, o0VarE, 48);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarC4, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, s2VarA, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u2 u2Var = c2.u2.f22900a;
                    if (z15) {
                        o0VarE.C(-1520523938);
                        c(j8, o0VarE, i25 & 14);
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(-1520465410);
                        a(j8, o0VarE, i25 & 14);
                        o0VarE.g0(false);
                    }
                    rVar = h82.r.f82497a;
                    rVar.t(i14, o0VarE, ((i25 >> 6) & 14) | 48);
                    o0VarE.g0(true);
                    h4.r rVarC5 = c2.l.C(aVar, 32, 0.0f, 0.0f, 0.0f, 14);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarC5, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    rVar.A(i15, o0VarE, ((i25 >> 9) & 14) | 48);
                    o0VarE.g0(true);
                    o0VarE.g0(true);
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var2 = c2.b0.f22601a;
                h4.g.b bVar3 = h4.d.a.f81534l;
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarC6 = c2.l.C(aVar, 16, 0.0f, 0.0f, 0.0f, 14);
                s2VarA = c2.q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC6, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u2 u2Var2 = c2.u2.f22900a;
                if (z15) {
                    o0VarE.C(-1520523938);
                    c(j8, o0VarE, i25 & 14);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1520465410);
                    a(j8, o0VarE, i25 & 14);
                    o0VarE.g0(false);
                }
                rVar = h82.r.f82497a;
                rVar.t(i14, o0VarE, ((i25 >> 6) & 14) | 48);
                o0VarE.g0(true);
                h4.r rVarC7 = c2.l.C(aVar, 32, 0.0f, 0.0f, 0.0f, 14);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC7, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                rVar.A(i15, o0VarE, ((i25 >> 9) & 14) | 48);
                o0VarE.g0(true);
                o0VarE.g0(true);
            } else {
                o0VarE.e();
            }
            z17 = z15;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.t1
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iT = p3.p0.t(i16 | 1);
                        u1.b(i14, i15, iT, i17, j8, (p3.m) obj, z17);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i18 |= 48;
        z15 = z14;
        if (o0VarE.k(i14)) {
            i19 = 256;
        } else {
            i19 = 128;
        }
        int i28 = i18 | i19;
        if (o0VarE.k(i15)) {
            i24 = 2048;
        } else {
            i24 = 1024;
        }
        i25 = i28 | i24;
        if ((i25 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i25 & 1, z16)) {
            if (i26 != 0) {
                z15 = false;
            }
            p3.x1 x1Var2 = p3.n.f135158a;
            aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar2 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar2 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                h4.g.b bVar4 = h4.d.a.f81534l;
                g6.f.a aVar5 = g6.f.f75994b;
                h4.r rVarC8 = c2.l.C(aVar, 16, 0.0f, 0.0f, 0.0f, 14);
                s2VarA = c2.q2.a(c2.j.f22692b, bVar4, o0VarE, 48);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarC8, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, s2VarA, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u2 u2Var3 = c2.u2.f22900a;
                if (z15) {
                    o0VarE.C(-1520523938);
                    c(j8, o0VarE, i25 & 14);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(-1520465410);
                    a(j8, o0VarE, i25 & 14);
                    o0VarE.g0(false);
                }
                rVar = h82.r.f82497a;
                rVar.t(i14, o0VarE, ((i25 >> 6) & 14) | 48);
                o0VarE.g0(true);
                h4.r rVarC9 = c2.l.C(aVar, 32, 0.0f, 0.0f, 0.0f, 14);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC9, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                rVar.A(i15, o0VarE, ((i25 >> 9) & 14) | 48);
                o0VarE.g0(true);
                o0VarE.g0(true);
            } else {
                cVar = cVar2;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var4 = c2.b0.f22601a;
            h4.g.b bVar5 = h4.d.a.f81534l;
            g6.f.a aVar6 = g6.f.f75994b;
            h4.r rVarC10 = c2.l.C(aVar, 16, 0.0f, 0.0f, 0.0f, 14);
            s2VarA = c2.q2.a(c2.j.f22692b, bVar5, o0VarE, 48);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(rVarC10, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, s2VarA, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u2 u2Var4 = c2.u2.f22900a;
            if (z15) {
                o0VarE.C(-1520523938);
                c(j8, o0VarE, i25 & 14);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1520465410);
                a(j8, o0VarE, i25 & 14);
                o0VarE.g0(false);
            }
            rVar = h82.r.f82497a;
            rVar.t(i14, o0VarE, ((i25 >> 6) & 14) | 48);
            o0VarE.g0(true);
            h4.r rVarC11 = c2.l.C(aVar, 32, 0.0f, 0.0f, 0.0f, 14);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = h4.k.c(rVarC11, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar4 = c2.u.f22885a;
            rVar.A(i15, o0VarE, ((i25 >> 9) & 14) | 48);
            o0VarE.g0(true);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        z17 = z15;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.t1
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i16 | 1);
                    u1.b(i14, i15, iT, i17, j8, (p3.m) obj, z17);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void c(long j8, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(116374571);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            h4.r rVarC = c2.l.C(aVar, 0.0f, 24, 0.0f, 0.0f, 13);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
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
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            c2.q.a(u1.n.e(c2.x2.q(aVar, 16), j8, o4.m1.f128891a), o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d70.h(j8, i14, 3);
        }
    }

    public static final void d(c2.t2 t2Var, o4.d0 d0Var, String str, float f14, p3.m mVar, int i14, int i15) {
        o4.d0 d0Var2;
        int i16;
        p3.o0 o0Var;
        o4.d0 d0Var3;
        boolean z14;
        t2Var.getClass();
        str.getClass();
        p3.o0 o0VarE = mVar.E(1498545581);
        p3.c<?> cVar = o0VarE.f135177b;
        int i17 = i15 & 1;
        if (i17 != 0) {
            i16 = i14 | 48;
            d0Var2 = d0Var;
        } else {
            d0Var2 = d0Var;
            i16 = i14 | (o0VarE.B(d0Var2) ? 32 : 16);
        }
        int i18 = i16 | (o0VarE.B(str) ? 256 : 128);
        if (o0VarE.n(i18 & 1, (i18 & 1171) != 1170)) {
            o4.d0 d0Var4 = i17 != 0 ? null : d0Var2;
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarA = t2Var.a(aVar, f14, true);
            h4.d.f81522a.getClass();
            h4.g gVar = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
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
            b4.c(fVar, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (d0Var4 != null) {
                o0VarE.C(889408401);
                g6.f.a aVar3 = g6.f.f75994b;
                h4.r rVarC2 = c2.l.C(aVar, 0.0f, 9, 0.0f, 0.0f, 13);
                f5.z0 z0VarD2 = c2.q.d(gVar, false);
                int iHashCode2 = Long.hashCode(o0VarE.U);
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarC2, o0VarE);
                if (cVar == null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.q.a(u1.n.e(l4.k.b(c2.x2.q(aVar, 14), k2.i.f102406a), d0Var4.f128833a, o4.m1.f128891a), o0VarE, 0);
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                z14 = true;
                o0VarE.C(889713999);
                o0VarE.g0(false);
            }
            float f15 = d0Var4 != null ? 32 : 8;
            g6.f.a aVar4 = g6.f.f75994b;
            j92.f.f97924a.getClass();
            s5.x0 x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
            float f16 = 4;
            boolean z15 = z14;
            mh.c(str, c2.l.B(aVar, f15, f16, 8, f16), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0VarE, (i18 >> 6) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(z15);
            d0Var3 = d0Var4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            d0Var3 = d0Var2;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new bn1.f(t2Var, d0Var3, str, f14, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01af  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0222  */
    /* JADX WARN: Code duplicated, block: B:118:0x0272  */
    /* JADX WARN: Code duplicated, block: B:120:0x0279  */
    /* JADX WARN: Code duplicated, block: B:121:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x029e  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:138:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:141:0x02dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x02d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x012e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0135  */
    /* JADX WARN: Code duplicated, block: B:88:0x0139  */
    /* JADX WARN: Code duplicated, block: B:93:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:98:0x01a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    public static final void e(final h4.r rVar, final int i14, long j8, final float f14, final List<String> list, s5.x0 x0Var, final List<Float> list2, p3.m mVar, final int i15, final int i16) {
        s5.x0 x0VarF;
        boolean z14;
        final long j14;
        final s5.x0 x0Var2;
        p3.o0 o0Var;
        p3.p2 p2VarI0;
        long j15;
        s5.x0 x0Var3;
        c2.s2 s2VarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        h5.g.a.f fVar;
        c2.u2 u2Var;
        int i17;
        boolean z15;
        boolean z16;
        int i18;
        p3.o0 o0Var2;
        ?? r14;
        int i19;
        String str;
        c2.z zVarA;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        h5.e0.a aVar2;
        h5.g.a.b bVar2;
        c2.z zVarA2;
        int iHashCode3;
        p3.i2 i2VarA2;
        h4.r rVarC3;
        int i24;
        int i25;
        int i26;
        p3.o0 o0VarE = mVar.E(1813346076);
        p3.c<?> cVar = o0VarE.f135177b;
        int i27 = (i15 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i15 : i15;
        if ((i15 & 48) == 0) {
            i27 |= o0VarE.k(i14) ? 32 : 16;
        }
        int i28 = i16 & 4;
        if (i28 == 0) {
            if ((i15 & 384) == 0) {
                i27 |= o0VarE.l(j8) ? 256 : 128;
            }
            if ((i15 & 3072) == 0) {
                if (o0VarE.i(f14)) {
                    i26 = 2048;
                } else {
                    i26 = 1024;
                }
                i27 |= i26;
            }
            if ((i15 & 24576) != 0) {
                if (o0VarE.r(list)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i27 |= i25;
            }
            if ((196608 & i15) == 0) {
                if ((i16 & 32) == 0) {
                    x0VarF = x0Var;
                    int i29 = o0VarE.B(x0VarF) ? 131072 : 65536;
                    i27 |= i29;
                } else {
                    x0VarF = x0Var;
                }
                i27 |= i29;
            } else {
                x0VarF = x0Var;
            }
            if ((1572864 & i15) == 0) {
                if (o0VarE.r(list2)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i27 |= i24;
            }
            if ((599187 & i27) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i27 & 1, z14)) {
                o0VarE.G0();
                if ((i15 & 1) != 0 || o0VarE.o0()) {
                    if (i28 != 0) {
                        o4.d0.f128823b.getClass();
                        j15 = o4.d0.f128832k;
                    } else {
                        j15 = j8;
                    }
                    if ((i16 & 32) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i27 &= -458753;
                        x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
                    }
                    x0Var3 = x0VarF;
                    j14 = j15;
                } else {
                    o0VarE.e();
                    if ((i16 & 32) != 0) {
                        i27 &= -458753;
                    }
                    x0Var3 = x0VarF;
                    j14 = j8;
                }
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                h4.d.f81522a.getClass();
                h4.g.b bVar3 = h4.d.a.f81534l;
                c2.j.f22691a.getClass();
                s2VarA = c2.q2.a(c2.j.f22692b, bVar3, o0VarE, 48);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, s2VarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                u2Var = c2.u2.f22900a;
                if (i14 != -1) {
                    o0VarE.C(-1607564777);
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarC4 = c2.l.C(u2Var.a(h4.r.S, f14, true), 0.0f, 0.0f, 16, 0.0f, 11);
                    i17 = i27;
                    zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = h4.k.c(rVarC4, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    z15 = true;
                    z16 = false;
                    i7.a(n5.c.a(i14, o0VarE, (i17 >> 3) & 14), null, null, j14, o0VarE, ((i17 << 3) & 7168) | 48, 4);
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                } else {
                    i17 = i27;
                    z15 = true;
                    z16 = false;
                    o0VarE.C(-1607215934);
                    o0VarE.g0(false);
                }
                o0VarE.C(-744581358);
                i18 = z16 ? 1 : 0;
                r14 = z16;
                o0Var2 = o0VarE;
                for (Object obj : list) {
                    i19 = i18 + 1;
                    if (i18 >= 0) {
                        p13.x.q();
                        throw null;
                    }
                    str = (String) obj;
                    g6.f.a aVar4 = g6.f.f75994b;
                    h4.r rVarC5 = c2.l.C(u2Var.a(h4.r.S, list2.get(i18).floatValue(), z15), 4, 0.0f, 0.0f, 0.0f, 14);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0Var2, r14);
                    p3.x1 x1Var2 = p3.n.f135158a;
                    iHashCode2 = Long.hashCode(o0Var2.U);
                    i2VarA1 = o0Var2.a0();
                    rVarC2 = h4.k.c(rVarC5, o0Var2);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (cVar != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0Var2.z();
                    if (o0Var2.T) {
                        o0Var2.M(aVar2);
                    } else {
                        o0Var2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0Var2);
                    b4.c(h5.g.a.f81809f, i2VarA1, o0Var2);
                    bVar2 = h5.g.a.f81813j;
                    if (o0Var2.T || !p005kotlin.jvm.internal.s.g(o0Var2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, o0Var2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    p3.o0 o0Var3 = o0Var2;
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0Var3, 0, (i17 << 6) & 29360128, 131070);
                    p3.o0 o0Var4 = o0Var3;
                    o0Var4.g0(z15);
                    i18 = i19;
                    r14 = 0;
                    o0Var2 = o0Var4;
                }
                o0Var2.g0(r14);
                o0Var2.g0(z15);
                p3.x1 x1Var3 = p3.n.f135158a;
                x0Var2 = x0Var3;
                o0Var = o0Var2;
            } else {
                o0VarE.e();
                j14 = j8;
                x0Var2 = x0VarF;
                o0Var = o0VarE;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: l72.s1
                    @Override // e23.p
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        u1.e(rVar, i14, j14, f14, list, x0Var2, list2, (p3.m) obj2, p3.p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i27 |= 384;
        if ((i15 & 3072) == 0) {
            if (o0VarE.i(f14)) {
                i26 = 2048;
            } else {
                i26 = 1024;
            }
            i27 |= i26;
        }
        if ((i15 & 24576) != 0) {
            if (o0VarE.r(list)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i27 |= i25;
        }
        if ((196608 & i15) == 0) {
            if ((i16 & 32) == 0) {
                x0VarF = x0Var;
                if (o0VarE.B(x0VarF)) {
                }
                i27 |= i29;
            } else {
                x0VarF = x0Var;
            }
            i27 |= i29;
        } else {
            x0VarF = x0Var;
        }
        if ((1572864 & i15) == 0) {
            if (o0VarE.r(list2)) {
                i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i24 = 524288;
            }
            i27 |= i24;
        }
        if ((599187 & i27) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i27 & 1, z14)) {
            o0VarE.G0();
            if ((i15 & 1) != 0) {
                if (i28 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128832k;
                } else {
                    j15 = j8;
                }
                if ((i16 & 32) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i27 &= -458753;
                    x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
                }
                x0Var3 = x0VarF;
                j14 = j15;
            } else {
                if (i28 != 0) {
                    o4.d0.f128823b.getClass();
                    j15 = o4.d0.f128832k;
                } else {
                    j15 = j8;
                }
                if ((i16 & 32) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i27 &= -458753;
                    x0VarF = d92.c.f(j92.f.f97931h, o0VarE);
                }
                x0Var3 = x0VarF;
                j14 = j15;
            }
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar4 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2VarA = c2.q2.a(c2.j.f22692b, bVar4, o0VarE, 48);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2Var = c2.u2.f22900a;
            if (i14 != -1) {
                o0VarE.C(-1607564777);
                g6.f.a aVar5 = g6.f.f75994b;
                h4.r rVarC6 = c2.l.C(u2Var.a(h4.r.S, f14, true), 0.0f, 0.0f, 16, 0.0f, 11);
                i17 = i27;
                zVarA2 = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = h4.k.c(rVarC6, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                c2.b0 b0Var3 = c2.b0.f22601a;
                z15 = true;
                z16 = false;
                i7.a(n5.c.a(i14, o0VarE, (i17 >> 3) & 14), null, null, j14, o0VarE, ((i17 << 3) & 7168) | 48, 4);
                o0VarE.g0(true);
                o0VarE.g0(false);
            } else {
                i17 = i27;
                z15 = true;
                z16 = false;
                o0VarE.C(-1607215934);
                o0VarE.g0(false);
            }
            o0VarE.C(-744581358);
            i18 = z16 ? 1 : 0;
            r14 = z16;
            o0Var2 = o0VarE;
            while (r6.hasNext()) {
                i19 = i18 + 1;
                if (i18 >= 0) {
                    p13.x.q();
                    throw null;
                }
                str = (String) obj;
                g6.f.a aVar6 = g6.f.f75994b;
                h4.r rVarC7 = c2.l.C(u2Var.a(h4.r.S, list2.get(i18).floatValue(), z15), 4, 0.0f, 0.0f, 0.0f, 14);
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0Var2, r14);
                p3.x1 x1Var5 = p3.n.f135158a;
                iHashCode2 = Long.hashCode(o0Var2.U);
                i2VarA1 = o0Var2.a0();
                rVarC2 = h4.k.c(rVarC7, o0Var2);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0Var2.z();
                if (o0Var2.T) {
                    o0Var2.M(aVar2);
                } else {
                    o0Var2.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0Var2);
                b4.c(h5.g.a.f81809f, i2VarA1, o0Var2);
                bVar2 = h5.g.a.f81813j;
                if (o0Var2.T) {
                    v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                } else {
                    v.h.A(iHashCode2, o0Var2, iHashCode2, bVar2);
                }
                b4.c(h5.g.a.f81807d, rVarC2, o0Var2);
                c2.b0 b0Var4 = c2.b0.f22601a;
                p3.o0 o0Var5 = o0Var2;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var3, o0Var5, 0, (i17 << 6) & 29360128, 131070);
                p3.o0 o0Var6 = o0Var5;
                o0Var6.g0(z15);
                i18 = i19;
                r14 = 0;
                o0Var2 = o0Var6;
            }
            o0Var2.g0(r14);
            o0Var2.g0(z15);
            p3.x1 x1Var6 = p3.n.f135158a;
            x0Var2 = x0Var3;
            o0Var = o0Var2;
        } else {
            o0VarE.e();
            j14 = j8;
            x0Var2 = x0VarF;
            o0Var = o0VarE;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: l72.s1
                @Override // e23.p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    u1.e(rVar, i14, j14, f14, list, x0Var2, list2, (p3.m) obj2, p3.p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
