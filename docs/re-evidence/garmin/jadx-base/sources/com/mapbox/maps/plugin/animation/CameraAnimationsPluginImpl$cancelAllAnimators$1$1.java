package com.mapbox.maps.plugin.animation;

import com.mapbox.maps.plugin.animation.animator.CameraAnimator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class CameraAnimationsPluginImpl$cancelAllAnimators$1$1 extends w implements e23.a<Unit> {
    final /* synthetic */ CameraAnimator<?> $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraAnimationsPluginImpl$cancelAllAnimators$1$1(CameraAnimator<?> cameraAnimator) {
        super(0);
        this.$it = cameraAnimator;
    }

    @Override // e23.a
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$it.cancel();
    }
}
