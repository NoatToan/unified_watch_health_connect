package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.mapbox.maps.plugin.attribution.Attribution;
import e23.a;
import e23.l;
import e23.s;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$Attribution$5 extends w implements s<List<? extends Attribution>, a<? extends Unit>, l<? super Attribution, ? extends Unit>, m, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$5(MapAttributionScope mapAttributionScope, int i14) {
        super(5);
        this.this$0 = mapAttributionScope;
        this.$$dirty = i14;
    }

    public final void invoke(List<Attribution> list, a<Unit> aVar, l<? super Attribution, Unit> lVar, m mVar, int i14) {
        list.getClass();
        aVar.getClass();
        lVar.getClass();
        x1 x1Var = n.f135158a;
        this.this$0.AttributionDialog(list, aVar, lVar, mVar, (i14 & 896) | (i14 & 112) | 8 | ((this.$$dirty >> 12) & 7168));
    }

    @Override // e23.s
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends Attribution> list, a<? extends Unit> aVar, l<? super Attribution, ? extends Unit> lVar, m mVar, Integer num) {
        invoke((List<Attribution>) list, (a<Unit>) aVar, (l<? super Attribution, Unit>) lVar, mVar, num.intValue());
        return Unit.INSTANCE;
    }
}
