package com.google.maps.android.data.geojson;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.collections.GroundOverlayManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.PolygonManager;
import com.google.maps.android.collections.PolylineManager;
import com.google.maps.android.data.Feature;
import com.google.maps.android.data.Layer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonLayer extends Layer {
    private LatLngBounds mBoundingBox;

    public interface GeoJsonOnFeatureClickListener extends Layer.OnFeatureClickListener {
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        if (jSONObject == null) {
            h.s("GeoJSON file cannot be null");
            throw null;
        }
        this.mBoundingBox = null;
        GeoJsonParser geoJsonParser = new GeoJsonParser(jSONObject);
        this.mBoundingBox = geoJsonParser.getBoundingBox();
        HashMap map = new HashMap();
        Iterator<GeoJsonFeature> it = geoJsonParser.getFeatures().iterator();
        while (it.hasNext()) {
            map.put(it.next(), null);
        }
        storeRenderer(new GeoJsonRenderer(googleMap, map, markerManager, polygonManager, polylineManager, groundOverlayManager));
    }

    private static JSONObject createJsonFileObject(InputStream inputStream) throws IOException {
        StringBuilder sb3 = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return new JSONObject(sb3.toString());
            }
            sb3.append(line);
        }
    }

    public void addFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature != null) {
            super.addFeature((Feature) geoJsonFeature);
        } else {
            h.s("Feature cannot be null");
        }
    }

    @Override // com.google.maps.android.data.Layer
    public void addLayerToMap() {
        super.addGeoJsonToMap();
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    @Override // com.google.maps.android.data.Layer
    public Iterable<GeoJsonFeature> getFeatures() {
        return super.getFeatures();
    }

    public void removeFeature(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature != null) {
            super.removeFeature((Feature) geoJsonFeature);
        } else {
            h.s("Feature cannot be null");
        }
    }

    public String toString() {
        return "Collection{\n Bounding box=" + this.mBoundingBox + "\n}\n";
    }

    public GeoJsonLayer(GoogleMap googleMap, int i14, Context context, MarkerManager markerManager, PolygonManager polygonManager, PolylineManager polylineManager, GroundOverlayManager groundOverlayManager) {
        this(googleMap, createJsonFileObject(context.getResources().openRawResource(i14)), markerManager, polygonManager, polylineManager, groundOverlayManager);
    }

    public GeoJsonLayer(GoogleMap googleMap, JSONObject jSONObject) {
        this(googleMap, jSONObject, null, null, null, null);
    }

    public GeoJsonLayer(GoogleMap googleMap, int i14, Context context) {
        this(googleMap, createJsonFileObject(context.getResources().openRawResource(i14)), null, null, null, null);
    }
}
