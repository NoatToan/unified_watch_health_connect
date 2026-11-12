package i02;

import a11.g0;
import b21.n9;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import f5.z0;
import h5.e0;
import o4.s0;
import o4.t0;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class h {
    public static final void a(f2.r rVar, p pVar, Object obj, h4.r rVar2, e23.r rVar3, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar4;
        rVar.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(923458706);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(pVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(obj) ? 256 : 128;
        }
        int i16 = i15 | 27648;
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(rVar3) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i16 & 1, (599187 & i16) != 599186)) {
            h4.r.a aVar = h4.r.S;
            x1 x1Var = p3.n.f135158a;
            int i17 = i16 >> 3;
            int i18 = i16 << 3;
            b(pVar, obj, aVar, f2.r.b(rVar, aVar), false, rVar3, eVar, o0VarE, (i17 & 896) | (i17 & 14) | 24576 | (i17 & 112) | (458752 & i18) | (3670016 & i18) | (i18 & 29360128));
            rVar4 = aVar;
        } else {
            o0VarE.e();
            rVar4 = rVar2;
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new g0(rVar, pVar, obj, rVar4, rVar3, eVar, i14, 18);
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x0141  */
    public static final void b(final p pVar, Object obj, h4.r rVar, h4.r rVar2, final boolean z14, e23.r rVar3, z3.e eVar, p3.m mVar, int i14) {
        int i15;
        h4.r rVar4;
        e23.s sVar;
        h4.r rVarA;
        h4.r rVarB;
        pVar.getClass();
        b bVar = pVar.f86890f;
        o0 o0VarE = mVar.E(-826932358);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(pVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(obj) ? 32 : 16;
        }
        if ((i14 & 3072) == 0) {
            rVar4 = rVar2;
            i15 |= o0VarE.B(rVar4) ? 2048 : 1024;
        } else {
            rVar4 = rVar2;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(null) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(rVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            sVar = eVar;
            i15 |= o0VarE.r(sVar) ? 8388608 : 4194304;
        } else {
            sVar = eVar;
        }
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (4793363 & i15) != 4793362)) {
            x1 x1Var = p3.n.f135158a;
            T f182175a = pVar.f86895k.getF182175a();
            boolean zG = p005kotlin.jvm.internal.s.g(obj, f182175a != 0 ? pVar.m(f182175a) : null);
            p3.m.a aVar = p3.m.f135153a;
            if (zG) {
                o0VarE.C(791151533);
                h4.r rVarB2 = h4.p.b(h4.r.S, 1.0f);
                boolean zR = ((i15 & 57344) == 16384) | o0VarE.r(pVar);
                Object objQ = o0VarE.q();
                if (zR) {
                    objQ = new e23.l() { // from class: i02.g
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            t0 t0Var = (t0) obj2;
                            switch (i16) {
                                case 0:
                                    t0Var.getClass();
                                    boolean z15 = z14;
                                    p pVar2 = pVar;
                                    t0Var.x((z15 && pVar2.u()) ? 0.0f : pVar2.f());
                                    t0Var.q((!z15 || pVar2.u()) ? pVar2.g() : 0.0f);
                                    t0Var.c(0.85f);
                                    t0Var.v(1.1f);
                                    break;
                                default:
                                    t0Var.getClass();
                                    boolean z16 = z14;
                                    p pVar3 = pVar;
                                    t0Var.x((z16 && pVar3.u()) ? 0.0f : Float.intBitsToFloat((int) (pVar3.f86890f.b() >> 32)));
                                    t0Var.q((!z16 || pVar3.u()) ? Float.intBitsToFloat((int) (pVar3.f86890f.b() & 4294967295L)) : 0.0f);
                                    t0Var.c(1.0f);
                                    t0Var.v(1.0f);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.l() { // from class: i02.g
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i16) {
                                    case 0:
                                        t0Var.getClass();
                                        boolean z15 = z14;
                                        p pVar2 = pVar;
                                        t0Var.x((z15 && pVar2.u()) ? 0.0f : pVar2.f());
                                        t0Var.q((!z15 || pVar2.u()) ? pVar2.g() : 0.0f);
                                        t0Var.c(0.85f);
                                        t0Var.v(1.1f);
                                        break;
                                    default:
                                        t0Var.getClass();
                                        boolean z16 = z14;
                                        p pVar3 = pVar;
                                        t0Var.x((z16 && pVar3.u()) ? 0.0f : Float.intBitsToFloat((int) (pVar3.f86890f.b() >> 32)));
                                        t0Var.q((!z16 || pVar3.u()) ? Float.intBitsToFloat((int) (pVar3.f86890f.b() & 4294967295L)) : 0.0f);
                                        t0Var.c(1.0f);
                                        t0Var.v(1.0f);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ);
                    }
                }
                rVarA = s0.a(rVarB2, (e23.l) objQ);
                o0VarE.g0(false);
            } else {
                o0VarE.C(791577969);
                f position = bVar.getPosition();
                if (p005kotlin.jvm.internal.s.g(obj, position != null ? position.f86852b : null)) {
                    o0VarE.C(791840043);
                    h4.r rVarB3 = h4.p.b(h4.r.S, 1.0f);
                    boolean zR2 = ((i15 & 57344) == 16384) | o0VarE.r(pVar);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        final int i17 = 1;
                        objQ2 = new e23.l() { // from class: i02.g
                            @Override // e23.l
                            public final Object invoke(Object obj2) {
                                t0 t0Var = (t0) obj2;
                                switch (i17) {
                                    case 0:
                                        t0Var.getClass();
                                        boolean z15 = z14;
                                        p pVar2 = pVar;
                                        t0Var.x((z15 && pVar2.u()) ? 0.0f : pVar2.f());
                                        t0Var.q((!z15 || pVar2.u()) ? pVar2.g() : 0.0f);
                                        t0Var.c(0.85f);
                                        t0Var.v(1.1f);
                                        break;
                                    default:
                                        t0Var.getClass();
                                        boolean z16 = z14;
                                        p pVar3 = pVar;
                                        t0Var.x((z16 && pVar3.u()) ? 0.0f : Float.intBitsToFloat((int) (pVar3.f86890f.b() >> 32)));
                                        t0Var.q((!z16 || pVar3.u()) ? Float.intBitsToFloat((int) (pVar3.f86890f.b() & 4294967295L)) : 0.0f);
                                        t0Var.c(1.0f);
                                        t0Var.v(1.0f);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i18 = 1;
                            objQ2 = new e23.l() { // from class: i02.g
                                @Override // e23.l
                                public final Object invoke(Object obj2) {
                                    t0 t0Var = (t0) obj2;
                                    switch (i18) {
                                        case 0:
                                            t0Var.getClass();
                                            boolean z15 = z14;
                                            p pVar2 = pVar;
                                            t0Var.x((z15 && pVar2.u()) ? 0.0f : pVar2.f());
                                            t0Var.q((!z15 || pVar2.u()) ? pVar2.g() : 0.0f);
                                            t0Var.c(0.85f);
                                            t0Var.v(1.1f);
                                            break;
                                        default:
                                            t0Var.getClass();
                                            boolean z16 = z14;
                                            p pVar3 = pVar;
                                            t0Var.x((z16 && pVar3.u()) ? 0.0f : Float.intBitsToFloat((int) (pVar3.f86890f.b() >> 32)));
                                            t0Var.q((!z16 || pVar3.u()) ? Float.intBitsToFloat((int) (pVar3.f86890f.b() & 4294967295L)) : 0.0f);
                                            t0Var.c(1.0f);
                                            t0Var.v(1.0f);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0VarE.K(objQ2);
                        }
                    }
                    rVarA = s0.a(rVarB3, (e23.l) objQ2);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(792306097);
                    o0VarE.g0(false);
                    rVarA = rVar4;
                }
                o0VarE.g0(false);
            }
            h4.r rVar5 = rVarA;
            if (zG) {
                rVarB = h4.p.b(x2.d(h4.r.S, 1.0f), 1.0f);
            } else {
                f position2 = bVar.getPosition();
                rVarB = p005kotlin.jvm.internal.s.g(obj, position2 != null ? position2.f86852b : null) ? h4.p.b(h4.r.S, 1.0f) : rVar4;
            }
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarB, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            if (!zG || rVar3 == null) {
                o0VarE.C(136836526);
                o0VarE.g0(false);
            } else {
                o0VarE.C(136688532);
                rVar3.invoke(uVar, h4.p.b(x2.f(h4.r.S, 1.0f), 1.0f), o0VarE, Integer.valueOf(((i15 >> 12) & 896) | 54));
                o0VarE.g0(false);
            }
            sVar.invoke(uVar, Boolean.valueOf(zG), rVar5, o0VarE, Integer.valueOf(((i15 >> 12) & 7168) | 6));
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(pVar, obj, rVar, rVar4, z14, rVar3, eVar, i14, 10);
        }
    }
}
