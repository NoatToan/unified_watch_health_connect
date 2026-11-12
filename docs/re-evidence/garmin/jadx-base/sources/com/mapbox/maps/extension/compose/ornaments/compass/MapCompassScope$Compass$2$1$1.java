package com.mapbox.maps.extension.compose.ornaments.compass;

import b5.h0;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$2$1$1", f = "MapCompassScope.kt", l = {110}, m = "invokeSuspend")
public final class MapCompassScope$Compass$2$1$1 extends i implements p<h0, d<? super Unit>, Object> {
    final /* synthetic */ boolean $resetToNorthUponClick;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MapCompassScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapCompassScope$Compass$2$1$1(MapCompassScope mapCompassScope, boolean z14, d<? super MapCompassScope$Compass$2$1$1> dVar) {
        super(2, dVar);
        this.this$0 = mapCompassScope;
        this.$resetToNorthUponClick = z14;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        MapCompassScope$Compass$2$1$1 mapCompassScope$Compass$2$1$1 = new MapCompassScope$Compass$2$1$1(this.this$0, this.$resetToNorthUponClick, dVar);
        mapCompassScope$Compass$2$1$1.L$0 = obj;
        return mapCompassScope$Compass$2$1$1;
    }

    @Override // e23.p
    public final Object invoke(h0 h0Var, d<? super Unit> dVar) {
        return ((MapCompassScope$Compass$2$1$1) create(h0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            h0 h0Var = (h0) this.L$0;
            MapCompassScope mapCompassScope = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resetToNorthUponClick, mapCompassScope);
            this.label = 1;
            if (mapCompassScope.detectTapWithoutConsume(h0Var, anonymousClass1, this) == aVar) {
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$2$1$1$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.a<Unit> {
        final /* synthetic */ boolean $resetToNorthUponClick;
        final /* synthetic */ MapCompassScope this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z14, MapCompassScope mapCompassScope) {
            super(0);
            this.$resetToNorthUponClick = z14;
            this.this$0 = mapCompassScope;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            if (this.$resetToNorthUponClick) {
                this.this$0.resetToFacingNorth();
            }
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
