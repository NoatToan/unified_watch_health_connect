package com.google.maps.android.geojson;

import android.util.Log;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
class b {
    private static final String d = "GeoJsonParser";
    private static final String e = "Feature";
    private static final String f = "geometry";
    private static final String g = "id";
    private static final String h = "FeatureCollection";
    private static final String i = "features";
    private static final String j = "coordinates";
    private static final String k = "GeometryCollection";
    private static final String l = "geometries";
    private static final String m = "bbox";
    private static final String n = "properties";
    private static final String o = "Point";
    private static final String p = "MultiPoint";
    private static final String q = "LineString";
    private static final String r = "MultiLineString";
    private static final String s = "Polygon";
    private static final String t = "MultiPolygon";
    private final JSONObject a;
    private final ArrayList<GeoJsonFeature> b = new ArrayList<>();
    private LatLngBounds c = null;

    public b(JSONObject jSONObject) {
        this.a = jSONObject;
        r();
    }

    private static GeoJsonGeometry a(String str, JSONArray jSONArray) throws JSONException {
        if (str.equals("Point")) {
            return g(jSONArray);
        }
        if (str.equals(p)) {
            return e(jSONArray);
        }
        if (str.equals("LineString")) {
            return c(jSONArray);
        }
        if (str.equals(r)) {
            return d(jSONArray);
        }
        if (str.equals("Polygon")) {
            return h(jSONArray);
        }
        if (str.equals(t)) {
            return f(jSONArray);
        }
        if (str.equals(k)) {
            return b(jSONArray);
        }
        return null;
    }

    private static GeoJsonGeometryCollection b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            GeoJsonGeometry geoJsonGeometryS = s(jSONArray.getJSONObject(i2));
            if (geoJsonGeometryS != null) {
                arrayList.add(geoJsonGeometryS);
            }
        }
        return new GeoJsonGeometryCollection(arrayList);
    }

    private static GeoJsonLineString c(JSONArray jSONArray) throws JSONException {
        return new GeoJsonLineString(n(jSONArray));
    }

    private static GeoJsonMultiLineString d(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(c(jSONArray.getJSONArray(i2)));
        }
        return new GeoJsonMultiLineString(arrayList);
    }

    private static GeoJsonMultiPoint e(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(g(jSONArray.getJSONArray(i2)));
        }
        return new GeoJsonMultiPoint(arrayList);
    }

    private static GeoJsonMultiPolygon f(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(h(jSONArray.getJSONArray(i2)));
        }
        return new GeoJsonMultiPolygon(arrayList);
    }

    private static GeoJsonPoint g(JSONArray jSONArray) throws JSONException {
        return new GeoJsonPoint(m(jSONArray));
    }

    private static GeoJsonPolygon h(JSONArray jSONArray) throws JSONException {
        return new GeoJsonPolygon(o(jSONArray));
    }

    private static boolean k(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    private static LatLngBounds l(JSONArray jSONArray) throws JSONException {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    private static LatLng m(JSONArray jSONArray) throws JSONException {
        return new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0));
    }

    private static ArrayList<LatLng> n(JSONArray jSONArray) throws JSONException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(m(jSONArray.getJSONArray(i2)));
        }
        return arrayList;
    }

    private static ArrayList<ArrayList<LatLng>> o(JSONArray jSONArray) throws JSONException {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(n(jSONArray.getJSONArray(i2)));
        }
        return arrayList;
    }

    private static GeoJsonFeature p(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            LatLngBounds latLngBoundsL = jSONObject.has(m) ? l(jSONObject.getJSONArray(m)) : null;
            GeoJsonGeometry geoJsonGeometryS = (!jSONObject.has(f) || jSONObject.isNull(f)) ? null : s(jSONObject.getJSONObject(f));
            if (jSONObject.has("properties") && !jSONObject.isNull("properties")) {
                map = u(jSONObject.getJSONObject("properties"));
            }
            return new GeoJsonFeature(geoJsonGeometryS, string, map, latLngBoundsL);
        } catch (JSONException unused) {
            Log.w(d, "Feature could not be successfully parsed " + jSONObject.toString());
            return null;
        }
    }

    private ArrayList<GeoJsonFeature> q(JSONObject jSONObject) {
        ArrayList<GeoJsonFeature> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            if (jSONObject.has(m)) {
                this.c = l(jSONObject.getJSONArray(m));
            }
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                    if (jSONObject2.getString("type").equals(e)) {
                        GeoJsonFeature geoJsonFeatureP = p(jSONObject2);
                        if (geoJsonFeatureP != null) {
                            arrayList.add(geoJsonFeatureP);
                        } else {
                            Log.w(d, "Index of Feature in Feature Collection that could not be created: " + i2);
                        }
                    }
                } catch (JSONException unused) {
                    Log.w(d, "Index of Feature in Feature Collection that could not be created: " + i2);
                }
            }
            return arrayList;
        } catch (JSONException unused2) {
            Log.w(d, "Feature Collection could not be created.");
            return arrayList;
        }
    }

    private void r() {
        try {
            String string = this.a.getString("type");
            if (string.equals(e)) {
                GeoJsonFeature geoJsonFeatureP = p(this.a);
                if (geoJsonFeatureP != null) {
                    this.b.add(geoJsonFeatureP);
                }
            } else if (string.equals(h)) {
                this.b.addAll(q(this.a));
            } else if (k(string)) {
                GeoJsonFeature geoJsonFeatureT = t(this.a);
                if (geoJsonFeatureT != null) {
                    this.b.add(geoJsonFeatureT);
                }
            } else {
                Log.w(d, "GeoJSON file could not be parsed.");
            }
        } catch (JSONException unused) {
            Log.w(d, "GeoJSON file could not be parsed.");
        }
    }

    private static GeoJsonGeometry s(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            String string = jSONObject.getString("type");
            if (!string.equals(k)) {
                if (k(string)) {
                    jSONArray = jSONObject.getJSONArray(j);
                }
                return null;
            }
            jSONArray = jSONObject.getJSONArray(l);
            return a(string, jSONArray);
        } catch (JSONException unused) {
        }
    }

    private static GeoJsonFeature t(JSONObject jSONObject) {
        GeoJsonGeometry geoJsonGeometryS = s(jSONObject);
        if (geoJsonGeometryS != null) {
            return new GeoJsonFeature(geoJsonGeometryS, null, new HashMap(), null);
        }
        Log.w(d, "Geometry could not be parsed");
        return null;
    }

    private static HashMap<String, String> u(JSONObject jSONObject) throws JSONException {
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return map;
    }

    public LatLngBounds i() {
        return this.c;
    }

    public ArrayList<GeoJsonFeature> j() {
        return this.b;
    }
}
