package m3;

import c2.u;
import c2.x2;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d81.z;
import f5.z0;
import h5.e0;
import i3.k9;
import l3.x0;
import n3.h0;
import o4.f1;
import o4.h1;
import p006l2.v0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import p5.v;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f116265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f116266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f116267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f116268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f116269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f116270f;

    static {
        g6.f.a aVar = g6.f.f75994b;
        f116265a = (float) 2.5d;
        f116266b = (float) 5.5d;
        f116267c = 16;
        f116268d = 40;
        f116269e = 10;
        f116270f = 5;
    }

    public static final void a(x0 x0Var, long j8, p3.m mVar, int i14) {
        o0 o0Var;
        Object obj;
        o0 o0VarE = mVar.E(-1353562852);
        int i15 = i14 | (o0VarE.B(x0Var) ? 4 : 2) | (o0VarE.l(j8) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                obj = objQ;
                o4.j jVarA = o4.m.a();
                h1.f128863b.getClass();
                jVarA.j(h1.f128864c);
                o0VarE.K(jVarA);
                obj = jVarA;
            }
            obj = objQ;
            f1 f1Var = (f1) obj;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.f(new v0(x0Var, 20));
                o0VarE.K(objQ2);
            }
            x3 x3VarB = s1.f.b(((Number) ((x3) objQ2).getF182175a()).floatValue(), k9.b(h0.DefaultEffects, o0VarE), null, o0VarE, 0, 28);
            o0 o0Var2 = o0VarE;
            h4.r.a aVar = h4.r.S;
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ3 = o0Var2.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new kp2.a(x0Var, 20);
                o0Var2.K(objQ3);
            }
            h4.r rVarQ = x2.q(v.b(aVar, (e23.l) objQ3), f116267c);
            boolean zB = ((i15 & 112) == 32) | (i16 == 4) | o0Var2.B(x3VarB) | o0Var2.r(f1Var);
            Object objQ4 = o0Var2.q();
            if (zB || objQ4 == c2565a) {
                bn0.h hVar = new bn0.h(x0Var, x3VarB, j8, f1Var, 5);
                o0Var2.K(hVar);
                objQ4 = hVar;
            }
            u1.n.b(rVarQ, (e23.l) objQ4, o0Var2, 0);
            o0Var = o0Var2;
        } else {
            o0 o0Var3 = o0VarE;
            o0Var3.e();
            o0Var = o0Var3;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new z(x0Var, i14, 5, j8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0190  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0055  */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x0123  */
    /* JADX WARN: Code duplicated, block: B:88:0x012a  */
    /* JADX WARN: Code duplicated, block: B:89:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141  */
    /* JADX WARN: Code duplicated, block: B:94:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:98:0x0180  */
    public static final void b(boolean z14, e23.a aVar, h4.r rVar, r rVar2, h4.d dVar, e23.q qVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar3;
        r rVar4;
        int i17;
        int i18;
        e23.q qVarC;
        int i19;
        boolean z15;
        e23.q qVar2;
        o0 o0Var;
        h4.r rVar5;
        r rVar6;
        h4.d dVar2;
        p2 p2VarI0;
        h4.r rVar7;
        r rVarE;
        e23.q qVar3;
        h4.r rVar8;
        r rVar9;
        int i24;
        h4.d dVar3;
        z0 z0VarD;
        int iP;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar2;
        h5.g.a.b bVar;
        int i25;
        o0 o0VarE = mVar.E(-532332839);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.h(z14) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        int i26 = i15 & 4;
        if (i26 == 0) {
            if ((i14 & 384) == 0) {
                rVar3 = rVar;
                i16 |= o0VarE.B(rVar3) ? 256 : 128;
            }
            if ((i14 & 3072) == 0) {
                if ((i15 & 8) == 0) {
                    rVar4 = rVar2;
                    int i27 = o0VarE.B(rVar4) ? 2048 : 1024;
                    i16 |= i27;
                } else {
                    rVar4 = rVar2;
                }
                i16 |= i27;
            } else {
                rVar4 = rVar2;
            }
            i17 = i16 | 24576;
            i18 = i15 & 32;
            if (i18 != 0) {
                if ((196608 & i14) == 0) {
                    qVarC = qVar;
                    if (o0VarE.r(qVarC)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i17 |= i19;
                }
                if ((1572864 & i14) == 0) {
                    if (o0VarE.r(eVar)) {
                        i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i25 = 524288;
                    }
                    i17 |= i25;
                }
                if ((599187 & i17) != 599186) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (o0VarE.n(i17 & 1, z15)) {
                    o0VarE.G0();
                    if ((i14 & 1) != 0 || o0VarE.o0()) {
                        if (i26 != 0) {
                            rVar7 = h4.r.S;
                        } else {
                            rVar7 = rVar3;
                        }
                        if ((i15 & 8) != 0) {
                            rVarE = e(o0VarE);
                            i17 &= -7169;
                        } else {
                            rVarE = rVar4;
                        }
                        h4.d.f81522a.getClass();
                        h4.g gVar = h4.d.a.f81524b;
                        if (i18 != 0) {
                            qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                        }
                        qVar3 = qVarC;
                        rVar8 = rVar7;
                        rVar9 = rVarE;
                        i24 = i17;
                        dVar3 = gVar;
                    } else {
                        o0VarE.e();
                        if ((i15 & 8) != 0) {
                            i17 &= -7169;
                        }
                        qVar3 = qVarC;
                        rVar8 = rVar3;
                        rVar9 = rVar4;
                        i24 = i17;
                        dVar3 = dVar;
                    }
                    o0VarE.h0();
                    x1 x1Var = p3.n.f135158a;
                    h4.r rVarD = d(rVar8, z14, rVar9, false, aVar, 12);
                    z0VarD = c2.q.d(dVar3, false);
                    iP = o0VarE.P();
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVarD, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
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
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iP))) {
                        v.h.A(iP, o0VarE, iP, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    u uVar = u.f22885a;
                    eVar.invoke(uVar, o0VarE, Integer.valueOf(((i24 >> 15) & 112) | 6));
                    qVar3.invoke(uVar, o0VarE, Integer.valueOf(((i24 >> 12) & 112) | 6));
                    o0VarE.g0(true);
                    rVar5 = rVar8;
                    rVar6 = rVar9;
                    o0Var = o0VarE;
                    dVar2 = dVar3;
                    qVar2 = qVar3;
                } else {
                    o0VarE.e();
                    qVar2 = qVarC;
                    o0Var = o0VarE;
                    rVar5 = rVar3;
                    rVar6 = rVar4;
                    dVar2 = dVar;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new da0.n(z14, aVar, rVar5, rVar6, dVar2, qVar2, eVar, i14, i15);
                }
            }
            i17 = 221184 | i16;
            qVarC = qVar;
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
            if ((599187 & i17) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i17 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar7 = h4.r.S;
                    } else {
                        rVar7 = rVar3;
                    }
                    if ((i15 & 8) != 0) {
                        rVarE = e(o0VarE);
                        i17 &= -7169;
                    } else {
                        rVarE = rVar4;
                    }
                    h4.d.f81522a.getClass();
                    h4.g gVar2 = h4.d.a.f81524b;
                    if (i18 != 0) {
                        qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                    }
                    qVar3 = qVarC;
                    rVar8 = rVar7;
                    rVar9 = rVarE;
                    i24 = i17;
                    dVar3 = gVar2;
                } else {
                    if (i26 != 0) {
                        rVar7 = h4.r.S;
                    } else {
                        rVar7 = rVar3;
                    }
                    if ((i15 & 8) != 0) {
                        rVarE = e(o0VarE);
                        i17 &= -7169;
                    } else {
                        rVarE = rVar4;
                    }
                    h4.d.f81522a.getClass();
                    h4.g gVar3 = h4.d.a.f81524b;
                    if (i18 != 0) {
                        qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                    }
                    qVar3 = qVarC;
                    rVar8 = rVar7;
                    rVar9 = rVarE;
                    i24 = i17;
                    dVar3 = gVar3;
                }
                o0VarE.h0();
                x1 x1Var2 = p3.n.f135158a;
                h4.r rVarD2 = d(rVar8, z14, rVar9, false, aVar, 12);
                z0VarD = c2.q.d(dVar3, false);
                iP = o0VarE.P();
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD2, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iP, o0VarE, iP, bVar);
                } else {
                    v.h.A(iP, o0VarE, iP, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar2 = u.f22885a;
                eVar.invoke(uVar2, o0VarE, Integer.valueOf(((i24 >> 15) & 112) | 6));
                qVar3.invoke(uVar2, o0VarE, Integer.valueOf(((i24 >> 12) & 112) | 6));
                o0VarE.g0(true);
                rVar5 = rVar8;
                rVar6 = rVar9;
                o0Var = o0VarE;
                dVar2 = dVar3;
                qVar2 = qVar3;
            } else {
                o0VarE.e();
                qVar2 = qVarC;
                o0Var = o0VarE;
                rVar5 = rVar3;
                rVar6 = rVar4;
                dVar2 = dVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(z14, aVar, rVar5, rVar6, dVar2, qVar2, eVar, i14, i15);
            }
        }
        i16 |= 384;
        rVar3 = rVar;
        if ((i14 & 3072) == 0) {
            if ((i15 & 8) == 0) {
                rVar4 = rVar2;
                if (o0VarE.B(rVar4)) {
                }
                i16 |= i27;
            } else {
                rVar4 = rVar2;
            }
            i16 |= i27;
        } else {
            rVar4 = rVar2;
        }
        i17 = i16 | 24576;
        i18 = i15 & 32;
        if (i18 != 0) {
            if ((196608 & i14) == 0) {
                qVarC = qVar;
                if (o0VarE.r(qVarC)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i17 |= i19;
            }
            if ((1572864 & i14) == 0) {
                if (o0VarE.r(eVar)) {
                    i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i25 = 524288;
                }
                i17 |= i25;
            }
            if ((599187 & i17) != 599186) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (o0VarE.n(i17 & 1, z15)) {
                o0VarE.G0();
                if ((i14 & 1) != 0) {
                    if (i26 != 0) {
                        rVar7 = h4.r.S;
                    } else {
                        rVar7 = rVar3;
                    }
                    if ((i15 & 8) != 0) {
                        rVarE = e(o0VarE);
                        i17 &= -7169;
                    } else {
                        rVarE = rVar4;
                    }
                    h4.d.f81522a.getClass();
                    h4.g gVar4 = h4.d.a.f81524b;
                    if (i18 != 0) {
                        qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                    }
                    qVar3 = qVarC;
                    rVar8 = rVar7;
                    rVar9 = rVarE;
                    i24 = i17;
                    dVar3 = gVar4;
                } else {
                    if (i26 != 0) {
                        rVar7 = h4.r.S;
                    } else {
                        rVar7 = rVar3;
                    }
                    if ((i15 & 8) != 0) {
                        rVarE = e(o0VarE);
                        i17 &= -7169;
                    } else {
                        rVarE = rVar4;
                    }
                    h4.d.f81522a.getClass();
                    h4.g gVar5 = h4.d.a.f81524b;
                    if (i18 != 0) {
                        qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                    }
                    qVar3 = qVarC;
                    rVar8 = rVar7;
                    rVar9 = rVarE;
                    i24 = i17;
                    dVar3 = gVar5;
                }
                o0VarE.h0();
                x1 x1Var3 = p3.n.f135158a;
                h4.r rVarD3 = d(rVar8, z14, rVar9, false, aVar, 12);
                z0VarD = c2.q.d(dVar3, false);
                iP = o0VarE.P();
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarD3, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
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
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iP, o0VarE, iP, bVar);
                } else {
                    v.h.A(iP, o0VarE, iP, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                u uVar3 = u.f22885a;
                eVar.invoke(uVar3, o0VarE, Integer.valueOf(((i24 >> 15) & 112) | 6));
                qVar3.invoke(uVar3, o0VarE, Integer.valueOf(((i24 >> 12) & 112) | 6));
                o0VarE.g0(true);
                rVar5 = rVar8;
                rVar6 = rVar9;
                o0Var = o0VarE;
                dVar2 = dVar3;
                qVar2 = qVar3;
            } else {
                o0VarE.e();
                qVar2 = qVarC;
                o0Var = o0VarE;
                rVar5 = rVar3;
                rVar6 = rVar4;
                dVar2 = dVar;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new da0.n(z14, aVar, rVar5, rVar6, dVar2, qVar2, eVar, i14, i15);
            }
        }
        i17 = 221184 | i16;
        qVarC = qVar;
        if ((1572864 & i14) == 0) {
            if (o0VarE.r(eVar)) {
                i25 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
            } else {
                i25 = 524288;
            }
            i17 |= i25;
        }
        if ((599187 & i17) != 599186) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (o0VarE.n(i17 & 1, z15)) {
            o0VarE.G0();
            if ((i14 & 1) != 0) {
                if (i26 != 0) {
                    rVar7 = h4.r.S;
                } else {
                    rVar7 = rVar3;
                }
                if ((i15 & 8) != 0) {
                    rVarE = e(o0VarE);
                    i17 &= -7169;
                } else {
                    rVarE = rVar4;
                }
                h4.d.f81522a.getClass();
                h4.g gVar6 = h4.d.a.f81524b;
                if (i18 != 0) {
                    qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                }
                qVar3 = qVarC;
                rVar8 = rVar7;
                rVar9 = rVarE;
                i24 = i17;
                dVar3 = gVar6;
            } else {
                if (i26 != 0) {
                    rVar7 = h4.r.S;
                } else {
                    rVar7 = rVar3;
                }
                if ((i15 & 8) != 0) {
                    rVarE = e(o0VarE);
                    i17 &= -7169;
                } else {
                    rVarE = rVar4;
                }
                h4.d.f81522a.getClass();
                h4.g gVar7 = h4.d.a.f81524b;
                if (i18 != 0) {
                    qVarC = z3.f.c(1028036671, new k(rVarE, z14), o0VarE);
                }
                qVar3 = qVarC;
                rVar8 = rVar7;
                rVar9 = rVarE;
                i24 = i17;
                dVar3 = gVar7;
            }
            o0VarE.h0();
            x1 x1Var4 = p3.n.f135158a;
            h4.r rVarD4 = d(rVar8, z14, rVar9, false, aVar, 12);
            z0VarD = c2.q.d(dVar3, false);
            iP = o0VarE.P();
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarD4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
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
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iP, o0VarE, iP, bVar);
            } else {
                v.h.A(iP, o0VarE, iP, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            u uVar4 = u.f22885a;
            eVar.invoke(uVar4, o0VarE, Integer.valueOf(((i24 >> 15) & 112) | 6));
            qVar3.invoke(uVar4, o0VarE, Integer.valueOf(((i24 >> 12) & 112) | 6));
            o0VarE.g0(true);
            rVar5 = rVar8;
            rVar6 = rVar9;
            o0Var = o0VarE;
            dVar2 = dVar3;
            qVar2 = qVar3;
        } else {
            o0VarE.e();
            qVar2 = qVarC;
            o0Var = o0VarE;
            rVar5 = rVar3;
            rVar6 = rVar4;
            dVar2 = dVar;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new da0.n(z14, aVar, rVar5, rVar6, dVar2, qVar2, eVar, i14, i15);
        }
    }

    public static final void c(q4.f fVar, f1 f1Var, n4.d dVar, long j8, float f14, a aVar, float f15) {
        f1Var.reset();
        f1Var.a(0.0f, 0.0f);
        float f16 = f116269e;
        float fS0 = fVar.s0(f16);
        float f17 = aVar.f116211d;
        f1Var.c((fS0 * f17) / 2, fVar.s0(f116270f) * f17);
        f1Var.c(fVar.s0(f16) * f17, 0.0f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (dVar.f() >> 32)) + (Math.min(dVar.f123549c - dVar.f123547a, dVar.f123550d - dVar.f123548b) / 2.0f)) - ((fVar.s0(f16) * f17) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.f() & 4294967295L)) - fVar.s0(f15))) & 4294967295L);
        n4.c.a aVar2 = n4.c.f123541b;
        f1Var.e(jFloatToRawIntBits);
        float fS1 = aVar.f116210c - fVar.s0(f15);
        long jI1 = fVar.i1();
        q4.a.b f142543b = fVar.getF142543b();
        long jB = f142543b.b();
        f142543b.a().l();
        try {
            f142543b.f142550a.f(fS1, jI1);
            q4.f.L(fVar, f1Var, j8, f14, new q4.k(fVar.s0(f15), 0.0f, 0, 0, null, 30, null), 48);
        } finally {
            tn.k.p(f142543b, jB);
        }
    }

    public static h4.r d(h4.r rVar, boolean z14, r rVar2, boolean z15, e23.a aVar, int i14) {
        if ((i14 & 4) != 0) {
            z15 = true;
        }
        boolean z16 = z15;
        i.f116250a.getClass();
        return rVar.then(new j(z14, aVar, z16, rVar2, i.f116252c, null));
    }

    public static final s e(p3.m mVar) {
        x1 x1Var = p3.n.f135158a;
        Object[] objArr = new Object[0];
        s.f116298b.getClass();
        d4.l lVar = s.f116299c;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        if (objQ == p3.m.a.f135155b) {
            objQ = new ll0.b(16);
            mVar.K(objQ);
        }
        return (s) d4.a.c(objArr, lVar, (e23.a) objQ, mVar, 384);
    }
}
