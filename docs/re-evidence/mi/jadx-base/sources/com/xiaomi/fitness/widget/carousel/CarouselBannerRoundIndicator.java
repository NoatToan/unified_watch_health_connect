package com.xiaomi.fitness.widget.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import defpackage.lki;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0014R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/widget/carousel/CarouselBannerRoundIndicator;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", DeviceSettingConfigKey.KEY_SELECT_MODE, "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;Ljava/lang/Integer;)V", "mNormalPaint", "Landroid/graphics/Paint;", "mSelectPaint", "mode", "Ljava/lang/Integer;", "selectColorResId", "normalColorResId", "indicatorWidth", "", "mPointCount", "mSelectPosition", "onPageChanged", "", "count", "currentIndex", "onCurrentIndexChange", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "widget_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CarouselBannerRoundIndicator extends View {
    private final float indicatorWidth;

    @NotNull
    private final Paint mNormalPaint;
    private int mPointCount;

    @NotNull
    private final Paint mSelectPaint;
    private int mSelectPosition;

    @Nullable
    private final Integer mode;
    private int normalColorResId;
    private int selectColorResId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselBannerRoundIndicator(@NotNull Context context) {
        this(context, null, null, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void onPageChanged$default(CarouselBannerRoundIndicator carouselBannerRoundIndicator, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = lki.u;
        }
        if ((i5 & 8) != 0) {
            i4 = lki.w;
        }
        carouselBannerRoundIndicator.onPageChanged(i, i2, i3, i4);
    }

    public final void onCurrentIndexChange(int currentIndex) {
        this.mSelectPosition = currentIndex;
        requestLayout();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Integer num;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.mPointCount <= 1) {
            return;
        }
        this.mNormalPaint.setColor(ExtUtilsKt.getColor(this.normalColorResId));
        this.mSelectPaint.setColor(ExtUtilsKt.getColor(this.selectColorResId));
        float f = this.indicatorWidth;
        int i = this.mPointCount;
        float f2 = f;
        int i2 = 0;
        while (i2 < i) {
            float f3 = this.indicatorWidth;
            float f4 = 2;
            canvas.drawCircle((f3 / f4) + f2, f3 / 2.0f, f3 / 2.0f, i2 == this.mSelectPosition ? this.mSelectPaint : this.mNormalPaint);
            if (i2 == this.mSelectPosition && (num = this.mode) != null && num.intValue() == 1) {
                float f5 = this.indicatorWidth;
                float dp = (((f5 / f4) + f2) - (f5 / f4)) - ExtUtilsKt.getDp(Float.valueOf(1.0f));
                float f6 = this.indicatorWidth;
                canvas.drawLine(dp, f6 / 2.0f, (f6 / f4) + f2 + (f6 / f4) + ExtUtilsKt.getDp(Float.valueOf(1.0f)), this.indicatorWidth / 2.0f, this.mSelectPaint);
            }
            float f7 = this.indicatorWidth;
            f2 += (f7 * f4) + (f7 / f4);
            i2++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int i = this.mPointCount;
        if (i <= 1) {
            return;
        }
        float f = this.indicatorWidth;
        setMeasuredDimension((int) (((i - 1) * f) + (i * f) + (2 * f) + f), (int) f);
    }

    public final void onPageChanged(int count, int currentIndex, int selectColorResId, int normalColorResId) {
        this.mPointCount = count;
        this.mSelectPosition = currentIndex;
        this.selectColorResId = selectColorResId;
        this.normalColorResId = normalColorResId;
        requestLayout();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselBannerRoundIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, null, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CarouselBannerRoundIndicator(Context context, AttributeSet attributeSet, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet, (i & 4) != 0 ? 0 : num);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CarouselBannerRoundIndicator(@NotNull Context context, @Nullable AttributeSet attributeSet, @Nullable Integer num) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.mNormalPaint = paint;
        Paint paint2 = new Paint(1);
        this.mSelectPaint = paint2;
        this.mode = num;
        this.selectColorResId = lki.u;
        this.normalColorResId = lki.x;
        float dp = ExtUtilsKt.getDp(Float.valueOf(5.3f));
        this.indicatorWidth = dp;
        paint.setAntiAlias(false);
        paint2.setAntiAlias(false);
        paint2.setStrokeWidth(dp);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        layoutParams.setMargins(0, 0, 0, ExtUtilsKt.getDp(10));
        setLayoutParams(layoutParams);
    }
}
