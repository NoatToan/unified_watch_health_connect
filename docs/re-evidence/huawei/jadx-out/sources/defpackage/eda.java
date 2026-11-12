package defpackage;

import com.huawei.health.devicemgr.api.phoneprocess.SampleSequenceAfterProcess;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class eda {
    private static final Map<Integer, SampleSequenceAfterProcess> d = new LinkedHashMap(16);

    static {
        a();
    }

    public static SampleSequenceAfterProcess d(int i) {
        return d.get(Integer.valueOf(i));
    }

    private static void a() {
        Map<Integer, SampleSequenceAfterProcess> map = d;
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ARRHYTHMIA_PPG_TYPE.value()), new pff());
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_DETAILS.value()), new qea());
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICAL_EXAM_REPORT.value()), new pfd());
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ONE_SECOND_SPORT_DATA_TYPE.value()), new qej());
    }

    public static void e(Integer num, SampleSequenceAfterProcess sampleSequenceAfterProcess) {
        Map<Integer, SampleSequenceAfterProcess> map = d;
        if (map.containsKey(num)) {
            return;
        }
        map.put(num, sampleSequenceAfterProcess);
    }
}
