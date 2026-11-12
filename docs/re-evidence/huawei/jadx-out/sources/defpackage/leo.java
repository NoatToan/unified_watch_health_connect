package defpackage;

import android.content.ContentValues;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.type.HiHealthDataType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.HiCommonUtil;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class leo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, String> f39991c;

    static {
        HashMap map = new HashMap();
        f39991c = map;
        map.put(46018, "RestingHeartRate");
        map.put(47203, BleConstants.BLOOD_OXYGEN);
        map.put(2034, "Stress");
        map.put(44105, "AllSleepTime");
        map.put(40002, "Step");
        map.put(47101, "ExerciseIntensity");
        map.put(40003, "Calorie");
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.ACTIVE_HOUR_IS_ACTIVE_COUNT.value()), "ActiveHour");
    }

    public static int[] d(int i) {
        if (i == 30029) {
            return new int[]{30001};
        }
        if (HiHealthDataType.d(i) == HiHealthDataType.Category.SET) {
            return HiHealthDataType.e(i);
        }
        return new int[]{i};
    }

    public static void c(ContentValues contentValues, String str, String str2) {
        if (contentValues == null || !contentValues.containsKey(str)) {
            return;
        }
        boolean zContainsKey = contentValues.containsKey(str2);
        double dDoubleValue = zContainsKey ? contentValues.getAsDouble(str2).doubleValue() : 0.0d;
        Double asDouble = contentValues.getAsDouble(str);
        asDouble.doubleValue();
        contentValues.put(str2, asDouble);
        if (zContainsKey) {
            contentValues.put(str, Double.valueOf(dDoubleValue));
        } else {
            contentValues.remove(str);
        }
    }

    public static double a(HiHealthData hiHealthData) {
        double d = hiHealthData.getDouble("protein");
        if (d != 0.0d) {
            return d;
        }
        double d2 = hiHealthData.getDouble("bodyWeight");
        double d3 = hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
        double d4 = hiHealthData.getDouble(BleConstants.BONE_SALT);
        double d5 = hiHealthData.getDouble(BleConstants.MOISTURE);
        if (d3 == 0.0d || d4 == 0.0d || d5 == 0.0d) {
            return 0.0d;
        }
        return HiCommonUtil.a(d2, d3, d5, d4);
    }

    public static List<String> e(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            Map<Integer, String> map = f39991c;
            if (map.containsKey(Integer.valueOf(i))) {
                arrayList.add(map.get(Integer.valueOf(i)));
            }
        }
        LogUtil.a("HiHealthKitDataConverter", "trendDataType2FieldName result: ", HiJsonUtil.d(arrayList));
        return arrayList;
    }

    public static Set<Integer> b() {
        return Collections.unmodifiableSet(f39991c.keySet());
    }
}
