package defpackage;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.model.animatable.BaseAnimatableValue;
import java.util.List;

/* JADX INFO: loaded from: classes21.dex */
public class gd extends BaseAnimatableValue<DocumentData, DocumentData> {
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

    public gd(List<jb<DocumentData>> list) {
        super((List) list);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public fn createAnimation() {
        return new fn(this.keyframes);
    }
}
