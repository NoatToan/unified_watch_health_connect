package com.mi.health.menses.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.WidgetConstants;
import com.mi.health.a;
import com.xiaomi.fitness.account.region.RegionPreference;
import com.xiaomi.fitness.chart.entrys.CurseEntry;
import com.xiaomi.fitness.common.extensions.PendingIntentExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.health.export.MenstrualWidgetEntryList;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import defpackage.ezi;
import defpackage.pqi;
import defpackage.tti;
import defpackage.ymi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J2\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J@\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020$H\u0002¨\u0006&"}, d2 = {"Lcom/mi/health/menses/widget/MenstrualPeriodWidgetProvider_2_2;", "Lcom/mi/health/HealthBaseAppWidgetProvider;", "<init>", "()V", "onRecentDataChanged", "", "ctx", "Landroid/content/Context;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onUpdateMensesWidget", "appWidgets", "", "updateWidgetUi", "grant", "", "usedCurse", "widgetEntryList", "Lcom/xiaomi/fitness/health/export/MenstrualWidgetEntryList;", "widgetId", "", "buildEmptyEntryList", "getMenstrualBitmap", "Landroid/graphics/Bitmap;", "drawCurseItemEntry", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "startX", "", "endX", "height", "curseEntry", "Lcom/xiaomi/fitness/chart/entrys/CurseEntry;", "Companion", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MenstrualPeriodWidgetProvider_2_2 extends HealthBaseAppWidgetProvider {

    @NotNull
    public static final String TAG = "MenstrualPeriodWidgetProvider_2_2_Log";

    private final MenstrualWidgetEntryList buildEmptyEntryList() {
        long j = 1000;
        long beginOfToday = TimeUtils.getBeginOfToday() / j;
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        long j2 = beginOfToday - (((long) 3) * seconds);
        long j3 = j2 + (((long) 6) * seconds);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            long j4 = j2 + (((long) i) * seconds);
            LocalDate localDate = new LocalDate(j4 * j);
            CurseEntry curseEntry = new CurseEntry(i, 1.0f, j4, 3, 0);
            curseEntry.localDate = localDate;
            arrayList.add(curseEntry);
        }
        return new MenstrualWidgetEntryList("", j2, j3, arrayList);
    }

    private final void drawCurseItemEntry(Context context, Canvas canvas, Paint paint, float startX, float endX, float height, CurseEntry curseEntry) {
        float dp = ExtUtilsKt.getDp(Double.valueOf(1.3d));
        int i = curseEntry.f11748a;
        if (i == 2 || i == 3 || i == 4) {
            int iC = CurseEntry.c(i);
            RectF rectF = new RectF(startX, 0.0f, endX, height);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), iC);
            canvas.drawBitmap(bitmapDecodeResource, new Rect(0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight()), rectF, (Paint) null);
        }
        int i2 = curseEntry.f11748a;
        if (i2 == 1 || i2 == 0) {
            RectF rectF2 = new RectF(startX, 0.0f, endX, height);
            paint.setColor(curseEntry.f11749b);
            paint.setAlpha(curseEntry.d);
            canvas.drawRoundRect(rectF2, dp, dp, paint);
        }
        int i3 = curseEntry.f11748a;
        if (i3 == 2 || i3 == 1) {
            RectF rectF3 = new RectF(startX, 0.0f, endX, ExtUtilsKt.getDp(2));
            paint.setColor(curseEntry.c);
            paint.setAlpha(255);
            canvas.drawRoundRect(rectF3, dp, dp, paint);
        }
    }

    private final Bitmap getMenstrualBitmap(Context context, MenstrualWidgetEntryList widgetEntryList) {
        int dp = ExtUtilsKt.getDp(36);
        int dp2 = ExtUtilsKt.getDp(15);
        int dp3 = ExtUtilsKt.getDp(Double.valueOf(2.3d));
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((dp2 * 7) + (dp3 * 6), dp, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, new RectF(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight()), paint);
        List<CurseEntry> entryList = widgetEntryList.getEntryList();
        if (entryList.size() != 7) {
            Logger.i(TAG, "getMenstrualBitmap entryList invalid " + entryList.size());
            return bitmapCreateBitmap;
        }
        for (int i = 0; i < 7; i++) {
            int i2 = (dp2 + dp3) * i;
            drawCurseItemEntry(context, canvas, paint, i2, i2 + dp2, dp, entryList.get(i));
        }
        return bitmapCreateBitmap;
    }

    private final void onUpdateMensesWidget(Context context, int[] appWidgets) {
        boolean privacy_agree = RegionPreference.INSTANCE.getPRIVACY_AGREE();
        int i = 0;
        boolean z = RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() > 0;
        Logger.i(TAG, "privacyEnable:" + privacy_agree + ";regionEnable:" + z);
        if (!privacy_agree || !z) {
            int length = appWidgets.length;
            while (i < length) {
                updateWidgetUi$default(this, context, false, false, buildEmptyEntryList(), appWidgets[i], 4, null);
                i++;
            }
            return;
        }
        IHealthPage.Companion companion = IHealthPage.INSTANCE;
        if (!HealthPageExtKt.getInstance(companion).usedCurse()) {
            int length2 = appWidgets.length;
            while (i < length2) {
                updateWidgetUi(context, true, false, buildEmptyEntryList(), appWidgets[i]);
                i++;
            }
            return;
        }
        MenstrualWidgetEntryList widgetProviderEntryList = HealthPageExtKt.getInstance(companion).getWidgetProviderEntryList();
        int length3 = appWidgets.length;
        while (i < length3) {
            updateWidgetUi(context, true, true, widgetProviderEntryList, appWidgets[i]);
            i++;
        }
    }

    private final void updateWidgetUi(Context context, boolean grant, boolean usedCurse, MenstrualWidgetEntryList widgetEntryList, int widgetId) {
        Logger.i(TAG, "updateWidgetUi grant " + grant + ";usedCurse " + usedCurse + ";menstrualWidgetSampleBrief " + widgetEntryList + "; widgetId " + widgetId);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), tti.c);
        Resources resources = context.getResources();
        remoteViews.setImageViewResource(pqi.f30647k, ymi.d);
        remoteViews.setTextViewCompoundDrawables(pqi.D, 0, 0, 0, 0);
        remoteViews.setTextViewCompoundDrawables(pqi.E, 0, 0, 0, 0);
        remoteViews.setTextViewCompoundDrawables(pqi.v, 0, 0, 0, 0);
        String string = context.getString(ezi.d);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String date = TimeUtils.formatDate(string, Long.valueOf(System.currentTimeMillis()));
        remoteViews.setTextViewText(pqi.v, date);
        Intent intent = new Intent(a.f9964a);
        remoteViews.setImageViewBitmap(pqi.l, getMenstrualBitmap(context, widgetEntryList));
        long j = 1000;
        remoteViews.setTextViewText(pqi.u, DateUtils.formatDateTime(context, widgetEntryList.getStartTimeSecond() * j, 131096));
        remoteViews.setTextViewText(pqi.t, DateUtils.formatDateTime(context, widgetEntryList.getEndTimeSecond() * j, 131096));
        if (!grant) {
            remoteViews.setViewVisibility(pqi.E, 0);
            remoteViews.setViewVisibility(pqi.D, 8);
            String string2 = resources.getString(ezi.H);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            remoteViews.setTextViewText(pqi.E, string2);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%s,%s", Arrays.copyOf(new Object[]{resources.getString(ezi.K), string2}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            remoteViews.setContentDescription(R.id.background, str);
        } else if (usedCurse) {
            remoteViews.setViewVisibility(pqi.E, 0);
            remoteViews.setViewVisibility(pqi.D, 8);
            remoteViews.setTextViewText(pqi.E, widgetEntryList.getDesc());
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%s,%s", Arrays.copyOf(new Object[]{date, widgetEntryList.getDesc()}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            remoteViews.setContentDescription(R.id.background, str2);
            intent = IHealthPage.DefaultImpls.getMensesPageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null);
        } else {
            remoteViews.setViewVisibility(pqi.E, 8);
            remoteViews.setViewVisibility(pqi.D, 0);
            String string3 = resources.getString(ezi.J);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            remoteViews.setTextViewText(pqi.D, string3);
            remoteViews.setContentDescription(R.id.background, string3);
            intent = IHealthPage.DefaultImpls.getMensesPageIntent$default(HealthPageExtKt.getInstance(IHealthPage.INSTANCE), null, 1, null);
        }
        intent.setFlags(268468224);
        remoteViews.setOnClickPendingIntent(R.id.background, PendingIntentExtKt.buildWidgetPendingIntent(context, widgetId, intent, 134217728));
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
        if (appWidgetManager != null) {
            appWidgetManager.updateAppWidget(widgetId, remoteViews);
        }
    }

    public static /* synthetic */ void updateWidgetUi$default(MenstrualPeriodWidgetProvider_2_2 menstrualPeriodWidgetProvider_2_2, Context context, boolean z, boolean z2, MenstrualWidgetEntryList menstrualWidgetEntryList, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        menstrualPeriodWidgetProvider_2_2.updateWidgetUi(context, z, z2, menstrualWidgetEntryList, i);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public void onReceive(@Nullable Context context, @Nullable Intent intent) {
        int[] appWidgetIds;
        int iHashCode;
        super.onReceive(context, intent);
        Logger.i(TAG, "menses 2*2 widget provider onReceive " + intent);
        if (intent == null || context == null) {
            return;
        }
        String action = intent.getAction();
        if (action == null || ((iHashCode = action.hashCode()) == 1027655412 ? !action.equals(WidgetConstants.MIUI_APP_WIDGET_UPDATE_ACTION) : !(iHashCode == 1619576947 && action.equals(WidgetConstants.APP_WIDGET_UPDATE_ACTION)))) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            appWidgetIds = appWidgetManager != null ? appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) MenstrualPeriodWidgetProvider_2_2.class)) : null;
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
        Logger.d(MenstrualPeriodWidgetProvider_2_1.TAG, "recent data changed!");
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(ctx);
        int[] appWidgetIds = appWidgetManager != null ? appWidgetManager.getAppWidgetIds(new ComponentName(ctx, (Class<?>) MenstrualPeriodWidgetProvider_2_2.class)) : null;
        if (appWidgetIds != null) {
            if (!(appWidgetIds.length == 0)) {
                onUpdateMensesWidget(ctx, appWidgetIds);
            }
        }
    }
}
