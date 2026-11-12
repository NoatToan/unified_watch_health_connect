package defpackage;

import android.graphics.PointF;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class ga implements AnimatableValue<PointF, PointF> {
    private final List<jb<PointF>> d;

    public ga(List<jb<PointF>> list) {
        this.d = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public List<jb<PointF>> getKeyframes() {
        return this.d;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.d.size() == 1 && this.d.get(0).i();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<PointF, PointF> createAnimation() {
        if (this.d.get(0).i()) {
            return new ff(this.d);
        }
        return new fg(this.d);
    }
}
