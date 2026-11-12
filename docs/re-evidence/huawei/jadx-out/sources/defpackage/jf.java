package defpackage;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;

/* JADX INFO: loaded from: classes21.dex */
public class jf<T> {
    private BaseKeyframeAnimation<?, ?> animation;
    private final ji<T> frameInfo;
    protected T value;

    public jf() {
        this.frameInfo = new ji<>();
        this.value = null;
    }

    public jf(T t) {
        this.frameInfo = new ji<>();
        this.value = t;
    }

    public T getValue(ji<T> jiVar) {
        return this.value;
    }

    public final void setValue(T t) {
        this.value = t;
        BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.animation;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return getValue(this.frameInfo.a(f, f2, t, t2, f3, f4, f5));
    }

    public final void setAnimation(BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.animation = baseKeyframeAnimation;
    }
}
