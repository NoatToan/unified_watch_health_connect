package com.xiaomi.hm.health.bodyfat.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.BodyFatCircleProgressView;
import java.util.Objects;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b$\u0010&B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010'\u001a\u00020\u000b¢\u0006\u0004\b$\u0010(J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0015R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/view/BodyFatCircleProgressView;", "Landroid/view/View;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "c", "Landroid/graphics/Canvas;", "canvas", "b", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "", "duration", "start", "", "a", "F", "strokeWidth", LogUtil.I, "progressBgColor", "progressFgColor", "Landroid/graphics/Paint;", GoogleApiAvailabilityLight.a, "Landroid/graphics/Paint;", "mPaint", "e", "progressAnim", "Landroid/graphics/RectF;", "f", "Landroid/graphics/RectF;", "rectF", "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class BodyFatCircleProgressView extends View {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private float strokeWidth;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int progressBgColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int progressFgColor;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Paint mPaint;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private float progressAnim;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final RectF rectF;

    public BodyFatCircleProgressView(@NotNull Context context) {
        this(context, null);
    }

    private final void b(Canvas canvas) {
        Paint paint = this.mPaint;
        Objects.requireNonNull(paint);
        paint.setColor(this.progressBgColor);
        if (canvas != null) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            RectF rectF = this.rectF;
            float f = (rectF.right - rectF.left) / 2;
            Paint paint2 = this.mPaint;
            Objects.requireNonNull(paint2);
            canvas.drawCircle(width, height, f, paint2);
        }
        Paint paint3 = this.mPaint;
        Objects.requireNonNull(paint3);
        paint3.setColor(this.progressFgColor);
        if (canvas == null) {
            return;
        }
        RectF rectF2 = this.rectF;
        float f2 = this.progressAnim * 360.0f;
        Paint paint4 = this.mPaint;
        Objects.requireNonNull(paint4);
        canvas.drawArc(rectF2, -90.0f, f2, false, paint4);
    }

    private final void c(Context context, AttributeSet attrs) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.BodyFatCircleProgressView);
        this.strokeWidth = typedArrayObtainStyledAttributes.getDimension(R.styleable.BodyFatCircleProgressView_progressStrokeWidth, 4.0f);
        this.progressBgColor = typedArrayObtainStyledAttributes.getColor(R.styleable.BodyFatCircleProgressView_progressBgColor, -7829368);
        this.progressFgColor = typedArrayObtainStyledAttributes.getColor(R.styleable.BodyFatCircleProgressView_progressFgColor, SupportMenu.CATEGORY_MASK);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.mPaint = paint;
        Objects.requireNonNull(paint);
        paint.setAntiAlias(true);
        Paint paint2 = this.mPaint;
        Objects.requireNonNull(paint2);
        paint2.setStrokeWidth(this.strokeWidth);
        Paint paint3 = this.mPaint;
        Objects.requireNonNull(paint3);
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = this.mPaint;
        Objects.requireNonNull(paint4);
        paint4.setStrokeCap(Paint.Cap.ROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(BodyFatCircleProgressView bodyFatCircleProgressView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        bodyFatCircleProgressView.progressAnim = ((Float) animatedValue).floatValue();
        bodyFatCircleProgressView.invalidate();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // android.view.View
    public void onDraw(@Nullable Canvas canvas) {
        super.onDraw(canvas);
        b(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        float f = this.strokeWidth;
        float measuredWidth = getMeasuredWidth();
        float f2 = this.strokeWidth;
        float measuredHeight = getMeasuredHeight() - this.strokeWidth;
        RectF rectF = this.rectF;
        rectF.left = f;
        rectF.right = measuredWidth - f2;
        rectF.top = f2;
        rectF.bottom = measuredHeight;
    }

    public final void start(long duration) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h30
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BodyFatCircleProgressView.d(this.a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public BodyFatCircleProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BodyFatCircleProgressView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.progressBgColor = -7829368;
        this.progressFgColor = SupportMenu.CATEGORY_MASK;
        this.rectF = new RectF();
        c(context, attributeSet);
    }
}
