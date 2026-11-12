package com.huami.chart.shimmer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.chart.shimmer.ShimmerDrawable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 @2\u00020\u0001:\u0001@B\u0013\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b>\u0010?J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\rJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0006\u0010\u0015\u001a\u00020\u0007J\u0010\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0012\u0010\u001b\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0016R\u001b\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0016\u0010.\u001a\u00020,8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R$\u00106\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010=\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006A"}, d2 = {"Lcom/huami/chart/shimmer/ShimmerDrawable;", "Landroid/graphics/drawable/Drawable;", "", "start", "end", "percent", "b", "", "e", GoogleApiAvailabilityLight.a, "startShimmer", "stopShimmer", "cancelShimmer", "", "isShimmerStarted", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "Landroid/graphics/Canvas;", "canvas", "draw", "maybeStartShimmer", "", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "Lcom/huami/chart/shimmer/Shimmer;", "a", "Lcom/huami/chart/shimmer/Shimmer;", "getShimmer", "()Lcom/huami/chart/shimmer/Shimmer;", "shimmer", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "updateListener", "Landroid/graphics/Paint;", "c", "Landroid/graphics/Paint;", "mShimmerPaint", "Landroid/graphics/Rect;", "mDrawRect", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "mShaderMatrix", "Landroid/animation/ValueAnimator;", "f", "Landroid/animation/ValueAnimator;", "getMValueAnimator", "()Landroid/animation/ValueAnimator;", "setMValueAnimator", "(Landroid/animation/ValueAnimator;)V", "mValueAnimator", "g", "Z", "getStopAnimator", "()Z", "setStopAnimator", "(Z)V", "stopAnimator", "<init>", "(Lcom/huami/chart/shimmer/Shimmer;)V", "Companion", "chart_release"}, k = 1, mv = {1, 5, 1})
public final class ShimmerDrawable extends Drawable {

    @NotNull
    private static final String h = "ShimmerDrawable";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Shimmer shimmer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ValueAnimator.AnimatorUpdateListener updateListener;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Paint mShimmerPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Rect mDrawRect;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Matrix mShaderMatrix;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private ValueAnimator mValueAnimator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean stopAnimator;

    /* JADX WARN: Multi-variable type inference failed */
    public ShimmerDrawable() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ShimmerDrawable(@Nullable Shimmer shimmer) {
        this.shimmer = shimmer;
        this.updateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: du6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ShimmerDrawable.c(this.a, valueAnimator);
            }
        };
        Paint paint = new Paint();
        this.mShimmerPaint = paint;
        this.mDrawRect = new Rect();
        this.mShaderMatrix = new Matrix();
        paint.setAntiAlias(true);
        if (shimmer == null) {
            return;
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        d();
        e();
        invalidateSelf();
    }

    private final float b(float start, float end, float percent) {
        return start + ((end - start) * percent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(ShimmerDrawable shimmerDrawable, ValueAnimator valueAnimator) {
        shimmerDrawable.invalidateSelf();
    }

    private final void d() {
        Shimmer shimmer;
        Shader linearGradient;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (iWidth == 0 || iHeight == 0 || (shimmer = this.shimmer) == null) {
            return;
        }
        int shape = shimmer.getShape();
        boolean z = true;
        if (shape == 0) {
            if (this.shimmer.getDirection() != 1 && this.shimmer.getDirection() != 3) {
                z = false;
            }
            if (z) {
                iWidth = 0;
            }
            if (!z) {
                iHeight = 0;
            }
            linearGradient = new LinearGradient(0.0f, 0.0f, iWidth, iHeight, this.shimmer.getColors(), this.shimmer.getPositions(), Shader.TileMode.CLAMP);
        } else if (shape != 1) {
            if (this.shimmer.getDirection() != 1 && this.shimmer.getDirection() != 3) {
                z = false;
            }
            if (z) {
                iWidth = 0;
            }
            if (!z) {
                iHeight = 0;
            }
            linearGradient = new LinearGradient(0.0f, 0.0f, iWidth, iHeight, this.shimmer.getColors(), this.shimmer.getPositions(), Shader.TileMode.CLAMP);
        } else {
            linearGradient = new RadialGradient(iWidth / 2.0f, iHeight / 2.0f, (float) (((double) Math.max(iWidth, iHeight)) / Math.sqrt(2.0d)), this.shimmer.getColors(), this.shimmer.getPositions(), Shader.TileMode.CLAMP);
        }
        this.mShimmerPaint.setShader(linearGradient);
    }

    private final void e() {
        boolean zIsStarted;
        if (this.shimmer == null) {
            return;
        }
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null) {
            zIsStarted = false;
        } else {
            zIsStarted = valueAnimator.isStarted();
            valueAnimator.cancel();
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (this.shimmer.getRepeatDelay() / this.shimmer.getAnimationDuration()) + 1.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setRepeatMode(getShimmer().getRepeatMode());
        valueAnimatorOfFloat.setStartDelay(getShimmer().getStartDelay());
        valueAnimatorOfFloat.setRepeatCount(getShimmer().getRepeatCount());
        valueAnimatorOfFloat.setDuration(getShimmer().getAnimationDuration() + getShimmer().getRepeatDelay());
        valueAnimatorOfFloat.addUpdateListener(this.updateListener);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener(this) { // from class: com.huami.chart.shimmer.ShimmerDrawable$updateValueAnimator$lambda-8$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(@NotNull Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(@NotNull Animator animator) {
                if (this.a.getStopAnimator()) {
                    animator.cancel();
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(@NotNull Animator animator) {
                this.a.setStopAnimator(false);
            }
        });
        if (zIsStarted) {
            valueAnimatorOfFloat.start();
        }
        Unit unit = Unit.INSTANCE;
        this.mValueAnimator = valueAnimatorOfFloat;
    }

    public final void cancelShimmer() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator != null && isShimmerStarted()) {
            valueAnimator.cancel();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        float fB;
        float fB2;
        if (this.shimmer == null || this.mShimmerPaint.getShader() == null) {
            return;
        }
        float fTan = (float) Math.tan(Math.toRadians(this.shimmer.getTilt()));
        float fHeight = this.mDrawRect.height() + (this.mDrawRect.width() * fTan);
        float fWidth = this.mDrawRect.width() + (fTan * this.mDrawRect.height());
        ValueAnimator valueAnimator = this.mValueAnimator;
        Object animatedValue = valueAnimator == null ? null : valueAnimator.getAnimatedValue();
        Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
        float f2 = 0.0f;
        float fFloatValue = f == null ? 0.0f : f.floatValue();
        int direction = this.shimmer.getDirection();
        if (direction != 0) {
            if (direction == 1) {
                fB2 = b(-fHeight, fHeight, fFloatValue);
            } else if (direction == 2) {
                fB = b(fWidth, -fWidth, fFloatValue);
            } else if (direction != 3) {
                fB = b(-fWidth, fWidth, fFloatValue);
            } else {
                fB2 = b(fHeight, -fHeight, fFloatValue);
            }
            this.mShaderMatrix.reset();
            this.mShaderMatrix.setRotate(this.shimmer.getTilt(), this.mDrawRect.width() / 2.0f, this.mDrawRect.height() / 2.0f);
            this.mShimmerPaint.getShader().setLocalMatrix(this.mShaderMatrix);
            canvas.translate(f2, fB2);
            canvas.drawRect(this.mDrawRect, this.mShimmerPaint);
        }
        fB = b(this.shimmer.getTranslateBounds().left - (this.mDrawRect.width() / 2), this.shimmer.getTranslateBounds().width(), fFloatValue);
        f2 = fB;
        fB2 = 0.0f;
        this.mShaderMatrix.reset();
        this.mShaderMatrix.setRotate(this.shimmer.getTilt(), this.mDrawRect.width() / 2.0f, this.mDrawRect.height() / 2.0f);
        this.mShimmerPaint.getShader().setLocalMatrix(this.mShaderMatrix);
        canvas.translate(f2, fB2);
        canvas.drawRect(this.mDrawRect, this.mShimmerPaint);
    }

    @Nullable
    public final ValueAnimator getMValueAnimator() {
        return this.mValueAnimator;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Shimmer shimmer = this.shimmer;
        return (shimmer == null || !(shimmer.getClipToChildren() || this.shimmer.getAlphaShimmer())) ? -1 : -3;
    }

    @Nullable
    public final Shimmer getShimmer() {
        return this.shimmer;
    }

    public final boolean getStopAnimator() {
        return this.stopAnimator;
    }

    public final boolean isShimmerStarted() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null) {
            return false;
        }
        return valueAnimator.isStarted();
    }

    public final void maybeStartShimmer() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null || valueAnimator.isStarted() || getShimmer() == null || !getShimmer().getAutoStart() || getCallback() == null || getStopAnimator()) {
            return;
        }
        valueAnimator.start();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@Nullable Rect bounds) {
        super.onBoundsChange(bounds);
        this.mDrawRect.set(bounds);
        d();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public final void setMValueAnimator(@Nullable ValueAnimator valueAnimator) {
        this.mValueAnimator = valueAnimator;
    }

    public final void setStopAnimator(boolean z) {
        this.stopAnimator = z;
    }

    public final void startShimmer() {
        ValueAnimator valueAnimator = this.mValueAnimator;
        if (valueAnimator == null || isShimmerStarted() || getCallback() == null) {
            return;
        }
        valueAnimator.start();
    }

    public final void stopShimmer() {
        if (this.mValueAnimator != null && isShimmerStarted()) {
            setStopAnimator(true);
        }
    }

    public /* synthetic */ ShimmerDrawable(Shimmer shimmer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : shimmer);
    }
}
