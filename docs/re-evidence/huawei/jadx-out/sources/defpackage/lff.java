package defpackage;

import com.amap.api.services.core.AMapException;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lff {
    private static final Map<Integer, Integer> d;

    static {
        HashMap map = new HashMap(16);
        d = map;
        map.put(Integer.valueOf(AMapException.CODE_AMAP_CLIENT_UPLOADAUTO_STARTED_ERROR), 0);
        map.put(2002, 0);
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_SCORE.value()), 0);
        map.put(50001, 0);
        map.put(2104, 3);
        map.put(Integer.valueOf(HiHealthDataType.d), 3);
        map.put(2103, 3);
        map.put(2109, 3);
    }

    public static int a(int i) {
        Map<Integer, Integer> map = d;
        if (map.containsKey(Integer.valueOf(i))) {
            return map.get(Integer.valueOf(i)).intValue();
        }
        return -1;
    }
}
