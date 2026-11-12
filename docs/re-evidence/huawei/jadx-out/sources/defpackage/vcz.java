package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseIntArray;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes19.dex */
public class vcz {
    private static SparseIntArray d = new SparseIntArray();

    private static Resources a() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("HealthAnalysis", "getResources Context is null");
            return null;
        }
        return context.getResources();
    }

    private static void e() {
        d.clear();
        d.put(0, 0);
        d.put(1, 1);
        d.put(2, 2);
        d.put(4, 3);
        d.put(8, 6);
        d.put(5, 4);
        d.put(10, 8);
        d.put(6, 5);
        d.put(9, 7);
    }

    private static void b() {
        d.clear();
        d.put(0, 0);
        d.put(1, 1);
        d.put(2, 2);
        d.put(17, 10);
        d.put(33, 19);
        d.put(18, 11);
        d.put(34, 20);
        d.put(4, 3);
        d.put(8, 6);
        d.put(20, 12);
        d.put(36, 21);
        d.put(24, 15);
        d.put(40, 24);
        d.put(5, 4);
        d.put(10, 8);
        d.put(6, 5);
        d.put(22, 14);
        d.put(38, 23);
        d.put(9, 7);
        d.put(25, 16);
        d.put(41, 25);
        d.put(21, 13);
        d.put(37, 22);
        d.put(26, 17);
        d.put(42, 26);
        d.put(16, 9);
        d.put(32, 18);
    }

    private static String d(String[] strArr, int i) {
        int length = strArr.length;
        if (length <= 0 || i <= 0 || i > length) {
            return "";
        }
        return strArr[i - 1];
    }

    public static String d(int i, int i2) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyMassIndex Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_hw_weight_bmi_grade_low), resourcesA.getString(R.string.IDS_hw_weight_details_grade_standard), resourcesA.getString(R.string.IDS_hw_weight_details_grade_super_weight), resourcesA.getString(R.string.IDS_hw_weight_details_grade_fat)}, i2);
        }
        if (i == 1) {
            return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_body_mass_index), i2);
        }
        if (i != 2) {
            return "";
        }
        return d(resourcesA.getStringArray(R.array.IDS_analysis_suggest_body_mass_index), i2);
    }

    public static String i(int i, int i2) {
        return a(i, i2, 0);
    }

    public static String a(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getFatRate Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_weight_body_data_grade_low), resourcesA.getString(R.string.IDS_weight_body_data_grade_standard), resourcesA.getString(R.string.IDS_weight_body_data_slightly_high), resourcesA.getString(R.string.IDS_weight_body_data_high)}, i2);
        }
        if (i == 1) {
            if (exz.c(i3) && i2 == 4) {
                return resourcesA.getString(R.string.IDS_result_desc_fat_rate_child_high);
            }
            return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_fat_rate), i2);
        }
        if (i != 2) {
            return "";
        }
        if (exz.c(i3) && i2 == 4) {
            return resourcesA.getString(R.string.IDS_suggest_fat_rate_child_high);
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_fat_rate);
        stringArray[2] = String.format(stringArray[2], 30);
        return d(stringArray, i2);
    }

    public static String e(int i, int i2) {
        return d(i, i2, 0);
    }

    public static String d(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getFatFree Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{c(resourcesA.getString(R.string.IDS_weight_less), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_low)), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_standard), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_fat_free_mass_high)}, i2);
        }
        if (i == 1) {
            String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_fat_free);
            if (exz.c(i3)) {
                String[] stringArray2 = resourcesA.getStringArray(R.array.IDS_result_desc_fat_free_child);
                return d(new String[]{stringArray2[0], stringArray[1], stringArray2[1]}, i2);
            }
            return d(stringArray, i2);
        }
        if (i != 2) {
            return "";
        }
        String[] stringArray3 = resourcesA.getStringArray(R.array.IDS_analysis_suggest_fat_free);
        stringArray3[0] = String.format(stringArray3[0], 2, 3, 60);
        stringArray3[1] = String.format(stringArray3[1], 3, 30);
        return d(stringArray3, i2);
    }

    public static String j(int i, int i2) {
        return c(i, i2, 0);
    }

    public static String c(int i, int i2, int i3) {
        String[] stringArray;
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getMuscleMass Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_details_sleep_grade_low), resourcesA.getString(R.string.IDS_hw_weight_details_grade_standard), resourcesA.getString(R.string.IDS_weight_more)}, i2);
        }
        if (i == 1) {
            if (exz.c(i3)) {
                stringArray = resourcesA.getStringArray(R.array.IDS_result_desc_muscle_mass_child);
            } else {
                stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_muscle_mass);
            }
            return d(stringArray, i2);
        }
        if (i != 2) {
            return "";
        }
        String[] stringArray2 = resourcesA.getStringArray(R.array.IDS_analysis_suggest_muscle_mass);
        String str = stringArray2[0];
        String str2 = stringArray2[1];
        return d(new String[]{str, str2, str2}, i2);
    }

    public static String m(int i, int i2) {
        return i(i, i2, 0);
    }

    public static String i(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getSkeletalMuscle Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{c(resourcesA.getString(R.string.IDS_weight_less), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_low)), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_standard), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_skeletal_muscle_mass_high)}, i2);
        }
        if (i == 1) {
            String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_skeletal_muscle);
            if (exz.c(i3)) {
                String[] stringArray2 = resourcesA.getStringArray(R.array.IDS_result_desc_skeletal_muscle_child);
                return d(new String[]{stringArray2[0], stringArray[1], stringArray2[1]}, i2);
            }
            return d(stringArray, i2);
        }
        if (i != 2) {
            return "";
        }
        if (exz.c(i3)) {
            String[] stringArray3 = resourcesA.getStringArray(R.array.IDS_suggest_skeletal_muscle_child);
            String str = stringArray3[0];
            String str2 = stringArray3[1];
            return d(new String[]{str, str2, str2}, i2);
        }
        String[] stringArray4 = resourcesA.getStringArray(R.array.IDS_analysis_suggest_skeletal_muscle);
        stringArray4[0] = String.format(stringArray4[0], 3, 4, 7, 8);
        stringArray4[1] = String.format(stringArray4[1], 3, 4, 30, 2, 3);
        stringArray4[2] = String.format(stringArray4[2], 3, 4, 30, 60);
        return d(stringArray4, i2);
    }

    public static String o(int i, int i2) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getRelativeAppendicularSkeletalMuscle Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_details_sleep_grade_low), resourcesA.getString(R.string.IDS_hw_weight_details_grade_standard), resourcesA.getString(R.string.IDS_weight_higher)}, i2);
        }
        if (i == 1) {
            return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_relative_appendicular_skeletal_muscle), i2);
        }
        if (i != 2) {
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_relative_appendicular_skeletal_muscle);
        stringArray[0] = String.format(stringArray[0], 3, 4);
        stringArray[1] = String.format(stringArray[1], 4, 7, 9);
        if (LanguageUtil.aj(BaseApplication.getContext())) {
            stringArray[1] = "";
        }
        stringArray[2] = String.format(stringArray[2], 3, 4, 30, 60);
        return d(stringArray, i2);
    }

    public static String k(int i, int i2) {
        return f(i, i2, 0);
    }

    public static String f(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getVisceralFatGrade Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_weight_body_data_standard_health), resourcesA.getString(R.string.IDS_weight_body_data_standard_critical), resourcesA.getString(R.string.IDS_hw_health_index_slightly_high), resourcesA.getString(R.string.IDS_hw_health_index_high)}, i2);
        }
        if (i == 1) {
            String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_visceral_fat);
            if (exz.c(i3)) {
                String[] stringArray2 = resourcesA.getStringArray(R.array.IDS_result_desc_visceral_fat_child);
                return d(new String[]{stringArray2[0], stringArray2[1], stringArray[2], stringArray2[2]}, i2);
            }
            return d(stringArray, i2);
        }
        if (i != 2) {
            return "";
        }
        if (exz.c(i3)) {
            return d(resourcesA.getStringArray(R.array.IDS_suggest_visceral_fat_grade_child), i2);
        }
        String[] stringArray3 = resourcesA.getStringArray(R.array.IDS_analysis_suggest_visceral_fat_grade);
        stringArray3[2] = String.format(stringArray3[2], 3);
        return d(stringArray3, i2);
    }

    public static String l(int i, int i2) {
        return h(i, i2, 0);
    }

    public static String h(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getTotalBodyWater Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_low), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_standard), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_body_water_high)}, i2);
        }
        if (i == 1) {
            return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_total_body_water), i2);
        }
        if (i != 2) {
            return "";
        }
        if (exz.c(i3) && i2 == 1) {
            return resourcesA.getString(R.string.IDS_suggest_total_body_water_child_low);
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_total_body_water);
        stringArray[0] = String.format(stringArray[0], 1500);
        stringArray[1] = String.format(stringArray[1], 1500);
        return d(stringArray, i2);
    }

    public static String f(int i, int i2) {
        return g(i, i2, 0);
    }

    public static String g(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getProtein Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{c(resourcesA.getString(R.string.IDS_weight_less), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_low)), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_standard), c(resourcesA.getString(R.string.IDS_weight_more), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_protein_high))}, i2);
        }
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            return d(resourcesA.getStringArray(R.array.IDS_analysis_suggest_protein), i2);
        }
        if (exz.c(i3) && i2 == 3) {
            return resourcesA.getString(R.string.IDS_result_desc_protein_child_high);
        }
        return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_protein), i2);
    }

    public static String a(int i, int i2) {
        return b(i, i2, 0);
    }

    public static String b(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBoneMineralContent Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{c(resourcesA.getString(R.string.IDS_weight_less), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_low)), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_standard), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_bone_mineral_content_high)}, i2);
        }
        if (i == 1) {
            if (exz.c(i3) && i2 == 1) {
                return resourcesA.getString(R.string.IDS_result_desc_bone_mineral_child_low);
            }
            return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_bone_mineral_content), i2);
        }
        if (i != 2) {
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_bone_mineral_content);
        String str = stringArray[0];
        String str2 = stringArray[1];
        return d(new String[]{str, str2, str2}, i2);
    }

    private static String c(String str, String str2) {
        return CommonUtil.ap() ? str : str2;
    }

    public static String b(int i, int i2) {
        return e(i, i2, 0);
    }

    public static String e(int i, int i2, int i3) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBasalMetabolicRate Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_low), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_standard), resourcesA.getString(R.string.IDS_hw_health_healthdata_body_data_basal_metabolic_rate_high)}, i2);
        }
        if (i == 1) {
            if (exz.c(i3) && i2 == 1) {
                return resourcesA.getString(R.string.IDS_result_desc_basal_metabolic_child_low);
            }
            return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_basal_metabolic_rate), i2);
        }
        if (i != 2) {
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_basal_metabolic_rate);
        stringArray[0] = String.format(stringArray[0], 3, 4, 30);
        stringArray[1] = String.format(stringArray[1], 3);
        return d(stringArray, i2);
    }

    public static String h(int i, int i2) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getHeartRate Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_hw_health_show_healthdata_status_low), resourcesA.getString(R.string.IDS_hw_health_show_healthdata_status_normal), resourcesA.getString(R.string.IDS_hw_health_index_slightly_high), resourcesA.getString(R.string.IDS_hw_health_index_high)}, i2);
        }
        if (i != 1) {
            return "";
        }
        return d(resourcesA.getStringArray(R.array.IDS_analysis_result_description_heart_rate), i2);
    }

    public static String n(int i, int i2) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getWaistToHipRatio Resources is null");
            return "";
        }
        if (i == 0) {
            return d(new String[]{resourcesA.getString(R.string.IDS_details_sleep_grade_normal), resourcesA.getString(R.string.IDS_details_sleep_grade_high)}, i2);
        }
        if (i == 1) {
            return d(e(resourcesA.getStringArray(R.array.IDS_analysis_result_waist_to_hip_ratio)), i2);
        }
        if (i != 2) {
            return "";
        }
        return d(e(resourcesA.getStringArray(R.array.IDS_analysis_result_waist_to_hip_ratio_recommendation)), i2);
    }

    private static String[] e(String[] strArr) {
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            strArr2[i] = strArr[(strArr.length - i) - 1];
        }
        return strArr2;
    }

    public static String g(int i, int i2) {
        if (i == 0) {
            return d(new String[]{qre.f(R.string.IDS_hw_pressure_relaxed), qre.f(R.string.IDS_hw_pressure_normal), qre.f(R.string.IDS_hw_show_card_pressure_measure_calibrate_grade_item_3), qre.f(R.string.IDS_hw_pressure_highly)}, i2);
        }
        return "";
    }

    public static String f(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getSkeletalMuscleBalanceEvaluation Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_skeletal_muscle_balance_brief);
        switch (i) {
            case 1:
            case 2:
            case 17:
            case 18:
            case 33:
            case 34:
                return stringArray[1];
            case 3:
            case 7:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            case 23:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 35:
            case 39:
            default:
                return stringArray[0];
            case 4:
            case 8:
            case 20:
            case 24:
            case 36:
            case 40:
                return stringArray[2];
            case 5:
            case 6:
            case 9:
            case 10:
            case 21:
            case 22:
            case 25:
            case 26:
            case 37:
            case 38:
            case 41:
            case 42:
                return stringArray[3];
            case 16:
                return stringArray[4];
            case 32:
                return stringArray[5];
        }
    }

    public static String h(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getSkeletalMuscleBalanceResultDescription Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_skeletal_muscle_balance_detail);
        b();
        return stringArray[d.get(i)];
    }

    public static String m(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getSkeletalMuscleBalanceSuggest Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_skeletal_muscle_balance);
        if (i == 0) {
            return stringArray[0];
        }
        return stringArray[1];
    }

    public static String i(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getFatBalanceEvaluation Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_fat_balance_brief);
        switch (i) {
            case 1:
            case 2:
                return stringArray[1];
            case 3:
            case 7:
            default:
                return stringArray[0];
            case 4:
            case 8:
                return stringArray[2];
            case 5:
            case 6:
            case 9:
            case 10:
                return stringArray[3];
        }
    }

    public static String j(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getFatBalanceResultDescription Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_fat_balance_detail);
        e();
        return stringArray[d.get(i)];
    }

    public static String e(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyShapeEvaluation Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_weight_well_proportioned_type);
        }
        if (i == 1) {
            return resourcesA.getString(R.string.IDS_weight_apple_type);
        }
        if (i == 2) {
            return resourcesA.getString(R.string.IDS_weight_pear_type);
        }
        if (i == 3) {
            return resourcesA.getString(R.string.IDS_weight_chili_type);
        }
        if (i == 4) {
            return resourcesA.getString(R.string.IDS_weight_inverted_triangle_type);
        }
        if (i != 5) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_weight_hourglass_type);
    }

    public static String c(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyShapeResultDescription Resources is null");
            return "";
        }
        if (i == 1) {
            return resourcesA.getString(R.string.IDS_analysis_result_description_body_shape_apple);
        }
        if (i == 2) {
            return resourcesA.getString(R.string.IDS_analysis_result_description_body_shape_pear);
        }
        if (i == 3) {
            return resourcesA.getString(R.string.IDS_analysis_result_description_body_shape_chili);
        }
        if (i != 5) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_analysis_result_description_body_shape_hourglass);
    }

    public static String a(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyShapeSuggest Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_analysis_suggest_body_shape_well_proportioned);
        }
        if (i == 1) {
            return resourcesA.getString(R.string.IDS_analysis_suggest_body_shape_apple);
        }
        if (i == 2) {
            return resourcesA.getString(R.string.IDS_analysis_suggest_body_shape_pear);
        }
        if (i == 3) {
            return resourcesA.getString(R.string.IDS_analysis_suggest_body_shape_chili);
        }
        if (i == 4) {
            return resourcesA.getString(R.string.IDS_analysis_suggest_body_shape_inverted_triangle);
        }
        if (i != 5) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_analysis_suggest_body_shape_hourglass);
    }

    public static String d(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyTypeEvaluation Resources is null");
            return "";
        }
        switch (i) {
            case 1:
                return resourcesA.getString(R.string.IDS_hw_weight_body_type_thin);
            case 2:
                return resourcesA.getString(R.string.IDS_hw_weight_body_type_thin_muscle);
            case 3:
                return resourcesA.getString(R.string.IDS_hw_weight_body_type_multi_muscle);
            case 4:
                return resourcesA.getString(R.string.IDS_analysis_result_description_body_type_underactive);
            case 5:
                return resourcesA.getString(R.string.IDS_hw_weight_body_type_stand);
            case 6:
                return resourcesA.getString(R.string.IDS_hw_weight_body_type_muscle);
            case 7:
                return resourcesA.getString(R.string.IDS_analysis_result_description_body_type_recessive_obesity);
            case 8:
                return resourcesA.getString(R.string.IDS_analysis_result_description_body_type_obese);
            case 9:
                return resourcesA.getString(R.string.IDS_analysis_result_description_body_type_obese_muscle_type);
            default:
                return "";
        }
    }

    public static String b(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyTypeResultDescription Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_result_description_body_type_low_standard);
        String[] stringArray2 = resourcesA.getStringArray(R.array.IDS_analysis_result_description_body_type_standard);
        String[] stringArray3 = resourcesA.getStringArray(R.array.IDS_analysis_result_description_body_type_super_standard);
        switch (i) {
            case 1:
                return stringArray[0];
            case 2:
                return stringArray[1];
            case 3:
                return stringArray[2];
            case 4:
                return stringArray2[0];
            case 5:
                return stringArray2[1];
            case 6:
                return stringArray2[2];
            case 7:
                return stringArray3[0];
            case 8:
                return stringArray3[1];
            case 9:
                return stringArray3[2];
            default:
                return "";
        }
    }

    public static String g(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthAnalysis", "getBodyTypeSuggest Resources is null");
            return "";
        }
        String[] stringArray = resourcesA.getStringArray(R.array.IDS_analysis_suggest_body_type_low_standard);
        String[] stringArray2 = resourcesA.getStringArray(R.array.IDS_analysis_suggest_body_type_standard);
        String[] stringArray3 = resourcesA.getStringArray(R.array.IDS_analysis_suggest_body_type_super_standard);
        switch (i) {
            case 1:
                return stringArray[0];
            case 2:
            case 3:
                return stringArray[1];
            case 4:
                return stringArray2[0];
            case 5:
            case 6:
                return stringArray2[1];
            case 7:
                return stringArray3[0];
            case 8:
            case 9:
                return stringArray3[1];
            default:
                return "";
        }
    }

    public static String c(int i, int i2) {
        if (a() == null) {
            LogUtil.j("HealthAnalysis", "getBodyType Resources is null");
            return "";
        }
        if (i == 0) {
            return d(i2);
        }
        if (i == 1) {
            return b(i2);
        }
        if (i != 2) {
            return "";
        }
        return g(i2);
    }
}
