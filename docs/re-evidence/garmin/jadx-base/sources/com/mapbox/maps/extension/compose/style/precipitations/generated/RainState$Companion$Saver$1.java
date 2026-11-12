package com.mapbox.maps.extension.compose.style.precipitations.generated;

import d4.n;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld4/n;", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;", "it", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState$Holder;", "invoke", "(Ld4/n;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState;)Lcom/mapbox/maps/extension/compose/style/precipitations/generated/RainState$Holder;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class RainState$Companion$Saver$1 extends w implements p<n, RainState, RainState.Holder> {
    public static final RainState$Companion$Saver$1 INSTANCE = new RainState$Companion$Saver$1();

    public RainState$Companion$Saver$1() {
        super(2);
    }

    @Override // e23.p
    public final RainState.Holder invoke(n nVar, RainState rainState) {
        nVar.getClass();
        rainState.getClass();
        return new RainState.Holder(rainState.getProperties(), rainState.getApplier().getEnabled());
    }
}
