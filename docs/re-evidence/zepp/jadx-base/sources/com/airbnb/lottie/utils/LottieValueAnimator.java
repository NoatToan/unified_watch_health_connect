package com.airbnb.lottie.utils;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;

/* JADX INFO: loaded from: classes2.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {

    @Nullable
    private LottieComposition j;
    private float c = 1.0f;
    private boolean d = false;
    private long e = 0;
    private float f = 0.0f;
    private int g = 0;
    private float h = -2.1474836E9f;
    private float i = 2.1474836E9f;

    @VisibleForTesting
    public boolean running = false;

    private float f() {
        LottieComposition lottieComposition = this.j;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.c);
    }

    private boolean g() {
        return getSpeed() < 0.0f;
    }

    private void h() {
        if (this.j == null) {
            return;
        }
        float f = this.f;
        if (f < this.h || f > this.i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.h), Float.valueOf(this.i), Float.valueOf(this.f)));
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        a();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.j = null;
        this.h = -2.1474836E9f;
        this.i = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        postFrameCallback();
        if (this.j == null || !isRunning()) {
            return;
        }
        L.beginSection("LottieValueAnimator#doFrame");
        long j2 = this.e;
        float f = (j2 != 0 ? j - j2 : 0L) / f();
        float f2 = this.f;
        if (g()) {
            f = -f;
        }
        float f3 = f2 + f;
        this.f = f3;
        boolean z = !MiscUtils.contains(f3, getMinFrame(), getMaxFrame());
        this.f = MiscUtils.clamp(this.f, getMinFrame(), getMaxFrame());
        this.e = j;
        e();
        if (z) {
            if (getRepeatCount() == -1 || this.g < getRepeatCount()) {
                c();
                this.g++;
                if (getRepeatMode() == 2) {
                    this.d = !this.d;
                    reverseAnimationSpeed();
                } else {
                    this.f = g() ? getMaxFrame() : getMinFrame();
                }
                this.e = j;
            } else {
                this.f = this.c < 0.0f ? getMinFrame() : getMaxFrame();
                removeFrameCallback();
                b(g());
            }
        }
        h();
        L.endSection("LottieValueAnimator#doFrame");
    }

    @MainThread
    public void endAnimation() {
        removeFrameCallback();
        b(g());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.j == null) {
            return 0.0f;
        }
        if (g()) {
            minFrame = getMaxFrame() - this.f;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.f - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.j;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.f - lottieComposition.getStartFrame()) / (this.j.getEndFrame() - this.j.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.j;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.f;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.j;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.i;
        return f == 2.1474836E9f ? lottieComposition.getEndFrame() : f;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.j;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f = this.h;
        return f == -2.1474836E9f ? lottieComposition.getStartFrame() : f;
    }

    public float getSpeed() {
        return this.c;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    @MainThread
    public void pauseAnimation() {
        removeFrameCallback();
    }

    @MainThread
    public void playAnimation() {
        this.running = true;
        d(g());
        setFrame((int) (g() ? getMaxFrame() : getMinFrame()));
        this.e = 0L;
        this.g = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @MainThread
    public void removeFrameCallback() {
        removeFrameCallback(true);
    }

    @MainThread
    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.e = 0L;
        if (g() && getFrame() == getMinFrame()) {
            this.f = getMaxFrame();
        } else {
            if (g() || getFrame() != getMaxFrame()) {
                return;
            }
            this.f = getMinFrame();
        }
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z = this.j == null;
        this.j = lottieComposition;
        if (z) {
            setMinAndMaxFrames((int) Math.max(this.h, lottieComposition.getStartFrame()), (int) Math.min(this.i, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f = this.f;
        this.f = 0.0f;
        setFrame((int) f);
        e();
    }

    public void setFrame(float f) {
        if (this.f == f) {
            return;
        }
        this.f = MiscUtils.clamp(f, getMinFrame(), getMaxFrame());
        this.e = 0L;
        e();
    }

    public void setMaxFrame(float f) {
        setMinAndMaxFrames(this.h, f);
    }

    public void setMinAndMaxFrames(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        LottieComposition lottieComposition = this.j;
        float startFrame = lottieComposition == null ? -3.4028235E38f : lottieComposition.getStartFrame();
        LottieComposition lottieComposition2 = this.j;
        float endFrame = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.getEndFrame();
        float fClamp = MiscUtils.clamp(f, startFrame, endFrame);
        float fClamp2 = MiscUtils.clamp(f2, startFrame, endFrame);
        if (fClamp == this.h && fClamp2 == this.i) {
            return;
        }
        this.h = fClamp;
        this.i = fClamp2;
        setFrame((int) MiscUtils.clamp(this.f, fClamp, fClamp2));
    }

    public void setMinFrame(int i) {
        setMinAndMaxFrames(i, (int) this.i);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.d) {
            return;
        }
        this.d = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f) {
        this.c = f;
    }

    @MainThread
    public void removeFrameCallback(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.running = false;
        }
    }
}
