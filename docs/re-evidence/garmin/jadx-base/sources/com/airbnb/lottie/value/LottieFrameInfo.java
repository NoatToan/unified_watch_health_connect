package com.airbnb.lottie.value;

/* JADX INFO: loaded from: classes7.dex */
public class LottieFrameInfo<T> {
    private float endFrame;
    private T endValue;
    private float interpolatedKeyframeProgress;
    private float linearKeyframeProgress;
    private float overallProgress;
    private float startFrame;
    private T startValue;

    public float getEndFrame() {
        return this.endFrame;
    }

    public T getEndValue() {
        return this.endValue;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.interpolatedKeyframeProgress;
    }

    public float getLinearKeyframeProgress() {
        return this.linearKeyframeProgress;
    }

    public float getOverallProgress() {
        return this.overallProgress;
    }

    public float getStartFrame() {
        return this.startFrame;
    }

    public T getStartValue() {
        return this.startValue;
    }

    public LottieFrameInfo<T> set(float f14, float f15, T t7, T t14, float f16, float f17, float f18) {
        this.startFrame = f14;
        this.endFrame = f15;
        this.startValue = t7;
        this.endValue = t14;
        this.linearKeyframeProgress = f16;
        this.interpolatedKeyframeProgress = f17;
        this.overallProgress = f18;
        return this;
    }
}
