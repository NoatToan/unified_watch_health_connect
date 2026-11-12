package defpackage;

import android.os.Bundle;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.UnitUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class hbw {
    private static boolean a(long j) {
        return j != Long.MIN_VALUE;
    }

    private static boolean b(int i) {
        return i != Integer.MIN_VALUE;
    }

    private static boolean e(int i) {
        return i > 0 && i < 255;
    }

    public static Bundle e(Map map, int i, boolean z) {
        Bundle bundle = new Bundle();
        if (map != null) {
            long jA = a(map, "TIME_ONE_SECOND_DURATION");
            if (a(jA)) {
                bundle.putString("duration", String.valueOf(UnitUtil.e(Math.round(jA / 1000.0f))));
            }
            int iE = e(map, "DISTANCE_DATA");
            if (b(iE)) {
                bundle.putString("distance", a(iE));
            }
            int iE2 = e(map, "SPEED_DATA");
            if (b(iE2)) {
                bundle.putString("speed", c(iE2));
            }
            int iE3 = e(map, "AVG_SPEED_DATA");
            if (b(iE3)) {
                bundle.putString("avgSpeed", c(iE3));
            }
            int iE4 = e(map, "MAX_SPEED_DATA");
            if (b(iE4)) {
                bundle.putString("maxSpeed", c(iE4));
            }
            int iE5 = e(map, "HEART_RATE_DATA");
            if (b(iE5)) {
                bundle.putString(IndoorEquipManagerApi.KEY_HEART_RATE, d(iE5));
            }
            int iE6 = e(map, "DESCENT_DATA");
            if (b(iE6)) {
                bundle.putString(BleConstants.TOTAL_DESCENT, iE6 < 0 ? "" : String.valueOf(iE6));
            }
            int iE7 = e(map, "CREEP_DATA");
            if (b(iE7)) {
                bundle.putString("totalCreep", iE7 >= 0 ? String.valueOf(iE7) : "");
            }
            int iE8 = e(map, "ALTITUDE_DATA");
            if (b(iE8)) {
                bundle.putString("altitude", String.valueOf(iE8));
            }
            d(map, bundle);
            bundle.putInt(BleConstants.SPORT_TYPE, i);
            if (z) {
                bundle.putBoolean("dataFromWear", true);
            }
        }
        return bundle;
    }

    private static void d(Map map, Bundle bundle) {
        int iE = e(map, "CALORIES_DATA");
        if (b(iE)) {
            bundle.putString("calorie", String.valueOf(iE));
        }
        int iE2 = e(map, "ACTIVE_CALORIES_DATA");
        if (b(iE2)) {
            bundle.putString(HwExerciseConstants.JSON_NAME_ACTIVECALORIE, String.valueOf(Math.round(iE2 / 1000.0f)));
        }
        int iE3 = e(map, "CADENCE_DATA");
        if (b(iE3)) {
            bundle.putInt("cadenceData", iE3);
        }
        int iE4 = e(map, "POWER_DATA");
        if (b(iE4)) {
            bundle.putInt("power", iE4);
        }
        int iE5 = e(map, "ANALOG_POWER_DATA");
        if (b(iE5)) {
            bundle.putInt(HwExerciseConstants.EXTEND_CYCLE_ANALOG_POWER, iE5);
        }
        int iE6 = e(map, "INCLINATION_DATA");
        if (b(iE6)) {
            bundle.putInt("slope", iE6);
        }
        a(map, bundle);
    }

    private static void a(Map map, Bundle bundle) {
        int iE = e(map, "ANALOG_CADENCE_DATA");
        if (b(iE)) {
            bundle.putInt(HwExerciseConstants.EXTEND_CYCLE_ANALOG_CADENCE, iE);
        }
        int iE2 = e(map, "THREE_SEC_POWER_DATA");
        if (b(iE2)) {
            bundle.putInt("threeSecPower", iE2);
        }
        int iE3 = e(map, "THREE_SEC_ANALOG_POWER_DATA");
        if (b(iE3)) {
            bundle.putInt("threeSecAnalogPower", iE3);
        }
        int iE4 = e(map, "AVG_POWER_DATA");
        if (b(iE4)) {
            bundle.putInt("avgPower", iE4);
        }
        int iE5 = e(map, "AVG_ANALOG_POWER_DATA");
        if (b(iE5)) {
            bundle.putInt("avgAnalogPower", iE5);
        }
        int iE6 = e(map, "AVG_CADENCE_DATA");
        if (b(iE6)) {
            bundle.putInt("avgCadence", iE6);
        }
        int iE7 = e(map, "AVG_ANALOG_CADENCE_DATA");
        if (b(iE7)) {
            bundle.putInt("avgAnalogCadence", iE7);
        }
        e(map, bundle);
    }

    private static void e(Map map, Bundle bundle) {
        int iE = e(map, "PACE_DATA");
        if (UnitUtil.f()) {
            iE = (int) UnitUtil.c(iE, 3);
        }
        if (iE >= 6000) {
            iE = 0;
        }
        if (b(iE)) {
            bundle.putString("pace", String.valueOf(iE));
        }
        int iE2 = e(map, "STEP_DATA");
        if (b(iE2)) {
            bundle.putString(MedalConstants.EVENT_STEPS, String.valueOf(iE2));
        }
        int iE3 = e(map, "STEP_RATE_DATA");
        if (b(iE3)) {
            bundle.putString("stepRate", String.valueOf(iE3));
        }
        double dC = c(map, "CONTACT_TIME_DATA");
        if (d(dC)) {
            bundle.putString("groundContactTime", String.valueOf(dC));
        }
        double dC2 = c(map, "GROUND_IMPACT_ACCELERATION_DATA");
        if (d(dC2)) {
            bundle.putString("mGroundImpactAcceleration", String.valueOf(dC2));
        }
        double dC3 = c(map, "EVERSION_EXCURSION_DATA");
        if (d(dC3)) {
            bundle.putString("eversion", String.valueOf(dC3));
        }
        double dC4 = c(map, "SWING_ANGLE_DATA");
        if (d(dC4)) {
            bundle.putString("swingAngle", String.valueOf(dC4));
        }
        double dC5 = c(map, "HANG_TIME_DATA");
        if (d(dC5)) {
            bundle.putString("hangTime", String.valueOf(dC5));
        }
        double dC6 = c(map, "GROUND_HANG_TIME_DATA");
        if (d(dC6)) {
            bundle.putString("flightRatio", String.valueOf(dC6 / 100.0d));
        }
        double dC7 = c(map, "GCTIME_BALANCE_DATA");
        if (d(dC7)) {
            bundle.putString("GCTimeBalance", String.valueOf(dC7));
        }
        double dC8 = c(map, "VERTICAL_OSCILLATION_DATA");
        if (d(dC8)) {
            bundle.putString("verticalOscillation", String.valueOf(dC8));
        }
        double dC9 = c(map, "VERTICAL_RATIO_DATA");
        if (d(dC9)) {
            bundle.putString("mVerticalRatio", String.valueOf(dC9 / 10.0d));
        }
        double dC10 = c(map, "ACTIVE_PEAK_DATA");
        if (d(dC10)) {
            bundle.putString("activePeak", String.valueOf(dC10));
        }
        double dC11 = c(map, "VERTICAL_LOADING_RATE_DATA");
        if (d(dC11)) {
            bundle.putString("verticalLoadingRate", String.valueOf(dC11));
        }
    }

    private static boolean d(double d) {
        return Math.abs(d - Double.MIN_VALUE) >= 9.999999974752427E-7d;
    }

    private static int e(Map map, String str) {
        return ((Integer) d(map, str, Integer.class, Integer.MIN_VALUE)).intValue();
    }

    private static double c(Map map, String str) {
        return ((Double) d(map, str, Double.class, Double.valueOf(Double.MIN_VALUE))).doubleValue();
    }

    private static long a(Map map, String str) {
        return ((Long) d(map, str, Long.class, Long.MIN_VALUE)).longValue();
    }

    private static <T> T d(Map map, String str, Class<T> cls, T t) {
        T t2 = (T) map.get(str);
        return (t2 == null || !cls.isInstance(t2)) ? t : t2;
    }

    private static String a(int i) {
        if (UnitUtil.f()) {
            return String.valueOf(UnitUtil.e(i / 1000.0f, 3));
        }
        return String.valueOf(i / 1000.0f);
    }

    private static String c(int i) {
        if (UnitUtil.f()) {
            return UnitUtil.e(UnitUtil.e(i / 100.0f, 3), 1, 2);
        }
        return UnitUtil.e(i / 100.0f, 1, 2);
    }

    private static String d(int i) {
        if (e(i)) {
            return String.valueOf(i);
        }
        return "";
    }
}
