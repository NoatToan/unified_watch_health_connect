package com.huawei.health.ui.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.huawei.health.manager.DaemonService;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.ui.notification.manager.UiWidgetManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.plugindaemon.R;
import health.compact.a.NotificationUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class HealthSportWidget extends AppWidgetProvider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f10346c = false;
    private static AtomicBoolean e = new AtomicBoolean(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f10344a = new d();
    private static Bundle d = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f10345b = 0;

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        if (context != null) {
            if (!this.f10346c) {
                LogUtil.a("Step_HealthSportWid", "onUpdate():  start DaemonService");
                Intent intent = new Intent(context, (Class<?>) DaemonService.class);
                intent.setPackage(context.getPackageName());
                try {
                    context.startService(intent);
                } catch (IllegalStateException e2) {
                    LogUtil.e("Step_HealthSportWid", "healthSportWidget onUpdate", e2.getMessage());
                }
                this.f10346c = true;
            }
            b(context);
            synchronized (HealthSportWidget.class) {
                d(context, d);
            }
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        if (context != null) {
            super.onEnabled(context);
            LogUtil.a("Step_HealthSportWid", "onEnabled");
            Intent intent = new Intent("com.huawei.health.WIDGET_ENABLE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
        synchronized (HealthSportWidget.class) {
            d(context, d);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
        LogUtil.a("Step_HealthSportWid", "onDisabled");
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
            ReleaseLogUtil.e("Step_HealthSportWid", "intent or context is null");
            return;
        }
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action == null || !"android.intent.action.LOCALE_CHANGED".equals(action)) {
            return;
        }
        LogUtil.d("Step_HealthSportWid", "ACTION_LOCALE_CHANGED");
        a(context, true);
        b(context);
    }

    private static void a(Context context, boolean z) {
        d dVar;
        synchronized (d.class) {
            dVar = f10344a;
        }
        b(context, dVar, z);
    }

    private static void c(Context context, d dVar) {
        b(context, dVar, false);
    }

    public static void d(Context context, Bundle bundle) {
        synchronized (HealthSportWidget.class) {
            if (bundle != null && context != null) {
                d = bundle;
                if (UiWidgetManager.a(context)) {
                    LogUtil.a("Step_HealthSportWid", "Without Widget!");
                    Intent intent = new Intent("com.huawei.health.WIDGET_DISABLE");
                    intent.setPackage(context.getPackageName());
                    context.sendBroadcast(intent, Consts.d);
                } else {
                    b bVar = new b();
                    bVar.e = bundle.getInt("step", 0);
                    bVar.d = bundle.getInt("distance", 0);
                    bVar.f10348b = bundle.getInt("carior", 0) / 1000.0f;
                    bVar.f10347a = bundle.getInt("target");
                    bVar.f10349c = bundle.getInt("KEY_BG_COLOR_TYPE");
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    d(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) HealthSportWidget.class)), bVar, 1);
                }
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f10348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10349c;
        private int d;
        private int e;

        private b() {
            this.e = 0;
            this.d = 0;
        }
    }

    public static void b(Context context) {
        LogUtil.a("Step_HealthSportWid", "sendForceUpdateBroadcast");
        if (context != null) {
            Intent intent = new Intent("com.huawei.health.WIDGET_FORCE_UPDATE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
    }

    private static void d(Context context, AppWidgetManager appWidgetManager, int[] iArr, b bVar, int i) {
        if (bVar == null || appWidgetManager == null) {
            ReleaseLogUtil.a("Step_HealthSportWid", "definedData or appWidgetManager is null");
            return;
        }
        d dVarB = b(bVar);
        c(context, dVarB);
        RemoteViews remoteViewsA = a(context, dVarB);
        Intent intentD = d(context);
        intentD.putExtra("mLaunchSource", 13);
        remoteViewsA.setOnClickPendingIntent(R.id.widget_4x1_LinearLayout, PendingIntent.getActivity(context, 13, intentD, 67108864));
        appWidgetManager.updateAppWidget(iArr, remoteViewsA);
    }

    private static boolean a(int i, int i2) {
        return Integer.toString(i).length() == Integer.toString(i2).length();
    }

    private static void b(Context context, d dVar, boolean z) {
        boolean z2;
        if (context == null || dVar == null) {
            ReleaseLogUtil.a("Step_HealthSportWid", "context or widgetData is null");
            return;
        }
        synchronized (d.class) {
            if (a(f10344a.e, dVar.e) && a(f10344a.f10351b, dVar.f10351b) && a(f10344a.f10350a, dVar.f10350a)) {
                z2 = false;
            } else {
                f10344a.e = dVar.e;
                f10344a.f10351b = dVar.f10351b;
                f10344a.f10350a = dVar.f10350a;
                LogUtil.d("Step_HealthSportWid", "widgetData numbs changed");
                z2 = true;
            }
            if (z) {
                LogUtil.d("Step_HealthSportWid", "checkout language changed");
            }
        }
        if (!z && !z2) {
            return;
        }
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.hw_healthcloud_widget4x1, (ViewGroup) null);
        if (viewInflate.findViewById(R.id.widget4x1_steps) instanceof TextView) {
            ((TextView) viewInflate.findViewById(R.id.widget4x1_steps)).setText(NotificationUtil.d(context, dVar.e));
        }
        if (viewInflate.findViewById(R.id.widget4x1_stepGoal) instanceof TextView) {
            ((TextView) viewInflate.findViewById(R.id.widget4x1_stepGoal)).setText(NotificationUtil.c(context, dVar.f10351b));
        }
        if (viewInflate.findViewById(R.id.widget4x1_kcal) instanceof TextView) {
            ((TextView) viewInflate.findViewById(R.id.widget4x1_kcal)).setText(NotificationUtil.e(context, dVar.f10350a));
        }
        viewInflate.measure(-2, -2);
        if (viewInflate.getMeasuredWidth() <= b(context, 530.0f)) {
            e.set(true);
        } else {
            e.set(false);
        }
        LogUtil.d("Step_HealthSportWid", e);
    }

    private static RemoteViews a(Context context, d dVar) {
        RemoteViews remoteViews;
        if (dVar == null) {
            LogUtil.d("Step_HealthSportWid", "widgetData is null");
            return null;
        }
        if (context.getResources().getConfiguration().orientation != 1) {
            LogUtil.d("Step_HealthSportWid", "Orientation is not ORIENTATION_PORTRAIT");
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.hw_healthcloud_widget4x1);
        } else if (e.get()) {
            LogUtil.d("Step_HealthSportWid", "remoteViews is widget4x1");
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.hw_healthcloud_widget4x1);
        } else {
            LogUtil.d("Step_HealthSportWid", "remoteViews is widget4x1_adapter");
            remoteViews = new RemoteViews(context.getPackageName(), R.layout.hw_healthcloud_widget4x1_adapter);
        }
        remoteViews.setImageViewResource(R.id.split, dVar.f10352c);
        remoteViews.setTextColor(R.id.widget4x1_steps, dVar.d);
        remoteViews.setTextColor(R.id.widget4x1_steps_unit, dVar.d);
        remoteViews.setTextColor(R.id.widget4x1_stepGoal_prefix, dVar.d);
        remoteViews.setTextColor(R.id.widget4x1_stepGoal, dVar.d);
        remoteViews.setTextColor(R.id.widget4x1_kcal_prefix, dVar.d);
        remoteViews.setTextColor(R.id.widget4x1_kcal, dVar.d);
        remoteViews.setTextColor(R.id.widget4x1_kcal_unit, dVar.d);
        d(context, remoteViews, R.id.widget4x1_steps, dVar.e);
        c(context, remoteViews, R.id.widget4x1_stepGoal, dVar.f10351b);
        b(context, remoteViews, R.id.widget4x1_kcal, dVar.f10350a);
        return remoteViews;
    }

    private static int b(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f10350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f10351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10352c;
        private int d;
        private int e;

        private d() {
            this.e = 0;
            this.f10351b = 0;
            this.f10350a = 0;
        }
    }

    private static d b(b bVar) {
        int i;
        d dVar = new d();
        if (bVar == null) {
            ReleaseLogUtil.a("Step_HealthSportWid", "definedData is null");
            return dVar;
        }
        long jA = LogUtil.a(5000, f10345b);
        if (jA != -1) {
            ReleaseLogUtil.d("Step_HealthSportWid", " Enter GetWidgetData step: ", Integer.valueOf(bVar.e), " distance: ", Integer.valueOf(bVar.d));
            f10345b = jA;
        }
        if (bVar.f10349c != 1) {
            if (bVar.f10349c == 2) {
                dVar.f10352c = R.drawable.hw_widget_split_white;
            } else {
                LogUtil.d("Step_HealthSportWid", "this devices not support widget bg recognized");
                dVar.f10352c = R.drawable.hw_widget_split_white;
            }
            i = -1;
        } else {
            dVar.f10352c = R.drawable.hw_widget_split_black;
            i = -16777216;
        }
        dVar.d = i;
        if (bVar.e != -1) {
            dVar.e = bVar.e;
        }
        if (bVar.f10347a != -1) {
            if (bVar.f10347a == 0) {
                ReleaseLogUtil.e("Step_HealthSportWid", "Division by zero attempted!");
                return dVar;
            }
            c(bVar, dVar);
        }
        if (bVar.f10348b != -1.0f) {
            dVar.f10350a = Math.round(bVar.f10348b);
        }
        return dVar;
    }

    private static void c(b bVar, d dVar) {
        int iRound = (int) Math.round((((double) bVar.e) / ((double) bVar.f10347a)) * 100.0d);
        if (iRound == 100 && bVar.e < bVar.f10347a) {
            iRound = 99;
        } else if (iRound > 100) {
            iRound = 100;
        } else {
            LogUtil.d("Step_HealthSportWid", "completedGoal is no match");
        }
        LogUtil.d("Step_HealthSportWid", "mCompletedGoal : ", Integer.valueOf(iRound));
        dVar.f10351b = iRound;
    }

    private static Intent d(Context context) {
        Intent intent = new Intent();
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                ReleaseLogUtil.e("Step_HealthSportWid", "getLaunchIntentForPackage return null,set no action!!!");
                return intent;
            }
            intent.setComponent(new ComponentName(context.getPackageName(), launchIntentForPackage.getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            return intent;
        } catch (UnsupportedOperationException e2) {
            LogUtil.e("Step_HealthSportWid", "getHealthAPPIntent()", e2.getMessage());
            return intent;
        }
    }

    private static void d(Context context, RemoteViews remoteViews, int i, int i2) {
        if (remoteViews != null) {
            remoteViews.setTextViewText(i, NotificationUtil.d(context, i2));
        } else {
            LogUtil.e("Step_HealthSportWid", "There have a null remoteView ");
        }
    }

    private static void c(Context context, RemoteViews remoteViews, int i, int i2) {
        if (remoteViews != null) {
            remoteViews.setTextViewText(i, NotificationUtil.c(context, i2));
        } else {
            LogUtil.e("Step_HealthSportWid", "There have a null remoteView ");
        }
    }

    private static void b(Context context, RemoteViews remoteViews, int i, int i2) {
        if (remoteViews != null) {
            remoteViews.setTextViewText(i, NotificationUtil.e(context, i2));
        } else {
            LogUtil.e("Step_HealthSportWid", "There have a null remoteView ");
        }
    }
}
