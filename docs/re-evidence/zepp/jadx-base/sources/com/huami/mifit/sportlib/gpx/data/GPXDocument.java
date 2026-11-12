package com.huami.mifit.sportlib.gpx.data;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class GPXDocument extends GPXBaseEntity {
    private static final String d = "<?xml version='1.0' encoding='UTF-8' standalone='yes' ?>";
    private static final String e = "http://www.topografix.com/GPX/1/1";
    private static String f = "Amazfit App";
    private static String g = "4.3.0";
    private static final String h = "http://www.w3.org/2001/XMLSchema-instance";
    private static final String i = "http://www.topografix.com/GPX/1/1 http://www.topografix.com/GPX/1/1/gpx.xsd";
    private static final String j = "http://www.garmin.com/xmlschemas/TrackPointExtension/v1";
    private static final String k = "http://www.garmin.com/xmlschemas/GpxExtensions/v3";
    private static final String l = "http://www.cluetrust.com/XML/GPXDATA/1/0";
    private ArrayList<GPXWayPoint> a;
    private ArrayList<GPXTrack> b;
    private ArrayList<GPXRoute> c;

    public static class XML {
        public static final String ATTR_CREATOR = "creator";
        public static final String ATTR_VERSION = "version";
        public static final String ATTR_XMLNS = "xmlns";
        public static final String ATTR_XMLNS_NS1 = "xmlns:ns1";
        public static final String ATTR_XMLNS_NS2 = "xmlns:ns2";
        public static final String ATTR_XMLNS_NS3 = "xmlns:ns3";
        public static final String ATTR_XMLNS_XSI = "xmlns:xsi";
        public static final String ATTR_XSI_SCHEMALOCATION = "xsi:schemaLocation";
        public static final String TAG_GPX = "gpx";
    }

    public GPXDocument(ArrayList<GPXWayPoint> arrayList, ArrayList<GPXTrack> arrayList2, ArrayList<GPXRoute> arrayList3) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public ArrayList<GPXRoute> getRoutes() {
        return this.c;
    }

    public ArrayList<GPXTrack> getTracks() {
        return this.b;
    }

    public ArrayList<GPXWayPoint> getWayPoints() {
        return this.a;
    }

    public void toGpx(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add(XML.ATTR_XSI_SCHEMALOCATION);
        arrayList.add("xmlns");
        arrayList.add(XML.ATTR_XMLNS_XSI);
        arrayList.add(XML.ATTR_XMLNS_NS3);
        arrayList.add(XML.ATTR_XMLNS_NS2);
        arrayList.add(XML.ATTR_XMLNS_NS1);
        arrayList.add(XML.ATTR_CREATOR);
        arrayList.add("version");
        arrayList2.add(i);
        arrayList2.add(e);
        arrayList2.add(h);
        arrayList2.add(j);
        arrayList2.add(k);
        arrayList2.add(l);
        arrayList2.add(f);
        arrayList2.add(g);
        headXml(d, printStream);
        openXmlTag(XML.TAG_GPX, printStream, arrayList, arrayList2, true, 0);
        ArrayList<GPXWayPoint> arrayList3 = this.a;
        if (arrayList3 != null) {
            Iterator<GPXWayPoint> it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                it2.next().toGPX(printStream);
            }
        }
        ArrayList<GPXTrack> arrayList4 = this.b;
        if (arrayList4 != null) {
            Iterator<GPXTrack> it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                it3.next().toGPX(printStream);
            }
        }
        ArrayList<GPXRoute> arrayList5 = this.c;
        if (arrayList5 != null) {
            Iterator<GPXRoute> it4 = arrayList5.iterator();
            while (it4.hasNext()) {
                it4.next().toGPX(printStream);
            }
        }
        closeXmlTag(XML.TAG_GPX, printStream, true, 0);
    }

    public GPXDocument(ArrayList<GPXWayPoint> arrayList, ArrayList<GPXTrack> arrayList2, ArrayList<GPXRoute> arrayList3, String str, String str2) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        f = str;
        g = str2;
    }
}
