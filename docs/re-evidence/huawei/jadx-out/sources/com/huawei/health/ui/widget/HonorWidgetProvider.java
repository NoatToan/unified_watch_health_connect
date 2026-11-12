package com.huawei.health.ui.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.ui.notification.manager.UiWidgetManager;
import com.huawei.health.ui.notification.utils.CircleProcessUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.NotificationUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes2.dex */
public class HonorWidgetProvider extends AppWidgetProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Bundle f10353b = new Bundle();
    private boolean d = false;
    private boolean e;

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        if (context != null) {
            LogUtil.a("Step_HonorWidProv", "onUpdate");
            if (!this.d) {
                LogUtil.a("Step_HonorWidProv", "onUpdate(): start DaemonService");
                Intent intent = new Intent(context, (Class<?>) DaemonService.class);
                intent.setPackage(context.getPackageName());
                try {
                    context.startService(intent);
                } catch (RuntimeException e) {
                    LogUtil.e("Step_HonorWidProv", "HonorWidgetProvider onUpdate", e.getMessage());
                }
                this.d = true;
            }
            e(context);
            synchronized (HonorWidgetProvider.class) {
                if (f10353b.getInt("step", 0) != 0 || !this.e) {
                    this.e = true;
                    d(context, f10353b);
                }
            }
        }
    }

    private static void d(Context context, AppWidgetManager appWidgetManager, int[] iArr, d dVar) {
        if (dVar == null || appWidgetManager == null) {
            LogUtil.j("Step_HonorWidProv", "onUpdate widgetRefreshData or appWidgetManager is null");
        } else {
            appWidgetManager.updateAppWidget(iArr, a(context, d(dVar)));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        if (context != null) {
            super.onEnabled(context);
            LogUtil.a("Step_HonorWidProv", "onEnabled");
            Intent intent = new Intent("com.huawei.health.WIDGET_ENABLE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
        synchronized (HonorWidgetProvider.class) {
            if (f10353b.getInt("step", 0) != 0 || !this.e) {
                this.e = true;
                d(context, f10353b);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
        LogUtil.a("Step_HonorWidProv", "onDisabled");
        if (context == null || !UiWidgetManager.a(context)) {
            return;
        }
        Intent intent = new Intent("com.huawei.health.WIDGET_DISABLE");
        intent.setPackage(context.getPackageName());
        context.sendBroadcast(intent, Consts.d);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            LogUtil.j("Step_HonorWidProv", "intent or context is null");
            return;
        }
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action == null || !"android.intent.action.LOCALE_CHANGED".equals(action)) {
            return;
        }
        LogUtil.a("Step_HonorWidProv", "ACTION_LOCALE_CHANGED");
        e(context);
    }

    public static void d(Context context, Bundle bundle) {
        synchronized (HonorWidgetProvider.class) {
            if (bundle != null && context != null) {
                f10353b = bundle;
                if (UiWidgetManager.a(context)) {
                    LogUtil.a("Step_HonorWidProv", "Without Widget!");
                    Intent intent = new Intent("com.huawei.health.WIDGET_DISABLE");
                    intent.setPackage(context.getPackageName());
                    context.sendBroadcast(intent, Consts.d);
                } else {
                    d dVar = new d();
                    dVar.d = bundle.getInt("step", 0);
                    dVar.f10357c = bundle.getInt("target", 0);
                    dVar.e = bundle.getInt("distance", 0) / 1000.0f;
                    dVar.f10356b = bundle.getInt("carior", 0) / 1000.0f;
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    d(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) HonorWidgetProvider.class)), dVar);
                }
            }
        }
    }

    public static void e(Context context) {
        LogUtil.a("Step_HonorWidProv", "sendForceUpdateBroadcast");
        if (context != null) {
            Intent intent = new Intent("com.huawei.health.WIDGET_FORCE_UPDATE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
    }

    private static RemoteViews a(Context context, c cVar) {
        RemoteViews remoteViews;
        int i;
        if (cVar == null) {
            LogUtil.a("Step_HonorWidProv", "getWidgetRemoteViews honorWidgetData is null");
            return null;
        }
        boolean z = false;
        PendingIntent activity = PendingIntent.getActivity(context, 0, c(context), 67108864);
        if (CommonUtil.bj()) {
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout_honor_widget_adapter);
        } else {
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.layout_honor_widget);
        }
        remoteViews.setOnClickPendingIntent(R.id.honor_widget_rl, activity);
        if (String.valueOf(cVar.f10355b).length() >= 4 && !LanguageUtil.o(context)) {
            z = true;
        }
        if (String.valueOf(cVar.f10355b).length() >= 5 || z) {
            remoteViews.setTextViewTextSize(R.id.widget2x2_steps, 1, 18.0f);
        }
        remoteViews.setTextViewText(R.id.widget2x2_steps, NotificationUtil.d(context, cVar.f10355b));
        remoteViews.setTextViewText(R.id.widget2x2_goal_progress, NotificationUtil.c(context, cVar.d));
        remoteViews.setTextViewText(R.id.widget2x2_calories, NotificationUtil.e(context, cVar.f10354a));
        boolean zD = UnitUtil.d();
        float fE = zD ? (float) UnitUtil.e(cVar.e, 3) : cVar.e;
        String strB = NotificationUtil.b(context, fE);
        if (zD) {
            i = R.plurals.IDS_plugindameon_widget_distance_mi_unit;
        } else {
            i = R.plurals.IDS_plugindameon_widget_distance_km_unit;
        }
        e(remoteViews, i, (int) fE, strB);
        remoteViews.setImageViewBitmap(R.id.widget2x2_goal_progress_iv, new CircleProcessUtil(context).c(cVar.d / 100.0f));
        LogUtil.a("Step_HonorWidProv", "getWidgetRemoteViews mCompletedGoal=  ", Float.valueOf(cVar.d / 100.0f));
        if (LanguageUtil.bo(context) && Build.VERSION.SDK_INT > 33) {
            remoteViews.setViewLayoutMargin(R.id.widget2x2_layout_middle, 1, 40.0f, 1);
            remoteViews.setViewLayoutMargin(R.id.widget2x2_layout_middle, 3, 0.0f, 1);
            remoteViews.setViewLayoutMargin(R.id.widget2x2_goal_progress, 3, 8.0f, 1);
            remoteViews.setViewLayoutMargin(R.id.widget2x2_layout_bottom, 3, 10.0f, 1);
            remoteViews.setViewLayoutMargin(R.id.widget2x2_calories, 3, 5.0f, 1);
            remoteViews.setTextViewTextSize(R.id.widget2x2_steps, 1, 22.0f);
        }
        return remoteViews;
    }

    private static void e(RemoteViews remoteViews, int i, int i2, String str) {
        LogUtil.a("Step_HonorWidProv", "setDistanceText() ");
        String quantityString = BaseApplication.getContext().getResources().getQuantityString(i, i2, str);
        int length = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(quantityString);
        if (!quantityString.substring(0, length).equals(str)) {
            length = spannableStringBuilder.length() - length;
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(BaseApplication.getContext().getColor(R.color.color_ffffff)), 0, length, 17);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(12, true), 0, length, 17);
        remoteViews.setTextViewText(R.id.widget2x2_distance, spannableStringBuilder);
    }

    private static c d(d dVar) {
        c cVar = new c();
        ReleaseLogUtil.d("Step_HonorWidProv", " Enter getWidgetData step: ", Integer.valueOf(dVar.d), " distance: ", Float.valueOf(dVar.e), " mStepGoal: ", Integer.valueOf(dVar.f10357c));
        if (dVar.d < 0) {
            ReleaseLogUtil.e("Step_HonorWidProv", "getWidgetData error widgetRefreshData.mStep = ", Integer.valueOf(dVar.d));
            return cVar;
        }
        cVar.f10355b = dVar.d;
        cVar.f10354a = Math.round(dVar.f10356b);
        cVar.e = dVar.e;
        if (dVar.f10357c <= 0) {
            ReleaseLogUtil.e("Step_HonorWidProv", "getWidgetData error mStepGoal = 0 ");
            return cVar;
        }
        int iRound = (int) Math.round((((double) dVar.d) / ((double) dVar.f10357c)) * 100.0d);
        if (iRound == 100 && dVar.d < dVar.f10357c) {
            iRound = 99;
        } else if (iRound > 100) {
            iRound = 100;
        } else {
            ReleaseLogUtil.d("Step_HonorWidProv", "getWidgetData mCompletedGoal : ", Integer.valueOf(iRound));
        }
        cVar.d = iRound;
        return cVar;
    }

    private static Intent c(Context context) {
        Intent intent = new Intent();
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                ReleaseLogUtil.e("Step_HonorWidProv", "getLaunchIntentForPackage return null,set no action!!!");
                return intent;
            }
            intent.setComponent(new ComponentName(context.getPackageName(), launchIntentForPackage.getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            SharedPreferenceManager.e(context, Integer.toString(10000), "honor_widget", "true", new StorageParams());
            return intent;
        } catch (UnsupportedOperationException e) {
            LogUtil.e("Step_HonorWidProv", "getHealthAPPIntent()", e.getMessage());
            return intent;
        }
    }

    static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10357c;
        private int d;
        private float e;

        private d() {
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10355b;
        private int d;
        private float e;

        private c() {
            this.f10355b = 0;
            this.d = 0;
            this.f10354a = 0;
            this.e = 0.0f;
        }
    }
}
