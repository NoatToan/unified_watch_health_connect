package com.xiaomi.hm.health.device.callback;

import com.facebook.appevents.UserDataStore;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.account.HMLoginManager;
import com.huami.devicex.injection.data.HistoryRecordManagerApi;
import com.huami.devicex.injection.keeper.DeviceTimeStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.mifit.sportlib.core.Geohash;
import com.huami.mifit.sportlib.utils.NumberFormatter;
import com.huami.moving.datacenter.TrackRecordManager;
import com.huami.moving.utils.StrengthStatisticUtil;
import com.huami.moving.webapi.PostRunningDataToServer;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Counter;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.DownhillStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.FloorActivityStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.FrequencyStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfRtInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GolfStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MarathonInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PauseInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PowerStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RiddingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Row;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RowingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RowingStatisticInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPowerInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkiingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkipRope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkipRopeInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Slope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportAccumInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportStatisInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrokeSpeedInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SwimInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.sport800.SlopeChart;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.callback.gps.filter.GpsFilterHelper;
import com.xiaomi.hm.health.device.callback.gps.filter.GpxHelper;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMDeviceSyncGpsDataEvent;
import com.xiaomi.hm.health.device.model.MarathonModel;
import com.xiaomi.hm.health.device.model.PBModel;
import com.xiaomi.hm.health.device.webapi.device.HMDeviceWebAPI;
import de.greenrobot.event.EventBus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import okhttp3.internal.ws.WebSocketProtocol;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes20.dex */
public class MyGpsDataSyncCallback extends HMCallback<List<GpsRecord>> {
    private static final int g = 65535;
    private static final String h = "MyGpsDataSyncCallback";
    private static final int i = 10;
    private HMDeviceSource a;
    private final GpsFilterHelper b;
    private final Lazy<DeviceManagerApi> c;
    private final Lazy<DeviceTimeStoreApi> d;
    private final Lazy<HistoryRecordManagerApi> e;
    private PostRunningDataToServer.IHistoryRecordSyncCallBack f;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SportType.values().length];
            a = iArr;
            try {
                iArr[SportType.SPORT_TYPE_ODRUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SportType.SPORT_TYPE_IDRUN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SportType.SPORT_TYPE_RIDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportType.SPORT_TYPE_WALKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportType.SPORT_TYPE_EXERCISE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportType.SPORT_TYPE_POOL_SWIM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[SportType.SPORT_TYPE_OPEN_WATER_SWIM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[SportType.SPORT_TYPE_CLIMB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[SportType.SPORT_TYPE_CROSS_COUNTRY_RUN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[SportType.SPORT_TYPE_ELLIPTICAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[SportType.SPORT_TYPE_IDRIDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[SportType.SPORT_TYPE_ODTREKKING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[SportType.SPORT_TYPE_SKIING.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[SportType.SPORT_TYPE_NONE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[SportType.SPORT_TYPE_JUMP_ROPE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[SportType.SPORT_TYPE_ROWING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[SportType.SPORT_TYPE_YOGA.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MyGpsDataSyncCallback(HMDeviceSource hMDeviceSource) {
        this.a = HMDeviceSource.MILI_PEYTO;
        this.b = new GpsFilterHelper();
        this.c = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.d = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
        this.e = KoinJavaComponent.inject(HistoryRecordManagerApi.class);
        this.f = null;
        this.a = hMDeviceSource;
    }

    private int a(int i2) {
        return (i2 != 2 && i2 == 1) ? 1 : 2;
    }

    private String[] b(ArrayList<GpsPoint> arrayList, long j) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        StringBuilder sb5 = new StringBuilder();
        StringBuilder sb6 = new StringBuilder();
        GpsPoint gpsPoint = arrayList.get(0);
        long time = (gpsPoint.getTime() / 1000) - j;
        sb.append((long) (gpsPoint.getLatitude() * 1.0E8d));
        sb.append(",");
        sb.append((long) (gpsPoint.getLongitude() * 1.0E8d));
        sb2.append((int) (gpsPoint.getAltitude() * 100.0d));
        sb3.append(time);
        sb4.append(a(gpsPoint.getState()));
        float pace = gpsPoint.getPace() / 1000.0f;
        sb5.append(NumberFormatter.formatFloat2String(pace, 2, new int[0]));
        sb6.append(time);
        sb6.append(',');
        sb6.append(NumberFormatter.formatFloat2String(pace == 0.0f ? 0.0f : 1.0f / pace, 2, new int[0]));
        int i2 = 1;
        while (i2 < arrayList.size()) {
            GpsPoint gpsPoint2 = arrayList.get(i2 - 1);
            GpsPoint gpsPoint3 = arrayList.get(i2);
            int i3 = i2;
            long time2 = (gpsPoint3.getTime() / 1000) - (gpsPoint2.getTime() / 1000);
            sb.append(";");
            sb.append((long) ((gpsPoint3.getLatitude() - gpsPoint2.getLatitude()) * 1.0E8d));
            sb.append(",");
            sb.append((long) ((gpsPoint3.getLongitude() - gpsPoint2.getLongitude()) * 1.0E8d));
            sb2.append(";");
            sb2.append((int) (gpsPoint3.getAltitude() * 100.0d));
            sb3.append(";");
            sb3.append(time2);
            sb4.append(";");
            sb4.append(a(gpsPoint3.getState()));
            sb5.append(";");
            float pace2 = gpsPoint3.getPace() / 1000.0f;
            sb5.append(NumberFormatter.formatFloat2String(pace2, 2, new int[0]));
            sb6.append(";");
            sb6.append(time2);
            sb6.append(',');
            sb6.append(NumberFormatter.formatFloat2String(pace2 == 0.0f ? 0.0f : 1.0f / pace2, 2, new int[0]));
            i2 = i3 + 1;
        }
        return new String[]{sb.toString(), sb2.toString(), sb3.toString(), sb4.toString(), sb5.toString(), sb6.toString()};
    }

    private String c(ArrayList<HeartRateInfo> arrayList, long j) {
        GpsLogUtilKt.debug("heartRateInfos: " + Arrays.toString(arrayList.toArray()));
        StringBuilder sb = new StringBuilder();
        if (arrayList.size() == 0) {
            return sb.toString();
        }
        HeartRateInfo heartRateInfo = arrayList.get(0);
        sb.append((heartRateInfo.getTime() / 1000) - j);
        sb.append(",");
        sb.append(heartRateInfo.getHr());
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            HeartRateInfo heartRateInfo2 = arrayList.get(i2);
            HeartRateInfo heartRateInfo3 = arrayList.get(i2 - 1);
            long time = (heartRateInfo2.getTime() / 1000) - (heartRateInfo3.getTime() / 1000);
            sb.append(";");
            sb.append(time == 1 ? "" : Long.valueOf(time));
            sb.append(",");
            sb.append(heartRateInfo2.getHr() - heartRateInfo3.getHr());
        }
        return sb.toString();
    }

    private String[] d(ArrayList<RtPaceInfo> arrayList, long j) {
        if (arrayList == null || arrayList.size() == 0) {
            return new String[0];
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        RtPaceInfo rtPaceInfo = arrayList.get(0);
        long j2 = 1000;
        long time = (rtPaceInfo.getTime() / 1000) - j;
        sb.append(time);
        float f = 1000.0f;
        float pace = rtPaceInfo.getPace() / 1000.0f;
        sb2.append(NumberFormatter.formatFloat2String(pace, 2, new int[0]));
        sb3.append(time);
        sb3.append(',');
        sb3.append(NumberFormatter.formatFloat2String(pace == 0.0f ? 0.0f : 1.0f / pace, 2, new int[0]));
        int i2 = 1;
        while (i2 < arrayList.size()) {
            RtPaceInfo rtPaceInfo2 = arrayList.get(i2 - 1);
            RtPaceInfo rtPaceInfo3 = arrayList.get(i2);
            long time2 = (rtPaceInfo3.getTime() / j2) - (rtPaceInfo2.getTime() / j2);
            sb.append(";");
            sb.append(time2);
            sb2.append(";");
            float pace2 = rtPaceInfo3.getPace() / f;
            sb2.append(NumberFormatter.formatFloat2String(pace2, 2, new int[0]));
            sb3.append(";");
            sb3.append(time2);
            sb3.append(',');
            sb3.append(NumberFormatter.formatFloat2String(pace2 == 0.0f ? 0.0f : 1.0f / pace2, 2, new int[0]));
            i2++;
            j2 = 1000;
            f = 1000.0f;
        }
        return new String[]{sb.toString(), sb2.toString(), sb3.toString()};
    }

    private String e(ArrayList<PauseInfo> arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.size() == 0) {
            return sb.toString();
        }
        PauseInfo pauseInfo = arrayList.get(0);
        sb.append(pauseInfo.getTime() / 1000);
        sb.append(",");
        sb.append(pauseInfo.getOffset() / 1000);
        sb.append(",");
        sb.append(pauseInfo.getGpsPauseIndex());
        sb.append(",");
        sb.append(pauseInfo.getGpsResumeIndex());
        sb.append(",");
        sb.append(pauseInfo.getType());
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            PauseInfo pauseInfo2 = arrayList.get(i2);
            sb.append(";");
            sb.append(pauseInfo2.getTime() / 1000);
            sb.append(",");
            sb.append(pauseInfo2.getOffset() / 1000);
            sb.append(",");
            sb.append(pauseInfo2.getGpsPauseIndex());
            sb.append(",");
            sb.append(pauseInfo2.getGpsResumeIndex());
            sb.append(",");
            sb.append(pauseInfo2.getType());
        }
        return sb.toString();
    }

    private String f(ArrayList<Row> arrayList, long j) {
        StringBuilder sb = new StringBuilder();
        Row row = arrayList.get(0);
        long time = (row.getTime() / 1000) - j;
        String double2StringByLocale = NumberFormatter.formatDouble2StringByLocale((row.getStrokeFreq() * 1.0f) / 60.0f, 2, new int[0]);
        sb.append(time);
        sb.append(",");
        sb.append(double2StringByLocale);
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            Row row2 = arrayList.get(i2);
            long time2 = (row2.getTime() / 1000) - (arrayList.get(i2 - 1).getTime() / 1000);
            String double2StringByLocale2 = NumberFormatter.formatDouble2StringByLocale((row2.getStrokeFreq() * 1.0f) / 60.0f, 2, new int[0]);
            sb.append(";");
            sb.append(time2);
            sb.append(",");
            sb.append(double2StringByLocale2);
        }
        return sb.toString();
    }

    private String g(ArrayList<SkipRope> arrayList, long j) {
        StringBuilder sb = new StringBuilder();
        SkipRope skipRope = arrayList.get(0);
        sb.append((skipRope.getTime() / 1000) - j);
        sb.append(",");
        sb.append(skipRope.getSkipRopeFreq());
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            SkipRope skipRope2 = arrayList.get(i2);
            long time = (skipRope2.getTime() / 1000) - (arrayList.get(i2 - 1).getTime() / 1000);
            sb.append(";");
            sb.append(time);
            sb.append(",");
            sb.append(skipRope2.getSkipRopeFreq());
        }
        return sb.toString();
    }

    private String h(ArrayList<StrokeSpeedInfo> arrayList, long j) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.size() == 0) {
            return sb.toString();
        }
        StrokeSpeedInfo strokeSpeedInfo = arrayList.get(0);
        sb.append((strokeSpeedInfo.getTime() / 1000) - j);
        sb.append(",");
        sb.append(strokeSpeedInfo.getSpeed());
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            StrokeSpeedInfo strokeSpeedInfo2 = arrayList.get(i2);
            long time = (strokeSpeedInfo2.getTime() / 1000) - (arrayList.get(i2 - 1).getTime() / 1000);
            sb.append(";");
            sb.append(time);
            sb.append(",");
            sb.append(strokeSpeedInfo2.getSpeed());
        }
        return sb.toString();
    }

    private String i(ArrayList<RtPaceInfo> arrayList, long j) {
        if (arrayList.isEmpty() || arrayList.size() < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        RtPaceInfo rtPaceInfo = arrayList.get(0);
        long time = (rtPaceInfo.getTime() / 1000) - j;
        sb.append(time);
        sb.append(",");
        sb.append((int) ((time / 60.0f) * rtPaceInfo.getCadence()));
        sb.append(",");
        sb.append(rtPaceInfo.getStride());
        sb.append(",");
        sb.append(rtPaceInfo.getCadence() & 65535);
        sb.append(";");
        for (int i2 = 1; i2 < arrayList.size(); i2++) {
            RtPaceInfo rtPaceInfo2 = arrayList.get(i2);
            if (q(rtPaceInfo2.getStride(), rtPaceInfo2.getCadence())) {
                long time2 = (arrayList.get(i2).getTime() / 1000) - (rtPaceInfo.getTime() / 1000);
                float cadence = (int) ((time2 / 60.0f) * arrayList.get(i2).getCadence());
                sb.append(time2 + ",");
                sb.append(((int) cadence) + ",");
                sb.append(arrayList.get(i2).getStride() + ",");
                sb.append((arrayList.get(i2).getCadence() & 65535) + ";");
                rtPaceInfo = rtPaceInfo2;
            }
        }
        return sb.toString();
    }

    private String j(float f, int i2, List<KmPaceInfo> list) {
        StringBuilder sb = new StringBuilder();
        for (KmPaceInfo kmPaceInfo : list) {
            sb.append(kmPaceInfo.getIndex());
            sb.append(",");
            sb.append(kmPaceInfo.getDailyPerformance());
            sb.append(";");
        }
        sb.append(f / 1000.0f);
        sb.append(",");
        sb.append(i2);
        sb.append(";");
        return sb.toString();
    }

    private String k() {
        String strName = this.a.name();
        HMDeviceSource hMDeviceSource = this.a;
        if (hMDeviceSource == HMDeviceSource.MILI_PEYTO) {
            strName = DataTypeSource.CHAOHU;
        } else if (hMDeviceSource == HMDeviceSource.MILI_TEMPO) {
            strName = DataTypeSource.TEMPO;
        }
        return this.a.getType().getValue() + ":" + strName + ":" + this.a.getValue() + ":" + this.c.getValue().getHardwareVersion(this.a.getType());
    }

    private String l(List<MarathonInfo> list) {
        if (list != null && !list.isEmpty()) {
            try {
                JSONObject jSONObject = new JSONObject();
                for (MarathonInfo marathonInfo : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("dis", marathonInfo.getDistance() & WebSocketProtocol.s);
                    jSONObject2.put("time", marathonInfo.getTimeUsage());
                    if (marathonInfo.getType() == 1) {
                        jSONObject.put(MessengerShareContentUtility.WEBVIEW_RATIO_FULL, jSONObject2);
                    } else {
                        jSONObject.put("half", jSONObject2);
                    }
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private Trackdata m(Trackrecord trackrecord, SportDetail sportDetail, int i2) {
        Trackdata trackdata = new Trackdata();
        trackdata.setSource(trackrecord.getSource());
        trackdata.setType(trackrecord.getType());
        trackdata.setTrackid(trackrecord.getTrackid());
        trackdata.setSegment(1);
        trackdata.setV(trackrecord.getV());
        trackdata.setSize(trackrecord.getSize());
        String strC = c(sportDetail.getHeartRateInfos(), trackrecord.getTrackid().longValue());
        String strSpo2BulkString = BulkUtilsKt.spo2BulkString(sportDetail.getRtSpo2Infos(), trackrecord.getTrackid().longValue());
        String strPressureBulkString = BulkUtilsKt.pressureBulkString(sportDetail.getRtPressure(), trackrecord.getTrackid().longValue());
        String strTemperatureBulkString = BulkUtilsKt.temperatureBulkString(sportDetail.getRtTemperatures(), trackrecord.getTrackid().longValue());
        GpsLogUtilKt.debug("bulkHr:" + strC);
        trackdata.setBulkhr(strC);
        trackdata.setBulkspo2(strSpo2BulkString);
        trackdata.setBulkPressure(strPressureBulkString);
        trackdata.setBulkTemperature(strTemperatureBulkString);
        String strE = e(sportDetail.getPauseInfos());
        HMLog.d(h, "bulkPause:" + strE, new Object[0]);
        trackdata.setBulkpause(strE);
        ArrayList<Row> rowInfos = sportDetail.getRowInfos();
        if (rowInfos == null || rowInfos.isEmpty()) {
            String strH = h(sportDetail.getStrokeSpeedInfos(), trackrecord.getTrackid().longValue());
            HMLog.d(h, "bulkStrokeSpeed:" + strH, new Object[0]);
            trackdata.setStrokeSpeed(strH);
        } else {
            String strF = f(rowInfos, trackrecord.getTrackid().longValue());
            HMLog.d(h, "getBulkRow:" + strF, new Object[0]);
            trackdata.setStrokeSpeed(strF);
        }
        String strI = i(sportDetail.getRtPaceInfos(), trackrecord.getTrackid().longValue());
        trackdata.setLap(LapUtilsKt.toLapData(sportDetail));
        if (trackrecord.getType().intValue() == 52) {
            StrengthStatisticUtil.INSTANCE.formatLap2JsonString(trackdata.getLap());
        }
        if (sportDetail.getLapInfos().size() > 0) {
            trackrecord.setTotalGroup(sportDetail.getLapInfos().size());
        }
        ArrayList<GpsPoint> gpsPoints = sportDetail.getGpsPoints();
        GpsLogUtilKt.debug("gpsPoints: " + Arrays.toString(gpsPoints.toArray()));
        String[] strArrD = d(sportDetail.getRtPaceInfos(), trackrecord.getTrackid().longValue());
        if (gpsPoints.size() > 0) {
            String[] strArrB = b(gpsPoints, trackrecord.getTrackid().longValue());
            GpsLogUtilKt.debug("bulkll:" + strArrB[0]);
            GpsLogUtilKt.debug("bulkal:" + strArrB[1]);
            GpsLogUtilKt.debug("bulktime:" + strArrB[2]);
            GpsLogUtilKt.debug("bulkflag:" + strArrB[3]);
            GpsLogUtilKt.debug("bulkpace:" + strArrB[4]);
            GpsLogUtilKt.debug("bulkspeed:" + strArrB[5]);
            trackdata.setBulkll(strArrB[0]);
            trackdata.setBulkal(strArrB[1]);
            trackdata.setBulktime(strArrB[2]);
            trackdata.setBulkflag(strArrB[3]);
            trackdata.setBulkpace(strArrB[4]);
        } else if (strArrD.length > 0) {
            GpsLogUtilKt.debug("pace bulktime:" + strArrD[0]);
            GpsLogUtilKt.debug("pace bulkpace:" + strArrD[1]);
            GpsLogUtilKt.debug("pace bulkSpeed:" + strArrD[2]);
            trackdata.setBulktime(strArrD[0]);
            trackdata.setBulkpace(strArrD[1]);
        }
        if (strArrD.length > 0) {
            trackdata.setBulkspeed(strArrD[2]);
        }
        if (!sportDetail.getAltitudePoints().isEmpty()) {
            trackdata.setTimeDeltaAltitude(BulkUtilsKt.altitudeBulkString(sportDetail.getAltitudePoints(), trackrecord.getTrackid().longValue()));
            HMLog.i(h, "independent timeDeltaAltitude:" + trackdata.getTimeDeltaAltitude(), new Object[0]);
        }
        trackdata.setBulkgait(strI);
        try {
            JSONObject jSONObject = new JSONObject(trackrecord.getStatistics());
            JSONArray jSONArray = jSONObject.getJSONArray("KM");
            JSONArray jSONArray2 = jSONObject.getJSONArray("MILE");
            String strS = s(jSONArray);
            trackdata.setMilemarked(s(jSONArray2));
            trackdata.setKilomarked(strS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<SkipRope> skipRopeInfos = sportDetail.getSkipRopeInfos();
        if (skipRopeInfos != null && !skipRopeInfos.isEmpty()) {
            trackdata.setBulkRopeSkippingFreq(g(skipRopeInfos, trackrecord.getTrackid().longValue()));
        }
        List<GolfRtInfo> golfRtNodes = sportDetail.getGolfRtNodes();
        if (golfRtNodes != null && !golfRtNodes.isEmpty()) {
            trackdata.setGolfSwingRtData(BulkUtilsKt.toGolfBulk(golfRtNodes, trackrecord.getTrackid().longValue()));
        }
        List<RtPowerInfo> rtPowerNodes = sportDetail.getRtPowerNodes();
        if (rtPowerNodes != null && !rtPowerNodes.isEmpty()) {
            trackdata.setPowerMeter(BulkUtilsKt.powerRtBulk(rtPowerNodes, trackrecord.getTrackid().longValue()));
        }
        return trackdata;
    }

    private Trackrecord n(SportSummary sportSummary, SportDetail sportDetail) {
        int size;
        int sportTypeValue;
        String strX;
        Trackrecord trackrecord = new Trackrecord();
        trackrecord.setTrackid(Long.valueOf(sportSummary.getStartTime() / 1000));
        trackrecord.setSource(Integer.valueOf(DataSourceUtilsKt.getRecordSource(this.a)));
        SportAccumInfo accInfo = sportSummary.getAccInfo();
        if (accInfo == null) {
            HMLog.i(h, "SportAccumInfo is null!!!", new Object[0]);
            return null;
        }
        trackrecord.setCal(Integer.valueOf((int) accInfo.getSportCalories()));
        trackrecord.setDistance(Integer.valueOf((int) accInfo.getDistance()));
        trackrecord.setCosttime(Integer.valueOf((int) accInfo.getActiveTime()));
        trackrecord.setFfpercent(-1);
        trackrecord.setTotalStep(Integer.valueOf((int) accInfo.getStep()));
        trackrecord.setMaxrtp(Float.valueOf(accInfo.getMaxPace()));
        trackrecord.setMinrtp(Float.valueOf(accInfo.getMinPace()));
        trackrecord.setTargetType(sportSummary.getTargetType());
        trackrecord.setTargetValue(sportSummary.getTargetValue());
        trackrecord.setMaxAltitude((int) accInfo.getMaxAltitude());
        trackrecord.setMinAltitude((int) accInfo.getMinAltitude());
        trackrecord.setAvgAltitude(Float.valueOf(accInfo.getAvgAltitude()));
        int[] swingCnt = sportSummary.getSwingCnt();
        if (swingCnt != null && swingCnt.length > 0) {
            trackrecord.setTouchStrokes(swingCnt[0]);
            if (swingCnt.length >= 4) {
                trackrecord.setTennisForeHand(swingCnt[1]);
                trackrecord.setTennisBackHand(swingCnt[2]);
                trackrecord.setTennisServe(swingCnt[3]);
            }
        }
        SportStatisInfo statisInfo = sportSummary.getStatisInfo();
        if (statisInfo != null) {
            trackrecord.setAvgStrideLength(Integer.valueOf(statisInfo.getAveStride()));
            trackrecord.setPace(Float.valueOf(statisInfo.getAvePace() / 1000.0f));
        } else {
            trackrecord.setAvgStrideLength(Integer.valueOf((int) sportSummary.getAccInfo().getAvgStride()));
            trackrecord.setPace(Float.valueOf(sportSummary.getAccInfo().getAvgPace()));
        }
        if (Math.abs(accInfo.getAvgCadence()) < 1.0E-6d) {
            trackrecord.setSfreq(Integer.valueOf(Math.round((accInfo.getStep() * 60.0f) / accInfo.getActiveTime())));
        } else {
            trackrecord.setSfreq(Integer.valueOf(Math.round(accInfo.getAvgCadence() * 60.0f)));
        }
        if (sportSummary.getHeartRateStatistics() != null) {
            trackrecord.setAvghr(Integer.valueOf(sportSummary.getHeartRateStatistics().getAvg()));
            trackrecord.setMaxHR(Integer.valueOf(sportSummary.getHeartRateStatistics().getMax()));
            trackrecord.setMinHR(Integer.valueOf(sportSummary.getHeartRateStatistics().getMin()));
        } else if (statisInfo != null) {
            trackrecord.setAvghr(Integer.valueOf(statisInfo.getAveHr()));
            trackrecord.setMaxHR(Integer.valueOf(statisInfo.getMaxHr()));
            trackrecord.setMinHR(Integer.valueOf(sportSummary.getMinHr()));
        }
        trackrecord.setTeValue(Integer.valueOf(sportSummary.getTe()));
        trackrecord.setTeAnaerobicValue(Integer.valueOf(sportSummary.getAnaerobicTE()));
        trackrecord.setTotalGroup(sportSummary.getTotalGroup());
        trackrecord.setSwimPoolLength(Integer.valueOf(sportSummary.getSwimPoolLength()));
        trackrecord.setUnit(Integer.valueOf(sportSummary.getDistanceUnit()));
        if (sportSummary.getParentStartTime() > 0) {
            trackrecord.setParentTrackId(Long.valueOf(sportSummary.getParentStartTime() / 1000));
        }
        if (sportSummary.getRopeSkipRestTime() > 0) {
            trackrecord.setRopeSkippingRestTime(sportSummary.getRopeSkipRestTime());
        } else {
            trackrecord.setRopeSkippingRestTime(sportSummary.getAccInfo().getRestTimeBetweenGroups());
        }
        trackrecord.setStatistics(r(sportDetail.getKmPaceInfos(), sportDetail.getMilePaceInfos()));
        if (sportSummary.getSpo2Statistic() != null) {
            trackrecord.setSpo2Max(sportSummary.getSpo2Statistic().getMax());
            trackrecord.setSpo2Min(sportSummary.getSpo2Statistic().getMin());
        }
        ArrayList<GpsPoint> gpsPoints = sportDetail.getGpsPoints();
        if (gpsPoints == null || gpsPoints.size() <= 0) {
            size = 0;
        } else {
            GpsPoint gpsPoint = gpsPoints.get(0);
            if (gpsPoint != null) {
                trackrecord.setLocation(Geohash.encode(gpsPoint.getLatitude(), gpsPoint.getLongitude()));
            }
            size = gpsPoints.size();
        }
        trackrecord.setAltitudeAscend(Integer.valueOf((int) accInfo.getAscendMeter()));
        trackrecord.setAltitudeDescend(Integer.valueOf((int) accInfo.getDescendMeter()));
        SportType type = sportSummary.getType();
        switch (a.a[type.ordinal()]) {
            case 1:
                sportTypeValue = 1;
                break;
            case 2:
                sportTypeValue = !ConfigHelperKt.hasFeature(HMDeviceSource.fromValue(trackrecord.getSource().intValue() - 100), Feature.BOLT_SERIES) ? 8 : 25;
                break;
            case 3:
                sportTypeValue = 9;
                break;
            case 4:
                sportTypeValue = 6;
                break;
            case 5:
                sportTypeValue = 16;
                break;
            case 6:
            case 7:
                sportTypeValue = type == SportType.SPORT_TYPE_POOL_SWIM ? 14 : 15;
                SwimInfo swimInfo = sportSummary.getSwimInfo();
                HMLog.i(h, "SwimInfo:" + swimInfo, new Object[0]);
                if (swimInfo != null) {
                    trackrecord.setSwimAvgStrokeSpeed(Float.valueOf(swimInfo.getAvgStrokeSpeed()));
                    trackrecord.setSwimMaxStrokeSpeed(Float.valueOf(swimInfo.getMaxStrokeSpeed()));
                    trackrecord.setSwimDistancePerStroke(Float.valueOf(swimInfo.getDistancePerStroke()));
                    trackrecord.setSwimStrokes(Integer.valueOf(swimInfo.getStrokes()));
                    trackrecord.setSwimStyle(Integer.valueOf(swimInfo.getStkStyle()));
                    trackrecord.setSwimSWOLF(Integer.valueOf(swimInfo.getAvgSwolf()));
                    trackrecord.setSwimTurns(Integer.valueOf(swimInfo.getTrips()));
                }
                break;
            case 8:
                sportTypeValue = 13;
                break;
            case 9:
                sportTypeValue = 7;
                break;
            case 10:
                sportTypeValue = 12;
                break;
            case 11:
                sportTypeValue = 10;
                break;
            case 12:
                sportTypeValue = 22;
                break;
            case 13:
                SkiingInfo skiingInfo = sportSummary.getSkiingInfo();
                if (skiingInfo != null) {
                    trackrecord.setAltitudeDescend(Integer.valueOf((int) skiingInfo.getTotalTripsAcmDescendMeter()));
                    float avgSpeed = skiingInfo.getAvgSpeed();
                    if (avgSpeed != 0.0f) {
                        trackrecord.setPace(Float.valueOf(1.0f / avgSpeed));
                    } else {
                        HMLog.i(h, "Invalid skiing speed:" + avgSpeed, new Object[0]);
                        trackrecord.setPace(Float.valueOf(0.0f));
                    }
                }
                sportTypeValue = 11;
                break;
            case 14:
                sportTypeValue = sportSummary.getSportTypeValue();
                break;
            case 15:
                sportTypeValue = 21;
                t(trackrecord, sportSummary);
                break;
            case 16:
                sportTypeValue = 23;
                break;
            case 17:
                sportTypeValue = 60;
                break;
            default:
                sportTypeValue = type.getValue();
                break;
        }
        if (sportTypeValue == 19) {
            sportTypeValue = 2001;
        }
        if (sportTypeValue == 20) {
            sportTypeValue = 2002;
        }
        if (sportTypeValue == 66 || sportTypeValue == 23) {
            u(trackrecord, sportSummary);
        }
        if (sportSummary.getParentStartTime() > 0) {
            sportTypeValue += 1000;
        }
        trackrecord.setType(Integer.valueOf(sportTypeValue));
        trackrecord.setSportMode(sportSummary.getSportMode());
        trackrecord.setAutoRecognition(Boolean.valueOf(sportSummary.isAutoRecognitionSport()));
        if (sportSummary.getSecHalfStartTime() > 0) {
            trackrecord.setHalfStartTime(sportSummary.getSecHalfStartTime());
        } else {
            trackrecord.setHalfStartTime(sportDetail.getSecondHalfStartTime());
        }
        RiddingInfo riddingInfo = sportSummary.getRiddingInfo();
        SlopeChart slopeChart = sportSummary.getSlopeChart();
        GpsLogUtilKt.debug("riddingInfo: " + riddingInfo);
        if (riddingInfo != null) {
            trackrecord.setClimbDisascend(Integer.valueOf((int) riddingInfo.getDistance3DAscend()));
            trackrecord.setClimbDisAscendTime(Integer.valueOf((int) (riddingInfo.getTimeAscend() / 1000)));
            trackrecord.setClimbDisDescend(Integer.valueOf((int) riddingInfo.getDistance3DDescend()));
            trackrecord.setClimbDisDescendTime(Integer.valueOf((int) (riddingInfo.getTimeDescend() / 1000)));
        } else if (slopeChart != null) {
            trackrecord.setClimbDisAscendTime(Integer.valueOf(slopeChart.getUphillTime() != null ? slopeChart.getUphillTime().intValue() : 0));
            trackrecord.setClimbDisDescend(Integer.valueOf(slopeChart.getDownhillDistance() != null ? slopeChart.getDownhillDistance().intValue() : 0));
            trackrecord.setClimbDisDescendTime(Integer.valueOf(slopeChart.getDownhillTime() != null ? slopeChart.getDownhillTime().intValue() : 0));
        } else {
            HMLog.i(h, "no ridding info!!!", new Object[0]);
        }
        Slope slope = sportSummary.getSlope();
        if (slope != null) {
            trackrecord.setAvgSlope(slope.getAvg());
            trackrecord.setMaxSlope(slope.getMax());
        }
        if (sportSummary.getVersion() >= 32768 && sportSummary.getAccInfo().getClimbDistance() > 0.0f) {
            trackrecord.setClimbDisascend(Integer.valueOf((int) sportSummary.getAccInfo().getClimbDistance()));
        }
        trackrecord.setEndtime(Long.valueOf(sportSummary.getEndTime() / 1000));
        trackrecord.setDate(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(sportSummary.getStartTime())));
        if (sportSummary.getVersion() >= 32768) {
            trackrecord.setV(16);
        } else {
            trackrecord.setV(12);
        }
        trackrecord.setDevice(k());
        trackrecord.setSize(Integer.valueOf(size));
        FloorActivityStatistic floorActivityStatistic = sportSummary.getFloorActivityStatistic();
        if (floorActivityStatistic != null) {
            trackrecord.setFloorNumber(floorActivityStatistic.getUpstair());
            trackrecord.setUpstairsHeight(Float.valueOf(floorActivityStatistic.getUpHeight()));
            trackrecord.setMinUpstairsFloors(Float.valueOf(floorActivityStatistic.getAverageFloorsPerMinutes()));
            trackrecord.setDownstairsFloors(Integer.valueOf(floorActivityStatistic.getDownstair()));
            trackrecord.setDownstairsHeight(Float.valueOf(floorActivityStatistic.getDownHeight()));
        }
        if (trackrecord.getType().intValue() != 25) {
            SyncedState syncedState = SyncedState.STATE_UNSYNCED;
            trackrecord.setState(Integer.valueOf(syncedState.getValue()));
            trackrecord.setSynced(Integer.valueOf(syncedState.getValue()));
        } else if (sportSummary.getUserId() > 0) {
            SyncedState syncedState2 = SyncedState.STATE_UNSYNCED;
            trackrecord.setState(Integer.valueOf(syncedState2.getValue()));
            trackrecord.setSynced(Integer.valueOf(syncedState2.getValue()));
        } else {
            SyncedState syncedState3 = SyncedState.STATE_UNKNOW;
            trackrecord.setState(Integer.valueOf(syncedState3.getValue()));
            trackrecord.setSynced(Integer.valueOf(syncedState3.getValue()));
        }
        String strL = l(sportDetail.getMarathonInfo());
        if (strL != null) {
            trackrecord.setMarathon(strL);
        } else {
            String strL2 = l(MarathonModel.checkMarathonInfo(sportTypeValue, sportDetail));
            if (strL2 != null) {
                trackrecord.setMarathon(strL2);
            }
        }
        if (sportDetail.getLapInfos().size() > 0) {
            trackrecord.setTotalGroup(sportDetail.getLapInfos().size());
        }
        DownhillStatistic downhillStatistic = sportSummary.getDownhillStatistic();
        if (downhillStatistic != null) {
            trackrecord.setAccumulatedGap(downhillStatistic.getTotalDrop());
            trackrecord.setDownhillNumber(downhillStatistic.getTimes());
            trackrecord.setMaxDownhillFallMileage(downhillStatistic.getMaxDrop());
            trackrecord.setClimbDisDescend(Integer.valueOf(downhillStatistic.getTotalDistance()));
        }
        SkiingInfo skiingInfo2 = sportSummary.getSkiingInfo();
        if (skiingInfo2 != null) {
            trackrecord.setDownhillNumber(skiingInfo2.getTrips());
            trackrecord.setAccumulatedGap((int) skiingInfo2.getTotalTripsAcmDescendMeter());
            trackrecord.setClimbDisDescend(Integer.valueOf((int) skiingInfo2.getTotalTripsAcmDistance()));
            trackrecord.setAltitudeDescend(Integer.valueOf((int) skiingInfo2.getTotalTripsAcmDescendMeter()));
            float avgSpeed2 = skiingInfo2.getAvgSpeed();
            if (avgSpeed2 != 0.0f) {
                trackrecord.setPace(Float.valueOf(1.0f / avgSpeed2));
            } else {
                HMLog.i(h, "Invalid skiing speed:" + avgSpeed2, new Object[0]);
                trackrecord.setPace(Float.valueOf(0.0f));
            }
        }
        if (sportSummary.getHrZoneWrapperApi() != null) {
            trackrecord.setHrZone(sportSummary.getHrZoneWrapperApi().getHrZoneValue());
            trackrecord.setHrSettingType(Integer.valueOf(sportSummary.getHrZoneWrapperApi().getType()));
        }
        trackrecord.setPauseTime(Integer.valueOf((int) sportSummary.getAccInfo().getPauseTime()));
        HMDeviceSource hMDeviceSource = this.a;
        if (hMDeviceSource != HMDeviceSource.WATCH_EVEREST && hMDeviceSource != HMDeviceSource.WATCH_EVEREST_2S && hMDeviceSource != HMDeviceSource.SMART_WATCH_EVEREST_2 && hMDeviceSource != HMDeviceSource.SMART_WATCH_EVEREST_2S && hMDeviceSource != HMDeviceSource.SMART_WATCH_EVEREST_2W && hMDeviceSource != HMDeviceSource.SMART_WATCH_EVEREST_2SW && hMDeviceSource != HMDeviceSource.SMART_WATCH_EVEREST_2_STAR_WAR && (strX = x(sportTypeValue, sportDetail)) != null) {
            trackrecord.setPersonalBest(strX);
        }
        if (sportSummary.getPressure() != null) {
            trackrecord.setMaximumPressure(sportSummary.getPressure().getMax());
            trackrecord.setAveragePressure(sportSummary.getPressure().getAvg());
            trackrecord.setMinPressure(Integer.valueOf(sportSummary.getPressure().getMin()));
        }
        if (sportSummary.getTemperatureStatistic() != null) {
            trackrecord.setLowestTemperature(Float.valueOf(sportSummary.getTemperatureStatistic().getMin()));
            trackrecord.setAverageTemperature(Float.valueOf(sportSummary.getTemperatureStatistic().getAvg()));
            trackrecord.setHighestTemperature(Float.valueOf(sportSummary.getTemperatureStatistic().getMax()));
        }
        if (sportSummary.getTrainLoad() >= 0) {
            trackrecord.setThisExerciseLoad(Integer.valueOf(sportSummary.getTrainLoad()));
        }
        if (sportSummary.getVo2Max() >= 0) {
            trackrecord.setMaxVO2(Integer.valueOf(sportSummary.getVo2Max()));
        }
        GolfStatistic golfStatistic = sportSummary.getGolfStatistic();
        if (golfStatistic != null) {
            trackrecord.setTotalSwing(golfStatistic.getTotalSwing());
            trackrecord.setAverageBeat(golfStatistic.getAverageBeat());
            trackrecord.setAverageUpTime(golfStatistic.getAverageUpTime());
            trackrecord.setAverageDownTime(golfStatistic.getAverageDownTime());
            trackrecord.setAverageAngle(golfStatistic.getAverageAngle());
            trackrecord.setAverageScore(golfStatistic.getAverageScore());
        }
        PowerStatistic powerStatistic = sportSummary.getPowerStatistic();
        if (powerStatistic != null) {
            trackrecord.setMaxPower(powerStatistic.getMax());
            trackrecord.setAveragePower(powerStatistic.getAvg());
            trackrecord.setWorkValue(powerStatistic.getPower());
        }
        if (sportSummary.getCourseTitle() != null) {
            trackrecord.setCourseTitle(sportSummary.getCourseTitle());
        }
        return trackrecord;
    }

    private void o(List<GpsRecord> list) {
        p(list);
    }

    private void p(List<GpsRecord> list) {
        if (list == null || list.size() == 0) {
            HMLog.i(h, "no gps record!!!", new Object[0]);
            return;
        }
        long endTime = 0;
        long timezone = 32;
        Map<Long, List<ChildSportIndex>> mapAssembleChildList = MixSportUtilsKt.assembleChildList(this.a, list);
        ArrayList arrayList = new ArrayList();
        Iterator<GpsRecord> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            GpsRecord next = it2.next();
            SportSummary summary = next.getSummary();
            SportDetail detail = next.getDetail();
            GpxHelper gpxHelper = GpxHelper.INSTANCE;
            String gPXFilePath = gpxHelper.getGPXFilePath("normal");
            if (gPXFilePath != null) {
                gpxHelper.createGPXFile(detail.getGpsPoints(), gPXFilePath);
            }
            Trackrecord trackrecordN = n(summary, detail);
            if (trackrecordN != null) {
                TrackRecordManager.getInstance().insertRecordIfNotExist(trackrecordN);
                arrayList.add(trackrecordN);
                String strGenerateChildListData = mapAssembleChildList.containsKey(trackrecordN.getTrackid()) ? MixSportUtilsKt.generateChildListData(mapAssembleChildList.get(trackrecordN.getTrackid())) : null;
                if (strGenerateChildListData != null) {
                    trackrecordN.setChildListData(strGenerateChildListData);
                }
                int version = summary.getVersion();
                HMLog.i(h, "version:" + version, new Object[0]);
                Trackdata trackdataM = m(trackrecordN, detail, version);
                if (trackdataM != null) {
                    if (HMDeviceConfig.hasFeatureDeviceSport(this.a)) {
                        if (HMLoginManager.isMainlandUser()) {
                            trackdataM.setProvider(2);
                        } else {
                            trackdataM.setProvider(1);
                        }
                    }
                    TrackRecordManager.getInstance().insertDetailIfNotExist(trackdataM);
                }
                if (summary.getEndTime() > endTime) {
                    endTime = summary.getEndTime();
                    timezone = summary.getTimezone();
                }
            } else {
                HMLog.i(h, "Trackrecord is null!!!", new Object[0]);
            }
        }
        if (arrayList.isEmpty()) {
            this.f.notifySyncEnd(null);
        } else {
            this.e.getValue().updateTrackRecordsToStatData(arrayList);
            PostRunningDataToServer.postRunningData(this.f);
        }
        Calendar calendar = Calendar.getInstance(ProfileUtils.getTimezone((byte) timezone));
        calendar.setTimeInMillis(endTime);
        if (endTime > System.currentTimeMillis()) {
            HMLog.i(h, "ERROR:运动记录结束时间为未来时间,这种情况极少发生,很有可能发生在调试阶段,这里做一个规避,线上版本如果见到此日志请联系固件解决时间穿越到未来到问题", new Object[0]);
            calendar.setTimeInMillis(System.currentTimeMillis());
        }
        if (ConfigHelperKt.hasFeature(this.a, Feature.BOLT_SERIES)) {
            this.d.getValue().setGpsSyncTime(HMDeviceType.TREADMILL, calendar);
        } else if (this.a == HMDeviceSource.OTHER_HAYDN) {
            HMDeviceManager.getInstance().setGpsSyncTime(HMDeviceType.HEADSET, calendar);
        } else {
            this.d.getValue().setGpsSyncTime(HMDeviceType.MILI, calendar);
        }
        HMDeviceWebAPI.updateGpsSyncTimeToServer(calendar);
    }

    private static boolean q(int i2, int i3) {
        return (i2 == 65535 || i3 == 65535) ? false : true;
    }

    private String r(ArrayList<KmPaceInfo> arrayList, ArrayList<MilePaceInfo> arrayList2) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        try {
            int pace = 0;
            for (KmPaceInfo kmPaceInfo : arrayList) {
                pace += kmPaceInfo.getPace();
                jSONArray.put(toJson(kmPaceInfo, pace));
            }
            jSONObject.put("KM", jSONArray);
            int pace2 = 0;
            for (MilePaceInfo milePaceInfo : arrayList2) {
                pace2 += milePaceInfo.getPace();
                jSONArray2.put(toJson(milePaceInfo, pace2));
            }
            jSONObject.put("MILE", jSONArray2);
        } catch (Exception e) {
            HMLog.i(h, "Exception:" + e.getMessage(), new Object[0]);
        }
        return jSONObject.toString();
    }

    private static String s(JSONArray jSONArray) throws JSONException {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            int i3 = jSONObject.getInt("dis");
            int i4 = jSONObject.getInt(UserDataStore.CITY);
            int i5 = jSONObject.getInt("gpsIndex");
            String string = jSONObject.getString("geoHash");
            int i6 = jSONObject.getInt("aveHr");
            int i7 = jSONObject.getInt("trackInterpolation");
            if (i2 != 0) {
                sb.append(";");
            }
            sb.append(i3 - 1);
            sb.append(",");
            sb.append(i4);
            sb.append(",");
            sb.append(string);
            sb.append(",");
            sb.append(i5);
            sb.append(",");
            sb.append(i6);
            sb.append(",");
            sb.append(i7);
        }
        return sb.toString();
    }

    private void t(Trackrecord trackrecord, SportSummary sportSummary) {
        SkipRopeInfo skipRopeInfo = sportSummary.getSkipRopeInfo();
        if (skipRopeInfo != null) {
            trackrecord.setTouchStrokes((int) skipRopeInfo.getCount());
            trackrecord.setRopeSkippingCount((int) skipRopeInfo.getCount());
            trackrecord.setTotalGroup((int) skipRopeInfo.getGroupCount());
            trackrecord.setRopeSkippingAvgFrequency((int) (skipRopeInfo.getAvgSpeed() * 60.0f));
            trackrecord.setRopeSkippingMaxFrequency((int) (skipRopeInfo.getMaxSpeed() * 60.0f));
        }
        Counter counter = sportSummary.getCounter();
        if (counter != null) {
            trackrecord.setTouchStrokes(counter.getTotalNumber());
            trackrecord.setNumberOfBreak(counter.getNumberOfBreak());
            trackrecord.setRopeSkippingCount(counter.getTotalNumber());
            trackrecord.setTotalGroup(sportSummary.getTotalGroup());
        }
        FrequencyStatistic frequencyStatistic = sportSummary.getFrequencyStatistic();
        if (frequencyStatistic != null) {
            trackrecord.setRopeSkippingAvgFrequency(frequencyStatistic.getAvg());
            trackrecord.setRopeSkippingMaxFrequency(frequencyStatistic.getMax());
        }
        w(trackrecord);
    }

    private void u(Trackrecord trackrecord, SportSummary sportSummary) {
        RowingInfo rowingInfo = sportSummary.getRowingInfo();
        if (rowingInfo != null) {
            trackrecord.setTouchStrokes((int) rowingInfo.getCount());
            trackrecord.setRopeSkippingCount((int) rowingInfo.getCount());
            trackrecord.setTotalGroup((int) rowingInfo.getCurGroupNum());
            trackrecord.setSfreq(Integer.valueOf((int) (rowingInfo.getAvgCadence() * 60.0f)));
            trackrecord.setAvgPulloarTime(Float.valueOf(rowingInfo.getAvgPaddleTime()));
            trackrecord.setAvgReturnTime(Float.valueOf(rowingInfo.getAvgReturnPaddleTime()));
        }
        Counter counter = sportSummary.getCounter();
        if (counter != null) {
            trackrecord.setTouchStrokes(counter.getTotalTimes());
            trackrecord.setRopeSkippingCount(counter.getTotalTimes());
            trackrecord.setTotalGroup(sportSummary.getTotalGroup());
        }
        RowingStatisticInfo rowingStatisticInfo = sportSummary.getRowingStatisticInfo();
        if (rowingStatisticInfo != null) {
            trackrecord.setSfreq(Integer.valueOf(rowingStatisticInfo.getAvgFreq()));
            trackrecord.setMaxSFreq(rowingStatisticInfo.getMaxFreq());
            trackrecord.setAvgPulloarTime(Float.valueOf(rowingStatisticInfo.getAvgPullingTime()));
            trackrecord.setAvgReturnTime(Float.valueOf(rowingStatisticInfo.getAvgPaddleTime()));
        }
        v(trackrecord);
    }

    private void v(Trackrecord trackrecord) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rope_skipping_count", trackrecord.getRopeSkippingCount());
            jSONObject.put("total_group", trackrecord.getTotalGroup());
            jSONObject.put("avg_frequency", trackrecord.getSfreq());
        } catch (Exception e) {
            HMLog.i(h, "saveSkipRopeInfoJson exception:" + e.getMessage(), new Object[0]);
        }
        trackrecord.setOriginalJsonData(jSONObject.toString());
    }

    private void w(Trackrecord trackrecord) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rope_skipping_count", trackrecord.getRopeSkippingCount());
            jSONObject.put("rope_skipping_avg_frequency", trackrecord.getRopeSkippingAvgFrequency());
            jSONObject.put("rope_skipping_max_frequency", trackrecord.getRopeSkippingMaxFrequency());
            jSONObject.put("total_group", trackrecord.getTotalGroup());
        } catch (Exception e) {
            HMLog.i(h, "saveSkipRopeInfoJson exception:" + e.getMessage(), new Object[0]);
        }
        trackrecord.setOriginalJsonData(jSONObject.toString());
    }

    private static String x(int i2, SportDetail sportDetail) {
        PBModel pBModelCheckPBInfo = PBModel.checkPBInfo(i2, sportDetail);
        if (pBModelCheckPBInfo != null) {
            return pBModelCheckPBInfo.toJSON();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(boolean z) {
        super.onFinish(z);
        HMDeviceType type = this.a.getType();
        HMDeviceType hMDeviceType = HMDeviceType.TREADMILL;
        if (type == hMDeviceType && z) {
            this.d.getValue().setBoundDeviceSyncTime(hMDeviceType, Calendar.getInstance());
        }
        HMDeviceSyncGpsDataEvent hMDeviceSyncGpsDataEvent = new HMDeviceSyncGpsDataEvent(this.a.getType(), z);
        HMLog.i(h, "sync gps data finish event: " + hMDeviceSyncGpsDataEvent + "source: " + this.a, new Object[0]);
        hMDeviceSyncGpsDataEvent.setProgress(new Progress(100, 100));
        EventBus.getDefault().post(hMDeviceSyncGpsDataEvent);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onProgress(Progress progress) {
        super.onProgress(progress);
        EventBus.getDefault().post(new HMDeviceSyncGpsDataEvent(this.a.getType(), progress));
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onStart() {
        super.onStart();
        HMLog.i(h, "sync start, " + this.a, new Object[0]);
        EventBus.getDefault().post(new HMDeviceSyncGpsDataEvent(this.a.getType()));
    }

    public JSONObject toJson(PaceInfo paceInfo, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dis", paceInfo.getIndex());
            jSONObject.put("pace", paceInfo.getPace());
            jSONObject.put(UserDataStore.CITY, paceInfo.getPace());
            jSONObject.put("gpsIndex", paceInfo.getGpsIndex());
            GpsPoint gpsPoint = paceInfo.getGpsPoint();
            jSONObject.put("geoHash", gpsPoint == null ? "" : Geohash.encode(gpsPoint.getLatitude(), gpsPoint.getLongitude()));
            jSONObject.put("aveHr", -1);
            jSONObject.put("trackInterpolation", i2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onData(List<GpsRecord> list) {
        super.onData(list);
        HMLog.i(h, "onData: size: " + list.size(), new Object[0]);
        if (ConfigHelperKt.hasFeature(this.a, Feature.BOLT_SERIES)) {
            o(list);
        } else {
            p(this.b.filter(list));
        }
    }

    public MyGpsDataSyncCallback(HMDeviceSource hMDeviceSource, PostRunningDataToServer.IHistoryRecordSyncCallBack iHistoryRecordSyncCallBack) {
        this.a = HMDeviceSource.MILI_PEYTO;
        this.b = new GpsFilterHelper();
        this.c = KoinJavaComponent.inject(DeviceManagerApi.class);
        this.d = KoinJavaComponent.inject(DeviceTimeStoreApi.class);
        this.e = KoinJavaComponent.inject(HistoryRecordManagerApi.class);
        this.f = null;
        this.a = hMDeviceSource;
        this.f = iHistoryRecordSyncCallBack;
    }
}
