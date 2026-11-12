package com.google.maps.android.kml;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.collection.LruCache;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.google.maps.android.R;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class d {
    private static final String o = "KmlRenderer";
    private static final int p = 50;
    private GoogleMap d;
    private HashMap<KmlPlacemark, Object> e;
    private HashMap<String, String> f;
    private ArrayList<KmlContainer> g;
    private HashMap<String, e> h;
    private HashMap<KmlGroundOverlay, GroundOverlay> j;
    private Context n;
    private final LruCache<String, Bitmap> a = new LruCache<>(50);
    private final ArrayList<String> b = new ArrayList<>();
    private final ArrayList<String> c = new ArrayList<>();
    private HashMap<String, e> i = new HashMap<>();
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;

    public class a implements GoogleMap.InfoWindowAdapter {
        public a() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public View getInfoContents(Marker marker) {
            View viewInflate = LayoutInflater.from(d.this.n).inflate(R.layout.amu_info_window, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.window);
            if (marker.getSnippet() != null) {
                textView.setText(Html.fromHtml(marker.getTitle() + "<br>" + marker.getSnippet()));
            } else {
                textView.setText(Html.fromHtml(marker.getTitle()));
            }
            return viewInflate;
        }

        @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
        public View getInfoWindow(Marker marker) {
            return null;
        }
    }

    public class b extends AsyncTask<String, Void, Bitmap> {
        private final String a;

        public b(String str) {
            this.a = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) FirebasePerfUrlConnection.getContent(new URL(this.a)));
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.a);
            } catch (IOException e) {
                Log.e(d.o, "Image [" + this.a + "] download issue", e);
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e(d.o, "Image at this URL could not be found " + this.a);
                return;
            }
            d.this.a.put(this.a, bitmap);
            if (d.this.k) {
                d dVar = d.this;
                dVar.o(this.a, dVar.j, true);
                d dVar2 = d.this;
                dVar2.n(this.a, dVar2.g, true);
            }
        }
    }

    public class c extends AsyncTask<String, Void, Bitmap> {
        private final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return BitmapFactory.decodeStream((InputStream) FirebasePerfUrlConnection.getContent(new URL(this.a)));
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.a);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e(d.o, "Image at this URL could not be found " + this.a);
                return;
            }
            d.this.a.put(this.a, bitmap);
            if (d.this.k) {
                d dVar = d.this;
                dVar.r(this.a, dVar.e);
                d dVar2 = d.this;
                dVar2.k(this.a, dVar2.g);
            }
        }
    }

    public d(GoogleMap googleMap, Context context) {
        this.n = context;
        this.d = googleMap;
    }

    private Object A(KmlPlacemark kmlPlacemark, KmlGeometry kmlGeometry, e eVar, e eVar2, boolean z) {
        String geometryType = kmlGeometry.getGeometryType();
        boolean zHasProperty = kmlPlacemark.hasProperty("drawOrder");
        float f = 0.0f;
        if (zHasProperty) {
            try {
                f = Float.parseFloat(kmlPlacemark.getProperty("drawOrder"));
            } catch (NumberFormatException unused) {
                zHasProperty = false;
            }
        }
        if (geometryType.equals(KmlPoint.GEOMETRY_TYPE)) {
            Marker markerY = y(kmlPlacemark, (KmlPoint) kmlGeometry, eVar, eVar2);
            markerY.setVisible(z);
            if (zHasProperty) {
                markerY.setZIndex(f);
            }
            return markerY;
        }
        if (geometryType.equals(KmlLineString.GEOMETRY_TYPE)) {
            Polyline polylineT = t((KmlLineString) kmlGeometry, eVar, eVar2);
            polylineT.setVisible(z);
            if (zHasProperty) {
                polylineT.setZIndex(f);
            }
            return polylineT;
        }
        if (!geometryType.equals(KmlPolygon.GEOMETRY_TYPE)) {
            if (geometryType.equals("MultiGeometry")) {
                return v(kmlPlacemark, (KmlMultiGeometry) kmlGeometry, eVar, eVar2, z);
            }
            return null;
        }
        Polygon polygonZ = z((KmlPolygon) kmlGeometry, eVar, eVar2);
        polygonZ.setVisible(z);
        if (zHasProperty) {
            polygonZ.setZIndex(f);
        }
        return polygonZ;
    }

    private void C() {
        this.d.setInfoWindowAdapter(new a());
    }

    private void D() {
        this.m = true;
        Iterator<String> it2 = this.c.iterator();
        while (it2.hasNext()) {
            new b(it2.next()).execute(new String[0]);
            it2.remove();
        }
    }

    private void E() {
        this.l = true;
        Iterator<String> it2 = this.b.iterator();
        while (it2.hasNext()) {
            new c(it2.next()).execute(new String[0]);
            it2.remove();
        }
    }

    public static boolean F(KmlContainer kmlContainer, boolean z) {
        return z && (!kmlContainer.hasProperty("visibility") || Integer.parseInt(kmlContainer.getProperty("visibility")) != 0);
    }

    private e K(String str) {
        return this.i.get(str) != null ? this.i.get(str) : this.i.get(null);
    }

    private static boolean L(KmlPlacemark kmlPlacemark) {
        return (kmlPlacemark.hasProperty("visibility") && Integer.parseInt(kmlPlacemark.getProperty("visibility")) == 0) ? false : true;
    }

    private void O(Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            R(kmlContainer.b());
            P(kmlContainer.a());
            O(kmlContainer.getContainers());
        }
    }

    private void P(HashMap<KmlGroundOverlay, GroundOverlay> map) {
        Iterator<GroundOverlay> it2 = map.values().iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
    }

    private static void R(HashMap<KmlPlacemark, Object> map) {
        for (Object obj : map.values()) {
            if (obj instanceof Marker) {
                ((Marker) obj).remove();
            } else if (obj instanceof Polyline) {
                ((Polyline) obj).remove();
            } else if (obj instanceof Polygon) {
                ((Polygon) obj).remove();
            }
        }
    }

    private void S(e eVar, HashMap<KmlPlacemark, Object> map, KmlPlacemark kmlPlacemark) {
        double dH = eVar.h();
        ((Marker) map.get(kmlPlacemark)).setIcon(T(this.a.get(eVar.i()), Double.valueOf(dH)));
    }

    private static BitmapDescriptor T(Bitmap bitmap, Double d) {
        return BitmapDescriptorFactory.fromBitmap(Bitmap.createScaledBitmap(bitmap, (int) (((double) bitmap.getWidth()) * d.doubleValue()), (int) (((double) bitmap.getHeight()) * d.doubleValue()), false));
    }

    private void U(PolylineOptions polylineOptions, e eVar) {
        PolylineOptions polylineOptionsL = eVar.l();
        if (eVar.t("outlineColor")) {
            polylineOptions.color(polylineOptionsL.getColor());
        }
        if (eVar.t(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
            polylineOptions.width(polylineOptionsL.getWidth());
        }
        if (eVar.r()) {
            polylineOptions.color(e.a(polylineOptionsL.getColor()));
        }
    }

    private void V(MarkerOptions markerOptions, e eVar, String str) {
        MarkerOptions markerOptionsJ = eVar.j();
        if (eVar.t("heading")) {
            markerOptions.rotation(markerOptionsJ.getRotation());
        }
        if (eVar.t("hotSpot")) {
            markerOptions.anchor(markerOptionsJ.getAnchorU(), markerOptionsJ.getAnchorV());
        }
        if (eVar.t("markerColor")) {
            markerOptions.icon(markerOptionsJ.getIcon());
        }
        if (eVar.t("iconUrl")) {
            u(eVar.i(), markerOptions);
        } else if (str != null) {
            u(str, markerOptions);
        }
    }

    private void W(PolygonOptions polygonOptions, e eVar) {
        PolygonOptions polygonOptionsK = eVar.k();
        if (eVar.o() && eVar.t("fillColor")) {
            polygonOptions.fillColor(polygonOptionsK.getFillColor());
        }
        if (eVar.p()) {
            if (eVar.t("outlineColor")) {
                polygonOptions.strokeColor(polygonOptionsK.getStrokeColor());
            }
            if (eVar.t(ViewHierarchyConstants.DIMENSION_WIDTH_KEY)) {
                polygonOptions.strokeWidth(polygonOptionsK.getStrokeWidth());
            }
        }
        if (eVar.s()) {
            polygonOptions.fillColor(e.a(polygonOptionsK.getFillColor()));
        }
    }

    private void Y(e eVar, Marker marker, KmlPlacemark kmlPlacemark) {
        boolean zHasProperty = kmlPlacemark.hasProperty("name");
        boolean zHasProperty2 = kmlPlacemark.hasProperty("description");
        boolean zN = eVar.n();
        boolean zContainsKey = eVar.f().containsKey("text");
        if (zN && zContainsKey) {
            marker.setTitle(eVar.f().get("text"));
            C();
            return;
        }
        if (zN && zHasProperty) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            C();
        } else if (zHasProperty && zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("name"));
            marker.setSnippet(kmlPlacemark.getProperty("description"));
            C();
        } else if (zHasProperty2) {
            marker.setTitle(kmlPlacemark.getProperty("description"));
            C();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str, Iterable<KmlContainer> iterable) {
        for (KmlContainer kmlContainer : iterable) {
            r(str, kmlContainer.b());
            if (kmlContainer.hasContainers()) {
                k(str, kmlContainer.getContainers());
            }
        }
    }

    private void l(Iterable<KmlContainer> iterable, boolean z) {
        for (KmlContainer kmlContainer : iterable) {
            boolean zF = F(kmlContainer, z);
            if (kmlContainer.d() != null) {
                this.i.putAll(kmlContainer.d());
            }
            if (kmlContainer.c() != null) {
                B(kmlContainer.c(), this.i);
            }
            m(kmlContainer, zF);
            if (kmlContainer.hasContainers()) {
                l(kmlContainer.getContainers(), zF);
            }
        }
    }

    private void m(KmlContainer kmlContainer, boolean z) {
        for (KmlPlacemark kmlPlacemark : kmlContainer.getPlacemarks()) {
            kmlContainer.e(kmlPlacemark, w(kmlPlacemark, z && L(kmlPlacemark)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String str, Iterable<KmlContainer> iterable, boolean z) {
        for (KmlContainer kmlContainer : iterable) {
            boolean zF = F(kmlContainer, z);
            o(str, kmlContainer.a(), zF);
            if (kmlContainer.hasContainers()) {
                n(str, kmlContainer.getContainers(), zF);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str, HashMap<KmlGroundOverlay, GroundOverlay> map, boolean z) {
        BitmapDescriptor bitmapDescriptorFromBitmap = BitmapDescriptorFactory.fromBitmap(this.a.get(str));
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            if (kmlGroundOverlay.getImageUrl().equals(str)) {
                GroundOverlay groundOverlayAddGroundOverlay = this.d.addGroundOverlay(kmlGroundOverlay.a().image(bitmapDescriptorFromBitmap));
                if (!z) {
                    groundOverlayAddGroundOverlay.setVisible(false);
                }
                map.put(kmlGroundOverlay, groundOverlayAddGroundOverlay);
            }
        }
    }

    private void p(HashMap<KmlGroundOverlay, GroundOverlay> map) {
        for (KmlGroundOverlay kmlGroundOverlay : map.keySet()) {
            String imageUrl = kmlGroundOverlay.getImageUrl();
            if (imageUrl != null && kmlGroundOverlay.getLatLngBox() != null) {
                if (this.a.get(imageUrl) != null) {
                    o(imageUrl, this.j, true);
                } else if (!this.c.contains(imageUrl)) {
                    this.c.add(imageUrl);
                }
            }
        }
    }

    private void q(HashMap<KmlGroundOverlay, GroundOverlay> map, Iterable<KmlContainer> iterable) {
        p(map);
        for (KmlContainer kmlContainer : iterable) {
            q(kmlContainer.a(), kmlContainer.getContainers());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, HashMap<KmlPlacemark, Object> map) {
        for (KmlPlacemark kmlPlacemark : map.keySet()) {
            e eVar = this.i.get(kmlPlacemark.getStyleId());
            e inlineStyle = kmlPlacemark.getInlineStyle();
            if (KmlPoint.GEOMETRY_TYPE.equals(kmlPlacemark.getGeometry().getGeometryType())) {
                boolean z = inlineStyle != null && str.equals(inlineStyle.i());
                boolean z2 = eVar != null && str.equals(eVar.i());
                if (z) {
                    S(inlineStyle, map, kmlPlacemark);
                } else if (z2) {
                    S(eVar, map, kmlPlacemark);
                }
            }
        }
    }

    private Polyline t(KmlLineString kmlLineString, e eVar, e eVar2) {
        PolylineOptions polylineOptionsL = eVar.l();
        polylineOptionsL.addAll(kmlLineString.getGeometryObject());
        if (eVar2 != null) {
            U(polylineOptionsL, eVar2);
        } else if (eVar.r()) {
            polylineOptionsL.color(e.a(polylineOptionsL.getColor()));
        }
        return this.d.addPolyline(polylineOptionsL);
    }

    private void u(String str, MarkerOptions markerOptions) {
        if (this.a.get(str) != null) {
            markerOptions.icon(BitmapDescriptorFactory.fromBitmap(this.a.get(str)));
        } else {
            if (this.b.contains(str)) {
                return;
            }
            this.b.add(str);
        }
    }

    private ArrayList<Object> v(KmlPlacemark kmlPlacemark, KmlMultiGeometry kmlMultiGeometry, e eVar, e eVar2, boolean z) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Iterator<KmlGeometry> it2 = kmlMultiGeometry.getGeometryObject().iterator();
        while (it2.hasNext()) {
            arrayList.add(A(kmlPlacemark, it2.next(), eVar, eVar2, z));
        }
        return arrayList;
    }

    private Object w(KmlPlacemark kmlPlacemark, boolean z) {
        if (kmlPlacemark.getGeometry() == null) {
            return null;
        }
        return A(kmlPlacemark, kmlPlacemark.getGeometry(), K(kmlPlacemark.getStyleId()), kmlPlacemark.getInlineStyle(), z);
    }

    private void x(HashMap<KmlPlacemark, Object> map) {
        for (KmlPlacemark kmlPlacemark : map.keySet()) {
            map.put(kmlPlacemark, w(kmlPlacemark, L(kmlPlacemark)));
        }
    }

    private Marker y(KmlPlacemark kmlPlacemark, KmlPoint kmlPoint, e eVar, e eVar2) {
        MarkerOptions markerOptionsJ = eVar.j();
        markerOptionsJ.position(kmlPoint.getGeometryObject());
        if (eVar2 != null) {
            V(markerOptionsJ, eVar2, eVar.i());
        } else if (eVar.i() != null) {
            u(eVar.i(), markerOptionsJ);
        }
        Marker markerAddMarker = this.d.addMarker(markerOptionsJ);
        Y(eVar, markerAddMarker, kmlPlacemark);
        return markerAddMarker;
    }

    private Polygon z(KmlPolygon kmlPolygon, e eVar, e eVar2) {
        PolygonOptions polygonOptionsK = eVar.k();
        polygonOptionsK.addAll(kmlPolygon.getOuterBoundaryCoordinates());
        Iterator<ArrayList<LatLng>> it2 = kmlPolygon.getInnerBoundaryCoordinates().iterator();
        while (it2.hasNext()) {
            polygonOptionsK.addHole(it2.next());
        }
        if (eVar2 != null) {
            W(polygonOptionsK, eVar2);
        } else if (eVar.s()) {
            polygonOptionsK.fillColor(e.a(polygonOptionsK.getFillColor()));
        }
        return this.d.addPolygon(polygonOptionsK);
    }

    public void B(HashMap<String, String> map, HashMap<String, e> map2) {
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, map2.get(str2));
            }
        }
    }

    public Iterable<KmlGroundOverlay> G() {
        return this.j.keySet();
    }

    public Iterable<KmlPlacemark> H() {
        return this.e.keySet();
    }

    public GoogleMap I() {
        return this.d;
    }

    public Iterable<KmlContainer> J() {
        return this.g;
    }

    public boolean M() {
        return this.e.size() > 0;
    }

    public boolean N() {
        return this.g.size() > 0;
    }

    public void Q() {
        R(this.e);
        P(this.j);
        if (N()) {
            O(J());
        }
        this.k = false;
        this.i.clear();
    }

    public void X(GoogleMap googleMap) {
        Q();
        this.d = googleMap;
        s();
    }

    public void Z(HashMap<String, e> map, HashMap<String, String> map2, HashMap<KmlPlacemark, Object> map3, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> map4) {
        this.h = map;
        this.f = map2;
        this.e = map3;
        this.g = arrayList;
        this.j = map4;
    }

    public void s() {
        this.i.putAll(this.h);
        B(this.f, this.i);
        q(this.j, this.g);
        l(this.g, true);
        x(this.e);
        if (!this.m) {
            D();
        }
        if (!this.l) {
            E();
        }
        this.k = true;
    }
}
