package e2;

import c2.h2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import g2.b2;
import g2.h1;
import kotlin.t1;
import o4.q0;
import p008y1.e1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x2;
import p3.x3;
import u1.r1;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    /* JADX WARN: Code duplicated, block: B:149:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:172:0x0256  */
    /* JADX WARN: Code duplicated, block: B:174:0x025d  */
    /* JADX WARN: Code duplicated, block: B:177:0x0272  */
    /* JADX WARN: Code duplicated, block: B:180:0x0295  */
    /* JADX WARN: Code duplicated, block: B:205:0x0303  */
    /* JADX WARN: Code duplicated, block: B:206:0x0306  */
    /* JADX WARN: Code duplicated, block: B:250:0x0395  */
    /* JADX WARN: Code duplicated, block: B:255:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:256:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:258:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:270:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:272:0x040d  */
    public static final void a(h4.r rVar, i0 i0Var, h2 h2Var, boolean z14, e1 e1Var, boolean z15, r1 r1Var, h4.d.b bVar, c2.j.l lVar, h4.d.c cVar, c2.j.e eVar, e23.l lVar2, p3.m mVar, int i14, int i15, int i16) {
        int i17;
        h4.d.b bVar2;
        c2.j.l lVar3;
        int i18;
        int i19;
        i0 i0Var2;
        o0 o0Var;
        h4.d.c cVar2;
        c2.j.e eVar2;
        h4.d.c cVar3;
        h4.d.b bVar3;
        int i24;
        c2.j.e eVar3;
        int i25;
        p1 p1VarQ;
        boolean z16;
        Object objQ;
        p3.m.a aVar;
        k23.m mVar2;
        boolean z17;
        Object objQ2;
        Object objQ3;
        p3.m.a.C2565a c2565a;
        o53.b0 b0Var;
        q0 q0Var;
        b2.a.C1515a c1515a;
        int i26;
        boolean z18;
        boolean zK;
        Object objQ4;
        i0 i0Var3;
        int i27;
        k23.m mVar3;
        int i28;
        c2.j.e eVar4;
        p008y1.b2 b2Var;
        h4.r rVarF;
        boolean zK2;
        Object objQ5;
        o0 o0VarE = mVar.E(924924659);
        if ((i14 & 6) == 0) {
            i17 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i17 = i14;
        }
        if ((i14 & 48) == 0) {
            i17 |= o0VarE.B(i0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i17 |= o0VarE.B(h2Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i17 |= o0VarE.h(false) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i17 |= o0VarE.h(z14) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i17 |= o0VarE.B(e1Var) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i17 |= o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i17 |= o0VarE.B(r1Var) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i17 |= 33554432;
        }
        int i29 = i16 & 512;
        if (i29 != 0) {
            i17 |= C.ENCODING_PCM_32BIT;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                i17 |= o0VarE.B(bVar2) ? 536870912 : 268435456;
            }
        }
        int i30 = i16 & 1024;
        if (i30 != 0) {
            lVar3 = lVar;
            i18 = i15 | 6;
        } else {
            lVar3 = lVar;
            if ((i15 & 6) == 0) {
                i18 = i15 | (o0VarE.B(lVar3) ? 4 : 2);
            } else {
                i18 = i15;
            }
        }
        int i34 = i16 & 2048;
        if (i34 != 0) {
            i18 |= 48;
        } else if ((i15 & 48) == 0) {
            i18 |= o0VarE.B(cVar) ? 32 : 16;
        }
        int i35 = i18;
        int i36 = i17;
        int i37 = i16 & 4096;
        if (i37 != 0) {
            i19 = i35 | 384;
        } else if ((i15 & 384) == 0) {
            i19 = i35 | (o0VarE.B(eVar) ? 256 : 128);
        } else {
            i19 = i35;
        }
        if ((i15 & 3072) == 0) {
            i19 |= o0VarE.r(lVar2) ? 2048 : 1024;
        }
        int i38 = i19;
        boolean z19 = true;
        if (o0VarE.n(i36 & 1, ((i36 & 306783379) == 306783378 && (i38 & 1171) == 1170) ? false : true)) {
            o0VarE.G0();
            b2.a.C1515a c1515a2 = null;
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                x1 x1Var = p3.n.f135158a;
                int i39 = i36 & (-234881025);
                if (i29 != 0) {
                    bVar2 = null;
                }
                if (i30 != 0) {
                    lVar3 = null;
                }
                cVar3 = i34 != 0 ? null : cVar;
                bVar3 = bVar2;
                lVar3 = lVar3;
                i24 = i39;
                if (i37 != 0) {
                    eVar3 = null;
                }
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                i25 = i24 >> 3;
                int i44 = i25 & 14;
                int i45 = i44 | ((i38 >> 6) & 112);
                p1VarQ = p0.q(lVar2, o0VarE);
                z16 = (((i45 & 14) ^ 6) <= 4 && o0VarE.B(i0Var)) || (i45 & 6) == 4;
                objQ = o0VarE.q();
                aVar = p3.m.f135153a;
                if (z16) {
                    e eVar5 = new e();
                    x2 x2Var = x2.f135386a;
                    x2Var.getClass();
                    final p3.d0 d0VarG = p0.g(x2Var, new cw1.g0(p0.g(x2Var, new dv0.f(p1VarQ, 19)), 8, i0Var, eVar5));
                    objQ = new p005kotlin.jvm.internal.g0(d0VarG) { // from class: e2.q
                        @Override // p005kotlin.jvm.internal.g0, k23.m
                        public final Object get() {
                            return ((x3) this.receiver).getF182175a();
                        }
                    };
                    o0VarE.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        e eVar6 = new e();
                        x2 x2Var2 = x2.f135386a;
                        x2Var2.getClass();
                        final Object d0VarG2 = p0.g(x2Var2, new cw1.g0(p0.g(x2Var2, new dv0.f(p1VarQ, 19)), 8, i0Var, eVar6));
                        objQ = new p005kotlin.jvm.internal.g0(d0VarG2) { // from class: e2.q
                            @Override // p005kotlin.jvm.internal.g0, k23.m
                            public final Object get() {
                                return ((x3) this.receiver).getF182175a();
                            }
                        };
                        o0VarE.K(objQ);
                    }
                }
                mVar2 = (k23.m) objQ;
                int i46 = i24 >> 9;
                int i47 = i44 | (i46 & 112);
                z17 = ((((i47 & 112) ^ 48) <= 32 && o0VarE.h(z14)) || (i47 & 48) == 32) | ((((i47 & 14) ^ 6) <= 4 && o0VarE.B(i0Var)) || (i47 & 6) == 4);
                objQ2 = o0VarE.q();
                if (z17) {
                    objQ2 = new f(i0Var, z14);
                    o0VarE.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new f(i0Var, z14);
                        o0VarE.K(objQ2);
                    }
                }
                h1 h1Var = (h1) objQ2;
                objQ3 = o0VarE.q();
                aVar.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ3 == c2565a) {
                    objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ3);
                }
                b0Var = (o53.b0) objQ3;
                q0Var = (q0) o0VarE.A(t1.f91489g);
                if (!((Boolean) o0VarE.A(t1.f91505w)).booleanValue()) {
                    b2.f75060a.getClass();
                    c1515a2 = b2.a.f75062b;
                }
                c1515a = c1515a2;
                int i48 = i38 << 18;
                i26 = (i24 & 65520) | (i46 & 3670016) | (i48 & 29360128) | (i48 & 234881024) | ((i38 << 27) & 1879048192);
                boolean z24 = ((((i26 & 896) ^ 384) <= 256 && o0VarE.B(h2Var)) || (i26 & 384) == 256) | ((((i26 & 112) ^ 48) <= 32 && o0VarE.B(i0Var)) || (i26 & 48) == 32);
                if (((i26 & 7168) ^ 3072) <= 2048 && o0VarE.h(false)) {
                    z18 = true;
                } else if ((i26 & 3072) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                zK = z24 | z18 | ((((57344 & i26) ^ 24576) <= 16384 && o0VarE.h(z14)) || (i26 & 24576) == 16384) | o0VarE.k(0) | ((((i26 & 3670016) ^ 1572864) <= 1048576 && o0VarE.B(bVar3)) || (i26 & 1572864) == 1048576) | ((((i26 & 29360128) ^ 12582912) <= 8388608 && o0VarE.B(cVar3)) || (i26 & 12582912) == 8388608) | ((((i26 & 234881024) ^ 100663296) <= 67108864 && o0VarE.B(eVar3)) || (i26 & 100663296) == 67108864) | ((((i26 & 1879048192) ^ C.ENCODING_PCM_32BIT) <= 536870912 && o0VarE.B(lVar3)) || (i26 & C.ENCODING_PCM_32BIT) == 536870912) | o0VarE.B(q0Var) | o0VarE.B(c1515a);
                objQ4 = o0VarE.q();
                if (!zK || objQ4 == c2565a) {
                    i0Var3 = i0Var;
                    o0Var = o0VarE;
                    i27 = 4;
                    c2.j.e eVar7 = eVar3;
                    t tVar = new t(i0Var3, z14, h2Var, false, mVar2, lVar3, eVar7, 0, b0Var, q0Var, c1515a, bVar3, cVar3);
                    mVar3 = mVar2;
                    i28 = 0;
                    eVar4 = eVar7;
                    o0Var.K(tVar);
                    objQ4 = tVar;
                } else {
                    i0Var3 = i0Var;
                    eVar4 = eVar3;
                    o0Var = o0VarE;
                    i27 = 4;
                    i28 = 0;
                    mVar3 = mVar2;
                }
                g2.q0 q0Var2 = (g2.q0) objQ4;
                if (z14) {
                    b2Var = p008y1.b2.Vertical;
                } else {
                    b2Var = p008y1.b2.Horizontal;
                }
                if (z15) {
                    o0Var.C(-2077147368);
                    h4.r.a aVar2 = h4.r.S;
                    if ((((i25 & 14) ^ 6) > i27 || !o0Var.B(i0Var3)) && (i25 & 6) != i27) {
                    }
                    zK2 = z19 | o0Var.k(i28);
                    objQ5 = o0Var.q();
                    if (zK2 || objQ5 == c2565a) {
                        objQ5 = new g(i0Var3, i28);
                        o0Var.K(objQ5);
                    }
                    rVarF = g2.p.f(aVar2, (g) objQ5, i0Var3.f62448o, b2Var);
                    o0Var.g0(false);
                } else {
                    o0Var.C(-2076718545);
                    o0Var.g0(false);
                    rVarF = h4.r.S;
                }
                i0Var2 = i0Var3;
                g2.p0.a(mVar3, u1.n.i(g2.p.g(rVar.then(i0Var3.f62445l).then(i0Var3.f62446m), mVar3, h1Var, b2Var, z15).then(rVarF).then(i0Var3.f62447n.f75045k), i0Var3, b2Var, r1Var, z15, e1Var, i0Var3.f62440g, null), i0Var2.f62449p, q0Var2, o0Var, 0);
                eVar2 = eVar4;
                bVar2 = bVar3;
                cVar2 = cVar3;
            } else {
                o0VarE.e();
                cVar3 = cVar;
                bVar3 = bVar2;
                lVar3 = lVar3;
                i24 = i36 & (-234881025);
            }
            eVar3 = eVar;
            o0VarE.h0();
            x1 x1Var3 = p3.n.f135158a;
            i25 = i24 >> 3;
            int i49 = i25 & 14;
            int i410 = i49 | ((i38 >> 6) & 112);
            p1VarQ = p0.q(lVar2, o0VarE);
            if (((i410 & 14) ^ 6) <= 4) {
            }
            objQ = o0VarE.q();
            aVar = p3.m.f135153a;
            if (z16) {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    e eVar8 = new e();
                    x2 x2Var3 = x2.f135386a;
                    x2Var3.getClass();
                    final Object d0VarG3 = p0.g(x2Var3, new cw1.g0(p0.g(x2Var3, new dv0.f(p1VarQ, 19)), 8, i0Var, eVar8));
                    objQ = new p005kotlin.jvm.internal.g0(d0VarG3) { // from class: e2.q
                        @Override // p005kotlin.jvm.internal.g0, k23.m
                        public final Object get() {
                            return ((x3) this.receiver).getF182175a();
                        }
                    };
                    o0VarE.K(objQ);
                }
            } else {
                e eVar9 = new e();
                x2 x2Var4 = x2.f135386a;
                x2Var4.getClass();
                final Object d0VarG4 = p0.g(x2Var4, new cw1.g0(p0.g(x2Var4, new dv0.f(p1VarQ, 19)), 8, i0Var, eVar9));
                objQ = new p005kotlin.jvm.internal.g0(d0VarG4) { // from class: e2.q
                    @Override // p005kotlin.jvm.internal.g0, k23.m
                    public final Object get() {
                        return ((x3) this.receiver).getF182175a();
                    }
                };
                o0VarE.K(objQ);
            }
            mVar2 = (k23.m) objQ;
            int i411 = i24 >> 9;
            int i412 = i49 | (i411 & 112);
            if (((i412 & 14) ^ 6) <= 4) {
            }
            z17 = ((((i412 & 112) ^ 48) <= 32 && o0VarE.h(z14)) || (i412 & 48) == 32) | ((((i412 & 14) ^ 6) <= 4 && o0VarE.B(i0Var)) || (i412 & 6) == 4);
            objQ2 = o0VarE.q();
            if (z17) {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f(i0Var, z14);
                    o0VarE.K(objQ2);
                }
            } else {
                objQ2 = new f(i0Var, z14);
                o0VarE.K(objQ2);
            }
            h1 h1Var2 = (h1) objQ2;
            objQ3 = o0VarE.q();
            aVar.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            b0Var = (o53.b0) objQ3;
            q0Var = (q0) o0VarE.A(t1.f91489g);
            if (!((Boolean) o0VarE.A(t1.f91505w)).booleanValue()) {
                b2.f75060a.getClass();
                c1515a2 = b2.a.f75062b;
            }
            c1515a = c1515a2;
            int i413 = i38 << 18;
            i26 = (i24 & 65520) | (i411 & 3670016) | (i413 & 29360128) | (i413 & 234881024) | ((i38 << 27) & 1879048192);
            if (((i26 & 112) ^ 48) <= 32) {
            }
            boolean z25 = ((((i26 & 896) ^ 384) <= 256 && o0VarE.B(h2Var)) || (i26 & 384) == 256) | ((((i26 & 112) ^ 48) <= 32 && o0VarE.B(i0Var)) || (i26 & 48) == 32);
            if (((i26 & 7168) ^ 3072) <= 2048) {
            }
            if ((i26 & 3072) == 2048) {
                z18 = true;
            } else {
                z18 = false;
            }
            zK = z25 | z18 | ((((57344 & i26) ^ 24576) <= 16384 && o0VarE.h(z14)) || (i26 & 24576) == 16384) | o0VarE.k(0) | ((((i26 & 3670016) ^ 1572864) <= 1048576 && o0VarE.B(bVar3)) || (i26 & 1572864) == 1048576) | ((((i26 & 29360128) ^ 12582912) <= 8388608 && o0VarE.B(cVar3)) || (i26 & 12582912) == 8388608) | ((((i26 & 234881024) ^ 100663296) <= 67108864 && o0VarE.B(eVar3)) || (i26 & 100663296) == 67108864) | ((((i26 & 1879048192) ^ C.ENCODING_PCM_32BIT) <= 536870912 && o0VarE.B(lVar3)) || (i26 & C.ENCODING_PCM_32BIT) == 536870912) | o0VarE.B(q0Var) | o0VarE.B(c1515a);
            objQ4 = o0VarE.q();
            if (zK) {
                i0Var3 = i0Var;
                o0Var = o0VarE;
                i27 = 4;
                c2.j.e eVar10 = eVar3;
                t tVar2 = new t(i0Var3, z14, h2Var, false, mVar2, lVar3, eVar10, 0, b0Var, q0Var, c1515a, bVar3, cVar3);
                mVar3 = mVar2;
                i28 = 0;
                eVar4 = eVar10;
                o0Var.K(tVar2);
                objQ4 = tVar2;
            } else {
                i0Var3 = i0Var;
                o0Var = o0VarE;
                i27 = 4;
                c2.j.e eVar11 = eVar3;
                t tVar3 = new t(i0Var3, z14, h2Var, false, mVar2, lVar3, eVar11, 0, b0Var, q0Var, c1515a, bVar3, cVar3);
                mVar3 = mVar2;
                i28 = 0;
                eVar4 = eVar11;
                o0Var.K(tVar3);
                objQ4 = tVar3;
            }
            g2.q0 q0Var3 = (g2.q0) objQ4;
            if (z14) {
                b2Var = p008y1.b2.Vertical;
            } else {
                b2Var = p008y1.b2.Horizontal;
            }
            if (z15) {
                o0Var.C(-2077147368);
                h4.r.a aVar3 = h4.r.S;
                z19 = ((i25 & 14) ^ 6) > i27 ? false : false;
                zK2 = z19 | o0Var.k(i28);
                objQ5 = o0Var.q();
                if (zK2) {
                    objQ5 = new g(i0Var3, i28);
                    o0Var.K(objQ5);
                } else {
                    objQ5 = new g(i0Var3, i28);
                    o0Var.K(objQ5);
                }
                rVarF = g2.p.f(aVar3, (g) objQ5, i0Var3.f62448o, b2Var);
                o0Var.g0(false);
            } else {
                o0Var.C(-2076718545);
                o0Var.g0(false);
                rVarF = h4.r.S;
            }
            i0Var2 = i0Var3;
            g2.p0.a(mVar3, u1.n.i(g2.p.g(rVar.then(i0Var3.f62445l).then(i0Var3.f62446m), mVar3, h1Var2, b2Var, z15).then(rVarF).then(i0Var3.f62447n.f75045k), i0Var3, b2Var, r1Var, z15, e1Var, i0Var3.f62440g, null), i0Var2.f62449p, q0Var3, o0Var, 0);
            eVar2 = eVar4;
            bVar2 = bVar3;
            cVar2 = cVar3;
        } else {
            i0Var2 = i0Var;
            o0Var = o0VarE;
            o0Var.e();
            cVar2 = cVar;
            eVar2 = eVar;
        }
        c2.j.l lVar4 = lVar3;
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(rVar, i0Var2, h2Var, z14, e1Var, z15, r1Var, bVar2, lVar4, cVar2, eVar2, lVar2, i14, i15, i16);
        }
    }
}
