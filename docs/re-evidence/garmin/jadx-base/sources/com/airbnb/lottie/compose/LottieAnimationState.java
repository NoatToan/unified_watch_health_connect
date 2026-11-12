package com.airbnb.lottie.compose;

import com.airbnb.lottie.LottieComposition;
import p005kotlin.Metadata;
import p3.x3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0005¨\u0006\""}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationState;", "Lp3/x3;", "", "", "isPlaying", "()Z", "getProgress", "()F", "progress", "", "getIteration", "()I", "iteration", "getIterations", "iterations", "getReverseOnRepeat", "reverseOnRepeat", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "getSpeed", "speed", "getUseCompositionFrameRate", "useCompositionFrameRate", "Lcom/airbnb/lottie/LottieComposition;", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getLastFrameNanos", "()J", "lastFrameNanos", "isAtEnd", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface LottieAnimationState extends x3<Float> {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static long getLastFrameNanos(LottieAnimationState lottieAnimationState) {
            return Long.MIN_VALUE;
        }
    }

    LottieClipSpec getClipSpec();

    LottieComposition getComposition();

    int getIteration();

    int getIterations();

    long getLastFrameNanos();

    float getProgress();

    boolean getReverseOnRepeat();

    float getSpeed();

    boolean getUseCompositionFrameRate();

    @Override // p3.x3
    /* synthetic */ Float getValue();

    boolean isAtEnd();

    boolean isPlaying();
}
