package com.google.maps.android.kml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class a {
    private static final String a = "name|description|visibility|open|address|phoneNumber";
    private static final String b = "Folder|Document";
    private static final String c = "Placemark";
    private static final String d = "Style";
    private static final String e = "StyleMap";
    private static final String f = "ExtendedData";
    private static final String g = "GroundOverlay";
    private static final String h = "altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when";

    private static KmlContainer a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        String attributeValue = xmlPullParser.getAttributeValue(null, "id") != null ? xmlPullParser.getAttributeValue(null, "id") : null;
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new KmlContainer(map, map2, map3, map4, arrayList, map5, attributeValue);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(h)) {
                    c.g(xmlPullParser);
                } else if (xmlPullParser.getName().matches(b)) {
                    arrayList.add(a(xmlPullParser));
                } else if (xmlPullParser.getName().matches(a)) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(e)) {
                    e(xmlPullParser, map4);
                } else if (xmlPullParser.getName().equals(d)) {
                    d(xmlPullParser, map2);
                } else if (xmlPullParser.getName().equals(c)) {
                    c(xmlPullParser, map3);
                } else if (xmlPullParser.getName().equals(f)) {
                    f(xmlPullParser, map);
                } else if (xmlPullParser.getName().equals(g)) {
                    map5.put(b.d(xmlPullParser), null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static KmlContainer b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return a(xmlPullParser);
    }

    private static void c(XmlPullParser xmlPullParser, HashMap<KmlPlacemark, Object> map) throws XmlPullParserException, IOException {
        map.put(b.h(xmlPullParser), null);
    }

    private static void d(XmlPullParser xmlPullParser, HashMap<String, e> map) throws XmlPullParserException, IOException {
        if (xmlPullParser.getAttributeValue(null, "id") != null) {
            e eVarE = f.e(xmlPullParser);
            map.put(eVarE.m(), eVarE);
        }
    }

    private static void e(XmlPullParser xmlPullParser, HashMap<String, String> map) throws XmlPullParserException, IOException {
        map.putAll(f.f(xmlPullParser));
    }

    private static void f(XmlPullParser xmlPullParser, HashMap<String, String> map) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(f)) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    attributeValue = xmlPullParser.getAttributeValue(null, "name");
                } else if (xmlPullParser.getName().equals("value") && attributeValue != null) {
                    map.put(attributeValue, xmlPullParser.nextText());
                    attributeValue = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
