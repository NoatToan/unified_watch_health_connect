package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.core.content.ContextCompat;
import com.huawei.ecologydevice.R;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.health.ecologydevice.open.data.model.IBloodSugar;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.utils.StringUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class emq extends HealthData implements IBloodSugar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f33201a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f33202c;
    private int d = 0;

    /* JADX WARN: Code duplicated, block: B:14:0x001d A[RETURN] */
    public static short a(int i, float f) {
        switch (i) {
            case 2008:
            case 2010:
            case 2012:
                if (f < 6.1f) {
                    return (short) 1;
                }
                return (short) 2;
            case 2009:
            case 2011:
            case 2013:
                return f < 8.8f ? (short) 1 : (short) 2;
            default:
                if (f < 8.0f) {
                    return (short) 1;
                }
                return (short) 2;
        }
    }

    private static boolean e(int i) {
        return i >= 8 && i < 10;
    }

    private static boolean f(int i) {
        return i >= 5 && i < 8;
    }

    private static boolean g(int i) {
        return i >= 12 && i < 16;
    }

    private static boolean h(int i) {
        return i >= 16 && i < 18;
    }

    private static boolean i(int i) {
        return i >= 0 && i < 5;
    }

    private static boolean j(int i) {
        return i >= 18 && i < 20;
    }

    private static boolean m(int i) {
        return i >= 20 && i < 24;
    }

    private static boolean n(int i) {
        return i >= 10 && i < 12;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IBloodSugar
    public float getBloodSugar() {
        return this.f33202c;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IBloodSugar
    public void setBloodSugar(float f) {
        this.f33202c = f;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IBloodSugar
    public void setSequenceNumber(int i) {
        this.f33201a = i;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IBloodSugar
    public int getSequenceNumber() {
        return this.f33201a;
    }

    @Override // com.huawei.health.ecologydevice.open.data.model.IBloodSugar
    public int getTimePeriod() {
        return this.d;
    }

    public static short c(int i, float f) {
        if (d(f)) {
            return HealthData.INVALID_VALUES_SHORT;
        }
        if (f < 4.4f) {
            return (short) 0;
        }
        return a(i, f);
    }

    public static int d(long j) {
        int iA = a(j);
        if (i(iA)) {
            return 2015;
        }
        if (f(iA)) {
            return 2008;
        }
        if (e(iA)) {
            return 2009;
        }
        if (n(iA)) {
            return 2010;
        }
        if (g(iA)) {
            return 2011;
        }
        if (h(iA)) {
            return 2012;
        }
        if (j(iA)) {
            return 2013;
        }
        if (m(iA)) {
            return 2014;
        }
        LogUtil.j("UIHLH_OPEN_BLOODSUGAR", "getGlucoseSubType period is not exist", Integer.valueOf(iA));
        return 2015;
    }

    public static int a(long j) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        calendar.setTimeInMillis(j);
        return calendar.get(11);
    }

    @Override // com.huawei.health.device.open.data.model.HealthData
    public String toString() {
        return "BloodSugar [mBloodSugar=" + this.f33202c + "mTimePeriod=" + this.d + super.toString() + "]";
    }

    public static int c(Context context, int i, float f) {
        if (context == null || f < 0.0f || f > 33.0f || Math.abs(f - Float.MIN_VALUE) < 1.0E-6d) {
            return 1000;
        }
        float fFloatValue = new BigDecimal(f).setScale(1, RoundingMode.HALF_UP).floatValue();
        if (fFloatValue <= 3.9f) {
            return 1001;
        }
        if (fFloatValue < 4.4f) {
            return 1002;
        }
        if (fFloatValue <= 7.0f && i == 2008) {
            return 1003;
        }
        if (fFloatValue > 10.0f || i == 2008) {
            return fFloatValue < 13.9f ? 1004 : 1005;
        }
        return 1003;
    }

    private static boolean d(float f) {
        return f < 0.0f || f > 100.0f || ((double) Math.abs(f - Float.MIN_VALUE)) < 1.0E-6d;
    }

    public static void a(String str, String str2) {
        SharedPreferenceManager.c("preference_module_blood_sugar", str, str2);
    }

    public static String b(String str) {
        return SharedPreferenceManager.b("preference_module_blood_sugar", str, "");
    }

    public static float[] d() {
        float[] fArr = {10.0f, 3.9f};
        String strB = SharedPreferenceManager.b("preference_module_blood_sugar", "BLOOD_SUGAR_CONTINUE_MAX_THRESHOLD", (String) null);
        if (StringUtils.j(strB)) {
            try {
                fArr[0] = Float.parseFloat(strB);
            } catch (NumberFormatException e) {
                LogUtil.e("UIHLH_OPEN_BLOODSUGAR", "Fail to parse blood sugar continue thresholds", e);
            }
        }
        String strB2 = SharedPreferenceManager.b("preference_module_blood_sugar", "BLOOD_SUGAR_CONTINUE_MIN_THRESHOLD", (String) null);
        if (StringUtils.j(strB2)) {
            try {
                fArr[1] = Float.parseFloat(strB2);
            } catch (NumberFormatException e2) {
                LogUtil.e("UIHLH_OPEN_BLOODSUGAR", "Fail to parse blood sugar continue thresholds", e2);
            }
        }
        return fArr;
    }

    public static List<Float> a(int i) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(4.4f));
        if (i == 2008) {
            arrayList.add(Float.valueOf(7.05f));
        } else {
            arrayList.add(Float.valueOf(10.05f));
        }
        arrayList.add(Float.valueOf(33.0f));
        return arrayList;
    }

    public static int[] b() {
        Context context = BaseApplication.getContext();
        return new int[]{ContextCompat.getColor(context, R.color.color_blood_low_light), ContextCompat.getColor(context, R.color.color_blood_normal_light), ContextCompat.getColor(context, R.color.color_blood_high_light), ContextCompat.getColor(context, R.color.color_blood_low), ContextCompat.getColor(context, R.color.color_blood_normal), ContextCompat.getColor(context, R.color.color_blood_high)};
    }

    public static void a(HealthTextView healthTextView, int i) {
        if (healthTextView == null) {
            LogUtil.j("UIHLH_OPEN_BLOODSUGAR", "setBloodSugarLevelTextAndColor, valueLevelView is null!");
        }
        Resources resources = BaseApplication.getContext().getResources();
        switch (i) {
            case 1001:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_low));
                healthTextView.setTextColor(resources.getColor(R.color.color_blood_low));
                break;
            case 1002:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_low));
                healthTextView.setTextColor(resources.getColor(R.color.color_blood_low));
                break;
            case 1003:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal));
                healthTextView.setTextColor(resources.getColor(R.color.color_blood_normal));
                break;
            case 1004:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_high));
                healthTextView.setTextColor(resources.getColor(R.color.color_blood_high));
                break;
            case 1005:
                healthTextView.setText(resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high));
                healthTextView.setTextColor(resources.getColor(R.color.color_blood_high));
                break;
        }
    }

    public static String b(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        switch (i) {
            case 1000:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_value_error);
            case 1001:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_low);
            case 1002:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_low);
            case 1003:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_normal);
            case 1004:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_overall_high);
            case 1005:
                return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_status_too_high);
            default:
                return "";
        }
    }

    public static String d(int i) {
        Resources resources = BaseApplication.getContext().getResources();
        if (i != 2106) {
            switch (i) {
                case 2008:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_breakfast);
                case 2009:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_breakfast);
                case 2010:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_lunch);
                case 2011:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_lunch);
                case 2012:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_dinner);
                case 2013:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_dinner);
                case 2014:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep);
                case 2015:
                    return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_early_morning);
                default:
                    LogUtil.e("UIHLH_OPEN_BLOODSUGAR", "unsupported timePeriod = ", Integer.valueOf(i));
                    return "";
            }
        }
        return resources.getString(R.string.IDS_hw_show_healthdata_bloodsugar_random_time);
    }

    public static String c(int i) {
        Context context = BaseApplication.getContext();
        Float fValueOf = Float.valueOf(10.0f);
        Float fValueOf2 = Float.valueOf(4.4f);
        switch (i) {
            case 2008:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_limosis_range, fValueOf2, Float.valueOf(7.0f));
            case 2009:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_breakfast_range, fValueOf2, fValueOf);
            case 2010:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_lunch_range, fValueOf2, fValueOf);
            case 2011:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_lunch_range, fValueOf2, fValueOf);
            default:
                return c(i, context);
        }
    }

    private static String c(int i, Context context) {
        Float fValueOf = Float.valueOf(10.0f);
        Float fValueOf2 = Float.valueOf(4.4f);
        switch (i) {
            case 2012:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_dinner_range, fValueOf2, fValueOf);
            case 2013:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_after_dinner_range, fValueOf2, fValueOf);
            case 2014:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_before_sleep_range, fValueOf2, fValueOf);
            case 2015:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_night_range, fValueOf2, fValueOf);
            default:
                return context.getString(R.string.IDS_hw_show_healthdata_bloodsugar_random_range, fValueOf2, fValueOf);
        }
    }
}
