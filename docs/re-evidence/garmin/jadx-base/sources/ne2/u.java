package ne2;

import com.google.android.gms.maps.model.LatLng;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.maps.Style;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.layers.LayerUtils;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayer;
import com.mapbox.maps.extension.style.layers.generated.SymbolLayerKt;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.generated.GeoJsonSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class u implements Style.OnStyleLoaded {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125724a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f125725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f125726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f125727d;

    public /* synthetic */ u(SymbolLayer symbolLayer, s sVar, int i14) {
        this.f125727d = symbolLayer;
        this.f125725b = sVar;
        this.f125726c = i14;
    }

    @Override // com.mapbox.maps.Style.OnStyleLoaded
    public final void onStyleLoaded(Style style) {
        switch (this.f125724a) {
            case 0:
                List list = (List) this.f125727d;
                style.getClass();
                s sVar = this.f125725b;
                HashMap<Integer, StyleContract.StyleLayerExtension> map = sVar.I;
                list.getClass();
                g53.b.f75983c.getClass();
                String str = "symbol-layer-source-" + g53.b.a.b();
                int i14 = this.f125726c;
                String strH = vb.h.h(i14, str, "-");
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    LatLng latLng = ((com.garmin.android.library.mapsdkadapter.p) it.next()).f50327a.f50309a.f50283a;
                    Feature featureFromGeometry = Feature.fromGeometry(Point.fromLngLat(latLng.longitude, latLng.latitude));
                    featureFromGeometry.addStringProperty("icon-key", "unclustered");
                    arrayList.add(featureFromGeometry);
                }
                FeatureCollection featureCollectionFromFeatures = FeatureCollection.fromFeatures(arrayList);
                GeoJsonSource.Builder builder = new GeoJsonSource.Builder(strH);
                featureCollectionFromFeatures.getClass();
                SourceUtils.addSource(style, GeoJsonSource.Builder.featureCollection$default(builder, featureCollectionFromFeatures, null, 2, null).cluster(true).lineMetrics(true).build());
                g53.b.f75983c.getClass();
                SymbolLayer symbolLayer = SymbolLayerKt.symbolLayer(vb.h.h(i14, "symbol-layer-" + g53.b.a.b(), "-"), strH, new mh1.x(v.c(sVar, i14), 24));
                LayerUtils.addLayer(style, symbolLayer);
                map.put(Integer.valueOf(i14), symbolLayer);
                SymbolLayer symbolLayer2 = SymbolLayerKt.symbolLayer(vb.h.h(i14, "unclustered-layer-" + g53.b.a.b(), "-"), strH, new n63.w(22));
                LayerUtils.addLayer(style, symbolLayer2);
                map.put(Integer.valueOf(i14), symbolLayer2);
                sVar.F.addAll(list);
                break;
            default:
                SymbolLayer symbolLayer3 = (SymbolLayer) this.f125727d;
                style.getClass();
                if (style.styleLayerExists(symbolLayer3.getLayerId())) {
                    style.removeStyleLayer(symbolLayer3.getLayerId());
                    this.f125725b.I.remove(Integer.valueOf(this.f125726c));
                }
                break;
        }
    }

    public /* synthetic */ u(s sVar, List list, int i14) {
        this.f125725b = sVar;
        this.f125727d = list;
        this.f125726c = i14;
    }
}
