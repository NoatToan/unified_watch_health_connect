package oe2;

import com.mapbox.android.gestures.RotateGestureDetector;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.gestures.GesturesUtils;
import com.mapbox.maps.plugin.gestures.OnRotateListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapPreviewContainer$5$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1<MapView> f131580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l<Float, Unit> f131581b;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"oe2/z$a", "Lcom/mapbox/maps/plugin/gestures/OnRotateListener;", "map-sdk-adapter-mapbox-map_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements OnRotateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MapView f131582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e23.l<Float, Unit> f131583b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(MapView mapView, e23.l<? super Float, Unit> lVar) {
            this.f131582a = mapView;
            this.f131583b = lVar;
        }

        @Override // com.mapbox.maps.plugin.gestures.OnRotateListener
        public final void onRotate(RotateGestureDetector rotateGestureDetector) {
            rotateGestureDetector.getClass();
            CameraState cameraState = this.f131582a.getMapboxMapDeprecated().getCameraState();
            e23.l<Float, Unit> lVar = this.f131583b;
            if (lVar != null) {
                lVar.invoke(Float.valueOf((float) cameraState.getBearing()));
            }
        }

        @Override // com.mapbox.maps.plugin.gestures.OnRotateListener
        public final void onRotateBegin(RotateGestureDetector rotateGestureDetector) {
            rotateGestureDetector.getClass();
        }

        @Override // com.mapbox.maps.plugin.gestures.OnRotateListener
        public final void onRotateEnd(RotateGestureDetector rotateGestureDetector) {
            rotateGestureDetector.getClass();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(p1<MapView> p1Var, e23.l<? super Float, Unit> lVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f131580a = p1Var;
        this.f131581b = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f131580a, this.f131581b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        MapView f182175a = this.f131580a.getF182175a();
        if (f182175a != null) {
            GesturesUtils.getGestures(f182175a).addOnRotateListener(new a(f182175a, this.f131581b));
        }
        return Unit.INSTANCE;
    }
}
