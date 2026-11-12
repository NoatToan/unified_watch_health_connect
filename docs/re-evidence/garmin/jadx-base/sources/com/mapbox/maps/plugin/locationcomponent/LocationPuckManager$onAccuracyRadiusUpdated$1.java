package com.mapbox.maps.plugin.locationcomponent;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
public final class LocationPuckManager$onAccuracyRadiusUpdated$1 extends w implements l<Double, Unit> {
    final /* synthetic */ LocationPuckManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationPuckManager$onAccuracyRadiusUpdated$1(LocationPuckManager locationPuckManager) {
        super(1);
        this.this$0 = locationPuckManager;
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Double d14) {
        invoke(d14.doubleValue());
        return Unit.INSTANCE;
    }

    public final void invoke(double d14) {
        this.this$0.lastAccuracyRadius = d14;
    }
}
