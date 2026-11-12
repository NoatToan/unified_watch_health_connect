package fn1;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.mc;
import km1.a0;
import km1.c0;
import o53.b0;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72234a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.SLEEP_HISTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.ACTIVITY_HISTORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.HRV_STATUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72234a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x017e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x00de  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x012b  */
    /* JADX WARN: Code duplicated, block: B:97:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x013c  */
    public static final void a(String str, String str2, String str3, String str4, mc mcVar, b0 b0Var, boolean z14, z3.e eVar, e23.p pVar, e23.p pVar2, p3.m mVar, int i14, int i15) {
        int i16;
        String str5;
        String str6;
        String str7;
        boolean z15;
        z3.e eVar2;
        e23.p pVar3;
        boolean z16;
        e23.p pVar4;
        p2 p2VarI0;
        e23.p pVar5;
        boolean z17;
        boolean z18;
        Object objQ;
        int i17;
        str.getClass();
        str3.getClass();
        b0Var.getClass();
        o0 o0VarE = mVar.E(928108601);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            str5 = str2;
            i16 |= o0VarE.B(str5) ? 32 : 16;
        } else {
            str5 = str2;
        }
        if ((i14 & 384) == 0) {
            str6 = str3;
            i16 |= o0VarE.B(str6) ? 256 : 128;
        } else {
            str6 = str3;
        }
        if ((i14 & 3072) == 0) {
            str7 = str4;
            i16 |= o0VarE.B(str7) ? 2048 : 1024;
        } else {
            str7 = str4;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.B(mcVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(b0Var) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            z15 = z14;
            i16 |= o0VarE.h(z15) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        } else {
            z15 = z14;
        }
        if ((12582912 & i14) == 0) {
            eVar2 = eVar;
            i16 |= o0VarE.r(eVar2) ? 8388608 : 4194304;
        } else {
            eVar2 = eVar;
        }
        int i18 = i15 & 256;
        if (i18 == 0) {
            if ((100663296 & i14) == 0) {
                pVar3 = pVar;
                i16 |= o0VarE.r(pVar3) ? 67108864 : 33554432;
            }
            if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
                if (o0VarE.r(pVar2)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i16 |= i17;
            }
            if ((i16 & 306783379) != 306783378) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (o0VarE.n(i16 & 1, z16)) {
                if (i18 != 0) {
                    pVar5 = null;
                } else {
                    pVar5 = pVar3;
                }
                x1 x1Var = p3.n.f135158a;
                l72.w wVar = l72.w.f111301a;
                z3.e eVarC = z3.f.c(1034652410, new n(b0Var, mcVar, 0), o0VarE);
                boolean zR = o0VarE.r(b0Var);
                if ((57344 & i16) == 16384) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                z18 = z17 | zR;
                objQ = o0VarE.q();
                if (z18) {
                    objQ = new cn1.t(b0Var, mcVar, 4);
                    o0VarE.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new cn1.t(b0Var, mcVar, 4);
                        o0VarE.K(objQ);
                    }
                }
                wVar.f(str, null, null, eVarC, (e23.a) objQ, mcVar, true, null, z3.f.c(-2099560816, new cv0.h(str5, str6, str7, pVar5, pVar2, z15, eVar2), o0VarE), o0VarE, (i16 & 14) | 806882304 | ((i16 << 3) & 458752), 390);
                pVar4 = pVar5;
            } else {
                o0VarE.e();
                pVar4 = pVar3;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new c12.f(str, str2, str3, str4, mcVar, b0Var, z14, eVar, pVar4, pVar2, i14, i15);
            }
        }
        i16 |= 100663296;
        pVar3 = pVar;
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            if (o0VarE.r(pVar2)) {
                i17 = 536870912;
            } else {
                i17 = 268435456;
            }
            i16 |= i17;
        }
        if ((i16 & 306783379) != 306783378) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (o0VarE.n(i16 & 1, z16)) {
            if (i18 != 0) {
                pVar5 = null;
            } else {
                pVar5 = pVar3;
            }
            x1 x1Var2 = p3.n.f135158a;
            l72.w wVar2 = l72.w.f111301a;
            z3.e eVarC2 = z3.f.c(1034652410, new n(b0Var, mcVar, 0), o0VarE);
            boolean zR2 = o0VarE.r(b0Var);
            if ((57344 & i16) == 16384) {
                z17 = true;
            } else {
                z17 = false;
            }
            z18 = z17 | zR2;
            objQ = o0VarE.q();
            if (z18) {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new cn1.t(b0Var, mcVar, 4);
                    o0VarE.K(objQ);
                }
            } else {
                objQ = new cn1.t(b0Var, mcVar, 4);
                o0VarE.K(objQ);
            }
            wVar2.f(str, null, null, eVarC2, (e23.a) objQ, mcVar, true, null, z3.f.c(-2099560816, new cv0.h(str5, str6, str7, pVar5, pVar2, z15, eVar2), o0VarE), o0VarE, (i16 & 14) | 806882304 | ((i16 << 3) & 458752), 390);
            pVar4 = pVar5;
        } else {
            o0VarE.e();
            pVar4 = pVar3;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c12.f(str, str2, str3, str4, mcVar, b0Var, z14, eVar, pVar4, pVar2, i14, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(c0 c0Var, km1.c cVar, sm1.s sVar, mc mcVar, b0 b0Var, p3.m mVar, int i14) {
        int i15;
        o13.p pVar;
        int i16;
        a0 a0VarV;
        km1.v dailySleep;
        LocalDate localDateS;
        b0Var.getClass();
        o0 o0VarE = mVar.E(1724713005);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.k(c0Var == null ? -1 : c0Var.ordinal()) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= (i14 & 64) == 0 ? o0VarE.B(cVar) : o0VarE.r(cVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(sVar) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.B(mcVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.r(b0Var) ? 16384 : 8192;
        }
        if (o0VarE.n(i15 & 1, (i15 & 9363) != 9362)) {
            x1 x1Var = p3.n.f135158a;
            int i17 = c0Var == c0.ACTIVITY_HISTORY ? 27 : 6;
            DateTime dateTimeAtStartOfDay = (cVar == null || (dailySleep = cVar.getDailySleep()) == null || (localDateS = dailySleep.s()) == null) ? null : localDateS.toDateTimeAtStartOfDay();
            if (dateTimeAtStartOfDay != null) {
                LocalDate localDate = dateTimeAtStartOfDay.toLocalDate();
                LocalDate localDateMinusDays = localDate.minusDays(i17);
                pVar = new o13.p(localDateMinusDays != null ? localDateMinusDays.toDateTimeAtStartOfDay() : null, localDate.toDateTimeAtStartOfDay());
            } else {
                pVar = new o13.p(null, null);
            }
            DateTime dateTime = (DateTime) pVar.f128594a;
            DateTime dateTime2 = (DateTime) pVar.f128595b;
            int i18 = c0Var != null ? a.f72234a[c0Var.ordinal()] : -1;
            if (i18 == 1) {
                o0VarE.C(231827562);
                int i19 = i15 << 3;
                hn1.o.b(cVar != null ? gl.b.v(cVar) : null, dateTime, dateTime2, sVar, mcVar, b0Var, o0VarE, (i19 & 7168) | a0.f105417q | (i19 & 57344) | (i19 & 458752));
                o0VarE.g0(false);
            } else if (i18 == 2) {
                o0VarE.C(232161959);
                int i24 = i15 << 3;
                hn1.g.a(cVar != null ? gl.b.v(cVar) : null, dateTime, dateTime2, sVar, mcVar, b0Var, o0VarE, (i24 & 7168) | a0.f105417q | (i24 & 57344) | (i24 & 458752));
                o0VarE.g0(false);
            } else if (i18 != 3) {
                o0VarE.C(232774643);
                o0VarE.g0(false);
            } else {
                o0VarE.C(232493101);
                if (cVar != null) {
                    a0VarV = gl.b.v(cVar);
                    i16 = 3;
                } else {
                    i16 = 3;
                    a0VarV = null;
                }
                int i25 = i15 << i16;
                hn1.m.b(a0VarV, dateTime, dateTime2, sVar, mcVar, b0Var, o0VarE, (i25 & 7168) | a0.f105417q | (i25 & 57344) | (i25 & 458752));
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.n(c0Var, cVar, sVar, mcVar, b0Var, i14);
        }
    }
}
