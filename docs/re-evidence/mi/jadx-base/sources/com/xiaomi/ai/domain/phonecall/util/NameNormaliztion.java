package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.aqe;
import defpackage.nip;
import defpackage.qpe;
import defpackage.t08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class NameNormaliztion {
    private static final String RELATIVE_SYNONYM_FILE = "relative-synonym.dat";
    private Map<String, Set<String>> relativeSynonymsMap;
    private static NameNormaliztion instance = new NameNormaliztion();
    private static final qpe LOGGER = aqe.f(NameNormaliztion.class);
    private static final Pattern PURE_ZH_PAT = Pattern.compile("^[一-\u9fff]+$");
    private static final Pattern ZH_PAT = Pattern.compile("[一-\u9fff]+");
    private static final Pattern NAME_CH_PAT = Pattern.compile("[一-\u9fffa-zA-Z]+");
    private static final Pattern BRACKER_PAT_A = Pattern.compile("[(\\[（【『《].+[》』】）\\])]");
    private static final Pattern BRACKER_PAT_B = Pattern.compile("[(\\[（【『《].+");
    private Set<String> relativeSet = new HashSet(Arrays.asList("爸", "妈", "叔", "姨", "伯", "婶", "哥", "弟", "姐", "妹"));
    private Set<String> carrierSet = new HashSet(Arrays.asList("电信", "移动", "联通", "铁通"));
    private Map<String, Integer> surnameMap = new HashMap();

    public class a implements Comparable<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public double f11033b;
        public int c;

        public a(String str, double d, int i) {
            this.f11032a = str;
            this.f11033b = d;
            this.c = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Double.compare(this.f11033b, aVar.f11033b) != 0 ? Double.compare(this.f11033b, aVar.f11033b) : -Integer.compare(this.c, aVar.c);
        }

        public String b() {
            return this.f11032a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private NameNormaliztion() {
        int i;
        try {
            InputStream resourceAsStream = NameNormaliztion.class.getResourceAsStream("/surname.txt");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.isEmpty()) {
                            String[] strArrSplit = line.split("\t");
                            if (strArrSplit.length == 2) {
                                try {
                                    i = Integer.parseInt(strArrSplit[1]);
                                } catch (NumberFormatException unused) {
                                    i = 100000;
                                }
                                this.surnameMap.put(strArrSplit[0], Integer.valueOf(i));
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                if (resourceAsStream != null) {
                    resourceAsStream.close();
                }
            } catch (Throwable th3) {
                if (resourceAsStream != null) {
                    try {
                        resourceAsStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (IOException e) {
            LOGGER.error("read file %s, exception {}", "/surname.txt", e);
        }
        this.relativeSynonymsMap = new HashMap();
        try {
            InputStream inputStreamA = t08.a(RELATIVE_SYNONYM_FILE);
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStreamA));
                while (true) {
                    try {
                        String line2 = bufferedReader2.readLine();
                        if (line2 == null) {
                            break;
                        }
                        if (!line2.startsWith(PluginPackageConstant.RN_SDK_TIMESTAMP_PREFIX) && !line2.isEmpty()) {
                            String[] strArrSplit2 = line2.split("\\|");
                            if (strArrSplit2.length > 1) {
                                HashSet hashSet = new HashSet(Arrays.asList(strArrSplit2));
                                for (String str : strArrSplit2) {
                                    if (!this.relativeSynonymsMap.containsKey(str)) {
                                        this.relativeSynonymsMap.put(str, hashSet);
                                    }
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    if (inputStreamA != null) {
                        try {
                            inputStreamA.close();
                        } catch (Throwable th7) {
                            th.addSuppressed(th7);
                        }
                    }
                    throw th;
                }
                bufferedReader2.close();
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
            } catch (Throwable th8) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                throw th8;
            }
        } catch (IOException e2) {
            LOGGER.error("read file %s, exception {}", "/surname.txt", e2);
        }
    }

    private String cleanBracketName(String str) {
        Matcher matcher = BRACKER_PAT_A.matcher(str);
        if (matcher.find()) {
            str = str.substring(0, matcher.start()) + " " + str.substring(matcher.end());
        }
        Matcher matcher2 = BRACKER_PAT_B.matcher(str);
        if (matcher2.find()) {
            str = str.substring(0, matcher2.start());
        }
        return str.trim();
    }

    private String getBestField(List<String> list) {
        double dMax;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            double dMax2 = 0.0d;
            double d = PURE_ZH_PAT.matcher(next).matches() ? 0.2d : 0.0d;
            int iMin = 10000;
            double d2 = 0.0d;
            int i = 0;
            double d3 = 0.0d;
            while (i < next.length()) {
                int i2 = i + 1;
                Iterator<String> it2 = it;
                if (this.relativeSet.contains(next.substring(i, i2))) {
                    d3 = 0.3d;
                }
                if (i2 < next.length() && this.carrierSet.contains(next.substring(i, i + 2))) {
                    d2 = -2.0d;
                }
                double d4 = d3;
                if (this.surnameMap.containsKey(next.substring(i, i2))) {
                    if (i2 >= next.length()) {
                        dMax = Math.max(dMax2, 0.2d);
                    } else {
                        dMax = i == 0 ? Math.max(dMax2, 0.8d) : Math.max(dMax2, 0.5d);
                    }
                    dMax2 = dMax;
                    iMin = Math.min(iMin, this.surnameMap.get(next.substring(i, i2)).intValue());
                }
                if (i2 < next.length()) {
                    int i3 = i + 2;
                    if (this.surnameMap.containsKey(next.substring(i, i3))) {
                        if (i3 >= next.length()) {
                            dMax2 = Math.max(dMax2, 0.2d);
                        } else {
                            dMax2 = i == 0 ? Math.max(dMax2, 0.8d) : Math.max(dMax2, 0.5d);
                        }
                        iMin = Math.min(iMin, this.surnameMap.get(next.substring(i, i3)).intValue());
                    }
                }
                it = it2;
                i = i2;
                d3 = d4;
            }
            arrayList.add(new a(next, d + dMax2 + d3 + d2, iMin));
            it = it;
        }
        return ((a) Collections.max(arrayList)).b();
    }

    public static NameNormaliztion getInstance() {
        return instance;
    }

    private String legalChName(String str) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = NAME_CH_PAT.matcher(str);
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        return sb.toString();
    }

    private String legalZhName(String str) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = ZH_PAT.matcher(str);
        while (matcher.find()) {
            sb.append(matcher.group());
        }
        return sb.toString();
    }

    private List<String> splitName(String str) {
        ArrayList arrayList = new ArrayList();
        Matcher matcher = NAME_CH_PAT.matcher(str);
        while (matcher.find()) {
            if (!matcher.group().isEmpty()) {
                arrayList.add(matcher.group());
            }
        }
        return arrayList;
    }

    public Boolean containSurName(String str) {
        return Boolean.valueOf(this.surnameMap.containsKey(str));
    }

    public Map<String, Double> getNormNameMap(String str) {
        HashMap map = new HashMap();
        if (str.isEmpty()) {
            return map;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length > 1) {
            for (String str2 : strArrSplit) {
                if (!str2.isEmpty()) {
                    map.put(str2, Double.valueOf(0.5d));
                }
            }
        }
        map.put(str, Double.valueOf(1.0d));
        String strCleanBracketName = cleanBracketName(str);
        if (!strCleanBracketName.isEmpty() && !map.containsKey(strCleanBracketName)) {
            map.put(strCleanBracketName, Double.valueOf(1.0d));
        }
        String strLegalChName = legalChName(str);
        if (!strLegalChName.isEmpty() && !map.containsKey(strLegalChName)) {
            map.put(strLegalChName, Double.valueOf(1.0d));
        }
        String strLegalZhName = legalZhName(str);
        if (!strLegalZhName.isEmpty() && !map.containsKey(strLegalZhName)) {
            map.put(strLegalZhName, Double.valueOf(1.0d));
        }
        HashSet hashSet = new HashSet();
        for (String str3 : Arrays.asList(str, strLegalChName, strLegalZhName)) {
            if (this.relativeSynonymsMap.containsKey(str3)) {
                hashSet.addAll(this.relativeSynonymsMap.get(str3));
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            map.put((String) it.next(), Double.valueOf(1.0d));
        }
        List<String> listSplitName = splitName(strCleanBracketName);
        if (listSplitName.isEmpty()) {
            return map;
        }
        String bestField = listSplitName.get(0);
        if (listSplitName.size() > 1) {
            bestField = getBestField(listSplitName);
        }
        if (bestField.length() == 1) {
            return map;
        }
        if ((bestField.length() == 2 && this.surnameMap.containsKey(bestField.substring(0, 1))) || (bestField.length() == 3 && this.surnameMap.containsKey(bestField.substring(0, 2)))) {
            if (!map.containsKey(bestField)) {
                map.put(bestField, Double.valueOf(0.9d));
            }
            return map;
        }
        if ((bestField.length() == 3 && this.surnameMap.containsKey(bestField.substring(0, 1))) || (bestField.length() == 4 && this.surnameMap.containsKey(bestField.substring(0, 2)))) {
            if (!map.containsKey(bestField)) {
                map.put(bestField, Double.valueOf(0.9d));
            }
            if (!map.containsKey(bestField.substring(bestField.length() - 2))) {
                map.put(bestField.substring(bestField.length() - 2), Double.valueOf(0.6d));
            }
            return map;
        }
        List<String> listC = nip.b().c(bestField);
        ArrayList<Map.Entry> arrayList = new ArrayList();
        for (int i = 0; i < listC.size(); i++) {
            String str4 = listC.get(i);
            String str5 = "";
            if (str4.length() >= 1 && this.surnameMap.containsKey(str4.substring(0, 1))) {
                Integer num = this.surnameMap.get(str4.substring(0, 1));
                num.intValue();
                for (int i2 = i; i2 < listC.size(); i2++) {
                    str5 = str5 + listC.get(i2);
                    if (str5.length() > 3) {
                        break;
                    }
                    if (str5.length() >= 2) {
                        arrayList.add(new AbstractMap.SimpleEntry(str5, num));
                    }
                }
            } else if (str4.length() >= 2 && this.surnameMap.containsKey(str4.substring(0, 2))) {
                Integer num2 = this.surnameMap.get(str4.substring(0, 2));
                num2.intValue();
                for (int i3 = i; i3 < listC.size(); i3++) {
                    str5 = str5 + listC.get(i3);
                    if (str5.length() > 4) {
                        break;
                    }
                    if (str5.length() >= 3) {
                        arrayList.add(new AbstractMap.SimpleEntry(str5, num2));
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        int iMin = Integer.MAX_VALUE;
        while (it2.hasNext()) {
            iMin = Math.min(iMin, ((Integer) ((Map.Entry) it2.next()).getValue()).intValue());
        }
        for (Map.Entry entry : arrayList) {
            if (((Integer) entry.getValue()).intValue() == iMin) {
                String str6 = (String) entry.getKey();
                if (!map.containsKey(str6)) {
                    map.put(str6, Double.valueOf(0.7d));
                }
                if (str6.length() == 4) {
                    if (!map.containsKey(str6.substring(str6.length() - 2))) {
                        map.put(str6.substring(str6.length() - 2), Double.valueOf(0.5d));
                    }
                } else if (str6.length() == 3 && this.surnameMap.containsKey(str6.substring(0, 1)) && !map.containsKey(str6.substring(str6.length() - 2))) {
                    map.put(str6.substring(str6.length() - 2), Double.valueOf(0.5d));
                }
            }
        }
        if (!map.containsKey(bestField)) {
            map.put(bestField, Double.valueOf(0.8d));
        }
        return map;
    }

    public Set<String> getRelativeSynonyms(String str) {
        return this.relativeSynonymsMap.get(str);
    }
}
