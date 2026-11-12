package com.airbnb.lottie.animation.keyframe;

import defpackage.cv;
import defpackage.jb;
import defpackage.jf;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    private final KeyframesWrapper<K> keyframesWrapper;
    protected jf<A> valueCallback;
    protected final List<AnimationListener> listeners = new ArrayList(1);
    private boolean isDiscrete = false;
    protected float progress = 0.0f;
    private A cachedGetValue = null;
    private float cachedStartDelayProgress = -1.0f;
    private float cachedEndProgress = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    interface KeyframesWrapper<T> {
        jb<T> getCurrentKeyframe();

        float getEndProgress();

        float getStartDelayProgress();

        boolean isCachedValueEnabled(float f);

        boolean isEmpty();

        boolean isValueChanged(float f);
    }

    protected abstract A getValue(jb<K> jbVar, float f);

    public BaseKeyframeAnimation(List<? extends jb<K>> list) {
        this.keyframesWrapper = wrap(list);
    }

    public void setIsDiscrete() {
        this.isDiscrete = true;
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.listeners.add(animationListener);
    }

    public void setProgress(float f) {
        if (cv.e()) {
            cv.c("BaseKeyframeAnimation#setProgress");
        }
        if (this.keyframesWrapper.isEmpty()) {
            if (cv.e()) {
                cv.e("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f < getStartDelayProgress()) {
            f = getStartDelayProgress();
        } else if (f > getEndProgress()) {
            f = getEndProgress();
        }
        if (f == this.progress) {
            if (cv.e()) {
                cv.e("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.progress = f;
            if (this.keyframesWrapper.isValueChanged(f)) {
                notifyListeners();
            }
            if (cv.e()) {
                cv.e("BaseKeyframeAnimation#setProgress");
            }
        }
    }

    public void notifyListeners() {
        if (cv.e()) {
            cv.c("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
        if (cv.e()) {
            cv.e("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public jb<K> getCurrentKeyframe() {
        if (cv.e()) {
            cv.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        jb<K> currentKeyframe = this.keyframesWrapper.getCurrentKeyframe();
        if (cv.e()) {
            cv.e("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return currentKeyframe;
    }

    protected float getLinearCurrentKeyframeProgress() {
        if (this.isDiscrete) {
            return 0.0f;
        }
        jb<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.i()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.g()) / (currentKeyframe.c() - currentKeyframe.g());
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        jb<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe == null || currentKeyframe.i() || currentKeyframe.d == null) {
            return 0.0f;
        }
        return currentKeyframe.d.getInterpolation(getLinearCurrentKeyframeProgress());
    }

    private float getStartDelayProgress() {
        if (this.cachedStartDelayProgress == -1.0f) {
            this.cachedStartDelayProgress = this.keyframesWrapper.getStartDelayProgress();
        }
        return this.cachedStartDelayProgress;
    }

    protected float getEndProgress() {
        if (this.cachedEndProgress == -1.0f) {
            this.cachedEndProgress = this.keyframesWrapper.getEndProgress();
        }
        return this.cachedEndProgress;
    }

    public A getValue() {
        A value;
        float linearCurrentKeyframeProgress = getLinearCurrentKeyframeProgress();
        if (this.valueCallback == null && this.keyframesWrapper.isCachedValueEnabled(linearCurrentKeyframeProgress)) {
            return this.cachedGetValue;
        }
        jb<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.g != null && currentKeyframe.f != null) {
            value = getValue(currentKeyframe, linearCurrentKeyframeProgress, currentKeyframe.g.getInterpolation(linearCurrentKeyframeProgress), currentKeyframe.f.getInterpolation(linearCurrentKeyframeProgress));
        } else {
            value = getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress());
        }
        this.cachedGetValue = value;
        return value;
    }

    public float getProgress() {
        return this.progress;
    }

    public void setValueCallback(jf<A> jfVar) {
        jf<A> jfVar2 = this.valueCallback;
        if (jfVar2 != null) {
            jfVar2.setAnimation(null);
        }
        this.valueCallback = jfVar;
        if (jfVar != null) {
            jfVar.setAnimation(this);
        }
    }

    public boolean hasValueCallback() {
        return this.valueCallback != null;
    }

    protected A getValue(jb<K> jbVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    private static <T> KeyframesWrapper<T> wrap(List<? extends jb<T>> list) {
        if (list.isEmpty()) {
            return new e();
        }
        if (list.size() == 1) {
            return new a(list);
        }
        return new b(list);
    }

    static final class e<T> implements KeyframesWrapper<T> {
        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            return false;
        }

        private e() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public jb<T> getCurrentKeyframe() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            throw new IllegalStateException("not implemented");
        }
    }

    static final class a<T> implements KeyframesWrapper<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f1925b = -1.0f;
        private final jb<T> e;

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }

        a(List<? extends jb<T>> list) {
            this.e = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            return !this.e.i();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public jb<T> getCurrentKeyframe() {
            return this.e;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return this.e.g();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            return this.e.c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            if (this.f1925b == f) {
                return true;
            }
            this.f1925b = f;
            return false;
        }
    }

    static final class b<T> implements KeyframesWrapper<T> {
        private final List<? extends jb<T>> d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private jb<T> f1926a = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1928c = -1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private jb<T> f1927b = d(0.0f);

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isEmpty() {
            return false;
        }

        b(List<? extends jb<T>> list) {
            this.d = list;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isValueChanged(float f) {
            if (this.f1927b.c(f)) {
                return !this.f1927b.i();
            }
            this.f1927b = d(f);
            return true;
        }

        private jb<T> d(float f) {
            List<? extends jb<T>> list = this.d;
            jb<T> jbVar = list.get(list.size() - 1);
            if (f >= jbVar.g()) {
                return jbVar;
            }
            for (int size = this.d.size() - 2; size >= 1; size--) {
                jb<T> jbVar2 = this.d.get(size);
                if (this.f1927b != jbVar2 && jbVar2.c(f)) {
                    return jbVar2;
                }
            }
            return this.d.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public jb<T> getCurrentKeyframe() {
            return this.f1927b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getStartDelayProgress() {
            return this.d.get(0).g();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public float getEndProgress() {
            List<? extends jb<T>> list = this.d;
            return list.get(list.size() - 1).c();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.KeyframesWrapper
        public boolean isCachedValueEnabled(float f) {
            jb<T> jbVar = this.f1926a;
            jb<T> jbVar2 = this.f1927b;
            if (jbVar == jbVar2 && this.f1928c == f) {
                return true;
            }
            this.f1926a = jbVar2;
            this.f1928c = f;
            return false;
        }
    }
}
