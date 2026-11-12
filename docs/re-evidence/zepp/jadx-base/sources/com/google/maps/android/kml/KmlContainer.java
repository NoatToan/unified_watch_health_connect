package com.google.maps.android.kml;

import com.google.android.gms.maps.model.GroundOverlay;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class KmlContainer {
    private final HashMap<String, String> a;
    private final HashMap<KmlPlacemark, Object> b;
    private final ArrayList<KmlContainer> c;
    private final HashMap<KmlGroundOverlay, GroundOverlay> d;
    private final HashMap<String, String> e;
    private HashMap<String, e> f;
    private String g;

    public KmlContainer(HashMap<String, String> map, HashMap<String, e> map2, HashMap<KmlPlacemark, Object> map3, HashMap<String, String> map4, ArrayList<KmlContainer> arrayList, HashMap<KmlGroundOverlay, GroundOverlay> map5, String str) {
        this.a = map;
        this.b = map3;
        this.f = map2;
        this.e = map4;
        this.c = arrayList;
        this.d = map5;
        this.g = str;
    }

    public HashMap<KmlGroundOverlay, GroundOverlay> a() {
        return this.d;
    }

    public HashMap<KmlPlacemark, Object> b() {
        return this.b;
    }

    public HashMap<String, String> c() {
        return this.e;
    }

    public HashMap<String, e> d() {
        return this.f;
    }

    public void e(KmlPlacemark kmlPlacemark, Object obj) {
        this.b.put(kmlPlacemark, obj);
    }

    public String getContainerId() {
        return this.g;
    }

    public Iterable<KmlContainer> getContainers() {
        return this.c;
    }

    public Iterable<KmlGroundOverlay> getGroundOverlays() {
        return this.d.keySet();
    }

    public Iterable<KmlPlacemark> getPlacemarks() {
        return this.b.keySet();
    }

    public Iterable<String> getProperties() {
        return this.a.keySet();
    }

    public String getProperty(String str) {
        return this.a.get(str);
    }

    public e getStyle(String str) {
        return this.f.get(str);
    }

    public boolean hasContainers() {
        return this.c.size() > 0;
    }

    public boolean hasPlacemarks() {
        return this.b.size() > 0;
    }

    public boolean hasProperties() {
        return this.a.size() > 0;
    }

    public boolean hasProperty(String str) {
        return this.a.containsKey(str);
    }

    public String toString() {
        return "Container{\n properties=" + this.a + ",\n placemarks=" + this.b + ",\n containers=" + this.c + ",\n ground overlays=" + this.d + ",\n style maps=" + this.e + ",\n styles=" + this.f + "\n}\n";
    }
}
