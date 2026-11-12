package com.google.maps.android.data.geojson;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.data.Style;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class GeoJsonPointStyle extends Style implements GeoJsonStyle {
    private static final String[] GEOMETRY_TYPE = {"Point", "MultiPoint", "GeometryCollection"};

    public GeoJsonPointStyle() {
        this.mMarkerOptions = new MarkerOptions();
    }

    private void styleChanged() {
        setChanged();
        notifyObservers();
    }

    public float getAlpha() {
        return this.mMarkerOptions.getAlpha();
    }

    public float getAnchorU() {
        return this.mMarkerOptions.getAnchorU();
    }

    public float getAnchorV() {
        return this.mMarkerOptions.getAnchorV();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public String[] getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public BitmapDescriptor getIcon() {
        return this.mMarkerOptions.getIcon();
    }

    public float getInfoWindowAnchorU() {
        return this.mMarkerOptions.getInfoWindowAnchorU();
    }

    public float getInfoWindowAnchorV() {
        return this.mMarkerOptions.getInfoWindowAnchorV();
    }

    @Override // com.google.maps.android.data.Style
    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public String getSnippet() {
        return this.mMarkerOptions.getSnippet();
    }

    public String getTitle() {
        return this.mMarkerOptions.getTitle();
    }

    public float getZIndex() {
        return this.mMarkerOptions.getZIndex();
    }

    public boolean isDraggable() {
        return this.mMarkerOptions.isDraggable();
    }

    public boolean isFlat() {
        return this.mMarkerOptions.isFlat();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public boolean isVisible() {
        return this.mMarkerOptions.isVisible();
    }

    public void setAlpha(float f14) {
        this.mMarkerOptions.alpha(f14);
        styleChanged();
    }

    public void setAnchor(float f14, float f15) {
        setMarkerHotSpot(f14, f15, "fraction", "fraction");
        styleChanged();
    }

    public void setDraggable(boolean z14) {
        this.mMarkerOptions.draggable(z14);
        styleChanged();
    }

    public void setFlat(boolean z14) {
        this.mMarkerOptions.flat(z14);
        styleChanged();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        this.mMarkerOptions.icon(bitmapDescriptor);
        styleChanged();
    }

    public void setInfoWindowAnchor(float f14, float f15) {
        this.mMarkerOptions.infoWindowAnchor(f14, f15);
        styleChanged();
    }

    public void setRotation(float f14) {
        setMarkerRotation(f14);
        styleChanged();
    }

    public void setSnippet(String str) {
        this.mMarkerOptions.snippet(str);
        styleChanged();
    }

    public void setTitle(String str) {
        this.mMarkerOptions.title(str);
        styleChanged();
    }

    @Override // com.google.maps.android.data.geojson.GeoJsonStyle
    public void setVisible(boolean z14) {
        this.mMarkerOptions.visible(z14);
        styleChanged();
    }

    public void setZIndex(float f14) {
        this.mMarkerOptions.zIndex(f14);
        styleChanged();
    }

    public MarkerOptions toMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.alpha(this.mMarkerOptions.getAlpha());
        markerOptions.anchor(this.mMarkerOptions.getAnchorU(), this.mMarkerOptions.getAnchorV());
        markerOptions.draggable(this.mMarkerOptions.isDraggable());
        markerOptions.flat(this.mMarkerOptions.isFlat());
        markerOptions.icon(this.mMarkerOptions.getIcon());
        markerOptions.infoWindowAnchor(this.mMarkerOptions.getInfoWindowAnchorU(), this.mMarkerOptions.getInfoWindowAnchorV());
        markerOptions.rotation(this.mMarkerOptions.getRotation());
        markerOptions.snippet(this.mMarkerOptions.getSnippet());
        markerOptions.title(this.mMarkerOptions.getTitle());
        markerOptions.visible(this.mMarkerOptions.isVisible());
        markerOptions.zIndex(this.mMarkerOptions.getZIndex());
        return markerOptions;
    }

    public String toString() {
        return "PointStyle{\n geometry type=" + Arrays.toString(GEOMETRY_TYPE) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + ",\n z index=" + getZIndex() + "\n}\n";
    }
}
