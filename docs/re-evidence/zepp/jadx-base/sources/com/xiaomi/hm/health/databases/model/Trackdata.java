package com.xiaomi.hm.health.databases.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes20.dex */
@Keep
public class Trackdata {
    private String bulkPressure;
    private String bulkRopeSkippingFreq;
    private String bulkTemperature;
    private String bulkacc;
    private String bulkal;
    private String bulkbarometerAltitude;
    private String bulkdistance;
    private String bulkflag;
    private String bulkgait;
    private String bulkhr;
    private String bulkll;
    private String bulkpace;
    private String bulkpause;
    private String bulkspeed;
    private String bulkspo2;
    private String bulktime;
    private String cadence;
    private String coachSegment;
    private Integer compressed;
    private String correctAltitude;
    private String dailyPerformance;
    private String friendId;
    private String golfAngle;
    private String golfBeat;

    @Deprecated
    private String golfDownTime;
    private String golfSwingRtData;
    private String golfUpTime;
    private Long id;
    private String kilomarked;
    private String lap;
    private String milemarked;
    private String powerMeter;
    private Integer provider;
    private Integer segment;
    private Integer size;
    private Integer source;
    private String strokeSpeed;
    private Integer synced;
    private String timeDeltaAltitude;
    private Long trackid;
    private Integer type;
    private Integer v;
    private String weatherInfo;

    public Trackdata(Long l, Integer num, Integer num2, Long l2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30) {
        this.id = l;
        this.source = num;
        this.type = num2;
        this.trackid = l2;
        this.segment = num3;
        this.bulkll = str;
        this.bulkgait = str2;
        this.bulkal = str3;
        this.bulkacc = str4;
        this.bulktime = str5;
        this.bulkflag = str6;
        this.bulkpace = str7;
        this.bulkpause = str8;
        this.kilomarked = str9;
        this.bulkdistance = str10;
        this.bulkbarometerAltitude = str11;
        this.bulkhr = str12;
        this.milemarked = str13;
        this.size = num4;
        this.v = num5;
        this.compressed = num6;
        this.provider = num7;
        this.synced = num8;
        this.correctAltitude = str14;
        this.strokeSpeed = str15;
        this.cadence = str16;
        this.dailyPerformance = str17;
        this.lap = str18;
        this.bulkspeed = str19;
        this.coachSegment = str20;
        this.weatherInfo = str21;
        this.bulkRopeSkippingFreq = str22;
        this.bulkspo2 = str23;
        this.bulkPressure = str24;
        this.bulkTemperature = str25;
        this.timeDeltaAltitude = str26;
        this.golfBeat = str27;
        this.golfAngle = str28;
        this.golfUpTime = str29;
        this.golfDownTime = str30;
    }

    public String getBulkPressure() {
        return this.bulkPressure;
    }

    public String getBulkRopeSkippingFreq() {
        return this.bulkRopeSkippingFreq;
    }

    public String getBulkTemperature() {
        return this.bulkTemperature;
    }

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

    public String getBulkspeed() {
        return this.bulkspeed;
    }

    public String getBulkspo2() {
        return this.bulkspo2;
    }

    public String getBulktime() {
        return this.bulktime;
    }

    public String getCadence() {
        return this.cadence;
    }

    public String getCoachSegment() {
        return this.coachSegment;
    }

    public Integer getCompressed() {
        return this.compressed;
    }

    public String getCorrectAltitude() {
        return this.correctAltitude;
    }

    public String getDailyPerformance() {
        return this.dailyPerformance;
    }

    public String getFriendId() {
        return this.friendId;
    }

    public String getGolfAngle() {
        return this.golfAngle;
    }

    public String getGolfBeat() {
        return this.golfBeat;
    }

    public String getGolfDownTime() {
        return this.golfDownTime;
    }

    public String getGolfSwingRtData() {
        return this.golfSwingRtData;
    }

    public String getGolfUpTime() {
        return this.golfUpTime;
    }

    public Long getId() {
        return this.id;
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

    public String getPowerMeter() {
        return this.powerMeter;
    }

    public Integer getProvider() {
        return this.provider;
    }

    public Integer getSegment() {
        return this.segment;
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getSource() {
        return this.source;
    }

    public String getStrokeSpeed() {
        return this.strokeSpeed;
    }

    public Integer getSynced() {
        return this.synced;
    }

    public String getTimeDeltaAltitude() {
        return this.timeDeltaAltitude;
    }

    public Long getTrackid() {
        return this.trackid;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getV() {
        return this.v;
    }

    public String getWeatherInfo() {
        return this.weatherInfo;
    }

    public void setBulkPressure(String str) {
        this.bulkPressure = str;
    }

    public void setBulkRopeSkippingFreq(String str) {
        this.bulkRopeSkippingFreq = str;
    }

    public void setBulkTemperature(String str) {
        this.bulkTemperature = str;
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

    public void setBulkspeed(String str) {
        this.bulkspeed = str;
    }

    public void setBulkspo2(String str) {
        this.bulkspo2 = str;
    }

    public void setBulktime(String str) {
        this.bulktime = str;
    }

    public void setCadence(String str) {
        this.cadence = str;
    }

    public void setCoachSegment(String str) {
        this.coachSegment = str;
    }

    public void setCompressed(Integer num) {
        this.compressed = num;
    }

    public void setCorrectAltitude(String str) {
        this.correctAltitude = str;
    }

    public void setDailyPerformance(String str) {
        this.dailyPerformance = str;
    }

    public void setFriendId(String str) {
        this.friendId = str;
    }

    public void setGolfAngle(String str) {
        this.golfAngle = str;
    }

    public void setGolfBeat(String str) {
        this.golfBeat = str;
    }

    public void setGolfDownTime(String str) {
        this.golfDownTime = str;
    }

    public void setGolfSwingRtData(String str) {
        this.golfSwingRtData = str;
    }

    public void setGolfUpTime(String str) {
        this.golfUpTime = str;
    }

    public void setId(Long l) {
        this.id = l;
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

    public void setPowerMeter(String str) {
        this.powerMeter = str;
    }

    public void setProvider(Integer num) {
        this.provider = num;
    }

    public void setSegment(Integer num) {
        this.segment = num;
    }

    public void setSize(Integer num) {
        this.size = num;
    }

    public void setSource(Integer num) {
        this.source = num;
    }

    public void setStrokeSpeed(String str) {
        this.strokeSpeed = str;
    }

    public void setSynced(Integer num) {
        this.synced = num;
    }

    public void setTimeDeltaAltitude(String str) {
        this.timeDeltaAltitude = str;
    }

    public void setTrackid(Long l) {
        this.trackid = l;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setV(Integer num) {
        this.v = num;
    }

    public void setWeatherInfo(String str) {
        this.weatherInfo = str;
    }

    public Trackdata(Long l, Integer num, Integer num2, Long l2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31) {
        this.id = l;
        this.source = num;
        this.type = num2;
        this.trackid = l2;
        this.segment = num3;
        this.bulkll = str;
        this.bulkgait = str2;
        this.bulkal = str3;
        this.bulkacc = str4;
        this.bulktime = str5;
        this.bulkflag = str6;
        this.bulkpace = str7;
        this.bulkpause = str8;
        this.kilomarked = str9;
        this.bulkdistance = str10;
        this.bulkbarometerAltitude = str11;
        this.bulkhr = str12;
        this.milemarked = str13;
        this.size = num4;
        this.v = num5;
        this.compressed = num6;
        this.provider = num7;
        this.synced = num8;
        this.correctAltitude = str14;
        this.strokeSpeed = str15;
        this.cadence = str16;
        this.dailyPerformance = str17;
        this.lap = str18;
        this.bulkspeed = str19;
        this.coachSegment = str20;
        this.weatherInfo = str21;
        this.bulkRopeSkippingFreq = str22;
        this.friendId = str23;
        this.bulkspo2 = str24;
        this.bulkPressure = str25;
        this.bulkTemperature = str26;
        this.timeDeltaAltitude = str27;
        this.golfBeat = str28;
        this.golfAngle = str29;
        this.golfUpTime = str30;
        this.golfDownTime = str31;
    }

    public Trackdata() {
    }
}
