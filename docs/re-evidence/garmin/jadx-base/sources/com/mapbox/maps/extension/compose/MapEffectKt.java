package com.mapbox.maps.extension.compose;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.internal.MapApplier;
import e23.p;
import e23.q;
import java.util.Arrays;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.c;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p2;
import p3.x1;
import t13.d;
import u13.a;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0003\u001aF\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aP\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u000b\u001aZ\u0010\b\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\r\u001aT\u0010\b\u001a\u00020\u00062\u0016\u0010\u000f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00000\u000e\"\u0004\u0018\u00010\u00002(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"", "key1", "Lkotlin/Function3;", "Lo53/b0;", "Lcom/mapbox/maps/MapView;", "Lt13/d;", "", "block", "MapEffect", "(Ljava/lang/Object;Le23/q;Lp3/m;I)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Le23/q;Lp3/m;I)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Le23/q;Lp3/m;I)V", "", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;Le23/q;Lp3/m;I)V", "extension-compose_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MapEffectKt {

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$1", f = "MapEffect.kt", l = {26}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ MapView $map;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, MapView mapView, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.$map = mapView;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, this.$map, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var = (b0) this.L$0;
                q<b0, MapView, d<? super Unit>, Object> qVar = this.$block;
                MapView mapView = this.$map;
                this.label = 1;
                if (qVar.invoke(b0Var, mapView, this) == aVar) {
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
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$3", f = "MapEffect.kt", l = {47}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ MapView $map;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, MapView mapView, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.$map = mapView;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$map, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass3) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var = (b0) this.L$0;
                q<b0, MapView, d<? super Unit>, Object> qVar = this.$block;
                MapView mapView = this.$map;
                this.label = 1;
                if (qVar.invoke(b0Var, mapView, this) == aVar) {
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
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$5, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$5", f = "MapEffect.kt", l = {73}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ MapView $map;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, MapView mapView, d<? super AnonymousClass5> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.$map = mapView;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.$block, this.$map, dVar);
            anonymousClass5.L$0 = obj;
            return anonymousClass5;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass5) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var = (b0) this.L$0;
                q<b0, MapView, d<? super Unit>, Object> qVar = this.$block;
                MapView mapView = this.$map;
                this.label = 1;
                if (qVar.invoke(b0Var, mapView, this) == aVar) {
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
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$7", f = "MapEffect.kt", l = {93}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ MapView $map;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, MapView mapView, d<? super AnonymousClass7> dVar) {
            super(2, dVar);
            this.$block = qVar;
            this.$map = mapView;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$block, this.$map, dVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass7) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                b0 b0Var = (b0) this.L$0;
                q<b0, MapView, d<? super Unit>, Object> qVar = this.$block;
                MapView mapView = this.$map;
                this.label = 1;
                if (qVar.invoke(b0Var, mapView, this) == aVar) {
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
    }

    @MapboxMapComposable
    public static final void MapEffect(Object[] objArr, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, m mVar, int i14) {
        objArr.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-141429875);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.h(Arrays.copyOf(objArr, objArr.length), new AnonymousClass7(qVar, ((MapApplier) cVar).getMapView(), null), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass8(objArr, qVar, i14);
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ Object $key1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Object obj, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, int i14) {
            super(2);
            this.$key1 = obj;
            this.$block = qVar;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            MapEffectKt.MapEffect(this.$key1, this.$block, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass4 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ Object $key1;
        final /* synthetic */ Object $key2;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(Object obj, Object obj2, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, int i14) {
            super(2);
            this.$key1 = obj;
            this.$key2 = obj2;
            this.$block = qVar;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(m mVar, int i14) {
            MapEffectKt.MapEffect(this.$key1, this.$key2, this.$block, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$6, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass6 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ Object $key1;
        final /* synthetic */ Object $key2;
        final /* synthetic */ Object $key3;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Object obj, Object obj2, Object obj3, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, int i14) {
            super(2);
            this.$key1 = obj;
            this.$key2 = obj2;
            this.$key3 = obj3;
            this.$block = qVar;
            this.$$changed = i14;
        }

        public final void invoke(m mVar, int i14) {
            MapEffectKt.MapEffect(this.$key1, this.$key2, this.$key3, this.$block, mVar, this.$$changed | 1);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.MapEffectKt$MapEffect$8, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass8 extends w implements p<m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ q<b0, MapView, d<? super Unit>, Object> $block;
        final /* synthetic */ Object[] $keys;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Object[] objArr, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, int i14) {
            super(2);
            this.$keys = objArr;
            this.$block = qVar;
            this.$$changed = i14;
        }

        public final void invoke(m mVar, int i14) {
            Object[] objArr = this.$keys;
            MapEffectKt.MapEffect(Arrays.copyOf(objArr, objArr.length), (q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object>) this.$block, mVar, this.$$changed | 1);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }
    }

    @MapboxMapComposable
    public static final void MapEffect(Object obj, Object obj2, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, m mVar, int i14) {
        qVar.getClass();
        o0 o0VarE = mVar.E(642277440);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.f(obj, obj2, new AnonymousClass3(qVar, ((MapApplier) cVar).getMapView(), null), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass4(obj, obj2, qVar, i14);
    }

    @MapboxMapComposable
    public static final void MapEffect(Object obj, Object obj2, Object obj3, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, m mVar, int i14) {
        qVar.getClass();
        o0 o0VarE = mVar.E(657301728);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.g(obj, obj2, obj3, new AnonymousClass5(qVar, ((MapApplier) cVar).getMapView(), null), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass6(obj, obj2, obj3, qVar, i14);
    }

    @MapboxMapComposable
    public static final void MapEffect(Object obj, q<? super b0, ? super MapView, ? super d<? super Unit>, ? extends Object> qVar, m mVar, int i14) {
        qVar.getClass();
        o0 o0VarE = mVar.E(-60174432);
        x1 x1Var = n.f135158a;
        c<?> cVar = o0VarE.f135177b;
        cVar.getClass();
        l0.e(new AnonymousClass1(qVar, ((MapApplier) cVar).getMapView(), null), obj, o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(obj, qVar, i14);
    }
}
