package com.mi.health.exercise.widget;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.exercise.widget.StepWidgetProviderBase;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.step.IStepProviderSyncer;
import com.xiaomi.fit.fitness.export.step.StepExportExtKt;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016J\u0012\u0010\u001a\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J8\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H&J \u0010+\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R\u0012\u0010(\u001a\u00020\"X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/mi/health/exercise/widget/StepWidgetProviderBase;", "Lcom/mi/health/HealthBaseAppWidgetProvider;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "mStepLiveData", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "", "curUpdateType", "getCurUpdateType", "setCurUpdateType", "(Ljava/lang/String;)V", "onRecentDataChanged", "", "ctx", "Landroid/content/Context;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onEnabled", "onDisabled", "onUpdate", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onWidgetRemoteUiUpdate", "appWidgetId", "", "goals", "dailyStepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "grant", "", "widgetLayoutId", "getWidgetLayoutId", "()I", "requestStepDataAndUpdate", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StepWidgetProviderBase extends HealthBaseAppWidgetProvider {

    @NotNull
    private final String TAG;

    @NotNull
    private volatile String curUpdateType;

    @Nullable
    private LiveData<Map<HomeDataType, Object>> mStepLiveData;

    public StepWidgetProviderBase() {
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.TAG = simpleName;
        this.curUpdateType = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$0(StepWidgetProviderBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StepExportExtKt.getINSTANCE(IStepProviderSyncer.INSTANCE).doRequestSteps("form step widget " + this$0.TAG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onReceive$lambda$1(StepWidgetProviderBase this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        StepExportExtKt.getINSTANCE(IStepProviderSyncer.INSTANCE).doRequestSteps("form step widget " + this$0.TAG);
    }

    private final void requestStepDataAndUpdate(final Context context, final AppWidgetManager appWidgetManager, final int[] appWidgetIds) {
        UserProfile userProfile;
        try {
            userProfile = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE).getUserProfile(false);
        } catch (Exception e) {
            Logger.e(this.TAG, "fetchData userProfile exception", e);
            userProfile = null;
        }
        if (userProfile == null) {
            for (int i : appWidgetIds) {
                onWidgetRemoteUiUpdate(context, appWidgetManager, i, 6000, new DailyStepReport(0L, "", 0, 0, 0, CollectionsKt__CollectionsKt.emptyList()), false);
            }
            return;
        }
        final int goalValue = GoalHelper.INSTANCE.getGoalValue(1, userProfile.getRegularGoalList());
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
        Logger.i(this.TAG, "privacyEnable:" + privacy_agree + ";regionEnable:" + z);
        boolean z2 = privacy_agree && z;
        if (!z2) {
            for (int i2 : appWidgetIds) {
                onWidgetRemoteUiUpdate(context, appWidgetManager, i2, goalValue, new DailyStepReport(0L, "", 0, 0, 0, CollectionsKt__CollectionsKt.emptyList()), z2);
            }
            return;
        }
        IHomeDataRepository homeDataRepository = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository();
        final boolean z3 = z2;
        final Observer observer = new Observer() { // from class: ofo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StepWidgetProviderBase.requestStepDataAndUpdate$lambda$2(this.f29117a, appWidgetIds, context, appWidgetManager, goalValue, z3, (Map) obj);
            }
        };
        if (this.mStepLiveData != null) {
            ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: pfo
                @Override // java.lang.Runnable
                public final void run() {
                    StepWidgetProviderBase.requestStepDataAndUpdate$lambda$3(this.f30355a, observer);
                }
            });
        }
        this.mStepLiveData = homeDataRepository.getHomeDataWithTag(CollectionsKt__CollectionsJVMKt.listOf(HomeDataType.STEP), "days");
        ExecutorHelper.INSTANCE.runInMain(new Runnable() { // from class: qfo
            @Override // java.lang.Runnable
            public final void run() {
                StepWidgetProviderBase.requestStepDataAndUpdate$lambda$4(this.f31485a, observer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStepDataAndUpdate$lambda$2(StepWidgetProviderBase this$0, int[] appWidgetIds, Context context, AppWidgetManager appWidgetManager, int i, boolean z, Map map) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appWidgetIds, "$appWidgetIds");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "$appWidgetManager");
        if (map != null) {
            HomeDataType homeDataType = HomeDataType.STEP;
            if (map.containsKey(homeDataType)) {
                Object obj = map.get(homeDataType);
                Logger.i(this$0.TAG, "home stepLiveData observer result:" + obj);
                if (obj instanceof DailyStepReport) {
                    for (int i2 : appWidgetIds) {
                        this$0.onWidgetRemoteUiUpdate(context, appWidgetManager, i2, i, (DailyStepReport) obj, z);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStepDataAndUpdate$lambda$3(StepWidgetProviderBase this$0, Observer observer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        LiveData<Map<HomeDataType, Object>> liveData = this$0.mStepLiveData;
        Intrinsics.checkNotNull(liveData);
        liveData.removeObserver(observer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestStepDataAndUpdate$lambda$4(StepWidgetProviderBase this$0, Observer observer) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(observer, "$observer");
        LiveData<Map<HomeDataType, Object>> liveData = this$0.mStepLiveData;
        Intrinsics.checkNotNull(liveData);
        liveData.observeForever(observer);
    }

    @NotNull
    public final String getCurUpdateType() {
        return this.curUpdateType;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public abstract int getWidgetLayoutId();

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onDisabled(@Nullable Context context) {
        super.onDisabled(context);
        Logger.i(this.TAG, "onDisabled");
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onEnabled(@Nullable Context context) {
        super.onEnabled(context);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r1.equals(com.mi.health.WidgetConstants.APP_WIDGET_UPDATE_ACTION) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
    
        if (r1.equals("recent_data_changed_broadcast") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r1.equals("android.intent.action.DATE_CHANGED") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        if (r1.equals(com.mi.health.WidgetConstants.MIUI_APP_WIDGET_UPDATE_ACTION) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r3.curUpdateType = java.lang.String.valueOf(r5.getAction());
        com.xiaomi.fitness.common.concurrent.ExecutorHelper.runInBackground(new defpackage.sfo(r3));
        onUpdate(r4, r0, r5.getIntArrayExtra("appWidgetIds"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r1.equals("android.intent.action.TIME_SET") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0085, code lost:
    
        if (r1.equals("android.intent.action.TIMEZONE_CHANGED") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        if (r1.equals(com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule.APPEARANCE_CHANGED_ACTION) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r1.equals(com.mi.health.WidgetConstants.ACTION_UI_MODE_CHANGED) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
    
        r3.curUpdateType = java.lang.String.valueOf(r5.getAction());
        com.xiaomi.fitness.common.concurrent.ExecutorHelper.runInBackground(new defpackage.rfo(r3));
        onUpdate(r4, r0, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(@org.jetbrains.annotations.NotNull android.content.Context r4, @org.jetbrains.annotations.Nullable android.content.Intent r5) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.exercise.widget.StepWidgetProviderBase.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider
    public void onRecentDataChanged(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        super.onRecentDataChanged(ctx);
        Logger.d(this.TAG, "recent data changed!");
        this.curUpdateType = "android.intent.action.DATE_CHANGED";
        onUpdate(ctx, AppWidgetManager.getInstance(ctx), null);
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @Nullable AppWidgetManager appWidgetManager, @Nullable int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onUpdate(context, appWidgetManager, appWidgetIds);
        if (appWidgetIds == null || appWidgetIds.length == 0) {
            appWidgetIds = appWidgetManager != null ? appWidgetManager.getAppWidgetIds(new ComponentName(context, getClass())) : null;
        }
        Logger.i(this.TAG, "onUpdate ids :" + Arrays.toString(appWidgetIds));
        if (appWidgetManager == null || appWidgetIds == null) {
            return;
        }
        if (!(appWidgetIds.length == 0)) {
            requestStepDataAndUpdate(context, appWidgetManager, appWidgetIds);
        }
    }

    public abstract void onWidgetRemoteUiUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant);

    public final void setCurUpdateType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.curUpdateType = str;
    }
}
