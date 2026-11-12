package com.huami.mifit.sportlib.gpx.data;

import java.io.PrintStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class GPXRoutePoint extends GPXBasePoint {

    public static class XML {
        public static final String TAG_RTEPT = "rtept";
    }

    public GPXRoutePoint(float f, float f2) {
        super(f, f2);
    }

    public void toGPX(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add(GPXBasePoint.XML.ATTR_LAT);
        arrayList.add(GPXBasePoint.XML.ATTR_LON);
        arrayList2.add(Float.toString(getLatitude().floatValue()));
        arrayList2.add(Float.toString(getLongitude().floatValue()));
        openXmlTag(XML.TAG_RTEPT, printStream, arrayList, arrayList2, true, 3);
        putFloatValueInXmlIfNotNull(GPXBasePoint.XML.TAG_ELE, getElevation(), printStream, 4);
        putDateTimeValueInXmlIfNotNull("time", getTimeStamp(), printStream, 4);
        putStringValueInXmlIfNotNull("name", getName(), printStream, 4);
        putStringValueInXmlIfNotNull("type", getType(), printStream, 4);
        putStringValueInXmlIfNotNull("desc", getDescription(), printStream, 4);
        putFloatValueInXmlIfNotNull(GPXBasePoint.XML.TAG_HDOP, getHDop(), printStream, 4);
        putFloatValueInXmlIfNotNull(GPXBasePoint.XML.TAG_VDOP, getVDop(), printStream, 4);
        closeXmlTag(XML.TAG_RTEPT, printStream, true, 3);
    }
}
