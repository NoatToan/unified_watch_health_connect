package com.mapbox.geojson.gson;

import androidx.annotation.Keep;
import com.google.gson.GsonBuilder;
import com.mapbox.geojson.Geometry;
import com.mapbox.geojson.GeometryAdapterFactory;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class GeometryGeoJson {
    public static Geometry fromJson(String str) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(GeoJsonAdapterFactory.create());
        gsonBuilder.registerTypeAdapterFactory(GeometryAdapterFactory.create());
        return (Geometry) gsonBuilder.create().fromJson(str, Geometry.class);
    }
}
