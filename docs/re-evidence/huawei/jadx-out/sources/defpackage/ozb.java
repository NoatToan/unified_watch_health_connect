package defpackage;

import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalLocation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class ozb {
    public static ozw a(List<MedalLocation> list) {
        if (list == null) {
            return null;
        }
        List<String> listE = e(list);
        Map<String, ArrayList<String>> mapD = d(list);
        Map<String, ArrayList<String>> mapB = b(list);
        ozw ozwVar = new ozw();
        ozwVar.c(listE);
        ozwVar.c(mapD);
        ozwVar.b(mapB);
        return ozwVar;
    }

    private static List<String> e(List<MedalLocation> list) {
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        HashMap map = new HashMap(5);
        for (MedalLocation medalLocation : list) {
            map.put(medalLocation.acquireFirstTabDesc(), Integer.valueOf(medalLocation.acquireFirstTabPriority()));
        }
        return d(map);
    }

    private static Map<String, ArrayList<String>> d(List<MedalLocation> list) {
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        HashMap map3 = new HashMap(16);
        for (MedalLocation medalLocation : list) {
            map3.put(medalLocation.acquireSecondTabDesc(), Integer.valueOf(medalLocation.acquireSecondTabPriority()));
            String strAcquireFirstTabDesc = medalLocation.acquireFirstTabDesc();
            if (map2.get(strAcquireFirstTabDesc) != null) {
                Map map4 = (Map) map2.get(strAcquireFirstTabDesc);
                map4.put(medalLocation.acquireSecondTabDesc(), "1");
                map2.put(medalLocation.acquireFirstTabDesc(), map4);
            } else {
                HashMap map5 = new HashMap(16);
                map5.put(medalLocation.acquireSecondTabDesc(), "1");
                map2.put(medalLocation.acquireFirstTabDesc(), map5);
            }
        }
        for (Map.Entry entry : map2.entrySet()) {
            map.put((String) entry.getKey(), a((Map<String, String>) entry.getValue()));
        }
        for (Map.Entry entry2 : map.entrySet()) {
            map.put((String) entry2.getKey(), c((ArrayList) entry2.getValue(), map3));
        }
        LogUtil.a("PLGACHIEVE_AchieveMedalInitLayoutManager", "sortByPriority() firstTabRelationShip2=", map.toString());
        return map;
    }

    private static Map<String, ArrayList<String>> b(List<MedalLocation> list) {
        long j;
        HashMap map = new HashMap(16);
        HashMap map2 = new HashMap(16);
        ArrayList arrayList = new ArrayList(16);
        HashMap map3 = new HashMap(16);
        for (MedalLocation medalLocation : list) {
            String strAcquireSecondTabDesc = medalLocation.acquireSecondTabDesc();
            int iAcquireFirstTabPriority = medalLocation.acquireFirstTabPriority();
            String str = iAcquireFirstTabPriority + "_" + strAcquireSecondTabDesc;
            map2.put(medalLocation.acquireMedalID(), Integer.valueOf(e(iAcquireFirstTabPriority, medalLocation.acquireSecondTabPriority(), medalLocation.acquireMedalWeight())));
            if (map.get(str) != null) {
                ArrayList arrayList2 = (ArrayList) map.get(str);
                arrayList2.add(medalLocation.acquireMedalID());
                map.put(str, arrayList2);
            } else {
                ArrayList arrayList3 = new ArrayList(16);
                arrayList3.add(medalLocation.acquireMedalID());
                map.put(str, arrayList3);
            }
            if (medalLocation.acquireGainedCount() > 0) {
                try {
                    j = Long.parseLong(medalLocation.acquireMedalGainedTime());
                } catch (NumberFormatException unused) {
                    LogUtil.e("PLGACHIEVE_AchieveMedalInitLayoutManager", "getData() NumberFormatException");
                    j = 0;
                }
                arrayList.add(medalLocation.acquireMedalID());
                map3.put(medalLocation.acquireMedalID(), Long.valueOf(j));
            }
        }
        LogUtil.d("PLGACHIEVE_AchieveMedalInitLayoutManager", "getMedalData() MedalRelationShip=", map.toString());
        return d(map, map2, arrayList, map3);
    }

    private static ArrayList<String> a(Map<String, String> map) {
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        ArrayList<String> arrayList = new ArrayList<>(16);
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    private static ArrayList<String> d(Map<String, Integer> map) {
        if (map == null) {
            return new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<String, Integer>>() { // from class: ozb.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                return entry.getValue().intValue() - entry2.getValue().intValue();
            }
        });
        ArrayList<String> arrayList2 = new ArrayList<>(16);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((Map.Entry) it.next()).getKey());
        }
        return arrayList2;
    }

    private static int e(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder(16);
        sb.append(i);
        sb.append(i2);
        sb.append(i3);
        String strTrim = sb.toString().trim();
        if (strTrim.length() > 10) {
            strTrim = strTrim.substring(0, 8);
        }
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException unused) {
            LogUtil.e("PLGACHIEVE_AchieveMedalInitLayoutManager", "NumberFormatException");
            return 0;
        }
    }

    public static ArrayList<String> a(ArrayList<String> arrayList, Map<String, Long> map) {
        if (arrayList == null || map == null) {
            LogUtil.j("PLGACHIEVE_AchieveMedalInitLayoutManager", "sortByMedalGainTime: list/map is null");
            return new ArrayList<>(0);
        }
        ArrayList<Map.Entry> arrayList2 = new ArrayList(map.entrySet());
        Collections.sort(arrayList2, new Comparator<Map.Entry<String, Long>>() { // from class: ozb.3
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public int compare(Map.Entry<String, Long> entry, Map.Entry<String, Long> entry2) {
                if (entry.getValue().longValue() - entry2.getValue().longValue() > 0) {
                    return -1;
                }
                if (entry.getValue().longValue() - entry2.getValue().longValue() != 0) {
                    return 1;
                }
                String key = entry.getKey();
                String key2 = entry2.getKey();
                int length = key.length();
                int length2 = key2.length();
                return length2 == length ? key2.compareTo(key) : length2 - length;
            }
        });
        ArrayList<String> arrayList3 = new ArrayList<>(16);
        for (Map.Entry entry : arrayList2) {
            if (arrayList.contains(entry.getKey())) {
                arrayList3.add((String) entry.getKey());
            }
        }
        return arrayList3;
    }

    private static Map<String, ArrayList<String>> d(Map<String, ArrayList<String>> map, Map<String, Integer> map2, ArrayList<String> arrayList, Map<String, Long> map3) {
        String str;
        HashMap map4 = new HashMap(16);
        for (Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            String[] strArrSplit = key.split("_");
            if (strArrSplit != null && strArrSplit.length > 1) {
                String str2 = strArrSplit[0];
                String str3 = strArrSplit[1];
                str = str2;
                key = str3;
            } else {
                str = "1";
            }
            map4.put(key, d(entry.getValue(), map2, arrayList, map3, str));
        }
        return map4;
    }

    private static ArrayList<String> d(ArrayList<String> arrayList, Map<String, Integer> map, ArrayList<String> arrayList2, Map<String, Long> map2, String str) {
        if (njy.e(arrayList2)) {
            return c(arrayList, map);
        }
        ArrayList<String> arrayList3 = new ArrayList<>(16);
        ArrayList arrayList4 = new ArrayList(16);
        ArrayList arrayList5 = new ArrayList(16);
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList2.contains(arrayList.get(i))) {
                arrayList4.add(arrayList.get(i));
            } else {
                arrayList5.add(arrayList.get(i));
            }
        }
        ArrayList<String> arrayListA = a(arrayList4, map2);
        if ("1".equals(str)) {
            arrayList3.addAll(arrayListA);
            arrayList3.addAll(c(arrayList5, map));
            return arrayList3;
        }
        arrayList3.addAll(c(arrayList5, map));
        arrayList3.addAll(arrayListA);
        return arrayList3;
    }

    private static ArrayList<String> c(ArrayList<String> arrayList, Map<String, Integer> map) {
        ArrayList<String> arrayList2 = new ArrayList<>(16);
        if (arrayList != null && map != null) {
            LogUtil.d("PLGACHIEVE_AchieveMedalInitLayoutManager", "sortMapByWeight list ", arrayList.toString());
            ArrayList<Map.Entry> arrayList3 = new ArrayList(map.entrySet());
            Collections.sort(arrayList3, new Comparator<Map.Entry<String, Integer>>() { // from class: ozb.4
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                    return entry.getValue().intValue() - entry2.getValue().intValue();
                }
            });
            for (Map.Entry entry : arrayList3) {
                if (arrayList.contains(entry.getKey())) {
                    arrayList2.add((String) entry.getKey());
                }
            }
            LogUtil.d("PLGACHIEVE_AchieveMedalInitLayoutManager", "sortMapByWeight result ", arrayList2.toString());
        }
        return arrayList2;
    }

    public static ArrayList<String> e(ArrayList<String> arrayList, ArrayList<String> arrayList2, List<MedalLocation> list) {
        ArrayList<String> arrayList3 = new ArrayList<>(16);
        if (arrayList != null) {
            ArrayList<String> arrayListC = c(arrayList, c(list));
            if (arrayList2 == null) {
                return arrayListC;
            }
            for (String str : arrayListC) {
                if (arrayList2.contains(str)) {
                    arrayList3.add(str);
                }
            }
            for (String str2 : arrayListC) {
                if (!arrayList2.contains(str2)) {
                    arrayList3.add(str2);
                }
            }
        }
        return arrayList3;
    }

    private static Map<String, Integer> c(List<MedalLocation> list) {
        HashMap map = new HashMap(16);
        for (MedalLocation medalLocation : list) {
            map.put(medalLocation.acquireMedalID(), Integer.valueOf(e(medalLocation.acquireFirstTabPriority(), medalLocation.acquireSecondTabPriority(), medalLocation.acquireMedalWeight())));
        }
        return map;
    }
}
