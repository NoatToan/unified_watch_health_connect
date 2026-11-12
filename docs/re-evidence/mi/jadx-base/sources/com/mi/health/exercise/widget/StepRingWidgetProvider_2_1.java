package com.mi.health.exercise.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.RemoteViews;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.mi.health.utils.UiUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.SystemProperties;
import defpackage.cli;
import defpackage.ezi;
import defpackage.gfo;
import defpackage.k47;
import defpackage.lyi;
import defpackage.ni4;
import defpackage.pqi;
import defpackage.rmi;
import defpackage.tti;
import defpackage.ymi;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J6\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013JF\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u0005J6\u0010%\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J.\u0010&\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019J.\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005J2\u0010+\u001a\u00020\t*\u00020,2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u0005R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u001e\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010!¨\u00061"}, d2 = {"Lcom/mi/health/exercise/widget/StepRingWidgetProvider_2_1;", "Lcom/mi/health/exercise/widget/StepWidgetProviderBase;", "<init>", "()V", "widgetLayoutId", "", "getWidgetLayoutId", "()I", "onWidgetRemoteUiUpdate", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "goals", "dailyStepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "grant", "", "onWidgetRemoteUiUpdateOS3", "updateRingViewO3", "remoteViews", "Landroid/widget/RemoteViews;", "finishPercent", "", "ringSizePx", "ringStrokePx", "personW", "personH", "ringDimen", "getRingDimen", "setRingDimen", "(I)V", "ringStrokeWidth", "getRingStrokeWidth", "setRingStrokeWidth", "onWidgetRemoteUiUpdateOS2", "setDefaultDescription", "resources", "Landroid/content/res/Resources;", "steps", "updateRingView", "drawWalkingMan", "Landroid/graphics/Canvas;", "left", "top", "width", "height", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepRingWidgetProvider_2_1.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepRingWidgetProvider_2_1.kt\ncom/mi/health/exercise/widget/StepRingWidgetProvider_2_1\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,493:1\n90#2,6:494\n30#3,7:500\n66#3,8:507\n66#3,8:515\n30#3,7:523\n*S KotlinDebug\n*F\n+ 1 StepRingWidgetProvider_2_1.kt\ncom/mi/health/exercise/widget/StepRingWidgetProvider_2_1\n*L\n174#1:494,6\n195#1:500,7\n231#1:507,8\n241#1:515,8\n482#1:523,7\n*E\n"})
public class StepRingWidgetProvider_2_1 extends StepWidgetProviderBase {
    private int ringDimen = rmi.j;
    private int ringStrokeWidth = rmi.l;

    public static /* synthetic */ void updateRingViewO3$default(StepRingWidgetProvider_2_1 stepRingWidgetProvider_2_1, Context context, RemoteViews remoteViews, float f, int i, int i2, int i3, int i4, int i5, Object obj) throws Throwable {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateRingViewO3");
        }
        stepRingWidgetProvider_2_1.updateRingViewO3(context, remoteViews, f, (i5 & 8) != 0 ? ExtUtilsKt.getDp(45) : i, (i5 & 16) != 0 ? ExtUtilsKt.getDp(Double.valueOf(4.4d)) : i2, (i5 & 32) != 0 ? ExtUtilsKt.getDp(Double.valueOf(16.86d)) : i3, (i5 & 64) != 0 ? ExtUtilsKt.getDp(28) : i4);
    }

    public final void drawWalkingMan(@NotNull Canvas canvas, @NotNull Context context, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = context.getResources().getConfiguration().getLayoutDirection() == 1;
        Drawable drawableE = ni4.e(context, ymi.m);
        Intrinsics.checkNotNull(drawableE);
        drawableE.setBounds(i, i2, i + i3, i2 + i4);
        k47.j(drawableE, true);
        if (!z) {
            drawableE.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.scale(-1.0f, 1.0f, i + (i3 / 2.0f), i2 + (i4 / 2.0f));
            drawableE.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public int getRingDimen() {
        return this.ringDimen;
    }

    public int getRingStrokeWidth() {
        return this.ringStrokeWidth;
    }

    @Override // com.mi.health.exercise.widget.StepWidgetProviderBase
    public int getWidgetLayoutId() {
        return UiUtils.INSTANCE.shouldShowOs3Ui() ? tti.p : tti.o;
    }

    @Override // com.mi.health.exercise.widget.StepWidgetProviderBase
    public void onWidgetRemoteUiUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        if (UiUtils.INSTANCE.shouldShowOs3Ui()) {
            onWidgetRemoteUiUpdateOS3(context, appWidgetManager, appWidgetId, goals, dailyStepReport, grant);
        } else {
            onWidgetRemoteUiUpdateOS2(context, appWidgetManager, appWidgetId, goals, dailyStepReport, grant);
        }
    }

    public final void onWidgetRemoteUiUpdateOS2(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        int steps = dailyStepReport.getSteps();
        boolean zAreEqual = Intrinsics.areEqual(SystemProperties.INSTANCE.getString("persist.sys.background_blur_supported", "false"), "true");
        Logger.i(getTAG(), "onWidgetRemoteUiUpdate.. appWidgetId: " + appWidgetId + ";steps:" + steps + ";goals:" + goals + ";grant:" + grant + ";supportBackGroundBlur:" + zAreEqual);
        gfo.c(context, System.currentTimeMillis());
        float f = goals != 0 ? steps / goals : 0.0f;
        Logger.i(getTAG(), "finishPercent:" + f);
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getWidgetLayoutId());
        Resources resources = context.getResources();
        if (appWidgetManager.getAppWidgetOptions(appWidgetId).getInt("appWidgetMinHeight") <= 50) {
            setRingDimen(rmi.f32709k);
            setRingStrokeWidth(rmi.m);
        }
        Logger.i(getTAG(), "ringDimen = " + getRingDimen() + ",ringStrokeWidth = " + getRingStrokeWidth());
        updateRingView(context, remoteViews, f, getRingDimen(), getRingStrokeWidth());
        remoteViews.setImageViewResource(pqi.n, ymi.j);
        String quantityString = resources.getQuantityString(lyi.f25558b, goals, Integer.valueOf(goals));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = context.getResources().getQuantityString(lyi.common_unit_step_desc, steps, Integer.valueOf(steps));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        UiUtils uiUtils = UiUtils.INSTANCE;
        SpannableString spannableStringTextNumberSizeChangeWithSpacing$default = UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils, quantityString2, 22, 22, 12, null, 0, 48, null);
        if (grant) {
            remoteViews.setTextViewText(pqi.M, spannableStringTextNumberSizeChangeWithSpacing$default);
            remoteViews.setTextViewText(pqi.J, quantityString);
            Intrinsics.checkNotNull(resources);
            z = false;
            setDefaultDescription(remoteViews, resources, steps, goals, f);
        } else {
            z = false;
            String quantityString3 = context.getResources().getQuantityString(lyi.common_unit_step_desc, 0, 0);
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            remoteViews.setTextViewText(pqi.M, UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils, quantityString3, 22, 22, 12, "-", 0, 32, null));
            remoteViews.setTextViewText(pqi.J, "--");
            Intrinsics.checkNotNull(resources);
            setDefaultDescription(remoteViews, resources, steps, goals, f);
        }
        boolean z2 = z;
        UiUtils.updateWidgetDefaultBackgroundIntent$default(uiUtils, context, remoteViews, "steps", null, Integer.valueOf(appWidgetId), 8, null);
        long jB = gfo.b(context);
        Logger.i(getTAG(), "widget last update time : " + jB);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = jCurrentTimeMillis - jB <= TimeUnit.HOURS.toMillis(1L) ? true : z2;
        Bundle bundle = new Bundle();
        bundle.putString("miuiWidgetEventCode", z3 ? "state1" : "state10");
        bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
        appWidgetManager.updateAppWidgetOptions(appWidgetId, bundle);
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }

    public final void onWidgetRemoteUiUpdateOS3(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant) throws Throwable {
        RemoteViews remoteViews;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        int steps = dailyStepReport.getSteps();
        boolean zAreEqual = Intrinsics.areEqual(SystemProperties.INSTANCE.getString("persist.sys.background_blur_supported", "false"), "true");
        Logger.i(getTAG(), "onWidgetRemoteUiUpdate.. appWidgetId: " + appWidgetId + ";steps:" + steps + ";goals:" + goals + ";grant:" + grant + ";supportBackGroundBlur:" + zAreEqual);
        gfo.c(context, System.currentTimeMillis());
        float f = goals != 0 ? steps / goals : 0.0f;
        Logger.i(getTAG(), "finishPercent:" + f);
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), getWidgetLayoutId());
        Resources resources = context.getResources();
        if (grant) {
            appWidgetManager.getAppWidgetOptions(appWidgetId);
            updateRingViewO3$default(this, context, remoteViews2, f, 0, 0, 0, 0, 120, null);
            StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
            int i = lyi.common_unit_step_desc;
            SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
            Pair pair = TuplesKt.to(spanPropKey, "450");
            SpanPropKey spanPropKey2 = SpanPropKey.FONT_SIZE;
            remoteViews2.setTextViewText(pqi.M, styledStringUtils.getStyledString(context, i, steps, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair, TuplesKt.to(spanPropKey2, "50%"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Integer.valueOf(steps), new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey2, "100%"), TuplesKt.to(spanPropKey, "380"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
            Intrinsics.checkNotNull(resources);
            setDefaultDescription(remoteViews2, resources, steps, goals, f);
            remoteViews = remoteViews2;
        } else {
            remoteViews = new RemoteViews(context.getPackageName(), tti.q);
        }
        UiUtils.updateWidgetDefaultBackgroundIntent$default(UiUtils.INSTANCE, context, remoteViews, "steps", null, Integer.valueOf(appWidgetId), 8, null);
        long jB = gfo.b(context);
        Logger.i(getTAG(), "widget last update time : " + jB);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - jB <= TimeUnit.HOURS.toMillis(1L);
        Bundle bundle = new Bundle();
        bundle.putString("miuiWidgetEventCode", z ? "state1" : "state10");
        bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
        appWidgetManager.updateAppWidgetOptions(r13, bundle);
        appWidgetManager.updateAppWidget(appWidgetId, remoteViews);
    }

    public final void setDefaultDescription(@NotNull RemoteViews remoteViews, @NotNull Resources resources, int steps, int goals, float finishPercent) {
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        Intrinsics.checkNotNullParameter(resources, "resources");
        remoteViews.setContentDescription(R.id.background, resources.getString(ezi.E, Integer.valueOf(steps), Integer.valueOf(goals), Integer.valueOf((int) (finishPercent * 100))));
    }

    public void setRingDimen(int i) {
        this.ringDimen = i;
    }

    public void setRingStrokeWidth(int i) {
        this.ringStrokeWidth = i;
    }

    public final void updateRingView(@NotNull Context context, @NotNull RemoteViews remoteViews, float finishPercent, int ringDimen, int ringStrokeWidth) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        int dimensionPixelSize = resources.getDimensionPixelSize(ringDimen);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rectF, paint);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(ringStrokeWidth);
        int width = bitmapCreateBitmap.getWidth();
        int i = (width - dimensionPixelSize2) / 2;
        int i2 = width / 2;
        int height = bitmapCreateBitmap.getHeight() / 2;
        float f = dimensionPixelSize2;
        paint.setStrokeWidth(f);
        RectF rectF2 = new RectF();
        rectF2.set(i2 - i, height - i, i2 + i, height + i);
        if (finishPercent < 1.0f) {
            paint.setColor(ni4.c(context, cli.f5457a));
            canvas.drawOval(rectF2, paint);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.save();
            int iC = ni4.c(context, cli.d);
            int iC2 = ni4.c(context, cli.c);
            float f2 = SpatialRelationUtil.A_CIRCLE_DEGREE;
            float f3 = f2 * finishPercent;
            float f4 = f / 2.0f;
            float f5 = (f4 / ((float) (((double) (i + f4)) * 6.283185307179586d))) * f2;
            float f6 = i2;
            float f7 = height;
            canvas.rotate((-90) - f5, f6, f7);
            paint.setColor(ni4.c(context, cli.f5458b));
            canvas.drawArc(rectF2, f5, f3, false, paint);
            paint.setShader(new SweepGradient(f6, f7, new int[]{iC, iC2}, new float[]{0.0f, f3 / 360.0f}));
            canvas.drawArc(rectF2, f5, f3, false, paint);
            canvas.restore();
        } else {
            float f8 = 1;
            float f9 = (f8 + (finishPercent % f8)) * SpatialRelationUtil.A_CIRCLE_DEGREE;
            paint.setStrokeCap(Paint.Cap.BUTT);
            int iC3 = ni4.c(context, cli.d);
            int iC4 = ni4.c(context, cli.c);
            canvas.save();
            float f10 = i2;
            float f11 = height;
            canvas.rotate((-90) + f9, f10, f11);
            paint.setShader(new SweepGradient(f10, f11, new int[]{iC3, iC4}, new float[]{0.0f, 1.0f}));
            canvas.drawOval(rectF2, paint);
            canvas.restore();
            canvas.save();
            canvas.rotate(f9, f10, f11);
            float f12 = f / 2.0f;
            paint.setShader(null);
            paint.setColor(iC4);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(f10, f12, f12, paint);
            canvas.restore();
        }
        remoteViews.setImageViewBitmap(pqi.m, bitmapCreateBitmap);
    }

    public final void updateRingViewO3(@NotNull Context context, @NotNull RemoteViews remoteViews, float finishPercent, int ringSizePx, int ringStrokePx, int personW, int personH) throws Throwable {
        int i;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(remoteViews, "remoteViews");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(ringSizePx, ringSizePx, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawBitmap(bitmapCreateBitmap, (Rect) null, rectF, paint);
        int width = bitmapCreateBitmap.getWidth();
        int i2 = (width - ringStrokePx) / 2;
        int i3 = width / 2;
        int height = bitmapCreateBitmap.getHeight() / 2;
        float f = ringStrokePx;
        paint.setStrokeWidth(f);
        RectF rectF2 = new RectF();
        rectF2.set(i3 - i2, height - i2, i3 + i2, height + i2);
        if (finishPercent < 1.0f) {
            paint.setColor(ni4.c(context, cli.f5457a));
            canvas.drawOval(rectF2, paint);
            paint.setStrokeCap(Paint.Cap.ROUND);
            int iSave = canvas.save();
            try {
                int iC = ni4.c(context, cli.d);
                int iC2 = ni4.c(context, cli.c);
                float f2 = SpatialRelationUtil.A_CIRCLE_DEGREE;
                float f3 = f2 * finishPercent;
                float f4 = f / 2.0f;
                float f5 = f2 * (f4 / ((float) (((double) (i2 + f4)) * 6.283185307179586d)));
                float f6 = i3;
                float f7 = height;
                canvas.rotate((-90) - f5, f6, f7);
                paint.setColor(ni4.c(context, cli.f5458b));
                i = iSave;
                try {
                    canvas.drawArc(rectF2, f5, f3, false, paint);
                    paint.setShader(new SweepGradient(f6, f7, new int[]{iC, iC2}, new float[]{0.0f, f3 / 360.0f}));
                    canvas.drawArc(rectF2, f5, f3, false, paint);
                    canvas.restoreToCount(i);
                } catch (Throwable th) {
                    th = th;
                    canvas.restoreToCount(i);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                i = iSave;
            }
        } else {
            float f8 = 1;
            float f9 = (f8 + (finishPercent % f8)) * SpatialRelationUtil.A_CIRCLE_DEGREE;
            paint.setStrokeCap(Paint.Cap.BUTT);
            int iC3 = ni4.c(context, cli.d);
            int iC4 = ni4.c(context, cli.c);
            float f10 = i3;
            float f11 = height;
            int iSave2 = canvas.save();
            canvas.rotate((-90) + f9, f10, f11);
            try {
                paint.setShader(new SweepGradient(f10, f11, new int[]{iC3, iC4}, new float[]{0.0f, 1.0f}));
                canvas.drawOval(rectF2, paint);
                canvas.restoreToCount(iSave2);
                int iSave3 = canvas.save();
                canvas.rotate(f9, f10, f11);
                float f12 = f / 2.0f;
                try {
                    paint.setShader(null);
                    paint.setColor(iC4);
                    paint.setStyle(Paint.Style.FILL);
                    canvas.drawCircle(f10, f12, f12, paint);
                    canvas.restoreToCount(iSave3);
                } catch (Throwable th3) {
                    canvas.restoreToCount(iSave3);
                    throw th3;
                }
            } catch (Throwable th4) {
                canvas.restoreToCount(iSave2);
                throw th4;
            }
        }
        Intrinsics.checkNotNull(ni4.e(context, ymi.m));
        drawWalkingMan(canvas, context, (int) ((ringSizePx - personW) / 2.0f), (int) ((ringSizePx - personH) / 2.0f), personW, personH);
        remoteViews.setImageViewBitmap(pqi.i, bitmapCreateBitmap);
    }
}
