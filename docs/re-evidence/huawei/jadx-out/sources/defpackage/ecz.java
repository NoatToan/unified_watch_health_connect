package defpackage;

import com.huawei.health.devicemgr.api.phoneprocess.SamplePointAfterProcess;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ecz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, SamplePointAfterProcess> f32768a = new LinkedHashMap(16);

    static {
        a();
    }

    public static SamplePointAfterProcess e(int i) {
        return f32768a.get(Integer.valueOf(i));
    }

    private static void a() {
        Map<Integer, SamplePointAfterProcess> map = f32768a;
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR.value()), new qgp());
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SPORT_GOAL_ACHIEVEMENT_DATA.value()), new qha());
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.AVERAGE_WRIST_TEMPERATURE_ALL_NIGHT.value()), new qgu());
    }
}
