package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.model.animatable.BaseAnimatableValue;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class fy extends BaseAnimatableValue<gq, Path> {
    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public fy(List<jb<gq>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public fi createAnimation() {
        return new fi(this.keyframes);
    }
}
