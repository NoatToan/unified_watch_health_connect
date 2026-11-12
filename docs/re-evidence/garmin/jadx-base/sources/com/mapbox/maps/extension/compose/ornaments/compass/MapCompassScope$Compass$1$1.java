package com.mapbox.maps.extension.compose.ornaments.compass;

import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.coroutine.MapboxMapExtKt;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.p1;
import r53.g;
import r53.j;
import r53.s;
import t13.d;
import u13.a;
import v13.c;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@e(c = "com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1", f = "MapCompassScope.kt", l = {93}, m = "invokeSuspend")
public final class MapCompassScope$Compass$1$1 extends i implements p<b0, d<? super Unit>, Object> {
    final /* synthetic */ p1<Float> $compassBearing$delegate;
    final /* synthetic */ p1<Boolean> $compassVisibility$delegate;
    final /* synthetic */ boolean $fadeWhenFacingNorth;
    int label;
    final /* synthetic */ MapCompassScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapCompassScope$Compass$1$1(MapCompassScope mapCompassScope, p1<Float> p1Var, boolean z14, p1<Boolean> p1Var2, d<? super MapCompassScope$Compass$1$1> dVar) {
        super(2, dVar);
        this.this$0 = mapCompassScope;
        this.$compassBearing$delegate = p1Var;
        this.$fadeWhenFacingNorth = z14;
        this.$compassVisibility$delegate = p1Var2;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new MapCompassScope$Compass$1$1(this.this$0, this.$compassBearing$delegate, this.$fadeWhenFacingNorth, this.$compassVisibility$delegate, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((MapCompassScope$Compass$1$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            MapCompassScope.Compass$lambda$2(this.$compassBearing$delegate, -((float) this.this$0.mapView.getMapboxMapDeprecated().getCameraState().getBearing()));
            final r53.i cameraChangedCoalescedEvents = MapboxMapExtKt.getCameraChangedCoalescedEvents(this.this$0.mapView.getMapboxMapDeprecated());
            g gVarR = s.r(new r53.i<Float>() { // from class: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                public static final class AnonymousClass2<T> implements j {
                    final /* synthetic */ j $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    @e(c = "com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1$invokeSuspend$$inlined$map$1$2", f = "MapCompassScope.kt", l = {223}, m = "emit")
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // v13.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // r53.j
                    public final Object emit(Object obj, d dVar) {
                        AnonymousClass1 anonymousClass1;
                        if (dVar instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) dVar;
                            int i14 = anonymousClass1.label;
                            if ((i14 & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i14 - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(dVar);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(dVar);
                        }
                        Object obj2 = anonymousClass1.result;
                        a aVar = a.COROUTINE_SUSPENDED;
                        int i15 = anonymousClass1.label;
                        if (i15 == 0) {
                            r.b(obj2);
                            j jVar = this.$this_unsafeFlow;
                            Float f14 = new Float((float) ((CameraChangedCoalesced) obj).getCameraState().getBearing());
                            anonymousClass1.label = 1;
                            if (jVar.emit(f14, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i15 != 1) {
                                h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r.b(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // r53.i
                public Object collect(j<? super Float> jVar, d dVar) {
                    Object objCollect = cameraChangedCoalescedEvents.collect(new AnonymousClass2(jVar), dVar);
                    return objCollect == a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
                }
            }, AnonymousClass2.INSTANCE);
            final boolean z14 = this.$fadeWhenFacingNorth;
            final MapCompassScope mapCompassScope = this.this$0;
            final p1<Float> p1Var = this.$compassBearing$delegate;
            final p1<Boolean> p1Var2 = this.$compassVisibility$delegate;
            j<Float> jVar = new j<Float>() { // from class: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1.3
                public final Object emit(float f14, d<? super Unit> dVar) {
                    MapCompassScope.Compass$lambda$2(p1Var, -f14);
                    MapCompassScope.Compass$lambda$5(p1Var2, (z14 && mapCompassScope.isFacingNorth(MapCompassScope.Compass$lambda$1(p1Var))) ? false : true);
                    return Unit.INSTANCE;
                }

                @Override // r53.j
                public /* bridge */ /* synthetic */ Object emit(Float f14, d dVar) {
                    return emit(f14.floatValue(), (d<? super Unit>) dVar);
                }
            };
            this.label = 1;
            if (gVarR.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.ornaments.compass.MapCompassScope$Compass$1$1$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<Float, Float, Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(2);
        }

        public final Boolean invoke(float f14, float f15) {
            return Boolean.valueOf(((double) Math.abs(f14 - f15)) < 0.1d);
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Boolean invoke(Float f14, Float f15) {
            return invoke(f14.floatValue(), f15.floatValue());
        }
    }
}
