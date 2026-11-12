package defpackage;

import com.huawei.dynamicanimation.DynamicAnimation;
import com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase;

/* JADX INFO: loaded from: classes4.dex */
public class crb extends PhysicalInterpolatorBase<crb> {
    public crb(float f, float f2) {
        super(DynamicAnimation.AXIS_X, new cqu(f, f2));
        ((cqu) getModel()).setValueThreshold(getValueThreshold());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public crb setValueThreshold(float f) {
        getModel().setValueThreshold(f * 0.75f);
        return this;
    }

    @Override // com.huawei.dynamicanimation.interpolator.PhysicalInterpolatorBase
    public float getDeltaX() {
        return getEndOffset();
    }

    public cqy e(float f) {
        float duration = (f * getDuration()) / 1000.0f;
        return new cqy(duration, getModel().getPosition(duration), getModel().getVelocity(duration), getModel().getAcceleration(duration));
    }
}
