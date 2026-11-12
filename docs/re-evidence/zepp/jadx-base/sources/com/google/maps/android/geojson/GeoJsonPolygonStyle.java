package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.kml.KmlPolygon;
import java.util.Arrays;
import java.util.Observable;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonPolygonStyle extends Observable implements d {
    private static final String[] b = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};
    private final PolygonOptions a = new PolygonOptions();

    private void a() {
        setChanged();
        notifyObservers();
    }

    public int getFillColor() {
        return this.a.getFillColor();
    }

    @Override // com.google.maps.android.geojson.d
    public String[] getGeometryType() {
        return b;
    }

    public int getStrokeColor() {
        return this.a.getStrokeColor();
    }

    public float getStrokeWidth() {
        return this.a.getStrokeWidth();
    }

    public float getZIndex() {
        return this.a.getZIndex();
    }

    public boolean isGeodesic() {
        return this.a.isGeodesic();
    }

    @Override // com.google.maps.android.geojson.d
    public boolean isVisible() {
        return this.a.isVisible();
    }

    public void setFillColor(int i) {
        this.a.fillColor(i);
        a();
    }

    public void setGeodesic(boolean z) {
        this.a.geodesic(z);
        a();
    }

    public void setStrokeColor(int i) {
        this.a.strokeColor(i);
        a();
    }

    public void setStrokeWidth(float f) {
        this.a.strokeWidth(f);
        a();
    }

    @Override // com.google.maps.android.geojson.d
    public void setVisible(boolean z) {
        this.a.visible(z);
        a();
    }

    public void setZIndex(float f) {
        this.a.zIndex(f);
        a();
    }

    public PolygonOptions toPolygonOptions() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.fillColor(this.a.getFillColor());
        polygonOptions.geodesic(this.a.isGeodesic());
        polygonOptions.strokeColor(this.a.getStrokeColor());
        polygonOptions.strokeWidth(this.a.getStrokeWidth());
        polygonOptions.visible(this.a.isVisible());
        polygonOptions.zIndex(this.a.getZIndex());
        return polygonOptions;
    }

    public String toString() {
        return "PolygonStyle{\n geometry type=" + Arrays.toString(b) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
