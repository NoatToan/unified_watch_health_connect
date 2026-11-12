package com.huawei.healthcloud.plugintrack.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.android.fsm.HwFoldScreenManagerEx;
import com.huawei.haf.common.utils.AppInfoUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportDataOutputApi;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener;
import com.huawei.healthcloud.plugintrack.ui.activity.TrackMainMapActivity;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.watchface.api.WebViewActivity;
import defpackage.ive;
import defpackage.iwy;
import defpackage.izn;
import defpackage.jaa;
import defpackage.jbg;
import defpackage.lmf;
import defpackage.lsb;
import defpackage.nty;
import defpackage.qqf;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogAnonymous;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class HealthSportingNotificationHelper implements ISportDataFragmentListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Bundle f10495c;
    private Context e;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean m;
    private boolean o;
    private boolean p;
    private final boolean r;
    private boolean t;
    private NotificationSportControlReceiver u;
    private int x;
    private volatile HwScreenFoldDisplayMode y;
    private volatile boolean l = false;
    private String f = izn.e(BaseApplication.getContext());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10496a = new e();
    private boolean h = PermissionUtil.f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10497b = 35;
    private boolean s = true;
    private boolean n = false;
    private int q = 0;
    private Handler g = new Handler(Looper.getMainLooper()) { // from class: com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message != null && message.what == 1) {
                if (!(message.obj instanceof Bundle)) {
                    LogUtil.j("Track_HealthSportingNotificationHelper", "Bundle is null");
                    return;
                }
                Bundle bundle = (Bundle) message.obj;
                if (!HealthSportingNotificationHelper.this.o) {
                    LogUtil.j("Track_HealthSportingNotificationHelper", "updateSportViewFragment bundle null");
                    return;
                }
                if (!bundle.containsKey("bundle_key_service") || HealthSportingNotificationHelper.f10495c == null) {
                    HealthSportingNotificationHelper.f10495c = bundle;
                }
                HealthSportingNotificationHelper.this.x = bundle.getInt(BleConstants.SPORT_TYPE);
                HealthSportingNotificationHelper.this.b(HealthSportingNotificationHelper.f10495c);
            }
        }
    };
    private final a d = new a();

    private int b(float f, float f2) {
        if (f <= 0.0f) {
            return 0;
        }
        int i = (int) f2;
        if (i > 100) {
            return 100;
        }
        return i;
    }

    public HealthSportingNotificationHelper(Context context, int i, boolean z, boolean z2, boolean z3) {
        this.x = 0;
        this.m = false;
        this.k = false;
        if (context == null) {
            throw new RuntimeException("HealthSportingNotificationHelper invalid params in constructor");
        }
        this.e = context;
        this.x = i;
        this.o = z;
        this.p = CommonUtil.cp();
        this.i = z2;
        this.k = !z2;
        this.t = p();
        this.j = CommonUtil.bg();
        this.r = Build.VERSION.SDK_INT >= 31;
        this.m = CommonUtil.bz();
        c(z3);
    }

    public boolean a() {
        return this.k;
    }

    public void e(boolean z) {
        this.k = z;
    }

    public boolean b() {
        return this.n;
    }

    public void a(boolean z) {
        this.n = z;
    }

    private Notification c(RemoteViews remoteViews) {
        Notification.Builder builderC = lsb.d().c();
        lsb.d().c(builderC);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification).setWhen(System.currentTimeMillis()).setContentIntent(h()).setOngoing(true);
        if (qrs.u()) {
            builderC.setCustomBigContentView(remoteViews);
        } else {
            builderC.setContent(remoteViews);
        }
        if (this.i && !a()) {
            builderC.setCategory("service");
        } else {
            builderC.setShowWhen(false).setPriority(0);
            builderC.setGroup("Track_HealthSportingNotificationHelper");
        }
        return builderC.build();
    }

    @Override // com.huawei.healthcloud.plugintrack.manager.inteface.ISportDataFragmentListener
    public void updateSportViewFragment(Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        messageObtain.obj = bundle;
        this.g.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bundle bundle) {
        if (f10495c == null) {
            LogUtil.j("Track_HealthSportingNotificationHelper", "updateHealthNotification sBundle is null");
            return;
        }
        if (this.e == null) {
            LogUtil.j("Track_HealthSportingNotificationHelper", "updateHealthNotification mContext is null");
            return;
        }
        if (bundle == null) {
            LogUtil.e("Track_HealthSportingNotificationHelper", "updateHealthNotification(), sportData == null");
            return;
        }
        String string = bundle.getString("duration");
        String string2 = bundle.getString("distance");
        Resources resources = this.e.getResources();
        if (!this.j || this.s || t()) {
            a(bundle, string, string2, resources);
        }
        if (this.t) {
            if (HwFoldScreenManagerEx.getDisplayMode() == 3) {
                a(string, string2, resources);
                if (this.m) {
                    a(bundle, string, string2, resources);
                }
            }
            if (this.y == null) {
                this.y = new HwScreenFoldDisplayMode(this.d);
                HwFoldScreenManagerEx.registerFoldDisplayMode(this.y);
            }
        }
    }

    private boolean t() {
        return !BaseApplication.isRunningForeground() && EnvironmentInfo.n();
    }

    private void a(Bundle bundle, String str, String str2, Resources resources) {
        String string = bundle.getString("speed");
        String string2 = bundle.getString("pace");
        String string3 = bundle.getString("calorie");
        String string4 = bundle.getString(IndoorEquipManagerApi.KEY_HEART_RATE);
        LogUtil.a("Track_HealthSportingNotificationHelper", "updateHealthNotification(), totalTime = ", str, ", totalDistance = ", str2, ", speed = ", string, ", pace = ", string2, ", calorie = ", string3, ", heartRate = ", string4);
        if (EnvironmentInfo.n() || CommonUtil.bm()) {
            int i = this.x;
            if (i == 283) {
                d(d(bundle), a(str, string3, string4, bundle));
                return;
            }
            if (i == 265 && b()) {
                d(b(string3), e(str, string4));
                return;
            }
            int i2 = this.x;
            if (i2 == 257 || i2 == 258 || i2 == 264 || i2 == 259) {
                int i3 = bundle.getInt(WorkoutRecord.Extend.COURSE_TARGET_TYPE, -2);
                c(bundle, i3, string3, str2, str, e(str2, str, string3, i3), c(str2, str, string3, string4, string, string2, i3));
                return;
            } else {
                d(g(str2), b(str, string3, string4, string, string2));
                return;
            }
        }
        RemoteViews remoteViewsM = m();
        remoteViewsM.setImageViewResource(R.id.icon, R.drawable.healthlogo_ic_notification);
        remoteViewsM.setTextViewText(R.id.app_name_text, AppInfoUtils.a());
        if (this.x == 265 && this.n) {
            d(str, string3, remoteViewsM);
            a(string4, remoteViewsM);
        } else {
            a(str, str2, remoteViewsM);
            b(string, string2, remoteViewsM, resources);
            b(remoteViewsM, resources, bundle);
            a(remoteViewsM, resources, bundle);
            c(string3, string4, remoteViewsM);
        }
        b(remoteViewsM);
        try {
            lsb.d().c(10012, c(remoteViewsM));
        } catch (SecurityException e2) {
            LogUtil.e("Track_HealthSportingNotificationHelper", "updateNotification exception ", LogAnonymous.b(e2));
        }
    }

    private void a(String str, RemoteViews remoteViews) {
        String string;
        Resources resources = this.e.getResources();
        String string2 = null;
        try {
            string = l(str) ? a(str, 1, 0) : null;
            try {
                string2 = resources.getString(R.string.IDS_main_watch_heart_rate_unit_string);
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_HealthSportingNotificationHelper", "setSecondHeartRate(), NumberFormatException");
            }
        } catch (NumberFormatException unused2) {
            string = null;
        }
        if (TextUtils.isEmpty(string)) {
            string = resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        remoteViews.setTextViewText(s() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, string);
        remoteViews.setTextViewText(s() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, string2);
    }

    private void d(String str, String str2, RemoteViews remoteViews) {
        remoteViews.setTextViewText(R.id.text_distance, a(str2, 1, 0));
        remoteViews.setTextViewText(R.id.text_distance_unit, this.e.getResources().getString(R.string.IDS_band_data_sport_energy_unit));
        remoteViews.setTextViewText(R.id.text_duration, str);
    }

    private void a(String str, String str2, RemoteViews remoteViews) {
        remoteViews.setTextViewText(R.id.text_distance, d(str2));
        remoteViews.setTextViewText(R.id.text_distance_unit, n());
        remoteViews.setTextViewText(R.id.text_duration, str);
    }

    private void d(String str, String str2) {
        LogUtil.a("Track_HealthSportingNotificationHelper", "buildLiveNotification title：", str, ",content:", str2);
        Notification.Builder builderC = lsb.d().c();
        lsb.d().c(builderC);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification).setWhen(System.currentTimeMillis()).setContentTitle(str).setContentText(str2).setContentIntent(h()).setOngoing(true);
        if (Build.VERSION.SDK_INT >= 31) {
            builderC.setForegroundServiceBehavior(1);
        }
        if (this.i && !a()) {
            builderC.setCategory("service");
        } else {
            builderC.setShowWhen(false).setPriority(0);
            builderC.setGroup("Track_HealthSportingNotificationHelper");
        }
        a(builderC);
        try {
            lsb.d().c(10012, builderC.build());
        } catch (SecurityException e2) {
            LogUtil.j("Track_HealthSportingNotificationHelper", "createCommonNotification SecurityException", LogAnonymous.b(e2));
        }
    }

    private void a(Notification.Builder builder) {
        Notification.Action actionI = i();
        if (actionI != null) {
            builder.addAction(actionI);
        }
        if (CommonUtil.bm()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("notification.live.operation", this.q);
        bundle.putString("notification.live.event", "Other");
        bundle.putInt("notification.live.type", 1);
        builder.addExtras(bundle);
        if (this.q == 0) {
            ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "create LiveNotification firstly");
        }
        this.q = 1;
    }

    private void c(Bundle bundle, int i, String str, String str2, String str3, String str4, String str5) {
        Notification.Builder builderC = lsb.d().c();
        lsb.d().c(builderC);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification).setWhen(System.currentTimeMillis()).setContentTitle(str4).setContentText(str5).setContentIntent(h()).setOngoing(true);
        if (Build.VERSION.SDK_INT >= 31) {
            builderC.setForegroundServiceBehavior(1);
        }
        if (this.i && !a()) {
            builderC.setCategory("service");
        } else {
            builderC.setShowWhen(false).setPriority(0);
            builderC.setGroup("Track_HealthSportingNotificationHelper");
        }
        if (EnvironmentInfo.n()) {
            a(bundle, i, str, str4, str5, str2, str3, builderC);
        }
        try {
            lsb.d().c(10012, builderC.build());
        } catch (SecurityException e2) {
            LogUtil.j("Track_HealthSportingNotificationHelper", "buildLiveNotificationNew SecurityException", LogAnonymous.b(e2));
        }
    }

    private void a(Bundle bundle, int i, String str, String str2, String str3, String str4, String str5, Notification.Builder builder) {
        float f = bundle.getFloat(WorkoutRecord.Extend.COURSE_TARGET_VALUE, -1.0f);
        float f2 = bundle.getFloat("progreeRate", 0.0f);
        int iB = b(f, f2);
        LogUtil.a("Track_HealthSportingNotificationHelper", "buildLiveNotificationNew title：", str2, ",content:", str3, ",totalDistance:", str4, ",totalTime:", str5, ",targetValue:", Float.valueOf(f), ",targetType:", Integer.valueOf(i), ",progressRate:", Float.valueOf(f2), ",progress:", Integer.valueOf(iB));
        Notification.Action actionI = i();
        if (actionI != null) {
            builder.addAction(actionI);
        }
        Bundle bundleB = b(str2, str3, f);
        Bundle bundleB2 = b(iB);
        bundleB.putBundle("notification.live.capsule", c(str, str4, str5, i));
        bundleB.putBundle("notification.live.feature", bundleB2);
        builder.addExtras(bundleB);
        if (this.q == 0) {
            ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "create LiveNotification firstly");
        }
        this.q = 1;
    }

    private Bundle c(String str, String str2, String str3, int i) {
        int i2;
        Bundle bundle = new Bundle();
        bundle.putInt("notification.live.capsuleStatus", 1);
        bundle.putInt("notification.live.capsuleType", 1);
        int i3 = this.x;
        if (i3 == 257) {
            i2 = R.drawable.track_notify_capsule_walk;
        } else if (i3 == 259) {
            i2 = R.drawable.track_notify_capsule_ride;
        } else {
            i2 = R.drawable.track_notify_capsule_run;
        }
        bundle.putParcelable("notification.live.capsuleIcon", Icon.createWithResource(this.e, i2));
        bundle.putInt("notification.live.capsuleBgColor", qre.e(R.color.color_fb6522));
        if (i == 1) {
            str3 = d(str2);
        } else if (i != 0) {
            if (i == 2) {
                str3 = a(str, 1, 0);
            } else {
                str3 = d(str2);
            }
        }
        if (k() == 2) {
            bundle.putString("notification.live.capsuleTitle", qre.f(R.string.IDS_motiontrack_capsule_stop));
            bundle.putString("notification.live.capsuleContent", str3);
            return bundle;
        }
        bundle.putString("notification.live.capsuleTitle", str3);
        return bundle;
    }

    private Bundle b(int i) {
        int i2;
        Bundle bundle = new Bundle();
        bundle.putInt("notification.live.feature.progressType", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Icon.createWithResource(this.e, R.drawable.track_notify_start));
        arrayList.add(Icon.createWithResource(this.e, R.drawable.track_notify_end));
        bundle.putParcelableArrayList("notification.live.feature.nodeIcon", new ArrayList<>(arrayList));
        int i3 = this.x;
        if (i3 == 257) {
            i2 = R.drawable.track_notify_walk;
        } else if (i3 == 259) {
            i2 = R.drawable.track_notify_ride;
        } else {
            i2 = R.drawable.track_notify_run;
        }
        bundle.putParcelable("notification.live.feature.indicatorIcon", Icon.createWithBitmap(qqf.a(qre.c(i2))));
        bundle.putInt("notification.live.feature.indicatorType", 1);
        bundle.putInt("notification.live.feature.progress", i);
        bundle.putInt("notification.live.feature.progressColor", qre.e(R.color.emui_subtab_text_on));
        bundle.putInt("notification.live.feature.progressBgColor", qre.e(R.color.three_circle_empty_color));
        return bundle;
    }

    private Bundle b(String str, String str2, float f) {
        Bundle bundle = new Bundle();
        bundle.putInt("notification.live.operation", this.q);
        bundle.putString("notification.live.event", "WORKOUT");
        if (f <= 0.0f) {
            bundle.putInt("notification.live.type", 1);
        } else {
            bundle.putInt("notification.live.type", 3);
        }
        bundle.putCharSequence("notification.live.titleOverlay", str);
        bundle.putCharSequence("notification.live.contentOverlay", str2);
        return bundle;
    }

    private Notification.Action i() {
        String strF;
        if (iwy.a(jbg.a()).p() == 1 || (this.i && !a())) {
            LogUtil.a("Track_HealthSportingNotificationHelper", "mIsFromSportService", Boolean.valueOf(this.i));
            return null;
        }
        LogUtil.a("Track_HealthSportingNotificationHelper", "setSportControlButton, getSportState == ", Integer.valueOf(k()));
        int i = R.drawable.track_ic_health_sporting_pause_normal_notice;
        int iK = k();
        if (iK == 1) {
            i = R.drawable.track_ic_health_sporting_pause_normal_notice;
            strF = qre.f(R.string.IDS_motiontrack_offlinemap_download_pause);
        } else if (iK != 2) {
            strF = "";
        } else {
            if (LanguageUtil.ba(this.e)) {
                i = R.drawable.track_ic_health_sporting_play_normal_rtl;
            } else {
                i = R.drawable.track_ic_health_sporting_play_normal;
            }
            strF = qre.f(R.string.IDS_motiontrack_show_sport_dialog_continue);
        }
        PendingIntent pendingIntentO = o();
        if (CommonUtil.bm()) {
            return new Notification.Action.Builder((Icon) null, strF, pendingIntentO).build();
        }
        return new Notification.Action(i, strF, pendingIntentO);
    }

    private PendingIntent o() {
        Intent intent = new Intent("com.huawei.health.NOTIFICATION_PAUSE_OR_RESUME_SPORT");
        intent.setPackage(this.e.getPackageName());
        return PendingIntent.getBroadcast(this.e, 0, intent, 201326592);
    }

    private String h(String str) {
        return qre.a(R.string.IDS_track_notify_two, jaa.d(this.e, this.x), str);
    }

    private String g(String str) {
        return h(c(str));
    }

    private String e(String str, String str2, String str3, int i) {
        if (i == 1) {
            return h(c(str));
        }
        if (i == 0) {
            return h(str2);
        }
        if (i == 2) {
            return b(str3);
        }
        return h(c(str));
    }

    private String c(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        if (i == 1) {
            return e(str2, str3, str4, str5, str6);
        }
        if (i == 0) {
            return c(str, str3, str4, str5, str6);
        }
        if (i == 2) {
            return c(str, str2);
        }
        return e(str2, str3, str4, str5, str6);
    }

    private String e(String str, String str2, String str3, String str4, String str5) {
        String strB = b(str2, str3);
        String strA = a(str4, str5);
        if (TextUtils.isEmpty(strA) || strA.contains("--")) {
            return this.e.getResources().getString(R.string.IDS_track_notify_line_two, str, strB);
        }
        return this.e.getResources().getString(R.string.IDS_track_notify_line_three, str, strA, strB);
    }

    private String c(String str, String str2, String str3, String str4, String str5) {
        String strB = b(str2, str3);
        String strA = a(str4, str5);
        if (TextUtils.isEmpty(strA) || strA.contains("--")) {
            return this.e.getResources().getString(R.string.IDS_track_notify_line_two, c(str), strB);
        }
        return this.e.getResources().getString(R.string.IDS_track_notify_line_three, c(str), strA, strB);
    }

    private String c(String str, String str2) {
        return this.e.getResources().getString(R.string.IDS_track_notify_line_two, c(str), str2);
    }

    private String b(String str) {
        return h(a(str));
    }

    private String d(Bundle bundle) {
        String string = bundle.getString("skippingNum");
        int iJ = string != null ? CommonUtil.j(string) : 0;
        return h(this.e.getResources().getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, iJ, UnitUtil.e(iJ, 1, 0)));
    }

    private String b(String str, String str2, String str3, String str4, String str5) {
        String strB = b(str2, str3);
        String strA = a(str4, str5);
        if (TextUtils.isEmpty(strA)) {
            return this.e.getResources().getString(R.string.IDS_track_notify_line_two, str, strB);
        }
        return this.e.getResources().getString(R.string.IDS_track_notify_line_three, str, strA, strB);
    }

    private String e(String str, String str2) {
        return this.e.getResources().getString(R.string.IDS_track_notify_line_two, str, e(str2));
    }

    private String a(String str, String str2, String str3, Bundle bundle) {
        String str4;
        String strB = b(str2, str3);
        String string = bundle.getString("skippingSpeed");
        if (string == null || string.isEmpty() || this.f.equals(string)) {
            str4 = this.f;
        } else {
            str4 = UnitUtil.e(CommonUtil.j(string), 1, 0) + this.e.getResources().getString(R.string.IDS_indoor_skipper_number_minute);
        }
        return this.e.getResources().getString(R.string.IDS_track_notify_line_three, str, str4, strB);
    }

    private String c(String str) {
        return d(str) + n();
    }

    private String n() {
        if (UnitUtil.f()) {
            return this.e.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_mi);
        }
        return this.e.getResources().getString(R.string.IDS_motiontrack_show_sport_unit_km);
    }

    private String d(String str) {
        return UnitUtil.e(o(str) / 1000.0d, 1, 2);
    }

    private String a(String str) {
        String str2;
        String strA;
        Resources resources = this.e.getResources();
        String string = null;
        try {
            if (TextUtils.isEmpty(str)) {
                strA = resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
            } else {
                strA = a(str, 1, 0);
            }
            try {
                string = resources.getString(R.string.IDS_band_data_sport_energy_unit);
                return strA + string;
            } catch (NumberFormatException unused) {
                String str3 = string;
                string = strA;
                str2 = str3;
                LogUtil.e("Track_HealthSportingNotificationHelper", "getCalorieText(), NumberFormatException");
                return string + str2;
            }
        } catch (NumberFormatException unused2) {
            str2 = null;
        }
    }

    private String e(String str) {
        String string;
        Resources resources = this.e.getResources();
        String string2 = null;
        try {
            if (l(str)) {
                string = a(str, 1, 0);
            } else {
                string = TextUtils.isEmpty(null) ? resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol) : null;
            }
            try {
                string2 = resources.getString(R.string.IDS_main_watch_heart_rate_unit_string);
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_HealthSportingNotificationHelper", "getHeartRateText(), NumberFormatException");
            }
        } catch (NumberFormatException unused2) {
            string = null;
        }
        return string + string2;
    }

    private String b(String str, String str2) {
        String string;
        Resources resources = this.e.getResources();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            return resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol) + resources.getString(R.string.IDS_band_data_sport_energy_unit);
        }
        String str3 = null;
        try {
            try {
                if (l(str2)) {
                    str = a(str2, 1, 0);
                    string = resources.getString(R.string.IDS_main_watch_heart_rate_unit_string);
                } else {
                    str = a(str, 1, 0);
                    string = resources.getString(R.string.IDS_band_data_sport_energy_unit);
                }
                str3 = string;
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_HealthSportingNotificationHelper", "setCalorieOrHeartRate(), NumberFormatException");
            }
        } catch (NumberFormatException unused2) {
            str = null;
        }
        return str + str3;
    }

    private String a(String str, String str2) {
        String strF;
        String strC;
        Resources resources = this.e.getResources();
        int i = this.x;
        if (i == 259 || i == 265 || i == 273 || (i == 264 && this.i && !this.n)) {
            strF = f(str);
            strC = c(resources);
        } else if (i == 274) {
            strF = i(str2);
            strC = a(resources);
        } else if (i == 283) {
            strF = "";
            strC = strF;
        } else {
            strF = j(str2);
            strC = "";
        }
        return strF + strC;
    }

    private String j(String str) {
        if (this.f.equals(str)) {
            return this.f;
        }
        return izn.a(k(str));
    }

    private String a(Resources resources) {
        if (UnitUtil.f()) {
            return ("/" + UnitUtil.e(100.0d, 1, 0)) + resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_unit_yd, 100);
        }
        return ("/" + UnitUtil.e(500.0d, 1, 0)) + resources.getString(R.string.IDS_fitness_data_list_activity_meter_unit);
    }

    private String i(String str) {
        if (this.f.equals(str)) {
            return this.f;
        }
        float fK = k(str);
        if (UnitUtil.f()) {
            fK = ((float) UnitUtil.c(fK, 2)) / 5.0f;
        }
        return izn.a(fK);
    }

    private String c(Resources resources) {
        if (UnitUtil.f()) {
            return resources.getString(R.string.IDS_motiontrack_show_detail_average_speed_imp);
        }
        return resources.getString(R.string.IDS_motiontrack_show_detail_average_speed);
    }

    private String f(String str) {
        if (str == null || str.isEmpty() || this.f.equals(str)) {
            return this.f;
        }
        if (b()) {
            return a(str, 1, 2);
        }
        return a(str, 1, 1);
    }

    private void a(String str, String str2, Resources resources) {
        int i;
        if (EnvironmentInfo.g()) {
            if (this.m) {
                i = R.layout.sport_data_sub_screen_notification_square;
            } else {
                i = R.layout.sport_data_sub_screen_notification_new;
            }
        } else {
            i = R.layout.sport_data_sub_screen_notification;
        }
        RemoteViews remoteViews = new RemoteViews(this.e.getPackageName(), i);
        remoteViews.setImageViewResource(R.id.iv_icon, R.drawable.healthlogo_share);
        a(str, str2, remoteViews);
        b(remoteViews);
        Notification.Builder builderC = lsb.d().c();
        lsb.d().c(builderC);
        Bundle bundle = new Bundle();
        bundle.putString("notification_remote_flag", "ongoing_remote");
        bundle.putParcelable("notification_remote_value", remoteViews);
        builderC.setExtras(bundle).setWhen(System.currentTimeMillis()).setSmallIcon(R.drawable.healthlogo_share).setOngoing(true).setSound(null).setVibrate(null).setPriority(0);
        builderC.setTimeoutAfter(5000L);
        Notification notificationBuild = builderC.build();
        notificationBuild.flags |= 64;
        lsb.d().c(10012, notificationBuild);
        if (this.l) {
            return;
        }
        this.l = true;
        LogUtil.a("Track_HealthSportingNotificationHelper", "setSubScreenNotification = ", notificationBuild.extras.toString());
        r(AnalyticsValue.HEALTH_SPORT_SHOW_SUB_SCREEN_2170020.value());
    }

    private void r(String str) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    private boolean p() {
        if (w()) {
            return Utils.b(BaseApplication.getContext(), "com.huawei.watch.home");
        }
        return false;
    }

    private boolean w() {
        int i;
        int i2 = this.x;
        if (i2 == 257 || i2 == 258 || i2 == 259) {
            return true;
        }
        return (i2 == 265 && !b()) || (i = this.x) == 273 || i == 264 || i == 274 || i == 275 || i == 280 || i == 281 || i == 282 || i == 260;
    }

    private void b(RemoteViews remoteViews, Resources resources, Bundle bundle) {
        if (this.x == 283) {
            String string = bundle.getString("skippingNum");
            int iJ = string != null ? CommonUtil.j(string) : 0;
            remoteViews.setTextViewText(R.id.text_distance_unit, resources.getQuantityString(R.plurals.IDS_indoor_skipper_number_unit_value, iJ, ""));
            remoteViews.setTextViewText(R.id.text_distance, UnitUtil.e(iJ, 1, 0));
            String string2 = bundle.getString("skippingSpeed");
            if (string2 == null || string2.isEmpty() || this.f.equals(string2)) {
                remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, this.f);
            } else {
                remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, UnitUtil.e(CommonUtil.j(string2), 1, 0));
            }
            remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, resources.getString(R.string.IDS_indoor_skipper_number_minute));
        }
    }

    private void a(RemoteViews remoteViews, Resources resources, Bundle bundle) {
        if (bundle.getBoolean("rowerStrength")) {
            int i = bundle.getInt("rowerTimes");
            remoteViews.setTextViewText(R.id.text_distance_unit, resources.getQuantityString(R.plurals.IDS_hwh_motiontrack_swim_stroke, i, ""));
            remoteViews.setTextViewText(R.id.text_distance, UnitUtil.e(i, 1, 0));
            int iRound = bundle.getInt("rowerWeight");
            if (UnitUtil.f()) {
                iRound = (int) Math.round(UnitUtil.h(iRound));
            }
            remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, UnitUtil.e(iRound, 1, 0));
            remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, UnitUtil.f() ? resources.getQuantityString(R.plurals.IDS_lb_string, iRound, "") : resources.getQuantityString(R.plurals.IDS_rowing_machine_kg, iRound, ""));
        }
    }

    private void c(String str, String str2, RemoteViews remoteViews) {
        String string;
        if (!CommonUtil.cq() && !CommonUtil.bd()) {
            LogUtil.a("Track_HealthSportingNotificationHelper", "setCalorieOrHeartRate(), EMUI version < 10.0");
            return;
        }
        Resources resources = this.e.getResources();
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            String string2 = resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
            String string3 = resources.getString(R.string.IDS_band_data_sport_energy_unit);
            remoteViews.setTextViewText(s() ? R.id.text_calorie_or_heart_rate_2 : R.id.text_calorie_or_heart_rate, string2);
            remoteViews.setTextViewText(s() ? R.id.text_calorie_or_heart_rate_unit_2 : R.id.text_calorie_or_heart_rate_unit, string3);
            return;
        }
        String str3 = null;
        try {
            try {
                if (l(str2)) {
                    str = a(str2, 1, 0);
                    string = resources.getString(R.string.IDS_main_watch_heart_rate_unit_string);
                } else {
                    str = a(str, 1, 0);
                    string = resources.getString(R.string.IDS_band_data_sport_energy_unit);
                }
                str3 = string;
            } catch (NumberFormatException unused) {
                LogUtil.e("Track_HealthSportingNotificationHelper", "setCalorieOrHeartRate(), NumberFormatException");
            }
        } catch (NumberFormatException unused2) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            str = resources.getString(R.string.IDS_hw_health_show_healthdata_nodata_symbol);
        }
        remoteViews.setTextViewText(s() ? R.id.text_calorie_or_heart_rate_2 : R.id.text_calorie_or_heart_rate, str);
        remoteViews.setTextViewText(s() ? R.id.text_calorie_or_heart_rate_unit_2 : R.id.text_calorie_or_heart_rate_unit, str3);
    }

    private boolean s() {
        if (qrs.w()) {
            return true;
        }
        return this.r ? qrs.s() : r();
    }

    private boolean r() {
        if (qrs.w()) {
            return true;
        }
        return qrs.v();
    }

    private RemoteViews m() {
        boolean zBd = CommonUtil.bd();
        LogUtil.j("Track_HealthSportingNotificationHelper", "initRemoteViews getFontScale = ", Float.valueOf(qrs.i()));
        if (this.p || zBd) {
            return d(zBd);
        }
        return l();
    }

    private RemoteViews d(boolean z) {
        if (this.r) {
            RemoteViews remoteViews = new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_hm_30);
            a(remoteViews, qrs.s());
            return remoteViews;
        }
        if (CommonUtil.cq() || z) {
            RemoteViews remoteViews2 = new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_emui_10);
            a(remoteViews2, r());
            return remoteViews2;
        }
        return new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification);
    }

    private void a(RemoteViews remoteViews, boolean z) {
        if (z) {
            remoteViews.setViewVisibility(R.id.text_speed_or_pace, 8);
            remoteViews.setViewVisibility(R.id.text_speed_or_pace_unit, 8);
            remoteViews.setViewVisibility(R.id.layout_speed_or_pace, 0);
            remoteViews.setViewVisibility(R.id.text_calorie_or_heart_rate, 8);
            remoteViews.setViewVisibility(R.id.text_calorie_or_heart_rate_unit, 8);
            remoteViews.setViewVisibility(R.id.layout_calorie_or_heart_rate, 0);
        }
    }

    private void c(RemoteViews remoteViews, boolean z) {
        if (z) {
            remoteViews.setViewVisibility(R.id.layout_speed_or_pace, 0);
        }
    }

    private RemoteViews l() {
        if (Build.VERSION.SDK_INT >= this.f10497b && !BaseActivity.isMiui() && !BaseActivity.isSumsung()) {
            RemoteViews remoteViews = new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_hm_30);
            c(remoteViews, qrs.s());
            return remoteViews;
        }
        if (Build.VERSION.SDK_INT >= 31 && !BaseActivity.isMiui() && !BaseActivity.isSumsung()) {
            return new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_tar31);
        }
        if (CommonUtil.as() && !CommonUtil.au()) {
            return new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_lower_version_emui);
        }
        if (BaseActivity.isSumsung()) {
            RemoteViews remoteViews2 = new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_sumsung);
            a(remoteViews2);
            return remoteViews2;
        }
        return new RemoteViews(this.e.getPackageName(), R.layout.sport_data_notification_lower_version);
    }

    private void a(RemoteViews remoteViews) {
        if (qrs.d(1.31f)) {
            d(remoteViews);
            remoteViews.setTextViewTextSize(R.id.text_distance, 1, 24.0f);
            remoteViews.setTextViewTextSize(R.id.text_distance_unit, 1, 20.0f);
            remoteViews.setTextViewTextSize(R.id.text_duration, 1, 24.0f);
            remoteViews.setTextViewTextSize(R.id.text_speed_or_pace_2, 1, 24.0f);
            remoteViews.setTextViewTextSize(R.id.text_speed_or_pace_unit_2, 1, 20.0f);
        } else if (qrs.d(1.16f)) {
            d(remoteViews);
        }
        if (this.h) {
            remoteViews.setViewVisibility(R.id.icon, 8);
        } else {
            remoteViews.setViewPadding(R.id.margin_view_start, 96, 0, 0, 0);
        }
    }

    private void d(RemoteViews remoteViews) {
        if (this.h) {
            remoteViews.setViewVisibility(R.id.app_name_text, 8);
        }
        remoteViews.setViewVisibility(R.id.text_speed_or_pace_2, 0);
        remoteViews.setViewVisibility(R.id.text_speed_or_pace_unit_2, 0);
    }

    private void b(RemoteViews remoteViews) {
        if (remoteViews == null) {
            LogUtil.j("Track_HealthSportingNotificationHelper", "setSportControlButton, remoteViews == null");
            return;
        }
        if (iwy.a(jbg.a()).aq() || (this.i && !a())) {
            LogUtil.a("Track_HealthSportingNotificationHelper", "mIsFromSportService", Boolean.valueOf(this.i));
            remoteViews.setViewVisibility(R.id.sport_control_button, 8);
            return;
        }
        LogUtil.a("Track_HealthSportingNotificationHelper", "setSportControlButton, getSportState == ", Integer.valueOf(k()));
        int i = R.id.sport_control_button;
        int iK = k();
        if (iK == 1) {
            remoteViews.setImageViewResource(i, R.drawable.track_ic_health_sporting_pause_normal);
            remoteViews.setContentDescription(i, qre.f(R.string.IDS_motiontrack_offlinemap_download_pause));
        } else if (iK == 2) {
            if (LanguageUtil.ba(this.e)) {
                remoteViews.setImageViewResource(i, R.drawable.track_ic_health_sporting_play_normal_rtl);
            } else {
                remoteViews.setImageViewResource(i, R.drawable.track_ic_health_sporting_play_normal);
            }
            remoteViews.setContentDescription(i, qre.f(R.string.IDS_motiontrack_show_sport_dialog_continue));
        }
        remoteViews.setOnClickPendingIntent(i, o());
    }

    private void c(boolean z) {
        if (z && this.e != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.NOTIFICATION_PAUSE_OR_RESUME_SPORT");
            if (this.u == null) {
                this.u = new NotificationSportControlReceiver();
            }
            BroadcastManagerUtil.d(this.e, this.u, intentFilter, LocalBroadcast.f36595c, null);
        }
        Context context = this.e;
        if (context != null) {
            BroadcastManagerUtil.d(context, this.f10496a, new IntentFilter("com.android.systemui.statusbar.visible.change"), WebViewActivity.HW_SIGNATURE_OR_SYSTEM, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "unregisterSportControlReceiver enter");
        if (this.e != null && this.u != null) {
            ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "unregisterSportControlReceiver");
            this.e.unregisterReceiver(this.u);
            this.u = null;
        }
        if (this.e == null || this.f10496a == null) {
            return;
        }
        ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "unregisterCoverStateReceiver");
        this.e.unregisterReceiver(this.f10496a);
        this.f10496a = null;
        f10495c = null;
    }

    public class a implements HwScreenFoldDisplayMode.ScreenFoldDisplayModeListener {
        public a() {
        }

        @Override // com.huawei.healthcloud.plugintrack.notification.HwScreenFoldDisplayMode.ScreenFoldDisplayModeListener
        public void onScreenDisplayModeChange(int i) {
            if (i == 3) {
                if (ive.c().g() == 2) {
                    HealthSportingNotificationHelper.this.b(HealthSportingNotificationHelper.f10495c);
                }
            } else {
                HealthSportingNotificationHelper.this.l = false;
            }
            LogUtil.a("Track_HealthSportingNotificationHelper", "onScreenDisplayModeChange = ", Integer.valueOf(i));
        }
    }

    public class NotificationSportControlReceiver extends BroadcastReceiver {
        public NotificationSportControlReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("Track_HealthSportingNotificationHelper", "intent == null");
                return;
            }
            if (qrs.c(500)) {
                LogUtil.j("Track_HealthSportingNotificationHelper", "onClick too fast");
                return;
            }
            LogUtil.a("Track_HealthSportingNotificationHelper", "NotificationSportControlReceiver onReceive getSportState== ", Integer.valueOf(HealthSportingNotificationHelper.this.k()));
            if ("com.huawei.health.NOTIFICATION_PAUSE_OR_RESUME_SPORT".equals(intent.getAction())) {
                int iK = HealthSportingNotificationHelper.this.k();
                if (iK == 1) {
                    HealthSportingNotificationHelper.this.y();
                } else if (iK == 2) {
                    HealthSportingNotificationHelper.this.u();
                }
                if (HealthSportingNotificationHelper.f10495c == null) {
                    return;
                }
                Message messageObtain = Message.obtain();
                messageObtain.what = 1;
                messageObtain.obj = HealthSportingNotificationHelper.f10495c;
                HealthSportingNotificationHelper.this.g.sendMessage(messageObtain);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int k() {
        SportDataOutputApi sportDataOutputApi;
        if (this.i && (sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class)) != null) {
            return sportDataOutputApi.getStatus();
        }
        return ive.c().g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        SportLifecycle sportLifecycle;
        if (this.i && (sportLifecycle = (SportLifecycle) Services.d("SportService", SportLifecycle.class)) != null) {
            sportLifecycle.onPauseSport();
        } else {
            ive.c().v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        SportLifecycle sportLifecycle;
        if (this.i && (sportLifecycle = (SportLifecycle) Services.d("SportService", SportLifecycle.class)) != null) {
            sportLifecycle.onResumeSport();
        } else {
            ive.c().y();
        }
    }

    private void b(String str, String str2, RemoteViews remoteViews, Resources resources) {
        int i = this.x;
        if (i == 259 || i == 265 || i == 273 || (i == 264 && this.i && !this.n)) {
            b(str, remoteViews, resources);
            return;
        }
        if (i == 274) {
            c(str2, remoteViews, resources);
        } else if (i == 283) {
            remoteViews.setViewVisibility(r() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, 0);
        } else {
            b(str2, remoteViews);
        }
    }

    private void b(String str, RemoteViews remoteViews) {
        remoteViews.setTextViewText(s() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, j(str));
        remoteViews.setViewVisibility(s() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, 8);
    }

    private void c(String str, RemoteViews remoteViews, Resources resources) {
        remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, i(str));
        remoteViews.setTextViewText(r() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, a(resources));
    }

    private void b(String str, RemoteViews remoteViews, Resources resources) {
        remoteViews.setTextViewText(s() ? R.id.text_speed_or_pace_2 : R.id.text_speed_or_pace, f(str));
        remoteViews.setTextViewText(s() ? R.id.text_speed_or_pace_unit_2 : R.id.text_speed_or_pace_unit, c(resources));
    }

    private PendingIntent h() {
        SportLaunchParams sportLaunchParams;
        if (this.e == null) {
            this.e = BaseApplication.getContext();
        }
        Intent launchIntentForPackage = BaseApplication.getContext().getPackageManager().getLaunchIntentForPackage(BaseApplication.getAppPackage());
        if (launchIntentForPackage == null || launchIntentForPackage.getComponent() == null) {
            return PendingIntent.getActivity(this.e, 0, new Intent().setPackage(BaseApplication.getAppPackage()), 201326592);
        }
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        String launchActivity = (sportDataOutputApi == null || (sportLaunchParams = (SportLaunchParams) sportDataOutputApi.getParas(SportParamsType.SPORT_LAUNCH_PARAS)) == null) ? null : sportLaunchParams.getLaunchActivity();
        LogUtil.a("Track_HealthSportingNotificationHelper", "className = ", launchActivity);
        c(launchIntentForPackage, launchActivity);
        return PendingIntent.getActivity(this.e, 0, launchIntentForPackage, 201326592);
    }

    private boolean n(String str) {
        if (TextUtils.isEmpty(str)) {
            return this.e.getResources().getConfiguration().orientation == 2;
        }
        return "com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity".equals(str);
    }

    private void c(Intent intent, String str) {
        if (this.i && n(str)) {
            LogUtil.a("Track_HealthSportingNotificationHelper", "start IndoorEquipLandDisplayActivity");
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.indoorequip.activity.IndoorEquipLandDisplayActivity");
            intent.setFlags(268435456);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            if (ive.c().r()) {
                Bundle bundle = new Bundle();
                bundle.putInt("map_tracking_sport_type_sportting", iwy.a(jbg.a()).k());
                intent.putExtra("sportdataparams", bundle);
                intent.setClass(this.e, TrackMainMapActivity.class);
            } else {
                intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), intent.getComponent().getClassName()));
            }
        } else {
            intent.setComponent(new ComponentName(BaseApplication.getAppPackage(), str));
        }
        intent.setAction("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setFlags(268435456);
        intent.putExtra("mLaunchSource", 5);
    }

    private double o(String str) {
        if (!m(str)) {
            return 0.0d;
        }
        try {
            return Math.round(Float.parseFloat(str) * 1000.0f);
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_HealthSportingNotificationHelper", "parseTotalDistance ", e2.getMessage());
            return 0.0d;
        }
    }

    private int k(String str) {
        if (!m(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e2) {
            LogUtil.e("Track_HealthSportingNotificationHelper", "parsePace ", e2.getMessage());
            return 0;
        }
    }

    private boolean m(String str) {
        return (str == null || "".equals(str) || this.f.equals(str)) ? false : true;
    }

    public void e() {
        ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "closeNotification()");
        if (!HandlerExecutor.d()) {
            LogUtil.a("Track_HealthSportingNotificationHelper", "closeNotification() check is not ui thread");
            this.g.postAtFrontOfQueue(new Runnable() { // from class: com.huawei.healthcloud.plugintrack.notification.HealthSportingNotificationHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    HealthSportingNotificationHelper.this.q();
                }
            });
        } else {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        LogUtil.a("Track_HealthSportingNotificationHelper", "handleCloseNotification()");
        if (this.y != null) {
            HwFoldScreenManagerEx.unregisterFoldDisplayMode(this.y);
            this.y = null;
        }
        this.o = false;
        f();
    }

    private void f() {
        if (this.e != null) {
            c();
            this.g.removeMessages(1);
            v();
        }
    }

    public static void c() {
        try {
            lsb.d().e(10012);
            ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "cancel NOTIFICATION_ID");
        } catch (IllegalStateException e2) {
            LogUtil.e("Track_HealthSportingNotificationHelper", "deleteHealthNotification() Exception", e2.getMessage());
        }
    }

    public void g() {
        b(f10495c);
    }

    private String a(String str, int i, int i2) {
        return "--".equals(str) ? str : UnitUtil.e(CommonUtil.a(str), i, i2);
    }

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return Integer.parseInt(str) > 0;
        } catch (NumberFormatException unused) {
            LogUtil.e("Track_HealthSportingNotificationHelper", "isValidHeartRate(), NumberFormatException");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: jca
            @Override // java.lang.Runnable
            public final void run() {
                this.f38367c.x();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        if (!EnvironmentInfo.n() || lsb.b(10012)) {
            return;
        }
        this.q = 0;
        ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "create mLiveOperation: ", 0);
    }

    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.e("Track_HealthSportingNotificationHelper", "context == null || intent == null");
                return;
            }
            LogUtil.a("Track_HealthSportingNotificationHelper", "CoverStateBroadcastReceiver received, action = ", intent.getAction());
            if ("com.android.systemui.statusbar.visible.change".equals(intent.getAction())) {
                try {
                    String stringExtra = intent.getStringExtra("visible");
                    ReleaseLogUtil.d("Track_HealthSportingNotificationHelper", "CoverStateBroadcastReceiver visible = ", stringExtra);
                    HealthSportingNotificationHelper.this.s = "true".equals(stringExtra);
                    if (nty.a()) {
                        HealthSportingNotificationHelper.this.v();
                    } else if (HealthSportingNotificationHelper.this.s) {
                        HealthSportingNotificationHelper.this.j();
                        HealthSportingNotificationHelper.this.g();
                    }
                } catch (BadParcelableException e) {
                    LogUtil.e("Track_HealthSportingNotificationHelper", "BadParcelableException getBooleanExtra:", LogAnonymous.b(e));
                }
            }
        }
    }
}
