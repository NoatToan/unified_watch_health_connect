package com.huawei.health.ui.notification.uihandlers;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.util.UnitUtilExt;
import com.huawei.health.ui.notification.common.IReporter;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import com.huawei.threecircle.manager.WheelChairStateManager;
import com.huawei.watchface.api.WebViewActivity;
import defpackage.ipj;
import defpackage.lsb;
import defpackage.lsl;
import defpackage.ltc;
import defpackage.qgm;
import defpackage.qgr;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.NotificationHelper;
import health.compact.a.NotificationUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPerferenceUtils;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepNotificationByHardWareUtils;
import health.compact.a.StepsRecord;
import health.compact.a.UnitUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HealthStepsNotificationHelper extends IReporter implements WheelChairStateManager.SwitchStateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f10329a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile HealthStepsNotificationHelper f10330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f10331c;
    private Context d;
    private a g;
    private boolean h;
    private boolean i;
    private e j;
    private final boolean k;
    private boolean l;
    private boolean m;
    private final boolean o;
    private final boolean p;
    private long q;
    private final boolean r;
    private long y = 0;
    private long e = 0;
    private boolean u = false;
    private int w = 12;
    private boolean n = false;
    private StepsRecord x = new StepsRecord();
    private long t = 0;
    private int v = 0;
    private boolean s = true;
    private Handler f = new Handler(Looper.getMainLooper()) { // from class: com.huawei.health.ui.notification.uihandlers.HealthStepsNotificationHelper.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 100) {
                if (message.obj instanceof Bundle) {
                    Bundle bundle = (Bundle) message.obj;
                    HealthStepsNotificationHelper.this.e(bundle.getInt("bundle_key_steps"), bundle.getInt("bundle_key_calorie"), bundle.getInt("bundle_key_step_goal"), bundle.getInt("bundle_key_active_count"));
                    return;
                }
                return;
            }
            if (message.what == 101) {
                LogUtil.a("Step_HealthStepNHlp", "MSG_RESET_DYNAMIC_TRACK_STATE");
                HealthStepsNotificationHelper.this.i = false;
                HealthStepsNotificationHelper.this.o();
            }
        }
    };

    private HealthStepsNotificationHelper(Context context) {
        boolean z = false;
        this.d = context;
        if (!"xiaomi".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 31) {
            z = true;
        }
        this.r = z;
        this.o = "oppo".equalsIgnoreCase(Build.MANUFACTURER);
        this.p = "vivo".equalsIgnoreCase(Build.MANUFACTURER);
        this.k = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
    }

    public static HealthStepsNotificationHelper c(Context context) {
        if (f10330b == null) {
            synchronized (f10329a) {
                if (f10330b == null) {
                    f10330b = new HealthStepsNotificationHelper(context);
                }
            }
        }
        return f10330b;
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStart(Bundle bundle) {
        super.onStart(bundle);
        WheelChairStateManager.a().b((WheelChairStateManager.SwitchStateListener) this);
        SharedPerferenceUtils.e(this.d, true);
        o();
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.n = true;
        this.s = true;
        this.v = 0;
        this.l = NotificationUtil.i();
        this.m = NotificationUtil.j();
        if (!this.x.d()) {
            LogUtil.j("Step_HealthStepNHlp", "onStart mRecord.isStepDataValidate()");
            a(0, 0, -1, -1);
        } else {
            a(this.x.f, this.x.f36649c, this.x.h, this.x.d);
        }
        d();
        g();
    }

    private void d() {
        this.q = SharedPreferenceManager.d("fitness_step_module_id", "has_enter_hour", 0L);
    }

    private void g() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ENTER_HOUR_LAYOUT");
        if (this.f10331c == null) {
            this.f10331c = new b();
        }
        BroadcastManagerUtil.d(this.d, this.f10331c, intentFilter);
        if (CommonUtil.bh()) {
            if (this.j == null) {
                this.j = new e();
            }
            Context context = this.d;
            if (context != null) {
                BroadcastManagerUtil.d(context, this.j, new IntentFilter("com.android.systemui.statusbar.visible.change"), CommonUtil.bj() ? "hihonor.android.permission.HW_SIGNATURE_OR_SYSTEM" : WebViewActivity.HW_SIGNATURE_OR_SYSTEM, null);
            }
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void refresh(StepsRecord stepsRecord) {
        synchronized (this) {
            try {
                if (StepNotificationByHardWareUtils.d()) {
                    b(stepsRecord);
                }
            } catch (Exception unused) {
                LogUtil.j("Step_HealthStepNHlp", "stepsNotification refresh exception!!!");
            }
        }
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void onStop() {
        super.onStop();
        e();
        SharedPerferenceUtils.e(this.d, false);
        l();
        WheelChairStateManager.a().c((WheelChairStateManager.SwitchStateListener) this);
    }

    @Override // com.huawei.health.ui.notification.common.IReporter
    public void languageChanged() {
        this.h = true;
        refresh(this.x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LogUtil.a("Step_HealthStepNHlp", "closeNotification...");
        n();
        NotificationUtil.a(this.d, 10010);
        m();
        Handler handler = this.f;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void n() {
        try {
            Context context = this.d;
            if (context instanceof Service) {
                ((Service) context).stopForeground(true);
            }
        } catch (NumberFormatException e2) {
            LogUtil.e("Step_HealthStepNHlp", "NumberFormatException", e2.getMessage());
        }
    }

    private void m() {
        Context context;
        e eVar;
        try {
            BroadcastManagerUtil.d(this.d, this.f10331c);
            if (!CommonUtil.bh() || (context = this.d) == null || (eVar = this.j) == null) {
                return;
            }
            context.unregisterReceiver(eVar);
            this.j = null;
        } catch (IllegalArgumentException e2) {
            ReleaseLogUtil.b("Step_HealthStepNHlp", "Receiver already unregistered ", LogAnonymous.b(e2));
        }
    }

    private Notification i(int i, int i2, int i3, int i4) {
        String strA = NotificationUtil.a(this.d, UnitUtilExt.e(this.d, Math.round(i2 / 1000.0f), 1, 0));
        Notification.Builder builderC = lsb.d().c();
        NotificationHelper.e(this.d, builderC);
        lsb.d().c(builderC);
        builderC.setWhen(System.currentTimeMillis());
        builderC.setShowWhen(false);
        Intent intent = new Intent("steps_notify_delete");
        intent.setPackage(this.d.getPackageName());
        builderC.setDeleteIntent(PendingIntent.getBroadcast(this.d, 10010, intent, 201326592));
        builderC.setPriority(0);
        builderC.setOngoing(true);
        a(i, i3, strA, builderC, i4);
        builderC.setContentIntent(NotificationUtil.b(this.d));
        return builderC.build();
    }

    private Notification b(int i, int i2, int i3, int i4) {
        Notification.Builder builderC = lsb.d().c();
        NotificationHelper.e(this.d, builderC);
        lsb.d().c(builderC);
        builderC.setWhen(System.currentTimeMillis());
        builderC.setShowWhen(false);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        Intent intent = new Intent("steps_notify_delete");
        intent.setPackage(this.d.getPackageName());
        builderC.setDeleteIntent(PendingIntent.getBroadcast(this.d, 10010, intent, 201326592));
        builderC.setPriority(0);
        builderC.setOngoing(true);
        int iA = a(i4);
        if (TextUtils.isEmpty(d(i, i3, iA))) {
            iA = -1;
        }
        builderC.setContentTitle(d(i, i2));
        builderC.setContentIntent(NotificationUtil.b(this.d));
        builderC.setContentText(d(i, i3, iA));
        c(i, i3, builderC, iA);
        return builderC.build();
    }

    private void c(int i, int i2, Notification.Builder builder, int i3) {
        if (i3 == -1) {
            builder.setProgress(100, c(i, i2), false);
        } else {
            builder.addAction(b(i3));
        }
        if (CommonUtil.bm()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("notification.live.operation", this.v);
        bundle.putString("notification.live.event", "Other");
        bundle.putInt("notification.live.type", 1);
        builder.addExtras(bundle);
        if (this.v == 0) {
            ReleaseLogUtil.c("Step_HealthStepNHlp", "create LiveNotification firstly");
        }
        this.v = 1;
    }

    private Notification.Action b(int i) {
        int i2;
        PendingIntent pendingIntentD;
        CharSequence charSequenceE;
        if (i == 1) {
            i2 = R.drawable.ic_health_remind_stand;
            pendingIntentD = e(this.d);
            charSequenceE = e(i());
        } else {
            if (LanguageUtil.ba(this.d)) {
                i2 = R.drawable.ic_health_notification_step_mirroring;
            } else {
                i2 = R.drawable.ic_health_notification_step;
            }
            pendingIntentD = d(this.d);
            charSequenceE = e(R.string.accessibility_start_walk);
        }
        return new Notification.Action(i2, charSequenceE, pendingIntentD);
    }

    private int i() {
        if (WheelChairStateManager.a().d()) {
            return R.string.accessibility_stand_detail_view_wc;
        }
        return R.string.accessibility_stand_detail_view;
    }

    private CharSequence e(int i) {
        Context context = this.d;
        if (context == null) {
            ReleaseLogUtil.d("Step_HealthStepNHlp", "getContentDescription mContext is null");
            return "";
        }
        Resources resources = context.getResources();
        if (resources == null) {
            ReleaseLogUtil.d("Step_HealthStepNHlp", "getContentDescription resources is null");
            return "";
        }
        try {
            return resources.getString(i);
        } catch (Resources.NotFoundException e2) {
            ReleaseLogUtil.b("Step_HealthStepNHlp", "getContentDescription exception ", ExceptionUtils.c(e2));
            return "";
        }
    }

    private int c(int i, int i2) {
        int iRound = (int) Math.round((((double) i) / ((double) i2)) * 100.0d);
        if (iRound == 100 && i < i2) {
            return 99;
        }
        if (iRound > 100) {
            return 100;
        }
        return iRound;
    }

    private PendingIntent e(Context context) {
        if (context == null) {
            LogUtil.j("Step_HealthStepNHlp", "getStartAppIntent() context is null");
            return null;
        }
        Intent intent = new Intent(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/router/stepCard/ActiveHours?&fromType=1")));
        intent.setPackage(context.getPackageName());
        return a(context, intent);
    }

    private PendingIntent d(Context context) {
        if (context == null) {
            LogUtil.j("Step_HealthStepNHlp", "getStartAppIntent() context is null");
            return null;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/track?sportType=1&targetType=-1&targetValue=-1&fromType=1"));
        intent.setPackage(context.getPackageName());
        intent.putExtra("mLaunchSource", 12);
        return a(context, intent);
    }

    private static PendingIntent a(Context context, Intent intent) {
        try {
            return PendingIntent.getActivity(context, 0, intent, 201326592);
        } catch (Exception e2) {
            ReleaseLogUtil.b("Step_HealthStepNHlp", "getPendingSafeIntent exception:", ExceptionUtils.c(e2));
            return null;
        }
    }

    private String d(int i, int i2) {
        String strC = NotificationUtil.c(this.d, String.valueOf(i));
        Context context = this.d;
        return this.d.getResources().getString(R.string.IDS_plugindameon_hw_show_notification_info, strC, NotificationUtil.a(context, UnitUtilExt.e(context, Math.round(i2 / 1000.0f), 1, 0)));
    }

    private String d(int i, int i2, int i3) {
        int iMax = Math.max(i, 0);
        if (i3 == -1) {
            return this.d.getResources().getString(R.string.IDS_plugindameon_step_ratio, ltc.c(c(iMax, i2), 2, 0));
        }
        if (i3 == 1) {
            return h();
        }
        if (i3 != 2 || iMax >= i2) {
            return "";
        }
        int i4 = i2 - iMax;
        return this.d.getResources().getQuantityString(R.plurals.IDS_plugindameon_step_goal, i4, ltc.c(i4, 1, 0));
    }

    private void a(int i, int i2, String str, Notification.Builder builder, int i3) {
        String strC = NotificationUtil.c(this.d, String.valueOf(i));
        int iA = a(i3);
        if (iA == -1) {
            builder.setContentTitle(strC).setContentText(str);
            return;
        }
        if (iA == 1) {
            builder.setContentTitle(strC + " " + str).setContentText(h());
            return;
        }
        if (iA != 2) {
            return;
        }
        if (i < i2) {
            int i4 = i2 - i;
            builder.setContentTitle(strC + " " + str).setContentText(this.d.getResources().getQuantityString(R.plurals.IDS_plugindameon_step_goal, i4, UnitUtil.e(i4, 1, 0)));
            return;
        }
        builder.setContentTitle(strC).setContentText(str);
    }

    private Notification d(int i, int i2, int i3, int i4) {
        Notification.Builder builderC = lsb.d().c();
        lsb.d().c(builderC);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setWhen(System.currentTimeMillis());
        builderC.setShowWhen(false);
        builderC.setContentIntent(NotificationUtil.b(this.d));
        Intent intent = new Intent("steps_notify_delete");
        intent.setPackage(this.d.getPackageName());
        builderC.setDeleteIntent(PendingIntent.getBroadcast(this.d, 10010, intent, 201326592));
        builderC.setPriority(0);
        builderC.setOngoing(true);
        builderC.setGroup("Step_HealthStepNHlp");
        RemoteViews remoteViewsG = g(i, i2, i3, i4);
        Notification notificationBuild = builderC.build();
        notificationBuild.contentView = remoteViewsG;
        return notificationBuild;
    }

    private RemoteViews g(int i, int i2, int i3, int i4) {
        RemoteViews remoteViewsC = c();
        remoteViewsC.setImageViewResource(R.id.icon, R.drawable.healthlogo_ic_notification);
        String strD = NotificationUtil.d(this.d, i);
        String strB = NotificationUtil.b(this.d, i2);
        remoteViewsC.setTextViewText(R.id.app_name_text, AppInfoUtils.a());
        remoteViewsC.setTextViewText(R.id.textStep, strD);
        remoteViewsC.setTextViewText(R.id.textStepUnit, this.d.getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_step_unit));
        remoteViewsC.setTextViewText(R.id.textKcal, strB);
        remoteViewsC.setTextViewText(R.id.textKcalUnit, this.d.getResources().getString(R.string.IDS_plugindameon_hw_phonecounter_widget_kalo_unit));
        d(i, i3, remoteViewsC, i4);
        return remoteViewsC;
    }

    private RemoteViews c() {
        if (NotificationUtil.b()) {
            return new RemoteViews(this.d.getPackageName(), this.r ? R.layout.step_notify_3_2_fonts_hm30 : R.layout.step_notify_3_2_fonts);
        }
        if (NotificationUtil.a()) {
            return new RemoteViews(this.d.getPackageName(), this.r ? R.layout.step_notify_1_75_fonts_hm30 : R.layout.step_notify_1_75_fonts);
        }
        if (NotificationUtil.d()) {
            return new RemoteViews(this.d.getPackageName(), this.r ? R.layout.step_notify_1_45_fonts_hm30 : R.layout.step_notify_1_45_fonts);
        }
        return new RemoteViews(this.d.getPackageName(), this.r ? R.layout.step_notify_hm30 : R.layout.step_notify);
    }

    private void d(int i, int i2, RemoteViews remoteViews, int i3) {
        int iA = a(i3);
        if (iA == -1) {
            e(i, i2, remoteViews);
        } else if (iA == 1) {
            c(remoteViews);
        } else {
            if (iA != 2) {
                return;
            }
            a(i, i2, remoteViews);
        }
    }

    private void c(RemoteViews remoteViews) {
        remoteViews.setImageViewResource(R.id.iv_start_step, R.drawable.ic_health_remind_stand);
        if (WheelChairStateManager.a().d()) {
            if (LanguageUtil.ba(this.d)) {
                remoteViews.setImageViewResource(R.id.iv_start_step, R.drawable.ic_health_remind_wheel_mirroring);
            } else {
                remoteViews.setImageViewResource(R.id.iv_start_step, R.drawable.ic_health_remind_wheel);
            }
        } else {
            remoteViews.setImageViewResource(R.id.iv_start_step, R.drawable.ic_health_remind_stand);
        }
        remoteViews.setViewVisibility(R.id.iv_start_step, 0);
        remoteViews.setViewVisibility(R.id.tv_target, 0);
        remoteViews.setViewVisibility(R.id.rl_progress_container, 8);
        remoteViews.setTextViewText(R.id.tv_target, h());
        remoteViews.setOnClickPendingIntent(R.id.iv_start_step, e(this.d));
        remoteViews.setContentDescription(R.id.iv_start_step, e(i()));
    }

    private String h() {
        if (WheelChairStateManager.a().d()) {
            return this.d.getResources().getString(R.string.IDS_plugindameon_remind_stand_wc);
        }
        return this.d.getResources().getString(R.string.IDS_plugindameon_remind_stand);
    }

    private void a(int i, int i2, RemoteViews remoteViews) {
        if ((i2 == -1 || i < i2) && this.l) {
            if (LanguageUtil.ba(this.d)) {
                remoteViews.setImageViewResource(R.id.iv_start_step, R.drawable.ic_health_notification_step_mirroring);
            } else {
                remoteViews.setImageViewResource(R.id.iv_start_step, R.drawable.ic_health_notification_step);
            }
            c(i, i2, remoteViews);
            remoteViews.setOnClickPendingIntent(R.id.iv_start_step, d(this.d));
            remoteViews.setContentDescription(R.id.iv_start_step, e(R.string.accessibility_start_walk));
            return;
        }
        e(i, i2, remoteViews);
    }

    private void e(int i, int i2, RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.iv_start_step, 8);
        remoteViews.setViewVisibility(R.id.tv_target, 8);
        remoteViews.setViewVisibility(R.id.rl_progress_container, 0);
        if (i2 != -1) {
            int iC = c(i, i2);
            remoteViews.setTextViewText(R.id.right_icon_text, NotificationUtil.c(this.d, iC));
            remoteViews.setImageViewResource(R.id.right_icon, NotificationUtil.d(iC));
        }
    }

    private void c(int i, int i2, RemoteViews remoteViews) {
        remoteViews.setViewVisibility(R.id.iv_start_step, 0);
        remoteViews.setViewVisibility(R.id.tv_target, 0);
        remoteViews.setViewVisibility(R.id.rl_progress_container, 8);
        int iMax = Math.max(i2 - i, 0);
        remoteViews.setTextViewText(R.id.tv_target, this.d.getResources().getQuantityString(R.plurals.IDS_plugindameon_step_goal, iMax, UnitUtil.e(iMax, 1, 0)));
    }

    public void a(int i, int i2, int i3, int i4) {
        if (this.i) {
            LogUtil.a("Step_HealthStepNHlp", "is dynamicTrack process");
            return;
        }
        int iMax = Math.max(i, 0);
        if (!CommonUtil.bh() || this.s) {
            long jA = LogUtil.a(2000, this.t);
            if (jA != -1) {
                LogUtil.a("Step_HealthStepNHlp", "updateHealthNotification: steps = ", LogAnonymous.d(i));
                this.t = jA;
            }
            if (j()) {
                j(iMax, i2, i3, i4);
            } else {
                e(iMax, i2, i3, i4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(int i, int i2, int i3, int i4) {
        try {
            Notification notificationC = c(i, i2, i3, i4);
            LogUtil.a("Step_HealthStepNHlp", "startNotification...");
            if (WheelChairStateManager.a().d()) {
                e();
            } else {
                if (c(notificationC)) {
                    return;
                }
                try {
                    lsb.d().c(10010, notificationC);
                } catch (SecurityException e2) {
                    LogUtil.j("Step_HealthStepNHlp", "createCommonNotification SecurityException", LogAnonymous.b(e2));
                }
            }
        } catch (IllegalArgumentException e3) {
            ReleaseLogUtil.b("Step_HealthStepNHlp", "createCommonNotification Illegal", LogAnonymous.b(e3));
        }
    }

    private Notification c(int i, int i2, int i3, int i4) {
        if (EnvironmentInfo.n() || CommonUtil.bm()) {
            return b(i, i2, i3, i4);
        }
        if (this.p || this.o || this.k) {
            return h(i, i2, i3, i4);
        }
        if (CommonUtil.cp() || CommonUtil.bd()) {
            return d(i, i2, i3, i4);
        }
        return i(i, i2, i3, i4);
    }

    private Notification h(int i, int i2, int i3, int i4) {
        Notification.Builder builderC = lsb.d().c();
        NotificationHelper.e(this.d, builderC);
        lsb.d().c(builderC);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        Intent intent = new Intent("steps_notify_delete");
        intent.setPackage(this.d.getPackageName());
        builderC.setDeleteIntent(PendingIntent.getBroadcast(this.d, 10010, intent, 201326592));
        builderC.setPriority(0);
        builderC.setOngoing(true);
        int iA = a(i4);
        if (TextUtils.isEmpty(d(i, i3, iA))) {
            iA = -1;
        }
        builderC.setContentTitle(d(i, i2));
        builderC.setContentIntent(NotificationUtil.b(this.d));
        builderC.setContentText(d(i, i3, iA));
        if (iA == -1) {
            builderC.setProgress(100, c(i, i3), false);
        } else {
            builderC.addAction(b(iA));
        }
        return builderC.build();
    }

    private boolean c(Notification notification) {
        try {
            if (!this.n) {
                return false;
            }
            this.n = false;
            Context context = this.d;
            if (!(context instanceof DaemonService)) {
                return false;
            }
            DaemonService daemonService = (DaemonService) context;
            if (Build.VERSION.SDK_INT <= 33) {
                daemonService.startForeground(10010, notification);
                return true;
            }
            daemonService.startForeground(10010, notification, 272);
            return true;
        } catch (NumberFormatException e2) {
            LogUtil.e("Step_HealthStepNHlp", "numberFormatException", e2.getMessage());
            return false;
        } catch (Exception e3) {
            ReleaseLogUtil.d("Step_HealthStepNHlp", "IllegalStateException exception", LogAnonymous.b(e3));
            return false;
        }
    }

    public void b(StepsRecord stepsRecord) {
        if (stepsRecord == null) {
            return;
        }
        if (!stepsRecord.equals(this.x) || this.h) {
            this.h = false;
            this.x.a(stepsRecord);
            a(stepsRecord.f, stepsRecord.f36649c, stepsRecord.h, stepsRecord.d);
        }
    }

    public void d(boolean z) {
        this.l = z;
    }

    public void a(boolean z) {
        this.m = z;
    }

    private int a(int i) {
        if (j() && i != -1 && !lsl.c(this.e, System.currentTimeMillis())) {
            if (this.w == 0) {
                this.w = 12;
            }
            int i2 = (i * 100) / this.w;
            boolean z = i2 < 60 && !lsl.c(this.q, System.currentTimeMillis());
            this.u = z;
            LogUtil.a("Step_HealthStepNHlp", "getShowNotificationType activeCount is ", Integer.valueOf(i), " completedPercent is ", Integer.valueOf(i2), " mStandGoalValue is ", Integer.valueOf(this.w), " mNeedShowActiveStyle is ", Boolean.valueOf(z));
            this.e = System.currentTimeMillis();
        }
        if (j() && this.u) {
            return 1;
        }
        return this.l ? 2 : -1;
    }

    private boolean j() {
        boolean zB = qgr.b(this.d);
        boolean zB2 = SharedPreferenceManager.b("fitness_step_module_id", "active_hours_set_alert_toggle", true);
        LogUtil.d("Step_HealthStepNHlp", "isShowStandUpNotifyByBase mIsShowStandUpNotify ", Boolean.valueOf(this.m), " mIsShowNewStepNotify ", Boolean.valueOf(this.l), " cardType ", Boolean.valueOf(zB), " isStandUpRemindOpen ", Boolean.valueOf(zB2), " mNeedShowActiveStyle ", Boolean.valueOf(this.u));
        return !zB && zB2 && this.m;
    }

    @Override // com.huawei.threecircle.manager.WheelChairStateManager.SwitchStateListener
    public void onSwitchStateChanged(boolean z) {
        if (z) {
            e();
            return;
        }
        if (!Boolean.TRUE.toString().equals(SharedPerferenceUtils.r(this.d))) {
            LogUtil.j("Step_HealthStepNHlp", "updateStepNotifyLayout StepsNotification switch is close or unset");
        } else {
            o();
        }
    }

    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.e("Step_HealthStepNHlp", "context == null || intent == null");
                return;
            }
            LogUtil.a("Step_HealthStepNHlp", "CoverStateBroadcastReceiver received ");
            if ("com.android.systemui.statusbar.visible.change".equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("visible");
                    ReleaseLogUtil.c("Step_HealthStepNHlp", "visible ", stringExtra);
                    HealthStepsNotificationHelper.this.s = "true".equals(stringExtra);
                    if (HealthStepsNotificationHelper.this.s) {
                        HealthStepsNotificationHelper.this.b();
                        if (!HealthStepsNotificationHelper.this.x.d()) {
                            HealthStepsNotificationHelper.this.a(0, 0, -1, -1);
                        } else {
                            HealthStepsNotificationHelper healthStepsNotificationHelper = HealthStepsNotificationHelper.this;
                            healthStepsNotificationHelper.a(healthStepsNotificationHelper.x.f, HealthStepsNotificationHelper.this.x.f36649c, HealthStepsNotificationHelper.this.x.h, HealthStepsNotificationHelper.this.x.d);
                        }
                        ipj.e();
                    }
                } catch (BadParcelableException e) {
                    LogUtil.e("Step_HealthStepNHlp", "BadParcelableException getBooleanExtra:", LogAnonymous.b(e));
                }
            }
        }
    }

    class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.e("Step_HealthStepNHlp", "context == null || intent == null");
                return;
            }
            LogUtil.a("Step_HealthStepNHlp", "DynamicBroadcastReceiver receive enterHourLayout");
            if ("ENTER_HOUR_LAYOUT".equals(intent.getAction()) && NotificationUtil.j()) {
                SharedPreferenceManager.c("fitness_step_module_id", "has_enter_hour", System.currentTimeMillis());
                HealthStepsNotificationHelper.this.q = System.currentTimeMillis();
                HealthStepsNotificationHelper.this.u = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: imp
            @Override // java.lang.Runnable
            public final void run() {
                this.f37840c.a();
            }
        });
    }

    public /* synthetic */ void a() {
        if (!EnvironmentInfo.n() || lsb.b(10010)) {
            return;
        }
        this.v = 0;
        ReleaseLogUtil.c("Step_HealthStepNHlp", "create mLiveOperation: ", 0);
    }

    private void j(final int i, final int i2, final int i3, final int i4) {
        if (lsl.c(this.y, System.currentTimeMillis())) {
            LogUtil.d("Step_HealthStepNHlp", "requestTodayActiveHourGoal is same day");
            e(i, i2, i3, i4);
        } else {
            qgm.c("900200009", new IBaseResponseCallback() { // from class: imn
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i5, Object obj) {
                    this.f37836c.c(i, i2, i3, i4, i5, obj);
                }
            });
        }
    }

    public /* synthetic */ void c(int i, int i2, int i3, int i4, int i5, Object obj) {
        if (obj instanceof Integer) {
            this.w = ((Integer) obj).intValue();
        } else {
            LogUtil.j("Step_HealthStepNHlp", "requestTodayActiveHourGoal objData is not instanceof ActiveGoalModel");
        }
        this.y = System.currentTimeMillis();
        LogUtil.a("Step_HealthStepNHlp", "requestTodayActiveHourGoal mStandGoalValue is ", Integer.valueOf(this.w));
        Bundle bundle = new Bundle();
        bundle.putInt("bundle_key_steps", i);
        bundle.putInt("bundle_key_calorie", i2);
        bundle.putInt("bundle_key_step_goal", i3);
        bundle.putInt("bundle_key_active_count", i4);
        Message messageObtain = Message.obtain();
        messageObtain.obj = bundle;
        messageObtain.what = 100;
        this.f.sendMessage(messageObtain);
    }

    private void f() {
        this.g = new a();
        BroadcastManagerUtil.a(this.d, this.g, new IntentFilter("com.huawei.health.dynamic_track"));
    }

    private void l() {
        a aVar;
        Context context = this.d;
        if (context == null || (aVar = this.g) == null) {
            return;
        }
        context.unregisterReceiver(aVar);
    }

    class a extends BroadcastReceiver {
        private a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"com.huawei.health.dynamic_track".equals(intent.getAction())) {
                return;
            }
            boolean booleanExtra = intent.getBooleanExtra("DynamicTrackState", false);
            LogUtil.a("Step_HealthStepNHlp", "TrackBroadcastReceiver state: ", Boolean.valueOf(booleanExtra));
            if (!booleanExtra) {
                if (HealthStepsNotificationHelper.this.i) {
                    a();
                    return;
                }
                return;
            }
            e(intent);
        }

        private void a() {
            HealthStepsNotificationHelper.this.f.removeMessages(101);
            HealthStepsNotificationHelper.this.i = false;
            HealthStepsNotificationHelper.this.o();
        }

        private void e(Intent intent) {
            HealthStepsNotificationHelper.this.i = true;
            HealthStepsNotificationHelper.this.e();
            long longExtra = intent.getLongExtra("DynamicTrackTime", 0L);
            if (longExtra <= 0) {
                return;
            }
            HealthStepsNotificationHelper.this.f.sendEmptyMessageDelayed(101, longExtra + 5000);
        }
    }
}
