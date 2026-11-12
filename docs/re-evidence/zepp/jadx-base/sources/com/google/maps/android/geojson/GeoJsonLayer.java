package com.google.maps.android.geojson;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonLayer {
    private final com.google.maps.android.geojson.c a;
    private LatLngBounds b;

    public interface GeoJsonOnFeatureClickListener {
        void onFeatureClick(GeoJsonFeature geoJsonFeature);
    }

    public class a implements GoogleMap.OnPolygonClickListener {
        public final /* synthetic */ GeoJsonOnFeatureClickListener a;

        public a(GeoJsonOnFeatureClickListener geoJsonOnFeatureClickListener) {
            this.a = geoJsonOnFeatureClickListener;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
        public void onPolygonClick(Polygon polygon) {
            this.a.onFeatureClick(GeoJsonLayer.this.getFeature(polygon));
        }
    }

    public class b implements GoogleMap.OnMarkerClickListener {
        public final /* synthetic */ GeoJsonOnFeatureClickListener a;

        public b(GeoJsonOnFeatureClickListener geoJsonOnFeatureClickListener) {
            this.a = geoJsonOnFeatureClickListener;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
        public boolean onMarkerClick(Marker marker) {
            this.a.onFeatureClick(GeoJsonLayer.this.getFeature(marker));
            return false;
        }
    }

    public class c implements GoogleMap.OnPolylineClickListener {
        public final /* synthetic */ GeoJsonOnFeatureClickListener a;

        public c(GeoJsonOnFeatureClickListener geoJsonOnFeatureClickListener) {
            this.a = geoJsonOnFeatureClickListener;
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
        public void onPolylineClick(Polyline polyline) {
            this.a.onFeatureClick(GeoJsonLayer.this.getFeature(polyline));
        }
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("GeoJSON file cannot be null");
        }
        this.b = null;
        com.google.maps.android.geojson.b bVar = new com.google.maps.android.geojson.b(jSONObject);
        this.b = bVar.i();
        HashMap map = new HashMap();
        Iterator<GeoJsonFeature> it2 = bVar.j().iterator();
        while (it2.hasNext()) {
            map.put(it2.next(), null);
        }
        this.a = new com.google.maps.android.geojson.c(googleMap, map);
    }

    private static JSONObject a(InputStream inputStream) throws JSONException, IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    return new JSONObject(sb.toString());
                }
                sb.append(line);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        }
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        this.a.a(geoJsonFeature);
    }

    public void addLayerToMap() {
        this.a.d();
    }

    public LatLngBounds getBoundingBox() {
        return this.b;
    }

    public GeoJsonLineStringStyle getDefaultLineStringStyle() {
        return this.a.k();
    }

    public GeoJsonPointStyle getDefaultPointStyle() {
        return this.a.l();
    }

    public GeoJsonPolygonStyle getDefaultPolygonStyle() {
        return this.a.m();
    }

    public GeoJsonFeature getFeature(Polygon polygon) {
        return this.a.n(polygon);
    }

    public Iterable<GeoJsonFeature> getFeatures() {
        return this.a.o();
    }

    public GoogleMap getMap() {
        return this.a.p();
    }

    public boolean isLayerOnMap() {
        return this.a.q();
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature == null) {
            throw new IllegalArgumentException("Feature cannot be null");
        }
        this.a.t(geoJsonFeature);
    }

    public void removeLayerFromMap() {
        this.a.v();
    }

    public void setMap(GoogleMap googleMap) {
        this.a.x(googleMap);
    }

    public void setOnFeatureClickListener(GeoJsonOnFeatureClickListener geoJsonOnFeatureClickListener) {
        GoogleMap map = getMap();
        map.setOnPolygonClickListener(new a(geoJsonOnFeatureClickListener));
        map.setOnMarkerClickListener(new b(geoJsonOnFeatureClickListener));
        map.setOnPolylineClickListener(new c(geoJsonOnFeatureClickListener));
    }

    public String toString() {
        return "Collection{\n Bounding box=" + this.b + "\n}\n";
    }

    public GeoJsonFeature getFeature(Polyline polyline) {
        return this.a.n(polyline);
    }

    public GeoJsonFeature getFeature(Marker marker) {
        return this.a.n(marker);
    }

    public GeoJsonLayer(GoogleMap googleMap, int i, Context context) throws JSONException, IOException {
        this(googleMap, a(context.getResources().openRawResource(i)));
    }
}
