package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes19.dex */
public final class wia {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f52075a = "BloodOxygenHelper";

    public static boolean g(int i) {
        return i != Integer.MIN_VALUE && i >= 2500;
    }

    public static SpannableString e(Context context, String str, String str2, int i, int i2) {
        if (context == null) {
            LogUtil.j(f52075a, "getSpannableString context == null");
            return new SpannableString("");
        }
        return UnitUtil.b(context, str, str2, i, i2);
    }

    public static int e() {
        return R.style.privacy_blood_oxygen_value_normal;
    }

    public static int c(int i) {
        int iA = wua.a(i);
        if (iA == 2) {
            return R.style.privacy_blood_oxygen_value_Low;
        }
        if (iA == 1) {
            return R.style.privacy_blood_oxygen_value_little_Low;
        }
        return R.style.privacy_blood_oxygen_value_normal;
    }

    public static int e(int i) {
        int iA = wua.a(i);
        if (iA == 2) {
            return R.style.privacy_blood_oxygen_num_low;
        }
        if (iA == 1) {
            return R.style.privacy_blood_oxygen_num_little_Low;
        }
        return R.style.privacy_blood_oxygen_num_normal;
    }

    public static int d(int i) {
        int iA = wua.a(i);
        if (iA == 2) {
            return R.style.privacy_blood_oxygen_unit_low;
        }
        if (iA == 1) {
            return R.style.privacy_blood_oxygen_unit_little_Low;
        }
        return R.style.privacy_blood_oxygen_unit_normal;
    }

    public static int a(int i) {
        int iIntValue = wua.f52491c.get(Integer.valueOf(i)).intValue();
        if (iIntValue == 3) {
            return R.style.privacy_highland_risk_num_high;
        }
        if (iIntValue == 2) {
            return R.style.privacy_highland_risk_num_medium;
        }
        if (iIntValue == 1) {
            return R.style.privacy_highland_risk_num_Low;
        }
        return R.style.privacy_highland_risk_num_normal;
    }

    public static int f(int i) {
        int iIntValue = wua.f52491c.get(Integer.valueOf(i)).intValue();
        if (iIntValue == 3) {
            return R.style.privacy_highland_risk_unit_high;
        }
        if (iIntValue == 2) {
            return R.style.privacy_highland_risk_unit_medium;
        }
        if (iIntValue == 1) {
            return R.style.privacy_highland_risk_unit_Low;
        }
        return R.style.privacy_highland_risk_unit_normal;
    }

    public static String b(int i) {
        Context context = BaseApplication.getContext();
        if (i == 1002) {
            return context.getString(R.string.IDS_hw_health_blood_oxygen_lower_spo2);
        }
        return context.getString(R.string.IDS_hw_show_main_permission_blood_oxygen);
    }

    public static Drawable i(int i) {
        Context context = BaseApplication.getContext();
        int iIntValue = wua.f52491c.get(Integer.valueOf(i)).intValue();
        if (iIntValue == 3) {
            return context.getDrawable(R.drawable.tab_risk_level_high);
        }
        if (iIntValue == 2) {
            return context.getDrawable(R.drawable.tab_risk_level_middle);
        }
        if (iIntValue == 1) {
            return context.getDrawable(R.drawable.tab_risk_level_mild);
        }
        return context.getDrawable(R.drawable.tab_risk_level_normal);
    }
}
