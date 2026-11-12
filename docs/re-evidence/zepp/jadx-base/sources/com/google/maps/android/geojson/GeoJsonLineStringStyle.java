package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.kml.KmlLineString;
import java.util.Arrays;
import java.util.Observable;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonLineStringStyle extends Observable implements d {
    private static final String[] b = {KmlLineString.GEOMETRY_TYPE, "MultiLineString", "GeometryCollection"};
    private final PolylineOptions a = new PolylineOptions();

    private void a() {
        setChanged();
        notifyObservers();
    }

    public int getColor() {
        return this.a.getColor();
    }

    @Override // com.google.maps.android.geojson.d
    public String[] getGeometryType() {
        return b;
    }

    public float getWidth() {
        return this.a.getWidth();
    }

    public float getZIndex() {
        return this.a.getZIndex();
    }

    public boolean isClickable() {
        return this.a.isClickable();
    }

    public boolean isGeodesic() {
        return this.a.isGeodesic();
    }

    @Override // com.google.maps.android.geojson.d
    public boolean isVisible() {
        return this.a.isVisible();
    }

    public void setClickable(boolean z) {
        this.a.clickable(z);
        a();
    }

    public void setColor(int i) {
        this.a.color(i);
        a();
    }

    public void setGeodesic(boolean z) {
        this.a.geodesic(z);
        a();
    }

    @Override // com.google.maps.android.geojson.d
    public void setVisible(boolean z) {
        this.a.visible(z);
        a();
    }

    public void setWidth(float f) {
        this.a.width(f);
        a();
    }

    public void setZIndex(float f) {
        this.a.zIndex(f);
        a();
    }

    public PolylineOptions toPolylineOptions() {
        PolylineOptions polylineOptions = new PolylineOptions();
        polylineOptions.color(this.a.getColor());
        polylineOptions.clickable(this.a.isClickable());
        polylineOptions.geodesic(this.a.isGeodesic());
        polylineOptions.visible(this.a.isVisible());
        polylineOptions.width(this.a.getWidth());
        polylineOptions.zIndex(this.a.getZIndex());
        return polylineOptions;
    }

    public String toString() {
        return "LineStringStyle{\n geometry type=" + Arrays.toString(b) + ",\n color=" + getColor() + ",\n clickable=" + isClickable() + ",\n geodesic=" + isGeodesic() + ",\n visible=" + isVisible() + ",\n width=" + getWidth() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
