package com.huami.mifit.sportlib.gpx.data;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class GPXSegment extends GPXBaseEntity {
    private ArrayList<GPXTrackPoint> a = new ArrayList<>();

    public static class XML {
        public static final String TAG_TRKSEG = "trkseg";
    }

    public void addPoint(GPXTrackPoint gPXTrackPoint) {
        this.a.add(gPXTrackPoint);
    }

    public ArrayList<GPXTrackPoint> getTrackPoints() {
        ArrayList<GPXTrackPoint> arrayList = new ArrayList<>();
        Iterator<GPXTrackPoint> it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    public void toGPX(PrintStream printStream) {
        openXmlTag(XML.TAG_TRKSEG, printStream, true, 2);
        Iterator<GPXTrackPoint> it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next().toGPX(printStream);
        }
        closeXmlTag(XML.TAG_TRKSEG, printStream, true, 2);
    }
}
