package com.mapbox.maps.extension.compose.style.layers.generated;

import com.mapbox.maps.extension.compose.style.layers.internal.LayerNode;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class ModelLayerState$UpdateProperties$1 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ LayerNode $layerNode;
    final /* synthetic */ ModelLayerState $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelLayerState$UpdateProperties$1(ModelLayerState modelLayerState, LayerNode layerNode, int i14) {
        super(2);
        this.$tmp0_rcvr = modelLayerState;
        this.$layerNode = layerNode;
        this.$$changed = i14;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(m mVar, int i14) {
        this.$tmp0_rcvr.UpdateProperties$extension_compose_release(this.$layerNode, mVar, this.$$changed | 1);
    }
}
