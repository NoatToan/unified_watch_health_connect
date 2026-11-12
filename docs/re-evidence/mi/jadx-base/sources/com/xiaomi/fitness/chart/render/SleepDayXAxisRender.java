package com.xiaomi.fitness.chart.render;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.a52;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/chart/render/SleepDayXAxisRender;", "La52;", "V", "", "", "initTextPaint", "()V", "", "sleep", "wakeUp", "setTime", "(JJ)V", "Landroidx/recyclerview/widget/RecyclerView;", "parent", "Landroid/graphics/Canvas;", "canvas", "drawXAxisLabel", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/Canvas;)V", "mBarChartAttrs", "La52;", "Landroid/graphics/Paint;", "mTextPaint", "Landroid/graphics/Paint;", "sleepTime", "Ljava/lang/Long;", "wakeUpTime", "<init>", "(La52;)V", "chart_release"}, k = 1, mv = {2, 0, 0})
public final class SleepDayXAxisRender<V extends a52> {
    private final V mBarChartAttrs;

    @Nullable
    private Paint mTextPaint;

    @Nullable
    private Long sleepTime;

    @Nullable
    private Long wakeUpTime;

    public SleepDayXAxisRender(V v) {
        this.mBarChartAttrs = v;
        initTextPaint();
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
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        paint4.setColor(v.Q);
        Paint paint5 = this.mTextPaint;
        Intrinsics.checkNotNull(paint5);
        V v2 = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v2);
        paint5.setTextSize(v2.P);
    }

    public final void drawXAxisLabel(@NotNull RecyclerView parent, @NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float width = parent.getWidth() - parent.getPaddingEnd();
        float paddingStart = parent.getPaddingStart();
        float height = parent.getHeight() - parent.getPaddingBottom();
        V v = this.mBarChartAttrs;
        Intrinsics.checkNotNull(v);
        float dp = (height - v.f625a) + ExtUtilsKt.getDp(21);
        if (AppUtil.isRTLDirection()) {
            Long l = this.wakeUpTime;
            if (l != null) {
                Intrinsics.checkNotNull(l);
                String dateStr = TimeDateUtil.getDateStr(l.longValue(), TimeUtils.FORMAT_H_M);
                Paint paint = this.mTextPaint;
                Intrinsics.checkNotNull(paint);
                canvas.drawText(dateStr, paddingStart, dp, paint);
            }
            Long l2 = this.sleepTime;
            if (l2 != null) {
                Intrinsics.checkNotNull(l2);
                String dateStr2 = TimeDateUtil.getDateStr(l2.longValue(), TimeUtils.FORMAT_H_M);
                Paint paint2 = this.mTextPaint;
                Intrinsics.checkNotNull(paint2);
                float fMeasureText = width - paint2.measureText(dateStr2);
                Paint paint3 = this.mTextPaint;
                Intrinsics.checkNotNull(paint3);
                canvas.drawText(dateStr2, fMeasureText, dp, paint3);
                return;
            }
            return;
        }
        Long l3 = this.sleepTime;
        if (l3 != null) {
            Intrinsics.checkNotNull(l3);
            String dateStr3 = TimeDateUtil.getDateStr(l3.longValue(), TimeUtils.FORMAT_H_M);
            Paint paint4 = this.mTextPaint;
            Intrinsics.checkNotNull(paint4);
            canvas.drawText(dateStr3, paddingStart, dp, paint4);
        }
        Long l4 = this.wakeUpTime;
        if (l4 != null) {
            Intrinsics.checkNotNull(l4);
            String dateStr4 = TimeDateUtil.getDateStr(l4.longValue(), TimeUtils.FORMAT_H_M);
            Paint paint5 = this.mTextPaint;
            Intrinsics.checkNotNull(paint5);
            float fMeasureText2 = width - paint5.measureText(dateStr4);
            Paint paint6 = this.mTextPaint;
            Intrinsics.checkNotNull(paint6);
            canvas.drawText(dateStr4, fMeasureText2, dp, paint6);
        }
    }

    public final void setTime(long sleep, long wakeUp) {
        this.sleepTime = Long.valueOf(sleep);
        this.wakeUpTime = Long.valueOf(wakeUp);
    }
}
