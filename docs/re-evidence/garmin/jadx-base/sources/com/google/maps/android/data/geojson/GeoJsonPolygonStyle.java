package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.PatternItem;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.data.Style;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPolygonStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {KmlPolygon.GEOMETRY_TYPE, "MultiPolygon", "GeometryCollection"};

    public GeoJsonPolygonStyle() {
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.clickable(true);
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public int getFillColor() {
        return this.mPolygonOptions.getFillColor();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public int getStrokeColor() {
        return this.mPolygonOptions.getStrokeColor();
    }

    public int getStrokeJointType() {
        return this.mPolygonOptions.getStrokeJointType();
    }

    public List<PatternItem> getStrokePattern() {
        return this.mPolygonOptions.getStrokePattern();
    }

    public float getStrokeWidth() {
        return this.mPolygonOptions.getStrokeWidth();
    }

    public float getZIndex() {
        return this.mPolygonOptions.getZIndex();
    }

    public boolean isClickable() {
        return this.mPolygonOptions.isClickable();
    }

    public boolean isGeodesic() {
        return this.mPolygonOptions.isGeodesic();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mPolygonOptions.isVisible();
    }

    public void setClickable(boolean z14) {
        this.mPolygonOptions.clickable(z14);
        styleChanged();
    }

    public void setFillColor(int i14) {
        setPolygonFillColor(i14);
        styleChanged();
    }

    public void setGeodesic(boolean z14) {
        this.mPolygonOptions.geodesic(z14);
        styleChanged();
    }

    public void setStrokeColor(int i14) {
        this.mPolygonOptions.strokeColor(i14);
        styleChanged();
    }

    public void setStrokeJointType(int i14) {
        this.mPolygonOptions.strokeJointType(i14);
        styleChanged();
    }

    public void setStrokePattern(List<PatternItem> list) {
        this.mPolygonOptions.strokePattern(list);
        styleChanged();
    }

    public void setStrokeWidth(float f14) {
        setPolygonStrokeWidth(f14);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z14) {
        this.mPolygonOptions.visible(z14);
        styleChanged();
    }

    public void setZIndex(float f14) {
        this.mPolygonOptions.zIndex(f14);
        styleChanged();
    }

    public PolygonOptions toPolygonOptions() {
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.fillColor(this.mPolygonOptions.getFillColor());
        polygonOptions.geodesic(this.mPolygonOptions.isGeodesic());
        polygonOptions.strokeColor(this.mPolygonOptions.getStrokeColor());
        polygonOptions.strokeJointType(this.mPolygonOptions.getStrokeJointType());
        polygonOptions.strokePattern(this.mPolygonOptions.getStrokePattern());
        polygonOptions.strokeWidth(this.mPolygonOptions.getStrokeWidth());
        polygonOptions.visible(this.mPolygonOptions.isVisible());
        polygonOptions.zIndex(this.mPolygonOptions.getZIndex());
        polygonOptions.clickable(this.mPolygonOptions.isClickable());
        return polygonOptions;
    }

    public String toString() {
        return "PolygonStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n fill color=" + getFillColor() + ",\n geodesic=" + isGeodesic() + ",\n stroke color=" + getStrokeColor() + ",\n stroke joint type=" + getStrokeJointType() + ",\n stroke pattern=" + getStrokePattern() + ",\n stroke width=" + getStrokeWidth() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + ",\n clickable=" + isClickable() + "\n}\n";
    }
}
