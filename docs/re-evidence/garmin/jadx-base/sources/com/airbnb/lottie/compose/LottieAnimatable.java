package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import org.apache.commons.lang3.e;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J:\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0080\u0001\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\bH¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "progress", "", "iteration", "", "resetLastFrameNanos", "", "snapTo", "(Lcom/airbnb/lottie/LottieComposition;FIZLt13/d;)Ljava/lang/Object;", "iterations", "reverseOnRepeat", "speed", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "animate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLt13/d;)Ljava/lang/Object;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LottieAnimatable extends LottieAnimationState {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object animate$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, int i14, int i15, boolean z14, float f14, LottieClipSpec lottieClipSpec, float f15, boolean z15, LottieCancellationBehavior lottieCancellationBehavior, boolean z16, boolean z17, d dVar, int i16, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: animate");
                return null;
            }
            int iteration = (i16 & 2) != 0 ? lottieAnimatable.getIteration() : i14;
            int iterations = (i16 & 4) != 0 ? lottieAnimatable.getIterations() : i15;
            boolean reverseOnRepeat = (i16 & 8) != 0 ? lottieAnimatable.getReverseOnRepeat() : z14;
            float speed = (i16 & 16) != 0 ? lottieAnimatable.getSpeed() : f14;
            LottieClipSpec clipSpec = (i16 & 32) != 0 ? lottieAnimatable.getClipSpec() : lottieClipSpec;
            return lottieAnimatable.animate(lottieComposition, iteration, iterations, reverseOnRepeat, speed, clipSpec, (i16 & 64) != 0 ? LottieAnimatableKt.defaultProgress(lottieComposition, clipSpec, speed) : f15, (i16 & 128) != 0 ? false : z15, (i16 & 256) != 0 ? LottieCancellationBehavior.Immediately : lottieCancellationBehavior, (i16 & 512) != 0 ? false : z16, (i16 & 1024) != 0 ? false : z17, dVar);
        }

        public static long getLastFrameNanos(LottieAnimatable lottieAnimatable) {
            return LottieAnimationState.DefaultImpls.getLastFrameNanos(lottieAnimatable);
        }

        public static /* synthetic */ Object snapTo$default(LottieAnimatable lottieAnimatable, LottieComposition lottieComposition, float f14, int i14, boolean z14, d dVar, int i15, Object obj) {
            if (obj != null) {
                e.w("Super calls with default arguments not supported in this target, function: snapTo");
                return null;
            }
            if ((i15 & 1) != 0) {
                lottieComposition = lottieAnimatable.getComposition();
            }
            if ((i15 & 2) != 0) {
                f14 = lottieAnimatable.getProgress();
            }
            if ((i15 & 4) != 0) {
                i14 = lottieAnimatable.getIteration();
            }
            if ((i15 & 8) != 0) {
                z14 = !(f14 == lottieAnimatable.getProgress());
            }
            return lottieAnimatable.snapTo(lottieComposition, f14, i14, z14, dVar);
        }
    }

    Object animate(LottieComposition lottieComposition, int i14, int i15, boolean z14, float f14, LottieClipSpec lottieClipSpec, float f15, boolean z15, LottieCancellationBehavior lottieCancellationBehavior, boolean z16, boolean z17, d<? super Unit> dVar);

    @Override // com.airbnb.lottie.compose.LottieAnimationState, p3.x3
    /* JADX INFO: renamed from: getValue */
    /* synthetic */ Float getF182175a();

    Object snapTo(LottieComposition lottieComposition, float f14, int i14, boolean z14, d<? super Unit> dVar);
}
