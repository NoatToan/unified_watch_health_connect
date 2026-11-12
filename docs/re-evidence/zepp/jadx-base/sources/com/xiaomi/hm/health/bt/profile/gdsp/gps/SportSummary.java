package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SlopeChart;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class SportSummary implements Serializable {
    public static final int VERSION_102 = 258;
    public static final int VERSION_103 = 259;
    public static final int VERSION_105 = 261;
    public static final int VERSION_203 = 515;
    public static final int VERSION_205 = 517;
    public static final int VERSION_206 = 518;
    public static final int VERSION_207 = 519;
    public static final int VERSION_800 = 32768;
    public static final int VRESION_200 = 512;
    public static final int VRESION_201 = 513;
    public static final int VRESION_202 = 514;
    public static final int VRESION_204 = 516;
    private static final long serialVersionUID = 1;
    public int A;
    public int B;
    public long C;
    public List<Long> D;
    public List<Integer> E;
    public long F;
    public int G;
    public int H;
    public int J;
    public int K;
    private int N;
    private int O;
    private SportPressureStatistic P;
    private int Q;
    public int[] R;
    public int S;
    public SportAccumInfo U;
    public RiddingInfo V;
    public SportStatisInfo W;
    public SwimInfo X;
    public SkiingInfo Y;
    public SkipRopeInfo Z;
    public int a;
    public SportType b;
    private boolean d;
    private boolean e;
    public int g;
    private int l;
    public RowingInfo m0;
    public RowingStatisticInfo n0;
    public long o;
    private CoachingInfo o0;
    public long p;
    private CrossFitInfo p0;
    public long q;
    private RaceModeInfo q0;
    public long r;
    public long s;
    public int t;
    public int u;
    public int z;
    public int c = 0;
    public int f = SportType.SPORT_TYPE_NONE.mValue;
    private List<MarathonInfo> h = new ArrayList();
    private HeartRateStatistics i = null;
    private FrequencyStatistic j = null;
    private Counter k = null;
    private Slope m = null;
    private SlopeChart n = null;
    public int v = -1;
    public int w = -1;
    public int x = -1;
    public int y = -1;
    public TemperatureStatistic I = null;
    public String L = null;
    private HrZoneWrapperApi M = null;
    public int T = 32;
    public long r0 = -1;
    private Spo2Statistic s0 = null;
    private FloorActivityStatistic t0 = null;
    private DownhillStatistic u0 = null;
    private IronManStatistic v0 = null;
    private boolean w0 = false;
    private GolfStatistic x0 = null;
    private PowerStatistic y0 = null;

    private boolean a(int te) {
        return te >= 0 && te <= 50;
    }

    public SportAccumInfo getAccInfo() {
        return this.U;
    }

    public int getAnaerobicTE() {
        return this.w;
    }

    public long getBaseAlt() {
        return this.s;
    }

    public long getBaseLat() {
        return this.r;
    }

    public long getBaseLng() {
        return this.q;
    }

    public List<Long> getChildStartTime() {
        return this.D;
    }

    public List<Integer> getChildType() {
        return this.E;
    }

    public CoachingInfo getCoachingInfo() {
        return this.o0;
    }

    public Counter getCounter() {
        return this.k;
    }

    public String getCourseTitle() {
        return this.L;
    }

    public CrossFitInfo getCrossFitInfo() {
        return this.p0;
    }

    public int getDailyPerfermance() {
        return this.S;
    }

    public int getDistanceUnit() {
        return this.A;
    }

    public DownhillStatistic getDownhillStatistic() {
        return this.u0;
    }

    public long getEndTime() {
        return this.p;
    }

    public FloorActivityStatistic getFloorActivityStatistic() {
        return this.t0;
    }

    public FrequencyStatistic getFrequencyStatistic() {
        return this.j;
    }

    public GolfStatistic getGolfStatistic() {
        return this.x0;
    }

    public HeartRateStatistics getHeartRateStatistics() {
        return this.i;
    }

    public HrZoneWrapperApi getHrZoneWrapperApi() {
        return this.M;
    }

    public int getIntervalType() {
        return this.t;
    }

    public IronManStatistic getIronManStatistic() {
        return this.v0;
    }

    public List<MarathonInfo> getMarathonInfo() {
        return this.h;
    }

    public int getMaxHr() {
        return this.g;
    }

    public int getMaxTemperature() {
        return this.G;
    }

    public int getMinHr() {
        return this.u;
    }

    public int getMinTemperature() {
        return this.H;
    }

    public long getParentStartTime() {
        return this.C;
    }

    public PowerStatistic getPowerStatistic() {
        return this.y0;
    }

    public SportPressureStatistic getPressure() {
        return this.P;
    }

    public RaceModeInfo getRaceModeInfo() {
        return this.q0;
    }

    public RiddingInfo getRiddingInfo() {
        return this.V;
    }

    public long getRopeSkipRestTime() {
        return this.F;
    }

    public RowingInfo getRowingInfo() {
        return this.m0;
    }

    public RowingStatisticInfo getRowingStatisticInfo() {
        return this.n0;
    }

    public int getSecHalfStartTime() {
        return this.B;
    }

    public SkiingInfo getSkiingInfo() {
        return this.Y;
    }

    public SkipRopeInfo getSkipRopeInfo() {
        return this.Z;
    }

    public Slope getSlope() {
        return this.m;
    }

    public SlopeChart getSlopeChart() {
        return this.n;
    }

    public Spo2Statistic getSpo2Statistic() {
        return this.s0;
    }

    public int getSportMode() {
        return this.c;
    }

    public int getSportTypeValue() {
        return this.f;
    }

    public long getStartTime() {
        return this.o;
    }

    public SportStatisInfo getStatisInfo() {
        return this.W;
    }

    public SwimInfo getSwimInfo() {
        return this.X;
    }

    public int getSwimPoolLength() {
        return this.z;
    }

    public int[] getSwingCnt() {
        return this.R;
    }

    public int getTargetType() {
        return this.N;
    }

    public int getTargetValue() {
        return this.O;
    }

    public int getTe() {
        return this.v;
    }

    public TemperatureStatistic getTemperatureStatistic() {
        return this.I;
    }

    public int getTimezone() {
        return this.T;
    }

    public int getTotalGroup() {
        return this.l;
    }

    public int getTrainLoad() {
        return this.y;
    }

    public SportType getType() {
        return this.b;
    }

    public long getUserId() {
        return this.r0;
    }

    public int getVersion() {
        return this.a;
    }

    public int getVo2Max() {
        return this.x;
    }

    public int getWeatherFrom() {
        return this.J;
    }

    public int getWeatherTo() {
        return this.K;
    }

    public int getZone() {
        return this.Q;
    }

    public boolean isAutoRecognitionSport() {
        return this.w0;
    }

    public boolean isCoaching() {
        return this.d;
    }

    public boolean isCrossFit() {
        return this.e;
    }

    public void setAccInfo(SportAccumInfo accInfo) {
        this.U = accInfo;
    }

    public void setAnaerobicTE(int anaerobicTE) {
        if (a(anaerobicTE)) {
            this.w = anaerobicTE;
        }
    }

    public void setAutoRecognition(boolean autoRecognition) {
        this.w0 = autoRecognition;
    }

    public void setBaseAlt(long baseAlt) {
        this.s = baseAlt;
    }

    public void setBaseLat(long baseLat) {
        this.r = baseLat;
    }

    public void setBaseLng(long baseLng) {
        this.q = baseLng;
    }

    public void setChildStartTime(List<Long> childStartTime) {
        this.D = childStartTime;
    }

    public void setChildType(List<Integer> childType) {
        this.E = childType;
    }

    public void setCoaching(boolean coaching) {
        this.d = coaching;
    }

    public void setCoachingInfo(CoachingInfo coachingInfo) {
        this.o0 = coachingInfo;
    }

    public void setCounter(Counter counter) {
        this.k = counter;
    }

    public void setCourseTitle(String courseTitle) {
        this.L = courseTitle;
    }

    public void setCrossFit(boolean crossFit) {
        this.e = crossFit;
    }

    public void setCrossFitInfo(CrossFitInfo crossFitInfo) {
        this.p0 = crossFitInfo;
    }

    public void setDailyPerfermance(int dailyPerfermance) {
        this.S = dailyPerfermance;
    }

    public void setDistanceUnit(int distanceUnit) {
        this.A = distanceUnit;
    }

    public void setDownhillStatistic(DownhillStatistic downhillStatistic) {
        this.u0 = downhillStatistic;
    }

    public void setEndTime(long endTime) {
        this.p = endTime;
    }

    public void setFloorActivityStatistic(FloorActivityStatistic floorActivityStatistic) {
        this.t0 = floorActivityStatistic;
    }

    public void setFrequencyStatistic(FrequencyStatistic frequencyStatistic) {
        this.j = frequencyStatistic;
    }

    public void setGolfStatistic(GolfStatistic golfStatistic) {
        this.x0 = golfStatistic;
    }

    public void setHeartRateStatistics(HeartRateStatistics heartRateStatistics) {
        this.i = heartRateStatistics;
    }

    public void setHrZoneWrapperApi(HrZoneWrapperApi hrZoneWrapperApi) {
        this.M = hrZoneWrapperApi;
    }

    public void setIntervalType(int intervalType) {
        this.t = intervalType;
    }

    public void setIronManStatistic(IronManStatistic ironManStatistic) {
        this.v0 = ironManStatistic;
    }

    public void setMarathonInfo(List<MarathonInfo> marathonInfo) {
        this.h = marathonInfo;
    }

    public void setMaxHr(int maxHr) {
        this.g = maxHr;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.G = maxTemperature;
    }

    public void setMinHr(int minHr) {
        this.u = minHr;
    }

    public void setMinTemperature(int minTemperature) {
        this.H = minTemperature;
    }

    public void setParentStartTime(long parentStartTime) {
        this.C = parentStartTime;
    }

    public void setPowerStatistic(PowerStatistic powerStatistic) {
        this.y0 = powerStatistic;
    }

    public void setPressure(SportPressureStatistic pressure) {
        this.P = pressure;
    }

    public void setRaceModeInfo(RaceModeInfo raceModeInfo) {
        this.q0 = raceModeInfo;
    }

    public void setRiddingInfo(RiddingInfo riddingInfo) {
        this.V = riddingInfo;
    }

    public void setRopeSkipRestTime(long ropeSkipRestTime) {
        this.F = ropeSkipRestTime;
    }

    public void setRowingInfo(RowingInfo rowingInfo) {
        this.m0 = rowingInfo;
    }

    public void setRowingStatisticInfo(RowingStatisticInfo rowingStatisticInfo) {
        this.n0 = rowingStatisticInfo;
    }

    public void setSecHalfStartTime(int secHalfStartTime) {
        this.B = secHalfStartTime;
    }

    public void setSkiingInfo(SkiingInfo skiingInfo) {
        this.Y = skiingInfo;
    }

    public void setSkipRopeInfo(SkipRopeInfo skipRopeInfo) {
        this.Z = skipRopeInfo;
    }

    public void setSlope(Slope slope) {
        this.m = slope;
    }

    public void setSlopeChart(SlopeChart slopeChart) {
        this.n = slopeChart;
    }

    public void setSpo2Statistic(Spo2Statistic spo2Statistic) {
        this.s0 = spo2Statistic;
    }

    public void setSportMode(int sportMode) {
        this.c = sportMode;
    }

    public void setSportTypeValue(int value) {
        this.f = value;
        this.b = SportType.fromValue(value);
    }

    public void setStartTime(long startTime) {
        this.o = startTime;
    }

    public void setStatisInfo(SportStatisInfo statisInfo) {
        this.W = statisInfo;
    }

    public void setSwimInfo(SwimInfo swimInfo) {
        this.X = swimInfo;
    }

    public void setSwimPoolLength(int swimPoolLength) {
        this.z = swimPoolLength;
    }

    public void setSwingCnt(int[] mSwingCnt) {
        this.R = mSwingCnt;
    }

    public void setTargetType(int targetType) {
        this.N = targetType;
    }

    public void setTargetValue(int targetValue) {
        this.O = targetValue;
    }

    public void setTe(int te) {
        if (a(te)) {
            this.v = te;
        }
    }

    public void setTemperatureStatistic(TemperatureStatistic temperatureStatistic) {
        this.I = temperatureStatistic;
    }

    public void setTimezone(int timezone) {
        this.T = timezone;
    }

    public void setTotalGroup(int totalGroup) {
        this.l = totalGroup;
    }

    public void setTrainLoad(int trainLoad) {
        this.y = trainLoad;
    }

    public void setType(SportType type) {
        this.b = type;
    }

    public void setUserId(long userId) {
        this.r0 = userId;
    }

    public void setVersion(int version) {
        this.a = version;
    }

    public void setVo2Max(int vo2Max) {
        this.x = vo2Max;
    }

    public void setWeatherFrom(int weatherFrom) {
        this.J = weatherFrom;
    }

    public void setWeatherTo(int weatherTo) {
        this.K = weatherTo;
    }

    public void setZone(int zone) {
        this.Q = zone;
    }

    public String toString() {
        return "SportSummary{version=" + this.a + ", type=" + this.b + ", sportMode=" + this.c + ", isCoaching=" + this.d + ", isCrossFit=" + this.e + ", sportTypeValue=" + this.f + ", maxHr=" + this.g + ", startTime=" + this.o + ", endTime=" + this.p + ", baseLng=" + this.q + ", baseLat=" + this.r + ", baseAlt=" + this.s + ", intervalType=" + this.t + ", minHr=" + this.u + ", te=" + this.v + ", anaerobicTE=" + this.w + ", swimPoolLength=" + this.z + ", distanceUnit=" + this.A + ", secHalfStartTime=" + this.B + ", parentStartTime=" + this.C + ", childStartTime=" + this.D + ", childType=" + this.E + ", ropeSkipRestTime=" + this.F + ", maxTemperature=" + this.G + ", minTemperature=" + this.H + ", weatherFrom=" + this.J + ", weatherTo=" + this.K + ", targetType=" + this.N + ", targetValue=" + this.O + ", zone=" + this.Q + ", mSwingCnt=" + Arrays.toString(this.R) + ", dailyPerfermance=" + this.S + ", timezone=" + this.T + ", accInfo=" + this.U + ", riddingInfo=" + this.V + ", statisInfo=" + this.W + ", swimInfo=" + this.X + ", skiingInfo=" + this.Y + ", skipRopeInfo=" + this.Z + ", rowingInfo=" + this.m0 + ", coachingInfo=" + this.o0 + ", crossFitInfo=" + this.p0 + ", userId=" + this.r0 + ", raceModeInfo=" + this.q0 + ", spo2=" + this.s0 + ", courseTitle=" + this.L + ", pressure=" + this.P + ", temperatureStatistic=" + this.I + ", counter=" + this.k + ", power=" + this.y0 + '}';
    }
}
