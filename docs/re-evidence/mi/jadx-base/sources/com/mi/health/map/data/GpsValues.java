package com.mi.health.map.data;

import com.xiaomi.fit.data.common.data.sport.Location;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class GpsValues implements Serializable {
    public static final int LOST_GPS_POINT_TIME_INTERVAL = 30;
    private static final String TAG = "GpsValues";
    public final String sid;
    public final int sportType;
    public final long timeStamp;
    public final List<Location> originalLocationList = new ArrayList();
    public final List<Location> locationList = new ArrayList();
    public List<Location> integerKilometerList = new ArrayList();
    public final List<Location> runLocationList = new ArrayList();
    public final List<Location> cycleLocationList = new ArrayList();
    public final List<Location> swimLocationList = new ArrayList();
    public final ArrayList<Location> gpsPathPoint = new ArrayList<>();

    public GpsValues(String str, long j, int i) {
        this.sid = str;
        this.timeStamp = j;
        this.sportType = i;
    }

    public static boolean validGpsValue(GpsValues gpsValues) {
        List<Location> list;
        return (gpsValues == null || (list = gpsValues.locationList) == null || list.size() <= 0) ? false : true;
    }
}
