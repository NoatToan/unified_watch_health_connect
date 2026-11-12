package com.mapbox.maps.extension.compose.style.precipitations.generated;

import d4.n;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld4/n;", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;", "it", "Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState$Holder;", "invoke", "(Ld4/n;Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState;)Lcom/mapbox/maps/extension/compose/style/precipitations/generated/SnowState$Holder;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class SnowState$Companion$Saver$1 extends w implements p<n, SnowState, SnowState.Holder> {
    public static final SnowState$Companion$Saver$1 INSTANCE = new SnowState$Companion$Saver$1();

    public SnowState$Companion$Saver$1() {
        super(2);
    }

    @Override // e23.p
    public final SnowState.Holder invoke(n nVar, SnowState snowState) {
        nVar.getClass();
        snowState.getClass();
        return new SnowState.Holder(snowState.getProperties(), snowState.getApplier().getEnabled());
    }
}
