package com.mapbox.maps.coroutine;

import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.NativeObserver;
import com.mapbox.maps.SourceAdded;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import q53.t;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/mapbox/maps/SourceAdded;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.coroutine.MapboxMapExtKt$sourceAddedEvents$1", f = "MapboxMapExt.kt", l = {338}, m = "invokeSuspend")
public final class MapboxMapExtKt$sourceAddedEvents$1 extends i implements p<t<? super SourceAdded>, d<? super Unit>, Object> {
    final /* synthetic */ MapboxMap $this_sourceAddedEvents;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxMapExtKt$sourceAddedEvents$1(MapboxMap mapboxMap, d<? super MapboxMapExtKt$sourceAddedEvents$1> dVar) {
        super(2, dVar);
        this.$this_sourceAddedEvents = mapboxMap;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MapboxMapExtKt$sourceAddedEvents$1 mapboxMapExtKt$sourceAddedEvents$1 = new MapboxMapExtKt$sourceAddedEvents$1(this.$this_sourceAddedEvents, dVar);
        mapboxMapExtKt$sourceAddedEvents$1.L$0 = obj;
        return mapboxMapExtKt$sourceAddedEvents$1;
    }

    @Override // e23.p
    public final Object invoke(t<? super SourceAdded> tVar, d<? super Unit> dVar) {
        return ((MapboxMapExtKt$sourceAddedEvents$1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(NativeObserver.subscribeSourceAdded$default(this.$this_sourceAddedEvents.getNativeObserver(), new a(tVar), new MapboxMapExtKt$sourceAddedEvents$1$cancelable$2(tVar.getChannel()), null, 4, null));
            this.label = 1;
            if (q53.r.a(tVar, anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.coroutine.MapboxMapExtKt$sourceAddedEvents$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends q implements e23.a<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, Cancelable.class, "cancel", "cancel()V", 0);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((Cancelable) this.receiver).cancel();
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
