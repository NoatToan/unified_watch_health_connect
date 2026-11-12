package com.mapbox.maps.plugin.locationcomponent;

import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import q53.t;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {1, 7, 1})
@v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$deviceOrientationFlow$1", f = "DefaultLocationProvider.kt", l = {91}, m = "invokeSuspend")
public final class DefaultLocationProvider$deviceOrientationFlow$1 extends i implements p<t<? super Double>, t13.d<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLocationProvider$deviceOrientationFlow$1(DefaultLocationProvider defaultLocationProvider, t13.d<? super DefaultLocationProvider$deviceOrientationFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultLocationProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(t tVar, float f14) {
        og.a.d0(tVar, Double.valueOf(f14));
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        DefaultLocationProvider$deviceOrientationFlow$1 defaultLocationProvider$deviceOrientationFlow$1 = new DefaultLocationProvider$deviceOrientationFlow$1(this.this$0, dVar);
        defaultLocationProvider$deviceOrientationFlow$1.L$0 = obj;
        return defaultLocationProvider$deviceOrientationFlow$1;
    }

    @Override // e23.p
    public final Object invoke(t<? super Double> tVar, t13.d<? super Unit> dVar) {
        return ((DefaultLocationProvider$deviceOrientationFlow$1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            final t tVar = (t) this.L$0;
            LocationCompassEngine.CompassListener compassListener = new LocationCompassEngine.CompassListener() { // from class: com.mapbox.maps.plugin.locationcomponent.b
                @Override // com.mapbox.maps.plugin.locationcomponent.LocationCompassEngine.CompassListener
                public final void onCompassChanged(float f14) {
                    DefaultLocationProvider$deviceOrientationFlow$1.invokeSuspend$lambda$0(tVar, f14);
                }
            };
            this.this$0.locationCompassEngine.addCompassListener$plugin_locationcomponent_release(compassListener);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, compassListener);
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

    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$deviceOrientationFlow$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements e23.a<Unit> {
        final /* synthetic */ LocationCompassEngine.CompassListener $compassListener;
        final /* synthetic */ DefaultLocationProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DefaultLocationProvider defaultLocationProvider, LocationCompassEngine.CompassListener compassListener) {
            super(0);
            this.this$0 = defaultLocationProvider;
            this.$compassListener = compassListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.locationCompassEngine.removeCompassListener$plugin_locationcomponent_release(this.$compassListener);
        }

        @Override // e23.a
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }
}
