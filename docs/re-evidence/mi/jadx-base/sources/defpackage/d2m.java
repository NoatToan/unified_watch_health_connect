package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.PowerManager;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;

/* JADX INFO: loaded from: classes6.dex */
public class d2m {
    public static void A(Context context) {
        Intent intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        intent.setFlags(268435456);
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }

    public static Intent a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context.getPackageName());
        intent.addFlags(268435456);
        intent.setAction(str2);
        intent.setComponent(new ComponentName(str, str3));
        intent.putExtra("package_name", context.getPackageName());
        intent.putExtra("package_label", "Mi Fitness");
        return intent;
    }

    public static void b(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + str));
        context.startActivity(intent);
    }

    public static void c(Context context) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        z(context, intent);
    }

    public static void d(Context context) {
        String brandSpecial = RomUtils.INSTANCE.getBrandSpecial();
        brandSpecial.hashCode();
        switch (brandSpecial) {
            case "huawei":
                e(context);
                break;
            case "xiaomi":
                h(context);
                break;
            case "oppo":
                f(context);
                break;
            case "vivo":
                g(context);
                break;
        }
    }

    public static void e(Context context) {
        Intent intent = new Intent(context.getPackageName());
        intent.addFlags(268435456);
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.startupmgr.ui.StartupNormalAppListActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        } else {
            c(context);
        }
    }

    public static void f(Context context) {
        c(context);
    }

    public static void g(Context context) {
        Intent intent = new Intent(context.getPackageName());
        intent.addFlags(268435456);
        intent.setComponent(ComponentName.unflattenFromString("com.vivo.permissionmanager/.activity.BgStartUpManagerActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void h(Context context) {
        Intent intent = new Intent(context.getPackageName());
        intent.addFlags(268435456);
        intent.setAction("miui.intent.action.OP_AUTO_START");
        intent.setComponent(new ComponentName(Constants.PACKAGE_NAME_SECURITYCENTER, "com.miui.permcenter.autostart.AutoStartManagementActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void i(Context context) {
        n(context, "com.android.settings/.Settings$HighPowerApplicationsActivity");
    }

    public static void j(Context context) {
        String brandSpecial = RomUtils.INSTANCE.getBrandSpecial();
        brandSpecial.hashCode();
        switch (brandSpecial) {
            case "huawei":
                i(context);
                break;
            case "xiaomi":
                m(context);
                break;
            case "oppo":
                k(context);
                break;
            case "vivo":
                l(context);
                break;
        }
    }

    public static void k(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addFlags(268435456);
        intent.setComponent(new ComponentName("com.coloros.oppoguardelf", "com.coloros.powermanager.fuelgaue.PowerUsageModelActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void l(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(new ComponentName("com.vivo.abe", "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void m(Context context) {
        n(context, "com.android.settings/.Settings$HighPowerApplicationsActivity");
    }

    public static void n(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setComponent(ComponentName.unflattenFromString(str));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void o(Context context) {
        if (Build.VERSION.SDK_INT <= 26) {
            w(context);
            return;
        }
        String brandSpecial = RomUtils.INSTANCE.getBrandSpecial();
        brandSpecial.hashCode();
        switch (brandSpecial) {
            case "huawei":
                A(context);
                break;
            case "xiaomi":
                v(context);
                break;
            case "oppo":
                p(context);
                break;
            case "vivo":
                q(context);
                break;
            case "honor":
                A(context);
                break;
            case "samsung":
                A(context);
                break;
        }
    }

    public static void p(Context context) {
        Intent intent = new Intent(context.getPackageName());
        intent.addFlags(268435456);
        intent.setAction("com.coloros.action.powermanager");
        intent.setComponent(ComponentName.unflattenFromString("com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerConsumptionActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void q(Context context) {
        Intent intent = new Intent(context.getPackageName());
        intent.addFlags(268435456);
        intent.setComponent(ComponentName.unflattenFromString("com.iqoo.powersaving/.PowerSavingManagerActivity"));
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            z(context, intent);
        }
    }

    public static void r(Context context) {
        String brandSpecial = RomUtils.INSTANCE.getBrandSpecial();
        brandSpecial.hashCode();
        switch (brandSpecial) {
            case "huawei":
                s(context);
                break;
            case "xiaomi":
                v(context);
                break;
            case "oppo":
                t(context);
                break;
            case "vivo":
                u(context);
                break;
        }
    }

    public static void s(Context context) {
        c(context);
    }

    public static void t(Context context) {
        c(context);
    }

    public static void u(Context context) {
        c(context);
    }

    public static void v(Context context) {
        Intent intentA = a(context, "com.miui.powerkeeper", "miui.intent.action.HIDDEN_APPS_CONFIG_ACTIVITY", "com.miui.powerkeeper.ui.HiddenAppsConfigActivity");
        if (context.getPackageManager().queryIntentActivities(intentA, 65536).size() > 0) {
            z(context, intentA);
            return;
        }
        Intent intentA2 = a(context, Constants.PACKAGE_NAME_SECURITYCENTER, "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS", "com.miui.powercenter.legacypowerrank.PowerDetailActivity");
        if (context.getPackageManager().queryIntentActivities(intentA2, 65536).size() > 0) {
            z(context, intentA2);
        } else {
            Logger.i("SettingUtils", "gotoRunBgPageXiaomi resolvesInfos size is 0");
        }
    }

    public static void w(Context context) {
        Intent intent = new Intent("android.settings.SETTINGS");
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static void x(Context context) {
        Intent intent = new Intent();
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setAction("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(Constants.SETTINGS_PACKAGE, "com.android.settings.Settings$TetherSettingsActivity"));
        context.startActivity(intent);
    }

    public static boolean y(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            return powerManager.isIgnoringBatteryOptimizations(context.getPackageName());
        }
        return false;
    }

    public static void z(Context context, Intent intent) {
        try {
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            c(context);
        }
    }
}
