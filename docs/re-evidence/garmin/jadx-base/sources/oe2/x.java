package oe2;

import com.mapbox.maps.CameraOptions;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.plugin.animation.MapAnimationOptions;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/mapbox/maps/MapView;", "mapView", "", "<anonymous>", "(Lo53/b0;Lcom/mapbox/maps/MapView;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapPreviewContainer$3$2$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x extends v13.i implements e23.q<o53.b0, MapView, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapViewportState f131576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131577b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(MapViewportState mapViewportState, boolean z14, t13.d<? super x> dVar) {
        super(3, dVar);
        this.f131576a = mapViewportState;
        this.f131577b = z14;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, MapView mapView, t13.d<? super Unit> dVar) {
        return new x(this.f131576a, this.f131577b, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        CameraOptions.Builder builder = new CameraOptions.Builder();
        if (this.f131577b) {
            builder.pitch(new Double(60.0d));
        } else {
            builder.pitch(new Double(0.0d));
        }
        CameraOptions cameraOptionsBuild = builder.build();
        cameraOptionsBuild.getClass();
        MapAnimationOptions.Companion companion = MapAnimationOptions.INSTANCE;
        MapAnimationOptions.Builder builder2 = new MapAnimationOptions.Builder();
        builder2.duration(500L);
        MapViewportState.easeTo$default(this.f131576a, cameraOptionsBuild, builder2.build(), null, 4, null);
        return Unit.INSTANCE;
    }
}
