package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.L;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseKeyframeAnimation<K, A> {
    private final c<K> c;

    @Nullable
    public LottieValueCallback<A> valueCallback;
    public final List<AnimationListener> a = new ArrayList(1);
    private boolean b = false;
    public float progress = 0.0f;

    @Nullable
    private A d = null;
    private float e = -1.0f;
    private float f = -1.0f;

    public interface AnimationListener {
        void onValueChanged();
    }

    public static final class b<T> implements c<T> {
        private b() {
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public Keyframe<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public float b() {
            return 0.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean c(float f) {
            throw new IllegalStateException("not implemented");
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean d(float f) {
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public float e() {
            return 1.0f;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean isEmpty() {
            return true;
        }
    }

    public interface c<T> {
        Keyframe<T> a();

        @FloatRange(from = 0.0d, to = 1.0d)
        float b();

        boolean c(float f);

        boolean d(float f);

        @FloatRange(from = 0.0d, to = 1.0d)
        float e();

        boolean isEmpty();
    }

    public static final class d<T> implements c<T> {
        private final List<? extends Keyframe<T>> a;
        private Keyframe<T> c = null;
        private float d = -1.0f;

        @NonNull
        private Keyframe<T> b = f(0.0f);

        public d(List<? extends Keyframe<T>> list) {
            this.a = list;
        }

        private Keyframe<T> f(float f) {
            List<? extends Keyframe<T>> list = this.a;
            Keyframe<T> keyframe = list.get(list.size() - 1);
            if (f >= keyframe.getStartProgress()) {
                return keyframe;
            }
            for (int size = this.a.size() - 2; size >= 1; size--) {
                Keyframe<T> keyframe2 = this.a.get(size);
                if (this.b != keyframe2 && keyframe2.containsProgress(f)) {
                    return keyframe2;
                }
            }
            return this.a.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        @NonNull
        public Keyframe<T> a() {
            return this.b;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public float b() {
            return this.a.get(0).getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean c(float f) {
            Keyframe<T> keyframe = this.c;
            Keyframe<T> keyframe2 = this.b;
            if (keyframe == keyframe2 && this.d == f) {
                return true;
            }
            this.c = keyframe2;
            this.d = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean d(float f) {
            if (this.b.containsProgress(f)) {
                return !this.b.isStatic();
            }
            this.b = f(f);
            return true;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public float e() {
            List<? extends Keyframe<T>> list = this.a;
            return list.get(list.size() - 1).getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean isEmpty() {
            return false;
        }
    }

    public static final class e<T> implements c<T> {

        @NonNull
        private final Keyframe<T> a;
        private float b = -1.0f;

        public e(List<? extends Keyframe<T>> list) {
            this.a = list.get(0);
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public Keyframe<T> a() {
            return this.a;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public float b() {
            return this.a.getStartProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean c(float f) {
            if (this.b == f) {
                return true;
            }
            this.b = f;
            return false;
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean d(float f) {
            return !this.a.isStatic();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public float e() {
            return this.a.getEndProgress();
        }

        @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.c
        public boolean isEmpty() {
            return false;
        }
    }

    public BaseKeyframeAnimation(List<? extends Keyframe<K>> list) {
        this.c = d(list);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    private float c() {
        if (this.e == -1.0f) {
            this.e = this.c.b();
        }
        return this.e;
    }

    private static <T> c<T> d(List<? extends Keyframe<T>> list) {
        if (list.isEmpty()) {
            return new b();
        }
        return list.size() == 1 ? new e(list) : new d(list);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float a() {
        if (this.f == -1.0f) {
            this.f = this.c.e();
        }
        return this.f;
    }

    public void addUpdateListener(AnimationListener animationListener) {
        this.a.add(animationListener);
    }

    public float b() {
        if (this.b) {
            return 0.0f;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return (this.progress - currentKeyframe.getStartProgress()) / (currentKeyframe.getEndProgress() - currentKeyframe.getStartProgress());
    }

    public Keyframe<K> getCurrentKeyframe() {
        L.beginSection("BaseKeyframeAnimation#getCurrentKeyframe");
        Keyframe<K> keyframeA = this.c.a();
        L.endSection("BaseKeyframeAnimation#getCurrentKeyframe");
        return keyframeA;
    }

    public float getInterpolatedCurrentKeyframeProgress() {
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        if (currentKeyframe.isStatic()) {
            return 0.0f;
        }
        return currentKeyframe.interpolator.getInterpolation(b());
    }

    public float getProgress() {
        return this.progress;
    }

    public A getValue() {
        float fB = b();
        if (this.valueCallback == null && this.c.c(fB)) {
            return this.d;
        }
        Keyframe<K> currentKeyframe = getCurrentKeyframe();
        Interpolator interpolator = currentKeyframe.xInterpolator;
        A value = (interpolator == null || currentKeyframe.yInterpolator == null) ? getValue(currentKeyframe, getInterpolatedCurrentKeyframeProgress()) : getValue(currentKeyframe, fB, interpolator.getInterpolation(fB), currentKeyframe.yInterpolator.getInterpolation(fB));
        this.d = value;
        return value;
    }

    public abstract A getValue(Keyframe<K> keyframe, float f);

    public void notifyListeners() {
        for (int i = 0; i < this.a.size(); i++) {
            this.a.get(i).onValueChanged();
        }
    }

    public void setIsDiscrete() {
        this.b = true;
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        if (this.c.isEmpty()) {
            return;
        }
        if (f < c()) {
            f = c();
        } else if (f > a()) {
            f = a();
        }
        if (f == this.progress) {
            return;
        }
        this.progress = f;
        if (this.c.d(f)) {
            notifyListeners();
        }
    }

    public void setValueCallback(@Nullable LottieValueCallback<A> lottieValueCallback) {
        LottieValueCallback<A> lottieValueCallback2 = this.valueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.valueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public A getValue(Keyframe<K> keyframe, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
}
