package com.huawei.openalliance.ad.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.ConfigMapKeys;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.js;
import com.huawei.up.utils.ErrorCode;
import com.huawei.wear.oversea.util.SystemPropertyValues;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class dk {
    public static boolean a() {
        return true;
    }

    public static boolean a(int i) {
        return 1 == i || 9 == i;
    }

    private static int b(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 9;
        }
        return i == 3 ? 8 : 1;
    }

    private static int c(int i) {
        return (i == 1 || i == 2) ? 9 : 1;
    }

    private static int d(int i) {
        return (i == 2 || i == 3) ? 8 : 0;
    }

    public static Activity z(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public static int y(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("hw_multiwindow_height_of_drag_bar", "dimen", "androidhwext");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable th) {
            hw.c("SystemUtil", "getMultiWindowDragBarHeight " + th.getClass().getSimpleName());
            return 0;
        }
    }

    public static boolean x(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return cj.a(context, Constants.POST_NOTIFICATIONS);
        }
        return true;
    }

    public static int w(Context context) {
        String str;
        if (!com.huawei.openalliance.ad.cc.a(context).r()) {
            return 0;
        }
        try {
            return 1 - Settings.Secure.getInt(context.getContentResolver(), "pure_mode_state");
        } catch (Settings.SettingNotFoundException unused) {
            str = "get pureModeState error, setting not found.";
            hw.d("SystemUtil", str);
            return 0;
        } catch (Throwable unused2) {
            str = "get pureModeState error.";
            hw.d("SystemUtil", str);
            return 0;
        }
    }

    public static boolean v(Context context) {
        try {
            return context.getPackageManager().canRequestPackageInstalls();
        } catch (Throwable th) {
            hw.c("SystemUtil", "canInstallPackage exception %s", th.getClass().getSimpleName());
            return true;
        }
    }

    public static String u(Context context) {
        StringBuilder sb;
        String strK;
        if (context == null) {
            return "";
        }
        try {
            if (TextUtils.isEmpty(t(context))) {
                sb = new StringBuilder();
                sb.append(J(context));
                sb.append(Constants.LINK);
                strK = K(context);
            } else {
                sb = new StringBuilder();
                sb.append(J(context));
                sb.append(Constants.LINK);
                sb.append(t(context));
                sb.append(Constants.LINK);
                strK = K(context);
            }
            sb.append(strK.toUpperCase(Locale.getDefault()));
            return sb.toString();
        } catch (Throwable unused) {
            hw.c("SystemUtil", " getLanguageCode error");
            return "";
        }
    }

    public static String t(Context context) {
        return context.getResources().getConfiguration().locale.getScript();
    }

    public static String s(Context context) {
        if (context == null) {
            return null;
        }
        try {
            int color = context.getResources().getColor(R.color.hiad_dark_mode_tag_color);
            StringBuffer stringBuffer = new StringBuffer("#");
            String hexString = Integer.toHexString(Color.alpha(color));
            String hexString2 = Integer.toHexString(Color.red(color));
            String hexString3 = Integer.toHexString(Color.green(color));
            String hexString4 = Integer.toHexString(Color.blue(color));
            String strB = b(hexString);
            String strB2 = b(hexString2);
            stringBuffer.append(strB).append(strB2).append(b(hexString3)).append(b(hexString4));
            hw.a("SystemUtil", " color=%s", stringBuffer.toString());
            return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
        } catch (Exception e) {
            hw.b("SystemUtil", "catch theme color exception:" + e.getClass().getName());
            return null;
        }
    }

    public static boolean r(Context context) {
        return (Build.VERSION.SDK_INT > 28 && I(context) == 2) || q(context);
    }

    public static boolean q(Context context) {
        return context != null && Constants.DARK_THEME_COLOR.equalsIgnoreCase(s(context));
    }

    public static boolean p(Context context) {
        return Build.VERSION.SDK_INT == 28 && q(context);
    }

    public static boolean o(Context context) {
        if (context == null) {
            return false;
        }
        try {
            List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) context.getSystemService("activity")).getRunningTasks(10);
            hw.a("SystemUtil", "context.getPackageName: %s " + context.getPackageName());
            if (runningTasks != null && runningTasks.size() > 0) {
                ActivityManager.RunningTaskInfo runningTaskInfo = runningTasks.get(0);
                if (runningTaskInfo != null && runningTaskInfo.topActivity != null) {
                    boolean zEquals = runningTaskInfo.topActivity.getPackageName().equals(context.getPackageName());
                    hw.a("SystemUtil", "topActivity name is %s , packageName is %", runningTaskInfo.topActivity.getClassName(), runningTaskInfo.topActivity.getPackageName());
                    if (!zEquals) {
                        return false;
                    }
                    String string = runningTaskInfo.toString();
                    hw.a("SystemUtil", "taskInfoStr : %s " + string);
                    if (string.contains("isVisible=true")) {
                        return true;
                    }
                    if (string.contains("isVisible=false")) {
                        return false;
                    }
                    return zEquals;
                }
                hw.c("SystemUtil", "topActivity is null");
            }
            return false;
        } catch (Throwable th) {
            hw.c("SystemUtil", "judge Foreground err, %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean n(Context context) {
        if (context == null) {
            return false;
        }
        return !o(context);
    }

    public static boolean m(Context context) {
        try {
            return com.huawei.openalliance.ad.ce.a(context).b();
        } catch (Throwable th) {
            hw.c("SystemUtil", "isInMultiWindowMode " + th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean l(Context context) {
        return a(k(context));
    }

    public static int k(Context context) {
        Display defaultDisplay;
        if (context == null) {
            return 1;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            hw.d("SystemUtil", "Failed to get display orientation info.");
            return context.getResources().getConfiguration().orientation == 2 ? 0 : 1;
        }
        int rotation = defaultDisplay.getRotation();
        return H(context) ? a(windowManager, rotation) : b(rotation);
    }

    public static int j(Context context) {
        int iG = g(context);
        if (iG > 0) {
            return iG / 2;
        }
        return 36;
    }

    public static boolean i(Context context) {
        StringBuilder sb;
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "display_notch_status") == 0;
        } catch (Settings.SettingNotFoundException e) {
            e = e;
            sb = new StringBuilder("isNotchEnable error:");
            sb.append(e.getClass().getSimpleName());
            hw.b("SystemUtil", sb.toString());
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("isNotchEnable Throwable:");
            sb.append(e.getClass().getSimpleName());
            hw.b("SystemUtil", sb.toString());
        }
    }

    public static boolean h() {
        return c() && !Constants.URDU_LANG.equalsIgnoreCase(Locale.getDefault().getLanguage());
    }

    public static void h(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 28) {
            String strE = e();
            hw.b("SystemUtil", "setWebDataDir processName: " + strE);
            try {
                if (TextUtils.isEmpty(strE) || strE.equals(context.getPackageName())) {
                    return;
                }
                WebView.setDataDirectorySuffix(strE);
            } catch (IllegalStateException unused) {
                str = "setDataDirectorySuffix already initialized";
                hw.d("SystemUtil", str);
            } catch (Exception unused2) {
                str = "setDataDirectorySuffix Exception";
                hw.d("SystemUtil", str);
            }
        }
    }

    public static boolean g() {
        String strA = a("ro.product.locale.region");
        if (!TextUtils.isEmpty(strA)) {
            return "cn".equalsIgnoreCase(strA);
        }
        String strA2 = a(SystemPropertyValues.PROP_LOCALE_KEY);
        if (!TextUtils.isEmpty(strA2)) {
            return strA2.toLowerCase(Locale.ENGLISH).contains("cn");
        }
        String strD = d();
        if (TextUtils.isEmpty(strD)) {
            return false;
        }
        return "cn".equalsIgnoreCase(strD);
    }

    public static int g(Context context) {
        Resources resources;
        int identifier;
        if (context != null && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", OsType.ANDROID)) > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private static int[] f(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static long f() {
        try {
            return SystemClock.elapsedRealtimeNanos() / 1000;
        } catch (Throwable th) {
            hw.b("SystemUtil", "elapsedRealtimeMillis " + th.getClass().getSimpleName());
            return 0L;
        }
    }

    public static int f(Context context) {
        Resources resources;
        int identifier;
        if (context != null && (identifier = (resources = context.getResources()).getIdentifier("navigation_bar_height", "dimen", OsType.ANDROID)) > 0 && E(context) && G(context)) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static String e(View view) {
        int[] iArrF = f(view);
        return String.format("%s,%s", Integer.valueOf(iArrF[0]), Integer.valueOf(iArrF[1]));
    }

    public static String e(Context context) {
        String str;
        if (context == null) {
            str = "getLocalCountry context is null";
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String simCountryIso = telephonyManager.getSimCountryIso();
                return TextUtils.isEmpty(simCountryIso) ? "" : simCountryIso.toUpperCase(Locale.ENGLISH);
            }
            str = "getLocalCountry tm is null";
        }
        hw.b("SystemUtil", str);
        return "";
    }

    public static String e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Application.getProcessName();
        }
        try {
            return (String) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable th) {
            hw.c("SystemUtil", "get pro name " + th.getClass().getSimpleName());
            return "";
        }
    }

    public static String d() {
        Locale locale = Locale.getDefault();
        return locale != null ? locale.getCountry() : "";
    }

    public static Context d(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("androidhwext:style/Theme.Emui", null, null);
            if (identifier > 0) {
                return new ContextThemeWrapper(context, identifier);
            }
        } catch (RuntimeException unused) {
            hw.c("SystemUtil", "getEMUIAppContext exception");
        }
        return context;
    }

    public static Activity d(View view) {
        if (view == null) {
            return null;
        }
        return z(view.getContext());
    }

    public static int[] c(View view) {
        return !a(view) ? new int[0] : new int[]{view.getMeasuredWidth(), view.getMeasuredHeight()};
    }

    public static boolean c(Context context) {
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return activity.isFinishing() || activity.isDestroyed();
    }

    public static boolean c(Activity activity) {
        if (activity == null) {
            hw.a("SystemUtil", "activity is null, not foreground");
            return false;
        }
        try {
            List<ActivityManager.RunningTaskInfo> listA = as.a((ActivityManager) activity.getSystemService("activity"));
            if (listA == null || listA.size() <= 0) {
                hw.a("SystemUtil", "taskInfoList is empty, not foreground");
                return false;
            }
            ActivityManager.RunningTaskInfo runningTaskInfo = listA.get(0);
            if (runningTaskInfo != null && runningTaskInfo.topActivity != null) {
                if (!runningTaskInfo.topActivity.getPackageName().equals(activity.getPackageName())) {
                    return false;
                }
                hw.a("SystemUtil", "topActivity: %s, checkActivity: %s", runningTaskInfo.topActivity.getClassName(), activity.getClass().getName());
                return dg.e(runningTaskInfo.topActivity.getClassName(), activity.getClass().getName());
            }
            hw.a("SystemUtil", "taskInfo is null, not foreground");
            return false;
        } catch (Throwable th) {
            hw.c("SystemUtil", "isActivityForeground ex: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean c() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static int[] b(js jsVar) {
        View view;
        if (jsVar instanceof View) {
            view = (View) jsVar;
        } else {
            view = null;
        }
        return f(view);
    }

    public static int[] b(View view) {
        if (!a(view)) {
            return new int[0];
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr;
    }

    public static boolean b(Context context, Intent intent) {
        try {
            return !bm.a(context.getPackageManager().queryIntentActivities(intent, 0));
        } catch (Throwable th) {
            hw.c("SystemUtil", "isIntentAvailable: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean b(Context context) {
        KeyguardManager keyguardManager;
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return false;
        }
        return keyguardManager.inKeyguardRestrictedInputMode();
    }

    public static boolean b(Activity activity) {
        if (activity == null) {
            return false;
        }
        try {
            return com.huawei.openalliance.ad.ce.a(activity.getApplicationContext()).a(activity);
        } catch (Throwable unused) {
            hw.c("SystemUtil", "isFreedomWindowMode error");
            return false;
        }
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static void b(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            attributes.getClass().getDeclaredField(ParamConstants.Param.LAYOUT_IN_DISPLAY_CUTOUT_MODE).setInt(attributes, i);
            activity.getWindow().setAttributes(attributes);
        } catch (Throwable unused) {
            hw.c("SystemUtil", "setLayoutMode error");
        }
    }

    private static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() != 1) {
            return str;
        }
        return "0" + str;
    }

    public static boolean a(View view, boolean z) {
        int i = z ? 0 : 8;
        if (view == null || view.getVisibility() == i) {
            return false;
        }
        view.setVisibility(i);
        return true;
    }

    public static boolean a(View view, int i) {
        return dw.a(view, i, 300, 0);
    }

    public static boolean a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static boolean a(Context context) {
        PowerManager powerManager;
        if (context == null || (powerManager = (PowerManager) context.getSystemService("power")) == null) {
            return true;
        }
        try {
            return powerManager.isInteractive();
        } catch (Exception unused) {
            hw.c("SystemUtil", "isScreenInteractive has exception");
            return true;
        }
    }

    public static boolean a(Activity activity) {
        return m(activity) && !b(activity);
    }

    public static boolean a(int i, int i2, int i3, int i4, int i5) {
        return Math.abs(i - i3) > i5 || Math.abs(i2 - i4) > i5;
    }

    public static void a(ImageView imageView) {
        if (imageView == null) {
            return;
        }
        imageView.setScaleX(c() ? -1.0f : 1.0f);
    }

    public static void a(final View view, Activity activity) {
        String str;
        String str2;
        if (activity == null) {
            str2 = "has no activity";
        } else if (!com.huawei.openalliance.ad.cc.b(activity)) {
            str2 = "not huawei phone";
        } else if (view == null) {
            str2 = "has no rootview";
        } else if (b(activity)) {
            str2 = "freedom window";
        } else {
            Window window = activity.getWindow();
            if (window != null) {
                try {
                    final com.huawei.openalliance.ad.ct ctVarA = com.huawei.openalliance.ad.ce.a(activity);
                    ctVarA.a(window.getAttributes());
                    window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.openalliance.ad.utils.dk.1
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                            String str3;
                            View view3;
                            try {
                                Rect rectA = ctVarA.a(windowInsets);
                                if (rectA != null && (view3 = view) != null) {
                                    view3.setPadding(rectA.left, 0, rectA.right, 0);
                                    return windowInsets;
                                }
                            } catch (NoSuchMethodError unused) {
                                str3 = "initOnApplyWindowInsets NoSuchMethodError getDisplaySideRegion";
                                hw.c("SystemUtil", str3);
                            } catch (Throwable th) {
                                str3 = "initOnApplyWindowInsets error:" + th.getClass().getSimpleName();
                                hw.c("SystemUtil", str3);
                            }
                            return windowInsets;
                        }
                    });
                    return;
                } catch (NoSuchMethodError unused) {
                    str = "adaptRingScreen NoSuchMethodError setDisplaySideMode";
                    hw.c("SystemUtil", str);
                    return;
                } catch (Throwable th) {
                    str = "adaptRingScreen error:" + th.getClass().getSimpleName();
                    hw.c("SystemUtil", str);
                    return;
                }
            }
            str2 = "has no window";
        }
        hw.c("SystemUtil", str2);
    }

    public static void a(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        try {
            intent.setClipData(Constants.CLIP_DATA);
            context.startActivity(intent);
        } catch (Throwable unused) {
            hw.c("SystemUtil", "start activity error");
        }
    }

    public static void a(Context context, int i, View view) {
        if (context == null || view == null) {
            return;
        }
        try {
            if (com.huawei.openalliance.ad.cc.a(context).a(context) || !a(i)) {
                return;
            }
            int iH = as.h(context);
            hw.b("SystemUtil", "top:%s", Integer.valueOf(iH));
            view.setPadding(0, iH, 0, 0);
        } catch (Throwable th) {
            hw.c("SystemUtil", "adaptStatusBar error:" + th.getClass().getSimpleName());
        }
    }

    public static void a(Activity activity, final com.huawei.openalliance.ad.views.ae aeVar) {
        if (activity == null || !com.huawei.openalliance.ad.cc.b(activity)) {
            return;
        }
        Window window = activity.getWindow();
        if (window == null) {
            hw.c("SystemUtil", "get safe padding, window is null");
            return;
        }
        try {
            final com.huawei.openalliance.ad.ct ctVarA = com.huawei.openalliance.ad.ce.a(activity);
            ctVarA.a(window.getAttributes());
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.huawei.openalliance.ad.utils.dk.2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    String str;
                    com.huawei.openalliance.ad.views.ae aeVar2;
                    try {
                        Rect rectA = ctVarA.a(windowInsets);
                        if (hw.a()) {
                            hw.a("SystemUtil", "got safe padding: %s", Integer.valueOf(rectA == null ? 0 : rectA.right));
                        }
                        if (rectA != null && (aeVar2 = aeVar) != null) {
                            aeVar2.a(rectA.right);
                            return windowInsets;
                        }
                    } catch (NoSuchMethodError unused) {
                        str = "getRingScreenSafePadding NoSuchMethodError getDisplaySideRegion";
                        hw.c("SystemUtil", str);
                    } catch (Throwable th) {
                        str = "getRingScreenSafePadding error:" + th.getClass().getSimpleName();
                        hw.c("SystemUtil", str);
                    }
                    return windowInsets;
                }
            });
        } catch (Throwable th) {
            hw.c("SystemUtil", "getSafePadding ex: %s", th.getClass().getSimpleName());
        }
    }

    public static void a(Activity activity, Context context) {
        if (context == null || activity == null) {
            hw.c("SystemUtil", "para is null");
            return;
        }
        Activity activityZ = z(context);
        if (activityZ == null) {
            hw.c("SystemUtil", "parent activity is null");
            return;
        }
        Window window = activityZ.getWindow();
        Window window2 = activity.getWindow();
        if (window == null || window2 == null) {
            hw.c("SystemUtil", "window is null");
            return;
        }
        WindowManager.LayoutParams attributes = window2.getAttributes();
        WindowManager.LayoutParams attributes2 = window.getAttributes();
        attributes.flags = attributes2.flags;
        if (!WhiteListPkgList.isHwBrowserPkgName(context.getPackageName())) {
            attributes.flags |= 67108864;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = attributes2.layoutInDisplayCutoutMode;
        }
        window2.setAttributes(attributes);
        window2.setNavigationBarColor(window.getNavigationBarColor());
        View decorView = window.getDecorView();
        View decorView2 = window2.getDecorView();
        if (decorView == null || decorView2 == null) {
            hw.c("SystemUtil", "decorView is null");
        } else {
            decorView2.setSystemUiVisibility(decorView.getSystemUiVisibility());
        }
    }

    public static void a(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        try {
            activity.setRequestedOrientation(i);
        } catch (Throwable th) {
            hw.c("SystemUtil", "set Requested Orientation Exception: " + th.getClass().getSimpleName());
        }
    }

    public static String a(String str) {
        StringBuilder sb;
        Class<?> cls;
        try {
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    cls = Class.forName(d.d() ? "com.hihonor.android.os.SystemPropertiesEx" : "com.huawei.android.os.SystemPropertiesEx");
                } catch (ClassNotFoundException unused) {
                    cls = Class.forName("android.os.SystemProperties");
                }
            } else {
                cls = Class.forName("android.os.SystemProperties");
            }
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (RuntimeException e) {
            e = e;
            sb = new StringBuilder("getSystemProperties RuntimeException:");
            sb.append(e.getClass().getSimpleName());
            hw.c("SystemUtil", sb.toString());
            return null;
        } catch (Throwable th) {
            e = th;
            sb = new StringBuilder("getSystemProperties Exception:");
            sb.append(e.getClass().getSimpleName());
            hw.c("SystemUtil", sb.toString());
            return null;
        }
    }

    public static String a(js jsVar) {
        int[] iArrB = b(jsVar);
        return String.format("%s,%s", Integer.valueOf(iArrB[0]), Integer.valueOf(iArrB[1]));
    }

    public static int a(boolean z, boolean z2) {
        return z2 ? z ? R.drawable.hiad_linked_voice_off : R.drawable.hiad_video_mute : z ? R.drawable.hiad_linked_voice_on : R.drawable.hiad_video_unmute;
    }

    public static int a(boolean z) {
        return a(false, z);
    }

    private static int a(WindowManager windowManager, int i) {
        return Math.abs(windowManager.getDefaultDisplay().getWidth()) < Math.abs(windowManager.getDefaultDisplay().getHeight()) ? c(i) : d(i);
    }

    public static int a(Context context, String str) {
        if (context == null || dg.b(str)) {
            return -1;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return -1;
            }
            return packageManager.getApplicationInfo(str, 0).uid;
        } catch (Throwable th) {
            hw.c("SystemUtil", "getUidByPackageName err: %s", th.getClass().getSimpleName());
            return -1;
        }
    }

    public static int a(int i, boolean z) {
        return z ? i > 2 ? R.drawable.hiad_template_sound_off : a(false, z) : i > 2 ? R.drawable.hiad_template_sound : a(false, z);
    }

    private static String K(Context context) {
        String lowerCase = context.getResources().getConfiguration().locale.getCountry().toLowerCase(Locale.getDefault());
        hw.b("SystemUtil", " countryStr:" + lowerCase);
        return lowerCase;
    }

    private static String J(Context context) {
        String lowerCase = context.getResources().getConfiguration().locale.getLanguage().toLowerCase(Locale.getDefault());
        hw.b("SystemUtil", " languageStr:" + lowerCase);
        return lowerCase;
    }

    private static int I(Context context) {
        if (context == null) {
            return 1;
        }
        Object systemService = context.getSystemService("uimode");
        if (systemService instanceof UiModeManager) {
            return ((UiModeManager) systemService).getNightMode();
        }
        return 1;
    }

    private static boolean H(Context context) {
        String strB = ab.b();
        int iIndexOf = strB.indexOf(Constants.LINK);
        if (iIndexOf != -1) {
            strB = strB.substring(0, iIndexOf + 1);
        }
        hw.a("SystemUtil", "Current model is %s", strB);
        String strB2 = fp.b(context).b(ConfigMapKeys.TRIFOLD_PHONE_MODEL, Constants.DEFAULT_MODEL);
        hw.a("SystemUtil", "modelStr is %s", strB2);
        return Arrays.asList(strB2.split(",")).contains(strB);
    }

    private static boolean G(Context context) {
        WindowManager windowManager;
        if (context == null || (windowManager = (WindowManager) context.getSystemService(Constants.NATIVE_WINDOW_SUB_DIR)) == null) {
            return false;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics2);
        return i2 - displayMetrics2.widthPixels > 0 || i - displayMetrics2.heightPixels > 0;
    }

    private static boolean F(Context context) {
        String[] strArr = {"force_fsg_nav_bar", "navigation_gesture_on", Constants.NAVIGATIONBAR_IS_MIN, "hide_navigationbar_enable", "force_fsg_nav_bar", "navigation_gesture_on", Constants.NAVIGATIONBAR_IS_MIN, "hide_navigationbar_enable"};
        ContentResolver contentResolver = context.getContentResolver();
        for (int i = 0; i < 8; i++) {
            if (Settings.Global.getInt(contentResolver, strArr[i], 0) != 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(Context context) {
        if (context == null) {
            return false;
        }
        boolean z = true;
        if (Build.VERSION.SDK_INT >= 28 && com.huawei.openalliance.ad.cc.b(context)) {
            int iT = d.t(context);
            hw.a("SystemUtil", "isGesture: %s", Integer.valueOf(iT));
            return iT == 0;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", OsType.ANDROID);
        boolean z2 = identifier > 0 ? resources.getBoolean(identifier) : false;
        String strA = a("qemu.hw.mainkeys");
        if ("1".equals(strA)) {
            z = false;
        } else if (!"0".equals(strA)) {
            z = z2;
        }
        if (!F(context)) {
            return z;
        }
        hw.a("SystemUtil", "is gesture");
        return false;
    }

    public static boolean D(Context context) {
        try {
            return ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(1) != null;
        } catch (Throwable th) {
            hw.c("SystemUtil", "hasAccSensor err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean C(Context context) {
        try {
            return ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(15) != null;
        } catch (Throwable th) {
            hw.c("SystemUtil", "hasRotateSensor err: %s", th.getClass().getSimpleName());
            return false;
        }
    }

    public static boolean B(Context context) {
        if (context != null) {
            try {
                if (!dg.b(context.getPackageName())) {
                    String packageName = context.getPackageName();
                    if (a("hw_sc.build.platform.version") == null) {
                        return true;
                    }
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    Class<?> cls = Class.forName("com.huawei.android.app.AppOpsManagerEx");
                    Method method = cls.getMethod("checkHwOpNoThrow", AppOpsManager.class, Integer.TYPE, Integer.TYPE, String.class);
                    if (method == null) {
                        hw.c("SystemUtil", "judgeHwOpIsAllow, method is null.");
                        return true;
                    }
                    Integer num = (Integer) method.invoke(cls, appOpsManager, Integer.valueOf(ErrorCode.HWID_IS_STOPED), Integer.valueOf(a(context, packageName)), packageName);
                    int iIntValue = num.intValue();
                    boolean z = iIntValue == 0 || iIntValue == 3;
                    hw.b("SystemUtil", "judgeHwOpIsAllow, result is %s, per is %s", num, Boolean.valueOf(z));
                    return z;
                }
            } catch (Throwable th) {
                hw.c("SystemUtil", "JudgeHwOpIsAllow err: %s", th.getClass().getSimpleName());
                return true;
            }
        }
        hw.c("SystemUtil", "judgeHwOpIsAllow, param is invalid");
        return true;
    }

    public static void A(Context context) {
        String str;
        if (context != null) {
            try {
                if (context instanceof Activity) {
                    Window window = ((Activity) context).getWindow();
                    if (window != null) {
                        window.getDecorView().setSystemUiVisibility((window.getDecorView().getSystemUiVisibility() & (-5)) | 7936);
                        return;
                    }
                    str = "window is null";
                } else {
                    str = "para err";
                }
            } catch (Throwable th) {
                hw.c("SystemUtil", "showContentInNaviBar err: %s", th.getClass().getSimpleName());
                return;
            }
        } else {
            str = "para err";
        }
        hw.b("SystemUtil", str);
    }
}
