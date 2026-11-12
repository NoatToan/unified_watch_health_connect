package l72;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import i3.u5;
import i3.ua;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {
    public static final void a(u4.d dVar, long j8, boolean z14, p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(1582269734);
        int i15 = i14 | (o0VarE.B(dVar) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16) | (o0VarE.h(z14) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            if (dVar != null) {
                o0VarE.C(131698135);
                long jC = z14 ? j8 : o4.d0.c(0.5f, j8, 14);
                g6.f.a aVar = g6.f.f75994b;
                u1.y0.b(dVar, "", c2.x2.q(c2.l.C(h4.r.S, 0.0f, 0.0f, 8, 0.0f, 11), 16), o4.e0.a.a(o4.e0.f128843b, jC), o0VarE, (i15 & 14) | 432, 56);
                o0VarE.g0(false);
            } else {
                o0VarE.C(132041212);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d0(dVar, j8, z14, i14, 1);
        }
    }

    public static final void b(h4.r rVar, long j8, float f14, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-1460396709);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.l(j8) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.i(f14) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarThen = rVar.then(c2.x2.q(h4.r.S, f14));
            o4.u1.f129010b.getClass();
            int i16 = o4.u1.f129012d;
            g6.f.a aVar = g6.f.f75994b;
            o0Var = o0VarE;
            ua.a(2, 0.0f, i16, (i15 & 112) | 384, 40, j8, 0L, rVarThen, o0Var);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u5(rVar, j8, f14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123 A[PHI: r5 r7 r8 r13
      0x0123: PHI (r5v8 long) = (r5v4 long), (r5v2 long), (r5v2 long) binds: [B:111:0x014d, B:99:0x011f, B:100:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r7v18 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>) = 
      (r7v6 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r7v3 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
      (r7v3 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:111:0x014d, B:99:0x011f, B:100:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r8v25 int) = (r8v18 int), (r8v26 int), (r8v27 int) binds: [B:111:0x014d, B:99:0x011f, B:100:0x0121] A[DONT_GENERATE, DONT_INLINE]
      0x0123: PHI (r13v10 c2.h2) = (r13v5 c2.h2), (r13v3 c2.h2), (r13v3 c2.h2) binds: [B:111:0x014d, B:99:0x011f, B:100:0x0121] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:103:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0129  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x013a  */
    /* JADX WARN: Code duplicated, block: B:112:0x014f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0169  */
    /* JADX WARN: Code duplicated, block: B:116:0x016c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181  */
    /* JADX WARN: Code duplicated, block: B:122:0x019e  */
    /* JADX WARN: Code duplicated, block: B:124:0x01af  */
    /* JADX WARN: Code duplicated, block: B:127:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:133:0x023b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0246  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(e23.p<? super p3.m, ? super Integer, Unit> pVar, final String str, @SuppressLint({"ModifierParameter"}) final h4.r rVar, final boolean z14, final i3.b1 b1Var, c2.h2 h2Var, final e23.a<Unit> aVar, long j8, s5.x0 x0Var, p3.m mVar, final int i14, final int i15) {
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        int i16;
        String str2;
        c2.h2 h2VarA;
        long j14;
        final s5.x0 x0Var2;
        boolean z15;
        final long j15;
        final c2.h2 h2Var2;
        p3.p2 p2VarI0;
        u1.u uVarA;
        s5.x0 x0Var3;
        long jC;
        Object objQ;
        p3.p1 p1VarI;
        long j16;
        int i17;
        p3.o0 o0VarE = mVar.E(196647640);
        int i18 = i15 & 1;
        if (i18 != 0) {
            i16 = i14 | 6;
            pVar2 = pVar;
        } else if ((i14 & 6) == 0) {
            pVar2 = pVar;
            i16 = (o0VarE.r(pVar2) ? 4 : 2) | i14;
        } else {
            pVar2 = pVar;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str2 = str;
            i16 |= o0VarE.B(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.B(rVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(b1Var) ? 16384 : 8192;
        }
        int i19 = i15 & 32;
        if (i19 == 0) {
            if ((196608 & i14) == 0) {
                h2VarA = h2Var;
                i16 |= o0VarE.B(h2VarA) ? 131072 : 65536;
            }
            if ((1572864 & i14) != 0) {
                if (o0VarE.r(aVar)) {
                    i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i17 = 524288;
                }
                i16 |= i17;
            }
            if ((i14 & 12582912) == 0) {
                if ((i15 & 128) == 0) {
                    j14 = j8;
                    int i24 = o0VarE.l(j14) ? 8388608 : 4194304;
                    i16 |= i24;
                } else {
                    j14 = j8;
                }
                i16 |= i24;
            } else {
                j14 = j8;
            }
            if ((i14 & 100663296) == 0) {
                if ((i15 & 256) == 0) {
                    x0Var2 = x0Var;
                    int i25 = o0VarE.B(x0Var2) ? 67108864 : 33554432;
                    i16 |= i25;
                } else {
                    x0Var2 = x0Var;
                }
                i16 |= i25;
            } else {
                x0Var2 = x0Var;
            }
            if ((i16 & 38347923) != 38347922) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                o0VarE.G0();
                uVarA = null;
                if ((i14 & 1) != 0 || o0VarE.o0()) {
                    if (i18 != 0) {
                        pVar2 = null;
                    }
                    if (i19 != 0) {
                        g6.f.a aVar2 = g6.f.f75994b;
                        h2VarA = c2.l.a(16);
                    }
                    if ((i15 & 128) != 0) {
                        d92.b.f58623a.getClass();
                        j14 = d92.b.a(o0VarE).k().f63527d;
                        i16 &= -29360129;
                    }
                    if ((i15 & 256) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i16 &= -234881025;
                        x0Var3 = j92.f.f97931h;
                    }
                    c2.h2 h2Var3 = h2VarA;
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    if (z14) {
                        jC = j14;
                    } else {
                        jC = o4.d0.c(0.5f, j14, 14);
                    }
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    a2.j jVar = (a2.j) objQ;
                    p1VarI = zf.b.i(jVar, o0VarE, 6);
                    p3.p1 p1VarK = xy2.b.k(jVar, o0VarE, 6);
                    d92.b.f58623a.getClass();
                    if (d92.b.d(o0VarE)) {
                        j16 = zl.a.b(o0VarE, -155101, o0VarE).f63508c;
                    } else {
                        j16 = zl.a.b(o0VarE, -154045, o0VarE).f63509d;
                    }
                    o0VarE.g0(false);
                    if (((Boolean) p1VarI.getF182175a()).booleanValue() || ((Boolean) p1VarK.getF182175a()).booleanValue()) {
                        g6.f.a aVar3 = g6.f.f75994b;
                        uVarA = u1.n.a(2, j16);
                    }
                    u1.u uVar = uVarA;
                    i3.c1.f87691a.getClass();
                    g6.f.a aVar4 = g6.f.f75994b;
                    e23.p<? super p3.m, ? super Integer, Unit> pVar3 = pVar2;
                    i3.h1.a(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), b1Var, null, uVar, h2Var3, jVar, z3.f.c(320848584, new j21.s(pVar3, str2, x0Var3, jC), o0VarE), o0VarE, ((i16 >> 18) & 14) | 905969664 | ((i16 >> 3) & 896) | (57344 & i16) | (29360128 & (i16 << 6)), 32);
                    h2Var2 = h2Var3;
                    pVar2 = pVar3;
                    x0Var2 = x0Var3;
                    j15 = j14;
                } else {
                    o0VarE.e();
                    if ((i15 & 128) != 0) {
                        i16 &= -29360129;
                    }
                    if ((i15 & 256) != 0) {
                        i16 &= -234881025;
                    }
                }
                x0Var3 = x0Var2;
                c2.h2 h2Var4 = h2VarA;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                if (z14) {
                    jC = j14;
                } else {
                    jC = o4.d0.c(0.5f, j14, 14);
                }
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar2 = (a2.j) objQ;
                p1VarI = zf.b.i(jVar2, o0VarE, 6);
                p3.p1 p1VarK2 = xy2.b.k(jVar2, o0VarE, 6);
                d92.b.f58623a.getClass();
                if (d92.b.d(o0VarE)) {
                    j16 = zl.a.b(o0VarE, -155101, o0VarE).f63508c;
                } else {
                    j16 = zl.a.b(o0VarE, -154045, o0VarE).f63509d;
                }
                o0VarE.g0(false);
                if (((Boolean) p1VarI.getF182175a()).booleanValue()) {
                    g6.f.a aVar5 = g6.f.f75994b;
                    uVarA = u1.n.a(2, j16);
                } else {
                    g6.f.a aVar6 = g6.f.f75994b;
                    uVarA = u1.n.a(2, j16);
                }
                u1.u uVar2 = uVarA;
                i3.c1.f87691a.getClass();
                g6.f.a aVar7 = g6.f.f75994b;
                e23.p<? super p3.m, ? super Integer, Unit> pVar4 = pVar2;
                i3.h1.a(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), b1Var, null, uVar2, h2Var4, jVar2, z3.f.c(320848584, new j21.s(pVar4, str2, x0Var3, jC), o0VarE), o0VarE, ((i16 >> 18) & 14) | 905969664 | ((i16 >> 3) & 896) | (57344 & i16) | (29360128 & (i16 << 6)), 32);
                h2Var2 = h2Var4;
                pVar2 = pVar4;
                x0Var2 = x0Var3;
                j15 = j14;
            } else {
                o0VarE.e();
                j15 = j14;
                h2Var2 = h2VarA;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                final e23.p<? super p3.m, ? super Integer, Unit> pVar5 = pVar2;
                p2VarI0.f135219d = new e23.p() { // from class: l72.g0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        i0.c(pVar5, str, rVar, z14, b1Var, h2Var2, aVar, j15, x0Var2, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i16 |= 196608;
        h2VarA = h2Var;
        if ((1572864 & i14) != 0) {
            if (o0VarE.r(aVar)) {
                i17 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i17 = 524288;
            }
            i16 |= i17;
        }
        if ((i14 & 12582912) == 0) {
            if ((i15 & 128) == 0) {
                j14 = j8;
                if (o0VarE.l(j14)) {
                }
                i16 |= i24;
            } else {
                j14 = j8;
            }
            i16 |= i24;
        } else {
            j14 = j8;
        }
        if ((i14 & 100663296) == 0) {
            if ((i15 & 256) == 0) {
                x0Var2 = x0Var;
                if (o0VarE.B(x0Var2)) {
                }
                i16 |= i25;
            } else {
                x0Var2 = x0Var;
            }
            i16 |= i25;
        } else {
            x0Var2 = x0Var;
        }
        if ((i16 & 38347923) != 38347922) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            o0VarE.G0();
            uVarA = null;
            if ((i14 & 1) != 0) {
                if (i18 != 0) {
                    pVar2 = null;
                }
                if (i19 != 0) {
                    g6.f.a aVar8 = g6.f.f75994b;
                    h2VarA = c2.l.a(16);
                }
                if ((i15 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    j14 = d92.b.a(o0VarE).k().f63527d;
                    i16 &= -29360129;
                }
                if ((i15 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i16 &= -234881025;
                    x0Var3 = j92.f.f97931h;
                } else {
                    x0Var3 = x0Var2;
                }
            } else {
                if (i18 != 0) {
                    pVar2 = null;
                }
                if (i19 != 0) {
                    g6.f.a aVar9 = g6.f.f75994b;
                    h2VarA = c2.l.a(16);
                }
                if ((i15 & 128) != 0) {
                    d92.b.f58623a.getClass();
                    j14 = d92.b.a(o0VarE).k().f63527d;
                    i16 &= -29360129;
                }
                if ((i15 & 256) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i16 &= -234881025;
                    x0Var3 = j92.f.f97931h;
                } else {
                    x0Var3 = x0Var2;
                }
            }
            c2.h2 h2Var5 = h2VarA;
            o0VarE.h0();
            p3.x1 x1Var3 = p3.n.f135158a;
            if (z14) {
                jC = j14;
            } else {
                jC = o4.d0.c(0.5f, j14, 14);
            }
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar3 = (a2.j) objQ;
            p1VarI = zf.b.i(jVar3, o0VarE, 6);
            p3.p1 p1VarK3 = xy2.b.k(jVar3, o0VarE, 6);
            d92.b.f58623a.getClass();
            if (d92.b.d(o0VarE)) {
                j16 = zl.a.b(o0VarE, -155101, o0VarE).f63508c;
            } else {
                j16 = zl.a.b(o0VarE, -154045, o0VarE).f63509d;
            }
            o0VarE.g0(false);
            if (((Boolean) p1VarI.getF182175a()).booleanValue()) {
                g6.f.a aVar10 = g6.f.f75994b;
                uVarA = u1.n.a(2, j16);
            } else {
                g6.f.a aVar11 = g6.f.f75994b;
                uVarA = u1.n.a(2, j16);
            }
            u1.u uVar3 = uVarA;
            i3.c1.f87691a.getClass();
            g6.f.a aVar12 = g6.f.f75994b;
            e23.p<? super p3.m, ? super Integer, Unit> pVar6 = pVar2;
            i3.h1.a(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), b1Var, null, uVar3, h2Var5, jVar3, z3.f.c(320848584, new j21.s(pVar6, str2, x0Var3, jC), o0VarE), o0VarE, ((i16 >> 18) & 14) | 905969664 | ((i16 >> 3) & 896) | (57344 & i16) | (29360128 & (i16 << 6)), 32);
            h2Var2 = h2Var5;
            pVar2 = pVar6;
            x0Var2 = x0Var3;
            j15 = j14;
        } else {
            o0VarE.e();
            j15 = j14;
            h2Var2 = h2VarA;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            final e23.p pVar7 = pVar2;
            p2VarI0.f135219d = new e23.p() { // from class: l72.g0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i0.c(pVar7, str, rVar, z14, b1Var, h2Var2, aVar, j15, x0Var2, (p3.m) obj, p3.p0.t(i14 | 1), i15);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0162  */
    /* JADX WARN: Code duplicated, block: B:105:0x016e  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:95:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, h4.r rVar, final boolean z14, s5.x0 x0Var, final long j8, e23.p<? super p3.m, ? super Integer, Unit> pVar, c2.h2 h2Var, e23.a<Unit> aVar, p3.m mVar, int i14, int i15) {
        String str2;
        int i16;
        s5.x0 x0Var2;
        e23.p<? super p3.m, ? super Integer, Unit> pVar2;
        int i17;
        c2.h2 h2VarA;
        int i18;
        boolean z15;
        p3.o0 o0Var;
        s5.x0 x0Var3;
        e23.p<? super p3.m, ? super Integer, Unit> pVar3;
        c2.h2 h2Var2;
        p3.p2 p2VarI0;
        Object objQ;
        p3.p1 p1VarI;
        long j14;
        u1.u uVarA;
        int i19;
        p3.o0 o0VarE = mVar.E(1705624838);
        if ((i14 & 6) == 0) {
            str2 = str;
            i16 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.h(z14) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                x0Var2 = x0Var;
                int i24 = o0VarE.B(x0Var2) ? 2048 : 1024;
                i16 |= i24;
            } else {
                x0Var2 = x0Var;
            }
            i16 |= i24;
        } else {
            x0Var2 = x0Var;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.l(j8) ? 16384 : 8192;
        }
        int i25 = i15 & 32;
        if (i25 == 0) {
            if ((196608 & i14) == 0) {
                pVar2 = pVar;
                i16 |= o0VarE.r(pVar2) ? 131072 : 65536;
            }
            i17 = i15 & 64;
            if (i17 != 0) {
                if ((1572864 & i14) == 0) {
                    h2VarA = h2Var;
                    if (o0VarE.B(h2VarA)) {
                        i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i18 = 524288;
                    }
                    i16 |= i18;
                }
                if ((i14 & 12582912) == 0) {
                    if (o0VarE.r(aVar)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                    i16 |= i19;
                }
                if ((i16 & 4793491) != 4793490) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i16 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if ((i15 & 8) != 0) {
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            i16 &= -7169;
                            x0Var2 = j92.f.f97931h;
                        }
                        if (i25 != 0) {
                            pVar2 = null;
                        }
                        if (i17 != 0) {
                            g6.f.a aVar2 = g6.f.f75994b;
                            h2VarA = c2.l.a(16);
                        }
                    } else {
                        o0VarE.e();
                        if ((i15 & 8) != 0) {
                            i16 &= -7169;
                        }
                    }
                    int i26 = i16;
                    final s5.x0 x0Var4 = x0Var2;
                    o0VarE.h0();
                    p3.x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = kg.f.b(o0VarE);
                    }
                    a2.j jVar = (a2.j) objQ;
                    p1VarI = zf.b.i(jVar, o0VarE, 6);
                    p3.p1 p1VarK = xy2.b.k(jVar, o0VarE, 6);
                    d92.b.f58623a.getClass();
                    if (d92.b.d(o0VarE)) {
                        j14 = zl.a.b(o0VarE, -1572019503, o0VarE).f63508c;
                    } else {
                        j14 = zl.a.b(o0VarE, -1572018447, o0VarE).f63509d;
                    }
                    o0VarE.g0(false);
                    if (!((Boolean) p1VarI.getF182175a()).booleanValue() || ((Boolean) p1VarK.getF182175a()).booleanValue()) {
                        g6.f.a aVar3 = g6.f.f75994b;
                        uVarA = u1.n.a(2, j14);
                    } else {
                        uVarA = null;
                    }
                    i3.c1.f87691a.getClass();
                    g6.f.a aVar4 = g6.f.f75994b;
                    o0Var = o0VarE;
                    final String str3 = str2;
                    final e23.p<? super p3.m, ? super Integer, Unit> pVar4 = pVar2;
                    c2.h2 h2Var3 = h2VarA;
                    i3.h1.c(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), i3.c1.c(0L, j8, o4.d0.c(0.5f, j8, 14), o0VarE, 5), uVarA, h2Var3, jVar, z3.f.c(274565251, new e23.q() { // from class: l72.h0
                        @Override // e23.q
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            p3.m mVar2 = (p3.m) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((c2.t2) obj).getClass();
                            if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                                p3.x1 x1Var2 = p3.n.f135158a;
                                e23.p pVar5 = pVar4;
                                if (pVar5 == null) {
                                    mVar2.C(1955686998);
                                } else {
                                    mVar2.C(1864201995);
                                    pVar5.invoke(mVar2, 0);
                                }
                                mVar2.f();
                                String str4 = str3;
                                if (str4 != null) {
                                    mVar2.C(1955727578);
                                    boolean z16 = z14;
                                    long jC = j8;
                                    if (!z16) {
                                        jC = o4.d0.c(0.5f, jC, 14);
                                    }
                                    s5.x0 x0VarA = s5.x0.a(x0Var4, jC, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                    d6.h.f57752b.getClass();
                                    mh.c(str4, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar2, 0, 0, 130046);
                                    mVar2.f();
                                } else {
                                    mVar2.C(1955916895);
                                    mVar2.f();
                                }
                            } else {
                                mVar2.e();
                            }
                            return Unit.INSTANCE;
                        }
                    }, o0Var), o0Var, ((i26 >> 21) & 14) | 905969664 | (i26 & 896) | ((i26 << 3) & 29360128), 32);
                    x0Var3 = x0Var4;
                    h2Var2 = h2Var3;
                    pVar3 = pVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    x0Var3 = x0Var2;
                    pVar3 = pVar2;
                    h2Var2 = h2VarA;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new b82.z0(str, rVar, z14, x0Var3, j8, pVar3, h2Var2, aVar, i14, i15);
                }
            }
            i16 |= 1572864;
            h2VarA = h2Var;
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i16 |= i19;
            }
            if ((i16 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i16 &= -7169;
                        x0Var2 = j92.f.f97931h;
                    }
                    if (i25 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        g6.f.a aVar5 = g6.f.f75994b;
                        h2VarA = c2.l.a(16);
                    }
                } else {
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i16 &= -7169;
                        x0Var2 = j92.f.f97931h;
                    }
                    if (i25 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        g6.f.a aVar6 = g6.f.f75994b;
                        h2VarA = c2.l.a(16);
                    }
                }
                int i27 = i16;
                final s5.x0 x0Var5 = x0Var2;
                o0VarE.h0();
                p3.x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar2 = (a2.j) objQ;
                p1VarI = zf.b.i(jVar2, o0VarE, 6);
                p3.p1 p1VarK2 = xy2.b.k(jVar2, o0VarE, 6);
                d92.b.f58623a.getClass();
                if (d92.b.d(o0VarE)) {
                    j14 = zl.a.b(o0VarE, -1572019503, o0VarE).f63508c;
                } else {
                    j14 = zl.a.b(o0VarE, -1572018447, o0VarE).f63509d;
                }
                o0VarE.g0(false);
                if (((Boolean) p1VarI.getF182175a()).booleanValue()) {
                    g6.f.a aVar7 = g6.f.f75994b;
                    uVarA = u1.n.a(2, j14);
                } else {
                    g6.f.a aVar8 = g6.f.f75994b;
                    uVarA = u1.n.a(2, j14);
                }
                i3.c1.f87691a.getClass();
                g6.f.a aVar9 = g6.f.f75994b;
                o0Var = o0VarE;
                final String str4 = str2;
                final e23.p pVar5 = pVar2;
                c2.h2 h2Var4 = h2VarA;
                i3.h1.c(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), i3.c1.c(0L, j8, o4.d0.c(0.5f, j8, 14), o0VarE, 5), uVarA, h2Var4, jVar2, z3.f.c(274565251, new e23.q() { // from class: l72.h0
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.t2) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var3 = p3.n.f135158a;
                            e23.p pVar6 = pVar5;
                            if (pVar6 == null) {
                                mVar2.C(1955686998);
                            } else {
                                mVar2.C(1864201995);
                                pVar6.invoke(mVar2, 0);
                            }
                            mVar2.f();
                            String str5 = str4;
                            if (str5 != null) {
                                mVar2.C(1955727578);
                                boolean z16 = z14;
                                long jC = j8;
                                if (!z16) {
                                    jC = o4.d0.c(0.5f, jC, 14);
                                }
                                s5.x0 x0VarA = s5.x0.a(x0Var5, jC, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                d6.h.f57752b.getClass();
                                mh.c(str5, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar2, 0, 0, 130046);
                                mVar2.f();
                            } else {
                                mVar2.C(1955916895);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), o0Var, ((i27 >> 21) & 14) | 905969664 | (i27 & 896) | ((i27 << 3) & 29360128), 32);
                x0Var3 = x0Var5;
                h2Var2 = h2Var4;
                pVar3 = pVar5;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                x0Var3 = x0Var2;
                pVar3 = pVar2;
                h2Var2 = h2VarA;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.z0(str, rVar, z14, x0Var3, j8, pVar3, h2Var2, aVar, i14, i15);
            }
        }
        i16 |= 196608;
        pVar2 = pVar;
        i17 = i15 & 64;
        if (i17 != 0) {
            if ((1572864 & i14) == 0) {
                h2VarA = h2Var;
                if (o0VarE.B(h2VarA)) {
                    i18 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i18 = 524288;
                }
                i16 |= i18;
            }
            if ((i14 & 12582912) == 0) {
                if (o0VarE.r(aVar)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
                i16 |= i19;
            }
            if ((i16 & 4793491) != 4793490) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i16 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i16 &= -7169;
                        x0Var2 = j92.f.f97931h;
                    }
                    if (i25 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        g6.f.a aVar10 = g6.f.f75994b;
                        h2VarA = c2.l.a(16);
                    }
                } else {
                    if ((i15 & 8) != 0) {
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        i16 &= -7169;
                        x0Var2 = j92.f.f97931h;
                    }
                    if (i25 != 0) {
                        pVar2 = null;
                    }
                    if (i17 != 0) {
                        g6.f.a aVar11 = g6.f.f75994b;
                        h2VarA = c2.l.a(16);
                    }
                }
                int i28 = i16;
                final s5.x0 x0Var6 = x0Var2;
                o0VarE.h0();
                p3.x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = kg.f.b(o0VarE);
                }
                a2.j jVar3 = (a2.j) objQ;
                p1VarI = zf.b.i(jVar3, o0VarE, 6);
                p3.p1 p1VarK3 = xy2.b.k(jVar3, o0VarE, 6);
                d92.b.f58623a.getClass();
                if (d92.b.d(o0VarE)) {
                    j14 = zl.a.b(o0VarE, -1572019503, o0VarE).f63508c;
                } else {
                    j14 = zl.a.b(o0VarE, -1572018447, o0VarE).f63509d;
                }
                o0VarE.g0(false);
                if (((Boolean) p1VarI.getF182175a()).booleanValue()) {
                    g6.f.a aVar12 = g6.f.f75994b;
                    uVarA = u1.n.a(2, j14);
                } else {
                    g6.f.a aVar13 = g6.f.f75994b;
                    uVarA = u1.n.a(2, j14);
                }
                i3.c1.f87691a.getClass();
                g6.f.a aVar14 = g6.f.f75994b;
                o0Var = o0VarE;
                final String str5 = str2;
                final e23.p pVar6 = pVar2;
                c2.h2 h2Var5 = h2VarA;
                i3.h1.c(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), i3.c1.c(0L, j8, o4.d0.c(0.5f, j8, 14), o0VarE, 5), uVarA, h2Var5, jVar3, z3.f.c(274565251, new e23.q() { // from class: l72.h0
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        p3.m mVar2 = (p3.m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((c2.t2) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            p3.x1 x1Var4 = p3.n.f135158a;
                            e23.p pVar7 = pVar6;
                            if (pVar7 == null) {
                                mVar2.C(1955686998);
                            } else {
                                mVar2.C(1864201995);
                                pVar7.invoke(mVar2, 0);
                            }
                            mVar2.f();
                            String str6 = str5;
                            if (str6 != null) {
                                mVar2.C(1955727578);
                                boolean z16 = z14;
                                long jC = j8;
                                if (!z16) {
                                    jC = o4.d0.c(0.5f, jC, 14);
                                }
                                s5.x0 x0VarA = s5.x0.a(x0Var6, jC, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                                d6.h.f57752b.getClass();
                                mh.c(str6, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar2, 0, 0, 130046);
                                mVar2.f();
                            } else {
                                mVar2.C(1955916895);
                                mVar2.f();
                            }
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0Var), o0Var, ((i28 >> 21) & 14) | 905969664 | (i28 & 896) | ((i28 << 3) & 29360128), 32);
                x0Var3 = x0Var6;
                h2Var2 = h2Var5;
                pVar3 = pVar6;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                x0Var3 = x0Var2;
                pVar3 = pVar2;
                h2Var2 = h2VarA;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new b82.z0(str, rVar, z14, x0Var3, j8, pVar3, h2Var2, aVar, i14, i15);
            }
        }
        i16 |= 1572864;
        h2VarA = h2Var;
        if ((i14 & 12582912) == 0) {
            if (o0VarE.r(aVar)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i16 |= i19;
        }
        if ((i16 & 4793491) != 4793490) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i16 & 1, z15)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i16 &= -7169;
                    x0Var2 = j92.f.f97931h;
                }
                if (i25 != 0) {
                    pVar2 = null;
                }
                if (i17 != 0) {
                    g6.f.a aVar15 = g6.f.f75994b;
                    h2VarA = c2.l.a(16);
                }
            } else {
                if ((i15 & 8) != 0) {
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    i16 &= -7169;
                    x0Var2 = j92.f.f97931h;
                }
                if (i25 != 0) {
                    pVar2 = null;
                }
                if (i17 != 0) {
                    g6.f.a aVar16 = g6.f.f75994b;
                    h2VarA = c2.l.a(16);
                }
            }
            int i29 = i16;
            final s5.x0 x0Var7 = x0Var2;
            o0VarE.h0();
            p3.x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = kg.f.b(o0VarE);
            }
            a2.j jVar4 = (a2.j) objQ;
            p1VarI = zf.b.i(jVar4, o0VarE, 6);
            p3.p1 p1VarK4 = xy2.b.k(jVar4, o0VarE, 6);
            d92.b.f58623a.getClass();
            if (d92.b.d(o0VarE)) {
                j14 = zl.a.b(o0VarE, -1572019503, o0VarE).f63508c;
            } else {
                j14 = zl.a.b(o0VarE, -1572018447, o0VarE).f63509d;
            }
            o0VarE.g0(false);
            if (((Boolean) p1VarI.getF182175a()).booleanValue()) {
                g6.f.a aVar17 = g6.f.f75994b;
                uVarA = u1.n.a(2, j14);
            } else {
                g6.f.a aVar18 = g6.f.f75994b;
                uVarA = u1.n.a(2, j14);
            }
            i3.c1.f87691a.getClass();
            g6.f.a aVar19 = g6.f.f75994b;
            o0Var = o0VarE;
            final String str6 = str2;
            final e23.p pVar7 = pVar2;
            c2.h2 h2Var6 = h2VarA;
            i3.h1.c(aVar, c2.x2.a(rVar, i3.c1.f87694d, 28), z14, k2.i.a(4), i3.c1.c(0L, j8, o4.d0.c(0.5f, j8, 14), o0VarE, 5), uVarA, h2Var6, jVar4, z3.f.c(274565251, new e23.q() { // from class: l72.h0
                @Override // e23.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    p3.m mVar2 = (p3.m) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((c2.t2) obj).getClass();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                        p3.x1 x1Var5 = p3.n.f135158a;
                        e23.p pVar8 = pVar7;
                        if (pVar8 == null) {
                            mVar2.C(1955686998);
                        } else {
                            mVar2.C(1864201995);
                            pVar8.invoke(mVar2, 0);
                        }
                        mVar2.f();
                        String str7 = str6;
                        if (str7 != null) {
                            mVar2.C(1955727578);
                            boolean z16 = z14;
                            long jC = j8;
                            if (!z16) {
                                jC = o4.d0.c(0.5f, jC, 14);
                            }
                            s5.x0 x0VarA = s5.x0.a(x0Var7, jC, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            d6.h.f57752b.getClass();
                            mh.c(str7, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarA, mVar2, 0, 0, 130046);
                            mVar2.f();
                        } else {
                            mVar2.C(1955916895);
                            mVar2.f();
                        }
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0Var), o0Var, ((i29 >> 21) & 14) | 905969664 | (i29 & 896) | ((i29 << 3) & 29360128), 32);
            x0Var3 = x0Var7;
            h2Var2 = h2Var6;
            pVar3 = pVar7;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            x0Var3 = x0Var2;
            pVar3 = pVar2;
            h2Var2 = h2VarA;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new b82.z0(str, rVar, z14, x0Var3, j8, pVar3, h2Var2, aVar, i14, i15);
        }
    }
}
