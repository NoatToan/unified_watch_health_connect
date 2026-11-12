package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.mapbox.maps.plugin.attribution.Attribution;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final class MapAttributionScope$AttributionDialog$1$1$1$1 extends w implements l<Integer, Unit> {
    final /* synthetic */ Attribution $attribution;
    final /* synthetic */ l<Attribution, Unit> $onAttributionClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapAttributionScope$AttributionDialog$1$1$1$1(l<? super Attribution, Unit> lVar, Attribution attribution) {
        super(1);
        this.$onAttributionClick = lVar;
        this.$attribution = attribution;
    }

    @Override // e23.l
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i14) {
        this.$onAttributionClick.invoke(this.$attribution);
    }
}
