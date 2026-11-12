package com.huami.sky.ui.sleepreminder.notification;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import androidx.view.result.ActivityResultLauncher;
import com.huami.device.feature.notification.statistics.NotificationEvent;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u000e"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotificationManager;", "", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "launcher", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "isNotificationEnable", "actionToNotificationSetting", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyReminderNotificationManager {

    @NotNull
    public static final SkyReminderNotificationManager INSTANCE = new SkyReminderNotificationManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "跳转应用详情页失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "跳转系统设置页失败";
        }
    }

    private SkyReminderNotificationManager() {
    }

    private final void a(ActivityResultLauncher<Intent> launcher) {
        try {
            launcher.launch(new Intent("android.settings.SETTINGS"));
        } catch (Exception unused) {
            HMLog.info("SkyReminderNotificationManager", b.a);
        }
    }

    public final void actionToNotificationSetting(@NotNull Context context, @NotNull ActivityResultLauncher<Intent> launcher) {
        Intent intent = new Intent();
        if (Build.VERSION.SDK_INT >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else {
            try {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts(NotificationEvent.KEY_PACKAGE, context.getPackageName(), null));
            } catch (Exception unused) {
                HMLog.info("SkyReminderNotificationManager", a.a);
                a(launcher);
            }
        }
        launcher.launch(intent);
    }

    public final boolean isNotificationEnable(@NotNull Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }
}
