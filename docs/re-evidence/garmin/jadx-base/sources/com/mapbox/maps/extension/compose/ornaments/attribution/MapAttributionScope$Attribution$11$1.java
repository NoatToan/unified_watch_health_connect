package com.mapbox.maps.extension.compose.ornaments.attribution;

import android.content.Context;
import com.mapbox.maps.extension.compose.ornaments.attribution.internal.AttributionComposePlugin;
import com.mapbox.maps.plugin.attribution.Attribution;
import com.mapbox.maps.plugin.attribution.AttributionParserConfig;
import com.mapbox.maps.plugin.delegates.MapAttributionDelegate;
import e23.p;
import f4.s;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.ornaments.attribution.MapAttributionScope$Attribution$11$1", f = "MapAttributionScope.kt", l = {}, m = "invokeSuspend")
public final class MapAttributionScope$Attribution$11$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ s<Attribution> $attributions;
    final /* synthetic */ p1<String> $mapboxFeedbackUrl$delegate;
    final /* synthetic */ String $pluginId;
    int label;
    final /* synthetic */ MapAttributionScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapAttributionScope$Attribution$11$1(MapAttributionScope mapAttributionScope, String str, s<Attribution> sVar, p1<String> p1Var, d<? super MapAttributionScope$Attribution$11$1> dVar) {
        super(2, dVar);
        this.this$0 = mapAttributionScope;
        this.$pluginId = str;
        this.$attributions = sVar;
        this.$mapboxFeedbackUrl$delegate = p1Var;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapAttributionScope$Attribution$11$1(this.this$0, this.$pluginId, this.$attributions, this.$mapboxFeedbackUrl$delegate, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapAttributionScope$Attribution$11$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        AttributionComposePlugin attributionComposePlugin = (AttributionComposePlugin) this.this$0.mapView.getPlugin(this.$pluginId);
        if (attributionComposePlugin != null) {
            s<Attribution> sVar = this.$attributions;
            MapAttributionScope mapAttributionScope = this.this$0;
            p1<String> p1Var = this.$mapboxFeedbackUrl$delegate;
            sVar.clear();
            MapAttributionDelegate mapAttributionDelegate$extension_compose_release = attributionComposePlugin.getMapAttributionDelegate$extension_compose_release();
            Context context = mapAttributionScope.mapView.getContext();
            context.getClass();
            sVar.addAll(mapAttributionDelegate$extension_compose_release.parseAttributions(context, new AttributionParserConfig(false, false, false, false, false, false, 63, null)));
            MapAttributionDelegate mapAttributionDelegate$extension_compose_release2 = attributionComposePlugin.getMapAttributionDelegate$extension_compose_release();
            Context context2 = mapAttributionScope.mapView.getContext();
            context2.getClass();
            p1Var.setValue(mapAttributionDelegate$extension_compose_release2.buildMapBoxFeedbackUrl(context2));
        }
        return Unit.INSTANCE;
    }
}
