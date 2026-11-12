package com.mi.health.menses.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.RemoteViews;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.WidgetConstants;
import com.mi.health.a;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.export.MenstrualWidgetSampleBrief;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.ezi;
import defpackage.pqi;
import defpackage.tti;
import defpackage.ymi;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J6\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002¨\u0006\u0018"}, d2 = {"Lcom/mi/health/menses/widget/MenstrualPeriodWidgetProvider_2_1;", "Lcom/mi/health/HealthBaseAppWidgetProvider;", "<init>", "()V", "onRecentDataChanged", "", "ctx", "Landroid/content/Context;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onUpdateMensesWidget", "appWidgets", "", "updateWidgetUi", "grant", "", "usedCurse", "menstrualWidgetSampleBrief", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetSampleBrief;", "widgetId", "", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenstrualPeriodWidgetProvider_2_1 extends HealthBaseAppWidgetProvider {

    @NotNull
    public static final String TAG = "MenstrualPeriodWidgetProvider_2_1_Log";

    private final void onUpdateMensesWidget(Context context, int[] appWidgets) {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        int i = 0;
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
        Logger.i(TAG, "privacyEnable:" + privacy_agree + ";regionEnable:" + z);
        if (!privacy_agree || !z) {
            int length = appWidgets.length;
            while (i < length) {
                updateWidgetUi$default(this, context, false, false, null, appWidgets[i], 12, null);
                i++;
            }
            return;
        }
        IHealthPage.Companion companion = IHealthPage.INSTANCE;
        if (!HealthPageExtKt.getInstance(companion).usedCurse()) {
            int length2 = appWidgets.length;
            while (i < length2) {
                updateWidgetUi$default(this, context, true, false, null, appWidgets[i], 8, null);
                i++;
            }
            return;
        }
        MenstrualWidgetSampleBrief widgetProviderSampleBrief = HealthPageExtKt.getInstance(companion).getWidgetProviderSampleBrief();
        int length3 = appWidgets.length;
        while (i < length3) {
            updateWidgetUi(context, true, true, widgetProviderSampleBrief, appWidgets[i]);
            i++;
        }
    }

    private final void updateWidgetUi(Context context, boolean grant, boolean usedCurse, MenstrualWidgetSampleBrief menstrualWidgetSampleBrief, int widgetId) {
        String string;
        String string2;
        Logger.i(TAG, "updateWidgetUi grant " + grant + ";usedCurse " + usedCurse + ";menstrualWidgetSampleBrief " + menstrualWidgetSampleBrief + "; widgetId " + widgetId);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), tti.f35028b);
        Resources resources = context.getResources();
        remoteViews.setImageViewResource(pqi.f30647k, ymi.c);
        remoteViews.setTextViewCompoundDrawables(pqi.w, 0, 0, 0, 0);
        remoteViews.setTextViewCompoundDrawables(pqi.E, 0, 0, 0, 0);
        Intent intent = new Intent(a.f9964a);
        if (!grant) {
            remoteViews.setViewVisibility(pqi.E, 0);
            remoteViews.setViewVisibility(pqi.w, 0);
            remoteViews.setViewVisibility(pqi.x, 8);
            String string3 = resources.getString(ezi.K);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            remoteViews.setTextViewText(pqi.E, string3);
            String string4 = resources.getString(ezi.H);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            remoteViews.setTextViewText(pqi.w, string4);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s,%s", Arrays.copyOf(new Object[]{string3, string4}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            remoteViews.setContentDescription(R.id.background, str);
        } else if (usedCurse) {
            remoteViews.setViewVisibility(pqi.E, 0);
            remoteViews.setViewVisibility(pqi.w, 0);
            remoteViews.setViewVisibility(pqi.x, 8);
            if (menstrualWidgetSampleBrief == null || (string = menstrualWidgetSampleBrief.getTitle()) == null) {
                string = resources.getString(ezi.K);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            }
            if (menstrualWidgetSampleBrief == null || (string2 = menstrualWidgetSampleBrief.getSubTitle()) == null) {
                string2 = resources.getString(ezi.H);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            }
            remoteViews.setTextViewText(pqi.E, string);
            remoteViews.setTextViewText(pqi.w, string2);
            String date = TimeUtils.formatDate(context.getString(ezi.d), Long.valueOf(System.currentTimeMillis()));
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s,%s,%s", Arrays.copyOf(new Object[]{date, string, string2}, 3));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            remoteViews.setContentDescription(R.id.background, str2);
            intent = IHealthPage.DefaultImpls.getMensesPageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null);
        } else {
            remoteViews.setViewVisibility(pqi.E, 8);
            remoteViews.setViewVisibility(pqi.w, 8);
            remoteViews.setViewVisibility(pqi.x, 0);
            String string5 = resources.getString(ezi.J);
            Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
            remoteViews.setTextViewText(pqi.x, string5);
            remoteViews.setContentDescription(R.id.background, string5);
            intent = IHealthPage.DefaultImpls.getMensesPageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null);
        }
        intent.setFlags(268468224);
        remoteViews.setOnClickPendingIntent(R.id.background, PendingIntentExtKt.buildWidgetPendingIntent(context, widgetId, intent, 134217728));
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }
    }

    public static /* synthetic */ void updateWidgetUi$default(MenstrualPeriodWidgetProvider_2_1 menstrualPeriodWidgetProvider_2_1, Context context, boolean z, boolean z2, MenstrualWidgetSampleBrief menstrualWidgetSampleBrief, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            menstrualWidgetSampleBrief = null;
        }
        menstrualPeriodWidgetProvider_2_1.updateWidgetUi(context, z, z3, menstrualWidgetSampleBrief, i);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        int[] appWidgetIds;
        int iHashCode;
        super.onReceive(context, intent);
        Logger.i(TAG, "menses 2*1 widget provider onReceive " + intent);
        if (intent == null || context == null) {
            return;
        }
        String action = intent.getAction();
        if (action == null || ((iHashCode = action.hashCode()) == 1027655412 ? !action.equals(WidgetConstants.MIUI_APP_WIDGET_UPDATE_ACTION) : !(iHashCode == 1619576947 && action.equals(WidgetConstants.APP_WIDGET_UPDATE_ACTION)))) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            appWidgetIds = appWidgetManager != null ? appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) MenstrualPeriodWidgetProvider_2_1.class)) : null;
        } else {
            appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
        }
        Logger.i(TAG, "appWidgets ids :" + Arrays.toString(appWidgetIds));
        if (appWidgetIds != null) {
            if (!(appWidgetIds.length == 0)) {
                onUpdateMensesWidget(context, appWidgetIds);
            }
        }
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider
    public void onRecentDataChanged(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        super.onRecentDataChanged(ctx);
        Logger.d(TAG, "recent data changed!");
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(ctx);
        int[] appWidgetIds = appWidgetManager != null ? appWidgetManager.getAppWidgetIds(new ComponentName(ctx, (Class<?>) MenstrualPeriodWidgetProvider_2_1.class)) : null;
        if (appWidgetIds != null) {
            if (!(appWidgetIds.length == 0)) {
                onUpdateMensesWidget(ctx, appWidgetIds);
            }
        }
    }
}
