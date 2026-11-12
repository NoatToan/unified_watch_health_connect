package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.health.healthmodel.bean.PictureBean;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import com.huawei.ui.main.stories.fitness.activity.coresleep.SleepJsApi;
import health.compact.a.LanguageUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class uck {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f49933c = BaseApplication.getContext().getResources().getColor(R.color.core_sleep_normal_tip_color);
    private static int e = BaseApplication.getContext().getResources().getColor(R.color.weight_tips_color_5);
    private static int d = BaseApplication.getContext().getResources().getColor(R.color.color_FF46B1E3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f49932b = qre.e(R.color.blood_pressure_low_end);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f49931a = qre.e(R.color.color_selected_manual_sleep);

    public static boolean g() {
        return ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "CoreSleepUtils") == null && mgi.d("CoreSleepUtils") == null;
    }

    public static boolean j() {
        DeviceCapability deviceCapabilityC = eej.c();
        return deviceCapabilityC != null && deviceCapabilityC.isSupportCoreSleep();
    }

    public static String c(Context context, String str) {
        if (context == null) {
            LogUtil.j("CoreSleepUtils", "getDataFromSharedPreference context is null");
            return "";
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("coreSleepRemindSP", 0);
        if (sharedPreferences == null) {
            return "";
        }
        return sharedPreferences.getString(str, "default_value");
    }

    public static void d(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("CoreSleepUtils", "setDataToSharedPreference context is null");
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("coreSleepRemindSP", 0).edit();
        if (editorEdit != null) {
            editorEdit.putString(str, str2);
            editorEdit.apply();
        }
    }

    public static String e(Context context, int i, boolean z) {
        switch (i) {
            case 71:
                if (z) {
                    return context.getString(R.string.IDS_details_sleep_grade_late);
                }
                return context.getString(R.string.IDS_details_sleep_grade_high);
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                if (z) {
                    return context.getString(R.string.IDS_details_sleep_grade_early);
                }
                return context.getString(R.string.IDS_details_sleep_grade_low);
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return context.getString(R.string.IDS_details_sleep_grade_normal_1);
            default:
                return "";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:81:0x0104  */
    public static String e(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("CoreSleepUtils", "getStatusText type ", str);
            return "";
        }
        str.hashCode();
        switch (str) {
            case "TYPE_DEEP_SLEEP_CONTINUITY":
            case "TYPE_SLEEP_EFFICIENCY":
            case "TYPE_WAKE_UP_REGULAR":
            case "TYPE_BREATH_QUALITY":
            case "TYPE_FALL_GO_TO_BED_REGULAR":
                return c(i);
            case "TYPE_STABLE_SLEEP":
            case "TYPE_DEEP_SLEEP":
            case "TYPE_LIGHT_SLEEP":
            case "TYPE_SLUM_SLEEP_RATE":
                return f(i);
            case "TYPE_NIGHT_SLEEP_TIME":
            case "TYPE_SLEEP_TIME":
            case "TYPE_SLEEP_LATENCY_TIME":
            case "TYPE_SLEEP_BED_TIME":
                return j(i);
            case "TRUSLEEP_FIVE_HRV":
            case "TRUSLEEP_FIVE_HEART_RATE":
            case "TRUSLEEP_FIVE_SpO2":
            case "TRUSLEEP_FIVE_BREATH_RATE":
                return i(i);
            case "TYPE_WAKE_UP_TIMES":
                return g(i);
            default:
                ReleaseLogUtil.c("CoreSleepUtils", "getStatusText type ", str);
                return "";
        }
    }

    private static String c(int i) {
        switch (i) {
            case 71:
                return qre.f(R.string.IDS_details_sleep_grade_high);
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return qre.f(R.string.IDS_details_sleep_grade_low);
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return qre.f(R.string.IDS_details_sleep_grade_normal);
            default:
                ReleaseLogUtil.c("CoreSleepUtils", "getStatusText status ", Integer.valueOf(i));
                return qre.f(R.string.IDS_physiological_index_invalid);
        }
    }

    private static String f(int i) {
        switch (i) {
            case 71:
                return qre.f(R.string.IDS_details_sleep_grade_high_1);
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return qre.f(R.string.IDS_details_sleep_grade_low_1);
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return qre.f(R.string.IDS_details_sleep_grade_normal_1);
            default:
                ReleaseLogUtil.c("CoreSleepUtils", "getStatusText1 status ", Integer.valueOf(i));
                return qre.f(R.string.IDS_physiological_index_invalid);
        }
    }

    private static String g(int i) {
        switch (i) {
            case 71:
                return qre.f(R.string.IDS_details_sleep_grade_high_2);
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return qre.f(R.string.IDS_details_sleep_grade_low_2);
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return qre.f(R.string.IDS_details_sleep_grade_normal);
            default:
                ReleaseLogUtil.c("CoreSleepUtils", "getStatusText2 status ", Integer.valueOf(i));
                return qre.f(R.string.IDS_physiological_index_invalid);
        }
    }

    private static String j(int i) {
        switch (i) {
            case 71:
                return qre.f(R.string.IDS_hwh_runningstyle_longer);
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return qre.f(R.string.IDS_hwh_runningstyle_shorter);
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return qre.f(R.string.IDS_details_sleep_grade_normal);
            default:
                ReleaseLogUtil.c("CoreSleepUtils", "getStatusText3 status ", Integer.valueOf(i));
                return qre.f(R.string.IDS_physiological_index_invalid);
        }
    }

    private static String i(int i) {
        switch (i) {
            case 71:
                return qre.f(R.string.IDS_physiological_index_high);
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return qre.f(R.string.IDS_physiological_index_low);
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return qre.f(R.string.IDS_physiological_index_normal);
            default:
                ReleaseLogUtil.c("CoreSleepUtils", "getTruSleepFiveStatusText status ", Integer.valueOf(i));
                return "";
        }
    }

    public static int e(int i) {
        switch (i) {
            case 71:
                return e;
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return d;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return f49933c;
            default:
                return 0;
        }
    }

    public static int a(int i) {
        switch (i) {
            case 71:
            case ExerciseSessionRecord.EXERCISE_TYPE_SURFING /* 72 */:
                return f49931a;
            case ExerciseSessionRecord.EXERCISE_TYPE_SWIMMING_OPEN_WATER /* 73 */:
                return f49932b;
            default:
                return 0;
        }
    }

    public static String e(CharSequence[] charSequenceArr) {
        Context context = BaseApplication.getContext();
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (LanguageUtil.t(context)) {
            while (i < charSequenceArr.length - 1) {
                int i2 = i + 1;
                sb.append(context.getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, Integer.valueOf(i2)));
                sb.append(" ");
                sb.append(charSequenceArr[i]);
                sb.append("\n");
                i = i2;
            }
            sb.append(context.getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, Integer.valueOf(charSequenceArr.length)));
            sb.append(" ");
            sb.append(charSequenceArr[charSequenceArr.length - 1]);
            return sb.toString();
        }
        while (i < charSequenceArr.length - 1) {
            int i3 = i + 1;
            sb.append(context.getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, Integer.valueOf(i3)));
            sb.append(charSequenceArr[i]);
            sb.append("\n");
            i = i3;
        }
        sb.append(context.getResources().getString(R.string.IDS_fitness_core_sleep_reference_14, Integer.valueOf(charSequenceArr.length)));
        sb.append(charSequenceArr[charSequenceArr.length - 1]);
        return sb.toString();
    }

    public static String b(String str, String str2) {
        String strB = wud.b(BaseApplication.getContext());
        String string = BaseApplication.getContext().getString(R.string.IDS_sleep_referece_title_string);
        if (LanguageUtil.br(BaseApplication.getContext()) || LanguageUtil.x(BaseApplication.getContext())) {
            StringBuilder sb = new StringBuilder(str2);
            Locale locale = Locale.ROOT;
            sb.append(strB);
            sb.append(str);
            return String.format(locale, string, sb);
        }
        if (LanguageUtil.t(BaseApplication.getContext()) || LanguageUtil.bc(BaseApplication.getContext())) {
            return String.format(Locale.ROOT, string + " ", str + strB + str2);
        }
        return String.format(Locale.ROOT, string, str + strB + str2);
    }

    public static String a(double d2, int i) {
        Context context = BaseApplication.getContext();
        if (LanguageUtil.br(context) || LanguageUtil.x(context) || LanguageUtil.bs(context)) {
            StringBuilder sb = new StringBuilder(UnitUtil.e(d2, 1, 0));
            sb.insert(0, "%");
            return sb.toString();
        }
        return UnitUtil.e(d2, 2, i);
    }

    public static String e(int i, double d2, double d3) {
        String strE;
        String strA;
        if (LanguageUtil.bq(BaseApplication.getContext())) {
            strE = a(d2, 0);
            strA = UnitUtil.e(d3, 1, 0);
        } else {
            strE = UnitUtil.e(d2, 1, 0);
            strA = a(d3, 0);
        }
        return qre.a(i, strE, strA);
    }

    public static String b(int i, int i2, int i3) {
        if (i3 == 0) {
            return a(i, i2);
        }
        if (i3 == 1) {
            return c(i, i2);
        }
        if (i3 == 2) {
            return e(i, i2);
        }
        if (i3 == 3) {
            return b(i, i2);
        }
        if (i3 == 4) {
            return b(i2);
        }
        LogUtil.e("CoreSleepUtils", "error type: ", Integer.valueOf(i3));
        return "";
    }

    private static String a(int i, int i2) {
        return qre.a(R.string.IDS_sleep_referece_title_string, qre.a(R.string.IDS_details_sleep_between_points, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0)));
    }

    private static String c(int i, int i2) {
        return qre.a(R.string.IDS_sleep_referece_title_string, qre.a(R.string.IDS_details_sleep_between_times, UnitUtil.e(i, 1, 0), UnitUtil.e(i2, 1, 0)));
    }

    private static String e(int i, int i2) {
        String strA;
        String strE = UnitUtil.e(i, 1, 0);
        String strE2 = UnitUtil.e(i2, 1, 0);
        if (i == 6 && i2 == 10.5f) {
            strA = qre.a(R.string.IDS_details_sleep_between_hours, strE, Integer.valueOf(i2));
        } else {
            strA = qre.a(R.string.IDS_member_sleep_add_record, strE, strE2);
        }
        return qre.a(R.string.IDS_sleep_referece_title_string, strA);
    }

    private static String b(int i, int i2) {
        return qre.a(R.string.IDS_sleep_referece_title_string, e(R.string.IDS_base_line_percent, i, i2));
    }

    private static String b(int i) {
        return qre.a(R.string.IDS_sleep_referece_title_string, qre.a(R.string.IDS_sleep_range_less_than_min, UnitUtil.e(i, 1, 0)));
    }

    public static void c(Context context) {
        H5ProClient.getServiceManager().registerService(SleepJsApi.class);
        if (context == null) {
            LogUtil.j("CoreSleepUtils", "jumpToManualEntry: context is null");
        } else {
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.sleepdetection", new H5ProLaunchOption.Builder().addPath("#/sleepDataInput?pullFrom=1").addCustomizeJsModule("innerapi", ddv.b().getCommonJsModule("innerapi")).addCustomizeJsModule("SleepDetection", pjo.b().getJsModule()).setForceDarkMode(1).setImmerse().showStatusBar().setStatusBarTextBlack(true));
        }
    }

    public static ImageBean d() {
        return d(6);
    }

    public static ImageBean e() {
        return d(101);
    }

    public static ImageBean f() {
        return d(100);
    }

    public static Bitmap b() {
        return a(d());
    }

    public static Bitmap c() {
        return a(e());
    }

    public static Bitmap a() {
        return a(f());
    }

    private static Bitmap a(ImageBean imageBean) {
        if (imageBean == null) {
            return qqf.c(com.huawei.ui.commonui.R.drawable.health_life_background);
        }
        for (PictureBean pictureBean : imageBean.getPictureList()) {
            if (pictureBean.getScenario() == 100) {
                return qqf.f(pictureBean.getPath());
            }
        }
        return qqf.c(com.huawei.ui.commonui.R.drawable.health_life_background);
    }

    private static ImageBean d(int i) {
        for (ImageBean imageBean : ffv.e("1")) {
            if (imageBean.getId() == i) {
                return imageBean;
            }
        }
        return null;
    }

    public static List<Integer> h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(3);
        arrayList.add(2);
        return arrayList;
    }
}
