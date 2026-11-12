package com.xiaomi.fit.fitness.parser.sport.track.parser;

import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.keep_alive.KeepAliveService;
import com.xiaomi.fitness.statistics.StatConstants;
import java.io.File;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0006\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\b\u0012\u001e\u0012\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00070\u00072\u0006\u0010\f\u001a\u00020\rJ(\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fit/fitness/parser/sport/track/parser/KmlHelper;", "", "<init>", "()V", "TAG", "", "readKML", "Lkotlin/Triple;", "", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/CommonTrackData;", "Lcom/xiaomi/fit/fitness/parser/sport/track/parser/WayPointData;", "", "inputStream", "Ljava/io/InputStream;", "convertToKML", "trackName", "commonTrackDataList", "basicReport", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "fitness-parser_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKmlHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KmlHelper.kt\ncom/xiaomi/fit/fitness/parser/sport/track/parser/KmlHelper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,441:1\n1863#2,2:442\n1872#2,3:444\n1872#2,3:447\n1872#2,3:450\n1872#2,3:453\n*S KotlinDebug\n*F\n+ 1 KmlHelper.kt\ncom/xiaomi/fit/fitness/parser/sport/track/parser/KmlHelper\n*L\n125#1:442,2\n269#1:444,3\n281#1:447,3\n293#1:450,3\n305#1:453,3\n*E\n"})
public final class KmlHelper {

    @NotNull
    public static final KmlHelper INSTANCE = new KmlHelper();

    @NotNull
    public static final String TAG = "KmlHelper";

    private KmlHelper() {
    }

    public static /* synthetic */ String convertToKML$default(KmlHelper kmlHelper, String str, List list, SportBasicReport sportBasicReport, int i, Object obj) {
        if ((i & 4) != 0) {
            sportBasicReport = null;
        }
        return kmlHelper.convertToKML(str, list, sportBasicReport);
    }

    @NotNull
    public final String convertToKML(@NotNull String trackName, @NotNull List<CommonTrackData> commonTrackDataList, @Nullable SportBasicReport basicReport) {
        String str;
        String str2;
        String str3 = "Point";
        String str4 = "when";
        String str5 = KeepAliveService.EXTRA_TIMESTAMP;
        String str6 = "";
        Intrinsics.checkNotNullParameter(trackName, "trackName");
        Intrinsics.checkNotNullParameter(commonTrackDataList, "commonTrackDataList");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT, Locale.getDefault());
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            Intrinsics.checkNotNullExpressionValue(xmlSerializerNewSerializer, "newSerializer(...)");
            StringWriter stringWriter = new StringWriter();
            xmlSerializerNewSerializer.setOutput(stringWriter);
            String str7 = "coordinates";
            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
            String str8 = null;
            xmlSerializerNewSerializer.startTag(null, "kml");
            xmlSerializerNewSerializer.attribute(null, "version", "1.0");
            xmlSerializerNewSerializer.attribute(null, "xmlns", "http://earth.google.com/kml/2.1");
            xmlSerializerNewSerializer.attribute(null, "xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
            xmlSerializerNewSerializer.attribute(null, "xsi:schemaLocation", "http://earth.google.com/kml/2.1 http://earth.google.com/kml2.1.xsd");
            xmlSerializerNewSerializer.startTag(null, "Document");
            xmlSerializerNewSerializer.startTag(null, "Folder");
            Integer distance = basicReport != null ? basicReport.getDistance() : null;
            Float riseHeight = basicReport != null ? basicReport.getRiseHeight() : null;
            Float fallHeight = basicReport != null ? basicReport.getFallHeight() : null;
            if (distance != null) {
                xmlSerializerNewSerializer.startTag(null, "ExtendedData");
                xmlSerializerNewSerializer.startTag(null, "Data");
                xmlSerializerNewSerializer.attribute(null, "name", "totalDistance");
                xmlSerializerNewSerializer.startTag(null, "value");
                xmlSerializerNewSerializer.text(distance.toString());
                xmlSerializerNewSerializer.endTag(null, "value");
                xmlSerializerNewSerializer.endTag(null, "Data");
                xmlSerializerNewSerializer.startTag(null, "Data");
                xmlSerializerNewSerializer.attribute(null, "name", "cumulativeClimb");
                xmlSerializerNewSerializer.startTag(null, "value");
                xmlSerializerNewSerializer.text(String.valueOf(riseHeight));
                xmlSerializerNewSerializer.endTag(null, "value");
                xmlSerializerNewSerializer.endTag(null, "Data");
                xmlSerializerNewSerializer.startTag(null, "Data");
                xmlSerializerNewSerializer.attribute(null, "name", "cumulativeDecrease");
                xmlSerializerNewSerializer.startTag(null, "value");
                xmlSerializerNewSerializer.text(String.valueOf(fallHeight));
                xmlSerializerNewSerializer.endTag(null, "value");
                xmlSerializerNewSerializer.endTag(null, "Data");
                xmlSerializerNewSerializer.endTag(null, "ExtendedData");
            }
            xmlSerializerNewSerializer.startTag(null, "name");
            xmlSerializerNewSerializer.text(trackName);
            xmlSerializerNewSerializer.endTag(null, "name");
            xmlSerializerNewSerializer.startTag(null, "Folder");
            xmlSerializerNewSerializer.startTag(null, "name");
            xmlSerializerNewSerializer.text("Track Points");
            xmlSerializerNewSerializer.endTag(null, "name");
            Iterator<CommonTrackData> it = commonTrackDataList.iterator();
            while (it.hasNext()) {
                CommonTrackData next = it.next();
                xmlSerializerNewSerializer.startTag(str8, "Placemark");
                xmlSerializerNewSerializer.startTag(str6, str5);
                xmlSerializerNewSerializer.startTag(str6, str4);
                Long time = next.getTime();
                xmlSerializerNewSerializer.text(simpleDateFormat.format(new Date(time != null ? time.longValue() : 0L)));
                xmlSerializerNewSerializer.endTag(str6, str4);
                xmlSerializerNewSerializer.endTag(str6, str5);
                String str9 = str3;
                xmlSerializerNewSerializer.startTag(str8, str9);
                String str10 = str7;
                xmlSerializerNewSerializer.startTag(str8, str10);
                Iterator<CommonTrackData> it2 = it;
                if (ParserHelper.INSTANCE.isValidAltitude(next.getElevation())) {
                    double longitude = next.getLongitude();
                    String str11 = str4;
                    double latitude = next.getLatitude();
                    str = str6;
                    str2 = str11;
                    try {
                        xmlSerializerNewSerializer.text(longitude + "," + latitude + ", " + next.getElevation());
                    } catch (Exception e) {
                        e = e;
                        Logger.i(GpxHelper.TAG, "convertToKML Exception : " + e.getMessage() + " ");
                        return str;
                    }
                } else {
                    str2 = str4;
                    str = str6;
                    xmlSerializerNewSerializer.text(next.getLongitude() + "," + next.getLatitude());
                }
                xmlSerializerNewSerializer.endTag(null, str10);
                xmlSerializerNewSerializer.endTag(null, str9);
                xmlSerializerNewSerializer.endTag(null, "Placemark");
                it = it2;
                simpleDateFormat = simpleDateFormat;
                str3 = str9;
                str5 = str5;
                str6 = str;
                str4 = str2;
                str8 = null;
                str7 = str10;
            }
            str = str6;
            xmlSerializerNewSerializer.endTag(str8, "Folder");
            xmlSerializerNewSerializer.endTag(str8, "Folder");
            xmlSerializerNewSerializer.endTag(str8, "Document");
            xmlSerializerNewSerializer.endTag(str8, "kml");
            xmlSerializerNewSerializer.endDocument();
            File fileCreateSaveTrackFile = ParserHelper.INSTANCE.createSaveTrackFile(trackName + ".kml");
            String string = stringWriter.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            FilesKt__FileReadWriteKt.writeText$default(fileCreateSaveTrackFile, string, null, 2, null);
            String path = fileCreateSaveTrackFile.getPath();
            Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
            return path;
        } catch (Exception e2) {
            e = e2;
            str = str6;
        }
    }

    @NotNull
    public final Triple<List<CommonTrackData>, List<WayPointData>, Triple<Double, Double, Double>> readKML(@NotNull InputStream inputStream) {
        String str;
        Double d;
        Double d2;
        Double d3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str2;
        ArrayList arrayList4;
        String str3;
        ArrayList arrayList5;
        Double doubleOrNull;
        Double doubleOrNull2;
        String str4 = "name";
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        String str5 = TAG;
        Logger.i(TAG, "readKML start");
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        if (inputStream.available() == 0) {
            Logger.i(GpxHelper.TAG, "readKML start,but inputStream is empty");
            return new Triple<>(arrayList6, arrayList9, null);
        }
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            Intrinsics.checkNotNullExpressionValue(xmlPullParserFactoryNewInstance, "newInstance(...)");
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            int eventType = xmlPullParserNewPullParser.getEventType();
            String strNextText = "";
            Double doubleOrNull3 = null;
            Double doubleOrNull4 = null;
            Double doubleOrNull5 = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            while (eventType != 1) {
                String str6 = str4;
                if (eventType == 2) {
                    arrayList2 = arrayList7;
                    arrayList = arrayList9;
                    arrayList3 = arrayList12;
                    ArrayList arrayList14 = arrayList13;
                    str2 = strNextText;
                    str5 = str5;
                    arrayList10 = arrayList10;
                    arrayList11 = arrayList11;
                    String name = xmlPullParserNewPullParser.getName();
                    arrayList4 = arrayList14;
                    if (StringsKt__StringsJVMKt.equals(name, "Placemark", true)) {
                        z10 = true;
                        str3 = str6;
                        strNextText = str2;
                    } else {
                        str3 = str6;
                        if (StringsKt__StringsJVMKt.equals(name, str3, true) && z10) {
                            strNextText = xmlPullParserNewPullParser.nextText();
                        } else {
                            if (StringsKt__StringsJVMKt.equals(name, "LineString", true)) {
                                z11 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "Point", true)) {
                                z13 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "coordinates", true)) {
                                z = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "gx:Track", true)) {
                                z4 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "gx:coord", true)) {
                                z2 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, KeepAliveService.EXTRA_TIMESTAMP, true)) {
                                z8 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "TimeSpan", true)) {
                                z5 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "when", true)) {
                                z3 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "begin", true)) {
                                z7 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, StatConstants.PARAM_END, true)) {
                                z15 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "Data", true) && Intrinsics.areEqual(xmlPullParserNewPullParser.getAttributeValue(null, str3), "totalDistance")) {
                                strNextText = str2;
                                z9 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "value", true)) {
                                z6 = true;
                            } else if (StringsKt__StringsJVMKt.equals(name, "Data", true) && Intrinsics.areEqual(xmlPullParserNewPullParser.getAttributeValue(null, str3), "cumulativeClimb")) {
                                strNextText = str2;
                                z12 = true;
                            } else {
                                if (StringsKt__StringsJVMKt.equals(name, "Data", true)) {
                                    if (Intrinsics.areEqual(xmlPullParserNewPullParser.getAttributeValue(null, str3), "cumulativeDecrease")) {
                                        strNextText = str2;
                                        z14 = true;
                                    }
                                }
                                strNextText = str2;
                            }
                            strNextText = str2;
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4) {
                        double dDoubleValue = -100000.0d;
                        if (z) {
                            try {
                                String text = xmlPullParserNewPullParser.getText();
                                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                                List<String> listSplit = new Regex("\\s+").split(text, 0);
                                if (z11) {
                                    Iterator<T> it = listSplit.iterator();
                                    while (it.hasNext()) {
                                        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) it.next(), new String[]{","}, false, 0, 6, (Object) null);
                                        if (listSplit$default.size() >= 2) {
                                            arrayList6.add(new CommonTrackData(Double.parseDouble((String) listSplit$default.get(1)), Double.parseDouble((String) listSplit$default.get(0)), (listSplit$default.size() < 3 || (doubleOrNull2 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) listSplit$default.get(2))) == null) ? -100000.0d : doubleOrNull2.doubleValue(), 0L, false, 16, null));
                                        }
                                    }
                                } else if (z13) {
                                    String text2 = xmlPullParserNewPullParser.getText();
                                    Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
                                    List listSplit$default2 = StringsKt__StringsKt.split$default((CharSequence) text2, new String[]{","}, false, 0, 6, (Object) null);
                                    if (listSplit$default2.size() >= 2) {
                                        double d4 = Double.parseDouble((String) listSplit$default2.get(0));
                                        double d5 = Double.parseDouble((String) listSplit$default2.get(1));
                                        if (listSplit$default2.size() >= 3 && (doubleOrNull = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull((String) listSplit$default2.get(2))) != null) {
                                            dDoubleValue = doubleOrNull.doubleValue();
                                        }
                                        double d6 = dDoubleValue;
                                        arrayList9.add(new WayPointData(strNextText, Double.valueOf(d5), Double.valueOf(d4), Double.valueOf(d6), new WayPointDescData(null, null, null)));
                                        arrayList7.add(new CommonTrackData(d5, d4, d6, 0L, false, 16, null));
                                    }
                                }
                                arrayList2 = arrayList7;
                                arrayList = arrayList9;
                                arrayList3 = arrayList12;
                                arrayList4 = arrayList13;
                                str2 = strNextText;
                            } catch (Exception e) {
                                e = e;
                            }
                        } else {
                            if (z2) {
                                if (z4) {
                                    try {
                                        String text3 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text3, "getText(...)");
                                        List<String> listSplit2 = new Regex("\\s+").split(text3, 0);
                                        if (listSplit2.size() >= 2) {
                                            double d7 = Double.parseDouble(listSplit2.get(0));
                                            str2 = strNextText;
                                            double d8 = Double.parseDouble(listSplit2.get(1));
                                            arrayList = arrayList9;
                                            if (listSplit2.size() >= 3) {
                                                try {
                                                    Double doubleOrNull6 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(listSplit2.get(2));
                                                    if (doubleOrNull6 != null) {
                                                        dDoubleValue = doubleOrNull6.doubleValue();
                                                    }
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str = str5;
                                                    d3 = doubleOrNull3;
                                                    d = doubleOrNull4;
                                                    d2 = doubleOrNull5;
                                                    arrayList9 = arrayList;
                                                    Logger.i(str, "XmlPullParserFactory解析KML异常了：" + e.getMessage());
                                                    return new Triple<>(arrayList6, arrayList9, new Triple(d3, d, d2));
                                                }
                                            }
                                            arrayList3 = arrayList12;
                                            arrayList5 = arrayList13;
                                            double d9 = dDoubleValue;
                                            StringBuilder sb = new StringBuilder();
                                            arrayList2 = arrayList7;
                                            sb.append("parseTrackPoint：");
                                            sb.append(d8);
                                            sb.append(",");
                                            sb.append(d7);
                                            sb.append(",");
                                            sb.append(d9);
                                            Logger.i(str5, sb.toString());
                                            arrayList8.add(new CommonTrackData(d8, d7, d9, 0L, false, 16, null));
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                    }
                                }
                                arrayList2 = arrayList7;
                                arrayList = arrayList9;
                                arrayList3 = arrayList12;
                                str2 = strNextText;
                                arrayList4 = arrayList13;
                            } else {
                                arrayList2 = arrayList7;
                                arrayList = arrayList9;
                                arrayList3 = arrayList12;
                                arrayList5 = arrayList13;
                                str2 = strNextText;
                                if (z3) {
                                    if (z4) {
                                        ParserHelper parserHelper = ParserHelper.INSTANCE;
                                        String text4 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text4, "getText(...)");
                                        arrayList10.add(Long.valueOf(parserHelper.parseTimeString(text4)));
                                    } else if (z8) {
                                        ParserHelper parserHelper2 = ParserHelper.INSTANCE;
                                        String text5 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text5, "getText(...)");
                                        arrayList11.add(Long.valueOf(parserHelper2.parseTimeString(text5)));
                                    }
                                } else if (z5) {
                                    if (z7) {
                                        ParserHelper parserHelper3 = ParserHelper.INSTANCE;
                                        String text6 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text6, "getText(...)");
                                        arrayList3.add(Long.valueOf(parserHelper3.parseTimeString(text6)));
                                    }
                                    if (z15) {
                                        ParserHelper parserHelper4 = ParserHelper.INSTANCE;
                                        String text7 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text7, "getText(...)");
                                        arrayList5.add(Long.valueOf(parserHelper4.parseTimeString(text7)));
                                    }
                                } else if (z6) {
                                    if (z9) {
                                        String text8 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text8, "getText(...)");
                                        doubleOrNull3 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(text8);
                                    }
                                    if (z12) {
                                        String text9 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text9, "getText(...)");
                                        doubleOrNull4 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(text9);
                                    }
                                    if (z14) {
                                        String text10 = xmlPullParserNewPullParser.getText();
                                        Intrinsics.checkNotNullExpressionValue(text10, "getText(...)");
                                        doubleOrNull5 = StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(text10);
                                    }
                                    arrayList4 = arrayList5;
                                    str3 = str6;
                                    strNextText = str2;
                                }
                            }
                            arrayList4 = arrayList5;
                        }
                        str = str5;
                        d3 = doubleOrNull3;
                        d = doubleOrNull4;
                        d2 = doubleOrNull5;
                        Logger.i(str, "XmlPullParserFactory解析KML异常了：" + e.getMessage());
                        return new Triple<>(arrayList6, arrayList9, new Triple(d3, d, d2));
                    }
                    arrayList2 = arrayList7;
                    arrayList = arrayList9;
                    arrayList3 = arrayList12;
                    arrayList4 = arrayList13;
                    str2 = strNextText;
                    str3 = str6;
                    strNextText = str2;
                } else {
                    arrayList2 = arrayList7;
                    arrayList = arrayList9;
                    arrayList3 = arrayList12;
                    arrayList5 = arrayList13;
                    str2 = strNextText;
                    String name2 = xmlPullParserNewPullParser.getName();
                    if (StringsKt__StringsJVMKt.equals(name2, "Placemark", true)) {
                        z10 = false;
                    } else if (StringsKt__StringsJVMKt.equals(name2, "LineString", true)) {
                        z11 = false;
                    } else if (StringsKt__StringsJVMKt.equals(name2, "Point", true)) {
                        z13 = false;
                    } else if (StringsKt__StringsJVMKt.equals(name2, "coordinates", true)) {
                        z = false;
                    } else if (StringsKt__StringsJVMKt.equals(name2, "gx:Track", true)) {
                        z4 = false;
                    } else if (StringsKt__StringsJVMKt.equals(name2, "gx:coord", true)) {
                        z2 = false;
                    } else if (StringsKt__StringsJVMKt.equals(name2, KeepAliveService.EXTRA_TIMESTAMP, true)) {
                        z8 = false;
                    } else {
                        if (StringsKt__StringsJVMKt.equals(name2, "TimeSpan", true)) {
                            str5 = str5;
                            z5 = true;
                        } else if (StringsKt__StringsJVMKt.equals(name2, "when", true)) {
                            z3 = false;
                        } else if (StringsKt__StringsJVMKt.equals(name2, "begin", true)) {
                            z7 = false;
                        } else if (StringsKt__StringsJVMKt.equals(name2, StatConstants.PARAM_END, true)) {
                            z15 = false;
                        } else if (StringsKt__StringsJVMKt.equals(name2, "Data", true)) {
                            z9 = false;
                            z12 = false;
                            z14 = false;
                        } else {
                            if (StringsKt__StringsJVMKt.equals(name2, "value", true)) {
                                z6 = false;
                            }
                            arrayList4 = arrayList5;
                            str3 = str6;
                            strNextText = str2;
                        }
                        arrayList4 = arrayList5;
                        str3 = str6;
                        strNextText = str2;
                    }
                    arrayList4 = arrayList5;
                    str3 = str6;
                    strNextText = str2;
                }
                try {
                    eventType = xmlPullParserNewPullParser.next();
                    arrayList12 = arrayList3;
                    str4 = str3;
                    str5 = str5;
                    arrayList10 = arrayList10;
                    arrayList11 = arrayList11;
                    arrayList13 = arrayList4;
                    arrayList7 = arrayList2;
                    arrayList9 = arrayList;
                } catch (Exception e4) {
                    e = e4;
                    str = str5;
                    d3 = doubleOrNull3;
                    d = doubleOrNull4;
                    d2 = doubleOrNull5;
                    arrayList9 = arrayList;
                    Logger.i(str, "XmlPullParserFactory解析KML异常了：" + e.getMessage());
                    return new Triple<>(arrayList6, arrayList9, new Triple(d3, d, d2));
                }
            }
            str5 = str5;
            ArrayList arrayList15 = arrayList7;
            arrayList = arrayList9;
            ArrayList arrayList16 = arrayList10;
            ArrayList arrayList17 = arrayList11;
            ArrayList arrayList18 = arrayList12;
            ArrayList arrayList19 = arrayList13;
            inputStream.close();
            if (arrayList6.isEmpty() && (!arrayList8.isEmpty())) {
                arrayList6.addAll(arrayList8);
                arrayList8.clear();
            }
            if (arrayList6.isEmpty() && (!arrayList15.isEmpty())) {
                arrayList6.addAll(arrayList15);
                arrayList15.clear();
            }
            if (!arrayList6.isEmpty()) {
                if (!arrayList18.isEmpty()) {
                    if (arrayList18.size() == arrayList6.size()) {
                        int i = 0;
                        for (Object obj : arrayList18) {
                            int i2 = i + 1;
                            if (i < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((CommonTrackData) arrayList6.get(i)).setTime(Long.valueOf(((Number) obj).longValue()));
                            i = i2;
                        }
                    } else if (arrayList18.size() >= 2) {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList18));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.last((List) arrayList18));
                    } else {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList18));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList18));
                    }
                } else if (!arrayList19.isEmpty()) {
                    if (arrayList19.size() == arrayList6.size()) {
                        int i3 = 0;
                        for (Object obj2 : arrayList19) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((CommonTrackData) arrayList6.get(i3)).setTime(Long.valueOf(((Number) obj2).longValue()));
                            i3 = i4;
                        }
                    } else if (arrayList19.size() >= 2) {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList19));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.last((List) arrayList19));
                    } else {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList19));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList19));
                    }
                } else if (!arrayList17.isEmpty()) {
                    if (arrayList17.size() == arrayList6.size()) {
                        int i5 = 0;
                        for (Object obj3 : arrayList17) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((CommonTrackData) arrayList6.get(i5)).setTime(Long.valueOf(((Number) obj3).longValue()));
                            i5 = i6;
                        }
                    } else if (arrayList17.size() >= 2) {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList17));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.last((List) arrayList17));
                    } else {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList17));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList17));
                    }
                } else if (!arrayList16.isEmpty()) {
                    if (arrayList16.size() == arrayList6.size()) {
                        int i7 = 0;
                        for (Object obj4 : arrayList16) {
                            int i8 = i7 + 1;
                            if (i7 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            ((CommonTrackData) arrayList6.get(i7)).setTime(Long.valueOf(((Number) obj4).longValue()));
                            i7 = i8;
                        }
                    } else if (arrayList16.size() >= 2) {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList16));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.last((List) arrayList16));
                    } else {
                        ((CommonTrackData) CollectionsKt___CollectionsKt.first((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList16));
                        ((CommonTrackData) CollectionsKt___CollectionsKt.last((List) arrayList6)).setTime((Long) CollectionsKt___CollectionsKt.first((List) arrayList16));
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("totalDistance：");
            d3 = doubleOrNull3;
            try {
                sb2.append(d3);
                sb2.append(",cumulativeClimb：");
                d = doubleOrNull4;
                try {
                    sb2.append(d);
                    sb2.append(",cumulativeDecrease：");
                    d2 = doubleOrNull5;
                    try {
                        sb2.append(d2);
                        str = str5;
                        try {
                            Logger.i(str, sb2.toString());
                            arrayList9 = arrayList;
                            try {
                                return new Triple<>(arrayList6, arrayList9, new Triple(d3, d, d2));
                            } catch (Exception e5) {
                                e = e5;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            arrayList9 = arrayList;
                        }
                    } catch (Exception e7) {
                        e = e7;
                        str = str5;
                    }
                } catch (Exception e8) {
                    e = e8;
                    str = str5;
                    d2 = doubleOrNull5;
                    arrayList9 = arrayList;
                    Logger.i(str, "XmlPullParserFactory解析KML异常了：" + e.getMessage());
                    return new Triple<>(arrayList6, arrayList9, new Triple(d3, d, d2));
                }
            } catch (Exception e9) {
                e = e9;
                str = str5;
                d = doubleOrNull4;
                d2 = doubleOrNull5;
                arrayList9 = arrayList;
                Logger.i(str, "XmlPullParserFactory解析KML异常了：" + e.getMessage());
                return new Triple<>(arrayList6, arrayList9, new Triple(d3, d, d2));
            }
        } catch (Exception e10) {
            e = e10;
            str = TAG;
            d = null;
            d2 = null;
            d3 = null;
        }
    }
}
