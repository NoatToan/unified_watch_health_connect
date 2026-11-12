package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseActivity;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LocalBroadcast;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes11.dex */
public class nvf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f43797a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nvf f43798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f43799c;
    private PendingIntent d;
    private Notification.Builder g;
    private Notification i;
    private RemoteViews j;
    private boolean h = false;
    private int e = -1;

    class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("AppUpdateNotification", "NotificationClickReceiver intent is null");
                return;
            }
            String action = intent.getAction();
            LogUtil.a("AppUpdateNotification", "NotificationClickReceiver action is :", action, " mIsCreate:", Boolean.valueOf(nvf.this.h));
            if (TextUtils.isEmpty(action)) {
                return;
            }
            action.hashCode();
            if (action.equals("cancel_file_download")) {
                HwVersionManager.b(BaseApplication.getContext()).b();
                nvf.this.b();
            }
        }
    }

    public static nvf a() {
        nvf nvfVar;
        synchronized (f43797a) {
            if (f43798b == null) {
                LogUtil.a("AppUpdateNotification", "new AppUpdateNotification()");
                f43798b = new nvf();
            }
            nvfVar = f43798b;
        }
        return nvfVar;
    }

    protected nvf() {
        try {
            this.f43799c = new b();
            BroadcastManagerUtil.d(BaseApplication.getContext(), this.f43799c, new IntentFilter("cancel_file_download"), LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e("AppUpdateNotification", "registerReceiver is error");
        }
    }

    public void e() {
        Notification.Builder builderC = lsb.d().c();
        this.g = builderC;
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        this.g.setShowWhen(true);
        this.g.setContentIntent(lsb.a(BaseApplication.getContext()));
        this.g.setAutoCancel(true);
        this.g.setGroup("AppUpdateNotification");
        this.g.setWhen(System.currentTimeMillis());
        Notification notificationBuild = this.g.build();
        notificationBuild.flags |= 2;
        notificationBuild.contentIntent = lsb.a(BaseApplication.getContext());
        notificationBuild.priority = 0;
        if (CommonUtil.bm() || BaseActivity.isVivo().booleanValue()) {
            Intent intent = new Intent("cancel_file_download");
            intent.setPackage(BaseApplication.getAppPackage());
            this.d = PendingIntent.getBroadcast(BaseApplication.getContext(), 0, intent, 201326592);
            this.g.addAction(new Notification.Action.Builder((Icon) null, qre.f(R.string.IDS_notify_cancel), this.d).build());
            this.i = notificationBuild;
            lsb.d().c(20200317, notificationBuild);
            this.h = true;
            return;
        }
        if (!CommonUtil.bg() || (CommonUtil.cp() && !EnvironmentInfo.g())) {
            RemoteViews remoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.device_update_notification);
            if (CommonUtil.at() || !CommonUtil.cq()) {
                int iD = qrs.d(BaseApplication.getContext(), 16.0f);
                remoteViews.setViewPadding(R.id.add_music_to_watch_layout, iD, 0, iD, 0);
            }
            Intent intent2 = new Intent("cancel_file_download");
            intent2.setPackage(BaseApplication.getAppPackage());
            this.d = PendingIntent.getBroadcast(BaseApplication.getContext(), 0, intent2, 201326592);
            remoteViews.setOnClickPendingIntent(R.id.progress_cancel, this.d);
            notificationBuild.contentView = remoteViews;
            this.j = remoteViews;
        }
        this.i = notificationBuild;
        lsb.d().c(20200317, notificationBuild);
        this.h = true;
    }

    public void e(String str, int i) {
        if (!this.h) {
            LogUtil.j("AppUpdateNotification", "notifyProgress, not create");
            return;
        }
        if (i > 100 || i < 0 || TextUtils.isEmpty(str)) {
            LogUtil.j("AppUpdateNotification", "notifyProgress parameter error");
            return;
        }
        if (i == this.e) {
            LogUtil.j("AppUpdateNotification", "notifyProgress progress not change");
            return;
        }
        if (CommonUtil.bm() || BaseActivity.isVivo().booleanValue()) {
            d(i, str);
        } else {
            e(i, str);
        }
        lsb.d().c(20200317, this.i);
    }

    private void d(int i, String str) {
        this.g.setContentTitle(qre.f(R.string.IDS_app_name_health)).setContentText(str + i + qre.f(R.string.IDS_bolt_percent_unit)).setSmallIcon(R.drawable.healthlogo_ic_notification).setProgress(100, i, false);
        this.i = this.g.build();
    }

    private void e(int i, String str) {
        if (!CommonUtil.bg() || (CommonUtil.cp() && !EnvironmentInfo.g())) {
            this.e = i;
            this.j.setTextViewText(R.id.touch_transfer_percent, UnitUtil.e(i, 2, 0));
            this.j.setTextViewText(R.id.touch_transfer_title, str);
            LogUtil.a("AppUpdateNotification", "notifyProgress:", Integer.valueOf(i));
            this.j.setProgressBar(R.id.touch_transfer_progress, 100, i, false);
            this.i.contentView = this.j;
            return;
        }
        if (EnvironmentInfo.g()) {
            String strE = UnitUtil.e(i, 2, 0);
            LogUtil.a("AppUpdateNotification", "notifyProgress:", Integer.valueOf(i), "transferPercent :", strE);
            this.g.setContentTitle(qre.f(R.string.IDS_notify_updating_health));
            this.g.setContentText(qre.a(R.string.IDS_notify_updated, strE)).setProgress(100, i, false);
        } else {
            this.g.setContentTitle(str).setProgress(100, i, false);
        }
        this.i = this.g.build();
    }

    public void d(String str, String str2) {
        if (!this.h) {
            LogUtil.j("AppUpdateNotification", "showText, not create");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("AppUpdateNotification", "showText title is null");
            return;
        }
        LogUtil.a("AppUpdateNotification", "showText, description:", str2);
        if (CommonUtil.cp() && !EnvironmentInfo.g()) {
            RemoteViews remoteViews = new RemoteViews(BaseApplication.getContext().getPackageName(), R.layout.notification_transfer_end_view);
            remoteViews.setTextViewText(R.id.touch_transfer_end_title, str);
            if (!TextUtils.isEmpty(str2)) {
                remoteViews.setTextViewText(R.id.touch_transfer_content, str2);
            }
            remoteViews.setImageViewResource(R.id.touch_app_image_view, R.drawable.healthlogo_ic_notification);
            remoteViews.setTextViewText(R.id.touch_app_name, BaseApplication.getContext().getString(R.string.IDS_app_name_health));
            this.i.contentView = remoteViews;
        } else {
            if (EnvironmentInfo.g()) {
                this.g.setContentTitle(qre.f(R.string.IDS_notify_updating_health_download_failed));
            } else {
                this.g.setContentTitle(str);
            }
            this.g.setContentText(str2);
            this.i = this.g.build();
        }
        lsb.d().c(20200317, this.i);
    }

    public void b() {
        lsb.d().e(20200317);
        this.h = false;
    }

    public boolean d() {
        return this.h;
    }
}
