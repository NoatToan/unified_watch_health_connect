package ds;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mh;
import java.util.Locale;
import java.util.Map;
import p005kotlin.Unit;
import p006l2.q1;
import p006l2.r1;
import p13.t0;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.x0;
import yc.l2;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, q1> f60892a;

    static {
        long jB = o53.f0.B(4);
        long jB2 = o53.f0.B(0);
        s5.z.f157329b.getClass();
        s5.y yVar = new s5.y(jB, jB2, s5.z.f157336i, null);
        q.f61028a.getClass();
        f60892a = t0.b(new o13.p("spaceBetweenMetricAndUnit", new q1(yVar, q.f61029b)));
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0250  */
    /* JADX WARN: Code duplicated, block: B:114:0x0289  */
    /* JADX WARN: Code duplicated, block: B:122:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:129:0x032b  */
    /* JADX WARN: Code duplicated, block: B:131:0x0330  */
    /* JADX WARN: Code duplicated, block: B:134:0x033b  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:77:0x011c  */
    /* JADX WARN: Code duplicated, block: B:78:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0143  */
    /* JADX WARN: Code duplicated, block: B:83:0x014a  */
    /* JADX WARN: Code duplicated, block: B:84:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x016f  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:99:0x0206  */
    public static final void a(h4.r rVar, final String str, final long j8, final String str2, final String str3, int i14, boolean z14, boolean z15, p3.m mVar, final int i15, final int i16) {
        int i17;
        int i18;
        int i19;
        boolean z16;
        int i24;
        int i25;
        boolean z17;
        int i26;
        int i27;
        boolean z18;
        final boolean z19;
        final h4.r rVar2;
        final int i28;
        final boolean z24;
        p2 p2VarI0;
        h4.r rVar3;
        boolean z25;
        x0 x0VarA;
        s5.i0 i0Var;
        h4.g.a aVar;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        h5.g.a.b bVar;
        String upperCase;
        s5.c.b bVarH;
        x0 x0VarA2;
        int iJ;
        int iJ2;
        s5.c.b bVar2;
        x0 x0VarA3;
        int iJ3;
        int iJ4;
        str.getClass();
        o0 o0VarE = mVar.E(1542041752);
        int i29 = i16 & 1;
        if (i29 != 0) {
            i17 = i15 | 6;
        } else {
            i17 = i15 | (o0VarE.B(rVar) ? 4 : 2);
        }
        int i30 = i17 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | (o0VarE.B(str3) ? 16384 : 8192);
        int i34 = i16 & 32;
        if (i34 == 0) {
            if ((i15 & 196608) == 0) {
                i18 = i14;
                i30 |= o0VarE.k(i18) ? 131072 : 65536;
            }
            i19 = i16 & 64;
            if (i19 != 0) {
                if ((i15 & 1572864) == 0) {
                    z16 = z14;
                    if (o0VarE.h(z16)) {
                        i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                    } else {
                        i24 = 524288;
                    }
                    i30 |= i24;
                }
                i25 = i16 & 128;
                if (i25 != 0) {
                    if ((i15 & 12582912) == 0) {
                        z17 = z15;
                        if (o0VarE.h(z17)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i30 |= i26;
                    }
                    i27 = i30;
                    if ((i30 & 4793491) != 4793490) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (o0VarE.n(i27 & 1, z18)) {
                        if (i29 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar;
                        }
                        if (i34 != 0) {
                            i18 = 28;
                        }
                        if (i19 != 0) {
                            z16 = false;
                        }
                        if (i25 != 0) {
                            z25 = false;
                        } else {
                            z25 = z17;
                        }
                        x1 x1Var = p3.n.f135158a;
                        w.f61056a.getClass();
                        x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                        i0Var = x0VarA.f157322a;
                        c2.j jVar = c2.j.f22691a;
                        g6.f.a aVar3 = g6.f.f75994b;
                        jVar.getClass();
                        c2.j.i iVarI = c2.j.i(-5);
                        h4.d.f81522a.getClass();
                        if (z25) {
                            aVar = h4.d.a.f81538p;
                        } else {
                            aVar = h4.d.a.f81536n;
                        }
                        zVarA = c2.y.a(iVarI, aVar, o0VarE, 6);
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVar3, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        rVar = rVar3;
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
                        b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        bVar = h5.g.a.f81813j;
                        if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                        }
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.b0 b0Var = c2.b0.f22601a;
                        upperCase = "";
                        if (z16) {
                            o0VarE.C(1120407274);
                            if (str2 != null) {
                                upperCase = str2.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                            }
                            mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                            bVar2 = new s5.c.b(0, 1, null);
                            x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            iJ3 = bVar2.j(i0Var);
                            try {
                                bVar2.b(str);
                                Unit unit = Unit.INSTANCE;
                                bVar2.f(iJ3);
                                if (str3 != null) {
                                    r1.a(bVar2);
                                    iJ4 = bVar2.j(x0VarA3.f157322a);
                                    try {
                                        bVar2.b(str3);
                                        bVar2.f(iJ4);
                                    } catch (Throwable th3) {
                                        bVar2.f(iJ4);
                                        throw th3;
                                    }
                                }
                                mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                                o0VarE = o0VarE;
                                o0VarE.g0(false);
                            } catch (Throwable th4) {
                                bVar2.f(iJ3);
                                throw th4;
                            }
                        } else {
                            bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                            x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                            iJ = bVarH.j(i0Var);
                            try {
                                bVarH.b(str);
                                Unit unit2 = Unit.INSTANCE;
                                bVarH.f(iJ);
                                if (str3 != null) {
                                    r1.a(bVarH);
                                    iJ2 = bVarH.j(x0VarA2.f157322a);
                                    try {
                                        bVarH.b(str3);
                                        bVarH.f(iJ2);
                                    } catch (Throwable th5) {
                                        bVarH.f(iJ2);
                                        throw th5;
                                    }
                                }
                                mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                                if (str2 != null) {
                                    upperCase = str2.toUpperCase(Locale.ROOT);
                                    upperCase.getClass();
                                }
                                mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                                o0VarE = o0VarE;
                                o0VarE.g0(false);
                            } catch (Throwable th6) {
                                bVarH.f(iJ);
                                throw th6;
                            }
                        }
                        o0VarE.g0(true);
                        z19 = z25;
                    } else {
                        o0VarE.e();
                        z19 = z17;
                    }
                    rVar2 = rVar;
                    i28 = i18;
                    z24 = z16;
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                            @Override // e23.p
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                                return Unit.INSTANCE;
                            }
                        };
                    }
                }
                i30 |= 12582912;
                z17 = z15;
                i27 = i30;
                if ((i30 & 4793491) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i29 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i34 != 0) {
                        i18 = 28;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    x1 x1Var2 = p3.n.f135158a;
                    w.f61056a.getClass();
                    x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                    i0Var = x0VarA.f157322a;
                    c2.j jVar2 = c2.j.f22691a;
                    g6.f.a aVar4 = g6.f.f75994b;
                    jVar2.getClass();
                    c2.j.i iVarI2 = c2.j.i(-5);
                    h4.d.f81522a.getClass();
                    if (z25) {
                        aVar = h4.d.a.f81538p;
                    } else {
                        aVar = h4.d.a.f81536n;
                    }
                    zVarA = c2.y.a(iVarI2, aVar, o0VarE, 6);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar3, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    rVar = rVar3;
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
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    upperCase = "";
                    if (z16) {
                        o0VarE.C(1120407274);
                        if (str2 != null) {
                            upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                        bVar2 = new s5.c.b(0, 1, null);
                        x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        iJ3 = bVar2.j(i0Var);
                        bVar2.b(str);
                        Unit unit3 = Unit.INSTANCE;
                        bVar2.f(iJ3);
                        if (str3 != null) {
                            r1.a(bVar2);
                            iJ4 = bVar2.j(x0VarA3.f157322a);
                            bVar2.b(str3);
                            bVar2.f(iJ4);
                        }
                        mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                        x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        iJ = bVarH.j(i0Var);
                        bVarH.b(str);
                        Unit unit4 = Unit.INSTANCE;
                        bVarH.f(iJ);
                        if (str3 != null) {
                            r1.a(bVarH);
                            iJ2 = bVarH.j(x0VarA2.f157322a);
                            bVarH.b(str3);
                            bVarH.f(iJ2);
                        }
                        mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                        if (str2 != null) {
                            upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    z19 = z25;
                } else {
                    o0VarE.e();
                    z19 = z17;
                }
                rVar2 = rVar;
                i28 = i18;
                z24 = z16;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i30 |= 1572864;
            z16 = z14;
            i25 = i16 & 128;
            if (i25 != 0) {
                if ((i15 & 12582912) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i30 |= i26;
                }
                i27 = i30;
                if ((i30 & 4793491) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i29 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i34 != 0) {
                        i18 = 28;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    x1 x1Var3 = p3.n.f135158a;
                    w.f61056a.getClass();
                    x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                    i0Var = x0VarA.f157322a;
                    c2.j jVar3 = c2.j.f22691a;
                    g6.f.a aVar5 = g6.f.f75994b;
                    jVar3.getClass();
                    c2.j.i iVarI3 = c2.j.i(-5);
                    h4.d.f81522a.getClass();
                    if (z25) {
                        aVar = h4.d.a.f81538p;
                    } else {
                        aVar = h4.d.a.f81536n;
                    }
                    zVarA = c2.y.a(iVarI3, aVar, o0VarE, 6);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar3, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    rVar = rVar3;
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
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var3 = c2.b0.f22601a;
                    upperCase = "";
                    if (z16) {
                        o0VarE.C(1120407274);
                        if (str2 != null) {
                            upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                        bVar2 = new s5.c.b(0, 1, null);
                        x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        iJ3 = bVar2.j(i0Var);
                        bVar2.b(str);
                        Unit unit5 = Unit.INSTANCE;
                        bVar2.f(iJ3);
                        if (str3 != null) {
                            r1.a(bVar2);
                            iJ4 = bVar2.j(x0VarA3.f157322a);
                            bVar2.b(str3);
                            bVar2.f(iJ4);
                        }
                        mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                        x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        iJ = bVarH.j(i0Var);
                        bVarH.b(str);
                        Unit unit6 = Unit.INSTANCE;
                        bVarH.f(iJ);
                        if (str3 != null) {
                            r1.a(bVarH);
                            iJ2 = bVarH.j(x0VarA2.f157322a);
                            bVarH.b(str3);
                            bVarH.f(iJ2);
                        }
                        mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                        if (str2 != null) {
                            upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    z19 = z25;
                } else {
                    o0VarE.e();
                    z19 = z17;
                }
                rVar2 = rVar;
                i28 = i18;
                z24 = z16;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i30 |= 12582912;
            z17 = z15;
            i27 = i30;
            if ((i30 & 4793491) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i29 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i34 != 0) {
                    i18 = 28;
                }
                if (i19 != 0) {
                    z16 = false;
                }
                if (i25 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                x1 x1Var4 = p3.n.f135158a;
                w.f61056a.getClass();
                x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                i0Var = x0VarA.f157322a;
                c2.j jVar4 = c2.j.f22691a;
                g6.f.a aVar6 = g6.f.f75994b;
                jVar4.getClass();
                c2.j.i iVarI4 = c2.j.i(-5);
                h4.d.f81522a.getClass();
                if (z25) {
                    aVar = h4.d.a.f81538p;
                } else {
                    aVar = h4.d.a.f81536n;
                }
                zVarA = c2.y.a(iVarI4, aVar, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                rVar = rVar3;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var4 = c2.b0.f22601a;
                upperCase = "";
                if (z16) {
                    o0VarE.C(1120407274);
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                    bVar2 = new s5.c.b(0, 1, null);
                    x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    iJ3 = bVar2.j(i0Var);
                    bVar2.b(str);
                    Unit unit7 = Unit.INSTANCE;
                    bVar2.f(iJ3);
                    if (str3 != null) {
                        r1.a(bVar2);
                        iJ4 = bVar2.j(x0VarA3.f157322a);
                        bVar2.b(str3);
                        bVar2.f(iJ4);
                    }
                    mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                    x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    iJ = bVarH.j(i0Var);
                    bVarH.b(str);
                    Unit unit8 = Unit.INSTANCE;
                    bVarH.f(iJ);
                    if (str3 != null) {
                        r1.a(bVarH);
                        iJ2 = bVarH.j(x0VarA2.f157322a);
                        bVarH.b(str3);
                        bVarH.f(iJ2);
                    }
                    mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z19 = z25;
            } else {
                o0VarE.e();
                z19 = z17;
            }
            rVar2 = rVar;
            i28 = i18;
            z24 = z16;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i30 |= 196608;
        i18 = i14;
        i19 = i16 & 64;
        if (i19 != 0) {
            if ((i15 & 1572864) == 0) {
                z16 = z14;
                if (o0VarE.h(z16)) {
                    i24 = ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
                } else {
                    i24 = 524288;
                }
                i30 |= i24;
            }
            i25 = i16 & 128;
            if (i25 != 0) {
                if ((i15 & 12582912) == 0) {
                    z17 = z15;
                    if (o0VarE.h(z17)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i30 |= i26;
                }
                i27 = i30;
                if ((i30 & 4793491) != 4793490) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (o0VarE.n(i27 & 1, z18)) {
                    if (i29 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar;
                    }
                    if (i34 != 0) {
                        i18 = 28;
                    }
                    if (i19 != 0) {
                        z16 = false;
                    }
                    if (i25 != 0) {
                        z25 = false;
                    } else {
                        z25 = z17;
                    }
                    x1 x1Var5 = p3.n.f135158a;
                    w.f61056a.getClass();
                    x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                    i0Var = x0VarA.f157322a;
                    c2.j jVar5 = c2.j.f22691a;
                    g6.f.a aVar7 = g6.f.f75994b;
                    jVar5.getClass();
                    c2.j.i iVarI5 = c2.j.i(-5);
                    h4.d.f81522a.getClass();
                    if (z25) {
                        aVar = h4.d.a.f81538p;
                    } else {
                        aVar = h4.d.a.f81536n;
                    }
                    zVarA = c2.y.a(iVarI5, aVar, o0VarE, 6);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar3, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    rVar = rVar3;
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
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    } else {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var5 = c2.b0.f22601a;
                    upperCase = "";
                    if (z16) {
                        o0VarE.C(1120407274);
                        if (str2 != null) {
                            upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                        bVar2 = new s5.c.b(0, 1, null);
                        x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        iJ3 = bVar2.j(i0Var);
                        bVar2.b(str);
                        Unit unit9 = Unit.INSTANCE;
                        bVar2.f(iJ3);
                        if (str3 != null) {
                            r1.a(bVar2);
                            iJ4 = bVar2.j(x0VarA3.f157322a);
                            bVar2.b(str3);
                            bVar2.f(iJ4);
                        }
                        mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    } else {
                        bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                        x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                        iJ = bVarH.j(i0Var);
                        bVarH.b(str);
                        Unit unit10 = Unit.INSTANCE;
                        bVarH.f(iJ);
                        if (str3 != null) {
                            r1.a(bVarH);
                            iJ2 = bVarH.j(x0VarA2.f157322a);
                            bVarH.b(str3);
                            bVarH.f(iJ2);
                        }
                        mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                        if (str2 != null) {
                            upperCase = str2.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                        }
                        mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(true);
                    z19 = z25;
                } else {
                    o0VarE.e();
                    z19 = z17;
                }
                rVar2 = rVar;
                i28 = i18;
                z24 = z16;
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                        @Override // e23.p
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                            return Unit.INSTANCE;
                        }
                    };
                }
            }
            i30 |= 12582912;
            z17 = z15;
            i27 = i30;
            if ((i30 & 4793491) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i29 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i34 != 0) {
                    i18 = 28;
                }
                if (i19 != 0) {
                    z16 = false;
                }
                if (i25 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                x1 x1Var6 = p3.n.f135158a;
                w.f61056a.getClass();
                x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                i0Var = x0VarA.f157322a;
                c2.j jVar6 = c2.j.f22691a;
                g6.f.a aVar8 = g6.f.f75994b;
                jVar6.getClass();
                c2.j.i iVarI6 = c2.j.i(-5);
                h4.d.f81522a.getClass();
                if (z25) {
                    aVar = h4.d.a.f81538p;
                } else {
                    aVar = h4.d.a.f81536n;
                }
                zVarA = c2.y.a(iVarI6, aVar, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                rVar = rVar3;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var6 = c2.b0.f22601a;
                upperCase = "";
                if (z16) {
                    o0VarE.C(1120407274);
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                    bVar2 = new s5.c.b(0, 1, null);
                    x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    iJ3 = bVar2.j(i0Var);
                    bVar2.b(str);
                    Unit unit11 = Unit.INSTANCE;
                    bVar2.f(iJ3);
                    if (str3 != null) {
                        r1.a(bVar2);
                        iJ4 = bVar2.j(x0VarA3.f157322a);
                        bVar2.b(str3);
                        bVar2.f(iJ4);
                    }
                    mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                    x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    iJ = bVarH.j(i0Var);
                    bVarH.b(str);
                    Unit unit12 = Unit.INSTANCE;
                    bVarH.f(iJ);
                    if (str3 != null) {
                        r1.a(bVarH);
                        iJ2 = bVarH.j(x0VarA2.f157322a);
                        bVarH.b(str3);
                        bVarH.f(iJ2);
                    }
                    mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z19 = z25;
            } else {
                o0VarE.e();
                z19 = z17;
            }
            rVar2 = rVar;
            i28 = i18;
            z24 = z16;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i30 |= 1572864;
        z16 = z14;
        i25 = i16 & 128;
        if (i25 != 0) {
            if ((i15 & 12582912) == 0) {
                z17 = z15;
                if (o0VarE.h(z17)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i30 |= i26;
            }
            i27 = i30;
            if ((i30 & 4793491) != 4793490) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (o0VarE.n(i27 & 1, z18)) {
                if (i29 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar;
                }
                if (i34 != 0) {
                    i18 = 28;
                }
                if (i19 != 0) {
                    z16 = false;
                }
                if (i25 != 0) {
                    z25 = false;
                } else {
                    z25 = z17;
                }
                x1 x1Var7 = p3.n.f135158a;
                w.f61056a.getClass();
                x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
                i0Var = x0VarA.f157322a;
                c2.j jVar7 = c2.j.f22691a;
                g6.f.a aVar9 = g6.f.f75994b;
                jVar7.getClass();
                c2.j.i iVarI7 = c2.j.i(-5);
                h4.d.f81522a.getClass();
                if (z25) {
                    aVar = h4.d.a.f81538p;
                } else {
                    aVar = h4.d.a.f81536n;
                }
                zVarA = c2.y.a(iVarI7, aVar, o0VarE, 6);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                rVar = rVar3;
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
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var7 = c2.b0.f22601a;
                upperCase = "";
                if (z16) {
                    o0VarE.C(1120407274);
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                    bVar2 = new s5.c.b(0, 1, null);
                    x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    iJ3 = bVar2.j(i0Var);
                    bVar2.b(str);
                    Unit unit13 = Unit.INSTANCE;
                    bVar2.f(iJ3);
                    if (str3 != null) {
                        r1.a(bVar2);
                        iJ4 = bVar2.j(x0VarA3.f157322a);
                        bVar2.b(str3);
                        bVar2.f(iJ4);
                    }
                    mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                } else {
                    bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                    x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                    iJ = bVarH.j(i0Var);
                    bVarH.b(str);
                    Unit unit14 = Unit.INSTANCE;
                    bVarH.f(iJ);
                    if (str3 != null) {
                        r1.a(bVarH);
                        iJ2 = bVarH.j(x0VarA2.f157322a);
                        bVarH.b(str3);
                        bVarH.f(iJ2);
                    }
                    mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                    if (str2 != null) {
                        upperCase = str2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    }
                    mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                    o0VarE = o0VarE;
                    o0VarE.g0(false);
                }
                o0VarE.g0(true);
                z19 = z25;
            } else {
                o0VarE.e();
                z19 = z17;
            }
            rVar2 = rVar;
            i28 = i18;
            z24 = z16;
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        i30 |= 12582912;
        z17 = z15;
        i27 = i30;
        if ((i30 & 4793491) != 4793490) {
            z18 = true;
        } else {
            z18 = false;
        }
        if (o0VarE.n(i27 & 1, z18)) {
            if (i29 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar;
            }
            if (i34 != 0) {
                i18 = 28;
            }
            if (i19 != 0) {
                z16 = false;
            }
            if (i25 != 0) {
                z25 = false;
            } else {
                z25 = z17;
            }
            x1 x1Var8 = p3.n.f135158a;
            w.f61056a.getClass();
            x0VarA = x0.a(w.f61057b, j8, o53.f0.B(i18), null, null, 0L, null, null, 0, 0L, null, null, 16777212);
            i0Var = x0VarA.f157322a;
            c2.j jVar8 = c2.j.f22691a;
            g6.f.a aVar10 = g6.f.f75994b;
            jVar8.getClass();
            c2.j.i iVarI8 = c2.j.i(-5);
            h4.d.f81522a.getClass();
            if (z25) {
                aVar = h4.d.a.f81538p;
            } else {
                aVar = h4.d.a.f81536n;
            }
            zVarA = c2.y.a(iVarI8, aVar, o0VarE, 6);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar3, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            rVar = rVar3;
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
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var8 = c2.b0.f22601a;
            upperCase = "";
            if (z16) {
                o0VarE.C(1120407274);
                if (str2 != null) {
                    upperCase = str2.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                bVar2 = new s5.c.b(0, 1, null);
                x0VarA3 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                iJ3 = bVar2.j(i0Var);
                bVar2.b(str);
                Unit unit15 = Unit.INSTANCE;
                bVar2.f(iJ3);
                if (str3 != null) {
                    r1.a(bVar2);
                    iJ4 = bVar2.j(x0VarA3.f157322a);
                    bVar2.b(str3);
                    bVar2.f(iJ4);
                }
                mh.d(bVar2.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                bVarH = l2.h(o0VarE, 1121228650, 0, 1, null);
                x0VarA2 = x0.a(w.f61061f, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214);
                iJ = bVarH.j(i0Var);
                bVarH.b(str);
                Unit unit16 = Unit.INSTANCE;
                bVarH.f(iJ);
                if (str3 != null) {
                    r1.a(bVarH);
                    iJ2 = bVarH.j(x0VarA2.f157322a);
                    bVarH.b(str3);
                    bVarH.f(iJ2);
                }
                mh.d(bVarH.k(), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, f60892a, null, x0VarA, o0VarE, 0, 0, 196606);
                if (str2 != null) {
                    upperCase = str2.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                }
                mh.c(upperCase, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(w.f61060e, j8, 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), o0VarE, 0, 0, 131070);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
            z19 = z25;
        } else {
            o0VarE.e();
            z19 = z17;
        }
        rVar2 = rVar;
        i28 = i18;
        z24 = z16;
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e23.p() { // from class: ds.a0
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b0.a(rVar2, str, j8, str2, str3, i28, z24, z19, (p3.m) obj, p0.t(i15 | 1), i16);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
