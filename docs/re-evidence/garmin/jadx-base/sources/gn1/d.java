package gn1;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b63.u;
import b63.z;
import c2.b0;
import c2.x2;
import c53.c0;
import c53.q;
import c53.y;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.l;
import e23.p;
import e53.j;
import g2.m1;
import h4.k;
import h4.r;
import h5.e0;
import j23.i;
import j23.o;
import j23.t;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.t1;
import o4.f1;
import o4.g1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import s5.s0;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
public final class d {
    /* JADX WARN: Code duplicated, block: B:100:0x0292  */
    /* JADX WARN: Code duplicated, block: B:103:0x0299  */
    /* JADX WARN: Code duplicated, block: B:104:0x029c  */
    /* JADX WARN: Code duplicated, block: B:108:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:115:0x0316  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x013d  */
    /* JADX WARN: Code duplicated, block: B:47:0x014d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0157  */
    /* JADX WARN: Code duplicated, block: B:51:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x016c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:57:0x0177  */
    /* JADX WARN: Code duplicated, block: B:59:0x017b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0184  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x021d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0227  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0248 A[PHI: r8 r22 r31
      0x0248: PHI (r8v13 b63.z) = (r8v11 b63.z), (r8v15 b63.z) binds: [B:88:0x0246, B:81:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r22v6 java.lang.String) = (r22v5 java.lang.String), (r22v8 java.lang.String) binds: [B:88:0x0246, B:81:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x0248: PHI (r31v6 java.util.Locale) = (r31v5 java.util.Locale), (r31v11 java.util.Locale) binds: [B:88:0x0246, B:81:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:90:0x024b A[PHI: r8 r22 r31
      0x024b: PHI (r8v14 b63.z) = (r8v11 b63.z), (r8v15 b63.z) binds: [B:88:0x0246, B:81:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r22v7 java.lang.String) = (r22v5 java.lang.String), (r22v8 java.lang.String) binds: [B:88:0x0246, B:81:0x021a] A[DONT_GENERATE, DONT_INLINE]
      0x024b: PHI (r31v7 java.util.Locale) = (r31v5 java.util.Locale), (r31v11 java.util.Locale) binds: [B:88:0x0246, B:81:0x021a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x024e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0283  */
    /* JADX WARN: Code duplicated, block: B:99:0x028f  */
    public static final void a(r rVar, i iVar, u uVar, j23.g gVar, u uVar2, l lVar, m mVar, int i14) {
        u uVar3;
        int i15;
        o0 o0Var;
        List listS;
        String str;
        Locale locale;
        Integer numValueOf;
        e53.f fVar;
        long jE;
        long jE2;
        e53.f fVar2;
        long jE3;
        z zVarA;
        j jVarC;
        LocalDateTime localDateTime;
        j jVarB;
        long j8;
        long j14;
        int i16;
        z zVar;
        long j15;
        long jB;
        long jB2;
        int iSignum;
        long j16;
        long j17;
        long j18;
        long j19;
        long j24;
        e53.f fVar3;
        e53.f fVar4;
        r rVar2 = rVar;
        o0 o0VarE = mVar.E(-1890963787);
        int i17 = i14 | (o0VarE.B(rVar2) ? 4 : 2) | (o0VarE.r(iVar) ? 32 : 16) | (o0VarE.r(uVar) ? 256 : 128) | (o0VarE.r(gVar) ? 2048 : 1024) | (o0VarE.r(uVar2) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (74899 & i17) != 74898)) {
            x1 x1Var = n.f135158a;
            String strD = new b10.a((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b)).d(false, true);
            Locale locale2 = ((Configuration) o0VarE.A(AndroidCompositionLocals_androidKt.f6041a)).getLocales().get(0);
            boolean zB = o0VarE.B(uVar2) | o0VarE.B(uVar) | o0VarE.B(strD) | o0VarE.B(locale2);
            Object objQ = o0VarE.q();
            if (zB) {
                if (uVar2 == null) {
                    uVar3 = uVar;
                } else {
                    uVar3 = uVar2;
                }
                if (uVar3 != null) {
                    locale2.getClass();
                    a aVar = a.f78064a;
                    e53.c.a aVar2 = e53.c.f63094b;
                    fVar = e53.f.HOURS;
                    jE = e53.e.e(12, fVar);
                    jE2 = e53.e.e(2, fVar);
                    fVar2 = e53.f.MINUTES;
                    jE3 = e53.e.e(30, fVar2);
                    i15 = i17;
                    m1 m1Var = new m1(8, strD, locale2);
                    z.INSTANCE.getClass();
                    zVarA = z.Companion.a();
                    aVar.getClass();
                    jVarC = b63.b.c(uVar3, zVarA);
                    localDateTime = uVar3.f16216a;
                    if (localDateTime.getMinute() < 30) {
                        long jE4 = e53.e.e(localDateTime.getMinute(), fVar2);
                        jVarC.getClass();
                        jVarB = jVarC.b(e53.c.l(jE4));
                    } else {
                        j jVarB2 = jVarC.b(e53.e.e(1, fVar));
                        long jE5 = e53.e.e(localDateTime.getMinute(), fVar2);
                        jVarB2.getClass();
                        jVarB = jVarB2.b(e53.c.l(jE5));
                    }
                    jVarB.getClass();
                    j8 = e53.c.f63096d;
                    j14 = e53.c.f63095c;
                    o0Var = o0VarE;
                    i16 = ((int) jE) & 1;
                    if (i16 == 0) {
                        jB2 = e53.e.c((jE >> 1) / ((long) 2));
                    } else {
                        if (e53.c.g(jE)) {
                            iSignum = Integer.signum(2);
                            if (e53.c.g(jE)) {
                                if (iSignum != 0) {
                                    h.s("Multiplying infinite duration by zero yields an undefined result.");
                                    return;
                                }
                                if (iSignum > 0) {
                                    jB2 = jE;
                                } else {
                                    jB2 = e53.c.l(jE);
                                }
                                zVar = zVarA;
                            } else if (iSignum == 0) {
                                locale2 = locale2;
                                jB2 = 0;
                                zVar = zVarA;
                                strD = strD;
                            } else {
                                j16 = jE >> 1;
                                j17 = iSignum;
                                j18 = j16 * j17;
                                if (i16 != 0) {
                                    if (-2147483647L <= j16) {
                                        if (j18 / j17 != j16) {
                                            long j25 = 1000000;
                                            j19 = j16 / j25;
                                            j24 = j19 * j17;
                                            long j26 = (((j16 - (j19 * j25)) * j17) / j25) + j24;
                                            if (j24 / j17 == j19) {
                                            }
                                            strD = strD;
                                            locale2 = locale2;
                                            zVar = zVarA;
                                            if (Integer.signum(iSignum) * Long.signum(j16) > 0) {
                                                jB2 = j14;
                                            } else {
                                                jB2 = j8;
                                            }
                                        } else if (-4611686018426999999L <= j18) {
                                            jB2 = e53.e.b(j18 / ((long) 1000000));
                                        } else {
                                            jB2 = e53.e.b(j18 / ((long) 1000000));
                                        }
                                    } else if (j18 / j17 != j16) {
                                        long j27 = 1000000;
                                        j19 = j16 / j27;
                                        j24 = j19 * j17;
                                        long j28 = (((j16 - (j19 * j27)) * j17) / j27) + j24;
                                        if (j24 / j17 == j19) {
                                        }
                                        strD = strD;
                                        locale2 = locale2;
                                        zVar = zVarA;
                                        if (Integer.signum(iSignum) * Long.signum(j16) > 0) {
                                            jB2 = j14;
                                        } else {
                                            jB2 = j8;
                                        }
                                    } else if (-4611686018426999999L <= j18) {
                                        jB2 = e53.e.b(j18 / ((long) 1000000));
                                    } else {
                                        jB2 = e53.e.b(j18 / ((long) 1000000));
                                    }
                                    zVar = zVarA;
                                } else {
                                    strD = strD;
                                    locale2 = locale2;
                                    if (j18 / j17 == j16) {
                                        zVar = zVarA;
                                        jB = e53.e.b(t.h(j18, new o(-4611686018427387903L, 4611686018427387903L)));
                                    } else {
                                        zVar = zVarA;
                                        if (Integer.signum(iSignum) * Long.signum(j16) > 0) {
                                            jB2 = j14;
                                        } else {
                                            jB2 = j8;
                                        }
                                    }
                                }
                            }
                            if ((((int) jE2) & 1) == 0) {
                                fVar3 = e53.f.NANOSECONDS;
                            } else {
                                fVar3 = e53.f.MILLISECONDS;
                            }
                            if ((((int) jE3) & 1) == 0) {
                                fVar4 = e53.f.NANOSECONDS;
                            } else {
                                fVar4 = e53.f.MILLISECONDS;
                            }
                            e53.f fVar5 = (e53.f) r13.b.d(fVar3, fVar4);
                            int i18 = ((int) (e53.c.i(jE2, fVar5) / e53.c.i(jE3, fVar5))) - 1;
                            c53.j jVarE = q.e(new bb2.b(jE2, jVarB.b(jB2), 6), jVarB.b(e53.c.l(jB2)));
                            f2.o oVar = new f2.o(m1Var, zVar, i18, 12);
                            jVarE.getClass();
                            y yVar = y.f24588a;
                            yVar.getClass();
                            listS = c0.s(new c53.m(new c53.r(jVarE, oVar, yVar, null)));
                            if (listS == null) {
                            }
                            n92.c cVar = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                            locale2.getClass();
                            str = (String) h0.d0(listS);
                            if (str != null) {
                                strD = strD;
                                locale = locale2;
                                numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                                f fVar6 = new f(listS, cVar, locale, numValueOf);
                                o0VarE = o0Var;
                                o0VarE.K(fVar6);
                                objQ = fVar6;
                            } else {
                                strD = strD;
                                locale = locale2;
                            }
                            numValueOf = null;
                            f fVar7 = new f(listS, cVar, locale, numValueOf);
                            o0VarE = o0Var;
                            o0VarE.K(fVar7);
                            objQ = fVar7;
                        } else {
                            strD = strD;
                            locale2 = locale2;
                            zVar = zVarA;
                            long j29 = jE >> 1;
                            long j34 = 2;
                            j15 = j29 / j34;
                            if (-4611686018426L <= j15) {
                                jB = e53.e.b(j15);
                            } else {
                                jB = e53.e.b(j15);
                            }
                        }
                        jB2 = jB;
                        if ((((int) jE2) & 1) == 0) {
                            fVar3 = e53.f.NANOSECONDS;
                        } else {
                            fVar3 = e53.f.MILLISECONDS;
                        }
                        if ((((int) jE3) & 1) == 0) {
                            fVar4 = e53.f.NANOSECONDS;
                        } else {
                            fVar4 = e53.f.MILLISECONDS;
                        }
                        e53.f fVar8 = (e53.f) r13.b.d(fVar3, fVar4);
                        int i19 = ((int) (e53.c.i(jE2, fVar8) / e53.c.i(jE3, fVar8))) - 1;
                        c53.j jVarE2 = q.e(new bb2.b(jE2, jVarB.b(jB2), 6), jVarB.b(e53.c.l(jB2)));
                        f2.o oVar2 = new f2.o(m1Var, zVar, i19, 12);
                        jVarE2.getClass();
                        y yVar2 = y.f24588a;
                        yVar2.getClass();
                        listS = c0.s(new c53.m(new c53.r(jVarE2, oVar2, yVar2, null)));
                        if (listS == null) {
                        }
                        n92.c cVar2 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                        locale2.getClass();
                        str = (String) h0.d0(listS);
                        if (str != null) {
                            strD = strD;
                            locale = locale2;
                            numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                            f fVar9 = new f(listS, cVar2, locale, numValueOf);
                            o0VarE = o0Var;
                            o0VarE.K(fVar9);
                            objQ = fVar9;
                        } else {
                            strD = strD;
                            locale = locale2;
                        }
                        numValueOf = null;
                        f fVar10 = new f(listS, cVar2, locale, numValueOf);
                        o0VarE = o0Var;
                        o0VarE.K(fVar10);
                        objQ = fVar10;
                    }
                    zVar = zVarA;
                    if ((((int) jE2) & 1) == 0) {
                        fVar3 = e53.f.NANOSECONDS;
                    } else {
                        fVar3 = e53.f.MILLISECONDS;
                    }
                    if ((((int) jE3) & 1) == 0) {
                        fVar4 = e53.f.NANOSECONDS;
                    } else {
                        fVar4 = e53.f.MILLISECONDS;
                    }
                    e53.f fVar11 = (e53.f) r13.b.d(fVar3, fVar4);
                    int i110 = ((int) (e53.c.i(jE2, fVar11) / e53.c.i(jE3, fVar11))) - 1;
                    c53.j jVarE3 = q.e(new bb2.b(jE2, jVarB.b(jB2), 6), jVarB.b(e53.c.l(jB2)));
                    f2.o oVar3 = new f2.o(m1Var, zVar, i110, 12);
                    jVarE3.getClass();
                    y yVar3 = y.f24588a;
                    yVar3.getClass();
                    listS = c0.s(new c53.m(new c53.r(jVarE3, oVar3, yVar3, null)));
                    if (listS == null) {
                    }
                    n92.c cVar3 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                    locale2.getClass();
                    str = (String) h0.d0(listS);
                    if (str != null) {
                        strD = strD;
                        locale = locale2;
                        numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                        f fVar12 = new f(listS, cVar3, locale, numValueOf);
                        o0VarE = o0Var;
                        o0VarE.K(fVar12);
                        objQ = fVar12;
                    } else {
                        strD = strD;
                        locale = locale2;
                    }
                    numValueOf = null;
                    f fVar13 = new f(listS, cVar3, locale, numValueOf);
                    o0VarE = o0Var;
                    o0VarE.K(fVar13);
                    objQ = fVar13;
                } else {
                    i15 = i17;
                    strD = strD;
                    locale2 = locale2;
                    o0Var = o0VarE;
                }
                listS = j0.f134944a;
                n92.c cVar4 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                locale2.getClass();
                str = (String) h0.d0(listS);
                if (str != null) {
                    strD = strD;
                    locale = locale2;
                    numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                    f fVar14 = new f(listS, cVar4, locale, numValueOf);
                    o0VarE = o0Var;
                    o0VarE.K(fVar14);
                    objQ = fVar14;
                } else {
                    strD = strD;
                    locale = locale2;
                }
                numValueOf = null;
                f fVar15 = new f(listS, cVar4, locale, numValueOf);
                o0VarE = o0Var;
                o0VarE.K(fVar15);
                objQ = fVar15;
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    if (uVar2 == null) {
                        uVar3 = uVar;
                    } else {
                        uVar3 = uVar2;
                    }
                    if (uVar3 != null) {
                        locale2.getClass();
                        a aVar3 = a.f78064a;
                        e53.c.a aVar4 = e53.c.f63094b;
                        fVar = e53.f.HOURS;
                        jE = e53.e.e(12, fVar);
                        jE2 = e53.e.e(2, fVar);
                        fVar2 = e53.f.MINUTES;
                        jE3 = e53.e.e(30, fVar2);
                        i15 = i17;
                        m1 m1Var2 = new m1(8, strD, locale2);
                        z.INSTANCE.getClass();
                        zVarA = z.Companion.a();
                        aVar3.getClass();
                        jVarC = b63.b.c(uVar3, zVarA);
                        localDateTime = uVar3.f16216a;
                        if (localDateTime.getMinute() < 30) {
                            long jE6 = e53.e.e(localDateTime.getMinute(), fVar2);
                            jVarC.getClass();
                            jVarB = jVarC.b(e53.c.l(jE6));
                        } else {
                            j jVarB3 = jVarC.b(e53.e.e(1, fVar));
                            long jE7 = e53.e.e(localDateTime.getMinute(), fVar2);
                            jVarB3.getClass();
                            jVarB = jVarB3.b(e53.c.l(jE7));
                        }
                        jVarB.getClass();
                        j8 = e53.c.f63096d;
                        j14 = e53.c.f63095c;
                        o0Var = o0VarE;
                        i16 = ((int) jE) & 1;
                        if (i16 == 0) {
                            jB2 = e53.e.c((jE >> 1) / ((long) 2));
                        } else {
                            if (e53.c.g(jE)) {
                                iSignum = Integer.signum(2);
                                if (e53.c.g(jE)) {
                                    if (iSignum != 0) {
                                        h.s("Multiplying infinite duration by zero yields an undefined result.");
                                        return;
                                    }
                                    if (iSignum > 0) {
                                        jB2 = jE;
                                    } else {
                                        jB2 = e53.c.l(jE);
                                    }
                                    zVar = zVarA;
                                } else if (iSignum == 0) {
                                    locale2 = locale2;
                                    jB2 = 0;
                                    zVar = zVarA;
                                    strD = strD;
                                } else {
                                    j16 = jE >> 1;
                                    j17 = iSignum;
                                    j18 = j16 * j17;
                                    if (i16 != 0) {
                                        strD = strD;
                                        locale2 = locale2;
                                        if (j18 / j17 == j16) {
                                            zVar = zVarA;
                                            jB = e53.e.b(t.h(j18, new o(-4611686018427387903L, 4611686018427387903L)));
                                        } else {
                                            zVar = zVarA;
                                            if (Integer.signum(iSignum) * Long.signum(j16) > 0) {
                                                jB2 = j14;
                                            } else {
                                                jB2 = j8;
                                            }
                                        }
                                    } else if (-2147483647L <= j16 || j16 >= 2147483648L) {
                                        if (j18 / j17 != j16) {
                                            long j210 = 1000000;
                                            j19 = j16 / j210;
                                            j24 = j19 * j17;
                                            long j211 = (((j16 - (j19 * j210)) * j17) / j210) + j24;
                                            if (j24 / j17 == j19 || (j211 ^ j24) < 0) {
                                                strD = strD;
                                                locale2 = locale2;
                                                zVar = zVarA;
                                                if (Integer.signum(iSignum) * Long.signum(j16) > 0) {
                                                    jB2 = j14;
                                                } else {
                                                    jB2 = j8;
                                                }
                                            } else {
                                                jB2 = e53.e.b(t.h(j211, new o(-4611686018427387903L, 4611686018427387903L)));
                                            }
                                        } else if (-4611686018426999999L <= j18 || j18 >= 4611686018427000000L) {
                                            jB2 = e53.e.b(j18 / ((long) 1000000));
                                        } else {
                                            jB2 = e53.e.c(j18);
                                        }
                                        zVar = zVarA;
                                    } else {
                                        jB2 = e53.e.c(j18);
                                    }
                                }
                                if ((((int) jE2) & 1) == 0) {
                                    fVar3 = e53.f.NANOSECONDS;
                                } else {
                                    fVar3 = e53.f.MILLISECONDS;
                                }
                                if ((((int) jE3) & 1) == 0) {
                                    fVar4 = e53.f.NANOSECONDS;
                                } else {
                                    fVar4 = e53.f.MILLISECONDS;
                                }
                                e53.f fVar16 = (e53.f) r13.b.d(fVar3, fVar4);
                                int i111 = ((int) (e53.c.i(jE2, fVar16) / e53.c.i(jE3, fVar16))) - 1;
                                c53.j jVarE4 = q.e(new bb2.b(jE2, jVarB.b(jB2), 6), jVarB.b(e53.c.l(jB2)));
                                f2.o oVar4 = new f2.o(m1Var2, zVar, i111, 12);
                                jVarE4.getClass();
                                y yVar4 = y.f24588a;
                                yVar4.getClass();
                                listS = c0.s(new c53.m(new c53.r(jVarE4, oVar4, yVar4, null)));
                                if (listS == null) {
                                }
                                n92.c cVar5 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                                locale2.getClass();
                                str = (String) h0.d0(listS);
                                if (str != null) {
                                    strD = strD;
                                    locale = locale2;
                                    try {
                                        numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                                    } catch (DateTimeException unused) {
                                        numValueOf = null;
                                    }
                                    f fVar17 = new f(listS, cVar5, locale, numValueOf);
                                    o0VarE = o0Var;
                                    o0VarE.K(fVar17);
                                    objQ = fVar17;
                                } else {
                                    strD = strD;
                                    locale = locale2;
                                }
                                numValueOf = null;
                                f fVar18 = new f(listS, cVar5, locale, numValueOf);
                                o0VarE = o0Var;
                                o0VarE.K(fVar18);
                                objQ = fVar18;
                            } else {
                                strD = strD;
                                locale2 = locale2;
                                zVar = zVarA;
                                long j212 = jE >> 1;
                                long j35 = 2;
                                j15 = j212 / j35;
                                if (-4611686018426L <= j15 || j15 >= 4611686018427L) {
                                    jB = e53.e.b(j15);
                                } else {
                                    long j36 = j212 - (j15 * j35);
                                    long j37 = 1000000;
                                    jB = e53.e.c((j15 * j37) + ((j36 * j37) / j35));
                                }
                            }
                            jB2 = jB;
                            if ((((int) jE2) & 1) == 0) {
                                fVar3 = e53.f.NANOSECONDS;
                            } else {
                                fVar3 = e53.f.MILLISECONDS;
                            }
                            if ((((int) jE3) & 1) == 0) {
                                fVar4 = e53.f.NANOSECONDS;
                            } else {
                                fVar4 = e53.f.MILLISECONDS;
                            }
                            e53.f fVar19 = (e53.f) r13.b.d(fVar3, fVar4);
                            int i112 = ((int) (e53.c.i(jE2, fVar19) / e53.c.i(jE3, fVar19))) - 1;
                            c53.j jVarE5 = q.e(new bb2.b(jE2, jVarB.b(jB2), 6), jVarB.b(e53.c.l(jB2)));
                            f2.o oVar5 = new f2.o(m1Var2, zVar, i112, 12);
                            jVarE5.getClass();
                            y yVar5 = y.f24588a;
                            yVar5.getClass();
                            listS = c0.s(new c53.m(new c53.r(jVarE5, oVar5, yVar5, null)));
                            if (listS == null) {
                            }
                            n92.c cVar6 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                            locale2.getClass();
                            str = (String) h0.d0(listS);
                            if (str != null) {
                                strD = strD;
                                locale = locale2;
                                numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                                f fVar110 = new f(listS, cVar6, locale, numValueOf);
                                o0VarE = o0Var;
                                o0VarE.K(fVar110);
                                objQ = fVar110;
                            } else {
                                strD = strD;
                                locale = locale2;
                            }
                            numValueOf = null;
                            f fVar111 = new f(listS, cVar6, locale, numValueOf);
                            o0VarE = o0Var;
                            o0VarE.K(fVar111);
                            objQ = fVar111;
                        }
                        zVar = zVarA;
                        if ((((int) jE2) & 1) == 0) {
                            fVar3 = e53.f.NANOSECONDS;
                        } else {
                            fVar3 = e53.f.MILLISECONDS;
                        }
                        if ((((int) jE3) & 1) == 0) {
                            fVar4 = e53.f.NANOSECONDS;
                        } else {
                            fVar4 = e53.f.MILLISECONDS;
                        }
                        e53.f fVar112 = (e53.f) r13.b.d(fVar3, fVar4);
                        int i113 = ((int) (e53.c.i(jE2, fVar112) / e53.c.i(jE3, fVar112))) - 1;
                        c53.j jVarE6 = q.e(new bb2.b(jE2, jVarB.b(jB2), 6), jVarB.b(e53.c.l(jB2)));
                        f2.o oVar6 = new f2.o(m1Var2, zVar, i113, 12);
                        jVarE6.getClass();
                        y yVar6 = y.f24588a;
                        yVar6.getClass();
                        listS = c0.s(new c53.m(new c53.r(jVarE6, oVar6, yVar6, null)));
                        if (listS == null) {
                        }
                        n92.c cVar7 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                        locale2.getClass();
                        str = (String) h0.d0(listS);
                        if (str != null) {
                            strD = strD;
                            locale = locale2;
                            numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                            f fVar113 = new f(listS, cVar7, locale, numValueOf);
                            o0VarE = o0Var;
                            o0VarE.K(fVar113);
                            objQ = fVar113;
                        } else {
                            strD = strD;
                            locale = locale2;
                        }
                        numValueOf = null;
                        f fVar114 = new f(listS, cVar7, locale, numValueOf);
                        o0VarE = o0Var;
                        o0VarE.K(fVar114);
                        objQ = fVar114;
                    } else {
                        i15 = i17;
                        strD = strD;
                        locale2 = locale2;
                        o0Var = o0VarE;
                    }
                    listS = j0.f134944a;
                    n92.c cVar8 = n92.c.ONE_BIG_THREE_SMALL_DOT_PATTERN;
                    locale2.getClass();
                    str = (String) h0.d0(listS);
                    if (str != null) {
                        strD = strD;
                        locale = locale2;
                        numValueOf = Integer.valueOf(DateTimeFormatter.ofPattern(strD, locale).parse(str).get(ChronoField.HOUR_OF_DAY));
                        f fVar115 = new f(listS, cVar8, locale, numValueOf);
                        o0VarE = o0Var;
                        o0VarE.K(fVar115);
                        objQ = fVar115;
                    } else {
                        strD = strD;
                        locale = locale2;
                    }
                    numValueOf = null;
                    f fVar116 = new f(listS, cVar8, locale, numValueOf);
                    o0VarE = o0Var;
                    o0VarE.K(fVar116);
                    objQ = fVar116;
                } else {
                    i15 = i17;
                }
            }
            f fVar20 = (f) objQ;
            rVar2 = rVar;
            r rVarF = x2.f(rVar2, 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar5 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar5, o0VarE, 48);
            x1 x1Var2 = n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            r rVarC = k.c(rVarF, o0VarE);
            h5.g.V.getClass();
            e0.a aVar6 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar6);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA2, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b0 b0Var = b0.f22601a;
            b(iVar, uVar, gVar, uVar2, fVar20, strD, lVar, o0VarE, ((i15 >> 3) & 8190) | 1572864);
            c(uVar2 != null, o0VarE, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.c((Object) rVar2, (Object) iVar, (Object) uVar, (Object) gVar, (Object) uVar2, lVar, i14, 27);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:74:0x021b  */
    public static final void b(final i iVar, final u uVar, final j23.g gVar, final u uVar2, final f fVar, String str, l lVar, m mVar, int i14) {
        int i15;
        o0 o0Var;
        o0 o0VarE = mVar.E(-1706020160);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(iVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(uVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(gVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(uVar2) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(fVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.B(str) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = n.f135158a;
            List<String> list = fVar.f78083a;
            Objects.toString(list);
            s0 s0Var = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
            n92.c cVar = fVar.f78084b;
            d92.b.f58623a.getClass();
            d92.b.f58624b.getClass();
            final n92.b bVar = new n92.b(list, null, cVar, true, 0, null, s0Var, d92.c.f(j92.f.f97935l, o0VarE), 50, null);
            g6.f.a aVar = g6.f.f75994b;
            final float fG = w02.b0.g(8, o0VarE);
            float f14 = 91;
            float fG2 = w02.b0.g(f14, o0VarE);
            final float f15 = fG2 * 0.25f;
            final float f16 = fG2 * 0.45f;
            Float fValueOf = Float.valueOf(f15);
            Float fValueOf2 = Float.valueOf(fG);
            boolean zI = ((i15 & 3670016) == 1048576) | o0VarE.i(f15) | o0VarE.i(fG);
            Object objQ = o0VarE.q();
            m.a aVar2 = m.f135153a;
            if (zI) {
                objQ = new c(lVar, f15, fG, null);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new c(lVar, f15, fG, null);
                    o0VarE.K(objQ);
                }
            }
            l0.f(fValueOf, fValueOf2, (p) objQ, o0VarE);
            e.f78082a.getClass();
            final long jG = d92.b.a(o0VarE).e().g();
            gl.c cVar2 = gl.c.f77766a;
            cVar2.getClass();
            final long jG2 = gl.c.a(o0VarE).g();
            cVar2.getClass();
            final long jF = gl.c.a(o0VarE).f();
            cVar2.getClass();
            final long jC = gl.c.a(o0VarE).c();
            cVar2.getClass();
            final long j8 = gl.c.a(o0VarE).j();
            r rVarH = x2.h(x2.f(r.S, 1.0f), f14);
            boolean zR = o0VarE.r(uVar2) | o0VarE.i(fG) | o0VarE.r(fVar) | o0VarE.r(uVar) | o0VarE.r(iVar) | o0VarE.l(jG) | o0VarE.l(jG2) | o0VarE.i(f15) | o0VarE.l(jC) | o0VarE.r(gVar) | o0VarE.i(f16) | o0VarE.l(j8) | o0VarE.l(jF) | o0VarE.r(bVar);
            Object objQ2 = o0VarE.q();
            if (zR) {
                objQ2 = new l() { // from class: gn1.b
                    @Override // e23.l
                    public final Object invoke(Object obj) {
                        float f17;
                        float f18;
                        long j14;
                        Float fValueOf3;
                        q4.f fVar2 = (q4.f) obj;
                        fVar2.getClass();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar2.b() >> 32));
                        float f19 = 2;
                        float f22 = fG;
                        float f24 = f22 / f19;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f24)) << 32) | (((long) Float.floatToRawIntBits(f24)) & 4294967295L);
                        n4.a.C2318a c2318a = n4.a.f123535b;
                        float f25 = fIntBitsToFloat / 12.0f;
                        Integer num = fVar.f78086d;
                        u uVar3 = uVar;
                        long j15 = jG;
                        long j16 = jG2;
                        long j17 = uVar3 != null ? j15 : j16;
                        long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                        float f26 = f15;
                        long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L);
                        n4.c.a aVar3 = n4.c.f123541b;
                        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L);
                        n4.g.a aVar4 = n4.g.f123559b;
                        q4.f.M0(fVar2, j17, jFloatToRawIntBits3, jFloatToRawIntBits4, jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                        if (uVar3 == null || num == null) {
                            f17 = fIntBitsToFloat;
                        } else {
                            i iVar2 = iVar;
                            float fE = d.e(d.d((u) iVar2.f96793a), f25, num.intValue());
                            float fE2 = d.e(d.d((u) iVar2.f96794b), f25, num.intValue());
                            float f27 = fE > fE2 ? 0.0f : fE;
                            if (fE <= fE2) {
                                fE2 -= fE;
                            }
                            float fD = t.d(f27, 0.0f, fIntBitsToFloat);
                            float fD2 = t.d(f27 + fE2, 0.0f, fIntBitsToFloat) - fD;
                            if (fD2 > 0.0f) {
                                f17 = fIntBitsToFloat;
                                q4.f.M0(fVar2, jC, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L), (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L), jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                            } else {
                                f17 = fIntBitsToFloat;
                            }
                        }
                        u uVar4 = uVar2;
                        j23.g gVar2 = gVar;
                        long j18 = (uVar4 == null || gVar2 == null) ? j16 : j15;
                        long jFloatToRawIntBits5 = Float.floatToRawIntBits(0.0f);
                        float f28 = f16;
                        q4.f fVar3 = fVar2;
                        q4.f.M0(fVar3, j18, (jFloatToRawIntBits5 << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L), jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                        if (uVar4 != null && gVar2 != null && num != null) {
                            float fE3 = d.e(d.d((u) gVar2.getStart()), f25, num.intValue());
                            float fE4 = d.e(d.d((u) gVar2.b()), f25, num.intValue());
                            float f29 = fE3 > fE4 ? 0.0f : fE3;
                            if (fE3 <= fE4) {
                                fE4 -= fE3;
                            }
                            float f34 = f17;
                            float fD3 = t.d(f29, 0.0f, f34);
                            float fD4 = t.d(f29 + fE4, 0.0f, f34) - fD3;
                            if (fD4 > 0.0f) {
                                q4.f.M0(fVar3, j8, (((long) Float.floatToRawIntBits(fD3)) << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), (((long) Float.floatToRawIntBits(f22)) & 4294967295L) | (((long) Float.floatToRawIntBits(fD4)) << 32), jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                            }
                        }
                        g6.f.a aVar5 = g6.f.f75994b;
                        float fS0 = fVar3.s0(16);
                        float fS1 = fVar3.s0(f19);
                        long j19 = jF;
                        if (uVar3 == null || num == null) {
                            f18 = fS0;
                            j14 = j19;
                        } else {
                            float fE5 = d.e(d.d(uVar3), f25, num.intValue());
                            long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fE5)) << 32) | (((long) Float.floatToRawIntBits(q6.f.c(f22, fS0, f19, f26))) & 4294967295L);
                            long jFloatToRawIntBits7 = Float.floatToRawIntBits(fE5);
                            long jFloatToRawIntBits8 = ((long) Float.floatToRawIntBits(((f22 + fS0) / f19) + f26)) & 4294967295L;
                            j14 = j19;
                            f18 = fS0;
                            q4.f.G1(fVar3, j14, jFloatToRawIntBits6, jFloatToRawIntBits8 | (jFloatToRawIntBits7 << 32), fS1, 0, null, 0, 496);
                        }
                        if (uVar4 == null || num == null) {
                            fVar3 = fVar3;
                            fValueOf3 = null;
                        } else {
                            float fE6 = d.e(d.d(uVar4), f25, num.intValue());
                            fValueOf3 = Float.valueOf(fE6);
                            fVar3 = fVar3;
                            q4.f.G1(fVar3, j14, (((long) Float.floatToRawIntBits(q6.f.c(r22, f18, f19, f28))) & 4294967295L) | (((long) Float.floatToRawIntBits(fE6)) << 32), (((long) Float.floatToRawIntBits(((r22 + f18) / f19) + f28)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE6)) << 32), fS1, 0, null, 0, 496);
                        }
                        if (fValueOf3 != null) {
                            float f35 = ((f26 + f28) + f22) / f19;
                            float f36 = (f25 * f19) / f19;
                            float f37 = ((((f28 + f22) - f26) * 1.6f) / f19) + 4;
                            long j24 = j14;
                            o4.j jVarA = o4.m.a();
                            jVarA.k(new n4.e(fValueOf3.floatValue() - f36, f35 - f37, fValueOf3.floatValue() + f36, f35 + f37, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, null), f1.b.CounterClockwise);
                            g1.f128855a.getClass();
                            q4.f.L(fVar3, jVarA, j24, 0.0f, new q4.k(fVar3.s0(f19), 0.0f, 0, 0, g1.a.a(0.0f, new float[]{10.0f, 10.0f}), 14, null), 52);
                        }
                        bVar.a(fVar3, 0.0f);
                        return Unit.INSTANCE;
                    }
                };
                o0Var = o0VarE;
                o0Var.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new l() { // from class: gn1.b
                        @Override // e23.l
                        public final Object invoke(Object obj) {
                            float f17;
                            float f18;
                            long j14;
                            Float fValueOf3;
                            q4.f fVar2 = (q4.f) obj;
                            fVar2.getClass();
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar2.b() >> 32));
                            float f19 = 2;
                            float f22 = fG;
                            float f24 = f22 / f19;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f24)) << 32) | (((long) Float.floatToRawIntBits(f24)) & 4294967295L);
                            n4.a.C2318a c2318a = n4.a.f123535b;
                            float f25 = fIntBitsToFloat / 12.0f;
                            Integer num = fVar.f78086d;
                            u uVar3 = uVar;
                            long j15 = jG;
                            long j16 = jG2;
                            long j17 = uVar3 != null ? j15 : j16;
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
                            float f26 = f15;
                            long jFloatToRawIntBits3 = (jFloatToRawIntBits2 << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L);
                            n4.c.a aVar3 = n4.c.f123541b;
                            long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L);
                            n4.g.a aVar4 = n4.g.f123559b;
                            q4.f.M0(fVar2, j17, jFloatToRawIntBits3, jFloatToRawIntBits4, jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                            if (uVar3 == null || num == null) {
                                f17 = fIntBitsToFloat;
                            } else {
                                i iVar2 = iVar;
                                float fE = d.e(d.d((u) iVar2.f96793a), f25, num.intValue());
                                float fE2 = d.e(d.d((u) iVar2.f96794b), f25, num.intValue());
                                float f27 = fE > fE2 ? 0.0f : fE;
                                if (fE <= fE2) {
                                    fE2 -= fE;
                                }
                                float fD = t.d(f27, 0.0f, fIntBitsToFloat);
                                float fD2 = t.d(f27 + fE2, 0.0f, fIntBitsToFloat) - fD;
                                if (fD2 > 0.0f) {
                                    f17 = fIntBitsToFloat;
                                    q4.f.M0(fVar2, jC, (((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(f26)) & 4294967295L), (((long) Float.floatToRawIntBits(fD2)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L), jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                                } else {
                                    f17 = fIntBitsToFloat;
                                }
                            }
                            u uVar4 = uVar2;
                            j23.g gVar2 = gVar;
                            long j18 = (uVar4 == null || gVar2 == null) ? j16 : j15;
                            long jFloatToRawIntBits5 = Float.floatToRawIntBits(0.0f);
                            float f28 = f16;
                            q4.f fVar3 = fVar2;
                            q4.f.M0(fVar3, j18, (jFloatToRawIntBits5 << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(f22)) & 4294967295L), jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                            if (uVar4 != null && gVar2 != null && num != null) {
                                float fE3 = d.e(d.d((u) gVar2.getStart()), f25, num.intValue());
                                float fE4 = d.e(d.d((u) gVar2.b()), f25, num.intValue());
                                float f29 = fE3 > fE4 ? 0.0f : fE3;
                                if (fE3 <= fE4) {
                                    fE4 -= fE3;
                                }
                                float f34 = f17;
                                float fD3 = t.d(f29, 0.0f, f34);
                                float fD4 = t.d(f29 + fE4, 0.0f, f34) - fD3;
                                if (fD4 > 0.0f) {
                                    q4.f.M0(fVar3, j8, (((long) Float.floatToRawIntBits(fD3)) << 32) | (((long) Float.floatToRawIntBits(f28)) & 4294967295L), (((long) Float.floatToRawIntBits(f22)) & 4294967295L) | (((long) Float.floatToRawIntBits(fD4)) << 32), jFloatToRawIntBits, null, 0, PsExtractor.VIDEO_STREAM_MASK);
                                }
                            }
                            g6.f.a aVar5 = g6.f.f75994b;
                            float fS0 = fVar3.s0(16);
                            float fS1 = fVar3.s0(f19);
                            long j19 = jF;
                            if (uVar3 == null || num == null) {
                                f18 = fS0;
                                j14 = j19;
                            } else {
                                float fE5 = d.e(d.d(uVar3), f25, num.intValue());
                                long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fE5)) << 32) | (((long) Float.floatToRawIntBits(q6.f.c(f22, fS0, f19, f26))) & 4294967295L);
                                long jFloatToRawIntBits7 = Float.floatToRawIntBits(fE5);
                                long jFloatToRawIntBits8 = ((long) Float.floatToRawIntBits(((f22 + fS0) / f19) + f26)) & 4294967295L;
                                j14 = j19;
                                f18 = fS0;
                                q4.f.G1(fVar3, j14, jFloatToRawIntBits6, jFloatToRawIntBits8 | (jFloatToRawIntBits7 << 32), fS1, 0, null, 0, 496);
                            }
                            if (uVar4 == null || num == null) {
                                fVar3 = fVar3;
                                fValueOf3 = null;
                            } else {
                                float fE6 = d.e(d.d(uVar4), f25, num.intValue());
                                fValueOf3 = Float.valueOf(fE6);
                                fVar3 = fVar3;
                                q4.f.G1(fVar3, j14, (((long) Float.floatToRawIntBits(q6.f.c(r22, f18, f19, f28))) & 4294967295L) | (((long) Float.floatToRawIntBits(fE6)) << 32), (((long) Float.floatToRawIntBits(((r22 + f18) / f19) + f28)) & 4294967295L) | (((long) Float.floatToRawIntBits(fE6)) << 32), fS1, 0, null, 0, 496);
                            }
                            if (fValueOf3 != null) {
                                float f35 = ((f26 + f28) + f22) / f19;
                                float f36 = (f25 * f19) / f19;
                                float f37 = ((((f28 + f22) - f26) * 1.6f) / f19) + 4;
                                long j24 = j14;
                                o4.j jVarA = o4.m.a();
                                jVarA.k(new n4.e(fValueOf3.floatValue() - f36, f35 - f37, fValueOf3.floatValue() + f36, f35 + f37, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, null), f1.b.CounterClockwise);
                                g1.f128855a.getClass();
                                q4.f.L(fVar3, jVarA, j24, 0.0f, new q4.k(fVar3.s0(f19), 0.0f, 0, 0, g1.a.a(0.0f, new float[]{10.0f, 10.0f}), 14, null), 52);
                            }
                            bVar.a(fVar3, 0.0f);
                            return Unit.INSTANCE;
                        }
                    };
                    o0Var = o0VarE;
                    o0Var.K(objQ2);
                } else {
                    o0Var = o0VarE;
                }
            }
            u1.n.b(rVarH, (l) objQ2, o0Var, 6);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.o((Object) iVar, (Object) uVar, (Object) gVar, (Object) uVar2, (Object) fVar, str, (Object) lVar, i14, 7);
        }
    }

    public static final void c(boolean z14, m mVar, int i14) {
        o0 o0VarE = mVar.E(1853914191);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = n.f135158a;
            o0VarE.C(-799885942);
            ArrayList arrayList = new ArrayList();
            j82.f fVar = new j82.f(gl1.y.Q(o0VarE, R.string.lbl_last_sleep), null, null, 6, null);
            e.f78082a.getClass();
            gl.c cVar = gl.c.f77766a;
            cVar.getClass();
            j82.f fVarX = j82.e.x(fVar, gl.c.a(o0VarE).c());
            j82.f fVar2 = new j82.f(gl1.y.Q(o0VarE, R.string.lbl_internal_rhythm), null, null, 6, null);
            cVar.getClass();
            j82.f fVarX2 = j82.e.x(fVar2, gl.c.a(o0VarE).j());
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_midpoint);
            cVar.getClass();
            arrayList.addAll(x.k(fVarX, fVarX2, new j82.f(strQ, new j82.g.m(gl.c.a(o0VarE).f(), null), null, 4, null)));
            if (z14) {
                o0VarE.C(-1311024665);
                String strQ2 = gl1.y.Q(o0VarE, R.string.lbl_target_range);
                cVar.getClass();
                arrayList.add(new j82.f(strQ2, new j82.g.p(gl.c.a(o0VarE).f(), null), null, 4, null));
                o0VarE.g0(false);
            } else {
                o0VarE.C(-1310762312);
                o0VarE.g0(false);
            }
            o0VarE.g0(false);
            i53.c cVarE = i53.a.e(arrayList);
            r.a aVar = r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j82.e.h(cVarE, c2.l.C(aVar, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), null, o0VarE, 0, 4);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.i(z14, i14, 27);
        }
    }

    public static final float d(u uVar) {
        return (uVar.f16216a.getMinute() / 60.0f) + uVar.f16216a.getHour();
    }

    public static final float e(float f14, float f15, int i14) {
        float f16 = f14 - i14;
        if (f16 < 0.0f) {
            f16 += 24;
        }
        return f16 * f15;
    }
}
