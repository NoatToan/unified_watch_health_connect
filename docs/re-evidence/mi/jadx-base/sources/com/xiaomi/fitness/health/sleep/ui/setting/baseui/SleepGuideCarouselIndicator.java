package com.xiaomi.fitness.health.sleep.ui.setting.baseui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u001e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\nJ\u000e\u0010&\u001a\u00020\"2\u0006\u0010\u0012\u001a\u00020\nJ\b\u0010'\u001a\u00020\rH\u0002J\b\u0010(\u001a\u00020\rH\u0002J\u0016\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020\nJ\u0018\u0010,\u001a\u00020\"2\u0006\u0010-\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0014J\u0010\u0010/\u001a\u00020\n2\u0006\u0010-\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\n2\u0006\u0010.\u001a\u00020\nH\u0002J\u0010\u00101\u001a\u00020\"2\u0006\u00102\u001a\u000203H\u0014J\u0018\u00104\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u00105\u001a\u00020\rH\u0002J\b\u00108\u001a\u00020\rH\u0002J\u0018\u00109\u001a\u00020\"2\u0006\u00102\u001a\u0002032\u0006\u00105\u001a\u00020\rH\u0002J\u0010\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\nH\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/setting/baseui/SleepGuideCarouselIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "indicatorRadius", "", "indicatorRatio", "indicatorSelectedRadius", "indicatorSelectedRatio", "indicatorSpacing", "pagerCount", "unColor", "selectedColor", "indicatorPaint", "Landroid/graphics/Paint;", "rectF", "Landroid/graphics/RectF;", "getRectF", "()Landroid/graphics/RectF;", "selectedPage", "offset", "getOffset", "()F", "setOffset", "(F)V", "onPageScrolled", "", "position", "positionOffset", "positionOffsetPixels", "initIndicatorCount", "getRatioRadius", "getRatioSelectedRadius", "setColor", "commonColor", "selectColor", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "measureWidth", "measureHeight", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawCircleRect", "midY", "interpolator", "Landroid/view/animation/Interpolator;", "interpolatedOffset", "drawPagerCountCircle", "indicatorStartX", "index", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepGuideCarouselIndicator extends View {

    @NotNull
    private final Paint indicatorPaint;
    private final float indicatorRadius;
    private final float indicatorRatio;
    private final float indicatorSelectedRadius;
    private final float indicatorSelectedRatio;
    private final float indicatorSpacing;

    @NotNull
    private final Interpolator interpolator;
    private float offset;
    private int pagerCount;

    @NotNull
    private final RectF rectF;
    private int selectedColor;
    private int selectedPage;
    private int unColor;

    public SleepGuideCarouselIndicator(@Nullable Context context) {
        this(context, null);
    }

    private final void drawCircleRect(Canvas canvas, float midY) {
        float fMax;
        float fMin;
        drawPagerCountCircle(canvas, midY);
        float fIndicatorStartX = indicatorStartX(this.selectedPage);
        float ratioSelectedRadius = getRatioSelectedRadius();
        float f = fIndicatorStartX - ratioSelectedRadius;
        float f2 = fIndicatorStartX + ratioSelectedRadius;
        float fInterpolatedOffset = interpolatedOffset();
        float f3 = 2;
        float fMax2 = this.indicatorSpacing + (Math.max(getRatioRadius(), ratioSelectedRadius) * f3);
        int i = this.selectedPage;
        if ((i + 1) % this.pagerCount == 0) {
            float f4 = fMax2 * (-i);
            fMax = f + Math.max(f4 * fInterpolatedOffset * f3, f4);
            fMin = Math.min(f4 * (fInterpolatedOffset - 0.5f) * 2.0f, 0.0f);
        } else {
            fMax = f + Math.max((fInterpolatedOffset - 0.5f) * fMax2 * 2.0f, 0.0f);
            fMin = Math.min(fInterpolatedOffset * fMax2 * f3, fMax2);
        }
        float f5 = f2 + fMin;
        RectF rectF = this.rectF;
        float f6 = this.indicatorSelectedRadius;
        rectF.set(fMax, midY - f6, f5, midY + f6);
        this.indicatorPaint.setColor(this.selectedColor);
        RectF rectF2 = this.rectF;
        float f7 = this.indicatorSelectedRadius;
        canvas.drawRoundRect(rectF2, f7, f7, this.indicatorPaint);
    }

    private final void drawPagerCountCircle(Canvas canvas, float midY) {
        this.indicatorPaint.setColor(this.unColor);
        int i = this.pagerCount;
        for (int i2 = 0; i2 < i; i2++) {
            float fIndicatorStartX = indicatorStartX(i2);
            float ratioRadius = getRatioRadius();
            float f = this.indicatorRadius;
            this.rectF.set(fIndicatorStartX - ratioRadius, midY - f, fIndicatorStartX + ratioRadius, f + midY);
            RectF rectF = this.rectF;
            float f2 = this.indicatorRadius;
            canvas.drawRoundRect(rectF, f2, f2, this.indicatorPaint);
        }
    }

    private final float getRatioRadius() {
        return this.indicatorRadius * this.indicatorRatio;
    }

    private final float getRatioSelectedRadius() {
        return this.indicatorSelectedRadius * this.indicatorSelectedRatio;
    }

    private final float indicatorStartX(int index) {
        float ratioRadius = getRatioRadius();
        float fMax = Math.max(ratioRadius, getRatioSelectedRadius());
        return getPaddingLeft() + fMax + (((2.0f * fMax) + this.indicatorSpacing) * index) + ((fMax - ratioRadius) / 2);
    }

    private final float interpolatedOffset() {
        return this.interpolator.getInterpolation(this.offset);
    }

    private final int measureHeight(int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            return (int) ((Math.max(getRatioSelectedRadius(), getRatioRadius()) * 2) + getPaddingTop() + getPaddingBottom());
        }
        if (mode != 1073741824) {
            return 0;
        }
        return size;
    }

    private final int measureWidth(int widthMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode != Integer.MIN_VALUE && mode != 0) {
            if (mode != 1073741824) {
                return 0;
            }
            return size;
        }
        float ratioSelectedRadius = getRatioSelectedRadius();
        float ratioRadius = getRatioRadius();
        float fMax = Math.max(ratioSelectedRadius, ratioRadius) * 2;
        int i = this.pagerCount;
        return (int) ((fMax * i) + ((i - 1) * this.indicatorSpacing) + (ratioSelectedRadius - ratioRadius) + getPaddingLeft() + getPaddingRight());
    }

    public final float getOffset() {
        return this.offset;
    }

    @NotNull
    public final RectF getRectF() {
        return this.rectF;
    }

    public final void initIndicatorCount(int pagerCount) {
        this.pagerCount = pagerCount;
        setVisibility(pagerCount > 1 ? 0 : 8);
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.pagerCount == 0) {
            return;
        }
        drawCircleRect(canvas, (getHeight() / 2.0f) + 0.5f);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    public final void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.selectedPage = position;
        this.offset = positionOffset;
        invalidate();
    }

    public final void setColor(int commonColor, int selectColor) {
        this.unColor = getResources().getColor(commonColor);
        this.selectedColor = getResources().getColor(selectColor);
        invalidate();
    }

    public final void setOffset(float f) {
        this.offset = f;
    }

    public SleepGuideCarouselIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SleepGuideCarouselIndicator(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Float fValueOf = Float.valueOf(3.5f);
        this.indicatorRadius = ExtUtilsKt.getDp(fValueOf);
        this.indicatorRatio = 1.0f;
        this.indicatorSelectedRadius = ExtUtilsKt.getDp(fValueOf);
        this.indicatorSelectedRatio = 1.0f;
        this.indicatorSpacing = ExtUtilsKt.getDp(Float.valueOf(10.0f));
        this.unColor = -7829368;
        this.selectedColor = -1;
        this.indicatorPaint = new Paint(1);
        this.rectF = new RectF();
        this.interpolator = new DecelerateInterpolator();
    }
}
