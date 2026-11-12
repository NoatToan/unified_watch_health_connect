package com.xiaomi.wearable.gpsalgorithm.data;

import com.xiaomi.fit.data.common.data.sport.Location;

/* JADX INFO: loaded from: classes2.dex */
public class FitnessLocationInfo {
    public double distance;
    public double latitude;
    public double longitude;
    public int pace;
    public long timeStamp;
    public double total_distance;

    public FitnessLocationInfo() {
    }

    public String toString() {
        return "timeStamp = " + this.timeStamp + ", longitude = " + this.longitude + ", latitude = " + this.latitude + ", pace = " + this.pace + ", total_distance = " + this.total_distance + ", distance = " + this.distance;
    }

    public FitnessLocationInfo(Location location) {
        if (location != null) {
            this.timeStamp = location.timeStamp;
            this.latitude = location.latitude;
            this.longitude = location.longitude;
        }
    }
}
