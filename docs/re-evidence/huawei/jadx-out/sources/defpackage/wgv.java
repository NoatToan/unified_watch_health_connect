package defpackage;

import android.content.res.Resources;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.main.R;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.Locale;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes19.dex */
public class wgv {
    public static String g(int i) {
        double d = i;
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hwh_me_other_target_steps, vdo.b(d), UnitUtil.e(d, 1, 0));
    }

    public static String d(double d) {
        double dE;
        int i;
        if (d < 0.0d) {
            d = 0.0d;
        }
        if (d < 100.0d) {
            if (UnitUtil.f()) {
                dE = UnitUtil.e(d, 1);
                i = R.plurals.IDS_ft_string;
            } else {
                StringBuilder sb = new StringBuilder();
                String string = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
                String strE = UnitUtil.e(d, 1, 0);
                if (LanguageUtil.aj(BaseApplication.getContext())) {
                    sb.append(string);
                    sb.append(" ");
                    sb.append(strE);
                } else {
                    sb.append(strE);
                    sb.append(" ");
                    sb.append(string);
                }
                return sb.toString();
            }
        } else {
            dE = d / 1000.0d;
            if (UnitUtil.f()) {
                dE = UnitUtil.e(dE, 3);
                i = R.plurals.IDS_hw_show_sport_kms_string_en;
            } else {
                i = R.plurals.IDS_hwh_motiontrack_show_use_time_km;
            }
        }
        String strE2 = UnitUtil.e(dE, 1, 2);
        return BaseApplication.getContext().getResources().getQuantityString(i, vdo.b(dE), strE2 + " ");
    }

    public static String e(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        double d = f / 10.0f;
        if (UnitUtil.f()) {
            double d2 = UnitUtil.g(d)[0];
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_ft_string, vdo.b(d2), UnitUtil.e(d2, 1, 1));
        }
        String strE = UnitUtil.e(d, 1, 1);
        StringBuilder sb = new StringBuilder();
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            sb.append(string);
            sb.append(" ");
            sb.append(strE);
        } else {
            sb.append(strE);
            sb.append(" ");
            sb.append(string);
        }
        return sb.toString();
    }

    public static String e(double d, boolean z) {
        String strB = vei.b(d, 1);
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_average).toUpperCase(Locale.ROOT));
            sb.append(" ");
            sb.append(strB);
            return sb.toString();
        }
        sb.append(strB);
        return sb.toString();
    }

    public static String e(double d) {
        if (d < 100.0d) {
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_all_record_data_calorie_unit, vdo.b(d), UnitUtil.e(d, 1, 0));
        }
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_calorie_unit);
        return String.format(Locale.ROOT, "%1$s %2$s", UnitUtil.e(d / 1000.0d, 1, 2), string);
    }

    public static String i(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        try {
            String strE = qre.e(R.plurals.IDS_min_unit, i3, UnitUtil.e(i3, 1, 0));
            String strE2 = qre.e(R.plurals.IDS_hour_unit, i2, UnitUtil.e(i2, 1, 0));
            StringBuilder sb = new StringBuilder();
            if (i2 == 0) {
                sb.append(strE);
            } else if (i3 == 0) {
                sb.append(strE2);
            } else {
                sb.append(BaseApplication.getContext().getString(R.string.IDS_two_parts, strE2, strE));
            }
            return sb.toString();
        } catch (MissingFormatArgumentException unused) {
            LogUtil.j("DataSourceUnitUtil", "getSleepTitle MissingFormatArgumentException");
            return "";
        }
    }

    public static String b(int i, boolean z) {
        String strA = wvb.a(i);
        StringBuilder sb = new StringBuilder();
        String strE = UnitUtil.e(i, 1, 0);
        if (z) {
            sb.append(BaseApplication.getContext().getResources().getString(R.string.IDS_hw_health_show_healthdata_weight_average).toUpperCase(Locale.ROOT));
            sb.append(" ");
            sb.append(strE);
        } else {
            sb.append(strE);
        }
        return String.format(Locale.ROOT, "%1$s %2$s", sb.toString(), strA);
    }

    public static String e(int i, int i2) {
        String str;
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            str = BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string) + " %1$s - %2$s";
        } else {
            str = "%1$s - %2$s " + BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string);
        }
        return String.format(Locale.ROOT, str, UnitUtil.e(i2, 1, 0), UnitUtil.e(i, 1, 0));
    }

    public static String b(int i) {
        return String.format(Locale.ROOT, "%1$s " + BaseApplication.getContext().getResources().getString(R.string.IDS_main_watch_heart_rate_unit_string), UnitUtil.e(i, 1, 0));
    }

    public static String d(int i, int i2) {
        return String.format(Locale.ROOT, "%1$s-%2$s", UnitUtil.e(i2, 2, 0), UnitUtil.e(i, 2, 0));
    }

    public static String c(int i) {
        return UnitUtil.e(i, 2, 0);
    }

    public static String a(int i, int i2) {
        return BaseApplication.getContext().getResources().getString(R.string.IDS_health_blood_oxygen_range_two, UnitUtil.e(i2, 2, 0), UnitUtil.e(i, 2, 0));
    }

    public static String d(String str) {
        StringBuilder sb = new StringBuilder();
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_device_measure_pressure_value_unit);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            sb.append(string);
            sb.append(" ");
            sb.append(str);
        } else {
            sb.append(str);
            sb.append(" ");
            sb.append(string);
        }
        return sb.toString();
    }

    public static String b(double d) {
        String strE = UnitUtil.e(d, 1, 1);
        StringBuilder sb = new StringBuilder();
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_device_measure_sugar_value_unit);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            sb.append(string);
            sb.append(strE);
        } else {
            sb.append(strE);
            sb.append(string);
        }
        return sb.toString();
    }

    public static String c(double d, double d2) {
        String strA;
        String strA2;
        if (UnitUtil.a()) {
            strA = UnitUtil.e(d, 1, 1);
            strA2 = UnitUtil.e(d2, 1, 1);
        } else {
            strA = a((float) d);
            strA2 = a((float) d2);
        }
        return String.format(Locale.ROOT, BaseApplication.getContext().getResources().getString(UnitUtil.a() ? R.string.IDS_settings_health_temperature_unit : R.string.IDS_temp_unit_fahrenheit), strA2 + Constants.LINK + strA);
    }

    public static String d(double d, int i) {
        String strA;
        int i2;
        Resources resources = BaseApplication.getContext().getResources();
        if (UnitUtil.a()) {
            strA = UnitUtil.e(d, 1, 1);
            i2 = R.string.IDS_settings_health_temperature_unit;
        } else {
            strA = a((float) d);
            i2 = R.string.IDS_temp_unit_fahrenheit;
        }
        String str = String.format(resources.getString(i2), strA);
        if (DicDataTypeUtil.DataType.SUSPECTED_HIGH_TEMPERATURE.value() != i) {
            return str;
        }
        return String.format(resources.getString(R.string.IDS_temp_desc_suspect), String.format(resources.getString(R.string.IDS_hw_health_blood_oxygen_measure_interval_greater_than), str));
    }

    public static String c(double d) {
        return d(d, 0);
    }

    private static String a(float f) {
        return UnitUtil.e((f * 1.8f) + 32.0f, 1, 1);
    }

    public static String a(int i) {
        if (i == Integer.MIN_VALUE || i == 0) {
            return "--";
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hw_pulse_unit, i, Integer.valueOf(i));
    }

    public static String e(int i) {
        if (i == Integer.MIN_VALUE) {
            return String.valueOf(Integer.MIN_VALUE);
        }
        if (UnitUtil.f()) {
            int i2 = UnitUtil.g(i)[0];
            return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_ft_string, vdo.b(i2), String.valueOf(i2));
        }
        String strE = UnitUtil.e(i, 1, 0);
        StringBuilder sb = new StringBuilder();
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_fitness_data_list_activity_meter_unit);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            sb.append(string);
            sb.append(strE);
        } else if (LanguageUtil.be(BaseApplication.getContext()) || LanguageUtil.s(BaseApplication.getContext())) {
            sb.append(strE);
            sb.append(" ");
            sb.append(string);
        } else {
            sb.append(strE);
            sb.append(string);
        }
        return sb.toString();
    }

    public static String d(int i) {
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_hw_health_blood_oxygen_score, i, Integer.valueOf(i));
    }
}
