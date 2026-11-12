package com.huawei.watchface.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.view.ViewCompat;
import com.huawei.healthcloud.plugintrack.ui.map.InterfaceHiMap;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.openalliance.ad.constant.OsType;
import com.huawei.operation.utils.Constants;
import com.huawei.secure.android.common.detect.RootDetect;
import com.huawei.secure.android.common.encrypt.hash.SHA;
import com.huawei.secure.android.common.util.FileUtil;
import com.huawei.secure.android.common.util.SafeString;
import com.huawei.uikit.hwbutton.widget.HwButton;
import com.huawei.watchface.R;
import com.huawei.watchface.api.HwWatchFaceApi;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.i1;
import com.huawei.watchface.j0;
import com.huawei.watchface.mvp.model.datatype.WatchResourcesInfo;
import com.huawei.watchface.mvp.model.helper.systemparam.NewSystemParamManager;
import com.huawei.watchface.mvp.model.helper.systemparam.SystemParamNames;
import com.huawei.watchface.p0;
import com.huawei.watchface.q0;
import com.huawei.watchface.utils.permission.PermissionUtil;
import com.huawei.watchface.x2;
import defpackage.orb;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes20.dex */
public class CommonUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30594a = "CommonUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f30595b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f30596c = -1;
    public static ArrayList d = new ArrayList(Arrays.asList("file:///android_asset/stressGame/html/twoVideoPlay.html", "file:///android_asset/stressGame/html/twoVideoPlay_old.html"));
    public static ArrayList e = new ArrayList(Arrays.asList("file:///android_asset/operation/MessageH5/html/recommendIndex1.html", "file:///android_asset/operation/MessageH5/html/recommendBohee.html", "file:///android_asset/operation/MessageH5/html/honorBracelet.html", "file:///android_asset/operation/MessageH5/html/recommendIndex2.html", "file:///android_asset/operation/MessageH5/html/huaweiBracelet.html", "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=110", "file:///android_asset/operation/activity/web/html/activityShare.html?activityId=166"));
    public static Boolean f;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HwButton f30597a;

        public a(HwButton hwButton) {
            this.f30597a = hwButton;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f30597a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f30597a.getLineCount() > 1) {
                HwLog.d(CommonUtils.f30594a, "getLineCount more than the 1");
                this.f30597a.setTextSize(1, 9.0f);
                this.f30597a.setMaxLines(1);
                this.f30597a.setEllipsize(TextUtils.TruncateAt.END);
            }
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HwButton f30598a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HwButton f30599b;

        public b(HwButton hwButton, HwButton hwButton2) {
            this.f30598a = hwButton;
            this.f30599b = hwButton2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f30598a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f30598a.getLineCount() > 1) {
                CommonUtils.b(this.f30598a, this.f30599b);
            }
        }
    }

    public class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HwButton f30600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HwButton f30601b;

        public c(HwButton hwButton, HwButton hwButton2) {
            this.f30600a = hwButton;
            this.f30601b = hwButton2;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f30600a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (this.f30600a.getLineCount() > 1) {
                CommonUtils.b(this.f30601b, this.f30600a);
            }
        }
    }

    public static boolean A() {
        return !BaseApplication.APP_PACKAGE_GOOGLE_HEALTH.equals(Environment.b()) && "1".equals(NewSystemParamManager.b(SystemParamNames.CLIENT_SUPPORT_MEMBERSHIP));
    }

    public static int B() {
        return A() ? 1 : 0;
    }

    public static boolean C() {
        return x2.d();
    }

    public static boolean D() {
        return NotificationManagerCompat.from(Environment.getApplicationContext()).areNotificationsEnabled();
    }

    public static boolean E() {
        boolean zIsRoot;
        Boolean bool = f;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            zIsRoot = RootDetect.isRoot();
        } catch (Throwable th) {
            HwLog.e(f30594a, "isRoot throwable" + HwLog.printException(th));
            zIsRoot = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zIsRoot);
        f = boolValueOf;
        boolValueOf.getClass();
        return zIsRoot;
    }

    public static boolean F() {
        String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.SYSTEM_PARAM_WATCHFACE_MEMBER_IAP4_SWITCH_V1, "0");
        HwLog.i(f30594a, "isSupportPayIap4: " + systemParam);
        return TextUtils.equals("1", systemParam);
    }

    public static boolean G() {
        return u() && Build.VERSION.SDK_INT > 28;
    }

    public static boolean H() {
        return true;
    }

    public static boolean I() {
        return p0.c() > 17;
    }

    public static boolean J() {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext != null) {
            return (applicationContext.getResources().getConfiguration().screenLayout & 15) >= 3;
        }
        HwLog.e(f30594a, "isWidescreen() context is null!!");
        return false;
    }

    public static String a(boolean z) {
        HwLog.e(f30594a, "getAppIdHex39Above14() is39Above14: " + z);
        if (!z) {
            return b();
        }
        return i1.b(123) + i1.b(2) + i1.b(0) + i1.b(4);
    }

    public static int b(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            HwLog.d(f30594a, "stringToInt str is empty");
            return i;
        }
        try {
            if (str.contains(".")) {
                str = SafeString.substring(str, 0, str.indexOf("."));
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            HwLog.e(f30594a, "stringToInt Exception e = " + HwLog.printException((Exception) e2));
            return i;
        }
    }

    public static File c(Context context) {
        if (context == null) {
            context = Environment.getApplicationContext();
        }
        File externalFilesDir = null;
        if ("mounted".equals(android.os.Environment.getExternalStorageState()) || !android.os.Environment.isExternalStorageRemovable()) {
            externalFilesDir = PermissionUtil.isAndroidQ() ? context.getExternalFilesDir(null) : android.os.Environment.getExternalStorageDirectory();
        }
        if (externalFilesDir != null) {
            return externalFilesDir;
        }
        HwLog.w(f30594a, "getExternalFilesDirectory:innerContext.getFilesDir");
        return context.getFilesDir();
    }

    public static String d() {
        return a(false);
    }

    public static String e() {
        return a(true);
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return TextUtils.isEmpty(str.substring(0, str.lastIndexOf(new File(str.trim()).getName())));
    }

    public static String filterFilePath(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            if (f(str) || FileUtil.filePathIsValidNew(str)) {
                return new File(str).getCanonicalPath();
            }
            HwLog.e(f30594a, "filterFilePath sourcePath is not Valid");
            return null;
        } catch (IOException e2) {
            HwLog.w(f30594a, "filterFilePath IOException :" + HwLog.printException((Exception) e2));
            return null;
        } catch (Exception e3) {
            HwLog.w(f30594a, "filterFilePath Exception :" + HwLog.printException(e3));
            return null;
        }
    }

    public static String g() {
        return p0.b();
    }

    public static String getAuthority() {
        return Environment.b() + ".fileprovider";
    }

    public static String getAuthorityByUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return uri.getAuthority();
        } catch (Exception e2) {
            HwLog.e(f30594a, "getAuthorityByUri exception: " + HwLog.printException(e2));
            return null;
        }
    }

    public static FileDescriptor getFileDescriptor(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                HwLog.i(f30594a, "getFileDescriptor pathUri is null");
                return null;
            }
            Application applicationContext = Environment.getApplicationContext();
            if (applicationContext != null && applicationContext.getContentResolver() != null) {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = applicationContext.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    return parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                }
                return null;
            }
            HwLog.i(f30594a, "getFileDescriptor application is null or getContentResolver is null");
            return null;
        } catch (FileNotFoundException e2) {
            HwLog.i(f30594a, "getFileDescriptor() FileNotFoundException." + HwLog.printException((Exception) e2));
        } catch (Exception e3) {
            HwLog.i(f30594a, "getFileDescriptor() Exception." + HwLog.printException(e3));
        }
    }

    public static int getVersionCode() {
        try {
            Application applicationContext = Environment.getApplicationContext();
            if (applicationContext == null) {
                HwLog.i(f30594a, "getVersionCode context is null");
                return 0;
            }
            int i = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 16384).versionCode;
            if (HwWatchFaceApi.getInstance(applicationContext).isBetaVersion() || HwWatchFaceApi.getInstance(applicationContext).isTestVersion()) {
                String strA = p0.a("debug.huawei.watchface.version");
                if (!TextUtils.isEmpty(strA)) {
                    return IntegerUtils.getInteger(strA, i);
                }
            }
            return i;
        } catch (PackageManager.NameNotFoundException e2) {
            HwLog.e(f30594a, "getVersionCode -- NameNotFoundException exception:" + HwLog.printException((Exception) e2));
            return 0;
        } catch (Exception e3) {
            HwLog.e(f30594a, "getVersionCode - Exception:" + HwLog.printException(e3));
            return 0;
        }
    }

    public static int h(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int i() {
        int i = f30596c;
        if (i != -1) {
            return i;
        }
        try {
            PackageInfo packageInfo = Environment.getApplicationContext().getPackageManager().getPackageInfo("com.huawei.hwid", 16384);
            if (packageInfo != null) {
                int i2 = packageInfo.versionCode;
                f30596c = i2;
                return i2;
            }
        } catch (Exception e2) {
            HwLog.e(f30594a, "ILocalAccountService getHMSVersion com.huawei.hwid exception " + HwLog.printException(e2));
        }
        return f30596c;
    }

    public static boolean isAndroid10() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean isAndroid11() {
        return Build.VERSION.SDK_INT > 29;
    }

    public static boolean isAndroid13() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean isAndroid14() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean j(Context context) {
        boolean zB;
        boolean zC;
        if (context == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(32);
        arrayList.add("60.0.3112.116");
        arrayList.add("60.0.3112.107");
        arrayList.add("60.0.3112.78");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.webview", 1);
            zB = b(packageInfo);
            try {
                zC = c(packageInfo);
            } catch (PackageManager.NameNotFoundException e2) {
                e = e2;
                HwLog.i(f30594a, "isErrorWebView: e=" + HwLog.printException((Exception) e));
                zC = false;
            } catch (RuntimeException e3) {
                e = e3;
                HwLog.e(f30594a, "runtimeException " + HwLog.printException((Exception) e));
                zC = false;
            }
        } catch (PackageManager.NameNotFoundException e4) {
            e = e4;
            zB = false;
        } catch (RuntimeException e5) {
            e = e5;
            zB = false;
        }
        String str = f30594a;
        HwLog.i(str, " isSystemUpdateApp : " + zB + "isUserApp : " + zC);
        String strD = d(context, "com.google.android.webview");
        if (arrayList.contains(strD)) {
            HwLog.i(str, "listErrorVersion.contains(webviewVersion)");
            if (zB || zC || "60.0.3112.107".equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public static int k(String str) {
        return b(str, 0);
    }

    public static boolean l(Context context) {
        return 1 == a();
    }

    public static void m(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", applicationContext.getPackageName(), null));
        if (setIntentComponent(context, intent)) {
            a(applicationContext, intent);
        }
    }

    public static boolean n() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean o() {
        return true;
    }

    public static boolean p() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean q() {
        return !f30595b;
    }

    public static String r() {
        String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.CLIENT_SUPPORT_FREETAB, "1");
        HwLog.i(f30594a, "isCloudConfigSupported: " + systemParam);
        return systemParam;
    }

    public static boolean s() {
        String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.CLIENT_SUPPORT_HUMANPORTRAIT, "0");
        HwLog.i(f30594a, "isCloudConfigSupportedHumanPortrait: " + systemParam);
        return systemParam.equalsIgnoreCase("1");
    }

    public static boolean setIntentComponent(Context context, Intent intent) {
        ResolveInfo resolveInfoResolveActivity;
        if (context == null) {
            HwLog.w(f30594a, "setIntentComponent context is null");
            return false;
        }
        if (intent == null) {
            HwLog.w(f30594a, "setIntentComponent intent is null");
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            HwLog.i(f30594a, "setIntentComponent intent false");
            return false;
        }
        ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        HwLog.i(f30594a, "setIntentComponent intent true");
        return true;
    }

    public static void showPermissionSettingGuide(Context context, String str) {
        if (context == null) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        new j0.a(context).b(R.string.watch_face_permission_required).a(str).a(R.string.cancel, new View.OnClickListener() { // from class: com.huawei.watchface.utils.CommonUtils$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HwLog.d(CommonUtils.f30594a, "setNegativeButton onclick called String");
            }
        }).b(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: com.huawei.watchface.utils.CommonUtils$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CommonUtils.a(applicationContext, view);
            }
        }).a().show();
    }

    public static void startActivityForResult(Activity activity, Intent intent, int i) {
        if (activity == null || intent == null) {
            HwLog.e(f30594a, "startActivityForResult params is null");
            return;
        }
        try {
            activity.startActivityForResult(intent, i);
        } catch (Exception e2) {
            HwLog.e(f30594a, "startActivityForResult Exception: " + HwLog.printException(e2));
        }
    }

    public static boolean t() {
        String systemParam = NewSystemParamManager.getSystemParam(SystemParamNames.CLIENT_SUPPORT_WEAR, "0");
        HwLog.i(f30594a, "isCloudConfigSupportedWear: " + systemParam);
        return systemParam.equalsIgnoreCase("1");
    }

    public static boolean u() {
        return p0.i();
    }

    public static boolean v() {
        return p0.c() >= 21;
    }

    public static boolean w() {
        return p0.c() >= 19;
    }

    public static boolean x() {
        return f30595b;
    }

    public static boolean y() {
        int i = i();
        String str = f30594a;
        HwLog.i(str, "isHmsAvailable versionCode:" + i);
        if (i <= 0) {
            return false;
        }
        boolean z = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(Environment.getApplicationContext()) == 0;
        HwLog.i(str, "isHmsAvailable: " + z);
        return z;
    }

    public static boolean z() {
        return (b("ro.config.hw_fold_disp", "").isEmpty() && b("persist.sys.fold.disp.size", "").isEmpty()) ? false : true;
    }

    public static int d(Context context) {
        int networkType = -1;
        if (context == null) {
            HwLog.w(f30594a, "getNetEnvironment null");
            return -1;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) {
            int type = activeNetworkInfo.getType();
            if (type == 1) {
                return 1;
            }
            if (type == 0) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (ActivityCompat.checkSelfPermission(context, "android.permission.READ_PHONE_STATE") == 0) {
                    networkType = telephonyManager.getNetworkType();
                }
            } else {
                HwLog.w(f30594a, "type match failed");
            }
        }
        HwLog.d(f30594a, "telephone networkType:" + networkType);
        return a(networkType);
    }

    public static void e(Context context, String str) {
        if (context == null || str == null) {
            HwLog.w(f30594a, "uninstallApk null");
            return;
        }
        Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + str));
        if (setIntentComponent(context, intent)) {
            a(context, intent);
        }
    }

    public static int g(Context context) {
        Resources resources;
        int iComplexToDimensionPixelSize;
        int iB = DensityUtil.b(R.dimen.dp_48);
        if (context != null) {
            try {
                TypedValue typedValue = new TypedValue();
                Resources.Theme theme = context.getTheme();
                if (theme != null && theme.resolveAttribute(android.R.attr.actionBarSize, typedValue, true) && (resources = context.getResources()) != null && (iComplexToDimensionPixelSize = TypedValue.complexToDimensionPixelSize(typedValue.data, resources.getDisplayMetrics())) > 0) {
                    return iComplexToDimensionPixelSize;
                }
            } catch (Exception e2) {
                HwLog.e(f30594a, "getToolBarHeight Exception: " + HwLog.printException(e2));
            }
        }
        return iB;
    }

    public static int[] k() {
        DisplayMetrics displayMetrics = Environment.getApplicationContext().getResources().getDisplayMetrics();
        return new int[]{displayMetrics.heightPixels, displayMetrics.widthPixels};
    }

    public static int l() {
        return Environment.sIsAarInTheme ? 12 : 4;
    }

    public static String l(String str) {
        return TextUtils.isEmpty(str) ? str : str.trim();
    }

    public static boolean h(String str) {
        return e.contains(str);
    }

    public static String h() {
        try {
            PackageInfo packageInfo = Environment.getApplicationContext().getPackageManager().getPackageInfo("com.huawei.hwid", 16384);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return "";
        } catch (Exception e2) {
            HwLog.e(f30594a, "ILocalAccountService getHMSVersion com.huawei.hwid exception " + HwLog.printException(e2));
            return "";
        }
    }

    public static int e(Context context) {
        if (context == null) {
            HwLog.e(f30594a, " updateNotchInfos context is null !");
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", OsType.ANDROID);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean k(Context context) {
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        return (activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static String f() {
        return DensityUtil.getStringById(R.string.is_pad);
    }

    public static String m() {
        Object objA = Environment.a("activity");
        if (!(objA instanceof ActivityManager)) {
            return "";
        }
        List<ActivityManager.RunningTaskInfo> runningTasks = ((ActivityManager) objA).getRunningTasks(1);
        String className = !ArrayUtils.isEmpty(runningTasks) ? runningTasks.get(0).topActivity.getClassName() : null;
        return className == null ? "" : className;
    }

    public static int a(Context context, float f2) {
        return (int) ((f2 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int f(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static void a(HwButton hwButton) {
        if (hwButton == null) {
            return;
        }
        hwButton.getViewTreeObserver().addOnGlobalLayoutListener(new a(hwButton));
    }

    public static void a(HwButton hwButton, HwButton hwButton2) {
        if (hwButton == null || hwButton2 == null) {
            return;
        }
        hwButton.getViewTreeObserver().addOnGlobalLayoutListener(new b(hwButton, hwButton2));
        hwButton2.getViewTreeObserver().addOnGlobalLayoutListener(new c(hwButton2, hwButton));
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= 995) {
            return str;
        }
        return "*" + SafeString.substring(str, str.length() - 994);
    }

    public static byte[] b(byte[] bArr) {
        return SHA.shaEncryptByte(bArr, "SHA-256");
    }

    public static boolean c(PackageInfo packageInfo) {
        return (a(packageInfo) || b(packageInfo)) ? false : true;
    }

    public static String b() {
        HwLog.e(f30594a, "getAppIdHex() enter.");
        if (Environment.sIsAarInTheme) {
            return i1.b(123) + i1.b(2) + i1.b(0) + i1.b(5);
        }
        return "";
    }

    public static String c(int i) {
        return String.format(Locale.ENGLISH, "#%06X", Integer.valueOf(i & ViewCompat.MEASURED_SIZE_MASK));
    }

    public static String c(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    PackageManager packageManager = context.getPackageManager();
                    return packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)).toString();
                }
            } catch (PackageManager.NameNotFoundException e2) {
                HwLog.e(f30594a, "getAppNameByPackageName NameNotFoundException = " + HwLog.printException((Exception) e2));
                return "";
            } catch (Exception e3) {
                HwLog.e(f30594a, "getAppNameByPackageName e = " + HwLog.printException(e3));
                return "";
            }
        }
        HwLog.w(f30594a, "Invalid input: context or packageName is null/empty");
        return "";
    }

    public static void i(Context context) {
        if (context == null) {
            HwLog.w(f30594a, "goToNetWorkSettingPage null");
        } else {
            a(context, new Intent("android.settings.SETTINGS"));
        }
    }

    public static boolean i(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("file:///data/data/com.huawei.health/files/plugins/")) {
            str = FileHelper.d(str);
            if (str.startsWith("file:///data/data/com.huawei.health/files/plugins/")) {
                return true;
            }
        }
        return d.contains(str) || h(str);
    }

    public static boolean g(String str) {
        Double dValueOf;
        try {
            HwLog.i(f30594a, "amountStr : " + str);
            dValueOf = Double.valueOf(str);
        } catch (NumberFormatException e2) {
            HwLog.i(f30594a, "NumberFormatException " + HwLog.printException((Exception) e2));
            dValueOf = null;
        }
        boolean z = dValueOf != null && Double.compare(dValueOf.doubleValue(), 0.0d) == 0;
        HwLog.i(f30594a, "isZero:" + z);
        return z;
    }

    public static int b(Context context, float f2) {
        return (int) ((f2 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String d(Context context, String str) {
        if (context != null && str != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 16384).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                HwLog.e(f30594a, "NameNotFoundException exception");
                return "";
            } catch (Exception unused2) {
                HwLog.e(f30594a, "getVersion Exception");
                return "";
            }
        }
        HwLog.w(f30594a, "getVersion null");
        return null;
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class).invoke(null, str, str2);
            if (objInvoke instanceof String) {
                str2 = (String) objInvoke;
            }
        } catch (ClassNotFoundException unused) {
            HwLog.e(f30594a, "getSystemProperties ClassNotFoundException");
        } catch (IllegalAccessException unused2) {
            HwLog.e(f30594a, "getSystemProperties IllegalAccessException");
        } catch (NoSuchMethodException unused3) {
            HwLog.e(f30594a, "getSystemProperties NoSuchMethodException");
        } catch (InvocationTargetException unused4) {
            HwLog.e(f30594a, "getSystemProperties InvocationTargetException");
        }
        HwLog.d(f30594a, "emui get system properties value = " + str2);
        return str2;
    }

    public static int j() {
        if (p()) {
            TypedValue typedValue = new TypedValue();
            if (Environment.c() == null) {
                return DensityUtil.b(R.dimen.dp_16);
            }
            if (Environment.c().getTheme() == null) {
                return DensityUtil.b(R.dimen.dp_16);
            }
            Environment.c().getTheme().resolveAttribute(33620168, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0 && Environment.c().getResources() != null) {
                return Environment.c().getResources().getDimensionPixelSize(i);
            }
            return DensityUtil.b(R.dimen.dp_16);
        }
        return DensityUtil.b(R.dimen.dp_16);
    }

    public static boolean d(File file) {
        if (file == null) {
            return false;
        }
        try {
            boolean zMkdirs = file.mkdirs();
            if (!zMkdirs) {
                HwLog.e(f30594a, "create folder failed.");
            }
            return zMkdirs;
        } catch (Exception e2) {
            HwLog.e(f30594a, "create folder exception:" + HwLog.printException(e2));
            return false;
        }
    }

    public static String c() {
        return q0.c();
    }

    public static String c(File file) {
        if (file == null) {
            return null;
        }
        return c(file.getPath());
    }

    public static String c(String str) {
        int iLastIndexOf;
        return (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(File.separator)) == -1) ? str : SafeString.substring(str, iLastIndexOf + 1);
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.length() <= 995) {
            return str;
        }
        return SafeString.substring(str, 0, 995) + "*";
    }

    public static byte[] j(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            HwLog.e(f30594a, "stringAsBytes fail");
            return new byte[0];
        }
    }

    public static void b(HwButton hwButton, HwButton hwButton2) {
        HwLog.d(f30594a, "getLineCount > 1");
        hwButton.setTextSize(1, 9.0f);
        hwButton.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        hwButton.setEllipsize(truncateAt);
        hwButton2.setTextSize(1, 9.0f);
        hwButton2.setMaxLines(1);
        hwButton2.setEllipsize(truncateAt);
    }

    public static boolean b(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                Activity activity = WebViewActivity.getActivity();
                if (activity != null) {
                    activity.startActivity(intent);
                    return true;
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e2) {
                HwLog.e(f30594a, "startActivityRes Exception: " + HwLog.printException(e2));
                return false;
            }
        }
        HwLog.e(f30594a, "startActivityRes params is null");
        return false;
    }

    public static String a(double d2, int i, int i2) {
        if (i != 1) {
            if (i == 2) {
                NumberFormat percentInstance = NumberFormat.getPercentInstance();
                try {
                    percentInstance.setRoundingMode(RoundingMode.HALF_UP);
                } catch (Exception e2) {
                    HwLog.e(f30594a, "getNumberFormat " + HwLog.printException(e2));
                }
                if (i2 >= 0) {
                    percentInstance.setMaximumFractionDigits(i2);
                    percentInstance.setMinimumFractionDigits(i2);
                }
                return percentInstance.format(d2 / 100.0d);
            }
            return "";
        }
        NumberFormat numberFormat = NumberFormat.getInstance();
        try {
            numberFormat.setRoundingMode(RoundingMode.HALF_UP);
        } catch (Exception e3) {
            HwLog.e(f30594a, "getNumberFormat Exception" + HwLog.printException(e3));
        }
        if (i2 >= 0) {
            numberFormat.setMaximumFractionDigits(i2);
            numberFormat.setMinimumFractionDigits(i2);
        }
        if (LanguageUtils.c()) {
            numberFormat.setMinimumFractionDigits(0);
        }
        return numberFormat.format(d2);
    }

    public static HashMap a(Object obj) {
        HashMap map = new HashMap(32);
        if (obj instanceof HashMap) {
            for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof WatchResourcesInfo) {
                    map.put(str, (WatchResourcesInfo) value);
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
        return map;
    }

    public static boolean b(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & 128) != 0;
    }

    public static void b(Context context, String str) {
        String str2 = f30594a;
        HwLog.i(str2, "downloadApkByPackageName");
        if (context != null && str != null) {
            try {
                Uri uri = Uri.parse("market://details?id=" + str);
                if (uri != null) {
                    HwLog.i(str2, "downloadApkByPackageName startActivity");
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
                    intent.addFlags(268435456);
                    if (setIntentComponent(context, intent)) {
                        context.startActivity(intent);
                        return;
                    }
                    return;
                }
                HwLog.e(str2, "uri is null!");
                return;
            } catch (ActivityNotFoundException e2) {
                HwLog.e(f30594a, "ActivityNotFoundException e = " + HwLog.printException((Exception) e2));
                return;
            } catch (Exception unused) {
                HwLog.e(f30594a, "downloadApkByPackageName Exception e = ");
                return;
            }
        }
        HwLog.w(str2, "downloadApkByPackageName null");
    }

    public static /* synthetic */ void a(Context context, View view) {
        HwLog.d(f30594a, "setPositiveButton onclick called String");
        m(context);
    }

    public static void a(Context context, Intent intent) {
        if (context != null && intent != null) {
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e2) {
                HwLog.e(f30594a, "startActivity Exception: " + HwLog.printException((Exception) e2));
                return;
            } catch (Exception e3) {
                HwLog.e(f30594a, "startActivity Exception: " + HwLog.printException(e3));
                return;
            }
        }
        HwLog.e(f30594a, "startActivity params is null");
    }

    public static String b(Context context) {
        return "and_health_" + c();
    }

    public static byte[] b(String str) {
        if (str == null) {
            return new byte[0];
        }
        int length = str.length();
        if (length % 2 != 0) {
            return new byte[0];
        }
        String upperCase = str.toUpperCase(Locale.getDefault());
        for (int i = 0; i < length; i++) {
            char cCharAt = upperCase.charAt(i);
            if (('0' > cCharAt || cCharAt > '9') && ('A' > cCharAt || cCharAt > 'F')) {
                return new byte[0];
            }
        }
        int i2 = length / 2;
        byte[] bArr = new byte[i2];
        byte[] bArr2 = new byte[2];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            bArr2[0] = (byte) upperCase.charAt(i4);
            int i5 = i4 + 2;
            bArr2[1] = (byte) upperCase.charAt(i4 + 1);
            for (int i6 = 0; i6 < 2; i6++) {
                byte b2 = bArr2[i6];
                bArr2[i6] = (byte) (b2 - ((65 > b2 || b2 > 70) ? (byte) 48 : (byte) 55));
            }
            bArr[i3] = (byte) ((bArr2[0] << 4) | bArr2[1]);
            i3++;
            i4 = i5;
        }
        return bArr;
    }

    public static void a(Window window, int i, boolean z) {
        if (window == null) {
            return;
        }
        window.setStatusBarColor(i);
        if (z) {
            window.setStatusBarColor(Color.argb(0, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE, InterfaceHiMap.POLY_LINE_MAX_SIZE));
            window.getDecorView().setSystemUiVisibility(9216);
        } else {
            window.setStatusBarColor(0);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    public static int a(int i) {
        int i2;
        String str = f30594a;
        HwLog.d(str, "getNetworkClassByType-start");
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                i2 = 2;
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                i2 = 3;
                break;
            case 13:
                i2 = 4;
                break;
            default:
                i2 = -1;
                break;
        }
        HwLog.d(str, "getNetworkClassByType-end");
        return i2;
    }

    public static void b(boolean z) {
        f30595b = z;
    }

    public static int b(int i) {
        HwLog.w(f30594a, "getTlvHeadLengthNew() commandId: " + i);
        if (i < 14) {
            return l();
        }
        return 12;
    }

    public static boolean b(File file) {
        String[] list;
        if (file == null) {
            HwLog.w(f30594a, "deleteFiles null");
            return false;
        }
        if (file.isDirectory() && (list = file.list()) != null && list.length > 0) {
            for (String str : list) {
                if (!b(new File(file, str))) {
                    return false;
                }
            }
        }
        try {
            return file.delete();
        } catch (SecurityException e2) {
            HwLog.e(f30594a, "SecurityException=" + HwLog.printException((Exception) e2));
            return false;
        } catch (Exception unused) {
            HwLog.e(f30594a, "deleteFiles Exception");
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo) {
        return (packageInfo.applicationInfo.flags & 1) != 0;
    }

    public static boolean a(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null) {
            HwLog.w(f30594a, "checkAppIsInstall null");
            return false;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(str, 16384);
        } catch (PackageManager.NameNotFoundException e2) {
            HwLog.e(f30594a, "NameNotFoundException " + HwLog.printException((Exception) e2));
            packageInfo = null;
        } catch (RuntimeException e3) {
            HwLog.e(f30594a, "runtimeException " + HwLog.printException((Exception) e3));
            packageInfo = null;
        }
        return packageInfo != null;
    }

    public static int a(String str, String str2) {
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        int iMin = Math.min(strArrSplit.length, strArrSplit2.length);
        int length = 0;
        for (int i = 0; i < iMin; i++) {
            length = strArrSplit[i].length() - strArrSplit2[i].length();
            if (length != 0 || (length = strArrSplit[i].compareTo(strArrSplit2[i])) != 0) {
                break;
            }
        }
        return length != 0 ? length : strArrSplit.length - strArrSplit2.length;
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        char[] cArr2 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int i = 0;
        int i2 = 0;
        while (i2 < bArr.length) {
            byte b2 = bArr[i2];
            cArr[i] = cArr2[(b2 >>> 4) & 15];
            cArr[i + 1] = cArr2[b2 & 15];
            i2++;
            i += 2;
        }
        return new String(cArr);
    }

    public static void a(Activity activity, int i) {
        if (activity == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.PICK");
        intent.setType(Constants.IMAGE_TYPE);
        startActivityForResult(activity, intent, i);
    }

    public static Bitmap a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            int iLastIndexOf = str.lastIndexOf(",");
            String strSubstring = SafeString.substring(str, iLastIndexOf + 1);
            HwLog.e(f30594a, "convertStr2Bitmap indexOf：" + iLastIndexOf);
            byte[] bArrDecode = Base64.getDecoder().decode(strSubstring);
            return a(bArrDecode, 0, bArrDecode.length);
        } catch (OutOfMemoryError e2) {
            HwLog.e(f30594a, "convertStr2Bitmap OutOfMemoryError " + HwLog.printException((Error) e2));
            return null;
        } catch (RuntimeException e3) {
            HwLog.e(f30594a, "convertStr2Bitmap ：" + HwLog.printException((Exception) e3));
            return null;
        } catch (Exception e4) {
            HwLog.e(f30594a, "convertStr2Bitmap Exception：" + HwLog.printException(e4));
            return null;
        }
    }

    public static Bitmap a(byte[] bArr, int i, int i2) {
        try {
            return a(bArr, i, i2, (BitmapFactory.Options) null);
        } catch (Exception e2) {
            HwLog.e(f30594a, "getSafeDecodeByteArray Exception" + HwLog.printException(e2));
            return null;
        } catch (OutOfMemoryError e3) {
            HwLog.e(f30594a, "getSafeDecodeByteArray OutOfMemoryError" + HwLog.printException((Error) e3));
            return null;
        }
    }

    public static Bitmap a(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        try {
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        } catch (Exception e2) {
            HwLog.e(f30594a, "getSafeDecodeByteArray Exception " + HwLog.printException(e2));
            return null;
        } catch (OutOfMemoryError e3) {
            HwLog.e(f30594a, "getSafeDecodeByteArray OutOfMemoryError " + HwLog.printException((Error) e3));
            if (options == null) {
                options = new BitmapFactory.Options();
            }
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, i, i2, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            options.inJustDecodeBounds = false;
            DisplayMetrics displayMetrics = Environment.getApplicationContext().getResources().getDisplayMetrics();
            options.inSampleSize = a(i3, i4, displayMetrics.widthPixels, displayMetrics.heightPixels);
            return BitmapFactory.decodeByteArray(bArr, i, i2, options);
        }
    }

    public static int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        while (true) {
            if (i2 / i5 <= i4 && i / i5 <= i3) {
                return i5;
            }
            i5 *= 2;
        }
    }

    public static void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (!file.isDirectory()) {
            if (!file.delete()) {
                HwLog.e(f30594a, "delete file false:" + c(file));
                return;
            }
            HwLog.w(f30594a, "delete file success");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                a(file2);
            }
            if (!file2.delete()) {
                HwLog.e(f30594a, ": delete file false :" + c(file2));
            }
        }
        if (!file.exists() || file.delete()) {
            return;
        }
        HwLog.e(f30594a, "FatherFile delete false");
    }

    public static int a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) Environment.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getType();
        }
        return -1;
    }

    public static boolean a(Context context) {
        try {
            context.getPackageManager().getApplicationInfo(HMSPackageManager.getInstance(context).getHMSPackageName(), 128);
            HwLog.i(f30594a, "checkIsInstallHuaweiAccount() result is true.");
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            HwLog.i(f30594a, "checkIsInstallHuaweiAccount() NameNotFoundException.");
            return false;
        } catch (RuntimeException unused2) {
            HwLog.i(f30594a, "checkIsInstallHuaweiAccount() RuntimeException.");
            return false;
        }
    }

    public static boolean a(String str, Object... objArr) {
        if (objArr == null) {
            HwLog.i(str, "checkObjectIsNull objects is null");
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static void a(String str, Activity activity) {
        if (activity == null) {
            HwLog.i(f30594a, "setFontColor() mActivity == null");
            return;
        }
        try {
            if ("1".equalsIgnoreCase(str)) {
                activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                HwLog.i(f30594a, "setFontColor() isDark true");
            } else {
                activity.getWindow().getDecorView().setSystemUiVisibility(1280);
                HwLog.i(f30594a, "setFontColor() isDark false");
            }
        } catch (Throwable th) {
            HwLog.i(f30594a, "setFontColor Exception，" + HwLog.printException(th));
        }
    }

    public static int a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        String strTrim = str.trim();
        try {
            return Integer.parseInt(strTrim);
        } catch (NumberFormatException e2) {
            HwLog.e(f30594a, "getInteger ex=" + e2.getMessage());
            return (int) a(strTrim, i, true);
        }
    }

    public static float a(String str, float f2, boolean z) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            if (!z) {
                HwLog.e(f30594a, "getFloat ex=" + e2.getMessage());
            }
            return f2;
        }
    }

    public static ArrayList a(Parcelable.Creator creator, Parcel parcel) {
        String str = f30594a;
        HwLog.w(str, "createTypedArrayList list");
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        if (i >= 1024) {
            HwLog.w(str, "createTypedArrayList list is over 1024");
            i = 1024;
        }
        ArrayList arrayList = new ArrayList(i);
        while (i > 0) {
            arrayList.add(parcel.readTypedObject(creator));
            i--;
        }
        return arrayList;
    }

    public static final void a(Parcel parcel, List list) {
        if (list != null) {
            if (list.size() > 1024) {
                list = null;
            }
            parcel.writeTypedList(list);
            return;
        }
        parcel.writeTypedList(null);
    }

    public static String a(Throwable th) {
        String string = "";
        if (th != null && !HwWatchFaceApi.getInstance(Environment.getApplicationContext()).isOversea()) {
            try {
                StringWriter stringWriter = new StringWriter();
                try {
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    try {
                        th.printStackTrace(printWriter);
                        string = stringWriter.toString();
                        printWriter.close();
                        stringWriter.close();
                        return string;
                    } catch (Throwable th2) {
                        try {
                            printWriter.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    try {
                        stringWriter.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Exception e2) {
                HwLog.i(f30594a, "getStackTrace Exception : " + HwLog.printException(e2));
            }
        }
        return string;
    }

    public static void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i(f30594a, "registerBroadcasterReceiver context is null");
        } else {
            orb.d(applicationContext).d(broadcastReceiver, intentFilter);
        }
    }

    public static void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str) {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i(f30594a, "registerBroadcasterReceiver context is null");
        } else if (isAndroid13()) {
            applicationContext.registerReceiver(broadcastReceiver, intentFilter, str, null, 4);
        } else {
            applicationContext.registerReceiver(broadcastReceiver, intentFilter, str, null);
        }
    }

    public static void a(BroadcastReceiver broadcastReceiver) {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i(f30594a, "unRegisterBroadcasterReceiver context is null");
        } else {
            orb.d(applicationContext).b(broadcastReceiver);
        }
    }

    public static void a(Intent intent) {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.i(f30594a, "sendBroadcaster context is null");
        } else {
            orb.d(applicationContext).d(intent);
        }
    }
}
