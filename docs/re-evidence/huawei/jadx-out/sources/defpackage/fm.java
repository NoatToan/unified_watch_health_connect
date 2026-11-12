package defpackage;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public class fm<K, A> extends BaseKeyframeAnimation<K, A> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A f34231c;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public float getEndProgress() {
        return 1.0f;
    }

    public fm(jf<A> jfVar) {
        this(jfVar, null);
    }

    public fm(jf<A> jfVar, A a2) {
        super(Collections.EMPTY_LIST);
        setValueCallback(jfVar);
        this.f34231c = a2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.progress = f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public A getValue() {
        jf<A> jfVar = this.valueCallback;
        A a2 = this.f34231c;
        return jfVar.getValueInternal(0.0f, 0.0f, a2, a2, getProgress(), getProgress(), getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public A getValue(jb<K> jbVar, float f) {
        return getValue();
    }
}
