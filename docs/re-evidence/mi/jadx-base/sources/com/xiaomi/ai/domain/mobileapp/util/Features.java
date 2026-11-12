package com.xiaomi.ai.domain.mobileapp.util;

import com.xiaomi.ai.nlp.contact.common.a;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.mlo;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class Features {
    public static List<String> getBigramPinyin(String str) {
        int i;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < str.length() - 1 && (i = i2 + 1) < str.length()) {
            Iterator<String> it = getPinyins(str.substring(i2, i2 + 2)).iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().replaceAll("[,_]", ""));
            }
            i2 = i;
        }
        return new ArrayList(hashSet);
    }

    private static List<String> getPinyins(String str) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            Character chValueOf = Character.valueOf(cCharAt);
            if ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < '0' || cCharAt > '9')) {
                ArrayList arrayList2 = new ArrayList();
                if (arrayList.size() == 0) {
                    arrayList2.addAll(getWordPinyin(chValueOf.toString()));
                } else {
                    for (String str2 : getWordPinyin(chValueOf.toString())) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((String) it.next()) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2);
                        }
                    }
                }
                arrayList = arrayList2;
            } else if (arrayList.size() == 0) {
                arrayList.add(chValueOf.toString());
            } else {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.set(i2, ((String) arrayList.get(i2)) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + chValueOf);
                }
            }
        }
        return arrayList;
    }

    public static List<String> getQueryPinyins(String str) {
        List<String> pinyins = getPinyins(str);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = pinyins.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().replaceAll("[,_]", ""));
        }
        return arrayList;
    }

    public static List<List<String>> getQueryPinyinsList(String str) {
        List<String> pinyins = getPinyins(str);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = pinyins.iterator();
        while (it.hasNext()) {
            arrayList.add(Arrays.asList(it.next().split("[,_]")));
        }
        return arrayList;
    }

    public static List<String> getUnigramPinyins(String str) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (i < str.length()) {
            int i2 = i + 1;
            hashSet.addAll(getWordPinyin(str.substring(i, i2)));
            i = i2;
        }
        return new ArrayList(hashSet);
    }

    private static List<String> getWordPinyin(String str) {
        ArrayList arrayList = new ArrayList();
        for (a.C0349a c0349a : new ArrayList(a.b().f(str, false))) {
            String[] strArrSplit = c0349a.b().split(",");
            if (strArrSplit.length == 2 && (mlo.a(strArrSplit[0], strArrSplit[1]) || strArrSplit[0].charAt(0) == strArrSplit[1].charAt(0))) {
                arrayList.add(strArrSplit[1]);
            } else {
                arrayList.add(c0349a.b().replaceAll("[,_]", ""));
            }
        }
        return arrayList;
    }

    public static void main(String[] strArr) {
        System.out.println("word:大");
        Iterator<String> it = getWordPinyin("大").iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        PrintStream printStream = System.out;
        printStream.println();
        printStream.println("unigramPinyins of query:美丽会app");
        for (String str : getUnigramPinyins("美丽会app")) {
            System.out.print(str + "\t");
        }
        PrintStream printStream2 = System.out;
        printStream2.println("\n\n");
        printStream2.println("bigramPinyins of query:美丽会app");
        Iterator<String> it2 = getBigramPinyin("美丽会app").iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
        PrintStream printStream3 = System.out;
        printStream3.println();
        printStream3.println("pinyinlists of query:美丽会app");
        Iterator<List<String>> it3 = getQueryPinyinsList("美丽会app").iterator();
        while (it3.hasNext()) {
            for (String str2 : it3.next()) {
                System.out.print(str2 + "\t");
            }
            System.out.println();
        }
        PrintStream printStream4 = System.out;
        printStream4.println();
        printStream4.println("pinyins of query:美丽会app");
        Iterator<String> it4 = getQueryPinyins("美丽会app").iterator();
        while (it4.hasNext()) {
            System.out.println(it4.next());
        }
        System.out.println();
    }
}
