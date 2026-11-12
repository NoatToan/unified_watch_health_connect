package f2;

import c2.h2;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import et1.a2;
import ew1.c2;
import g2.b2;
import kotlin.t1;
import p008y1.e1;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x2;
import p3.x3;
import u1.r1;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    /* JADX WARN: Code duplicated, block: B:120:0x016d  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:181:0x028e  */
    public static final void a(h4.r rVar, p0 p0Var, m0 m0Var, h2 h2Var, e1 e1Var, boolean z14, r1 r1Var, c2.j.l lVar, c2.j.e eVar, e23.l lVar2, p3.m mVar, int i14, int i15) {
        int i16;
        int i17;
        p3.o0 o0Var;
        p0 p0Var2;
        b2.a.C1515a c1515a;
        boolean z15;
        p0 p0Var3;
        p3.o0 o0Var2;
        int i18;
        k23.m mVar2;
        h4.r rVarF;
        p3.o0 o0VarE = mVar.E(708740370);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(p0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(m0Var) : o0VarE.r(m0Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.B(h2Var) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.h(false) ? 16384 : 8192;
        }
        if ((i14 & 196608) == 0) {
            i16 |= o0VarE.h(true) ? 131072 : 65536;
        }
        if ((i14 & 1572864) == 0) {
            i16 |= o0VarE.B(e1Var) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i16 |= o0VarE.h(z14) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i16 |= o0VarE.B(r1Var) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i16 |= o0VarE.B(lVar) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.B(eVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= o0VarE.r(lVar2) ? 32 : 16;
        }
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 19) == 18) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            int i19 = i16 >> 3;
            int i24 = i19 & 14;
            int i25 = i24 | (i17 & 112);
            p1 p1VarQ = p3.p0.q(lVar2, o0VarE);
            int i26 = i16;
            boolean z16 = (((i25 & 14) ^ 6) > 4 && o0VarE.B(p0Var)) || (i25 & 6) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (z16) {
                x2 x2Var = x2.f135386a;
                x2Var.getClass();
                final p3.d0 d0VarG = p3.p0.g(x2Var, new c2(10, p3.p0.g(x2Var, new a2(p1VarQ, 4)), p0Var));
                objQ = new p005kotlin.jvm.internal.g0(d0VarG) { // from class: f2.q
                    @Override // p005kotlin.jvm.internal.g0, k23.m
                    public final Object get() {
                        return ((x3) this.receiver).getF182175a();
                    }
                };
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    x2 x2Var2 = x2.f135386a;
                    x2Var2.getClass();
                    final Object d0VarG2 = p3.p0.g(x2Var2, new c2(10, p3.p0.g(x2Var2, new a2(p1VarQ, 4)), p0Var));
                    objQ = new p005kotlin.jvm.internal.g0(d0VarG2) { // from class: f2.q
                        @Override // p005kotlin.jvm.internal.g0, k23.m
                        public final Object get() {
                            return ((x3) this.receiver).getF182175a();
                        }
                    };
                    o0VarE.K(objQ);
                }
            }
            k23.m mVar3 = (k23.m) objQ;
            int i27 = i24 | ((i26 >> 9) & 112);
            boolean z17 = ((((i27 & 14) ^ 6) > 4 && o0VarE.B(p0Var)) || (i27 & 6) == 4) | ((((i27 & 112) ^ 48) > 32 && o0VarE.h(false)) || (i27 & 48) == 32);
            Object objQ2 = o0VarE.q();
            if (z17) {
                objQ2 = new s0(p0Var);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new s0(p0Var);
                    o0VarE.K(objQ2);
                }
            }
            s0 s0Var = (s0) objQ2;
            Object objQ3 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ3);
            }
            o53.b0 b0Var = (o53.b0) objQ3;
            o4.q0 q0Var = (o4.q0) o0VarE.A(t1.f91489g);
            if (((Boolean) o0VarE.A(t1.f91505w)).booleanValue()) {
                c1515a = null;
            } else {
                b2.f75060a.getClass();
                c1515a = b2.a.f75062b;
            }
            b2.a.C1515a c1515a2 = c1515a;
            int i28 = (i26 & 524272) | ((i17 << 18) & 3670016) | ((i26 >> 6) & 29360128);
            boolean z18 = ((((i28 & 896) ^ 384) > 256 && o0VarE.B(m0Var)) || (i28 & 384) == 256) | ((((i28 & 112) ^ 48) > 32 && o0VarE.B(p0Var)) || (i28 & 48) == 32) | ((((i28 & 7168) ^ 3072) > 2048 && o0VarE.B(h2Var)) || (i28 & 3072) == 2048);
            if (((57344 & i28) ^ 24576) > 16384 && o0VarE.h(false)) {
                z15 = true;
            } else if ((i28 & 24576) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean zB = z18 | z15 | ((((458752 & i28) ^ 196608) > 131072 && o0VarE.h(true)) || (i28 & 196608) == 131072) | ((((i28 & 3670016) ^ 1572864) > 1048576 && o0VarE.B(eVar)) || (i28 & 1572864) == 1048576) | ((((i28 & 29360128) ^ 12582912) > 8388608 && o0VarE.B(lVar)) || (i28 & 12582912) == 8388608) | o0VarE.B(q0Var);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                p0Var3 = p0Var;
                o0Var2 = o0VarE;
                i18 = 4;
                w wVar = new w(p0Var3, true, h2Var, false, mVar3, m0Var, lVar, eVar, b0Var, q0Var, c1515a2);
                mVar2 = mVar3;
                o0Var2.K(wVar);
                objQ4 = wVar;
            } else {
                p0Var3 = p0Var;
                o0Var2 = o0VarE;
                mVar2 = mVar3;
                i18 = 4;
            }
            g2.q0 q0Var2 = (g2.q0) objQ4;
            p008y1.b2 b2Var = p008y1.b2.Vertical;
            if (z14) {
                o0Var2.C(27281635);
                h4.r.a aVar2 = h4.r.S;
                boolean z19 = ((i24 ^ 6) > i18 && o0Var2.B(p0Var3)) || (i19 & 6) == i18;
                Object objQ5 = o0Var2.q();
                if (z19 || objQ5 == c2565a) {
                    objQ5 = new e(p0Var3);
                    o0Var2.K(objQ5);
                }
                rVarF = g2.p.f(aVar2, (e) objQ5, p0Var3.f68274n, b2Var);
                o0Var2.g0(false);
            } else {
                o0Var2.C(27577840);
                o0Var2.g0(false);
                rVarF = h4.r.S;
            }
            p0Var2 = p0Var3;
            o0Var = o0Var2;
            g2.p0.a(mVar2, u1.n.i(g2.p.g(rVar.then(p0Var3.f68271k).then(p0Var3.f68272l), mVar2, s0Var, b2Var, z14).then(rVarF).then(p0Var3.f68273m.f75045k), p0Var3, b2Var, r1Var, z14, e1Var, p0Var3.f68266f, null), p0Var2.f68275o, q0Var2, o0Var, 0);
        } else {
            o0Var = o0VarE;
            p0Var2 = p0Var;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c12.f(rVar, p0Var2, m0Var, h2Var, e1Var, z14, r1Var, lVar, eVar, lVar2, i14, i15);
        }
    }
}
