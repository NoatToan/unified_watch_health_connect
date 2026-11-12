package com.google.maps.android.data;

import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import java.util.Observable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Style extends Observable {
    private static final String LOG_TAG = "Style";
    protected MarkerOptions mMarkerOptions = new MarkerOptions();
    protected PolygonOptions mPolygonOptions;
    protected PolylineOptions mPolylineOptions;

    public Style() {
        PolylineOptions polylineOptions = new PolylineOptions();
        this.mPolylineOptions = polylineOptions;
        polylineOptions.clickable(true);
        PolygonOptions polygonOptions = new PolygonOptions();
        this.mPolygonOptions = polygonOptions;
        polygonOptions.clickable(true);
    }

    public float getRotation() {
        return this.mMarkerOptions.getRotation();
    }

    public void setLineStringWidth(float f14) {
        this.mPolylineOptions.width(f14);
    }

    public void setMarkerHotSpot(float f14, float f15, String str, String str2) {
        if (!str.equals("fraction")) {
            f14 = 0.5f;
        }
        if (!str2.equals("fraction")) {
            f15 = 1.0f;
        }
        this.mMarkerOptions.anchor(f14, f15);
    }

    public void setMarkerRotation(float f14) {
        this.mMarkerOptions.rotation(f14);
    }

    public void setPolygonFillColor(int i14) {
        this.mPolygonOptions.fillColor(i14);
    }

    public void setPolygonStrokeWidth(float f14) {
        this.mPolygonOptions.strokeWidth(f14);
    }
}
