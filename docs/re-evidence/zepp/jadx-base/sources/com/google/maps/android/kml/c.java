package com.google.maps.android.kml;

import com.google.android.gms.maps.model.GroundOverlay;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class c {
    private static final String g = "Style";
    private static final String h = "StyleMap";
    private static final String i = "Placemark";
    private static final String j = "GroundOverlay";
    private static final String k = "Folder|Document";
    private static final String l = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";
    private final XmlPullParser a;
    private final HashMap<KmlPlacemark, Object> b = new HashMap<>();
    private final ArrayList<KmlContainer> c = new ArrayList<>();
    private final HashMap<String, e> d = new HashMap<>();
    private final HashMap<String, String> e = new HashMap<>();
    private final HashMap<KmlGroundOverlay, GroundOverlay> f = new HashMap<>();

    public c(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i2 = 1;
        while (i2 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public ArrayList<KmlContainer> a() {
        return this.c;
    }

    public HashMap<KmlGroundOverlay, GroundOverlay> b() {
        return this.f;
    }

    public HashMap<KmlPlacemark, Object> c() {
        return this.b;
    }

    public HashMap<String, String> d() {
        return this.e;
    }

    public HashMap<String, e> e() {
        return this.d;
    }

    public void f() throws XmlPullParserException, IOException {
        int eventType = this.a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.a.getName().matches(l)) {
                    g(this.a);
                }
                if (this.a.getName().matches(k)) {
                    this.c.add(a.b(this.a));
                }
                if (this.a.getName().equals(g)) {
                    e eVarE = f.e(this.a);
                    this.d.put(eVarE.m(), eVarE);
                }
                if (this.a.getName().equals(h)) {
                    this.e.putAll(f.f(this.a));
                }
                if (this.a.getName().equals(i)) {
                    this.b.put(b.h(this.a), null);
                }
                if (this.a.getName().equals(j)) {
                    this.f.put(b.d(this.a), null);
                }
            }
            eventType = this.a.next();
        }
        this.d.put(null, new e());
    }
}
