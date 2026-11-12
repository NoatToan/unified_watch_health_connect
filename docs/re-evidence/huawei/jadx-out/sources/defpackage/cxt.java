package defpackage;

import com.huawei.featureuserprofile.route.bean.Extensions;
import com.huawei.featureuserprofile.route.hwtcxmodel.Activities;
import com.huawei.featureuserprofile.route.hwtcxmodel.Activity;
import com.huawei.featureuserprofile.route.hwtcxmodel.Lap;
import com.huawei.featureuserprofile.route.hwtcxmodel.Position;
import com.huawei.featureuserprofile.route.hwtcxmodel.Tcx;
import com.huawei.featureuserprofile.route.hwtcxmodel.Track;
import com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint;
import com.huawei.featureuserprofile.route.navigationparser.BaseParser;
import com.huawei.health.marketing.datatype.SingleDailyMomentContent;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class cxt extends BaseParser<Tcx> {
    private static final String d = null;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.featureuserprofile.route.navigationparser.BaseParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Tcx parse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, d, "TrainingCenterDatabase");
        Tcx tcx = new Tcx();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("Activities")) {
                    tcx.setActivities(a(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, "TrainingCenterDatabase");
        return tcx;
    }

    private Activities a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, d, "Activities");
        Activities activities = new Activities();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals(SingleDailyMomentContent.ACTIVITY_TYPE)) {
                    activities.setActivity(d(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, "Activities");
        return activities;
    }

    private Activity d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        String str = d;
        xmlPullParser.require(2, str, SingleDailyMomentContent.ACTIVITY_TYPE);
        ArrayList arrayList = new ArrayList();
        Activity activity = new Activity();
        activity.setSport(xmlPullParser.getAttributeValue(str, "Sport"));
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("Lap")) {
                    arrayList.add(b(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, SingleDailyMomentContent.ACTIVITY_TYPE);
        activity.setLap(arrayList);
        return activity;
    }

    private Lap b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, d, "Lap");
        Lap.Builder builder = new Lap.Builder();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                c(xmlPullParser, builder);
            }
        }
        xmlPullParser.require(3, d, "Lap");
        return builder.build();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    private void c(XmlPullParser xmlPullParser, Lap.Builder builder) throws XmlPullParserException, IOException, ParseException {
        byte b2;
        String name = xmlPullParser.getName();
        name.hashCode();
        switch (name) {
            case "DistanceMeters":
                b2 = 0;
                break;
            case "CumulativeDecrease":
                b2 = 1;
                break;
            case "TotalTimeSeconds":
                b2 = 2;
                break;
            case "Track":
                b2 = 3;
                break;
            case "Extensions":
                b2 = 4;
                break;
            case "CumulativeClimb":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            try {
                builder.setDistanceMeters(Double.parseDouble(readText(xmlPullParser)));
                return;
            } catch (NumberFormatException unused) {
                LogUtil.e("TcxFileParser", "total distance error.");
                return;
            }
        }
        if (b2 == 1) {
            try {
                builder.setCumulativeDecrease(Double.parseDouble(readText(xmlPullParser)));
                return;
            } catch (NumberFormatException unused2) {
                LogUtil.e("TcxFileParser", "CumulativeDecrease error.");
                return;
            }
        }
        if (b2 == 2) {
            try {
                builder.setTotalTimeSeconds(Double.parseDouble(readText(xmlPullParser)));
            } catch (NumberFormatException unused3) {
                LogUtil.e("TcxFileParser", "total time error.");
            }
        } else {
            if (b2 == 3) {
                builder.setTrack(f(xmlPullParser));
                return;
            }
            if (b2 == 4) {
                builder.setExtensions(e(xmlPullParser));
            } else {
                if (b2 != 5) {
                    nextTag(xmlPullParser);
                    return;
                }
                try {
                    builder.setCumulativeClimb(Double.parseDouble(readText(xmlPullParser)));
                } catch (NumberFormatException unused4) {
                    LogUtil.e("TcxFileParser", "CumulativeClimb error.");
                }
            }
        }
    }

    private Track f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, d, "Track");
        ArrayList arrayList = new ArrayList();
        Track track = new Track();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("Trackpoint")) {
                    arrayList.add(h(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, "Track");
        track.setTrackPoint(arrayList);
        return track;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005b  */
    private TrackPoint h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        byte b2;
        xmlPullParser.require(2, d, "Trackpoint");
        TrackPoint trackPoint = new TrackPoint();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                switch (name) {
                    case "AltitudeMeters":
                        b2 = 0;
                        break;
                    case "Time":
                        b2 = 1;
                        break;
                    case "Extensions":
                        b2 = 2;
                        break;
                    case "Position":
                        b2 = 3;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    try {
                        trackPoint.setAltitudeMeters(Double.valueOf(readText(xmlPullParser)).doubleValue());
                    } catch (NumberFormatException unused) {
                        trackPoint.setAltitudeMeters(0.0d);
                        LogUtil.e("TcxFileParser", "AltitudeMeters error.");
                    }
                } else if (b2 == 1) {
                    trackPoint.setTime(i(xmlPullParser));
                } else if (b2 == 2) {
                    trackPoint.setExtensions(e(xmlPullParser));
                } else if (b2 == 3) {
                    trackPoint.setPosition(g(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, "Trackpoint");
        return trackPoint;
    }

    private Position g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, d, "Position");
        Position position = new Position();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("LongitudeDegrees")) {
                    try {
                        position.setLongitudeDegrees(Double.valueOf(readText(xmlPullParser)).doubleValue());
                    } catch (NumberFormatException unused) {
                        position.setLongitudeDegrees(Double.valueOf(readText(xmlPullParser)).doubleValue());
                        LogUtil.e("TcxFileParser", "LongitudeDegrees error.");
                    }
                } else if (name.equals("LatitudeDegrees")) {
                    try {
                        position.setLatitudeDegrees(Double.valueOf(readText(xmlPullParser)).doubleValue());
                    } catch (NumberFormatException unused2) {
                        position.setLatitudeDegrees(Double.valueOf(readText(xmlPullParser)).doubleValue());
                        LogUtil.e("TcxFileParser", "LatitudeDegrees error.");
                    }
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, "Position");
        return position;
    }

    private long i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        return super.readTime(xmlPullParser, "Time");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    private Extensions e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        byte b2;
        xmlPullParser.require(2, d, "Extensions");
        Extensions extensions = new Extensions();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                switch (name) {
                    case "RouteType":
                        b2 = 0;
                        break;
                    case "PointColor":
                        b2 = 1;
                        break;
                    case "PointIcon":
                        b2 = 2;
                        break;
                    case "PointMode":
                        b2 = 3;
                        break;
                    case "PointName":
                        b2 = 4;
                        break;
                    case "PointDescription":
                        b2 = 5;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 == 0) {
                    extensions.addExtension(Lap.ROUTE_TYPE, Integer.valueOf(CommonUtil.j(readText(xmlPullParser))));
                } else if (b2 == 1) {
                    extensions.addExtension("PointColor", Integer.valueOf(CommonUtil.j(readText(xmlPullParser))));
                } else if (b2 == 2) {
                    extensions.addExtension("PointIcon", Integer.valueOf(CommonUtil.j(readText(xmlPullParser))));
                } else if (b2 == 3) {
                    extensions.addExtension("PointMode", Integer.valueOf(CommonUtil.j(readText(xmlPullParser))));
                } else if (b2 == 4) {
                    extensions.addExtension(TrackPoint.NAME, readText(xmlPullParser));
                } else if (b2 == 5) {
                    extensions.addExtension(TrackPoint.DESC, readTextAndChildText(xmlPullParser, TrackPoint.DESC));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, d, "Extensions");
        return extensions;
    }
}
