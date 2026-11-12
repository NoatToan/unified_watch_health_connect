package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.maps.MapboxMap;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapboxLight$NoOp$BindToMap$1 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ MapboxMap $mapboxMap;
    final /* synthetic */ MapboxLight.NoOp $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxLight$NoOp$BindToMap$1(MapboxLight.NoOp noOp, MapboxMap mapboxMap, int i14) {
        super(2);
        this.$tmp0_rcvr = noOp;
        this.$mapboxMap = mapboxMap;
        this.$$changed = i14;
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(m mVar, int i14) {
        this.$tmp0_rcvr.BindToMap$extension_compose_release(this.$mapboxMap, mVar, this.$$changed | 1);
    }
}
