package defpackage;

import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lqm {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static HashMap<String, Integer> f40632b = new HashMap<>(0);

    public static Map<String, Integer> b() {
        if (f40632b.isEmpty()) {
            f40632b.put("1", 0);
            f40632b.put(HealthZonePushReceiver.CYCLE_BLOOD_OXYGEN_NOTIFY, 0);
            f40632b.put("2", 1);
            f40632b.put("3", 1);
            f40632b.put("4", 1);
            f40632b.put("6", 1);
            f40632b.put("7", 1);
            f40632b.put(HealthZonePushReceiver.BODY_TEMPERATURE_HIGH_NOTIFY, 1);
            f40632b.put(HealthZonePushReceiver.BODY_TEMPERATURE_LOW_NOTIFY, 1);
            f40632b.put(HealthZonePushReceiver.DATA_POST_COMMENTS_NOTIFY, 1);
            f40632b.put(HealthZonePushReceiver.COMMENT_FAILED_NOTIFY, 1);
            f40632b.put("8", 2);
            f40632b.put("75", 2);
            f40632b.put("12", 3);
            f40632b.put("13", 3);
            f40632b.put("14", 3);
            f40632b.put("18", 3);
            f40632b.put("39", 3);
            f40632b.put(HealthZonePushReceiver.FAMILY_CARE_NOTIFY, 3);
            f40632b.put("15", 4);
            f40632b.put("16", 4);
            f40632b.put("17", 4);
            f40632b.put(HealthZonePushReceiver.SOS_LOCATION_NOTIFY, 4);
            f40632b.put("42", 4);
            f40632b.put("25", 6);
            f40632b.put(HealthZonePushReceiver.SLEEP_TIME_NOTIFY, 6);
            f40632b.put("46", 7);
            f40632b.put("47", 8);
            f40632b.put("19", 13);
            f40632b.put(HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY, 13);
            f40632b.put("21", 13);
            f40632b.put("22", 13);
            f40632b.put("23", 13);
            f40632b.put(HealthZonePushReceiver.ECG_MEASUREMENT_ABNORMAL, 13);
            f40632b.put("44", 13);
            f40632b.put("76", 13);
            f40632b.put("53", 15);
            f40632b.put("11", 18);
            f40632b.put("68", 18);
            f40632b.put("69", 18);
            f40632b.put("73", 18);
            f40632b.put("74", 18);
            f40632b.put("26", 19);
            f40632b.put("24", 32);
            f40632b.put(HealthZonePushReceiver.SLEEP_SCORE_NOTIFY, 33);
            f40632b.put("31", 34);
            f40632b.put(HealthZonePushReceiver.PRESSURE_NOTIFY, 35);
        }
        return f40632b;
    }
}
