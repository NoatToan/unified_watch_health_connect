package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SlopeChart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class SportSummary implements Serializable {
    public static final int VERSION_102 = 258;
    public static final int VERSION_103 = 259;
    public static final int VERSION_105 = 261;
    public static final int VERSION_203 = 515;
    public static final int VERSION_205 = 517;
    public static final int VERSION_206 = 518;
    public static final int VERSION_207 = 519;
    public static final int VERSION_208 = 520;
    public static final int VERSION_800 = 32768;
    public static final int VRESION_200 = 512;
    public static final int VRESION_201 = 513;
    public static final int VRESION_202 = 514;
    public static final int VRESION_204 = 516;
    private static final long serialVersionUID = 1;
    public SportAccumInfo accInfo;
    public long baseAlt;
    public long baseLat;
    public long baseLng;
    public List<Long> childStartTime;
    public List<Integer> childType;
    private CoachingInfo coachingInfo;
    private CrossFitInfo crossFitInfo;
    public int dailyPerfermance;
    public int distanceUnit;
    public long endTime;
    public int intervalType;
    private boolean isCoaching;
    private boolean isCrossFit;
    public int[] mSwingCnt;
    public int maxHr;
    public int maxTemperature;
    public int minHr;
    public int minTemperature;
    public long parentStartTime;
    private SportPressureStatistic pressure;
    private RaceModeInfo raceModeInfo;
    public RiddingInfo riddingInfo;
    public long ropeSkipRestTime;
    public RowingInfo rowingInfo;
    public RowingStatisticInfo rowingStatisticInfo;
    public int secHalfStartTime;
    public SkiingInfo skiingInfo;
    public SkipRopeInfo skipRopeInfo;
    public long startTime;
    public SportStatisInfo statisInfo;
    public SwimInfo swimInfo;
    public int swimPoolLength;
    private int targetType;
    private int targetValue;
    private int totalGroup;
    public SportType type;
    public int version;
    public int weatherFrom;
    public int weatherTo;
    private int zone;
    public int sportMode = 0;
    public int sportTypeValue = SportType.SPORT_TYPE_NONE.mValue;
    private List<MarathonInfo> marathonInfo = new ArrayList();
    private HeartRateStatistics heartRateStatistics = null;
    private FrequencyStatistic frequencyStatistic = null;
    private Counter counter = null;
    private Slope slope = null;
    private SlopeChart slopeChart = null;
    public int te = -1;
    public int anaerobicTE = -1;
    public int vo2Max = -1;
    public int trainLoad = -1;
    public TemperatureStatistic temperatureStatistic = null;
    public String courseTitle = null;
    private HrZoneWrapperApi hrZoneWrapperApi = null;
    public int timezone = 32;
    public long userId = -1;
    private Spo2Statistic spo2Statistic = null;
    private FloorActivityStatistic floorActivityStatistic = null;
    private DownhillStatistic downhillStatistic = null;
    private IronManStatistic ironManStatistic = null;
    private boolean isAutoRecognition = false;
    private GolfStatistic golfStatistic = null;
    private PowerStatistic powerStatistic = null;

    private boolean checkTeValid(int i) {
        return i >= 0 && i <= 50;
    }

    public SportAccumInfo getAccInfo() {
        return this.accInfo;
    }

    public int getAnaerobicTE() {
        return this.anaerobicTE;
    }

    public long getBaseAlt() {
        return this.baseAlt;
    }

    public long getBaseLat() {
        return this.baseLat;
    }

    public long getBaseLng() {
        return this.baseLng;
    }

    public List<Long> getChildStartTime() {
        return this.childStartTime;
    }

    public List<Integer> getChildType() {
        return this.childType;
    }

    public CoachingInfo getCoachingInfo() {
        return this.coachingInfo;
    }

    public Counter getCounter() {
        return this.counter;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public CrossFitInfo getCrossFitInfo() {
        return this.crossFitInfo;
    }

    public int getDailyPerfermance() {
        return this.dailyPerfermance;
    }

    public int getDistanceUnit() {
        return this.distanceUnit;
    }

    public DownhillStatistic getDownhillStatistic() {
        return this.downhillStatistic;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public FloorActivityStatistic getFloorActivityStatistic() {
        return this.floorActivityStatistic;
    }

    public FrequencyStatistic getFrequencyStatistic() {
        return this.frequencyStatistic;
    }

    public GolfStatistic getGolfStatistic() {
        return this.golfStatistic;
    }

    public HeartRateStatistics getHeartRateStatistics() {
        return this.heartRateStatistics;
    }

    public HrZoneWrapperApi getHrZoneWrapperApi() {
        return this.hrZoneWrapperApi;
    }

    public int getIntervalType() {
        return this.intervalType;
    }

    public IronManStatistic getIronManStatistic() {
        return this.ironManStatistic;
    }

    public List<MarathonInfo> getMarathonInfo() {
        return this.marathonInfo;
    }

    public int getMaxHr() {
        return this.maxHr;
    }

    public int getMaxTemperature() {
        return this.maxTemperature;
    }

    public int getMinHr() {
        return this.minHr;
    }

    public int getMinTemperature() {
        return this.minTemperature;
    }

    public long getParentStartTime() {
        return this.parentStartTime;
    }

    public PowerStatistic getPowerStatistic() {
        return this.powerStatistic;
    }

    public SportPressureStatistic getPressure() {
        return this.pressure;
    }

    public RaceModeInfo getRaceModeInfo() {
        return this.raceModeInfo;
    }

    public RiddingInfo getRiddingInfo() {
        return this.riddingInfo;
    }

    public long getRopeSkipRestTime() {
        return this.ropeSkipRestTime;
    }

    public RowingInfo getRowingInfo() {
        return this.rowingInfo;
    }

    public RowingStatisticInfo getRowingStatisticInfo() {
        return this.rowingStatisticInfo;
    }

    public int getSecHalfStartTime() {
        return this.secHalfStartTime;
    }

    public SkiingInfo getSkiingInfo() {
        return this.skiingInfo;
    }

    public SkipRopeInfo getSkipRopeInfo() {
        return this.skipRopeInfo;
    }

    public Slope getSlope() {
        return this.slope;
    }

    public SlopeChart getSlopeChart() {
        return this.slopeChart;
    }

    public Spo2Statistic getSpo2Statistic() {
        return this.spo2Statistic;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public int getSportTypeValue() {
        return this.sportTypeValue;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public SportStatisInfo getStatisInfo() {
        return this.statisInfo;
    }

    public SwimInfo getSwimInfo() {
        return this.swimInfo;
    }

    public int getSwimPoolLength() {
        return this.swimPoolLength;
    }

    public int[] getSwingCnt() {
        return this.mSwingCnt;
    }

    public int getTargetType() {
        return this.targetType;
    }

    public int getTargetValue() {
        return this.targetValue;
    }

    public int getTe() {
        return this.te;
    }

    public TemperatureStatistic getTemperatureStatistic() {
        return this.temperatureStatistic;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public int getTotalGroup() {
        return this.totalGroup;
    }

    public int getTrainLoad() {
        return this.trainLoad;
    }

    public SportType getType() {
        return this.type;
    }

    public long getUserId() {
        return this.userId;
    }

    public int getVersion() {
        return this.version;
    }

    public int getVo2Max() {
        return this.vo2Max;
    }

    public int getWeatherFrom() {
        return this.weatherFrom;
    }

    public int getWeatherTo() {
        return this.weatherTo;
    }

    public int getZone() {
        return this.zone;
    }

    public boolean isAutoRecognitionSport() {
        return this.isAutoRecognition;
    }

    public boolean isCoaching() {
        return this.isCoaching;
    }

    public boolean isCrossFit() {
        return this.isCrossFit;
    }

    public void setAccInfo(SportAccumInfo sportAccumInfo) {
        this.accInfo = sportAccumInfo;
    }

    public void setAnaerobicTE(int i) {
        if (checkTeValid(i)) {
            this.anaerobicTE = i;
        }
    }

    public void setAutoRecognition(boolean z) {
        this.isAutoRecognition = z;
    }

    public void setBaseAlt(long j) {
        this.baseAlt = j;
    }

    public void setBaseLat(long j) {
        this.baseLat = j;
    }

    public void setBaseLng(long j) {
        this.baseLng = j;
    }

    public void setChildStartTime(List<Long> list) {
        this.childStartTime = list;
    }

    public void setChildType(List<Integer> list) {
        this.childType = list;
    }

    public void setCoaching(boolean z) {
        this.isCoaching = z;
    }

    public void setCoachingInfo(CoachingInfo coachingInfo) {
        this.coachingInfo = coachingInfo;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }

    public void setCourseTitle(String str) {
        this.courseTitle = str;
    }

    public void setCrossFit(boolean z) {
        this.isCrossFit = z;
    }

    public void setCrossFitInfo(CrossFitInfo crossFitInfo) {
        this.crossFitInfo = crossFitInfo;
    }

    public void setDailyPerfermance(int i) {
        this.dailyPerfermance = i;
    }

    public void setDistanceUnit(int i) {
        this.distanceUnit = i;
    }

    public void setDownhillStatistic(DownhillStatistic downhillStatistic) {
        this.downhillStatistic = downhillStatistic;
    }

    public void setEndTime(long j) {
        this.endTime = j;
    }

    public void setFloorActivityStatistic(FloorActivityStatistic floorActivityStatistic) {
        this.floorActivityStatistic = floorActivityStatistic;
    }

    public void setFrequencyStatistic(FrequencyStatistic frequencyStatistic) {
        this.frequencyStatistic = frequencyStatistic;
    }

    public void setGolfStatistic(GolfStatistic golfStatistic) {
        this.golfStatistic = golfStatistic;
    }

    public void setHeartRateStatistics(HeartRateStatistics heartRateStatistics) {
        this.heartRateStatistics = heartRateStatistics;
    }

    public void setHrZoneWrapperApi(HrZoneWrapperApi hrZoneWrapperApi) {
        this.hrZoneWrapperApi = hrZoneWrapperApi;
    }

    public void setIntervalType(int i) {
        this.intervalType = i;
    }

    public void setIronManStatistic(IronManStatistic ironManStatistic) {
        this.ironManStatistic = ironManStatistic;
    }

    public void setMarathonInfo(List<MarathonInfo> list) {
        this.marathonInfo = list;
    }

    public void setMaxHr(int i) {
        this.maxHr = i;
    }

    public void setMaxTemperature(int i) {
        this.maxTemperature = i;
    }

    public void setMinHr(int i) {
        this.minHr = i;
    }

    public void setMinTemperature(int i) {
        this.minTemperature = i;
    }

    public void setParentStartTime(long j) {
        this.parentStartTime = j;
    }

    public void setPowerStatistic(PowerStatistic powerStatistic) {
        this.powerStatistic = powerStatistic;
    }

    public void setPressure(SportPressureStatistic sportPressureStatistic) {
        this.pressure = sportPressureStatistic;
    }

    public void setRaceModeInfo(RaceModeInfo raceModeInfo) {
        this.raceModeInfo = raceModeInfo;
    }

    public void setRiddingInfo(RiddingInfo riddingInfo) {
        this.riddingInfo = riddingInfo;
    }

    public void setRopeSkipRestTime(long j) {
        this.ropeSkipRestTime = j;
    }

    public void setRowingInfo(RowingInfo rowingInfo) {
        this.rowingInfo = rowingInfo;
    }

    public void setRowingStatisticInfo(RowingStatisticInfo rowingStatisticInfo) {
        this.rowingStatisticInfo = rowingStatisticInfo;
    }

    public void setSecHalfStartTime(int i) {
        this.secHalfStartTime = i;
    }

    public void setSkiingInfo(SkiingInfo skiingInfo) {
        this.skiingInfo = skiingInfo;
    }

    public void setSkipRopeInfo(SkipRopeInfo skipRopeInfo) {
        this.skipRopeInfo = skipRopeInfo;
    }

    public void setSlope(Slope slope) {
        this.slope = slope;
    }

    public void setSlopeChart(SlopeChart slopeChart) {
        this.slopeChart = slopeChart;
    }

    public void setSpo2Statistic(Spo2Statistic spo2Statistic) {
        this.spo2Statistic = spo2Statistic;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSportTypeValue(int i) {
        this.sportTypeValue = i;
        this.type = SportType.fromValue(i);
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStatisInfo(SportStatisInfo sportStatisInfo) {
        this.statisInfo = sportStatisInfo;
    }

    public void setSwimInfo(SwimInfo swimInfo) {
        this.swimInfo = swimInfo;
    }

    public void setSwimPoolLength(int i) {
        this.swimPoolLength = i;
    }

    public void setSwingCnt(int[] iArr) {
        this.mSwingCnt = iArr;
    }

    public void setTargetType(int i) {
        this.targetType = i;
    }

    public void setTargetValue(int i) {
        this.targetValue = i;
    }

    public void setTe(int i) {
        if (checkTeValid(i)) {
            this.te = i;
        }
    }

    public void setTemperatureStatistic(TemperatureStatistic temperatureStatistic) {
        this.temperatureStatistic = temperatureStatistic;
    }

    public void setTimezone(int i) {
        this.timezone = i;
    }

    public void setTotalGroup(int i) {
        this.totalGroup = i;
    }

    public void setTrainLoad(int i) {
        this.trainLoad = i;
    }

    public void setType(SportType sportType) {
        this.type = sportType;
    }

    public void setUserId(long j) {
        this.userId = j;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public void setVo2Max(int i) {
        this.vo2Max = i;
    }

    public void setWeatherFrom(int i) {
        this.weatherFrom = i;
    }

    public void setWeatherTo(int i) {
        this.weatherTo = i;
    }

    public void setZone(int i) {
        this.zone = i;
    }

    public String toString() {
        return "SportSummary{version=" + this.version + ", type=" + this.type + ", sportMode=" + this.sportMode + ", isCoaching=" + this.isCoaching + ", isCrossFit=" + this.isCrossFit + ", sportTypeValue=" + this.sportTypeValue + ", maxHr=" + this.maxHr + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", baseLng=" + this.baseLng + ", baseLat=" + this.baseLat + ", baseAlt=" + this.baseAlt + ", intervalType=" + this.intervalType + ", minHr=" + this.minHr + ", te=" + this.te + ", anaerobicTE=" + this.anaerobicTE + ", swimPoolLength=" + this.swimPoolLength + ", distanceUnit=" + this.distanceUnit + ", secHalfStartTime=" + this.secHalfStartTime + ", parentStartTime=" + this.parentStartTime + ", childStartTime=" + this.childStartTime + ", childType=" + this.childType + ", ropeSkipRestTime=" + this.ropeSkipRestTime + ", maxTemperature=" + this.maxTemperature + ", minTemperature=" + this.minTemperature + ", weatherFrom=" + this.weatherFrom + ", weatherTo=" + this.weatherTo + ", targetType=" + this.targetType + ", targetValue=" + this.targetValue + ", zone=" + this.zone + ", mSwingCnt=" + Arrays.toString(this.mSwingCnt) + ", dailyPerfermance=" + this.dailyPerfermance + ", timezone=" + this.timezone + ", accInfo=" + this.accInfo + ", riddingInfo=" + this.riddingInfo + ", statisInfo=" + this.statisInfo + ", swimInfo=" + this.swimInfo + ", skiingInfo=" + this.skiingInfo + ", skipRopeInfo=" + this.skipRopeInfo + ", rowingInfo=" + this.rowingInfo + ", coachingInfo=" + this.coachingInfo + ", crossFitInfo=" + this.crossFitInfo + ", userId=" + this.userId + ", raceModeInfo=" + this.raceModeInfo + ", spo2=" + this.spo2Statistic + ", courseTitle=" + this.courseTitle + ", pressure=" + this.pressure + ", temperatureStatistic=" + this.temperatureStatistic + ", counter=" + this.counter + ", power=" + this.powerStatistic + AbstractJsonLexerKt.END_OBJ;
    }
}
