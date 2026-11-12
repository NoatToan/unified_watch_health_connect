package com.google.maps.android.kml;

import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class KmlGroundOverlay {
    private final Map<String, String> a;
    private final GroundOverlayOptions b;
    private String c;
    private LatLngBounds d;

    public KmlGroundOverlay(String str, LatLngBounds latLngBounds, float f, int i, HashMap<String, String> map, float f2) {
        GroundOverlayOptions groundOverlayOptions = new GroundOverlayOptions();
        this.b = groundOverlayOptions;
        this.c = str;
        this.a = map;
        if (latLngBounds == null) {
            throw new IllegalArgumentException("No LatLonBox given");
        }
        this.d = latLngBounds;
        groundOverlayOptions.positionFromBounds(latLngBounds);
        groundOverlayOptions.bearing(f2);
        groundOverlayOptions.zIndex(f);
        groundOverlayOptions.visible(i != 0);
    }

    public GroundOverlayOptions a() {
        return this.b;
    }

    public String getImageUrl() {
        return this.c;
    }

    public LatLngBounds getLatLngBox() {
        return this.d;
    }

    public Iterable<String> getProperties() {
        return this.a.keySet();
    }

    public String getProperty(String str) {
        return this.a.get(str);
    }

    public boolean hasProperty(String str) {
        return this.a.get(str) != null;
    }

    public String toString() {
        return "GroundOverlay{\n properties=" + this.a + ",\n image url=" + this.c + ",\n LatLngBox=" + this.d + "\n}\n";
    }
}
