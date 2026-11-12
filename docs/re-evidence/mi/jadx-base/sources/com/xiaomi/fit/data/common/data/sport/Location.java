package com.xiaomi.fit.data.common.data.sport;

import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class Location implements Comparable<Location>, Serializable {
    public static int LOCATION_TYPE_GPS = 0;
    public static int LOCATION_TYPE_WIFI = 1;
    public double altitude;
    public float angle;
    public float bearing;
    public double distance;
    public boolean flagSegment;
    public int gpsSource;
    public float horizontalAccuracy;
    public boolean isPause = false;
    public boolean isSaveFlag = false;
    public int kilometer;
    public double latitude;
    public int locationType;
    public double longitude;
    public int pace;
    public float speed;
    public float speedAccuracy;
    public int sportLabel;
    public long startTimeStamp;
    public long time;
    public long timeStamp;
    public double total_distance;
    public float verticalAccuracy;

    public String toString() {
        return "Location{timeStamp=" + this.timeStamp + ", startTimeStamp=" + this.startTimeStamp + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", distance=" + this.distance + ", kilometer=" + this.kilometer + ", flagSegment=" + this.flagSegment + ", horizontalAccuracy = " + this.horizontalAccuracy + ", speed=" + this.speed + ", time=" + this.time + ", bearing=" + this.bearing + ", altitude=" + this.altitude + ", total_distance = " + this.total_distance + ", pace = " + this.pace + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // java.lang.Comparable
    public int compareTo(Location location) {
        return (int) (this.timeStamp - location.timeStamp);
    }
}
