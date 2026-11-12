package ohos.ace.plugin.notificationmanager;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* JADX INFO: loaded from: classes46.dex */
public class NotificationPlugin {
    private static final String CHANNER_ID = "arkuix";
    private static final String PERMISSION = "android.permission.POST_NOTIFICATIONS";
    private static final String TAG = "NotificationPlugin";
    private Context context;
    Notification.Builder mBuilder;
    private NotificationManager mManager;
    private NotificationChannel mNotificationChannel;
    private NotificationRequest request;

    protected native void nativeInit();

    protected native void nativeReceiveCallback(String str, long j);

    public NotificationPlugin(Context context) {
        if (context == null) {
            Log.e(TAG, " Notification context is null");
            return;
        }
        this.context = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
        this.mManager = notificationManager;
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(CHANNER_ID);
        this.mNotificationChannel = notificationChannel;
        if (notificationChannel == null) {
            NotificationChannel notificationChannel2 = new NotificationChannel(CHANNER_ID, context.getPackageName(), 3);
            this.mNotificationChannel = notificationChannel2;
            notificationChannel2.setShowBadge(true);
            this.mManager.createNotificationChannel(this.mNotificationChannel);
        }
        this.mManager.createNotificationChannel(this.mNotificationChannel);
        nativeInit();
    }

    public void requestEnableNotification() {
        Activity activity = getActivity();
        if (activity == null) {
            Log.d(TAG, "requestEnableNotification activity null");
            return;
        }
        Log.d(TAG, "requestEnableNotification requestPermissions " + activity);
        activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
    }

    public boolean isAPITiramisuLater() {
        Log.d(TAG, "isHighVersion version " + Build.VERSION.SDK_INT);
        return Build.VERSION.SDK_INT >= 33;
    }

    public boolean checkPermission() {
        if (isAPITiramisuLater()) {
            return this.context.getPackageManager().checkPermission("android.permission.POST_NOTIFICATIONS", this.context.getPackageName()) == 0;
        }
        return this.mManager.areNotificationsEnabled();
    }

    public void publish(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.request = JsonUtils.getNotificationRequest(str);
        createNotification();
    }

    public void publish(NotificationRequest notificationRequest) {
        this.request = notificationRequest;
        createNotification();
    }

    public void setBadgeNumber(int i) {
        BadgeUtils.setBadgeNumber(this.context, i);
    }

    public void cancel(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.mManager.cancel(str, i);
        } else {
            this.mManager.cancel(i);
        }
    }

    public void cancelAll() {
        this.mManager.cancelAll();
    }

    private void createNotification() {
        Notification.Builder builder = getBuilder();
        this.mBuilder = builder;
        Notification notificationBuild = builder.build();
        if (this.request.badgeNumber != null && this.request.badgeNumber.intValue() >= 0) {
            BadgeUtils.setBadgeNumber(this.context, this.request.badgeNumber.intValue(), notificationBuild);
        }
        if (!TextUtils.isEmpty(this.request.label)) {
            this.mManager.notify(this.request.label, this.request.id.intValue(), notificationBuild);
        } else {
            this.mManager.notify(this.request.id.intValue(), notificationBuild);
        }
    }

    private Notification.Builder getBuilder() {
        Notification.Builder builder = new Notification.Builder(this.context);
        builder.setChannelId(CHANNER_ID).setOngoing(this.request.isOngoing).setUsesChronometer(this.request.isStopwatch).setChronometerCountDown(this.request.isCountdown).setShowWhen(this.request.showDeliveryTime).setOnlyAlertOnce(this.request.isAlertOnce).setAutoCancel(this.request.tapDismissed).setSmallIcon(NotificationTools.getIconFromFilePath(this.context, this.request.smallIcon));
        if (this.request.content != null && this.request.content.content != null) {
            builder.setContentTitle(this.request.content.content.title);
            builder.setContentText(this.request.content.content.text);
        }
        if (!TextUtils.isEmpty(this.request.largeIcon)) {
            builder.setLargeIcon(NotificationTools.getBitmapFromFilePath(this.request.largeIcon));
        }
        if (this.request.deliveryTime != null && this.request.deliveryTime.longValue() > 0) {
            builder.setWhen(this.request.deliveryTime.longValue());
        }
        if (this.request.autoDeletedTime != null && this.request.autoDeletedTime.longValue() > 0) {
            builder.setTimeoutAfter(this.request.autoDeletedTime.longValue() - System.currentTimeMillis());
        }
        if (this.request.badgeNumber != null && this.request.badgeNumber.intValue() >= 0) {
            builder.setNumber(this.request.badgeNumber.intValue());
        }
        Notification.Style style = NotificationTools.getStyle(this.context, this.request.content);
        if (style != null) {
            builder.setStyle(style);
        }
        return builder;
    }

    private Activity getActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objInvoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mActivities");
            declaredField.setAccessible(true);
            for (Object obj : ((Map) declaredField.get(objInvoke)).values()) {
                Class<?> cls2 = obj.getClass();
                Field declaredField2 = cls2.getDeclaredField("paused");
                declaredField2.setAccessible(true);
                if (!declaredField2.getBoolean(obj)) {
                    Field declaredField3 = cls2.getDeclaredField("activity");
                    declaredField3.setAccessible(true);
                    return (Activity) declaredField3.get(obj);
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (NoSuchFieldException e3) {
            e3.printStackTrace();
        } catch (NoSuchMethodException e4) {
            e4.printStackTrace();
        } catch (InvocationTargetException e5) {
            e5.printStackTrace();
        }
        return null;
    }
}
