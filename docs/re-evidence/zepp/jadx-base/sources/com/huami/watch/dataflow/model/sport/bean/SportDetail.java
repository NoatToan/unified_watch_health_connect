package com.huami.watch.dataflow.model.sport.bean;

import android.text.TextUtils;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "sport_detail")
public class SportDetail extends Model {
    public static final String COLUMN_ACCURACY = "accuracy";
    public static final String COLUMN_AIR_PRESSURE_ALTITUDE = "air_pressure_altitude";
    public static final String COLUMN_ALTITUDE = "altitude";
    public static final String COLUMN_CADENCE = "cadence";
    public static final String COLUMN_DELTA_TIME_ALTITUDE = "delta_time_altitude";
    public static final String COLUMN_DISTANCE = "distance";
    public static final String COLUMN_FLAG = "flag";
    public static final String COLUMN_GAIT = "gait";
    public static final String COLUMN_HEART_RATE = "heart_rate";
    public static final String COLUMN_KILO_PACE = "kilo_pace";
    public static final String COLUMN_LAP = "lap";
    public static final String COLUMN_LONGITUDE_LATITUDE = "longitude_latitude";
    public static final String COLUMN_MILE_PACE = "mile_pace";
    public static final String COLUMN_PACE = "pace";
    public static final String COLUMN_PAUSE = "pause";
    public static final String COLUMN_PERFORMANCE_STATUS = "performance_status";
    public static final String COLUMN_PROVIDER = "provider";
    public static final String COLUMN_SEGMENT = "segment";
    public static final String COLUMN_SOURCE = "source";
    public static final String COLUMN_SPEED = "speed";
    public static final String COLUMN_STROKE_SPEED = "stroke_speed";
    public static final String COLUMN_SYNCED = "synced";
    public static final String COLUMN_TIME = "time";
    public static final String COLUMN_TRACK_ID = "trackid";
    public static final String COLUMN_VERSION = "version";
    public static final String COLUMN_WEATHER = "weather_info";

    @Column(name = "accuracy")
    private String bulkacc;

    @Column(name = "altitude")
    private String bulkal;

    @Column(name = "air_pressure_altitude")
    private String bulkbarometerAltitude;

    @Column(name = "distance")
    private String bulkdistance;

    @Column(name = "flag")
    private String bulkflag;

    @Column(name = "gait")
    private String bulkgait;

    @Column(name = "heart_rate")
    private String bulkhr;

    @Column(name = "longitude_latitude")
    private String bulkll;

    @Column(name = "pace")
    private String bulkpace;

    @Column(name = "pause")
    private String bulkpause;

    @Column(name = "time")
    private String bulktime;

    @Column(name = "cadence")
    private String cadence;

    @Column(name = COLUMN_DELTA_TIME_ALTITUDE)
    private String deltaTimeAltitude;

    @Column(name = "kilo_pace")
    private String kilomarked;

    @Column(name = "lap")
    private String lap;

    @Column(name = "mile_pace")
    private String milemarked;

    @Column(name = COLUMN_PERFORMANCE_STATUS)
    private String performanceStatus;

    @Column(name = "provider")
    private String provider;

    @Column(name = COLUMN_SEGMENT)
    private int segment;

    @Column(name = "source", onUniqueConflicts = {Column.ConflictAction.ABORT}, uniqueGroups = {"group"})
    private String source;

    @Column(name = "speed")
    private String speed;

    @Column(name = "stroke_speed")
    private String strokeSpeed;

    @Column(name = "synced")
    private int synced;

    @Column(index = true, name = "trackid", notNull = true, onUniqueConflicts = {Column.ConflictAction.ABORT}, uniqueGroups = {"group"})
    private long trackid;

    @Column(name = "version")
    private int v;

    @Column(name = "weather_info")
    private String weather;

    public String getBulkacc() {
        return this.bulkacc;
    }

    public String getBulkal() {
        return this.bulkal;
    }

    public String getBulkbarometerAltitude() {
        return this.bulkbarometerAltitude;
    }

    public String getBulkdistance() {
        return this.bulkdistance;
    }

    public String getBulkflag() {
        return this.bulkflag;
    }

    public String getBulkgait() {
        return this.bulkgait;
    }

    public String getBulkhr() {
        return this.bulkhr;
    }

    public String getBulkll() {
        return this.bulkll;
    }

    public String getBulkpace() {
        return this.bulkpace;
    }

    public String getBulkpause() {
        return this.bulkpause;
    }

    public String getBulktime() {
        return this.bulktime;
    }

    public String getCadence() {
        return this.cadence;
    }

    public String getDeltaTimeAltitude() {
        return this.deltaTimeAltitude;
    }

    public String getKilomarked() {
        return this.kilomarked;
    }

    public String getLap() {
        return this.lap;
    }

    public String getMilemarked() {
        return this.milemarked;
    }

    public String getPerformanceStatus() {
        return this.performanceStatus;
    }

    public String getProvider() {
        return this.provider;
    }

    public int getSegment() {
        return this.segment;
    }

    public String getSource() {
        return this.source;
    }

    public String getSpeed() {
        return this.speed;
    }

    public String getStrokeSpeed() {
        return this.strokeSpeed;
    }

    public int getSynced() {
        return this.synced;
    }

    public long getTrackid() {
        return this.trackid;
    }

    public int getV() {
        return this.v;
    }

    public String getWeather() {
        return this.weather;
    }

    public boolean segmentInfoIsEmpty() {
        return TextUtils.isEmpty(this.lap);
    }

    public void setBulkacc(String str) {
        this.bulkacc = str;
    }

    public void setBulkal(String str) {
        this.bulkal = str;
    }

    public void setBulkbarometerAltitude(String str) {
        this.bulkbarometerAltitude = str;
    }

    public void setBulkdistance(String str) {
        this.bulkdistance = str;
    }

    public void setBulkflag(String str) {
        this.bulkflag = str;
    }

    public void setBulkgait(String str) {
        this.bulkgait = str;
    }

    public void setBulkhr(String str) {
        this.bulkhr = str;
    }

    public void setBulkll(String str) {
        this.bulkll = str;
    }

    public void setBulkpace(String str) {
        this.bulkpace = str;
    }

    public void setBulkpause(String str) {
        this.bulkpause = str;
    }

    public void setBulktime(String str) {
        this.bulktime = str;
    }

    public void setCadence(String str) {
        this.cadence = str;
    }

    public void setDeltaTimeAltitude(String str) {
        this.deltaTimeAltitude = str;
    }

    public void setKilomarked(String str) {
        this.kilomarked = str;
    }

    public void setLap(String str) {
        this.lap = str;
    }

    public void setMilemarked(String str) {
        this.milemarked = str;
    }

    public void setPerformanceStatus(String str) {
        this.performanceStatus = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSegment(int i) {
        this.segment = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSpeed(String str) {
        this.speed = str;
    }

    public void setStrokeSpeed(String str) {
        this.strokeSpeed = str;
    }

    public void setSynced(Integer num) {
        this.synced = num.intValue();
    }

    public void setTrackid(long j) {
        this.trackid = j;
    }

    public void setV(Integer num) {
        this.v = num.intValue();
    }

    public void setWeather(String str) {
        this.weather = str;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "<Trackid: " + this.trackid + ", Source: '" + this.source + "', Segment: " + this.segment + ", Bulkll: '" + this.bulkll + "', Bulkgait: '" + this.bulkgait + "', Bulkal: '" + this.bulkal + "', Bulkacc: '" + this.bulkacc + "', Bulktime: '" + this.bulktime + "', Bulkflag: '" + this.bulkflag + "', Bulkpace: '" + this.bulkpace + "', Speed: '" + this.speed + "', Bulkpause: '" + this.bulkpause + "', Kilomarked: '" + this.kilomarked + "', Bulkdistance: '" + this.bulkdistance + "', BulkbarometerAltitude: '" + this.bulkbarometerAltitude + "', Bulkhr: '" + this.bulkhr + "', Milemarked: '" + this.milemarked + "', DeltaTimeAltitude: '" + this.deltaTimeAltitude + "', StrokeSpeed: '" + this.strokeSpeed + "', Cadence: '" + this.cadence + "', PerformanceStatus: '" + this.performanceStatus + "', Lap: '" + this.lap + "', Weather: '" + this.weather + "', provider: " + this.provider + ", V: " + this.v + ", Synced: " + this.synced + Typography.greater;
    }
}
