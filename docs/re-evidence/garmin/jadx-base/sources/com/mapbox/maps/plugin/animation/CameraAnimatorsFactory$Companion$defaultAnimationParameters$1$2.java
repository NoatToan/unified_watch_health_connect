package com.mapbox.maps.plugin.animation;

import android.animation.ValueAnimator;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroid/animation/ValueAnimator;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$2 extends w implements l<ValueAnimator, Unit> {
    public static final CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$2 INSTANCE = new CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$2();

    public CameraAnimatorsFactory$Companion$defaultAnimationParameters$1$2() {
        super(1);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        valueAnimator.setDuration(300L);
        valueAnimator.setInterpolator(CameraAnimatorsFactory.DEFAULT_INTERPOLATOR);
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(ValueAnimator valueAnimator) {
        invoke2(valueAnimator);
        return Unit.INSTANCE;
    }
}
