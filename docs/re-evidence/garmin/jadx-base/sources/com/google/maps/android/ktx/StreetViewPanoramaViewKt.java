package com.google.maps.android.ktx;

import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.StreetViewPanoramaView;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewPanoramaLocation;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import r53.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086H¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0004*\u00020\u0001¢\u0006\u0004\b\t\u0010\u0007\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u0004*\u00020\u0001¢\u0006\u0004\b\f\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/google/android/gms/maps/StreetViewPanoramaView;", "Lcom/google/android/gms/maps/StreetViewPanorama;", "awaitStreetViewPanorama", "(Lcom/google/android/gms/maps/StreetViewPanoramaView;Lt13/d;)Ljava/lang/Object;", "Lr53/i;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "cameraChangeEvents", "(Lcom/google/android/gms/maps/StreetViewPanorama;)Lr53/i;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "changeEvents", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "clickEvents", "longClickEvents", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class StreetViewPanoramaViewKt {

    /* JADX INFO: renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$cameraChangeEvents$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaCamera;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$cameraChangeEvents$1", f = "StreetViewPanoramaView.kt", l = {39}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v13.i implements p<t<? super StreetViewPanoramaCamera>, t13.d<? super Unit>, Object> {
        final /* synthetic */ StreetViewPanorama $this_cameraChangeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StreetViewPanorama streetViewPanorama, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_cameraChangeEvents = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, StreetViewPanoramaCamera streetViewPanoramaCamera) {
            streetViewPanoramaCamera.getClass();
            tVar.i(streetViewPanoramaCamera);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(StreetViewPanorama streetViewPanorama) {
            streetViewPanorama.setOnStreetViewPanoramaCameraChangeListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_cameraChangeEvents, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(t<? super StreetViewPanoramaCamera> tVar, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_cameraChangeEvents.setOnStreetViewPanoramaCameraChangeListener(new b(tVar, 14));
                i iVar = new i(this.$this_cameraChangeEvents, 0);
                this.label = 1;
                if (q53.r.a(tVar, iVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$changeEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaLocation;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$changeEvents$1", f = "StreetViewPanoramaView.kt", l = {54}, m = "invokeSuspend")
    public static final class C39451 extends v13.i implements p<t<? super StreetViewPanoramaLocation>, t13.d<? super Unit>, Object> {
        final /* synthetic */ StreetViewPanorama $this_changeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39451(StreetViewPanorama streetViewPanorama, t13.d<? super C39451> dVar) {
            super(2, dVar);
            this.$this_changeEvents = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, StreetViewPanoramaLocation streetViewPanoramaLocation) {
            streetViewPanoramaLocation.getClass();
            tVar.i(streetViewPanoramaLocation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(StreetViewPanorama streetViewPanorama) {
            streetViewPanorama.setOnStreetViewPanoramaChangeListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39451 c39451 = new C39451(this.$this_changeEvents, dVar);
            c39451.L$0 = obj;
            return c39451;
        }

        @Override // e23.p
        public final Object invoke(t<? super StreetViewPanoramaLocation> tVar, t13.d<? super Unit> dVar) {
            return ((C39451) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_changeEvents.setOnStreetViewPanoramaChangeListener(new b(tVar, 15));
                i iVar = new i(this.$this_changeEvents, 1);
                this.label = 1;
                if (q53.r.a(tVar, iVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$clickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$clickEvents$1", f = "StreetViewPanoramaView.kt", l = {69}, m = "invokeSuspend")
    public static final class C39461 extends v13.i implements p<t<? super StreetViewPanoramaOrientation>, t13.d<? super Unit>, Object> {
        final /* synthetic */ StreetViewPanorama $this_clickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39461(StreetViewPanorama streetViewPanorama, t13.d<? super C39461> dVar) {
            super(2, dVar);
            this.$this_clickEvents = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            streetViewPanoramaOrientation.getClass();
            tVar.i(streetViewPanoramaOrientation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(StreetViewPanorama streetViewPanorama) {
            streetViewPanorama.setOnStreetViewPanoramaClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39461 c39461 = new C39461(this.$this_clickEvents, dVar);
            c39461.L$0 = obj;
            return c39461;
        }

        @Override // e23.p
        public final Object invoke(t<? super StreetViewPanoramaOrientation> tVar, t13.d<? super Unit> dVar) {
            return ((C39461) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_clickEvents.setOnStreetViewPanoramaClickListener(new b(tVar, 16));
                i iVar = new i(this.$this_clickEvents, 2);
                this.label = 1;
                if (q53.r.a(tVar, iVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.StreetViewPanoramaViewKt$longClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/StreetViewPanoramaOrientation;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.StreetViewPanoramaViewKt$longClickEvents$1", f = "StreetViewPanoramaView.kt", l = {84}, m = "invokeSuspend")
    public static final class C39471 extends v13.i implements p<t<? super StreetViewPanoramaOrientation>, t13.d<? super Unit>, Object> {
        final /* synthetic */ StreetViewPanorama $this_longClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39471(StreetViewPanorama streetViewPanorama, t13.d<? super C39471> dVar) {
            super(2, dVar);
            this.$this_longClickEvents = streetViewPanorama;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
            streetViewPanoramaOrientation.getClass();
            tVar.i(streetViewPanoramaOrientation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(StreetViewPanorama streetViewPanorama) {
            streetViewPanorama.setOnStreetViewPanoramaLongClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39471 c39471 = new C39471(this.$this_longClickEvents, dVar);
            c39471.L$0 = obj;
            return c39471;
        }

        @Override // e23.p
        public final Object invoke(t<? super StreetViewPanoramaOrientation> tVar, t13.d<? super Unit> dVar) {
            return ((C39471) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_longClickEvents.setOnStreetViewPanoramaLongClickListener(new b(tVar, 17));
                i iVar = new i(this.$this_longClickEvents, 3);
                this.label = 1;
                if (q53.r.a(tVar, iVar, this) == aVar) {
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

    public static final Object awaitStreetViewPanorama(StreetViewPanoramaView streetViewPanoramaView, t13.d<? super StreetViewPanorama> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    private static final Object awaitStreetViewPanorama$$forInline(StreetViewPanoramaView streetViewPanoramaView, t13.d<? super StreetViewPanorama> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        streetViewPanoramaView.getStreetViewPanoramaAsync(new StreetViewPanoramaViewKt$awaitStreetViewPanorama$2$1(iVar));
        Unit unit = Unit.INSTANCE;
        Object objA = iVar.a();
        if (objA == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return objA;
    }

    public static final r53.i<StreetViewPanoramaCamera> cameraChangeEvents(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.getClass();
        return s.f(new AnonymousClass1(streetViewPanorama, null));
    }

    public static final r53.i<StreetViewPanoramaLocation> changeEvents(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.getClass();
        return s.f(new C39451(streetViewPanorama, null));
    }

    public static final r53.i<StreetViewPanoramaOrientation> clickEvents(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.getClass();
        return s.f(new C39461(streetViewPanorama, null));
    }

    public static final r53.i<StreetViewPanoramaOrientation> longClickEvents(StreetViewPanorama streetViewPanorama) {
        streetViewPanorama.getClass();
        return s.f(new C39471(streetViewPanorama, null));
    }
}
