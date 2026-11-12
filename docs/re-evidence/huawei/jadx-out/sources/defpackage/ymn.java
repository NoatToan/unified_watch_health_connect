package defpackage;

import com.huawei.wearengine.sensor.Sensor;

/* JADX INFO: loaded from: classes46.dex */
public class ymn {
    public static int d(String str) {
        return yme.d(str, "getFrequencyType", "FrequencyType", 2);
    }

    public static void e(Sensor sensor, int i) {
        if (sensor != null) {
            sensor.setExtendJson(yme.d(sensor.getExtendJson(), "setFrequencyType", "FrequencyType", Integer.valueOf(i)));
        }
    }
}
