package com.google.maps.android.kml;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class KmlPolygon implements KmlGeometry<ArrayList<ArrayList<LatLng>>> {
    public static final String GEOMETRY_TYPE = "Polygon";
    private final ArrayList<LatLng> a;
    private final ArrayList<ArrayList<LatLng>> b;

    public KmlPolygon(ArrayList<LatLng> arrayList, ArrayList<ArrayList<LatLng>> arrayList2) {
        if (arrayList == null) {
            throw new IllegalArgumentException("Outer boundary coordinates cannot be null");
        }
        this.a = arrayList;
        this.b = arrayList2;
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public String getGeometryType() {
        return GEOMETRY_TYPE;
    }

    public ArrayList<ArrayList<LatLng>> getInnerBoundaryCoordinates() {
        return this.b;
    }

    public ArrayList<LatLng> getOuterBoundaryCoordinates() {
        return this.a;
    }

    public String toString() {
        return GEOMETRY_TYPE + "{\n outer coordinates=" + this.a + ",\n inner coordinates=" + this.b + "\n}\n";
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public ArrayList<ArrayList<LatLng>> getGeometryObject() {
        ArrayList<ArrayList<LatLng>> arrayList = new ArrayList<>();
        arrayList.add(this.a);
        ArrayList<ArrayList<LatLng>> arrayList2 = this.b;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}
