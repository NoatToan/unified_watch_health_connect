package defpackage;

import com.huawei.hihealth.HiHealthData;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class oxd {
    public static Map<Integer, Float> a(List<HiHealthData> list) {
        Map<Integer, Float> map = new HashMap<>(16);
        if (njy.e(list)) {
            LogUtil.j("PLGACHIEVE_StepRule", "computeEverySeasonStep stepList is empty");
            return map;
        }
        Iterator<HiHealthData> it = list.iterator();
        while (it.hasNext()) {
            map = c(it.next(), map);
        }
        return map;
    }

    private static Map<Integer, Float> c(HiHealthData hiHealthData, Map<Integer, Float> map) {
        if (hiHealthData == null) {
            return map;
        }
        long startTime = hiHealthData.getStartTime();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime);
        int i = calendar.get(2);
        int i2 = i == 0 ? 4 : (i + 2) / 3;
        float fFloatValue = hiHealthData.getFloat("sum");
        if (map.containsKey(Integer.valueOf(i2))) {
            fFloatValue += map.get(Integer.valueOf(i2)).floatValue();
        }
        map.put(Integer.valueOf(i2), Float.valueOf(fFloatValue));
        return map;
    }

    public static int c(Map<Integer, Float> map) {
        int iIntValue = 0;
        if (map != null && map.size() != 0) {
            float f = 0.0f;
            for (Map.Entry<Integer, Float> entry : map.entrySet()) {
                float fFloatValue = entry.getValue().floatValue();
                if (fFloatValue > f) {
                    iIntValue = entry.getKey().intValue();
                    f = fFloatValue;
                }
            }
        }
        return iIntValue;
    }
}
