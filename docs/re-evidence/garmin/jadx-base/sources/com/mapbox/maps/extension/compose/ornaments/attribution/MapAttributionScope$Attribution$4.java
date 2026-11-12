package com.mapbox.maps.extension.compose.ornaments.attribution;

import c2.h2;
import com.mapbox.maps.plugin.attribution.Attribution;
import e23.a;
import e23.l;
import e23.p;
import e23.s;
import e23.t;
import h4.d;
import h4.r;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$4 extends w implements p<m, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ d $alignment;
    final /* synthetic */ s<List<Attribution>, a<Unit>, l<? super Attribution, Unit>, m, Integer, Unit> $attributionDialog;
    final /* synthetic */ h2 $contentPadding;
    final /* synthetic */ long $iconColor;
    final /* synthetic */ r $modifier;
    final /* synthetic */ t<a<Unit>, a<Unit>, a<Unit>, a<Unit>, m, Integer, Unit> $telemetryDialog;
    final /* synthetic */ MapAttributionScope $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapAttributionScope$Attribution$4(MapAttributionScope mapAttributionScope, r rVar, h2 h2Var, d dVar, long j8, s<? super List<Attribution>, ? super a<Unit>, ? super l<? super Attribution, Unit>, ? super m, ? super Integer, Unit> sVar, t<? super a<Unit>, ? super a<Unit>, ? super a<Unit>, ? super a<Unit>, ? super m, ? super Integer, Unit> tVar, int i14, int i15) {
        super(2);
        this.$tmp0_rcvr = mapAttributionScope;
        this.$modifier = rVar;
        this.$contentPadding = h2Var;
        this.$alignment = dVar;
        this.$iconColor = j8;
        this.$attributionDialog = sVar;
        this.$telemetryDialog = tVar;
        this.$$changed = i14;
        this.$$default = i15;
    }

    public final void invoke(m mVar, int i14) {
        this.$tmp0_rcvr.m211AttributionfWhpE4E(this.$modifier, this.$contentPadding, this.$alignment, this.$iconColor, this.$attributionDialog, this.$telemetryDialog, mVar, this.$$changed | 1, this.$$default);
    }

    @Override // e23.p
    public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
        invoke(mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
