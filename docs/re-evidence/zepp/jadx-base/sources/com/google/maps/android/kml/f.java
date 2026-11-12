package com.google.maps.android.kml;

import com.huami.watch.ota.UpdateUtils;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class f {
    private static final String a = "styleUrl";
    private static final String b = "heading";
    private static final String c = "Icon";
    private static final String d = "scale";
    private static final String e = "hotSpot";
    private static final String f = "color";
    private static final String g = "colorMode";
    private static final String h = "key";
    private static final String i = "normal";
    private static final String j = "width";
    private static final String k = "outline";
    private static final String l = "fill";

    private static void a(XmlPullParser xmlPullParser, e eVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                eVar.B(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void b(XmlPullParser xmlPullParser, e eVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(b)) {
                    eVar.w(Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(c)) {
                    h(xmlPullParser, eVar);
                } else if (xmlPullParser.getName().equals(e)) {
                    g(xmlPullParser, eVar);
                } else if (xmlPullParser.getName().equals("scale")) {
                    eVar.z(Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("color")) {
                    eVar.D(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(g)) {
                    eVar.y(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void c(XmlPullParser xmlPullParser, e eVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    eVar.F(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("width")) {
                    eVar.I(Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(g)) {
                    eVar.C(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void d(XmlPullParser xmlPullParser, e eVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    eVar.v(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(k)) {
                    eVar.E(KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(l)) {
                    eVar.u(KmlBoolean.parseBoolean(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals(g)) {
                    eVar.G(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static e e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        e eVar = new e();
        i(xmlPullParser.getAttributeValue(null, "id"), eVar);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return eVar;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    b(xmlPullParser, eVar);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    c(xmlPullParser, eVar);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    d(xmlPullParser, eVar);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    a(xmlPullParser, eVar);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static HashMap<String, String> f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> map = new HashMap<>();
        Boolean bool = Boolean.FALSE;
        String str = UpdateUtils.CMD_FILTER + xmlPullParser.getAttributeValue(null, "id");
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("key") && xmlPullParser.nextText().equals("normal")) {
                    bool = Boolean.TRUE;
                } else if (xmlPullParser.getName().equals(a) && bool.booleanValue()) {
                    map.put(str, xmlPullParser.nextText());
                    bool = Boolean.FALSE;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void g(XmlPullParser xmlPullParser, e eVar) {
        Float fValueOf = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")));
        Float fValueOf2 = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")));
        eVar.x(fValueOf.floatValue(), fValueOf2.floatValue(), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
    }

    private static void h(XmlPullParser xmlPullParser, e eVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(c)) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                eVar.A(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void i(String str, e eVar) {
        if (str != null) {
            eVar.H(UpdateUtils.CMD_FILTER + str);
        }
    }
}
