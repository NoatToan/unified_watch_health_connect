package com.google.maps.android.data.geojson;

import com.garmin.android.gncs.NotificationConstants;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.maps.android.data.Geometry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonParser {
    private static final String BOUNDING_BOX = "bbox";
    private static final String FEATURE = "Feature";
    private static final String FEATURE_COLLECTION = "FeatureCollection";
    private static final String FEATURE_COLLECTION_ARRAY = "features";
    private static final String FEATURE_GEOMETRY = "geometry";
    private static final String FEATURE_ID = "id";
    private static final String GEOMETRY_COLLECTION = "GeometryCollection";
    private static final String GEOMETRY_COLLECTION_ARRAY = "geometries";
    private static final String GEOMETRY_COORDINATES_ARRAY = "coordinates";
    private static final String LINESTRING = "LineString";
    private static final String LOG_TAG = "GeoJsonParser";
    private static final String MULTILINESTRING = "MultiLineString";
    private static final String MULTIPOINT = "MultiPoint";
    private static final String MULTIPOLYGON = "MultiPolygon";
    private static final String POINT = "Point";
    private static final String POLYGON = "Polygon";
    private static final String PROPERTIES = "properties";
    private final JSONObject mGeoJsonFile;
    private final ArrayList<GeoJsonFeature> mGeoJsonFeatures = new ArrayList<>();
    private LatLngBounds mBoundingBox = null;

    public static class LatLngAlt {
        public final Double altitude;
        public final LatLng latLng;

        public LatLngAlt(LatLng latLng, Double d14) {
            this.latLng = latLng;
            this.altitude = d14;
        }
    }

    public GeoJsonParser(JSONObject jSONObject) {
        this.mGeoJsonFile = jSONObject;
        parseGeoJson();
    }

    private static Geometry createGeometry(String str, JSONArray jSONArray) {
        str.getClass();
        switch (str) {
            case "MultiPolygon":
                return createMultiPolygon(jSONArray);
            case "MultiPoint":
                return createMultiPoint(jSONArray);
            case "MultiLineString":
                return createMultiLineString(jSONArray);
            case "Point":
                return createPoint(jSONArray);
            case "Polygon":
                return createPolygon(jSONArray);
            case "LineString":
                return createLineString(jSONArray);
            case "GeometryCollection":
                return createGeometryCollection(jSONArray);
            default:
                return null;
        }
    }

    private static GeoJsonGeometryCollection createGeometryCollection(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            Geometry geometry = parseGeometry(jSONArray.getJSONObject(i14));
            if (geometry != null) {
                arrayList.add(geometry);
            }
        }
        return new GeoJsonGeometryCollection(arrayList);
    }

    private static GeoJsonLineString createLineString(JSONArray jSONArray) {
        ArrayList<LatLngAlt> coordinatesArray = parseCoordinatesArray(jSONArray);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (LatLngAlt latLngAlt : coordinatesArray) {
            arrayList.add(latLngAlt.latLng);
            Double d14 = latLngAlt.altitude;
            if (d14 != null) {
                arrayList2.add(d14);
            }
        }
        return new GeoJsonLineString(arrayList, arrayList2);
    }

    private static GeoJsonMultiLineString createMultiLineString(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            arrayList.add(createLineString(jSONArray.getJSONArray(i14)));
        }
        return new GeoJsonMultiLineString(arrayList);
    }

    private static GeoJsonMultiPoint createMultiPoint(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            arrayList.add(createPoint(jSONArray.getJSONArray(i14)));
        }
        return new GeoJsonMultiPoint(arrayList);
    }

    private static GeoJsonMultiPolygon createMultiPolygon(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            arrayList.add(createPolygon(jSONArray.getJSONArray(i14)));
        }
        return new GeoJsonMultiPolygon(arrayList);
    }

    private static GeoJsonPoint createPoint(JSONArray jSONArray) {
        LatLngAlt coordinate = parseCoordinate(jSONArray);
        return new GeoJsonPoint(coordinate.latLng, coordinate.altitude);
    }

    private static GeoJsonPolygon createPolygon(JSONArray jSONArray) {
        return new GeoJsonPolygon(parseCoordinatesArrays(jSONArray));
    }

    private static boolean isGeometry(String str) {
        return str.matches("Point|MultiPoint|LineString|MultiLineString|Polygon|MultiPolygon|GeometryCollection");
    }

    private static LatLngBounds parseBoundingBox(JSONArray jSONArray) {
        return new LatLngBounds(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), new LatLng(jSONArray.getDouble(3), jSONArray.getDouble(2)));
    }

    private static LatLngAlt parseCoordinate(JSONArray jSONArray) {
        return new LatLngAlt(new LatLng(jSONArray.getDouble(1), jSONArray.getDouble(0)), jSONArray.length() < 3 ? null : Double.valueOf(jSONArray.getDouble(2)));
    }

    private static ArrayList<LatLngAlt> parseCoordinatesArray(JSONArray jSONArray) {
        ArrayList<LatLngAlt> arrayList = new ArrayList<>();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            arrayList.add(parseCoordinate(jSONArray.getJSONArray(i14)));
        }
        return arrayList;
    }

    private static ArrayList<ArrayList<LatLng>> parseCoordinatesArrays(JSONArray jSONArray) {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        for (int i14 = 0; i14 < jSONArray.length(); i14++) {
            ArrayList<LatLngAlt> coordinatesArray = parseCoordinatesArray(jSONArray.getJSONArray(i14));
            ArrayList<LatLng> arrayList2 = new ArrayList<>();
            Iterator<LatLngAlt> it = coordinatesArray.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().latLng);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    private static GeoJsonFeature parseFeature(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        try {
            String string = jSONObject.has("id") ? jSONObject.getString("id") : null;
            LatLngBounds boundingBox = jSONObject.has(BOUNDING_BOX) ? parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX)) : null;
            Geometry geometry = (!jSONObject.has(FEATURE_GEOMETRY) || jSONObject.isNull(FEATURE_GEOMETRY)) ? null : parseGeometry(jSONObject.getJSONObject(FEATURE_GEOMETRY));
            if (jSONObject.has("properties") && !jSONObject.isNull("properties")) {
                map = parseProperties(jSONObject.getJSONObject("properties"));
            }
            return new GeoJsonFeature(geometry, string, map, boundingBox);
        } catch (JSONException unused) {
            jSONObject.toString();
            return null;
        }
    }

    private ArrayList<GeoJsonFeature> parseFeatureCollection(JSONObject jSONObject) {
        GeoJsonFeature feature;
        ArrayList<GeoJsonFeature> arrayList = new ArrayList<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(FEATURE_COLLECTION_ARRAY);
            if (jSONObject.has(BOUNDING_BOX)) {
                this.mBoundingBox = parseBoundingBox(jSONObject.getJSONArray(BOUNDING_BOX));
            }
            for (int i14 = 0; i14 < jSONArray.length(); i14++) {
                try {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i14);
                    if (jSONObject2.getString(NotificationConstants.KEY_DATA_MIME_TYPE).equals(FEATURE) && (feature = parseFeature(jSONObject2)) != null) {
                        arrayList.add(feature);
                    }
                } catch (JSONException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
        return arrayList;
    }

    private void parseGeoJson() {
        GeoJsonFeature geometryToFeature;
        try {
            String string = this.mGeoJsonFile.getString(NotificationConstants.KEY_DATA_MIME_TYPE);
            if (string.equals(FEATURE)) {
                GeoJsonFeature feature = parseFeature(this.mGeoJsonFile);
                if (feature != null) {
                    this.mGeoJsonFeatures.add(feature);
                    return;
                }
                return;
            }
            if (string.equals(FEATURE_COLLECTION)) {
                this.mGeoJsonFeatures.addAll(parseFeatureCollection(this.mGeoJsonFile));
            } else {
                if (!isGeometry(string) || (geometryToFeature = parseGeometryToFeature(this.mGeoJsonFile)) == null) {
                    return;
                }
                this.mGeoJsonFeatures.add(geometryToFeature);
            }
        } catch (JSONException unused) {
        }
    }

    public static Geometry parseGeometry(JSONObject jSONObject) {
        JSONArray jSONArray;
        try {
            String string = jSONObject.getString(NotificationConstants.KEY_DATA_MIME_TYPE);
            if (!string.equals(GEOMETRY_COLLECTION)) {
                if (isGeometry(string)) {
                    jSONArray = jSONObject.getJSONArray(GEOMETRY_COORDINATES_ARRAY);
                }
                return null;
            }
            jSONArray = jSONObject.getJSONArray(GEOMETRY_COLLECTION_ARRAY);
            return createGeometry(string, jSONArray);
        } catch (JSONException unused) {
        }
    }

    private static GeoJsonFeature parseGeometryToFeature(JSONObject jSONObject) {
        Geometry geometry = parseGeometry(jSONObject);
        if (geometry != null) {
            return new GeoJsonFeature(geometry, null, new HashMap(), null);
        }
        return null;
    }

    private static HashMap<String, String> parseProperties(JSONObject jSONObject) {
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, jSONObject.isNull(next) ? null : jSONObject.getString(next));
        }
        return map;
    }

    public LatLngBounds getBoundingBox() {
        return this.mBoundingBox;
    }

    public ArrayList<GeoJsonFeature> getFeatures() {
        return this.mGeoJsonFeatures;
    }
}
