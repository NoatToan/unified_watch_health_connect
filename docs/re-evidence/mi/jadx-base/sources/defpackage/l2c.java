package defpackage;

import android.content.Context;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.common.utils.AppUtil;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class l2c {
    public static int a(int i) {
        kp5 kp5VarA = ul5.c().a(i);
        if (kp5VarA != null) {
            return kp5VarA.c;
        }
        return 0;
    }

    public static String b(int i) {
        return c(AppUtil.getApp(), i);
    }

    public static String c(Context context, int i) {
        try {
            return context.getString(d(i));
        } catch (Exception unused) {
            return "";
        }
    }

    public static int d(int i) {
        kp5 kp5VarA = ul5.c().a(i);
        if (kp5VarA != null) {
            return kp5VarA.f24128b;
        }
        return 0;
    }

    @NotNull
    public static HomeDataType e(int i) {
        if (i == 402) {
            return HomeDataType.ECG_MEDICAL;
        }
        if (i == 403) {
            return HomeDataType.BLOOD_SUGAR;
        }
        if (i == 10000) {
            return HomeDataType.WEIGHT;
        }
        if (i == 30000) {
            return HomeDataType.TODAY_HEALTH;
        }
        switch (i) {
            case 2:
                return HomeDataType.CALORIE;
            case 3:
                return HomeDataType.STEP;
            case 4:
                return HomeDataType.HR;
            case 5:
                return HomeDataType.VALID_STAND;
            case 6:
                return HomeDataType.SLEEP;
            case 7:
                return HomeDataType.STRESS;
            case 8:
                return HomeDataType.ENERGY;
            case 9:
                return HomeDataType.WOMEN_HEALTH;
            case 10:
                return HomeDataType.PAI;
            default:
                switch (i) {
                    case 12:
                        return HomeDataType.V02_MAX;
                    case 13:
                        return HomeDataType.SPO2;
                    case 14:
                        return HomeDataType.RAINBOW;
                    case 15:
                        return HomeDataType.MH_STRENGTH;
                    case 16:
                        return HomeDataType.BLOOD_PRESSURE;
                    case 17:
                        return HomeDataType.HEARING_HEALTH;
                    default:
                        switch (i) {
                            case 20:
                                return HomeDataType.TRAINING_LOAD;
                            case 21:
                                return HomeDataType.TEMPERATURE;
                            case 22:
                                return HomeDataType.RUNNING_INDICATOR;
                            case 23:
                                return HomeDataType.VITALITY;
                            case 24:
                                return HomeDataType.PHYSICAL_STATUS;
                            default:
                                return HomeDataType.UNKNOWN;
                        }
                }
        }
    }
}
