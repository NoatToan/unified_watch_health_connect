package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes3.dex */
public class hq5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap<String, jq5> f20331a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceArray<jq5> f20332b = new AtomicReferenceArray<>(25);

    public static jq5 a(String str) {
        jq5 jq5VarPutIfAbsent;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Invalid pattern specification");
        }
        ConcurrentHashMap<String, jq5> concurrentHashMap = f20331a;
        jq5 jq5Var = concurrentHashMap.get(str);
        if (jq5Var != null) {
            return jq5Var;
        }
        lq5 lq5Var = new lq5();
        d(lq5Var, str);
        jq5 jq5VarE0 = lq5Var.e0();
        return (concurrentHashMap.size() >= 500 || (jq5VarPutIfAbsent = concurrentHashMap.putIfAbsent(str, jq5VarE0)) == null) ? jq5VarE0 : jq5VarPutIfAbsent;
    }

    public static jq5 b(String str) {
        return a(str);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013 A[RETURN] */
    public static boolean c(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
                case 'M':
                    if (length <= 2) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:135:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:66:0x010c  */
    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x0121  */
    /* JADX WARN: Code duplicated, block: B:73:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0131  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:79:0x0139  */
    /* JADX WARN: Switch 'out' block B:57:0x00cd for B:37:0x005d already processed. Defaulting to fallback option. */
    public static void d(lq5 lq5Var, String str) {
        int i;
        boolean z;
        int length = str.length();
        int[] iArr = new int[1];
        int i2 = 0;
        while (i2 < length) {
            iArr[0] = i2;
            String strE = e(str, iArr);
            int i3 = iArr[0];
            int length2 = strE.length();
            if (length2 == 0) {
                return;
            }
            char cCharAt = strE.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = strE.substring(1);
                if (strSubstring.length() == 1) {
                    lq5Var.x(strSubstring.charAt(0));
                } else {
                    lq5Var.y(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                lq5Var.w(length2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    lq5Var.t(length2, length2);
                } else if (cCharAt == 'a') {
                    lq5Var.u();
                } else if (cCharAt == 'h') {
                    lq5Var.h(length2);
                } else if (cCharAt == 'k') {
                    lq5Var.g(length2);
                } else if (cCharAt == 'm') {
                    lq5Var.A(length2);
                } else if (cCharAt == 's') {
                    lq5Var.F(length2);
                } else if (cCharAt == 'G') {
                    lq5Var.o();
                } else if (cCharAt == 'H') {
                    lq5Var.v(length2);
                } else if (cCharAt == 'Y') {
                    if (length2 != 2) {
                        if (i3 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            z = !c(e(str, iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z = true;
                        }
                        if (cCharAt == 'x') {
                            lq5Var.P(new DateTime().getYear() - 30, z);
                        } else {
                            lq5Var.O(new DateTime().getWeekyear() - 30, z);
                        }
                    } else {
                        i = 9;
                        if (i3 + 1 < length) {
                            iArr[0] = iArr[0] + 1;
                            i = c(e(str, iArr)) ? length2 : 9;
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            lq5Var.U(length2, i);
                        } else if (cCharAt != 'x') {
                            lq5Var.S(length2, i);
                        } else if (cCharAt != 'y') {
                            lq5Var.T(length2, i);
                        }
                    }
                } else if (cCharAt != 'Z') {
                    if (cCharAt == 'd') {
                        lq5Var.i(length2);
                    } else if (cCharAt != 'e') {
                        switch (cCharAt) {
                            case 'C':
                                lq5Var.f(length2, length2);
                                continue;
                            case 'D':
                                lq5Var.m(length2);
                                continue;
                            case 'E':
                                if (length2 < 4) {
                                    lq5Var.k();
                                } else {
                                    lq5Var.l();
                                    continue;
                                }
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'w':
                                        lq5Var.R(length2);
                                        break;
                                    case 'x':
                                    case 'y':
                                        if (length2 != 2) {
                                            i = 9;
                                            if (i3 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                if (c(e(str, iArr))) {
                                                }
                                                iArr[0] = iArr[0] - 1;
                                            }
                                            if (cCharAt != 'Y') {
                                                lq5Var.U(length2, i);
                                            } else if (cCharAt != 'x') {
                                                lq5Var.S(length2, i);
                                            } else if (cCharAt != 'y') {
                                                lq5Var.T(length2, i);
                                            }
                                        } else {
                                            if (i3 + 1 < length) {
                                                iArr[0] = iArr[0] + 1;
                                                z = !c(e(str, iArr));
                                                iArr[0] = iArr[0] - 1;
                                            } else {
                                                z = true;
                                            }
                                            if (cCharAt == 'x') {
                                                lq5Var.O(new DateTime().getWeekyear() - 30, z);
                                            } else {
                                                lq5Var.P(new DateTime().getYear() - 30, z);
                                            }
                                        }
                                        break;
                                    case 'z':
                                        if (length2 < 4) {
                                            lq5Var.N(null);
                                        } else {
                                            lq5Var.K();
                                            continue;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Illegal pattern component: " + strE);
                                }
                                break;
                        }
                    } else {
                        lq5Var.j(length2);
                    }
                } else if (length2 == 1) {
                    lq5Var.L(null, "Z", false, 2, 2);
                } else if (length2 == 2) {
                    lq5Var.L(null, "Z", true, 2, 2);
                } else {
                    lq5Var.J();
                }
            } else if (length2 < 3) {
                lq5Var.B(length2);
            } else if (length2 >= 4) {
                lq5Var.D();
            } else {
                lq5Var.C();
            }
            i2 = i3 + 1;
        }
    }

    public static String e(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= length || str.charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append(cCharAt2);
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= length || str.charAt(i3) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }
}
