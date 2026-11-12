package m72;

import b82.u0;
import c2.b0;
import c2.c3;
import c2.k3;
import c2.n3;
import c2.p3;
import c2.q2;
import c2.q3;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import f5.z0;
import h4.r;
import h5.e0;
import i3.kb;
import i3.mh;
import java.util.Arrays;
import java.util.Locale;
import o4.d0;
import o4.m1;
import o4.t1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.x0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import u1.q;
import u1.u;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x0101  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, e23.a<Unit> aVar, e23.a<Unit> aVar2, u4.d dVar, e23.a<Unit> aVar3, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        int i16;
        u4.d dVar2;
        int i17;
        e23.a<Unit> aVar4;
        int i18;
        boolean z14;
        o0 o0Var;
        u4.d dVar3;
        p2 p2VarI0;
        u4.d dVar4;
        e23.a<Unit> aVar5;
        int i19;
        str.getClass();
        aVar2.getClass();
        pVar.getClass();
        o0 o0VarE = mVar.E(-2109166378);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(aVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(aVar2) ? 256 : 128;
        }
        int i24 = i15 & 8;
        if (i24 == 0) {
            if ((i14 & 3072) == 0) {
                dVar2 = dVar;
                i16 |= o0VarE.B(dVar2) ? 2048 : 1024;
            }
            i17 = i15 & 16;
            if (i17 != 0) {
                if ((i14 & 24576) == 0) {
                    aVar4 = aVar3;
                    if (o0VarE.r(aVar4)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i16 |= i18;
                }
                if ((196608 & i14) == 0) {
                    if (o0VarE.r(pVar)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i16 |= i19;
                }
                if ((74899 & i16) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i24 != 0) {
                        dVar4 = null;
                    } else {
                        dVar4 = dVar2;
                    }
                    if (i17 != 0) {
                        aVar5 = null;
                    } else {
                        aVar5 = aVar4;
                    }
                    x1 x1Var = p3.n.f135158a;
                    aVar4 = aVar5;
                    z3.e eVarC = z3.f.c(-766054502, new b(str, aVar, aVar2, dVar4, aVar5), o0VarE);
                    int i25 = k3.f22728a;
                    c3 c3VarB = q3.b(o0VarE);
                    p3.f22815b.getClass();
                    o0Var = o0VarE;
                    kb.a(null, eVarC, null, null, null, 0, 0L, 0L, n3.d(c3VarB, p3.f22826m), z3.f.c(-111180571, new ba2.i(pVar, 6), o0VarE), o0Var, 805306416, 253);
                    dVar3 = dVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    dVar3 = dVar2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new u0((Object) str, (Object) aVar, (Object) aVar2, (Object) dVar3, (Object) aVar4, (e23.p) pVar, i14, i15, 7);
                }
            }
            i16 |= 24576;
            aVar4 = aVar3;
            if ((196608 & i14) == 0) {
                if (o0VarE.r(pVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar4;
                }
                x1 x1Var2 = p3.n.f135158a;
                aVar4 = aVar5;
                z3.e eVarC2 = z3.f.c(-766054502, new b(str, aVar, aVar2, dVar4, aVar5), o0VarE);
                int i26 = k3.f22728a;
                c3 c3VarB2 = q3.b(o0VarE);
                p3.f22815b.getClass();
                o0Var = o0VarE;
                kb.a(null, eVarC2, null, null, null, 0, 0L, 0L, n3.d(c3VarB2, p3.f22826m), z3.f.c(-111180571, new ba2.i(pVar, 6), o0VarE), o0Var, 805306416, 253);
                dVar3 = dVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                dVar3 = dVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0((Object) str, (Object) aVar, (Object) aVar2, (Object) dVar3, (Object) aVar4, (e23.p) pVar, i14, i15, 7);
            }
        }
        i16 |= 3072;
        dVar2 = dVar;
        i17 = i15 & 16;
        if (i17 != 0) {
            if ((i14 & 24576) == 0) {
                aVar4 = aVar3;
                if (o0VarE.r(aVar4)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i16 |= i18;
            }
            if ((196608 & i14) == 0) {
                if (o0VarE.r(pVar)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i16 |= i19;
            }
            if ((74899 & i16) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i24 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                if (i17 != 0) {
                    aVar5 = null;
                } else {
                    aVar5 = aVar4;
                }
                x1 x1Var3 = p3.n.f135158a;
                aVar4 = aVar5;
                z3.e eVarC3 = z3.f.c(-766054502, new b(str, aVar, aVar2, dVar4, aVar5), o0VarE);
                int i27 = k3.f22728a;
                c3 c3VarB3 = q3.b(o0VarE);
                p3.f22815b.getClass();
                o0Var = o0VarE;
                kb.a(null, eVarC3, null, null, null, 0, 0L, 0L, n3.d(c3VarB3, p3.f22826m), z3.f.c(-111180571, new ba2.i(pVar, 6), o0VarE), o0Var, 805306416, 253);
                dVar3 = dVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                dVar3 = dVar2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new u0((Object) str, (Object) aVar, (Object) aVar2, (Object) dVar3, (Object) aVar4, (e23.p) pVar, i14, i15, 7);
            }
        }
        i16 |= 24576;
        aVar4 = aVar3;
        if ((196608 & i14) == 0) {
            if (o0VarE.r(pVar)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i16 |= i19;
        }
        if ((74899 & i16) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i24 != 0) {
                dVar4 = null;
            } else {
                dVar4 = dVar2;
            }
            if (i17 != 0) {
                aVar5 = null;
            } else {
                aVar5 = aVar4;
            }
            x1 x1Var4 = p3.n.f135158a;
            aVar4 = aVar5;
            z3.e eVarC4 = z3.f.c(-766054502, new b(str, aVar, aVar2, dVar4, aVar5), o0VarE);
            int i28 = k3.f22728a;
            c3 c3VarB4 = q3.b(o0VarE);
            p3.f22815b.getClass();
            o0Var = o0VarE;
            kb.a(null, eVarC4, null, null, null, 0, 0L, 0L, n3.d(c3VarB4, p3.f22826m), z3.f.c(-111180571, new ba2.i(pVar, 6), o0VarE), o0Var, 805306416, 253);
            dVar3 = dVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            dVar3 = dVar2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new u0((Object) str, (Object) aVar, (Object) aVar2, (Object) dVar3, (Object) aVar4, (e23.p) pVar, i14, i15, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void b(int i14, int i15, final long j8, String str, String str2, p3.m mVar, boolean z14) {
        boolean z15;
        boolean z16;
        boolean z17;
        p2 p2VarI0;
        final boolean z18;
        o0 o0VarE = mVar.E(-978194466);
        int i16 = i14 | (o0VarE.l(j8) ? 4 : 2);
        int i17 = i15 & 2;
        if (i17 == 0) {
            if ((i14 & 48) == 0) {
                z15 = z14;
                i16 |= o0VarE.h(z15) ? 32 : 16;
            }
            if ((i16 & 1171) != 1170) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i17 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                x1 x1Var = p3.n.f135158a;
                float f14 = 255;
                float fI = d0.i(j8) * f14;
                float fH = d0.h(j8) * f14;
                float f15 = d0.f(j8) * f14;
                x0 x0Var = x0.f105818a;
                String upperCase = String.format("#%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf((int) fI), Integer.valueOf((int) fH), Integer.valueOf((int) f15)}, 3)).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                l72.p2.f111205a.h(str, "(" + upperCase + ") - " + str2, null, null, null, false, false, z3.f.c(463694224, new e23.p() { // from class: m72.e
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        p3.m mVar2 = (p3.m) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                            x1 x1Var2 = p3.n.f135158a;
                            r.a aVar = r.S;
                            g6.f.a aVar2 = g6.f.f75994b;
                            r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 16, 0.0f, 11);
                            k2.h hVar = k2.i.f102406a;
                            r rVarE = u1.n.e(rVarC, j8, hVar);
                            if (z18) {
                                mVar2.C(-2041498066);
                                aVar.getClass();
                                mVar2.C(1326633701);
                                u uVar = new u(1, new t1(com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar2), null), null);
                                r rVarC2 = q.c(uVar.f167683a, aVar, uVar.f167684b, hVar);
                                mVar2.f();
                                rVarE = rVarE.then(rVarC2);
                                mVar2.f();
                            } else {
                                mVar2.C(-2041453054);
                                mVar2.f();
                            }
                            c2.q.a(x2.q(rVarE, 32), mVar2, 0);
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), null, null, null, o0VarE, 12582918, 0, 1916);
                z17 = z18;
            } else {
                o0VarE.e();
                z17 = z15;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new cq.n(j8, z17, str, str2, i14, i15);
            }
        }
        i16 |= 48;
        z15 = z14;
        if ((i16 & 1171) != 1170) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i17 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            x1 x1Var2 = p3.n.f135158a;
            float f16 = 255;
            float fI2 = d0.i(j8) * f16;
            float fH2 = d0.h(j8) * f16;
            float f17 = d0.f(j8) * f16;
            x0 x0Var2 = x0.f105818a;
            String upperCase2 = String.format("#%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf((int) fI2), Integer.valueOf((int) fH2), Integer.valueOf((int) f17)}, 3)).toUpperCase(Locale.ROOT);
            upperCase2.getClass();
            l72.p2.f111205a.h(str, "(" + upperCase2 + ") - " + str2, null, null, null, false, false, z3.f.c(463694224, new e23.p() { // from class: m72.e
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    p3.m mVar2 = (p3.m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var3 = p3.n.f135158a;
                        r.a aVar = r.S;
                        g6.f.a aVar2 = g6.f.f75994b;
                        r rVarC = c2.l.C(aVar, 0.0f, 0.0f, 16, 0.0f, 11);
                        k2.h hVar = k2.i.f102406a;
                        r rVarE = u1.n.e(rVarC, j8, hVar);
                        if (z18) {
                            mVar2.C(-2041498066);
                            aVar.getClass();
                            mVar2.C(1326633701);
                            u uVar = new u(1, new t1(com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar2), null), null);
                            r rVarC2 = q.c(uVar.f167683a, aVar, uVar.f167684b, hVar);
                            mVar2.f();
                            rVarE = rVarE.then(rVarC2);
                            mVar2.f();
                        } else {
                            mVar2.C(-2041453054);
                            mVar2.f();
                        }
                        c2.q.a(x2.q(rVarE, 32), mVar2, 0);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            }, o0VarE), null, null, null, o0VarE, 12582918, 0, 1916);
            z17 = z18;
        } else {
            o0VarE.e();
            z17 = z15;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cq.n(j8, z17, str, str2, i14, i15);
        }
    }

    public static final void c(String str, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-2021528110);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            s5.x0 x0VarE = d92.c.e(j92.f.f97932i);
            r.a aVar = r.S;
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            o0Var = o0VarE;
            mh.c(str, c2.l.B(aVar, f14, 24, f14, 8), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarE, o0Var, 6, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new fv1.b(str, i14, 20);
        }
    }

    public static final void d(float f14, String str, String str2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1209769405);
        int i15 = i14 | (o0VarE.i(f14) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            float f15 = 40;
            if (g6.f.b(f14, f15) > 0) {
                f15 = f14;
            }
            l72.p2.f111205a.h(str, str2, null, null, null, false, false, z3.f.c(713643765, new a(f15, f14), o0VarE), null, null, null, o0VarE, 12582966, 0, 1916);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(f14, str, str2, i14, 0);
        }
    }

    public static final void e(float f14, String str, String str2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-568256100);
        int i15 = i14 | (o0VarE.i(f14) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l72.p2.f111205a.h(str, str2, null, null, null, false, false, z3.f.c(995862990, new a03.o0(f14, 4), o0VarE), null, null, null, o0VarE, 12582966, 0, 1916);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(f14, str, str2, i14, 1);
        }
    }

    public static final void f(float f14, String str, String str2, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(258029169);
        int i15 = i14 | (o0VarE.i(f14) ? 4 : 2);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            l72.p2.f111205a.h(str, str2, null, null, null, false, false, z3.f.c(1501080703, new a03.o0(f14, 5), o0VarE), null, null, null, o0VarE, 12582966, 0, 1916);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c(f14, str, str2, i14, 2);
        }
    }

    public static final void g(s5.x0 x0Var, String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-795375707);
        int i15 = i14 | (o0VarE.B(x0Var) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarY = c2.l.y(u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a), 16);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            mh.c(str2, aVar, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, ((i15 >> 6) & 14) | 48, (i15 << 21) & 29360128, 131068);
            d92.b.f58624b.getClass();
            mh.c(str, c2.l.C(aVar, 0.0f, 8, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, ((i15 >> 3) & 14) | 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(x0Var, str, str2, i14, 1);
        }
    }

    public static final void h(s5.x0 x0Var, String str, String str2, p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(-1673398128);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(x0Var) ? 4 : 2) | (o0VarE.B(str) ? 32 : 16) | (o0VarE.B(str2) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            r.a aVar = r.S;
            r rVarE = u1.n.e(x2.f(aVar, 1.0f), tn.k.b(d92.b.f58623a, o0VarE), m1.f128891a);
            float f14 = 16;
            g6.f.a aVar2 = g6.f.f75994b;
            r rVarY = c2.l.y(rVarE, f14);
            h4.d.f81522a.getClass();
            h4.g.b bVar = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            s2 s2VarA = q2.a(c2.j.f22692b, bVar, o0VarE, 48);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = h4.k.c(rVarY, o0VarE);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, s2VarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            u2 u2Var = u2.f22900a;
            r rVarA = u2Var.a(aVar, 0.3f, true);
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar3);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar2);
            }
            b4.c(fVar, rVarC2, o0VarE);
            mh.c(str2, c2.u.f22885a.c(aVar, h4.d.a.f81529g), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0VarE, (i15 >> 6) & 14, (i15 << 21) & 29360128, 131068);
            o0VarE.g0(true);
            d92.b.f58624b.getClass();
            mh.c(str, c2.l.C(u2Var.a(aVar, 0.7f, true), f14, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, o0VarE), o0VarE, (i15 >> 3) & 14, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d(x0Var, str, str2, i14, 0);
        }
    }
}
