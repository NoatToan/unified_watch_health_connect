package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.servicesapi.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.MagicBuild;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class nzz {
    private static final String[] d = {"ADT-AN00", "AGM3-AL09HN", "AGM3-W09HN", "AGM-W09HN", "ALA-AN70", "ANY-AN00", "ANY-TN00", "BRT-AN09", "BRT-W09", "CHL-AL00", "CHL-AN00", "CHL-TN00", "CMA-AN00", "CMA-AN40", "CMA-TN00", "DIO-AN00", "DIO-AN10", "DIO-TN00", "ELZ-AN00", "ELZ-AN10", "ELZ-AN20", "FNE-AN00", "FNE-TN00", "GIA-AN00", "GIA-TN00", "HEY-W09", "HJC-AN90", "HJC-L29", "HJC-LX9", "HPB-AN00", "JLH-AN00", "KJR-W09", "KKG-AN70", "KOB2-AL00HN", "KOB2-W09HN", "KOZ-AL00", "KOZ-AL00CM", "KOZ-AL40", "KRJ2-AN00", "KRJ2-W09", "LGE-AN00", "LGE-AN10", "LGE-AN20", "LSA-AN00", "MGI-AN00", "NEW-AN90", "NTH-AN00", "NTN-AN20", "NTX-AN00", "NTX-AN10", "NTX-AN90", "NTX-TN00", "NZA-AL00", "RKY-AN00", "RKY-TN00", "RMO-AN00", "RMO-TN00", "RNA-AN00", "RNA-TN00", "SDY-AN00", "TFY-AN00", "TFY-AN40", "TFY-TN00", "TNA-AN00", "TNA-AN00Q", "TNA-TN00", "VNE-AN00", "VNE-AN40", "VNE-AN60", "VNE-TN00", "YOK-AN10", "YOR-AN00", "YOR-AN10"};

    public static boolean c() {
        if (CommonUtil.bg() || b()) {
            return false;
        }
        return !CommonUtil.bd() || Utils.o() || Build.VERSION.SDK_INT >= 34;
    }

    public static boolean a() {
        if (CommonUtil.bg() || (b() && MagicBuild.f36616b <= 36)) {
            return false;
        }
        return !CommonUtil.bd() || MagicBuild.f36616b > 36 || Utils.o();
    }

    public static boolean b() {
        if (CommonUtil.bd()) {
            return Arrays.asList(d).contains(Build.MODEL);
        }
        return false;
    }

    public static boolean c(Context context) {
        if (context == null) {
            LogUtil.j("KeepAppAliveUtils", "isAgreeWhite, context is null");
            return true;
        }
        Object systemService = context.getSystemService("power");
        boolean zIsIgnoringBatteryOptimizations = systemService instanceof PowerManager ? ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName()) : false;
        LogUtil.a("KeepAppAliveUtils", "isAgree:", Boolean.valueOf(zIsIgnoringBatteryOptimizations));
        return zIsIgnoringBatteryOptimizations;
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public static void b(Context context, int i) {
        if (context == null) {
            LogUtil.j("KeepAppAliveUtils", "requestWhiteSet, context is null");
            return;
        }
        try {
            Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            if (context instanceof Activity) {
                LogUtil.a("KeepAppAliveUtils", "context is activity");
                ((Activity) context).startActivityForResult(intent, i);
            } else {
                LogUtil.a("KeepAppAliveUtils", "context is not activity");
                context.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("KeepAppAliveUtils", "requestWhiteSet, exception");
        }
    }

    public static void d(Context context) {
        String str;
        String lowerCase = Build.BRAND.toLowerCase();
        LogUtil.a("KeepAppAliveUtils", "goSettingSelfStart,brand: ", lowerCase);
        if (!oab.f44012a.containsKey(lowerCase)) {
            i(context);
            return;
        }
        if ("oppo".equals(lowerCase) && Build.VERSION.SDK_INT >= 31) {
            i(context);
            return;
        }
        List<String> list = oab.f44012a.get(lowerCase);
        if (list == null || list.size() == 0) {
            i(context);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String[] strArrSplit = list.get(i).split(",");
            if (strArrSplit.length >= 1) {
                String str2 = strArrSplit[0];
                if (strArrSplit.length <= 1) {
                    str = "";
                } else {
                    str = strArrSplit[1];
                }
                if (e(context, str2)) {
                    c(context, str2, str);
                    return;
                } else if (i == list.size() - 1) {
                    i(context);
                }
            }
        }
    }

    public static void b(Context context) {
        String str;
        String lowerCase = Build.BRAND.toLowerCase();
        LogUtil.a("KeepAppAliveUtils", "goSettingBackRun,brand", lowerCase);
        if (!oab.f44014c.containsKey(lowerCase)) {
            i(context);
            return;
        }
        if ("samsung".equals(lowerCase)) {
            f(context);
            return;
        }
        List<String> list = oab.f44014c.get(lowerCase);
        if (list == null || list.size() == 0) {
            i(context);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String[] strArrSplit = list.get(i).split(",");
            if (strArrSplit.length >= 1) {
                String str2 = strArrSplit[0];
                if (strArrSplit.length <= 1) {
                    str = "";
                } else {
                    str = strArrSplit[1];
                }
                if (e(context, str2)) {
                    c(context, str2, str);
                    return;
                } else if (i == list.size() - 1) {
                    i(context);
                }
            }
        }
    }

    public static void e(Context context) {
        String str;
        if (context == null) {
            LogUtil.a("KeepAppAliveUtils", "gotoAssociationStart,context is null");
            return;
        }
        String lowerCase = Build.BRAND.toLowerCase();
        String lowerCase2 = Build.MANUFACTURER.toLowerCase();
        LogUtil.a("KeepAppAliveUtils", "goSettingBackRun,brand", lowerCase, " ", lowerCase2);
        if (!oab.f44013b.containsKey(lowerCase) && !oab.f44013b.containsKey(lowerCase2)) {
            i(context);
            return;
        }
        List<String> list = oab.f44013b.get(lowerCase);
        if (CollectionUtils.a(list)) {
            list = oab.f44013b.get(lowerCase2);
        }
        if (CollectionUtils.a(list)) {
            i(context);
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            String[] strArrSplit = list.get(i).split(",");
            if (strArrSplit.length >= 1) {
                String str2 = strArrSplit[0];
                if (strArrSplit.length <= 1) {
                    str = "";
                } else {
                    str = strArrSplit[1];
                }
                if (b(str2, str, context)) {
                    c(context, str2, str);
                    return;
                } else if (i == list.size() - 1) {
                    i(context);
                }
            }
        }
    }

    private static void c(Context context, String str, String str2) {
        try {
            b(context, str, str2);
        } catch (ActivityNotFoundException | SecurityException unused) {
            LogUtil.e("KeepAppAliveUtils", "goSetKeepAlive activity is not open");
            try {
                if (e(context, str)) {
                    LogUtil.e("KeepAppAliveUtils", "goSetKeepAlive, app is exits");
                    b(context, str);
                } else {
                    LogUtil.e("KeepAppAliveUtils", "goSetKeepAlive, app is not exits");
                    i(context);
                }
            } catch (ActivityNotFoundException unused2) {
                i(context);
            }
        }
    }

    private static void b(final Context context, final String str) {
        final Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: nzz.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Intent intent = launchIntentForPackage;
                        String str2 = str;
                        Context context2 = context;
                        qrs.c(intent, str2, context2, context2.getString(R.string.IDS_tip_permission_setting));
                    }
                });
                return;
            }
            return;
        }
        i(context);
    }

    private static void b(final Context context, final String str, String str2) {
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        if (str2.equals("com.vivo.permissionmanager.activity.SoftPermissionDetailActivity")) {
            intent.putExtra("packagename", context.getPackageName());
        }
        intent.setFlags(268435456);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ActivityInfo activityInfoResolveActivityInfo = intent.resolveActivityInfo(packageManager, 65536);
            if (activityInfoResolveActivityInfo != null && activityInfoResolveActivityInfo.exported) {
                if (context instanceof Activity) {
                    ((Activity) context).runOnUiThread(new Runnable() { // from class: nzz.5
                        @Override // java.lang.Runnable
                        public void run() {
                            Intent intent2 = intent;
                            String str3 = str;
                            Context context2 = context;
                            qrs.c(intent2, str3, context2, context2.getString(R.string.IDS_tip_permission_setting));
                        }
                    });
                    return;
                }
                return;
            } else if (e(context, str)) {
                b(context, str);
                return;
            } else {
                i(context);
                return;
            }
        }
        i(context);
    }

    private static boolean e(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getApplicationInfo(str, 8192);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private static boolean b(String str, String str2, Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveInfoResolveActivity != null && resolveInfoResolveActivity.activityInfo != null) {
            return true;
        }
        LogUtil.j("KeepAppAliveUtils", "activity info is null");
        return false;
    }

    private static void f(Context context) {
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("KeepAppAliveUtils", "startPhoneSetting exception");
        }
    }

    public static void i(Context context) {
        try {
            context.startActivity(new Intent("android.settings.SETTINGS"));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("KeepAppAliveUtils", "startPhoneSetting exception");
        }
    }

    public static String a(String str) {
        if (!CommonUtil.bd()) {
            return String.format(Locale.ENGLISH, "/hwtips/protection_setup/%s/protection.html?cid=%s", "zh-CN", str);
        }
        if (njy.e(ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_DEVICES, null, "KeepAppAliveUtils"))) {
            ReleaseLogUtil.d("KeepAppAliveUtils", "getKeepAliveUrlForChinese deviceInfoList null");
            return String.format(Locale.ENGLISH, "/hwtips/protection_setup_allow/%s/protection.html?cid=%s", "zh-CN", str);
        }
        return String.format(Locale.ENGLISH, "/hwtips/protection_setup/%s/protection.html?cid=%s", "zh-CN", str);
    }
}
