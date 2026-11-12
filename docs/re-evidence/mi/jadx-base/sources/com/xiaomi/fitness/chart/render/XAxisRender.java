package com.xiaomi.fitness.chart.render;

import android.app.Application;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry;
import com.xiaomi.fitness.chart.entrys.RecyclerBarEntry;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.a52;
import defpackage.aji;
import defpackage.fpc;
import defpackage.o8p;
import defpackage.onq;
import defpackage.qzi;
import defpackage.vqr;
import defpackage.x44;
import defpackage.xr5;
import defpackage.zi3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u00107\u001a\u00028\u0000¢\u0006\u0004\bL\u0010MJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b$\u0010\u001dJ/\u0010)\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*J/\u0010/\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020%2\u0006\u0010.\u001a\u00020%H\u0016¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u0010\u001dJ%\u00103\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u00102\u001a\u00028\u0000¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b5\u0010\u001dJ%\u00106\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b6\u0010\u001dR\u0017\u00107\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R$\u0010<\u001a\u0004\u0018\u00010;8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u0004\u0018\u00010;8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR$\u0010E\u001a\u0004\u0018\u00010;8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bE\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR\u0018\u0010H\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010=R\u0014\u0010I\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010J¨\u0006N"}, d2 = {"Lcom/xiaomi/fitness/chart/render/XAxisRender;", "La52;", "V", "", "", "initPaint", "()V", "initBgPaint", "initTextPaint", "", "childCount", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "", "getTheLastItemTime", "(ILandroidx/recyclerview/widget/RecyclerView;)Ljava/lang/String;", "position", "type", "", "dateTime", "getDateStr", "(ILjava/lang/String;J)Ljava/lang/String;", "Landroid/graphics/Canvas;", "canvas", "drawBackground", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V", "Lvqr;", "xAxis", "drawVerticalLine", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Lvqr;)V", "Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;", "barEntry", "Lonq;", "valueFormatter", "getXAxisLabel", "(Lcom/xiaomi/fitness/chart/entrys/RecyclerBarEntry;Lonq;)Ljava/lang/String;", "drawXAxis", "", "radius", "startX", "startY", "drawMark", "(Landroid/graphics/Canvas;FFF)V", "Lorg/joda/time/LocalDate;", "localDate", "centerX", "centerY", "drawSingleDate", "(Landroid/graphics/Canvas;Lorg/joda/time/LocalDate;FF)V", "drawEcgXAxis", "attrs", "drawXAxisDisplay", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;La52;)V", "drawXAxisBloodGlucose", "drawXAxisBloodGlucoseDetail", "mBarChartAttrs", "La52;", "getMBarChartAttrs", "()La52;", "Landroid/graphics/Paint;", "mTextPaint", "Landroid/graphics/Paint;", "getMTextPaint", "()Landroid/graphics/Paint;", "setMTextPaint", "(Landroid/graphics/Paint;)V", "mBgPaint", "getMBgPaint", "setMBgPaint", "mLinePaint", "getMLinePaint", "setMLinePaint", "mTargetPaint", "currentWeekSimple", "Ljava/lang/String;", "curDate", "<init>", "(La52;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nXAxisRender.kt\nKotlin\n*S Kotlin\n*F\n+ 1 XAxisRender.kt\ncom/xiaomi/fitness/chart/render/XAxisRender\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,839:1\n1#2:840\n*E\n"})
public class XAxisRender<V extends a52> {

    @NotNull
    private final String curDate;

    @NotNull
    private final String currentWeekSimple;

    @NotNull
    private final V mBarChartAttrs;

    @Nullable
    private Paint mBgPaint;

    @Nullable
    private Paint mLinePaint;

    @Nullable
    private Paint mTargetPaint;

    @Nullable
    private Paint mTextPaint;

    public XAxisRender(@NotNull V mBarChartAttrs) {
        Intrinsics.checkNotNullParameter(mBarChartAttrs, "mBarChartAttrs");
        this.mBarChartAttrs = mBarChartAttrs;
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        this.currentWeekSimple = TimeDateUtil.getWeekSimpleStr(localDateNow);
        LocalDate localDateNow2 = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow2, "now(...)");
        this.curDate = TimeDateUtil.getDateMMddNumberFormat(localDateNow2);
        initTextPaint();
        initBgPaint();
        initPaint();
    }

    private final String getDateStr(int position, String type, long dateTime) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1068487181) {
            if (iHashCode != 3076183) {
                if (iHashCode == 113008383 && type.equals("weeks")) {
                    return TimeDateUtil.getDateMMddNumberFormat(TimeDateUtil.timestampToLocalDate(dateTime + (((long) position) * 86400)));
                }
            } else if (type.equals("days")) {
                return TimeDateUtil.getDateStr(dateTime + (((long) position) * TimeDateUtil.TIME_HOUR * ((long) 6)), TimeUtils.FORMAT_H_M);
            }
        } else if (type.equals("months")) {
            LocalDate localDateMinusDays = TimeDateUtil.timestampToLocalDate(dateTime).plusMonths(1).minusDays(1);
            Intrinsics.checkNotNull(localDateMinusDays);
            return TimeDateUtil.getDayFormat(TimeDateUtil.timestampToLocalDate(dateTime + (((TimeDateUtil.localDateToTimestamp(localDateMinusDays) - dateTime) / ((long) 6)) * ((long) position))));
        }
        return TimeDateUtil.getDateHHmmFormat(dateTime + (((long) position) * TimeDateUtil.TIME_HOUR * ((long) 6)));
    }

    private final String getTheLastItemTime(int childCount, RecyclerView parent) {
        Application app = AppUtil.getApp();
        if (childCount <= 0) {
            return "";
        }
        Object tag = parent.getChildAt(0).getTag();
        Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.BloodGlucoseEntry");
        BloodGlucoseEntry bloodGlucoseEntry = (BloodGlucoseEntry) tag;
        String str = bloodGlucoseEntry.itemType;
        int iHashCode = str.hashCode();
        if (iHashCode != -1068487181) {
            if (iHashCode != 3076183) {
                if (iHashCode == 113008383 && str.equals("weeks")) {
                    LocalDate localDate = bloodGlucoseEntry.localDate;
                    LocalDate localDatePlusDays = localDate != null ? localDate.plusDays(6) : null;
                    return localDatePlusDays != null ? TimeDateUtil.getDateMMddNumberFormat(localDatePlusDays) : "";
                }
            } else if (str.equals("days")) {
                return app.getString(qzi.e);
            }
        } else if (str.equals("months")) {
            LocalDate localDateMinusDays = TimeDateUtil.getFirstDayOfMonth(bloodGlucoseEntry.localDate).plusMonths(1).minusDays(1);
            return localDateMinusDays != null ? TimeDateUtil.getDayFormat(localDateMinusDays) : "";
        }
        Long drawDetailEndTime = bloodGlucoseEntry.getDrawDetailEndTime();
        return TimeDateUtil.getDateHHmm24Format(drawDetailEndTime != null ? drawDetailEndTime.longValue() : bloodGlucoseEntry.timestamp);
    }

    private final void initBgPaint() {
        Paint paint = new Paint();
        this.mBgPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mBgPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mBgPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = this.mBgPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(-7829368);
    }

    private final void initPaint() {
        Paint paint = new Paint();
        this.mLinePaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mLinePaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mLinePaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.mLinePaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setStrokeWidth(0.75f);
        Paint paint5 = this.mLinePaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setColor(-7829368);
        Paint paint6 = new Paint();
        this.mTargetPaint = paint6;
        paint6.reset();
        Paint paint7 = this.mTargetPaint;
        if (paint7 != null) {
            paint7.setAntiAlias(true);
        }
        Paint paint8 = this.mTargetPaint;
        if (paint8 != null) {
            paint8.setColor(this.mBarChartAttrs.g0);
        }
    }

    private final void initTextPaint() {
        Paint paint = new Paint();
        this.mTextPaint = paint;
        Intrinsics.checkNotNull(paint);
        paint.reset();
        Paint paint2 = this.mTextPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setAntiAlias(true);
        Paint paint3 = this.mTextPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStyle(Paint.Style.FILL);
        Paint paint4 = this.mTextPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(-7829368);
        Paint paint5 = this.mTextPaint;
        Intrinsics.checkNotNull(paint5);
        paint5.setColor(x44.a(aji.d));
        Paint paint6 = this.mTextPaint;
        Intrinsics.checkNotNull(paint6);
        paint6.setTextSize(this.mBarChartAttrs.P);
    }

    public final void drawBackground(@Nullable Canvas canvas, @NotNull RecyclerView parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (this.mBarChartAttrs.x) {
            parent.getContext();
            Paint paint = this.mBgPaint;
            Intrinsics.checkNotNull(paint);
            int color = paint.getColor();
            Paint paint2 = this.mBgPaint;
            Intrinsics.checkNotNull(paint2);
            paint2.setColor(x44.a(aji.f1100b));
            zi3.c(new RectF(parent.getLeft(), (parent.getHeight() - parent.getPaddingBottom()) - this.mBarChartAttrs.f625a, parent.getRight(), parent.getHeight()), this.mBarChartAttrs.W, 2);
            Paint paint3 = this.mBgPaint;
            Intrinsics.checkNotNull(paint3);
            paint3.setColor(color);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    public void drawEcgXAxis(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        float f;
        int i;
        float f2;
        float f3;
        float f4;
        float f5;
        RecyclerView parent2 = parent;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent2, "parent");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        if (this.mBarChartAttrs.u) {
            float paddingBottom = parent.getPaddingBottom() + this.mBarChartAttrs.f625a;
            float fI = o8p.i(this.mTextPaint);
            float height = parent.getHeight() - paddingBottom;
            int childCount = parent.getChildCount();
            Paint paint = this.mTextPaint;
            Intrinsics.checkNotNull(paint);
            paint.setColor(xAxis.getTextColor());
            int width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingLeft() : parent.getPaddingLeft();
            int paddingRight = AppUtil.isRTLDirection() ? parent.getPaddingRight() : parent.getWidth() - parent.getPaddingRight();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = parent2.getChildAt(i2);
                int right = AppUtil.isRTLDirection() ? childAt.getRight() : childAt.getLeft();
                int left = AppUtil.isRTLDirection() ? childAt.getLeft() : childAt.getRight();
                Object tag = childAt.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) tag;
                fpc valueFormatter = xAxis.getValueFormatter();
                String xAxisLabel = valueFormatter instanceof onq ? getXAxisLabel(recyclerBarEntry, (onq) valueFormatter) : "";
                if (TextUtils.isEmpty(xAxisLabel)) {
                    f = fI;
                    height = height;
                    childCount = childCount;
                    i = i2;
                } else {
                    int width2 = childAt.getWidth();
                    Paint paint2 = this.mTextPaint;
                    Intrinsics.checkNotNull(paint2);
                    float fMeasureText = paint2.measureText(xAxisLabel);
                    float f6 = width2 - fMeasureText;
                    int i3 = i2;
                    float f7 = right;
                    float f8 = f6 / 2;
                    float f9 = AppUtil.isRTLDirection() ? f7 - f8 : f7 + f8;
                    float f10 = AppUtil.isRTLDirection() ? f9 - fMeasureText : f9 + fMeasureText;
                    if (AppUtil.isRTLDirection()) {
                        int i4 = this.mBarChartAttrs.X;
                        if (i4 == 1) {
                            f10 = left;
                            f2 = f10 - f6;
                            f3 = f2;
                        } else if (i4 == 2) {
                            float f11 = right;
                            f10 = f11 + fMeasureText;
                            f3 = f11;
                        } else {
                            f3 = f9;
                        }
                    } else {
                        int i5 = this.mBarChartAttrs.X;
                        if (i5 == 1) {
                            f2 = right;
                            f10 = f2 + fMeasureText;
                        } else if (i5 == 2) {
                            f10 = left;
                            f2 = f10 - f6;
                        } else {
                            f3 = f9;
                        }
                        f3 = f2;
                    }
                    int iDip2px = DisplayUtil.dip2px(3.0f);
                    float f12 = 2;
                    float f13 = fI / f12;
                    float fDip2px = (DisplayUtil.dip2px(14.0f) + height) - f13;
                    float f14 = fDip2px + fI;
                    f = fI;
                    int length = xAxisLabel.length();
                    if (AppUtil.isRTLDirection()) {
                        float f15 = iDip2px;
                        f4 = (f10 - f15) - f15;
                    } else {
                        f4 = iDip2px + f3 + (fMeasureText / f12);
                    }
                    float f16 = f4;
                    if (AppUtil.isRTLDirection()) {
                        f5 = f3 - iDip2px;
                    } else {
                        f5 = (fMeasureText / f12) + iDip2px + f10;
                    }
                    RectF rectF = new RectF(f16, fDip2px, f5, f14);
                    float f17 = iDip2px;
                    float fH = (o8p.h(rectF, this.mTextPaint) - f13) + f17;
                    int i6 = this.mBarChartAttrs.Z;
                    if (i6 != -1) {
                        o8p.j(this.mTextPaint, i6);
                    }
                    if (!AppUtil.isRTLDirection()) {
                        i = i3;
                        int i7 = recyclerBarEntry.type;
                        if (i7 == 6 || i7 == 5) {
                            Paint paint3 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint3);
                            canvas.drawText(xAxisLabel, (f3 - (f10 - paddingRight)) - 8, fH, paint3);
                        } else {
                            float f18 = width;
                            if (xr5.a(f3, f18) && xr5.l(f10, paddingRight)) {
                                float f19 = rectF.left;
                                Paint paint4 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint4);
                                canvas.drawText(xAxisLabel, f19, fH, paint4);
                            } else if (f3 >= f18 || f10 <= f18) {
                                float f20 = paddingRight;
                                if (f10 > f20 && f3 < f20 && !this.mBarChartAttrs.a0) {
                                    float f21 = (f3 - (f10 - f20)) - 8;
                                    Paint paint5 = this.mTextPaint;
                                    Intrinsics.checkNotNull(paint5);
                                    canvas.drawText(xAxisLabel, f21, fH, paint5);
                                }
                            } else {
                                float f22 = f18 + f17;
                                Paint paint6 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint6);
                                canvas.drawText(xAxisLabel, f22, fH, paint6);
                            }
                        }
                    } else if (xr5.l(f10, width) && xr5.a(f3, paddingRight)) {
                        float f23 = rectF.left;
                        Paint paint7 = this.mTextPaint;
                        Intrinsics.checkNotNull(paint7);
                        canvas.drawText(xAxisLabel, f23, fH, paint7);
                        i = i3;
                    } else {
                        float f24 = width;
                        if (f3 <= f24 || f10 >= f24) {
                            i = i3;
                            float f25 = paddingRight;
                            if (f10 < f25 && f3 > f25) {
                                Paint paint8 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint8);
                                canvas.drawText(xAxisLabel, length - ((int) (((f3 - f25) / fMeasureText) * length)), length, f24 + f17, fH, paint8);
                            }
                        } else {
                            int i8 = (int) ((((f24 - f10) + 1) / fMeasureText) * length);
                            if (i8 < length) {
                                i8++;
                            }
                            Paint paint9 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint9);
                            i = i3;
                            canvas.drawText(xAxisLabel, 0, i8, f3, fH, paint9);
                        }
                    }
                }
                i2 = i + 1;
                parent2 = parent;
                fI = f;
                height = height;
                childCount = childCount;
            }
        }
    }

    public void drawMark(@NotNull Canvas canvas, float radius, float startX, float startY) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float dp = ExtUtilsKt.getDp(13);
        float dp2 = ExtUtilsKt.getDp(2);
        Paint paint = this.mTargetPaint;
        Intrinsics.checkNotNull(paint);
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = this.mTargetPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = this.mTargetPaint;
        Intrinsics.checkNotNull(paint3);
        paint3.setStrokeWidth(dp2);
        Paint paint4 = this.mTargetPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.setColor(-1);
        canvas.save();
        canvas.translate(startX, startY);
        canvas.translate(-(radius / 8.0f), radius / 3.0f);
        canvas.rotate(-45.0f);
        Path path = new Path();
        path.reset();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(dp, 0.0f);
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (-dp) / 2.0f);
        Paint paint5 = this.mTargetPaint;
        Intrinsics.checkNotNull(paint5);
        canvas.drawPath(path, paint5);
        canvas.restore();
    }

    public void drawSingleDate(@NotNull Canvas canvas, @NotNull LocalDate localDate, float centerX, float centerY) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(localDate, "localDate");
        int i = localDate.dayOfMonth().get();
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String string = sb.toString();
        Paint paint = this.mTextPaint;
        Intrinsics.checkNotNull(paint);
        paint.setTextSize(ExtUtilsKt.getSp(12));
        Paint paint2 = this.mTextPaint;
        Intrinsics.checkNotNull(paint2);
        paint2.setColor(x44.a(aji.d0));
        Paint paint3 = this.mTextPaint;
        Intrinsics.checkNotNull(paint3);
        float fMeasureText = paint3.measureText(string);
        Rect rect = new Rect();
        Paint paint4 = this.mTextPaint;
        Intrinsics.checkNotNull(paint4);
        paint4.getTextBounds(string, 0, string.length(), rect);
        float f = centerX - (fMeasureText / 2);
        float f2 = centerY + ((rect.bottom - rect.top) / 2.0f);
        Paint paint5 = this.mTextPaint;
        Intrinsics.checkNotNull(paint5);
        canvas.drawText(string, f, f2, paint5);
        Paint paint6 = this.mTextPaint;
        Intrinsics.checkNotNull(paint6);
        paint6.setTextSize(this.mBarChartAttrs.P);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0102  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x012f  */
    /* JADX WARN: Code duplicated, block: B:67:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x015b A[SYNTHETIC] */
    public void drawVerticalLine(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        V v;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        if (this.mBarChartAttrs.q) {
            int paddingTop = parent.getPaddingTop();
            int height = parent.getHeight() - parent.getPaddingBottom();
            int width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingRight() : parent.getPaddingLeft();
            int paddingLeft = AppUtil.isRTLDirection() ? parent.getPaddingLeft() : parent.getWidth() - parent.getPaddingRight();
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = parent.getChildAt(i);
                int childAdapterPosition = parent.getChildAdapterPosition(childAt);
                if (childAdapterPosition != -1) {
                    RecyclerView.Adapter adapter = parent.getAdapter();
                    Intrinsics.checkNotNull(adapter);
                    int itemViewType = adapter.getItemViewType(childAdapterPosition);
                    RecyclerView.Adapter adapter2 = parent.getAdapter();
                    StringBuilder sb = new StringBuilder();
                    sb.append(" type:");
                    sb.append(itemViewType);
                    sb.append(" adapter:");
                    sb.append(adapter2);
                    float right = AppUtil.isRTLDirection() ? childAt.getRight() : childAt.getLeft();
                    float left = AppUtil.isRTLDirection() ? childAt.getLeft() : childAt.getRight();
                    if (AppUtil.isRTLDirection()) {
                        if (right <= width && right >= paddingLeft) {
                            v = this.mBarChartAttrs;
                            if (v.Y != 2) {
                                left = right;
                            }
                            if (itemViewType == 1) {
                                if (v.f628r) {
                                    Paint paint = this.mLinePaint;
                                    Intrinsics.checkNotNull(paint);
                                    paint.setColor(xAxis.f37145b);
                                    Path path = new Path();
                                    path.moveTo(left, (height - this.mBarChartAttrs.f625a) + DisplayUtil.dip2px(14.0f));
                                    path.lineTo(left, paddingTop);
                                    Paint paint2 = this.mLinePaint;
                                    Intrinsics.checkNotNull(paint2);
                                    canvas.drawPath(path, paint2);
                                }
                            } else if (itemViewType != 2) {
                                if (itemViewType != 3) {
                                    if (itemViewType != 4) {
                                        if (v.f628r) {
                                            Paint paint3 = this.mLinePaint;
                                            Intrinsics.checkNotNull(paint3);
                                            paint3.setColor(xAxis.f37145b);
                                            Path path2 = new Path();
                                            path2.moveTo(left, (height - this.mBarChartAttrs.f625a) + DisplayUtil.dip2px(14.0f));
                                            path2.lineTo(left, paddingTop);
                                            Paint paint4 = this.mLinePaint;
                                            Intrinsics.checkNotNull(paint4);
                                            canvas.drawPath(path2, paint4);
                                        }
                                    }
                                } else if (v.t) {
                                    Paint paint5 = this.mLinePaint;
                                    Intrinsics.checkNotNull(paint5);
                                    paint5.setColor(xAxis.d);
                                    Path path3 = new Path();
                                    path3.moveTo(right, height - this.mBarChartAttrs.f625a);
                                    path3.lineTo(right, paddingTop);
                                    Paint paint6 = this.mLinePaint;
                                    Intrinsics.checkNotNull(paint6);
                                    canvas.drawPath(path3, paint6);
                                }
                            } else if (v.s) {
                                Paint paint7 = this.mLinePaint;
                                Intrinsics.checkNotNull(paint7);
                                paint7.setColor(xAxis.c);
                                Path path4 = new Path();
                                path4.moveTo(right, height - this.mBarChartAttrs.f625a);
                                path4.lineTo(right, paddingTop);
                                Paint paint8 = this.mLinePaint;
                                Intrinsics.checkNotNull(paint8);
                                canvas.drawPath(path4, paint8);
                            }
                        }
                    } else if (right <= paddingLeft && right >= width) {
                        v = this.mBarChartAttrs;
                        if (v.Y != 2) {
                            left = right;
                        }
                        if (itemViewType == 1) {
                            if (v.f628r) {
                                Paint paint9 = this.mLinePaint;
                                Intrinsics.checkNotNull(paint9);
                                paint9.setColor(xAxis.f37145b);
                                Path path5 = new Path();
                                path5.moveTo(left, (height - this.mBarChartAttrs.f625a) + DisplayUtil.dip2px(14.0f));
                                path5.lineTo(left, paddingTop);
                                Paint paint10 = this.mLinePaint;
                                Intrinsics.checkNotNull(paint10);
                                canvas.drawPath(path5, paint10);
                            }
                        } else if (itemViewType != 2) {
                            if (itemViewType != 3) {
                                if (itemViewType != 4) {
                                    if (v.f628r) {
                                        Paint paint11 = this.mLinePaint;
                                        Intrinsics.checkNotNull(paint11);
                                        paint11.setColor(xAxis.f37145b);
                                        Path path6 = new Path();
                                        path6.moveTo(left, (height - this.mBarChartAttrs.f625a) + DisplayUtil.dip2px(14.0f));
                                        path6.lineTo(left, paddingTop);
                                        Paint paint12 = this.mLinePaint;
                                        Intrinsics.checkNotNull(paint12);
                                        canvas.drawPath(path6, paint12);
                                    }
                                }
                            } else if (v.t) {
                                Paint paint13 = this.mLinePaint;
                                Intrinsics.checkNotNull(paint13);
                                paint13.setColor(xAxis.d);
                                Path path7 = new Path();
                                path7.moveTo(right, height - this.mBarChartAttrs.f625a);
                                path7.lineTo(right, paddingTop);
                                Paint paint14 = this.mLinePaint;
                                Intrinsics.checkNotNull(paint14);
                                canvas.drawPath(path7, paint14);
                            }
                        } else if (v.s) {
                            Paint paint15 = this.mLinePaint;
                            Intrinsics.checkNotNull(paint15);
                            paint15.setColor(xAxis.c);
                            Path path8 = new Path();
                            path8.moveTo(right, height - this.mBarChartAttrs.f625a);
                            path8.lineTo(right, paddingTop);
                            Paint paint16 = this.mLinePaint;
                            Intrinsics.checkNotNull(paint16);
                            canvas.drawPath(path8, paint16);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:146:0x032d  */
    /* JADX WARN: Code duplicated, block: B:148:0x033c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0353  */
    /* JADX WARN: Code duplicated, block: B:152:0x0357  */
    /* JADX WARN: Code duplicated, block: B:155:0x0364  */
    /* JADX WARN: Code duplicated, block: B:158:0x036d  */
    /* JADX WARN: Code duplicated, block: B:160:0x037a  */
    /* JADX WARN: Code duplicated, block: B:174:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:176:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:179:0x03be  */
    /* JADX WARN: Code duplicated, block: B:182:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:185:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:188:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:190:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:193:0x040d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0418  */
    /* JADX WARN: Code duplicated, block: B:201:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:55:0x0130  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    public void drawXAxis(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        int i;
        float f;
        float f2;
        RectF rectF;
        RecyclerBarEntry recyclerBarEntry;
        String str;
        float dp;
        LocalDate localDate;
        float f3;
        float f4;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        RectF rectF2;
        Paint paint5;
        float y;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        Paint paint9;
        RecyclerView parent2 = parent;
        vqr xAxis2 = xAxis;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent2, "parent");
        Intrinsics.checkNotNullParameter(xAxis2, "xAxis");
        if (this.mBarChartAttrs.u) {
            float paddingBottom = parent.getPaddingBottom() + this.mBarChartAttrs.f625a;
            float fI = o8p.i(this.mTextPaint);
            float height = parent.getHeight() - paddingBottom;
            int childCount = parent.getChildCount();
            Paint paint10 = this.mTextPaint;
            Intrinsics.checkNotNull(paint10);
            paint10.setColor(xAxis.getTextColor());
            int width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingLeft() : parent.getPaddingLeft();
            int paddingRight = AppUtil.isRTLDirection() ? parent.getPaddingRight() : parent.getWidth() - parent.getPaddingRight();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = parent2.getChildAt(i2);
                int right = AppUtil.isRTLDirection() ? childAt.getRight() : childAt.getLeft();
                int left = AppUtil.isRTLDirection() ? childAt.getLeft() : childAt.getRight();
                Object tag = childAt.getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
                RecyclerBarEntry recyclerBarEntry2 = (RecyclerBarEntry) tag;
                fpc valueFormatter = xAxis.getValueFormatter();
                LocalDate localDate2 = recyclerBarEntry2.localDate;
                String dateMMddNumberFormat = localDate2 != null ? TimeDateUtil.getDateMMddNumberFormat(localDate2) : null;
                int i3 = i2;
                String xAxisLabel = valueFormatter instanceof onq ? getXAxisLabel(recyclerBarEntry2, (onq) valueFormatter) : "";
                if (TextUtils.isEmpty(xAxisLabel)) {
                    height = height;
                    childCount = childCount;
                    i = i3;
                } else {
                    int width2 = childAt.getWidth();
                    Paint paint11 = this.mTextPaint;
                    Intrinsics.checkNotNull(paint11);
                    float fMeasureText = paint11.measureText(xAxisLabel);
                    if (xAxis2.h) {
                        float f5 = width2;
                        if (fMeasureText > f5) {
                            Paint paint12 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint12);
                            Paint paint13 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint13);
                            paint12.setTextSize((paint13.getTextSize() * f5) / fMeasureText);
                            Paint paint14 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint14);
                            fMeasureText = paint14.measureText(xAxisLabel);
                        }
                    }
                    float f6 = fMeasureText;
                    float f7 = width2 - f6;
                    float f8 = AppUtil.isRTLDirection() ? right - (f7 / 2) : right + (f7 / 2);
                    float f9 = AppUtil.isRTLDirection() ? f8 - f6 : f8 + f6;
                    if (AppUtil.isRTLDirection()) {
                        int i4 = this.mBarChartAttrs.X;
                        if (i4 == 1) {
                            f9 = left;
                            f = f9 - f7;
                            f2 = f;
                        } else if (i4 == 2) {
                            float f10 = right;
                            f9 = f10 + f6;
                            f2 = f10;
                        } else {
                            f2 = f8;
                        }
                    } else {
                        int i5 = this.mBarChartAttrs.X;
                        if (i5 == 1) {
                            f = right;
                            f9 = f + f6;
                        } else if (i5 == 2) {
                            f9 = left;
                            f = f9 - f7;
                        } else {
                            f2 = f8;
                        }
                        f2 = f;
                    }
                    float f11 = 2;
                    float dp2 = (ExtUtilsKt.getDp(xAxis2.g ? 25 : 20) + height) - (fI / f11);
                    float f12 = dp2 + fI;
                    int length = xAxisLabel.length();
                    RectF rectF3 = new RectF(AppUtil.isRTLDirection() ? f9 : f2, dp2, AppUtil.isRTLDirection() ? f2 : f9, f12);
                    float fH = o8p.h(rectF3, this.mTextPaint) - 20;
                    if (Intrinsics.areEqual(this.currentWeekSimple, xAxisLabel) && Intrinsics.areEqual(this.curDate, dateMMddNumberFormat) && xAxis2.f) {
                        int dp3 = ExtUtilsKt.getDp(6);
                        int dp4 = ExtUtilsKt.getDp(2);
                        int dp5 = ExtUtilsKt.getDp(2);
                        int dp6 = ExtUtilsKt.getDp(2);
                        Paint paint15 = this.mTextPaint;
                        Intrinsics.checkNotNull(paint15);
                        float f13 = (fH - fI) + paint15.getFontMetrics().descent;
                        float f14 = dp3;
                        RectF rectF4 = new RectF(rectF3.left - f14, f13 - dp5, rectF3.right + f14, f13 + fI + dp4);
                        Paint paint16 = this.mTargetPaint;
                        if (paint16 != null) {
                            paint16.setColor(this.mBarChartAttrs.g0);
                        }
                        Paint paint17 = this.mTargetPaint;
                        if (paint17 != null) {
                            paint17.setStyle(Paint.Style.FILL);
                        }
                        Paint paint18 = this.mTargetPaint;
                        if (paint18 != null) {
                            float f15 = dp6;
                            canvas.drawRoundRect(rectF4, f15, f15, paint18);
                        }
                        Paint paint19 = this.mTextPaint;
                        Intrinsics.checkNotNull(paint19);
                        paint19.setColor(-1);
                    } else {
                        Paint paint20 = this.mTextPaint;
                        Intrinsics.checkNotNull(paint20);
                        paint20.setColor(xAxis.getTextColor());
                    }
                    int i6 = this.mBarChartAttrs.Z;
                    if (i6 != -1) {
                        o8p.j(this.mTextPaint, i6);
                    }
                    if (AppUtil.isRTLDirection()) {
                        if (xr5.l(f9, width) && xr5.a(f2, paddingRight)) {
                            float f16 = rectF3.left;
                            Paint paint21 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint21);
                            canvas.drawText(xAxisLabel, f16, fH, paint21);
                            rectF = rectF3;
                            i = i3;
                            recyclerBarEntry = recyclerBarEntry2;
                        } else {
                            String str2 = xAxisLabel;
                            float f17 = width;
                            if (f2 <= f17 || f9 >= f17) {
                                rectF = rectF3;
                                i = i3;
                                recyclerBarEntry = recyclerBarEntry2;
                                float f18 = paddingRight;
                                if (f9 < f18 && f2 > f18) {
                                    Paint paint22 = this.mTextPaint;
                                    Intrinsics.checkNotNull(paint22);
                                    canvas.drawText(str2, length - ((int) (((f2 - f18) / f6) * length)), length, f17, fH, paint22);
                                }
                            } else {
                                int i7 = (int) ((((f17 - f9) + 1) / f6) * length);
                                if (i7 < length) {
                                    i7++;
                                }
                                Paint paint23 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint23);
                                rectF = rectF3;
                                recyclerBarEntry = recyclerBarEntry2;
                                i = i3;
                                canvas.drawText(str2, 0, i7, f2, fH, paint23);
                            }
                        }
                        if (xAxis.g) {
                            dp = ExtUtilsKt.getDp(13);
                            localDate = recyclerBarEntry.localDate;
                            if (localDate != null) {
                                f3 = rectF.left + (f6 / f11);
                                f4 = rectF.bottom + dp;
                                Intrinsics.checkNotNull(localDate);
                                if (localDate.isAfter(LocalDate.now())) {
                                    paint7 = this.mTargetPaint;
                                    if (paint7 != null) {
                                        paint7.setColor(x44.a(aji.b0));
                                    }
                                    paint8 = this.mTargetPaint;
                                    if (paint8 != null) {
                                        paint8.setStyle(Paint.Style.FILL);
                                    }
                                    paint9 = this.mTargetPaint;
                                    if (paint9 != null) {
                                        canvas.drawCircle(f3, f4, dp, paint9);
                                    }
                                    LocalDate localDate3 = recyclerBarEntry.localDate;
                                    Intrinsics.checkNotNull(localDate3);
                                    drawSingleDate(canvas, localDate3, f3, f4);
                                } else if (recyclerBarEntry.getY() >= recyclerBarEntry.getGoalValue() || recyclerBarEntry.getGoalValue() <= 0) {
                                    paint = this.mTargetPaint;
                                    if (paint != null) {
                                        paint.setColor(x44.a(aji.c0));
                                    }
                                    paint2 = this.mTargetPaint;
                                    if (paint2 != null) {
                                        paint2.setStyle(Paint.Style.STROKE);
                                    }
                                    paint3 = this.mTargetPaint;
                                    if (paint3 != null) {
                                        paint3.setStrokeWidth(ExtUtilsKt.getDp(2));
                                    }
                                    paint4 = this.mTargetPaint;
                                    if (paint4 != null) {
                                        canvas.drawCircle(f3, f4, dp, paint4);
                                    }
                                    float f19 = rectF.bottom;
                                    rectF2 = new RectF(f3 - dp, f19, f3 + dp, (dp * f11) + f19);
                                    if (recyclerBarEntry.getGoalValue() > 0) {
                                        paint5 = this.mTargetPaint;
                                        if (paint5 != null) {
                                            paint5.setColor(this.mBarChartAttrs.g0);
                                        }
                                        y = (SpatialRelationUtil.A_CIRCLE_DEGREE * recyclerBarEntry.getY()) / recyclerBarEntry.getGoalValue();
                                        paint6 = this.mTargetPaint;
                                        if (paint6 != null) {
                                            canvas.drawArc(rectF2, -90.0f, y, false, paint6);
                                        }
                                    }
                                    LocalDate localDate4 = recyclerBarEntry.localDate;
                                    Intrinsics.checkNotNull(localDate4);
                                    drawSingleDate(canvas, localDate4, f3, f4);
                                } else {
                                    Paint paint24 = this.mTargetPaint;
                                    if (paint24 != null) {
                                        paint24.setColor(this.mBarChartAttrs.g0);
                                    }
                                    Paint paint25 = this.mTargetPaint;
                                    if (paint25 != null) {
                                        paint25.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint26 = this.mTargetPaint;
                                    if (paint26 != null) {
                                        canvas.drawCircle(f3, f4, dp, paint26);
                                    }
                                    drawMark(canvas, dp, f3, f4);
                                }
                            }
                        }
                    } else {
                        rectF = rectF3;
                        i = i3;
                        recyclerBarEntry = recyclerBarEntry2;
                        int i8 = recyclerBarEntry.type;
                        if (i8 == 6 || i8 == 5) {
                            str = xAxisLabel;
                            str = xAxisLabel;
                            Paint paint27 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint27);
                            canvas.drawText(str, (f2 - (f9 - paddingRight)) - 8, fH, paint27);
                        } else {
                            float f20 = width;
                            if (xr5.a(f2, f20) && xr5.l(f9, paddingRight)) {
                                str = xAxisLabel;
                                float f21 = rectF.left;
                                Paint paint28 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint28);
                                canvas.drawText(str, f21, fH, paint28);
                            } else {
                                str = xAxisLabel;
                                str = xAxisLabel;
                                if (f2 >= f20 || f9 <= f20) {
                                    float f22 = paddingRight;
                                    if (f9 > f22 && f2 < f22 && !this.mBarChartAttrs.a0) {
                                        float f23 = (f2 - (f9 - f22)) - 8;
                                        Paint paint29 = this.mTextPaint;
                                        Intrinsics.checkNotNull(paint29);
                                        canvas.drawText(str, f23, fH, paint29);
                                    }
                                } else {
                                    Paint paint30 = this.mTextPaint;
                                    Intrinsics.checkNotNull(paint30);
                                    canvas.drawText(str, f20, fH, paint30);
                                }
                            }
                        }
                    }
                    if (xAxis.g) {
                        dp = ExtUtilsKt.getDp(13);
                        localDate = recyclerBarEntry.localDate;
                        if (localDate != null) {
                            f3 = rectF.left + (f6 / f11);
                            f4 = rectF.bottom + dp;
                            Intrinsics.checkNotNull(localDate);
                            if (localDate.isAfter(LocalDate.now())) {
                                paint7 = this.mTargetPaint;
                                if (paint7 != null) {
                                    paint7.setColor(x44.a(aji.b0));
                                }
                                paint8 = this.mTargetPaint;
                                if (paint8 != null) {
                                    paint8.setStyle(Paint.Style.FILL);
                                }
                                paint9 = this.mTargetPaint;
                                if (paint9 != null) {
                                    canvas.drawCircle(f3, f4, dp, paint9);
                                }
                                LocalDate localDate5 = recyclerBarEntry.localDate;
                                Intrinsics.checkNotNull(localDate5);
                                drawSingleDate(canvas, localDate5, f3, f4);
                            } else if (recyclerBarEntry.getY() >= recyclerBarEntry.getGoalValue()) {
                                paint = this.mTargetPaint;
                                if (paint != null) {
                                    paint.setColor(x44.a(aji.c0));
                                }
                                paint2 = this.mTargetPaint;
                                if (paint2 != null) {
                                    paint2.setStyle(Paint.Style.STROKE);
                                }
                                paint3 = this.mTargetPaint;
                                if (paint3 != null) {
                                    paint3.setStrokeWidth(ExtUtilsKt.getDp(2));
                                }
                                paint4 = this.mTargetPaint;
                                if (paint4 != null) {
                                    canvas.drawCircle(f3, f4, dp, paint4);
                                }
                                float f110 = rectF.bottom;
                                rectF2 = new RectF(f3 - dp, f110, f3 + dp, (dp * f11) + f110);
                                if (recyclerBarEntry.getGoalValue() > 0) {
                                    paint5 = this.mTargetPaint;
                                    if (paint5 != null) {
                                        paint5.setColor(this.mBarChartAttrs.g0);
                                    }
                                    y = (SpatialRelationUtil.A_CIRCLE_DEGREE * recyclerBarEntry.getY()) / recyclerBarEntry.getGoalValue();
                                    paint6 = this.mTargetPaint;
                                    if (paint6 != null) {
                                        canvas.drawArc(rectF2, -90.0f, y, false, paint6);
                                    }
                                }
                                LocalDate localDate6 = recyclerBarEntry.localDate;
                                Intrinsics.checkNotNull(localDate6);
                                drawSingleDate(canvas, localDate6, f3, f4);
                            } else {
                                paint = this.mTargetPaint;
                                if (paint != null) {
                                    paint.setColor(x44.a(aji.c0));
                                }
                                paint2 = this.mTargetPaint;
                                if (paint2 != null) {
                                    paint2.setStyle(Paint.Style.STROKE);
                                }
                                paint3 = this.mTargetPaint;
                                if (paint3 != null) {
                                    paint3.setStrokeWidth(ExtUtilsKt.getDp(2));
                                }
                                paint4 = this.mTargetPaint;
                                if (paint4 != null) {
                                    canvas.drawCircle(f3, f4, dp, paint4);
                                }
                                float f111 = rectF.bottom;
                                rectF2 = new RectF(f3 - dp, f111, f3 + dp, (dp * f11) + f111);
                                if (recyclerBarEntry.getGoalValue() > 0) {
                                    paint5 = this.mTargetPaint;
                                    if (paint5 != null) {
                                        paint5.setColor(this.mBarChartAttrs.g0);
                                    }
                                    y = (SpatialRelationUtil.A_CIRCLE_DEGREE * recyclerBarEntry.getY()) / recyclerBarEntry.getGoalValue();
                                    paint6 = this.mTargetPaint;
                                    if (paint6 != null) {
                                        canvas.drawArc(rectF2, -90.0f, y, false, paint6);
                                    }
                                }
                                LocalDate localDate7 = recyclerBarEntry.localDate;
                                Intrinsics.checkNotNull(localDate7);
                                drawSingleDate(canvas, localDate7, f3, f4);
                            }
                        }
                    }
                }
                i2 = i + 1;
                parent2 = parent;
                xAxis2 = xAxis;
                childCount = childCount;
                height = height;
            }
        }
    }

    public final void drawXAxisBloodGlucose(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        Canvas canvas2;
        float f;
        int i;
        float f2;
        String str;
        float f3;
        int i2;
        float f4;
        float f5;
        int i3;
        RecyclerView parent2 = parent;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent2, "parent");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        if (this.mBarChartAttrs.u) {
            float paddingBottom = parent.getPaddingBottom() + this.mBarChartAttrs.f625a;
            float fI = o8p.i(this.mTextPaint);
            float height = parent.getHeight() - paddingBottom;
            int childCount = parent.getChildCount();
            String str2 = "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry";
            if (childCount > 0) {
                Object tag = parent2.getChildAt(parent.getChildCount() - 1).getTag();
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
                childCount = Intrinsics.areEqual(((RecyclerBarEntry) tag).itemType, "days") ? 4 : 6;
            }
            int i4 = childCount;
            Paint paint = this.mTextPaint;
            Intrinsics.checkNotNull(paint);
            paint.setColor(xAxis.getTextColor());
            int width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingLeft() : parent.getPaddingLeft();
            int paddingRight = AppUtil.isRTLDirection() ? parent.getPaddingRight() : parent.getWidth() - parent.getPaddingRight();
            String theLastItemTime = getTheLastItemTime(i4, parent2);
            Paint paint2 = this.mTextPaint;
            Intrinsics.checkNotNull(paint2);
            float fMeasureText = paint2.measureText(theLastItemTime);
            float f6 = AppUtil.isRTLDirection() ? paddingRight + fMeasureText : paddingRight - fMeasureText;
            float f7 = 2;
            float f8 = (height + (paddingBottom / f7)) - (fI / f7);
            float f9 = fI + f8;
            RectF rectF = new RectF(f6, f8, AppUtil.isRTLDirection() ? f6 - fMeasureText : fMeasureText + f6, f9);
            float f10 = 20;
            float fH = o8p.h(rectF, this.mTextPaint) - f10;
            float f11 = rectF.left;
            Paint paint3 = this.mTextPaint;
            Intrinsics.checkNotNull(paint3);
            canvas.drawText(theLastItemTime, f11, fH, paint3);
            int i5 = 0;
            int i6 = 0;
            while (i6 < i4) {
                View childAt = parent2.getChildAt(i5);
                int width2 = childAt.getWidth() / i4;
                int right = AppUtil.isRTLDirection() ? childAt.getRight() - (width2 * i6) : childAt.getLeft() + (width2 * i6);
                int right2 = AppUtil.isRTLDirection() ? childAt.getRight() - (width2 * (i6 + 1)) : childAt.getLeft() + (width2 * (i6 + 1));
                Object tag2 = childAt.getTag();
                Intrinsics.checkNotNull(tag2, str2);
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) tag2;
                String dateStr = xAxis.getValueFormatter() instanceof onq ? getDateStr(i6, recyclerBarEntry.itemType, recyclerBarEntry.timestamp) : "";
                if (TextUtils.isEmpty(dateStr)) {
                    canvas2 = canvas;
                    f = f8;
                    i = i6;
                    f2 = f10;
                    str = str2;
                    f3 = f9;
                    i2 = paddingRight;
                } else {
                    int width3 = childAt.getWidth() / i4;
                    Paint paint4 = this.mTextPaint;
                    Intrinsics.checkNotNull(paint4);
                    float fMeasureText2 = paint4.measureText(dateStr);
                    float f12 = width3 - fMeasureText2;
                    float f13 = AppUtil.isRTLDirection() ? right + (fMeasureText2 / f7) : right - (fMeasureText2 / f7);
                    float f14 = AppUtil.isRTLDirection() ? f13 - fMeasureText2 : f13 + fMeasureText2;
                    if (AppUtil.isRTLDirection()) {
                        i = i6;
                        int i7 = this.mBarChartAttrs.X;
                        if (i7 == 1) {
                            f4 = right2;
                            f5 = f4 - f12;
                        } else if (i7 == 2) {
                            float f15 = right;
                            f5 = f15;
                            f4 = f15 + fMeasureText2;
                        } else {
                            f4 = f14;
                            f5 = f13;
                        }
                    } else {
                        i = i6;
                        int i8 = this.mBarChartAttrs.X;
                        if (i8 == 1) {
                            float f16 = right;
                            f5 = f16;
                            f4 = f16 + fMeasureText2;
                        } else if (i8 == 2) {
                            f4 = right2;
                            f5 = f4 - f12;
                        } else {
                            f4 = f14;
                            f5 = f13;
                        }
                    }
                    int length = dateStr.length();
                    str = str2;
                    RectF rectF2 = new RectF(AppUtil.isRTLDirection() ? f4 : f5, f8, AppUtil.isRTLDirection() ? f5 : f4, f9);
                    float fH2 = o8p.h(rectF2, this.mTextPaint) - f10;
                    int i9 = this.mBarChartAttrs.Z;
                    float f17 = f9;
                    if (i9 != -1) {
                        o8p.j(this.mTextPaint, i9);
                    }
                    if (AppUtil.isRTLDirection()) {
                        if (xr5.l(f4, width)) {
                            i3 = paddingRight;
                            if (xr5.a(f5, i3)) {
                                float f18 = rectF2.left;
                                Paint paint5 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint5);
                                canvas.drawText(dateStr, f18, fH2, paint5);
                                f2 = f10;
                                i2 = i3;
                                canvas2 = canvas;
                                f3 = f17;
                                f = f8;
                            }
                        } else {
                            i3 = paddingRight;
                        }
                        float f19 = width;
                        if (f5 <= f19 || f4 >= f19) {
                            f2 = f10;
                            f3 = f17;
                            f = f8;
                            float f20 = i3;
                            if (f4 < f20 && f5 > f20) {
                                int i10 = length - ((int) (((f5 - f20) / fMeasureText2) * length));
                                Paint paint6 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint6);
                                canvas.drawText(dateStr, i10, length, f19, fH2, paint6);
                            }
                        } else {
                            int i11 = (int) ((((f19 - f4) + 1) / fMeasureText2) * length);
                            if (i11 < length) {
                                i11++;
                            }
                            Paint paint7 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint7);
                            f3 = f17;
                            f = f8;
                            f2 = f10;
                            canvas.drawText(dateStr, 0, i11, f5, fH2, paint7);
                        }
                        i2 = i3;
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        f2 = f10;
                        i2 = paddingRight;
                        f3 = f17;
                        f = f8;
                        int i12 = recyclerBarEntry.type;
                        if (i12 == 6 || i12 == 5) {
                            Paint paint8 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint8);
                            canvas2.drawText(dateStr, (f5 - (f4 - i2)) - 8, fH2, paint8);
                        } else {
                            float f21 = width;
                            if (xr5.a(f5, f21) && xr5.l(f4, i2)) {
                                float f22 = rectF2.left;
                                Paint paint9 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint9);
                                canvas2.drawText(dateStr, f22, fH2, paint9);
                            } else if (f5 >= f21 || f4 <= f21) {
                                float f23 = i2;
                                if (f4 > f23 && f5 < f23 && !this.mBarChartAttrs.a0) {
                                    float f24 = (f5 - (f4 - f23)) - 8;
                                    Paint paint10 = this.mTextPaint;
                                    Intrinsics.checkNotNull(paint10);
                                    canvas2.drawText(dateStr, f24, fH2, paint10);
                                }
                            } else {
                                Paint paint11 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint11);
                                canvas2.drawText(dateStr, f21, fH2, paint11);
                            }
                        }
                    }
                }
                i6 = i + 1;
                parent2 = parent;
                paddingRight = i2;
                f9 = f3;
                str2 = str;
                f8 = f;
                f10 = f2;
                i5 = 0;
            }
        }
    }

    public final void drawXAxisBloodGlucoseDetail(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull vqr xAxis) {
        float f;
        float f2;
        float f3;
        int i;
        float f4;
        char c;
        float f5;
        float f6;
        RecyclerView parent2 = parent;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent2, "parent");
        Intrinsics.checkNotNullParameter(xAxis, "xAxis");
        if (this.mBarChartAttrs.u) {
            float paddingBottom = parent.getPaddingBottom() + this.mBarChartAttrs.f625a;
            float fI = o8p.i(this.mTextPaint);
            float height = parent.getHeight() - paddingBottom;
            int childCount = parent.getChildCount();
            Paint paint = this.mTextPaint;
            Intrinsics.checkNotNull(paint);
            paint.setColor(xAxis.getTextColor());
            int width = AppUtil.isRTLDirection() ? parent.getWidth() - parent.getPaddingLeft() : parent.getPaddingLeft();
            int paddingRight = AppUtil.isRTLDirection() ? parent.getPaddingRight() : parent.getWidth() - parent.getPaddingRight();
            String theLastItemTime = getTheLastItemTime(childCount, parent2);
            Paint paint2 = this.mTextPaint;
            Intrinsics.checkNotNull(paint2);
            float fMeasureText = paint2.measureText(theLastItemTime);
            float f7 = AppUtil.isRTLDirection() ? paddingRight + fMeasureText : paddingRight - fMeasureText;
            float f8 = 2;
            float f9 = (height + (paddingBottom / f8)) - (fI / f8);
            float f10 = f9 + fI;
            RectF rectF = new RectF(f7, f9, AppUtil.isRTLDirection() ? f7 - fMeasureText : fMeasureText + f7, f10);
            float f11 = 20;
            float fH = o8p.h(rectF, this.mTextPaint) - f11;
            float f12 = rectF.left;
            Paint paint3 = this.mTextPaint;
            Intrinsics.checkNotNull(paint3);
            canvas.drawText(theLastItemTime, f12, fH, paint3);
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = parent2.getChildAt(i2);
                int right = AppUtil.isRTLDirection() ? childAt.getRight() : childAt.getLeft();
                int left = AppUtil.isRTLDirection() ? childAt.getLeft() : childAt.getRight();
                Object tag = childAt.getTag();
                int i3 = i2;
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type com.xiaomi.fitness.chart.entrys.RecyclerBarEntry");
                RecyclerBarEntry recyclerBarEntry = (RecyclerBarEntry) tag;
                fpc valueFormatter = xAxis.getValueFormatter();
                String xAxisLabel = valueFormatter instanceof onq ? getXAxisLabel(recyclerBarEntry, (onq) valueFormatter) : "";
                if (TextUtils.isEmpty(xAxisLabel)) {
                    f = f10;
                    f2 = f11;
                    f3 = f9;
                    i = childCount;
                    f4 = f8;
                    c = 2;
                } else {
                    int width2 = childAt.getWidth();
                    Paint paint4 = this.mTextPaint;
                    Intrinsics.checkNotNull(paint4);
                    float fMeasureText2 = paint4.measureText(xAxisLabel);
                    float f13 = width2 - fMeasureText2;
                    float f14 = right;
                    float f15 = AppUtil.isRTLDirection() ? f14 + (fMeasureText2 / f8) : f14 - (fMeasureText2 / f8);
                    float f16 = AppUtil.isRTLDirection() ? f15 - fMeasureText2 : f15 + fMeasureText2;
                    float f17 = f15;
                    if (AppUtil.isRTLDirection()) {
                        i = childCount;
                        int i4 = this.mBarChartAttrs.X;
                        if (i4 == 1) {
                            float f18 = left;
                            f6 = f18 - f13;
                            f5 = f18;
                        } else if (i4 == 2) {
                            float f19 = right;
                            f6 = f19;
                            f5 = f19 + fMeasureText2;
                        } else {
                            f5 = f16;
                            f6 = f17;
                        }
                    } else {
                        i = childCount;
                        int i5 = this.mBarChartAttrs.X;
                        if (i5 == 1) {
                            float f20 = right;
                            f6 = f20;
                            f5 = f20 + fMeasureText2;
                        } else if (i5 == 2) {
                            f5 = left;
                            f6 = f5 - f13;
                        } else {
                            f5 = f16;
                            f6 = f17;
                        }
                    }
                    int length = xAxisLabel.length();
                    f4 = f8;
                    RectF rectF2 = new RectF(AppUtil.isRTLDirection() ? f5 : f6, f9, AppUtil.isRTLDirection() ? f6 : f5, f10);
                    float fH2 = o8p.h(rectF2, this.mTextPaint) - f11;
                    int i6 = this.mBarChartAttrs.Z;
                    float f21 = f10;
                    if (i6 != -1) {
                        o8p.j(this.mTextPaint, i6);
                    }
                    if (!AppUtil.isRTLDirection()) {
                        f3 = f9;
                        f = f21;
                        c = 2;
                        f2 = f11;
                        int i7 = recyclerBarEntry.type;
                        if (i7 == 6 || i7 == 5) {
                            Paint paint5 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint5);
                            canvas.drawText(xAxisLabel, (f6 - (f5 - paddingRight)) - 8, fH2, paint5);
                        } else {
                            float f22 = width;
                            if (xr5.a(f6, f22) && xr5.l(f5, paddingRight)) {
                                float f23 = rectF2.left;
                                Paint paint6 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint6);
                                canvas.drawText(xAxisLabel, f23, fH2, paint6);
                            } else if (f6 >= f22 || f5 <= f22) {
                                float f24 = paddingRight;
                                if (f5 > f24 && f6 < f24 && !this.mBarChartAttrs.a0) {
                                    float f25 = (f6 - (f5 - f24)) - 8;
                                    Paint paint7 = this.mTextPaint;
                                    Intrinsics.checkNotNull(paint7);
                                    canvas.drawText(xAxisLabel, f25, fH2, paint7);
                                }
                            } else {
                                Paint paint8 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint8);
                                canvas.drawText(xAxisLabel, f22, fH2, paint8);
                            }
                        }
                    } else if (xr5.l(f5, width) && xr5.a(f6, paddingRight)) {
                        float f26 = rectF2.left;
                        Paint paint9 = this.mTextPaint;
                        Intrinsics.checkNotNull(paint9);
                        canvas.drawText(xAxisLabel, f26, fH2, paint9);
                        f3 = f9;
                        f = f21;
                        c = 2;
                        f2 = f11;
                    } else {
                        float f27 = width;
                        if (f6 <= f27 || f5 >= f27) {
                            f3 = f9;
                            f = f21;
                            c = 2;
                            f2 = f11;
                            float f28 = paddingRight;
                            if (f5 < f28 && f6 > f28) {
                                Paint paint10 = this.mTextPaint;
                                Intrinsics.checkNotNull(paint10);
                                canvas.drawText(xAxisLabel, length - ((int) (((f6 - f28) / fMeasureText2) * length)), length, f27, fH2, paint10);
                            }
                        } else {
                            int i8 = (int) ((((f27 - f5) + 1) / fMeasureText2) * length);
                            if (i8 < length) {
                                i8++;
                            }
                            Paint paint11 = this.mTextPaint;
                            Intrinsics.checkNotNull(paint11);
                            c = 2;
                            f = f21;
                            f2 = f11;
                            f3 = f9;
                            canvas.drawText(xAxisLabel, 0, i8, f6, fH2, paint11);
                        }
                    }
                }
                i2 = i3 + 1;
                parent2 = parent;
                f10 = f;
                childCount = i;
                f8 = f4;
                f11 = f2;
                f9 = f3;
            }
        }
    }

    public final void drawXAxisDisplay(@NotNull Canvas canvas, @NotNull RecyclerView parent, @NotNull V attrs) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        if (this.mBarChartAttrs.v) {
            Application app = AppUtil.getApp();
            float height = ((parent.getHeight() - parent.getPaddingBottom()) - this.mBarChartAttrs.f625a) + DisplayUtil.dip2px(5.0f);
            int i = this.mBarChartAttrs.Z;
            if (i != -1) {
                o8p.j(this.mTextPaint, i);
            }
            Paint paint = this.mTextPaint;
            Intrinsics.checkNotNull(paint);
            paint.setTextSize(attrs.P);
            Paint paint2 = this.mTextPaint;
            Intrinsics.checkNotNull(paint2);
            paint2.setColor(attrs.Q);
            String[] strArr = {app.getString(qzi.e), app.getString(qzi.f), app.getString(qzi.g)};
            Paint paint3 = this.mTextPaint;
            Intrinsics.checkNotNull(paint3);
            int i2 = 0;
            float fMeasureText = paint3.measureText(strArr[0]);
            float width = (((parent.getWidth() - parent.getPaddingStart()) - parent.getPaddingEnd()) - (3 * fMeasureText)) / 2;
            float width2 = (parent.getWidth() / this.mBarChartAttrs.c) + DisplayUtil.dip2px(3.0f);
            float fI = o8p.i(this.mTextPaint);
            for (int i3 = 3; i2 < i3; i3 = 3) {
                float paddingStart = parent.getPaddingStart() + (i2 * (width + fMeasureText));
                if (i2 == 0) {
                    paddingStart += width2 / 2;
                }
                if (i2 == 2) {
                    paddingStart = (paddingStart - (width2 / 2)) + DisplayUtil.dip2px(3.0f);
                }
                RectF rectF = new RectF(paddingStart, height, paddingStart + fMeasureText, height + fI);
                float fH = o8p.h(rectF, this.mTextPaint);
                String str = strArr[i2];
                float f = rectF.left;
                Paint paint4 = this.mTextPaint;
                Intrinsics.checkNotNull(paint4);
                canvas.drawText(str, f, fH, paint4);
                i2++;
            }
        }
    }

    @NotNull
    public final V getMBarChartAttrs() {
        return this.mBarChartAttrs;
    }

    @Nullable
    public final Paint getMBgPaint() {
        return this.mBgPaint;
    }

    @Nullable
    public final Paint getMLinePaint() {
        return this.mLinePaint;
    }

    @Nullable
    public final Paint getMTextPaint() {
        return this.mTextPaint;
    }

    @NotNull
    public String getXAxisLabel(@NotNull RecyclerBarEntry barEntry, @NotNull onq valueFormatter) {
        Intrinsics.checkNotNullParameter(barEntry, "barEntry");
        Intrinsics.checkNotNullParameter(valueFormatter, "valueFormatter");
        String barLabel = valueFormatter.getBarLabel(barEntry);
        if (barEntry.type == 5 && !this.mBarChartAttrs.D) {
            barLabel = "";
        }
        Intrinsics.checkNotNull(barLabel);
        return barLabel;
    }

    public final void setMBgPaint(@Nullable Paint paint) {
        this.mBgPaint = paint;
    }

    public final void setMLinePaint(@Nullable Paint paint) {
        this.mLinePaint = paint;
    }

    public final void setMTextPaint(@Nullable Paint paint) {
        this.mTextPaint = paint;
    }
}
