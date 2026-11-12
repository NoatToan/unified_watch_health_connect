package com.xiaomi.fitness.devicesettings.huami.vibratemode;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.BubbleAnimationView;
import com.xiaomi.wearable.hm.BroadcastsKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fJ\u0012\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0018\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/BubbleAnimationView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "currentBubble", "Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/BubbleAnimationView$Bubble;", "isAnimating", "", "canAnimate", "setCanAnimate", "", "enabled", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "createBubble", "x", "", "y", "Bubble", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BubbleAnimationView extends View {
    private boolean canAnimate;

    @Nullable
    private Bubble currentBubble;
    private boolean isAnimating;

    @NotNull
    private final Paint paint;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/vibratemode/BubbleAnimationView$Bubble;", "", "x", "", "y", BroadcastsKt.SILENT_PUSHING_PROGRESS, "<init>", "(FFF)V", "getX", "()F", "getY", "getProgress", "setProgress", "(F)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Bubble {
        private float progress;
        private final float x;
        private final float y;

        public Bubble(float f, float f2, float f3) {
            this.x = f;
            this.y = f2;
            this.progress = f3;
        }

        public static /* synthetic */ Bubble copy$default(Bubble bubble, float f, float f2, float f3, int i, Object obj) {
            if ((i & 1) != 0) {
                f = bubble.x;
            }
            if ((i & 2) != 0) {
                f2 = bubble.y;
            }
            if ((i & 4) != 0) {
                f3 = bubble.progress;
            }
            return bubble.copy(f, f2, f3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final float getProgress() {
            return this.progress;
        }

        @NotNull
        public final Bubble copy(float x, float y, float progress) {
            return new Bubble(x, y, progress);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Bubble)) {
                return false;
            }
            Bubble bubble = (Bubble) other;
            return Float.compare(this.x, bubble.x) == 0 && Float.compare(this.y, bubble.y) == 0 && Float.compare(this.progress, bubble.progress) == 0;
        }

        public final float getProgress() {
            return this.progress;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public int hashCode() {
            return (((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Float.hashCode(this.progress);
        }

        public final void setProgress(float f) {
            this.progress = f;
        }

        @NotNull
        public String toString() {
            return "Bubble(x=" + this.x + ", y=" + this.y + ", progress=" + this.progress + ")";
        }

        public /* synthetic */ Bubble(float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(f, f2, (i & 4) != 0 ? 0.0f : f3);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BubbleAnimationView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void createBubble(float x, float y) {
        this.currentBubble = new Bubble(x, y, 0.0f, 4, null);
        this.isAnimating = true;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m53
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                BubbleAnimationView.createBubble$lambda$3$lambda$2(this.f25760a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.xiaomi.fitness.devicesettings.huami.vibratemode.BubbleAnimationView$createBubble$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                this.this$0.currentBubble = null;
                this.this$0.isAnimating = false;
                this.this$0.invalidate();
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createBubble$lambda$3$lambda$2(BubbleAnimationView this$0, ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Bubble bubble = this$0.currentBubble;
        if (bubble != null) {
            Object animatedValue = animation.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            bubble.setProgress(((Float) animatedValue).floatValue());
        }
        this$0.invalidate();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Bubble bubble = this.currentBubble;
        if (bubble != null) {
            float f = 1;
            float progress = (bubble.getProgress() * 0.43f) + f;
            this.paint.setAlpha((int) (255 * (f - bubble.getProgress())));
            canvas.save();
            canvas.scale(progress, progress, bubble.getX(), bubble.getY());
            canvas.drawCircle(bubble.getX(), bubble.getY(), ExtUtilsKt.getDp(33), this.paint);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@Nullable MotionEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getActionMasked()) : null;
        if (numValueOf == null || numValueOf.intValue() != 0 || this.isAnimating || !this.canAnimate) {
            return super.onTouchEvent(event);
        }
        createBubble(event.getX(), event.getY());
        return false;
    }

    public final void setCanAnimate(boolean enabled) {
        this.canAnimate = enabled;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BubbleAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ BubbleAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BubbleAnimationView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#33FF612E"));
        this.paint = paint;
        this.canAnimate = true;
    }
}
