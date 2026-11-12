package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import java.util.Collections;

/* JADX INFO: loaded from: classes21.dex */
public class fe extends BaseKeyframeAnimation<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected jf<Float> f33924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BaseKeyframeAnimation<Float, Float> f33925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected jf<Float> f33926c;
    private final PointF d;
    private final PointF e;
    private final BaseKeyframeAnimation<Float, Float> f;

    public fe(BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation, BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2) {
        super(Collections.EMPTY_LIST);
        this.e = new PointF();
        this.d = new PointF();
        this.f33925b = baseKeyframeAnimation;
        this.f = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    public void e(jf<Float> jfVar) {
        jf<Float> jfVar2 = this.f33924a;
        if (jfVar2 != null) {
            jfVar2.setAnimation(null);
        }
        this.f33924a = jfVar;
        if (jfVar != null) {
            jfVar.setAnimation(this);
        }
    }

    public void b(jf<Float> jfVar) {
        jf<Float> jfVar2 = this.f33926c;
        if (jfVar2 != null) {
            jfVar2.setAnimation(null);
        }
        this.f33926c = jfVar;
        if (jfVar != null) {
            jfVar.setAnimation(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.f33925b.setProgress(f);
        this.f.setProgress(f);
        this.e.set(this.f33925b.getValue().floatValue(), this.f.getValue().floatValue());
        for (int i = 0; i < this.listeners.size(); i++) {
            this.listeners.get(i).onValueChanged();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PointF getValue() {
        return getValue(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public PointF getValue(jb<PointF> jbVar, float f) {
        Float valueInternal;
        jb<Float> currentKeyframe;
        jb<Float> currentKeyframe2;
        Float valueInternal2 = null;
        if (this.f33924a == null || (currentKeyframe2 = this.f33925b.getCurrentKeyframe()) == null) {
            valueInternal = null;
        } else {
            float interpolatedCurrentKeyframeProgress = this.f33925b.getInterpolatedCurrentKeyframeProgress();
            Float f2 = currentKeyframe2.f38327a;
            valueInternal = this.f33924a.getValueInternal(currentKeyframe2.h, f2 == null ? currentKeyframe2.h : f2.floatValue(), currentKeyframe2.j, currentKeyframe2.f38328b, f, f, interpolatedCurrentKeyframeProgress);
        }
        if (this.f33926c != null && (currentKeyframe = this.f.getCurrentKeyframe()) != null) {
            float interpolatedCurrentKeyframeProgress2 = this.f.getInterpolatedCurrentKeyframeProgress();
            Float f3 = currentKeyframe.f38327a;
            valueInternal2 = this.f33926c.getValueInternal(currentKeyframe.h, f3 == null ? currentKeyframe.h : f3.floatValue(), currentKeyframe.j, currentKeyframe.f38328b, f, f, interpolatedCurrentKeyframeProgress2);
        }
        if (valueInternal == null) {
            this.d.set(this.e.x, 0.0f);
        } else {
            this.d.set(valueInternal.floatValue(), 0.0f);
        }
        if (valueInternal2 == null) {
            PointF pointF = this.d;
            pointF.set(pointF.x, this.e.y);
        } else {
            PointF pointF2 = this.d;
            pointF2.set(pointF2.x, valueInternal2.floatValue());
        }
        return this.d;
    }
}
