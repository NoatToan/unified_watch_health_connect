package com.mapbox.turf;

import am.j;
import com.mapbox.geojson.Feature;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.GeoJson;
import com.mapbox.geojson.Point;
import p6.b;

/* JADX INFO: loaded from: classes3.dex */
public final class TurfAssertions {
    private TurfAssertions() {
    }

    public static void collectionOf(FeatureCollection featureCollection, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            throw new TurfException("collectionOf() requires a name");
        }
        if (featureCollection == null || !featureCollection.type().equals("FeatureCollection") || featureCollection.features() == null) {
            throw new TurfException(j.m("Invalid input to ", str2, ", FeatureCollection required"));
        }
        for (Feature feature : featureCollection.features()) {
            if (feature == null || !feature.type().equals("Feature") || feature.geometry() == null) {
                throw new TurfException(j.m("Invalid input to ", str2, ", Feature with geometry required"));
            }
            if (feature.geometry() == null || !feature.geometry().type().equals(str)) {
                String strType = feature.geometry().type();
                StringBuilder sbI = b.i("Invalid input to ", str2, ": must be a ", str, ", given ");
                sbI.append(strType);
                throw new TurfException(sbI.toString());
            }
        }
    }

    public static void featureOf(Feature feature, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            throw new TurfException(".featureOf() requires a name");
        }
        if (feature == null || !feature.type().equals("Feature") || feature.geometry() == null) {
            throw new TurfException(j.m("Invalid input to ", str2, ", Feature with geometry required"));
        }
        if (feature.geometry() == null || !feature.geometry().type().equals(str)) {
            String strType = feature.geometry().type();
            StringBuilder sbI = b.i("Invalid input to ", str2, ": must be a ", str, ", given ");
            sbI.append(strType);
            throw new TurfException(sbI.toString());
        }
    }

    public static void geojsonType(GeoJson geoJson, String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            throw new TurfException("Type and name required");
        }
        if (geoJson == null || !geoJson.type().equals(str)) {
            StringBuilder sbI = b.i("Invalid input to ", str2, ": must be a ", str, ", given ");
            sbI.append(geoJson != null ? geoJson.type() : " null");
            throw new TurfException(sbI.toString());
        }
    }

    @Deprecated
    public static Point getCoord(Feature feature) {
        return TurfMeta.getCoord(feature);
    }
}
