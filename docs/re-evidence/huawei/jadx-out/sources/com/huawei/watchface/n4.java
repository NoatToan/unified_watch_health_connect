package com.huawei.watchface;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.watchface.api.WebViewActivity;
import com.huawei.watchface.environment.Environment;
import com.huawei.watchface.mvp.model.datatype.TryoutBean;
import com.huawei.watchface.utils.CommonUtils;
import com.huawei.watchface.utils.DensityUtil;
import com.huawei.watchface.utils.HwLog;
import com.huawei.watchface.utils.IntegerUtils;

/* JADX INFO: loaded from: classes20.dex */
public class n4 extends ContextWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static n4 f30506b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NotificationManager f30507a;

    public n4(Context context) {
        super(context);
    }

    public static n4 b() {
        n4 n4Var;
        synchronized (n4.class) {
            if (f30506b == null) {
                synchronized (n4.class) {
                    f30506b = new n4(Environment.getApplicationContext());
                }
            }
            n4Var = f30506b;
        }
        return n4Var;
    }

    public final void a() {
        NotificationChannel notificationChannel = new NotificationChannel("tryout_watch_face", DensityUtil.getStringById(R.string.trial), 3);
        a(notificationChannel);
        NotificationManager notificationManagerC = c();
        if (notificationManagerC != null) {
            notificationManagerC.createNotificationChannel(notificationChannel);
        }
    }

    public final NotificationManager c() {
        Application applicationContext;
        if (this.f30507a == null && (applicationContext = Environment.getApplicationContext()) != null) {
            this.f30507a = (NotificationManager) applicationContext.getSystemService(RemoteMessageConst.NOTIFICATION);
        }
        return this.f30507a;
    }

    public void b(TryoutBean tryoutBean) {
        NotificationManager notificationManagerC = c();
        if (notificationManagerC == null) {
            HwLog.e("TryOutNotificationUtils", "sendNotification getManager is null");
        } else {
            notificationManagerC.notify(100, a(tryoutBean));
        }
    }

    public final void a(NotificationChannel notificationChannel) {
        notificationChannel.setLockscreenVisibility(-1);
        notificationChannel.enableVibration(false);
        notificationChannel.enableLights(false);
        notificationChannel.setBypassDnd(true);
    }

    public Notification a(TryoutBean tryoutBean) {
        if (tryoutBean == null) {
            HwLog.w("TryOutNotificationUtils", "getTryOutNotification -- dataBundle is null");
            return null;
        }
        Application applicationContext = Environment.getApplicationContext();
        NotificationCompat.Builder builderA = a(DensityUtil.getStringById(R.string.trial_now_take_away_watchface, tryoutBean.getShowTitle()));
        if (builderA == null) {
            HwLog.e("TryOutNotificationUtils", "getTryOutNotification builder is null");
            return null;
        }
        builderA.addAction(-1, DensityUtil.getStringById(R.string.try_notice_button_end), a(applicationContext, tryoutBean, "2"));
        if (IntegerUtils.a(tryoutBean.getResourceType()) == 4) {
            builderA.addAction(-1, DensityUtil.getStringById(R.string.vip_open_immediately), a(applicationContext, tryoutBean, "3"));
        } else {
            builderA.addAction(-1, DensityUtil.getStringById(R.string.try_notice_button_buynow), a(applicationContext, tryoutBean, "1"));
        }
        Notification notificationBuild = builderA.build();
        notificationBuild.flags |= 32;
        return notificationBuild;
    }

    public final PendingIntent a(Context context, TryoutBean tryoutBean, String str) {
        Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
        intent.setFlags(268435456);
        intent.setFlags(67108864);
        intent.setAction(str);
        if (tryoutBean != null) {
            intent.putExtra("key_try_out_bean", tryoutBean);
        }
        try {
            return PendingIntent.getActivity(context, 100001, intent, CommonUtils.n() ? 167772160 : 134217728);
        } catch (Exception unused) {
            HwLog.e("TryOutNotificationUtils", "getActionIntent Exception");
            return null;
        }
    }

    public NotificationCompat.Builder a(String str) {
        Application applicationContext = Environment.getApplicationContext();
        if (applicationContext == null) {
            HwLog.e("TryOutNotificationUtils", "getNotification applicationContext is null");
            return null;
        }
        a();
        NotificationCompat.Builder builder = new NotificationCompat.Builder(applicationContext, "tryout_watch_face");
        builder.setStyle(new NotificationCompat.BigTextStyle().bigText(str));
        builder.setSmallIcon(R.drawable.watchface_ic_notify_theme);
        builder.setContentText(str);
        builder.setContentTitle(DensityUtil.getStringById(R.string.trial_dial));
        builder.setShowWhen(true);
        builder.setAutoCancel(false);
        builder.setOngoing(true);
        builder.setVisibility(-1);
        return builder;
    }

    public void a(int i) {
        NotificationManager notificationManagerC = c();
        if (notificationManagerC == null) {
            HwLog.e("TryOutNotificationUtils", "clearNotification getManager is null");
        } else {
            notificationManagerC.cancel(i);
        }
    }
}
