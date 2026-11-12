package com.mi.health.exercise.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.router.business.IntentHelper;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.lifecycle.LiveDataHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SafeDBUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.ezi;
import defpackage.gfo;
import defpackage.lyi;
import defpackage.pqi;
import defpackage.tti;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class StepHorizontalWidgetProvider extends HealthBaseAppWidgetProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BroadcastReceiver f10005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LiveData<Map<HomeDataType, Object>> f10006b;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AppWidgetManager f10007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f10008b;

        public a(AppWidgetManager appWidgetManager, int[] iArr) {
            this.f10007a = appWidgetManager;
            this.f10008b = iArr;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            AppWidgetManager appWidgetManager;
            int[] iArr;
            Logger.i("StepRemoteWidgetProvider", "recent_data_changed_broadcast onchange");
            if (context == null || (appWidgetManager = this.f10007a) == null || (iArr = this.f10008b) == null || iArr.length <= 0) {
                return;
            }
            StepHorizontalWidgetProvider.this.j(context, appWidgetManager, iArr, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00fc  */
    public final Map<String, Object> f(final Context context, final AppWidgetManager appWidgetManager, final int[] iArr) {
        UserProfile userProfile;
        Intent intent;
        int steps;
        ArrayMap arrayMap = new ArrayMap();
        try {
            userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        } catch (Exception e) {
            Logger.e("StepRemoteWidgetProvider", "fetchData userProfile exception", e);
            userProfile = null;
        }
        if (userProfile == null) {
            arrayMap.put("grant", Boolean.FALSE);
            arrayMap.put("intent", new Intent(com.mi.health.a.f9964a));
            arrayMap.put(FitnessPersistKey.Rainbow, 6000);
            arrayMap.put("steps", 0);
            return arrayMap;
        }
        final int goalValue = GoalHelper.INSTANCE.getGoalValue(1, userProfile.getRegularGoalList());
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = !TextUtils.isEmpty(RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion());
        Logger.i("StepRemoteWidgetProvider", "privacyEnable:" + privacy_agree + "-regionEnable:" + z);
        boolean z2 = privacy_agree && z;
        if (z2) {
            final Intent routerIntentByAction = IntentHelper.INSTANCE.getRouterIntentByAction("steps");
            IHomeDataRepository homeDataRepository = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository();
            final Observer observer = new Observer() { // from class: leo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    this.f24981a.g(iArr, context, appWidgetManager, goalValue, routerIntentByAction, (Map) obj);
                }
            };
            if (this.f10006b != null) {
                ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: meo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f26083a.h(observer);
                    }
                });
            }
            HomeDataType homeDataType = HomeDataType.STEP;
            this.f10006b = homeDataRepository.getHomeDataWithTag(Collections.singletonList(homeDataType), "home");
            ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: neo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f27865a.i(observer);
                }
            });
            Map map = (Map) LiveDataHelper.INSTANCE.takeData(this.f10006b, 60, TimeUnit.SECONDS, null);
            if (map == null || !map.containsKey(homeDataType)) {
                steps = 0;
            } else {
                Object obj = map.get(homeDataType);
                if (obj instanceof DailyStepReport) {
                    steps = ((DailyStepReport) obj).getSteps();
                } else {
                    steps = 0;
                }
            }
            m(context, appWidgetManager, iArr);
            intent = routerIntentByAction;
        } else {
            intent = new Intent(com.mi.health.a.f9964a);
            steps = 0;
        }
        m(context, appWidgetManager, iArr);
        arrayMap.put("grant", Boolean.valueOf(z2));
        arrayMap.put("intent", intent);
        arrayMap.put(FitnessPersistKey.Rainbow, Integer.valueOf(goalValue));
        arrayMap.put("steps", Integer.valueOf(steps));
        return arrayMap;
    }

    public final /* synthetic */ void g(int[] iArr, Context context, AppWidgetManager appWidgetManager, int i, Intent intent, Map map) {
        if (map != null) {
            HomeDataType homeDataType = HomeDataType.STEP;
            if (map.containsKey(homeDataType)) {
                Object obj = map.get(homeDataType);
                if (obj instanceof DailyStepReport) {
                    DailyStepReport dailyStepReport = (DailyStepReport) obj;
                    Logger.i("StepRemoteWidgetProvider", "home stepLiveData observer result:" + dailyStepReport.getSteps());
                    for (int i2 : iArr) {
                        k(context, appWidgetManager, i2, i, dailyStepReport.getSteps(), true, intent);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void h(Observer observer) {
        this.f10006b.removeObserver(observer);
    }

    public final /* synthetic */ void i(Observer observer) {
        this.f10006b.observeForever(observer);
    }

    public final void k(Context context, AppWidgetManager appWidgetManager, int i, int i2, int i3, boolean z, Intent intent) {
        Logger.i("StepRemoteWidgetProvider", "onWidgetUIUpdate.. appWidgetId:" + i + "cursor data steps:" + i3 + "/goals:" + i2 + "/grant:" + z + "/intent:" + intent);
        gfo.c(context, System.currentTimeMillis());
        float fMax = i2 != 0 ? i3 / i2 : 0.0f;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), tti.n);
        Resources resources = context.getResources();
        Logger.i("StepRemoteWidgetProvider", "finishPercent:" + fMax);
        if (fMax <= 1.0f) {
            if (fMax > 0.0f) {
                fMax = Math.max(fMax, 0.05f);
            }
            remoteViews.setViewVisibility(pqi.p, 0);
            remoteViews.setViewVisibility(pqi.q, 8);
            remoteViews.setProgressBar(pqi.p, 100, (int) (fMax * 100.0f), false);
        } else {
            remoteViews.setViewVisibility(pqi.p, 8);
            remoteViews.setViewVisibility(pqi.q, 0);
            remoteViews.setProgressBar(pqi.q, 100, (int) ((fMax - 1.0f) * 100.0f), false);
        }
        remoteViews.setTextViewCompoundDrawables(pqi.w, 0, 0, 0, 0);
        remoteViews.setTextViewCompoundDrawables(pqi.E, 0, 0, 0, 0);
        remoteViews.setTextViewText(pqi.w, String.format("%s(%s)", resources.getString(ezi.D), resources.getQuantityString(lyi.c, i3)));
        if (z) {
            remoteViews.setTextViewText(pqi.E, String.valueOf(i3));
        } else {
            remoteViews.setTextViewText(pqi.E, "--");
        }
        remoteViews.setContentDescription(R.id.background, resources.getString(ezi.E, Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf((int) (fMax * 100.0f))));
        if (intent != null) {
            intent.setFlags(268468224);
            remoteViews.setOnClickPendingIntent(R.id.background, PendingIntentExtKt.buildWidgetPendingIntent(context, i, intent, 134217728));
        }
        long jB = gfo.b(context);
        Logger.i("StepRemoteWidgetProvider", "widget last update time : " + jB);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = jCurrentTimeMillis - jB <= TimeUnit.HOURS.toMillis(1L);
        Bundle bundle = new Bundle();
        bundle.putString("miuiWidgetEventCode", z2 ? "state1" : "state10");
        bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidgetOptions(i, bundle);
            appWidgetManager.updateAppWidget(i, remoteViews);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void j(final Context context, final AppWidgetManager appWidgetManager, final int[] iArr, final boolean z) {
        if (UIUtils.INSTANCE.isInMainThread()) {
            ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: keo
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23782a.j(context, appWidgetManager, iArr, z);
                }
            });
            return;
        }
        Logger.i("StepRemoteWidgetProvider", "onWidgetUpdate, ids" + Arrays.toString(iArr));
        Map<String, Object> mapF = f(context, appWidgetManager, iArr);
        if (mapF.size() < 4) {
            return;
        }
        int iIntValue = ((Integer) mapF.get("steps")).intValue();
        int iIntValue2 = ((Integer) mapF.get(FitnessPersistKey.Rainbow)).intValue();
        boolean zBooleanValue = ((Boolean) mapF.get("grant")).booleanValue();
        Intent intent = (Intent) mapF.get("intent");
        for (int i : iArr) {
            k(context, appWidgetManager, i, iIntValue2, iIntValue, zBooleanValue, intent);
        }
    }

    public final void m(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (this.f10005a == null) {
            this.f10005a = new a(appWidgetManager, iArr);
            SafeDBUtil.INSTANCE.safeRegisterBroadcastReceiver(context.getApplicationContext(), this.f10005a, new IntentFilter("recent_data_changed_broadcast"), 2);
        }
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
        Logger.i("StepRemoteWidgetProvider", "onDisabled");
        if (this.f10005a != null) {
            SafeDBUtil.INSTANCE.safeUnregisterBroadcastReceiver(context.getApplicationContext(), this.f10005a);
            this.f10005a = null;
        }
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        super.onEnabled(context);
        Logger.i("StepRemoteWidgetProvider", "onEnabled");
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger.i("StepRemoteWidgetProvider", "onReceive:" + intent);
        if (intent == null) {
            super.onReceive(context, intent);
        }
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        String action = intent.getAction();
        action.hashCode();
        switch (action) {
            case "com.mi.health.widget.action.UI_MODE_CHANGED":
            case "android.intent.action.TIMEZONE_CHANGED":
            case "android.intent.action.TIME_SET":
            case "android.intent.action.DATE_CHANGED":
            case "recent_data_changed_broadcast":
                onUpdate(context, appWidgetManager, null);
                break;
            case "miui.appwidget.action.APPWIDGET_UPDATE":
            case "android.appwidget.action.APPWIDGET_UPDATE":
                onUpdate(context, appWidgetManager, intent.getIntArrayExtra("appWidgetIds"));
                break;
            default:
                super.onReceive(context, intent);
                break;
        }
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider
    public void onRecentDataChanged(Context context) {
        super.onRecentDataChanged(context);
        Logger.d("StepRemoteWidgetProvider", "recent data changed!");
        onUpdate(context, AppWidgetManager.getInstance(context), null);
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        if (appWidgetManager == null) {
            Logger.i("StepRemoteWidgetProvider", "appWidgetManager is null");
            return;
        }
        if (iArr == null || iArr.length == 0) {
            iArr = appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) StepHorizontalWidgetProvider.class));
        }
        Logger.i("StepRemoteWidgetProvider", "onUpdate ids" + Arrays.toString(iArr));
        if (iArr != null || iArr.length > 0) {
            j(context, appWidgetManager, iArr, true);
        }
    }
}
