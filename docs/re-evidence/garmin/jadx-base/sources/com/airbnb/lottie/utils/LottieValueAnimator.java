package com.airbnb.lottie.utils;

import am.j;
import android.view.Choreographer;
import com.airbnb.lottie.L;
import com.airbnb.lottie.LottieComposition;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class LottieValueAnimator extends BaseLottieAnimator implements Choreographer.FrameCallback {
    private LottieComposition composition;
    private float speed = 1.0f;
    private boolean speedReversedForRepeatMode = false;
    private long lastFrameTimeNs = 0;
    private float frameRaw = 0.0f;
    private float frame = 0.0f;
    private int repeatCount = 0;
    private float minFrame = -2.1474836E9f;
    private float maxFrame = 2.1474836E9f;
    protected boolean running = false;
    private boolean useCompositionFrameRate = false;

    private void checkNotifyUpdate(float f14) {
        if (this.useCompositionFrameRate && this.frameRaw == f14) {
            return;
        }
        notifyUpdate();
    }

    private float getFrameDurationNs() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / lottieComposition.getFrameRate()) / Math.abs(this.speed);
    }

    private boolean isReversed() {
        return getSpeed() < 0.0f;
    }

    private void verifyFrame() {
        if (this.composition == null) {
            return;
        }
        float f14 = this.frame;
        float f15 = this.minFrame;
        if (f14 < f15 || f14 > this.maxFrame) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(f15), Float.valueOf(this.maxFrame), Float.valueOf(this.frame)));
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void cancel() {
        notifyCancel();
        removeFrameCallback();
    }

    public void clearComposition() {
        this.composition = null;
        this.minFrame = -2.1474836E9f;
        this.maxFrame = 2.1474836E9f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j8) {
        postFrameCallback();
        if (this.composition == null || !isRunning()) {
            return;
        }
        if (L.isTraceEnabled()) {
            L.beginSection("LottieValueAnimator#doFrame");
        }
        long j14 = this.lastFrameTimeNs;
        float frameDurationNs = (j14 != 0 ? j8 - j14 : 0L) / getFrameDurationNs();
        float f14 = this.frameRaw;
        if (isReversed()) {
            frameDurationNs = -frameDurationNs;
        }
        float f15 = f14 + frameDurationNs;
        boolean zContains = MiscUtils.contains(f15, getMinFrame(), getMaxFrame());
        float f16 = this.frameRaw;
        float fClamp = MiscUtils.clamp(f15, getMinFrame(), getMaxFrame());
        this.frameRaw = fClamp;
        if (this.useCompositionFrameRate) {
            fClamp = (float) Math.floor(fClamp);
        }
        this.frame = fClamp;
        this.lastFrameTimeNs = j8;
        if (zContains) {
            checkNotifyUpdate(f16);
        } else if (getRepeatCount() == -1 || this.repeatCount < getRepeatCount()) {
            if (getRepeatMode() == 2) {
                this.speedReversedForRepeatMode = !this.speedReversedForRepeatMode;
                reverseAnimationSpeed();
            } else {
                float maxFrame = isReversed() ? getMaxFrame() : getMinFrame();
                this.frameRaw = maxFrame;
                this.frame = maxFrame;
            }
            this.lastFrameTimeNs = j8;
            checkNotifyUpdate(f16);
            notifyRepeat();
            this.repeatCount++;
        } else {
            float minFrame = this.speed < 0.0f ? getMinFrame() : getMaxFrame();
            this.frameRaw = minFrame;
            this.frame = minFrame;
            removeFrameCallback();
            checkNotifyUpdate(f16);
            notifyEnd(isReversed());
        }
        verifyFrame();
        if (L.isTraceEnabled()) {
            L.endSection("LottieValueAnimator#doFrame");
        }
    }

    public void endAnimation() {
        removeFrameCallback();
        notifyEnd(isReversed());
    }

    @Override // android.animation.ValueAnimator
    public float getAnimatedFraction() {
        float minFrame;
        float maxFrame;
        float minFrame2;
        if (this.composition == null) {
            return 0.0f;
        }
        if (isReversed()) {
            minFrame = getMaxFrame() - this.frame;
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        } else {
            minFrame = this.frame - getMinFrame();
            maxFrame = getMaxFrame();
            minFrame2 = getMinFrame();
        }
        return minFrame / (maxFrame - minFrame2);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(getAnimatedValueAbsolute());
    }

    public float getAnimatedValueAbsolute() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        return (this.frame - lottieComposition.getStartFrame()) / (this.composition.getEndFrame() - this.composition.getStartFrame());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0L;
        }
        return (long) lottieComposition.getDuration();
    }

    public float getFrame() {
        return this.frame;
    }

    public float getMaxFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f14 = this.maxFrame;
        return f14 == 2.1474836E9f ? lottieComposition.getEndFrame() : f14;
    }

    public float getMinFrame() {
        LottieComposition lottieComposition = this.composition;
        if (lottieComposition == null) {
            return 0.0f;
        }
        float f14 = this.minFrame;
        return f14 == -2.1474836E9f ? lottieComposition.getStartFrame() : f14;
    }

    public float getSpeed() {
        return this.speed;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.running;
    }

    @Override // com.airbnb.lottie.utils.BaseLottieAnimator
    public void notifyCancel() {
        super.notifyCancel();
        notifyEnd(isReversed());
    }

    public void pauseAnimation() {
        removeFrameCallback();
        notifyPause();
    }

    public void playAnimation() {
        this.running = true;
        notifyStart(isReversed());
        setFrame((int) (isReversed() ? getMaxFrame() : getMinFrame()));
        this.lastFrameTimeNs = 0L;
        this.repeatCount = 0;
        postFrameCallback();
    }

    public void postFrameCallback() {
        if (isRunning()) {
            removeFrameCallback(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public void removeFrameCallback(boolean z14) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z14) {
            this.running = false;
        }
    }

    public void resumeAnimation() {
        this.running = true;
        postFrameCallback();
        this.lastFrameTimeNs = 0L;
        if (isReversed() && getFrame() == getMinFrame()) {
            setFrame(getMaxFrame());
        } else if (!isReversed() && getFrame() == getMaxFrame()) {
            setFrame(getMinFrame());
        }
        notifyResume();
    }

    public void reverseAnimationSpeed() {
        setSpeed(-getSpeed());
    }

    public void setComposition(LottieComposition lottieComposition) {
        boolean z14 = this.composition == null;
        this.composition = lottieComposition;
        if (z14) {
            setMinAndMaxFrames(Math.max(this.minFrame, lottieComposition.getStartFrame()), Math.min(this.maxFrame, lottieComposition.getEndFrame()));
        } else {
            setMinAndMaxFrames((int) lottieComposition.getStartFrame(), (int) lottieComposition.getEndFrame());
        }
        float f14 = this.frame;
        this.frame = 0.0f;
        this.frameRaw = 0.0f;
        setFrame((int) f14);
        notifyUpdate();
    }

    public void setFrame(float f14) {
        if (this.frameRaw == f14) {
            return;
        }
        float fClamp = MiscUtils.clamp(f14, getMinFrame(), getMaxFrame());
        this.frameRaw = fClamp;
        if (this.useCompositionFrameRate) {
            fClamp = (float) Math.floor(fClamp);
        }
        this.frame = fClamp;
        this.lastFrameTimeNs = 0L;
        notifyUpdate();
    }

    public void setMaxFrame(float f14) {
        setMinAndMaxFrames(this.minFrame, f14);
    }

    public void setMinAndMaxFrames(float f14, float f15) {
        if (f14 > f15) {
            h.s(j.l("minFrame (", f14, ") must be <= maxFrame (", f15, ")"));
            return;
        }
        LottieComposition lottieComposition = this.composition;
        float startFrame = lottieComposition == null ? -3.4028235E38f : lottieComposition.getStartFrame();
        LottieComposition lottieComposition2 = this.composition;
        float endFrame = lottieComposition2 == null ? Float.MAX_VALUE : lottieComposition2.getEndFrame();
        float fClamp = MiscUtils.clamp(f14, startFrame, endFrame);
        float fClamp2 = MiscUtils.clamp(f15, startFrame, endFrame);
        if (fClamp == this.minFrame && fClamp2 == this.maxFrame) {
            return;
        }
        this.minFrame = fClamp;
        this.maxFrame = fClamp2;
        setFrame((int) MiscUtils.clamp(this.frame, fClamp, fClamp2));
    }

    public void setMinFrame(int i14) {
        setMinAndMaxFrames(i14, (int) this.maxFrame);
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i14) {
        super.setRepeatMode(i14);
        if (i14 == 2 || !this.speedReversedForRepeatMode) {
            return;
        }
        this.speedReversedForRepeatMode = false;
        reverseAnimationSpeed();
    }

    public void setSpeed(float f14) {
        this.speed = f14;
    }

    public void setUseCompositionFrameRate(boolean z14) {
        this.useCompositionFrameRate = z14;
    }

    public void removeFrameCallback() {
        removeFrameCallback(true);
    }
}
