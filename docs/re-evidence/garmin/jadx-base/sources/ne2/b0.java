package ne2;

import android.content.Context;
import com.mapbox.geojson.LineString;
import com.mapbox.maps.CameraState;
import com.mapbox.maps.ClickInteraction;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.LayerUtils;
import com.mapbox.maps.extension.style.layers.generated.LineLayer;
import com.mapbox.maps.extension.style.layers.properties.generated.LineCap;
import com.mapbox.maps.extension.style.layers.properties.generated.LineJoin;
import com.mapbox.maps.extension.style.layers.properties.generated.Visibility;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.jvm.internal.r0;
import p13.h0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b0 implements Style.OnStyleLoaded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125564a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f125565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f125566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f125567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f125568e;

    public /* synthetic */ b0(i53.c cVar, MapViewportState mapViewportState, Context context, i53.c cVar2) {
        this.f125565b = cVar;
        this.f125566c = mapViewportState;
        this.f125567d = context;
        this.f125568e = cVar2;
    }

    /* JADX WARN: Type inference failed for: r12v16, types: [B, T] */
    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        int i14 = this.f125564a;
        int i15 = 0;
        Object obj = this.f125568e;
        Object obj2 = this.f125567d;
        Object obj3 = this.f125566c;
        List list = this.f125565b;
        switch (i14) {
            case 0:
                d0 d0Var = (d0) obj;
                List list2 = (List) obj3;
                List list3 = (List) obj2;
                int i16 = d0.f125576h;
                style.getClass();
                for (Object obj4 : list) {
                    int i17 = i15 + 1;
                    if (i15 < 0) {
                        p13.x.q();
                        throw null;
                    }
                    com.garmin.android.library.mapsdkadapter.q qVar = d0Var.f125577a;
                    g53.b.f75983c.getClass();
                    String strH = vb.h.h(i15, "line-layer-source-" + g53.b.a.b(), "-");
                    LineString lineStringFromLngLats = LineString.fromLngLats(p.j((List) obj4));
                    GeoJsonSource.Builder builder = new GeoJsonSource.Builder(strH);
                    lineStringFromLngLats.getClass();
                    GeoJsonSource geoJsonSourceBuild = GeoJsonSource.Builder.geometry$default(builder, lineStringFromLngLats, null, 2, null).lineMetrics(true).build();
                    SourceUtils.addSource(style, geoJsonSourceBuild);
                    list2.add(geoJsonSourceBuild);
                    String strH2 = vb.h.h(i15, "line-layer-" + g53.b.a.b(), "-");
                    LineLayer lineLayer = new LineLayer(strH2, strH);
                    ie2.p pVar = qVar.f50328a;
                    ie2.p pVar2 = qVar.f50328a;
                    double d14 = pVar.f93155c;
                    lineLayer.lineCap(LineCap.ROUND);
                    lineLayer.lineJoin(LineJoin.ROUND);
                    lineLayer.lineWidth(d14);
                    MapboxMap mapboxMapB0 = d0Var.f125578b.b0();
                    if (mapboxMapB0 != null) {
                        mapboxMapB0.addInteraction(ClickInteraction.Companion.layer$default(ClickInteraction.INSTANCE, strH2, null, null, new m92.f(d0Var, 12), 6, null));
                    }
                    ArrayList arrayList = d0Var.f125582f;
                    if (!pVar2.f93165m.isEmpty()) {
                        if (Boolean.valueOf(pVar2.f93167o).equals(Boolean.TRUE)) {
                            d0Var.l(lineLayer);
                            List listK = d0Var.k(arrayList, list);
                            r0 r0Var = new r0();
                            r0Var.f105810a = ((o13.p) h0.b0(listK)).f128595b;
                            lineLayer.lineGradient(Expression.INSTANCE.step(new ml0.e(16, listK, r0Var)));
                        } else {
                            d0Var.l(lineLayer);
                            lineLayer.lineGradient(Expression.INSTANCE.interpolate(new ml0.e(15, d0Var.k(arrayList, list), d0Var)));
                        }
                    }
                    if (!pVar2.f93157e.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (ie2.o oVar : pVar2.f93157e) {
                            if (oVar instanceof ie2.o.a) {
                                arrayList2.add(Double.valueOf(((ie2.o.a) oVar).f93151a));
                            }
                        }
                        d0Var.l(lineLayer);
                        lineLayer.lineDasharray(arrayList2);
                        lineLayer.lineColor(pVar2.f93156d);
                    }
                    int i18 = pVar2.f93156d;
                    d0Var.l(lineLayer);
                    lineLayer.lineColor(i18);
                    lineLayer.visibility(pVar2.f93160h ? Visibility.VISIBLE : Visibility.NONE);
                    LayerUtils.addPersistentLayer(style, lineLayer, new LayerPosition(null, "MAPBOX_POINT_ANNOTATION_MANAGER_LAYER", null));
                    list3.add(lineLayer);
                    i15 = i17;
                }
                return;
            default:
                i53.c cVar = (i53.c) list;
                Context context = (Context) obj2;
                i53.c cVar2 = (i53.c) obj;
                CameraState cameraState = ((MapViewportState) obj3).getCameraState();
                oe2.f0.f(style, cVar, cameraState != null ? cameraState.getZoom() : 10.5d);
                oe2.f0.e(context, style, cVar2, false);
                return;
        }
    }

    public /* synthetic */ b0(List list, d0 d0Var, List list2, List list3) {
        this.f125565b = list;
        this.f125568e = d0Var;
        this.f125566c = list2;
        this.f125567d = list3;
    }
}
