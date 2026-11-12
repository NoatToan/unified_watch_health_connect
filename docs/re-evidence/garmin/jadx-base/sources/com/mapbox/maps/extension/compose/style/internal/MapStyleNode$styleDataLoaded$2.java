package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.StyleDataLoaded;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/StyleDataLoaded;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$styleDataLoaded$2", f = "MapStyleNode.kt", l = {}, m = "invokeSuspend")
public final class MapStyleNode$styleDataLoaded$2 extends i implements p<StyleDataLoaded, d<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MapStyleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStyleNode$styleDataLoaded$2(MapStyleNode mapStyleNode, d<? super MapStyleNode$styleDataLoaded$2> dVar) {
        super(2, dVar);
        this.this$0 = mapStyleNode;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MapStyleNode$styleDataLoaded$2 mapStyleNode$styleDataLoaded$2 = new MapStyleNode$styleDataLoaded$2(this.this$0, dVar);
        mapStyleNode$styleDataLoaded$2.L$0 = obj;
        return mapStyleNode$styleDataLoaded$2;
    }

    @Override // e23.p
    public final Object invoke(StyleDataLoaded styleDataLoaded, d<? super Unit> dVar) {
        return ((MapStyleNode$styleDataLoaded$2) create(styleDataLoaded, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        MapboxLogger.logD("MapStyleNode", this.this$0 + " - styleDataLoaded: " + ((StyleDataLoaded) this.L$0));
        return Unit.INSTANCE;
    }
}
