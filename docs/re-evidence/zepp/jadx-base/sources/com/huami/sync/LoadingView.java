package com.huami.sync;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sync.LoadingView;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.mediac.Command;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00012B\u001f\b\u0017\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.B%\b\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010/\u001a\u00020\u0006¢\u0006\u0004\b-\u00100B#\b\u0016\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b-\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0014J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\b\u0010\u0013\u001a\u00020\u0002H\u0014J\b\u0010\u0014\u001a\u00020\u0002H\u0014J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0006H\u0014R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0018\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010$\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u00063"}, d2 = {"Lcom/huami/sync/LoadingView;", "Landroid/view/View;", "", "c", "Landroid/graphics/Canvas;", "canvas", "", "rotateDegrees", "b", "color", "setColor", "size", "setSize", "start", Command.STOP, "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "onAttachedToWindow", "onDetachedFromWindow", "changedView", "visibility", "onVisibilityChanged", "a", LogUtil.I, "mSize", "mPaintColor", "mAnimateValue", "Landroid/animation/ValueAnimator;", GoogleApiAvailabilityLight.a, "Landroid/animation/ValueAnimator;", "mAnimator", "Landroid/graphics/Paint;", "e", "Landroid/graphics/Paint;", "mPaint", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "f", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "mUpdateListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;II)V", "Companion", "realtime_transmission_release"}, k = 1, mv = {1, 5, 1})
public final class LoadingView extends View {
    private static final int g = 12;
    private static final int h = 30;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int mSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mPaintColor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int mAnimateValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mAnimator;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Paint mPaint;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ValueAnimator.AnimatorUpdateListener mUpdateListener;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public LoadingView(@Nullable Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ LoadingView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    private final void b(Canvas canvas, int rotateDegrees) {
        int i = this.mSize;
        int i2 = i / 12;
        int i3 = i / 6;
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setStrokeWidth(i2);
        }
        int i4 = this.mSize;
        canvas.rotate(rotateDegrees, i4 / 2.0f, i4 / 2.0f);
        int i5 = this.mSize;
        canvas.translate(i5 / 2.0f, i5 / 2.0f);
        int i6 = 0;
        do {
            i6++;
            canvas.rotate(30.0f);
            Paint paint2 = this.mPaint;
            if (paint2 != null) {
                paint2.setAlpha((int) ((i6 * 255.0f) / 12));
            }
            float f = i2 / 2.0f;
            canvas.translate(0.0f, ((-this.mSize) / 2) + f);
            canvas.drawLine(0.0f, 0.0f, 0.0f, i3, this.mPaint);
            canvas.translate(0.0f, (this.mSize / 2) - f);
        } while (i6 < 12);
    }

    private final void c() {
        Paint paint = new Paint();
        paint.setColor(this.mPaintColor);
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Unit unit = Unit.INSTANCE;
        this.mPaint = paint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(LoadingView loadingView, ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        loadingView.mAnimateValue = ((Integer) animatedValue).intValue();
        loadingView.invalidate();
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        stop();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        b(canvas, this.mAnimateValue * 30);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = this.mSize;
        setMeasuredDimension(i, i);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int visibility) {
        super.onVisibilityChanged(changedView, visibility);
        if (visibility == 0) {
            start();
        } else {
            stop();
        }
    }

    public final void setColor(int color) {
        this.mPaintColor = color;
        Paint paint = this.mPaint;
        if (paint != null) {
            paint.setColor(color);
        }
        invalidate();
    }

    public final void setSize(int size) {
        this.mSize = size;
        requestLayout();
    }

    public final void start() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator != null) {
            if (valueAnimator == null || valueAnimator.isStarted()) {
                return;
            }
            valueAnimator.start();
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 11);
        valueAnimatorOfInt.addUpdateListener(this.mUpdateListener);
        valueAnimatorOfInt.setDuration(600L);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.start();
        Unit unit = Unit.INSTANCE;
        this.mAnimator = valueAnimatorOfInt;
    }

    public final void stop() {
        ValueAnimator valueAnimator = this.mAnimator;
        if (valueAnimator == null) {
            return;
        }
        valueAnimator.removeUpdateListener(this.mUpdateListener);
        valueAnimator.removeAllUpdateListeners();
        valueAnimator.cancel();
        this.mAnimator = null;
    }

    @JvmOverloads
    public LoadingView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.LoadingStyle);
    }

    public LoadingView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: iq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoadingView.d(this.a, valueAnimator);
            }
        };
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.LoadingView, i, 0);
        this.mSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.LoadingView_loading_view_size, context != null ? ExtensionKt.dp2px(context, 32) : 0);
        this.mPaintColor = typedArrayObtainStyledAttributes.getInt(R.styleable.LoadingView_android_color, -1);
        typedArrayObtainStyledAttributes.recycle();
        c();
    }

    public LoadingView(@Nullable Context context, int i, int i2) {
        super(context);
        this.mUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: iq4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoadingView.d(this.a, valueAnimator);
            }
        };
        this.mSize = i;
        this.mPaintColor = i2;
        c();
    }
}
