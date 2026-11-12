package defpackage;

import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.fitness.datastruct.ExclusivePlayListData;
import com.huawei.health.ecologydevice.fitness.datastruct.LogOperationsData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeModeSettingData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeVoiceCourseOperationsData;
import com.huawei.health.ecologydevice.fitness.datastruct.SettingStatusData;
import com.huawei.health.ecologydevice.fitness.datastruct.SwitchStatusData;
import com.huawei.health.ecologydevice.fitness.datastruct.VideoCourseOperationsData;
import com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ehi implements RopeDataFactory {
    private static final Map<Integer, BaseRopeData> d;

    static {
        HashMap map = new HashMap();
        d = map;
        map.put(1, new SwitchStatusData());
        map.put(2, new SettingStatusData());
        map.put(3, new RopeModeSettingData());
        map.put(4, new RopeVoiceCourseOperationsData());
        map.put(5, new VideoCourseOperationsData());
        map.put(6, new LogOperationsData());
        map.put(7, new ExclusivePlayListData());
    }

    @Override // com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory
    public BaseRopeData createRopeData(int i, int i2, boolean z) {
        BaseRopeData baseRopeDataC = d.get(Integer.valueOf(i));
        if (z) {
            baseRopeDataC = c(baseRopeDataC);
        }
        if (baseRopeDataC == null) {
            return baseRopeDataC;
        }
        baseRopeDataC.setCode(i2);
        baseRopeDataC.setCommand(i);
        baseRopeDataC.setSubcontracting(true);
        baseRopeDataC.setRopeConfigCommand(true);
        return baseRopeDataC;
    }

    private BaseRopeData c(BaseRopeData baseRopeData) {
        if (baseRopeData instanceof SwitchStatusData) {
            return new SwitchStatusData();
        }
        if (baseRopeData instanceof SettingStatusData) {
            return new SettingStatusData();
        }
        if (baseRopeData instanceof RopeModeSettingData) {
            return new RopeModeSettingData();
        }
        if (baseRopeData instanceof RopeVoiceCourseOperationsData) {
            return new RopeVoiceCourseOperationsData();
        }
        if (baseRopeData instanceof VideoCourseOperationsData) {
            return new VideoCourseOperationsData();
        }
        if (baseRopeData instanceof LogOperationsData) {
            return new LogOperationsData();
        }
        if (baseRopeData instanceof ExclusivePlayListData) {
            return new ExclusivePlayListData();
        }
        LogUtil.a("RopeConfigSubFactory", "Unmatched Type");
        return null;
    }
}
