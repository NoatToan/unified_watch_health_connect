package com.huami.mifit.sportlib.gpx.xml;

import com.huami.mifit.sportlib.gpx.data.GPXBaseEntity;
import com.huami.mifit.sportlib.gpx.data.GPXBasePoint;
import com.huami.mifit.sportlib.gpx.data.GPXRoute;
import com.huami.mifit.sportlib.gpx.data.GPXRoutePoint;
import com.huami.mifit.sportlib.gpx.data.GPXSegment;
import com.huami.mifit.sportlib.gpx.data.GPXTrack;
import com.huami.mifit.sportlib.gpx.data.GPXTrackPoint;
import com.huami.mifit.sportlib.gpx.data.GPXWayPoint;
import java.util.Date;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* JADX INFO: loaded from: classes11.dex */
public class GpxParserHandler extends DefaultHandler {
    private GpxParserProgressListener a;
    private GPXTrack b = null;
    private GPXRoute c = null;
    private GPXSegment d = null;
    private GPXTrackPoint e = null;
    private GPXRoutePoint f = null;
    private GPXWayPoint g = null;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    private StringBuffer n = null;
    private Locator o = null;
    private int p = -1;
    private int q = -1;

    public interface GpxParserProgressListener {
        void onGpxNewRouteParsed(int i, GPXRoute gPXRoute);

        void onGpxNewRoutePointParsed(int i, GPXRoutePoint gPXRoutePoint);

        void onGpxNewSegmentParsed(int i, GPXSegment gPXSegment);

        void onGpxNewTrackParsed(int i, GPXTrack gPXTrack);

        void onGpxNewTrackPointParsed(int i, GPXTrackPoint gPXTrackPoint);

        void onGpxNewWayPointParsed(int i, GPXWayPoint gPXWayPoint);
    }

    public GpxParserHandler(GpxParserProgressListener gpxParserProgressListener) {
        this.a = null;
        this.a = gpxParserProgressListener;
    }

    private void a() throws SAXException {
        if (this.b != null) {
            g("Route inside track");
        }
        if (this.c != null) {
            g("Nested Route");
        }
        if (this.g != null) {
            g("Route inside waypoint");
        }
        if (this.d != null) {
            g("Route inside segment");
        }
        if (this.e != null) {
            g("Route inside trackpoint");
        }
        this.c = new GPXRoute();
    }

    private void b(Attributes attributes) throws SAXException {
        if (this.b != null) {
            g("Routepoint inside Track");
        }
        if (this.g != null) {
            g("Routepoint inside Waypoint");
        }
        if (this.c == null) {
            g("Routepoint outside route");
        }
        if (this.e != null) {
            g("Trackpoint inside Route");
        }
        try {
            String value = attributes.getValue(GPXBasePoint.XML.ATTR_LAT);
            if (value == null || value.length() == 0) {
                g("Latitude not present for Trackpoint");
            }
            float f = Float.parseFloat(value);
            String value2 = attributes.getValue(GPXBasePoint.XML.ATTR_LON);
            if (value2 == null || value2.length() == 0) {
                g("Longitude not present for Trackpoint");
            }
            this.f = new GPXRoutePoint(f, Float.parseFloat(value2));
        } catch (NumberFormatException e) {
            g(e.getMessage());
        }
    }

    private void c() throws SAXException {
        if (this.b != null) {
            g("Nested Track");
        }
        if (this.c != null) {
            g("Track inside route");
        }
        if (this.g != null) {
            g("Track inside waypoint");
        }
        if (this.d != null) {
            g("Track inside segment");
        }
        if (this.e != null) {
            g("Track inside trackpoint");
        }
        this.b = new GPXTrack();
    }

    private void d(Attributes attributes) throws SAXException {
        if (this.c != null) {
            g("Trackpoint inside route");
        }
        if (this.g != null) {
            g("Trackpoint inside waypoint");
        }
        if (this.d == null) {
            g("Trackpoint outside segment");
        }
        if (this.e != null) {
            g("Nested Trackpoint");
        }
        try {
            String value = attributes.getValue(GPXBasePoint.XML.ATTR_LAT);
            if (value == null || value.length() == 0) {
                g("Latitude not present for Trackpoint");
            }
            float f = Float.parseFloat(value);
            String value2 = attributes.getValue(GPXBasePoint.XML.ATTR_LON);
            if (value2 == null || value2.length() == 0) {
                g("Longitude not present for Trackpoint");
            }
            this.e = new GPXTrackPoint(f, Float.parseFloat(value2));
        } catch (NumberFormatException e) {
            g(e.getMessage());
        }
    }

    private void e() throws SAXException {
        if (this.c != null) {
            g("Segment inside route");
        }
        if (this.g != null) {
            g("Segment inside waypoint");
        }
        if (this.b == null) {
            g("Segment outside track");
        }
        if (this.e != null) {
            g("Segment inside trackpoint");
        }
        if (this.d != null) {
            g("Nested Segment");
        }
        this.d = new GPXSegment();
    }

    private void f(Attributes attributes) throws SAXException {
        if (this.c != null) {
            g("Waypoint inside Route");
        }
        if (this.d != null) {
            g("Waypoint inside of segment");
        }
        if (this.b != null) {
            g("Waypoint inside of track");
        }
        if (this.e != null) {
            g("Waypoint inside of trackpoint");
        }
        if (this.g != null) {
            g("Nested Waypoint");
        }
        try {
            String value = attributes.getValue(GPXBasePoint.XML.ATTR_LAT);
            if (value == null || value.length() == 0) {
                g("Latitude not present for Waypoint");
            }
            float f = Float.parseFloat(value);
            String value2 = attributes.getValue(GPXBasePoint.XML.ATTR_LON);
            if (value2 == null || value2.length() == 0) {
                g("Longitude not present for Waypoint");
            }
            this.g = new GPXWayPoint(f, Float.parseFloat(value2));
        } catch (NumberFormatException e) {
            g(e.getMessage());
        }
    }

    private void g(String str) throws SAXException {
        Locator locator = this.o;
        if (locator != null) {
            this.p = locator.getLineNumber();
            this.q = this.o.getColumnNumber();
        }
        throw new SAXException("Gpx Parser says: '" + str + "' at line: " + this.p + " column: " + this.q + "'");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) throws SAXException {
        StringBuffer stringBuffer = this.n;
        if (stringBuffer != null) {
            stringBuffer.append(cArr, i, i2 + i);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) throws SAXException {
        Date timestampIntoDate;
        if (str2.equalsIgnoreCase(GPXWayPoint.XML.TAG_WPT)) {
            GpxParserProgressListener gpxParserProgressListener = this.a;
            int i = this.m + 1;
            this.m = i;
            gpxParserProgressListener.onGpxNewWayPointParsed(i, this.g);
            this.g = null;
        } else if (str2.equalsIgnoreCase(GPXTrack.XML.TAG_TRK)) {
            GpxParserProgressListener gpxParserProgressListener2 = this.a;
            int i2 = this.h + 1;
            this.h = i2;
            gpxParserProgressListener2.onGpxNewTrackParsed(i2, this.b);
            this.b = null;
            this.j = 0;
        } else if (str2.equalsIgnoreCase(GPXRoute.XML.TAG_RTE)) {
            GpxParserProgressListener gpxParserProgressListener3 = this.a;
            int i3 = this.i + 1;
            this.i = i3;
            gpxParserProgressListener3.onGpxNewRouteParsed(i3, this.c);
            this.c = null;
        } else if (str2.equalsIgnoreCase(GPXSegment.XML.TAG_TRKSEG)) {
            if (this.b == null) {
                g("end of segment outside track");
            }
            this.b.addSegment(this.d);
            GpxParserProgressListener gpxParserProgressListener4 = this.a;
            int i4 = this.j + 1;
            this.j = i4;
            gpxParserProgressListener4.onGpxNewSegmentParsed(i4, this.d);
            this.d = null;
        } else if (str2.equalsIgnoreCase(GPXTrackPoint.XML.TAG_TRKPT)) {
            if (this.d == null) {
                g("end of trackpoint outside of segment");
            }
            this.d.addPoint(this.e);
            GpxParserProgressListener gpxParserProgressListener5 = this.a;
            int i5 = this.k + 1;
            this.k = i5;
            gpxParserProgressListener5.onGpxNewTrackPointParsed(i5, this.e);
            this.e = null;
        } else if (str2.equalsIgnoreCase(GPXRoutePoint.XML.TAG_RTEPT)) {
            if (this.c == null) {
                g("end of routepoint outside of route");
            }
            this.c.addPoint(this.f);
            GpxParserProgressListener gpxParserProgressListener6 = this.a;
            int i6 = this.l + 1;
            this.l = i6;
            gpxParserProgressListener6.onGpxNewRoutePointParsed(i6, this.f);
            this.f = null;
        } else if (str2.equalsIgnoreCase("desc")) {
            GPXTrackPoint gPXTrackPoint = this.e;
            if (gPXTrackPoint != null) {
                gPXTrackPoint.setDescription(this.n.toString());
            } else {
                GPXWayPoint gPXWayPoint = this.g;
                if (gPXWayPoint != null) {
                    gPXWayPoint.setDescription(this.n.toString());
                } else {
                    GPXRoutePoint gPXRoutePoint = this.f;
                    if (gPXRoutePoint != null) {
                        gPXRoutePoint.setDescription(this.n.toString());
                    } else {
                        GPXTrack gPXTrack = this.b;
                        if (gPXTrack != null) {
                            gPXTrack.setUserDescription(this.n.toString());
                        } else {
                            GPXRoute gPXRoute = this.c;
                            if (gPXRoute != null) {
                                gPXRoute.setUserDescription(this.n.toString());
                            }
                        }
                    }
                }
            }
        } else {
            float f = 0.0f;
            if (str2.equalsIgnoreCase(GPXBasePoint.XML.TAG_ELE)) {
                if (this.n.toString().length() > 0) {
                    try {
                        f = Float.parseFloat(this.n.toString());
                    } catch (NumberFormatException unused) {
                        g("wrong float number format");
                    }
                    GPXTrackPoint gPXTrackPoint2 = this.e;
                    if (gPXTrackPoint2 != null) {
                        gPXTrackPoint2.setElevation(f);
                    } else {
                        GPXWayPoint gPXWayPoint2 = this.g;
                        if (gPXWayPoint2 != null) {
                            gPXWayPoint2.setElevation(f);
                        } else {
                            GPXRoutePoint gPXRoutePoint2 = this.f;
                            if (gPXRoutePoint2 != null) {
                                gPXRoutePoint2.setElevation(f);
                            }
                        }
                    }
                }
            } else if (str2.equalsIgnoreCase(GPXBasePoint.XML.TAG_HDOP)) {
                if (this.n.toString().length() > 0) {
                    try {
                        f = Float.parseFloat(this.n.toString());
                    } catch (NumberFormatException unused2) {
                        g("wrong float number format");
                    }
                    GPXTrackPoint gPXTrackPoint3 = this.e;
                    if (gPXTrackPoint3 != null) {
                        gPXTrackPoint3.setHDop(Float.valueOf(f));
                    } else {
                        GPXWayPoint gPXWayPoint3 = this.g;
                        if (gPXWayPoint3 != null) {
                            gPXWayPoint3.setHDop(Float.valueOf(f));
                        } else {
                            GPXRoutePoint gPXRoutePoint3 = this.f;
                            if (gPXRoutePoint3 != null) {
                                gPXRoutePoint3.setHDop(Float.valueOf(f));
                            }
                        }
                    }
                }
            } else if (str2.equalsIgnoreCase(GPXBasePoint.XML.TAG_VDOP)) {
                if (this.n.toString().length() > 0) {
                    try {
                        f = Float.parseFloat(this.n.toString());
                    } catch (NumberFormatException unused3) {
                        g("wrong float number format");
                    }
                    GPXTrackPoint gPXTrackPoint4 = this.e;
                    if (gPXTrackPoint4 != null) {
                        gPXTrackPoint4.setVDop(Float.valueOf(f));
                    } else {
                        GPXWayPoint gPXWayPoint4 = this.g;
                        if (gPXWayPoint4 != null) {
                            gPXWayPoint4.setVDop(Float.valueOf(f));
                        } else {
                            GPXRoutePoint gPXRoutePoint4 = this.f;
                            if (gPXRoutePoint4 != null) {
                                gPXRoutePoint4.setVDop(Float.valueOf(f));
                            }
                        }
                    }
                }
            } else if (str2.equalsIgnoreCase("name")) {
                GPXTrackPoint gPXTrackPoint5 = this.e;
                if (gPXTrackPoint5 != null) {
                    gPXTrackPoint5.setName(this.n.toString());
                } else {
                    GPXWayPoint gPXWayPoint5 = this.g;
                    if (gPXWayPoint5 != null) {
                        gPXWayPoint5.setName(this.n.toString());
                    } else {
                        GPXRoutePoint gPXRoutePoint5 = this.f;
                        if (gPXRoutePoint5 != null) {
                            gPXRoutePoint5.setName(this.n.toString());
                        } else {
                            GPXTrack gPXTrack2 = this.b;
                            if (gPXTrack2 != null) {
                                gPXTrack2.setName(this.n.toString());
                            } else {
                                GPXRoute gPXRoute2 = this.c;
                                if (gPXRoute2 != null) {
                                    gPXRoute2.setName(this.n.toString());
                                }
                            }
                        }
                    }
                }
            } else if (str2.equalsIgnoreCase("time")) {
                String string = this.n.toString();
                if (string.length() > 0) {
                    timestampIntoDate = GPXBaseEntity.parseTimestampIntoDate(string);
                    if (timestampIntoDate == null) {
                        g("Wrong timestamp format, correct format is \"yyyy-MM-dd'T'HH:mm:ss'Z'\"");
                    }
                } else {
                    timestampIntoDate = null;
                }
                GPXTrackPoint gPXTrackPoint6 = this.e;
                if (gPXTrackPoint6 != null) {
                    gPXTrackPoint6.setTimeStamp(timestampIntoDate);
                } else {
                    GPXWayPoint gPXWayPoint6 = this.g;
                    if (gPXWayPoint6 != null) {
                        gPXWayPoint6.setTimeStamp(timestampIntoDate);
                    } else {
                        GPXRoutePoint gPXRoutePoint6 = this.f;
                        if (gPXRoutePoint6 != null) {
                            gPXRoutePoint6.setTimeStamp(timestampIntoDate);
                        }
                    }
                }
            } else if (str2.equalsIgnoreCase("type")) {
                GPXTrackPoint gPXTrackPoint7 = this.e;
                if (gPXTrackPoint7 != null) {
                    gPXTrackPoint7.setType(this.n.toString());
                } else {
                    GPXWayPoint gPXWayPoint7 = this.g;
                    if (gPXWayPoint7 != null) {
                        gPXWayPoint7.setType(this.n.toString());
                    } else {
                        GPXRoutePoint gPXRoutePoint7 = this.f;
                        if (gPXRoutePoint7 != null) {
                            gPXRoutePoint7.setType(this.n.toString());
                        } else {
                            GPXTrack gPXTrack3 = this.b;
                            if (gPXTrack3 != null) {
                                gPXTrack3.setType(this.n.toString());
                            } else {
                                GPXRoute gPXRoute3 = this.c;
                                if (gPXRoute3 != null) {
                                    gPXRoute3.setType(this.n.toString());
                                }
                            }
                        }
                    }
                }
            } else if (str2.equalsIgnoreCase("cmt")) {
                GPXTrack gPXTrack4 = this.b;
                if (gPXTrack4 != null) {
                    gPXTrack4.setGpsComment(this.n.toString());
                } else {
                    GPXRoute gPXRoute4 = this.c;
                    if (gPXRoute4 != null) {
                        gPXRoute4.setGpsComment(this.n.toString());
                    }
                }
            }
        }
        this.n = null;
    }

    public int getErrorColumn() {
        return this.q;
    }

    public int getErrorLine() {
        return this.p;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.o = locator;
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
        this.n = new StringBuffer();
        if (str2.equals(GPXWayPoint.XML.TAG_WPT)) {
            f(attributes);
            return;
        }
        if (str2.equals(GPXTrack.XML.TAG_TRK)) {
            c();
            return;
        }
        if (str2.equals(GPXRoute.XML.TAG_RTE)) {
            a();
            return;
        }
        if (str2.equals(GPXSegment.XML.TAG_TRKSEG)) {
            e();
        } else if (str2.equals(GPXTrackPoint.XML.TAG_TRKPT)) {
            d(attributes);
        } else if (str2.equals(GPXRoutePoint.XML.TAG_RTEPT)) {
            b(attributes);
        }
    }
}
