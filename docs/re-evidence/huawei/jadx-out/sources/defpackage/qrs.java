package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.Fragment;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.github.mikephil.charting.charts.Chart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.renderer.DataRenderer;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.os.SystemInfo;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.device.model.RecordAction;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.pluginvideo.media.MediaQueryHelper;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineChart;
import com.huawei.ui.commonui.linechart.common.HwHealthBaseBarLineDataSet;
import com.huawei.ui.commonui.linechart.common.HwHealthTransformer;
import com.huawei.ui.commonui.linechart.common.HwHealthYAxis;
import com.huawei.ui.commonui.searchview.HealthSearchView;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.commonui.webview.NetworkExceptionShowActivity;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.HarmonyBuild;
import health.compact.a.LanguageUtil;
import health.compact.a.ReflectionUtils;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class qrs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f46707a = "R_Utils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f46708c = "Utils";
    private static long e;

    static /* synthetic */ void a(View view) {
    }

    static /* synthetic */ void b(View view) {
    }

    public static int f() {
        return 160;
    }

    public static boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^\\d+(\\.\\d+)?$");
    }

    public static int e(Context context, float f) {
        float f2;
        if (context == null) {
            f2 = BaseApplication.getContext().getResources().getDisplayMetrics().density;
        } else {
            f2 = context.getResources().getDisplayMetrics().density;
        }
        return (int) ((f / f2) + 0.5f);
    }

    public static int d(Context context, float f) {
        if (context == null) {
            LogUtil.j(f46708c, "context is null");
            return 0;
        }
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    private static WindowInsetsCompat an(Context context) {
        Activity activityJ;
        if (context instanceof Activity) {
            activityJ = (Activity) context;
        } else {
            ReleaseLogUtil.d(f46707a, "getWindowInsetsCompat context ", context);
            activityJ = com.huawei.haf.application.BaseApplication.j();
        }
        if (activityJ == null) {
            ReleaseLogUtil.d(f46707a, "getWindowInsetsCompat activity is null");
            return null;
        }
        Window window = activityJ.getWindow();
        if (window == null) {
            ReleaseLogUtil.d(f46707a, "getWindowInsetsCompat window is null");
            return null;
        }
        WindowInsets rootWindowInsets = window.getDecorView().getRootWindowInsets();
        if (rootWindowInsets == null) {
            ReleaseLogUtil.d(f46707a, "getWindowInsetsCompat windowInsets is null");
            return null;
        }
        return WindowInsetsCompat.toWindowInsetsCompat(rootWindowInsets);
    }

    private static int c(Context context, boolean z) {
        int i;
        WindowInsetsCompat windowInsetsCompatAn = an(context);
        if (windowInsetsCompatAn == null) {
            i = 0;
        } else if (z) {
            i = windowInsetsCompatAn.getInsets(WindowInsetsCompat.Type.statusBars()).top;
        } else {
            i = windowInsetsCompatAn.getInsets(WindowInsetsCompat.Type.navigationBars()).bottom;
        }
        if (i > 0) {
            return i;
        }
        String str = f46707a;
        ReleaseLogUtil.d(str, "getSystemBarHeight getInsets systemBarHeight ", Integer.valueOf(i), " isStatusBar ", Boolean.valueOf(z));
        if (context == null) {
            context = com.huawei.haf.application.BaseApplication.b();
        }
        Resources resources = context.getResources();
        if (resources == null) {
            ReleaseLogUtil.d(str, "getSystemBarHeight resources is null isStatusBar ", Boolean.valueOf(z));
            return 0;
        }
        String str2 = z ? "status_bar_height" : "navigation_bar_height";
        int iB = qre.b(resources.getIdentifier(str2, "dimen", OsType.ANDROID));
        if (iB > 0) {
            return iB;
        }
        ReleaseLogUtil.d(str, "getSystemBarHeight getIdentifier systemBarHeight ", Integer.valueOf(iB), " isStatusBar ", Boolean.valueOf(z));
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return qre.b(CommonUtils.j(String.valueOf(cls.getField(str2).get(cls.newInstance()))));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException e2) {
            ReleaseLogUtil.b(f46707a, "getSystemBarHeight exception ", ExceptionUtils.c(e2));
            return iB;
        }
    }

    public static int s(Context context) {
        return c(context, true);
    }

    public static int q(Context context) {
        return c(context, false);
    }

    public static boolean ad(Context context) {
        WindowInsetsCompat windowInsetsCompatAn = an(context);
        boolean zIsVisible = windowInsetsCompatAn != null ? windowInsetsCompatAn.isVisible(WindowInsetsCompat.Type.navigationBars()) : false;
        if (zIsVisible) {
            return zIsVisible;
        }
        if (context == null) {
            context = com.huawei.haf.application.BaseApplication.b();
        }
        return Settings.Global.getInt(context.getContentResolver(), Constants.NAVIGATIONBAR_IS_MIN, 0) == 0;
    }

    public static int q() {
        Object systemService = BaseApplication.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j(f46708c, "getScreenWidth WindowManager is null or class cast exception");
            return 0;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    private static DisplayMetrics ak(Context context) {
        if (!(context instanceof Activity)) {
            LogUtil.j(f46708c, "getCurrentWindowDisplayMetrics context is null getTopActivity");
            context = BaseApplication.getActivity();
        }
        if (context == null) {
            LogUtil.j(f46708c, "getCurrentWindowDisplayMetrics context is null getAppContext");
            context = BaseApplication.getContext();
        }
        Object systemService = context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j(f46708c, "getCurrentWindowDisplayMetrics object ", systemService);
            return null;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay == null) {
            LogUtil.j(f46708c, "getCurrentWindowDisplayMetrics display is null");
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static int i(Context context) {
        DisplayMetrics displayMetricsAk = ak(context);
        if (displayMetricsAk == null) {
            LogUtil.j(f46708c, "getCurrentWindowWidth displayMetrics is null");
            return 0;
        }
        return displayMetricsAk.widthPixels;
    }

    public static int g(Context context) {
        DisplayMetrics displayMetricsAk = ak(context);
        if (displayMetricsAk == null) {
            LogUtil.j(f46708c, "getCurrentWindowHeight displayMetrics is null");
            return 0;
        }
        return displayMetricsAk.heightPixels;
    }

    public static int m() {
        Object systemService = BaseApplication.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.j(f46708c, "getScreenHeight WindowManager is null or class cast exception");
            return 0;
        }
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int k() {
        Configuration configuration = BaseApplication.getContext().getResources().getConfiguration();
        if (configuration == null) {
            LogUtil.j(f46708c, "getScreenOrientation configuration is null");
            return 1;
        }
        return configuration.orientation;
    }

    public static Point l() {
        Point point = new Point();
        Object systemService = BaseApplication.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            return point;
        }
        ((WindowManager) systemService).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static void b(LinearLayout linearLayout, int i) {
        if (i == 0 || linearLayout == null) {
            LogUtil.j(f46708c, "ratio = 0 or linearLayout is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        layoutParams.height = m() / i;
        layoutParams.width = q();
        linearLayout.setLayoutParams(layoutParams);
    }

    public static void d(RelativeLayout relativeLayout, int i) {
        if (i == 0 || relativeLayout == null) {
            LogUtil.j(f46708c, "ratio = 0 or relativeLayout is null");
            return;
        }
        ViewGroup.LayoutParams layoutParams = relativeLayout.getLayoutParams();
        layoutParams.height = m() / i;
        layoutParams.width = q();
        relativeLayout.setLayoutParams(layoutParams);
    }

    public static float b(Paint paint, String str) {
        return paint.measureText(str);
    }

    public static float d(Paint paint) {
        if (paint == null) {
            return 0.0f;
        }
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    private static String b(Context context, int i) {
        if (context != null) {
            try {
                return context.getResources().getString(i);
            } catch (Resources.NotFoundException e2) {
                LogUtil.a(f46708c, "NotFoundException ", e2.getMessage());
                return "";
            }
        }
        return "";
    }

    public static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            LogUtil.e(f46708c, "string2Int e=", e2.getMessage());
            return 0;
        }
    }

    public static long f(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException e2) {
            LogUtil.e(f46708c, "string2Long e=", e2.getMessage());
            return 0L;
        }
    }

    public static float h(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            LogUtil.e(f46708c, "stringToFloat exception ", e2.getMessage());
            return 0.0f;
        }
    }

    public static double g(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e2) {
            LogUtil.e(f46708c, "stringToDouble exception ", e2.getMessage());
            return 0.0d;
        }
    }

    public static Integer e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            LogUtil.e(f46708c, "cant get int from string", new Object[0]);
            return null;
        }
    }

    public static Float c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Float.valueOf(Float.parseFloat(str));
        } catch (NumberFormatException unused) {
            LogUtil.e(f46708c, "cant get float from string", new Object[0]);
            return null;
        }
    }

    public static String p(Context context) {
        String string;
        String str = f46708c;
        LogUtil.a(str, "enter getMetisProductName:");
        if (context != null) {
            String country = context.getResources().getConfiguration().locale.getCountry();
            if ("CN".equals(country) || "RU".equals(country) || FaqConstants.OPEN_TYPE_IN.equals(country)) {
                string = context.getResources().getString(R.string.IDS_device_metis_name_honor_watch_s1);
            } else {
                string = context.getResources().getString(R.string.IDS_device_metis_name_title_1);
            }
            LogUtil.a(str, RecordAction.ACT_NAME_TAG, string);
            return string;
        }
        return "";
    }

    public static int r(Context context) {
        String str = f46708c;
        LogUtil.a(str, "enter getMetisProductType:");
        int i = 1;
        if (context != null) {
            String country = context.getResources().getConfiguration().locale.getCountry();
            i = ("CN".equals(country) || "RU".equals(country) || FaqConstants.OPEN_TYPE_IN.equals(country)) ? 2 : 1;
            LogUtil.a(str, "manuType=", Integer.valueOf(i));
        }
        return i;
    }

    public static String c(Context context) {
        String string;
        String str = f46708c;
        LogUtil.a(str, "enter getA2ProductName:");
        if (context != null) {
            String country = context.getResources().getConfiguration().locale.getCountry();
            if ("CN".equals(country)) {
                string = context.getResources().getString(R.string.IDS_select_device_talkband_a1);
            } else if (FaqConstants.OPEN_TYPE_IN.equals(country)) {
                string = context.getResources().getString(R.string.IDS_select_device_talkband_a2overseas);
            } else {
                string = context.getResources().getString(R.string.IDS_select_device_talkband_a1overseas);
            }
            LogUtil.a(str, RecordAction.ACT_NAME_TAG, string);
            return string;
        }
        return "";
    }

    public static int d(Context context) {
        String str = f46708c;
        LogUtil.a(str, "enter getA2ManuType:");
        int i = 1;
        if (context != null) {
            String country = context.getResources().getConfiguration().locale.getCountry();
            i = ("CN".equals(country) || FaqConstants.OPEN_TYPE_IN.equals(country)) ? 2 : 1;
            LogUtil.a(str, "manuType=", Integer.valueOf(i));
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    public static String b(Context context) {
        byte b2;
        String string;
        String str = f46708c;
        LogUtil.a(str, "enter getB0ProductName:");
        if (context != null) {
            String country = context.getResources().getConfiguration().locale.getCountry();
            country.hashCode();
            int iHashCode = country.hashCode();
            if (iHashCode != 2155) {
                if (iHashCode != 2252) {
                    if (iHashCode != 2341) {
                        if (iHashCode != 2476) {
                            if (iHashCode != 2627) {
                                if (iHashCode == 2718 && country.equals("US")) {
                                    b2 = 5;
                                } else {
                                    b2 = -1;
                                }
                            } else if (country.equals("RU")) {
                                b2 = 4;
                            } else {
                                b2 = -1;
                            }
                        } else if (country.equals("MY")) {
                            b2 = 3;
                        } else {
                            b2 = -1;
                        }
                    } else if (country.equals(FaqConstants.OPEN_TYPE_IN)) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (country.equals("FR")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (country.equals("CN")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                string = context.getResources().getString(R.string.IDS_app_display_name_b0);
            } else if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4 || b2 == 5) {
                string = context.getResources().getString(R.string.IDS_app_display_name_b0_1);
            } else {
                string = context.getResources().getString(R.string.IDS_app_display_name_b0);
            }
            LogUtil.a(str, "name:", string);
            return string;
        }
        return "";
    }

    public static String e(Context context) {
        String string;
        String str = f46708c;
        LogUtil.a(str, "enter getB0ProductName:");
        if (context != null) {
            if ("CN".equals(context.getResources().getConfiguration().locale.getCountry())) {
                string = context.getResources().getString(R.string.IDS_select_device_talkband_a1);
            } else {
                string = context.getResources().getString(R.string.IDS_select_device_talkband_a1overseas);
            }
            LogUtil.a(str, "name:", string);
            return string;
        }
        return "";
    }

    public static String o(Context context) {
        LogUtil.a(f46708c, "enter getJunasProductName:");
        return b(context, R.string.IDS_app_display_name_janus);
    }

    public static String v(Context context) {
        LogUtil.a(f46708c, "enter GetTerraProductName:");
        return b(context, R.string.IDS_app_display_name_terra);
    }

    public static String a(Context context) {
        LogUtil.a(f46708c, "enter GetCriusProductName:");
        return b(context, R.string.IDS_app_display_name_crius_new);
    }

    public static String n(Context context) {
        LogUtil.a(f46708c, "enter GetHWAW70ProductName:");
        return b(context, R.string.IDS_app_display_name_aw);
    }

    public static String l(Context context) {
        LogUtil.a(f46708c, "enter GetHNAW70ProductName:");
        return b(context, R.string.IDS_app_display_name_honor_aw);
    }

    public static String m(Context context) {
        LogUtil.a(f46708c, "enter Get Huawei AW70proProductName:");
        return b(context, R.string.IDS_hw_motiontrack_aw70_pro);
    }

    public static String k(Context context) {
        LogUtil.a(f46708c, "enter Get Honor AW70proProductName:");
        return b(context, R.string.IDS_hw_motiontrack_aw70);
    }

    public static String w(Context context) {
        LogUtil.a(f46708c, "enter GetTalosProductName:");
        return b(context, R.string.IDS_app_display_name_talos);
    }

    public static String h(Context context) {
        LogUtil.a(f46708c, "enter GetFortunaProductName:");
        return b(context, R.string.IDS_app_display_name_fortuna);
    }

    public static void c(Notification.Builder builder) {
        if (builder == null) {
            return;
        }
        if ("com.huawei.bone".equals(BaseApplication.getAppPackage())) {
            builder.setSmallIcon(R.drawable.ic_wear_notification);
        } else {
            builder.setSmallIcon(R.drawable.healthlogo_ic_notification);
        }
    }

    public static void e(Context context, boolean z) {
        if (context == null) {
            return;
        }
        try {
            a(context, context.getString(z ? R.string.IDS_hwh_motiontrack_permission_guide_location : o()));
        } catch (Resources.NotFoundException unused) {
            LogUtil.a(f46708c, "showPermissionSettingGuide Resources NotFound");
        }
    }

    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new CustomTextAlertDialog.Builder(context).a(R.string.IDS_hwh_home_other_permissions_title).a(str).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qrs.11
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d(qrs.f46708c, "setNegativeButton onclick called String");
            }
        }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: qrs.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.d(qrs.f46708c, "setPositiveButton onclick called String");
                qrs.al(applicationContext);
            }
        }).b().show();
    }

    public static int b(PermissionUtil.PermissionType permissionType) {
        boolean zB = PermissionUtil.b(permissionType);
        boolean zF = PermissionUtil.f();
        boolean zD = PermissionUtil.d();
        boolean z = (CommonUtil.bc() && HarmonyBuild.d >= 6) || EnvironmentInfo.m();
        switch (AnonymousClass8.f46725c[permissionType.ordinal()]) {
            case 1:
                if (zF) {
                    return R.string.IDS_manage_external_storage;
                }
            case 2:
                if (zF) {
                    return R.string.IDS_hw_permission_guide_image;
                }
            case 3:
                if (z) {
                    return R.string.IDS_harmony_permission_torage;
                }
                if (zF) {
                    return R.string.IDS_android_tiramisu_permission_torage;
                }
                return R.string.IDS_hw_feedback_permission_guide_torage;
            case 4:
            case 5:
                if (zD) {
                    return R.string.IDS_hwh_motiontrack_permission_guide_location_precise;
                }
                return R.string.IDS_hwh_motiontrack_permission_guide_location;
            case 6:
                if (z) {
                    return R.string.IDS_harmony_location_storage_permission;
                }
                if (zF) {
                    return R.string.IDS_android_tiramisu_location_storage_permission;
                }
                return R.string.IDS_location_storage_permission;
            case 7:
                if (zD) {
                    return R.string.IDS_activity_location_precise_permission;
                }
                return R.string.IDS_activity_location_permission;
            case 8:
                if (z) {
                    return R.string.IDS_harmony_activity_storage_permission;
                }
                if (zF) {
                    return R.string.IDS_android_tiramisu_activity_storage_permission;
                }
                return R.string.IDS_activity_storage_permission;
            case 9:
            case 10:
                return R.string.IDS_contact_have_no_permission_to_read_health;
            case 11:
                return R.string.IDS_hw_permission_guide_camera;
            case 12:
                return R.string.IDS_hw_permission_distribute;
            case 13:
                if (zB) {
                    return R.string.IDS_hw_permission_guide_camera_image;
                }
                if (zF) {
                    return R.string.IDS_android_tiramisu_healthshop_permission_str;
                }
                return R.string.IDS_hwh_home_healthshop_permission_str;
            case 14:
                if (zF) {
                    return R.string.IDS_android_tiramisu_permission_media_audio;
                }
                return R.string.IDS_hw_feedback_permission_guide_torage;
            case 15:
                return R.string.IDS_int_plan_calendar_permission_guide;
            case 16:
                return R.string.IDS_sleep_record_permission_guide;
            case 17:
                return R.string.IDS_hw_bluetooth_permission_guide;
            case 18:
                return R.string.IDS_hw_permission_guide_phone;
            case 19:
                return R.string.IDS_activity_permission;
            default:
                LogUtil.j(f46708c, "getPermissionDescription permissionType ", permissionType);
                return o();
        }
    }

    /* JADX INFO: renamed from: qrs$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f46725c;

        static {
            int[] iArr = new int[PermissionUtil.PermissionType.values().length];
            f46725c = iArr;
            try {
                iArr[PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.STORAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.STORAGE_LOCATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.ACTIVITY_LOCATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.ACTIVITY_MEDIA_VIDEO_IMAGES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.READ_CONTACT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.READ_WRITE_CONTACT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.CAMERA.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.DISTRIBUTED_DATASYNC.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.CAMERA_IMAGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.MEDIA_AUDIO.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.CALENDAR.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.RECORD_AUDIO.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.SCAN.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.PHONE_STATE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f46725c[PermissionUtil.PermissionType.ACTIVITY.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public static int o() {
        if ((CommonUtil.bc() && HarmonyBuild.d >= 6) || EnvironmentInfo.m()) {
            return R.string.IDS_harmony_guide_location_and_storage_permission;
        }
        return R.string.IDS_hwh_motiontrack_permission_guide_location_and_storage;
    }

    public static void b(Context context, PermissionUtil.PermissionType permissionType, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        c(context, permissionType, (CustomTextAlertDialog) null, onClickListener, onClickListener2);
    }

    public static void e(final Activity activity, final int i) {
        PermissionUtil.d(activity, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(activity) { // from class: qrs.12
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                gsm.a(activity, i);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                super.onDenied(str);
                LogUtil.a(qrs.f46708c, "checkImagePermission Permission onDenied");
                gsm.a(activity, i);
            }

            @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
                qrs.e(permissionType, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(PermissionUtil.PermissionType permissionType, final Activity activity) {
        b(activity, permissionType, new View.OnClickListener() { // from class: qrs.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qrs.al(activity);
                activity.finish();
            }
        }, new View.OnClickListener() { // from class: qrs.15
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                activity.finish();
            }
        });
    }

    private static void c(View.OnClickListener onClickListener, View view) {
        LogUtil.d(f46708c, "showPermissionSettingGuide cancel");
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static void b(Context context, PermissionUtil.PermissionType permissionType) {
        b(context, permissionType, (View.OnClickListener) null, (View.OnClickListener) null);
    }

    public static void c(final Context context, final PermissionUtil.PermissionType permissionType, CustomTextAlertDialog customTextAlertDialog, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        if (!(context instanceof Activity)) {
            LogUtil.j(f46708c, "showHealthAppSettingGuide context is not activity context.");
            return;
        }
        String string = context.getResources().getString(b(permissionType));
        if (customTextAlertDialog == null) {
            CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(context);
            builder.a(d(context, 18.0f), d(context, 16.0f));
            customTextAlertDialog = builder.a(R.string.IDS_hwh_home_other_permissions_title).a(string).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qsd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qrs.a(onClickListener2, view);
                }
            }).a(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: qsj
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    qrs.c(permissionType, context, onClickListener, view);
                }
            }).b();
            customTextAlertDialog.setCancelable(false);
        }
        customTextAlertDialog.show();
    }

    static /* synthetic */ void a(View.OnClickListener onClickListener, View view) {
        LogUtil.d(f46708c, "showPermissionSettingGuide cancel");
        c(onClickListener, view);
    }

    static /* synthetic */ void c(PermissionUtil.PermissionType permissionType, Context context, View.OnClickListener onClickListener, View view) {
        LogUtil.d(f46708c, "showPermissionSettingGuide cancel");
        if (PermissionUtil.f() && PermissionUtil.PermissionType.MANAGE_EXTERNAL_STORAGE.equals(permissionType)) {
            ad();
        } else {
            al(context);
        }
        c(onClickListener, view);
    }

    public static void al(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", applicationContext.getPackageName(), null));
        if (intent.resolveActivity(applicationContext.getPackageManager()) == null) {
            return;
        }
        try {
            applicationContext.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(f46708c, "startAppSettingActivity ActivityNotFoundException e = ", e2.getMessage());
        }
    }

    public static void c(final Activity activity, final int i) {
        if (activity == null) {
            LogUtil.e(f46708c, "choosePic: activity is null");
        } else if (PermissionUtil.a()) {
            a(activity, i);
        } else {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(activity) { // from class: qrs.14
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    qrs.a(activity, i);
                }
            });
        }
    }

    public static void d(final Activity activity, final int i) {
        if (activity == null) {
            LogUtil.e(f46708c, "chooseVideo: activity is null");
        } else if (PermissionUtil.a()) {
            b(activity, i);
        } else {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.MEDIA_VIDEO_IMAGES, new CustomPermissionAction(activity) { // from class: qrs.18
                @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                public void onGranted() {
                    qrs.b(activity, i);
                }
            });
        }
    }

    public static void a(Activity activity, int i) {
        try {
            Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
            intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, com.huawei.operation.utils.Constants.IMAGE_TYPE);
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(f46708c, "open system gallery fail:", e2.getMessage());
        } catch (SecurityException e3) {
            LogUtil.e(f46708c, "open system gallery fail securityException: ", e3.getMessage());
        }
    }

    public static void b(Activity activity, int i) {
        try {
            Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
            intent.setDataAndType(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaQueryHelper.VideoType.TYPE_ALL);
            activity.startActivityForResult(intent, i);
        } catch (ActivityNotFoundException e2) {
            ReleaseLogUtil.b(f46707a, "open system video fail:", e2.getMessage());
            try {
                Intent intent2 = new Intent("android.intent.action.GET_CONTENT");
                intent2.setType(MediaQueryHelper.VideoType.TYPE_ALL);
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{MediaQueryHelper.VideoType.TYPE_ALL});
                activity.startActivityForResult(intent2, i);
            } catch (ActivityNotFoundException e3) {
                ReleaseLogUtil.b(f46707a, "ACTION_GET_CONTENT open system video fail:", e3.getMessage());
            }
        } catch (SecurityException e4) {
            ReleaseLogUtil.b(f46707a, "open system video fail securityException: ", e4.getMessage());
        }
    }

    private static void c(Context context, String str) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent("android.intent.action.MANAGE_APP_PERMISSION");
        intent.putExtra("android.intent.extra.PACKAGE_NAME", context.getPackageName());
        intent.putExtra("android.intent.extra.PERMISSION_GROUP_NAME", str);
        intent.putExtra("android.intent.extra.PERMISSION_NAME", str);
        intent.putExtra("android.intent.extra.USER", Process.myUserHandle());
        context.startActivity(intent);
    }

    public static void d(final Context context, final boolean z, final View.OnClickListener onClickListener) {
        int i;
        if (!(context instanceof Activity)) {
            LogUtil.j(f46708c, "showLocationOpenDialog context is not activity context.");
            return;
        }
        if (PermissionUtil.d()) {
            i = R.string.IDS_hw_need_access_precise_location_permissions_tips;
        } else {
            i = R.string.IDS_hw_need_access_location_permissions_tips;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(i)).a(R.string.IDS_settings_button_cancal, z ? onClickListener : new View.OnClickListener() { // from class: qry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a(qrs.f46708c, "showLocationOpenDialog cancel");
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: qrx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.d(context, z, onClickListener, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void d(Context context, boolean z, View.OnClickListener onClickListener, View view) {
        LogUtil.a(f46708c, "showLocationOpenDialog onClick");
        c((Activity) context, "android.permission-group.LOCATION");
        if (z) {
            onClickListener.onClick(view);
        }
    }

    public static void b(final Context context, final boolean z, final View.OnClickListener onClickListener) {
        if (!(context instanceof Activity)) {
            LogUtil.j(f46708c, "showStorageOpenDialog context is not activity context.");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getString(R.string.IDS_hw_need_access_storage_permissions_tips)).a(R.string.IDS_settings_button_cancal, z ? onClickListener : new View.OnClickListener() { // from class: qru
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a(qrs.f46708c, "showStorageOpenDialog cancel");
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: qrw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.a(context, z, onClickListener, view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void a(Context context, boolean z, View.OnClickListener onClickListener, View view) {
        LogUtil.a(f46708c, "showStorageOpenDialog onClick");
        c((Activity) context, "android.permission-group.STORAGE");
        if (z) {
            onClickListener.onClick(view);
        }
    }

    public static String a(Context context, long j) {
        if (context == null) {
            LogUtil.j(f46708c, "formatFileSize context is null");
            return "";
        }
        double d = j;
        int i = R.plurals.IDS_hwh_size_byteShort;
        if (d > 900.0d) {
            i = R.plurals.IDS_device_upgrade_file_size_kb;
            d /= 1024.0d;
        }
        if (d > 900.0d) {
            i = R.plurals.IDS_device_upgrade_file_size_mb;
            d /= 1024.0d;
        }
        if (d > 900.0d) {
            i = R.plurals.IDS_hwh_size_gigabyteShort;
            d /= 1024.0d;
        }
        if (d < 100.0d && d != 0.0d) {
            double d2 = UnitUtil.d(d, 2);
            return context.getResources().getQuantityString(i, UnitUtil.e(d2), UnitUtil.e(d2, 1, 2));
        }
        double d3 = (int) UnitUtil.d(d, 0);
        return context.getResources().getQuantityString(i, UnitUtil.e(d3), UnitUtil.e(d3, 1, 0));
    }

    public static Drawable d(int i) {
        return e(BaseApplication.getContext(), i);
    }

    public static Drawable e(Context context, int i) {
        int i2;
        if (i <= 5) {
            i2 = R.mipmap.ic_me_setup_prower_0;
        } else if (i <= 10) {
            i2 = R.mipmap.ic_me_setup_prower_10;
        } else if (i <= 20) {
            i2 = R.mipmap.ic_me_setup_prower_20;
        } else if (i <= 30) {
            i2 = R.mipmap.ic_me_setup_prower_30;
        } else if (i <= 40) {
            i2 = R.mipmap.ic_me_setup_prower_40;
        } else if (i <= 50) {
            i2 = R.mipmap.ic_me_setup_prower_50;
        } else if (i <= 60) {
            i2 = R.mipmap.ic_me_setup_prower_60;
        } else if (i <= 70) {
            i2 = R.mipmap.ic_me_setup_prower_70;
        } else if (i <= 80) {
            i2 = R.mipmap.ic_me_setup_prower_80;
        } else if (i <= 90) {
            i2 = R.mipmap.ic_me_setup_prower_90;
        } else {
            i2 = R.mipmap.ic_me_setup_prower_100;
        }
        return qre.d(context, i2);
    }

    public static Drawable e(int i) {
        Context context = BaseApplication.getContext();
        if (i <= 5) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_0_5);
        }
        if (i <= 10) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_6_10);
        }
        if (i <= 20) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_11_20);
        }
        if (i <= 30) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_21_30);
        }
        if (i <= 40) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_31_40);
        }
        if (i <= 50) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_41_50);
        }
        if (i <= 60) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_51_60);
        }
        if (i <= 70) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_61_70);
        }
        if (i <= 80) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_71_80);
        }
        if (i <= 90) {
            return context.getResources().getDrawable(R.mipmap.ic_electricity_81_90);
        }
        return context.getResources().getDrawable(R.mipmap.ic_electricity_91_100);
    }

    public static boolean r() {
        return c(1500);
    }

    public static boolean c(int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - e < i) {
            return true;
        }
        e = jElapsedRealtime;
        return false;
    }

    public static void e() {
        e = 0L;
    }

    public static boolean e(View view) {
        return e(1500, view);
    }

    public static boolean e(int i, View view) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (view.getTag(-1) == null) {
            view.setTag(-1, Long.valueOf(jElapsedRealtime));
            return false;
        }
        if (jElapsedRealtime - ((Long) view.getTag(-1)).longValue() < i) {
            return true;
        }
        view.setTag(-1, Long.valueOf(jElapsedRealtime));
        return false;
    }

    public static void d(final HealthButton healthButton, final HealthButton healthButton2) {
        if (healthButton == null || healthButton2 == null) {
            return;
        }
        healthButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qrs.20
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                healthButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (healthButton.getLineCount() > 1) {
                    qrs.c(healthButton, healthButton2);
                }
            }
        });
        healthButton2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qrs.16
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                healthButton2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (healthButton2.getLineCount() > 1) {
                    qrs.c(healthButton, healthButton2);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(HealthButton healthButton, HealthButton healthButton2) {
        LogUtil.d(f46708c, "getLineCount > 1");
        healthButton.setTextSize(1, 9.0f);
        healthButton.setMaxLines(1);
        healthButton.setEllipsize(TextUtils.TruncateAt.END);
        healthButton2.setTextSize(1, 9.0f);
        healthButton2.setMaxLines(1);
        healthButton2.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static void c(final HealthButton healthButton) {
        if (healthButton == null) {
            return;
        }
        healthButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qrs.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                healthButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (healthButton.getLineCount() > 1) {
                    LogUtil.d(qrs.f46708c, "getLineCount more than the 1");
                    healthButton.setTextSize(1, 9.0f);
                    healthButton.setMaxLines(1);
                    healthButton.setEllipsize(TextUtils.TruncateAt.END);
                }
            }
        });
    }

    public static void a(final HealthButton healthButton, final int i, final int i2, final int i3, final int i4) {
        if (healthButton == null) {
            return;
        }
        healthButton.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qrs.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                healthButton.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                healthButton.setTextSize(1, 9.0f);
                TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(healthButton, i, i2, i3, i4);
                healthButton.setMaxLines(1);
                healthButton.setEllipsize(TextUtils.TruncateAt.END);
            }
        });
    }

    public static boolean t() {
        return EnvironmentInfo.a();
    }

    public static boolean ai(Context context) {
        if (context == null) {
            LogUtil.e(f46708c, "isTelephonyEnable() context is null!!");
            return false;
        }
        Object systemService = context.getSystemService("phone");
        return (systemService instanceof TelephonyManager) && ((TelephonyManager) systemService).getPhoneType() != 0;
    }

    public static boolean ac(Context context) {
        if (!af(BaseApplication.getContext()) && k() != 2 && aa(context)) {
            float fM = m();
            if (fM <= 0.0f) {
                LogUtil.j(f46708c, "isFloatingWindowMode screenHeight ", Float.valueOf(fM));
                return false;
            }
            int iG = g(context);
            LogUtil.a(f46708c, "isFloatingWindowMode screenHeight ", Float.valueOf(fM), " windowHeight ", Integer.valueOf(iG));
            if (Float.compare(iG / fM, 0.7f) != -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean c(Activity activity) {
        if (activity == null) {
            LogUtil.j(f46708c, "isInMultiWindowMode activity is null");
            return false;
        }
        return activity.isInMultiWindowMode();
    }

    public static boolean aa(Context context) {
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            activity = BaseApplication.getActivity();
        }
        return c(activity);
    }

    public static boolean y(Context context) {
        if (!aa(context)) {
            return false;
        }
        boolean zAf = af(BaseApplication.getContext());
        if (zAf && k() == 1) {
            return true;
        }
        return (zAf || ac(context)) ? false : true;
    }

    public static void d(Context context, BaseDialog baseDialog) {
        if (aa(context)) {
            Window window = baseDialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = d(context, context.getResources().getConfiguration().screenHeightDp * 0.8f);
            window.setAttributes(attributes);
        }
    }

    public static boolean af(Context context) {
        if (context == null) {
            LogUtil.e(f46708c, "isWidescreen() context is null!!");
            return false;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if ((configuration.screenLayout & 15) >= 3) {
            if (!(context instanceof Activity) && (context = BaseApplication.getActivity()) == null) {
                context = BaseApplication.getContext();
            }
            return new HealthColumnSystem(context).j() > 4;
        }
        if (ah(context)) {
            if (context instanceof Activity) {
                return e((Activity) context);
            }
            return true;
        }
        if (!x()) {
            return false;
        }
        if (configuration.smallestScreenWidthDp >= 600) {
            return true;
        }
        return aa();
    }

    public static boolean aa() {
        int iQ = q();
        int iM = m();
        if (PermissionUtil.e()) {
            Object systemService = BaseApplication.getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
            if (systemService instanceof WindowManager) {
                Rect bounds = ((WindowManager) systemService).getCurrentWindowMetrics().getBounds();
                int iWidth = bounds.width();
                iM = bounds.height();
                iQ = iWidth;
            }
        }
        float fC = c();
        float fMin = Math.min(iQ, iM) / fC;
        LogUtil.a(f46708c, "isWidescreen minDp ", Float.valueOf(fMin), " defaultDensity ", Float.valueOf(fC), " height ", Integer.valueOf(iM), " width ", Integer.valueOf(iQ));
        return fMin >= 600.0f;
    }

    private static boolean e(Activity activity) {
        if (activity != null) {
            return (activity.getResources().getConfiguration().screenLayout & 15) >= 3;
        }
        LogUtil.e(f46708c, "isCurPageWideScreen() activity is null!!");
        return false;
    }

    public static boolean z(Context context) {
        if (context == null) {
            LogUtil.e(f46708c, "isHWPad() context is null!!");
            return false;
        }
        return SystemInfo.e(true);
    }

    public static boolean ah(Context context) {
        return z(context) || !ai(context);
    }

    public static String f(Context context) {
        if (ah(context)) {
            return context.getString(R.string.IDS_device_type_pad);
        }
        return context.getString(R.string.IDS_device_type_phone);
    }

    public static boolean ab(Context context) {
        if (context == null) {
            LogUtil.e(f46708c, "isInMagicWindow() context is null!!");
            return false;
        }
        if (!(context instanceof Activity) && (context = BaseApplication.getActivity()) == null) {
            context = BaseApplication.getContext();
        }
        String string = context.getResources().getConfiguration().toString();
        return string.contains("hwMultiwindow-magic") || string.contains("hw-magic-windows");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    public static String d(Context context, int i) {
        if (context == null) {
            return "";
        }
        return b(context, context.getResources().getString(i));
    }

    public static String b(Context context, String str) {
        if (TextUtils.isEmpty(str) || context == null) {
            return "";
        }
        if (Utils.o()) {
            if (LanguageUtil.p(context)) {
                if (str.contains("Wi-Fi")) {
                    return str.replace("Wi-Fi", "WLAN");
                }
            } else if (str.contains("WLAN")) {
                return str.replace("WLAN", "Wi-Fi");
            }
        } else if (str.contains("Wi-Fi")) {
            return str.replace("Wi-Fi", "WLAN");
        }
        return str;
    }

    public static void a(Activity activity) {
        if (activity == null) {
            LogUtil.a(f46708c, "setHideSystemOverlayWindows activity null");
        } else {
            b(activity.getWindow());
        }
    }

    public static void b(Window window) {
        try {
            Method declaredMethod = Class.forName("android.view.Window").getDeclaredMethod("addPrivateFlags", Integer.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(window, 524288);
        } catch (ClassNotFoundException unused) {
            LogUtil.e(f46708c, "setHideNonSystemOverlayWindows ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            LogUtil.e(f46708c, "setHideNonSystemOverlayWindows IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            LogUtil.e(f46708c, "setHideNonSystemOverlayWindows NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            LogUtil.e(f46708c, "setHideNonSystemOverlayWindows InvocationTargetException");
        }
    }

    public static void d(Window window) {
        try {
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = attributes.getClass().getDeclaredField("privateFlags");
            declaredField.setInt(attributes, declaredField.getInt(attributes) & (-524289));
            window.setAttributes(attributes);
        } catch (IllegalAccessException unused) {
            LogUtil.e(f46708c, "allowShowNonSystemOverlayWindows IllegalAccessException");
        } catch (NoSuchFieldException unused2) {
            LogUtil.e(f46708c, "allowShowNonSystemOverlayWindows NoSuchFieldException");
        } catch (Throwable unused3) {
        }
    }

    public static boolean x(Context context) {
        return context != null && (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static void a(Context context, boolean z, boolean z2, View... viewArr) {
        if (viewArr == null) {
            LogUtil.e(f46708c, "views is null");
            return;
        }
        if (context == null) {
            LogUtil.e(f46708c, "context is null");
            return;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.e(f46708c, "resources is null");
            return;
        }
        for (View view : viewArr) {
            if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                LogUtil.e(f46708c, "view is null or view.getLayoutParams() isn't instance of ViewGroup.MarginLayoutParams");
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (z) {
                    marginLayoutParams.setMarginStart(resources.getDimensionPixelOffset(R.dimen.maxPaddingStart));
                }
                if (z2) {
                    marginLayoutParams.setMarginEnd(resources.getDimensionPixelOffset(R.dimen.maxPaddingEnd));
                }
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void c(Context context, boolean z, boolean z2, View... viewArr) {
        if (viewArr == null) {
            LogUtil.e(f46708c, "views is null");
            return;
        }
        if (context == null) {
            LogUtil.e(f46708c, "context is null");
            return;
        }
        Resources resources = context.getResources();
        if (resources == null) {
            LogUtil.e(f46708c, "resources is null");
            return;
        }
        for (View view : viewArr) {
            if (view == null) {
                LogUtil.e(f46708c, "current view is null");
            } else {
                int paddingStart = view.getPaddingStart();
                int paddingEnd = view.getPaddingEnd();
                if (z) {
                    paddingStart = resources.getDimensionPixelOffset(R.dimen.maxPaddingStart);
                }
                if (z2) {
                    paddingEnd = resources.getDimensionPixelOffset(R.dimen.maxPaddingEnd);
                }
                view.setPaddingRelative(paddingStart, view.getPaddingTop(), paddingEnd, view.getPaddingBottom());
            }
        }
    }

    public static void e(final Context context, final String str, final String str2, final boolean z) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: qrs.5
                @Override // java.lang.Runnable
                public void run() {
                    qrs.e(context, str, str2, z);
                }
            });
            return;
        }
        if (!(context instanceof Activity)) {
            LogUtil.j(f46708c, "processNetworkServerException context is not activity context");
            if (BaseApplication.getActivity() != null) {
                context = BaseApplication.getActivity();
            }
        }
        Intent intent = new Intent(context, (Class<?>) NetworkExceptionShowActivity.class);
        intent.putExtra("extraTitleBarText", str2);
        intent.putExtra("className", str);
        intent.putExtra("server_exception_flag", z);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e(f46708c, "NetworkExceptionShowActivity exception", e2.getMessage());
        }
    }

    public static void c(final ImageView imageView, String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            RequestOptions requestOptionsBitmapTransform = RequestOptions.bitmapTransform(new CircleCrop());
            CustomTarget<Drawable> customTarget = new CustomTarget<Drawable>() { // from class: qrs.1
                @Override // com.bumptech.glide.request.target.Target
                public void onLoadCleared(Drawable drawable) {
                }

                @Override // com.bumptech.glide.request.target.Target
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                    imageView.setImageDrawable(drawable);
                }

                @Override // com.bumptech.glide.request.target.CustomTarget, com.bumptech.glide.request.target.Target
                public void onLoadFailed(Drawable drawable) {
                    LogUtil.j(qrs.f46708c, "loadHeadImage onLoadFailed");
                }
            };
            if (CommonUtil.ca()) {
                qqf.a("file:///android_asset/suggestion/img/" + str, requestOptionsBitmapTransform, customTarget);
                return;
            }
            qqf.a(str, requestOptionsBitmapTransform, customTarget);
            return;
        }
        imageView.setImageDrawable(qlo.b(BaseApplication.getContext().getResources(), new qlo.e(null, String.valueOf(j), true)));
    }

    public static String a(int i, Context context) {
        if (context == null) {
            LogUtil.e(f46708c, "Context is null");
            return "";
        }
        return BaseApplication.getContext().getResources().getQuantityString(R.plurals.IDS_motiontrack_detail_fm_heart_min_unit, i, Integer.valueOf(i));
    }

    @Deprecated
    public static float j(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    public static void c(Context context, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("type", Integer.valueOf(i));
        lmf.d().c(context, AnalyticsValue.HEALTH_VARIOUS_TAB_2030073.value(), map, 0);
    }

    public static int d() {
        if (CommonUtil.bg()) {
            return 1;
        }
        if (CommonUtil.bd()) {
            return 2;
        }
        return ah(BaseApplication.getContext()) ? 5 : 3;
    }

    public static float i() {
        return BaseApplication.getContext().getResources().getConfiguration().fontScale;
    }

    public static boolean p() {
        return ((double) (i() - 1.45f)) > Math.pow(10.0d, -6.0d);
    }

    public static boolean s() {
        return i() - 1.45f >= 0.0f;
    }

    public static boolean v() {
        return d(1.74f);
    }

    public static boolean d(float f) {
        return i() >= f;
    }

    public static boolean w() {
        return BaseActivity.isSumsung() && d(1.16f);
    }

    public static void a(HealthTextView healthTextView) {
        if (healthTextView == null) {
            return;
        }
        healthTextView.setMaxLines(1);
        healthTextView.setSingleLine(true);
        healthTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static boolean y() {
        return i() > 1.1f;
    }

    public static boolean u() {
        return i() > 1.29f;
    }

    public static void a() {
        if (z()) {
            LogUtil.a(f46708c, "show large font adjust");
            qpx.b(BaseApplication.getContext(), R.string.IDS_large_font_adjust_remind);
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HAS_SHOW_FONT_ADJUST_KEY", CommonUtil.a(BaseApplication.getContext()), new StorageParams());
        }
    }

    private static boolean z() {
        return y() && LanguageUtil.l(BaseApplication.getContext()) && !ab();
    }

    private static boolean ab() {
        return TextUtils.equals(CommonUtil.a(BaseApplication.getContext()), SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10000), "HAS_SHOW_FONT_ADJUST_KEY"));
    }

    public static boolean ac() {
        return i() >= 2.9f;
    }

    public static boolean d(Drawable drawable) {
        Bitmap bitmap;
        return (drawable instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null && bitmap.isRecycled();
    }

    public static void j(Activity activity, int i) {
        if (activity == null) {
            LogUtil.a(f46708c, "activity is null");
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            LogUtil.a(f46708c, "window is null");
        } else {
            window.setBackgroundDrawableResource(i);
        }
    }

    public static int[] c(int[]... iArr) {
        if (iArr == null || iArr.length == 0) {
            return new int[0];
        }
        int length = 0;
        for (int i = 0; i < iArr.length; i++) {
            int[] iArr2 = iArr[i];
            length += iArr2 != null ? iArr2.length : 0;
        }
        if (length == 0) {
            return new int[0];
        }
        int[] iArr3 = new int[length];
        int i2 = 0;
        for (int[] iArr4 : iArr) {
            if (iArr4 != null && iArr4.length != 0) {
                int i3 = 0;
                while (i3 < iArr4.length) {
                    iArr3[i2] = iArr4[i3];
                    i3++;
                    i2++;
                }
            }
        }
        return iArr3;
    }

    public static int b(int[] iArr, int i) {
        if (iArr == null || iArr.length == 0) {
            return -1;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public static int t(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int iB = qqp.b(context);
        int i = context.getResources().getDisplayMetrics().widthPixels;
        if (af(context)) {
            return ((i - dimensionPixelSize) - dimensionPixelSize2) - iB;
        }
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        return (((i - dimensionPixelSize) - dimensionPixelSize2) - ((Integer) safeRegionWidth.first).intValue()) - ((Integer) safeRegionWidth.second).intValue();
    }

    public static int c(Context context, int i, boolean z) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingStart);
        int iB = qqp.b(context);
        if (af(context)) {
            return i % 2 == 0 ? dimensionPixelSize : iB / 2;
        }
        return z ? dimensionPixelSize + ((Integer) BaseActivity.getSafeRegionWidth().first).intValue() : dimensionPixelSize;
    }

    public static int e(Context context, int i, boolean z) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.defaultPaddingEnd);
        int iB = qqp.b(context);
        if (af(context)) {
            return i % 2 == 0 ? iB / 2 : dimensionPixelSize;
        }
        return z ? dimensionPixelSize + ((Integer) BaseActivity.getSafeRegionWidth().second).intValue() : dimensionPixelSize;
    }

    public static String a(int i, StringBuilder sb, StringBuilder sb2, boolean z) {
        int iAbs = Math.abs(i);
        if (z) {
            if (iAbs % 2 == 0) {
                return c(iAbs, sb, sb2);
            }
            return c(iAbs - 1, sb, sb2);
        }
        if (iAbs % 2 == 0) {
            return e(iAbs, sb, sb2);
        }
        return e(iAbs - 1, sb, sb2);
    }

    private static String c(int i, StringBuilder sb, StringBuilder sb2) {
        for (int i2 = 0; i2 < i / 2; i2++) {
            sb.append("  ");
        }
        sb2.insert(0, "  ");
        sb2.insert(0, (CharSequence) sb);
        sb2.append((CharSequence) sb);
        sb2.append("  ");
        return sb2.toString();
    }

    private static String e(int i, StringBuilder sb, StringBuilder sb2) {
        for (int i2 = 0; i2 < i / 2; i2++) {
            sb.append("  ");
        }
        sb2.insert(0, " ");
        sb2.insert(0, (CharSequence) sb);
        sb2.append((CharSequence) sb);
        return sb2.toString();
    }

    public static Fragment c(List<Fragment> list, int i, String str) {
        if (njy.e(list, i)) {
            LogUtil.j(str, "Parameter position of method getItem should not be out of mSubTabs bounds.");
            return null;
        }
        return list.get(i);
    }

    public static void e(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, final HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet, HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency, int i) {
        hwHealthBaseBarLineChart.getTransformer(hwHealthAxisDependency).e(new HwHealthTransformer.BusinessMatrixGenerator() { // from class: qrs.9
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthTransformer.BusinessMatrixGenerator
            public Matrix generateBusinessMatrix(Matrix matrix) {
                if (matrix != null) {
                    matrix.reset();
                }
                return matrix;
            }
        });
        if (i == 1) {
            hwHealthBaseBarLineChart.getAxis(hwHealthAxisDependency).setValueFormatter(new IAxisValueFormatter() { // from class: qrs.6
                @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
                public String getFormattedValue(float f, AxisBase axisBase) {
                    return qrs.c(f, hwHealthBaseBarLineDataSet);
                }
            });
        } else if (i == 2) {
            hwHealthBaseBarLineChart.getAxis(hwHealthAxisDependency).setValueFormatter(null);
        } else {
            hwHealthBaseBarLineChart.getAxis(hwHealthAxisDependency).setValueFormatter(new qls());
        }
    }

    public static String c(float f, HwHealthBaseBarLineDataSet hwHealthBaseBarLineDataSet) {
        String strC;
        int iA = a(hwHealthBaseBarLineDataSet.getYMax(), hwHealthBaseBarLineDataSet.getYMin());
        int iB = b(hwHealthBaseBarLineDataSet.getYMax(), hwHealthBaseBarLineDataSet.getYMin());
        int i = (int) f;
        int i2 = (iA - iB) / 4;
        Context context = BaseApplication.getContext();
        String string = context.getString(R.string.IDS_bolt_balance_left_touches);
        String string2 = context.getString(R.string.IDS_bolt_balance_right_touches);
        int iRound = Math.round(((iA - 50) * 1.0f) / 2.0f) + 50;
        if (i != iB) {
            strC = "";
        } else {
            strC = c(iA, string2, context);
        }
        int i3 = iB + i2;
        if (i == i3) {
            strC = c(iRound, string2, context);
        }
        if (i == i3 + i2) {
            double d = 50;
            strC = context.getResources().getString(R.string.IDS_chart_title_two, UnitUtil.e(d, 1, 0), UnitUtil.e(d, 1, 0));
        }
        if (i == iA - i2) {
            strC = c(iRound, string, context);
        }
        return i == iA ? c(iA, string, context) : strC;
    }

    public static int a(float f, float f2) {
        int iRound = Math.round(f);
        int iFloor = (int) Math.floor(f2);
        if (iRound - 50 < 50 - iFloor) {
            iRound = 100 - iFloor;
        }
        return iRound % 2 == 0 ? iRound : iRound + 1;
    }

    public static int b(float f, float f2) {
        int iRound = Math.round(f) - 50;
        int iFloor = 50 - ((int) Math.floor(f2));
        int i = 50 - iRound;
        if (iRound < iFloor) {
            i = 50 - iFloor;
        }
        return i % 2 == 0 ? i : i - 1;
    }

    private static String c(int i, String str, Context context) {
        return context.getResources().getString(R.string.IDS_run_plan_calendar_title, UnitUtil.e(i, 2, 0), str);
    }

    public static void b(HwHealthBaseBarLineChart hwHealthBaseBarLineChart, HwHealthYAxis.HwHealthAxisDependency hwHealthAxisDependency, boolean z) {
        hwHealthBaseBarLineChart.getTransformer(hwHealthAxisDependency).e(new HwHealthTransformer.BusinessMatrixGenerator() { // from class: qrs.7
            @Override // com.huawei.ui.commonui.linechart.common.HwHealthTransformer.BusinessMatrixGenerator
            public Matrix generateBusinessMatrix(Matrix matrix) {
                if (matrix != null) {
                    matrix.reset();
                }
                return matrix;
            }
        });
        if (!z) {
            hwHealthBaseBarLineChart.getAxis(hwHealthAxisDependency).setValueFormatter(new IAxisValueFormatter() { // from class: qrs.10
                @Override // com.github.mikephil.charting.formatter.IAxisValueFormatter
                public String getFormattedValue(float f, AxisBase axisBase) {
                    return UnitUtil.e(f, 2, 0);
                }
            });
        } else {
            hwHealthBaseBarLineChart.getAxis(hwHealthAxisDependency).setValueFormatter(null);
        }
    }

    public static int b(String[] strArr) {
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public static Object d(int i, String[] strArr) {
        if (i < 0 || i >= b(strArr)) {
            return null;
        }
        return strArr[i];
    }

    public static void e(DataRenderer dataRenderer, Canvas canvas, Chart chart, int i, List<Highlight> list, Highlight[] highlightArr) {
        Object lineData;
        if (dataRenderer instanceof qlz) {
            lineData = ((qlz) dataRenderer).e().getBarData();
        } else {
            lineData = dataRenderer instanceof qns ? ((qns) dataRenderer).d().getLineData() : null;
        }
        int iIndexOf = (lineData == null || !(chart.getData() instanceof qmc)) ? i : ((qmc) chart.getData()).a().indexOf(lineData);
        list.clear();
        for (Highlight highlight : highlightArr) {
            if (highlight.getDataIndex() == iIndexOf || highlight.getDataIndex() == i) {
                list.add(highlight);
            }
        }
        dataRenderer.drawHighlighted(canvas, (Highlight[]) list.toArray(new Highlight[list.size()]));
    }

    public static boolean ag(Context context) {
        return Build.VERSION.SDK_INT <= 28 && x(context) && BaseActivity.isSumsung();
    }

    public static void b(HealthSearchView healthSearchView) {
        View viewFindViewById;
        if (healthSearchView == null) {
            LogUtil.a(f46708c, "applyDarkMode search view is null");
            return;
        }
        if (ag(BaseApplication.getContext()) && (viewFindViewById = healthSearchView.findViewById(R.id.search_plate)) != null) {
            viewFindViewById.setBackgroundResource(R.drawable.hwsearchview_selector_search_bg);
        }
        if (BaseActivity.isFlyme() && x(BaseApplication.getContext())) {
            LogUtil.a(f46708c, "applySearchViewDarkMode");
            d(healthSearchView, R.id.hwsearchview_back_button, R.drawable.health_navbar_back_selector);
            d(healthSearchView, R.id.hwsearchview_search_src_icon, R.drawable.health_searchview_ic_public_search);
            d(healthSearchView, R.id.search_close_btn, R.drawable.ic_public_select_cancel);
        }
    }

    public static void d(HealthSearchView healthSearchView, int i, int i2) {
        View viewFindViewById = healthSearchView.findViewById(i);
        if (viewFindViewById instanceof AppCompatImageView) {
            ((AppCompatImageView) viewFindViewById).setImageResource(i2);
        }
    }

    public static boolean e(CharSequence... charSequenceArr) {
        if (charSequenceArr == null) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (TextUtils.isEmpty(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static void ae(Context context) {
        if (context instanceof Activity) {
            h((Activity) context);
        } else {
            LogUtil.a(f46708c, "setShortTransAnimation context is not an activity");
        }
    }

    private static void h(Activity activity) {
        if (activity != null) {
            activity.overridePendingTransition(R.anim.left_enter_short, R.anim.activity_no_animation_short);
        }
    }

    public static void f(View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(marginLayoutParams.getMarginStart() + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(marginLayoutParams.getMarginEnd() + ((Integer) safeRegionWidth.second).intValue());
        }
    }

    public static String a(String str, List<String> list) {
        if (str == null && njy.e(list)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(list.get(0) != null ? list.get(0) : com.huawei.operation.utils.Constants.NULL);
        int size = list.size();
        for (int i = 1; i < size; i++) {
            sb.append(str);
            sb.append(list.get(i) != null ? list.get(i) : com.huawei.operation.utils.Constants.NULL);
        }
        return sb.toString();
    }

    public static int g() {
        return Math.max(DisplayMetrics.DENSITY_DEVICE_STABLE, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH);
    }

    public static int j() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (displayMetrics == null) {
            ReleaseLogUtil.d(f46708c, "getDensityDpi displayMetrics is null DENSITY_DEVICE_STABLE ", Integer.valueOf(DisplayMetrics.DENSITY_DEVICE_STABLE));
            return g();
        }
        return displayMetrics.densityDpi;
    }

    public static float c() {
        return g() / f();
    }

    public static float h() {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        if (displayMetrics == null) {
            ReleaseLogUtil.d(f46708c, "getDensity displayMetrics is null");
            return c();
        }
        return displayMetrics.density;
    }

    public static boolean x() {
        return j() > g() || h() > c();
    }

    @Deprecated
    public static float n() {
        return BaseApplication.getContext().getResources().getDisplayMetrics().scaledDensity;
    }

    public static boolean a(float f) {
        return n() >= f;
    }

    public static boolean a(Context context, float f) {
        return j(context) >= f;
    }

    public static RelativeLayout.LayoutParams u(Context context) {
        int iS = s(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, iS);
        Activity activity = BaseApplication.getActivity();
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity == null) {
            LogUtil.e(f46708c, "getStatusBarLayoutParams activity is null");
            return layoutParams;
        }
        boolean zIsInMultiWindowMode = activity.isInMultiWindowMode();
        boolean zB = b(activity);
        if (zIsInMultiWindowMode && zB) {
            layoutParams.topMargin = -iS;
        }
        return layoutParams;
    }

    public static boolean b(Activity activity) {
        try {
            return ((Integer) ReflectionUtils.e(ReflectionUtils.e("com.huawei.android.app.ActivityManagerEx"), "getActivityWindowMode", (Class<?>[]) new Class[]{Activity.class}).invoke(null, activity)).intValue() == 102;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException | InvocationTargetException unused) {
            LogUtil.a(f46708c, "isFreeformMode reflect fail");
            return false;
        }
    }

    public static void c(Context context, Bundle bundle) {
        if (bundle == null || context == null) {
            return;
        }
        if ((29 == Build.VERSION.SDK_INT || 28 == Build.VERSION.SDK_INT) && context.getClassLoader() != null) {
            bundle.setClassLoader(context.getClassLoader());
            Bundle bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle2 == null || njy.e(bundle2.keySet())) {
                return;
            }
            for (String str : bundle2.keySet()) {
                if (bundle2.getBundle(str) != null) {
                    bundle2.getBundle(str).setClassLoader(context.getClassLoader());
                }
            }
        }
    }

    public static void a(Intent intent, String str, Context context) {
        if (lsj.c(context, str) || !lsj.c(context, "com.huawei.appmarket") || CommonUtil.bd()) {
            return;
        }
        c(intent, "com.huawei.appmarket", context, qre.f(R.string.IDS_device_fragment_application_market));
    }

    public static void c(final Intent intent, String str, final Context context, String str2) {
        LogUtil.a(f46708c, "showLaunchAgreeDialog pkgName:", str, "defaultName:", str2);
        b(str, str2, context, new View.OnClickListener() { // from class: qse
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.b(context, intent);
            }
        }, null);
    }

    public static void b(String str, Context context, String str2, View.OnClickListener onClickListener) {
        LogUtil.a(f46708c, "showLaunchAgreeDialogNotIntent pkgName:", str, "defaultName:", str2);
        e(str, context, str2, onClickListener, null);
    }

    public static void e(String str, Context context, String str2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        b(str, str2, context, onClickListener, onClickListener2);
    }

    private static void b(String str, String str2, Context context, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        int iB = b(str, context, str2);
        if (iB == -1) {
            if (onClickListener2 != null) {
                onClickListener2.onClick(null);
                return;
            }
            return;
        }
        if (iB == 0) {
            d(str, str2, context, onClickListener, onClickListener2);
        } else if (iB == 1) {
            qpx.e(context, context.getString(R.string.IDS_thirty_app_toast, c(str2, str)));
            e(onClickListener, (View) null, true);
            return;
        } else if (iB == 2) {
            e(onClickListener, (View) null, false);
            return;
        }
        LogUtil.j(f46708c, "other ways");
    }

    private static int b(String str, Context context, String str2) {
        if (context == null) {
            LogUtil.j(f46708c, "context is null");
            return -1;
        }
        if ("com.huawei.health".equals(str) || BaseApplication.APP_PACKAGE_GOOGLE_HEALTH.equals(str)) {
            return 2;
        }
        String strC = c(str2, str);
        if (qrg.c(str)) {
            LogUtil.a(f46708c, "already told user");
            return 1;
        }
        LogUtil.a(f46708c, "first jump to ", strC);
        return 0;
    }

    private static void e(final View.OnClickListener onClickListener, final View view, boolean z) {
        if (onClickListener == null) {
            ReleaseLogUtil.d(f46707a, "jumpAppCustomWays listener is null");
        } else if (z && Build.VERSION.SDK_INT < 28 && BaseActivity.isOppoSystem()) {
            HandlerExecutor.c(new Runnable() { // from class: qsb
                @Override // java.lang.Runnable
                public final void run() {
                    onClickListener.onClick(view);
                }
            }, 500L);
        } else {
            onClickListener.onClick(view);
        }
    }

    private static String c(String str, String str2) {
        try {
            PackageManager packageManager = BaseApplication.getContext().getPackageManager();
            return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str2, 128)).toString();
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e(f46708c, "NameNotFoundException");
            return str;
        }
    }

    private static void d(final String str, String str2, final Context context, final View.OnClickListener onClickListener, final View.OnClickListener onClickListener2) {
        final String strC = c(str2, str);
        if (context instanceof Application) {
            context = BaseApplication.getActivity();
        }
        if (context == null) {
            ReleaseLogUtil.d(f46707a, "topActivity == null ");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(context);
        builder.a(context.getResources().getString(R.string.IDS_thirty_app_dialog, strC)).c(R.string.IDS_compatibility_note_open, new View.OnClickListener() { // from class: qrz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.c(str, context, strC, onClickListener, view);
            }
        }).a(R.string.IDS_settings_button_cancal_ios_btn, new View.OnClickListener() { // from class: qsa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.b(onClickListener2, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void c(String str, Context context, String str2, View.OnClickListener onClickListener, View view) {
        LogUtil.a(f46708c, "jump to other app by user agree");
        qrg.a(str);
        qpx.e(BaseApplication.getContext(), context.getResources().getString(R.string.IDS_thirty_app_toast, str2));
        e(onClickListener, view, true);
    }

    static /* synthetic */ void b(View.OnClickListener onClickListener, View view) {
        LogUtil.a(f46708c, "cancel the dialog");
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    public static void b(Context context, Intent intent) {
        if (intent == null) {
            LogUtil.j(f46708c, "startActivity intent is null.");
            return;
        }
        if (!(context instanceof Activity)) {
            Activity activity = BaseApplication.getActivity();
            if (activity != null) {
                context = activity;
            } else {
                intent.addFlags(268435456);
            }
        }
        if (context == null) {
            LogUtil.j(f46708c, "startActivity context is null.");
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e(f46708c, "startActivity exception: ActivityNotFoundException");
        } catch (SecurityException unused2) {
            LogUtil.e(f46708c, "startActivity exception: SecurityException");
        }
    }

    public static void ad() {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.parse("package:" + BaseApplication.getAppPackage()));
        b(BaseApplication.getActivity(), intent);
    }

    public static boolean d(Activity activity) {
        if (activity == null) {
            LogUtil.e(f46708c, "showNoNetworkDialog activity is null");
            return false;
        }
        if (CommonUtil.ab(activity)) {
            return false;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).b(R.string.IDS_no_notwork_tip_content).c(R.string.IDS_no_notwork_tip_understood, new View.OnClickListener() { // from class: qsf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.a(view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qsc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qrs.b(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
        return true;
    }

    public static double d(double d) {
        return new BigDecimal((d * 1.7999999523162842d) + 32.0d).setScale(1, 4).doubleValue();
    }

    public static double c(double d) {
        return new BigDecimal(d * 3.2808399200439453d).setScale(1, 4).doubleValue();
    }
}
