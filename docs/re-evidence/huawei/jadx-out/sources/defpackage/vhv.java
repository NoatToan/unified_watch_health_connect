package defpackage;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LogUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class vhv {
    private static final SimpleDateFormat d = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Gson f51131c = new Gson();

    public static void b(List<vgw> list) {
        if (list == null) {
            LogUtil.e("DietCacheManager", "cacheMeals: meals is null");
            return;
        }
        LogUtil.b("DietCacheManager", "cacheMeals, meals size:", Integer.valueOf(list.size()));
        Map mapC = c();
        if (mapC == null) {
            mapC = new HashMap();
        }
        Map<Integer, List<vgw>> mapE = e(list);
        LogUtil.b("DietCacheManager", "cacheMeals, date count:", Integer.valueOf(mapE.size()));
        for (Map.Entry<Integer, List<vgw>> entry : mapE.entrySet()) {
            e(mapC, entry.getKey().intValue(), entry.getValue());
        }
        d(mapC);
    }

    private static void e(Map<Integer, List<vgw>> map, int i, List<vgw> list) {
        vgw vgwVar;
        LogUtil.b("DietCacheManager", "dataFuse, localDate:", Integer.valueOf(i), "newMeals size:", Integer.valueOf(list.size()));
        List<vgw> arrayList = map.get(Integer.valueOf(i));
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(Integer.valueOf(i), arrayList);
        }
        for (vgw vgwVar2 : list) {
            if (vgwVar2 != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        vgwVar = null;
                        i2 = -1;
                        break;
                    } else {
                        vgwVar = arrayList.get(i2);
                        if (vgwVar.i() == vgwVar2.i()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (vgwVar == null) {
                    arrayList.add(vgwVar2);
                } else if (vgwVar2.j() > vgwVar.j()) {
                    LogUtil.b("DietCacheManager", "dataFuse, replace meal, whichMeal:", Integer.valueOf(vgwVar2.i()), "oldModifiedTime:", Long.valueOf(vgwVar.j()), "newModifiedTime:", Long.valueOf(vgwVar2.j()));
                    arrayList.set(i2, vgwVar2);
                } else {
                    LogUtil.b("DietCacheManager", "dataFuse, skip meal, whichMeal:", Integer.valueOf(vgwVar2.i()), "oldModifiedTime:", Long.valueOf(vgwVar.j()), "newModifiedTime:", Long.valueOf(vgwVar2.j()));
                }
            }
        }
    }

    private static Map<Integer, List<vgw>> e(List<vgw> list) {
        HashMap map = new HashMap();
        for (vgw vgwVar : list) {
            if (vgwVar != null) {
                int iE = HiDateUtil.e(vgwVar.d(), lsl.a(vgwVar.g()));
                if (iE == 0) {
                    LogUtil.e("DietCacheManager", "groupMealsByDate failed, eatTime:", Long.valueOf(vgwVar.d()));
                } else {
                    List arrayList = (List) map.get(Integer.valueOf(iE));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        map.put(Integer.valueOf(iE), arrayList);
                    }
                    arrayList.add(vgwVar);
                }
            }
        }
        return map;
    }

    public static void a() {
        LogUtil.b("DietCacheManager", "clearAllDietRecordCache: start");
        lua.d("DietRecordCache", "all_meals");
        lua.d("DietRecordCache", "all_meals_expire");
        LogUtil.b("DietCacheManager", "clearAllDietRecordCache: success");
    }

    private static Map<Integer, List<vgw>> c() {
        long jD = lua.d("DietRecordCache", "all_meals_expire", 0L);
        if (jD > 0 && System.currentTimeMillis() > jD) {
            LogUtil.e("DietCacheManager", "getAllCachedMeals: cache expired");
            lua.d("DietRecordCache", "all_meals");
            lua.d("DietRecordCache", "all_meals_expire");
            return null;
        }
        String strE = lua.e("DietRecordCache", "all_meals", (String) null);
        if (strE == null) {
            LogUtil.e("DietCacheManager", "getAllCachedMeals: cache not found");
            return null;
        }
        return (Map) f51131c.fromJson(strE, new TypeToken<Map<Integer, List<vgw>>>() { // from class: com.huawei.ui.main.stories.health.weight.repository.DietCacheManager$1
        }.getType());
    }

    private static void d(Map<Integer, List<vgw>> map) {
        if (map == null) {
            LogUtil.e("DietCacheManager", "saveAllMeals: allMeals is null");
        } else {
            lua.f("DietRecordCache", "all_meals", f51131c.toJson(map));
            lua.a("DietRecordCache", "all_meals_expire", System.currentTimeMillis() + 604800000);
        }
    }

    public static void c(List<vgw> list) {
        if (list == null || list.isEmpty()) {
            LogUtil.e("DietCacheManager", "saveMeals: meals is null or empty");
        } else {
            b(list);
            b();
        }
    }

    public static List<vgw> c(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        if (i > i2) {
            LogUtil.e("DietCacheManager", "getDietRecordsByDateRangeInternal: startDay > endDay, swap them");
        } else {
            i2 = i;
            i = i2;
        }
        Map<Integer, List<vgw>> mapC = c();
        if (mapC != null) {
            for (Map.Entry<Integer, List<vgw>> entry : mapC.entrySet()) {
                Integer key = entry.getKey();
                int iIntValue = key.intValue();
                if (iIntValue >= i2 && iIntValue <= i) {
                    arrayList.addAll(entry.getValue());
                    LogUtil.b("DietCacheManager", "getDietRecordsByDateRangeInternal, found meals, localDate:", key, "meals size:", Integer.valueOf(entry.getValue().size()));
                }
            }
        }
        return arrayList;
    }

    public static void b() {
        long jD = lsl.d(System.currentTimeMillis(), -7);
        Map<Integer, List<vgw>> mapC = c();
        if (mapC == null) {
            return;
        }
        Iterator<Map.Entry<Integer, List<vgw>>> it = mapC.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            long jD2 = DateFormatUtil.d(it.next().getKey().intValue());
            if (jD2 > 0 && jD2 < jD) {
                it.remove();
                i++;
            }
        }
        if (i > 0) {
            d(mapC);
        }
    }
}
