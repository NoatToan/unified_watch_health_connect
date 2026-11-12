package com.huami.moving.ui.sport.detail.share;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.IBinder;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/huami/moving/ui/sport/detail/share/MediaProjectionService;", "Landroid/app/Service;", "", "a", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "onCreate", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class MediaProjectionService extends Service {
    private final void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel("default", "default", 3);
            Object systemService = getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("default") == null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
            startForeground(1, new Notification.Builder(this, "default").setContentTitle("").setContentText("").build());
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a();
        if (Build.VERSION.SDK_INT >= 21) {
            Object systemService = getSystemService("media_projection");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            TrackVideoShareActivity.INSTANCE.initMediaProjectionManager((MediaProjectionManager) systemService);
        }
    }
}
