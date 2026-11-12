package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public class vcw {
    private static Resources a() {
        Context context = BaseApplication.getContext();
        if (context == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getResources Context is null");
            return null;
        }
        return context.getResources();
    }

    public static String j(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBodyWeight Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_health_show_healthdata_weight);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_body_weight) + System.lineSeparator() + resourcesA.getString(R.string.IDS_hw_ideal_weight_des);
    }

    public static String a(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBodyMassIndex Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_BMI);
        }
        if (i != 1) {
            return "";
        }
        if (UnitUtil.f()) {
            return String.format(resourcesA.getString(R.string.IDS_hw_weight_bmi_des_imp), 703);
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_body_mass_index);
    }

    public static String h(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getFatRate Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_health_show_healthdata_bodyfat_rate);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_fat_rate);
    }

    public static String i(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getFatFree Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_weight_fat_free);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_fat_free);
    }

    public static String q(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getVisceralFatGrade Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_haslet);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_visceral_fat_grade);
    }

    public static String k(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getMuscleMass Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_muscle);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_muscle_mass);
    }

    public static String n(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getSkeletalMuscle Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_skeletal_muscle_mass);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_skeletal_muscle);
    }

    public static String o(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getRelativeAppendicularSkeletalMuscle Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_weight_limb_skeletal_muscle_index);
        }
        if (i != 1) {
            return "";
        }
        return String.format(resourcesA.getString(R.string.IDS_knowledge_definition_relative_appendicular_skeletal_muscle), UnitUtil.e(7.0d, 1, 1), UnitUtil.e(6.0d, 1, 1));
    }

    public static String s(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getTotalBodyWater Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_water);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_total_body_water);
    }

    public static String l(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getProtein Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_protein);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_protein);
    }

    public static String f(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBoneMineralContent Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_bone);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_bone_mineral_content);
    }

    public static String d(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBasalMetabolicRate Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_metabolism);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_basal_metabolic_rate);
    }

    public static String g(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getHeartRate Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_main_watch_heart_rate_string);
        }
        if (i != 1) {
            return "";
        }
        return String.format(resourcesA.getString(R.string.IDS_knowledge_definition_heart_rate), 60, 100, 50);
    }

    public static String e(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBodyAge Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_bodyage);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_body_age);
    }

    public static String c(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBodyType Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_weight_body_type);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_body_type);
    }

    public static String b(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getBodyShape Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_weight_body_shape);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_knowledge_definition_body_shape);
    }

    public static String p(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getWaistToHipRatio Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_weight_spectral_waist_to_hip_ratio);
        }
        if (i != 1) {
            return "";
        }
        return String.format(resourcesA.getString(R.string.IDS_knowledge_definition_waist_to_hip_ratio), UnitUtil.e(0.9d, 1, 1), UnitUtil.e(0.85d, 1, 2));
    }

    public static String m(int i) {
        Resources resourcesA = a();
        if (resourcesA == null) {
            LogUtil.j("HealthBodyCompositionKnowledge", "getPressureIndex Resources is null");
            return "";
        }
        if (i == 0) {
            return resourcesA.getString(R.string.IDS_hw_show_pressure_index);
        }
        if (i != 1) {
            return "";
        }
        return resourcesA.getString(R.string.IDS_hw_weight_pressure_des);
    }
}
