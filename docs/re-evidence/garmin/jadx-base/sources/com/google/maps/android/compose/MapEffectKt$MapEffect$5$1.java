package com.google.maps.android.compose;

import com.google.android.gms.maps.GoogleMap;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.google.maps.android.compose.MapEffectKt$MapEffect$5$1", f = "MapEffect.kt", l = {71}, m = "invokeSuspend")
public final class MapEffectKt$MapEffect$5$1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ e23.q<o53.b0, GoogleMap, t13.d<? super Unit>, Object> $block;
    final /* synthetic */ GoogleMap $map;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MapEffectKt$MapEffect$5$1(e23.q<? super o53.b0, ? super GoogleMap, ? super t13.d<? super Unit>, ? extends Object> qVar, GoogleMap googleMap, t13.d<? super MapEffectKt$MapEffect$5$1> dVar) {
        super(2, dVar);
        this.$block = qVar;
        this.$map = googleMap;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        MapEffectKt$MapEffect$5$1 mapEffectKt$MapEffect$5$1 = new MapEffectKt$MapEffect$5$1(this.$block, this.$map, dVar);
        mapEffectKt$MapEffect$5$1.L$0 = obj;
        return mapEffectKt$MapEffect$5$1;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((MapEffectKt$MapEffect$5$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            o53.b0 b0Var = (o53.b0) this.L$0;
            e23.q<o53.b0, GoogleMap, t13.d<? super Unit>, Object> qVar = this.$block;
            GoogleMap googleMap = this.$map;
            this.label = 1;
            if (qVar.invoke(b0Var, googleMap, this) == aVar) {
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
