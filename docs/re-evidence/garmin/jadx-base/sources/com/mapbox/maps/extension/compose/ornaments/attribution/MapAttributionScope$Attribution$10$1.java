package com.mapbox.maps.extension.compose.ornaments.attribution;

import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.None;
import com.mapbox.common.geofencing.GeofencingError;
import com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.extension.compose.ornaments.attribution.internal.AttributionComposePlugin;
import e23.p;
import o13.q;
import o13.r;
import o53.b0;
import o53.j;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import t13.d;
import u13.a;
import u13.f;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope$Attribution$10$1", f = "MapAttributionScope.kt", l = {547}, m = "invokeSuspend")
public final class MapAttributionScope$Attribution$10$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ p1<Boolean> $geofencingUserConsentState$delegate;
    final /* synthetic */ String $pluginId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$10$1(MapAttributionScope mapAttributionScope, String str, p1<Boolean> p1Var, d<? super MapAttributionScope$Attribution$10$1> dVar) {
        super(2, dVar);
        this.this$0 = mapAttributionScope;
        this.$pluginId = str;
        this.$geofencingUserConsentState$delegate = p1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapAttributionScope$Attribution$10$1(this.this$0, this.$pluginId, this.$geofencingUserConsentState$delegate, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapAttributionScope$Attribution$10$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            AttributionComposePlugin attributionComposePlugin = (AttributionComposePlugin) this.this$0.mapView.getPlugin(this.$pluginId);
            if (attributionComposePlugin != null) {
                p1<Boolean> p1Var = this.$geofencingUserConsentState$delegate;
                this.L$0 = p1Var;
                this.L$1 = attributionComposePlugin;
                this.L$2 = this;
                this.label = 1;
                final k kVar = new k(f.b(this), 1);
                kVar.q();
                attributionComposePlugin.getMapAttributionDelegate$extension_compose_release().getMapGeofencingConsent().setUserConsent(MapAttributionScope.Attribution_hYmLsZ8$lambda$18(p1Var), new GeofencingUtilsUserConsentResponseCallback() { // from class: com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope$Attribution$10$1$1$error$1$1
                    @Override // com.mapbox.common.geofencing.GeofencingUtilsUserConsentResponseCallback
                    public final void run(Expected<GeofencingError, None> expected) {
                        expected.getClass();
                        j<GeofencingError> jVar = kVar;
                        int i15 = q.f128596b;
                        jVar.resumeWith(expected.getError());
                    }
                });
                obj = kVar.p();
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        GeofencingError geofencingError = (GeofencingError) obj;
        if (geofencingError != null) {
            MapboxLogger.logW("GeofencingConsent", "Unable to set user consent: " + geofencingError.getType());
        }
        return Unit.INSTANCE;
    }
}
