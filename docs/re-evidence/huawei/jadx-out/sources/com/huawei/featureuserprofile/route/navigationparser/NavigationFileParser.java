package com.huawei.featureuserprofile.route.navigationparser;

import com.google.android.gms.common.util.CollectionUtils;
import com.huawei.featureuserprofile.route.bean.Extensions;
import com.huawei.featureuserprofile.route.hwgpxmodel.Gpx;
import com.huawei.featureuserprofile.route.hwgpxmodel.Route;
import com.huawei.featureuserprofile.route.hwgpxmodel.RoutePoint;
import com.huawei.featureuserprofile.route.hwgpxmodel.Track;
import com.huawei.featureuserprofile.route.hwgpxmodel.TrackPoint;
import com.huawei.featureuserprofile.route.hwgpxmodel.TrackSegment;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.featureuserprofile.route.hwkmlmodel.Data;
import com.huawei.featureuserprofile.route.hwkmlmodel.Document;
import com.huawei.featureuserprofile.route.hwkmlmodel.ExtendedData;
import com.huawei.featureuserprofile.route.hwkmlmodel.FolderFirst;
import com.huawei.featureuserprofile.route.hwkmlmodel.FolderSec;
import com.huawei.featureuserprofile.route.hwkmlmodel.GxTrack;
import com.huawei.featureuserprofile.route.hwkmlmodel.Kml;
import com.huawei.featureuserprofile.route.hwkmlmodel.LineString;
import com.huawei.featureuserprofile.route.hwkmlmodel.Placemark;
import com.huawei.featureuserprofile.route.hwkmlmodel.TimeSpan;
import com.huawei.featureuserprofile.route.hwtcxmodel.Activities;
import com.huawei.featureuserprofile.route.hwtcxmodel.Activity;
import com.huawei.featureuserprofile.route.hwtcxmodel.Lap;
import com.huawei.featureuserprofile.route.hwtcxmodel.Position;
import com.huawei.hwfoundationmodel.trackmodel.MarkPoint;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import com.huawei.route.CpInfo;
import com.huawei.route.Point;
import com.huawei.route.RouteType;
import defpackage.cxo;
import defpackage.cxp;
import defpackage.cxt;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes6.dex */
public class NavigationFileParser {
    public static final String BIN = "bin";
    public static final String BIN_FILE_NAME = "byte.bin";
    private static final double DOUBLE_ZERO = 0.0d;
    private static final double EARTH_RADIUS = 6371.0d;
    public static final int FAIL = 0;
    public static final String GPX = "gpx";
    public static final String KML = "kml";
    public static final String KMZ = "kmz";
    private static final long LONG_ZERO = 0;
    private static final double ONE_IN_A_THOUSAND = 0.001d;
    private static final int ONE_MULTIPLES = 1;
    private static final int ONE_THOUSAND = 1000;
    public static final int SUCCESS = 1;
    private static final String TAG = "NavigationFileParser";
    public static final String TCX = "tcx";
    private static final int TWO_MULTIPLES = 2;
    private static final int TWO_THOUSAND = 2000;
    private static final double ZERO_THRESHOLD = 1.0E-6d;
    private double mCumulativeClimb;
    private double mCumulativeDecrease;
    private List<Point> mPoints;
    private double mSportLocalDistance;
    private double mSportTotalDistance;
    private double mSportTotalTime;
    private boolean isParsedSuccessful = true;
    private String mSportType = "";
    private int mRouteType = RouteType.DEFAULT.routeType();

    public double getCumulativeClimb() {
        return this.mCumulativeClimb;
    }

    public double getCumulativeDecrease() {
        return this.mCumulativeDecrease;
    }

    public int navigationParser(InputStream inputStream, String str) throws XmlPullParserException, IOException, ParseException {
        if (str.equalsIgnoreCase("gpx")) {
            return setGpxParser(inputStream);
        }
        if (str.equalsIgnoreCase(TCX)) {
            return setTcxParser(inputStream);
        }
        if (str.equalsIgnoreCase(KML)) {
            return setKmlParser(inputStream);
        }
        LogUtil.e(TAG, "Parsing of this format is not supported.");
        return 0;
    }

    public String getSportType() {
        return this.mSportType;
    }

    public int getRouteType() {
        return this.mRouteType;
    }

    public List<Point> getPoints() {
        return this.mPoints;
    }

    public double getSportTotalTime() {
        return this.mSportTotalTime;
    }

    public double getSportTotalDistance() {
        return this.mSportTotalDistance;
    }

    public double getSportLocalDistance() {
        return this.mSportLocalDistance;
    }

    private int setGpxParser(InputStream inputStream) throws XmlPullParserException, IOException, ParseException {
        Gpx gpxTrackParseInput = new cxo().trackParseInput(inputStream);
        List<Track> tracks = gpxTrackParseInput.getTracks();
        if (CollectionUtils.isEmpty(tracks)) {
            LogUtil.e(TAG, "tracks is null");
            return parseGpx(gpxTrackParseInput);
        }
        this.mPoints = new ArrayList();
        a aVar = new a();
        Iterator<Track> it = tracks.iterator();
        int i = 0;
        while (it.hasNext()) {
            List<TrackSegment> listAssigningValuesFromTrack = assigningValuesFromTrack(it.next());
            if (CollectionUtils.isEmpty(listAssigningValuesFromTrack)) {
                LogUtil.e(TAG, "trackSegments is null");
            } else {
                Iterator<TrackSegment> it2 = listAssigningValuesFromTrack.iterator();
                int i2 = i;
                while (it2.hasNext()) {
                    List<TrackPoint> trackPoints = it2.next().getTrackPoints();
                    if (!CollectionUtils.isEmpty(trackPoints)) {
                        int size = trackPoints.size();
                        int i3 = 0;
                        while (i3 < trackPoints.size()) {
                            TrackPoint trackPoint = trackPoints.get(i3);
                            int i4 = i3;
                            List<TrackPoint> list = trackPoints;
                            addPoint(trackPoint.getLongitude(), trackPoint.getLatitude(), trackPoint.getElevation(), trackPoint.getTime(), getCpInfo(gpxTrackParseInput, new Wpt(trackPoint.getLatitude(), trackPoint.getLongitude(), trackPoint.getElevation(), trackPoint.getTime())));
                            if (i4 != 0) {
                                calAccumulateData(aVar, i4);
                            }
                            i3 = i4 + 1;
                            trackPoints = list;
                        }
                        i2 += size;
                    }
                }
                i = i2;
            }
        }
        assigningValues(aVar);
        int pointNum = getPointNum(gpxTrackParseInput, i);
        this.mRouteType = gpxTrackParseInput.getRouteType();
        if (pointNum != 0) {
            return 1;
        }
        LogUtil.e(TAG, "setGpxParser point is null");
        return 0;
    }

    private CpInfo getCpInfo(Gpx gpx, Wpt wpt) {
        int iIndexOf;
        List<Wpt> wpts = gpx.getWpts();
        Wpt wpt2 = (CollectionUtils.isEmpty(wpts) || (iIndexOf = wpts.indexOf(new Wpt(wpt.getLatitude(), wpt.getLongitude(), wpt.getElevation(), wpt.getTime()))) == -1) ? null : wpts.get(iIndexOf);
        CpInfo cpInfo = getCpInfo(wpt2);
        if (cpInfo != null) {
            gpx.getWpts().remove(wpt2);
        }
        return cpInfo;
    }

    private CpInfo getCpInfo(Wpt wpt) {
        if (wpt == null) {
            return null;
        }
        CpInfo cpInfo = new CpInfo();
        cpInfo.setType(wpt.getSym());
        cpInfo.setColor(wpt.getIconColor());
        cpInfo.setName(wpt.getName());
        cpInfo.setDescription(wpt.getDesc());
        cpInfo.setMode(wpt.getMode());
        return cpInfo;
    }

    private int getPointNum(Gpx gpx, int i) {
        if (CollectionUtils.isEmpty(gpx.getWpts())) {
            return i;
        }
        for (Wpt wpt : gpx.getWpts()) {
            Point point = new Point();
            point.setLongitude(wpt.getLongitude());
            point.setLatitude(wpt.getLatitude());
            point.setAltitude(wpt.getElevation());
            point.setTimeStamp(wpt.getTime());
            CpInfo cpInfo = new CpInfo();
            cpInfo.setType(wpt.getSym());
            cpInfo.setColor(wpt.getIconColor());
            cpInfo.setName(wpt.getName());
            cpInfo.setDescription(wpt.getDesc());
            cpInfo.setMode(wpt.getMode());
            point.setCpInfo(cpInfo);
            this.mPoints.add(point);
            i++;
        }
        return i;
    }

    private int parseGpx(Gpx gpx) {
        List<Route> route = gpx.getRoute();
        int i = 0;
        if (CollectionUtils.isEmpty(route)) {
            LogUtil.e(TAG, "route is null");
            return 0;
        }
        this.mPoints = new ArrayList();
        a aVar = new a();
        Iterator<Route> it = route.iterator();
        int size = 0;
        while (it.hasNext()) {
            List<RoutePoint> routePoint = it.next().getRoutePoint();
            if (CollectionUtils.isEmpty(routePoint)) {
                LogUtil.e(TAG, "trackPoints is null");
                return i;
            }
            int i2 = i;
            while (i2 < routePoint.size()) {
                RoutePoint routePoint2 = routePoint.get(i2);
                List<RoutePoint> list = routePoint;
                int i3 = i2;
                Iterator<Route> it2 = it;
                int i4 = size;
                addPoint(routePoint2.getLongitude(), routePoint2.getLatitude(), routePoint2.getElevation(), routePoint2.getTime(), getCpInfo(gpx, new Wpt(routePoint2.getLatitude(), routePoint2.getLongitude(), routePoint2.getElevation(), routePoint2.getTime())));
                if (i3 != 0) {
                    calAccumulateData(aVar, i3);
                }
                i2 = i3 + 1;
                size = i4;
                it = it2;
                routePoint = list;
            }
            size += routePoint.size();
            it = it;
            i = 0;
        }
        assigningValues(aVar);
        int pointNum = getPointNum(gpx, size);
        this.mRouteType = gpx.getRouteType();
        if (pointNum != 0) {
            return 1;
        }
        LogUtil.e(TAG, "parseGpx point is null");
        return 0;
    }

    private List<TrackSegment> assigningValuesFromTrack(Track track) {
        this.mSportType = track.getType() != null ? track.getType() : "";
        Extensions extensions = track.getExtensions();
        if (extensions != null) {
            Map<String, Object> extensionsMap = extensions.getExtensionsMap();
            if (extensionsMap != null) {
                Object obj = extensionsMap.get("totalTime");
                if (obj instanceof Double) {
                    this.mSportTotalTime = ((Double) obj).doubleValue();
                }
                Object obj2 = extensionsMap.get(BleConstants.TOTAL_DISTANCE);
                if (obj2 instanceof Double) {
                    this.mSportTotalDistance = ((Double) obj2).doubleValue();
                }
                Object obj3 = extensionsMap.get("cumulativeClimb");
                if (obj3 instanceof Double) {
                    this.mCumulativeClimb = ((Double) obj3).doubleValue();
                }
                Object obj4 = extensionsMap.get("cumulativeDecrease");
                if (obj4 instanceof Double) {
                    this.mCumulativeDecrease = ((Double) obj4).doubleValue();
                }
                Object obj5 = extensionsMap.get("routeType");
                if (obj5 instanceof Integer) {
                    this.mRouteType = ((Integer) obj5).intValue();
                }
            } else {
                LogUtil.e(TAG, "extensionsMap is null");
            }
        }
        return track.getTrackSegments();
    }

    private int setTcxParser(InputStream inputStream) throws XmlPullParserException, IOException, ParseException {
        Activities activities = new cxt().trackParseInput(inputStream).getActivities();
        if (activities == null) {
            LogUtil.e(TAG, "activities is null");
            return 0;
        }
        Activity activity = activities.getActivity();
        if (activity == null) {
            LogUtil.e(TAG, "activity is null");
            return 0;
        }
        this.mSportType = activity.getSport() != null ? activity.getSport() : "";
        List<Lap> lap = activity.getLap();
        if (CollectionUtils.isEmpty(lap)) {
            LogUtil.e(TAG, "laps is null");
            return 0;
        }
        a aVar = new a();
        this.mPoints = new ArrayList();
        Iterator<Lap> it = lap.iterator();
        while (true) {
            int i = 1;
            if (it.hasNext()) {
                Lap next = it.next();
                List<com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint> trackPointsFromLap = getTrackPointsFromLap(next);
                this.mRouteType = next.getRouteType();
                com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint trackPoint = trackPointsFromLap.get(0);
                Position position = trackPoint.getPosition();
                if (position == null) {
                    LogUtil.e(TAG, "positionFirst is null");
                    return 0;
                }
                List<com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint> list = trackPointsFromLap;
                addPoint(position.getLongitudeDegrees(), position.getLatitudeDegrees(), trackPoint.getAltitudeMeters(), trackPoint.getTime(), getCpInfo(trackPoint));
                while (i < list.size()) {
                    List<com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint> list2 = list;
                    com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint trackPoint2 = list2.get(i);
                    Position position2 = trackPoint2.getPosition();
                    if (position2 == null) {
                        LogUtil.e(TAG, "position is null");
                        return 0;
                    }
                    addPoint(position2.getLongitudeDegrees(), position2.getLatitudeDegrees(), trackPoint2.getAltitudeMeters(), trackPoint2.getTime(), getCpInfo(trackPoint2));
                    calAccumulateData(aVar, i);
                    i++;
                    list = list2;
                }
            } else {
                assigningValues(aVar);
                return 1;
            }
        }
    }

    private CpInfo getCpInfo(com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint trackPoint) {
        Extensions extensions = trackPoint.getExtensions();
        if (extensions == null || com.huawei.haf.common.utils.CollectionUtils.c(extensions.getExtensionsMap())) {
            return null;
        }
        CpInfo cpInfo = new CpInfo();
        cpInfo.setMode(Extensions.getInt(extensions.getExtensionsMap(), "PointMode", 1));
        cpInfo.setColor(Extensions.getInt(extensions.getExtensionsMap(), "PointColor", MarkPoint.PointColor.AUTO.color()));
        cpInfo.setType(Extensions.getInt(extensions.getExtensionsMap(), "PointIcon", MarkPoint.MarkType.COMMON.type()));
        cpInfo.setName(Extensions.getString(extensions.getExtensionsMap(), com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint.NAME, ""));
        cpInfo.setDescription(Extensions.getString(extensions.getExtensionsMap(), com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint.DESC, ""));
        return cpInfo;
    }

    private List<com.huawei.featureuserprofile.route.hwtcxmodel.TrackPoint> getTrackPointsFromLap(Lap lap) {
        this.mSportTotalTime += lap.getTotalTimeSeconds();
        this.mSportTotalDistance += lap.getDistanceMeters();
        this.mCumulativeClimb += lap.getCumulativeClimb();
        this.mCumulativeDecrease += lap.getCumulativeDecrease();
        return lap.getTrack().getTrackPoint();
    }

    private int setKmlParser(InputStream inputStream) throws XmlPullParserException, IOException, ParseException {
        Kml kmlTrackParseInput = new cxp().trackParseInput(inputStream);
        FolderFirst folderFirst = kmlTrackParseInput.getFolderFirst();
        if (folderFirst == null) {
            LogUtil.e(TAG, "folderFirst is null");
            return setDocumentParser(kmlTrackParseInput);
        }
        FolderSec folderSec = assignValuesFromFolderFirst(folderFirst).getFolderSec();
        if (folderSec == null) {
            LogUtil.e(TAG, "folderSec is null");
            return 0;
        }
        List<Placemark> placeMark = folderSec.getPlaceMark();
        if (CollectionUtils.isEmpty(placeMark)) {
            LogUtil.e(TAG, "placeMarks is null");
            return 0;
        }
        a aVar = new a();
        this.mPoints = new ArrayList();
        processKmlPoint(placeMark, aVar);
        assigningValues(aVar);
        return 1;
    }

    private CpInfo getCpInfo(Placemark placemark) {
        ExtendedData extendedData = placemark.getExtendedData();
        if (extendedData == null || CollectionUtils.isEmpty(extendedData.getData())) {
            return null;
        }
        CpInfo cpInfo = new CpInfo();
        for (Data data : extendedData.getData()) {
            double dDoubleValue = data.getValue().doubleValue();
            if ("PointMode".equals(data.getName())) {
                cpInfo.setMode((int) dDoubleValue);
            }
            if ("PointColor".equals(data.getName())) {
                cpInfo.setColor((int) dDoubleValue);
            }
            if ("PointIcon".equals(data.getName())) {
                cpInfo.setType((int) dDoubleValue);
            }
        }
        cpInfo.setName(placemark.getLapName());
        cpInfo.setDescription(placemark.getDescription());
        return cpInfo;
    }

    private void processKmlPoint(List<Placemark> list, a aVar) {
        TimeSpan timeSpan = list.get(0).getTimeSpan();
        if (timeSpan != null) {
            com.huawei.featureuserprofile.route.hwkmlmodel.Point point = list.get(0).getPoint();
            addPoint(point.getLon(), point.getLat(), point.getEle(), timeSpan.getBegin(), getCpInfo(list.get(0)));
        }
        for (int i = 1; i < list.size(); i++) {
            TimeSpan timeSpan2 = list.get(i).getTimeSpan();
            if (timeSpan2 != null) {
                com.huawei.featureuserprofile.route.hwkmlmodel.Point point2 = list.get(i).getPoint();
                addPoint(point2.getLon(), point2.getLat(), point2.getEle(), timeSpan2.getBegin(), getCpInfo(list.get(i)));
                calAccumulateData(aVar, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    private FolderFirst assignValuesFromFolderFirst(FolderFirst folderFirst) {
        byte b2;
        ExtendedData extendedData = folderFirst.getExtendedData();
        if (extendedData == null) {
            LogUtil.a(TAG, "extendedData is null");
            return folderFirst;
        }
        for (Data data : extendedData.getData()) {
            String name = data.getName();
            double dDoubleValue = data.getValue().doubleValue();
            name.hashCode();
            switch (name) {
                case "totalTime":
                    b2 = 0;
                    break;
                case "routeType":
                    b2 = 1;
                    break;
                case "totalDistance":
                    b2 = 2;
                    break;
                case "cumulativeClimb":
                    b2 = 3;
                    break;
                case "cumulativeDecrease":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                this.mSportTotalTime = dDoubleValue;
            } else if (b2 == 1) {
                this.mRouteType = (int) dDoubleValue;
            } else if (b2 == 2) {
                this.mSportTotalDistance = dDoubleValue;
            } else if (b2 == 3) {
                this.mCumulativeClimb = dDoubleValue;
            } else if (b2 != 4) {
                LogUtil.a(TAG, "no one match");
            } else {
                this.mCumulativeDecrease = dDoubleValue;
            }
        }
        return folderFirst;
    }

    private int setDocumentParser(Kml kml) {
        Document document = kml.getDocument();
        if (document == null) {
            LogUtil.e(TAG, "document is null");
            return 0;
        }
        List<FolderSec> folderSec = document.getFolderSec();
        if (CollectionUtils.isEmpty(folderSec)) {
            LogUtil.e(TAG, "folderSec is null");
            return 0;
        }
        a aVar = new a();
        this.mPoints = new ArrayList();
        Iterator<FolderSec> it = folderSec.iterator();
        while (it.hasNext()) {
            List<Placemark> placeMark = it.next().getPlaceMark();
            if (CollectionUtils.isEmpty(placeMark)) {
                LogUtil.e(TAG, "placeMarks is null");
                return 0;
            }
            for (Placemark placemark : placeMark) {
                LineString lineString = placemark.getLineString();
                GxTrack gxTrack = placemark.getGxTrack();
                if (lineString != null) {
                    lineString.getCoordinates();
                    if (CollectionUtils.isEmpty(lineString.getLineStringPointList())) {
                        LogUtil.e(TAG, "lineStringPointList is null");
                        return 0;
                    }
                    setAccumulate(aVar, lineString, placemark);
                } else if (gxTrack != null) {
                    gxTrack.getGxCoordinates();
                    if (CollectionUtils.isEmpty(gxTrack.getGxTrackPoints())) {
                        LogUtil.e(TAG, "gxTrackPoints is null");
                        return 0;
                    }
                    setAccumulate(aVar, gxTrack, placemark);
                } else {
                    processKmlPoint(placeMark, aVar);
                }
            }
        }
        assigningValues(aVar);
        return 1;
    }

    private void setAccumulate(a aVar, LineString lineString, Placemark placemark) {
        LineString.LineStringPoint lineStringPoint = lineString.getLineStringPointList().get(0);
        addPoint(lineStringPoint.getLon(), lineStringPoint.getLat(), lineStringPoint.getEle(), getCpInfo(placemark));
        for (int i = 1; i < lineString.getLineStringPointList().size(); i++) {
            LineString.LineStringPoint lineStringPoint2 = lineString.getLineStringPointList().get(i);
            addPoint(lineStringPoint2.getLon(), lineStringPoint2.getLat(), lineStringPoint2.getEle(), getCpInfo(placemark));
            aVar.f5648c += twoPointDistance(this.mPoints.get(i - 1), this.mPoints.get(i));
        }
    }

    private void setAccumulate(a aVar, GxTrack gxTrack, Placemark placemark) {
        GxTrack.GxTrackPoint gxTrackPoint = gxTrack.getGxTrackPoints().get(0);
        addPoint(gxTrackPoint.getLon(), gxTrackPoint.getLat(), gxTrackPoint.getEle(), gxTrackPoint.getTime(), getCpInfo(placemark));
        for (int i = 1; i < gxTrack.getGxTrackPoints().size(); i++) {
            GxTrack.GxTrackPoint gxTrackPoint2 = gxTrack.getGxTrackPoints().get(i);
            addPoint(gxTrackPoint2.getLon(), gxTrackPoint2.getLat(), gxTrackPoint2.getEle(), gxTrackPoint2.getTime(), getCpInfo(placemark));
            int i2 = i - 1;
            aVar.f5648c += twoPointDistance(this.mPoints.get(i2), this.mPoints.get(i));
            aVar.f5647b += twoPointTime(this.mPoints.get(i2), this.mPoints.get(i));
        }
    }

    public static double twoPointDistance(Point point, Point point2) {
        double latitude = point.getLatitude();
        double latitude2 = point2.getLatitude();
        double longitude = point.getLongitude();
        double longitude2 = point2.getLongitude();
        double radians = Math.toRadians(latitude2 - latitude);
        double radians2 = Math.toRadians(longitude2 - longitude);
        double d = radians / 2.0d;
        double d2 = radians2 / 2.0d;
        double dSin = (Math.sin(d) * Math.sin(d)) + (Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(latitude2)) * Math.sin(d2) * Math.sin(d2));
        return Math.sqrt(Math.pow(Math.atan2(Math.sqrt(dSin), Math.sqrt(1.0d - dSin)) * 2.0d * EARTH_RADIUS * 1000.0d, 2.0d));
    }

    public long twoPointTime(Point point, Point point2) {
        if (point.getTimeStamp() == 0 || point2.getTimeStamp() == 0) {
            return 0L;
        }
        if (point.getTimeStamp() > point2.getTimeStamp()) {
            this.isParsedSuccessful = false;
            return 0L;
        }
        return point2.getTimeStamp() - point.getTimeStamp();
    }

    private void assigningValues(a aVar) {
        double d = this.mSportTotalDistance;
        if (d == 0.0d) {
            this.mSportLocalDistance = aVar.f5648c;
        } else {
            this.mSportLocalDistance = d;
        }
        if (this.mSportTotalTime == 0.0d) {
            this.mSportTotalTime = this.isParsedSuccessful ? ONE_IN_A_THOUSAND * aVar.f5647b : 0.0d;
        }
    }

    private void calAccumulateData(a aVar, int i) {
        int i2 = i - 1;
        aVar.f5648c += twoPointDistance(this.mPoints.get(i2), this.mPoints.get(i));
        aVar.f5647b += twoPointTime(this.mPoints.get(i2), this.mPoints.get(i));
    }

    private void addPoint(double d, double d2, double d3, long j, CpInfo cpInfo) {
        Point.Builder builder = new Point.Builder();
        builder.setLongitude(d).setLatitude(d2).setAltitude(d3).setTimeStamp(j);
        if (cpInfo != null) {
            builder.setCpInfo(cpInfo);
        }
        this.mPoints.add(builder.build());
    }

    private void addPoint(double d, double d2, double d3, CpInfo cpInfo) {
        Point.Builder builder = new Point.Builder();
        builder.setLongitude(d).setLatitude(d2).setAltitude(d3);
        if (cpInfo != null) {
            builder.setCpInfo(cpInfo);
        }
        this.mPoints.add(builder.build());
    }

    static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f5647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        double f5648c;

        private a() {
            this.f5648c = 0.0d;
            this.f5647b = 0L;
        }
    }
}
