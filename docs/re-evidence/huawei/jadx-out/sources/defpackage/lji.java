package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiNoonSleepInfo;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lji {
    public static Map<String, Long> b(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return new HashMap(0);
        }
        HashMap map = new HashMap(2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) != null) {
                HiHealthData hiHealthData = list.get(i);
                if (map.get("core_sleep_start_wake_key") == null && (hiHealthData.getType() == 22104 || hiHealthData.getType() == 22106)) {
                    map.put("core_sleep_start_wake_key", Long.valueOf(hiHealthData.getStartTime()));
                }
                if (map.get("core_sleep_start_time_key") == null && hiHealthData.getType() != 22105 && hiHealthData.getType() != 22003 && hiHealthData.getType() != 22104 && hiHealthData.getType() != 22106) {
                    map.put("core_sleep_start_time_key", Long.valueOf(hiHealthData.getStartTime()));
                }
                int i2 = i + 1;
                if (size > i2 && list.get(i2) != null) {
                    HiHealthData hiHealthData2 = list.get(i2);
                    if (hiHealthData2.getType() != 22106 && hiHealthData2.getType() != 22003 && hiHealthData2.getType() != 22104 && hiHealthData2.getType() != 22105) {
                        map.put("core_sleep_end_time_key", Long.valueOf(hiHealthData2.getEndTime()));
                    }
                    if (hiHealthData2.getType() == 22106 || hiHealthData2.getType() == 22104) {
                        map.put("core_sleep_end_wake_key", Long.valueOf(hiHealthData2.getEndTime()));
                    }
                }
            }
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086 A[SYNTHETIC] */
    public static List<HiNoonSleepInfo.TimeInterval> a(List<HiHealthData> list) {
        if (HiCommonUtil.b(list)) {
            return new ArrayList();
        }
        ArrayList<Map> arrayList = new ArrayList(10);
        HashMap map = new HashMap(16);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                HiHealthData hiHealthData = list.get(i);
                if (map.get("core_sleep_start_time_key") == null) {
                    map.put("core_sleep_start_time_key", hiHealthData);
                }
                int i2 = i + 1;
                if (i2 < list.size()) {
                    if (list.get(i2) != null) {
                        map.put("core_sleep_end_time_key", hiHealthData);
                        if (list.get(i2).getStartTime() - hiHealthData.getEndTime() >= 60000) {
                            map.put("core_sleep_end_time_key", hiHealthData);
                            arrayList.add(map);
                            map = new HashMap(16);
                        }
                        if (i != list.size() - 1) {
                            if (map.get("core_sleep_start_time_key") == null) {
                                map.put("core_sleep_start_time_key", hiHealthData);
                            }
                            map.put("core_sleep_end_time_key", hiHealthData);
                            arrayList.add(map);
                        }
                    }
                } else if (i != list.size() - 1) {
                    if (map.get("core_sleep_start_time_key") == null) {
                        map.put("core_sleep_start_time_key", hiHealthData);
                    }
                    map.put("core_sleep_end_time_key", hiHealthData);
                    arrayList.add(map);
                }
            }
        }
        if (HiCommonUtil.b(arrayList)) {
            return new ArrayList();
        }
        ArrayList arrayList2 = new ArrayList(10);
        for (Map map2 : arrayList) {
            if (map2.get("core_sleep_start_time_key") != null || map2.get("core_sleep_end_time_key") != null) {
                arrayList2.add(new HiNoonSleepInfo.TimeInterval(((HiHealthData) map2.get("core_sleep_start_time_key")).getStartTime(), ((HiHealthData) map2.get("core_sleep_end_time_key")).getEndTime(), HiDateUtil.c(list.get(0).getTimeZone())));
            }
        }
        return arrayList2;
    }
}
