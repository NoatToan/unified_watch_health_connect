package defpackage;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class klo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Character, Integer> f23968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DecimalFormat f23969b;

    static {
        HashMap map = new HashMap();
        f23968a = map;
        f23969b = new DecimalFormat("#.###");
        map.put((char) 38646, 0);
        map.put((char) 19968, 1);
        map.put((char) 20108, 2);
        map.put((char) 19977, 3);
        map.put((char) 22235, 4);
        map.put((char) 20116, 5);
        map.put((char) 20845, 6);
        map.put((char) 19971, 7);
        map.put((char) 20843, 8);
        map.put((char) 20061, 9);
        map.put('0', 0);
        map.put('1', 1);
        map.put('2', 2);
        map.put('3', 3);
        map.put('4', 4);
        map.put('5', 5);
        map.put('6', 6);
        map.put('7', 7);
        map.put('8', 8);
        map.put('9', 9);
        map.put((char) 21313, 10);
        map.put((char) 30334, 100);
        map.put((char) 21315, 1000);
        map.put((char) 19975, 10000);
        map.put((char) 20159, 100000000);
        map.put((char) 20004, 2);
        map.put((char) 12295, 0);
        map.put((char) 22777, 1);
        map.put((char) 36144, 2);
        map.put((char) 21441, 3);
        map.put((char) 32902, 4);
        map.put((char) 20237, 5);
        map.put((char) 38470, 6);
        map.put((char) 26578, 7);
        map.put((char) 25420, 8);
        map.put((char) 29590, 9);
        map.put((char) 25342, 10);
        map.put((char) 20336, 100);
        map.put((char) 20191, 1000);
        map.put((char) 33836, 10000);
        map.put((char) 20740, 100000000);
    }

    public static boolean a(CharSequence charSequence) {
        int length;
        if (charSequence != null && (length = charSequence.length()) != 0) {
            for (int i = 0; i < length; i++) {
                if (!Character.isWhitespace(charSequence.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean b(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean c(String str) {
        return k(str) != null;
    }

    public static boolean d(CharSequence charSequence) {
        return !a(charSequence);
    }

    public static boolean e(CharSequence charSequence) {
        return !b(charSequence);
    }

    public static boolean f(String str) {
        return str == null || str.isEmpty();
    }

    public static String g(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return h(iterable.iterator(), str);
    }

    public static String h(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String i(String str) {
        if (b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int iIntValue = 0;
        while (iIntValue < str.length()) {
            mjh<Double, Integer> mjhVarJ = j(str.substring(iIntValue));
            if (mjhVarJ.c().intValue() == 0) {
                sb.append(str.charAt(iIntValue));
                iIntValue++;
            } else {
                int i = 0;
                for (int i2 = iIntValue; i2 < mjhVarJ.c().intValue() + iIntValue && (str.charAt(i2) == 38646 || str.charAt(i2) == '0'); i2++) {
                    i++;
                }
                String str2 = f23969b.format(mjhVarJ.b());
                for (int i3 = 0; i3 < str2.length() && str2.charAt(i3) == '0'; i3++) {
                    i--;
                }
                for (int i4 = 0; i4 < i; i4++) {
                    sb.append('0');
                }
                sb.append(str2);
                iIntValue += mjhVarJ.c().intValue();
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0107  */
    public static mjh<Double, Integer> j(String str) {
        double d;
        int iIntValue;
        double d2;
        if (b(str) || str.equals("零点")) {
            return mjh.e(Double.valueOf(0.0d), 0);
        }
        int iIntValue2 = 1;
        int i = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        double d5 = 1.0d;
        double d6 = 0.0d;
        boolean z = false;
        while (true) {
            if (i < str.length()) {
                char cCharAt = str.charAt(i);
                Character chValueOf = Character.valueOf(cCharAt);
                if ((cCharAt == 28857 || cCharAt == '.') && i > 0) {
                    d3 += d4;
                    int i3 = i + 1;
                    if (i3 < str.length()) {
                        Map<Character, Integer> map = f23968a;
                        if (map.containsKey(Character.valueOf(str.charAt(i3)))) {
                            iIntValue = map.get(Character.valueOf(str.charAt(i3))).intValue();
                        } else {
                            iIntValue = -1;
                        }
                    } else {
                        iIntValue = -1;
                    }
                    if (iIntValue < 0 || iIntValue > 9) {
                        d = 0.0d;
                        d5 = 1.0d;
                        if (iIntValue2 >= 10) {
                            iIntValue2 /= 10;
                        }
                        if (d5 > 1.0d) {
                            iIntValue2 = 1;
                        }
                        return mjh.e(Double.valueOf(d3 + ((d * ((double) iIntValue2)) / d5) + d6), Integer.valueOf(i2));
                    }
                    i2++;
                    d4 = 0.0d;
                    d5 = 1.0d;
                    z = true;
                } else {
                    Map<Character, Integer> map2 = f23968a;
                    iIntValue2 = map2.containsKey(chValueOf) ? map2.get(chValueOf).intValue() : -1;
                    if (!((iIntValue2 == 100000000 || iIntValue2 == 10000 || iIntValue2 == 1000 || iIntValue2 == 100) & (i == 0))) {
                        if (iIntValue2 == 100000000) {
                            d6 = (d6 * 1.0E8d) + ((d3 + (d4 / d5)) * ((double) iIntValue2));
                            d2 = 0.0d;
                            d3 = 0.0d;
                        } else {
                            if (iIntValue2 == 10000) {
                                d3 = (d3 + (d4 / d5)) * ((double) iIntValue2);
                                d2 = 0.0d;
                            } else if (iIntValue2 >= 10) {
                                if (d4 == 0.0d) {
                                    d4 = 1.0d;
                                }
                                d3 += ((double) iIntValue2) * d4;
                                iIntValue2 = iIntValue2;
                                d2 = 0.0d;
                            } else if (iIntValue2 != -1) {
                                if (iIntValue2 == 0) {
                                    iIntValue2 = 1;
                                }
                                double d7 = ((double) iIntValue2) + (d4 * 10.0d);
                                if (z) {
                                    d5 *= 10.0d;
                                }
                                d2 = d7;
                            }
                            i2++;
                            d4 = d2;
                        }
                        d5 = 1.0d;
                        z = false;
                        i2++;
                        d4 = d2;
                    }
                }
                i++;
            }
            d = d4;
            if (iIntValue2 >= 10) {
                iIntValue2 /= 10;
            }
            if (d5 > 1.0d) {
                iIntValue2 = 1;
            }
            return mjh.e(Double.valueOf(d3 + ((d * ((double) iIntValue2)) / d5) + d6), Integer.valueOf(i2));
        }
    }

    public static Integer k(String str) {
        return l(str, 10);
    }

    public static Integer l(String str, int i) {
        int length;
        if (f(str) || (length = str.length()) == 0) {
            return null;
        }
        int i2 = 0;
        boolean z = str.charAt(0) == '-';
        if (z) {
            if (1 == length) {
                return null;
            }
            i2 = 1;
        }
        return m(str, i2, i, z);
    }

    public static Integer m(String str, int i, int i2, boolean z) {
        int i3;
        int i4 = Integer.MIN_VALUE / i2;
        int length = str.length();
        int i5 = 0;
        while (i < length) {
            int i6 = i + 1;
            int iDigit = Character.digit(str.charAt(i), i2);
            if (iDigit == -1 || i4 > i5 || (i3 = (i5 * i2) - iDigit) > i5) {
                return null;
            }
            i5 = i3;
            i = i6;
        }
        if ((z || (i5 = -i5) >= 0) && i5 <= Integer.MAX_VALUE && i5 >= Integer.MIN_VALUE) {
            return Integer.valueOf(i5);
        }
        return null;
    }

    public static String n(String str) {
        return o(str, false);
    }

    public static String o(String str, boolean z) {
        if (b(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = false;
        for (char c : str.toCharArray()) {
            if (c == '_') {
                z2 = true;
            } else {
                if (z2) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(c);
                }
                z2 = false;
            }
        }
        char cCharAt = sb.charAt(0);
        if (z) {
            sb.deleteCharAt(0);
            sb.insert(0, Character.toUpperCase(cCharAt));
        } else if (Character.isUpperCase(cCharAt)) {
            sb.deleteCharAt(0);
            sb.insert(0, Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static String p(String str) {
        if (b(str)) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
