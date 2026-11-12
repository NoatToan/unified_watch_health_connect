package com.huawei.health.h5pro.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.gson.Gson;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.core.H5ProWebViewActivity;
import com.huawei.health.h5pro.core.R;
import com.huawei.health.h5pro.dfx.bi.Analyzer;
import com.huawei.health.h5pro.exception.H5ProException;
import com.huawei.health.h5pro.ext.H5ProResidentExtManager;
import com.huawei.health.h5pro.ext.hostapp.H5ProHostAppRuntimeApi;
import com.huawei.health.h5pro.vengine.H5ProAppInfo;
import com.huawei.health.h5pro.vengine.H5ProInstance;
import com.huawei.openalliance.ad.constant.OsType;
import defpackage.exr;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class CommonUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f6986a = false;

    private CommonUtil() {
    }

    private static String b() {
        Intent intent;
        H5ProHostAppRuntimeApi hostAppRuntimeApi = H5ProResidentExtManager.getHostAppRuntimeApi();
        if (hostAppRuntimeApi != null) {
            Activity topActivity = hostAppRuntimeApi.getTopActivity();
            return (!(topActivity instanceof H5ProWebViewActivity) || (intent = topActivity.getIntent()) == null) ? "" : intent.getStringExtra("h5Flag");
        }
        return "";
    }

    private static void b(H5ProLaunchOption.Builder builder, String str, String str2) {
        if (!"startActivityFlag".equals(str)) {
            if (Analyzer.isGlobalParamKeys(str)) {
                builder.addGlobalBiParam(str, str2);
            }
        } else if ("SINGLE_TOP".equals(str2)) {
            builder.setActivityStartFlag(536870912);
        } else if ("SINGLE_TASK".equals(str2)) {
            builder.setActivityStartFlag(603979776);
        }
    }

    public static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                LogUtil.e("H5PRO_CommonUtil", "closeStream: " + e.getMessage());
            }
        }
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static String filterUrl(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return !str.contains("#") ? str : str.split("#")[0];
    }

    public static int getActivityStartFlag(H5ProLaunchOption h5ProLaunchOption, String str) {
        if (h5ProLaunchOption == null) {
            return 268435456;
        }
        int startMode = h5ProLaunchOption.getStartMode();
        if (startMode == 1) {
            return 67108864;
        }
        if ((startMode == 2 || startMode == 3) && str.equals(b())) {
            return startMode == 2 ? 67108864 : 603979776;
        }
        return h5ProLaunchOption.getActivityStartFlag();
    }

    public static int getActivityWindowMode(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (activity == null || !activity.isInMultiWindowMode()) {
            LogUtil.i("H5PRO_CommonUtil", "getAppWinMode: 0");
            return 0;
        }
        if (i < 29) {
            LogUtil.i("H5PRO_CommonUtil", "getAppWinMode: 2");
            return 2;
        }
        try {
            Method method = Class.forName("com.huawei.android.app.ActivityManagerEx").getMethod("getActivityWindowMode", Activity.class);
            if (method != null) {
                int iIntValue = ((Integer) method.invoke(null, activity)).intValue();
                LogUtil.i("H5PRO_CommonUtil", "getAppWinMode: " + iIntValue);
                if (iIntValue == 100) {
                    return 2;
                }
                return iIntValue == 101 ? 3 : 1;
            }
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtil.e("H5PRO_CommonUtil", "getActivityWindowMode exception: " + e.getMessage());
        }
        return 2;
    }

    public static String getAppId(H5ProInstance h5ProInstance) {
        if (h5ProInstance != null) {
            return getAppId(h5ProInstance.getAppInfo());
        }
        LogUtil.w("H5PRO_CommonUtil", "getAppId h5ProInstance null");
        return "DEFAULT_APP_ID";
    }

    public static Class<?> getClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            LogUtil.w("H5PRO_CommonUtil", "getClass ex=", e.getMessage());
            return null;
        }
    }

    public static String getProviderAuthority(Context context) {
        return context.getPackageName() + ".fileprovider";
    }

    public static int getStatusBarHeight(Context context) {
        int dimensionPixelSize;
        Resources resources;
        int identifier;
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            Object obj = cls.getField("status_bar_height").get(cls.newInstance());
            dimensionPixelSize = obj != null ? context.getResources().getDimensionPixelSize(Integer.parseInt(obj.toString())) : 0;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchFieldException unused) {
            LogUtil.e("H5PRO_CommonUtil", "get StatusBar Height Exception");
        }
        if (dimensionPixelSize == 0 && (identifier = (resources = context.getResources()).getIdentifier("status_bar_height", "dimen", OsType.ANDROID)) > 0) {
            dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        }
        if (dimensionPixelSize == 0) {
            return 137;
        }
        return dimensionPixelSize;
    }

    public static boolean isFlyme() {
        return Build.MANUFACTURER.equalsIgnoreCase("meizu");
    }

    public static <K, V> boolean isMapEmpty(Map<K, V> map) {
        return map == null || map.size() == 0;
    }

    public static boolean isNearZero(double d) {
        return Math.abs(d) <= 1.0E-6d;
    }

    public static boolean isPad(Context context) {
        if (TextUtils.equals("tablet", exr.a("ro.build.characteristics", ""))) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.hasSystemFeature("com.huawei.software.features.pad") || packageManager.hasSystemFeature("com.hihonor.software.features.pad")) {
            return true;
        }
        return !isTelephonyEnable(context);
    }

    public static boolean isPixel() {
        return Build.MANUFACTURER.equalsIgnoreCase("Google");
    }

    public static boolean isShouldSelfProtection(Context context, String str, boolean z) {
        return GeneralUtil.isShouldSelfProtection(context, str, context.getResources().getStringArray(R.array.safe_url_list), z);
    }

    public static boolean isTelephonyEnable(Context context) {
        Object systemService = context.getSystemService("phone");
        return ((systemService instanceof TelephonyManager) && ((TelephonyManager) systemService).getPhoneType() == 0) ? false : true;
    }

    public static boolean isTestVersion() {
        return f6986a;
    }

    public static H5ProLaunchOption parseQueryOption(String str, H5ProLaunchOption h5ProLaunchOption) {
        if (TextUtils.isEmpty(str) || !str.contains("?")) {
            return h5ProLaunchOption;
        }
        H5ProLaunchOption.Builder builder = h5ProLaunchOption == null ? new H5ProLaunchOption.Builder() : new H5ProLaunchOption.Builder().copy(h5ProLaunchOption);
        for (String str2 : str.split("\\?")[1].split("&")) {
            String[] strArrSplit = str2.split("=");
            if (strArrSplit.length == 2) {
                b(builder, strArrSplit[0], strArrSplit[1]);
            }
        }
        return builder.build();
    }

    public static void preProcessOption(H5ProLaunchOption h5ProLaunchOption) {
        if (h5ProLaunchOption == null || !h5ProLaunchOption.isEnableSlowWholeDocumentDraw()) {
            return;
        }
        WebView.enableSlowWholeDocumentDraw();
    }

    public static int px2dip(Context context, float f) {
        return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void setTestVersion(boolean z) {
        f6986a = z;
    }

    public static Object[] transferParamTypes(String[] strArr, Method method) throws H5ProException {
        if (method == null) {
            throw new H5ProException("method is null");
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (strArr.length != parameterTypes.length) {
            throw new H5ProException("The number of parameters does not match the number of parameter types.");
        }
        Object[] objArr = new Object[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (parameterTypes[i].equals(String.class)) {
                objArr[i] = strArr[i];
            } else {
                objArr[i] = new Gson().fromJson(strArr[i], (Class) parameterTypes[i]);
            }
        }
        return objArr;
    }

    public static boolean isNumber(String str) {
        return !TextUtils.isEmpty(str) && str.matches("^[0-9]+(.[0-9]+)?$");
    }

    public static String getAppId(H5ProAppInfo h5ProAppInfo) {
        if (h5ProAppInfo == null) {
            LogUtil.w("H5PRO_CommonUtil", "getAppId h5ProAppInfo null");
            return "DEFAULT_APP_ID";
        }
        if (TextUtils.isEmpty(h5ProAppInfo.getPkgName())) {
            return !TextUtils.isEmpty(h5ProAppInfo.getAppId()) ? h5ProAppInfo.getAppId() : "DEFAULT_APP_ID";
        }
        return h5ProAppInfo.getPkgName();
    }
}
