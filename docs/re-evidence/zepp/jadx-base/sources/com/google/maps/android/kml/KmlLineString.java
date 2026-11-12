package com.google.maps.android.kml;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class KmlLineString implements KmlGeometry<List<LatLng>> {
    public static final String GEOMETRY_TYPE = "LineString";
    public final ArrayList<LatLng> a;

    public KmlLineString(ArrayList<LatLng> arrayList) {
        if (arrayList == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.a = arrayList;
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public String toString() {
        return GEOMETRY_TYPE + "{\n coordinates=" + this.a + "\n}\n";
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public List<LatLng> getGeometryObject() {
        return this.a;
    }
}
