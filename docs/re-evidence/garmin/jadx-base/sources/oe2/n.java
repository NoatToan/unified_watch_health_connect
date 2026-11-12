package oe2;

import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/mapbox/maps/MapView;", "mapView", "", "<anonymous>", "(Lo53/b0;Lcom/mapbox/maps/MapView;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$3$1$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.q<o53.b0, MapView, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ MapView f131531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f131532b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z14, t13.d<? super n> dVar) {
        super(3, dVar);
        this.f131532b = z14;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, MapView mapView, t13.d<? super Unit> dVar) {
        n nVar = new n(this.f131532b, dVar);
        nVar.f131531a = mapView;
        return nVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        MapView mapView = this.f131531a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        LocationComponentUtils.getLocationComponent(mapView).updateSettings(new a81.j(this.f131532b, 22));
        return Unit.INSTANCE;
    }
}
