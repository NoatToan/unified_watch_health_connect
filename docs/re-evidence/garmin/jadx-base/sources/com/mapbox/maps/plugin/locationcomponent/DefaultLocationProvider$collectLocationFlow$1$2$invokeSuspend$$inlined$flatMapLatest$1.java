package com.mapbox.maps.plugin.locationcomponent;

import com.mapbox.common.location.Location;
import com.mapbox.maps.plugin.PuckBearing;
import e23.q;
import lc.u0;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.h;
import r53.j;
import r53.s;
import v13.i;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1", f = "DefaultLocationProvider.kt", l = {190}, m = "invokeSuspend")
public final class DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1 extends i implements q<j<? super Double>, PuckBearing, t13.d<? super Unit>, Object> {
    final /* synthetic */ r53.i $locationFlow$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ DefaultLocationProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1(t13.d dVar, DefaultLocationProvider defaultLocationProvider, r53.i iVar) {
        super(3, dVar);
        this.this$0 = defaultLocationProvider;
        this.$locationFlow$inlined = iVar;
    }

    @Override // e23.q
    public final Object invoke(j<? super Double> jVar, PuckBearing puckBearing, t13.d<? super Unit> dVar) {
        DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1 defaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1 = new DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1(dVar, this.this$0, this.$locationFlow$inlined);
        defaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1.L$0 = jVar;
        defaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1.L$1 = puckBearing;
        return defaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        r53.i iVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            j jVar = (j) this.L$0;
            PuckBearing puckBearing = (PuckBearing) this.L$1;
            int i15 = puckBearing == null ? -1 : DefaultLocationProvider.C42431.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0[puckBearing.ordinal()];
            if (i15 == -1) {
                iVar = h.f150634a;
            } else if (i15 == 1) {
                iVar = this.this$0.deviceOrientationFlow;
            } else {
                if (i15 != 2) {
                    u0.r();
                    return null;
                }
                final r53.i iVar2 = this.$locationFlow$inlined;
                iVar = new r53.i<Double>() { // from class: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$lambda$1$$inlined$mapNotNull$1

                    /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2, reason: invalid class name */
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lt13/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                    public static final class AnonymousClass2<T> implements j {
                        final /* synthetic */ j $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                        @v13.e(c = "com.mapbox.maps.plugin.locationcomponent.DefaultLocationProvider$collectLocationFlow$1$2$invokeSuspend$lambda$1$$inlined$mapNotNull$1$2", f = "DefaultLocationProvider.kt", l = {225}, m = "emit")
                        public static final class AnonymousClass1 extends v13.c {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(t13.d dVar) {
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
                        public final Object emit(Object obj, t13.d dVar) {
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
                            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                            int i15 = anonymousClass1.label;
                            if (i15 == 0) {
                                r.b(obj2);
                                j jVar = this.$this_unsafeFlow;
                                Double bearing = ((Location) obj).getBearing();
                                if (bearing != null) {
                                    anonymousClass1.label = 1;
                                    if (jVar.emit(bearing, anonymousClass1) == aVar) {
                                        return aVar;
                                    }
                                }
                            } else {
                                if (i15 != 1) {
                                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                r.b(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // r53.i
                    public Object collect(j<? super Double> jVar2, t13.d dVar) {
                        Object objCollect = iVar2.collect(new AnonymousClass2(jVar2), dVar);
                        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
                    }
                };
            }
            this.label = 1;
            if (s.v(jVar, iVar, this) == aVar) {
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
