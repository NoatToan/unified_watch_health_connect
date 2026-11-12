package com.xiaomi.fit.fitness.parser.sport.track.parser;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportBasicReportKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.sport_manager.utils.SportUtilsKt;
import defpackage.lp5;
import defpackage.xr5;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00070\u00072\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/TcxHelper;", "", "<init>", "()V", "TAG", "", "readTCX", "Lkotlin/Triple;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "", "inputStream", "Ljava/io/InputStream;", "convertToTCX", "trackName", "commonTrackDataList", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTcxHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TcxHelper.kt\ncom/xiaomi/fit/fitness/parser/sport/track/parser/TcxHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,259:1\n1#2:260\n*E\n"})
public final class TcxHelper {

    @NotNull
    public static final TcxHelper INSTANCE = new TcxHelper();

    @NotNull
    public static final String TAG = "TcxHelper";

    private TcxHelper() {
    }

    public static /* synthetic */ String convertToTCX$default(TcxHelper tcxHelper, String str, List list, SportBasicReport sportBasicReport, int i, Object obj) {
        if ((i & 4) != 0) {
            sportBasicReport = null;
        }
        return tcxHelper.convertToTCX(str, list, sportBasicReport);
    }

    @NotNull
    public final String convertToTCX(@NotNull String trackName, @NotNull List<CommonTrackData> commonTrackDataList, @Nullable SportBasicReport basicReport) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = "Position";
        String str6 = "Time";
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(commonTrackDataList, "commonTrackDataList");
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            Intrinsics.checkNotNullExpressionValue(xmlSerializerNewSerializer, "newSerializer(...)");
            StringWriter stringWriter = new StringWriter();
            String str7 = "Trackpoint";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT, Locale.getDefault());
            xmlSerializerNewSerializer.setOutput(stringWriter);
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            xmlSerializerNewSerializer.startTag(null, "TrainingCenterDatabase");
            xmlSerializerNewSerializer.attribute(null, "creator", "Mi Fitness");
            xmlSerializerNewSerializer.attribute(null, "version", "1.0");
            xmlSerializerNewSerializer.attribute(null, "xmlns", "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2");
            xmlSerializerNewSerializer.attribute(null, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            xmlSerializerNewSerializer.attribute(null, "xsi:schemaLocation", "http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2 http://www.garmin.com/xmlschemas/TrainingCenterDatabasev2.xsd");
            xmlSerializerNewSerializer.startTag(null, "Activities");
            xmlSerializerNewSerializer.startTag(null, "Activity");
            xmlSerializerNewSerializer.attribute(null, SportUtilsKt.TAG, basicReport != null ? lp5.c(basicReport.getSportType()) : null);
            if (basicReport == null || !SportBasicReportKt.isValid(basicReport)) {
                str = null;
                xmlSerializerNewSerializer.startTag(null, "Lap");
            } else {
                xmlSerializerNewSerializer.startTag(null, "Id");
                xmlSerializerNewSerializer.text(simpleDateFormat.format(new Date(((long) 1000) * basicReport.getStartTime())));
                xmlSerializerNewSerializer.endTag(null, "Id");
                Integer totalCal = basicReport.getTotalCal();
                if (totalCal != null && totalCal.intValue() > 0) {
                    xmlSerializerNewSerializer.startTag(null, "Calories");
                    Integer totalCal2 = basicReport.getTotalCal();
                    xmlSerializerNewSerializer.text(String.valueOf(totalCal2 != null ? totalCal2.intValue() : 0));
                    xmlSerializerNewSerializer.endTag(null, "Calories");
                }
                xmlSerializerNewSerializer.startTag(null, "Lap");
                if (basicReport.getDuration() > 0) {
                    xmlSerializerNewSerializer.startTag(null, "TotalTimeSeconds");
                    xmlSerializerNewSerializer.text(String.valueOf(basicReport.getDuration()));
                    xmlSerializerNewSerializer.endTag(null, "TotalTimeSeconds");
                }
                Integer distance = basicReport.getDistance();
                if (distance != null && distance.intValue() > 0) {
                    xmlSerializerNewSerializer.startTag(null, "DistanceMeters");
                    Integer distance2 = basicReport.getDistance();
                    xmlSerializerNewSerializer.text(String.valueOf(distance2 != null ? distance2.intValue() : 0));
                    xmlSerializerNewSerializer.endTag(null, "DistanceMeters");
                }
                Integer calories = basicReport.getCalories();
                if (calories != null && calories.intValue() > 0) {
                    xmlSerializerNewSerializer.startTag(null, "Calories");
                    Integer calories2 = basicReport.getCalories();
                    xmlSerializerNewSerializer.text(String.valueOf(calories2 != null ? calories2.intValue() : 0));
                    xmlSerializerNewSerializer.endTag(null, "Calories");
                }
                Float riseHeight = basicReport.getRiseHeight();
                if ((riseHeight != null ? riseHeight.floatValue() : 0.0f) > 0.0f) {
                    xmlSerializerNewSerializer.startTag(null, "CumulativeClimb");
                    Float riseHeight2 = basicReport.getRiseHeight();
                    xmlSerializerNewSerializer.text(xr5.g(2, riseHeight2 != null ? riseHeight2.floatValue() : 0.0f));
                    xmlSerializerNewSerializer.endTag(null, "CumulativeClimb");
                }
                Float fallHeight = basicReport.getFallHeight();
                if ((fallHeight != null ? fallHeight.floatValue() : 0.0f) > 0.0f) {
                    xmlSerializerNewSerializer.startTag(null, "CumulativeDecrease");
                    Float fallHeight2 = basicReport.getFallHeight();
                    xmlSerializerNewSerializer.text(xr5.g(2, fallHeight2 != null ? fallHeight2.floatValue() : 0.0f));
                    xmlSerializerNewSerializer.endTag(null, "CumulativeDecrease");
                }
                Integer avgHr = basicReport.getAvgHr();
                if (avgHr != null && avgHr.intValue() > 0) {
                    xmlSerializerNewSerializer.startTag(null, "HeartRateBpm");
                    Integer avgHr2 = basicReport.getAvgHr();
                    xmlSerializerNewSerializer.text(String.valueOf(avgHr2 != null ? avgHr2.intValue() : 0));
                    xmlSerializerNewSerializer.endTag(null, "HeartRateBpm");
                }
                if (basicReport.getAvgSpeed() != null) {
                    xmlSerializerNewSerializer.startTag(null, "AverageSpeed");
                    Object avgSpeed = basicReport.getAvgSpeed();
                    if (avgSpeed == null) {
                        avgSpeed = 0L;
                    }
                    xmlSerializerNewSerializer.text(avgSpeed.toString());
                    xmlSerializerNewSerializer.endTag(null, "AverageSpeed");
                }
                if (basicReport.getSteps() != null) {
                    xmlSerializerNewSerializer.startTag(null, "Steps");
                    Integer steps = basicReport.getSteps();
                    xmlSerializerNewSerializer.text(String.valueOf(steps != null ? steps.intValue() : 0));
                    xmlSerializerNewSerializer.endTag(null, "Steps");
                }
                str = null;
            }
            if (!commonTrackDataList.isEmpty()) {
                xmlSerializerNewSerializer.startTag(str, "Track");
                for (CommonTrackData commonTrackData : commonTrackDataList) {
                    String str8 = str7;
                    xmlSerializerNewSerializer.startTag(null, str8);
                    Long time = commonTrackData.getTime();
                    Intrinsics.checkNotNull(time);
                    if (time.longValue() > 0) {
                        str2 = str6;
                        xmlSerializerNewSerializer.startTag(null, str2);
                        Long time2 = commonTrackData.getTime();
                        xmlSerializerNewSerializer.text(simpleDateFormat.format(new Date(time2 != null ? time2.longValue() : 0L)));
                        xmlSerializerNewSerializer.endTag(null, str2);
                        str3 = null;
                    } else {
                        str2 = str6;
                        str3 = null;
                    }
                    xmlSerializerNewSerializer.startTag(str3, str5);
                    xmlSerializerNewSerializer.startTag(str3, "LatitudeDegrees");
                    xmlSerializerNewSerializer.text(String.valueOf(commonTrackData.getLatitude()));
                    xmlSerializerNewSerializer.endTag(str3, "LatitudeDegrees");
                    xmlSerializerNewSerializer.startTag(str3, "LongitudeDegrees");
                    xmlSerializerNewSerializer.text(String.valueOf(commonTrackData.getLongitude()));
                    xmlSerializerNewSerializer.endTag(str3, "LongitudeDegrees");
                    if (ParserHelper.INSTANCE.isValidAltitude(commonTrackData.getElevation())) {
                        xmlSerializerNewSerializer.startTag(str3, "AltitudeMeters");
                        xmlSerializerNewSerializer.text(String.valueOf(commonTrackData.getElevation()));
                        xmlSerializerNewSerializer.endTag(str3, "AltitudeMeters");
                        str4 = null;
                    } else {
                        str4 = str3;
                    }
                    xmlSerializerNewSerializer.endTag(str4, str5);
                    xmlSerializerNewSerializer.endTag(str4, str8);
                    str7 = str8;
                    str5 = str5;
                    str6 = str2;
                }
                xmlSerializerNewSerializer.endTag(null, "Track");
                str = null;
            }
            xmlSerializerNewSerializer.endTag(str, "Lap");
            xmlSerializerNewSerializer.endTag(str, "Activity");
            xmlSerializerNewSerializer.endTag(str, "Activities");
            xmlSerializerNewSerializer.endTag(str, "TrainingCenterDatabase");
            xmlSerializerNewSerializer.endDocument();
            File fileCreateSaveTrackFile = ParserHelper.INSTANCE.createSaveTrackFile(trackName + ".tcx");
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt__FileReadWriteKt.writeText$default(fileCreateSaveTrackFile, string, null, 2, null);
            String path = fileCreateSaveTrackFile.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return path;
        } catch (Exception e) {
            Logger.i(GpxHelper.TAG, "convertToTCX Exception : " + e.getMessage() + " ");
            return "";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public final Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> readTCX(@NotNull InputStream inputStream) {
        Double d;
        Double doubleOrNull;
        Double doubleOrNull2;
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        Logger.i(GpxHelper.TAG, "readTCX start");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Double doubleOrNull3 = null;
        if (inputStream.available() == 0) {
            Logger.i(GpxHelper.TAG, "readTCX start,but inputStream is empty");
            return new Triple<>(arrayList, arrayList2, null);
        }
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            int eventType = xmlPullParserNewPullParser.getEventType();
            Double doubleOrNull4 = null;
            Double doubleOrNull5 = null;
            doubleOrNull = null;
            doubleOrNull2 = null;
            Double doubleOrNull6 = null;
            boolean z = false;
            long timeString = 0;
            for (int i = 1; eventType != i; i = 1) {
                if (eventType == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    Logger.i(TAG, "parse tagName：" + name);
                    if (name != null) {
                        switch (name.hashCode()) {
                            case -1738178945:
                                if (name.equals("DistanceMeters")) {
                                    String strNextText = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText, "nextText(...)");
                                    doubleOrNull5 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText);
                                }
                                break;
                            case -1126017211:
                                if (name.equals("Trackpoint")) {
                                    doubleOrNull3 = null;
                                    doubleOrNull4 = null;
                                    z = true;
                                    doubleOrNull6 = null;
                                    timeString = 0;
                                }
                                break;
                            case -596129128:
                                if (name.equals("LongitudeDegrees")) {
                                    String strNextText2 = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText2, "nextText(...)");
                                    doubleOrNull3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText2);
                                }
                                break;
                            case -493138223:
                                if (name.equals("CumulativeDecrease")) {
                                    String strNextText3 = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText3, "nextText(...)");
                                    doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText3);
                                }
                                break;
                            case -144259220:
                                if (name.equals("AltitudeMeters")) {
                                    String strNextText4 = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText4, "nextText(...)");
                                    doubleOrNull4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText4);
                                }
                                break;
                            case 2606829:
                                if (name.equals("Time")) {
                                    ParserHelper parserHelper = ParserHelper.INSTANCE;
                                    String strNextText5 = xmlPullParserNewPullParser.nextText();
                                    if (strNextText5 == null) {
                                        strNextText5 = "";
                                    }
                                    timeString = parserHelper.parseTimeString(strNextText5);
                                }
                                break;
                            case 231531874:
                                if (name.equals("CumulativeClimb")) {
                                    String strNextText6 = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText6, "nextText(...)");
                                    doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText6);
                                }
                                break;
                            case 1083079931:
                                if (name.equals("LatitudeDegrees")) {
                                    String strNextText7 = xmlPullParserNewPullParser.nextText();
                                    Intrinsics.checkNotNullExpressionValue(strNextText7, "nextText(...)");
                                    doubleOrNull6 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(strNextText7);
                                }
                                break;
                        }
                    }
                } else if (eventType == 3) {
                    try {
                        if (Intrinsics.areEqual(xmlPullParserNewPullParser.getName(), "Trackpoint") && z) {
                            if (doubleOrNull6 != null && doubleOrNull3 != null) {
                                Logger.i(TAG, "parseTrackPoint：" + doubleOrNull6 + "," + doubleOrNull3 + "," + doubleOrNull4);
                                arrayList.add(new CommonTrackData(doubleOrNull6.doubleValue(), doubleOrNull3.doubleValue(), doubleOrNull4 != null ? doubleOrNull4.doubleValue() : -100000.0d, Long.valueOf(timeString), false, 16, null));
                            }
                            z = false;
                        }
                    } catch (Exception e) {
                        e = e;
                        d = doubleOrNull5;
                        Logger.i(TAG, "XmlPullParserFactory解析TCX异常了：" + e.getMessage());
                        return new Triple<>(arrayList, arrayList2, new Triple(d, doubleOrNull, doubleOrNull2));
                    }
                }
                eventType = xmlPullParserNewPullParser.next();
            }
            Logger.i(TAG, "totalDistance：" + doubleOrNull5 + ",cumulativeClimb：" + doubleOrNull + ",cumulativeDecrease：" + doubleOrNull2);
            return new Triple<>(arrayList, arrayList2, new Triple(doubleOrNull5, doubleOrNull, doubleOrNull2));
        } catch (Exception e2) {
            e = e2;
            d = null;
            doubleOrNull = null;
            doubleOrNull2 = null;
        }
    }
}
