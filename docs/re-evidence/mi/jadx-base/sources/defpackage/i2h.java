package defpackage;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class i2h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<Character, Integer> f20701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<Character> f20702b;
    public static final DecimalFormat c;
    public static Pattern d;
    public static Map<String, String> e;

    static {
        HashMap map = new HashMap();
        f20701a = map;
        HashSet hashSet = new HashSet();
        f20702b = hashSet;
        c = new DecimalFormat("#.##########");
        d = Pattern.compile("千焦|千瓦时|千瓦|千克|百帕|千帕|兆帕|千米|(?<=[一二三四五六七八九十0123456789])两");
        map.put((char) 38646, 0);
        map.put((char) 19968, 1);
        map.put((char) 24186, 1);
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
        map.put((char) 20457, 2);
        map.put((char) 20200, 3);
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
        hashSet.add((char) 22777);
        hashSet.add((char) 36144);
        hashSet.add((char) 21441);
        hashSet.add((char) 32902);
        hashSet.add((char) 20237);
        hashSet.add((char) 38470);
        hashSet.add((char) 26578);
        hashSet.add((char) 25420);
        hashSet.add((char) 29590);
        hashSet.add((char) 25342);
        hashSet.add((char) 20336);
        hashSet.add((char) 20191);
        hashSet.add((char) 33836);
        hashSet.add((char) 20740);
        HashMap map2 = new HashMap();
        e = map2;
        map2.put("千焦", "\u0001\u0001");
        e.put("千瓦", "\u0002\u0002");
        e.put("千瓦时", "\u0003\u0003\u0003");
        e.put("千米", "\b\b");
        e.put("千克", "\u0004\u0004");
        e.put("百帕", "\u0005\u0005");
        e.put("千帕", "\u0006\u0006");
        e.put("兆帕", "\u0007\u0007");
        e.put("两", "\t");
    }

    public static boolean a(char c2) {
        return f20701a.containsKey(Character.valueOf(c2));
    }

    public static String b(String str) {
        return c(str, true);
    }

    public static String c(String str, boolean z) {
        String strH = h(str);
        if (jlo.b(strH)) {
            return strH;
        }
        StringBuilder sb = new StringBuilder();
        int iIntValue = 0;
        while (iIntValue < strH.length()) {
            ljh<Double, Integer> ljhVarF = f(strH.substring(iIntValue), z);
            if (ljhVarF.b().intValue() == 0) {
                sb.append(strH.charAt(iIntValue));
                iIntValue++;
            } else {
                int i = 0;
                for (int i2 = iIntValue; i2 < ljhVarF.b().intValue() + iIntValue && (strH.charAt(i2) == 38646 || strH.charAt(i2) == '0'); i2++) {
                    i++;
                }
                String str2 = c.format(ljhVarF.a());
                for (int i3 = 0; i3 < str2.length() && str2.charAt(i3) == '0'; i3++) {
                    i--;
                }
                for (int i4 = 0; i4 < i; i4++) {
                    sb.append('0');
                }
                sb.append(str2);
                iIntValue += ljhVarF.b().intValue();
            }
        }
        return g(sb.toString());
    }

    public static int d(char c2, boolean z) {
        if (z || !f20702b.contains(Character.valueOf(c2))) {
            return ((Integer) y4f.a(f20701a, Character.valueOf(c2), -1)).intValue();
        }
        return -1;
    }

    public static ljh<Double, Integer> e(String str) {
        return f(str, true);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d9  */
    public static ljh<Double, Integer> f(String str, boolean z) {
        double d2;
        if (jlo.b(str) || str.equals("零点")) {
            return new ljh<>(Double.valueOf(0.0d), 0);
        }
        int iD = 1;
        int i = 0;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i2 = 0;
        double d5 = 1.0d;
        double d6 = 0.0d;
        boolean z2 = false;
        while (true) {
            if (i < str.length()) {
                char cCharAt = str.charAt(i);
                if ((cCharAt == 28857 || cCharAt == '.') && i > 0) {
                    d3 += d4;
                    int i3 = i + 1;
                    int iD2 = i3 < str.length() ? d(str.charAt(i3), z) : -1;
                    if (iD2 < 0 || iD2 > 9) {
                        d2 = 0.0d;
                        d5 = 1.0d;
                        if (iD >= 10) {
                            iD /= 10;
                        }
                        if (d5 > 1.0d) {
                            iD = 1;
                        }
                        return new ljh<>(Double.valueOf(d3 + ((d2 * ((double) iD)) / d5) + d6), Integer.valueOf(i2));
                    }
                    i2++;
                    d4 = 0.0d;
                    d5 = 1.0d;
                    z2 = true;
                } else {
                    iD = d(cCharAt, z);
                    if (!((iD == 100000000 || iD == 10000 || iD == 1000 || iD == 100) & (i == 0))) {
                        if (iD == 100000000) {
                            d6 = (d6 * 1.0E8d) + ((d3 + (d4 / d5)) * ((double) iD));
                            d3 = 0.0d;
                        } else {
                            if (iD == 10000) {
                                d3 = (d3 + (d4 / d5)) * ((double) iD);
                            } else if (iD >= 10) {
                                if (!z2) {
                                    if (d4 == 0.0d) {
                                        d4 = 1.0d;
                                    }
                                    d3 += ((double) iD) * d4;
                                    iD = iD;
                                    d4 = 0.0d;
                                }
                            } else if (iD != -1) {
                                if (iD == 0) {
                                    iD = 1;
                                }
                                d4 = (d4 * 10.0d) + ((double) iD);
                                if (z2) {
                                    d5 *= 10.0d;
                                }
                            }
                            i2++;
                        }
                        d4 = 0.0d;
                        d5 = 1.0d;
                        z2 = false;
                        i2++;
                    }
                }
                i++;
            }
            d2 = d4;
            if (iD >= 10) {
                iD /= 10;
            }
            if (d5 > 1.0d) {
                iD = 1;
            }
            return new ljh<>(Double.valueOf(d3 + ((d2 * ((double) iD)) / d5) + d6), Integer.valueOf(i2));
        }
    }

    public static String g(String str) {
        return str.replaceAll("\u0001\u0001", "千焦").replaceAll("\u0002\u0002", "千瓦").replaceAll("\u0003\u0003\u0003", "千瓦时").replaceAll("\b\b", "千米").replaceAll("\u0004\u0004", "千克").replaceAll("\u0005\u0005", "百帕").replaceAll("\u0006\u0006", "千帕").replaceAll("\u0007\u0007", "兆帕").replaceAll("\t", "两");
    }

    public static String h(String str) {
        if (str == null) {
            return str;
        }
        Matcher matcher = d.matcher(str);
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (matcher.find()) {
            int iStart = matcher.start();
            int iEnd = matcher.end();
            sb.append((CharSequence) str, i, iStart);
            String strSubstring = str.substring(iStart, iEnd);
            if (e.containsKey(strSubstring)) {
                sb.append(e.get(strSubstring));
            } else {
                sb.append(strSubstring);
            }
            i = iEnd;
        }
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }
}
