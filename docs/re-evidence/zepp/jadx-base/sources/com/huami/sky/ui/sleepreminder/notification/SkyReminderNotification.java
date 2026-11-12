package com.huami.sky.ui.sleepreminder.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.huami.sky.ui.R;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\tR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/huami/sky/ui/sleepreminder/notification/SkyReminderNotification;", "", "", "title", "msg", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/Notification;", "a", "", "notifyNotification", "cancelNotification", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/NotificationManager;", "b", "Landroid/app/NotificationManager;", "notificationManager", "<init>", "(Landroid/content/Context;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyReminderNotification {
    private static final int c = 10;

    @NotNull
    private static final String d = "subscribe";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final NotificationManager notificationManager;

    public SkyReminderNotification(@NotNull Context context) {
        this.context = context;
        Object systemService = context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
    }

    private final Notification a(String title, String msg, PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(d, "放松音律", 4);
            NotificationManager notificationManager = this.notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        return new NotificationCompat.Builder(this.context, d).setSmallIcon(R.drawable.push_notification).setColor(ContextCompat.getColor(this.context, R.color.black100)).setCustomHeadsUpContentView(null).setAutoCancel(true).setContentIntent(pendingIntent).setContentTitle(title).setContentText(msg).build();
    }

    public final void cancelNotification() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager == null) {
            return;
        }
        notificationManager.cancel(10);
    }

    public final void notifyNotification(@NotNull String title, @NotNull String msg, @NotNull PendingIntent pendingIntent) {
        Notification notificationA = a(title, msg, pendingIntent);
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager == null) {
            return;
        }
        notificationManager.notify(10, notificationA);
    }
}
