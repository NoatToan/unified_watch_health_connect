package com.huami.watch.companion.notification.shooter;

import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.huami.watch.companion.R;
import com.huami.watch.util.NotificationBuilder;
import com.twitter.sdk.android.core.internal.oauth.OAuthConstants;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes16.dex */
public class NotifiShooter {
    public static NotifiBullet[] sNotifiBullets = {new NotifiBullet(OAuthConstants.AUTHORIZATION_BASIC), new NotifiBullet(1, "basicNotifi", "BasicNotifition"), new NotifiBullet(1, "updateBasicNotifi", "UpdateBasicNotifition"), new NotifiBullet(2, "pendingIntentNotifi", "PendingIntentNotification"), new NotifiBullet(3, "largeIconNotifi", "LargeIconNotification"), new NotifiBullet("Wear")};
    private Context a;
    private NotificationManagerCompat b;

    private NotifiShooter(Context context) {
        this.a = context;
        this.b = NotificationManagerCompat.from(context);
    }

    private void a(String str, NotificationCompat.Builder builder) {
        try {
            getClass().getMethod(str, NotificationCompat.Builder.class).invoke(this, builder);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public static NotifiShooter getShooter(Context context) {
        return new NotifiShooter(context);
    }

    public void basicNotifi(NotificationCompat.Builder builder) {
        builder.setSmallIcon(R.drawable.ic_notification);
        builder.setContentText("CText : SSSSSSS1");
        builder.setContentInfo("CInfo : FFFFFFFF1");
    }

    public void extendNotifi(NotificationCompat.Builder builder) {
    }

    public void largeIconNotifi(NotificationCompat.Builder builder) {
        basicNotifi(builder);
        builder.setLargeIcon(BitmapFactory.decodeResource(this.a.getResources(), R.drawable.ic_launcher));
    }

    public void pendingIntentNotifi(NotificationCompat.Builder builder) {
    }

    public void shoot(NotifiBullet notifiBullet) {
        NotificationCompat.Builder builderBuildNotification = NotificationBuilder.buildNotification(this.a);
        builderBuildNotification.setContentTitle(notifiBullet.c);
        a(notifiBullet.b, builderBuildNotification);
        this.b.notify(notifiBullet.a, builderBuildNotification.build());
    }

    public void updateBasicNotifi(NotificationCompat.Builder builder) {
        basicNotifi(builder);
        builder.setContentText("CText : BasicNotifiUpdated");
        builder.setContentInfo("CInfo : BasicNotifiUpdated");
    }

    public static class NotifiBullet {
        public int a;
        public String b;
        public String c;
        public String d;

        public NotifiBullet(int i, String str, String str2) {
            this.a = i;
            this.b = str;
            this.c = str2;
        }

        public NotifiBullet(String str) {
            this.d = str;
        }
    }
}
