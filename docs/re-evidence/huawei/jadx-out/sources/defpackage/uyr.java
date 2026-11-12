package defpackage;

import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.ui.main.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class uyr {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap<String, Integer> f50749c = new HashMap<String, Integer>() { // from class: uyr.3
        {
            put("SLEEP_DURATION", 0);
            put("BED_TIME", 1);
            put("SLEEP_LATENCY", 2);
            put("SLEEP_EFFICIENCY", 3);
            put("DEEP_RATIO", 4);
            put("SHALLOW_RATIO", 5);
            put("REM_RATIO", 6);
            put("DEEP_CONT", 7);
            put("AWAKE_NUMS", 8);
            put("STABLE_SLEEP_RATIO_ALERT", 9);
            put("BREATH_QUALITY", 10);
            put("GO_BED_TIME", 11);
            put("FALL_ASLEEP_TIME", 12);
            put("WAKE_UP_TIME", 13);
            put("RISING_TIME", 14);
            put("GO_BED_REGULARITY", 15);
            put("OFF_BED_REGULARITY", 16);
            put("SLEEP_HEART_RATE", 17);
            put("SLEEP_BLOOD_OX", 18);
            put("SLEEP_BREATH_RATIO", 19);
            put("TRUSLEEP_FIVE_HEART_RATE", 20);
            put("TRUSLEEP_FIVE_HRV", 21);
            put("TRUSLEEP_FIVE_SpO2", 22);
            put("TRUSLEEP_FIVE_BREATH_RATE", 23);
            put("NOON_SLEEP", 24);
            put("TOTAL_SLEEP", 25);
            put("WAKE_UP_FEELING", 26);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f50748b = new HashMap<Integer, Integer>() { // from class: uyr.4
        {
            put(0, -1);
            put(1, uyr.f50749c.get("REM_RATIO"));
            put(2, uyr.f50749c.get("AWAKE_NUMS"));
            put(3, uyr.f50749c.get("REM_RATIO"));
            put(4, uyr.f50749c.get("DEEP_RATIO"));
            put(5, uyr.f50749c.get("SLEEP_DURATION"));
            put(6, -1);
            put(7, uyr.f50749c.get("DEEP_CONT"));
            put(8, uyr.f50749c.get("SLEEP_DURATION"));
            put(9, -1);
            put(10, uyr.f50749c.get("SLEEP_EFFICIENCY"));
            put(11, uyr.f50749c.get("SLEEP_LATENCY"));
            put(12, uyr.f50749c.get("REM_RATIO"));
            put(13, uyr.f50749c.get("REM_RATIO"));
            put(14, uyr.f50749c.get("DEEP_RATIO"));
            put(15, uyr.f50749c.get("STABLE_SLEEP_RATIO_ALERT"));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f50747a = {22101, 22102, 22103, 22104, 22105, 22107, 22106};
    public static final int[] e = {22001, 22002, 22003};
    public static final int[] d = {DicDataTypeUtil.DataType.SLEEP_DETAILS.value(), DicDataTypeUtil.DataType.ENVIRONMENT_NOISE_TYPE.value()};
    public static final Map<String, Integer> i = new HashMap<String, Integer>() { // from class: uyr.2
        {
            put("TRUSLEEP_FIVE_HEART_RATE", Integer.valueOf(R.string.IDS_trusleep_five_avg_heart_rate_title));
            put("TRUSLEEP_FIVE_BREATH_RATE", Integer.valueOf(R.string.IDS_trusleep_five_avg_breath_rate_title));
            put("TRUSLEEP_FIVE_HRV", Integer.valueOf(R.string.IDS_trusleep_five_avg_hrv_title));
            put("TRUSLEEP_FIVE_SpO2", Integer.valueOf(R.string.IDS_trusleep_five_avg_spo2_title));
        }
    };
    public static final Map<String, Integer> j = new HashMap<String, Integer>() { // from class: uyr.1
        {
            put("TRUSLEEP_FIVE_HEART_RATE", Integer.valueOf(R.string.IDS_heart_rate_switch_description));
            put("TRUSLEEP_FIVE_BREATH_RATE", -1);
            put("TRUSLEEP_FIVE_HRV", -1);
            put("TRUSLEEP_FIVE_SpO2", Integer.valueOf(R.string.IDS_spo2_switch_description));
        }
    };
    public static final Map<String, Integer> g = new HashMap<String, Integer>() { // from class: uyr.5
        {
            put("TRUSLEEP_FIVE_HEART_RATE", Integer.valueOf(R.plurals.IDS_base_line_frequency_min));
            put("TRUSLEEP_FIVE_BREATH_RATE", Integer.valueOf(R.plurals.IDS_base_line_frequency_brpm));
            put("TRUSLEEP_FIVE_HRV", Integer.valueOf(R.plurals.IDS_base_line_frequency_millisecond));
            put("TRUSLEEP_FIVE_SpO2", Integer.valueOf(R.string.IDS_base_line_percent));
        }
    };
    public static final Map<String, Integer[]> f = new HashMap<String, Integer[]>() { // from class: uyr.10
        {
            put("TRUSLEEP_FIVE_HEART_RATE", new Integer[]{40, 120});
            put("TRUSLEEP_FIVE_BREATH_RATE", new Integer[]{1, 80});
            put("TRUSLEEP_FIVE_HRV", new Integer[]{1, 200});
            put("TRUSLEEP_FIVE_SpO2", new Integer[]{90, 100});
        }
    };
    public static final Map<String, Integer> h = new HashMap<String, Integer>() { // from class: uyr.8
        {
            put("TRUSLEEP_FIVE_HEART_RATE", Integer.valueOf(R.plurals.IDS_trusleep_five_title_unit_min));
            put("TRUSLEEP_FIVE_BREATH_RATE", Integer.valueOf(R.plurals.IDS_trusleep_five_title_unit_brpm));
            put("TRUSLEEP_FIVE_HRV", Integer.valueOf(R.plurals.IDS_trusleep_five_title_unit_millisecond));
            put("TRUSLEEP_FIVE_SpO2", -1);
        }
    };
}
