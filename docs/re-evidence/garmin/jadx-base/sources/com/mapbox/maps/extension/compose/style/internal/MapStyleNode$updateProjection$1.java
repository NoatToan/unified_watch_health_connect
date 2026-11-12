package com.mapbox.maps.extension.compose.style.internal;

import com.mapbox.bindgen.None;
import com.mapbox.maps.StyleDataLoaded;
import com.mapbox.maps.extension.compose.style.projection.generated.Projection;
import e23.p;
import o13.r;
import o2.c;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.j;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {1, 7, 1})
@e(c = "com.mapbox.maps.extension.compose.style.internal.MapStyleNode$updateProjection$1", f = "MapStyleNode.kt", l = {124}, m = "invokeSuspend")
public final class MapStyleNode$updateProjection$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ Projection $projection;
    int label;
    final /* synthetic */ MapStyleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapStyleNode$updateProjection$1(MapStyleNode mapStyleNode, Projection projection, d<? super MapStyleNode$updateProjection$1> dVar) {
        super(2, dVar);
        this.this$0 = mapStyleNode;
        this.$projection = projection;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapStyleNode$updateProjection$1(this.this$0, this.$projection, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapStyleNode$updateProjection$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            d2<StyleDataLoaded> styleDataLoaded$extension_compose_release = this.this$0.getStyleDataLoaded$extension_compose_release();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$projection);
            this.label = 1;
            if (styleDataLoaded$extension_compose_release.collect(anonymousClass1, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c.f();
        return null;
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.style.internal.MapStyleNode$updateProjection$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/mapbox/maps/StyleDataLoaded;"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements j<StyleDataLoaded> {
        final /* synthetic */ Projection $projection;
        final /* synthetic */ MapStyleNode this$0;

        public AnonymousClass1(MapStyleNode mapStyleNode, Projection projection) {
            this.this$0 = mapStyleNode;
            this.$projection = projection;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$0(Projection projection, None none) {
            projection.getClass();
            none.getClass();
            projection.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void emit$lambda$1(Projection projection, String str) {
            projection.getClass();
            str.getClass();
            projection.toString();
        }

        /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
        public final Object emit2(StyleDataLoaded styleDataLoaded, d<? super Unit> dVar) {
            this.this$0.getMapboxMap().setStyleProjection(this.$projection.getValue()).onValue(new a(this.$projection, 0)).onError(new a(this.$projection, 1));
            return Unit.INSTANCE;
        }

        @Override // r53.j
        public /* bridge */ /* synthetic */ Object emit(StyleDataLoaded styleDataLoaded, d dVar) {
            return emit2(styleDataLoaded, (d<? super Unit>) dVar);
        }
    }
}
