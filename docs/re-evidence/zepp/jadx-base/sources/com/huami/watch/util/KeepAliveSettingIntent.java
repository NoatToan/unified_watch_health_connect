package com.huami.watch.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes11.dex */
public class KeepAliveSettingIntent {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OsUtil.ROM.values().length];
            a = iArr;
            try {
                iArr[OsUtil.ROM.MIUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[OsUtil.ROM.EMUI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[OsUtil.ROM.AmigoOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[OsUtil.ROM.ColorOS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[OsUtil.ROM.YuLong.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[OsUtil.ROM.EUI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[OsUtil.ROM.Flyme.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[OsUtil.ROM.FuntouchOS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[OsUtil.ROM.LENOVO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[OsUtil.ROM.MiFavor.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[OsUtil.ROM.SmartisanOS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[OsUtil.ROM.Samsumg.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private static boolean a(Context context, Intent intent) {
        ResolveInfo resolveInfoB = b(context, intent);
        if (resolveInfoB == null) {
            return false;
        }
        return resolveInfoB.activityInfo.exported;
    }

    private static ResolveInfo b(Context context, Intent intent) {
        if (intent == null) {
            return null;
        }
        return context.getPackageManager().resolveActivity(intent, 65536);
    }

    private static Intent c(@NonNull String str) {
        Intent intent = new Intent();
        intent.setAction(str);
        return intent;
    }

    private static Intent d(@NonNull String str) {
        Intent intent = new Intent();
        intent.setComponent(ComponentName.unflattenFromString(str));
        return intent;
    }

    private static Intent e(Context context, @NonNull String str) {
        return context.getPackageManager().getLaunchIntentForPackage(str);
    }

    public static Intent getAutoStartIntent(Context context, @NonNull OsUtil.ROM rom) {
        Intent intentC;
        switch (a.a[rom.ordinal()]) {
            case 1:
                intentC = c("miui.intent.action.OP_AUTO_START");
                intentC.addCategory("android.intent.category.DEFAULT");
                if (!a(context, intentC)) {
                    intentC = d("com.android.settings/com.miui.securitycenter.power.BackgroundApplicationsManager");
                    if (!a(context, intentC)) {
                        intentC = d("com.miui.securitycenter/com.miui.permcenter.autostart.AutoStartManagementActivity");
                    }
                }
                break;
            case 2:
                intentC = c("huawei.intent.action.HSM_BOOTAPP_MANAGER");
                if (!a(context, intentC)) {
                    intentC = d("com.huawei.systemmanager/.startupmgr.ui.StartupNormalAppListActivity");
                }
                break;
            case 3:
                intentC = d("com.gionee.softmanager/.MainActivity");
                break;
            case 4:
                intentC = d("com.coloros.safecenter/.startupapp.StartupAppListActivity");
                if (!a(context, intentC)) {
                    intentC = d("com.coloros.safecenter/.permission.startup.StartupAppListActivity");
                    if (!a(context, intentC)) {
                        intentC = d("com.color.safecenter/.permission.startup.StartupAppListActivity");
                        if (!a(context, intentC)) {
                            intentC = d("com.coloros.safecenter/com.coloros.privacypermissionsentry.PermissionTopActivity");
                        }
                    }
                }
                break;
            case 5:
                intentC = d("com.yulong.android.security/com.yulong.android.seccenter.tabbarmain");
                break;
            case 6:
                intentC = d("com.letv.android.letvsafe/.AutobootManageActivity");
                break;
            case 7:
                intentC = c("com.meizu.safe.security.SHOW_APPSEC");
                intentC.addCategory("android.intent.category.DEFAULT");
                intentC.putExtra("packageName", context.getPackageName());
                break;
            case 8:
                intentC = d("com.vivo.permissionmanager/.activity.BgStartUpManagerActivity");
                if (!a(context, intentC)) {
                    intentC = d("com.iqoo.secure/.ui.phoneoptimize.BgStartUpManager");
                }
                break;
            case 9:
                intentC = d("com.lenovo.security/.purebackground.PureBackgroundActivity");
                break;
            case 10:
                intentC = d("com.zte.heartyservice/.autorun.AppAutoRunManager");
                break;
            case 11:
                intentC = d("com.smartisanos.security/.invokeHistory.InvokeHistoryActivity");
                intentC.putExtra("packageName", context.getPackageName());
                break;
            case 12:
                intentC = d("com.samsung.android.sm_cn/com.samsung.android.sm.ui.ram.AutoRunActivity");
                if (!a(context, intentC)) {
                    intentC = e(context, "com.samsung.android.sm");
                }
                break;
            default:
                intentC = null;
                break;
        }
        if (a(context, intentC)) {
            return intentC;
        }
        return null;
    }

    public static Intent getPowerManagerIntent(Context context, OsUtil.ROM rom) {
        Intent intentD;
        switch (a.a[rom.ordinal()]) {
            case 1:
                intentD = d("com.miui.powerkeeper/.ui.HiddenAppsConfigActivity");
                intentD.putExtra("package_label", context.getApplicationContext().getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
                intentD.putExtra("package_name", context.getPackageName());
                break;
            case 2:
                intentD = d("com.huawei.systemmanager/.optimize.process.ProtectActivity");
                break;
            case 3:
            case 5:
            default:
                intentD = !DeviceCompatibility.isM() ? null : c("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
                break;
            case 4:
                intentD = d("com.color.safecenter/com.color.purebackground.PureBackgroundSettingActivity");
                if (!a(context, intentD)) {
                    intentD = d("com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerUsageModelActivity");
                    if (!a(context, intentD)) {
                        intentD = d("com.coloros.oppoguardelf/com.coloros.powermanager.fuelgaue.PowerAppsBgSetting");
                        intentD.putExtra("title", context.getApplicationContext().getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
                        intentD.putExtra("pkgName", context.getPackageName());
                        intentD.putExtra("isDotVisible", "false");
                        if (!a(context, intentD)) {
                            intentD = d("com.coloros.oppoguardelf/.MonitoredPkgActivity");
                        }
                    }
                }
                break;
            case 6:
                intentD = d("com.letv.android.letvsafe/.BackgroundAppManageActivity");
                break;
            case 7:
                intentD = d("com.meizu.safe/.powerui.PowerAppPermissionActivity");
                break;
            case 8:
                intentD = d("com.vivo.abe/com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity");
                break;
            case 9:
                intentD = d("com.vivo.abe/com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity");
                break;
            case 10:
                intentD = d("com.zte.heartyservice/.setting.ClearAppSettingsActivity");
                break;
            case 11:
                intentD = d("com.android.settings/.fuelgauge.appBatteryUseOptimization.AppBatteryUseOptimizationActivity");
                break;
            case 12:
                intentD = d("com.samsung.android.sm_cn/com.samsung.android.sm.ui.battery.BatteryActivity");
                break;
        }
        if (a(context, intentD)) {
            return intentD;
        }
        return null;
    }
}
