package oe2;

import com.google.android.gms.maps.model.LatLng;
import com.mapbox.geojson.Point;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.CoordinateBounds;
import com.mapbox.maps.ExtensionUtils;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/mapbox/maps/MapView;", "mapView", "", "<anonymous>", "(Lo53/b0;Lcom/mapbox/maps/MapView;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$3$4$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.q<o53.b0, MapView, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ MapView f131543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapViewportState f131544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f131547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e23.r<ke2.b, Float, LatLng, LatLng, Unit> f131548f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(MapViewportState mapViewportState, p1<Boolean> p1Var, p1<Boolean> p1Var2, e eVar, e23.r<? super ke2.b, ? super Float, ? super LatLng, ? super LatLng, Unit> rVar, t13.d<? super r> dVar) {
        super(3, dVar);
        this.f131544b = mapViewportState;
        this.f131545c = p1Var;
        this.f131546d = p1Var2;
        this.f131547e = eVar;
        this.f131548f = rVar;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, MapView mapView, t13.d<? super Unit> dVar) {
        e eVar = this.f131547e;
        e23.r<ke2.b, Float, LatLng, LatLng, Unit> rVar = this.f131548f;
        r rVar2 = new r(this.f131544b, this.f131545c, this.f131546d, eVar, rVar, dVar);
        rVar2.f131543a = mapView;
        return rVar2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        CameraState cameraState;
        MapView mapView = this.f131543a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (!f0.b(this.f131545c) && this.f131546d.getF182175a().booleanValue() && (cameraState = this.f131544b.getCameraState()) != null) {
            CoordinateBounds coordinateBoundsCoordinateBoundsForCamera = mapView.getMapboxMapDeprecated().coordinateBoundsForCamera(ExtensionUtils.toCameraOptions$default(mapView.getMapboxMapDeprecated().getCameraState(), null, 1, null));
            e eVar = this.f131547e;
            je2.a aVar2 = eVar.f98597a;
            Point center = cameraState.getCenter();
            center.getClass();
            LatLng latLng = new LatLng(center.latitude(), center.longitude());
            float zoom = (float) cameraState.getZoom();
            float bearing = (float) cameraState.getBearing();
            float pitch = (float) cameraState.getPitch();
            aVar2.getClass();
            eVar.i(new je2.a(latLng, zoom, bearing, pitch));
            e23.r<ke2.b, Float, LatLng, LatLng, Unit> rVar = this.f131548f;
            if (rVar != null) {
                Point center2 = cameraState.getCenter();
                center2.getClass();
                ke2.b bVarF = ne2.p.f(center2);
                Float f14 = new Float((float) cameraState.getZoom());
                Point pointNorthwest = coordinateBoundsCoordinateBoundsForCamera.northwest();
                pointNorthwest.getClass();
                LatLng latLng2 = new LatLng(pointNorthwest.latitude(), pointNorthwest.longitude());
                Point pointSoutheast = coordinateBoundsCoordinateBoundsForCamera.southeast();
                pointSoutheast.getClass();
                rVar.invoke(bVarF, f14, latLng2, new LatLng(pointSoutheast.latitude(), pointSoutheast.longitude()));
            }
        }
        return Unit.INSTANCE;
    }
}
