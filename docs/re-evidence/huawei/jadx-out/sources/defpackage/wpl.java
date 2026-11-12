package defpackage;

import com.huawei.ui.main.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class wpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Integer> f52312a;

    static {
        HashMap map = new HashMap(10);
        f52312a = map;
        map.put("HeartRateConstructor", Integer.valueOf(R.string.IDS_health_no_data_heart_rate));
        f52312a.put("SleepCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_sleep));
        f52312a.put("WeightCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_weight));
        f52312a.put("StressCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_pressure));
        f52312a.put("BloodSugarCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_blood_sugar));
        f52312a.put("BloodPressureCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_blood_pressure));
        f52312a.put("BloodOxygenCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_blood_oxygen_saturation));
        f52312a.put("BodyTemperatureCardConstructor", Integer.valueOf(R.string.IDS_health_no_data_body_temperature));
    }

    public static String b(String str, String str2) {
        return wpk.b(a(str) + str2);
    }

    public static String a(String str) {
        return b(str);
    }

    public static String b(String str) {
        return phs.d + "ux_model_res" + File.separator + str + File.separator;
    }
}
