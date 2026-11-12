package i3;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class uf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f89931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f89932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f89933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f89934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f89935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f89936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f89937g;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f89939b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
            this.f89938a = pVar;
            this.f89939b = pVar2;
        }

        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
            f5.v1 v1VarQ;
            f5.v1 v1VarQ2;
            if (this.f89938a != null) {
                int size = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        throw hb.a.m("Collection contains no element matching the predicate.");
                    }
                    f5.y0 y0Var = list.get(i14);
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var), "text")) {
                        v1VarQ = y0Var.Q(g6.a.c(0, 0, 0, 0, 11, j8));
                        break;
                    }
                    i14++;
                }
            } else {
                v1VarQ = null;
            }
            if (this.f89939b != null) {
                int size2 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size2) {
                        throw hb.a.m("Collection contains no element matching the predicate.");
                    }
                    f5.y0 y0Var2 = list.get(i15);
                    if (p005kotlin.jvm.internal.s.g(f5.g0.b(y0Var2), "icon")) {
                        v1VarQ2 = y0Var2.Q(j8);
                        break;
                    }
                    i15++;
                }
            } else {
                v1VarQ2 = null;
            }
            int iMax = Math.max(v1VarQ != null ? v1VarQ.f69144a : 0, v1VarQ2 != null ? v1VarQ2.f69144a : 0);
            int iMax2 = Math.max(b1Var.f0((v1VarQ == null || v1VarQ2 == null) ? uf.f89931a : uf.f89932b), b1Var.v0(uf.f89936f) + (v1VarQ2 != null ? v1VarQ2.f69145b : 0) + (v1VarQ != null ? v1VarQ.f69145b : 0));
            return f5.b1.h0(b1Var, iMax, iMax2, new g4(v1VarQ, v1VarQ2, b1Var, iMax, iMax2, v1VarQ != null ? Integer.valueOf(v1VarQ.E(f5.b.f68892a)) : null, v1VarQ != null ? Integer.valueOf(v1VarQ.E(f5.b.f68893b)) : null));
        }
    }

    static {
        n3.q0.f123226a.getClass();
        f89931a = n3.q0.f123229d;
        g6.f.a aVar = g6.f.f75994b;
        f89932b = 72;
        f89933c = 16;
        f89934d = 14;
        f89935e = 6;
        f89936f = o53.f0.B(20);
        f89937g = 8;
    }

    public static final void a(final boolean z14, final e23.a aVar, final z3.e eVar, final z3.e eVar2, h4.r rVar, boolean z15, final long j8, final long j14, p3.m mVar, final int i14) {
        int i15;
        e23.a aVar2;
        z3.e eVar3;
        z3.e eVar4;
        long j15;
        final h4.r rVar2;
        final boolean z16;
        h4.r rVar3;
        boolean z17;
        p3.o0 o0VarE = mVar.E(-611535578);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 384) == 0) {
            eVar3 = eVar;
            i15 |= o0VarE.r(eVar3) ? 256 : 128;
        } else {
            eVar3 = eVar;
        }
        if ((i14 & 3072) == 0) {
            eVar4 = eVar2;
            i15 |= o0VarE.r(eVar4) ? 2048 : 1024;
        } else {
            eVar4 = eVar2;
        }
        int i16 = i15 | 221184;
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.l(j8) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            j15 = j14;
            i16 |= o0VarE.l(j15) ? 8388608 : 4194304;
        } else {
            j15 = j14;
        }
        int i17 = i16 | 100663296;
        if (o0VarE.n(i17 & 1, (38347923 & i17) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                rVar3 = h4.r.S;
                z17 = true;
            } else {
                o0VarE.e();
                rVar3 = rVar;
                z17 = z15;
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            int i18 = i17 >> 18;
            e(j8, j15, z14, z3.f.c(1831009258, new qf(rVar3, z14, null, fb.a(0.0f, 2, j8, true), z17, aVar2, eVar4, eVar3), o0VarE), o0VarE, ((i17 << 6) & 896) | (i18 & 112) | (i18 & 14) | 3072);
            rVar2 = rVar3;
            z16 = z17;
        } else {
            o0VarE.e();
            rVar2 = rVar;
            z16 = z15;
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.pf
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uf.a(z14, aVar, eVar, eVar2, rVar2, z16, j8, j14, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void b(final boolean z14, final e23.a aVar, final h4.r rVar, final boolean z15, final long j8, final long j14, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        e23.a aVar2;
        boolean z16;
        long j15;
        z3.e eVar2;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1573136853);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            aVar2 = aVar;
            i15 |= o0VarE.r(aVar2) ? 32 : 16;
        } else {
            aVar2 = aVar;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            z16 = z15;
            i15 |= o0VarE.h(z16) ? 2048 : 1024;
        } else {
            z16 = z15;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.l(j8) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            j15 = j14;
            i15 |= o0VarE.l(j15) ? 131072 : 65536;
        } else {
            j15 = j14;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.B(null) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            eVar2 = eVar;
            i15 |= o0VarE.r(eVar2) ? 8388608 : 4194304;
        } else {
            eVar2 = eVar;
        }
        if (o0VarE.n(i15 & 1, (4793491 & i15) != 4793490)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            z3.e eVarC = z3.f.c(1128552423, new sf(rVar, z14, null, fb.a(0.0f, 2, j8, true), z16, aVar2, eVar2), o0VarE);
            int i16 = i15 >> 12;
            o0Var = o0VarE;
            long j16 = j15;
            e(j8, j16, z14, eVarC, o0Var, ((i15 << 6) & 896) | (i16 & 112) | (i16 & 14) | 3072);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.nf
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uf.b(z14, aVar, rVar, z15, j8, j14, eVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:39:0x0089  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:61:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    public static final void c(final boolean z14, final e23.a aVar, h4.r rVar, boolean z15, final e23.p pVar, final long j8, long j14, p3.m mVar, final int i14, final int i15) {
        final h4.r rVar2;
        int i16;
        long j15;
        final long j16;
        int i17;
        boolean z16;
        boolean z17;
        p3.o0 o0Var;
        final boolean z18;
        p3.p2 p2VarI0;
        h4.r rVar3;
        z3.e eVarC;
        p3.o0 o0VarE = mVar.E(1015017965);
        int i18 = i14 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.r(aVar) ? 32 : 16);
        int i19 = i15 & 4;
        if (i19 != 0) {
            i16 = i18 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i16 = i18 | (o0VarE.B(rVar2) ? 256 : 128);
        }
        int i24 = i16 | 199680;
        if ((i14 & 1572864) == 0) {
            j15 = j8;
            i24 |= o0VarE.l(j15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            j15 = j8;
        }
        if ((i15 & 128) == 0) {
            j16 = j14;
            int i25 = o0VarE.l(j16) ? 8388608 : 4194304;
            i17 = i24 | i25 | 100663296;
            z16 = true;
            if ((38347923 & i17) != 38347922) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (o0VarE.n(i17 & 1, z17)) {
                o0VarE.G0();
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i19 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if ((i15 & 128) != 0) {
                        i17 &= -29360129;
                        j16 = j15;
                    }
                    rVar2 = rVar3;
                } else {
                    o0VarE.e();
                    if ((i15 & 128) != 0) {
                        i17 &= -29360129;
                    }
                    z16 = z15;
                }
                long j17 = j16;
                o0VarE.h0();
                p3.x1 x1Var = p3.n.f135158a;
                if (pVar == null) {
                    o0VarE.C(1830899669);
                    o0VarE.g0(false);
                    eVarC = null;
                } else {
                    o0VarE.C(1830899670);
                    eVarC = z3.f.c(-1745256900, new tf(pVar), o0VarE);
                    o0VarE.g0(false);
                }
                f5.s sVar = z.f90506a;
                int i26 = (i17 & 14) | 12582912 | (i17 & 112) | 3072;
                int i27 = i17 >> 6;
                o0Var = o0VarE;
                boolean z19 = z16;
                b(z14, aVar, f5.g0.d(rVar2, new h81.a(22)), z19, j15, j17, z3.f.c(-906085472, new rf(eVarC, null), o0VarE), o0Var, (i27 & 458752) | i26 | (57344 & i27) | 1572864);
                z18 = z19;
                j16 = j17;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                z18 = z15;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: i3.mf
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        uf.c(z14, aVar, rVar2, z18, pVar, j8, j16, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        j16 = j14;
        i17 = i24 | i25 | 100663296;
        z16 = true;
        if ((38347923 & i17) != 38347922) {
            z17 = true;
        } else {
            z17 = false;
        }
        if (o0VarE.n(i17 & 1, z17)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i19 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 128) != 0) {
                    i17 &= -29360129;
                    j16 = j15;
                }
                rVar2 = rVar3;
            } else {
                if (i19 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if ((i15 & 128) != 0) {
                    i17 &= -29360129;
                    j16 = j15;
                }
                rVar2 = rVar3;
            }
            long j18 = j16;
            o0VarE.h0();
            p3.x1 x1Var2 = p3.n.f135158a;
            if (pVar == null) {
                o0VarE.C(1830899669);
                o0VarE.g0(false);
                eVarC = null;
            } else {
                o0VarE.C(1830899670);
                eVarC = z3.f.c(-1745256900, new tf(pVar), o0VarE);
                o0VarE.g0(false);
            }
            f5.s sVar2 = z.f90506a;
            int i28 = (i17 & 14) | 12582912 | (i17 & 112) | 3072;
            int i29 = i17 >> 6;
            o0Var = o0VarE;
            boolean z110 = z16;
            b(z14, aVar, f5.g0.d(rVar2, new h81.a(22)), z110, j15, j18, z3.f.c(-906085472, new rf(eVarC, null), o0VarE), o0Var, (i29 & 458752) | i28 | (57344 & i29) | 1572864);
            z18 = z110;
            j16 = j18;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z18 = z15;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: i3.mf
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uf.c(z14, aVar, rVar2, z18, pVar, j8, j16, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    public static final void d(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, p3.m mVar, int i14) {
        p3.c<?> cVar;
        boolean z14;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-1349901398);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i15 = (o0VarE.r(pVar) ? 4 : 2) | i14 | (o0VarE.r(pVar2) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 & 14;
            boolean z16 = ((i15 & 112) == 32) | (i16 == 4);
            Object objQ = o0VarE.q();
            if (z16) {
                objQ = new a(pVar, pVar2);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(pVar, pVar2);
                    o0VarE.K(objQ);
                }
            }
            f5.z0 z0Var = (f5.z0) objQ;
            h4.r.a aVar = h4.r.S;
            int iP = o0VarE.P();
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
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
            p3.b4.c(eVar, z0Var, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, o0VarE);
            if (pVar != null) {
                o0VarE.C(870361332);
                cVar = cVar2;
                h4.r rVarA = c2.l.A(f5.g0.e(aVar, "text"), f89933c, 0.0f, 2);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iP2 = o0VarE.P();
                p3.i2 i2VarA1 = o0VarE.a0();
                h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
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
                p3.b4.c(eVar, z0VarD, o0VarE);
                p3.b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP2))) {
                    v.h.A(iP2, o0VarE, iP2, bVar);
                }
                p3.b4.c(fVar, rVarC2, o0VarE);
                c2.u uVar = c2.u.f22885a;
                z14 = false;
                e5.r(i16, pVar, o0VarE, true, false);
            } else {
                cVar = cVar2;
                z14 = false;
                o0VarE.C(870466081);
                o0VarE.g0(false);
            }
            if (pVar2 != null) {
                o0VarE.C(870494880);
                h4.r rVarE = f5.g0.e(aVar, "icon");
                h4.d.f81522a.getClass();
                f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, z14);
                int iP3 = o0VarE.P();
                p3.i2 i2VarA2 = o0VarE.a0();
                h4.r rVarC3 = h4.k.c(rVarE, o0VarE);
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
                p3.b4.c(eVar, z0VarD2, o0VarE);
                p3.b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP3))) {
                    v.h.A(iP3, o0VarE, iP3, bVar);
                }
                p3.b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar2 = c2.u.f22885a;
                int i17 = (i15 >> 3) & 14;
                z15 = true;
                e5.r(i17, pVar2, o0VarE, true, false);
            } else {
                z15 = true;
                o0VarE.C(870557345);
                o0VarE.g0(z14);
            }
            o0VarE.g0(z15);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new i20.b(pVar, pVar2, i14, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(final long j8, long j14, final boolean z14, final z3.e eVar, p3.m mVar, final int i14) {
        int i15;
        long j15;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-833145221);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.l(j8) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            j15 = j14;
            i15 |= o0VarE.l(j15) ? 32 : 16;
        } else {
            j15 = j14;
        }
        if ((i14 & 384) == 0) {
            z15 = z14;
            i15 |= o0VarE.h(z15) ? 256 : 128;
        } else {
            z15 = z14;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(eVar) ? 2048 : 1024;
        }
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            p3.x1 x1Var = p3.n.f135158a;
            int i16 = i15 >> 6;
            s1.t1 t1VarE = s1.w1.e(Boolean.valueOf(z15), null, o0VarE, i16 & 14, 2);
            p3.c2 c2Var = t1VarE.f155747d;
            vf vfVar = vf.f90027a;
            boolean zBooleanValue = ((Boolean) c2Var.getF182175a()).booleanValue();
            o0VarE.C(-1069234984);
            long j16 = zBooleanValue ? j8 : j15;
            o0VarE.g0(false);
            p4.c cVarG = o4.d0.g(j16);
            boolean zB = o0VarE.B(cVarG);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = (s1.c2) r1.k0.f149133a.invoke(cVarG);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = (s1.c2) r1.k0.f149133a.invoke(cVarG);
                    o0VarE.K(objQ);
                }
            }
            s1.c2 c2Var2 = (s1.c2) objQ;
            boolean zBooleanValue2 = ((Boolean) t1VarE.f155744a.a()).booleanValue();
            o0VarE.C(-1069234984);
            long j17 = zBooleanValue2 ? j8 : j15;
            o0VarE.g0(false);
            o4.d0 d0VarA = o4.d0.a(j17);
            boolean zBooleanValue3 = ((Boolean) c2Var.getF182175a()).booleanValue();
            o0VarE.C(-1069234984);
            long j18 = zBooleanValue3 ? j8 : j15;
            o0VarE.g0(false);
            p3.v.a(s2.f89590a.c(o4.d0.a(((o4.d0) s1.w1.c(t1VarE, d0VarA, o4.d0.a(j18), vfVar.invoke(t1VarE.f(), o0VarE, 0), c2Var2, "ColorAnimation", o0VarE, 0).f155775j.getF182175a()).f128833a)), eVar, o0VarE, (i16 & 112) | 8);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final long j19 = j15;
            p2VarI0.f135219d = new e23.p() { // from class: i3.of
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uf.e(j8, j19, z14, eVar, (p3.m) obj, p3.p0.t(i14 | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
