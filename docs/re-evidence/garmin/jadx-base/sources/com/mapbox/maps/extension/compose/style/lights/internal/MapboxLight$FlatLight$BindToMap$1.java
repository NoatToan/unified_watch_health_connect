package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.w;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight$FlatLight$BindToMap$1", f = "MapboxLight.kt", l = {}, m = "invokeSuspend")
public final class MapboxLight$FlatLight$BindToMap$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    int label;
    final /* synthetic */ MapboxLight.FlatLight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxLight$FlatLight$BindToMap$1(MapboxLight.FlatLight flatLight, MapboxMap mapboxMap, d<? super MapboxLight$FlatLight$BindToMap$1> dVar) {
        super(2, dVar);
        this.this$0 = flatLight;
        this.$mapboxMap = mapboxMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(String str) {
        MapboxLogger.logE("MapboxLight", "setStyleLights error: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(List list, None none) {
        MapboxLogger.logD("MapboxLight", "setStyleLights: " + list);
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapboxLight$FlatLight$BindToMap$1(this.this$0, this.$mapboxMap, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapboxLight$FlatLight$BindToMap$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        List listC = w.c(new Value(this.this$0.flatLightState.getProperties$extension_compose_release()));
        this.$mapboxMap.setStyleLights(new Value((List<Value>) listC)).onError(new a(3)).onValue(new b(listC, 1));
        return Unit.INSTANCE;
    }
}
