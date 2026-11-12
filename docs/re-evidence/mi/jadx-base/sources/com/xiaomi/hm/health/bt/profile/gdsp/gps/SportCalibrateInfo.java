package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SportCalibrateInfo {
    private SportType sportType = SportType.SPORT_TYPE_IDRUN;
    private int startTimestamp = 0;
    private int startTimezone = 0;
    private int step = 0;
    private int distance = 0;

    public int getDistance() {
        return this.distance;
    }

    public SportType getSportType() {
        return this.sportType;
    }

    public int getStartTimestamp() {
        return this.startTimestamp;
    }

    public int getStartTimezone() {
        return this.startTimezone;
    }

    public int getStep() {
        return this.step;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public void setSportType(SportType sportType) {
        this.sportType = sportType;
    }

    public void setStartTimestamp(int i) {
        this.startTimestamp = i;
    }

    public void setStartTimezone(int i) {
        this.startTimezone = i;
    }

    public void setStep(int i) {
        this.step = i;
    }

    public String toString() {
        return "SportCalibrateInfo{sportType=" + this.sportType + ", startTimestamp=" + this.startTimestamp + ", startTimezone=" + this.startTimezone + ", step=" + this.step + ", distance=" + this.distance + AbstractJsonLexerKt.END_OBJ;
    }
}
