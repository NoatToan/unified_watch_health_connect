package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.nlp.contact.common.a;
import defpackage.nip;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Similarity {
    public static double calCosSim(String str, String str2) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return 0.0d;
        }
        if (str.equals(str2)) {
            return 1.0d;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet<Character> hashSet = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            hashSet.add(Character.valueOf(cCharAt));
            if (map.containsKey(Character.valueOf(cCharAt))) {
                map.put(Character.valueOf(cCharAt), Integer.valueOf(((Integer) map.get(Character.valueOf(cCharAt))).intValue() + 1));
            } else {
                map.put(Character.valueOf(cCharAt), 1);
            }
        }
        for (int i2 = 0; i2 < str2.length(); i2++) {
            char cCharAt2 = str2.charAt(i2);
            hashSet.add(Character.valueOf(cCharAt2));
            if (map2.containsKey(Character.valueOf(cCharAt2))) {
                map2.put(Character.valueOf(cCharAt2), Integer.valueOf(((Integer) map2.get(Character.valueOf(cCharAt2))).intValue() + 1));
            } else {
                map2.put(Character.valueOf(cCharAt2), 1);
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (Character ch : hashSet) {
            int iIntValue = map.containsKey(ch) ? ((Integer) map.get(ch)).intValue() : 0;
            int iIntValue2 = map2.containsKey(ch) ? ((Integer) map2.get(ch)).intValue() : 0;
            i3 += iIntValue * iIntValue2;
            i4 += iIntValue * iIntValue;
            i5 += iIntValue2 * iIntValue2;
        }
        return (((double) i3) * 1.0d) / Math.sqrt(i4 * i5);
    }

    public static double calLevenshteinSim(String str, String str2, int i) {
        if (str == null || str2 == null || str.isEmpty() || str2.isEmpty()) {
            return 0.0d;
        }
        if (str.equals(str2)) {
            return 1.0d;
        }
        int length = str.length();
        int length2 = str2.length();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
        for (int i2 = 0; i2 <= length; i2++) {
            iArr[i2][0] = i2;
        }
        for (int i3 = 0; i3 <= length2; i3++) {
            iArr[0][i3] = i3;
        }
        for (int i4 = 1; i4 <= length; i4++) {
            for (int i5 = 1; i5 <= length2; i5++) {
                int i6 = i4 - 1;
                int i7 = i5 - 1;
                iArr[i4][i5] = Math.min(iArr[i6][i7] + (str.charAt(i6) == str2.charAt(i7) ? 0 : 1), Math.min(iArr[i6][i5] + 1, iArr[i4][i7] + 1));
            }
        }
        int i8 = iArr[length][length2];
        if (i8 <= i) {
            return 1.0d;
        }
        return 1.0d - ((((double) i8) * 1.0d) / ((double) Math.max(length, length2)));
    }

    public static double calTokenCosSim(String str, String str2) {
        List<String> listC = nip.b().c(str);
        List<String> listC2 = nip.b().c(str2);
        PrintStream printStream = System.out;
        printStream.println("list1 " + listC);
        printStream.println("list2 " + listC2);
        if (listC == null || listC2 == null || listC.isEmpty() || listC2.isEmpty()) {
            return 0.0d;
        }
        if (isTokenListEqual(listC, listC2)) {
            return 1.0d;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet<String> hashSet = new HashSet();
        for (int i = 0; i < listC.size(); i++) {
            String strC = a.b().f(String.valueOf(listC.get(i).toLowerCase()), false).get(0).c();
            hashSet.add(strC);
            if (map.containsKey(strC)) {
                map.put(strC, Integer.valueOf(((Integer) map.get(strC)).intValue() + 1));
            } else {
                map.put(strC, 1);
            }
        }
        for (int i2 = 0; i2 < listC2.size(); i2++) {
            String strC2 = a.b().f(String.valueOf(listC2.get(i2).toLowerCase()), false).get(0).c();
            hashSet.add(strC2);
            if (map2.containsKey(strC2)) {
                map2.put(strC2, Integer.valueOf(((Integer) map2.get(strC2)).intValue() + 1));
            } else {
                map2.put(strC2, 1);
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (String str3 : hashSet) {
            int iIntValue = map.containsKey(str3) ? ((Integer) map.get(str3)).intValue() : 0;
            int iIntValue2 = map2.containsKey(str3) ? ((Integer) map2.get(str3)).intValue() : 0;
            i3 += iIntValue * iIntValue2;
            i4 += iIntValue * iIntValue;
            i5 += iIntValue2 * iIntValue2;
        }
        return (((double) i3) * 1.0d) / Math.sqrt(i4 * i5);
    }

    private static boolean isListEqual(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if ((list == null && list2 != null) || ((list != null && list2 == null) || list.size() != list2.size())) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isTokenListEqual(List<String> list, List<String> list2) {
        if ((list == null && list2 != null) || ((list != null && list2 == null) || list.size() != list2.size())) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!a.b().f(String.valueOf(list.get(i)), false).get(0).c().equals(a.b().f(String.valueOf(list2.get(i)), false).get(0).c())) {
                return false;
            }
        }
        return true;
    }

    public static double calLevenshteinSim(List<String> list, List<String> list2) {
        if (list == null || list2 == null || list.isEmpty() || list2.isEmpty()) {
            return 0.0d;
        }
        if (isListEqual(list, list2)) {
            return 1.0d;
        }
        int size = list.size();
        int size2 = list2.size();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, size + 1, size2 + 1);
        for (int i = 0; i <= size; i++) {
            iArr[i][0] = i;
        }
        for (int i2 = 0; i2 <= size2; i2++) {
            iArr[0][i2] = i2;
        }
        for (int i3 = 1; i3 <= size; i3++) {
            for (int i4 = 1; i4 <= size2; i4++) {
                int i5 = i3 - 1;
                int i6 = i4 - 1;
                iArr[i3][i4] = Math.min(iArr[i5][i6] + (!list.get(i5).equals(list2.get(i6)) ? 1 : 0), Math.min(iArr[i5][i4] + 1, iArr[i3][i6] + 1));
            }
        }
        return 1.0d - ((((double) iArr[size][size2]) * 1.0d) / ((double) Math.max(size, size2)));
    }

    public static double calCosSim(List<String> list, List<String> list2) {
        if (list == null || list2 == null || list.isEmpty() || list2.isEmpty()) {
            return 0.0d;
        }
        if (isListEqual(list, list2)) {
            return 1.0d;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet<String> hashSet = new HashSet();
        for (int i = 0; i < list.size(); i++) {
            String lowerCase = list.get(i).toLowerCase();
            hashSet.add(lowerCase);
            if (map.containsKey(lowerCase)) {
                map.put(lowerCase, Integer.valueOf(((Integer) map.get(lowerCase)).intValue() + 1));
            } else {
                map.put(lowerCase, 1);
            }
        }
        for (int i2 = 0; i2 < list2.size(); i2++) {
            String lowerCase2 = list2.get(i2).toLowerCase();
            hashSet.add(lowerCase2);
            if (map2.containsKey(lowerCase2)) {
                map2.put(lowerCase2, Integer.valueOf(((Integer) map2.get(lowerCase2)).intValue() + 1));
            } else {
                map2.put(lowerCase2, 1);
            }
        }
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (String str : hashSet) {
            int iIntValue = map.containsKey(str) ? ((Integer) map.get(str)).intValue() : 0;
            int iIntValue2 = map2.containsKey(str) ? ((Integer) map2.get(str)).intValue() : 0;
            i3 += iIntValue * iIntValue2;
            i4 += iIntValue * iIntValue;
            i5 += iIntValue2 * iIntValue2;
        }
        return (((double) i3) * 1.0d) / Math.sqrt(i4 * i5);
    }
}
