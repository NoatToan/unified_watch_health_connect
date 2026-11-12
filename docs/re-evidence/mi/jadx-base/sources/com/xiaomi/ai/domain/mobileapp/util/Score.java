package com.xiaomi.ai.domain.mobileapp.util;

import defpackage.mlo;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Score {
    public static double calMaxCharSimilarity(String str, List<String> list) {
        Iterator<String> it = list.iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            dMax = Math.max(levenshteinScore(str, it.next()), dMax);
        }
        return dMax;
    }

    public static double calMaxJaccardScore(List<List<String>> list, List<List<String>> list2) {
        double dMax = 0.0d;
        for (List<String> list3 : list2) {
            Iterator<List<String>> it = list.iterator();
            while (it.hasNext()) {
                dMax = Math.max(dMax, jaccardScore(it.next(), list3));
            }
        }
        return dMax;
    }

    public static double calMaxLevenshteinScore(List<String> list, List<String> list2) {
        Iterator<String> it = list.iterator();
        double dMax = 0.0d;
        while (it.hasNext()) {
            dMax = Math.max(dMax, calMaxCharSimilarity(it.next(), list2));
        }
        return dMax;
    }

    public static double jaccardScore(List<String> list, List<String> list2) {
        HashSet hashSet = new HashSet(list);
        HashSet hashSet2 = new HashSet(list);
        hashSet.addAll(list2);
        hashSet2.retainAll(list2);
        if (hashSet2.size() == 0) {
            return 0.0d;
        }
        return (((double) hashSet2.size()) * 1.0d) / ((double) hashSet.size());
    }

    public static double levenshteinScore(String str, String str2) {
        return 1.0d - ((((double) mlo.b(str, str2)) * 1.0d) / ((double) Math.max(1, Math.max(str.length(), str2.length()))));
    }

    public static void main(String[] strArr) {
        PrintStream printStream = System.out;
        printStream.println("query1:静音静音\tquery2:镜音铃");
        printStream.print("jaccardScore:");
        printStream.println(calMaxJaccardScore(Features.getQueryPinyinsList("静音静音"), Features.getQueryPinyinsList("镜音铃")));
        printStream.println();
        printStream.print("calMaxCharSimilarity:");
        String str = Features.getQueryPinyins("静音静音").get(0);
        List<String> queryPinyins = Features.getQueryPinyins("镜音铃");
        printStream.println(calMaxCharSimilarity(str, queryPinyins));
        printStream.println();
        printStream.print("calMaxPinyinSimilarScore:");
        printStream.println(calMaxLevenshteinScore(Features.getQueryPinyins("静音静音"), queryPinyins));
    }
}
