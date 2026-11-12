package com.huami.watch.dataflow.model.sport.bean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.amazon.identity.auth.device.datastore.AESEncryptionHelper;
import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.util.NumberFormatter;
import com.huami.watch.util.TimeUtil;
import java.util.List;
import kotlin.text.Typography;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes16.dex */
@Table(name = "sport_summary")
public class SportSummary extends Model {
    private static final String COLUMN_ALTITUDE_ASCEND = "altitude_ascend";
    private static final String COLUMN_ALTITUDE_DESCEND = "altitude_descend";
    private static final String COLUMN_AVG_CADENCE = "avg_cadence";
    private static final String COLUMN_AVG_FREQUENCY = "avg_frequency";
    public static final String COLUMN_AVG_HEART_RATE = "avg_heart_rate";
    private static final String COLUMN_AVG_PACE = "avg_pace";
    private static final String COLUMN_AVG_STRIDE_LENGTH = "avg_stride_length";
    private static final String COLUMN_BIND_DEVICE = "bind_device";
    public static final String COLUMN_CAL = "cal";
    private static final String COLUMN_CITY = "city";
    private static final String COLUMN_CLIMB_DIS_ASCEND_TIME = "climb_dis_ascend_time";
    public static final String COLUMN_CLIMB_DIS_DESCEND = "climb_dis_descend";
    private static final String COLUMN_CLIMB_DIS_DESCEND_TIME = "climb_dis_descend_time";
    public static final String COLUMN_DATE = "date";
    public static final String COLUMN_DIS = "dis";
    private static final String COLUMN_DISTANCE_ASCEND = "distance_ascend";
    public static final String COLUMN_END_TIME = "end_time";
    private static final String COLUMN_FLIGHT_RATIO = "flight_ratio";
    private static final String COLUMN_FOREFOOT_RATIO = "forefoot_ratio";
    private static final String COLUMN_LANDING_TIME = "landing_time";
    private static final String COLUMN_LAP_DISTANCE = "lap_distance";
    private static final String COLUMN_LOCATION = "location";
    private static final String COLUMN_MAX_ALTITUDE = "max_altitude";
    private static final String COLUMN_MAX_CADENCE = "max_cadence";
    private static final String COLUMN_MAX_FREQUENCY = "max_frequency";
    private static final String COLUMN_MAX_PACE = "max_pace";
    private static final String COLUMN_MIN_ALTITUDE = "min_altitude";
    private static final String COLUMN_MIN_PACE = "min_pace";
    public static final String COLUMN_PARENT_TRACK_ID = "parent_trackid";
    public static final String COLUMN_RUN_TIME = "run_time";
    public static final String COLUMN_SOURCE = "source";
    public static final String COLUMN_SOURCE_DATA = "source_data";
    public static final String COLUMN_SPORT_MODE = "sport_mode";
    public static final String COLUMN_STROKES = "strokes";
    public static final String COLUMN_SYNCED = "synced";
    private static final String COLUMN_TOTAL_STEP = "total_step";
    public static final String COLUMN_TRACK_ID = "trackid";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_VERSION = "version";

    @SerializedName("altitude_ascend")
    @Column(name = "altitude_ascend")
    private int altitudeAscend;

    @SerializedName("altitude_descend")
    @Column(name = "altitude_descend")
    private int altitudeDescend;

    @SerializedName("avg_cadence")
    @Column(name = "avg_cadence")
    private int avgCadence;

    @Column(name = "avg_frequency")
    private int avgFrequency;

    @Column(name = "avg_heart_rate")
    private int avgHr;

    @SerializedName("avg_pace")
    @Column(name = "avg_pace")
    private float avgPace;

    @SerializedName("avg_stride_length")
    @Column(name = "avg_stride_length")
    private int avgStrideLength;

    @SerializedName("bind_device")
    @Column(name = "bind_device")
    private String bindDevice;

    @Column(name = "cal")
    private int cal;
    private List<ChildItem> childList;

    @SerializedName("child_list")
    private String childListData;

    @SerializedName("city")
    @Column(name = "city")
    private String city;

    @SerializedName("distance_ascend")
    @Column(name = "distance_ascend")
    private int climbDisAscend;

    @SerializedName("climb_dis_ascend_time")
    @Column(name = "climb_dis_ascend_time")
    private int climbDisAscendTime;

    @SerializedName("climb_dis_descend")
    @Column(name = "climb_dis_descend")
    private int climbDisDescend;

    @SerializedName("climb_dis_descend_time")
    @Column(name = "climb_dis_descend_time")
    private int climbDisDescendTime;

    @SerializedName("date")
    @Column(name = "date")
    private String date;

    @Column(name = "dis")
    private int distance;

    @SerializedName("downhill_num")
    private int downhillNumber;

    @SerializedName("end_time")
    @Column(name = "end_time")
    private long endtime;

    @SerializedName("extra")
    private String extra;

    @Column(name = "flight_ratio")
    private int flightRatio;

    @Column(name = "forefoot_ratio")
    private int forefootRatio;

    @SerializedName("second_half_start_time")
    private int halfStartTime;

    @SerializedName("landing_time")
    @Column(name = "landing_time")
    private int landingTime;

    @SerializedName("lap_distance")
    @Column(name = "lap_distance")
    private int lapDistance;

    @SerializedName("location")
    @Column(name = "location")
    private String location;

    @SerializedName("marathon")
    private String marathon;

    @SerializedName("max_altitude")
    @Column(name = "max_altitude")
    private int maxAltitude;

    @SerializedName("max_cadence")
    @Column(name = "max_cadence")
    private int maxCadence;

    @SerializedName("downhill_max_altitude_desend")
    private int maxDownhillFallMileage;

    @SerializedName("max_frequency")
    @Column(name = "max_frequency")
    private int maxFrequency;

    @SerializedName("max_heart_rate")
    private int maxHR;

    @SerializedName("max_pace")
    @Column(name = "max_pace")
    private float maxPace;

    @SerializedName("min_altitude")
    @Column(name = "min_altitude")
    private int minAltitude;

    @SerializedName("min_heart_rate")
    private int minHR;

    @SerializedName("min_pace")
    @Column(name = "min_pace")
    private float minPace;

    @SerializedName("parent_trackid")
    @Column(name = "parent_trackid")
    private long parentTrackId;

    @SerializedName("rope_skipping_avg_frequency")
    private int ropeSkippingAvgFrequency;

    @SerializedName("rope_skipping_count")
    private int ropeSkippingCount;

    @SerializedName("rope_skipping_max_frequency")
    private int ropeSkippingMaxFrequency;

    @SerializedName("rope_skipping_rest_time")
    private long ropeSkippingRestTime;

    @SerializedName("run_time")
    @Column(name = "run_time")
    private int runtime;

    @SerializedName("source")
    @Column(name = "source", onUniqueConflicts = {Column.ConflictAction.REPLACE}, uniqueGroups = {"group"})
    private String source;

    @SerializedName("avg_frequency")
    private float sourceAvgFrequency;

    @SerializedName("avg_heart_rate")
    private float sourceAvgHR;

    @SerializedName("calorie")
    private float sourceCalorie;

    @Column(name = COLUMN_SOURCE_DATA)
    private String sourceData;

    @SerializedName("dis")
    private float sourceDistance;

    @Column(name = "synced")
    private int synced;

    @SerializedName("back_hand")
    private int tennisBackHand;

    @SerializedName("fore_hand")
    private int tennisForeHand;

    @SerializedName("serve")
    private int tennisServe;

    @SerializedName("strokes")
    @Column(name = "strokes")
    private int tennisStrokes;

    @SerializedName("total_group")
    private int totalGroup;

    @SerializedName("total_step")
    @Column(name = "total_step")
    private int totalStep;

    @SerializedName("trackid")
    @Column(index = true, name = "trackid", notNull = true, onUniqueConflicts = {Column.ConflictAction.REPLACE}, uniqueGroups = {"group"})
    private long trackid;

    @SerializedName("type")
    @Column(name = "type", onUniqueConflicts = {Column.ConflictAction.REPLACE}, uniqueGroups = {"group"})
    private int type;

    @SerializedName("version")
    @Column(name = "version")
    private int version;

    @SerializedName("sport_mode")
    @Column(name = "sport_mode")
    private int sportMode = 0;

    @SerializedName("te")
    private int teValue = -1;

    @SerializedName("unit")
    private int unit = 0;

    @SerializedName("swolf")
    private int swimSWOLF = -1;

    @SerializedName("total_strokes")
    private int swimStrokes = -1;

    @SerializedName("total_trips")
    private int swimTurns = -1;

    @SerializedName("avg_stroke_speed")
    private float swimAvgStrokeSpeed = -1.0f;

    @SerializedName("max_stroke_speed")
    private float swimMaxStrokeSpeed = -1.0f;

    @SerializedName("avg_distance_per_stroke")
    private float swimDistancePerStroke = -1.0f;

    @SerializedName("swim_pool_length")
    private int swimPoolLength = -1;

    @SerializedName("swim_style")
    private int swimStyle = -1;

    public static class ChildItem {
        private long trackid;
        private int type;

        public long getTrackid() {
            return this.trackid;
        }

        public int getType() {
            return this.type;
        }

        public void setTrackid(long j) {
            this.trackid = j;
        }

        public void setType(int i) {
            this.type = i;
        }

        public String toString() {
            return "<TrackId : " + this.trackid + ", Type : " + this.type + SearchCriteria.GT;
        }
    }

    public int getAltitudeAscend() {
        return this.altitudeAscend;
    }

    public int getAltitudeDescend() {
        return this.altitudeDescend;
    }

    public int getAvgCadence() {
        return this.avgCadence;
    }

    public int getAvgFrequency() {
        return this.avgFrequency;
    }

    public int getAvgHr() {
        return this.avgHr;
    }

    public float getAvgPace() {
        return this.avgPace;
    }

    public int getAvgStrideLength() {
        return this.avgStrideLength;
    }

    public String getBindDevice() {
        return this.bindDevice;
    }

    public int getCal() {
        return this.cal;
    }

    public List<ChildItem> getChildList() {
        return this.childList;
    }

    public String getChildListData() {
        return this.childListData;
    }

    public String getCity() {
        return this.city;
    }

    public int getClimbDisAscend() {
        return this.climbDisAscend;
    }

    public int getClimbDisAscendTime() {
        return this.climbDisAscendTime;
    }

    public int getClimbDisDescend() {
        return this.climbDisDescend;
    }

    public int getClimbDisDescendTime() {
        return this.climbDisDescendTime;
    }

    public String getDate() {
        return this.date;
    }

    public int getDis() {
        return this.distance;
    }

    public int getDownhillNumber() {
        return this.downhillNumber;
    }

    public long getEndtime() {
        return this.endtime;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getFlightRatio() {
        return this.flightRatio;
    }

    public int getForefootRatio() {
        return this.forefootRatio;
    }

    public int getHalfStartTime() {
        return this.halfStartTime;
    }

    public int getLandingTime() {
        return this.landingTime;
    }

    public int getLapDistance() {
        return this.lapDistance;
    }

    public String getLocation() {
        return this.location;
    }

    public String getMarathon() {
        return this.marathon;
    }

    public int getMaxAltitude() {
        return this.maxAltitude;
    }

    public int getMaxCadence() {
        return this.maxCadence;
    }

    public int getMaxDownhillFallMileage() {
        return this.maxDownhillFallMileage;
    }

    public int getMaxFrequency() {
        return this.maxFrequency;
    }

    public int getMaxHR() {
        return this.maxHR;
    }

    public float getMaxPace() {
        return this.version <= 14 ? this.minPace : this.maxPace;
    }

    public int getMinAltitude() {
        return this.minAltitude;
    }

    public int getMinHR() {
        return this.minHR;
    }

    public float getMinPace() {
        return this.version <= 14 ? this.maxPace : this.minPace;
    }

    public long getParentTrackId() {
        return this.parentTrackId;
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

    public int getRuntime() {
        return this.runtime;
    }

    public String getSource() {
        return this.source;
    }

    public float getSourceAvgFrequency() {
        return this.sourceAvgFrequency;
    }

    public float getSourceAvgHR() {
        return this.sourceAvgHR;
    }

    public float getSourceCalorie() {
        return this.sourceCalorie;
    }

    public String getSourceData() {
        return this.sourceData;
    }

    public float getSourceDistance() {
        return this.sourceDistance;
    }

    public int getSportMode() {
        return this.sportMode;
    }

    public float getSwimAvgStrokeSpeed() {
        return this.swimAvgStrokeSpeed;
    }

    public float getSwimDistancePerStroke() {
        return this.swimDistancePerStroke;
    }

    public float getSwimMaxStrokeSpeed() {
        return this.swimMaxStrokeSpeed;
    }

    public int getSwimPoolLength() {
        return this.swimPoolLength;
    }

    public int getSwimSWOLF() {
        return this.swimSWOLF;
    }

    public int getSwimStrokes() {
        return this.swimStrokes;
    }

    public int getSwimStyle() {
        return this.swimStyle;
    }

    public int getSwimTurns() {
        return this.swimTurns;
    }

    public int getSynced() {
        return this.synced;
    }

    public int getTeValue() {
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

    public int getTennisStrokes() {
        return this.tennisStrokes;
    }

    public int getTotalGroup() {
        return this.totalGroup;
    }

    public int getTotalStep() {
        return this.totalStep;
    }

    public long getTrackid() {
        return this.trackid;
    }

    public int getType() {
        return this.type;
    }

    public int getUnit() {
        return this.unit;
    }

    public int getVersion() {
        return this.version;
    }

    public void setAltitudeAscend(int i) {
        this.altitudeAscend = i;
    }

    public void setAltitudeDescend(int i) {
        this.altitudeDescend = i;
    }

    public void setAvgCadence(int i) {
        this.avgCadence = i;
    }

    public void setAvgFrequency(int i) {
        this.avgFrequency = i;
    }

    public void setAvgHr(int i) {
        this.avgHr = i;
    }

    public void setAvgPace(float f) {
        this.avgPace = f;
    }

    public void setAvgStrideLength(int i) {
        this.avgStrideLength = i;
    }

    public void setBindDevice(String str) {
        this.bindDevice = str;
    }

    public void setCal(int i) {
        this.cal = i;
    }

    public void setChildList(List<ChildItem> list) {
        this.childList = list;
    }

    public void setChildListData(String str) {
        this.childListData = str;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setClimbDisAscend(int i) {
        this.climbDisAscend = i;
    }

    public void setClimbDisAscendTime(int i) {
        this.climbDisAscendTime = i;
    }

    public void setClimbDisDescend(int i) {
        this.climbDisDescend = i;
    }

    public void setClimbDisDescendTime(int i) {
        this.climbDisDescendTime = i;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setDis(int i) {
        this.distance = i;
    }

    public void setDownhillNumber(int i) {
        this.downhillNumber = i;
    }

    public void setEndtime(long j) {
        this.endtime = j;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setFlightRatio(int i) {
        this.flightRatio = i;
    }

    public void setForefootRatio(int i) {
        this.forefootRatio = i;
    }

    public void setHalfStartTime(int i) {
        this.halfStartTime = i;
    }

    public void setLandingTime(int i) {
        this.landingTime = i;
    }

    public void setLapDistance(int i) {
        this.lapDistance = i;
    }

    public void setLocation(String str) {
        this.location = str;
    }

    public void setMarathon(String str) {
        this.marathon = str;
    }

    public void setMaxAltitude(int i) {
        this.maxAltitude = i;
    }

    public void setMaxCadence(int i) {
        this.maxCadence = i;
    }

    public void setMaxDownhillFallMileage(int i) {
        this.maxDownhillFallMileage = i;
    }

    public void setMaxFrequency(int i) {
        this.maxFrequency = i;
    }

    public void setMaxHR(int i) {
        this.maxHR = i;
    }

    public void setMaxPace(float f) {
        this.maxPace = f;
    }

    public void setMinAltitude(int i) {
        this.minAltitude = i;
    }

    public void setMinHR(int i) {
        this.minHR = i;
    }

    public void setMinPace(float f) {
        this.minPace = f;
    }

    public void setParentTrackId(long j) {
        this.parentTrackId = j;
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

    public void setRuntime(int i) {
        this.runtime = i;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setSourceAvgFrequency(float f) {
        this.sourceAvgFrequency = f;
    }

    public void setSourceAvgHR(float f) {
        this.sourceAvgHR = f;
    }

    public void setSourceCalorie(float f) {
        this.sourceCalorie = f;
    }

    public void setSourceData(String str) {
        this.sourceData = str;
    }

    public void setSourceDistance(float f) {
        this.sourceDistance = f;
    }

    public void setSportMode(int i) {
        this.sportMode = i;
    }

    public void setSwimAvgStrokeSpeed(float f) {
        this.swimAvgStrokeSpeed = f;
    }

    public void setSwimDistancePerStroke(float f) {
        this.swimDistancePerStroke = f;
    }

    public void setSwimMaxStrokeSpeed(float f) {
        this.swimMaxStrokeSpeed = f;
    }

    public void setSwimPoolLength(int i) {
        this.swimPoolLength = i;
    }

    public void setSwimSWOLF(int i) {
        this.swimSWOLF = i;
    }

    public void setSwimStrokes(int i) {
        this.swimStrokes = i;
    }

    public void setSwimStyle(int i) {
        this.swimStyle = i;
    }

    public void setSwimTurns(int i) {
        this.swimTurns = i;
    }

    public void setSynced(int i) {
        this.synced = i;
    }

    public void setTeValue(int i) {
        this.teValue = i;
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

    public void setTennisStrokes(int i) {
        this.tennisStrokes = i;
    }

    public void setTotalGroup(int i) {
        this.totalGroup = i;
    }

    public void setTotalStep(int i) {
        this.totalStep = i;
    }

    public void setTrackid(long j) {
        this.trackid = j;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUnit(int i) {
        this.unit = i;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    @Override // com.activeandroid.Model
    public String toString() {
        return "\n<TrackID : " + this.trackid + AESEncryptionHelper.SEPARATOR + TimeUtil.formatDateTime(this.trackid * 1000, "yyyy-MM-dd HH:mm:ss") + ", End : " + this.endtime + ", Type : " + this.type + ", Runtime : " + this.runtime + AESEncryptionHelper.SEPARATOR + TimeUtil.formatDuration(this.runtime) + ", Dis : " + this.distance + AESEncryptionHelper.SEPARATOR + NumberFormatter.formatDouble2String(((double) this.distance) / 1000.0d, 2, new int[0]) + ", Cal : " + this.cal + ", AvgHR : " + this.avgHr + ", V : " + this.version + ", Parent : " + this.parentTrackId + ", Synced: " + this.synced + SearchCriteria.GT;
    }

    public String toStringAll() {
        return "\n<trackid=" + this.trackid + ", source='" + this.source + "', dis=" + this.distance + ", cal=" + this.cal + ", endtime=" + this.endtime + ", runtime=" + this.runtime + ", avgPace=" + this.avgPace + ", avgFrequency=" + this.avgFrequency + ", type=" + this.type + ", location='" + this.location + "', city='" + this.city + "', forefootRatio=" + this.forefootRatio + ", bindDevice='" + this.bindDevice + "', maxPace=" + this.maxPace + ", minPace=" + this.minPace + ", version=" + this.version + ", altitudeAscend=" + this.altitudeAscend + ", altitudeDescend=" + this.altitudeDescend + ", totalStep=" + this.totalStep + ", avgStrideLength=" + this.avgStrideLength + ", maxFrequency=" + this.maxFrequency + ", maxAltitude=" + this.maxAltitude + ", minAltitude=" + this.minAltitude + ", lapDistance=" + this.lapDistance + ", climbDisDescend=" + this.climbDisDescend + ", climbDisAscendTime=" + this.climbDisAscendTime + ", climbDisDescendTime=" + this.climbDisDescendTime + ", climbDisAscend=" + this.climbDisAscend + ", maxCadence=" + this.maxCadence + ", avgCadence=" + this.avgCadence + ", landingTime=" + this.landingTime + ", flightRatio=" + this.flightRatio + ", avgHr=" + this.avgHr + ", date='" + this.date + "', synced=" + this.synced + ", ChildList : " + this.childList + ", MaxHR : " + this.maxHR + ", MinHR : " + this.minHR + ", TE : " + this.teValue + ", unit : " + this.unit + ", extra : " + this.extra + ", sportMode :" + this.sportMode + ", downhillNumber :" + this.downhillNumber + ", maxDownhillFallMileage :" + this.maxDownhillFallMileage + ", tennisStrokes :" + this.tennisStrokes + ", tennisForeHand :" + this.tennisForeHand + ", tennisBackHand :" + this.tennisBackHand + ", tennisServe :" + this.tennisServe + ", halfStartTime :" + this.halfStartTime + ", marathon=" + this.marathon + ", totalGroup=" + this.totalGroup + Typography.greater;
    }
}
