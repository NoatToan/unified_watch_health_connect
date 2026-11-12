package com.mapbox.maps.extension.compose.style.lights.generated;

import com.mapbox.maps.MapboxLogger;
import d4.n;
import e23.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld4/n;", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;", "ambientLightState", "Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState$Holder;", "invoke", "(Ld4/n;Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState;)Lcom/mapbox/maps/extension/compose/style/lights/generated/AmbientLightState$Holder;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class AmbientLightState$Companion$Saver$1 extends w implements p<n, AmbientLightState, AmbientLightState.Holder> {
    public static final AmbientLightState$Companion$Saver$1 INSTANCE = new AmbientLightState$Companion$Saver$1();

    public AmbientLightState$Companion$Saver$1() {
        super(2);
    }

    @Override // e23.p
    public final AmbientLightState.Holder invoke(n nVar, AmbientLightState ambientLightState) {
        nVar.getClass();
        ambientLightState.getClass();
        AmbientLightState.Holder holder = new AmbientLightState.Holder(ambientLightState.getProperties$extension_compose_release());
        MapboxLogger.logD("AmbientLightState", "save: " + holder);
        return holder;
    }
}
