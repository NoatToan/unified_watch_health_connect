package com.mapbox.maps.extension.compose;

import com.mapbox.common.Cancelable;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "FS", "Lcom/mapbox/maps/interactions/FeatureState;", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapState$getFeatureState$2$1$1 extends w implements l<Throwable, Unit> {
    final /* synthetic */ Cancelable $cancelable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapState$getFeatureState$2$1$1(Cancelable cancelable) {
        super(1);
        this.$cancelable = cancelable;
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th3) {
        invoke2(th3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th3) {
        this.$cancelable.cancel();
    }
}
