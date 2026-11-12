package com.mi.health.sleep.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.router.business.IntentHelper;
import com.mi.health.sleep.widget.SleepWidgetProvider_2_1;
import com.mi.health.utils.ScreenUtil;
import com.mi.health.utils.UiUtils;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.ezi;
import defpackage.pqi;
import defpackage.tti;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J(\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\"\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\"\u0010 \u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\b\u0010!\u001a\u00020\u0018H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\""}, d2 = {"Lcom/mi/health/sleep/widget/SleepWidgetProvider_2_1;", "Lcom/mi/health/HealthBaseAppWidgetProvider;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "onRecentDataChanged", "", "ctx", "Landroid/content/Context;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onUpdate", "wMgr", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onWidgetUpdate", "updateWidgetUi", "widgetId", "", "remoteViews", "Landroid/widget/RemoteViews;", "getRemoteViewOS3", "grant", "", "sleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "getRemoteViewOS2", "getWidgetLayout", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepWidgetProvider_2_1 extends HealthBaseAppWidgetProvider {
    private final String TAG = SleepWidgetProvider_2_1.class.getSimpleName();

    private final RemoteViews getRemoteViewOS2(Context context, boolean grant, AllDaySleepReport sleepReport) {
        String str;
        List<SleepSegmentReport> sleepSegments;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getWidgetLayout());
        if (grant) {
            if (sleepReport == null || (sleepSegments = sleepReport.getSleepSegments()) == null || sleepSegments.isEmpty()) {
                remoteViews.setViewVisibility(pqi.F, 8);
                remoteViews.setViewVisibility(pqi.A, 0);
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s,%s", Arrays.copyOf(new Object[]{context.getString(ezi.N), context.getString(ezi.L)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                remoteViews.setViewVisibility(pqi.F, 0);
                remoteViews.setViewVisibility(pqi.A, 8);
                UiUtils uiUtils = UiUtils.INSTANCE;
                String hMFormatInSecond = TimeDateUtil.getHMFormatInSecond(context, UiUtils.calculateLongSleepDuration$default(uiUtils, sleepReport.getSleepSegments(), false, 2, null).getTotalDuration());
                remoteViews.setTextViewText(pqi.F, UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils, hMFormatInSecond, 22, 22, 12, null, 0, 48, null));
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("%s,%s", Arrays.copyOf(new Object[]{context.getString(ezi.N), hMFormatInSecond}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            remoteViews.setContentDescription(R.id.background, str);
        } else {
            remoteViews.setViewVisibility(pqi.F, 8);
            remoteViews.setViewVisibility(pqi.A, 0);
        }
        return remoteViews;
    }

    private final RemoteViews getRemoteViewOS3(Context context, boolean grant, AllDaySleepReport sleepReport) {
        String str;
        List<SleepSegmentReport> sleepSegments;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getWidgetLayout());
        if (grant) {
            if (sleepReport == null || (sleepSegments = sleepReport.getSleepSegments()) == null || sleepSegments.isEmpty()) {
                remoteViews.setViewVisibility(pqi.F, 0);
                int i = pqi.F;
                StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
                String zeroHM = TimeDateUtil.INSTANCE.getZeroHM(context);
                SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
                Pair pair = TuplesKt.to(spanPropKey, "450");
                SpanPropKey spanPropKey2 = SpanPropKey.FONT_SIZE;
                remoteViews.setTextViewText(i, styledStringUtils.styleSmart(zeroHM, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair, TuplesKt.to(spanPropKey2, "50%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(SpanPropKey.TEXT_REPLACE, "-"), TuplesKt.to(spanPropKey, "380"), TuplesKt.to(spanPropKey2, "100%"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%s,%s", Arrays.copyOf(new Object[]{context.getString(ezi.N), context.getString(ezi.L)}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                remoteViews.setViewVisibility(pqi.F, 0);
                remoteViews.setViewVisibility(pqi.A, 8);
                String hMFormatInSecond = TimeDateUtil.getHMFormatInSecond(context, UiUtils.calculateLongSleepDuration$default(UiUtils.INSTANCE, sleepReport.getSleepSegments(), false, 2, null).getTotalDuration());
                int i2 = pqi.F;
                StyledStringUtils styledStringUtils2 = StyledStringUtils.INSTANCE;
                SpanPropKey spanPropKey3 = SpanPropKey.FONT_WEIGHT;
                Pair pair2 = TuplesKt.to(spanPropKey3, "450");
                SpanPropKey spanPropKey4 = SpanPropKey.FONT_SIZE;
                remoteViews.setTextViewText(i2, styledStringUtils2.styleSmart(hMFormatInSecond, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair2, TuplesKt.to(spanPropKey4, "50%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey3, "380"), TuplesKt.to(spanPropKey4, "100%"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                str = String.format("%s,%s", Arrays.copyOf(new Object[]{context.getString(ezi.N), hMFormatInSecond}, 2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            }
            remoteViews.setContentDescription(R.id.background, str);
        } else {
            remoteViews.setViewVisibility(pqi.F, 8);
            remoteViews.setViewVisibility(pqi.A, 0);
        }
        return remoteViews;
    }

    private final int getWidgetLayout() {
        return UiUtils.INSTANCE.shouldShowOs3Ui() ? tti.i : tti.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$0(SleepWidgetProvider_2_1 this$0, Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(context, "$context");
        this$0.onWidgetUpdate(context, appWidgetManager, iArr);
    }

    private final void onWidgetUpdate(Context context, AppWidgetManager wMgr, int[] appWidgetIds) {
        int i = 0;
        boolean z = RegionPreference.INSTANCE.getPRIVACY_AGREE() && (RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0);
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Logger.w(TAG, "onWidgetUpdate: privacy grant = " + z);
        AllDaySleepReport report = z ? ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getReport(null, TimeUtils.getBeginOfToday() / ((long) 1000)) : null;
        String TAG2 = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Logger.i(TAG2, "update sleep widget: load report = " + report);
        if (!UiUtils.INSTANCE.shouldShowOs3Ui()) {
            int length = appWidgetIds.length;
            while (i < length) {
                updateWidgetUi(context, wMgr, appWidgetIds[i], getRemoteViewOS2(context, z, report));
                i++;
            }
            return;
        }
        int length2 = appWidgetIds.length;
        while (i < length2) {
            int i2 = appWidgetIds[i];
            if (z) {
                updateWidgetUi(context, wMgr, i2, getRemoteViewOS3(context, z, report));
            } else {
                updateWidgetUi(context, wMgr, i2, new RemoteViews(context.getPackageName(), tti.j));
            }
            i++;
        }
    }

    private final void updateWidgetUi(Context context, AppWidgetManager wMgr, int widgetId, RemoteViews remoteViews) {
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Logger.i(TAG, "updateWidgetUi widgetId= " + widgetId);
        UiUtils.updateWidgetDefaultBackgroundIntent$default(UiUtils.INSTANCE, context, remoteViews, IntentHelper.ACTION_SLEEP, null, Integer.valueOf(widgetId), 8, null);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Bundle bundle = new Bundle();
        bundle.putString("miuiWidgetEventCode", "state1");
        bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
        wMgr.updateAppWidgetOptions(widgetId, bundle);
        wMgr.updateAppWidget(widgetId, remoteViews);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.APP_WIDGET_UPDATE_ACTION) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r2.equals("recent_data_changed_broadcast") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r2.equals("android.intent.action.DATE_CHANGED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.MIUI_APP_WIDGET_UPDATE_ACTION) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        onUpdate(r6, r0, r7.getIntArrayExtra("appWidgetIds"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r2.equals("android.intent.action.TIME_SET") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r2.equals("android.intent.action.TIMEZONE_CHANGED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r2.equals(com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule.APPEARANCE_CHANGED_ACTION) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.ACTION_UI_MODE_CHANGED) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        onUpdate(r6, r0, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.Nullable android.content.Intent r7) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = r5.TAG
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            if (r7 == 0) goto L15
            r2 = 0
            java.lang.String r2 = r7.toUri(r2)
            goto L16
        L15:
            r2 = r1
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onReceive:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", this = "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.xiaomi.fitness.common.log.Logger.i(r0, r2)
            if (r7 != 0) goto L38
            super.onReceive(r6, r7)
            return
        L38:
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r6)
            java.lang.String r2 = r7.getAction()
            if (r2 == 0) goto La0
            int r3 = r2.hashCode()
            switch(r3) {
                case -333119352: goto L93;
                case 158859398: goto L8a;
                case 502473491: goto L81;
                case 505380757: goto L78;
                case 1027655412: goto L65;
                case 1041332296: goto L5c;
                case 1484986885: goto L53;
                case 1619576947: goto L4a;
                default: goto L49;
            }
        L49:
            goto La0
        L4a:
            java.lang.String r1 = "android.appwidget.action.APPWIDGET_UPDATE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6e
            goto La0
        L53:
            java.lang.String r3 = "recent_data_changed_broadcast"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L5c:
            java.lang.String r3 = "android.intent.action.DATE_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L65:
            java.lang.String r1 = "miui.appwidget.action.APPWIDGET_UPDATE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6e
            goto La0
        L6e:
            java.lang.String r1 = "appWidgetIds"
            int[] r7 = r7.getIntArrayExtra(r1)
            r5.onUpdate(r6, r0, r7)
            goto La3
        L78:
            java.lang.String r3 = "android.intent.action.TIME_SET"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L81:
            java.lang.String r3 = "android.intent.action.TIMEZONE_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L8a:
            java.lang.String r3 = "android.intent.action.CONFIGURATION_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La0
            goto L9c
        L93:
            java.lang.String r3 = "com.mi.health.widget.action.UI_MODE_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L9c:
            r5.onUpdate(r6, r0, r1)
            goto La3
        La0:
            super.onReceive(r6, r7)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.sleep.widget.SleepWidgetProvider_2_1.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider
    public void onRecentDataChanged(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        super.onRecentDataChanged(ctx);
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Logger.d(TAG, "recent data changed!");
        onUpdate(ctx, AppWidgetManager.getInstance(ctx), null);
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull final Context context, @Nullable final AppWidgetManager wMgr, @Nullable final int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onUpdate(context, wMgr, appWidgetIds);
        ScreenUtil.INSTANCE.logScreenMessage(context);
        if (appWidgetIds == null || appWidgetIds.length == 0) {
            appWidgetIds = wMgr != null ? wMgr.getAppWidgetIds(new ComponentName(context, (Class<?>) SleepWidgetProvider_2_1.class)) : null;
        }
        if (wMgr == null || appWidgetIds == null) {
            return;
        }
        if (!(appWidgetIds.length == 0)) {
            ExecutorHelper.runInBackground(new Runnable() { // from class: r1n
                @Override // java.lang.Runnable
                public final void run() {
                    SleepWidgetProvider_2_1.onUpdate$lambda$0(this.f32083a, context, wMgr, appWidgetIds);
                }
            });
        }
    }
}
