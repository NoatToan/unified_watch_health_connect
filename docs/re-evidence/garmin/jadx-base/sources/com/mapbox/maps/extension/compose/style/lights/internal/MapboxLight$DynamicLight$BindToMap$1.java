package com.mapbox.maps.extension.compose.style.lights.internal;

import com.mapbox.bindgen.None;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.extension.compose.style.lights.generated.DirectionalLightState;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.style.lights.internal.MapboxLight$DynamicLight$BindToMap$1", f = "MapboxLight.kt", l = {}, m = "invokeSuspend")
public final class MapboxLight$DynamicLight$BindToMap$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $mapboxMap;
    int label;
    final /* synthetic */ MapboxLight.DynamicLight this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxLight$DynamicLight$BindToMap$1(MapboxLight.DynamicLight dynamicLight, MapboxMap mapboxMap, d<? super MapboxLight$DynamicLight$BindToMap$1> dVar) {
        super(2, dVar);
        this.this$0 = dynamicLight;
        this.$mapboxMap = mapboxMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(String str) {
        MapboxLogger.logE("MapboxLight", "setStyleLights error: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$2(List list, None none) {
        MapboxLogger.logD("MapboxLight", "setStyleLights: " + list);
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapboxLight$DynamicLight$BindToMap$1(this.this$0, this.$mapboxMap, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapboxLight$DynamicLight$BindToMap$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        List list = this.this$0.directionalLightState;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((DirectionalLightState) it.next()).getProperties$extension_compose_release()));
        }
        ArrayList arrayListD0 = h0.D0(arrayList, new Value(this.this$0.ambientLightState.getProperties$extension_compose_release()));
        this.$mapboxMap.setStyleLights(new Value((List<Value>) arrayListD0)).onError(new a(2)).onValue(new b(arrayListD0, 0));
        return Unit.INSTANCE;
    }
}
