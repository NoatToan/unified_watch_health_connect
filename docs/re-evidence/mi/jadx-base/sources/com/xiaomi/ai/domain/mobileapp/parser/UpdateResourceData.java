package com.xiaomi.ai.domain.mobileapp.parser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.xiaomi.ai.domain.mobileapp.common.AppItem;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.util.Features;
import com.xiaomi.ai.domain.mobileapp.util.HeapSort;
import com.xiaomi.ai.domain.mobileapp.util.MobileResourceLoader;
import com.xiaomi.ai.domain.mobileapp.util.Score;
import com.xiaomi.ai.nlp.lattice.entity.EntityType;
import com.xiaomi.onetrack.b.g;
import com.xiaomi.smarthome.library.common.util.StringUtil;
import defpackage.aqe;
import defpackage.brk;
import defpackage.klo;
import defpackage.mjh;
import defpackage.mlo;
import defpackage.nip;
import defpackage.qpe;
import defpackage.xb8;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.lang3.tuple.Triple;

/* JADX INFO: loaded from: classes7.dex */
public class UpdateResourceData extends MobileResourceLoader {
    private static final String CFG_PREFIX = "com.xiaomi.ai.domain.mobileApp.";
    private static final int MAX_HIT_APP = 10;
    private static final int MAX_RECALL_COUNT = 150;
    private static final int MAX_SEARCH_COUNT = 100000;
    private static final int MAX_SIM_APP = 10;
    private static final int MAX_TAG_APP = 10;
    private static final int MIN_DOWNLOAD_TIMES = 10;
    private static final int TOP_K = 20;
    public static final String UNIVERSAL = "universal";
    private static final int sysAppDownTimes = 300000;
    private static final Pattern isSinglealpha = Pattern.compile(StringUtil.CHAR_ENGLISH);
    private static final qpe LOGGER = aqe.f(UpdateResourceData.class);
    private static final List<Pattern> blacklistPatterns = new ArrayList();
    private static final Set<String> blacklistTopnames = new HashSet();
    private static final List<Pattern> whitelistPatterns = new ArrayList();
    private static final Set<String> weakPatternBlacklist = new HashSet();
    private Map<String, List<AppItem>> deviceAppItems = new HashMap();
    private Map<String, Map<String, AppItem>> devicePackageNameMap = new HashMap();
    private Map<String, Map<String, List<AppItem>>> deviceNameToAppItemsMap = new HashMap();
    private Map<String, Map<String, List<AppItem>>> deviceTagToTopAppItemsMap = new HashMap();
    private Map<String, List<AppItem>> deviceTopKItems = new HashMap();
    private Map<String, Map<String, List<Integer>>> deviceTokenToAppIndexListMap = new HashMap();
    private Map<String, Map<String, List<Integer>>> deviceUnigramPinyinToAppIndexListMap = new HashMap();
    private Map<String, Map<String, List<Integer>>> deviceBigramPinyinToAppIndexListMap = new HashMap();
    private Set<String> edgeBlackTokens = new HashSet();

    public class a implements Comparator<AppItem> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppItem appItem, AppItem appItem2) {
            if (appItem.isNative() != appItem2.isNative()) {
                return appItem.isNative() ? -1 : 1;
            }
            if (appItem.isOnline() != appItem2.isOnline()) {
                return appItem.isOnline() ? -1 : 1;
            }
            if (appItem.getScore() == appItem2.getScore()) {
                return -Integer.compare(appItem.getDownTimes(), appItem2.getDownTimes());
            }
            return appItem.getScore() > appItem2.getScore() ? -1 : 1;
        }
    }

    public class b implements Comparator<List<Integer>> {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(List<Integer> list, List<Integer> list2) {
            return list.size() - list2.size();
        }
    }

    public class c implements Comparator<Triple<String, Double, String>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f11023a;

        public c(String str) {
            this.f11023a = str;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Triple<String, Double, String> triple, Triple<String, Double, String> triple2) {
            if (triple.getMiddle().compareTo(triple2.getMiddle()) != 0) {
                return -triple.getMiddle().compareTo(triple2.getMiddle());
            }
            if (((AppItem) ((Map) UpdateResourceData.this.devicePackageNameMap.get(this.f11023a)).get(triple.getLeft())).isOnline() == ((AppItem) ((Map) UpdateResourceData.this.devicePackageNameMap.get(this.f11023a)).get(triple2.getLeft())).isOnline()) {
                return 0;
            }
            return ((AppItem) ((Map) UpdateResourceData.this.devicePackageNameMap.get(this.f11023a)).get(triple.getLeft())).isOnline() ? -1 : 1;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PriorityQueue<AppItem> f11025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11026b;

        public d(int i) {
            if (i <= 0) {
                UpdateResourceData.LOGGER.error("TopKQueue maxSize set invalid {}", Integer.valueOf(i));
            }
            this.f11026b = i <= 0 ? 0 : i;
            this.f11025a = new PriorityQueue<>(i);
        }

        public void a(AppItem appItem) {
            if (this.f11025a.size() < this.f11026b) {
                this.f11025a.add(appItem);
            } else {
                if (appItem.compareTo(this.f11025a.peek()) <= 0 || !appItem.isOnline()) {
                    return;
                }
                this.f11025a.poll();
                this.f11025a.add(appItem);
            }
        }

        public List<AppItem> b() {
            ArrayList arrayList = new ArrayList(this.f11025a);
            Collections.sort(arrayList);
            return arrayList;
        }
    }

    static {
        Iterator<String> it = com.typesafe.config.a.f("mobileapp/intervention/blacklist.conf").f("com.xiaomi.ai.domain.mobileApp.blacklist.pattern").iterator();
        while (it.hasNext()) {
            blacklistPatterns.add(Pattern.compile(it.next()));
        }
        Iterator<String> it2 = com.typesafe.config.a.f("mobileapp/intervention/whitelist.conf").f("com.xiaomi.ai.domain.mobileApp.whitelist.pattern").iterator();
        while (it2.hasNext()) {
            whitelistPatterns.add(Pattern.compile(it2.next()));
        }
        blacklistTopnames.addAll(com.typesafe.config.a.f("mobileapp/intervention/topname-blacklist.conf").f("com.xiaomi.ai.domain.mobileApp.blacklist.topname"));
        weakPatternBlacklist.addAll(com.typesafe.config.a.f("mobileapp/intervention/weakpattern-blacklist.conf").f("com.xiaomi.ai.domain.mobileApp.blacklist.weakpattern"));
    }

    private void buildDeviceNameToAppItemsMap(String str) {
        this.deviceNameToAppItemsMap.put(str, new HashMap());
        for (AppItem appItem : this.deviceAppItems.get(str)) {
            String displayName = appItem.getDisplayName();
            if (!this.deviceNameToAppItemsMap.get(str).containsKey(displayName)) {
                this.deviceNameToAppItemsMap.get(str).put(displayName, new ArrayList());
            }
            this.deviceNameToAppItemsMap.get(str).get(displayName).add(appItem);
            for (String str2 : appItem.getAliasList()) {
                if (!this.deviceNameToAppItemsMap.get(str).containsKey(str2)) {
                    this.deviceNameToAppItemsMap.get(str).put(str2, new ArrayList());
                }
                if (!this.deviceNameToAppItemsMap.get(str).get(str2).contains(appItem)) {
                    this.deviceNameToAppItemsMap.get(str).get(str2).add(appItem);
                }
            }
        }
    }

    private void buildDeviceTagToTopAppItemsMap(Map<String, List<AppItem>> map, String str) {
        this.deviceTagToTopAppItemsMap.put(str, new HashMap());
        for (String str2 : map.keySet()) {
            ArrayList arrayList = new ArrayList(map.get(str2));
            Collections.sort(arrayList, new a());
            this.deviceTagToTopAppItemsMap.get(str).put(str2, arrayList);
        }
    }

    private void buildDeviceTopKItems(String str) {
        d dVar = new d(Math.min(20, this.deviceAppItems.get(str).size()));
        Iterator<AppItem> it = this.deviceAppItems.get(str).iterator();
        while (it.hasNext()) {
            dVar.a(it.next());
        }
        this.deviceTopKItems.put(str, dVar.b());
    }

    private void buildInvertedIndex(List<AppItem> list, String str) {
        Map<String, List<Integer>> map = new HashMap<>();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            HashSet<String> hashSet = new HashSet();
            for (String str2 : list.get(i).getAliasList()) {
                if (str2 != null && !str2.isEmpty()) {
                    hashSet.addAll(nip.b().c(str2));
                    for (String str3 : Features.getBigramPinyin(str2)) {
                        if (!map3.containsKey(str3)) {
                            map3.put(str3, new ArrayList());
                        }
                        if (!((List) map3.get(str3)).contains(Integer.valueOf(i))) {
                            ((List) map3.get(str3)).add(Integer.valueOf(i));
                        }
                    }
                    for (String str4 : Features.getUnigramPinyins(str2)) {
                        if (!map2.containsKey(str4)) {
                            map2.put(str4, new ArrayList());
                        }
                        if (!((List) map2.get(str4)).contains(Integer.valueOf(i))) {
                            ((List) map2.get(str4)).add(Integer.valueOf(i));
                        }
                    }
                }
            }
            for (String str5 : hashSet) {
                if (str5 != null && !str5.isEmpty()) {
                    if (!map.containsKey(str5)) {
                        map.put(str5, new ArrayList());
                    }
                    if (!map.get(str5).contains(Integer.valueOf(i))) {
                        map.get(str5).add(Integer.valueOf(i));
                    }
                }
            }
        }
        this.deviceTokenToAppIndexListMap.put(str, map);
        this.deviceBigramPinyinToAppIndexListMap.put(str, map3);
        this.deviceUnigramPinyinToAppIndexListMap.put(str, map2);
    }

    private void buildResource() {
        Iterator<brk.a> it;
        String str;
        String str2;
        String str3;
        AppItem appItem;
        String str4 = "data_source";
        String str5 = "is_online";
        String str6 = "is_native";
        if (getResources("name").isEmpty()) {
            return;
        }
        this.deviceAppItems = new HashMap();
        this.devicePackageNameMap = new HashMap();
        Iterator<brk.a> it2 = getResources("name").iterator();
        while (it2.hasNext()) {
            brk.a next = it2.next();
            String strC = next.c();
            String strB = next.b();
            JsonObject jsonObjectA = next.a();
            if (jsonObjectA != null) {
                try {
                    String asString = jsonObjectA.get("package_name").getAsString();
                    it = it2;
                    try {
                        String asString2 = jsonObjectA.get("display_name").getAsString();
                        String str7 = str4;
                        try {
                            String device = getDevice(jsonObjectA.has("deviceType") ? jsonObjectA.get("deviceType").getAsString() : "");
                            String str8 = str5;
                            try {
                                if (this.devicePackageNameMap.containsKey(device)) {
                                    try {
                                        if (this.devicePackageNameMap.get(device).containsKey(asString)) {
                                            str3 = str6;
                                            appItem = this.devicePackageNameMap.get(device).get(asString);
                                        } else {
                                            appItem = new AppItem();
                                            appItem.setPackageName(asString);
                                            str3 = str6;
                                            try {
                                                this.devicePackageNameMap.get(device).put(asString, appItem);
                                                this.deviceAppItems.get(device).add(appItem);
                                            } catch (Exception e) {
                                                e = e;
                                                str2 = str8;
                                                str = str7;
                                                str6 = str3;
                                                LOGGER.error("failed to initEdgeBaseAndBlackResource MobileAppResource", (Throwable) e);
                                                str5 = str2;
                                                str6 = str6;
                                                str4 = str;
                                                it2 = it;
                                            }
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        str3 = str6;
                                    }
                                } else {
                                    str3 = str6;
                                    this.devicePackageNameMap.put(device, new HashMap());
                                    appItem = new AppItem();
                                    appItem.setPackageName(asString);
                                    this.devicePackageNameMap.get(device).put(asString, appItem);
                                    this.deviceAppItems.put(device, new ArrayList());
                                    this.deviceAppItems.get(device).add(appItem);
                                }
                                appItem.setDisplayName(asString2);
                                appItem.addAlias(asString2);
                                appItem.addAlias(strC);
                                appItem.addAlias(strB);
                                if (jsonObjectA.has(g.d)) {
                                    appItem.setAppId(jsonObjectA.get(g.d).getAsLong());
                                }
                                if (jsonObjectA.has("icon_url")) {
                                    appItem.setIconUrl(jsonObjectA.get("icon_url").getAsString());
                                }
                                if (jsonObjectA.has("score")) {
                                    appItem.setScore(jsonObjectA.get("score").getAsDouble());
                                }
                                if (jsonObjectA.has("down_times")) {
                                    appItem.setDownTimes(jsonObjectA.get("down_times").getAsInt());
                                }
                                if (jsonObjectA.has("tags")) {
                                    Iterator<JsonElement> it3 = jsonObjectA.get("tags").getAsJsonArray().iterator();
                                    while (it3.hasNext()) {
                                        appItem.addTag(it3.next().getAsString());
                                    }
                                }
                                if (jsonObjectA.has("is_top")) {
                                    appItem.setTop(jsonObjectA.get("is_top").getAsBoolean());
                                }
                                if (jsonObjectA.has("deviceType")) {
                                    appItem.setDeviceType(jsonObjectA.get("deviceType").getAsString());
                                }
                                str6 = str3;
                                try {
                                    if (jsonObjectA.has(str6)) {
                                        appItem.setNative(jsonObjectA.get(str6).getAsBoolean());
                                    }
                                    str2 = str8;
                                    try {
                                        if (jsonObjectA.has(str2)) {
                                            appItem.setOnline(jsonObjectA.get(str2).getAsBoolean());
                                        } else {
                                            appItem.setOnline(true);
                                        }
                                        str = str7;
                                        try {
                                            if (jsonObjectA.has(str)) {
                                                appItem.setDataSource(jsonObjectA.get(str).getAsString());
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            LOGGER.error("failed to initEdgeBaseAndBlackResource MobileAppResource", (Throwable) e);
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        str = str7;
                                        LOGGER.error("failed to initEdgeBaseAndBlackResource MobileAppResource", (Throwable) e);
                                        str5 = str2;
                                        str6 = str6;
                                        str4 = str;
                                        it2 = it;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str2 = str8;
                                    str = str7;
                                    LOGGER.error("failed to initEdgeBaseAndBlackResource MobileAppResource", (Throwable) e);
                                    str5 = str2;
                                    str6 = str6;
                                    str4 = str;
                                    it2 = it;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                str6 = str6;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            str = str7;
                            str2 = str5;
                            LOGGER.error("failed to initEdgeBaseAndBlackResource MobileAppResource", (Throwable) e);
                            str5 = str2;
                            str6 = str6;
                            str4 = str;
                            it2 = it;
                        }
                    } catch (Exception e8) {
                        e = e8;
                        str = str4;
                        str2 = str5;
                        LOGGER.error("failed to initEdgeBaseAndBlackResource MobileAppResource", (Throwable) e);
                        str5 = str2;
                        str6 = str6;
                        str4 = str;
                        it2 = it;
                    }
                } catch (Exception e9) {
                    e = e9;
                    it = it2;
                }
                str5 = str2;
                str6 = str6;
                str4 = str;
                it2 = it;
            }
        }
        for (Map.Entry<String, List<AppItem>> entry : this.deviceAppItems.entrySet()) {
            LOGGER.info("loaded :" + entry.getKey() + " appItems success, size=" + entry.getValue().size());
        }
        for (String str9 : this.deviceAppItems.keySet()) {
            for (AppItem appItem2 : this.deviceAppItems.get(str9)) {
                ArrayList arrayList = new ArrayList();
                for (String str10 : appItem2.getAliasList()) {
                    for (String str11 : Features.getQueryPinyins(str10)) {
                        if (!appItem2.getPinyinList().contains(str11)) {
                            appItem2.getPinyinList().add(str11);
                        }
                    }
                    arrayList.addAll(Features.getQueryPinyinsList(str10));
                }
                appItem2.setAliasWordPinyinList(arrayList);
            }
            buildDeviceNameToAppItemsMap(str9);
            buildDeviceTagToTopAppItemsMap(buildTagAppsMap(str9), str9);
            buildDeviceTopKItems(str9);
            buildInvertedIndex(this.deviceAppItems.get(str9), str9);
        }
        LOGGER.info("tokenToAppIndexListMap build success");
    }

    private Map<String, List<AppItem>> buildTagAppsMap(String str) {
        HashMap map = new HashMap();
        for (AppItem appItem : this.deviceAppItems.get(str)) {
            if (appItem.getDownTimes() > 10) {
                for (String str2 : appItem.getTagsList()) {
                    if (!map.containsKey(str2)) {
                        map.put(str2, new ArrayList());
                    }
                    ((List) map.get(str2)).add(appItem);
                }
            }
        }
        return map;
    }

    private List<Integer> genInvIntIntersection(List<List<Integer>> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(Collections.nCopies(list.size(), 0));
        loop0: while (true) {
            int iIntValue = list.get(0).get(((Integer) arrayList2.get(0)).intValue()).intValue();
            boolean z = true;
            for (int i = 0; i < arrayList2.size(); i++) {
                int iIntValue2 = list.get(i).get(((Integer) arrayList2.get(i)).intValue()).intValue();
                if (iIntValue2 != iIntValue) {
                    if (iIntValue2 > iIntValue) {
                        iIntValue = iIntValue2;
                    }
                    z = false;
                }
            }
            if (z) {
                arrayList.add(Integer.valueOf(iIntValue));
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    arrayList2.set(i2, Integer.valueOf(((Integer) arrayList2.get(i2)).intValue() + 1));
                    if (((Integer) arrayList2.get(i2)).intValue() >= list.get(i2).size()) {
                        break loop0;
                    }
                }
            } else {
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    int iIntValue3 = ((Integer) arrayList2.get(i3)).intValue();
                    while (iIntValue3 < list.get(i3).size() && list.get(i3).get(iIntValue3).intValue() < iIntValue) {
                        iIntValue3++;
                    }
                    arrayList2.set(i3, Integer.valueOf(iIntValue3));
                    if (((Integer) arrayList2.get(i3)).intValue() >= list.get(i3).size()) {
                        break loop0;
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Integer> getAppIndexListByTokenExactMatch(String str, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (!this.deviceTokenToAppIndexListMap.containsKey(deviceTypeUpdate)) {
            return new ArrayList();
        }
        HashSet<String> hashSet = new HashSet(nip.b().c(str));
        ArrayList arrayList = new ArrayList();
        for (String str2 : hashSet) {
            if (!this.deviceTokenToAppIndexListMap.get(deviceTypeUpdate).containsKey(str2)) {
                return new ArrayList();
            }
            arrayList.add(this.deviceTokenToAppIndexListMap.get(deviceTypeUpdate).get(str2));
        }
        Collections.sort(arrayList, new b());
        List<Integer> arrayList2 = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2 = genInvIntIntersection(arrayList.subList(0, arrayList.size() - i));
            if (arrayList2.size() != 0) {
                break;
            }
        }
        return arrayList2;
    }

    private Set<String> getTokenAndNormTokenDict(Device device) {
        if (this.edgeBlackTokens.isEmpty()) {
            return getDictUpdate(device);
        }
        HashSet hashSet = new HashSet(getDictUpdate(device));
        hashSet.removeAll(this.edgeBlackTokens);
        return hashSet;
    }

    public static void main(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(3);
        arrayList2.add(5);
        arrayList2.add(10);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(2);
        arrayList3.add(3);
        arrayList3.add(5);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(3);
        arrayList4.add(5);
        arrayList4.add(7);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(2);
        arrayList5.add(3);
        arrayList5.add(5);
        arrayList5.add(9);
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(arrayList4);
        arrayList.add(arrayList5);
        List<Integer> listGenInvIntIntersection = new UpdateResourceData().genInvIntIntersection(arrayList);
        for (int i = 0; i < listGenInvIntIntersection.size(); i++) {
            System.out.println(listGenInvIntIntersection.get(i));
        }
    }

    private List<List<Integer>> recallAppIds(List<String> list, String str, String str2) {
        Map<String, List<Integer>> map;
        ArrayList arrayList = new ArrayList();
        if ("WORD_PINYIN".equals(str)) {
            if (!this.deviceUnigramPinyinToAppIndexListMap.containsKey(str2)) {
                return arrayList;
            }
            map = this.deviceUnigramPinyinToAppIndexListMap.get(str2);
        } else {
            if (!this.deviceBigramPinyinToAppIndexListMap.containsKey(str2)) {
                return arrayList;
            }
            map = this.deviceBigramPinyinToAppIndexListMap.get(str2);
        }
        for (String str3 : list) {
            if (map.containsKey(str3)) {
                arrayList.add(map.get(str3));
            }
        }
        return arrayList;
    }

    private List<Integer> recallMix(String str, String str2) {
        List<String> unigramPinyins = Features.getUnigramPinyins(str);
        List<String> bigramPinyin = Features.getBigramPinyin(str);
        List<List<Integer>> listRecallAppIds = recallAppIds(unigramPinyins, "WORD_PINYIN", str2);
        List<List<Integer>> listRecallAppIds2 = recallAppIds(bigramPinyin, "BIGRAM_WORD_PIN", str2);
        HashMap map = new HashMap();
        Iterator<List<Integer>> it = listRecallAppIds.iterator();
        while (it.hasNext()) {
            for (Integer num : it.next()) {
                if (!map.containsKey(num)) {
                    map.put(num, 0);
                }
                map.put(num, Integer.valueOf(((Integer) map.get(num)).intValue() + 2));
            }
        }
        Iterator<List<Integer>> it2 = listRecallAppIds2.iterator();
        while (it2.hasNext()) {
            for (Integer num2 : it2.next()) {
                if (!map.containsKey(num2)) {
                    map.put(num2, 0);
                }
                map.put(num2, Integer.valueOf(((Integer) map.get(num2)).intValue() + 3));
            }
        }
        List<Map.Entry<Integer, Integer>> pKVar = HeapSort.topK(new ArrayList(map.entrySet()), 150);
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, Integer>> it3 = pKVar.iterator();
        while (it3.hasNext()) {
            Integer key = it3.next().getKey();
            key.intValue();
            arrayList.add(key);
        }
        return arrayList;
    }

    private List<Triple<String, Double, String>> sortByMixScore(List<Integer> list, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (!this.deviceAppItems.containsKey(str2)) {
            return arrayList;
        }
        List<List<String>> queryPinyinsList = Features.getQueryPinyinsList(str);
        List<String> queryPinyins = Features.getQueryPinyins(str);
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (iIntValue >= 0 && iIntValue < this.deviceAppItems.get(str2).size()) {
                AppItem appItem = this.deviceAppItems.get(str2).get(iIntValue);
                double dCalMaxJaccardScore = Score.calMaxJaccardScore(queryPinyinsList, appItem.getAliasWordPinyinList());
                double dCalMaxLevenshteinScore = Score.calMaxLevenshteinScore(queryPinyins, appItem.getPinyinList());
                List<List<String>> list2 = queryPinyinsList;
                double dMin = (((dCalMaxJaccardScore * 0.5d) + (0.5d * dCalMaxLevenshteinScore)) * 0.95d) + (Math.min(1.0d, appItem.getScore()) * 0.05d);
                arrayList.add(Triple.of(appItem.getPackageName(), Double.valueOf(dMin), String.format("jaccardSimilarity:%.5f levenshteinSimilarity:%.5f appScore:%.5f score:%.5f", Double.valueOf(dCalMaxJaccardScore), Double.valueOf(dCalMaxLevenshteinScore), Double.valueOf(appItem.getScore()), Double.valueOf(dMin))));
                queryPinyins = queryPinyins;
                queryPinyinsList = list2;
            }
        }
        Collections.sort(arrayList, new c(str2));
        return arrayList;
    }

    public List<xb8> extractEntities(String str, boolean z, Device device) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        for (String str2 : nip.b().d(str, getTokenAndNormTokenDict(device))) {
            if (!klo.f(str2) && !klo.a(str2)) {
                if (z) {
                    arrayList.add(new xb8(length, str2.length() + length, str2, str2));
                }
                if (!this.edgeBlackTokens.contains(str2)) {
                    for (mjh<String, String> mjhVar : getDeviceUpdateNTokenSlot(str2, device)) {
                        String strA = mjhVar.a();
                        String strD = mjhVar.d();
                        EntityType entityType = EntityType.INIT_PARSED_ENTITY;
                        if (!str2.equals(strA)) {
                            entityType = EntityType.ALIAS_ENTITY;
                        }
                        int i = length;
                        arrayList.add(new xb8(i, length + str2.length(), str2, str2, strD, str2, entityType));
                    }
                }
                length += str2.length();
            }
        }
        return arrayList;
    }

    @Override // com.xiaomi.ai.domain.mobileapp.util.MobileResourceLoader
    public double getActionScore(String str) {
        return super.getActionScore(str);
    }

    public AppItem getAppItemByPackageName(String str, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (this.devicePackageNameMap.containsKey(deviceTypeUpdate) && this.devicePackageNameMap.get(deviceTypeUpdate).containsKey(str)) {
            return this.devicePackageNameMap.get(deviceTypeUpdate).get(str);
        }
        return null;
    }

    public List<MobileAppIntention.ShowApp> getAppListByTokenFuzzySearch(String str, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        List<Triple<String, Double, String>> listSortByMixScore = sortByMixScore(recallMix(str, deviceTypeUpdate), str, deviceTypeUpdate);
        int iMin = Math.min(5, listSortByMixScore.size());
        ArrayList arrayList = new ArrayList();
        double dDoubleValue = -1.0d;
        for (Triple<String, Double, String> triple : listSortByMixScore.subList(0, iMin)) {
            String left = triple.getLeft();
            if (this.devicePackageNameMap.get(deviceTypeUpdate).containsKey(left)) {
                AppItem appItem = this.devicePackageNameMap.get(deviceTypeUpdate).get(left);
                MobileAppIntention.ShowApp showApp = new MobileAppIntention.ShowApp(appItem.getDisplayName(), appItem.getPackageName(), appItem.getIconUrl(), appItem.isNative(), appItem.isOnline(), appItem.isTop(), triple.getMiddle().doubleValue());
                if (dDoubleValue < 0.0d) {
                    dDoubleValue = triple.getMiddle().doubleValue();
                } else if (0.5d * dDoubleValue > triple.getMiddle().doubleValue()) {
                    break;
                }
                showApp.setDebugInfoKV("info", triple.getRight());
                arrayList.add(showApp);
            }
        }
        return arrayList;
    }

    public Map<String, Map<String, List<AppItem>>> getDeviceNameToAppItemsMap() {
        return this.deviceNameToAppItemsMap;
    }

    public Map<String, Map<String, AppItem>> getDevicePackageNameMap() {
        return this.devicePackageNameMap;
    }

    public Map<String, Map<String, List<AppItem>>> getDeviceTagToTopAppItemsMap() {
        return this.deviceTagToTopAppItemsMap;
    }

    public Set<String> getDeviceType() {
        return this.deviceAppItems.keySet();
    }

    public boolean getHitAndSimilarAppItems(String str, List<AppItem> list, List<AppItem> list2, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (!this.deviceAppItems.containsKey(deviceTypeUpdate)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<Integer> appIndexListByTokenExactMatch = getAppIndexListByTokenExactMatch(str, device);
        LOGGER.debug("name:{} deviceFromIntention:{} deviceIntentAppName:{} deviceIntentAppOrigin:{}", str, device, device.getAppName(), device.getAppNameOriginal());
        for (Integer num : appIndexListByTokenExactMatch) {
            if (num.intValue() >= 0 && num.intValue() < this.deviceAppItems.get(deviceTypeUpdate).size()) {
                AppItem appItem = this.deviceAppItems.get(deviceTypeUpdate).get(num.intValue());
                appItem.getDeviceType();
                if (appItem.hasName(str)) {
                    list.add(appItem);
                } else {
                    arrayList2.add(appItem);
                }
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder());
        Collections.sort(arrayList2, Collections.reverseOrder());
        int iMin = Math.min(arrayList.size(), 10);
        int iMin2 = Math.min(arrayList2.size(), 10);
        list.addAll(arrayList.subList(0, iMin));
        list2.addAll(arrayList2.subList(0, iMin2));
        LOGGER.debug("hitNameItem size:{} simNameItem size:{}", Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size()));
        return !arrayList.isEmpty();
    }

    public void getTagTopAppsItems(String str, List<AppItem> list, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (this.deviceTagToTopAppItemsMap.containsKey(deviceTypeUpdate) && this.deviceTagToTopAppItemsMap.get(deviceTypeUpdate).containsKey(str)) {
            List<AppItem> list2 = this.deviceTagToTopAppItemsMap.get(deviceTypeUpdate).get(str);
            for (AppItem appItem : list2.subList(0, Math.min(list2.size(), 10))) {
                if (!list.contains(appItem)) {
                    list.add(appItem);
                }
            }
        }
    }

    public List<AppItem> getTopKItems(Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        return this.deviceTopKItems.containsKey(deviceTypeUpdate) ? this.deviceTopKItems.get(deviceTypeUpdate) : new ArrayList();
    }

    public boolean hasToken(String str, Device device) {
        return (klo.f(str) || this.edgeBlackTokens.contains(str) || !getDictUpdate(device).contains(str)) ? false : true;
    }

    @Override // com.xiaomi.ai.domain.mobileapp.util.MobileResourceLoader
    public boolean init(List<InputStream> list) throws Exception {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Iterator<InputStream> it = list.iterator();
        while (it.hasNext()) {
            loadMobileResources(it.next());
        }
        buildResource();
        return true;
    }

    public boolean isTagApp(String str, String str2, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (!this.deviceTagToTopAppItemsMap.containsKey(deviceTypeUpdate) || !this.deviceTagToTopAppItemsMap.get(deviceTypeUpdate).containsKey(str)) {
            return false;
        }
        Iterator<AppItem> it = this.deviceTagToTopAppItemsMap.get(deviceTypeUpdate).get(str).iterator();
        while (it.hasNext()) {
            if (mlo.a(it.next().getPackageName(), str2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isTopApp(String str, Device device) {
        String deviceTypeUpdate = Device.getDeviceTypeUpdate(device);
        if (!this.deviceNameToAppItemsMap.containsKey(deviceTypeUpdate) || !this.deviceNameToAppItemsMap.get(deviceTypeUpdate).containsKey(str)) {
            return false;
        }
        Iterator<AppItem> it = this.deviceNameToAppItemsMap.get(deviceTypeUpdate).get(str).iterator();
        while (it.hasNext()) {
            if (it.next().isTop()) {
                return true;
            }
        }
        return false;
    }

    public boolean matchBlackPatternList(String str) {
        Iterator<Pattern> it = blacklistPatterns.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public boolean matchTopnameBlackList(String str) {
        return blacklistTopnames.contains(str);
    }

    public boolean matchWeakPatternBlackList(String str) {
        return weakPatternBlacklist.contains(str);
    }

    public boolean matchWhitePatternList(String str) {
        Iterator<Pattern> it = whitelistPatterns.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    public void setEdgeBlkToken(String str) {
        this.edgeBlackTokens.clear();
        if (getDict().contains(str)) {
            this.edgeBlackTokens.add(str);
            for (Map<String, List<AppItem>> map : this.deviceNameToAppItemsMap.values()) {
                if (map.containsKey(str)) {
                    for (AppItem appItem : map.get(str)) {
                        this.edgeBlackTokens.add(appItem.getDisplayName());
                        this.edgeBlackTokens.addAll(appItem.getAliasList());
                    }
                }
            }
        }
    }
}
