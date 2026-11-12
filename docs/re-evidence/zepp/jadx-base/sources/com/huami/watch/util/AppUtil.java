package com.huami.watch.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class AppUtil {
    public static final String APP_PLATFORM_ANDROID = "Android";
    public static final String DEFAULT_CHANNEL = "inner";
    private static final String a = "Util-App";

    public static Intent createIntentFromAction(PackageManager packageManager, String str) {
        String str2;
        String str3;
        Intent intent = new Intent(str);
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && listQueryIntentServices.size() != 0) {
            Iterator<ResolveInfo> it2 = listQueryIntentServices.iterator();
            if (it2.hasNext()) {
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                str3 = serviceInfo.packageName;
                str2 = serviceInfo.name;
            } else {
                str2 = null;
                str3 = null;
            }
            if (str3 != null && str2 != null) {
                ComponentName componentName = new ComponentName(str3, str2);
                Intent intent2 = new Intent(intent);
                intent2.setComponent(componentName);
                return intent2;
            }
        }
        return null;
    }

    public static String getAppName(@NonNull Context context, String str) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return String.valueOf(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str, 0)));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static Intent getLaunchIntent(@NonNull Context context, String str) {
        return context.getPackageManager().getLaunchIntentForPackage(str);
    }

    public static String getMetaDataChannel(Context context) {
        String string;
        try {
            string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("hm_channel");
        } catch (Exception e) {
            e.printStackTrace();
            string = null;
        }
        return TextUtils.isEmpty(string) ? DEFAULT_CHANNEL : string;
    }

    @NonNull
    public static String getPackageName(@Nullable Context context) {
        String packageName = context != null ? context.getPackageName() : null;
        return packageName == null ? "" : packageName;
    }

    public static String getPhoneBrand() {
        return Build.BRAND;
    }

    public static String getPhoneModel() {
        return Build.MODEL;
    }

    public static String getSystemVersion() {
        return "Android_" + Build.VERSION.SDK_INT;
    }

    public static int getUID(Context context, String str) {
        try {
            return context.getPackageManager().getApplicationInfo(str, 0).uid;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getVersionNameAndCode(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return packageInfo.versionName + Constants.ACCEPT_TIME_SEPARATOR_SERVER + packageInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isActivityExists(@NonNull Context context, String str, String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str + str2);
        return context.getPackageManager().resolveActivity(intent, 65536) != null;
    }

    public static boolean isAppExists(@NonNull Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean isSelf(Context context, String str) {
        return !TextUtils.isEmpty(str) && str.equalsIgnoreCase(getPackageName(context));
    }

    public static void toApp(Context context, String str) {
        Intent launchIntent = getLaunchIntent(context, str);
        if (launchIntent != null) {
            try {
                context.startActivity(launchIntent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
