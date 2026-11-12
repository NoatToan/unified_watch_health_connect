package com.huami.moving.webapi;

import com.huami.mifit.sportlib.common.Constants;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.ui.utils.SportTypeIdentifier;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/moving/webapi/SportWebDataConverter;", "", "<init>", "()V", "Companion", "moving_release"}, k = 1, mv = {1, 5, 1})
public final class SportWebDataConverter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lcom/huami/moving/webapi/SportWebDataConverter$Companion;", "", "Lorg/json/JSONObject;", "json", "Lcom/xiaomi/hm/health/databases/model/Trackrecord;", "parseSportRecord", "Lcom/xiaomi/hm/health/databases/model/Trackdata;", "parseTrackdata", "<init>", "()V", "moving_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Trackrecord parseSportRecord(@NotNull JSONObject json) throws JSONException {
            Trackrecord trackrecord = new Trackrecord();
            trackrecord.setTrackid(Long.valueOf(json.getLong("trackid")));
            trackrecord.setSource(Integer.valueOf(DataTypeSource.RunSource.getValueBySource(json.getString("source"))));
            trackrecord.setV(Integer.valueOf(json.getInt("version")));
            trackrecord.setDistance(Integer.valueOf(json.getInt("dis")));
            trackrecord.setCal(Integer.valueOf((int) new BigDecimal(json.getDouble("calorie")).setScale(0, 4).doubleValue()));
            trackrecord.setEndtime(Long.valueOf(json.getLong("end_time")));
            trackrecord.setCosttime(Integer.valueOf(json.getInt("run_time")));
            trackrecord.setPace(Float.valueOf((float) json.getDouble("avg_pace")));
            trackrecord.setSfreq(Integer.valueOf(json.optInt("avg_frequency", -1)));
            trackrecord.setAvghr(Integer.valueOf(json.optInt("avg_heart_rate", -1)));
            trackrecord.setType(Integer.valueOf(json.getInt("type")));
            trackrecord.setLocation(json.optString("location", ""));
            trackrecord.setLocationdesc(json.optString("city", ""));
            trackrecord.setFfpercent(Integer.valueOf(json.optInt("forefoot_ratio", -1)));
            trackrecord.setDevice(json.optString("bind_device", ""));
            trackrecord.setMaxrtp(Float.valueOf((float) json.optDouble("max_pace", -1.0d)));
            trackrecord.setMinrtp(Float.valueOf((float) json.optDouble("min_pace", -1.0d)));
            trackrecord.setState(Integer.valueOf(SyncedState.STATE_SYNCED_FROM_SERVER_SUMMERY_DONE.getValue()));
            trackrecord.setDate(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(trackrecord.getTrackid().longValue() * ((long) 1000))));
            trackrecord.setAltitudeAscend(Integer.valueOf(json.optInt("altitude_ascend", -1)));
            trackrecord.setAltitudeDescend(Integer.valueOf(json.optInt("altitude_descend", -1)));
            trackrecord.setTotalStep(Integer.valueOf(json.optInt("total_step", -1)));
            trackrecord.setAvgStrideLength(Integer.valueOf(json.optInt("avg_stride_length", -1)));
            trackrecord.setClimbDisascend(Integer.valueOf(json.optInt("distance_ascend", -1)));
            trackrecord.setClimbDisDescend(Integer.valueOf(json.optInt("climb_dis_descend", -1)));
            trackrecord.setClimbDisAscendTime(Integer.valueOf(json.optInt("climb_dis_ascend_time", -1)));
            trackrecord.setClimbDisDescendTime(Integer.valueOf(json.optInt("climb_dis_descend_time", -1)));
            trackrecord.setAvgCadence(Integer.valueOf(json.optInt("avg_cadence", -1)));
            trackrecord.setMaxCadence(Integer.valueOf(json.optInt("max_cadence", -1)));
            trackrecord.setLandingTime(Integer.valueOf(json.optInt("landing_time", -1)));
            trackrecord.setFlightRatio(Integer.valueOf(json.optInt("flight_ratio", -1)));
            trackrecord.setParentTrackId(Long.valueOf(json.optLong("parent_trackid", -1L)));
            if (SportTypeIdentifier.isChildSportTypeForComplex(trackrecord.getParentTrackId()) && !SportTypeIdentifier.isChildSportType(trackrecord.getType().intValue())) {
                trackrecord.setType(Integer.valueOf(trackrecord.getType().intValue() + 1000));
            }
            trackrecord.setUnit(Integer.valueOf(json.optInt("unit", 0)));
            trackrecord.setChildListData(json.optString("child_list", ""));
            trackrecord.setMaxHR(Integer.valueOf(json.optInt("max_heart_rate", -1)));
            trackrecord.setMinHR(Integer.valueOf(json.optInt("min_heart_rate", -1)));
            trackrecord.setTeValue(Integer.valueOf(json.optInt("te", -1)));
            trackrecord.setSwimSWOLF(Integer.valueOf(json.optInt("swolf", -1)));
            trackrecord.setSwimStrokes(Integer.valueOf(json.optInt("total_strokes", -1)));
            trackrecord.setSwimTurns(Integer.valueOf(json.optInt("total_trips", -1)));
            trackrecord.setSwimAvgStrokeSpeed(Float.valueOf((float) json.optDouble("avg_stroke_speed", -1.0d)));
            trackrecord.setSwimMaxStrokeSpeed(Float.valueOf((float) json.optDouble("max_stroke_speed", -1.0d)));
            trackrecord.setSwimDistancePerStroke(Float.valueOf((float) json.optDouble("avg_distance_per_stroke", -1.0d)));
            trackrecord.setSwimPoolLength(Integer.valueOf(json.optInt("swim_pool_length", -1)));
            trackrecord.setSwimStyle(Integer.valueOf(json.optInt("swim_style", -1)));
            trackrecord.setIndoorRunCalibrated(Integer.valueOf(json.optInt("indoor_run_calibrated", 0)));
            trackrecord.setLeftLandingTime(Integer.valueOf(json.optInt("left_landing_time", -1)));
            trackrecord.setLeftFlightRatio(Integer.valueOf(json.optInt("left_flight_ratio", -1)));
            trackrecord.setRightLandingTime(Integer.valueOf(json.optInt("right_landing_time", -1)));
            trackrecord.setRightFlightRatio(Integer.valueOf(json.optInt("right_flight_ratio", -1)));
            trackrecord.setAddInfo(json.optString("add_info"));
            trackrecord.setExtra(json.optString("extra"));
            trackrecord.setMaxSFreq(json.optInt("max_frequency", -1));
            trackrecord.setOriginalJsonData(json.toString());
            Integer type = trackrecord.getType();
            if (type != null && type.intValue() == 21) {
                trackrecord.setTouchStrokes(json.optInt("rope_skipping_count", 0));
            } else {
                Integer type2 = trackrecord.getType();
                if (type2 != null && type2.intValue() == 23) {
                    trackrecord.setTouchStrokes(json.optInt("rope_skipping_count", 0));
                    if (trackrecord.getTouchStrokes() <= 0) {
                        trackrecord.setTouchStrokes(json.optInt("total_strokes", 0));
                    }
                } else {
                    trackrecord.setTouchStrokes(json.optInt("strokes", 0));
                }
            }
            return trackrecord;
        }

        @NotNull
        public final Trackdata parseTrackdata(@NotNull JSONObject json) throws JSONException {
            Trackdata trackdata = new Trackdata();
            trackdata.setTrackid(Long.valueOf(json.getLong("trackid")));
            trackdata.setSource(Integer.valueOf(DataTypeSource.RunSource.getValueBySource(json.getString("source"))));
            trackdata.setV(Integer.valueOf(json.getInt("version")));
            trackdata.setBulkll(json.optString("longitude_latitude", ""));
            trackdata.setBulkal(json.optString("altitude", ""));
            trackdata.setBulkacc(json.optString("accuracy", ""));
            trackdata.setBulktime(json.optString("time", ""));
            trackdata.setBulkgait(json.optString("gait", ""));
            trackdata.setBulkpace(json.optString("pace", ""));
            trackdata.setBulkspeed(json.optString("speed", ""));
            trackdata.setBulkpause(json.optString("pause", ""));
            trackdata.setBulkflag(json.optString("flag", ""));
            trackdata.setBulkhr(json.optString("heart_rate", ""));
            trackdata.setKilomarked(json.optString("kilo_pace", ""));
            trackdata.setMilemarked(json.optString("mile_pace", ""));
            trackdata.setBulkdistance(json.optString("distance", ""));
            trackdata.setBulkbarometerAltitude(json.optString("air_pressure_altitude", ""));
            trackdata.setCadence(json.optString("cadence", ""));
            trackdata.setCorrectAltitude(json.optString("correct_altitude", ""));
            trackdata.setStrokeSpeed(json.optString("stroke_speed", ""));
            trackdata.setLap(json.optString("lap", ""));
            trackdata.setDailyPerformance(json.optString("daily_performance_info", ""));
            trackdata.setProvider(Integer.valueOf(Intrinsics.areEqual(Constants.LOC_PROVIDER_GAODE, json.optString("provider", "gps")) ? 2 : 1));
            trackdata.setCoachSegment(json.optString("coaching_segment", ""));
            trackdata.setWeatherInfo(json.optString("weather_info", ""));
            trackdata.setBulkRopeSkippingFreq(json.optString("rope_skipping_frequency", ""));
            trackdata.setBulkspo2(json.optString("spo2", ""));
            trackdata.setBulkPressure(json.optString(SportWebParams.PARAM_DETAIL_MENTAL_PRESSURE, ""));
            trackdata.setBulkTemperature(json.optString("temperature", ""));
            trackdata.setTimeDeltaAltitude(json.optString(SportWebParams.PARAM_DETAIL_TIME_DELTA_ALTITUDE, ""));
            trackdata.setGolfSwingRtData(json.optString(SportWebParams.PARAM_DETAIL_GOLF_SWING_RT_DATA, ""));
            trackdata.setPowerMeter(json.optString(SportWebParams.PARAM_DETAIL_POWER_METER, ""));
            return trackdata;
        }
    }
}
