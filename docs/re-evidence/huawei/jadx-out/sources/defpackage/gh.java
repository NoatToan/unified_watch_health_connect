package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class gh implements AnimatableValue<PointF, PointF> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fu f35097a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final fu f35098c;

    public gh(fu fuVar, fu fuVar2) {
        this.f35097a = fuVar;
        this.f35098c = fuVar2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<jb<PointF>> getKeyframes() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.f35097a.isStatic() && this.f35098c.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        return new fe(this.f35097a.createAnimation(), this.f35098c.createAnimation());
    }
}
