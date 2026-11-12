package com.huami.message.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.tools.analytics.DbUtils;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/huami/message/utils/NotificationsUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isNotificationEnabled", "activity", "", "openPush", "toPermissionSetting", "toApplicationInfo", "toSystemConfig", "requestNotify", "<init>", "()V", "message-mifit_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationsUtils {

    @NotNull
    public static final NotificationsUtils INSTANCE = new NotificationsUtils();

    private NotificationsUtils() {
    }

    public final boolean isNotificationEnabled(@NotNull Context context) {
        return NotificationManagerCompat.from(context.getApplicationContext()).areNotificationsEnabled();
    }

    public final void openPush(@NotNull Context activity) {
        if (Build.VERSION.SDK_INT < 26) {
            toPermissionSetting(activity);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        intent.putExtra("android.provider.extra.CHANNEL_ID", activity.getApplicationInfo().uid);
        intent.addFlags(268435456);
        activity.startActivity(intent);
    }

    public final void requestNotify(@NotNull Context context) {
        Intent intent = new Intent();
        try {
            intent.setFlags(268435456);
            if (Rom.isSmartisan()) {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, context.getPackageName(), null));
            } else if (Rom.isMiui()) {
                try {
                    ComponentName componentName = new ComponentName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
                    Bundle bundle = new Bundle();
                    bundle.putString("appName", context.getResources().getString(context.getApplicationInfo().labelRes));
                    bundle.putString("packageName", context.getPackageName());
                    bundle.putString(":android:show_fragment", "NotificationAccessSettings");
                    intent.putExtras(bundle);
                    intent.setComponent(componentName);
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent2.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, context.getPackageName(), null));
                    context.startActivity(intent2);
                }
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                intent.putExtra("android.provider.extra.CHANNEL_ID", context.getApplicationInfo().uid);
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            }
            context.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
            intent.setFlags(268435456);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, context.getPackageName(), null));
            context.startActivity(intent);
        }
    }

    public final void toApplicationInfo(@NotNull Context activity) {
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, activity.getPackageName(), null));
        activity.startActivity(intent);
    }

    public final void toPermissionSetting(@NotNull Context activity) {
        if (Build.VERSION.SDK_INT <= 22) {
            toSystemConfig(activity);
            return;
        }
        try {
            toApplicationInfo(activity);
        } catch (Exception e) {
            e.printStackTrace();
            toSystemConfig(activity);
        }
    }

    public final void toSystemConfig(@NotNull Context activity) {
        try {
            activity.startActivity(new Intent("android.settings.SETTINGS"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
