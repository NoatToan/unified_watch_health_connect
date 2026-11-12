package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonFeature extends Observable implements Observer {
    private final String a;
    private final LatLngBounds b;
    private final HashMap<String, String> c;
    private GeoJsonGeometry d;
    private GeoJsonPointStyle e;
    private GeoJsonLineStringStyle f;
    private GeoJsonPolygonStyle g;

    public GeoJsonFeature(GeoJsonGeometry geoJsonGeometry, String str, HashMap<String, String> map, LatLngBounds latLngBounds) {
        this.d = geoJsonGeometry;
        this.a = str;
        this.b = latLngBounds;
        if (map == null) {
            this.c = new HashMap<>();
        } else {
            this.c = map;
        }
    }

    private void a(d dVar) {
        if (this.d == null || !Arrays.asList(dVar.getGeometryType()).contains(this.d.getType())) {
            return;
        }
        setChanged();
        notifyObservers();
    }

    public LatLngBounds getBoundingBox() {
        return this.b;
    }

    public GeoJsonGeometry getGeometry() {
        return this.d;
    }

    public String getId() {
        return this.a;
    }

    public GeoJsonLineStringStyle getLineStringStyle() {
        return this.f;
    }

    public GeoJsonPointStyle getPointStyle() {
        return this.e;
    }

    public GeoJsonPolygonStyle getPolygonStyle() {
        return this.g;
    }

    public String getProperty(String str) {
        return this.c.get(str);
    }

    public Iterable<String> getPropertyKeys() {
        return this.c.keySet();
    }

    public boolean hasGeometry() {
        return this.d != null;
    }

    public boolean hasProperty(String str) {
        return this.c.containsKey(str);
    }

    public String removeProperty(String str) {
        return this.c.remove(str);
    }

    public void setGeometry(GeoJsonGeometry geoJsonGeometry) {
        this.d = geoJsonGeometry;
        setChanged();
        notifyObservers();
    }

    public void setLineStringStyle(GeoJsonLineStringStyle geoJsonLineStringStyle) {
        if (geoJsonLineStringStyle == null) {
            throw new IllegalArgumentException("Line string style cannot be null");
        }
        GeoJsonLineStringStyle geoJsonLineStringStyle2 = this.f;
        if (geoJsonLineStringStyle2 != null) {
            geoJsonLineStringStyle2.deleteObserver(this);
        }
        this.f = geoJsonLineStringStyle;
        geoJsonLineStringStyle.addObserver(this);
        a(this.f);
    }

    public void setPointStyle(GeoJsonPointStyle geoJsonPointStyle) {
        if (geoJsonPointStyle == null) {
            throw new IllegalArgumentException("Point style cannot be null");
        }
        GeoJsonPointStyle geoJsonPointStyle2 = this.e;
        if (geoJsonPointStyle2 != null) {
            geoJsonPointStyle2.deleteObserver(this);
        }
        this.e = geoJsonPointStyle;
        geoJsonPointStyle.addObserver(this);
        a(this.e);
    }

    public void setPolygonStyle(GeoJsonPolygonStyle geoJsonPolygonStyle) {
        if (geoJsonPolygonStyle == null) {
            throw new IllegalArgumentException("Polygon style cannot be null");
        }
        GeoJsonPolygonStyle geoJsonPolygonStyle2 = this.g;
        if (geoJsonPolygonStyle2 != null) {
            geoJsonPolygonStyle2.deleteObserver(this);
        }
        this.g = geoJsonPolygonStyle;
        geoJsonPolygonStyle.addObserver(this);
        a(this.g);
    }

    public String setProperty(String str, String str2) {
        return this.c.put(str, str2);
    }

    public String toString() {
        return "Feature{\n bounding box=" + this.b + ",\n geometry=" + this.d + ",\n point style=" + this.e + ",\n line string style=" + this.f + ",\n polygon style=" + this.g + ",\n id=" + this.a + ",\n properties=" + this.c + "\n}\n";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof d) {
            a((d) observable);
        }
    }
}
