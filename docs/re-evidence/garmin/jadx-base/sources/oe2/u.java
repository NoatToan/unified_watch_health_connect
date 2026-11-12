package oe2;

import com.mapbox.android.gestures.MoveGestureDetector;
import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.android.gestures.StandardScaleGestureDetector;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapLoaded;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.MapState;
import com.mapbox.maps.plugin.gestures.GesturesPlugin;
import com.mapbox.maps.plugin.gestures.GesturesUtils;
import com.mapbox.maps.plugin.gestures.OnMoveListener;
import com.mapbox.maps.plugin.gestures.OnRotateListener;
import com.mapbox.maps.plugin.gestures.OnScaleListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$6$1", f = "MapboxMapCompose.kt", l = {328}, m = "invokeSuspend", v = 2)
public final class u extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f131557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<MapView> f131558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MapState f131559c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f131561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131562f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oe2/u$a", "Lcom/mapbox/maps/plugin/gestures/OnMoveListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements OnMoveListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f131563a;

        public a(p1<Boolean> p1Var) {
            this.f131563a = p1Var;
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
        public final boolean onMove(MoveGestureDetector moveGestureDetector) {
            moveGestureDetector.getClass();
            return false;
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
        public final void onMoveBegin(MoveGestureDetector moveGestureDetector) {
            moveGestureDetector.getClass();
            p1<Boolean> p1Var = this.f131563a;
            f0.b(p1Var);
            f0.d(p1Var, true);
        }

        @Override // com.mapbox.maps.plugin.gestures.OnMoveListener
        public final void onMoveEnd(MoveGestureDetector moveGestureDetector) {
            moveGestureDetector.getClass();
            p1<Boolean> p1Var = this.f131563a;
            f0.b(p1Var);
            f0.d(p1Var, false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oe2/u$b", "Lcom/mapbox/maps/plugin/gestures/OnRotateListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements OnRotateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MapView f131564a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Float, Unit> f131565b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f131566c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(MapView mapView, e23.l<? super Float, Unit> lVar, p1<Boolean> p1Var) {
            this.f131564a = mapView;
            this.f131565b = lVar;
            this.f131566c = p1Var;
        }

        @Override // com.mapbox.maps.plugin.gestures.OnRotateListener
        public final void onRotate(RotateGestureDetector rotateGestureDetector) {
            rotateGestureDetector.getClass();
            CameraState cameraState = this.f131564a.getMapboxMapDeprecated().getCameraState();
            e23.l<Float, Unit> lVar = this.f131565b;
            if (lVar != null) {
                lVar.invoke(Float.valueOf((float) cameraState.getBearing()));
            }
        }

        @Override // com.mapbox.maps.plugin.gestures.OnRotateListener
        public final void onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            rotateGestureDetector.getClass();
            p1<Boolean> p1Var = this.f131566c;
            f0.b(p1Var);
            f0.d(p1Var, true);
        }

        @Override // com.mapbox.maps.plugin.gestures.OnRotateListener
        public final void onRotateEnd(RotateGestureDetector rotateGestureDetector) {
            rotateGestureDetector.getClass();
            p1<Boolean> p1Var = this.f131566c;
            f0.b(p1Var);
            f0.d(p1Var, false);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oe2/u$c", "Lcom/mapbox/maps/plugin/gestures/OnScaleListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements OnScaleListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f131567a;

        public c(p1<Boolean> p1Var) {
            this.f131567a = p1Var;
        }

        @Override // com.mapbox.maps.plugin.gestures.OnScaleListener
        public final void onScale(StandardScaleGestureDetector standardScaleGestureDetector) {
            standardScaleGestureDetector.getClass();
        }

        @Override // com.mapbox.maps.plugin.gestures.OnScaleListener
        public final void onScaleBegin(StandardScaleGestureDetector standardScaleGestureDetector) {
            standardScaleGestureDetector.getClass();
            p1<Boolean> p1Var = this.f131567a;
            f0.b(p1Var);
            f0.d(p1Var, true);
        }

        @Override // com.mapbox.maps.plugin.gestures.OnScaleListener
        public final void onScaleEnd(StandardScaleGestureDetector standardScaleGestureDetector) {
            standardScaleGestureDetector.getClass();
            p1<Boolean> p1Var = this.f131567a;
            f0.b(p1Var);
            f0.d(p1Var, false);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f131568a;

        public d(p1<Boolean> p1Var) {
            this.f131568a = p1Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            p1<Boolean> p1Var = this.f131568a;
            if (!p1Var.getF182175a().booleanValue()) {
                p1Var.setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(p1<MapView> p1Var, MapState mapState, p1<Boolean> p1Var2, e23.l<? super Float, Unit> lVar, p1<Boolean> p1Var3, t13.d<? super u> dVar) {
        super(2, dVar);
        this.f131558b = p1Var;
        this.f131559c = mapState;
        this.f131560d = p1Var2;
        this.f131561e = lVar;
        this.f131562f = p1Var3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u(this.f131558b, this.f131559c, this.f131560d, this.f131561e, this.f131562f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((u) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f131557a;
        if (i14 == 0) {
            o13.r.b(obj);
            MapView f182175a = this.f131558b.getF182175a();
            if (f182175a != null) {
                GesturesPlugin gestures = GesturesUtils.getGestures(f182175a);
                p1<Boolean> p1Var = this.f131560d;
                gestures.addOnMoveListener(new a(p1Var));
                GesturesUtils.getGestures(f182175a).addOnRotateListener(new b(f182175a, this.f131561e, p1Var));
                GesturesUtils.getGestures(f182175a).addOnScaleListener(new c(p1Var));
                r53.i<MapLoaded> mapLoadedEvents = this.f131559c.getMapLoadedEvents();
                d dVar = new d(this.f131562f);
                this.f131557a = 1;
                if (mapLoadedEvents.collect(dVar, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
