package e53;

import com.google.android.exoplayer2.C;
import ds.e0;
import j23.t;
import java.util.concurrent.TimeUnit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63100a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.MICROSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f63100a = iArr;
        }
    }

    public static final long a(long j8, long j14) {
        if (j8 != 4611686018427387903L && j8 != -4611686018427387903L) {
            return (j14 == 4611686018427387903L || j14 == -4611686018427387903L) ? j14 : t.g(j8 + j14, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j14 || j14 >= 4611686018427387903L) && (j14 ^ j8) < 0) {
            return 9223372036854759646L;
        }
        return j8;
    }

    public static final long b(long j8) {
        long j14 = (j8 << 1) + 1;
        c.f63094b.getClass();
        int i14 = d.f63099a;
        return j14;
    }

    public static final long c(long j8) {
        long j14 = j8 << 1;
        c.f63094b.getClass();
        int i14 = d.f63099a;
        return j14;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0171  */
    /* JADX WARN: Code duplicated, block: B:103:0x017d  */
    /* JADX WARN: Code duplicated, block: B:109:0x019a A[LOOP:7: B:108:0x0198->B:109:0x019a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x0220  */
    /* JADX WARN: Code duplicated, block: B:140:0x022a  */
    /* JADX WARN: Code duplicated, block: B:142:0x022e  */
    /* JADX WARN: Code duplicated, block: B:144:0x0232  */
    /* JADX WARN: Code duplicated, block: B:146:0x0236  */
    /* JADX WARN: Code duplicated, block: B:147:0x0238  */
    /* JADX WARN: Code duplicated, block: B:148:0x023b  */
    /* JADX WARN: Code duplicated, block: B:149:0x023e  */
    /* JADX WARN: Code duplicated, block: B:150:0x0241  */
    /* JADX WARN: Code duplicated, block: B:152:0x0245  */
    /* JADX WARN: Code duplicated, block: B:160:0x0258 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:161:0x025a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0266 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:165:0x0268  */
    /* JADX WARN: Code duplicated, block: B:167:0x027b  */
    /* JADX WARN: Code duplicated, block: B:201:0x021c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x028d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0191 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0193 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x007c  */
    /* JADX WARN: Code duplicated, block: B:89:0x012a  */
    /* JADX WARN: Code duplicated, block: B:91:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x015b A[LOOP:5: B:97:0x0159->B:98:0x015b, LOOP_END] */
    public static long d(String str) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j8;
        int i24;
        char cCharAt;
        f fVar;
        long jA;
        int i25;
        int iMin;
        int i26;
        int i27;
        int i28;
        int iMin2;
        int i29;
        int i30;
        int i34;
        double d14;
        long jD;
        char cCharAt2;
        int i35;
        char cCharAt3;
        char cCharAt4;
        char cCharAt5;
        if (str.length() == 0) {
            vb.h.s("The string is empty");
            return 0L;
        }
        char cCharAt6 = str.charAt(0);
        int i36 = 1;
        char c14 = '-';
        char c15 = '+';
        if (cCharAt6 != '+') {
            i15 = cCharAt6 != '-' ? 0 : 1;
            i14 = i15;
        } else {
            i14 = 0;
            i15 = 1;
        }
        if (str.length() <= i15) {
            vb.h.s("No components");
            return 0L;
        }
        if (str.charAt(i15) != 'P') {
            vb.h.s("");
            return 0L;
        }
        int i37 = i15 + 1;
        if (i37 == str.length()) {
            vb.h.s("");
            return 0L;
        }
        int i38 = 0;
        f fVar2 = null;
        long jA2 = 0;
        long j14 = 0;
        while (i37 < str.length()) {
            char cCharAt7 = str.charAt(i37);
            if (cCharAt7 != 'T') {
                m.f63119e.getClass();
                m mVar = m.f63120f;
                int i39 = i36;
                if (mVar.f63122b) {
                    char cCharAt8 = str.charAt(i37);
                    if (cCharAt8 == c15) {
                        i16 = i37 + 1;
                        i17 = i39;
                    } else if (cCharAt8 != c14) {
                        i16 = i37;
                        i17 = i39;
                    } else {
                        i16 = i37 + 1;
                        i17 = -1;
                    }
                } else {
                    i16 = i37;
                    i17 = i39;
                }
                while (i16 < str.length() && str.charAt(i16) == '0') {
                    i16++;
                }
                long j15 = 0;
                while (true) {
                    if (i16 < str.length()) {
                        char cCharAt9 = str.charAt(i16);
                        i18 = i37;
                        if ('0' <= cCharAt9 && cCharAt9 < ':') {
                            int i44 = cCharAt9 - '0';
                            i19 = i14;
                            long j16 = mVar.f63123c;
                            if (j15 > j16 || (j15 == j16 && i44 > mVar.f63124d)) {
                                while (i16 < str.length() && '0' <= (cCharAt5 = str.charAt(i16)) && cCharAt5 < ':') {
                                    i16++;
                                }
                                if (i16 != str.length()) {
                                    if (i16 != i18 + ((cCharAt7 == '+' || cCharAt7 == '-') ? i39 : 0)) {
                                        j8 = mVar.f63121a;
                                    }
                                }
                                vb.h.s("");
                                return 0L;
                            }
                            j15 = (j15 << 3) + (j15 << i39) + ((long) i44);
                            i16++;
                            i14 = i19;
                            i37 = i18;
                        }
                        if (str.charAt(i16) == '.') {
                            i25 = i16 + 1;
                            int i45 = i.f63111a;
                            iMin = Math.min(i16 + 7, str.length());
                            i27 = 0;
                            for (i26 = i25; i26 < iMin; i26++) {
                                cCharAt4 = str.charAt(i26);
                                if ('0' <= cCharAt4 || cCharAt4 >= ':') {
                                    for (i28 = 0; i28 < 6 - (i26 - i25); i28++) {
                                        i27 = (i27 << 1) + (i27 << 3);
                                    }
                                    iMin2 = Math.min(i26 + 9, str.length());
                                    i29 = i26;
                                    i30 = 0;
                                    while (true) {
                                        if (i29 < iMin2) {
                                            i35 = iMin2;
                                            cCharAt3 = str.charAt(i29);
                                            i24 = i19;
                                            if ('0' > cCharAt3 && cCharAt3 < ':') {
                                                i30 = (cCharAt3 - '0') + (i30 << 3) + (i30 << 1);
                                                i29++;
                                                iMin2 = i35;
                                                i19 = i24;
                                            }
                                        } else {
                                            i24 = i19;
                                        }
                                    }
                                    for (i34 = 0; i34 < 9 - (i29 - i26); i34++) {
                                        i30 = (i30 << 1) + (i30 << 3);
                                    }
                                    i16 = i29;
                                    while (i16 < str.length() && '0' <= (cCharAt2 = str.charAt(i16)) && cCharAt2 < ':') {
                                        i16++;
                                    }
                                    if (i16 != i25 || i16 == str.length() || str.charAt(i16) != 'S') {
                                        vb.h.s("");
                                        return 0L;
                                    }
                                    long j17 = (((long) 1000000000) * ((long) i27)) + ((long) i30);
                                    long j18 = i17;
                                    f fVar3 = f.SECONDS;
                                    double d15 = j17;
                                    switch (a.f63100a[fVar3.ordinal()]) {
                                        case 1:
                                            d14 = 1.0E-12d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        case 2:
                                            d14 = 1.0E-15d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        case 3:
                                            d14 = 1.0E-9d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        case 4:
                                            d14 = 1.0E-6d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        case 5:
                                            d14 = 6.0E-5d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        case 6:
                                            d14 = 0.0036d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        case 7:
                                            d14 = 0.0864d;
                                            jD = MathKt.d(d15 * d14);
                                            break;
                                        default:
                                            e0.t(fVar3, "Unknown unit: ");
                                            jD = 0;
                                            break;
                                    }
                                    j14 = jD * j18;
                                } else {
                                    i27 = (cCharAt4 - '0') + (i27 << 3) + (i27 << 1);
                                }
                            }
                            while (i28 < 6 - (i26 - i25)) {
                                i27 = (i27 << 1) + (i27 << 3);
                            }
                            iMin2 = Math.min(i26 + 9, str.length());
                            i29 = i26;
                            i30 = 0;
                            while (true) {
                                if (i29 < iMin2) {
                                    i35 = iMin2;
                                    cCharAt3 = str.charAt(i29);
                                    i24 = i19;
                                    if ('0' > cCharAt3) {
                                    }
                                } else {
                                    i24 = i19;
                                }
                                i30 = (cCharAt3 - '0') + (i30 << 3) + (i30 << 1);
                                i29++;
                                iMin2 = i35;
                                i19 = i24;
                            }
                            while (i34 < 9 - (i29 - i26)) {
                                i30 = (i30 << 1) + (i30 << 3);
                            }
                            i16 = i29;
                            while (i16 < str.length()) {
                                i16++;
                            }
                            if (i16 != i25) {
                            }
                            vb.h.s("");
                            return 0L;
                        }
                        i24 = i19;
                        cCharAt = str.charAt(i16);
                        if (cCharAt != 'D') {
                            fVar = f.DAYS;
                        } else if (cCharAt != 'H') {
                            fVar = f.HOURS;
                        } else if (cCharAt != 'M') {
                            fVar = f.MINUTES;
                        } else if (cCharAt != 'S') {
                            fVar = null;
                        } else {
                            fVar = f.SECONDS;
                        }
                        if (fVar != null) {
                            throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i16));
                        }
                        if (fVar2 == null && fVar2.compareTo(fVar) <= 0) {
                            vb.h.s("Unexpected order of duration components");
                            return 0L;
                        }
                        if (fVar == f.DAYS) {
                            if (i38 == 0) {
                                vb.h.s("");
                                return 0L;
                            }
                            jA2 = h.a(j8, fVar) * ((long) i17);
                        } else {
                            if (i38 != 0) {
                                vb.h.s("");
                                return 0L;
                            }
                            jA = a(jA2, h.a(j8, fVar) * ((long) i17));
                            if (jA != 9223372036854759646L) {
                                vb.h.s("");
                                return 0L;
                            }
                            jA2 = jA;
                        }
                        i37 = i16 + 1;
                        fVar2 = fVar;
                        i36 = i39;
                        i14 = i24;
                        c14 = '-';
                        c15 = '+';
                    } else {
                        i18 = i37;
                    }
                    i19 = i14;
                    if (i16 != str.length()) {
                        if (i16 != i18 + ((cCharAt7 == '+' || cCharAt7 == '-') ? i39 : 0)) {
                            j8 = j15;
                            if (str.charAt(i16) == '.') {
                                i25 = i16 + 1;
                                int i46 = i.f63111a;
                                iMin = Math.min(i16 + 7, str.length());
                                i27 = 0;
                                while (i26 < iMin) {
                                    cCharAt4 = str.charAt(i26);
                                    if ('0' <= cCharAt4) {
                                    }
                                    while (i28 < 6 - (i26 - i25)) {
                                        i27 = (i27 << 1) + (i27 << 3);
                                    }
                                    iMin2 = Math.min(i26 + 9, str.length());
                                    i29 = i26;
                                    i30 = 0;
                                    while (true) {
                                        if (i29 < iMin2) {
                                            i35 = iMin2;
                                            cCharAt3 = str.charAt(i29);
                                            i24 = i19;
                                            if ('0' > cCharAt3) {
                                            }
                                        } else {
                                            i24 = i19;
                                        }
                                        i30 = (cCharAt3 - '0') + (i30 << 3) + (i30 << 1);
                                        i29++;
                                        iMin2 = i35;
                                        i19 = i24;
                                    }
                                    while (i34 < 9 - (i29 - i26)) {
                                        i30 = (i30 << 1) + (i30 << 3);
                                    }
                                    i16 = i29;
                                    while (i16 < str.length()) {
                                        i16++;
                                    }
                                    if (i16 != i25) {
                                    }
                                    vb.h.s("");
                                    return 0L;
                                }
                                while (i28 < 6 - (i26 - i25)) {
                                    i27 = (i27 << 1) + (i27 << 3);
                                }
                                iMin2 = Math.min(i26 + 9, str.length());
                                i29 = i26;
                                i30 = 0;
                                while (true) {
                                    if (i29 < iMin2) {
                                        i35 = iMin2;
                                        cCharAt3 = str.charAt(i29);
                                        i24 = i19;
                                        if ('0' > cCharAt3) {
                                        }
                                    } else {
                                        i24 = i19;
                                    }
                                    i30 = (cCharAt3 - '0') + (i30 << 3) + (i30 << 1);
                                    i29++;
                                    iMin2 = i35;
                                    i19 = i24;
                                }
                                while (i34 < 9 - (i29 - i26)) {
                                    i30 = (i30 << 1) + (i30 << 3);
                                }
                                i16 = i29;
                                while (i16 < str.length()) {
                                    i16++;
                                }
                                if (i16 != i25) {
                                }
                                vb.h.s("");
                                return 0L;
                            }
                            i24 = i19;
                            cCharAt = str.charAt(i16);
                            if (cCharAt != 'D') {
                                fVar = f.DAYS;
                            } else if (cCharAt != 'H') {
                                fVar = f.HOURS;
                            } else if (cCharAt != 'M') {
                                fVar = f.MINUTES;
                            } else if (cCharAt != 'S') {
                                fVar = null;
                            } else {
                                fVar = f.SECONDS;
                            }
                            if (fVar != null) {
                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i16));
                            }
                            if (fVar2 == null) {
                            }
                            if (fVar == f.DAYS) {
                                if (i38 == 0) {
                                    vb.h.s("");
                                    return 0L;
                                }
                                jA2 = h.a(j8, fVar) * ((long) i17);
                            } else {
                                if (i38 != 0) {
                                    vb.h.s("");
                                    return 0L;
                                }
                                jA = a(jA2, h.a(j8, fVar) * ((long) i17));
                                if (jA != 9223372036854759646L) {
                                    vb.h.s("");
                                    return 0L;
                                }
                                jA2 = jA;
                            }
                            i37 = i16 + 1;
                            fVar2 = fVar;
                            i36 = i39;
                            i14 = i24;
                            c14 = '-';
                            c15 = '+';
                        }
                    }
                    vb.h.s("");
                    return 0L;
                }
            }
            if (i38 != 0 || (i37 = i37 + 1) == str.length()) {
                vb.h.s("");
                return 0L;
            }
            i38 = i36;
        }
        int i47 = i14;
        long jH = c.h(f(jA2, f.MILLISECONDS), f(j14, f.NANOSECONDS));
        if (i47 == 0) {
            return jH;
        }
        c.f63094b.getClass();
        return jH == c.f63097e ? jH : c.l(jH);
    }

    public static final long e(int i14, f fVar) {
        fVar.getClass();
        if (fVar.compareTo(f.SECONDS) > 0) {
            return f(i14, fVar);
        }
        long j8 = i14;
        f fVar2 = f.NANOSECONDS;
        fVar2.getClass();
        return c(fVar2.f63109a.convert(j8, fVar.f63109a));
    }

    public static final long f(long j8, f fVar) {
        fVar.getClass();
        f fVar2 = f.NANOSECONDS;
        fVar2.getClass();
        TimeUnit timeUnit = fVar.f63109a;
        TimeUnit timeUnit2 = fVar2.f63109a;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j8 && j8 <= jConvert) {
            return c(timeUnit2.convert(j8, timeUnit));
        }
        f fVar3 = f.MILLISECONDS;
        if (fVar.compareTo(fVar3) < 0) {
            fVar3.getClass();
            return b(t.g(fVar3.f63109a.convert(j8, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j8);
        if (j8 < C.TIME_UNSET) {
            j8 = -9223372036854775807L;
        }
        return b(h.a(Math.abs(j8), fVar) * jSignum);
    }
}
