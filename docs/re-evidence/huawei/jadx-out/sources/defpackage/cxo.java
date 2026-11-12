package defpackage;

import com.huawei.featureuserprofile.route.bean.Extensions;
import com.huawei.featureuserprofile.route.hwgpxmodel.Gpx;
import com.huawei.featureuserprofile.route.hwgpxmodel.Route;
import com.huawei.featureuserprofile.route.hwgpxmodel.RoutePoint;
import com.huawei.featureuserprofile.route.hwgpxmodel.Track;
import com.huawei.featureuserprofile.route.hwgpxmodel.TrackPoint;
import com.huawei.featureuserprofile.route.hwgpxmodel.TrackSegment;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.featureuserprofile.route.navigationparser.BaseParser;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.tencent.open.SocialConstants;
import health.compact.a.CommonUtil;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class cxo extends BaseParser<Gpx> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f31473c = null;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    @Override // com.huawei.featureuserprofile.route.navigationparser.BaseParser
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Gpx parse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        byte b2;
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, f31473c, "gpx");
        Gpx gpx = new Gpx();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                int iHashCode = name.hashCode();
                if (iHashCode != 113251) {
                    if (iHashCode != 115117) {
                        if (iHashCode == 117947 && name.equals("wpt")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (name.equals("trk")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (name.equals("rte")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    gpx.addRoute(d(xmlPullParser));
                } else if (b2 == 1) {
                    arrayList.add(h(xmlPullParser));
                } else if (b2 == 2) {
                    gpx.addWpt(f(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "gpx");
        gpx.setTracks(arrayList);
        return gpx;
    }

    private long g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        return super.readTime(xmlPullParser, "time");
    }

    private int e(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = f31473c;
        xmlPullParser.require(2, str2, str);
        int iJ = CommonUtil.j(readText(xmlPullParser));
        xmlPullParser.require(3, str2, str);
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    private Track h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        byte b2;
        Track track = new Track();
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, f31473c, "trk");
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                int iHashCode = name.hashCode();
                if (iHashCode != -1809421292) {
                    if (iHashCode != -865403000) {
                        if (iHashCode == 3575610 && name.equals("type")) {
                            b2 = 2;
                        } else {
                            b2 = -1;
                        }
                    } else if (name.equals("trkseg")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (name.equals("extensions")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    track.setExtensions(e(xmlPullParser));
                } else if (b2 == 1) {
                    arrayList.add(i(xmlPullParser));
                } else if (b2 == 2) {
                    track.setType(readContent(xmlPullParser, "type"));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "trk");
        track.setTrackSegments(arrayList);
        return track;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0079  */
    private Extensions e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Extensions extensions = new Extensions();
        xmlPullParser.require(2, f31473c, "extensions");
        while (true) {
            if (notEndTag(xmlPullParser.next())) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "totalTime":
                            e(xmlPullParser, extensions, "totalTime", "total time error.");
                            break;
                        case "mode":
                            a(xmlPullParser, extensions, Wpt.MODE, "mode error.");
                            break;
                        case "color":
                            a(xmlPullParser, extensions, "color", "color error.");
                            break;
                        case "routeType":
                            a(xmlPullParser, extensions, "routeType", "RouteType error.");
                            break;
                        case "totalDistance":
                            e(xmlPullParser, extensions, BleConstants.TOTAL_DISTANCE, "total distance error.");
                            break;
                        case "cumulativeClimb":
                            e(xmlPullParser, extensions, "cumulativeClimb", "CumulativeClimb error.");
                            break;
                        case "cumulativeDecrease":
                            e(xmlPullParser, extensions, "cumulativeDecrease", "CumulativeDecrease error.");
                            break;
                        default:
                            nextTag(xmlPullParser);
                            break;
                    }
                }
            } else {
                xmlPullParser.require(3, f31473c, "extensions");
                return extensions;
            }
        }
    }

    private void e(XmlPullParser xmlPullParser, Extensions extensions, String str, String str2) throws XmlPullParserException, IOException {
        try {
            extensions.addExtension(str, Double.valueOf(readText(xmlPullParser)));
        } catch (NumberFormatException unused) {
            extensions.addExtension(str, Double.valueOf(0.0d));
            LogUtil.e("GpxFileParser", str2);
        }
    }

    private void a(XmlPullParser xmlPullParser, Extensions extensions, String str, String str2) throws XmlPullParserException, IOException {
        try {
            extensions.addExtension(str, Integer.valueOf(CommonUtil.j(readText(xmlPullParser))));
        } catch (NumberFormatException unused) {
            extensions.addExtension(str, 0);
            LogUtil.e("GpxFileParser", str2);
        }
    }

    private Route d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, f31473c, "rte");
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("rtept")) {
                    arrayList.add(c(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "rte");
        Route route = new Route();
        route.setRoutePoint(arrayList);
        return route;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008d  */
    private Wpt f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        byte b2;
        Wpt wpt = new Wpt();
        String str = f31473c;
        xmlPullParser.require(2, str, "wpt");
        wpt.setLatitude(CommonUtil.a(xmlPullParser.getAttributeValue(str, "lat")));
        wpt.setLongitude(CommonUtil.a(xmlPullParser.getAttributeValue(str, "lon")));
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                switch (name) {
                    case "extensions":
                        b2 = 0;
                        break;
                    case "ele":
                        b2 = 1;
                        break;
                    case "sym":
                        b2 = 2;
                        break;
                    case "desc":
                        b2 = 3;
                        break;
                    case "name":
                        b2 = 4;
                        break;
                    case "time":
                        b2 = 5;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    wpt.setExtensions(e(xmlPullParser));
                } else if (b2 == 1) {
                    wpt.setElevation(a(xmlPullParser));
                } else if (b2 == 2) {
                    wpt.setSym(e(xmlPullParser, "sym"));
                } else if (b2 == 3) {
                    wpt.setDesc(readTextAndChildText(xmlPullParser, SocialConstants.PARAM_APP_DESC));
                } else if (b2 == 4) {
                    wpt.setName(readContent(xmlPullParser, "name"));
                } else if (b2 == 5) {
                    wpt.setTime(g(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "wpt");
        return wpt;
    }

    private RoutePoint c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        RoutePoint routePoint = new RoutePoint();
        String str = f31473c;
        xmlPullParser.require(2, str, "rtept");
        try {
            routePoint.setLatitude(Double.valueOf(xmlPullParser.getAttributeValue(str, "lat")).doubleValue());
        } catch (NumberFormatException unused) {
            routePoint.setLatitude(0.0d);
            LogUtil.e("GpxFileParser", "Latitude error.");
        }
        try {
            routePoint.setLongitude(Double.valueOf(xmlPullParser.getAttributeValue(f31473c, "lon")).doubleValue());
        } catch (NumberFormatException unused2) {
            routePoint.setLongitude(0.0d);
            LogUtil.e("GpxFileParser", "Longitude error.");
        }
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ele")) {
                    routePoint.setElevation(a(xmlPullParser));
                } else if (name.equals("time")) {
                    routePoint.setTime(g(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "rtept");
        return routePoint;
    }

    private TrackSegment i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        ArrayList arrayList = new ArrayList();
        xmlPullParser.require(2, f31473c, "trkseg");
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("trkpt")) {
                    arrayList.add(j(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "trkseg");
        TrackSegment trackSegment = new TrackSegment();
        trackSegment.setTrackPoints(arrayList);
        return trackSegment;
    }

    private TrackPoint j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        TrackPoint trackPoint = new TrackPoint();
        String str = f31473c;
        xmlPullParser.require(2, str, "trkpt");
        try {
            trackPoint.setLatitude(Double.valueOf(xmlPullParser.getAttributeValue(str, "lat")).doubleValue());
        } catch (NumberFormatException unused) {
            trackPoint.setLatitude(0.0d);
            LogUtil.e("GpxFileParser", "Latitude error.");
        }
        try {
            trackPoint.setLongitude(Double.valueOf(xmlPullParser.getAttributeValue(f31473c, "lon")).doubleValue());
        } catch (NumberFormatException unused2) {
            trackPoint.setLongitude(0.0d);
            LogUtil.e("GpxFileParser", "Longitude error.");
        }
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ele")) {
                    trackPoint.setElevation(a(xmlPullParser));
                } else if (name.equals("time")) {
                    trackPoint.setTime(g(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, f31473c, "trkpt");
        return trackPoint;
    }

    private double a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        double dDoubleValue;
        xmlPullParser.require(2, f31473c, "ele");
        try {
            dDoubleValue = Double.valueOf(readText(xmlPullParser)).doubleValue();
        } catch (NumberFormatException unused) {
            LogUtil.e("GpxFileParser", "LongitudeDegrees error.");
            dDoubleValue = 0.0d;
        }
        xmlPullParser.require(3, f31473c, "ele");
        return dDoubleValue;
    }
}
