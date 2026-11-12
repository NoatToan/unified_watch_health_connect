package com.mapbox.maps.extension.compose.animation.viewport;

import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraChangedCoalesced;
import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.EdgeInsets;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.ScreenCoordinate;
import com.mapbox.maps.Style;
import com.mapbox.maps.coroutine.MapboxMapExtKt;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import com.mapbox.maps.plugin.viewport.CompletionListener;
import com.mapbox.maps.plugin.viewport.ViewportPlugin;
import com.mapbox.maps.plugin.viewport.ViewportStatus;
import com.mapbox.maps.plugin.viewport.ViewportStatusObserver;
import com.mapbox.maps.plugin.viewport.ViewportUtils;
import com.mapbox.maps.plugin.viewport.data.DefaultViewportTransitionOptions;
import com.mapbox.maps.plugin.viewport.data.FollowPuckViewportStateOptions;
import com.mapbox.maps.plugin.viewport.data.OverviewViewportStateOptions;
import com.mapbox.maps.plugin.viewport.data.ViewportStatusChangeReason;
import d4.k;
import d4.m;
import e23.l;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.h0;
import p3.i0;
import p3.l0;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import q53.i;
import r53.j;
import t13.d;
import u13.f;
import v13.e;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0001QB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u000e\u001a\u00020\b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u0010H\u0007¢\u0006\u0004\b\u000e\u0010\u0013JO\u0010\u001e\u001a\u00020\f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\b\u0002\u0010\u0017\u001a\u00020\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010$\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J-\u0010&\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b&\u0010%J+\u0010+\u001a\u00020\b2\u0006\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b+\u0010,J-\u0010/\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020-2\b\b\u0002\u0010*\u001a\u00020)2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b3\u0010\nJ\u0017\u00104\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b4\u0010\nJ\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b5\u0010\nR&\u00107\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0010068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u00109R\u001c\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u001d\u0010E\u001a\u0004\u0018\u00010\u00028FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bA\u0010B*\u0004\bC\u0010DR\u001d\u0010I\u001a\u0004\u0018\u00010?8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bF\u0010G*\u0004\bH\u0010DR\u001d\u0010M\u001a\u0004\u0018\u00010=8FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bJ\u0010K*\u0004\bL\u0010DR\u0013\u0010P\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\bN\u0010O\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006R"}, d2 = {"Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "", "Lcom/mapbox/maps/CameraState;", "initialCameraState", "<init>", "(Lcom/mapbox/maps/CameraState;)V", "Lcom/mapbox/maps/MapView;", "mapView", "", "BindToMap$extension_compose_release", "(Lcom/mapbox/maps/MapView;Lp3/m;I)V", "BindToMap", "Lcom/mapbox/maps/CameraOptions;", "cameraOptions", "setCameraOptions", "(Lcom/mapbox/maps/CameraOptions;)V", "Lkotlin/Function1;", "Lcom/mapbox/maps/CameraOptions$Builder;", "block", "(Le23/l;)V", "", "Lcom/mapbox/geojson/Point;", "coordinates", "camera", "Lcom/mapbox/maps/EdgeInsets;", "coordinatesPadding", "", "maxZoom", "Lcom/mapbox/maps/ScreenCoordinate;", MapboxMap.QFE_OFFSET, "cameraForCoordinates", "(Ljava/util/List;Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/EdgeInsets;Ljava/lang/Double;Lcom/mapbox/maps/ScreenCoordinate;Lt13/d;)Ljava/lang/Object;", "Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;", "animationOptions", "Lcom/mapbox/maps/plugin/viewport/CompletionListener;", "completionListener", "easeTo", "(Lcom/mapbox/maps/CameraOptions;Lcom/mapbox/maps/plugin/animation/MapAnimationOptions;Lcom/mapbox/maps/plugin/viewport/CompletionListener;)V", "flyTo", "Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;", "overviewViewportStateOptions", "Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;", "defaultTransitionOptions", "transitionToOverviewState", "(Lcom/mapbox/maps/plugin/viewport/data/OverviewViewportStateOptions;Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;Lcom/mapbox/maps/plugin/viewport/CompletionListener;)V", "Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;", "followPuckViewportStateOptions", "transitionToFollowPuckState", "(Lcom/mapbox/maps/plugin/viewport/data/FollowPuckViewportStateOptions;Lcom/mapbox/maps/plugin/viewport/data/DefaultViewportTransitionOptions;Lcom/mapbox/maps/plugin/viewport/CompletionListener;)V", "idle", "()V", "UpdateCameraState", "UpdateViewportStatus", "DrainActionQueue", "Lq53/i;", "viewportActionChannel", "Lq53/i;", "Lcom/mapbox/maps/MapView;", "Lp3/p1;", "_cameraState", "Lp3/p1;", "Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "_mapViewportStatus", "Lcom/mapbox/maps/plugin/viewport/data/ViewportStatusChangeReason;", "_mapViewportStatusChangedReason", "getCameraState", "()Lcom/mapbox/maps/CameraState;", "getCameraState$delegate", "(Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;)Ljava/lang/Object;", "cameraState", "getMapViewportStatusChangedReason", "()Lcom/mapbox/maps/plugin/viewport/data/ViewportStatusChangeReason;", "getMapViewportStatusChangedReason$delegate", "mapViewportStatusChangedReason", "getMapViewportStatus", "()Lcom/mapbox/maps/plugin/viewport/ViewportStatus;", "getMapViewportStatus$delegate", "mapViewportStatus", "getStyleDefaultCameraOptions", "()Lcom/mapbox/maps/CameraOptions;", "styleDefaultCameraOptions", "Companion", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MapViewportState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final CameraState INIT_CAMERA_STATE;
    private static final k<MapViewportState, CameraState> Saver;
    private static final String TAG = "MapViewportState";
    private final p1<CameraState> _cameraState;
    private final p1<ViewportStatus> _mapViewportStatus;
    private final p1<ViewportStatusChangeReason> _mapViewportStatusChangedReason;
    private MapView mapView;
    private final i<l<MapView, Unit>> viewportActionChannel;

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$DrainActionQueue$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$DrainActionQueue$1", f = "MapViewportState.kt", l = {116}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends v13.i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ MapView $mapView;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MapView mapView, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$mapView = mapView;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return MapViewportState.this.new AnonymousClass1(this.$mapView, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0030 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x0039  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:12:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L11
                java.lang.Object r1 = r4.L$0
                q53.k r1 = (q53.k) r1
                o13.r.b(r5)
                goto L31
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
                r5 = 0
                return r5
            L18:
                o13.r.b(r5)
                com.mapbox.maps.extension.compose.animation.viewport.MapViewportState r5 = com.mapbox.maps.extension.compose.animation.viewport.MapViewportState.this
                q53.i r5 = com.mapbox.maps.extension.compose.animation.viewport.MapViewportState.access$getViewportActionChannel$p(r5)
                q53.k r5 = r5.iterator()
                r1 = r5
            L26:
                r4.L$0 = r1
                r4.label = r2
                java.lang.Object r5 = r1.a(r4)
                if (r5 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L45
                java.lang.Object r5 = r1.next()
                e23.l r5 = (e23.l) r5
                com.mapbox.maps.MapView r3 = r4.$mapView
                r5.invoke(r3)
                goto L26
            L45:
                kotlin.Unit r5 = p005kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateCameraState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @e(c = "com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateCameraState$1", f = "MapViewportState.kt", l = {91}, m = "invokeSuspend")
    public static final class C39671 extends v13.i implements p<b0, d<? super Unit>, Object> {
        final /* synthetic */ MapView $mapView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39671(MapView mapView, d<? super C39671> dVar) {
            super(2, dVar);
            this.$mapView = mapView;
        }

        @Override // v13.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return MapViewportState.this.new C39671(this.$mapView, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
            return ((C39671) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                CameraState cameraState = MapViewportState.this.getCameraState();
                if (cameraState != null) {
                    MapViewportState.this.setCameraOptions(ExtensionUtils.toCameraOptions$default(cameraState, null, 1, null));
                }
                r53.i cameraChangedCoalescedEvents = MapboxMapExtKt.getCameraChangedCoalescedEvents(this.$mapView.getMapboxMapDeprecated());
                final MapViewportState mapViewportState = MapViewportState.this;
                j<CameraChangedCoalesced> jVar = new j<CameraChangedCoalesced>() { // from class: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState.UpdateCameraState.1.2
                    /* JADX INFO: renamed from: emit, reason: avoid collision after fix types in other method */
                    public final Object emit2(CameraChangedCoalesced cameraChangedCoalesced, d<? super Unit> dVar) {
                        mapViewportState._cameraState.setValue(cameraChangedCoalesced.getCameraState());
                        return Unit.INSTANCE;
                    }

                    @Override // r53.j
                    public /* bridge */ /* synthetic */ Object emit(CameraChangedCoalesced cameraChangedCoalesced, d dVar) {
                        return emit2(cameraChangedCoalesced, (d<? super Unit>) dVar);
                    }
                };
                this.label = 1;
                if (cameraChangedCoalescedEvents.collect(jVar, this) == aVar) {
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

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateViewportStatus$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39691 extends w implements l<i0, h0> {
        final /* synthetic */ MapView $mapView;
        final /* synthetic */ MapViewportState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39691(MapView mapView, MapViewportState mapViewportState) {
            super(1);
            this.$mapView = mapView;
            this.this$0 = mapViewportState;
        }

        @Override // e23.l
        public final h0 invoke(i0 i0Var) {
            i0Var.getClass();
            final MapViewportState mapViewportState = this.this$0;
            final ViewportStatusObserver viewportStatusObserver = new ViewportStatusObserver() { // from class: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateViewportStatus$1$viewportStatusObserver$1
                @Override // com.mapbox.maps.plugin.viewport.ViewportStatusObserver
                public final void onViewportStatusChanged(ViewportStatus viewportStatus, ViewportStatus viewportStatus2, ViewportStatusChangeReason viewportStatusChangeReason) {
                    viewportStatus.getClass();
                    viewportStatus2.getClass();
                    viewportStatusChangeReason.getClass();
                    mapViewportState._mapViewportStatus.setValue(viewportStatus2);
                    mapViewportState._mapViewportStatusChangedReason.setValue(viewportStatusChangeReason);
                }
            };
            ViewportUtils.getViewport(this.$mapView).addStatusObserver(viewportStatusObserver);
            final MapView mapView = this.$mapView;
            final MapViewportState mapViewportState2 = this.this$0;
            return new h0() { // from class: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateViewportStatus$1$invoke$$inlined$onDispose$1
                @Override // p3.h0
                public void dispose() {
                    ViewportUtils.getViewport(mapView).removeStatusObserver(viewportStatusObserver);
                    mapViewportState2._mapViewportStatus.setValue(null);
                    mapViewportState2._mapViewportStatusChangedReason.setValue(null);
                }
            };
        }
    }

    static {
        MapViewportState$Companion$Saver$1 mapViewportState$Companion$Saver$1 = MapViewportState$Companion$Saver$1.INSTANCE;
        MapViewportState$Companion$Saver$2 mapViewportState$Companion$Saver$2 = MapViewportState$Companion$Saver$2.INSTANCE;
        d4.l lVar = m.f57455a;
        Saver = new d4.l(mapViewportState$Companion$Saver$1, mapViewportState$Companion$Saver$2);
        INIT_CAMERA_STATE = new CameraState(Point.fromLngLat(0.0d, 0.0d), new EdgeInsets(0.0d, 0.0d, 0.0d, 0.0d), 0.0d, 0.0d, 0.0d);
    }

    public MapViewportState(CameraState cameraState) {
        cameraState.getClass();
        this.viewportActionChannel = q53.l.a(Integer.MAX_VALUE, 6, null);
        this._cameraState = p0.n(cameraState.equals(INIT_CAMERA_STATE) ? null : cameraState);
        this._mapViewportStatus = p0.n(null);
        this._mapViewportStatusChangedReason = p0.n(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void DrainActionQueue(MapView mapView, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-90155546);
        x1 x1Var = n.f135158a;
        l0.e(new AnonymousClass1(mapView, null), Unit.INSTANCE, o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new AnonymousClass2(mapView, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateCameraState(MapView mapView, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-1454830646);
        x1 x1Var = n.f135158a;
        l0.e(new C39671(mapView, null), Unit.INSTANCE, o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39682(mapView, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void UpdateViewportStatus(MapView mapView, p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-212785564);
        x1 x1Var = n.f135158a;
        l0.a(Unit.INSTANCE, new C39691(mapView, this), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new C39702(mapView, i14);
    }

    public static /* synthetic */ Object cameraForCoordinates$default(MapViewportState mapViewportState, List list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d dVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            cameraOptions = new CameraOptions.Builder().build();
            cameraOptions.getClass();
        }
        return mapViewportState.cameraForCoordinates(list, cameraOptions, (i14 & 4) != 0 ? null : edgeInsets, (i14 & 8) != 0 ? null : d14, (i14 & 16) != 0 ? null : screenCoordinate, dVar);
    }

    public static /* synthetic */ void easeTo$default(MapViewportState mapViewportState, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, CompletionListener completionListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 4) != 0) {
            completionListener = null;
        }
        mapViewportState.easeTo(cameraOptions, mapAnimationOptions, completionListener);
    }

    public static /* synthetic */ void flyTo$default(MapViewportState mapViewportState, CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, CompletionListener completionListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            mapAnimationOptions = null;
        }
        if ((i14 & 4) != 0) {
            completionListener = null;
        }
        mapViewportState.flyTo(cameraOptions, mapAnimationOptions, completionListener);
    }

    public static /* synthetic */ void transitionToFollowPuckState$default(MapViewportState mapViewportState, FollowPuckViewportStateOptions followPuckViewportStateOptions, DefaultViewportTransitionOptions defaultViewportTransitionOptions, CompletionListener completionListener, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            followPuckViewportStateOptions = new FollowPuckViewportStateOptions.Builder().build();
        }
        if ((i14 & 2) != 0) {
            defaultViewportTransitionOptions = new DefaultViewportTransitionOptions.Builder().build();
        }
        if ((i14 & 4) != 0) {
            completionListener = null;
        }
        mapViewportState.transitionToFollowPuckState(followPuckViewportStateOptions, defaultViewportTransitionOptions, completionListener);
    }

    public static /* synthetic */ void transitionToOverviewState$default(MapViewportState mapViewportState, OverviewViewportStateOptions overviewViewportStateOptions, DefaultViewportTransitionOptions defaultViewportTransitionOptions, CompletionListener completionListener, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            defaultViewportTransitionOptions = new DefaultViewportTransitionOptions.Builder().build();
        }
        if ((i14 & 4) != 0) {
            completionListener = null;
        }
        mapViewportState.transitionToOverviewState(overviewViewportStateOptions, defaultViewportTransitionOptions, completionListener);
    }

    public final void BindToMap$extension_compose_release(MapView mapView, p3.m mVar, int i14) {
        mapView.getClass();
        o0 o0VarE = mVar.E(696501707);
        x1 x1Var = n.f135158a;
        int i15 = (i14 & 112) | 8;
        UpdateCameraState(mapView, o0VarE, i15);
        UpdateViewportStatus(mapView, o0VarE, i15);
        DrainActionQueue(mapView, o0VarE, i15);
        l0.a(Unit.INSTANCE, new MapViewportState$BindToMap$1(this, mapView), o0VarE);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 == null) {
            return;
        }
        p2VarI0.f135219d = new MapViewportState$BindToMap$2(this, mapView, i14);
    }

    public final Object cameraForCoordinates(List<Point> list, CameraOptions cameraOptions, EdgeInsets edgeInsets, Double d14, ScreenCoordinate screenCoordinate, d<? super CameraOptions> dVar) {
        t13.i iVar = new t13.i(f.b(dVar));
        this.viewportActionChannel.i(new MapViewportState$cameraForCoordinates$3$1(list, cameraOptions, edgeInsets, d14, screenCoordinate, iVar));
        Object objA = iVar.a();
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        return objA;
    }

    public final void easeTo(CameraOptions cameraOptions, MapAnimationOptions animationOptions, CompletionListener completionListener) {
        cameraOptions.getClass();
        this.viewportActionChannel.i(new C39711(cameraOptions, animationOptions, completionListener));
    }

    public final void flyTo(CameraOptions cameraOptions, MapAnimationOptions animationOptions, CompletionListener completionListener) {
        cameraOptions.getClass();
        this.viewportActionChannel.i(new C39721(cameraOptions, animationOptions, completionListener));
    }

    public final CameraState getCameraState() {
        return this._cameraState.getF182175a();
    }

    public final ViewportStatus getMapViewportStatus() {
        return this._mapViewportStatus.getF182175a();
    }

    public final ViewportStatusChangeReason getMapViewportStatusChangedReason() {
        return this._mapViewportStatusChangedReason.getF182175a();
    }

    public final CameraOptions getStyleDefaultCameraOptions() {
        MapboxMap mapboxMapDeprecated;
        Style styleDeprecated;
        MapView mapView = this.mapView;
        if (mapView == null || (mapboxMapDeprecated = mapView.getMapboxMapDeprecated()) == null || (styleDeprecated = mapboxMapDeprecated.getStyleDeprecated()) == null) {
            return null;
        }
        return styleDeprecated.getStyleDefaultCamera();
    }

    public final void idle() {
        this.viewportActionChannel.i(C39731.INSTANCE);
    }

    public final void setCameraOptions(l<? super CameraOptions.Builder, Unit> block) {
        block.getClass();
        CameraOptions.Builder builder = new CameraOptions.Builder();
        block.invoke(builder);
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        setCameraOptions(cameraOptionsBuild);
    }

    public final void transitionToFollowPuckState(FollowPuckViewportStateOptions followPuckViewportStateOptions, DefaultViewportTransitionOptions defaultTransitionOptions, CompletionListener completionListener) {
        followPuckViewportStateOptions.getClass();
        defaultTransitionOptions.getClass();
        this.viewportActionChannel.i(new C39751(followPuckViewportStateOptions, defaultTransitionOptions, completionListener));
    }

    public final void transitionToOverviewState(OverviewViewportStateOptions overviewViewportStateOptions, DefaultViewportTransitionOptions defaultTransitionOptions, CompletionListener completionListener) {
        overviewViewportStateOptions.getClass();
        defaultTransitionOptions.getClass();
        this.viewportActionChannel.i(new C39761(overviewViewportStateOptions, defaultTransitionOptions, completionListener));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState$Companion;", "", "<init>", "()V", "Ld4/k;", "Lcom/mapbox/maps/extension/compose/animation/viewport/MapViewportState;", "Lcom/mapbox/maps/CameraState;", "Saver", "Ld4/k;", "getSaver", "()Ld4/k;", "INIT_CAMERA_STATE", "Lcom/mapbox/maps/CameraState;", "", "TAG", "Ljava/lang/String;", "extension-compose_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final k<MapViewportState, CameraState> getSaver() {
            return MapViewportState.Saver;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$idle$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39731 extends w implements l<MapView, Unit> {
        public static final C39731 INSTANCE = new C39731();

        public C39731() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapView mapView) {
            mapView.getClass();
            ViewportUtils.getViewport(mapView).idle();
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
            invoke2(mapView);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$DrainActionQueue$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements p<p3.m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MapView $mapView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MapView mapView, int i14) {
            super(2);
            this.$mapView = mapView;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(p3.m mVar, int i14) {
            MapViewportState.this.DrainActionQueue(this.$mapView, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateCameraState$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39682 extends w implements p<p3.m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MapView $mapView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39682(MapView mapView, int i14) {
            super(2);
            this.$mapView = mapView;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(p3.m mVar, int i14) {
            MapViewportState.this.UpdateCameraState(this.$mapView, mVar, this.$$changed | 1);
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$UpdateViewportStatus$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39702 extends w implements p<p3.m, Integer, Unit> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ MapView $mapView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39702(MapView mapView, int i14) {
            super(2);
            this.$mapView = mapView;
            this.$$changed = i14;
        }

        @Override // e23.p
        public /* bridge */ /* synthetic */ Unit invoke(p3.m mVar, Integer num) {
            invoke(mVar, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(p3.m mVar, int i14) {
            MapViewportState.this.UpdateViewportStatus(this.$mapView, mVar, this.$$changed | 1);
        }
    }

    public final void setCameraOptions(CameraOptions cameraOptions) {
        cameraOptions.getClass();
        this.viewportActionChannel.i(new C39741(cameraOptions));
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$transitionToFollowPuckState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39751 extends w implements l<MapView, Unit> {
        final /* synthetic */ CompletionListener $completionListener;
        final /* synthetic */ DefaultViewportTransitionOptions $defaultTransitionOptions;
        final /* synthetic */ FollowPuckViewportStateOptions $followPuckViewportStateOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39751(FollowPuckViewportStateOptions followPuckViewportStateOptions, DefaultViewportTransitionOptions defaultViewportTransitionOptions, CompletionListener completionListener) {
            super(1);
            this.$followPuckViewportStateOptions = followPuckViewportStateOptions;
            this.$defaultTransitionOptions = defaultViewportTransitionOptions;
            this.$completionListener = completionListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapView mapView) {
            mapView.getClass();
            ViewportPlugin viewport = ViewportUtils.getViewport(mapView);
            FollowPuckViewportStateOptions followPuckViewportStateOptions = this.$followPuckViewportStateOptions;
            DefaultViewportTransitionOptions defaultViewportTransitionOptions = this.$defaultTransitionOptions;
            viewport.transitionTo(viewport.makeFollowPuckViewportState(followPuckViewportStateOptions), viewport.makeDefaultViewportTransition(defaultViewportTransitionOptions), this.$completionListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
            invoke2(mapView);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$transitionToOverviewState$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39761 extends w implements l<MapView, Unit> {
        final /* synthetic */ CompletionListener $completionListener;
        final /* synthetic */ DefaultViewportTransitionOptions $defaultTransitionOptions;
        final /* synthetic */ OverviewViewportStateOptions $overviewViewportStateOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39761(OverviewViewportStateOptions overviewViewportStateOptions, DefaultViewportTransitionOptions defaultViewportTransitionOptions, CompletionListener completionListener) {
            super(1);
            this.$overviewViewportStateOptions = overviewViewportStateOptions;
            this.$defaultTransitionOptions = defaultViewportTransitionOptions;
            this.$completionListener = completionListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapView mapView) {
            mapView.getClass();
            ViewportPlugin viewport = ViewportUtils.getViewport(mapView);
            OverviewViewportStateOptions overviewViewportStateOptions = this.$overviewViewportStateOptions;
            DefaultViewportTransitionOptions defaultViewportTransitionOptions = this.$defaultTransitionOptions;
            viewport.transitionTo(viewport.makeOverviewViewportState(overviewViewportStateOptions), viewport.makeDefaultViewportTransition(defaultViewportTransitionOptions), this.$completionListener);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
            invoke2(mapView);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$setCameraOptions$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39741 extends w implements l<MapView, Unit> {
        final /* synthetic */ CameraOptions $cameraOptions;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39741(CameraOptions cameraOptions) {
            super(1);
            this.$cameraOptions = cameraOptions;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapView mapView) {
            mapView.getClass();
            ViewportPlugin.DefaultImpls.transitionTo$default(ViewportUtils.getViewport(mapView), new CameraViewportState(this.$cameraOptions, new MapViewportState$setCameraOptions$1$1$1(mapView)), ViewportUtils.getViewport(mapView).makeImmediateViewportTransition(), null, 4, null);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
            invoke2(mapView);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$easeTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39711 extends w implements l<MapView, Unit> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ CameraOptions $cameraOptions;
        final /* synthetic */ CompletionListener $completionListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39711(CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, CompletionListener completionListener) {
            super(1);
            this.$cameraOptions = cameraOptions;
            this.$animationOptions = mapAnimationOptions;
            this.$completionListener = completionListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapView mapView) {
            mapView.getClass();
            ViewportPlugin.DefaultImpls.transitionTo$default(ViewportUtils.getViewport(mapView), new CameraViewportState(this.$cameraOptions, new MapViewportState$easeTo$1$1$1(mapView)), new GenericViewportTransition(new MapViewportState$easeTo$1$1$2(mapView, this.$animationOptions, this.$completionListener)), null, 4, null);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
            invoke2(mapView);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.maps.extension.compose.animation.viewport.MapViewportState$flyTo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "mapView", "Lcom/mapbox/maps/MapView;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39721 extends w implements l<MapView, Unit> {
        final /* synthetic */ MapAnimationOptions $animationOptions;
        final /* synthetic */ CameraOptions $cameraOptions;
        final /* synthetic */ CompletionListener $completionListener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39721(CameraOptions cameraOptions, MapAnimationOptions mapAnimationOptions, CompletionListener completionListener) {
            super(1);
            this.$cameraOptions = cameraOptions;
            this.$animationOptions = mapAnimationOptions;
            this.$completionListener = completionListener;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MapView mapView) {
            mapView.getClass();
            ViewportPlugin.DefaultImpls.transitionTo$default(ViewportUtils.getViewport(mapView), new CameraViewportState(this.$cameraOptions, new MapViewportState$flyTo$1$1$1(mapView)), new GenericViewportTransition(new MapViewportState$flyTo$1$1$2(mapView, this.$animationOptions, this.$completionListener)), null, 4, null);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(MapView mapView) {
            invoke2(mapView);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapViewportState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MapViewportState(CameraState cameraState, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? INIT_CAMERA_STATE : cameraState);
    }
}
