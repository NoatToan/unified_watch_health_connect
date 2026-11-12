package com.huami.sky.ui.play.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.annotation.MainThread;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.service.PlayState;
import com.huami.sky.ui.R;
import com.huami.sky.ui.ext.SkyNotificationExtKt;
import com.huami.sky.ui.play.SkyPlayService;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0007J\b\u0010\t\u001a\u00020\u0006H\u0007J\u0006\u0010\n\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/play/notification/SkyPlayNotification;", "", "Landroid/app/Notification;", "a", "Landroid/widget/RemoteViews;", "b", "", "c", "notifyPlayNotification", "notifyNotification", "cancelNotification", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/app/NotificationManager;", "Landroid/app/NotificationManager;", "notificationManager", "Landroid/widget/RemoteViews;", "remoteView", "", GoogleApiAvailabilityLight.a, "Z", "lastPlaying", "<init>", "(Landroid/content/Context;)V", "Companion", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlayNotification {

    @NotNull
    public static final String SKY_NOTIFICATION_ACTION = "sky.notification.action";

    @NotNull
    public static final String SKY_NOTIFICATION_CLICK_KEY = "click.key";

    @NotNull
    public static final String SKY_NOTIFICATION_LIKE = "like";

    @NotNull
    public static final String SKY_NOTIFICATION_NOT_LIKE = "not.like";

    @NotNull
    public static final String SKY_NOTIFICATION_PLAY_PAUSE = "play.or.pause";
    private static final int e = 412;

    @NotNull
    private static final String f = "subscribe";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final NotificationManager notificationManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private RemoteViews remoteView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean lastPlaying;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ SkyPlayNotification b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, SkyPlayNotification skyPlayNotification) {
            super(0);
            this.a = z;
            this.b = skyPlayNotification;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "isPlaying: " + this.a + ", lastPlaying: " + this.b.lastPlaying;
        }
    }

    public SkyPlayNotification(@NotNull Context context) {
        this.context = context;
        Object systemService = context.getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
    }

    private final Notification a() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(f, "放松音律", 2);
            NotificationManager notificationManager = this.notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        this.remoteView = b();
        NotificationCompat.Builder customContentView = new NotificationCompat.Builder(this.context, f).setSmallIcon(R.mipmap.ic_launcher).setShowWhen(false).setCustomHeadsUpContentView(null).setContentIntent(SkyNotificationExtKt.getClickPlayPendingIntent(this.context)).setCustomContentView(this.remoteView);
        c();
        return customContentView.build();
    }

    private final RemoteViews b() {
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), R.layout.sky_layout_notification);
        Intent intent = new Intent(SKY_NOTIFICATION_ACTION);
        intent.putExtra(SKY_NOTIFICATION_CLICK_KEY, SKY_NOTIFICATION_LIKE);
        intent.setPackage(this.context.getPackageName());
        remoteViews.setOnClickPendingIntent(R.id.sky_music_like, PendingIntent.getBroadcast(this.context, 1, intent, SkyNotificationExtKt.pendingIntentFlag()));
        Intent intent2 = new Intent(SKY_NOTIFICATION_ACTION);
        intent2.putExtra(SKY_NOTIFICATION_CLICK_KEY, SKY_NOTIFICATION_NOT_LIKE);
        intent2.setPackage(this.context.getPackageName());
        remoteViews.setOnClickPendingIntent(R.id.sky_music_not_like, PendingIntent.getBroadcast(this.context, 3, intent2, SkyNotificationExtKt.pendingIntentFlag()));
        Intent intent3 = new Intent(SKY_NOTIFICATION_ACTION);
        intent3.putExtra(SKY_NOTIFICATION_CLICK_KEY, SKY_NOTIFICATION_PLAY_PAUSE);
        intent3.setPackage(this.context.getPackageName());
        remoteViews.setOnClickPendingIntent(R.id.sky_music_play, PendingIntent.getBroadcast(this.context, 2, intent3, SkyNotificationExtKt.pendingIntentFlag()));
        return remoteViews;
    }

    private final void c() {
        RemoteViews remoteViews = this.remoteView;
        if (remoteViews != null) {
            remoteViews.setImageViewResource(R.id.sky_music_like, SkyServiceHelperKt.getSkyService().getLikeState() ? R.drawable.ic_sky_notification_like : R.drawable.ic_sky_notification_like_cancel);
        }
        RemoteViews remoteViews2 = this.remoteView;
        if (remoteViews2 == null) {
            return;
        }
        remoteViews2.setImageViewResource(R.id.sky_music_play, SkyServiceHelperKt.getSkyService().isPlaying() ? R.drawable.ic_sky_notification_play : R.drawable.ic_sky_notification_pause);
    }

    public final void cancelNotification() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.cancel(412);
        }
        Context context = this.context;
        if (context instanceof SkyPlayService) {
            ((SkyPlayService) context).stopForeground(true);
        }
    }

    @MainThread
    public final void notifyNotification() {
        if (SkyServiceHelperKt.getSkyService().getPlayState() == PlayState.IDLE) {
            cancelNotification();
            return;
        }
        Notification notificationA = a();
        if (SkyServiceHelperKt.getSkyService().isPlaying()) {
            Context context = this.context;
            if (context instanceof SkyPlayService) {
                ((SkyPlayService) context).startForeground(412, notificationA);
                return;
            }
            return;
        }
        Context context2 = this.context;
        if (context2 instanceof SkyPlayService) {
            ((SkyPlayService) context2).stopForeground(false);
        }
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager == null) {
            return;
        }
        notificationManager.notify(412, notificationA);
    }

    @MainThread
    public final void notifyPlayNotification() {
        if (SkyServiceHelperKt.getSkyService().getServiceState()) {
            boolean zIsPlaying = SkyServiceHelperKt.getSkyService().isPlaying();
            HMLog.info("SkyPlayNotification", new a(zIsPlaying, this));
            if (zIsPlaying || this.lastPlaying) {
                this.lastPlaying = zIsPlaying;
                notifyNotification();
            }
        }
    }
}
