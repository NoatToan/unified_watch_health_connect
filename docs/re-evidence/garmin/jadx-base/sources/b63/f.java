package b63;

import ch.qos.logback.core.CoreConstants;
import kotlinx.datetime.DateTimeFormatException;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lb63/f;", "", "<init>", "()V", "Companion", "a", "Lb63/d;", "Lb63/g;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = h63.e.class)
public abstract class f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public /* synthetic */ f(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    public abstract int a();

    public int b() {
        return (int) (g() / 3600000000000L);
    }

    public int c() {
        return (int) ((g() % 3600000000000L) / 60000000000L);
    }

    public int d() {
        return (int) (g() % ((long) 1000000000));
    }

    public int e() {
        return (int) ((g() % 60000000000L) / ((long) 1000000000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return f() == fVar.f() && a() == fVar.a() && g() == fVar.g();
    }

    public abstract long f();

    public abstract long g();

    public final int hashCode() {
        return Long.hashCode(g()) + ((a() + (Long.hashCode(f()) * 31)) * 31);
    }

    public final String toString() {
        int i14;
        Object objValueOf;
        StringBuilder sb3 = new StringBuilder();
        if (f() > 0 || a() > 0 || g() > 0 || ((f() | g()) == 0 && a() == 0)) {
            i14 = 1;
        } else {
            sb3.append('-');
            i14 = -1;
        }
        sb3.append('P');
        long j8 = 12;
        if (((int) (f() / j8)) != 0) {
            sb3.append(((int) (f() / j8)) * i14);
            sb3.append('Y');
        }
        if (((int) (f() % j8)) != 0) {
            sb3.append(((int) (f() % j8)) * i14);
            sb3.append('M');
        }
        if (a() != 0) {
            sb3.append(a() * i14);
            sb3.append('D');
        }
        String str = "";
        String str2 = "T";
        if (b() != 0) {
            sb3.append("T");
            sb3.append(b() * i14);
            sb3.append('H');
            str2 = "";
        }
        if (c() != 0) {
            sb3.append(str2);
            sb3.append(c() * i14);
            sb3.append('M');
        } else {
            str = str2;
        }
        if ((e() | d()) != 0) {
            sb3.append(str);
            if (e() != 0) {
                objValueOf = Integer.valueOf(e() * i14);
            } else {
                objValueOf = d() * i14 < 0 ? "-0" : "0";
            }
            sb3.append(objValueOf);
            if (d() != 0) {
                sb3.append('.');
                sb3.append(d53.w.M(9, String.valueOf(Math.abs(d()))));
            }
            sb3.append('S');
        }
        if (sb3.length() == 1) {
            sb3.append("0D");
        }
        return sb3.toString();
    }

    /* JADX INFO: renamed from: b63.f$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lb63/f$a;", "", "<init>", "()V", "Li63/c;", "Lb63/f;", "serializer", "()Li63/c;", "kotlinx-datetime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:152:0x0218  */
        /* JADX WARN: Code duplicated, block: B:154:0x0220  */
        /* JADX WARN: Code duplicated, block: B:157:0x0227  */
        /* JADX WARN: Code duplicated, block: B:164:0x023e  */
        /* JADX WARN: Code duplicated, block: B:166:0x026c  */
        /* JADX WARN: Code duplicated, block: B:168:0x0270  */
        /* JADX WARN: Code duplicated, block: B:195:0x02ab A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:206:0x0295 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:207:0x028f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0289 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:209:0x0285 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:222:0x0158 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:80:0x0120  */
        /* JADX WARN: Code duplicated, block: B:92:0x016a  */
        /* JADX WARN: Instruction removed from duplicated block: B:164:0x023e, please report this as an issue */
        public static f a(String str) {
            int i14;
            int i15;
            char cCharAt;
            char c14;
            long jAddExact;
            long j8;
            int i16;
            char upperCase;
            int i17;
            int i18;
            char cCharAt2;
            char c15;
            char cCharAt3;
            char c16;
            int i19;
            str.getClass();
            int i24 = 0;
            int i25 = 0;
            char c17 = 0;
            int iC = 0;
            int iC2 = 0;
            boolean z14 = false;
            int iC3 = 0;
            int iC4 = 0;
            int i26 = 0;
            int iC5 = 0;
            int iC6 = 0;
            int iC7 = 0;
            int i27 = 1;
            while (i25 < str.length()) {
                if (c17 == 0) {
                    int i28 = i25 + 1;
                    if (i28 >= str.length() && (str.charAt(i25) == '+' || str.charAt(i25) == '-')) {
                        b(i25, "Unexpected end of string; 'P' designator is required");
                        throw null;
                    }
                    char cCharAt4 = str.charAt(i25);
                    if (cCharAt4 == '+' || cCharAt4 == '-') {
                        if (str.charAt(i25) == '-') {
                            i27 = -1;
                        }
                        if (str.charAt(i28) != 'P') {
                            b(i28, "Expected 'P', got '" + str.charAt(i28) + CoreConstants.SINGLE_QUOTE_CHAR);
                            throw null;
                        }
                        i25 += 2;
                    } else {
                        if (cCharAt4 != 'P') {
                            b(i25, "Expected '+', '-', 'P', got '" + str.charAt(i25) + CoreConstants.SINGLE_QUOTE_CHAR);
                            throw null;
                        }
                        i25 = i28;
                    }
                    c17 = 1;
                } else {
                    char cCharAt5 = str.charAt(i25);
                    char c18 = '0';
                    if (cCharAt5 == '+' || cCharAt5 == '-') {
                        i14 = str.charAt(i25) == '-' ? i27 * (-1) : i27;
                        i15 = i25 + 1;
                        if (i15 < str.length() && '0' <= (cCharAt = str.charAt(i15))) {
                            c14 = CoreConstants.COLON_CHAR;
                            if (cCharAt >= ':') {
                            }
                            jAddExact = 0;
                            while (true) {
                                if (i15 < str.length()) {
                                    j8 = jAddExact;
                                    break;
                                }
                                cCharAt3 = str.charAt(i15);
                                if (c18 <= cCharAt3 || cCharAt3 >= c14) {
                                    j8 = jAddExact;
                                    break;
                                }
                                c16 = c18;
                                i19 = i25;
                                try {
                                    jAddExact = Math.addExact(Math.multiplyExact(jAddExact, 10L), str.charAt(i15) - '0');
                                    i15++;
                                    i25 = i19;
                                    c18 = c16;
                                    c14 = CoreConstants.COLON_CHAR;
                                } catch (ArithmeticException unused) {
                                    b(i19, "The number is too large");
                                    throw null;
                                }
                            }
                            long j14 = ((long) i14) * j8;
                            i16 = i14;
                            if (i15 != str.length()) {
                                b(i15, "Expected a designator after the numerical value");
                                throw null;
                            }
                            upperCase = Character.toUpperCase(str.charAt(i15));
                            int i29 = i27;
                            int i30 = iC;
                            if (upperCase != ',' || upperCase == '.') {
                                i17 = i15 + 1;
                                if (i17 >= str.length()) {
                                    b(i17, "Expected designator 'S' after " + str.charAt(i15));
                                    throw null;
                                }
                                i15 = i17;
                                while (i15 < str.length() && (c15 = c18) <= (cCharAt2 = str.charAt(i15)) && cCharAt2 < ':') {
                                    i15++;
                                    c18 = c15;
                                }
                                i18 = i15 - i17;
                                if (i18 > 9) {
                                    b(i17, "Only the nanosecond fractions of a second are supported");
                                    throw null;
                                }
                                String str2 = str.substring(i17, i15) + d53.u.u("0", 9 - i18);
                                d53.a.a(10);
                                int i34 = Integer.parseInt(str2, 10) * i16;
                                if (str.charAt(i15) != 'S') {
                                    b(i15, "Expected the 'S' designator after a fraction");
                                    throw null;
                                }
                                if (c17 < '\t' || c17 < 6) {
                                    b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                    throw null;
                                }
                                i26 = i34;
                                iC7 = c(j14, i25, 'S');
                                c17 = '\t';
                            } else {
                                if (upperCase != 'D') {
                                    if (upperCase != 'H') {
                                        if (upperCase != 'M') {
                                            if (upperCase != 'S') {
                                                if (upperCase != 'W') {
                                                    if (upperCase != 'Y') {
                                                        b(i15, "Expected a designator after the numerical value");
                                                        throw null;
                                                    }
                                                    if (c17 >= 2) {
                                                        b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                        throw null;
                                                    }
                                                    c17 = 2;
                                                    iC3 = c(j14, i25, 'Y');
                                                } else {
                                                    if (c17 >= 4) {
                                                        b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                        throw null;
                                                    }
                                                    c17 = 4;
                                                    iC2 = c(j14, i25, 'W');
                                                }
                                            } else {
                                                if (c17 >= '\t' || c17 < 6) {
                                                    b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                    throw null;
                                                }
                                                iC7 = c(j14, i25, 'S');
                                                iC = i30;
                                                c17 = '\t';
                                            }
                                        } else if (c17 >= 6) {
                                            if (c17 >= '\b') {
                                                b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                throw null;
                                            }
                                            c17 = '\b';
                                            iC6 = c(j14, i25, 'M');
                                        } else {
                                            if (c17 >= 3) {
                                                b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                                throw null;
                                            }
                                            c17 = 3;
                                            iC4 = c(j14, i25, 'M');
                                        }
                                    } else {
                                        if (c17 >= 7 || c17 < 6) {
                                            b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                            throw null;
                                        }
                                        c17 = 7;
                                        iC5 = c(j14, i25, 'H');
                                    }
                                } else {
                                    if (c17 >= 5) {
                                        b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                                        throw null;
                                    }
                                    c17 = 5;
                                    iC = c(j14, i25, 'D');
                                }
                                i25 = i15 + 1;
                                z14 = true;
                                i27 = i29;
                            }
                            iC = i30;
                            i25 = i15 + 1;
                            z14 = true;
                            i27 = i29;
                        }
                        b(i15, "A number expected after '" + str.charAt(i15) + CoreConstants.SINGLE_QUOTE_CHAR);
                        throw null;
                    }
                    if (('0' <= cCharAt5 && cCharAt5 < ':') || cCharAt5 != 'T') {
                        i15 = i25;
                        i14 = i27;
                        c14 = CoreConstants.COLON_CHAR;
                        jAddExact = 0;
                        while (true) {
                            if (i15 < str.length()) {
                                j8 = jAddExact;
                                break;
                            }
                            cCharAt3 = str.charAt(i15);
                            if (c18 <= cCharAt3) {
                            }
                            j8 = jAddExact;
                            break;
                            i15++;
                            i25 = i19;
                            c18 = c16;
                            c14 = CoreConstants.COLON_CHAR;
                        }
                        long j15 = ((long) i14) * j8;
                        i16 = i14;
                        if (i15 != str.length()) {
                            b(i15, "Expected a designator after the numerical value");
                            throw null;
                        }
                        upperCase = Character.toUpperCase(str.charAt(i15));
                        int i210 = i27;
                        int i35 = iC;
                        if (upperCase != ',') {
                            i17 = i15 + 1;
                            if (i17 >= str.length()) {
                                b(i17, "Expected designator 'S' after " + str.charAt(i15));
                                throw null;
                            }
                            i15 = i17;
                            while (i15 < str.length()) {
                                i15++;
                                c18 = c15;
                            }
                            i18 = i15 - i17;
                            if (i18 > 9) {
                                b(i17, "Only the nanosecond fractions of a second are supported");
                                throw null;
                            }
                            String str3 = str.substring(i17, i15) + d53.u.u("0", 9 - i18);
                            d53.a.a(10);
                            int i36 = Integer.parseInt(str3, 10) * i16;
                            if (str.charAt(i15) != 'S') {
                                b(i15, "Expected the 'S' designator after a fraction");
                                throw null;
                            }
                            if (c17 < '\t') {
                            }
                            b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                            throw null;
                        }
                        i17 = i15 + 1;
                        if (i17 >= str.length()) {
                            b(i17, "Expected designator 'S' after " + str.charAt(i15));
                            throw null;
                        }
                        i15 = i17;
                        while (i15 < str.length()) {
                            i15++;
                            c18 = c15;
                        }
                        i18 = i15 - i17;
                        if (i18 > 9) {
                            b(i17, "Only the nanosecond fractions of a second are supported");
                            throw null;
                        }
                        String str4 = str.substring(i17, i15) + d53.u.u("0", 9 - i18);
                        d53.a.a(10);
                        int i37 = Integer.parseInt(str4, 10) * i16;
                        if (str.charAt(i15) != 'S') {
                            b(i15, "Expected the 'S' designator after a fraction");
                            throw null;
                        }
                        if (c17 < '\t') {
                        }
                        b(i15, "Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'");
                        throw null;
                        i25 = i15 + 1;
                        z14 = true;
                        i27 = i210;
                    } else {
                        if (c17 >= 6) {
                            b(i25, "Only one 'T' designator is allowed");
                            throw null;
                        }
                        i25++;
                        i24 = 0;
                        c17 = 6;
                    }
                }
                i24 = 0;
            }
            if (c17 == 0) {
                b(i25, "Unexpected end of input; 'P' designator is required");
                throw null;
            }
            if (c17 == 6) {
                b(i25, "Unexpected end of input; at least one time component is required after 'T'");
                throw null;
            }
            long j16 = ((long) iC) + ((long) (iC2 * 7));
            if (-2147483648L > j16 || j16 > 2147483647L) {
                b(i24, "The total number of days under 'D' and 'W' designators should fit into an Int");
                throw null;
            }
            int i38 = (int) j16;
            if (z14) {
                return h.a(iC3, iC4, i38, iC5, iC6, i26, iC7);
            }
            b(i24, "At least one component is required, but none were found");
            throw null;
        }

        public static final void b(int i14, String str) {
            throw new DateTimeFormatException(sn.a.e(i14, "Parse error at char ", ": ", str));
        }

        public static final int c(long j8, int i14, char c14) {
            if (j8 >= -2147483648L && j8 <= 2147483647L) {
                return (int) j8;
            }
            b(i14, "Value " + j8 + " does not fit into an Int, which is required for component '" + c14 + CoreConstants.SINGLE_QUOTE_CHAR);
            throw null;
        }

        public final i63.c<f> serializer() {
            return h63.e.f82291b;
        }

        private Companion() {
        }
    }

    private f() {
    }
}
