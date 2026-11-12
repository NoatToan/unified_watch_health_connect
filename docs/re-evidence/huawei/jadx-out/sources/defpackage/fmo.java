package defpackage;

import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.SharedPreferenceManager;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public class fmo {
    public static Set<String> a() {
        HashSet hashSet = new HashSet();
        hashSet.add("BMI");
        hashSet.add("weightCardClicks3Month");
        hashSet.add("weightUpload3Month");
        hashSet.add("sleepCardClicks3Month");
        hashSet.add("sleepUpload3Month");
        hashSet.add("heartRateCardClicks3Month");
        hashSet.add("heartRateUpload3Month");
        hashSet.add("bloodOxygenCardClicks3Month");
        hashSet.add("bloodOxygenUpload3Month");
        return hashSet;
    }

    public static boolean e(String str) {
        if (str.contains(Constants.PARAM_SERVER_SPLIT)) {
            for (String str2 : str.split(Constants.PARAM_SERVER_SPLIT)) {
                if (!c(str2)) {
                    return false;
                }
            }
            return true;
        }
        if (str.contains("||")) {
            for (String str3 : str.split("\\|\\|")) {
                if (c(str3)) {
                    return true;
                }
            }
            return false;
        }
        return c(str);
    }

    private static boolean c(String str) {
        if (str.contains("==")) {
            flk flkVarB = b(str, "==");
            if (flkVarB == null) {
                return false;
            }
            return a(flkVarB.c(), flkVarB.e());
        }
        if (str.contains("!=")) {
            flk flkVarB2 = b(str, "!=");
            if (flkVarB2 == null) {
                return false;
            }
            return j(flkVarB2.c(), flkVarB2.e());
        }
        if (str.contains(HiDataFilter.DataFilterExpression.BIGGER_EQUAL)) {
            flk flkVarB3 = b(str, HiDataFilter.DataFilterExpression.BIGGER_EQUAL);
            if (flkVarB3 == null) {
                return false;
            }
            return h(flkVarB3.c(), flkVarB3.e());
        }
        if (str.contains(HiDataFilter.DataFilterExpression.LESS_EQUAL)) {
            flk flkVarB4 = b(str, HiDataFilter.DataFilterExpression.LESS_EQUAL);
            if (flkVarB4 == null) {
                return false;
            }
            return c(flkVarB4.c(), flkVarB4.e());
        }
        if (str.contains(HiDataFilter.DataFilterExpression.BIGGER_THAN)) {
            flk flkVarB5 = b(str, HiDataFilter.DataFilterExpression.BIGGER_THAN);
            if (flkVarB5 == null) {
                return false;
            }
            return b(flkVarB5.c(), flkVarB5.e());
        }
        if (str.contains(HiDataFilter.DataFilterExpression.LESS_THAN)) {
            flk flkVarB6 = b(str, HiDataFilter.DataFilterExpression.LESS_THAN);
            if (flkVarB6 == null) {
                return false;
            }
            return e(flkVarB6.c(), flkVarB6.e());
        }
        LogUtil.a("UserLabelCloudRuleUtil", "is not match rule");
        return false;
    }

    private static flk b(String str, String str2) {
        String[] strArrSplit = str.split(str2);
        if (strArrSplit.length < 2) {
            return null;
        }
        try {
            return new flk(strArrSplit[0], Float.parseFloat(strArrSplit[1]));
        } catch (NumberFormatException unused) {
            LogUtil.e("UserLabelCloudRuleUtil", strArrSplit[1], "splitRule is invalid");
            return null;
        }
    }

    private static boolean a(String str, float f) {
        float fA = a(str);
        return ((double) Math.abs(fA - 0.0f)) >= 1.0E-6d && ((double) Math.abs(fA - f)) < 1.0E-6d;
    }

    private static boolean j(String str, float f) {
        float fA = a(str);
        return ((double) Math.abs(fA - 0.0f)) >= 1.0E-6d && ((double) Math.abs(fA - f)) > 1.0E-6d;
    }

    private static boolean h(String str, float f) {
        float fA = a(str);
        return ((double) Math.abs(fA - 0.0f)) >= 1.0E-6d && fA >= f;
    }

    private static boolean c(String str, float f) {
        float fA = a(str);
        return ((double) Math.abs(fA - 0.0f)) >= 1.0E-6d && fA <= f;
    }

    private static boolean b(String str, float f) {
        float fA = a(str);
        return ((double) Math.abs(fA - 0.0f)) >= 1.0E-6d && fA > f;
    }

    private static boolean e(String str, float f) {
        float fA = a(str);
        return ((double) Math.abs(fA - 0.0f)) >= 1.0E-6d && fA < f;
    }

    public static void d(int i, int i2, int i3, int i4) {
        LogUtil.a("UserLabelCloudRuleUtil", "enter saveClickCount ", Integer.valueOf(i), ", ", Integer.valueOf(i2), ", ", Integer.valueOf(i3), ", ", Integer.valueOf(i4));
        d("weightCardClicks3Month", i);
        d("sleepCardClicks3Month", i2);
        d("heartRateCardClicks3Month", i3);
        d("bloodOxygenCardClicks3Month", i4);
    }

    public static void e(int i, int i2) {
        LogUtil.a("UserLabelCloudRuleUtil", "type ", Integer.valueOf(i), ", count ", Integer.valueOf(i2));
        if (i == 2004) {
            d("weightUpload3Month", i2);
            return;
        }
        if (i == 44004) {
            d("sleepUpload3Month", i2);
        } else if (i == 46016) {
            d("heartRateUpload3Month", i2);
        } else {
            if (i != 47201) {
                return;
            }
            d("bloodOxygenUpload3Month", i2);
        }
    }

    public static void d(String str, float f) {
        SharedPreferenceManager.c("userLabelValue", str, f);
    }

    private static float a(String str) {
        if (SharedPreferenceManager.e("userLabelValue", str)) {
            return SharedPreferenceManager.a("userLabelValue", str, 0.0f);
        }
        return 0.0f;
    }
}
