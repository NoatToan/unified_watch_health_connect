package defpackage;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.app.NotificationManagerCompat;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.RewardKeys;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LocalBroadcast;
import health.compact.a.NotificationUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class mrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static mrr f42292a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42293c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f42294b = false;
    private Context d = BaseApplication.getContext();
    private b e;

    /* JADX INFO: loaded from: classes11.dex */
    class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:46:0x0089  */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.j("CloudFileNotificationUtils", "NotificationClickReceiver action is null");
                return;
            }
            String action = intent.getAction();
            Bundle extras = intent.getExtras();
            if (extras == null || TextUtils.isEmpty(action)) {
                LogUtil.j("CloudFileNotificationUtils", "download bundle or action is null");
                return;
            }
            ReleaseLogUtil.d("CloudFileNotificationUtils", "action is :", action);
            action.hashCode();
            switch (action) {
                case "trans_done":
                case "cancel_file_download":
                case "dis_agree_file_download":
                case "cancel_file_trans":
                    mrr.this.b();
                    mru.e().c();
                    break;
                case "retry_file_trans":
                    mrr.this.b(0, extras);
                    mru.e().e(extras, true);
                    break;
                case "agree_file_download":
                case "retry_file_download":
                    mrr.this.b(0, false, extras);
                    mru.e().c(extras, true);
                    break;
                case "notification_delete":
                    LogUtil.a("CloudFileNotificationUtils", "isFinish: ", Boolean.valueOf(mrr.this.f42294b));
                    if (mrr.this.f42294b) {
                        mru.e().c();
                        break;
                    }
                    break;
            }
        }
    }

    public static mrr c() {
        mrr mrrVar;
        synchronized (f42293c) {
            if (f42292a == null) {
                f42292a = new mrr();
            }
            mrrVar = f42292a;
        }
        return mrrVar;
    }

    protected mrr() {
        try {
            this.e = new b();
            IntentFilter intentFilter = new IntentFilter("cancel_file_download");
            intentFilter.addAction("agree_file_download");
            intentFilter.addAction("retry_file_download");
            intentFilter.addAction("notification_delete");
            intentFilter.addAction("trans_done");
            intentFilter.addAction("dis_agree_file_download");
            intentFilter.addAction("cancel_file_trans");
            intentFilter.addAction("retry_file_trans");
            BroadcastManagerUtil.d(this.d, this.e, intentFilter, LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            ReleaseLogUtil.a("CloudFileNotificationUtils", "registerReceiver is error");
        }
    }

    protected void b(Bundle bundle) {
        if (BaseApplication.isRunningForeground()) {
            e(bundle, 1);
            return;
        }
        this.f42294b = true;
        RemoteViews remoteViews = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_layout);
        remoteViews.setViewVisibility(R.id.notice_layout, 0);
        remoteViews.setViewVisibility(R.id.download_progress_layout, 8);
        remoteViews.setViewVisibility(R.id.download_progress_error_layout, 8);
        remoteViews.setViewVisibility(R.id.transfer_progress_layout, 8);
        this.d.getResources().getString(R.string.IDS_notify_file_content);
        String strE = mrp.e(bundle.getString("hex_data"));
        LogUtil.a("CloudFileNotificationUtils", "file size: ", strE);
        int iB = mrp.b(bundle);
        String strB = mrp.b(iB, strE);
        remoteViews.setTextViewText(R.id.file_notice_content, strB);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.d, iB, e(bundle, "agree_file_download"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.bt_agree, broadcast);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.d, iB, e(bundle, "dis_agree_file_download"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.bt_cancel, broadcast2);
        if (EnvironmentInfo.g() || CommonUtil.bm()) {
            Notification.Builder builderE = e(this.d.getResources().getString(R.string.IDS_notification_title), bundle, (PendingIntent) null);
            builderE.setContentText(strB);
            builderE.setStyle(new Notification.BigTextStyle());
            builderE.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_cancel), broadcast2).build());
            builderE.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_agree), broadcast).build());
            e(builderE, bundle);
            return;
        }
        d(remoteViews, bundle);
    }

    private void d(RemoteViews remoteViews, Bundle bundle) {
        RemoteViews remoteViews2 = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_small_layout);
        remoteViews2.setTextViewText(R.id.notice_title, this.d.getResources().getString(R.string.IDS_notify_file_content_title));
        b(remoteViews, remoteViews2, bundle, null);
    }

    private void e(Bundle bundle, int i) {
        LogUtil.a("CloudFileNotificationUtils", "updateDialogFromUI, dialogStyle: ", Integer.valueOf(i));
        if (i != 4) {
            mru.e().a(bundle);
        }
        Intent intent = new Intent();
        intent.setClassName(this.d, "com.huawei.ui.device.activity.featuremanager.HwCloudFileConfigDialogActivity");
        intent.setFlags(268435456);
        intent.putExtra("bundle", bundle);
        intent.putExtra(RewardKeys.DIALOG_TYPE, i);
        iov.d(BaseApplication.getContext(), intent);
    }

    private Intent e(Bundle bundle, String str) {
        Intent intent = new Intent(str);
        intent.putExtras(bundle);
        intent.setPackage(BaseApplication.getAppPackage());
        return intent;
    }

    private void b(RemoteViews remoteViews, RemoteViews remoteViews2, Bundle bundle, PendingIntent pendingIntent) {
        Notification.Builder builderE = e((String) null, bundle, pendingIntent);
        builderE.setCustomContentView(remoteViews2);
        builderE.setCustomBigContentView(remoteViews);
        builderE.setStyle(new Notification.DecoratedCustomViewStyle());
        e(builderE, bundle);
    }

    private Notification.Builder e(String str, Bundle bundle, PendingIntent pendingIntent) {
        Notification.Builder builderC = lsb.d().c();
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setAutoCancel(false);
        builderC.setShowWhen(false);
        builderC.setVisibility(-1);
        builderC.setSound(null);
        builderC.setPriority(0);
        if (pendingIntent != null) {
            builderC.setContentIntent(pendingIntent);
        }
        if (!TextUtils.isEmpty(str)) {
            builderC.setContentTitle(str);
        }
        builderC.setDeleteIntent(PendingIntent.getBroadcast(this.d, 0, e(bundle, "notification_delete"), 201326592));
        return builderC;
    }

    private void e(Notification.Builder builder, Bundle bundle) {
        Notification notificationBuild = builder.build();
        d(bundle, notificationBuild.extras);
        if (!NotificationManagerCompat.from(BaseApplication.getContext()).areNotificationsEnabled()) {
            if (this.f42294b) {
                mru.e().c();
                return;
            }
            return;
        }
        lsb.d().c(20220422, notificationBuild);
    }

    private void d(Bundle bundle, Bundle bundle2) {
        bundle2.putInt("notification_status", bundle.getInt("notification_status"));
        bundle2.putBundle("bundle", bundle);
    }

    protected void b(int i, boolean z, Bundle bundle) {
        if (z) {
            bundle.putInt("notification_status", -1);
        }
        if (BaseApplication.isRunningForeground() && z) {
            e(bundle, 2);
            a(bundle);
            return;
        }
        RemoteViews remoteViews = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_layout);
        remoteViews.setViewVisibility(R.id.notice_layout, 8);
        if (z) {
            this.f42294b = true;
            remoteViews.setViewVisibility(R.id.download_progress_error_layout, 0);
            remoteViews.setViewVisibility(R.id.download_progress_layout, 8);
        } else {
            if (this.f42294b) {
                this.f42294b = false;
            }
            bundle.putInt("notification_status", 1);
            remoteViews.setViewVisibility(R.id.download_progress_error_layout, 8);
            remoteViews.setViewVisibility(R.id.download_progress_layout, 0);
            remoteViews.setProgressBar(R.id.download_progress_bar, 100, i, false);
        }
        remoteViews.setViewVisibility(R.id.transfer_progress_layout, 8);
        remoteViews.setViewVisibility(R.id.transfer_error_layout, 8);
        int iB = mrp.b(bundle);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.d, iB, e(bundle, "cancel_file_download"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.bt_download_cancel, broadcast);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.d, iB, e(bundle, "retry_file_download"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.bt_download_retry, broadcast2);
        if (!EnvironmentInfo.g() && !CommonUtil.bm()) {
            b(remoteViews, bundle, z);
        } else if (z) {
            d(bundle, broadcast, broadcast2);
        } else {
            b(bundle, i);
        }
    }

    private void b(RemoteViews remoteViews, Bundle bundle, boolean z) {
        RemoteViews remoteViews2 = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_small_layout);
        String string = this.d.getResources().getString(R.string.IDS_notify_file_download_tips);
        if (z) {
            string = this.d.getResources().getString(R.string.IDS_notify_file_download_error_tips);
        }
        remoteViews2.setTextViewText(R.id.notice_title, string);
        b(remoteViews, remoteViews2, bundle, null);
    }

    private void d(Bundle bundle, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        String string = this.d.getResources().getString(R.string.IDS_notification_title);
        String string2 = this.d.getResources().getString(R.string.IDS_file_update_error_content);
        Notification.Builder builderE = e(string, bundle, (PendingIntent) null);
        builderE.setContentText(string2);
        builderE.setStyle(new Notification.BigTextStyle());
        builderE.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_cancel), pendingIntent).build());
        builderE.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_retry), pendingIntent2).build());
        e(builderE, bundle);
    }

    private void b(Bundle bundle, int i) {
        Notification.Builder builderE = e(this.d.getResources().getString(R.string.IDS_notification_title), bundle, (PendingIntent) null);
        builderE.setOngoing(true);
        builderE.setContentText(String.format(Locale.ROOT, this.d.getResources().getString(R.string.IDS_notify_file_download_progress), ltc.c(i, 2, 0)));
        builderE.setProgress(100, i, false);
        e(builderE, bundle);
    }

    private void a(Bundle bundle) {
        RemoteViews remoteViews = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_layout);
        remoteViews.setViewVisibility(R.id.notice_layout, 8);
        remoteViews.setViewVisibility(R.id.download_progress_error_layout, 0);
        remoteViews.setViewVisibility(R.id.download_progress_layout, 8);
        remoteViews.setViewVisibility(R.id.download_bt_layout, 8);
        PendingIntent activity = PendingIntent.getActivity(this.d, 20220422, NotificationUtil.a(this.d), 201326592);
        if (EnvironmentInfo.g() || CommonUtil.bm()) {
            String string = this.d.getResources().getString(R.string.IDS_notification_title);
            String string2 = this.d.getResources().getString(R.string.IDS_file_download_error_content);
            Notification.Builder builderE = e(string, bundle, activity);
            builderE.setContentText(string2);
            builderE.setStyle(new Notification.BigTextStyle());
            e(builderE, bundle);
            return;
        }
        RemoteViews remoteViews2 = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_small_layout);
        remoteViews2.setTextViewText(R.id.notice_title, this.d.getResources().getString(R.string.IDS_notify_file_download_error_tips));
        b(remoteViews, remoteViews2, bundle, activity);
    }

    protected void b(int i, Bundle bundle) {
        if (this.f42294b) {
            this.f42294b = false;
        }
        bundle.putInt("notification_status", 2);
        if (EnvironmentInfo.g() || CommonUtil.bm()) {
            Notification.Builder builderE = e(this.d.getResources().getString(R.string.IDS_notification_title), bundle, (PendingIntent) null);
            String string = this.d.getResources().getString(R.string.IDS_file_transport_progress);
            builderE.setOngoing(true);
            builderE.setContentText(String.format(Locale.ROOT, string, ltc.c(i, 2, 0)));
            builderE.setProgress(100, i, false);
            e(builderE, bundle);
            return;
        }
        RemoteViews remoteViews = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_layout);
        remoteViews.setViewVisibility(R.id.notice_layout, 8);
        remoteViews.setViewVisibility(R.id.transfer_progress_layout, 0);
        remoteViews.setViewVisibility(R.id.transfer_error_layout, 8);
        remoteViews.setViewVisibility(R.id.download_progress_layout, 8);
        remoteViews.setProgressBar(R.id.transfer_progress_bar, 100, i, false);
        RemoteViews remoteViews2 = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_small_layout);
        remoteViews2.setTextViewText(R.id.notice_title, this.d.getResources().getString(R.string.IDS_file_transport_tips));
        b(remoteViews, remoteViews2, bundle, null);
    }

    public void e(boolean z, Bundle bundle) {
        bundle.putInt("notification_status", -1);
        if (BaseApplication.isRunningForeground()) {
            if (z) {
                e(bundle, 3);
                c(bundle);
                return;
            } else {
                b();
                e(bundle, 4);
                return;
            }
        }
        this.f42294b = true;
        RemoteViews remoteViews = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_layout);
        remoteViews.setViewVisibility(R.id.notice_layout, 8);
        if (z) {
            remoteViews.setViewVisibility(R.id.transfer_progress_layout, 8);
            remoteViews.setViewVisibility(R.id.transfer_error_layout, 0);
        } else {
            remoteViews.setViewVisibility(R.id.transfer_progress_layout, 0);
            remoteViews.setViewVisibility(R.id.bt_transfer_done, 0);
            remoteViews.setViewVisibility(R.id.download_progress_layout, 8);
            remoteViews.setViewVisibility(R.id.transfer_progress_bar, 8);
            remoteViews.setTextViewText(R.id.transfer_tips, this.d.getResources().getString(R.string.IDS_notify_file_transport_done));
        }
        remoteViews.setViewVisibility(R.id.download_progress_error_layout, 8);
        int iB = mrp.b(bundle);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.d, iB, e(bundle, "cancel_file_trans"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.bt_transfer_cancel, broadcast);
        PendingIntent broadcast2 = PendingIntent.getBroadcast(this.d, iB, e(bundle, "retry_file_trans"), 201326592);
        remoteViews.setOnClickPendingIntent(R.id.bt_transfer_retry, broadcast2);
        remoteViews.setOnClickPendingIntent(R.id.bt_transfer_done, PendingIntent.getBroadcast(this.d, iB, e(bundle, "trans_done"), 201326592));
        if (!EnvironmentInfo.g() && !CommonUtil.bm()) {
            a(remoteViews, bundle, z);
        } else if (z) {
            e(bundle, broadcast, broadcast2);
        } else {
            e(bundle);
        }
    }

    private void a(RemoteViews remoteViews, Bundle bundle, boolean z) {
        RemoteViews remoteViews2 = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_small_layout);
        String string = this.d.getResources().getString(R.string.IDS_notify_file_transport_done);
        if (z) {
            string = this.d.getResources().getString(R.string.IDS_file_transport_error_tips);
        }
        remoteViews2.setTextViewText(R.id.notice_title, string);
        b(remoteViews, remoteViews2, bundle, null);
    }

    private void e(Bundle bundle, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        String string = this.d.getResources().getString(R.string.IDS_notification_title);
        String string2 = this.d.getResources().getString(R.string.IDS_file_update_error_content);
        Notification.Builder builderE = e(string, bundle, (PendingIntent) null);
        builderE.setContentText(string2);
        builderE.setStyle(new Notification.BigTextStyle());
        builderE.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_cancel), pendingIntent).build());
        builderE.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_retry), pendingIntent2).build());
        e(builderE, bundle);
    }

    private void e(Bundle bundle) {
        if (EnvironmentInfo.g()) {
            String string = this.d.getResources().getString(R.string.IDS_notification_title);
            String string2 = this.d.getResources().getString(R.string.IDS_file_update_done);
            Notification.Builder builderE = e(string, bundle, (PendingIntent) null);
            builderE.setContentText(string2);
            builderE.setShowWhen(true);
            e(builderE, bundle);
            return;
        }
        int iB = mrp.b(bundle);
        Notification.Builder builderE2 = e(this.d.getResources().getString(R.string.IDS_notify_file_transport_done), bundle, (PendingIntent) null);
        builderE2.setProgress(100, 100, false);
        builderE2.setStyle(new Notification.BigTextStyle());
        builderE2.addAction(new Notification.Action.Builder((Icon) null, this.d.getResources().getString(R.string.IDS_notify_done), PendingIntent.getBroadcast(this.d, iB, e(bundle, "trans_done"), 201326592)).build());
        e(builderE2, bundle);
    }

    private void c(Bundle bundle) {
        RemoteViews remoteViews = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_layout);
        remoteViews.setViewVisibility(R.id.notice_layout, 8);
        remoteViews.setViewVisibility(R.id.transfer_progress_layout, 8);
        remoteViews.setViewVisibility(R.id.transfer_error_layout, 0);
        remoteViews.setViewVisibility(R.id.transfer_bt_layout, 8);
        PendingIntent activity = PendingIntent.getActivity(this.d, 20220422, NotificationUtil.a(this.d), 201326592);
        if (EnvironmentInfo.g() || CommonUtil.bm()) {
            String string = this.d.getResources().getString(R.string.IDS_notification_title);
            String string2 = this.d.getResources().getString(R.string.IDS_file_update_error_content);
            Notification.Builder builderE = e(string, bundle, activity);
            builderE.setContentText(string2);
            builderE.setStyle(new Notification.BigTextStyle());
            e(builderE, bundle);
            return;
        }
        RemoteViews remoteViews2 = new RemoteViews(this.d.getPackageName(), R.layout.cloud_file_file_notice_small_layout);
        remoteViews2.setTextViewText(R.id.notice_title, this.d.getResources().getString(R.string.IDS_file_transport_error_tips));
        b(remoteViews, remoteViews2, bundle, activity);
    }

    public void b() {
        lsb.d().e(20220422);
    }

    public void d() {
        Notification notification;
        LogUtil.a("CloudFileNotificationUtils", "changeNotification");
        NotificationManager notificationManagerL = CommonUtils.l();
        if (notificationManagerL == null) {
            LogUtil.j("CloudFileNotificationUtils", "changeNotification, mManager is null");
            return;
        }
        try {
            StatusBarNotification[] activeNotifications = notificationManagerL.getActiveNotifications();
            if (activeNotifications == null) {
                LogUtil.j("CloudFileNotificationUtils", "activeNotifications is null");
                return;
            }
            int length = activeNotifications.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    notification = null;
                    break;
                }
                StatusBarNotification statusBarNotification = activeNotifications[i];
                if (statusBarNotification.getId() == 20220422) {
                    notification = statusBarNotification.getNotification();
                    break;
                }
                i++;
            }
            if (notification == null) {
                LogUtil.j("CloudFileNotificationUtils", "changeNotification, notification is null");
                return;
            }
            Bundle bundle = notification.extras;
            if (bundle == null) {
                LogUtil.j("CloudFileNotificationUtils", "extras is null");
                return;
            }
            Bundle bundle2 = bundle.getBundle("bundle");
            if (bundle2 == null) {
                LogUtil.j("CloudFileNotificationUtils", "notificationBundle is null");
                return;
            }
            int i2 = bundle2.getInt("notification_status");
            LogUtil.a("CloudFileNotificationUtils", "status is： ", Integer.valueOf(i2));
            if (i2 == 1) {
                b(0, true, bundle2);
            } else if (i2 == 2) {
                e(true, bundle2);
            }
        } catch (IllegalArgumentException unused) {
            LogUtil.e("CloudFileNotificationUtils", "changeNotification is error");
            notificationManagerL.cancel(20220422);
        }
    }
}
