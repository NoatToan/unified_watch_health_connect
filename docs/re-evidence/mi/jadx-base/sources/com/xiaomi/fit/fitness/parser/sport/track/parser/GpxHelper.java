package com.xiaomi.fit.fitness.parser.sport.track.parser;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.log.Logger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00070\u00072\u0006\u0010\f\u001a\u00020\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J(\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/GpxHelper;", "", "<init>", "()V", "TAG", "", "readGPX", "Lkotlin/Triple;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "", "inputStream", "Ljava/io/InputStream;", "parseTrackPoint", "parser", "Lorg/xmlpull/v1/XmlPullParser;", "getWptDesBeanByString", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointDescData;", "input", "convertToGPX", "trackName", "tracks", "", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGpxHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GpxHelper.kt\ncom/xiaomi/fit/fitness/parser/sport/track/parser/GpxHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n1#2:309\n*E\n"})
public final class GpxHelper {

    @NotNull
    public static final GpxHelper INSTANCE = new GpxHelper();

    @NotNull
    public static final String TAG = "GpxHelper";

    private GpxHelper() {
    }

    public static /* synthetic */ String convertToGPX$default(GpxHelper gpxHelper, String str, List list, SportBasicReport sportBasicReport, int i, Object obj) {
        if ((i & 4) != 0) {
            sportBasicReport = null;
        }
        return gpxHelper.convertToGPX(str, list, sportBasicReport);
    }

    private final WayPointDescData getWptDesBeanByString(String input) {
        Matcher matcher = Pattern.compile("经度: (\\d+\\.\\d+)\\s+纬度: (\\d+\\.\\d+)\\s+海拔: (\\d+\\.\\d+)").matcher(input);
        if (!matcher.find()) {
            return new WayPointDescData(null, null, null);
        }
        String strGroup = matcher.group(1);
        Double dValueOf = strGroup != null ? Double.valueOf(Double.parseDouble(strGroup)) : null;
        String strGroup2 = matcher.group(2);
        Double dValueOf2 = strGroup2 != null ? Double.valueOf(Double.parseDouble(strGroup2)) : null;
        String strGroup3 = matcher.group(3);
        return new WayPointDescData(dValueOf, dValueOf2, strGroup3 != null ? Double.valueOf(Double.parseDouble(strGroup3)) : null);
    }

    private final CommonTrackData parseTrackPoint(XmlPullParser parser) throws XmlPullParserException, IOException {
        double d;
        double d2;
        long j;
        Double doubleOrNull;
        Double doubleOrNull2;
        Double doubleOrNull3;
        Double doubleOrNull4;
        String name = parser.getName();
        double dDoubleValue = 0.0d;
        if (StringsKt__StringsJVMKt.equals(name, "trkpt", true)) {
            String attributeValue = parser.getAttributeValue(null, "lat");
            double dDoubleValue2 = (attributeValue == null || (doubleOrNull4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(attributeValue)) == null) ? 0.0d : doubleOrNull4.doubleValue();
            String attributeValue2 = parser.getAttributeValue(null, "lon");
            if (attributeValue2 != null && (doubleOrNull3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(attributeValue2)) != null) {
                dDoubleValue = doubleOrNull3.doubleValue();
            }
            double d3 = dDoubleValue;
            double dDoubleValue3 = -100000.0d;
            long timeString = 0;
            while (true) {
                if (parser.getEventType() == 3 && StringsKt__StringsJVMKt.equals(name, "trkpt", true)) {
                    break;
                }
                if (parser.getEventType() == 2 && StringsKt__StringsJVMKt.equals(parser.getName(), "ele", true)) {
                    String strNextText = parser.nextText();
                    Intrinsics.checkNotNullExpressionValue(strNextText, "nextText(...)");
                    Double doubleOrNull5 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText);
                    dDoubleValue3 = doubleOrNull5 != null ? doubleOrNull5.doubleValue() : -100000.0d;
                }
                if (parser.getEventType() == 2 && StringsKt__StringsJVMKt.equals(parser.getName(), "time", true)) {
                    String strNextText2 = parser.nextText();
                    timeString = (strNextText2 == null || strNextText2.length() == 0) ? 0L : ParserHelper.INSTANCE.parseTimeString(strNextText2);
                }
                parser.next();
            }
            d2 = dDoubleValue3;
            j = timeString;
            dDoubleValue = dDoubleValue2;
            d = d3;
        } else if (StringsKt__StringsJVMKt.equals(name, "rtept", true)) {
            String attributeValue3 = parser.getAttributeValue(null, "lat");
            double dDoubleValue4 = (attributeValue3 == null || (doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(attributeValue3)) == null) ? 0.0d : doubleOrNull2.doubleValue();
            String attributeValue4 = parser.getAttributeValue(null, "lon");
            if (attributeValue4 != null && (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(attributeValue4)) != null) {
                dDoubleValue = doubleOrNull.doubleValue();
            }
            d = dDoubleValue;
            double dDoubleValue5 = -100000.0d;
            long timeString2 = 0;
            while (true) {
                if (parser.getEventType() == 3 && StringsKt__StringsJVMKt.equals(name, "rtept", true)) {
                    break;
                }
                if (parser.getEventType() == 2 && StringsKt__StringsJVMKt.equals(parser.getName(), "ele", true)) {
                    String strNextText3 = parser.nextText();
                    Intrinsics.checkNotNullExpressionValue(strNextText3, "nextText(...)");
                    Double doubleOrNull6 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText3);
                    dDoubleValue5 = doubleOrNull6 != null ? doubleOrNull6.doubleValue() : -100000.0d;
                }
                if (parser.getEventType() == 2 && StringsKt__StringsJVMKt.equals(parser.getName(), "time", true)) {
                    String strNextText4 = parser.nextText();
                    timeString2 = (strNextText4 == null || strNextText4.length() == 0) ? 0L : ParserHelper.INSTANCE.parseTimeString(strNextText4);
                }
                parser.next();
            }
            d2 = dDoubleValue5;
            dDoubleValue = dDoubleValue4;
            j = timeString2;
        } else {
            d = 0.0d;
            d2 = -100000.0d;
            j = 0;
        }
        Logger.d(TAG, "parseTrackPoint：" + dDoubleValue + "," + d + "," + d2 + "," + j);
        return new CommonTrackData(dDoubleValue, d, d2, Long.valueOf(j), false, 16, null);
    }

    @NotNull
    public final String convertToGPX(@NotNull String trackName, @NotNull List<CommonTrackData> tracks, @Nullable SportBasicReport basicReport) {
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            Intrinsics.checkNotNullExpressionValue(xmlSerializerNewSerializer, "newSerializer(...)");
            StringWriter stringWriter = new StringWriter();
            xmlSerializerNewSerializer.setOutput(stringWriter);
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            xmlSerializerNewSerializer.startTag(null, "gpx");
            xmlSerializerNewSerializer.attribute(null, "version", "1.0");
            xmlSerializerNewSerializer.attribute(null, "xmlns", "http://www.topografix.com/GPX/1/1");
            xmlSerializerNewSerializer.attribute(null, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            xmlSerializerNewSerializer.attribute(null, "xsi:schemaLocation", "http://www.topografix.com/GPX/1/1 http://www.topografix.com/GPX/1/1/gpx.xsd");
            xmlSerializerNewSerializer.startTag(null, "name");
            xmlSerializerNewSerializer.text(trackName);
            xmlSerializerNewSerializer.endTag(null, "name");
            xmlSerializerNewSerializer.startTag(null, "desc");
            xmlSerializerNewSerializer.text("Export from Mi Fitness");
            xmlSerializerNewSerializer.endTag(null, "desc");
            xmlSerializerNewSerializer.startTag(null, "trk");
            Integer distance = basicReport != null ? basicReport.getDistance() : null;
            Float riseHeight = basicReport != null ? basicReport.getRiseHeight() : null;
            Float fallHeight = basicReport != null ? basicReport.getFallHeight() : null;
            if (distance != null) {
                xmlSerializerNewSerializer.startTag(null, "extensions");
                xmlSerializerNewSerializer.startTag(null, "totalDistance");
                xmlSerializerNewSerializer.text(distance.toString());
                xmlSerializerNewSerializer.endTag(null, "totalDistance");
                if (riseHeight != null) {
                    xmlSerializerNewSerializer.startTag(null, "cumulativeClimb");
                    xmlSerializerNewSerializer.text(riseHeight.toString());
                    xmlSerializerNewSerializer.endTag(null, "cumulativeClimb");
                }
                if (fallHeight != null) {
                    xmlSerializerNewSerializer.startTag(null, "cumulativeDecrease");
                    xmlSerializerNewSerializer.text(fallHeight.toString());
                    xmlSerializerNewSerializer.endTag(null, "cumulativeDecrease");
                }
                xmlSerializerNewSerializer.endTag(null, "extensions");
            }
            xmlSerializerNewSerializer.startTag(null, "trkseg");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT, Locale.getDefault());
            for (CommonTrackData commonTrackData : tracks) {
                xmlSerializerNewSerializer.startTag(null, "trkpt");
                xmlSerializerNewSerializer.attribute(null, "lat", String.valueOf(commonTrackData.getLatitude()));
                xmlSerializerNewSerializer.attribute(null, "lon", String.valueOf(commonTrackData.getLongitude()));
                if (ParserHelper.INSTANCE.isValidAltitude(commonTrackData.getElevation())) {
                    xmlSerializerNewSerializer.startTag(null, "ele");
                    xmlSerializerNewSerializer.text(String.valueOf(commonTrackData.getElevation()));
                    xmlSerializerNewSerializer.endTag(null, "ele");
                }
                Long time = commonTrackData.getTime();
                Intrinsics.checkNotNull(time);
                if (time.longValue() > 0) {
                    xmlSerializerNewSerializer.startTag(null, "time");
                    Long time2 = commonTrackData.getTime();
                    xmlSerializerNewSerializer.text(simpleDateFormat.format(new Date(time2 != null ? time2.longValue() : 0L)));
                    xmlSerializerNewSerializer.endTag(null, "time");
                }
                xmlSerializerNewSerializer.endTag(null, "trkpt");
                if (commonTrackData.getFlagSegment()) {
                    xmlSerializerNewSerializer.endTag(null, "trkseg");
                    xmlSerializerNewSerializer.endTag(null, "trk");
                    xmlSerializerNewSerializer.startTag(null, "trk");
                    xmlSerializerNewSerializer.startTag(null, "trkseg");
                }
            }
            xmlSerializerNewSerializer.endTag(null, "trkseg");
            xmlSerializerNewSerializer.endTag(null, "trk");
            xmlSerializerNewSerializer.endTag(null, "gpx");
            xmlSerializerNewSerializer.endDocument();
            File fileCreateSaveTrackFile = ParserHelper.INSTANCE.createSaveTrackFile(trackName + ".gpx");
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt__FileReadWriteKt.writeText$default(fileCreateSaveTrackFile, string, null, 2, null);
            String path = fileCreateSaveTrackFile.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return path;
        } catch (Exception e) {
            Logger.i(TAG, "convertToGPX Exception : " + e.getMessage() + " ");
            return "";
        }
    }

    @NotNull
    public final Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> readGPX(@NotNull InputStream inputStream) {
        Double doubleOrNull;
        Double doubleOrNull2;
        Double d;
        Double d2;
        Object obj;
        Double doubleOrNull3;
        Double doubleOrNull4;
        Double d3;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Logger.i(TAG, "readGPX start");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Double d4 = null;
        if (inputStream.available() == 0) {
            Logger.i(TAG, "readGPX start,but inputStream is empty");
            return new Triple<>(arrayList, arrayList2, null);
        }
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            Intrinsics.checkNotNullExpressionValue(xmlPullParserFactoryNewInstance, "newInstance(...)");
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            Intrinsics.checkNotNullExpressionValue(xmlPullParserNewPullParser, "newPullParser(...)");
            xmlPullParserNewPullParser.setInput(inputStream, null);
            Double doubleOrNull5 = null;
            doubleOrNull = null;
            doubleOrNull2 = null;
            WayPointData wayPointData = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.next()) {
                Double d5 = doubleOrNull2;
                if (eventType != 2) {
                    if (eventType == 3) {
                        try {
                            if (StringsKt__StringsJVMKt.equals(xmlPullParserNewPullParser.getName(), "trk", true)) {
                                try {
                                    ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList)).setFlagSegment(true);
                                    Logger.i(TAG, "add trk segment");
                                    doubleOrNull2 = d5;
                                    obj = null;
                                    z = false;
                                } catch (Exception e) {
                                    e = e;
                                    d4 = doubleOrNull5;
                                    doubleOrNull2 = d5;
                                    Logger.i(TAG, "XmlPullParserFactory解析GPX异常了：" + e.getMessage());
                                    return new Triple<>(arrayList, arrayList2, new Triple(d4, doubleOrNull, doubleOrNull2));
                                }
                            } else if (StringsKt__StringsJVMKt.equals(xmlPullParserNewPullParser.getName(), "rte", true)) {
                                ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList)).setFlagSegment(true);
                                Logger.i(TAG, "add rte segment");
                                doubleOrNull2 = d5;
                                obj = null;
                                z2 = false;
                            } else if (StringsKt__StringsJVMKt.equals(xmlPullParserNewPullParser.getName(), "wpt", true)) {
                                if (wayPointData != null) {
                                    Double lat = wayPointData.getLat();
                                    Double lon = wayPointData.getLon();
                                    Double elevation = wayPointData.getElevation();
                                    String name = wayPointData.getName();
                                    StringBuilder sb = new StringBuilder();
                                    d3 = doubleOrNull;
                                    try {
                                        sb.append("parseWayPoint：");
                                        sb.append(lat);
                                        sb.append(",");
                                        sb.append(lon);
                                        sb.append(",");
                                        sb.append(elevation);
                                        sb.append(",");
                                        sb.append(name);
                                        Logger.i(TAG, sb.toString());
                                        arrayList2.add(wayPointData);
                                    } catch (Exception e2) {
                                        e = e2;
                                        d4 = doubleOrNull5;
                                        doubleOrNull2 = d5;
                                        doubleOrNull = d3;
                                        Logger.i(TAG, "XmlPullParserFactory解析GPX异常了：" + e.getMessage());
                                        return new Triple<>(arrayList, arrayList2, new Triple(d4, doubleOrNull, doubleOrNull2));
                                    }
                                } else {
                                    d3 = doubleOrNull;
                                }
                                doubleOrNull2 = d5;
                                doubleOrNull = d3;
                                obj = null;
                                z3 = false;
                            }
                        } catch (Exception e3) {
                            e = e3;
                        }
                    }
                    d2 = doubleOrNull;
                    obj = null;
                    doubleOrNull2 = d5;
                    doubleOrNull = d2;
                } else {
                    d2 = doubleOrNull;
                    String name2 = xmlPullParserNewPullParser.getName();
                    Logger.d(TAG, "parse tagName：" + name2);
                    if (StringsKt__StringsJVMKt.equals(name2, "trk", true)) {
                        z = true;
                    } else if (StringsKt__StringsJVMKt.equals(name2, "rte", true)) {
                        z2 = true;
                    } else {
                        if (StringsKt__StringsJVMKt.equals(name2, "trkpt", true) && z) {
                            CommonTrackData trackPoint = parseTrackPoint(xmlPullParserNewPullParser);
                            if (trackPoint != null) {
                                arrayList.add(trackPoint);
                            }
                        } else if (StringsKt__StringsJVMKt.equals(name2, "rtept", true) && z2) {
                            CommonTrackData trackPoint2 = parseTrackPoint(xmlPullParserNewPullParser);
                            if (trackPoint2 != null) {
                                arrayList.add(trackPoint2);
                            }
                        } else if (StringsKt__StringsJVMKt.equals(name2, "wpt", true)) {
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "lat");
                            double dDoubleValue = 0.0d;
                            double dDoubleValue2 = (attributeValue == null || (doubleOrNull4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(attributeValue)) == null) ? 0.0d : doubleOrNull4.doubleValue();
                            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "lon");
                            if (attributeValue2 != null && (doubleOrNull3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(attributeValue2)) != null) {
                                dDoubleValue = doubleOrNull3.doubleValue();
                            }
                            obj = null;
                            wayPointData = new WayPointData("", Double.valueOf(dDoubleValue2), Double.valueOf(dDoubleValue), Double.valueOf(-100000.0d), new WayPointDescData(null, null, null));
                            doubleOrNull2 = d5;
                            doubleOrNull = d2;
                            z3 = true;
                        } else {
                            obj = null;
                            if (StringsKt__StringsJVMKt.equals(name2, "name", true) && z3) {
                                if (wayPointData != null) {
                                    wayPointData.setName(xmlPullParserNewPullParser.nextText());
                                }
                            } else if (StringsKt__StringsJVMKt.equals(name2, "ele", true) && z3) {
                                if (wayPointData != null) {
                                    String strNextText = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText, "nextText(...)");
                                    Double doubleOrNull6 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText);
                                    wayPointData.setElevation(Double.valueOf(doubleOrNull6 != null ? doubleOrNull6.doubleValue() : -100000.0d));
                                }
                            } else if (StringsKt__StringsJVMKt.equals(name2, "totalDistance", true)) {
                                String strNextText2 = xmlPullParserNewPullParser.nextText();
                                Intrinsics.checkNotNullExpressionValue(strNextText2, "nextText(...)");
                                doubleOrNull5 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText2);
                            } else if (StringsKt__StringsJVMKt.equals(name2, "cumulativeClimb", true)) {
                                String strNextText3 = xmlPullParserNewPullParser.nextText();
                                Intrinsics.checkNotNullExpressionValue(strNextText3, "nextText(...)");
                                doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText3);
                                doubleOrNull2 = d5;
                            } else {
                                if (StringsKt__StringsJVMKt.equals(name2, "cumulativeDecrease", true)) {
                                    String strNextText4 = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText4, "nextText(...)");
                                    doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText4);
                                }
                                doubleOrNull = d2;
                            }
                            doubleOrNull2 = d5;
                            doubleOrNull = d2;
                        }
                        obj = null;
                        doubleOrNull2 = d5;
                        doubleOrNull = d2;
                    }
                    doubleOrNull2 = d5;
                    doubleOrNull = d2;
                    obj = null;
                }
                try {
                } catch (Exception e4) {
                    e = e4;
                    d4 = doubleOrNull5;
                    Logger.i(TAG, "XmlPullParserFactory解析GPX异常了：" + e.getMessage());
                    return new Triple<>(arrayList, arrayList2, new Triple(d4, doubleOrNull, doubleOrNull2));
                }
            }
            Double d6 = doubleOrNull;
            Double d7 = doubleOrNull2;
            try {
                ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList)).setFlagSegment(false);
                inputStream.close();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("totalDistance：");
                sb2.append(doubleOrNull5);
                sb2.append(",cumulativeClimb：");
                d = d6;
                try {
                    sb2.append(d);
                    sb2.append(",cumulativeDecrease：");
                    doubleOrNull2 = d7;
                    try {
                        sb2.append(doubleOrNull2);
                        Logger.i(TAG, sb2.toString());
                        return new Triple<>(arrayList, arrayList2, new Triple(doubleOrNull5, d, doubleOrNull2));
                    } catch (Exception e5) {
                        e = e5;
                        doubleOrNull = d;
                        d4 = doubleOrNull5;
                        Logger.i(TAG, "XmlPullParserFactory解析GPX异常了：" + e.getMessage());
                        return new Triple<>(arrayList, arrayList2, new Triple(d4, doubleOrNull, doubleOrNull2));
                    }
                } catch (Exception e6) {
                    e = e6;
                    doubleOrNull2 = d7;
                }
            } catch (Exception e7) {
                e = e7;
                doubleOrNull2 = d7;
                d = d6;
            }
        } catch (Exception e8) {
            e = e8;
            doubleOrNull = null;
            doubleOrNull2 = null;
        }
    }
}
