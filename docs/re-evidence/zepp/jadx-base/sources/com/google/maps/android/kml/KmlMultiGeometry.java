package com.google.maps.android.kml;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class KmlMultiGeometry implements KmlGeometry<ArrayList<KmlGeometry>> {
    private static final String b = "MultiGeometry";
    private ArrayList<KmlGeometry> a;

    public KmlMultiGeometry(ArrayList<KmlGeometry> arrayList) {
        this.a = new ArrayList<>();
        if (arrayList == null) {
            throw new IllegalArgumentException("Geometries cannot be null");
        }
        this.a = arrayList;
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public String getGeometryType() {
        return b;
    }

    public String toString() {
        return b + "{\n geometries=" + this.a + "\n}\n";
    }

    @Override // com.google.maps.android.kml.KmlGeometry
    public ArrayList<KmlGeometry> getGeometryObject() {
        return this.a;
    }
}
