package com.xiaomi.hm.health.bt.sdk.sport;

import android.text.TextUtils;
import android.util.SparseArray;
import com.mi.health.course.activity.CourseCatalogActivityKt;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Counter;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.DownhillStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.FloorActivityStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.FrequencyStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsPoint;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.HeartRateStatistics;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.KmPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.MilePaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.PauseInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RiddingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Row;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RowingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.RtPaceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkiingInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkipRope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SkipRopeInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Slope;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.Spo2Statistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportAccumInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportDetail;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportPressureStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportStatisInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportType;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.StrokeSpeedInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SwimInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.TemperatureStatistic;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.hrzone.HrZoneWrapperApi;
import com.xiaomi.hm.health.bt.sdk.DeviceInfoExt;
import com.xiaomi.hm.health.bt.sdk.data.PaiData;
import com.xiaomi.hm.health.dataprocess.StepsInfo;
import com.xiaomi.onetrack.OneTrack;
import defpackage.aht;
import defpackage.ek;
import defpackage.qd;
import defpackage.t5t;
import defpackage.x2;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class SportHelper {
    private static final int BULK_AL = 1;
    private static final int BULK_FLAG = 3;
    private static final int BULK_LL = 0;
    private static final int BULK_PACE = 4;
    private static final int BULK_SPEED = 5;
    private static final int BULK_TIME = 2;
    private static final int DEFAULT_VALUE = -1;
    private static final int INVALID_CADENCE_STRIDE = 65535;
    private static final int PROVIDER_VALUE_GAODE = 2;
    private static final int RUN_SOURCE_BASE_OFFSET = 100;
    private static final int STATE_MARKED_ACTIVE = 1;
    private static final int STATE_MARKED_INACTIVE = 2;
    private static final String TAG = "SportHelper";

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13579a;

        static {
            int[] iArr = new int[SportType.values().length];
            f13579a = iArr;
            try {
                iArr[SportType.SPORT_TYPE_ODRUN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_IDRUN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_RIDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_WALKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_EXERCISE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_POOL_SWIM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_OPEN_WATER_SWIM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_CLIMB.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_CROSS_COUNTRY_RUN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_ELLIPTICAL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_IDRIDING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_SKIING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_JUMP_ROPE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_ROWING.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_YOGA.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f13579a[SportType.SPORT_TYPE_NONE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    private static int convertGpsState(int i) {
        return (i != 2 && i == 1) ? 1 : 2;
    }

    private static float format(float f, int i, int... iArr) {
        return new BigDecimal(String.valueOf(f)).setScale(i, getRoundMode(iArr)).floatValue();
    }

    private static String formatFloat2String(float f, int i, int... iArr) {
        float f2 = (iArr == null || iArr.length != 1) ? format(f, i, new int[0]) : format(f, i, iArr[0]);
        return String.format(Locale.ENGLISH, "%." + i + PluginDeviceInfo.FBLUETOOTHPAIR, Float.valueOf(f2));
    }

    private static String[] getBulkGpsStrings(long j, ArrayList<GpsPoint> arrayList) {
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
        sb4.append(convertGpsState(gpsPoint.getState()));
        float f = 1000.0f;
        float pace = gpsPoint.getPace() / 1000.0f;
        sb5.append(formatFloat2String(pace, 2, new int[0]));
        sb6.append(time);
        sb6.append(',');
        sb6.append(formatFloat2String(pace == 0.0f ? 0.0f : 1.0f / pace, 2, new int[0]));
        int i = 1;
        while (i < arrayList.size()) {
            GpsPoint gpsPoint2 = arrayList.get(i - 1);
            GpsPoint gpsPoint3 = arrayList.get(i);
            long time2 = (gpsPoint3.getTime() / 1000) - (gpsPoint2.getTime() / 1000);
            sb.append(";");
            int i2 = i;
            sb.append((long) ((gpsPoint3.getLatitude() - gpsPoint2.getLatitude()) * 1.0E8d));
            sb.append(",");
            sb.append((long) ((gpsPoint3.getLongitude() - gpsPoint2.getLongitude()) * 1.0E8d));
            sb2.append(";");
            sb2.append((int) (gpsPoint3.getAltitude() * 100.0d));
            sb3.append(";");
            sb3.append(time2);
            sb4.append(";");
            sb4.append(convertGpsState(gpsPoint3.getState()));
            sb5.append(";");
            float pace2 = gpsPoint3.getPace() / f;
            sb5.append(formatFloat2String(pace2, 2, new int[0]));
            sb6.append(";");
            sb6.append(time2);
            sb6.append(',');
            sb6.append(formatFloat2String(pace2 == 0.0f ? 0.0f : 1.0f / pace2, 2, new int[0]));
            f = 1000.0f;
            i = i2 + 1;
        }
        return new String[]{sb.toString(), sb2.toString(), sb3.toString(), sb4.toString(), sb5.toString(), sb6.toString()};
    }

    private static String getBulkHrString(long j, SportDetail sportDetail) {
        ArrayList<HeartRateInfo> heartRateInfos = sportDetail.getHeartRateInfos();
        StringBuilder sb = new StringBuilder("");
        if (heartRateInfos == null || heartRateInfos.size() == 0) {
            return sb.toString();
        }
        HeartRateInfo heartRateInfo = heartRateInfos.get(0);
        sb.append((heartRateInfo.getTime() / 1000) - j);
        sb.append(",");
        sb.append(heartRateInfo.getHr());
        for (int i = 1; i < heartRateInfos.size(); i++) {
            HeartRateInfo heartRateInfo2 = heartRateInfos.get(i);
            HeartRateInfo heartRateInfo3 = heartRateInfos.get(i - 1);
            long time = (heartRateInfo2.getTime() / 1000) - (heartRateInfo3.getTime() / 1000);
            sb.append(";");
            sb.append(time == 1 ? "" : Long.valueOf(time));
            sb.append(",");
            sb.append(heartRateInfo2.getHr() - heartRateInfo3.getHr());
        }
        return sb.toString();
    }

    private static String[] getBulkPaceStrings(long j, ArrayList<RtPaceInfo> arrayList) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        RtPaceInfo rtPaceInfo = arrayList.get(0);
        long j2 = 1000;
        long time = (rtPaceInfo.getTime() / 1000) - j;
        sb.append(time);
        float pace = rtPaceInfo.getPace() / 1000.0f;
        sb2.append(formatFloat2String(pace, 2, new int[0]));
        sb3.append(time);
        sb3.append(',');
        sb3.append(formatFloat2String(pace == 0.0f ? 0.0f : 1.0f / pace, 2, new int[0]));
        int i = 1;
        while (i < arrayList.size()) {
            RtPaceInfo rtPaceInfo2 = arrayList.get(i - 1);
            RtPaceInfo rtPaceInfo3 = arrayList.get(i);
            long time2 = (rtPaceInfo3.getTime() / j2) - (rtPaceInfo2.getTime() / j2);
            sb.append(";");
            sb.append(time2);
            sb2.append(";");
            float pace2 = rtPaceInfo3.getPace() / 1000.0f;
            sb2.append(formatFloat2String(pace2, 2, new int[0]));
            sb3.append(";");
            sb3.append(time2);
            sb3.append(',');
            sb3.append(formatFloat2String(pace2 == 0.0f ? 0.0f : 1.0f / pace2, 2, new int[0]));
            i++;
            j2 = 1000;
        }
        return new String[]{sb.toString(), sb2.toString(), sb3.toString()};
    }

    private static String getBulkPauseString(SportDetail sportDetail) {
        ArrayList<PauseInfo> pauseInfos = sportDetail.getPauseInfos();
        StringBuilder sb = new StringBuilder("");
        if (pauseInfos == null || pauseInfos.size() == 0) {
            return sb.toString();
        }
        PauseInfo pauseInfo = pauseInfos.get(0);
        sb.append(pauseInfo.getTime() / 1000);
        sb.append(",");
        sb.append(pauseInfo.getOffset() / 1000);
        sb.append(",");
        sb.append(pauseInfo.getGpsPauseIndex());
        sb.append(",");
        sb.append(pauseInfo.getGpsResumeIndex());
        sb.append(",");
        sb.append(pauseInfo.getType());
        for (int i = 1; i < pauseInfos.size(); i++) {
            PauseInfo pauseInfo2 = pauseInfos.get(i);
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

    private static String getBulkRow(long j, SportDetail sportDetail) {
        ArrayList<Row> rowInfos = sportDetail.getRowInfos();
        if (rowInfos == null || rowInfos.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Row row = rowInfos.get(0);
        sb.append((row.getTime() / 1000) - j);
        sb.append(",");
        sb.append(row.getStrokeFreq());
        for (int i = 1; i < rowInfos.size(); i++) {
            Row row2 = rowInfos.get(i);
            long time = (row2.getTime() / 1000) - (rowInfos.get(i - 1).getTime() / 1000);
            sb.append(";");
            sb.append(time);
            sb.append(",");
            sb.append(row2.getStrokeFreq());
        }
        return sb.toString();
    }

    private static String getBulkSkipRope(long j, SportDetail sportDetail) {
        ArrayList<SkipRope> skipRopeInfos = sportDetail.getSkipRopeInfos();
        if (skipRopeInfos == null || skipRopeInfos.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        SkipRope skipRope = skipRopeInfos.get(0);
        sb.append((skipRope.getTime() / 1000) - j);
        sb.append(",");
        sb.append(skipRope.getSkipRopeFreq());
        for (int i = 1; i < skipRopeInfos.size(); i++) {
            SkipRope skipRope2 = skipRopeInfos.get(i);
            long time = (skipRope2.getTime() / 1000) - (skipRopeInfos.get(i - 1).getTime() / 1000);
            sb.append(";");
            sb.append(time);
            sb.append(",");
            sb.append(skipRope2.getSkipRopeFreq());
        }
        return sb.toString();
    }

    private static String getBulkStrokeSpeedString(long j, SportDetail sportDetail) {
        ArrayList<StrokeSpeedInfo> strokeSpeedInfos = sportDetail.getStrokeSpeedInfos();
        StringBuilder sb = new StringBuilder("");
        if (strokeSpeedInfos == null || strokeSpeedInfos.size() == 0) {
            return sb.toString();
        }
        StrokeSpeedInfo strokeSpeedInfo = strokeSpeedInfos.get(0);
        sb.append((strokeSpeedInfo.getTime() / 1000) - j);
        sb.append(",");
        sb.append(strokeSpeedInfo.getSpeed());
        for (int i = 1; i < strokeSpeedInfos.size(); i++) {
            StrokeSpeedInfo strokeSpeedInfo2 = strokeSpeedInfos.get(i);
            long time = (strokeSpeedInfo2.getTime() / 1000) - (strokeSpeedInfos.get(i - 1).getTime() / 1000);
            sb.append(";");
            sb.append(time);
            sb.append(",");
            sb.append(strokeSpeedInfo2.getSpeed());
        }
        return sb.toString();
    }

    private static String getBulkgait(ArrayList<RtPaceInfo> arrayList, long j) {
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
        for (int i = 1; i < arrayList.size(); i++) {
            RtPaceInfo rtPaceInfo2 = arrayList.get(i);
            if (isStrideCadenceVaild(rtPaceInfo2.getStride(), rtPaceInfo2.getCadence())) {
                long time2 = (arrayList.get(i).getTime() / 1000) - (rtPaceInfo.getTime() / 1000);
                float cadence = (int) ((time2 / 60.0f) * arrayList.get(i).getCadence());
                sb.append(time2 + ",");
                sb.append(((int) cadence) + ",");
                sb.append(arrayList.get(i).getStride() + ",");
                sb.append((arrayList.get(i).getCadence() & 65535) + ";");
                rtPaceInfo = rtPaceInfo2;
            }
        }
        return sb.toString();
    }

    private static SparseArray<String> getBulks(long j, SportDetail sportDetail) {
        ArrayList<GpsPoint> gpsPoints = sportDetail.getGpsPoints();
        ArrayList<RtPaceInfo> rtPaceInfos = sportDetail.getRtPaceInfos();
        SparseArray<String> sparseArray = new SparseArray<>();
        if (gpsPoints != null && gpsPoints.size() > 0) {
            String[] bulkGpsStrings = getBulkGpsStrings(j, gpsPoints);
            sparseArray.put(0, bulkGpsStrings[0]);
            sparseArray.put(1, bulkGpsStrings[1]);
            sparseArray.put(2, bulkGpsStrings[2]);
            sparseArray.put(3, bulkGpsStrings[3]);
            sparseArray.put(4, bulkGpsStrings[4]);
            sparseArray.put(5, bulkGpsStrings[5]);
        } else if (rtPaceInfos != null && rtPaceInfos.size() > 0) {
            String[] bulkPaceStrings = getBulkPaceStrings(j, rtPaceInfos);
            sparseArray.put(2, bulkPaceStrings[0]);
            sparseArray.put(4, bulkPaceStrings[1]);
            sparseArray.put(5, bulkPaceStrings[2]);
        }
        return sparseArray;
    }

    private static String getDeviceDescription(DeviceInfoExt deviceInfoExt) {
        String str;
        if (deviceInfoExt.getDeviceSource() == qd.o1.b()) {
            str = "MILI_KONGMING";
        } else if (deviceInfoExt.getDeviceSource() == qd.p1.b()) {
            str = "MILI_KONGMING_L";
        } else {
            str = deviceInfoExt.getDeviceSource() == qd.q1.b() ? "MILI_KONGMING_PRO" : "";
        }
        return deviceInfoExt.getDeviceType() + ":" + str + ":" + deviceInfoExt.getDeviceSource() + ":" + deviceInfoExt.getHardwareVersion();
    }

    private static int getRoundMode(int[] iArr) {
        int i;
        if (iArr == null || iArr.length != 1 || (i = iArr[0]) < 0 || i > 6) {
            return 1;
        }
        return i;
    }

    public static String getSourceByValue(int i) {
        return String.format(Locale.ENGLISH, "run.%d.huami.com", Integer.valueOf(i));
    }

    private static int getType(SportSummary sportSummary) {
        SportType type = sportSummary.getType();
        switch (a.f13579a[type.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 8;
            case 3:
                return 9;
            case 4:
                return 6;
            case 5:
                return 16;
            case 6:
            case 7:
                return type == SportType.SPORT_TYPE_POOL_SWIM ? 14 : 15;
            case 8:
                return 13;
            case 9:
                return 7;
            case 10:
                return 12;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 21;
            case 14:
                return 23;
            case 15:
                return 60;
            case 16:
                return sportSummary.getSportTypeValue();
            default:
                return type.getValue();
        }
    }

    private static boolean isStrideCadenceVaild(int i, int i2) {
        return (i == 65535 || i2 == 65535) ? false : true;
    }

    private static String parseKmMarked(ArrayList<KmPaceInfo> arrayList, long j) {
        if (arrayList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < arrayList.size(); i++) {
            KmPaceInfo kmPaceInfo = arrayList.get(i);
            int index = kmPaceInfo.getIndex();
            int pace = kmPaceInfo.getPace();
            int gpsIndex = kmPaceInfo.getGpsIndex();
            GpsPoint gpsPoint = kmPaceInfo.getGpsPoint();
            String strA = gpsPoint == null ? "" : aht.a(gpsPoint.getLatitude(), gpsPoint.getLongitude());
            int time = gpsPoint == null ? 0 : (int) ((gpsPoint.getTime() / 1000) - j);
            if (i != 0) {
                sb.append(";");
            }
            sb.append(index - 1);
            sb.append(",");
            sb.append(pace);
            sb.append(",");
            sb.append(strA);
            sb.append(",");
            sb.append(gpsIndex);
            sb.append(",");
            sb.append(-1);
            sb.append(",");
            sb.append(time);
        }
        return sb.toString();
    }

    private static String parseMileMarked(ArrayList<MilePaceInfo> arrayList, long j) {
        if (arrayList == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < arrayList.size(); i++) {
            MilePaceInfo milePaceInfo = arrayList.get(i);
            int index = milePaceInfo.getIndex();
            int pace = milePaceInfo.getPace();
            int gpsIndex = milePaceInfo.getGpsIndex();
            GpsPoint gpsPoint = milePaceInfo.getGpsPoint();
            String strA = gpsPoint == null ? "" : aht.a(gpsPoint.getLatitude(), gpsPoint.getLongitude());
            int time = gpsPoint == null ? 0 : (int) ((gpsPoint.getTime() / 1000) - j);
            if (i != 0) {
                sb.append(";");
            }
            sb.append(index - 1);
            sb.append(",");
            sb.append(pace);
            sb.append(",");
            sb.append(strA);
            sb.append(",");
            sb.append(gpsIndex);
            sb.append(",");
            sb.append(-1);
            sb.append(",");
            sb.append(time);
        }
        return sb.toString();
    }

    public static String toSportDetailJson(SportItem sportItem) {
        String str;
        String str2;
        t5t.d(TAG, "toSportDetailJson start:" + System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        DeviceInfoExt deviceInfoExt = sportItem.getDeviceInfoExt();
        SportSummary summary = sportItem.getGpsRecord().getSummary();
        SportDetail detail = sportItem.getGpsRecord().getDetail();
        try {
            long startTime = summary.getStartTime() / 1000;
            long endTime = summary.getEndTime() / 1000;
            SparseArray<String> bulks = getBulks(startTime, detail);
            String str3 = bulks.get(0);
            String str4 = bulks.get(1);
            String str5 = bulks.get(2);
            String str6 = bulks.get(3);
            String str7 = bulks.get(4);
            String str8 = bulks.get(5);
            String bulkPauseString = getBulkPauseString(detail);
            str = TAG;
            try {
                String bulkHrString = getBulkHrString(startTime, detail);
                String bulkStrokeSpeedString = getBulkStrokeSpeedString(startTime, detail);
                jSONObject.put("trackid", startTime);
                jSONObject.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, String.valueOf(endTime));
                jSONObject.put(PaiData.LAST_SYNC_TIME, endTime);
                jSONObject.put(OneTrack.Param.TZ, summary.getTimezone());
                jSONObject.put("source", getSourceByValue(deviceInfoExt.getDeviceSource()));
                jSONObject.put("type", getType(summary));
                if (TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                jSONObject.put("longitude_latitude", str3);
                if (TextUtils.isEmpty(str4)) {
                    str4 = "";
                }
                jSONObject.put("altitude", str4);
                if (TextUtils.isEmpty(str5)) {
                    str5 = "";
                }
                jSONObject.put("time", str5);
                if (TextUtils.isEmpty(str7)) {
                    str7 = "";
                }
                jSONObject.put("pace", str7);
                if (TextUtils.isEmpty(str6)) {
                    str6 = "";
                }
                jSONObject.put("flag", str6);
                if (TextUtils.isEmpty(str8)) {
                    str8 = "";
                }
                jSONObject.put("speed", str8);
                if (TextUtils.isEmpty(bulkPauseString)) {
                    bulkPauseString = "";
                }
                jSONObject.put("pause", bulkPauseString);
                jSONObject.put("kilo_pace", parseKmMarked(detail.getKmPaceInfos(), startTime));
                jSONObject.put("mile_pace", parseMileMarked(detail.getMilePaceInfos(), startTime));
                jSONObject.put("heart_rate", bulkHrString);
                jSONObject.put("provider", 2);
                jSONObject.put("stroke_speed", bulkStrokeSpeedString);
                jSONObject.put("lap", ek.a(detail));
                if (detail.getRtSpo2Infos().size() > 0) {
                    jSONObject.put("spo2", x2.b(detail.getRtSpo2Infos(), startTime));
                }
                if (detail.getRtPressure().size() > 0) {
                    jSONObject.put("pressure", x2.a(detail.getRtPressure(), startTime));
                }
                if (detail.getRtTemperatures().size() > 0) {
                    jSONObject.put("temperature", x2.c(detail.getRtTemperatures(), startTime));
                }
                if (detail.getRtPaceInfos().size() > 0) {
                    jSONObject.put("gait", getBulkgait(detail.getRtPaceInfos(), startTime));
                }
                ArrayList<SkipRope> skipRopeInfos = detail.getSkipRopeInfos();
                if (skipRopeInfos != null && !skipRopeInfos.isEmpty()) {
                    jSONObject.put("rope_skipping_frequency", getBulkSkipRope(startTime, detail));
                }
                str2 = str;
            } catch (JSONException e) {
                e = e;
                str2 = str;
                t5t.d(str2, "toSportDetailJson_Exception:" + e.getMessage());
            }
        } catch (JSONException e2) {
            e = e2;
            str = TAG;
        }
        t5t.d(str2, "toSportDetailJson end:" + System.currentTimeMillis());
        return jSONObject.toString();
    }

    public static String toSportSummaryJson(SportItem sportItem) {
        String strA;
        int iMin;
        String str;
        t5t.d(TAG, "toSportSummaryJson start:" + System.currentTimeMillis());
        JSONObject jSONObject = new JSONObject();
        SportSummary summary = sportItem.getGpsRecord().getSummary();
        SportDetail detail = sportItem.getGpsRecord().getDetail();
        DeviceInfoExt deviceInfoExt = sportItem.getDeviceInfoExt();
        SportAccumInfo accInfo = summary.getAccInfo();
        if (accInfo == null) {
            t5t.d(TAG, "accumInfo is null");
            return jSONObject.toString();
        }
        ArrayList<GpsPoint> gpsPoints = detail.getGpsPoints();
        if (gpsPoints == null || gpsPoints.size() <= 0) {
            strA = "";
        } else {
            GpsPoint gpsPoint = gpsPoints.get(0);
            strA = gpsPoint != null ? aht.a(gpsPoint.getLatitude(), gpsPoint.getLongitude()) : "";
            gpsPoints.size();
        }
        ArrayList<HeartRateInfo> heartRateInfos = detail.getHeartRateInfos();
        if (heartRateInfos == null || heartRateInfos.size() <= 0) {
            iMin = -1;
        } else {
            iMin = -1;
            for (int i = 0; i < heartRateInfos.size(); i++) {
                int hr = heartRateInfos.get(i).getHr();
                if (hr > 0) {
                    iMin = iMin <= 0 ? hr : Math.min(iMin, hr);
                }
            }
        }
        RiddingInfo riddingInfo = summary.getRiddingInfo();
        SwimInfo swimInfo = summary.getSwimInfo();
        SkiingInfo skiingInfo = summary.getSkiingInfo();
        SkipRopeInfo skipRopeInfo = summary.getSkipRopeInfo();
        RowingInfo rowingInfo = summary.getRowingInfo();
        int type = getType(summary);
        HrZoneWrapperApi hrZoneWrapperApi = summary.getHrZoneWrapperApi();
        long endTime = summary.getEndTime() / 1000;
        try {
            jSONObject.put("trackid", String.valueOf(summary.getStartTime() / 1000));
            jSONObject.put("parent_trackid", String.valueOf(summary.getParentStartTime() / 1000));
            jSONObject.put("source", getSourceByValue(deviceInfoExt.getDeviceSource()));
            jSONObject.put(StepsInfo.KEY_DISTANCE, String.valueOf((int) accInfo.getDistance()));
            jSONObject.put("calorie", String.valueOf((int) accInfo.getSportCalories()));
            jSONObject.put(SleepAnimalShareActivity.PARAM_ANIMAL_END_TIME, String.valueOf(endTime));
            jSONObject.put(PaiData.LAST_SYNC_TIME, endTime);
            jSONObject.put(OneTrack.Param.TZ, summary.getTimezone());
            jSONObject.put("run_time", String.valueOf((int) accInfo.getActiveTime()));
            SportStatisInfo statisInfo = summary.getStatisInfo();
            if (statisInfo != null) {
                jSONObject.put("avg_pace", String.valueOf(statisInfo.getAvePace() / 1000.0f));
                jSONObject.put("avg_heart_rate", String.valueOf(statisInfo.getAveHr()));
                jSONObject.put("avg_stride_length", statisInfo.getAveStride());
                jSONObject.put(FitnessPersistKey.ReportMaxHr, statisInfo.getMaxHr());
            } else {
                jSONObject.put("avg_stride_length", accInfo.getAvgStride());
                jSONObject.put("avg_pace", String.valueOf(accInfo.getAvgPace()));
            }
            HeartRateStatistics heartRateStatistics = summary.getHeartRateStatistics();
            if (heartRateStatistics != null) {
                jSONObject.put("avg_heart_rate", heartRateStatistics.getAvg());
                jSONObject.put(FitnessPersistKey.ReportMaxHr, heartRateStatistics.getMax());
            }
            jSONObject.put("avg_frequency", String.valueOf(Math.round((accInfo.getStep() * 60.0f) / accInfo.getActiveTime())));
            jSONObject.put("type", type);
            jSONObject.put("location", strA);
            jSONObject.put("avg_altitude", accInfo.getAvgAltitude());
            jSONObject.put("sport_mode", summary.getSportMode());
            jSONObject.put("auto_recognition", summary.isAutoRecognitionSport());
            jSONObject.put(CourseCatalogActivityKt.KEY_COURSE_TITLE, summary.getCourseTitle());
            jSONObject.put("second_half_start_time", summary.getSecHalfStartTime());
            jSONObject.put("city", "");
            jSONObject.put("forefoot_ratio", -1);
            jSONObject.put("bind_device", getDeviceDescription(deviceInfoExt));
            jSONObject.put("max_pace", accInfo.getMaxPace());
            jSONObject.put("min_pace", accInfo.getMinPace());
            jSONObject.put("pause_time", accInfo.getPauseTime());
            jSONObject.put("altitude_ascend", (int) accInfo.getAscendMeter());
            jSONObject.put("altitude_descend", (int) accInfo.getDescendMeter());
            jSONObject.put("total_step", (int) accInfo.getStep());
            jSONObject.put("enable_transform_regular_calorie", false);
            jSONObject.put("landing_time", -1);
            jSONObject.put("flight_ratio", -1);
            jSONObject.put("climb_dis_descend", -1);
            jSONObject.put("te", summary.getTe());
            jSONObject.put("anaerobic_te", summary.getAnaerobicTE());
            jSONObject.put("target_type", summary.getTargetType());
            jSONObject.put("target_value", summary.getTargetValue());
            if (hrZoneWrapperApi != null) {
                jSONObject.put("heart_range", hrZoneWrapperApi.getHrZoneValue());
                jSONObject.put("heartrate_setting_type", hrZoneWrapperApi.getType());
            }
            Counter counter = summary.getCounter();
            if (counter != null) {
                jSONObject.put("number_of_break", counter.getNumberOfBreak());
                if (counter.getTotalNumber() > 0) {
                    jSONObject.put("rope_skipping_count", counter.getTotalNumber());
                } else {
                    jSONObject.put("rope_skipping_count", counter.getTotalTimes());
                }
                jSONObject.put("strokes", counter.getTotalTimes());
                jSONObject.put("total_strokes", counter.getTotalTimes());
            }
            FrequencyStatistic frequencyStatistic = summary.getFrequencyStatistic();
            if (frequencyStatistic != null) {
                jSONObject.put("rope_skipping_avg_frequency", frequencyStatistic.getAvg());
                jSONObject.put("rope_skipping_max_frequency", frequencyStatistic.getMax());
            }
            DownhillStatistic downhillStatistic = summary.getDownhillStatistic();
            if (downhillStatistic != null) {
                jSONObject.put("downhill_max_altitude_desend", downhillStatistic.getMaxDrop());
            }
            if (iMin != -1) {
                jSONObject.put(FitnessPersistKey.ReportMinHr, iMin);
            }
            jSONObject.put("swim_pool_length", -1);
            jSONObject.put("sn", deviceInfoExt.getSn());
            if (skipRopeInfo != null) {
                jSONObject.put("max_frequency", (int) skipRopeInfo.getMaxSpeed());
                jSONObject.put("rope_skipping_count", (int) skipRopeInfo.getCount());
                jSONObject.put("rope_skipping_avg_frequency", (int) (skipRopeInfo.getAvgSpeed() * 60.0f));
                jSONObject.put("rope_skipping_max_frequency", (int) (skipRopeInfo.getMaxSpeed() * 60.0f));
                jSONObject.put("total_group", (int) skipRopeInfo.getGroupCount());
            }
            jSONObject.put("rope_skipping_rest_time", summary.getRopeSkipRestTime());
            if (riddingInfo != 0) {
                jSONObject.put("distance_ascend", (int) riddingInfo.getDistance3DAscend());
                jSONObject.put("climb_dis_ascend_time", (int) (riddingInfo.getTimeAscend() / 1000));
                jSONObject.put("climb_dis_descend_time", (int) (riddingInfo.getTimeDescend() / 1000));
            }
            if (swimInfo != null) {
                jSONObject.put("swolf", swimInfo.getAvgSwolf());
                jSONObject.put("total_strokes", swimInfo.getStrokes());
                jSONObject.put("total_trips", swimInfo.getTrips());
                jSONObject.put("avg_stroke_speed", swimInfo.getAvgStrokeSpeed());
                jSONObject.put("max_stroke_speed", swimInfo.getMaxStrokeSpeed());
                jSONObject.put("avg_distance_per_stroke", swimInfo.getDistancePerStroke());
                jSONObject.put("swim_style", swimInfo.getStkStyle());
                jSONObject.put("unit", summary.getDistanceUnit());
            }
            if (rowingInfo != null) {
                jSONObject.put("rope_skipping_count", (int) rowingInfo.getCount());
                jSONObject.put("total_group", (int) rowingInfo.getCurGroupNum());
                jSONObject.put("avg_frequency", String.valueOf((int) (rowingInfo.getAvgCadence() * 60.0f)));
                jSONObject.put("avg_pulloar_time", rowingInfo.getAvgPaddleTime());
                jSONObject.put("avg_return_time", rowingInfo.getAvgReturnPaddleTime());
            }
            if (skiingInfo != null) {
                jSONObject.put("altitude_descend", (int) skiingInfo.getTotalTripsAcmDescendMeter());
                float avgSpeed = skiingInfo.getAvgSpeed();
                if (avgSpeed != 0.0f) {
                    jSONObject.put("avg_pace", String.valueOf(1.0f / avgSpeed));
                } else {
                    jSONObject.put("avg_pace", "0");
                }
            }
            int[] swingCnt = summary.getSwingCnt();
            if (swingCnt != null) {
                jSONObject.put("strokes", swingCnt[0]);
                if (swingCnt.length > 3) {
                    jSONObject.put("fore_hand", swingCnt[1]);
                    jSONObject.put("back_hand", swingCnt[2]);
                    jSONObject.put("serve", swingCnt[3]);
                }
            }
            Spo2Statistic spo2Statistic = summary.getSpo2Statistic();
            if (spo2Statistic != null) {
                jSONObject.put("spo2_max", spo2Statistic.getMax());
                jSONObject.put("spo2_min", spo2Statistic.getMin());
            }
            if (summary.getTrainLoad() > 0) {
                jSONObject.put("exercise_load", summary.getTrainLoad());
            }
            if (summary.getVo2Max() > 0) {
                jSONObject.put("VO2_max", summary.getVo2Max());
            }
            Slope slope = summary.getSlope();
            if (slope != null) {
                jSONObject.put("avg_slope", slope.getAvg());
                jSONObject.put("max_slope", slope.getMax());
            }
            FloorActivityStatistic floorActivityStatistic = summary.getFloorActivityStatistic();
            if (floorActivityStatistic != null) {
                jSONObject.put("floor_number", floorActivityStatistic.getUpstair());
                jSONObject.put("upstairs_height", floorActivityStatistic.getUpHeight());
                jSONObject.put("min_upstairs_floors", floorActivityStatistic.getAverageFloorsPerMinutes());
                jSONObject.put("downstairs_floors", floorActivityStatistic.getDownstair());
                jSONObject.put("downstairs_height", floorActivityStatistic.getDownHeight());
            }
            SportPressureStatistic pressure = summary.getPressure();
            if (pressure != null) {
                jSONObject.put("avg_pressure", pressure.getAvg());
                jSONObject.put("max_pressure", pressure.getMax());
                jSONObject.put("min_pressure", pressure.getMin());
            }
            TemperatureStatistic temperatureStatistic = summary.getTemperatureStatistic();
            if (temperatureStatistic != null) {
                jSONObject.put("avg_temperature", temperatureStatistic.getAvg());
                jSONObject.put("max_temperature", temperatureStatistic.getMax());
                jSONObject.put("min_temperature", temperatureStatistic.getMin());
            }
            str = TAG;
        } catch (JSONException e) {
            String str2 = "toSportSummaryJson_Exception:" + e.getMessage();
            str = TAG;
            t5t.d(str, str2);
        }
        t5t.d(str, "toSportSummaryJson end:" + System.currentTimeMillis());
        return jSONObject.toString();
    }
}
