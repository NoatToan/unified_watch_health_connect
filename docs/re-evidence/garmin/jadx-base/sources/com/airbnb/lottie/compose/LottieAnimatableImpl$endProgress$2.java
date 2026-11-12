package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class LottieAnimatableImpl$endProgress$2 extends w implements a<Float> {
    final /* synthetic */ LottieAnimatableImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$endProgress$2(LottieAnimatableImpl lottieAnimatableImpl) {
        super(0);
        this.this$0 = lottieAnimatableImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // e23.a
    public final Float invoke() {
        LottieComposition composition = this.this$0.getComposition();
        float maxProgress$lottie_compose_release = 0.0f;
        if (composition != null) {
            float speed = this.this$0.getSpeed();
            LottieAnimatableImpl lottieAnimatableImpl = this.this$0;
            if (speed < 0.0f) {
                LottieClipSpec clipSpec = lottieAnimatableImpl.getClipSpec();
                if (clipSpec != null) {
                    maxProgress$lottie_compose_release = clipSpec.getMinProgress$lottie_compose_release(composition);
                }
            } else {
                LottieClipSpec clipSpec2 = lottieAnimatableImpl.getClipSpec();
                maxProgress$lottie_compose_release = clipSpec2 != null ? clipSpec2.getMaxProgress$lottie_compose_release(composition) : 1.0f;
            }
        }
        return Float.valueOf(maxProgress$lottie_compose_release);
    }
}
