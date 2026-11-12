package com.xiaomi.ai.domain.mobileapp.util;

import defpackage.jlo;
import defpackage.y4f;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.tuple.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class NumberConverter {
    private static final DecimalFormat decimalFormat;
    private static final Map<Character, Integer> zhDigitToArabic;

    static {
        HashMap map = new HashMap();
        zhDigitToArabic = map;
        decimalFormat = new DecimalFormat("#.###");
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

    public static boolean isNumStart(char c) {
        return zhDigitToArabic.containsKey(Character.valueOf(c));
    }

    public static Pair<String, List<Integer>> normZhDigitsToArabic(String str) {
        ArrayList arrayList = new ArrayList();
        if (jlo.b(str)) {
            return Pair.of(str, arrayList);
        }
        StringBuilder sb = new StringBuilder();
        int iIntValue = 0;
        while (iIntValue < str.length()) {
            Pair<Double, Integer> numSupportZhDigits = parseNumSupportZhDigits(str.substring(iIntValue));
            if (numSupportZhDigits.getValue().intValue() == 0) {
                sb.append(str.charAt(iIntValue));
                arrayList.add(Integer.valueOf(iIntValue));
                iIntValue++;
            } else {
                int i = 0;
                for (int i2 = iIntValue; i2 < numSupportZhDigits.getValue().intValue() + iIntValue && (str.charAt(i2) == 38646 || str.charAt(i2) == '0'); i2++) {
                    i++;
                }
                String str2 = decimalFormat.format(numSupportZhDigits.getKey());
                for (int i3 = 0; i3 < str2.length() && str2.charAt(i3) == '0'; i3++) {
                    i--;
                }
                for (int i4 = 0; i4 < i; i4++) {
                    sb.append('0');
                    arrayList.add(Integer.valueOf(iIntValue));
                }
                sb.append(str2);
                for (int i5 = 0; i5 < str2.length(); i5++) {
                    arrayList.add(Integer.valueOf(iIntValue));
                }
                iIntValue += numSupportZhDigits.getValue().intValue();
            }
        }
        return Pair.of(sb.toString(), arrayList);
    }

    public static int normalizeDigit(char c) {
        return ((Integer) y4f.a(zhDigitToArabic, Character.valueOf(c), 0)).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f8  */
    public static Pair<Double, Integer> parseNumSupportZhDigits(String str) {
        double d;
        double d2;
        if (jlo.b(str) || str.equals("零点")) {
            return Pair.of(Double.valueOf(0.0d), 0);
        }
        int iIntValue = 1;
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
                    int iIntValue2 = i3 < str.length() ? ((Integer) y4f.a(zhDigitToArabic, Character.valueOf(str.charAt(i3)), -1)).intValue() : -1;
                    if (iIntValue2 < 0 || iIntValue2 > 9) {
                        d = 0.0d;
                        d5 = 1.0d;
                        if (iIntValue >= 10) {
                            iIntValue /= 10;
                        }
                        if (d5 > 1.0d) {
                            iIntValue = 1;
                        }
                        return Pair.of(Double.valueOf(d3 + ((d * ((double) iIntValue)) / d5) + d6), Integer.valueOf(i2));
                    }
                    i2++;
                    d4 = 0.0d;
                    d5 = 1.0d;
                    z = true;
                } else {
                    iIntValue = ((Integer) y4f.a(zhDigitToArabic, chValueOf, -1)).intValue();
                    if (!((iIntValue == 100000000 || iIntValue == 10000 || iIntValue == 1000 || iIntValue == 100) & (i == 0))) {
                        if (iIntValue == 100000000) {
                            d6 = (d6 * 1.0E8d) + ((d3 + (d4 / d5)) * ((double) iIntValue));
                            d2 = 0.0d;
                            d3 = 0.0d;
                        } else {
                            if (iIntValue == 10000) {
                                d3 = (d3 + (d4 / d5)) * ((double) iIntValue);
                                d2 = 0.0d;
                            } else if (iIntValue >= 10) {
                                if (d4 == 0.0d) {
                                    d4 = 1.0d;
                                }
                                d3 += ((double) iIntValue) * d4;
                                iIntValue = iIntValue;
                                d2 = 0.0d;
                            } else if (iIntValue != -1) {
                                if (iIntValue == 0) {
                                    iIntValue = 1;
                                }
                                double d7 = ((double) iIntValue) + (d4 * 10.0d);
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
            if (iIntValue >= 10) {
                iIntValue /= 10;
            }
            if (d5 > 1.0d) {
                iIntValue = 1;
            }
            return Pair.of(Double.valueOf(d3 + ((d * ((double) iIntValue)) / d5) + d6), Integer.valueOf(i2));
        }
    }
}
