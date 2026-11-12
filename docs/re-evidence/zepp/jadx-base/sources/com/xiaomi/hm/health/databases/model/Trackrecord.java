package com.xiaomi.hm.health.databases.model;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes20.dex */
@Keep
public class Trackrecord {
    private int accumulatedGap;
    private String addInfo;
    private Integer altitudeAscend;
    private Integer altitudeDescend;
    private Boolean autoRecognition;
    private int averageAngle;
    private float averageBeat;
    private float averageDownTime;
    private float averagePower;
    private int averagePressure;
    private int averageScore;
    private Float averageTemperature;
    private float averageUpTime;
    private Float avgAltitude;
    private Integer avgCadence;
    private Float avgPulloarTime;
    private Float avgReturnTime;
    private int avgSlope;
    private Integer avgStrideLength;
    private Integer avghr;
    private Integer cal;
    private String childListData;
    private Integer climbDisAscendTime;
    private Integer climbDisDescend;
    private Integer climbDisDescendTime;
    private Integer climbDisascend;
    private String contoururi;
    private Integer costtime;
    private String courseTitle;
    private String date;
    private String device;
    private Integer distance;
    private int downhillNumber;
    private Integer downstairsFloors;
    private Float downstairsHeight;
    private Long endtime;
    private String extra;
    private Integer ffpercent;
    private Integer flightRatio;
    private int floorNumber;
    private String friendId;
    private int halfStartTime;
    private Float highestTemperature;
    private Integer hrSettingType;
    private String hrZone;
    private Long id;
    private Integer indoorRunCalibrated;
    private Integer landingTime;
    private Integer leftFlightRatio;
    private Integer leftLandingTime;
    private String location;
    private String locationdesc;
    private Float lowestTemperature;
    private String marathon;
    private int maxAltitude;
    private Integer maxCadence;
    private int maxDownhillFallMileage;
    private Integer maxHR;
    private float maxPower;
    private int maxSFreq;
    private int maxSlope;
    private Integer maxVO2;
    private int maximumPressure;
    private Float maxrtp;
    private int minAltitude;
    private Integer minHR;
    private Integer minPressure;
    private Float minUpstairsFloors;
    private Float minrtp;
    private int numberOfBreak;
    private String originalJsonData;
    private Float pace;
    private Long parentTrackId;
    private Integer pauseTime;
    private String personalBest;
    private Integer rightFlightRatio;
    private Integer rightLandingTime;
    private int ropeSkippingAvgFrequency;
    private int ropeSkippingCount;
    private int ropeSkippingMaxFrequency;
    private long ropeSkippingRestTime;
    private Integer sfreq;
    private Integer size;
    private Integer source;
    private int spo2Max;
    private int spo2Min;
    private int sportMode;
    private Integer state;
    private Integer statisticed;
    private String statistics;
    private String strengthTrainingGroup;
    private String summary;
    private Float swimAvgStrokeSpeed;
    private Float swimDistancePerStroke;
    private Float swimMaxStrokeSpeed;
    private Integer swimPoolLength;
    private Integer swimSWOLF;
    private Integer swimStrokes;
    private Integer swimStyle;
    private int swimTrips;
    private Integer swimTurns;
    private Integer synced;
    private int targetType;
    private int targetValue;
    private Integer teAnaerobicValue;
    private Integer teValue;
    private int tennisBackHand;
    private int tennisForeHand;
    private int tennisServe;
    private Integer thisExerciseLoad;
    private int totalGroup;
    private Integer totalStep;
    private int totalSwing;
    private int totalSwingTimes;
    private int touchStrokes;
    private Long trackid;
    private Integer type;
    private Integer unit;
    private Float upstairsHeight;
    private Integer v;
    private float workValue;

    public Trackrecord(Long l, Integer num, Integer num2, String str, Long l2, Integer num3, Integer num4, Integer num5, Float f, Integer num6, Integer num7, Integer num8, Integer num9, Long l3, Float f2, Float f3, String str2, String str3, String str4, String str5, Integer num10, String str6, Integer num11, String str7, Integer num12, Integer num13, Integer num14, Integer num15, Integer num16, Integer num17, Integer num18, Integer num19, Integer num20, Integer num21, Integer num22, Integer num23, Integer num24, Integer num25, Long l4, String str8, Integer num26, Integer num27, Integer num28, Integer num29, Integer num30, Integer num31, Integer num32, Float f4, Float f5, Float f6, Integer num33, Integer num34, Integer num35, Integer num36, Integer num37, Integer num38, Integer num39, String str9, String str10, int i, String str11) {
        this.unit = 0;
        this.teValue = -1;
        this.teAnaerobicValue = -1;
        this.touchStrokes = 0;
        this.sportMode = 0;
        this.avgAltitude = Float.valueOf(-20000.0f);
        this.averagePressure = -1;
        this.maximumPressure = -1;
        this.numberOfBreak = -1;
        this.downstairsFloors = -1;
        this.downstairsHeight = Float.valueOf(-1.0f);
        this.minPressure = -1;
        Float fValueOf = Float.valueOf(-274.0f);
        this.averageTemperature = fValueOf;
        this.highestTemperature = fValueOf;
        this.lowestTemperature = fValueOf;
        this.thisExerciseLoad = -1;
        this.maxVO2 = -1;
        this.totalSwing = -1;
        this.averageBeat = -1.0f;
        this.averageUpTime = -1.0f;
        this.averageDownTime = -1.0f;
        this.averageAngle = -361;
        this.averageScore = -1;
        this.averagePower = -1.0f;
        this.maxPower = -1.0f;
        this.workValue = -1.0f;
        this.id = l;
        this.source = num;
        this.type = num2;
        this.date = str;
        this.trackid = l2;
        this.distance = num3;
        this.costtime = num4;
        this.cal = num5;
        this.pace = f;
        this.sfreq = num6;
        this.avghr = num7;
        this.ffpercent = num8;
        this.v = num9;
        this.endtime = l3;
        this.maxrtp = f2;
        this.minrtp = f3;
        this.device = str2;
        this.summary = str3;
        this.location = str4;
        this.locationdesc = str5;
        this.state = num10;
        this.statistics = str6;
        this.size = num11;
        this.contoururi = str7;
        this.statisticed = num12;
        this.synced = num13;
        this.altitudeAscend = num14;
        this.altitudeDescend = num15;
        this.totalStep = num16;
        this.avgStrideLength = num17;
        this.climbDisascend = num18;
        this.maxCadence = num19;
        this.avgCadence = num20;
        this.landingTime = num21;
        this.flightRatio = num22;
        this.climbDisDescend = num23;
        this.climbDisAscendTime = num24;
        this.climbDisDescendTime = num25;
        this.parentTrackId = l4;
        this.childListData = str8;
        this.maxHR = num26;
        this.minHR = num27;
        this.unit = num28;
        this.teValue = num29;
        this.swimSWOLF = num30;
        this.swimStrokes = num31;
        this.swimTurns = num32;
        this.swimAvgStrokeSpeed = f4;
        this.swimMaxStrokeSpeed = f5;
        this.swimDistancePerStroke = f6;
        this.swimPoolLength = num33;
        this.swimStyle = num34;
        this.indoorRunCalibrated = num35;
        this.leftLandingTime = num36;
        this.leftFlightRatio = num37;
        this.rightLandingTime = num38;
        this.rightFlightRatio = num39;
        this.addInfo = str9;
        this.originalJsonData = str10;
        this.touchStrokes = i;
        this.friendId = str11;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Trackrecord trackrecord = (Trackrecord) obj;
        Long l = this.trackid;
        return l != null && l.equals(trackrecord.trackid) && (num = this.source) != null && num.equals(trackrecord.source) && (num2 = this.type) != null && num2.equals(trackrecord.type);
    }

    public int getAccumulatedGap() {
        return this.accumulatedGap;
    }

    public String getAddInfo() {
        return this.addInfo;
    }

    public Integer getAltitudeAscend() {
        return this.altitudeAscend;
    }

    public Integer getAltitudeDescend() {
        return this.altitudeDescend;
    }

    public Boolean getAutoRecognition() {
        return this.autoRecognition;
    }

    public int getAverageAngle() {
        return this.averageAngle;
    }

    public float getAverageBeat() {
        return this.averageBeat;
    }

    public float getAverageDownTime() {
        return this.averageDownTime;
    }

    public float getAveragePower() {
        return this.averagePower;
    }

    public int getAveragePressure() {
        return this.averagePressure;
    }

    public int getAverageScore() {
        return this.averageScore;
    }

    public Float getAverageTemperature() {
        return this.averageTemperature;
    }

    public float getAverageUpTime() {
        return this.averageUpTime;
    }

    public Float getAvgAltitude() {
        return this.avgAltitude;
    }

    public Integer getAvgCadence() {
        return this.avgCadence;
    }

    public Float getAvgPulloarTime() {
        return this.avgPulloarTime;
    }

    public Float getAvgReturnTime() {
        return this.avgReturnTime;
    }

    public int getAvgSlope() {
        return this.avgSlope;
    }

    public Integer getAvgStrideLength() {
        return this.avgStrideLength;
    }

    public Integer getAvghr() {
        return this.avghr;
    }

    public Integer getCal() {
        return this.cal;
    }

    public String getChildListData() {
        return this.childListData;
    }

    public Integer getClimbDisAscendTime() {
        return this.climbDisAscendTime;
    }

    public Integer getClimbDisDescend() {
        return this.climbDisDescend;
    }

    public Integer getClimbDisDescendTime() {
        return this.climbDisDescendTime;
    }

    public Integer getClimbDisascend() {
        return this.climbDisascend;
    }

    public String getContoururi() {
        return this.contoururi;
    }

    public Integer getCosttime() {
        return this.costtime;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public String getDate() {
        return this.date;
    }

    public String getDevice() {
        return this.device;
    }

    public Integer getDistance() {
        return this.distance;
    }

    public int getDownhillNumber() {
        return this.downhillNumber;
    }

    public Integer getDownstairsFloors() {
        return this.downstairsFloors;
    }

    public Float getDownstairsHeight() {
        return this.downstairsHeight;
    }

    public Long getEndtime() {
        return this.endtime;
    }

    public String getExtra() {
        return this.extra;
    }

    public Integer getFfpercent() {
        return this.ffpercent;
    }

    public Integer getFlightRatio() {
        return this.flightRatio;
    }

    public int getFloorNumber() {
        return this.floorNumber;
    }

    public String getFriendId() {
        return this.friendId;
    }

    public int getHalfStartTime() {
        return this.halfStartTime;
    }

    public Float getHighestTemperature() {
        return this.highestTemperature;
    }

    public Integer getHrSettingType() {
        return this.hrSettingType;
    }

    public String getHrZone() {
        return this.hrZone;
    }

    public Long getId() {
        return this.id;
    }

    public Integer getIndoorRunCalibrated() {
        return this.indoorRunCalibrated;
    }

    public Integer getLandingTime() {
        return this.landingTime;
    }

    public Integer getLeftFlightRatio() {
        return this.leftFlightRatio;
    }

    public Integer getLeftLandingTime() {
        return this.leftLandingTime;
    }

    public String getLocation() {
        return this.location;
    }

    public String getLocationdesc() {
        return this.locationdesc;
    }

    public Float getLowestTemperature() {
        return this.lowestTemperature;
    }

    public String getMarathon() {
        return this.marathon;
    }

    public int getMaxAltitude() {
        return this.maxAltitude;
    }

    public Integer getMaxCadence() {
        return this.maxCadence;
    }

    public int getMaxDownhillFallMileage() {
        return this.maxDownhillFallMileage;
    }

    public Integer getMaxHR() {
        return this.maxHR;
    }

    public float getMaxPower() {
        return this.maxPower;
    }

    public int getMaxSFreq() {
        return this.maxSFreq;
    }

    public int getMaxSlope() {
        return this.maxSlope;
    }

    public Integer getMaxVO2() {
        return this.maxVO2;
    }

    public int getMaximumPressure() {
        return this.maximumPressure;
    }

    public Float getMaxrtp() {
        return this.maxrtp;
    }

    public int getMinAltitude() {
        return this.minAltitude;
    }

    public Integer getMinHR() {
        return this.minHR;
    }

    public Integer getMinPressure() {
        return this.minPressure;
    }

    public Float getMinUpstairsFloors() {
        return this.minUpstairsFloors;
    }

    public Float getMinrtp() {
        return this.minrtp;
    }

    public int getNumberOfBreak() {
        return this.numberOfBreak;
    }

    public String getOriginalJsonData() {
        return this.originalJsonData;
    }

    public Float getPace() {
        return this.pace;
    }

    public Long getParentTrackId() {
        return this.parentTrackId;
    }

    public Integer getPauseTime() {
        return this.pauseTime;
    }

    public String getPersonalBest() {
        return this.personalBest;
    }

    public Integer getRightFlightRatio() {
        return this.rightFlightRatio;
    }

    public Integer getRightLandingTime() {
        return this.rightLandingTime;
    }

    public int getRopeSkippingAvgFrequency() {
        return this.ropeSkippingAvgFrequency;
    }

    public int getRopeSkippingCount() {
        return this.ropeSkippingCount;
    }

    public int getRopeSkippingMaxFrequency() {
        return this.ropeSkippingMaxFrequency;
    }

    public long getRopeSkippingRestTime() {
        return this.ropeSkippingRestTime;
    }

    public Integer getSfreq() {
        return this.sfreq;
    }

    public Integer getSize() {
        return this.size;
    }

    public Integer getSource() {
        return this.source;
    }

    public int getSpo2Max() {
        return this.spo2Max;
    }

    public int getSpo2Min() {
        return this.spo2Min;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public Integer getState() {
        return this.state;
    }

    public Integer getStatisticed() {
        return this.statisticed;
    }

    public String getStatistics() {
        return this.statistics;
    }

    public String getStrengthTrainingGroup() {
        return this.strengthTrainingGroup;
    }

    public String getSummary() {
        return this.summary;
    }

    public Float getSwimAvgStrokeSpeed() {
        return this.swimAvgStrokeSpeed;
    }

    public Float getSwimDistancePerStroke() {
        return this.swimDistancePerStroke;
    }

    public Float getSwimMaxStrokeSpeed() {
        return this.swimMaxStrokeSpeed;
    }

    public Integer getSwimPoolLength() {
        return this.swimPoolLength;
    }

    public Integer getSwimSWOLF() {
        return this.swimSWOLF;
    }

    public Integer getSwimStrokes() {
        return this.swimStrokes;
    }

    public Integer getSwimStyle() {
        return this.swimStyle;
    }

    public int getSwimTrips() {
        return this.swimTrips;
    }

    public Integer getSwimTurns() {
        return this.swimTurns;
    }

    public Integer getSynced() {
        return this.synced;
    }

    public int getTargetType() {
        return this.targetType;
    }

    public int getTargetValue() {
        return this.targetValue;
    }

    public Integer getTeAnaerobicValue() {
        return this.teAnaerobicValue;
    }

    public Integer getTeValue() {
        return this.teValue;
    }

    public int getTennisBackHand() {
        return this.tennisBackHand;
    }

    public int getTennisForeHand() {
        return this.tennisForeHand;
    }

    public int getTennisServe() {
        return this.tennisServe;
    }

    public Integer getThisExerciseLoad() {
        return this.thisExerciseLoad;
    }

    public int getTotalGroup() {
        return this.totalGroup;
    }

    public Integer getTotalStep() {
        return this.totalStep;
    }

    public int getTotalSwing() {
        return this.totalSwing;
    }

    public int getTotalSwingTimes() {
        return this.totalSwingTimes;
    }

    public int getTouchStrokes() {
        return this.touchStrokes;
    }

    public Long getTrackid() {
        return this.trackid;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getUnit() {
        return this.unit;
    }

    public Float getUpstairsHeight() {
        return this.upstairsHeight;
    }

    public Integer getV() {
        return this.v;
    }

    public float getWorkValue() {
        return this.workValue;
    }

    public void setAccumulatedGap(int i) {
        this.accumulatedGap = i;
    }

    public void setAddInfo(String str) {
        this.addInfo = str;
    }

    public void setAltitudeAscend(Integer num) {
        this.altitudeAscend = num;
    }

    public void setAltitudeDescend(Integer num) {
        this.altitudeDescend = num;
    }

    public void setAutoRecognition(Boolean bool) {
        this.autoRecognition = bool;
    }

    public void setAverageAngle(int i) {
        this.averageAngle = i;
    }

    public void setAverageBeat(float f) {
        this.averageBeat = f;
    }

    public void setAverageDownTime(float f) {
        this.averageDownTime = f;
    }

    public void setAveragePower(float f) {
        this.averagePower = f;
    }

    public void setAveragePressure(int i) {
        this.averagePressure = i;
    }

    public void setAverageScore(int i) {
        this.averageScore = i;
    }

    public void setAverageTemperature(Float f) {
        this.averageTemperature = f;
    }

    public void setAverageUpTime(float f) {
        this.averageUpTime = f;
    }

    public void setAvgAltitude(Float f) {
        this.avgAltitude = f;
    }

    public void setAvgCadence(Integer num) {
        this.avgCadence = num;
    }

    public void setAvgPulloarTime(Float f) {
        this.avgPulloarTime = f;
    }

    public void setAvgReturnTime(Float f) {
        this.avgReturnTime = f;
    }

    public void setAvgSlope(int i) {
        this.avgSlope = i;
    }

    public void setAvgStrideLength(Integer num) {
        this.avgStrideLength = num;
    }

    public void setAvghr(Integer num) {
        this.avghr = num;
    }

    public void setCal(Integer num) {
        this.cal = num;
    }

    public void setChildListData(String str) {
        this.childListData = str;
    }

    public void setClimbDisAscendTime(Integer num) {
        this.climbDisAscendTime = num;
    }

    public void setClimbDisDescend(Integer num) {
        this.climbDisDescend = num;
    }

    public void setClimbDisDescendTime(Integer num) {
        this.climbDisDescendTime = num;
    }

    public void setClimbDisascend(Integer num) {
        this.climbDisascend = num;
    }

    public void setContoururi(String str) {
        this.contoururi = str;
    }

    public void setCosttime(Integer num) {
        this.costtime = num;
    }

    public void setCourseTitle(String str) {
        this.courseTitle = str;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDevice(String str) {
        this.device = str;
    }

    public void setDistance(Integer num) {
        this.distance = num;
    }

    public void setDownhillNumber(int i) {
        this.downhillNumber = i;
    }

    public void setDownstairsFloors(Integer num) {
        this.downstairsFloors = num;
    }

    public void setDownstairsHeight(Float f) {
        this.downstairsHeight = f;
    }

    public void setEndtime(Long l) {
        this.endtime = l;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFfpercent(Integer num) {
        this.ffpercent = num;
    }

    public void setFlightRatio(Integer num) {
        this.flightRatio = num;
    }

    public void setFloorNumber(int i) {
        this.floorNumber = i;
    }

    public void setFriendId(String str) {
        this.friendId = str;
    }

    public void setHalfStartTime(int i) {
        this.halfStartTime = i;
    }

    public void setHighestTemperature(Float f) {
        this.highestTemperature = f;
    }

    public void setHrSettingType(Integer num) {
        this.hrSettingType = num;
    }

    public void setHrZone(String str) {
        this.hrZone = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setIndoorRunCalibrated(Integer num) {
        this.indoorRunCalibrated = num;
    }

    public void setLandingTime(Integer num) {
        this.landingTime = num;
    }

    public void setLeftFlightRatio(Integer num) {
        this.leftFlightRatio = num;
    }

    public void setLeftLandingTime(Integer num) {
        this.leftLandingTime = num;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setLocationdesc(String str) {
        this.locationdesc = str;
    }

    public void setLowestTemperature(Float f) {
        this.lowestTemperature = f;
    }

    public void setMarathon(String str) {
        this.marathon = str;
    }

    public void setMaxAltitude(int i) {
        this.maxAltitude = i;
    }

    public void setMaxCadence(Integer num) {
        this.maxCadence = num;
    }

    public void setMaxDownhillFallMileage(int i) {
        this.maxDownhillFallMileage = i;
    }

    public void setMaxHR(Integer num) {
        this.maxHR = num;
    }

    public void setMaxPower(float f) {
        this.maxPower = f;
    }

    public void setMaxSFreq(int i) {
        this.maxSFreq = i;
    }

    public void setMaxSlope(int i) {
        this.maxSlope = i;
    }

    public void setMaxVO2(Integer num) {
        this.maxVO2 = num;
    }

    public void setMaximumPressure(int i) {
        this.maximumPressure = i;
    }

    public void setMaxrtp(Float f) {
        this.maxrtp = f;
    }

    public void setMinAltitude(int i) {
        this.minAltitude = i;
    }

    public void setMinHR(Integer num) {
        this.minHR = num;
    }

    public void setMinPressure(Integer num) {
        this.minPressure = num;
    }

    public void setMinUpstairsFloors(Float f) {
        this.minUpstairsFloors = f;
    }

    public void setMinrtp(Float f) {
        this.minrtp = f;
    }

    public void setNumberOfBreak(int i) {
        this.numberOfBreak = i;
    }

    public void setOriginalJsonData(String str) {
        this.originalJsonData = str;
    }

    public void setPace(Float f) {
        this.pace = f;
    }

    public void setParentTrackId(Long l) {
        this.parentTrackId = l;
    }

    public void setPauseTime(Integer num) {
        this.pauseTime = num;
    }

    public void setPersonalBest(String str) {
        this.personalBest = str;
    }

    public void setRightFlightRatio(Integer num) {
        this.rightFlightRatio = num;
    }

    public void setRightLandingTime(Integer num) {
        this.rightLandingTime = num;
    }

    public void setRopeSkippingAvgFrequency(int i) {
        this.ropeSkippingAvgFrequency = i;
    }

    public void setRopeSkippingCount(int i) {
        this.ropeSkippingCount = i;
    }

    public void setRopeSkippingMaxFrequency(int i) {
        this.ropeSkippingMaxFrequency = i;
    }

    public void setRopeSkippingRestTime(long j) {
        this.ropeSkippingRestTime = j;
    }

    public void setSfreq(Integer num) {
        this.sfreq = num;
    }

    public void setSize(Integer num) {
        this.size = num;
    }

    public void setSource(Integer num) {
        this.source = num;
    }

    public void setSpo2Max(int i) {
        this.spo2Max = i;
    }

    public void setSpo2Min(int i) {
        this.spo2Min = i;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setState(Integer num) {
        this.state = num;
    }

    public void setStatisticed(Integer num) {
        this.statisticed = num;
    }

    public void setStatistics(String str) {
        this.statistics = str;
    }

    public void setStrengthTrainingGroup(String str) {
        this.strengthTrainingGroup = str;
    }

    public void setSummary(String str) {
        this.summary = str;
    }

    public void setSwimAvgStrokeSpeed(Float f) {
        this.swimAvgStrokeSpeed = f;
    }

    public void setSwimDistancePerStroke(Float f) {
        this.swimDistancePerStroke = f;
    }

    public void setSwimMaxStrokeSpeed(Float f) {
        this.swimMaxStrokeSpeed = f;
    }

    public void setSwimPoolLength(Integer num) {
        this.swimPoolLength = num;
    }

    public void setSwimSWOLF(Integer num) {
        this.swimSWOLF = num;
    }

    public void setSwimStrokes(Integer num) {
        this.swimStrokes = num;
    }

    public void setSwimStyle(Integer num) {
        this.swimStyle = num;
    }

    public void setSwimTrips(int i) {
        this.swimTrips = i;
    }

    public void setSwimTurns(Integer num) {
        this.swimTurns = num;
    }

    public void setSynced(Integer num) {
        this.synced = num;
    }

    public void setTargetType(int i) {
        this.targetType = i;
    }

    public void setTargetValue(int i) {
        this.targetValue = i;
    }

    public void setTeAnaerobicValue(Integer num) {
        this.teAnaerobicValue = num;
    }

    public void setTeValue(Integer num) {
        this.teValue = num;
    }

    public void setTennisBackHand(int i) {
        this.tennisBackHand = i;
    }

    public void setTennisForeHand(int i) {
        this.tennisForeHand = i;
    }

    public void setTennisServe(int i) {
        this.tennisServe = i;
    }

    public void setThisExerciseLoad(Integer num) {
        this.thisExerciseLoad = num;
    }

    public void setTotalGroup(int i) {
        this.totalGroup = i;
    }

    public void setTotalStep(Integer num) {
        this.totalStep = num;
    }

    public void setTotalSwing(int i) {
        this.totalSwing = i;
    }

    public void setTotalSwingTimes(int i) {
        this.totalSwingTimes = i;
    }

    public void setTouchStrokes(int i) {
        this.touchStrokes = i;
    }

    public void setTrackid(Long l) {
        this.trackid = l;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setUnit(Integer num) {
        this.unit = num;
    }

    public void setUpstairsHeight(Float f) {
        this.upstairsHeight = f;
    }

    public void setV(Integer num) {
        this.v = num;
    }

    public void setWorkValue(float f) {
        this.workValue = f;
    }

    public Trackrecord() {
        this.unit = 0;
        this.teValue = -1;
        this.teAnaerobicValue = -1;
        this.touchStrokes = 0;
        this.sportMode = 0;
        this.avgAltitude = Float.valueOf(-20000.0f);
        this.averagePressure = -1;
        this.maximumPressure = -1;
        this.numberOfBreak = -1;
        this.downstairsFloors = -1;
        this.downstairsHeight = Float.valueOf(-1.0f);
        this.minPressure = -1;
        Float fValueOf = Float.valueOf(-274.0f);
        this.averageTemperature = fValueOf;
        this.highestTemperature = fValueOf;
        this.lowestTemperature = fValueOf;
        this.thisExerciseLoad = -1;
        this.maxVO2 = -1;
        this.totalSwing = -1;
        this.averageBeat = -1.0f;
        this.averageUpTime = -1.0f;
        this.averageDownTime = -1.0f;
        this.averageAngle = -361;
        this.averageScore = -1;
        this.averagePower = -1.0f;
        this.maxPower = -1.0f;
        this.workValue = -1.0f;
    }
}
