package com.xiaomi.hm.health.bt.profile.gdsp.gps;

/* JADX INFO: loaded from: classes18.dex */
public class SportCalibrateInfo {
    private SportType a = SportType.SPORT_TYPE_IDRUN;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;

    public int getDistance() {
        return this.e;
    }

    public SportType getSportType() {
        return this.a;
    }

    public int getStartTimestamp() {
        return this.b;
    }

    public int getStartTimezone() {
        return this.c;
    }

    public int getStep() {
        return this.d;
    }

    public void setDistance(int distance) {
        this.e = distance;
    }

    public void setSportType(SportType sportType) {
        this.a = sportType;
    }

    public void setStartTimestamp(int startTimestamp) {
        this.b = startTimestamp;
    }

    public void setStartTimezone(int startTimezone) {
        this.c = startTimezone;
    }

    public void setStep(int step) {
        this.d = step;
    }

    public String toString() {
        return "SportCalibrateInfo{sportType=" + this.a + ", startTimestamp=" + this.b + ", startTimezone=" + this.c + ", step=" + this.d + ", distance=" + this.e + '}';
    }
}
