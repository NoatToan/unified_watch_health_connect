package com.google.maps.android.geojson;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.kml.KmlPoint;
import java.util.Arrays;
import java.util.Observable;

/* JADX INFO: loaded from: classes3.dex */
public class GeoJsonPointStyle extends Observable implements d {
    private static final String[] b = {KmlPoint.GEOMETRY_TYPE, "MultiPoint", "GeometryCollection"};
    private final MarkerOptions a = new MarkerOptions();

    private void a() {
        setChanged();
        notifyObservers();
    }

    public float getAlpha() {
        return this.a.getAlpha();
    }

    public float getAnchorU() {
        return this.a.getAnchorU();
    }

    public float getAnchorV() {
        return this.a.getAnchorV();
    }

    @Override // com.google.maps.android.geojson.d
    public String[] getGeometryType() {
        return b;
    }

    public BitmapDescriptor getIcon() {
        return this.a.getIcon();
    }

    public float getInfoWindowAnchorU() {
        return this.a.getInfoWindowAnchorU();
    }

    public float getInfoWindowAnchorV() {
        return this.a.getInfoWindowAnchorV();
    }

    public float getRotation() {
        return this.a.getRotation();
    }

    public String getSnippet() {
        return this.a.getSnippet();
    }

    public String getTitle() {
        return this.a.getTitle();
    }

    public boolean isDraggable() {
        return this.a.isDraggable();
    }

    public boolean isFlat() {
        return this.a.isFlat();
    }

    @Override // com.google.maps.android.geojson.d
    public boolean isVisible() {
        return this.a.isVisible();
    }

    public void setAlpha(float f) {
        this.a.alpha(f);
        a();
    }

    public void setAnchor(float f, float f2) {
        this.a.anchor(f, f2);
        a();
    }

    public void setDraggable(boolean z) {
        this.a.draggable(z);
        a();
    }

    public void setFlat(boolean z) {
        this.a.flat(z);
        a();
    }

    public void setIcon(BitmapDescriptor bitmapDescriptor) {
        this.a.icon(bitmapDescriptor);
        a();
    }

    public void setInfoWindowAnchor(float f, float f2) {
        this.a.infoWindowAnchor(f, f2);
        a();
    }

    public void setRotation(float f) {
        this.a.rotation(f);
        a();
    }

    public void setSnippet(String str) {
        this.a.snippet(str);
        a();
    }

    public void setTitle(String str) {
        this.a.title(str);
        a();
    }

    @Override // com.google.maps.android.geojson.d
    public void setVisible(boolean z) {
        this.a.visible(z);
        a();
    }

    public MarkerOptions toMarkerOptions() {
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.alpha(this.a.getAlpha());
        markerOptions.anchor(this.a.getAnchorU(), this.a.getAnchorV());
        markerOptions.draggable(this.a.isDraggable());
        markerOptions.flat(this.a.isFlat());
        markerOptions.icon(this.a.getIcon());
        markerOptions.infoWindowAnchor(this.a.getInfoWindowAnchorU(), this.a.getInfoWindowAnchorV());
        markerOptions.rotation(this.a.getRotation());
        markerOptions.snippet(this.a.getSnippet());
        markerOptions.title(this.a.getTitle());
        markerOptions.visible(this.a.isVisible());
        return markerOptions;
    }

    public String toString() {
        return "PointStyle{\n geometry type=" + Arrays.toString(b) + ",\n alpha=" + getAlpha() + ",\n anchor U=" + getAnchorU() + ",\n anchor V=" + getAnchorV() + ",\n draggable=" + isDraggable() + ",\n flat=" + isFlat() + ",\n info window anchor U=" + getInfoWindowAnchorU() + ",\n info window anchor V=" + getInfoWindowAnchorV() + ",\n rotation=" + getRotation() + ",\n snippet=" + getSnippet() + ",\n title=" + getTitle() + ",\n visible=" + isVisible() + "\n}\n";
    }
}
