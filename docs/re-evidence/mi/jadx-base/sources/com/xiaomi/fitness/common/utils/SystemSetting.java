package com.xiaomi.fitness.common.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.passport.ui.utils.OsHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/common/utils/SystemSetting;", "", "<init>", "()V", "MANUFACTURER_HUAWEI", "", "MANUFACTURER_MEIZU", "MANUFACTURER_XIAOMI", "MANUFACTURER_SONY", "MANUFACTURER_OPPO", "MANUFACTURER_LG", "isAppSettingOpen", "", "()Z", "setAppSettingOpen", "(Z)V", "PERMISSION_SETTING_FOR_RESULT", "", "goToSetting", "", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", RomUtils.HUAWEI, "meizu", "xiaomi", RomUtils.SONY, RomUtils.OPPO, "lg", "openAppDetailSetting", "getAppDetailSettingIntent", "Landroid/content/Intent;", "systemConfig", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SystemSetting {
    public static final int PERMISSION_SETTING_FOR_RESULT = 256;
    private static boolean isAppSettingOpen;

    @NotNull
    public static final SystemSetting INSTANCE = new SystemSetting();

    @NotNull
    private static final String MANUFACTURER_HUAWEI = "Huawei";

    @NotNull
    private static final String MANUFACTURER_MEIZU = "Meizu";

    @NotNull
    private static final String MANUFACTURER_XIAOMI = "Xiaomi";

    @NotNull
    private static final String MANUFACTURER_SONY = "Sony";

    @NotNull
    private static final String MANUFACTURER_OPPO = OsHelper.ROM_OPPO;

    @NotNull
    private static final String MANUFACTURER_LG = "LG";

    private SystemSetting() {
    }

    private final Intent getAppDetailSettingIntent(Activity activity) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
        return intent;
    }

    public final void goToSetting(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String str = Build.MANUFACTURER;
        if (Intrinsics.areEqual(str, MANUFACTURER_HUAWEI)) {
            huawei(activity);
            return;
        }
        if (Intrinsics.areEqual(str, MANUFACTURER_MEIZU)) {
            meizu(activity);
            return;
        }
        if (Intrinsics.areEqual(str, MANUFACTURER_XIAOMI)) {
            xiaomi(activity);
            return;
        }
        if (Intrinsics.areEqual(str, MANUFACTURER_SONY)) {
            sony(activity);
            return;
        }
        if (Intrinsics.areEqual(str, MANUFACTURER_OPPO)) {
            oppo(activity);
        } else {
            if (Intrinsics.areEqual(str, MANUFACTURER_LG)) {
                lg(activity);
                return;
            }
            try {
                openAppDetailSetting(activity);
            } catch (Exception unused) {
                systemConfig(activity);
            }
        }
    }

    public final void huawei(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packageName", activity.getPackageName());
            intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
            activity.startActivityForResult(intent, 256);
            isAppSettingOpen = false;
        } catch (Exception unused) {
            openAppDetailSetting(activity);
        }
    }

    public final boolean isAppSettingOpen() {
        return isAppSettingOpen;
    }

    public final void lg(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setFlags(268435456);
            intent.putExtra("packageName", activity.getPackageName());
            intent.setComponent(new ComponentName(Constants.SETTINGS_PACKAGE, "com.android.settings.Settings$AccessLockSummaryActivity"));
            activity.startActivity(intent);
            isAppSettingOpen = false;
        } catch (Exception unused) {
            openAppDetailSetting(activity);
        }
    }

    public final void meizu(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.putExtra("packageName", activity.getPackageName());
            activity.startActivity(intent);
            isAppSettingOpen = false;
        } catch (Exception unused) {
            openAppDetailSetting(activity);
        }
    }

    public final void openAppDetailSetting(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivityForResult(getAppDetailSettingIntent(activity), 256);
        isAppSettingOpen = true;
    }

    public final void oppo(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packageName", activity.getPackageName());
            intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
            activity.startActivity(intent);
            isAppSettingOpen = false;
        } catch (Exception unused) {
            openAppDetailSetting(activity);
        }
    }

    public final void setAppSettingOpen(boolean z) {
        isAppSettingOpen = z;
    }

    public final void sony(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent();
            intent.setFlags(268435456);
            intent.putExtra("packageName", activity.getPackageName());
            intent.setComponent(new ComponentName("com.sonymobile.cta", "com.sonymobile.cta.SomcCTAMainActivity"));
            activity.startActivity(intent);
            isAppSettingOpen = false;
        } catch (Exception unused) {
            openAppDetailSetting(activity);
        }
    }

    public final void systemConfig(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent("android.settings.SETTINGS"));
    }

    public final void xiaomi(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (AppUtil.INSTANCE.isPlayChannel() && Build.VERSION.SDK_INT >= 30) {
            openAppDetailSetting(activity);
            return;
        }
        try {
            try {
                Intent intent = new Intent(Constants.ACTION_APP_PERM_EDITOR);
                intent.setClassName(Constants.PACKAGE_NAME_SECURITYCENTER, "com.miui.permcenter.permissions.PermissionsEditorActivity");
                intent.putExtra(Constants.EXTRA_PKG_NAME, activity.getPackageName());
                activity.startActivityForResult(intent, 256);
                isAppSettingOpen = false;
            } catch (Exception unused) {
                openAppDetailSetting(activity);
            }
        } catch (Exception unused2) {
            Intent intent2 = new Intent(Constants.ACTION_APP_PERM_EDITOR);
            intent2.setClassName(Constants.PACKAGE_NAME_SECURITYCENTER, "com.miui.permcenter.permissions.AppPermissionsEditorActivity");
            intent2.putExtra(Constants.EXTRA_PKG_NAME, activity.getPackageName());
            activity.startActivityForResult(intent2, 256);
            isAppSettingOpen = false;
        }
    }
}
