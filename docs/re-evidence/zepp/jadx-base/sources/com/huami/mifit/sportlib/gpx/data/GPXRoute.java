package com.huami.mifit.sportlib.gpx.data;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class GPXRoute extends GPXBaseEntity {
    private String a = null;
    private String b = null;
    private String c = null;
    private ArrayList<GPXRoutePoint> d = new ArrayList<>();
    private String e = null;

    public static class XML {
        public static final String TAG_CMT = "cmt";
        public static final String TAG_DESC = "desc";
        public static final String TAG_NAME = "name";
        public static final String TAG_RTE = "rte";
        public static final String TAG_TYPE = "type";
    }

    public void addPoint(GPXRoutePoint gPXRoutePoint) {
        this.d.add(gPXRoutePoint);
    }

    public String getGpsComment() {
        return this.b;
    }

    public String getName() {
        return this.a;
    }

    public ArrayList<GPXRoutePoint> getRoutePoints() {
        ArrayList<GPXRoutePoint> arrayList = new ArrayList<>();
        Iterator<GPXRoutePoint> it2 = this.d.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public String getType() {
        return this.e;
    }

    public String getUserDescription() {
        return this.c;
    }

    public void setGpsComment(String str) {
        this.b = str;
    }

    public void setName(String str) {
        this.a = str;
    }

    public void setType(String str) {
        this.e = str;
    }

    public void setUserDescription(String str) {
        this.c = str;
    }

    public void toGPX(PrintStream printStream) {
        openXmlTag(XML.TAG_RTE, printStream, true, 1);
        putStringValueInXmlIfNotNull("name", getName(), printStream, 2);
        putStringValueInXmlIfNotNull("cmt", getGpsComment(), printStream, 2);
        putStringValueInXmlIfNotNull("desc", getUserDescription(), printStream, 2);
        putStringValueInXmlIfNotNull("type", getType(), printStream, 2);
        Iterator<GPXRoutePoint> it2 = this.d.iterator();
        while (it2.hasNext()) {
            it2.next().toGPX(printStream);
        }
        closeXmlTag(XML.TAG_RTE, printStream, true, 1);
    }
}
