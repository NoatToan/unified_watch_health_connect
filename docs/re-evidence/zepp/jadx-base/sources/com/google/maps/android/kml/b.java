package com.google.maps.android.kml;

import androidx.constraintlayout.motion.widget.Key;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class b {
    private static final String a = "Point|LineString|Polygon|MultiGeometry";
    private static final int b = 0;
    private static final int c = 1;
    private static final String d = "name|description|drawOrder|visibility|open|address|phoneNumber";
    private static final String e = "outerBoundaryIs|innerBoundaryIs";
    private static final String f = "ExtendedData";
    private static final String g = "styleUrl";
    private static final String h = "Style";
    private static final String i = "north|south|east|west";

    private static LatLng a(String str) {
        String[] strArrSplit = str.split(",");
        return new LatLng(Double.valueOf(Double.parseDouble(strArrSplit[1])).doubleValue(), Double.valueOf(Double.parseDouble(strArrSplit[0])).doubleValue());
    }

    private static ArrayList<LatLng> b(String str) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (String str2 : str.trim().split("(\\s+)")) {
            arrayList.add(a(str2));
        }
        return arrayList;
    }

    private static KmlGeometry c(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(KmlPoint.GEOMETRY_TYPE)) {
                    return i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(KmlLineString.GEOMETRY_TYPE)) {
                    return f(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(KmlPolygon.GEOMETRY_TYPE)) {
                    return j(xmlPullParser);
                }
                if (xmlPullParser.getName().equals("MultiGeometry")) {
                    return g(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static KmlGroundOverlay d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        String strK = null;
        float f2 = 0.0f;
        int i2 = 1;
        float fL = 0.0f;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("GroundOverlay")) {
                return new KmlGroundOverlay(strK, e((Double) map2.get("north"), (Double) map2.get("south"), (Double) map2.get("east"), (Double) map2.get("west")), f2, i2, map, fL);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("Icon")) {
                    strK = k(xmlPullParser);
                } else if (xmlPullParser.getName().equals("drawOrder")) {
                    f2 = Float.parseFloat(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("visibility")) {
                    i2 = Integer.parseInt(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(f)) {
                    map.putAll(m(xmlPullParser));
                } else if (xmlPullParser.getName().equals(Key.ROTATION)) {
                    fL = l(xmlPullParser);
                } else if (xmlPullParser.getName().matches(d) || xmlPullParser.getName().equals("color")) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().matches(i)) {
                    map2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static LatLngBounds e(Double d2, Double d3, Double d4, Double d5) {
        return new LatLngBounds(new LatLng(d3.doubleValue(), d5.doubleValue()), new LatLng(d2.doubleValue(), d4.doubleValue()));
    }

    private static KmlLineString f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(KmlLineString.GEOMETRY_TYPE)) {
                return new KmlLineString(arrayList);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                arrayList = b(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlMultiGeometry g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals("MultiGeometry")) {
                return new KmlMultiGeometry(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches(a)) {
                arrayList.add(c(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    public static KmlPlacemark h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        int eventType = xmlPullParser.getEventType();
        KmlGeometry kmlGeometryC = null;
        String strNextText = null;
        e eVarE = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Placemark")) {
                return new KmlPlacemark(kmlGeometryC, strNextText, eVarE, map);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(g)) {
                    strNextText = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches(a)) {
                    kmlGeometryC = c(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches(d)) {
                    map.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(f)) {
                    map.putAll(m(xmlPullParser));
                } else if (xmlPullParser.getName().equals(h)) {
                    eVarE = f.e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlPoint i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        LatLng latLngA = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(KmlPoint.GEOMETRY_TYPE)) {
                return new KmlPoint(latLngA);
            }
            if (eventType == 2 && xmlPullParser.getName().equals("coordinates")) {
                latLngA = a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static KmlPolygon j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Boolean boolValueOf = Boolean.FALSE;
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(KmlPolygon.GEOMETRY_TYPE)) {
                return new KmlPolygon(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(e)) {
                    boolValueOf = Boolean.valueOf(xmlPullParser.getName().equals("outerBoundaryIs"));
                } else if (xmlPullParser.getName().equals("coordinates")) {
                    if (boolValueOf.booleanValue()) {
                        arrayList = b(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(b(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static String k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static float l(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    private static HashMap<String, String> m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> map = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String attributeValue = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(f)) {
                return map;
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
