package defpackage;

import com.huawei.health.ecologydevice.fitness.datastruct.BaseRopeData;
import com.huawei.health.ecologydevice.fitness.datastruct.RopeExtendedSingleData;
import com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class ehf implements RopeDataFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, BaseRopeData> f32977b;

    static {
        HashMap map = new HashMap();
        f32977b = map;
        map.put(5, new RopeExtendedSingleData());
    }

    @Override // com.huawei.health.ecologydevice.fitness.factory.RopeDataFactory
    public BaseRopeData createRopeData(int i, int i2, boolean z) {
        BaseRopeData baseRopeDataB = f32977b.get(Integer.valueOf(i));
        if (z) {
            baseRopeDataB = b(baseRopeDataB);
        }
        if (baseRopeDataB == null) {
            return baseRopeDataB;
        }
        baseRopeDataB.setCode(i2);
        baseRopeDataB.setCommand(i);
        baseRopeDataB.setSubcontracting(false);
        baseRopeDataB.setRopeConfigCommand(false);
        return baseRopeDataB;
    }

    private BaseRopeData b(BaseRopeData baseRopeData) {
        if (baseRopeData instanceof RopeExtendedSingleData) {
            return new RopeExtendedSingleData();
        }
        LogUtil.a("RopeControlSingleFactory", "Unmatched Type");
        return null;
    }
}
