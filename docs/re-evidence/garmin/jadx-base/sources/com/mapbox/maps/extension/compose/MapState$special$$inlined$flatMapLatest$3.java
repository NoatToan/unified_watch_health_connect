package com.mapbox.maps.extension.compose;

import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.StyleLoaded;
import com.mapbox.maps.coroutine.MapboxMapExtKt;
import e23.q;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.h;
import r53.j;
import r53.s;
import t13.d;
import u13.a;
import v13.e;
import v13.i;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.MapState$special$$inlined$flatMapLatest$3", f = "MapState.kt", l = {190}, m = "invokeSuspend")
public final class MapState$special$$inlined$flatMapLatest$3 extends i implements q<j<? super StyleLoaded>, MapboxMap, d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public MapState$special$$inlined$flatMapLatest$3(d dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j<? super StyleLoaded> jVar, MapboxMap mapboxMap, d<? super Unit> dVar) {
        MapState$special$$inlined$flatMapLatest$3 mapState$special$$inlined$flatMapLatest$3 = new MapState$special$$inlined$flatMapLatest$3(dVar);
        mapState$special$$inlined$flatMapLatest$3.L$0 = jVar;
        mapState$special$$inlined$flatMapLatest$3.L$1 = mapboxMap;
        return mapState$special$$inlined$flatMapLatest$3.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.i styleLoadedEvents;
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            j jVar = (j) this.L$0;
            MapboxMap mapboxMap = (MapboxMap) this.L$1;
            if (mapboxMap == null || (styleLoadedEvents = MapboxMapExtKt.getStyleLoadedEvents(mapboxMap)) == null) {
                styleLoadedEvents = h.f150634a;
            }
            this.label = 1;
            if (s.v(jVar, styleLoadedEvents, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
