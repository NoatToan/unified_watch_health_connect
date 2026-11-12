package com.huami.sync;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0012\u001a\u00020\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/sync/NotificationHelper;", "", "Landroid/app/NotificationManager;", "notificationManager", "", "channelID", "channelNAME", "", FirebaseAnalytics.Param.LEVEL, "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "channelId", "channelName", "title", "content", "", "showNotification", "cancelNotification", LogUtil.I, "ID", "b", "Landroid/app/NotificationManager;", "<init>", "()V", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationHelper {

    @NotNull
    public static final NotificationHelper INSTANCE = new NotificationHelper();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final int ID = 100;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static NotificationManager notificationManager;

    private NotificationHelper() {
    }

    private final String a(NotificationManager notificationManager2, String channelID, String channelNAME, int level) {
        if (Build.VERSION.SDK_INT < 26) {
            return "";
        }
        NotificationChannel notificationChannel = new NotificationChannel(channelID, channelNAME, level);
        if (notificationManager2 == null) {
            return channelID;
        }
        notificationManager2.createNotificationChannel(notificationChannel);
        return channelID;
    }

    public final void cancelNotification() {
        NotificationManager notificationManager2 = notificationManager;
        if (notificationManager2 == null) {
            return;
        }
        notificationManager2.cancel(100);
    }

    public final void showNotification(@NotNull Context context, @NotNull String channelId, @NotNull String channelName, @NotNull String title, @NotNull String content) {
        if (notificationManager == null) {
            Object systemService = context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            notificationManager = (NotificationManager) systemService;
        }
        Intent intent = new Intent(context, (Class<?>) TransmissionActivity.class);
        Config config = Config.INSTANCE;
        List<Intent> listInvoke = config.getNotificationIntents().invoke(context);
        if (listInvoke.isEmpty()) {
            listInvoke.add(intent);
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = i >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH;
        Object[] array = listInvoke.toArray(new Intent[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        PendingIntent activities = PendingIntent.getActivities(context, 0, (Intent[]) array, i2);
        String strA = a(notificationManager, channelId, channelName, 4);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);
        if (i >= 26) {
            builder = new NotificationCompat.Builder(context, strA);
        }
        NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
        bigTextStyle.setBigContentTitle(title).bigText(content);
        NotificationManagerCompat.from(context).notify(100, builder.setContentTitle(title).setContentText(content).setStyle(bigTextStyle).setContentIntent(activities).setSmallIcon(config.getNotificationIcon().invoke().intValue()).setPriority(1).setAutoCancel(true).build());
    }
}
