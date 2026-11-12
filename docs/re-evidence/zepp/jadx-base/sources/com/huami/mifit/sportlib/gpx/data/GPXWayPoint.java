package com.huami.mifit.sportlib.gpx.data;

import java.io.PrintStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class GPXWayPoint extends GPXBasePoint {

    public static class XML {
        public static final String TAG_WPT = "wpt";
    }

    public GPXWayPoint(float f, float f2) {
        super(f, f2);
    }

    public void toGPX(PrintStream printStream) {
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList.add(GPXBasePoint.XML.ATTR_LAT);
        arrayList.add(GPXBasePoint.XML.ATTR_LON);
        arrayList2.add(Float.toString(getLatitude().floatValue()));
        arrayList2.add(Float.toString(getLongitude().floatValue()));
        openXmlTag(XML.TAG_WPT, printStream, arrayList, arrayList2, true, 1);
        putFloatValueInXmlIfNotNull(GPXBasePoint.XML.TAG_ELE, getElevation(), printStream, 2);
        putDateTimeValueInXmlIfNotNull("time", getTimeStamp(), printStream, 2);
        putStringValueInXmlIfNotNull("name", getName(), printStream, 2);
        putStringValueInXmlIfNotNull("type", getType(), printStream, 2);
        putStringValueInXmlIfNotNull("desc", getDescription(), printStream, 2);
        putFloatValueInXmlIfNotNull(GPXBasePoint.XML.TAG_HDOP, getHDop(), printStream, 2);
        putFloatValueInXmlIfNotNull(GPXBasePoint.XML.TAG_VDOP, getVDop(), printStream, 2);
        closeXmlTag(XML.TAG_WPT, printStream, true, 1);
    }
}
