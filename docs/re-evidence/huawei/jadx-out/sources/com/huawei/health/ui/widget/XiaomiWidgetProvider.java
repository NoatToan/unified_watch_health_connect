package com.huawei.health.ui.widget;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.connectivity.thirdband.StepCounterStrategy;
import com.huawei.health.manager.util.Consts;
import com.huawei.health.ui.notification.manager.UiWidgetManager;
import com.huawei.health.ui.notification.utils.BarChartUtil;
import com.huawei.health.ui.notification.utils.XiaomiWidgetWorkManager;
import com.huawei.health.ui.widget.XiaomiWidgetProvider;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.services.codec.TypeToken;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.plugindaemon.R;
import defpackage.dlq;
import defpackage.lua;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.NotificationUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StepCounterSupportUtils;
import health.compact.a.UnitUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public class XiaomiWidgetProvider extends AppWidgetProvider {
    private static final String APPWIDGET_UPDATE = "android.appwidget.action.APPWIDGET_UPDATE";
    private static final String BOOT_COMPLETE = "android.intent.action.BOOT_COMPLETED";
    public static final String DAEMON_SERVICE_PROCESS = "com.huawei.health:DaemonService";
    private static final String DATE_KEY = "cur_date";
    private static final String DATE_MODULE_ID = "XiaomiWidgetProvider";
    private static final int DAYS_BACK = 6;
    private static final int DAYS_OF_STEPS = 7;
    private static final String HOME_TAB_NAME = "homeTabName";
    public static final String LAST_QUERY_KEY = "last_query_key";
    private static final String LAST_QUERY_MODULE_ID = "last_query_module_id";
    private static final String LAST_REFRESH_KEY = "last_refresh_key";
    private static final String LAST_REFRESH_MODULE_ID = "last_refresh_module_id";
    private static final String LAST_STEP_KEY = "last_step_key";
    private static final String LAST_STEP_MODULE_ID = "last_last_module_id";
    private static final String MAIN_PAGE = "com.huawei.health.MainActivity";
    public static final long MILLIS_OF_FIVE_MINUTES = 300000;
    private static final long MILLIS_OF_TWO_SECONDS = 2000;
    private static final String MIUI_APPWIDGET_UPDATE = "miui.appwidget.action.APPWIDGET_UPDATE";
    private static final String MODULE_ID = "xiaomi_step";
    private static final String PARAMETER_FROM = "from";
    private static final String STEP_KEY = "step_key";
    private static final String TAB_NAME = "SPORT";
    private static final String TAG = "Step_XiaomiWidgetProvider";
    public static final String WIDGET_PROVIDER_PROCESS = "com.huawei.health:widgetProvider";
    private static Bundle sLastRefreshData = new Bundle();

    @Override // android.appwidget.AppWidgetProvider
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        super.onUpdate(context, appWidgetManager, iArr);
        LogUtil.a(TAG, "onUpdate");
    }

    private static void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr, int i) throws Throwable {
        if (AuthorizationUtils.c(context) && !XiaomiWidgetWorkManager.a()) {
            XiaomiWidgetWorkManager.d(false);
        }
        appWidgetManager.updateAppWidget(iArr, getWidgetRemoteViews(context, i));
        ReleaseLogUtil.d(TAG, "widget refreshed");
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onEnabled(Context context) {
        if (context != null) {
            super.onEnabled(context);
            LogUtil.a(TAG, "onEnabled");
            Intent intent = new Intent("com.huawei.health.WIDGET_ENABLE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public void onDisabled(Context context) {
        super.onDisabled(context);
        LogUtil.a(TAG, "onDisabled");
        if (context != null && UiWidgetManager.a(context)) {
            Intent intent = new Intent("com.huawei.health.WIDGET_DISABLE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
        XiaomiWidgetWorkManager.c();
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws Throwable {
        if (intent == null || context == null) {
            ReleaseLogUtil.e(TAG, "intent or context is null");
            return;
        }
        if (UiWidgetManager.b(context)) {
            return;
        }
        if (!AuthorizationUtils.c(context)) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            onUpdate(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) XiaomiWidgetProvider.class)), 0);
            return;
        }
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action == null) {
            ReleaseLogUtil.e(TAG, "action is null");
            return;
        }
        if (!ProcessUtil.a(DAEMON_SERVICE_PROCESS)) {
            refreshWhenProcessKilled(context, action);
            return;
        }
        if ("android.intent.action.LOCALE_CHANGED".equals(action) || BOOT_COMPLETE.equals(action) || APPWIDGET_UPDATE.equals(action) || MIUI_APPWIDGET_UPDATE.equals(action)) {
            LogUtil.a(TAG, action);
            sendForceUpdateBroadcast(context);
        }
        if (APPWIDGET_UPDATE.equals(action) || MIUI_APPWIDGET_UPDATE.equals(action)) {
            asyncRefreshWhenFroze(context, action);
        }
    }

    private void asyncRefreshWhenFroze(final Context context, final String str) {
        HandlerExecutor.c(new Runnable() { // from class: imv
            @Override // java.lang.Runnable
            public final void run() {
                XiaomiWidgetProvider.lambda$asyncRefreshWhenFroze$0(context, str);
            }
        }, 2000L);
    }

    public static /* synthetic */ void lambda$asyncRefreshWhenFroze$0(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - SharedPreferenceManager.d(LAST_REFRESH_MODULE_ID, LAST_REFRESH_KEY, jCurrentTimeMillis) <= 2000) {
            ReleaseLogUtil.d(TAG, "refreshed recently, do not refresh again");
        } else {
            ReleaseLogUtil.d(TAG, "exec refreshWidget after 2 sec");
            refreshWhenProcessKilled(context, str);
        }
    }

    public static void refreshWhenProcessKilled(Context context, String str) {
        ReleaseLogUtil.d(TAG, "get steps from xiaomi step counter");
        StepCounterStrategy stepCounterStrategyA = dlq.a();
        if (stepCounterStrategyA != null) {
            int realSteps = stepCounterStrategyA.getRealSteps();
            int iC = SharedPreferenceManager.c(LAST_STEP_MODULE_ID, LAST_STEP_KEY, 0);
            if (realSteps > iC) {
                sLastRefreshData.putInt("step", realSteps);
            } else {
                sLastRefreshData.putInt("step", iC);
            }
            refreshWidget(context, sLastRefreshData, "refreshWhenProcessKilled(), " + str);
        }
    }

    private static void getSteps() {
        if (ProcessUtil.a(DAEMON_SERVICE_PROCESS) && lua.e()) {
            long jD = lua.d(LAST_QUERY_MODULE_ID, LAST_QUERY_KEY, 0L);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<Long, Integer> parsedSteps = getParsedSteps();
            if (jCurrentTimeMillis - jD >= 300000 || parsedSteps.isEmpty()) {
                long jG = HiDateUtil.g(System.currentTimeMillis());
                long jD2 = HiDateUtil.d(System.currentTimeMillis(), TimeZone.getDefault(), -6);
                LogUtil.a(TAG, "startTime:", Long.valueOf(jD2), ",endTime:", Long.valueOf(jG));
                getSteps(jD2, jG);
                lua.a(LAST_QUERY_MODULE_ID, LAST_QUERY_KEY, jCurrentTimeMillis);
            }
        }
    }

    private static void getSteps(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{40002});
        hiAggregateOption.setStartTime(j);
        hiAggregateOption.setEndTime(j2);
        HiHealthManager.d(BaseApplication.getContext()).readHiHealthData(hiAggregateOption, new HiDataReadResultListener() { // from class: com.huawei.health.ui.widget.XiaomiWidgetProvider.3
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj == null) {
                    ReleaseLogUtil.e(XiaomiWidgetProvider.TAG, "readAggregateData null");
                    return;
                }
                HashMap map = new HashMap();
                LogUtil.a(XiaomiWidgetProvider.TAG, "Xiaomi Widget readHiHealthData,", obj);
                if (obj instanceof SparseArray) {
                    Object obj2 = ((SparseArray) obj).get(40002);
                    if (obj2 instanceof List) {
                        ArrayList<HiHealthData> arrayList = new ArrayList(16);
                        arrayList.addAll((List) obj2);
                        for (HiHealthData hiHealthData : arrayList) {
                            map.put(Long.valueOf(hiHealthData.getStartTime()), Integer.valueOf((int) hiHealthData.getValue()));
                        }
                        lua.f(XiaomiWidgetProvider.MODULE_ID, XiaomiWidgetProvider.STEP_KEY, HiJsonUtil.d(map));
                    }
                }
            }
        });
    }

    private static void updateCacheWhenDateChanged(int i) {
        LogUtil.a(TAG, "update yesterday's steps when date changed");
        Map<Long, Integer> parsedSteps = getParsedSteps();
        parsedSteps.put(Long.valueOf(HiDateUtil.d(System.currentTimeMillis(), TimeZone.getDefault(), -1)), Integer.valueOf(i));
        lua.f(MODULE_ID, STEP_KEY, HiJsonUtil.d(parsedSteps));
    }

    private static Map<Long, Integer> getParsedSteps() {
        String strE = lua.e(MODULE_ID, STEP_KEY, (String) null);
        LogUtil.a(TAG, "getParsedSteps(),json: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return new HashMap();
        }
        return (Map) HiJsonUtil.d(strE, new TypeToken<Map<Long, Integer>>() { // from class: com.huawei.health.ui.widget.XiaomiWidgetProvider.1
        }.getType());
    }

    private static StepItem[] getStepItemArray(Map<Long, Integer> map, int i) {
        long jA = HiDateUtil.a(System.currentTimeMillis(), TimeZone.getDefault());
        StepItem[] stepItemArr = new StepItem[7];
        Context context = BaseApplication.getContext();
        Locale locale = context.getResources().getConfiguration().locale;
        boolean zBa = LanguageUtil.ba(context);
        if (LanguageUtil.f(context)) {
            stepItemArr[6] = new StepItem(context.getResources().getString(R.string.IDS_plugindaemon_xiaomi_step_today), i);
        } else {
            String weekDay = getWeekDay(jA, locale);
            if (zBa) {
                stepItemArr[0] = new StepItem(weekDay, i);
            } else {
                stepItemArr[6] = new StepItem(weekDay, i);
            }
        }
        for (int i2 = 1; i2 <= 6; i2++) {
            long jD = HiDateUtil.d(jA, TimeZone.getDefault(), -i2);
            String weekDay2 = getWeekDay(jD, locale);
            Integer orDefault = map.getOrDefault(Long.valueOf(jD), 0);
            if (zBa) {
                stepItemArr[i2] = new StepItem(weekDay2, orDefault.intValue());
            } else {
                stepItemArr[6 - i2] = new StepItem(weekDay2, orDefault.intValue());
            }
        }
        return stepItemArr;
    }

    private static String getWeekDay(long j, Locale locale) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.systemDefault()).getDayOfWeek().getDisplayName(TextStyle.NARROW_STANDALONE, locale);
    }

    public static void refreshWidget(Context context, Bundle bundle, String str) {
        ReleaseLogUtil.d(TAG, "refreshWidget: ", str);
        synchronized (XiaomiWidgetProvider.class) {
            if (bundle != null && context != null) {
                if (DAEMON_SERVICE_PROCESS.equals(ProcessUtil.c())) {
                    SharedPreferenceManager.d(LAST_STEP_MODULE_ID, LAST_STEP_KEY, bundle.getInt("step", 0));
                }
                String strB = SharedPreferenceManager.b(DATE_MODULE_ID, DATE_KEY, (String) null);
                String strA = DateFormatUtil.a(System.currentTimeMillis(), DateFormatUtil.DateFormatType.DATE_FORMAT_8);
                if (WIDGET_PROVIDER_PROCESS.equals(ProcessUtil.c()) && strB != null && !strB.equals(strA)) {
                    ReleaseLogUtil.d(TAG, "date changed, reset steps");
                    updateCacheWhenDateChanged(bundle.getInt("step", 0));
                    sLastRefreshData.putInt("step", 0);
                    SharedPreferenceManager.d(LAST_STEP_MODULE_ID, LAST_STEP_KEY, 0);
                } else {
                    sLastRefreshData = bundle;
                }
                if (!strA.equals(strB)) {
                    SharedPreferenceManager.c(DATE_MODULE_ID, DATE_KEY, strA);
                }
                if (AuthorizationUtils.c(context) && StepCounterSupportUtils.e(context)) {
                    getSteps();
                }
                if (UiWidgetManager.a(context)) {
                    ReleaseLogUtil.d(TAG, "Without Widget!");
                    Intent intent = new Intent("com.huawei.health.WIDGET_DISABLE");
                    intent.setPackage(context.getPackageName());
                    context.sendBroadcast(intent, Consts.d);
                } else {
                    AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
                    onUpdate(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) XiaomiWidgetProvider.class)), bundle.getInt("step", 0));
                }
            }
        }
    }

    public static void sendForceUpdateBroadcast(Context context) {
        ReleaseLogUtil.d(TAG, "sendForceUpdateBroadcast");
        if (context != null) {
            Intent intent = new Intent("com.huawei.health.WIDGET_FORCE_UPDATE");
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent, Consts.d);
        }
    }

    private static RemoteViews getWidgetRemoteViews(Context context, int i) {
        boolean zC = AuthorizationUtils.c(context);
        boolean zBk = CommonUtil.bk();
        ReleaseLogUtil.d(TAG, "hasAuthorized:", Boolean.valueOf(zC));
        RemoteViews remoteViews = getRemoteViews(context, zBk, zC);
        if (!zC) {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.health.MainActivity");
            intent.setFlags(67108864);
            intent.putExtra(BleConstants.SPORT_TYPE, 258);
            intent.putExtra("isToSportTab", true);
            intent.putExtra("homeTabName", TAB_NAME);
            intent.putExtra("mLaunchSource", 13);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
            if (!LanguageUtil.f(context) && !LanguageUtil.q(context)) {
                remoteViews.setTextViewTextSize(R.id.app_name, 1, 14.0f);
            }
            remoteViews.setOnClickPendingIntent(R.id.widget2x2_xiaomi_start_sport, activity);
            return remoteViews;
        }
        if (!StepCounterSupportUtils.e(context)) {
            remoteViews.setViewVisibility(R.id.xiaomi_widget_normal, 8);
            remoteViews.setViewVisibility(R.id.xiaomi_widget_no_permission, 0);
            Intent intent2 = new Intent();
            intent2.setClassName(context, "com.huawei.health.MainActivity");
            intent2.setAction("android.intent.action.MAIN");
            intent2.setFlags(268435456);
            intent2.putExtra("mLaunchSource", 13);
            intent2.putExtra("from", "xiaomi_widget_step_card");
            remoteViews.setOnClickPendingIntent(R.id.xiaomi_widget_rl, PendingIntent.getActivity(context, 0, intent2, 201326592));
            return remoteViews;
        }
        remoteViews.setViewVisibility(R.id.xiaomi_widget_normal, 0);
        remoteViews.setViewVisibility(R.id.xiaomi_widget_no_permission, 8);
        setStepChartViews(context, remoteViews, i);
        return remoteViews;
    }

    private static RemoteViews getRemoteViews(Context context, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                return new RemoteViews(context.getPackageName(), R.layout.layout_xiaomi_widget);
            }
            return new RemoteViews(context.getPackageName(), R.layout.layout_xiaomi_widget_adapter);
        }
        if (z) {
            return new RemoteViews(context.getPackageName(), R.layout.layout_xiaomi_widget_authorize);
        }
        return new RemoteViews(context.getPackageName(), R.layout.layout_xiaomi_widget_authorize_adapter);
    }

    private static void setStepChartViews(Context context, RemoteViews remoteViews, int i) {
        remoteViews.setOnClickPendingIntent(R.id.xiaomi_widget_rl, PendingIntent.getActivity(context, 0, getHealthAppIntent(context), 67108864));
        boolean z = String.valueOf(i).length() >= 4 && !LanguageUtil.o(context);
        if (String.valueOf(i).length() >= 5 || z) {
            remoteViews.setTextViewTextSize(R.id.widget2x2_steps, 1, 18.0f);
        }
        if (i < 0) {
            i = 0;
        }
        remoteViews.setTextViewText(R.id.widget2x2_xiaomi_update_time, context.getResources().getString(R.string.IDS_plugindameon_xiaomi_step_update, UnitUtil.d("HH:mm", System.currentTimeMillis())));
        remoteViews.setTextViewText(R.id.widget2x2_steps, NotificationUtil.d(context, i));
        StepItem[] stepItemArray = getStepItemArray(getParsedSteps(), i);
        remoteViews.setImageViewBitmap(R.id.widget2x2_last_seven_days_chart, new BarChartUtil(context).e(stepItemArray, getMaxStep(stepItemArray)));
    }

    private static int getMaxStep(StepItem[] stepItemArr) {
        int i = 0;
        for (StepItem stepItem : stepItemArr) {
            if (stepItem.mStep > i) {
                i = stepItem.mStep;
            }
        }
        return i;
    }

    private static Intent getHealthAppIntent(Context context) {
        Intent intent = new Intent();
        try {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                ReleaseLogUtil.e(TAG, "getLaunchIntentForPackage return null,set no action!!!");
                return intent;
            }
            intent.setComponent(new ComponentName(context.getPackageName(), launchIntentForPackage.getComponent().getClassName()));
            intent.setAction("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setFlags(268435456);
            return intent;
        } catch (UnsupportedOperationException e) {
            ReleaseLogUtil.a(TAG, "getHealthAPPIntent()", e.getMessage());
            return intent;
        }
    }

    public static class StepItem {
        private String mDayOfWeek;
        private int mStep;

        public String getDayOfWeek() {
            return this.mDayOfWeek;
        }

        public int getStep() {
            return this.mStep;
        }

        public StepItem(String str, int i) {
            this.mDayOfWeek = str;
            this.mStep = i;
        }
    }
}
