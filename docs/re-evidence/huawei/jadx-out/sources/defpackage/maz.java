package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.haf.common.utils.ScreenUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes10.dex */
public class maz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f41310a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static maz f41311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f41312c;
    private boolean d = false;
    private int e = -1;
    private RemoteViews h;

    public static maz d() {
        maz mazVar;
        synchronized (f41310a) {
            if (f41311b == null) {
                f41311b = new maz();
            }
            mazVar = f41311b;
        }
        return mazVar;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("UpdateNotificationUtil", "createNotification parameter error");
            return;
        }
        this.f41312c = str;
        RemoteViews remoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.device_ota_update_notification);
        this.h = remoteViews;
        b(remoteViews);
        this.d = true;
    }

    private void b(RemoteViews remoteViews) {
        Intent intent = new Intent();
        intent.putExtra("device_id", this.f41312c);
        intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.update.UpdateVersionActivity");
        Notification.Builder style = lsb.d().c().setSmallIcon(R.drawable.healthlogo_ic_notification).setContentIntent(PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592)).setCustomContentView(remoteViews).setCustomBigContentView(remoteViews).setShowWhen(true).setAutoCancel(true).setPriority(0).setOngoing(true).setWhen(System.currentTimeMillis()).setStyle(new Notification.DecoratedCustomViewStyle());
        style.setGroup("UpdateNotificationUtil");
        if (a()) {
            lsb.d().c(100009, style.build());
        }
    }

    public void e(int i, int i2) {
        String string;
        String string2;
        if (!this.d) {
            LogUtil.j("UpdateNotificationUtil", "notifyProgress, not create");
            return;
        }
        if (i2 > 100 || i2 < 0) {
            LogUtil.j("UpdateNotificationUtil", "notifyProgress parameter error");
            return;
        }
        if (i2 == this.e) {
            LogUtil.j("UpdateNotificationUtil", "notifyProgress progress not change");
            return;
        }
        if (!ScreenUtil.d()) {
            LogUtil.j("UpdateNotificationUtil", "notifyProgress screen is off");
            return;
        }
        this.e = i2;
        String strE = UnitUtil.e(i2, 2, 0);
        if (EnvironmentInfo.g() || CommonUtil.bm()) {
            a(i, i2);
            return;
        }
        if (i == 1) {
            string = BaseApplication.getContext().getString(R.string.IDS_device_auto_update_transfer);
            string2 = BaseApplication.getContext().getString(R.string.IDS_device_auto_update_transfer_percent, strE);
            LogUtil.a("UpdateNotificationUtil", "notifyProgress:", Integer.valueOf(i2), " transferred");
        } else if (i == 2) {
            string = BaseApplication.getContext().getString(R.string.IDS_device_auto_update_download);
            string2 = BaseApplication.getContext().getString(R.string.IDS_device_auto_update_download_percent, strE);
            LogUtil.a("UpdateNotificationUtil", "notifyProgress:", Integer.valueOf(i2), " downloaded");
        } else {
            LogUtil.j("UpdateNotificationUtil", "notifyProgress invaild progressType");
            return;
        }
        this.h.setTextViewText(R.id.touch_transfer_percent, string2);
        this.h.setTextViewText(R.id.touch_transfer_title, string);
        this.h.setProgressBar(R.id.touch_transfer_progress, 100, i2, false);
        b(this.h);
    }

    private void a(int i, int i2) {
        String strE = UnitUtil.e(i2, 2, 0);
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setShowWhen(true);
        builderC.setContentIntent(lsb.a(BaseApplication.getContext()));
        builderC.setAutoCancel(true);
        builderC.setOngoing(true);
        builderC.setGroup("UpdateNotificationUtil");
        builderC.setWhen(System.currentTimeMillis());
        builderC.setProgress(100, i2, false);
        if (i == 1) {
            builderC.setContentTitle(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_transfer));
            builderC.setContentText(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_transfer_percent, strE));
            LogUtil.a("UpdateNotificationUtil", "notifyProgress:", Integer.valueOf(i2), " transferred");
        } else if (i != 2) {
            LogUtil.j("UpdateNotificationUtil", "notifyProgressWithHarmony4 with invalid progressType");
            return;
        } else {
            builderC.setContentTitle(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_download_title));
            builderC.setContentText(BaseApplication.getContext().getString(R.string.IDS_device_auto_update_download_percent, strE));
            LogUtil.a("UpdateNotificationUtil", "notifyProgress:", Integer.valueOf(i2), " downloaded");
        }
        Notification notificationBuild = builderC.build();
        notificationBuild.contentIntent = lsb.a(BaseApplication.getContext());
        notificationBuild.priority = 0;
        Intent intent = new Intent();
        intent.putExtra("device_id", this.f41312c);
        intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.update.UpdateVersionActivity");
        notificationBuild.contentIntent = PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592);
        lsb.d().c(100009, notificationBuild);
    }

    public void d(String str, String str2) {
        if (!this.d) {
            LogUtil.j("UpdateNotificationUtil", "showText, not create");
            return;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("UpdateNotificationUtil", "showText parameter is null");
            return;
        }
        LogUtil.a("UpdateNotificationUtil", "showText, description:", str2);
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setContentTitle(str);
        builderC.setContentText(str2);
        builderC.setShowWhen(true);
        builderC.setContentIntent(lsb.a(BaseApplication.getContext()));
        builderC.setAutoCancel(true);
        builderC.setGroup("UpdateNotificationUtil");
        builderC.setWhen(System.currentTimeMillis());
        Notification notificationBuild = builderC.build();
        notificationBuild.contentIntent = lsb.a(BaseApplication.getContext());
        notificationBuild.priority = 0;
        Intent intent = new Intent();
        intent.putExtra("device_id", this.f41312c);
        intent.setClassName(BaseApplication.getContext(), "com.huawei.ui.device.activity.update.UpdateVersionActivity");
        notificationBuild.contentIntent = PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 201326592);
        lsb.d().c(100009, notificationBuild);
    }

    public void b() {
        this.e = -1;
        lsb.d().e(100009);
        this.d = false;
    }

    private boolean a() {
        if (CommonUtil.bg() || NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            return true;
        }
        LogUtil.j("UpdateNotificationUtil", "notifyMsg notification bar permission is not enabled.");
        return false;
    }
}
