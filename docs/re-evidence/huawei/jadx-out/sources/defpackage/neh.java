package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.health.manager.util.UnitUtilExt;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.NotificationHelper;
import health.compact.a.NotificationUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes11.dex */
public class neh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Notification.Builder f42981b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Notification f42982c = null;

    public void b(Context context, int i, int i2, int i3) {
        LogUtil.a("NotificationUtil", "upDateHealthNotification()", Integer.valueOf(i), "|", Integer.valueOf(i2), "|", Integer.valueOf(i3));
        if (CommonUtil.cp()) {
            this.f42982c = c(context, i, i2, i3);
        } else {
            this.f42982c = a(context, i, i2);
        }
        ReleaseLogUtil.d("DEVMGR_NotificationUtil", "startNotification");
        try {
            if (context instanceof Service) {
                ((Service) context).startForeground(10010, this.f42982c);
            }
        } catch (Exception e) {
            ReleaseLogUtil.d("DEVMGR_NotificationUtil", "upDateHealthNotification Exception = ", ExceptionUtils.c(e));
        }
    }

    private Notification a(Context context, int i, int i2) {
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        String strC = NotificationUtil.c(context, i + "");
        String strA = NotificationUtil.a(context, UnitUtilExt.e(context, (double) Math.round(((float) i2) / 1000.0f), 1, 0));
        if (this.f42981b == null) {
            Notification.Builder builderC = lsb.d().c();
            this.f42981b = builderC;
            NotificationHelper.e(context, builderC);
            this.f42981b.setWhen(System.currentTimeMillis());
            this.f42981b.setShowWhen(false);
            this.f42981b.setContentIntent(NotificationUtil.d(context));
            Intent intent = new Intent("steps_notify_delete");
            intent.setPackage(context.getPackageName());
            this.f42981b.setDeleteIntent(PendingIntent.getBroadcast(context, 10010, intent, 201326592));
            this.f42981b.setPriority(0);
            this.f42981b.setOngoing(true);
        }
        this.f42981b.setContentTitle(strC).setContentText(strA);
        return this.f42981b.build();
    }

    private Notification c(Context context, int i, int i2, int i3) {
        e(context);
        RemoteViews remoteViewsD = d(context);
        remoteViewsD.setImageViewResource(R.id.icon, R.drawable.healthlogo_ic_notification);
        String string = context.getResources().getString(R.string.IDS_plugindameon_hw_app_name);
        if (i < 0) {
            i = 0;
        }
        String strD = NotificationUtil.d(context, i);
        String strB = NotificationUtil.b(context, i2);
        remoteViewsD.setTextViewText(R.id.app_name_text, string);
        remoteViewsD.setTextViewText(R.id.textStep, strD);
        remoteViewsD.setTextViewText(R.id.textStepUnit, context.getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_step_unit));
        remoteViewsD.setTextViewText(R.id.textKcal, strB);
        remoteViewsD.setTextViewText(R.id.textKcalUnit, context.getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit));
        if (i3 > 0) {
            int iRound = (int) Math.round((((double) i) / ((double) i3)) * 100.0d);
            if (iRound == 100 && i < i3) {
                iRound = 99;
            } else if (iRound > 100) {
                iRound = 100;
            } else {
                LogUtil.j("NotificationUtil", "completedGoal");
            }
            LogUtil.a("NotificationUtil", "completedGoal:", Integer.valueOf(iRound), ",", "stepGoal:", Integer.valueOf(i3));
            remoteViewsD.setTextViewText(R.id.right_icon_text, NotificationUtil.c(context, iRound));
            remoteViewsD.setImageViewResource(R.id.right_icon, NotificationUtil.d(iRound));
        }
        Notification notificationBuild = this.f42981b.build();
        notificationBuild.contentView = remoteViewsD;
        return notificationBuild;
    }

    private RemoteViews d(Context context) {
        if (CommonUtil.at()) {
            if (b()) {
                return new RemoteViews(context.getPackageName(), R.layout.notify_large_font_scale);
            }
            return new RemoteViews(context.getPackageName(), R.layout.notify);
        }
        if (CommonUtil.cq()) {
            if (b()) {
                return new RemoteViews(context.getPackageName(), R.layout.notify_emui9_large_font_scale);
            }
            return new RemoteViews(context.getPackageName(), R.layout.notify_emui9);
        }
        if (b()) {
            return new RemoteViews(context.getPackageName(), R.layout.notify_large_font_scale);
        }
        return new RemoteViews(context.getPackageName(), R.layout.notify);
    }

    private void e(Context context) {
        if (this.f42981b == null) {
            Notification.Builder builderC = lsb.d().c();
            this.f42981b = builderC;
            builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
            this.f42981b.setWhen(System.currentTimeMillis());
            this.f42981b.setShowWhen(false);
            this.f42981b.setContentIntent(NotificationUtil.d(context));
            Intent intent = new Intent("steps_notify_delete");
            intent.setPackage(context.getPackageName());
            this.f42981b.setDeleteIntent(PendingIntent.getBroadcast(context, 10010, intent, 201326592));
            this.f42981b.setPriority(0);
            this.f42981b.setOngoing(true);
            this.f42981b.setGroup("NotificationUtil");
        }
    }

    private boolean b() {
        return BaseApplication.getContext().getResources().getConfiguration().fontScale >= 1.75f;
    }
}
