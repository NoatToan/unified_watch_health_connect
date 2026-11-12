package com.mapbox.maps.extension.compose.style.lights.generated;

import com.mapbox.maps.MapboxMap;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class AmbientLightState$UpdateProperties$1 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MapboxMap $mapboxMap;
    final /* synthetic */ AmbientLightState $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbientLightState$UpdateProperties$1(AmbientLightState ambientLightState, MapboxMap mapboxMap, int i14) {
        super(2);
        this.$tmp0_rcvr = ambientLightState;
        this.$mapboxMap = mapboxMap;
        this.$$changed = i14;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(m mVar, int i14) {
        this.$tmp0_rcvr.UpdateProperties$extension_compose_release(this.$mapboxMap, mVar, this.$$changed | 1);
    }
}
