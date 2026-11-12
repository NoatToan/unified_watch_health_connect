package com.google.maps.android.kml;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class KmlPlacemark {
    private final KmlGeometry a;
    private final String b;
    private final e c;
    private HashMap<String, String> d;

    public KmlPlacemark(KmlGeometry kmlGeometry, String str, e eVar, HashMap<String, String> map) {
        this.d = new HashMap<>();
        this.a = kmlGeometry;
        this.b = str;
        this.c = eVar;
        this.d = map;
    }

    public KmlGeometry getGeometry() {
        return this.a;
    }

    public e getInlineStyle() {
        return this.c;
    }

    public Iterable getProperties() {
        return this.d.entrySet();
    }

    public String getProperty(String str) {
        return this.d.get(str);
    }

    public String getStyleId() {
        return this.b;
    }

    public boolean hasProperties() {
        return this.d.size() > 0;
    }

    public boolean hasProperty(String str) {
        return this.d.containsKey(str);
    }

    public String toString() {
        return "Placemark{\n style id=" + this.b + ",\n inline style=" + this.c + ",\n properties=" + this.d + ",\n geometry=" + this.a + "\n}\n";
    }
}
