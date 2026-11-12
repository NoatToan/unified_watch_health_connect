package a3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.v1;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h4.r f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h4.r f649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f652e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f653a = new a();

        /* JADX WARN: Code duplicated, block: B:39:0x0099  */
        /* JADX WARN: Code duplicated, block: B:47:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
            f5.y0 y0Var;
            f5.y0 y0Var2;
            int iIntValue;
            int iIntValue2;
            int iIntValue3;
            int i14;
            int i15;
            int size = list.size();
            int i16 = 0;
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    y0Var = null;
                    break;
                }
                y0Var = list.get(i17);
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "title")) {
                    break;
                }
                i17++;
            }
            f5.y0 y0Var3 = y0Var;
            v1 v1VarQ = y0Var3 != null ? y0Var3.Q(g6.a.c(0, 0, 0, 0, 11, j8)) : null;
            int size2 = list.size();
            int i18 = 0;
            while (true) {
                if (i18 >= size2) {
                    y0Var2 = null;
                    break;
                }
                y0Var2 = list.get(i18);
                if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "text")) {
                    break;
                }
                i18++;
            }
            f5.y0 y0Var4 = y0Var2;
            v1 v1VarQ2 = y0Var4 != null ? y0Var4.Q(g6.a.c(0, 0, 0, 0, 11, j8)) : null;
            int iMax = Math.max(v1VarQ != null ? v1VarQ.f69144a : 0, v1VarQ2 != null ? v1VarQ2.f69144a : 0);
            if (v1VarQ == null) {
                iIntValue = 0;
            } else {
                int iE = v1VarQ.E(f5.b.f68892a);
                Integer numValueOf = iE == Integer.MIN_VALUE ? null : Integer.valueOf(iE);
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
            }
            if (v1VarQ == null) {
                iIntValue2 = 0;
            } else {
                int iE2 = v1VarQ.E(f5.b.f68893b);
                Integer numValueOf2 = iE2 == Integer.MIN_VALUE ? null : Integer.valueOf(iE2);
                if (numValueOf2 != null) {
                    iIntValue2 = numValueOf2.intValue();
                } else {
                    iIntValue2 = 0;
                }
            }
            int iV0 = b1Var.v0(f.f650c) - iIntValue;
            if (v1VarQ2 == null) {
                iIntValue3 = 0;
            } else {
                int iE3 = v1VarQ2.E(f5.b.f68892a);
                Integer numValueOf3 = iE3 != Integer.MIN_VALUE ? Integer.valueOf(iE3) : null;
                if (numValueOf3 != null) {
                    iIntValue3 = numValueOf3.intValue();
                } else {
                    iIntValue3 = 0;
                }
            }
            int iV1 = v1VarQ == null ? b1Var.v0(f.f652e) : b1Var.v0(f.f651d);
            int i19 = v1VarQ != null ? v1VarQ.f69145b + iV0 : 0;
            if (v1VarQ == null) {
                i14 = iV1 - iIntValue3;
            } else {
                i14 = (iIntValue2 == 0 ? i19 - iIntValue3 : (iV0 + iIntValue2) - iIntValue3) + iV1;
            }
            if (v1VarQ2 != null) {
                int i24 = v1VarQ2.f69145b;
                if (iIntValue2 == 0) {
                    i15 = (i24 + iV1) - iIntValue3;
                } else {
                    i15 = ((i24 + iV1) - iIntValue3) - ((v1VarQ != null ? v1VarQ.f69145b : 0) - iIntValue2);
                }
                i16 = i15;
            }
            return f5.b1.h0(b1Var, iMax, i19 + i16, new a11.e(v1VarQ, iV0, v1VarQ2, i14));
        }
    }

    static {
        h4.r.a aVar = h4.r.S;
        float f14 = 24;
        g6.f.a aVar2 = g6.f.f75994b;
        f648a = c2.l.C(aVar, f14, 0.0f, f14, 0.0f, 10);
        f649b = c2.l.C(aVar, f14, 0.0f, f14, 28, 2);
        f650c = o53.f0.B(40);
        f651d = o53.f0.B(36);
        f652e = o53.f0.B(38);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x010b  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x0157  */
    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0194  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198  */
    public static final void a(c2.a0 a0Var, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i14) {
        Throwable th3;
        h5.g.a.f fVar;
        f5.z0 z0VarD;
        int iP;
        i2 i2VarA0;
        h4.r rVarC;
        f5.z0 z0VarD2;
        int iP2;
        i2 i2VarA1;
        h4.r rVarC2;
        boolean z14;
        boolean z15 = false;
        p3.o0 o0VarE = mVar.E(1213983107);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.r(pVar) ? 32 : 16) | (o0VarE.r(pVar2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarA = a0Var.a(h4.r.S, 1.0f, false);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = a.f653a;
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            int iP3 = o0VarE.P();
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(rVarA, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (cVar == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, z0Var, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                th3 = null;
            } else {
                th3 = null;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                if (pVar == null) {
                    o0VarE.C(1809237538);
                } else {
                    o0VarE.C(1809237539);
                    h4.r rVarE = f5.g0.e(f648a, "title");
                    h4.d.f81522a.getClass();
                    h4.r rVarB = a0Var.b(rVarE, h4.d.a.f81536n);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iP = o0VarE.P();
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarB, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw th3;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA0, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                        v.h.A(iP, o0VarE, iP, bVar);
                    }
                    b4.c(fVar, rVarC, o0VarE);
                    c2.u uVar = c2.u.f22885a;
                    pVar.invoke(o0VarE, 0);
                    o0VarE.g0(true);
                    z15 = false;
                }
                o0VarE.g0(z15);
                if (pVar2 == null) {
                    o0VarE.C(1809370342);
                    o0VarE.g0(z15);
                    z14 = true;
                } else {
                    o0VarE.C(1809370343);
                    h4.r rVarE2 = f5.g0.e(f649b, "text");
                    h4.d.f81522a.getClass();
                    h4.r rVarB2 = a0Var.b(rVarE2, h4.d.a.f81536n);
                    z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                    iP2 = o0VarE.P();
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = h4.k.c(rVarB2, o0VarE);
                    if (cVar != null) {
                        p3.p0.l();
                        throw th3;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD2, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                        v.h.A(iP2, o0VarE, iP2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    c2.u uVar2 = c2.u.f22885a;
                    pVar2.invoke(o0VarE, 0);
                    z14 = true;
                    o0VarE.g0(true);
                    o0VarE.g0(false);
                }
                o0VarE.g0(z14);
            }
            v.h.A(iP3, o0VarE, iP3, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            if (pVar == null) {
                o0VarE.C(1809237538);
            } else {
                o0VarE.C(1809237539);
                h4.r rVarE3 = f5.g0.e(f648a, "title");
                h4.d.f81522a.getClass();
                h4.r rVarB3 = a0Var.b(rVarE3, h4.d.a.f81536n);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iP = o0VarE.P();
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarB3, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iP, o0VarE, iP, bVar);
                } else {
                    v.h.A(iP, o0VarE, iP, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.u uVar3 = c2.u.f22885a;
                pVar.invoke(o0VarE, 0);
                o0VarE.g0(true);
                z15 = false;
            }
            o0VarE.g0(z15);
            if (pVar2 == null) {
                o0VarE.C(1809370342);
                o0VarE.g0(z15);
                z14 = true;
            } else {
                o0VarE.C(1809370343);
                h4.r rVarE4 = f5.g0.e(f649b, "text");
                h4.d.f81522a.getClass();
                h4.r rVarB4 = a0Var.b(rVarE4, h4.d.a.f81536n);
                z0VarD2 = c2.q.d(h4.d.a.f81524b, false);
                iP2 = o0VarE.P();
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(rVarB4, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw th3;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD2, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iP2, o0VarE, iP2, bVar);
                } else {
                    v.h.A(iP2, o0VarE, iP2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar4 = c2.u.f22885a;
                pVar2.invoke(o0VarE, 0);
                z14 = true;
                o0VarE.g0(true);
                o0VarE.g0(false);
            }
            o0VarE.g0(z14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(a0Var, pVar, pVar2, i14, 0);
        }
    }

    public static final void b(e23.p pVar, h4.r rVar, e23.p pVar2, e23.p pVar3, o4.r1 r1Var, long j8, long j14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1945098332);
        int i15 = i14 | (o0VarE.r(pVar) ? 4 : 2) | (o0VarE.B(rVar) ? 32 : 16) | (o0VarE.r(pVar2) ? 256 : 128) | (o0VarE.r(pVar3) ? 2048 : 1024) | (o0VarE.B(r1Var) ? 16384 : 8192) | (o0VarE.l(j8) ? 131072 : 65536) | (o0VarE.l(j14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            int i17 = ((i15 >> 3) & 14) | 1572864;
            int i18 = i15 >> 9;
            n1.a(rVar, r1Var, j8, j14, 0.0f, z3.f.c(802957984, new a3.a(pVar2, pVar3, pVar, i16), o0VarE), o0VarE, i17 | (i18 & 112) | (i18 & 896) | (i18 & 7168), 48);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b(pVar, rVar, pVar2, pVar3, r1Var, j8, j14, i14);
        }
    }

    public static final void c(float f14, float f15, z3.e eVar, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1271829505);
        if (o0VarE.n(i14 & 1, (i14 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new h(f14, f15);
                o0VarE.K(objQ);
            }
            f5.z0 z0Var = (f5.z0) objQ;
            h4.r.a aVar = h4.r.S;
            int iP = o0VarE.P();
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0Var, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b71.i.n(6, eVar, o0VarE, true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(f14, f15, eVar, i14, 0);
        }
    }
}
