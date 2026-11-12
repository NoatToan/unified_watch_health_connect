package com.google.maps.android.ktx;

import android.graphics.Bitmap;
import android.location.Location;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.IndoorBuilding;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import e23.l;
import e23.p;
import o13.r;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.m;
import q53.t;
import r53.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a&\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086H¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\t*\u00020\u0000H\u0086H¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0004\u001a\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\"\u0010\u0013\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0086H¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0004\u001a\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001*\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0004\u001a\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0001*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u0004\u001a\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0001*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u0004\u001a\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u0004\u001a\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001e\u0010\u0004\u001a\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b\u001f\u0010\u0004\u001a\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b!\u0010\u0004\u001a\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u0001*\u00020\u0000¢\u0006\u0004\b\"\u0010\u0004\u001a\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0001*\u00020\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0001*\u00020\u0000¢\u0006\u0004\b%\u0010\u0004\u001a\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u0000¢\u0006\u0004\b&\u0010\u0004\u001a\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u0001*\u00020\u0000¢\u0006\u0004\b(\u0010\u0004\u001a\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020\u0000¢\u0006\u0004\b*\u0010\u0004\u001a\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020+0\u0001*\u00020\u0000¢\u0006\u0004\b,\u0010\u0004\u001a\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020\u0000¢\u0006\u0004\b.\u0010\u0004\u001a'\u00102\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a+\u00105\u001a\u00020\u0016*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a-\u00108\u001a\u0004\u0018\u00010\u0018*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a-\u0010;\u001a\u0004\u0018\u00010\u001c*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a+\u0010>\u001a\u00020+*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a+\u0010A\u001a\u00020-*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a-\u0010E\u001a\u0004\u0018\u00010D*\u00020\u00002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\t0/H\u0086\bø\u0001\u0000¢\u0006\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, d2 = {"Lcom/google/android/gms/maps/GoogleMap;", "Lr53/i;", "Lcom/google/maps/android/ktx/CameraEvent;", "cameraEvents", "(Lcom/google/android/gms/maps/GoogleMap;)Lr53/i;", "Lcom/google/android/gms/maps/CameraUpdate;", "cameraUpdate", "", "durationMs", "", "awaitAnimateCamera", "(Lcom/google/android/gms/maps/GoogleMap;Lcom/google/android/gms/maps/CameraUpdate;ILt13/d;)Ljava/lang/Object;", "awaitMapLoad", "(Lcom/google/android/gms/maps/GoogleMap;Lt13/d;)Ljava/lang/Object;", "cameraIdleEvents", "cameraMoveCanceledEvents", "cameraMoveEvents", "Landroid/graphics/Bitmap;", "bitmap", "awaitSnapshot", "(Lcom/google/android/gms/maps/GoogleMap;Landroid/graphics/Bitmap;Lt13/d;)Ljava/lang/Object;", "cameraMoveStartedEvents", "Lcom/google/android/gms/maps/model/Circle;", "circleClickEvents", "Lcom/google/android/gms/maps/model/GroundOverlay;", "groundOverlayClicks", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "indoorStateChangeEvents", "Lcom/google/android/gms/maps/model/Marker;", "infoWindowClickEvents", "infoWindowCloseEvents", "infoWindowLongClickEvents", "Lcom/google/android/gms/maps/model/LatLng;", "mapClickEvents", "mapLongClickEvents", "markerClickEvents", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "markerDragEvents", "myLocationButtonClickEvents", "Landroid/location/Location;", "myLocationClickEvents", "Lcom/google/android/gms/maps/model/PointOfInterest;", "poiClickEvents", "Lcom/google/android/gms/maps/model/Polygon;", "polygonClickEvents", "Lcom/google/android/gms/maps/model/Polyline;", "polylineClickEvents", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "optionsActions", "buildGoogleMapOptions", "(Le23/l;)Lcom/google/android/gms/maps/GoogleMapOptions;", "Lcom/google/android/gms/maps/model/CircleOptions;", "addCircle", "(Lcom/google/android/gms/maps/GoogleMap;Le23/l;)Lcom/google/android/gms/maps/model/Circle;", "Lcom/google/android/gms/maps/model/GroundOverlayOptions;", "addGroundOverlay", "(Lcom/google/android/gms/maps/GoogleMap;Le23/l;)Lcom/google/android/gms/maps/model/GroundOverlay;", "Lcom/google/android/gms/maps/model/MarkerOptions;", "addMarker", "(Lcom/google/android/gms/maps/GoogleMap;Le23/l;)Lcom/google/android/gms/maps/model/Marker;", "Lcom/google/android/gms/maps/model/PolygonOptions;", "addPolygon", "(Lcom/google/android/gms/maps/GoogleMap;Le23/l;)Lcom/google/android/gms/maps/model/Polygon;", "Lcom/google/android/gms/maps/model/PolylineOptions;", "addPolyline", "(Lcom/google/android/gms/maps/GoogleMap;Le23/l;)Lcom/google/android/gms/maps/model/Polyline;", "Lcom/google/android/gms/maps/model/TileOverlayOptions;", "Lcom/google/android/gms/maps/model/TileOverlay;", "addTileOverlay", "(Lcom/google/android/gms/maps/GoogleMap;Le23/l;)Lcom/google/android/gms/maps/model/TileOverlay;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GoogleMapKt {

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/maps/android/ktx/CameraEvent;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$cameraEvents$1", f = "GoogleMap.kt", l = {111}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v13.i implements p<t<? super CameraEvent>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_cameraEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GoogleMap googleMap, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_cameraEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar) {
            tVar.i(CameraIdleEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(t tVar) {
            tVar.i(CameraMoveCanceledEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$2(t tVar) {
            tVar.i(CameraMoveEvent.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$3(t tVar, int i14) {
            tVar.i(new CameraMoveStartedEvent(i14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(GoogleMap googleMap) {
            googleMap.setOnCameraIdleListener(null);
            googleMap.setOnCameraMoveCanceledListener(null);
            googleMap.setOnCameraMoveListener(null);
            googleMap.setOnCameraMoveStartedListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_cameraEvents, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // e23.p
        public final Object invoke(t<? super CameraEvent> tVar, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                int i15 = 0;
                this.$this_cameraEvents.setOnCameraIdleListener(new a(tVar, i15));
                this.$this_cameraEvents.setOnCameraMoveCanceledListener(new b(tVar, i15));
                this.$this_cameraEvents.setOnCameraMoveListener(new b(tVar, 1));
                this.$this_cameraEvents.setOnCameraMoveStartedListener(new b(tVar, 2));
                c cVar = new c(this.$this_cameraEvents, 0);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$cameraIdleEvents$1", f = "GoogleMap.kt", l = {161}, m = "invokeSuspend")
    public static final class C39261 extends v13.i implements p<t<? super Unit>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_cameraIdleEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39261(GoogleMap googleMap, t13.d<? super C39261> dVar) {
            super(2, dVar);
            this.$this_cameraIdleEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar) {
            tVar.i(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnCameraIdleListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39261 c39261 = new C39261(this.$this_cameraIdleEvents, dVar);
            c39261.L$0 = obj;
            return c39261;
        }

        @Override // e23.p
        public final Object invoke(t<? super Unit> tVar, t13.d<? super Unit> dVar) {
            return ((C39261) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                int i15 = 1;
                this.$this_cameraIdleEvents.setOnCameraIdleListener(new a(tVar, i15));
                c cVar = new c(this.$this_cameraIdleEvents, i15);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveCanceledEvents$1", f = "GoogleMap.kt", l = {SyslogConstants.LOG_LOCAL6}, m = "invokeSuspend")
    public static final class C39271 extends v13.i implements p<t<? super Unit>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_cameraMoveCanceledEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39271(GoogleMap googleMap, t13.d<? super C39271> dVar) {
            super(2, dVar);
            this.$this_cameraMoveCanceledEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar) {
            tVar.i(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnCameraMoveCanceledListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39271 c39271 = new C39271(this.$this_cameraMoveCanceledEvents, dVar);
            c39271.L$0 = obj;
            return c39271;
        }

        @Override // e23.p
        public final Object invoke(t<? super Unit> tVar, t13.d<? super Unit> dVar) {
            return ((C39271) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_cameraMoveCanceledEvents.setOnCameraMoveCanceledListener(new b(tVar, 3));
                c cVar = new c(this.$this_cameraMoveCanceledEvents, 2);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveEvents$1", f = "GoogleMap.kt", l = {190}, m = "invokeSuspend")
    public static final class C39281 extends v13.i implements p<t<? super Unit>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_cameraMoveEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39281(GoogleMap googleMap, t13.d<? super C39281> dVar) {
            super(2, dVar);
            this.$this_cameraMoveEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar) {
            tVar.i(Unit.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnCameraMoveListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39281 c39281 = new C39281(this.$this_cameraMoveEvents, dVar);
            c39281.L$0 = obj;
            return c39281;
        }

        @Override // e23.p
        public final Object invoke(t<? super Unit> tVar, t13.d<? super Unit> dVar) {
            return ((C39281) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_cameraMoveEvents.setOnCameraMoveListener(new b(tVar, 4));
                c cVar = new c(this.$this_cameraMoveEvents, 3);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$cameraMoveStartedEvents$1", f = "GoogleMap.kt", l = {216}, m = "invokeSuspend")
    public static final class C39291 extends v13.i implements p<t<? super Integer>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_cameraMoveStartedEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39291(GoogleMap googleMap, t13.d<? super C39291> dVar) {
            super(2, dVar);
            this.$this_cameraMoveStartedEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, int i14) {
            tVar.i(Integer.valueOf(i14));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnCameraMoveStartedListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39291 c39291 = new C39291(this.$this_cameraMoveStartedEvents, dVar);
            c39291.L$0 = obj;
            return c39291;
        }

        @Override // e23.p
        public final Object invoke(t<? super Integer> tVar, t13.d<? super Unit> dVar) {
            return ((C39291) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_cameraMoveStartedEvents.setOnCameraMoveStartedListener(new b(tVar, 5));
                c cVar = new c(this.$this_cameraMoveStartedEvents, 4);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Circle;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$circleClickEvents$1", f = "GoogleMap.kt", l = {230}, m = "invokeSuspend")
    public static final class C39301 extends v13.i implements p<t<? super Circle>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_circleClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39301(GoogleMap googleMap, t13.d<? super C39301> dVar) {
            super(2, dVar);
            this.$this_circleClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Circle circle) {
            circle.getClass();
            tVar.i(circle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnCircleClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39301 c39301 = new C39301(this.$this_circleClickEvents, dVar);
            c39301.L$0 = obj;
            return c39301;
        }

        @Override // e23.p
        public final Object invoke(t<? super Circle> tVar, t13.d<? super Unit> dVar) {
            return ((C39301) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_circleClickEvents.setOnCircleClickListener(new b(tVar, 6));
                c cVar = new c(this.$this_circleClickEvents, 5);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/GroundOverlay;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$groundOverlayClicks$1", f = "GoogleMap.kt", l = {245}, m = "invokeSuspend")
    public static final class C39311 extends v13.i implements p<t<? super GroundOverlay>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_groundOverlayClicks;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39311(GoogleMap googleMap, t13.d<? super C39311> dVar) {
            super(2, dVar);
            this.$this_groundOverlayClicks = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, GroundOverlay groundOverlay) {
            groundOverlay.getClass();
            tVar.i(groundOverlay);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnGroundOverlayClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39311 c39311 = new C39311(this.$this_groundOverlayClicks, dVar);
            c39311.L$0 = obj;
            return c39311;
        }

        @Override // e23.p
        public final Object invoke(t<? super GroundOverlay> tVar, t13.d<? super Unit> dVar) {
            return ((C39311) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_groundOverlayClicks.setOnGroundOverlayClickListener(new b(tVar, 7));
                c cVar = new c(this.$this_groundOverlayClicks, 6);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/maps/android/ktx/IndoorChangeEvent;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$indoorStateChangeEvents$1", f = "GoogleMap.kt", l = {266}, m = "invokeSuspend")
    public static final class C39321 extends v13.i implements p<t<? super IndoorChangeEvent>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_indoorStateChangeEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39321(GoogleMap googleMap, t13.d<? super C39321> dVar) {
            super(2, dVar);
            this.$this_indoorStateChangeEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(GoogleMap googleMap) {
            googleMap.setOnIndoorStateChangeListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39321 c39321 = new C39321(this.$this_indoorStateChangeEvents, dVar);
            c39321.L$0 = obj;
            return c39321;
        }

        @Override // e23.p
        public final Object invoke(t<? super IndoorChangeEvent> tVar, t13.d<? super Unit> dVar) {
            return ((C39321) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_indoorStateChangeEvents.setOnIndoorStateChangeListener(new GoogleMap.OnIndoorStateChangeListener() { // from class: com.google.maps.android.ktx.GoogleMapKt.indoorStateChangeEvents.1.1
                    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                    public void onIndoorBuildingFocused() {
                        tVar.i(IndoorBuildingFocusedEvent.INSTANCE);
                    }

                    @Override // com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener
                    public void onIndoorLevelActivated(IndoorBuilding indoorBuilding) {
                        indoorBuilding.getClass();
                        tVar.i(new IndoorLevelActivatedEvent(indoorBuilding));
                    }
                });
                c cVar = new c(this.$this_indoorStateChangeEvents, 7);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Marker;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowClickEvents$1", f = "GoogleMap.kt", l = {281}, m = "invokeSuspend")
    public static final class C39331 extends v13.i implements p<t<? super Marker>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_infoWindowClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39331(GoogleMap googleMap, t13.d<? super C39331> dVar) {
            super(2, dVar);
            this.$this_infoWindowClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Marker marker) {
            marker.getClass();
            tVar.i(marker);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnInfoWindowClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39331 c39331 = new C39331(this.$this_infoWindowClickEvents, dVar);
            c39331.L$0 = obj;
            return c39331;
        }

        @Override // e23.p
        public final Object invoke(t<? super Marker> tVar, t13.d<? super Unit> dVar) {
            return ((C39331) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                int i15 = 8;
                this.$this_infoWindowClickEvents.setOnInfoWindowClickListener(new b(tVar, i15));
                c cVar = new c(this.$this_infoWindowClickEvents, i15);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Marker;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowCloseEvents$1", f = "GoogleMap.kt", l = {296}, m = "invokeSuspend")
    public static final class C39341 extends v13.i implements p<t<? super Marker>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_infoWindowCloseEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39341(GoogleMap googleMap, t13.d<? super C39341> dVar) {
            super(2, dVar);
            this.$this_infoWindowCloseEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Marker marker) {
            marker.getClass();
            tVar.i(marker);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnInfoWindowCloseListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39341 c39341 = new C39341(this.$this_infoWindowCloseEvents, dVar);
            c39341.L$0 = obj;
            return c39341;
        }

        @Override // e23.p
        public final Object invoke(t<? super Marker> tVar, t13.d<? super Unit> dVar) {
            return ((C39341) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                int i15 = 9;
                this.$this_infoWindowCloseEvents.setOnInfoWindowCloseListener(new b(tVar, i15));
                c cVar = new c(this.$this_infoWindowCloseEvents, i15);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Marker;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$infoWindowLongClickEvents$1", f = "GoogleMap.kt", l = {311}, m = "invokeSuspend")
    public static final class C39351 extends v13.i implements p<t<? super Marker>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_infoWindowLongClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39351(GoogleMap googleMap, t13.d<? super C39351> dVar) {
            super(2, dVar);
            this.$this_infoWindowLongClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Marker marker) {
            marker.getClass();
            tVar.i(marker);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnInfoWindowLongClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39351 c39351 = new C39351(this.$this_infoWindowLongClickEvents, dVar);
            c39351.L$0 = obj;
            return c39351;
        }

        @Override // e23.p
        public final Object invoke(t<? super Marker> tVar, t13.d<? super Unit> dVar) {
            return ((C39351) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                int i15 = 10;
                this.$this_infoWindowLongClickEvents.setOnInfoWindowLongClickListener(new b(tVar, i15));
                c cVar = new c(this.$this_infoWindowLongClickEvents, i15);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$mapClickEvents$1", f = "GoogleMap.kt", l = {325}, m = "invokeSuspend")
    public static final class C39361 extends v13.i implements p<t<? super LatLng>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_mapClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39361(GoogleMap googleMap, t13.d<? super C39361> dVar) {
            super(2, dVar);
            this.$this_mapClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, LatLng latLng) {
            latLng.getClass();
            tVar.i(latLng);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnMapClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39361 c39361 = new C39361(this.$this_mapClickEvents, dVar);
            c39361.L$0 = obj;
            return c39361;
        }

        @Override // e23.p
        public final Object invoke(t<? super LatLng> tVar, t13.d<? super Unit> dVar) {
            return ((C39361) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_mapClickEvents.setOnMapClickListener(new GoogleMap.OnMapClickListener() { // from class: com.google.maps.android.ktx.d
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapClickListener
                    public final void onMapClick(LatLng latLng) {
                        GoogleMapKt.C39361.invokeSuspend$lambda$0(tVar, latLng);
                    }
                });
                c cVar = new c(this.$this_mapClickEvents, 11);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/LatLng;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$mapLongClickEvents$1", f = "GoogleMap.kt", l = {339}, m = "invokeSuspend")
    public static final class C39371 extends v13.i implements p<t<? super LatLng>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_mapLongClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39371(GoogleMap googleMap, t13.d<? super C39371> dVar) {
            super(2, dVar);
            this.$this_mapLongClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, LatLng latLng) {
            latLng.getClass();
            tVar.i(latLng);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnMapLongClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39371 c39371 = new C39371(this.$this_mapLongClickEvents, dVar);
            c39371.L$0 = obj;
            return c39371;
        }

        @Override // e23.p
        public final Object invoke(t<? super LatLng> tVar, t13.d<? super Unit> dVar) {
            return ((C39371) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_mapLongClickEvents.setOnMapLongClickListener(new GoogleMap.OnMapLongClickListener() { // from class: com.google.maps.android.ktx.e
                    @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
                    public final void onMapLongClick(LatLng latLng) {
                        GoogleMapKt.C39371.invokeSuspend$lambda$0(tVar, latLng);
                    }
                });
                c cVar = new c(this.$this_mapLongClickEvents, 12);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Marker;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$markerClickEvents$1", f = "GoogleMap.kt", l = {353}, m = "invokeSuspend")
    public static final class C39381 extends v13.i implements p<t<? super Marker>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_markerClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39381(GoogleMap googleMap, t13.d<? super C39381> dVar) {
            super(2, dVar);
            this.$this_markerClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(t tVar, Marker marker) {
            marker.getClass();
            Object objI = tVar.i(marker);
            m.b bVar = m.f142998b;
            return !(objI instanceof m.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnMarkerClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39381 c39381 = new C39381(this.$this_markerClickEvents, dVar);
            c39381.L$0 = obj;
            return c39381;
        }

        @Override // e23.p
        public final Object invoke(t<? super Marker> tVar, t13.d<? super Unit> dVar) {
            return ((C39381) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_markerClickEvents.setOnMarkerClickListener(new b(tVar, 11));
                c cVar = new c(this.$this_markerClickEvents, 13);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/maps/android/ktx/OnMarkerDragEvent;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$markerDragEvents$1", f = "GoogleMap.kt", l = {378}, m = "invokeSuspend")
    public static final class C39391 extends v13.i implements p<t<? super OnMarkerDragEvent>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_markerDragEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39391(GoogleMap googleMap, t13.d<? super C39391> dVar) {
            super(2, dVar);
            this.$this_markerDragEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(GoogleMap googleMap) {
            googleMap.setOnMarkerDragListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39391 c39391 = new C39391(this.$this_markerDragEvents, dVar);
            c39391.L$0 = obj;
            return c39391;
        }

        @Override // e23.p
        public final Object invoke(t<? super OnMarkerDragEvent> tVar, t13.d<? super Unit> dVar) {
            return ((C39391) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_markerDragEvents.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() { // from class: com.google.maps.android.ktx.GoogleMapKt.markerDragEvents.1.1
                    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
                    public void onMarkerDrag(Marker marker) {
                        marker.getClass();
                        tVar.i(new MarkerDragEvent(marker));
                    }

                    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
                    public void onMarkerDragEnd(Marker marker) {
                        marker.getClass();
                        tVar.i(new MarkerDragEndEvent(marker));
                    }

                    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
                    public void onMarkerDragStart(Marker marker) {
                        marker.getClass();
                        tVar.i(new MarkerDragStartEvent(marker));
                    }
                });
                c cVar = new c(this.$this_markerDragEvents, 14);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lq53/t;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationButtonClickEvents$1", f = "GoogleMap.kt", l = {393}, m = "invokeSuspend")
    public static final class C39401 extends v13.i implements p<t<? super Unit>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_myLocationButtonClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39401(GoogleMap googleMap, t13.d<? super C39401> dVar) {
            super(2, dVar);
            this.$this_myLocationButtonClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0(t tVar) {
            Object objI = tVar.i(Unit.INSTANCE);
            m.b bVar = m.f142998b;
            return !(objI instanceof m.c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnMyLocationButtonClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39401 c39401 = new C39401(this.$this_myLocationButtonClickEvents, dVar);
            c39401.L$0 = obj;
            return c39401;
        }

        @Override // e23.p
        public final Object invoke(t<? super Unit> tVar, t13.d<? super Unit> dVar) {
            return ((C39401) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_myLocationButtonClickEvents.setOnMyLocationButtonClickListener(new GoogleMap.OnMyLocationButtonClickListener() { // from class: com.google.maps.android.ktx.f
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
                    public final boolean onMyLocationButtonClick() {
                        return GoogleMapKt.C39401.invokeSuspend$lambda$0(tVar);
                    }
                });
                c cVar = new c(this.$this_myLocationButtonClickEvents, 15);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Landroid/location/Location;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$myLocationClickEvents$1", f = "GoogleMap.kt", l = {408}, m = "invokeSuspend")
    public static final class C39411 extends v13.i implements p<t<? super Location>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_myLocationClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39411(GoogleMap googleMap, t13.d<? super C39411> dVar) {
            super(2, dVar);
            this.$this_myLocationClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Location location) {
            location.getClass();
            tVar.i(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnMyLocationClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39411 c39411 = new C39411(this.$this_myLocationClickEvents, dVar);
            c39411.L$0 = obj;
            return c39411;
        }

        @Override // e23.p
        public final Object invoke(t<? super Location> tVar, t13.d<? super Unit> dVar) {
            return ((C39411) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_myLocationClickEvents.setOnMyLocationClickListener(new GoogleMap.OnMyLocationClickListener() { // from class: com.google.maps.android.ktx.g
                    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener
                    public final void onMyLocationClick(Location location) {
                        GoogleMapKt.C39411.invokeSuspend$lambda$0(tVar, location);
                    }
                });
                c cVar = new c(this.$this_myLocationClickEvents, 16);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/PointOfInterest;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$poiClickEvents$1", f = "GoogleMap.kt", l = {423}, m = "invokeSuspend")
    public static final class C39421 extends v13.i implements p<t<? super PointOfInterest>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_poiClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39421(GoogleMap googleMap, t13.d<? super C39421> dVar) {
            super(2, dVar);
            this.$this_poiClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, PointOfInterest pointOfInterest) {
            pointOfInterest.getClass();
            tVar.i(pointOfInterest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnPoiClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39421 c39421 = new C39421(this.$this_poiClickEvents, dVar);
            c39421.L$0 = obj;
            return c39421;
        }

        @Override // e23.p
        public final Object invoke(t<? super PointOfInterest> tVar, t13.d<? super Unit> dVar) {
            return ((C39421) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                final t tVar = (t) this.L$0;
                this.$this_poiClickEvents.setOnPoiClickListener(new GoogleMap.OnPoiClickListener() { // from class: com.google.maps.android.ktx.h
                    @Override // com.google.android.gms.maps.GoogleMap.OnPoiClickListener
                    public final void onPoiClick(PointOfInterest pointOfInterest) {
                        GoogleMapKt.C39421.invokeSuspend$lambda$0(tVar, pointOfInterest);
                    }
                });
                c cVar = new c(this.$this_poiClickEvents, 17);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Polygon;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$polygonClickEvents$1", f = "GoogleMap.kt", l = {437}, m = "invokeSuspend")
    public static final class C39431 extends v13.i implements p<t<? super Polygon>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_polygonClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39431(GoogleMap googleMap, t13.d<? super C39431> dVar) {
            super(2, dVar);
            this.$this_polygonClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Polygon polygon) {
            polygon.getClass();
            tVar.i(polygon);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnPolygonClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39431 c39431 = new C39431(this.$this_polygonClickEvents, dVar);
            c39431.L$0 = obj;
            return c39431;
        }

        @Override // e23.p
        public final Object invoke(t<? super Polygon> tVar, t13.d<? super Unit> dVar) {
            return ((C39431) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_polygonClickEvents.setOnPolygonClickListener(new b(tVar, 12));
                c cVar = new c(this.$this_polygonClickEvents, 18);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lcom/google/android/gms/maps/model/Polyline;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.google.maps.android.ktx.GoogleMapKt$polylineClickEvents$1", f = "GoogleMap.kt", l = {451}, m = "invokeSuspend")
    public static final class C39441 extends v13.i implements p<t<? super Polyline>, t13.d<? super Unit>, Object> {
        final /* synthetic */ GoogleMap $this_polylineClickEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39441(GoogleMap googleMap, t13.d<? super C39441> dVar) {
            super(2, dVar);
            this.$this_polylineClickEvents = googleMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(t tVar, Polyline polyline) {
            polyline.getClass();
            tVar.i(polyline);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(GoogleMap googleMap) {
            googleMap.setOnPolylineClickListener(null);
            return Unit.INSTANCE;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C39441 c39441 = new C39441(this.$this_polylineClickEvents, dVar);
            c39441.L$0 = obj;
            return c39441;
        }

        @Override // e23.p
        public final Object invoke(t<? super Polyline> tVar, t13.d<? super Unit> dVar) {
            return ((C39441) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                t tVar = (t) this.L$0;
                this.$this_polylineClickEvents.setOnPolylineClickListener(new b(tVar, 13));
                c cVar = new c(this.$this_polylineClickEvents, 19);
                this.label = 1;
                if (q53.r.a(tVar, cVar, this) == aVar) {
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

    public static final Circle addCircle(GoogleMap googleMap, l<? super CircleOptions, Unit> lVar) {
        googleMap.getClass();
        lVar.getClass();
        CircleOptions circleOptions = new CircleOptions();
        lVar.invoke(circleOptions);
        Circle circleAddCircle = googleMap.addCircle(circleOptions);
        circleAddCircle.getClass();
        return circleAddCircle;
    }

    public static final GroundOverlay addGroundOverlay(GoogleMap googleMap, l<? super GroundOverlayOptions, Unit> lVar) {
        googleMap.getClass();
        lVar.getClass();
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        lVar.invoke(groundOverlayOptions);
        return googleMap.addGroundOverlay(groundOverlayOptions);
    }

    public static final Marker addMarker(GoogleMap googleMap, l<? super MarkerOptions, Unit> lVar) {
        googleMap.getClass();
        lVar.getClass();
        MarkerOptions markerOptions = new MarkerOptions();
        lVar.invoke(markerOptions);
        return googleMap.addMarker(markerOptions);
    }

    public static final Polygon addPolygon(GoogleMap googleMap, l<? super PolygonOptions, Unit> lVar) {
        googleMap.getClass();
        lVar.getClass();
        PolygonOptions polygonOptions = new PolygonOptions();
        lVar.invoke(polygonOptions);
        Polygon polygonAddPolygon = googleMap.addPolygon(polygonOptions);
        polygonAddPolygon.getClass();
        return polygonAddPolygon;
    }

    public static final Polyline addPolyline(GoogleMap googleMap, l<? super PolylineOptions, Unit> lVar) {
        googleMap.getClass();
        lVar.getClass();
        PolylineOptions polylineOptions = new PolylineOptions();
        lVar.invoke(polylineOptions);
        Polyline polylineAddPolyline = googleMap.addPolyline(polylineOptions);
        polylineAddPolyline.getClass();
        return polylineAddPolyline;
    }

    public static final TileOverlay addTileOverlay(GoogleMap googleMap, l<? super TileOverlayOptions, Unit> lVar) {
        googleMap.getClass();
        lVar.getClass();
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        lVar.invoke(tileOverlayOptions);
        return googleMap.addTileOverlay(tileOverlayOptions);
    }

    public static final Object awaitAnimateCamera(GoogleMap googleMap, CameraUpdate cameraUpdate, int i14, t13.d<? super Unit> dVar) throws Throwable {
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        googleMap.animateCamera(cameraUpdate, i14, new GoogleMapKt$awaitAnimateCamera$2$1(kVar));
        Object objP = kVar.p();
        return objP == u13.a.COROUTINE_SUSPENDED ? objP : Unit.INSTANCE;
    }

    private static final Object awaitAnimateCamera$$forInline(GoogleMap googleMap, CameraUpdate cameraUpdate, int i14, t13.d<? super Unit> dVar) {
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        googleMap.animateCamera(cameraUpdate, i14, new GoogleMapKt$awaitAnimateCamera$2$1(kVar));
        Unit unit = Unit.INSTANCE;
        if (kVar.p() == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return Unit.INSTANCE;
    }

    public static Object awaitAnimateCamera$default(GoogleMap googleMap, CameraUpdate cameraUpdate, int i14, t13.d dVar, int i15, Object obj) throws Throwable {
        if ((i15 & 2) != 0) {
            i14 = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
        }
        k kVar = new k(u13.f.b(dVar), 1);
        kVar.q();
        googleMap.animateCamera(cameraUpdate, i14, new GoogleMapKt$awaitAnimateCamera$2$1(kVar));
        kVar.p();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return Unit.INSTANCE;
    }

    public static final Object awaitMapLoad(GoogleMap googleMap, t13.d<? super Unit> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        googleMap.setOnMapLoadedCallback(new GoogleMapKt$awaitMapLoad$2$1(iVar));
        Object objA = iVar.a();
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    private static final Object awaitMapLoad$$forInline(GoogleMap googleMap, t13.d<? super Unit> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        googleMap.setOnMapLoadedCallback(new GoogleMapKt$awaitMapLoad$2$1(iVar));
        Unit unit = Unit.INSTANCE;
        if (iVar.a() == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return Unit.INSTANCE;
    }

    public static final Object awaitSnapshot(GoogleMap googleMap, Bitmap bitmap, t13.d<? super Bitmap> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        googleMap.snapshot(new GoogleMapKt$awaitSnapshot$2$1(iVar), bitmap);
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    private static final Object awaitSnapshot$$forInline(GoogleMap googleMap, Bitmap bitmap, t13.d<? super Bitmap> dVar) {
        t13.i iVar = new t13.i(u13.f.b(dVar));
        googleMap.snapshot(new GoogleMapKt$awaitSnapshot$2$1(iVar), bitmap);
        Unit unit = Unit.INSTANCE;
        Object objA = iVar.a();
        if (objA == u13.a.COROUTINE_SUSPENDED) {
            dVar.getClass();
        }
        return objA;
    }

    public static Object awaitSnapshot$default(GoogleMap googleMap, Bitmap bitmap, t13.d dVar, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            bitmap = null;
        }
        t13.i iVar = new t13.i(u13.f.b(dVar));
        googleMap.snapshot(new GoogleMapKt$awaitSnapshot$2$1(iVar), bitmap);
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public static final GoogleMapOptions buildGoogleMapOptions(l<? super GoogleMapOptions, Unit> lVar) {
        lVar.getClass();
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        lVar.invoke(googleMapOptions);
        return googleMapOptions;
    }

    @o13.e
    public static final r53.i<CameraEvent> cameraEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new AnonymousClass1(googleMap, null));
    }

    public static final r53.i<Unit> cameraIdleEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39261(googleMap, null));
    }

    public static final r53.i<Unit> cameraMoveCanceledEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39271(googleMap, null));
    }

    public static final r53.i<Unit> cameraMoveEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39281(googleMap, null));
    }

    public static final r53.i<Integer> cameraMoveStartedEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39291(googleMap, null));
    }

    public static final r53.i<Circle> circleClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39301(googleMap, null));
    }

    public static final r53.i<GroundOverlay> groundOverlayClicks(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39311(googleMap, null));
    }

    public static final r53.i<IndoorChangeEvent> indoorStateChangeEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39321(googleMap, null));
    }

    public static final r53.i<Marker> infoWindowClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39331(googleMap, null));
    }

    public static final r53.i<Marker> infoWindowCloseEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39341(googleMap, null));
    }

    public static final r53.i<Marker> infoWindowLongClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39351(googleMap, null));
    }

    public static final r53.i<LatLng> mapClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39361(googleMap, null));
    }

    public static final r53.i<LatLng> mapLongClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39371(googleMap, null));
    }

    public static final r53.i<Marker> markerClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39381(googleMap, null));
    }

    public static final r53.i<OnMarkerDragEvent> markerDragEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39391(googleMap, null));
    }

    public static final r53.i<Unit> myLocationButtonClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39401(googleMap, null));
    }

    public static final r53.i<Location> myLocationClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39411(googleMap, null));
    }

    public static final r53.i<PointOfInterest> poiClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39421(googleMap, null));
    }

    public static final r53.i<Polygon> polygonClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39431(googleMap, null));
    }

    public static final r53.i<Polyline> polylineClickEvents(GoogleMap googleMap) {
        googleMap.getClass();
        return s.f(new C39441(googleMap, null));
    }
}
