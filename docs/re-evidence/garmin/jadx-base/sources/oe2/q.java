package oe2;

import android.content.Context;
import com.mapbox.maps.MapView;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/mapbox/maps/MapView;", "mapView", "", "<anonymous>", "(Lo53/b0;Lcom/mapbox/maps/MapView;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.mapsdkadapter.mapbox.compose.MapboxMapComposeKt$MapboxMapContainer$3$3$1", f = "MapboxMapCompose.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.q<o53.b0, MapView, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ MapView f131538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1<MapView> f131539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ le2.b f131540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f131541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f131542e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p1<MapView> p1Var, le2.b bVar, double d14, Context context, t13.d<? super q> dVar) {
        super(3, dVar);
        this.f131539b = p1Var;
        this.f131540c = bVar;
        this.f131541d = d14;
        this.f131542e = context;
    }

    @Override // e23.q
    public final Object invoke(o53.b0 b0Var, MapView mapView, t13.d<? super Unit> dVar) {
        double d14 = this.f131541d;
        Context context = this.f131542e;
        q qVar = new q(this.f131539b, this.f131540c, d14, context, dVar);
        qVar.f131538a = mapView;
        return qVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        MapView mapView = this.f131538a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f131539b.setValue(mapView);
        MapboxMap mapboxMapDeprecated = mapView.getMapboxMapDeprecated();
        final le2.b bVar = this.f131540c;
        final double d14 = this.f131541d;
        final Context context = this.f131542e;
        mapboxMapDeprecated.getStyle(new Style.OnStyleLoaded() { // from class: oe2.p
            @Override // com.mapbox.maps.Style.OnStyleLoaded
            public final void onStyleLoaded(Style style) {
                le2.b bVar2 = bVar;
                e23.p<Float, com.garmin.android.library.mapsdkadapter.i.d, Boolean> pVar = bVar2.f112057d;
                i53.c<le2.c> cVar = bVar2.f112056c;
                double d15 = d14;
                boolean zBooleanValue = pVar.invoke(Float.valueOf((float) d15), com.garmin.android.library.mapsdkadapter.i.d.MAPBOX).booleanValue();
                i53.c<le2.d> cVar2 = bVar2.f112055b;
                Context context2 = context;
                if (!zBooleanValue) {
                    f0.f(style, cVar2, d15);
                    f0.e(context2, style, cVar, false);
                    return;
                }
                Iterator<le2.d> it = cVar2.iterator();
                while (it.hasNext()) {
                    long j8 = it.next().f112062a;
                    String strE = org.apache.commons.lang3.e.e(j8, "polyline-source-");
                    String strE2 = org.apache.commons.lang3.e.e(j8, "polyline-layer-");
                    String strE3 = org.apache.commons.lang3.e.e(j8, "polyline-border-");
                    if (style.styleSourceExists(strE)) {
                        style.removeStyleSource(strE);
                    }
                    if (style.styleLayerExists(strE2)) {
                        style.removeStyleLayer(strE2);
                    }
                    if (style.styleLayerExists(strE3)) {
                        style.removeStyleLayer(strE3);
                    }
                }
                f0.e(context2, style, cVar, true);
            }
        });
        return Unit.INSTANCE;
    }
}
