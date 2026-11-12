package com.google.maps.android.geojson;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.kml.KmlLineString;
import com.google.maps.android.kml.KmlPoint;
import com.google.maps.android.kml.KmlPolygon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
class c implements Observer {
    private static final int g = 0;
    private static final int h = 1;
    private static final Object i = null;
    private final a<GeoJsonFeature> a;
    private final GeoJsonPointStyle b;
    private final GeoJsonLineStringStyle c;
    private final GeoJsonPolygonStyle d;
    private boolean e;
    private GoogleMap f;

    public c(GoogleMap googleMap, HashMap<GeoJsonFeature, Object> map) {
        a<GeoJsonFeature> aVar = new a<>();
        this.a = aVar;
        this.f = googleMap;
        aVar.putAll(map);
        this.e = false;
        this.b = new GeoJsonPointStyle();
        this.c = new GeoJsonLineStringStyle();
        this.d = new GeoJsonPolygonStyle();
        Iterator<GeoJsonFeature> it2 = o().iterator();
        while (it2.hasNext()) {
            w(it2.next());
        }
    }

    private Object b(GeoJsonFeature geoJsonFeature, GeoJsonGeometry geoJsonGeometry) {
        String type = geoJsonGeometry.getType();
        if (type.equals(KmlPoint.GEOMETRY_TYPE)) {
            return i(geoJsonFeature.getPointStyle(), (GeoJsonPoint) geoJsonGeometry);
        }
        if (type.equals(KmlLineString.GEOMETRY_TYPE)) {
            return e(geoJsonFeature.getLineStringStyle(), (GeoJsonLineString) geoJsonGeometry);
        }
        if (type.equals(KmlPolygon.GEOMETRY_TYPE)) {
            return j(geoJsonFeature.getPolygonStyle(), (GeoJsonPolygon) geoJsonGeometry);
        }
        if (type.equals("MultiPoint")) {
            return g(geoJsonFeature.getPointStyle(), (GeoJsonMultiPoint) geoJsonGeometry);
        }
        if (type.equals("MultiLineString")) {
            return f(geoJsonFeature.getLineStringStyle(), (GeoJsonMultiLineString) geoJsonGeometry);
        }
        if (type.equals("MultiPolygon")) {
            return h(geoJsonFeature.getPolygonStyle(), (GeoJsonMultiPolygon) geoJsonGeometry);
        }
        if (type.equals("GeometryCollection")) {
            return c(geoJsonFeature, ((GeoJsonGeometryCollection) geoJsonGeometry).getGeometries());
        }
        return null;
    }

    private ArrayList<Object> c(GeoJsonFeature geoJsonFeature, List<GeoJsonGeometry> list) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<GeoJsonGeometry> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(b(geoJsonFeature, it2.next()));
        }
        return arrayList;
    }

    private Polyline e(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonLineString geoJsonLineString) {
        PolylineOptions polylineOptions = geoJsonLineStringStyle.toPolylineOptions();
        polylineOptions.addAll(geoJsonLineString.getCoordinates());
        Polyline polylineAddPolyline = this.f.addPolyline(polylineOptions);
        polylineAddPolyline.setClickable(true);
        return polylineAddPolyline;
    }

    private ArrayList<Polyline> f(GeoJsonLineStringStyle geoJsonLineStringStyle, GeoJsonMultiLineString geoJsonMultiLineString) {
        ArrayList<Polyline> arrayList = new ArrayList<>();
        Iterator<GeoJsonLineString> it2 = geoJsonMultiLineString.getLineStrings().iterator();
        while (it2.hasNext()) {
            arrayList.add(e(geoJsonLineStringStyle, it2.next()));
        }
        return arrayList;
    }

    private ArrayList<Marker> g(GeoJsonPointStyle geoJsonPointStyle, GeoJsonMultiPoint geoJsonMultiPoint) {
        ArrayList<Marker> arrayList = new ArrayList<>();
        Iterator<GeoJsonPoint> it2 = geoJsonMultiPoint.getPoints().iterator();
        while (it2.hasNext()) {
            arrayList.add(i(geoJsonPointStyle, it2.next()));
        }
        return arrayList;
    }

    private ArrayList<Polygon> h(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonMultiPolygon geoJsonMultiPolygon) {
        ArrayList<Polygon> arrayList = new ArrayList<>();
        Iterator<GeoJsonPolygon> it2 = geoJsonMultiPolygon.getPolygons().iterator();
        while (it2.hasNext()) {
            arrayList.add(j(geoJsonPolygonStyle, it2.next()));
        }
        return arrayList;
    }

    private Marker i(GeoJsonPointStyle geoJsonPointStyle, GeoJsonPoint geoJsonPoint) {
        MarkerOptions markerOptions = geoJsonPointStyle.toMarkerOptions();
        markerOptions.position(geoJsonPoint.getCoordinates());
        return this.f.addMarker(markerOptions);
    }

    private Polygon j(GeoJsonPolygonStyle geoJsonPolygonStyle, GeoJsonPolygon geoJsonPolygon) {
        PolygonOptions polygonOptions = geoJsonPolygonStyle.toPolygonOptions();
        polygonOptions.addAll(geoJsonPolygon.getCoordinates().get(0));
        for (int i2 = 1; i2 < geoJsonPolygon.getCoordinates().size(); i2++) {
            polygonOptions.addHole(geoJsonPolygon.getCoordinates().get(i2));
        }
        Polygon polygonAddPolygon = this.f.addPolygon(polygonOptions);
        polygonAddPolygon.setClickable(true);
        return polygonAddPolygon;
    }

    private void r(GeoJsonFeature geoJsonFeature) {
        s(geoJsonFeature, this.f);
    }

    private void s(GeoJsonFeature geoJsonFeature, GoogleMap googleMap) {
        u(this.a.get(geoJsonFeature));
        this.a.put(geoJsonFeature, i);
        this.f = googleMap;
        if (googleMap == null || !geoJsonFeature.hasGeometry()) {
            return;
        }
        this.a.put(geoJsonFeature, b(geoJsonFeature, geoJsonFeature.getGeometry()));
    }

    private static void u(Object obj) {
        if (obj instanceof Marker) {
            ((Marker) obj).remove();
            return;
        }
        if (obj instanceof Polyline) {
            ((Polyline) obj).remove();
            return;
        }
        if (obj instanceof Polygon) {
            ((Polygon) obj).remove();
        } else if (obj instanceof ArrayList) {
            Iterator it2 = ((ArrayList) obj).iterator();
            while (it2.hasNext()) {
                u(it2.next());
            }
        }
    }

    private void w(GeoJsonFeature geoJsonFeature) {
        if (geoJsonFeature.getPointStyle() == null) {
            geoJsonFeature.setPointStyle(this.b);
        }
        if (geoJsonFeature.getLineStringStyle() == null) {
            geoJsonFeature.setLineStringStyle(this.c);
        }
        if (geoJsonFeature.getPolygonStyle() == null) {
            geoJsonFeature.setPolygonStyle(this.d);
        }
    }

    public void a(GeoJsonFeature geoJsonFeature) {
        Object objB = i;
        w(geoJsonFeature);
        if (this.e) {
            geoJsonFeature.addObserver(this);
            if (this.a.containsKey(geoJsonFeature)) {
                u(this.a.get(geoJsonFeature));
            }
            if (geoJsonFeature.hasGeometry()) {
                objB = b(geoJsonFeature, geoJsonFeature.getGeometry());
            }
        }
        this.a.put(geoJsonFeature, objB);
    }

    public void d() {
        if (this.e) {
            return;
        }
        this.e = true;
        Iterator<GeoJsonFeature> it2 = o().iterator();
        while (it2.hasNext()) {
            a(it2.next());
        }
    }

    public GeoJsonLineStringStyle k() {
        return this.c;
    }

    public GeoJsonPointStyle l() {
        return this.b;
    }

    public GeoJsonPolygonStyle m() {
        return this.d;
    }

    public GeoJsonFeature n(Object obj) {
        return this.a.c(obj);
    }

    public Set<GeoJsonFeature> o() {
        return this.a.keySet();
    }

    public GoogleMap p() {
        return this.f;
    }

    public boolean q() {
        return this.e;
    }

    public void t(GeoJsonFeature geoJsonFeature) {
        if (this.a.containsKey(geoJsonFeature)) {
            u(this.a.remove(geoJsonFeature));
            geoJsonFeature.deleteObserver(this);
        }
    }

    @Override // java.util.Observer
    public void update(Observable observable, Object obj) {
        if (observable instanceof GeoJsonFeature) {
            GeoJsonFeature geoJsonFeature = (GeoJsonFeature) observable;
            Object obj2 = this.a.get(geoJsonFeature);
            Object obj3 = i;
            boolean z = obj2 != obj3;
            if (z && geoJsonFeature.hasGeometry()) {
                r(geoJsonFeature);
                return;
            }
            if (z && !geoJsonFeature.hasGeometry()) {
                u(this.a.get(geoJsonFeature));
                this.a.put(geoJsonFeature, obj3);
            } else {
                if (z || !geoJsonFeature.hasGeometry()) {
                    return;
                }
                a(geoJsonFeature);
            }
        }
    }

    public void v() {
        if (this.e) {
            for (GeoJsonFeature geoJsonFeature : this.a.keySet()) {
                u(this.a.get(geoJsonFeature));
                geoJsonFeature.deleteObserver(this);
            }
            this.e = false;
        }
    }

    public void x(GoogleMap googleMap) {
        Iterator<GeoJsonFeature> it2 = o().iterator();
        while (it2.hasNext()) {
            s(it2.next(), googleMap);
        }
    }
}
