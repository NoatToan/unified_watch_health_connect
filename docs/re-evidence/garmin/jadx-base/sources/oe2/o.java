package oe2;

import com.mapbox.maps.MapView;
import com.mapbox.maps.plugin.locationcomponent.LocationComponentUtils;
import o72.i3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/mapbox/maps/MapView;", "mapView", "", "<anonymous>", "(Lo53/b0;Lcom/mapbox/maps/MapView;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$3$2$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.q<o53.b0, MapView, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ MapView f131533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<Boolean> f131534b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p1<Boolean> p1Var, t13.d<? super o> dVar) {
        super(3, dVar);
        this.f131534b = p1Var;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, MapView mapView, t13.d<? super Unit> dVar) {
        o oVar = new o(this.f131534b, dVar);
        oVar.f131533a = mapView;
        return oVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        MapView mapView = this.f131533a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        LocationComponentUtils.getLocationComponent(mapView).updateSettings(new i3(this.f131534b, 7));
        return Unit.INSTANCE;
    }
}
