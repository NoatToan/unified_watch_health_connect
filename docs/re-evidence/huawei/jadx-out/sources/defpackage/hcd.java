package defpackage;

import com.huawei.health.device.model.HealthDevice;
import com.huawei.hihealth.CharacteristicConstant;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class hcd {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map f36391c = new HashMap();
    public static Map e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static List f36390a = new ArrayList();
    public static List d = new ArrayList();

    static {
        f36391c.put(264, HealthDevice.HealthDeviceKind.HDK_TREADMILL);
        Map map = f36391c;
        Integer numValueOf = Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE);
        map.put(numValueOf, HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE);
        Map map2 = f36391c;
        Integer numValueOf2 = Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE);
        map2.put(numValueOf2, HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE);
        Map map3 = f36391c;
        Integer numValueOf3 = Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER);
        map3.put(numValueOf3, HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE);
        e.put(264, Integer.valueOf(CharacteristicConstant.DeviceType.TYPE_TREADMILL_INDEX.getDeviceTypeValue()));
        e.put(numValueOf, Integer.valueOf(CharacteristicConstant.DeviceType.TYPE_INDOORBIKE_INDEX.getDeviceTypeValue()));
        e.put(numValueOf2, Integer.valueOf(CharacteristicConstant.DeviceType.TYPE_ROWER_INDEX.getDeviceTypeValue()));
        e.put(numValueOf3, Integer.valueOf(CharacteristicConstant.DeviceType.TYPE_CROSSTRAINER_INDEX.getDeviceTypeValue()));
        f36390a.add(Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_OTHER_SPORT));
        d.add(257);
        d.add(258);
        d.add(259);
    }
}
