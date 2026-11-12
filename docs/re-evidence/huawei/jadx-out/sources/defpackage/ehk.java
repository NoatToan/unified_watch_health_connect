package defpackage;

import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeExtendedSubData;
import com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ehk implements RopeDataFactory {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, BaseRopeData> f32981c;

    static {
        HashMap map = new HashMap();
        f32981c = map;
        map.put(5, new RopeExtendedSubData());
    }

    @Override // com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory
    public BaseRopeData createRopeData(int i, int i2, boolean z) {
        BaseRopeData baseRopeDataA = f32981c.get(Integer.valueOf(i));
        if (z) {
            baseRopeDataA = a(baseRopeDataA);
        }
        if (baseRopeDataA == null) {
            return baseRopeDataA;
        }
        baseRopeDataA.setCode(i2);
        baseRopeDataA.setCommand(i);
        baseRopeDataA.setSubcontracting(true);
        baseRopeDataA.setRopeConfigCommand(false);
        return baseRopeDataA;
    }

    private BaseRopeData a(BaseRopeData baseRopeData) {
        if (baseRopeData instanceof RopeExtendedSubData) {
            return new RopeExtendedSubData();
        }
        LogUtil.a("RopeControlSubFactory", "Unmatched Type");
        return null;
    }
}
