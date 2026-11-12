package defpackage;

import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwkmlmodel.Data;
import com.huawei.featureuserprofile.route.hwkmlmodel.Document;
import com.huawei.featureuserprofile.route.hwkmlmodel.ExtendedData;
import com.huawei.featureuserprofile.route.hwkmlmodel.FolderFirst;
import com.huawei.featureuserprofile.route.hwkmlmodel.FolderSec;
import com.huawei.featureuserprofile.route.hwkmlmodel.GxTrack;
import com.huawei.featureuserprofile.route.hwkmlmodel.Kml;
import com.huawei.featureuserprofile.route.hwkmlmodel.LineString;
import com.huawei.featureuserprofile.route.hwkmlmodel.Placemark;
import com.huawei.featureuserprofile.route.hwkmlmodel.Point;
import com.huawei.featureuserprofile.route.hwkmlmodel.TimeSpan;
import com.huawei.featureuserprofile.route.navigationparser.BaseParser;
import com.huawei.featureuserprofile.route.navigationparser.NavigationFileParser;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class cxp extends BaseParser<Kml> {
    private static final String e = null;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.featureuserprofile.route.navigationparser.BaseParser
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Kml parse(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, NavigationFileParser.KML);
        Kml kml = new Kml();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("Document")) {
                    kml.setDocument(d(xmlPullParser));
                } else if (name.equals("Folder")) {
                    kml.setFolderFirst(b(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, NavigationFileParser.KML);
        return kml;
    }

    private Document d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "Document");
        Document document = new Document();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("Folder")) {
                    document.addFolderSec(f(xmlPullParser));
                } else if (name.equals("Placemark")) {
                    FolderSec folderSec = new FolderSec();
                    ArrayList arrayList = new ArrayList();
                    folderSec.setPlaceMark(arrayList);
                    arrayList.add(g(xmlPullParser));
                    document.addFolderSec(folderSec);
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Document");
        return document;
    }

    private FolderFirst b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "Folder");
        FolderFirst folderFirst = new FolderFirst();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("ExtendedData")) {
                    folderFirst.setExtendedData(a(xmlPullParser));
                } else if (name.equals("Folder")) {
                    folderFirst.setFolderSec(f(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Folder");
        return folderFirst;
    }

    private ExtendedData a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, e, "ExtendedData");
        ExtendedData extendedData = new ExtendedData();
        ArrayList arrayList = new ArrayList();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("Data")) {
                    arrayList.add(e(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "ExtendedData");
        extendedData.setData(arrayList);
        return extendedData;
    }

    private Data e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String str = e;
        xmlPullParser.require(2, str, "Data");
        Data data = new Data();
        data.setName(xmlPullParser.getAttributeValue(str, "name"));
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("value")) {
                    try {
                        data.setValue(Double.valueOf(readText(xmlPullParser)));
                    } catch (NumberFormatException unused) {
                        data.setValue(Double.valueOf(0.0d));
                        LogUtil.e("KmlFileParser", "value error.");
                    }
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Data");
        return data;
    }

    private FolderSec f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "Folder");
        FolderSec folderSec = new FolderSec();
        ArrayList arrayList = new ArrayList();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("Placemark")) {
                    arrayList.add(g(xmlPullParser));
                } else if (name.equals("Folder")) {
                    a(xmlPullParser, arrayList);
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Folder");
        folderSec.setPlaceMark(arrayList);
        return folderSec;
    }

    private void a(XmlPullParser xmlPullParser, List<Placemark> list) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "Folder");
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("Placemark")) {
                    list.add(g(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Folder");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    private Placemark g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "Placemark");
        Placemark placemark = new Placemark();
        while (true) {
            if (notEndTag(xmlPullParser.next())) {
                if (xmlPullParser.getEventType() == 2) {
                    String name = xmlPullParser.getName();
                    name.hashCode();
                    switch (name) {
                        case "TimeSpan":
                            placemark.setTimeSpan(k(xmlPullParser));
                            break;
                        case "description":
                            placemark.setDescription(readTextAndChildText(xmlPullParser, "description"));
                            break;
                        case "name":
                            placemark.setLapName(readContent(xmlPullParser, "name"));
                            break;
                        case "Point":
                            placemark.setPoint(n(xmlPullParser));
                            break;
                        case "Track":
                            placemark.setGxTrack(j(xmlPullParser));
                            break;
                        case "MultiGeometry":
                            placemark.setLineString(h(xmlPullParser));
                            break;
                        case "ExtendedData":
                            placemark.setExtendedData(a(xmlPullParser));
                            break;
                        case "LineString":
                            placemark.setLineString(i(xmlPullParser));
                            break;
                        default:
                            nextTag(xmlPullParser);
                            break;
                    }
                }
            } else {
                xmlPullParser.require(3, e, "Placemark");
                return placemark;
            }
        }
    }

    private LineString h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, e, "MultiGeometry");
        LineString lineString = new LineString();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals("LineString")) {
                    lineString = i(xmlPullParser);
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "MultiGeometry");
        return lineString;
    }

    private GxTrack j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "Track");
        GxTrack gxTrack = new GxTrack();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.hashCode();
                if (name.equals(RemoteMessageConst.Notification.WHEN)) {
                    gxTrack.addWhenList(super.readTime(xmlPullParser, RemoteMessageConst.Notification.WHEN));
                } else if (name.equals("coord")) {
                    gxTrack.addGxCoordinates(readText(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Track");
        return gxTrack;
    }

    private LineString i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, e, "LineString");
        LineString lineString = new LineString();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("coordinates")) {
                    lineString.setCoordinates(readText(xmlPullParser));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "LineString");
        return lineString;
    }

    private TimeSpan k(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException, ParseException {
        xmlPullParser.require(2, e, "TimeSpan");
        TimeSpan timeSpan = new TimeSpan();
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("begin")) {
                    timeSpan.setBegin(super.readTime(xmlPullParser, "begin"));
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "TimeSpan");
        return timeSpan;
    }

    private Point n(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, e, "Point");
        Point.Builder builder = new Point.Builder();
        String text = "";
        while (notEndTag(xmlPullParser.next())) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("coordinates")) {
                    text = readText(xmlPullParser);
                } else {
                    nextTag(xmlPullParser);
                }
            }
        }
        xmlPullParser.require(3, e, "Point");
        String[] strArrSplit = text.split(",");
        if (strArrSplit.length <= 1 || (strArrSplit.length == 2 && (TextUtils.isEmpty(strArrSplit[0]) || TextUtils.isEmpty(strArrSplit[1])))) {
            LogUtil.j("KmlFileParser", "longitude or latitude of point is missing");
            return builder.build();
        }
        try {
            builder.setLon(Double.parseDouble(strArrSplit[0]));
        } catch (NumberFormatException unused) {
            LogUtil.e("KmlFileParser", "Lon error.");
        }
        try {
            builder.setLat(Double.parseDouble(strArrSplit[1]));
        } catch (NumberFormatException unused2) {
            LogUtil.e("KmlFileParser", "Lat error.");
        }
        if (strArrSplit.length > 2) {
            try {
                builder.setEle(Double.parseDouble(strArrSplit[2]));
            } catch (NumberFormatException unused3) {
                LogUtil.e("KmlFileParser", "Ele error.");
            }
        }
        return builder.build();
    }
}
