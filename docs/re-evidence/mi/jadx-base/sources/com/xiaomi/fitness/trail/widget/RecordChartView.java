package com.xiaomi.fitness.trail.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fit.fitness.parser.schema.FitnessReportKey;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.fitness.trail.data.BarData;
import com.xiaomi.fitness.trail.widget.RecordChartView;
import defpackage.dki;
import defpackage.hoi;
import defpackage.ni4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ4\u0010-\u001a\u00020.2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020,002\u0006\u0010)\u001a\u00020%2\u0006\u00101\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\b\u0010:\u001a\u00020.H\u0002J\u001a\u0010A\u001a\u00020.2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020.0@J\b\u0010G\u001a\u00020.H\u0002J\u0010\u0010H\u001a\u00020.2\u0006\u0010I\u001a\u00020JH\u0014J\u0010\u0010M\u001a\u00020.2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010R\u001a\u00020.2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010S\u001a\u00020.2\u0006\u0010I\u001a\u00020JH\u0002J\u0010\u0010W\u001a\u0002072\u0006\u0010X\u001a\u00020YH\u0017J\u0018\u0010Z\u001a\u00020.2\u0006\u0010[\u001a\u00020\u00072\u0006\u0010\\\u001a\u00020\u0007H\u0014J\n\u0010]\u001a\u0004\u0018\u00010\u001eH\u0002J\b\u0010^\u001a\u00020.H\u0002R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020.\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001f0DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010V\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006_"}, d2 = {"Lcom/xiaomi/fitness/trail/widget/RecordChartView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dashGap", "dashHeight", "", "dashTop", "gapUnitLine", "vertLineFirstX", "vertLineLastX", "paintDash", "Landroid/graphics/Paint;", "paintBar", "colorLinePressed", "colorLineSides", "paintLine", "textBottom", "textHeight", "paintText", "maxBarHeight", "barBottom", "barInfoMap", "Ljava/util/LinkedHashMap;", "Landroid/graphics/Rect;", "Lcom/xiaomi/fitness/trail/data/BarData;", "barTouchRange", "barDrawable", "Landroid/graphics/drawable/GradientDrawable;", "dateTexts", "", "", StatConstants.PARAM_START, "", StatConstants.PARAM_END, "category", "dimen", "recordList", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "setData", "", "data", "", "dim", "barSize", "barWidth", "barGap", "vertLine2Bar", "dateSideCenter", "", "barExtX", "barRadius", "genFixedData", "totalDistance", FitnessReportKey.totalDuration, "totalCalorie", "totalNum", "summaryEmitter", "Lkotlin/Function1;", "observerSummary", "block", "barDataMap", "Ljava/util/HashMap;", "durationMax", "totalBarData", "genBarData", "onDraw", "canvas", "Landroid/graphics/Canvas;", "path", "Landroid/graphics/Path;", "drawBar", "unitYOffset", "unitBottom", "unitLastY", "unitZeroY", "drawText", "drawLine", "pressX", "pressY", "pressedRect", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "pressedBarRect", "resetBarData", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRecordChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordChartView.kt\ncom/xiaomi/fitness/trail/widget/RecordChartView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,355:1\n1#2:356\n1863#3,2:357\n774#3:359\n865#3,2:360\n*S KotlinDebug\n*F\n+ 1 RecordChartView.kt\ncom/xiaomi/fitness/trail/widget/RecordChartView\n*L\n224#1:357,2\n75#1:359\n75#1:360,2\n*E\n"})
public final class RecordChartView extends View {
    private final float barBottom;

    @NotNull
    private final HashMap<Integer, BarData> barDataMap;

    @NotNull
    private final GradientDrawable barDrawable;
    private int barExtX;
    private float barGap;

    @NotNull
    private final LinkedHashMap<Rect, BarData> barInfoMap;
    private float barRadius;
    private int barSize;

    @NotNull
    private final LinkedHashMap<Rect, Rect> barTouchRange;
    private int barWidth;

    @NotNull
    private String category;
    private final int colorLinePressed;
    private final int colorLineSides;
    private final int dashGap;
    private final float dashHeight;
    private final int dashTop;
    private boolean dateSideCenter;

    @NotNull
    private final List<String> dateTexts;

    @NotNull
    private String dimen;
    private float durationMax;
    private long end;
    private final int gapUnitLine;
    private final int maxBarHeight;

    @NotNull
    private final Paint paintBar;

    @NotNull
    private final Paint paintDash;

    @NotNull
    private final Paint paintLine;

    @NotNull
    private final Paint paintText;

    @NotNull
    private Path path;
    private float pressX;
    private float pressY;

    @Nullable
    private Rect pressedRect;

    @NotNull
    private List<SportBasicReport> recordList;
    private long start;

    @Nullable
    private Function1<? super BarData, Unit> summaryEmitter;
    private final float textBottom;
    private final int textHeight;

    @Nullable
    private BarData totalBarData;
    private int totalCalorie;
    private int totalDistance;
    private long totalDuration;
    private int totalNum;
    private final float unitBottom;
    private final float unitLastY;
    private final int unitYOffset;
    private final float unitZeroY;
    private int vertLine2Bar;
    private int vertLineFirstX;
    private int vertLineLastX;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecordChartView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void drawBar(Canvas canvas) {
        Set<Rect> setKeySet = this.barInfoMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        for (Rect rect : setKeySet) {
            this.path.reset();
            Path path = this.path;
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float height = getHeight();
            float f4 = this.barRadius;
            path.addRoundRect(f, f2, f3, height, new float[]{f4, f4, f4, f4, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
            canvas.save();
            canvas.clipRect(rect.left, rect.top, rect.right, rect.bottom);
            canvas.drawPath(this.path, this.paintBar);
            canvas.restore();
        }
    }

    private final void drawLine(Canvas canvas) {
        for (int i = 0; i < 5; i++) {
            float paddingTop = getPaddingTop() + this.dashTop + (this.dashGap * i);
            canvas.drawLine(this.vertLineFirstX, paddingTop, this.vertLineLastX, paddingTop, this.paintDash);
        }
        Rect rect = this.pressedRect;
        if (rect != null) {
            this.paintLine.setColor(this.colorLinePressed);
            float fCenterX = rect.centerX();
            canvas.drawLine(fCenterX, 0.0f, fCenterX, this.barBottom, this.paintLine);
        }
        this.paintLine.setColor(this.colorLineSides);
        float f = this.vertLineFirstX + (this.dashHeight / 2);
        canvas.drawLine(f, this.dashTop, f, this.barBottom, this.paintLine);
        int i2 = this.vertLineLastX;
        canvas.drawLine(i2, this.dashTop, i2, this.barBottom, this.paintLine);
    }

    private final void drawText(Canvas canvas) {
        float height = getHeight() - this.textBottom;
        this.paintText.setTextAlign(Paint.Align.LEFT);
        float f = this.vertLineLastX + this.gapUnitLine;
        canvas.drawText("0", f, this.unitZeroY, this.paintText);
        float f2 = this.durationMax / 4;
        int i = 1;
        for (int i2 = 1; i2 < 5; i2++) {
            canvas.drawText(String.valueOf((int) (i2 * f2)), f, this.unitBottom - (this.dashGap * i2), this.paintText);
        }
        Set<Rect> setKeySet = this.barInfoMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        List list = CollectionsKt___CollectionsKt.toList(setKeySet);
        this.paintText.setTextAlign(this.dateSideCenter ? Paint.Align.CENTER : Paint.Align.LEFT);
        canvas.drawText(this.dateTexts.get(0), this.dateSideCenter ? ((Rect) list.get(0)).centerX() : this.vertLineFirstX, height, this.paintText);
        this.paintText.setTextAlign(Paint.Align.CENTER);
        int size = this.dateTexts.size();
        int i3 = this.barInfoMap.size() > 12 ? 6 : 1;
        int i4 = size - 2;
        if (1 <= i4) {
            while (true) {
                canvas.drawText(this.dateTexts.get(i), ((Rect) list.get(i3 * i)).centerX(), height, this.paintText);
                if (i == i4) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.paintText.setTextAlign(this.dateSideCenter ? Paint.Align.CENTER : Paint.Align.RIGHT);
        canvas.drawText((String) CollectionsKt___CollectionsKt.last((List) this.dateTexts), this.dateSideCenter ? ((Rect) CollectionsKt___CollectionsKt.last(list)).centerX() : this.vertLineLastX, height, this.paintText);
    }

    private final void genBarData() {
        int duration;
        int duration2;
        resetBarData();
        this.totalNum = 0;
        int i = 0;
        int distance = 0;
        int calorie = 0;
        for (SportBasicReport sportBasicReport : this.recordList) {
            long startTime = sportBasicReport.getStartTime() * 1000;
            long j = this.start;
            if (startTime < this.end && j <= startTime) {
                this.totalNum++;
                String str = this.dimen;
                int monthOfYear = Intrinsics.areEqual(str, SportDataTypeKt.DIMEN_YEARLY) ? TimeDateUtil.INSTANCE.getMonthOfYear(startTime) : (Intrinsics.areEqual(str, SportDataTypeKt.DIMEN_WEEKLY) ? TimeDateUtil.INSTANCE.getDayOfWeek(startTime) : TimeDateUtil.INSTANCE.getDayOfMonth(startTime)) - 1;
                BarData barData = this.barDataMap.get(Integer.valueOf(monthOfYear));
                if (barData != null) {
                    barData.setDistance(barData.getDistance() + sportBasicReport.getDistance());
                    barData.setCalorie(barData.getCalorie() + sportBasicReport.getCalories());
                    int duration3 = barData.getDuration();
                    Integer totalDivingDuration = sportBasicReport.getTotalDivingDuration();
                    barData.setDuration(duration3 + (totalDivingDuration != null ? totalDivingDuration.intValue() : sportBasicReport.getDuration()));
                    barData.setNum(barData.getNum() + 1);
                    distance += sportBasicReport.getDistance();
                    calorie += sportBasicReport.getCalories();
                    Integer totalDivingDuration2 = sportBasicReport.getTotalDivingDuration();
                    duration2 = totalDivingDuration2 != null ? totalDivingDuration2.intValue() : sportBasicReport.getDuration();
                } else {
                    Integer totalDivingDuration3 = sportBasicReport.getTotalDivingDuration();
                    BarData barData2 = new BarData(totalDivingDuration3 != null ? totalDivingDuration3.intValue() : sportBasicReport.getDuration(), sportBasicReport.getDistance(), sportBasicReport.getCalories(), Intrinsics.areEqual(this.dimen, SportDataTypeKt.DIMEN_YEARLY) ? TimeDateUtil.INSTANCE.atStartOfMonth(startTime) : TimeDateUtil.INSTANCE.atStartOfDay(startTime), 0, false, 48, null);
                    this.barDataMap.put(Integer.valueOf(monthOfYear), barData2);
                    distance += barData2.getDistance();
                    calorie += barData2.getCalorie();
                    duration2 = barData2.getDuration();
                }
                i += duration2;
            }
        }
        BarData barData3 = new BarData(i, distance, calorie, this.start, this.totalNum, false, 32, null);
        this.totalBarData = barData3;
        Logger.d("SRecordBarView", "genBarData: total = " + barData3);
        Function1<? super BarData, Unit> function1 = this.summaryEmitter;
        if (function1 != null) {
            BarData barData4 = this.totalBarData;
            Intrinsics.checkNotNull(barData4);
            function1.invoke2(barData4);
        }
        if (this.barDataMap.size() == 0) {
            duration = 0;
        } else {
            Iterator<T> it = this.barDataMap.entrySet().iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException();
            }
            duration = ((BarData) ((Map.Entry) it.next()).getValue()).getDuration();
            while (it.hasNext()) {
                int duration4 = ((BarData) ((Map.Entry) it.next()).getValue()).getDuration();
                if (duration < duration4) {
                    duration = duration4;
                }
            }
        }
        float f = duration / 60.0f;
        int iMax = Math.max(10, (int) (1.2f * f));
        int i2 = iMax % 10;
        int i3 = i2 == 0 ? iMax : (iMax + 10) - i2;
        float f2 = i3;
        this.durationMax = f2;
        Logger.d("SRecordBarView", "genBarData: dataMax = " + f + "; amendMax = " + iMax + "; finalMax = " + i3 + "; durationMax = " + f2);
        float f3 = ((float) this.barWidth) + this.barGap;
        int i4 = this.vertLineFirstX + this.vertLine2Bar;
        int i5 = this.barSize;
        for (int i6 = 0; i6 < i5; i6++) {
            float f4 = i4 + (i6 * f3);
            float f5 = this.barWidth + f4;
            BarData barData5 = this.barDataMap.get(Integer.valueOf(i6));
            Rect rect = new Rect((int) f4, (int) (this.barBottom - ((((barData5 != null ? barData5.getDuration() : 0) / 60.0f) / f2) * this.maxBarHeight)), (int) f5, (int) this.barBottom);
            int i7 = this.barExtX;
            Rect rect2 = new Rect((int) (f4 - i7), this.dashTop, (int) (f5 + i7), (int) this.barBottom);
            this.barInfoMap.put(rect, barData5);
            this.barTouchRange.put(rect2, rect);
        }
    }

    private final void genFixedData() {
        char c;
        int daysOfMonth;
        this.dateTexts.clear();
        long j = this.end - 86400000;
        this.vertLine2Bar = ExtUtilsKt.getDp(10);
        this.dateSideCenter = true;
        String str = this.dimen;
        if (Intrinsics.areEqual(str, SportDataTypeKt.DIMEN_MONTHLY)) {
            long j2 = this.start;
            c = 1;
            long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(j2, j, 518400000L);
            if (j2 <= progressionLastElement) {
                while (true) {
                    this.dateTexts.add(TimeDateUtil.getDateMMddNumberFormat(j2));
                    if (j2 == progressionLastElement) {
                        break;
                    } else {
                        j2 += 518400000;
                    }
                }
            } else {
                j2 = 0;
            }
            if (j2 < j) {
                this.dateTexts.add(TimeDateUtil.getDateMMddNumberFormat(j));
            }
            this.barWidth = ExtUtilsKt.getDp(4);
            daysOfMonth = TimeDateUtil.INSTANCE.getDaysOfMonth(this.start);
        } else {
            c = 1;
            if (Intrinsics.areEqual(str, SportDataTypeKt.DIMEN_YEARLY)) {
                for (int i = 1; i < 13; i++) {
                    this.dateTexts.add(String.valueOf(i));
                }
                this.barWidth = ExtUtilsKt.getDp(7);
                daysOfMonth = 12;
            } else {
                for (int i2 = 0; i2 < 7; i2++) {
                    this.dateTexts.add(TimeDateUtil.getDateMMddNumberFormat(this.start + (((long) i2) * 86400000)));
                }
                this.barWidth = ExtUtilsKt.getDp(13);
                this.vertLine2Bar = ExtUtilsKt.getDp(15);
                daysOfMonth = 7;
            }
        }
        this.barSize = daysOfMonth;
        float f = this.barWidth / 2.0f;
        this.barRadius = f;
        GradientDrawable gradientDrawable = this.barDrawable;
        float[] fArr = new float[8];
        fArr[0] = f;
        fArr[c] = f;
        fArr[2] = f;
        fArr[3] = f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        gradientDrawable.setCornerRadii(fArr);
        Logger.d("SRecordBarView", "setData: texts = " + this.dateTexts);
        int width = getWidth() - getPaddingEnd();
        this.vertLineLastX = width;
        int i3 = (width - this.vertLineFirstX) - (this.vertLine2Bar * 2);
        int i4 = this.barSize;
        this.barGap = (i3 - (this.barWidth * i4)) / (i4 - 1.0f);
        this.barExtX = Intrinsics.areEqual(this.dimen, SportDataTypeKt.DIMEN_WEEKLY) ? this.barWidth / 2 : Math.min((int) (this.barGap / 2), this.barWidth);
    }

    private final Rect pressedBarRect() {
        int i = (int) this.pressX;
        int i2 = (int) this.pressY;
        Set<Rect> setKeySet = this.barTouchRange.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        for (Object obj : setKeySet) {
            if (((Rect) obj).contains(i, i2)) {
                Rect rect = (Rect) obj;
                Rect rect2 = this.barTouchRange.get(rect);
                Logger.d("SRecordBarView", "pressedBarRect: x = " + i + "; y = " + i2 + ", " + rect + ", " + rect2);
                return rect2;
            }
        }
        obj = null;
        Rect rect3 = (Rect) obj;
        Rect rect4 = this.barTouchRange.get(rect3);
        Logger.d("SRecordBarView", "pressedBarRect: x = " + i + "; y = " + i2 + ", " + rect3 + ", " + rect4);
        return rect4;
    }

    private final void resetBarData() {
        this.totalNum = 0;
        this.totalCalorie = 0;
        this.totalDistance = 0;
        this.totalDuration = 0L;
        this.barInfoMap.clear();
        this.barDataMap.clear();
        this.barTouchRange.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setData$lambda$5(RecordChartView this$0, List data, long j, long j2, String category, String dim) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        Intrinsics.checkNotNullParameter(category, "$category");
        Intrinsics.checkNotNullParameter(dim, "$dim");
        this$0.pressedRect = null;
        this$0.recordList.clear();
        List<SportBasicReport> list = this$0.recordList;
        ArrayList arrayList = new ArrayList();
        for (Object obj : data) {
            if (SportBasicReportKt.isValid((SportBasicReport) obj)) {
                arrayList.add(obj);
            }
        }
        list.addAll(arrayList);
        this$0.start = j;
        this$0.end = j2;
        this$0.category = category;
        this$0.dimen = dim;
        this$0.genFixedData();
        this$0.genBarData();
        this$0.invalidate();
    }

    public final void observerSummary(@NotNull Function1<? super BarData, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.summaryEmitter = block;
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.dateTexts.isEmpty()) {
            return;
        }
        drawLine(canvas);
        drawText(canvas);
        drawBar(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec(this.dashTop + this.maxBarHeight + this.textHeight, 1073741824));
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        Function1<? super BarData, Unit> function1;
        Intrinsics.checkNotNullParameter(event, "event");
        float x = event.getX();
        float y = event.getY();
        if (event.getAction() != 0) {
            return true;
        }
        this.pressX = x;
        this.pressY = y;
        Rect rectPressedBarRect = pressedBarRect();
        BarData barData = this.barInfoMap.get(rectPressedBarRect);
        if (rectPressedBarRect == null || barData == null || Intrinsics.areEqual(rectPressedBarRect, this.pressedRect)) {
            this.pressedRect = null;
            BarData barData2 = this.totalBarData;
            if (barData2 != null && (function1 = this.summaryEmitter) != null) {
                function1.invoke2(barData2);
            }
            invalidate();
            return false;
        }
        this.pressedRect = rectPressedBarRect;
        barData.setTotal(false);
        Function1<? super BarData, Unit> function2 = this.summaryEmitter;
        if (function2 != null) {
            function2.invoke2(barData);
        }
        invalidate();
        return true;
    }

    public final void setData(@NotNull final List<SportBasicReport> data, @NotNull final String category, @NotNull final String dim, final long start, final long end) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(dim, "dim");
        post(new Runnable() { // from class: rjj
            @Override // java.lang.Runnable
            public final void run() {
                RecordChartView.setData$lambda$5(this.f32617a, data, start, end, category, dim);
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecordChartView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RecordChartView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        int dp = ExtUtilsKt.getDp(50);
        this.dashGap = dp;
        float dp2 = ExtUtilsKt.getDp(1);
        this.dashHeight = dp2;
        int dp3 = ExtUtilsKt.getDp(10);
        this.dashTop = dp3;
        this.gapUnitLine = ExtUtilsKt.getDp(5);
        this.vertLineFirstX = getPaddingStart() + ExtUtilsKt.getDp(10);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(dp2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(ExtUtilsKt.getColor(dki.N0));
        paint.setPathEffect(new DashPathEffect(new float[]{ExtUtilsKt.getDp(4), ExtUtilsKt.getDp(2)}, 0.0f));
        this.paintDash = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(ExtUtilsKt.getColor(dki.M0));
        this.paintBar = paint2;
        this.colorLinePressed = ExtUtilsKt.getColor(dki.O0);
        this.colorLineSides = ExtUtilsKt.getColor(dki.R0);
        Paint paint3 = new Paint(1);
        paint3.setStrokeWidth(ExtUtilsKt.getDp(1));
        this.paintLine = paint3;
        this.textBottom = ExtUtilsKt.getDp(2);
        this.textHeight = ExtUtilsKt.getDp(20);
        Paint paint4 = new Paint(1);
        paint4.setColor(ExtUtilsKt.getColor(dki.P0));
        paint4.setTextSize(ExtUtilsKt.getDp(10));
        paint4.setTextAlign(Paint.Align.LEFT);
        this.paintText = paint4;
        int i2 = dp * 4;
        this.maxBarHeight = i2;
        float f = dp3 + i2;
        this.barBottom = f;
        this.barInfoMap = new LinkedHashMap<>();
        this.barTouchRange = new LinkedHashMap<>();
        Drawable drawableE = ni4.e(context, hoi.N1);
        Intrinsics.checkNotNull(drawableE, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.barDrawable = (GradientDrawable) drawableE;
        this.dateTexts = new ArrayList();
        this.category = "sport_stats_all";
        this.dimen = SportDataTypeKt.DIMEN_MONTHLY;
        this.recordList = new ArrayList();
        this.dateSideCenter = true;
        this.barDataMap = new HashMap<>();
        this.path = new Path();
        int dp4 = ExtUtilsKt.getDp(4);
        this.unitYOffset = dp4;
        this.unitBottom = ExtUtilsKt.getDp(3) + f;
        float f2 = f + dp4;
        this.unitLastY = f2;
        this.unitZeroY = f2 - ExtUtilsKt.getDp(4);
    }

    public /* synthetic */ RecordChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
