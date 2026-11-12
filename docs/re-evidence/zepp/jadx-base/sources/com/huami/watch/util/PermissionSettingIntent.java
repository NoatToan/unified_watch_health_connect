package com.huami.watch.util;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionSettingIntent {

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[OsUtil.ROM.values().length];
            a = iArr;
            try {
                iArr[OsUtil.ROM.EMUI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[OsUtil.ROM.Flyme.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[OsUtil.ROM.MIUI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[OsUtil.ROM.Sony.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[OsUtil.ROM.ColorOS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[OsUtil.ROM.EUI.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[OsUtil.ROM.LG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static Intent get(Context context) {
        Intent intent = new Intent();
        OsUtil.ROM os = OsUtil.getOs(context);
        String packageName = context.getPackageName();
        switch (a.a[os.ordinal()]) {
            case 1:
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
                return intent;
            case 2:
                intent.setAction("com.meizu.safe.security.SHOW_APPSEC");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.putExtra("packageName", packageName);
                return intent;
            case 3:
                int i = Integer.parseInt(DeviceCompatibility.MIUI.getMIUIVersionCode(context));
                if (i >= 6) {
                    intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                    intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
                    intent.putExtra("extra_pkgname", packageName);
                    return intent;
                }
                if (i < 4) {
                    return getDefault(context);
                }
                intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
                intent.putExtra("extra_pkgname", packageName);
                return intent;
            case 4:
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
                return intent;
            case 5:
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.coloros.safecenter", "com.coloros.safecenter.permission.PermissionManagerActivity"));
                return intent;
            case 6:
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.letv.android.letvsafe", "com.letv.android.letvsafe.PermissionAndApps"));
                return intent;
            case 7:
                intent.setAction("android.intent.action.MAIN");
                intent.putExtra("packageName", packageName);
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$AccessLockSummaryActivity"));
                return intent;
            default:
                return getDefault(context);
        }
    }

    public static Intent getDefault(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }
}
