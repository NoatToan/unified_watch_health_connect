package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationManagerCompat;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.impl.R;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.CommonUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class geh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile gdy f34970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f34971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PendingIntent f34972c;
    private volatile boolean d;
    private Notification.Builder e;
    private Bitmap g;
    private final MediaSession.Token h;
    private PendingIntent j;
    private final Handler i = new Handler(Looper.getMainLooper());
    private final NotificationManagerCompat f = NotificationManagerCompat.from(BaseApplication.b());

    public geh(Context context, MediaSession.Token token) {
        this.f34971b = context;
        this.h = token;
        b();
    }

    private void b() {
        Notification.Builder builderC = lsb.d().c();
        this.e = builderC;
        builderC.setSmallIcon(R.mipmap.healthlogo_hw_show_app);
        this.e.setOngoing(true);
        this.e.setAutoCancel(false);
        Intent intent = new Intent("notification_removed");
        intent.setPackage(BaseApplication.d());
        PendingIntent broadcast = PendingIntent.getBroadcast(BaseApplication.b(), 0, intent, 201326592);
        this.f34972c = broadcast;
        this.e.setDeleteIntent(broadcast);
        Intent intent2 = new Intent("notification_play_or_pause_btn_clicked");
        intent2.setPackage(BaseApplication.d());
        this.j = PendingIntent.getBroadcast(BaseApplication.b(), 0, intent2, 201326592);
    }

    public void a(PendingIntent pendingIntent) {
        this.e.setContentIntent(pendingIntent);
    }

    public void d(final gdy gdyVar, final boolean z) {
        this.d = false;
        ThreadPoolManager.c().execute(new Runnable() { // from class: gem
            @Override // java.lang.Runnable
            public final void run() {
                this.f34986a.c(gdyVar, z);
            }
        });
    }

    /* synthetic */ void c(gdy gdyVar, final boolean z) {
        if (gdyVar == null) {
            return;
        }
        if (!gdyVar.equals(this.f34970a)) {
            this.f34970a = gdyVar;
            this.g = null;
        }
        if (this.g != null) {
            this.i.post(new Runnable() { // from class: geq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34991b.e(z);
                }
            });
            return;
        }
        Bitmap bitmapE = gfj.e(gdyVar.g());
        if (bitmapE == null) {
            LogUtil.e("AudioNotificationHelper", "load Audio icon failed, url:" + gdyVar.g());
            this.g = null;
        } else {
            Bitmap bitmapC = qqf.c(bitmapE, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH, GlMapUtil.DEVICE_DISPLAY_DPI_HIGH);
            if (bitmapC != null && !bitmapC.isRecycled()) {
                this.g = qqf.d(bitmapC, bitmapC.getWidth(), bitmapC.getHeight(), 53);
            }
        }
        this.i.post(new Runnable() { // from class: gen
            @Override // java.lang.Runnable
            public final void run() {
                this.f34987c.c(z);
            }
        });
    }

    /* synthetic */ void e(boolean z) {
        a(this.f34970a, this.g, z);
    }

    /* synthetic */ void c(boolean z) {
        a(this.f34970a, this.g, z);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e A[Catch: Exception -> 0x007a, all -> 0x0090, TRY_LEAVE, TryCatch #1 {Exception -> 0x007a, blocks: (B:14:0x003e, B:16:0x0046, B:19:0x0053, B:21:0x005c, B:23:0x0062, B:24:0x006e), top: B:34:0x003e, outer: #0 }] */
    private void a(gdy gdyVar, Bitmap bitmap, boolean z) {
        synchronized (this) {
            if (gdyVar == null) {
                LogUtil.d("AudioNotificationHelper", "createRemoteViews failed, audioItem is null");
                return;
            }
            if (this.d) {
                LogUtil.b("AudioNotificationHelper", "this is a post with bitmap(a delay msg), but notification has already been canceled, skip this post");
                return;
            }
            d(gdyVar, bitmap, z);
            LogUtil.b("AudioNotificationHelper", "post a new notification with isPlaying: " + z);
            try {
                if (!this.f.areNotificationsEnabled()) {
                    LogUtil.d("AudioNotificationHelper", "notificationManager.areNotificationsEnabled() is false");
                    return;
                }
                if (BaseApplication.h()) {
                    Context context = this.f34971b;
                    if (context instanceof Service) {
                        ((Service) context).startForeground(20220913, this.e.build());
                    } else {
                        this.f.notify(20220913, this.e.build());
                    }
                } else {
                    this.f.notify(20220913, this.e.build());
                }
            } catch (Exception e) {
                ReleaseLogUtil.b("R_AudioNotificationHelper", "updateNotificationView Exception ", ExceptionUtils.c(e));
            }
        }
    }

    public void d(gdy gdyVar, Bitmap bitmap, boolean z) {
        RemoteViews remoteViews;
        if (gfj.a()) {
            remoteViews = a(this.f34971b.getPackageName());
        } else {
            remoteViews = new RemoteViews(this.f34971b.getPackageName(), R.layout.music_notification);
            if (Build.VERSION.SDK_INT >= 31 && !BaseActivity.isMiui()) {
                int iD = !CommonUtil.bd() ? 0 : qrs.d(BaseApplication.b(), 16.0f);
                remoteViews.setViewPadding(R.id.whole_notification_view, 0, iD, iD, iD);
                remoteViews.setViewVisibility(R.id.music_rela, 8);
                remoteViews.setViewVisibility(R.id.id_iv_close_icon, 8);
                remoteViews.setViewVisibility(R.id.id_iv_close_icon_2, 0);
                remoteViews.setOnClickPendingIntent(R.id.id_iv_close_icon_2, this.f34972c);
            } else {
                remoteViews.setViewVisibility(R.id.id_iv_close_icon_2, 8);
                remoteViews.setOnClickPendingIntent(R.id.id_iv_close_icon, this.f34972c);
            }
        }
        remoteViews.setTextViewText(R.id.health_audio_notification_song_title, TextUtils.isEmpty(gdyVar.o()) ? "" : gdyVar.o());
        remoteViews.setTextViewText(R.id.health_audio_notification_song_subtitle, TextUtils.isEmpty(gdyVar.k()) ? "" : gdyVar.k());
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.notification_cover_image, bitmap);
        }
        if (z) {
            remoteViews.setImageViewResource(R.id.notification_play, R.drawable.ic_audio_pause);
        } else {
            remoteViews.setImageViewResource(R.id.notification_play, R.drawable.ic_audio_play);
        }
        remoteViews.setOnClickPendingIntent(R.id.notification_play, this.j);
        this.e.setCustomContentView(remoteViews);
        if (BaseActivity.isSumsung()) {
            this.e.setCustomBigContentView(remoteViews);
        }
        if (gfj.e() || CommonUtil.bm()) {
            this.e.setStyle(new Notification.MediaStyle().setMediaSession(this.h));
        }
        if (BaseActivity.isGoogle()) {
            this.e.setSmallIcon(R.drawable.healthlogo_ic_notification);
            this.e.setStyle(new Notification.MediaStyle().setMediaSession(this.h));
        }
    }

    private RemoteViews a(String str) {
        RemoteViews remoteViews = new RemoteViews(str, R.layout.music_notification_harmony_3_0);
        if (Build.VERSION.SDK_INT <= 31) {
            int iD = qrs.d(BaseApplication.b(), 8.0f);
            remoteViews.setViewPadding(R.id.whole_notification_view, iD, 0, iD, 0);
        }
        return remoteViews;
    }

    public void e() {
        LogUtil.b("AudioNotificationHelper", "audio notification cancelled...");
        if ((this.f34971b instanceof Service) && this.f.areNotificationsEnabled()) {
            this.f.cancel(20220913);
            this.d = true;
        }
    }
}
