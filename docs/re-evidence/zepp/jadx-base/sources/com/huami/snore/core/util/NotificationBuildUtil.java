package com.huami.snore.core.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.snore.core.R;
import com.huami.snore.core.ext.KoinExtKt;
import com.huami.snore.ui.activity.SnoreMonitorActivity;
import com.huami.tools.analytics.DbUtils;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/huami/snore/core/util/NotificationBuildUtil;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "channelId", "Landroid/app/Notification;", "buildNotification", "CHANNEL_ID", "Ljava/lang/String;", "", "SNORE_MONITOR_NOTIFY_ID", LogUtil.I, "<init>", "()V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class NotificationBuildUtil {

    @NotNull
    public static final String CHANNEL_ID = "snore_record";

    @NotNull
    public static final NotificationBuildUtil INSTANCE = new NotificationBuildUtil();
    public static final int SNORE_MONITOR_NOTIFY_ID = 111;

    private NotificationBuildUtil() {
    }

    @NotNull
    public final Notification buildNotification(@NotNull Context context, @NotNull String channelId) {
        Object systemService = context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        Intent intent = new Intent(context, (Class<?>) SnoreMonitorActivity.class);
        int i = Build.VERSION.SDK_INT;
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, i >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
        if (i >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(channelId, context.getApplicationInfo().loadLabel(context.getPackageManager()), 4);
            notificationChannel.setSound(null, null);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return new NotificationCompat.Builder(context, channelId).setSmallIcon(KoinExtKt.getAppResource().getAppNotificationIcon()).setColor(Color.parseColor("#FF5A00")).setContentTitle(context.getApplicationInfo().loadLabel(context.getPackageManager())).setContentText(context.getResources().getString(R.string.snore_dream_talk_recording)).setContentIntent(activity).build();
    }
}
