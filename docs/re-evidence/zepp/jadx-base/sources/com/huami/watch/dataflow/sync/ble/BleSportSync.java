package com.huami.watch.dataflow.sync.ble;

import android.content.Context;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.watch.companion.util.Geohash;
import com.huami.watch.dataflow.model.sport.SportParams;
import com.huami.watch.dataflow.model.sport.SportSummaryManager;
import com.huami.watch.dataflow.model.sport.bean.SportSummary;
import com.huami.watch.dataflow.sync.SportSync;
import com.huami.watch.dataflow.sync.bean.BaseSportData;
import com.huami.watch.dataflow.sync.bean.PBModel;
import com.huami.watch.dataflow.sync.bean.SingleSportData;
import com.huami.watch.dataflow.sync.bean.SportData;
import com.huami.watch.dataflow.sync.ble.BleSportSync;
import com.huami.watch.dataflow.sync.gps.filter.GpsFilterHelper;
import com.huami.watch.dataflow.sync.sport.BleSportType;
import com.huami.watch.dataflow.sync.util.SyncConst;
import com.huami.watch.dataflow.util.SportDataParser;
import com.huami.watch.util.ArraysUtil;
import com.huami.watch.util.DoLooper;
import com.huami.watch.util.Log;
import com.huami.watch.util.TimeUtil;
import com.xiaomi.hm.health.bt.device.smartwatch.HMSmartWatchDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.BleSportData;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.BleSportDetailGps;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.BleSportDetailHR;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.BleSportSummary;
import com.xiaomi.hm.health.bt.profile.smartwatch.sport.IHMSportDataCallback;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UShort;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public class BleSportSync extends SportSync {
    private static final String j = "DataFlow-BLE-Sport";
    private Context d;
    private HMSmartWatchDevice e;
    private String f;
    private String g;
    private String h;
    private int i;

    public class a implements IHMSportDataCallback {
        public final /* synthetic */ DoLooper.Result a;

        public a(DoLooper.Result result) {
            this.a = result;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onData(List<GpsRecord> list) {
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onFinish(boolean z) {
            Log.d(BleSportSync.j, "OnSync SportData Finish, Success: " + z, new Object[0]);
            DoLooper.Result result = this.a;
            result.finish = true;
            result.success = z;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onProgress(Progress progress) {
            Log.v(BleSportSync.j, "OnSync SportData Progress: " + progress, new Object[0]);
        }

        @Override // com.xiaomi.hm.health.bt.profile.smartwatch.sport.IHMSportDataCallback
        public void onSportData(List<BleSportData> list) {
            Log.d(BleSportSync.j, "OnSync SportData!!", new Object[0]);
            this.a.data = list;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.IHMGpsDataCallback
        public void onStart() {
            Log.i(BleSportSync.j, "OnSync SportData Start...", new Object[0]);
        }
    }

    public class b implements Comparator<BleSportDetailHR.PerKM> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(BleSportDetailHR.PerKM perKM, BleSportDetailHR.PerKM perKM2) {
            return perKM.distance - perKM2.distance;
        }
    }

    public class c implements Comparator<BleSportDetailHR.PerLap> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(BleSportDetailHR.PerLap perLap, BleSportDetailHR.PerLap perLap2) {
            return perLap.lapNum - perLap2.lapNum;
        }
    }

    public BleSportSync(Context context, HMSmartWatchDevice hMSmartWatchDevice, String str, int i, String str2, String str3) {
        super(0L);
        this.d = context;
        this.e = hMSmartWatchDevice;
        this.f = str3;
        this.g = str;
        this.h = str2;
        this.i = i;
    }

    private static String f(BleSportDetailHR.PerKM perKM) {
        return Geohash.encode(((double) perKM.latitude) / 3000000.0d, ((double) perKM.longitude) / 3000000.0d);
    }

    private static long g(long j2) {
        return (j2 * 100) / 3;
    }

    private static float h(short s) {
        if (s > 0) {
            return 1000.0f / s;
        }
        return 0.0f;
    }

    private String i(int[] iArr, short[] sArr) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            short s = sArr[i];
            if (i2 != 0 && s != 0) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trackid", i2);
                    jSONObject.put("type", (int) s);
                    jSONArray.put(jSONObject);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
        return jSONArray.toString();
    }

    private static boolean j(BleSportDetailHR.DataPoint dataPoint) {
        return (dataPoint.heartRate[0] & 15) <= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ DoLooper.Result k(DoLooper.Result result) throws Exception {
        return result;
    }

    private void l(List<BleSportDetailHR.MarathonInfo> list, SportSummary sportSummary, Map<String, Object> map) {
        boolean zIsEmpty = ArraysUtil.isEmpty(list);
        String str = MessengerShareContentUtility.WEBVIEW_RATIO_FULL;
        if (!zIsEmpty) {
            JSONObject jSONObject = new JSONObject();
            try {
                for (BleSportDetailHR.MarathonInfo marathonInfo : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dis", marathonInfo.distance & UShort.MAX_VALUE);
                    jSONObject2.put("time", marathonInfo.duration);
                    if (marathonInfo.halfOrFull == 1) {
                        jSONObject.put(MessengerShareContentUtility.WEBVIEW_RATIO_FULL, jSONObject2);
                    } else {
                        jSONObject.put("half", jSONObject2);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            sportSummary.setMarathon(jSONObject.toString());
            map.put("marathon", sportSummary.getMarathon());
            return;
        }
        if (BleSportType.needMarathonFaultTolerance(sportSummary.getType())) {
            boolean z = sportSummary.getDis() >= 41700;
            if ((!z && sportSummary.getDis() >= 20800) || z) {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("dis", sportSummary.getDis());
                    jSONObject4.put("time", sportSummary.getRuntime());
                    if (!z) {
                        str = "half";
                    }
                    jSONObject3.put(str, jSONObject4);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                sportSummary.setMarathon(jSONObject3.toString());
                map.put("marathon", sportSummary.getMarathon());
            }
        }
    }

    @NonNull
    private List<BaseSportData> m(@NonNull List<BleSportData> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (BleSportData bleSportData : list) {
            SingleSportData singleSportData = new SingleSportData();
            BleSportSummary bleSportSummary = bleSportData.summary;
            if (bleSportSummary == null) {
                Log.w(j, "Ble SportSummary is Null, Continue...", new Object[0]);
            } else {
                BleSportDetailHR bleSportDetailHR = bleSportData.detailHR;
                SportSummary sportSummaryN = n(bleSportSummary, bleSportDetailHR != null ? bleSportDetailHR.marathonInfos : null);
                sportSummaryN.setVersion(15);
                singleSportData.setTrackid(sportSummaryN.getTrackid());
                singleSportData.setSummary(sportSummaryN.getSourceData());
                Map<String, ? extends Object> mapT = t(sportSummaryN);
                mapT.putAll(r(bleSportData.detailGps, sportSummaryN));
                mapT.putAll(s(bleSportData.detailHR, sportSummaryN));
                mapT.putAll(GpsFilterHelper.INSTANCE.filterGpsPoint(mapT));
                singleSportData.setDetail(p(mapT));
                Object obj = mapT.get("pb");
                if (obj != null) {
                    singleSportData.setSummary(singleSportData.getSummary() + com.alipay.sdk.m.s.a.l + "pb" + SearchCriteria.EQ + obj);
                }
                Log.d(j, "Ble SportData Summary: " + bleSportSummary, new Object[0]);
                Log.d(j, "Parse SportData: " + singleSportData, new Object[0]);
                arrayList.add(singleSportData);
            }
        }
        return arrayList;
    }

    private SportSummary n(BleSportSummary bleSportSummary, List<BleSportDetailHR.MarathonInfo> list) {
        SportSummary sportSummary = new SportSummary();
        HashMap map = new HashMap();
        sportSummary.setSource(this.f);
        map.put("source", sportSummary.getSource());
        map.put("deviceid", this.g);
        map.put("sn", this.h);
        map.put(SportParams.PARAM_DEVICE_SOURCE, Integer.valueOf(this.i));
        sportSummary.setVersion(15);
        map.put("version", Integer.valueOf(sportSummary.getVersion()));
        sportSummary.setTrackid(bleSportSummary.trackId);
        map.put("trackid", Long.valueOf(sportSummary.getTrackid()));
        sportSummary.setType(bleSportSummary.sportType);
        map.put("type", Integer.valueOf(sportSummary.getType()));
        sportSummary.setSportMode(bleSportSummary.intervalType);
        map.put("sport_mode", Integer.valueOf(sportSummary.getSportMode()));
        sportSummary.setAvgHr(bleSportSummary.avgHeartRate & 255);
        map.put("avg_heart_rate", Integer.valueOf(sportSummary.getAvgHr()));
        sportSummary.setMaxHR(bleSportSummary.maxHeartRate & 255);
        map.put("max_heart_rate", Integer.valueOf(sportSummary.getMaxHR()));
        sportSummary.setMinHR(bleSportSummary.minHeartRate & 255);
        map.put("min_heart_rate", Integer.valueOf(sportSummary.getMinHR()));
        sportSummary.setEndtime(bleSportSummary.endTime);
        map.put("end_time", Long.valueOf(sportSummary.getEndtime()));
        sportSummary.setRuntime(bleSportSummary.duration);
        map.put("run_time", Integer.valueOf(sportSummary.getRuntime()));
        sportSummary.setDis(bleSportSummary.distance);
        map.put("dis", Integer.valueOf(sportSummary.getDis()));
        short s = bleSportSummary.speed;
        if (s > 0) {
            sportSummary.setAvgPace(1000.0f / s);
        }
        map.put("avg_pace", Float.valueOf(sportSummary.getAvgPace()));
        short s2 = bleSportSummary.maxSpeed;
        if (s2 > 0) {
            sportSummary.setMaxPace(1000.0f / s2);
        }
        map.put("max_pace", Float.valueOf(sportSummary.getMaxPace()));
        sportSummary.setCal(bleSportSummary.calorie);
        map.put("calorie", Integer.valueOf(sportSummary.getCal()));
        sportSummary.setAvgFrequency(bleSportSummary.stepFreq);
        map.put("avg_frequency", Integer.valueOf(sportSummary.getAvgFrequency()));
        sportSummary.setMaxFrequency(bleSportSummary.maxStepFreq);
        map.put("max_frequency", Integer.valueOf(sportSummary.getMaxFrequency()));
        sportSummary.setAvgStrideLength(bleSportSummary.avgStride);
        map.put("avg_stride_length", Integer.valueOf(sportSummary.getAvgStrideLength()));
        sportSummary.setTotalStep(bleSportSummary.stepCount);
        map.put("total_step", Integer.valueOf(sportSummary.getTotalStep()));
        if (BleSportType.INSTANCE.needAltitudeOffset(bleSportSummary.sportType)) {
            short s3 = bleSportSummary.highestAltitude;
            if (-20000 != s3) {
                sportSummary.setMaxAltitude(s3 + bleSportSummary.ropeSkippingTotalCount);
            } else {
                sportSummary.setMaxAltitude(s3);
            }
            short s4 = bleSportSummary.lowestAltitude;
            if (-20000 != s4) {
                sportSummary.setMinAltitude(s4 + bleSportSummary.ropeSkippingTotalCount);
            } else {
                sportSummary.setMinAltitude(s4);
            }
        } else {
            sportSummary.setMaxAltitude(bleSportSummary.highestAltitude);
            sportSummary.setMinAltitude(bleSportSummary.lowestAltitude);
        }
        map.put("max_altitude", Integer.valueOf(sportSummary.getMaxAltitude()));
        map.put("min_altitude", Integer.valueOf(sportSummary.getMinAltitude()));
        sportSummary.setAltitudeAscend(bleSportSummary.climbUp);
        map.put("altitude_ascend", Integer.valueOf(sportSummary.getAltitudeAscend()));
        sportSummary.setAltitudeDescend(bleSportSummary.climbDown);
        map.put("altitude_descend", Integer.valueOf(sportSummary.getAltitudeDescend()));
        sportSummary.setClimbDisAscend(bleSportSummary.climbAscendDis);
        map.put("distance_ascend", Integer.valueOf(sportSummary.getClimbDisAscend()));
        sportSummary.setClimbDisDescend(bleSportSummary.climbDescendDis);
        map.put("climb_dis_descend", Integer.valueOf(sportSummary.getClimbDisDescend()));
        sportSummary.setClimbDisAscendTime(bleSportSummary.climbAscendDuration);
        map.put("climb_dis_ascend_time", Integer.valueOf(sportSummary.getClimbDisAscendTime()));
        sportSummary.setClimbDisDescendTime(bleSportSummary.climbDescentDuration);
        map.put("climb_dis_descend_time", Integer.valueOf(sportSummary.getClimbDisDescendTime()));
        sportSummary.setTeValue(bleSportSummary.TE & 255);
        map.put("te", Integer.valueOf(sportSummary.getTeValue()));
        sportSummary.setSwimPoolLength(bleSportSummary.swimPoolLength & 255);
        map.put("swim_pool_length", Integer.valueOf(sportSummary.getSwimPoolLength()));
        sportSummary.setSwimStyle(bleSportSummary.swimStyle & 255);
        map.put("swim_style", Integer.valueOf(sportSummary.getSwimStyle()));
        sportSummary.setUnit(bleSportSummary.unit & 255);
        map.put("unit", Integer.valueOf(sportSummary.getUnit()));
        sportSummary.setParentTrackId(bleSportSummary.parentTrackId);
        map.put("parent_trackid", Long.valueOf(sportSummary.getParentTrackId()));
        sportSummary.setChildListData(i(bleSportSummary.childTrackIds, bleSportSummary.childSportTypes));
        map.put("child_list", sportSummary.getChildListData());
        sportSummary.setSwimSWOLF(bleSportSummary.swimSwolfPerFixedMeters);
        map.put("swolf", Integer.valueOf(sportSummary.getSwimSWOLF()));
        sportSummary.setSwimStrokes(bleSportSummary.swimTotalStrokes);
        map.put("total_strokes", Integer.valueOf(sportSummary.getSwimStrokes()));
        if (BleSportType.needTotalGroup(sportSummary.getType())) {
            sportSummary.setTotalGroup(bleSportSummary.swimTotalTrips);
            map.put("total_group", Integer.valueOf(sportSummary.getTotalGroup()));
        } else {
            sportSummary.setSwimTurns(bleSportSummary.swimTotalTrips);
            map.put("total_trips", Integer.valueOf(sportSummary.getSwimTurns()));
        }
        sportSummary.setSwimAvgStrokeSpeed(bleSportSummary.swimAvgStokeSpeed / 60.0f);
        map.put("avg_stroke_speed", Float.valueOf(sportSummary.getSwimAvgStrokeSpeed()));
        sportSummary.setSwimMaxStrokeSpeed(bleSportSummary.swimMaxStrokeSpeed / 60.0f);
        map.put("max_stroke_speed", Float.valueOf(sportSummary.getSwimMaxStrokeSpeed()));
        sportSummary.setSwimDistancePerStroke(bleSportSummary.swimAvgDistancePerStroke);
        map.put("avg_distance_per_stroke", Float.valueOf(sportSummary.getSwimDistancePerStroke()));
        sportSummary.setDownhillNumber(bleSportSummary.downhillCount);
        map.put("downhill_num", Integer.valueOf(sportSummary.getDownhillNumber()));
        sportSummary.setMaxDownhillFallMileage(bleSportSummary.downhillMaxDrop);
        map.put("downhill_max_altitude_desend", Integer.valueOf(sportSummary.getMaxDownhillFallMileage()));
        sportSummary.setTennisStrokes(bleSportSummary.tennisStrokes);
        map.put("strokes", Integer.valueOf(sportSummary.getTennisStrokes()));
        sportSummary.setTennisForeHand(bleSportSummary.tennisForehand);
        map.put("fore_hand", Integer.valueOf(sportSummary.getTennisForeHand()));
        sportSummary.setTennisBackHand(bleSportSummary.tennisBackhand);
        map.put("back_hand", Integer.valueOf(sportSummary.getTennisBackHand()));
        sportSummary.setTennisServe(bleSportSummary.tennisServeCount);
        map.put("serve", Short.valueOf(bleSportSummary.tennisServeCount));
        sportSummary.setHalfStartTime(bleSportSummary.tennisSecondHalfStartTime);
        map.put("second_half_start_time", Integer.valueOf(sportSummary.getHalfStartTime()));
        sportSummary.setRopeSkippingCount(bleSportSummary.ropeSkippingTotalCount);
        map.put("rope_skipping_count", Integer.valueOf(sportSummary.getRopeSkippingCount()));
        sportSummary.setRopeSkippingAvgFrequency(bleSportSummary.ropeSkippingAvgFreq);
        map.put("rope_skipping_avg_frequency", Integer.valueOf(sportSummary.getRopeSkippingAvgFrequency()));
        sportSummary.setRopeSkippingMaxFrequency(bleSportSummary.ropeSkippingMaxFreq);
        map.put("rope_skipping_max_frequency", Integer.valueOf(sportSummary.getRopeSkippingMaxFrequency()));
        sportSummary.setRopeSkippingRestTime(bleSportSummary.ropeSkippingRestTime);
        map.put("rope_skipping_rest_time", Integer.valueOf(bleSportSummary.ropeSkippingRestTime));
        l(list, sportSummary, map);
        sportSummary.setSourceData(p(map));
        return sportSummary;
    }

    private static String o(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i]);
            if (i != objArr.length - 1) {
                sb.append(",");
            } else {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    private String p(Map<String, Object> map) {
        return ArraysUtil.toString(map, com.alipay.sdk.m.s.a.l);
    }

    private static String q(List<BleSportDetailHR.PerLap> list) {
        Collections.sort(list, new c());
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (BleSportDetailHR.PerLap perLap : list) {
            int i4 = perLap.distance - i;
            int i5 = perLap.climbDistance - i2;
            int i6 = (perLap.calorie & UShort.MAX_VALUE) - i3;
            Object[] objArr = new Object[21];
            objArr[0] = Integer.valueOf((perLap.lapNum & UShort.MAX_VALUE) - 1);
            objArr[1] = Integer.valueOf(perLap.costTime);
            objArr[2] = Integer.valueOf(i4);
            objArr[3] = Geohash.encode(((double) perLap.latitude) / 3000000.0d, ((double) perLap.longitude) / 3000000.0d);
            objArr[4] = Integer.valueOf(perLap.avgHR & 255);
            objArr[5] = Integer.valueOf(perLap.offsetToStart);
            objArr[6] = Integer.valueOf(SyncConst.ALTITUDE_INVALID_VALUE);
            objArr[7] = Integer.valueOf(perLap.climbUp & UShort.MAX_VALUE);
            objArr[8] = Integer.valueOf(perLap.climbDown & UShort.MAX_VALUE);
            objArr[9] = Float.valueOf(i4 > 0 ? (perLap.costTime * 1.0f) / i4 : 0.0f);
            objArr[10] = Float.valueOf((perLap.maxPace & UShort.MAX_VALUE) / 1000.0f);
            objArr[11] = Integer.valueOf(i5);
            objArr[12] = Integer.valueOf(perLap.stepCadence & UShort.MAX_VALUE);
            objArr[13] = Integer.valueOf(perLap.climbUp & UShort.MAX_VALUE);
            objArr[14] = Short.valueOf(perLap.SWOLF);
            objArr[15] = Integer.valueOf(i6);
            objArr[16] = Integer.valueOf(perLap.stepCadence & UShort.MAX_VALUE);
            objArr[17] = -1;
            objArr[18] = Integer.valueOf(perLap.lapType & 255);
            objArr[19] = Integer.valueOf(i4);
            objArr[20] = Integer.valueOf(perLap.subType & 255);
            sb.append(o(objArr));
            i = perLap.distance;
            i2 = perLap.climbDistance;
            i3 = perLap.calorie & UShort.MAX_VALUE;
        }
        return sb.toString();
    }

    private static Map<String, Object> r(BleSportDetailGps bleSportDetailGps, SportSummary sportSummary) {
        int i;
        HashMap map = new HashMap();
        if (bleSportDetailGps == null) {
            return map;
        }
        List<BleSportDetailGps.DataPoint> listConvert = bleSportDetailGps.convert();
        if (!listConvert.isEmpty()) {
            int size = listConvert.size();
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            for (int i2 = 0; i2 < size; i2++) {
                BleSportDetailGps.DataPoint dataPoint = listConvert.get(i2);
                sb.append(g(dataPoint.offsetLatitude) + "," + g(dataPoint.offsetLongitude));
                sb.append(";");
                sb2.append((int) dataPoint.type);
                sb2.append(";");
                sb3.append(dataPoint.offsetTime);
                sb3.append(";");
                sb5.append(h(dataPoint.speed));
                sb5.append(";");
                int ropeSkippingCount = dataPoint.altitude * 100;
                if (BleSportType.INSTANCE.needAltitudeOffset(sportSummary.getType()) && -20000 != (i = dataPoint.altitude)) {
                    ropeSkippingCount = (i + sportSummary.getRopeSkippingCount()) * 100;
                }
                sb4.append(ropeSkippingCount);
                sb4.append(";");
            }
            map.put("longitude_latitude", sb.toString());
            map.put("flag", sb2.toString());
            map.put("time", sb3.toString());
            map.put("altitude", sb4.toString());
            map.put("pace", sb5.toString());
        }
        return map;
    }

    private static Map<String, Object> s(BleSportDetailHR bleSportDetailHR, SportSummary sportSummary) {
        int i;
        HashMap map = new HashMap();
        if (bleSportDetailHR == null) {
            return map;
        }
        List<BleSportDetailHR.DataPoint> listConvert = bleSportDetailHR.convert();
        if (!listConvert.isEmpty()) {
            int size = listConvert.size();
            Log.d(j, sportSummary.getTrackid() + ", size = " + size, new Object[0]);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            int type = sportSummary.getType();
            if (type > 1000) {
                type -= 1000;
            }
            BleSportType.Companion companion = BleSportType.INSTANCE;
            boolean zNeedRopeSkipping = companion.needRopeSkipping(type);
            boolean zNeedStrokeSpeed = companion.needStrokeSpeed(type);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i2 < size) {
                BleSportDetailHR.DataPoint dataPoint = listConvert.get(i2);
                List<BleSportDetailHR.DataPoint> list = listConvert;
                if (j(dataPoint)) {
                    int i5 = (dataPoint.heartRate[1] & 255) - i4;
                    sb.append((dataPoint.offsetTime + i3) + "," + i5 + ";");
                    i4 = dataPoint.heartRate[1] & 255;
                    i = 0;
                } else {
                    i = i3 + dataPoint.offsetTime;
                }
                StringBuilder sb6 = new StringBuilder();
                int i6 = i;
                sb6.append(dataPoint.offsetTime);
                sb6.append(",");
                sb6.append(h(dataPoint.pace));
                sb6.append(";");
                sb3.append(sb6.toString());
                sb4.append(dataPoint.offsetTime + "," + dataPoint.distance + ";");
                if (zNeedRopeSkipping) {
                    sb5.append(dataPoint.offsetTime + "," + (dataPoint.cadence & UShort.MAX_VALUE) + ";");
                } else if (zNeedStrokeSpeed) {
                    sb5.append(dataPoint.offsetTime + "," + ((dataPoint.cadence & UShort.MAX_VALUE) / 60.0f) + ";");
                } else {
                    sb2.append(dataPoint.offsetTime + ",");
                    sb2.append(dataPoint.steps + ",");
                    sb2.append(dataPoint.stepLength + ",");
                    sb2.append((dataPoint.cadence & UShort.MAX_VALUE) + ";");
                }
                i2++;
                size = size;
                listConvert = list;
                i3 = i6;
            }
            map.put("heart_rate", sb.toString());
            map.put("speed", sb3.toString());
            map.put("distance", sb4.toString());
            if (zNeedRopeSkipping) {
                map.put("rope_skipping_frequency", sb5.toString());
            } else if (zNeedStrokeSpeed) {
                map.put("stroke_speed", sb5.toString());
            } else {
                map.put("gait", sb2.toString());
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        map.putAll(v(bleSportDetailHR, sportSummary.getTrackid(), arrayList2));
        map.putAll(w(bleSportDetailHR, sportSummary.getTrackid(), arrayList));
        map.putAll(x(bleSportDetailHR.perLaps));
        if (!arrayList.isEmpty()) {
            map.putAll(u(sportSummary.getType(), arrayList, arrayList2));
        }
        return map;
    }

    private static Map<String, Object> t(SportSummary sportSummary) {
        HashMap map = new HashMap();
        map.put("trackid", Long.valueOf(sportSummary.getTrackid()));
        map.put("source", sportSummary.getSource());
        map.put("version", Integer.valueOf(sportSummary.getVersion()));
        return map;
    }

    private static HashMap<String, Object> u(int i, List<PBModel.RunningInfoPerKM> list, List<PBModel.PauseInfo> list2) {
        HashMap<String, Object> map = new HashMap<>();
        PBModel pBModelCheckPBInfo = PBModel.checkPBInfo(i, list, list2);
        if (pBModelCheckPBInfo != null) {
            String json = pBModelCheckPBInfo.toJSON();
            Log.d(j, "To cloud pb : " + json, new Object[0]);
            map.put("pb", json);
        }
        return map;
    }

    private static Map<String, Object> v(BleSportDetailHR bleSportDetailHR, long j2, List<PBModel.PauseInfo> list) {
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder();
        if (bleSportDetailHR != null && !bleSportDetailHR.pauseInfos.isEmpty()) {
            int size = bleSportDetailHR.pauseInfos.size();
            for (int i = 0; i < size; i++) {
                BleSportDetailHR.PauseInfo pauseInfo = bleSportDetailHR.pauseInfos.get(i);
                sb.append((((long) pauseInfo.offsetToStart) + j2) + "," + (pauseInfo.stopTime - pauseInfo.offsetToStart));
                sb.append(",-1,-1,");
                sb.append(pauseInfo.type & 255);
                sb.append(";");
                PBModel.PauseInfo pauseInfo2 = new PBModel.PauseInfo();
                pauseInfo2.setStart(((long) pauseInfo.offsetToStart) + j2);
                pauseInfo2.setEnd(pauseInfo.stopTime);
                pauseInfo2.setPauseType(pauseInfo.type);
                list.add(pauseInfo2);
            }
            map.put("pause", sb.toString());
        }
        return map;
    }

    private static Map<String, Object> w(BleSportDetailHR bleSportDetailHR, long j2, List<PBModel.RunningInfoPerKM> list) {
        HashMap map = new HashMap();
        if (ArraysUtil.isEmpty(bleSportDetailHR.perKMs)) {
            return map;
        }
        Collections.sort(bleSportDetailHR.perKMs, new b());
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char c2 = 0;
        int i = 1;
        boolean z = (bleSportDetailHR.perKMs.get(0).unit & 255) == 0;
        int i2 = z ? 1000 : 1609;
        int size = bleSportDetailHR.perKMs.size();
        int i3 = 0;
        int i4 = -1;
        while (i3 < size) {
            BleSportDetailHR.PerKM perKM = bleSportDetailHR.perKMs.get(i3);
            int i5 = perKM.distance;
            int i6 = (i5 / i2) - i;
            float f = i5 / 1000.0f;
            if (i6 == i4 && i3 == size - 1) {
                Object[] objArr = new Object[2];
                objArr[c2] = Float.valueOf(f);
                objArr[i] = Byte.valueOf(perKM.state);
                sb2.append(o(objArr));
            } else {
                Object[] objArr2 = new Object[6];
                objArr2[c2] = Integer.valueOf(i6);
                float f2 = i2 * 1000.0f;
                objArr2[i] = Integer.valueOf((int) (f2 / (perKM.speed & UShort.MAX_VALUE)));
                objArr2[2] = f(perKM);
                objArr2[3] = -1;
                objArr2[4] = -1;
                objArr2[5] = Integer.valueOf(perKM.offsetToStart);
                sb.append(o(objArr2));
                sb2.append(o(Float.valueOf(f), Byte.valueOf(perKM.state)));
                PBModel.RunningInfoPerKM runningInfoPerKM = new PBModel.RunningInfoPerKM();
                runningInfoPerKM.setIndex(i6);
                runningInfoPerKM.setTrackId(j2);
                runningInfoPerKM.setCostTime((int) (f2 / (perKM.speed & UShort.MAX_VALUE)));
                runningInfoPerKM.setSpeed(perKM.speed & UShort.MAX_VALUE);
                runningInfoPerKM.setTotalCostTime(perKM.offsetToStart);
                runningInfoPerKM.setUnit(perKM.unit & 255);
                list.add(runningInfoPerKM);
            }
            i3++;
            i4 = i6;
            i2 = i2;
            size = size;
            c2 = 0;
            i = 1;
        }
        if (z) {
            map.put("kilo_pace", sb.toString());
        } else {
            map.put("mile_pace", sb.toString());
        }
        map.put("daily_performance_info", sb2.toString());
        return map;
    }

    private static HashMap<String, Object> x(List<BleSportDetailHR.PerLap> list) {
        HashMap<String, Object> map = new HashMap<>();
        if (ArraysUtil.isEmpty(list)) {
            Log.d(j, "Abort , no lap data!!", new Object[0]);
            return map;
        }
        SparseArray sparseArray = new SparseArray();
        for (BleSportDetailHR.PerLap perLap : list) {
            if (sparseArray.get(perLap.lapType) == null) {
                sparseArray.put(perLap.lapType, new ArrayList());
            }
            ((List) sparseArray.get(perLap.lapType)).add(perLap);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sparseArray.size(); i++) {
            sb.append(q((List) sparseArray.valueAt(i)));
        }
        Log.d(j, "To cloud lap : " + sb.toString(), new Object[0]);
        map.put("lap", sb.toString());
        return map;
    }

    @Override // com.huami.watch.dataflow.sync.SportSync, com.huami.watch.dataflow.sync.BaseDataSync
    public String tag() {
        return j;
    }

    @Override // com.huami.watch.dataflow.sync.SportSync, com.huami.watch.dataflow.sync.a
    public boolean postToCloud(Context context, @NonNull SportData sportData) {
        boolean zPostToCloud = super.postToCloud(context, sportData);
        if (zPostToCloud) {
            try {
                SportSummary summaryItem = SportDataParser.toSummaryItem(((SingleSportData) sportData.items.get(0)).getSummary());
                if (summaryItem != null) {
                    Log.d(j, "Save Synced to Cloud Flag...", new Object[0]);
                    SportSummaryManager manager = SportSummaryManager.getManager();
                    SportSummary sportSummary = manager.get(summaryItem.getTrackid(), summaryItem.getSource(), summaryItem.getType());
                    sportSummary.setSynced(summaryItem.getSynced() | 3072);
                    manager.save(sportSummary);
                }
            } catch (Exception e) {
                Log.w(j, "SaveSyncedToCloudFlagErr", e, new Object[0]);
            }
        }
        return zPostToCloud;
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    public Long prepareRequestData() {
        SportSummary latestCloud = SportSummaryManager.getManager().getLatestCloud();
        long trackid = latestCloud != null ? latestCloud.getTrackid() * 1000 : 0L;
        if (trackid == 0) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(0L);
            calendar.set(2000, 0, 1, 0, 0, 0);
            trackid = calendar.getTimeInMillis();
        }
        return Long.valueOf(trackid);
    }

    @Override // com.huami.watch.dataflow.sync.BaseDataSync, com.huami.watch.dataflow.sync.a
    public SportData syncWatchData() {
        SportData sportData = null;
        if (this.e == null) {
            Log.w(j, "BleDevice is Null, Abort!!", new Object[0]);
            return null;
        }
        Long lPrepareRequestData = prepareRequestData();
        if (lPrepareRequestData == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(lPrepareRequestData.longValue());
        final DoLooper.Result result = new DoLooper.Result();
        Log.i(j, "Sync BleSportData Start... [" + TimeUtil.formatDateTime(lPrepareRequestData.longValue()) + "]", new Object[0]);
        this.e.startSyncSportData(calendar, new a(result));
        DoLooper.doLoop(new DoLooper.Function() { // from class: uy
            @Override // com.huami.watch.util.DoLooper.Function
            public final Object apply() {
                return BleSportSync.k(result);
            }
        }, 1000, 86400);
        Log.i(j, "Sync BleSportData [" + TimeUtil.formatDateTime(lPrepareRequestData.longValue()) + "]: " + result, new Object[0]);
        if (result.success) {
            sportData = new SportData();
            Object obj = result.data;
            if (obj != null) {
                List<BleSportData> list = (List) obj;
                Log.d(j, ArraysUtil.toString(list), new Object[0]);
                if (!ArraysUtil.isEmpty(list)) {
                    sportData.items = m(list);
                }
            }
        }
        return sportData;
    }
}
