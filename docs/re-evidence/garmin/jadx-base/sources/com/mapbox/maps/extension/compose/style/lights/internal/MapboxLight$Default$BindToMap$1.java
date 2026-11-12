package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight$Default$BindToMap$1", f = "MapboxLight.kt", l = {}, m = "invokeSuspend")
public final class MapboxLight$Default$BindToMap$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxLight$Default$BindToMap$1(MapboxMap mapboxMap, d<? super MapboxLight$Default$BindToMap$1> dVar) {
        super(2, dVar);
        this.$mapboxMap = mapboxMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(String str) {
        MapboxLogger.logE("MapboxLight", "setStyleLights error: " + str);
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapboxLight$Default$BindToMap$1(this.$mapboxMap, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapboxLight$Default$BindToMap$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        MapboxMap mapboxMap = this.$mapboxMap;
        Value valueNullValue = Value.nullValue();
        valueNullValue.getClass();
        mapboxMap.setStyleLights(valueNullValue).onError(new a(0)).onValue(new a(1));
        return Unit.INSTANCE;
    }
}
