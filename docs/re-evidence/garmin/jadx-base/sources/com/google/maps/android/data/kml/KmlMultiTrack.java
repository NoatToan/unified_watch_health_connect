package com.google.maps.android.data.kml;

import com.google.maps.android.data.Geometry;
import java.util.ArrayList;
import java.util.Iterator;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public class KmlMultiTrack extends KmlMultiGeometry {
    public KmlMultiTrack(ArrayList<KmlTrack> arrayList) {
        super(createGeometries(arrayList));
    }

    private static ArrayList<Geometry> createGeometries(ArrayList<KmlTrack> arrayList) {
        ArrayList<Geometry> arrayList2 = new ArrayList<>();
        if (arrayList == null) {
            h.s("Tracks cannot be null");
            return null;
        }
        Iterator<KmlTrack> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }
}
