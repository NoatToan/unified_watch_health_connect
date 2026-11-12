package com.xiaomi.ai.domain.phonecall.provider;

import com.xiaomi.ai.nlp.contact.common.ZhCharPinyinUtils;
import com.xiaomi.ai.nlp.contact.common.a;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class FeatureExtractor {
    private static FeatureExtractor featureExtractor = new FeatureExtractor();

    private String addDelimiter(String str, String str2) {
        return str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2;
    }

    private String extractPinyinStartPair(a.C0349a c0349a, a.C0349a c0349a2, String str, String str2) {
        return addDelimiter(addDelimiter(str2, str), addDelimiter(StatConstants.PARAM_START, addDelimiter(getStartArray(c0349a).get(Integer.parseInt(str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)[0]) - 1), getStartArray(c0349a2).get(Integer.parseInt(str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)[1]) - 1))));
    }

    private String extractPinyinTailPair(a.C0349a c0349a, a.C0349a c0349a2, String str, String str2) {
        return addDelimiter(addDelimiter(str2, str), addDelimiter("tail", addDelimiter(getTailArray(c0349a).get(Integer.parseInt(str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)[0]) - 1), getTailArray(c0349a2).get(Integer.parseInt(str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)[1]) - 1))));
    }

    public static List<String> genFeaturesByFile(String str) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        ArrayList arrayList = new ArrayList();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return arrayList;
            }
            String[] strArrSplit = line.split("\t");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            String str4 = strArrSplit[2];
            String str5 = strArrSplit[3];
            Iterator<String> it = genFeaturesByHanzi(str3, str4, false).iterator();
            while (it.hasNext()) {
                arrayList.add(String.format("%s %s #%s", str2, it.next(), str5));
            }
        }
    }

    public static List<String> genFeaturesByHanzi(String str, String str2, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (a.C0349a c0349a : a.b().g(str, false, z)) {
            Iterator<a.C0349a> it = a.b().g(str2, false, z).iterator();
            while (it.hasNext()) {
                List<String> listGenFeaturesList = featureExtractor.genFeaturesList(c0349a, it.next());
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < listGenFeaturesList.size(); i++) {
                    sb.append(String.format("%s:1", listGenFeaturesList.get(i)));
                    if (i != listGenFeaturesList.size() - 1) {
                        sb.append(' ');
                    }
                }
                arrayList.add(sb.toString());
            }
        }
        return arrayList;
    }

    private List<String> genFeaturesList(a.C0349a c0349a, a.C0349a c0349a2) {
        if (pinyinResultOrder(c0349a, c0349a2) > 0) {
            c0349a2 = c0349a;
            c0349a = c0349a2;
        }
        String str = c0349a.f().size() + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + c0349a2.f().size();
        ArrayList arrayList = new ArrayList();
        for (String str2 : getCharIdxPair(str)) {
            String strExtractPinyinStartPair = extractPinyinStartPair(c0349a, c0349a2, str2, str);
            String strExtractPinyinTailPair = extractPinyinTailPair(c0349a, c0349a2, str2, str);
            arrayList.add(strExtractPinyinStartPair);
            arrayList.add(strExtractPinyinTailPair);
        }
        return arrayList;
    }

    private List<String> getCharIdxPair(String str) {
        int i = Integer.parseInt(str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)[0]);
        int i2 = Integer.parseInt(str.split(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR)[1]);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < (i2 - i) + 1; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                arrayList.add(String.valueOf(i4 + 1) + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + String.valueOf(i3 + i4 + 1));
            }
        }
        return arrayList;
    }

    public static FeatureExtractor getInstance() {
        return featureExtractor;
    }

    private List<String> getStartArray(a.C0349a c0349a) {
        ArrayList arrayList = new ArrayList();
        Iterator<ZhCharPinyinUtils.a> it = c0349a.e().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f11045b);
        }
        return arrayList;
    }

    private List<String> getTailArray(a.C0349a c0349a) {
        ArrayList arrayList = new ArrayList();
        Iterator<ZhCharPinyinUtils.a> it = c0349a.e().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c);
        }
        return arrayList;
    }

    public static int pinyinResultOrder(a.C0349a c0349a, a.C0349a c0349a2) {
        List<String> listF = c0349a.f();
        List<String> listF2 = c0349a2.f();
        if (listF.size() != listF2.size()) {
            return listF.size() > listF2.size() ? 1 : -1;
        }
        return c0349a.c().compareTo(c0349a2.c());
    }

    private Map<String, Double> translateList2Map(List<String> list) {
        HashMap map = new HashMap();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            map.put(it.next(), Double.valueOf(1.0d));
        }
        return map;
    }

    public Map<String, Double> genFeatures(a.C0349a c0349a, a.C0349a c0349a2) {
        return translateList2Map(genFeaturesList(c0349a, c0349a2));
    }
}
