package oe2;

import android.content.Context;
import com.mapbox.maps.MapView;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/mapbox/maps/MapView;", "mapView", "", "<anonymous>", "(Lo53/b0;Lcom/mapbox/maps/MapView;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapPreviewContainer$3$1$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.q<o53.b0, MapView, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ MapView f131570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<MapView> f131571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i53.c<le2.d> f131572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ MapViewportState f131573d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f131574e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.c<le2.c> f131575f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p1<MapView> p1Var, i53.c<le2.d> cVar, MapViewportState mapViewportState, Context context, i53.c<le2.c> cVar2, t13.d<? super w> dVar) {
        super(3, dVar);
        this.f131571b = p1Var;
        this.f131572c = cVar;
        this.f131573d = mapViewportState;
        this.f131574e = context;
        this.f131575f = cVar2;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, MapView mapView, t13.d<? super Unit> dVar) {
        Context context = this.f131574e;
        i53.c<le2.c> cVar = this.f131575f;
        w wVar = new w(this.f131571b, this.f131572c, this.f131573d, context, cVar, dVar);
        wVar.f131570a = mapView;
        return wVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        MapView mapView = this.f131570a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f131571b.setValue(mapView);
        mapView.getMapboxMapDeprecated().getStyle(new ne2.b0(this.f131572c, this.f131573d, this.f131574e, this.f131575f));
        return Unit.INSTANCE;
    }
}
