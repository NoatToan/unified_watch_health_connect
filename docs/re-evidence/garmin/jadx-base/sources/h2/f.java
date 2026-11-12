package h2;

import b5.s0;
import c2.h2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g2.h1;
import g2.q0;
import p005kotlin.Unit;
import p008y1.b2;
import p008y1.t3;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x2;
import p3.x3;
import u1.r1;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:139:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:154:0x020f  */
    /* JADX WARN: Code duplicated, block: B:190:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:275:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:276:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:279:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:280:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:286:0x040b  */
    /* JADX WARN: Code duplicated, block: B:289:0x0421  */
    /* JADX WARN: Code duplicated, block: B:290:0x0424  */
    /* JADX WARN: Code duplicated, block: B:294:0x0433  */
    /* JADX WARN: Code duplicated, block: B:297:0x0440  */
    /* JADX WARN: Code duplicated, block: B:316:0x0486  */
    /* JADX WARN: Code duplicated, block: B:318:0x049b  */
    /* JADX WARN: Code duplicated, block: B:321:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:322:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:324:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:325:0x04d7  */
    public static final void a(final h4.r rVar, j0 j0Var, final h2 h2Var, final b2 b2Var, t3 t3Var, final boolean z14, final r1 r1Var, final int i14, final float f14, final j jVar, a5.a aVar, final e23.l lVar, final h4.d.b bVar, final h4.d.c cVar, final z1.u uVar, final z3.e eVar, p3.m mVar, final int i15, final int i16) {
        int i17;
        int i18;
        z1.u uVar2;
        t3 t3Var2;
        a5.a aVar2;
        j0 j0Var2;
        p3.o0 o0Var;
        boolean z15;
        boolean z16;
        Object a0Var;
        j0 j0Var3;
        int i19;
        boolean z17;
        b2 b2Var2;
        o53.b0 b0Var;
        p3.o0 o0Var2;
        k23.m mVar2;
        p3.m.a.C2565a c2565a;
        boolean z18;
        boolean z19;
        boolean z24;
        Object objQ;
        p008y1.x xVar;
        boolean z25;
        boolean zB;
        Object objQ2;
        h4.r rVarF;
        h4.r rVarG;
        boolean z26;
        h4.r rVarThen;
        boolean z27;
        Object objQ3;
        p3.o0 o0VarE = mVar.E(-572816025);
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.B(rVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.B(j0Var) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= o0VarE.B(h2Var) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= o0VarE.h(false) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i17 |= o0VarE.k(b2Var.ordinal()) ? 16384 : 8192;
        }
        if ((i15 & 196608) == 0) {
            i17 |= o0VarE.B(t3Var) ? 131072 : 65536;
        }
        if ((i15 & 1572864) == 0) {
            i17 |= o0VarE.h(z14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i15 & 12582912) == 0) {
            i17 |= o0VarE.B(r1Var) ? 8388608 : 4194304;
        }
        if ((i15 & 100663296) == 0) {
            i17 |= o0VarE.k(i14) ? 67108864 : 33554432;
        }
        if ((i15 & C.ENCODING_PCM_32BIT) == 0) {
            i17 |= o0VarE.i(f14) ? 536870912 : 268435456;
        }
        if ((i16 & 6) == 0) {
            i18 = i16 | (o0VarE.B(jVar) ? 4 : 2);
        } else {
            i18 = i16;
        }
        if ((i16 & 48) == 0) {
            i18 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i18 |= o0VarE.r(lVar) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i18 |= o0VarE.B(bVar) ? 2048 : 1024;
        }
        if ((i16 & 24576) == 0) {
            i18 |= o0VarE.B(cVar) ? 16384 : 8192;
        }
        if ((i16 & 196608) == 0) {
            uVar2 = uVar;
            i18 |= o0VarE.B(uVar2) ? 131072 : 65536;
        } else {
            uVar2 = uVar;
        }
        if ((i16 & 1572864) == 0) {
            i18 |= o0VarE.r(eVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i24 = i18;
        if (o0VarE.n(i17 & 1, ((i17 & 306783379) == 306783378 && (599187 & i24) == 599186) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            if (i14 < 0) {
                b2.e.a("beyondViewportPageCount should be greater than or equal to 0, you selected " + i14);
            }
            int i25 = i17 & 112;
            boolean z28 = i25 == 32;
            Object objQ4 = o0VarE.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (z28) {
                objQ4 = new ds.g0(j0Var, 1);
                o0VarE.K(objQ4);
            } else {
                aVar3.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = new ds.g0(j0Var, 1);
                    o0VarE.K(objQ4);
                }
            }
            e23.a aVar4 = (e23.a) objQ4;
            int i26 = i17 >> 3;
            int i27 = i26 & 14;
            int i28 = i24 >> 15;
            int i29 = i27 | (i28 & 112) | (i24 & 896);
            p1 p1VarQ = p3.p0.q(eVar, o0VarE);
            p1 p1VarQ2 = p3.p0.q(lVar, o0VarE);
            boolean zB2 = ((((i29 & 14) ^ 6) > 4 && o0VarE.B(j0Var)) || (i29 & 6) == 4) | o0VarE.B(p1VarQ) | o0VarE.B(p1VarQ2) | o0VarE.B(aVar4);
            Object objQ5 = o0VarE.q();
            if (zB2) {
                x2 x2Var = x2.f135386a;
                x2Var.getClass();
                z15 = true;
                final p3.d0 d0VarG = p3.p0.g(x2Var, new gp.f(10, p3.p0.g(x2Var, new gv0.o0(p1VarQ, p1VarQ2, aVar4, 1)), j0Var));
                objQ5 = new p005kotlin.jvm.internal.g0(d0VarG) { // from class: h2.e
                    @Override // p005kotlin.jvm.internal.g0, k23.m
                    public final Object get() {
                        return ((x3) this.receiver).getF182175a();
                    }
                };
                o0VarE.K(objQ5);
            } else {
                aVar3.getClass();
                if (objQ5 == p3.m.a.f135155b) {
                    x2 x2Var2 = x2.f135386a;
                    x2Var2.getClass();
                    z15 = true;
                    final Object d0VarG2 = p3.p0.g(x2Var2, new gp.f(10, p3.p0.g(x2Var2, new gv0.o0(p1VarQ, p1VarQ2, aVar4, 1)), j0Var));
                    objQ5 = new p005kotlin.jvm.internal.g0(d0VarG2) { // from class: h2.e
                        @Override // p005kotlin.jvm.internal.g0, k23.m
                        public final Object get() {
                            return ((x3) this.receiver).getF182175a();
                        }
                    };
                    o0VarE.K(objQ5);
                } else {
                    z15 = true;
                }
            }
            k23.m mVar3 = (k23.m) objQ5;
            Object objQ6 = o0VarE.q();
            aVar3.getClass();
            p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
            if (objQ6 == c2565a2) {
                objQ6 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ6);
            }
            o53.b0 b0Var2 = (o53.b0) objQ6;
            boolean z29 = i25 == 32 ? z15 : false;
            Object objQ7 = o0VarE.q();
            if (z29 || objQ7 == c2565a2) {
                objQ7 = new ds.g0(j0Var, 2);
                o0VarE.K(objQ7);
            }
            e23.a aVar5 = (e23.a) objQ7;
            int i30 = i17 >> 9;
            int i34 = (i17 & 65520) | (i30 & 458752) | (i30 & 3670016) | ((i24 << 21) & 29360128);
            int i35 = i24 << 15;
            int i36 = i34 | (i35 & 234881024) | (i35 & 1879048192);
            boolean z34 = ((((i36 & 896) ^ 384) > 256 && o0VarE.B(h2Var)) || (i36 & 384) == 256) | ((((i36 & 112) ^ 48) > 32 && o0VarE.B(j0Var)) || (i36 & 48) == 32);
            if (((i36 & 7168) ^ 3072) > 2048 && o0VarE.h(false)) {
                z16 = true;
            } else if ((i36 & 3072) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zB3 = z34 | z16 | ((((57344 & i36) ^ 24576) > 16384 && o0VarE.k(b2Var.ordinal())) || (i36 & 24576) == 16384) | ((((i36 & 234881024) ^ 100663296) > 67108864 && o0VarE.B(bVar)) || (i36 & 100663296) == 67108864) | ((((i36 & 1879048192) ^ C.ENCODING_PCM_32BIT) > 536870912 && o0VarE.B(cVar)) || (i36 & C.ENCODING_PCM_32BIT) == 536870912) | ((((i36 & 3670016) ^ 1572864) > 1048576 && o0VarE.i(f14)) || (i36 & 1572864) == 1048576) | ((((i36 & 29360128) ^ 12582912) > 8388608 && o0VarE.B(jVar)) || (i36 & 12582912) == 8388608) | ((((i28 & 14) ^ 6) > 4 && o0VarE.B(uVar2)) || (i28 & 6) == 4) | o0VarE.B(aVar5) | ((((i36 & 458752) ^ 196608) > 131072 && o0VarE.k(i14)) || (i36 & 196608) == 131072) | o0VarE.B(b0Var2);
            Object objQ8 = o0VarE.q();
            if (zB3 || objQ8 == c2565a2) {
                j0Var3 = j0Var;
                z1.u uVar3 = uVar2;
                i19 = 4;
                z17 = true;
                b2Var2 = b2Var;
                b0Var = b0Var2;
                o0Var2 = o0VarE;
                a0Var = new a0(j0Var3, b2Var2, h2Var, false, f14, jVar, mVar3, aVar5, cVar, bVar, i14, uVar3, b0Var);
                mVar2 = mVar3;
                o0Var2.K(a0Var);
            } else {
                b0Var = b0Var2;
                a0Var = objQ8;
                o0Var2 = o0VarE;
                mVar2 = mVar3;
                i19 = 4;
                z17 = true;
                j0Var3 = j0Var;
                b2Var2 = b2Var;
            }
            q0 q0Var = (q0) a0Var;
            b2 b2Var3 = b2.Vertical;
            boolean z35 = b2Var2 == b2Var3 ? z17 : false;
            boolean zH = ((((i27 ^ 6) <= i19 || !o0Var2.B(j0Var3)) && (i26 & 6) != i19) ? false : z17) | o0Var2.h(z35);
            Object objQ9 = o0Var2.q();
            if (zH) {
                c2565a = c2565a2;
            } else {
                c2565a = c2565a2;
                if (objQ9 == c2565a) {
                }
                h1 h1Var = (h1) objQ9;
                if (i25 == 32) {
                    z18 = z17;
                } else {
                    z18 = false;
                }
                if ((i17 & 458752) == 131072) {
                    z19 = z17;
                } else {
                    z19 = false;
                }
                z24 = z18 | z19;
                objQ = o0Var2.q();
                if (!z24 || objQ == c2565a) {
                    t3Var2 = t3Var;
                    objQ = new p0(t3Var2, j0Var3);
                    o0Var2.K(objQ);
                } else {
                    t3Var2 = t3Var;
                }
                p0 p0Var = (p0) objQ;
                xVar = (p008y1.x) o0Var2.A(p008y1.y.f193717a);
                if (i25 == 32) {
                    z25 = z17;
                } else {
                    z25 = false;
                }
                zB = z25 | o0Var2.B(xVar);
                objQ2 = o0Var2.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = new l(j0Var3, xVar);
                    o0Var2.K(objQ2);
                }
                l lVar2 = (l) objQ2;
                if (z14) {
                    o0Var2.C(-853822717);
                    h4.r.a aVar6 = h4.r.S;
                    int i37 = i27 | ((i17 >> 21) & 112);
                    z27 = (((((i37 & 14) ^ 6) > i19 || !o0Var2.B(j0Var3)) && (i37 & 6) != i19) ? false : z17) | (((((i37 & 112) ^ 48) > 32 || !o0Var2.k(i14)) && (i37 & 48) != 32) ? false : z17);
                    objQ3 = o0Var2.q();
                    if (z27 || objQ3 == c2565a) {
                        objQ3 = new k(j0Var3, i14);
                        o0Var2.K(objQ3);
                    }
                    rVarF = g2.p.f(aVar6, (k) objQ3, j0Var3.f80950z, b2Var2);
                    o0Var2.g0(false);
                } else {
                    o0Var2.C(-853392933);
                    o0Var2.g0(false);
                    rVarF = h4.r.S;
                }
                rVarG = g2.p.g(rVar.then(j0Var3.C).then(j0Var3.A), mVar2, h1Var, b2Var2, z14);
                if (b2Var2 == b2Var3) {
                    z26 = z17;
                } else {
                    z26 = false;
                }
                if (z14) {
                    rVarThen = rVarG.then(p5.v.c(new ad0.f(z26, j0Var3, b0Var, 7), h4.r.S, false));
                } else {
                    rVarThen = rVarG.then(h4.r.S);
                }
                h4.r rVarI = u1.n.i(rVarThen.then(rVarF), j0Var3, b2Var, r1Var, z14, p0Var, j0Var3.f80943s, lVar2);
                j0Var2 = j0Var3;
                aVar2 = aVar;
                p3.o0 o0Var3 = o0Var2;
                g2.p0.a(mVar2, a5.f.a(rVarI.then(s0.b(h4.r.S, j0Var2, new d(j0Var2))), aVar2, null), j0Var2.f80948x, q0Var, o0Var3, 0);
                o0Var = o0Var3;
            }
            objQ9 = new g(j0Var3, z35);
            o0Var2.K(objQ9);
            h1 h1Var2 = (h1) objQ9;
            if (i25 == 32) {
                z18 = z17;
            } else {
                z18 = false;
            }
            if ((i17 & 458752) == 131072) {
                z19 = z17;
            } else {
                z19 = false;
            }
            z24 = z18 | z19;
            objQ = o0Var2.q();
            if (z24) {
                t3Var2 = t3Var;
                objQ = new p0(t3Var2, j0Var3);
                o0Var2.K(objQ);
            } else {
                t3Var2 = t3Var;
                objQ = new p0(t3Var2, j0Var3);
                o0Var2.K(objQ);
            }
            p0 p0Var2 = (p0) objQ;
            xVar = (p008y1.x) o0Var2.A(p008y1.y.f193717a);
            if (i25 == 32) {
                z25 = z17;
            } else {
                z25 = false;
            }
            zB = z25 | o0Var2.B(xVar);
            objQ2 = o0Var2.q();
            if (zB) {
                objQ2 = new l(j0Var3, xVar);
                o0Var2.K(objQ2);
            } else {
                objQ2 = new l(j0Var3, xVar);
                o0Var2.K(objQ2);
            }
            l lVar3 = (l) objQ2;
            if (z14) {
                o0Var2.C(-853822717);
                h4.r.a aVar7 = h4.r.S;
                int i38 = i27 | ((i17 >> 21) & 112);
                z27 = (((((i38 & 14) ^ 6) > i19 || !o0Var2.B(j0Var3)) && (i38 & 6) != i19) ? false : z17) | (((((i38 & 112) ^ 48) > 32 || !o0Var2.k(i14)) && (i38 & 48) != 32) ? false : z17);
                objQ3 = o0Var2.q();
                if (z27) {
                    objQ3 = new k(j0Var3, i14);
                    o0Var2.K(objQ3);
                } else {
                    objQ3 = new k(j0Var3, i14);
                    o0Var2.K(objQ3);
                }
                rVarF = g2.p.f(aVar7, (k) objQ3, j0Var3.f80950z, b2Var2);
                o0Var2.g0(false);
            } else {
                o0Var2.C(-853392933);
                o0Var2.g0(false);
                rVarF = h4.r.S;
            }
            rVarG = g2.p.g(rVar.then(j0Var3.C).then(j0Var3.A), mVar2, h1Var2, b2Var2, z14);
            if (b2Var2 == b2Var3) {
                z26 = z17;
            } else {
                z26 = false;
            }
            if (z14) {
                rVarThen = rVarG.then(p5.v.c(new ad0.f(z26, j0Var3, b0Var, 7), h4.r.S, false));
            } else {
                rVarThen = rVarG.then(h4.r.S);
            }
            h4.r rVarI2 = u1.n.i(rVarThen.then(rVarF), j0Var3, b2Var, r1Var, z14, p0Var2, j0Var3.f80943s, lVar3);
            j0Var2 = j0Var3;
            aVar2 = aVar;
            p3.o0 o0Var4 = o0Var2;
            g2.p0.a(mVar2, a5.f.a(rVarI2.then(s0.b(h4.r.S, j0Var2, new d(j0Var2))), aVar2, null), j0Var2.f80948x, q0Var, o0Var4, 0);
            o0Var = o0Var4;
        } else {
            t3Var2 = t3Var;
            aVar2 = aVar;
            j0Var2 = j0Var;
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final a5.a aVar8 = aVar2;
            final t3 t3Var3 = t3Var2;
            final j0 j0Var4 = j0Var2;
            p2VarI0.f135219d = new e23.p() { // from class: h2.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p3.p0.t(i15 | 1);
                    int iT2 = p3.p0.t(i16);
                    f.a(rVar, j0Var4, h2Var, b2Var, t3Var3, z14, r1Var, i14, f14, jVar, aVar8, lVar, bVar, cVar, uVar, eVar, (p3.m) obj, iT, iT2);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
