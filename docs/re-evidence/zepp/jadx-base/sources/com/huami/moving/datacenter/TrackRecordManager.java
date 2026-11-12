package com.huami.moving.datacenter;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.huami.mifit.sportlib.GPSSportApplication;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.mifit.sportlib.common.SyncedState;
import com.huami.moving.ui.utils.DataFormatter;
import com.huami.moving.ui.utils.SportRecordQueryConstrainUtils;
import com.huami.moving.webapi.SportWebParams;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Trackdata;
import com.xiaomi.hm.health.databases.model.TrackdataDao;
import com.xiaomi.hm.health.databases.model.Trackrecord;
import com.xiaomi.hm.health.databases.model.TrackrecordDao;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Observable;
import rx.functions.Func1;

/* JADX INFO: loaded from: classes11.dex */
public class TrackRecordManager {
    private static final String b = "TrackRecordManager";
    private static final String c = "_";
    private static final String d = "originDetail_";
    private static final String e = "data.json";
    private static TrackRecordManager f;
    private List<Integer> a;

    private TrackRecordManager() {
    }

    private String a(long j, int i) {
        return d + j + "_" + i + "_" + e;
    }

    private boolean b(long j, int i) {
        return new File(GPSSportApplication.getDataStoreDir(), a(j, i)).exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    private String c(String str) throws Throwable {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        i = 0;
        ?? r2 = 0;
        r2 = 0;
        BufferedReader bufferedReader = null;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(new FileInputStream(new File(GPSSportApplication.getDataStoreDir(), str))));
                while (true) {
                    try {
                        String line = bufferedReader3.readLine();
                        if (line != null) {
                            sb.append(line);
                        } else {
                            try {
                                break;
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                String str2 = b;
                                Object[] objArr = new Object[0];
                                HMLog.i(str2, e2.getMessage(), objArr);
                                i = objArr;
                                r2 = str2;
                            }
                        }
                    } catch (FileNotFoundException e3) {
                        e = e3;
                        bufferedReader = bufferedReader3;
                        e.printStackTrace();
                        HMLog.i(b, e.getMessage(), new Object[0]);
                        r2 = bufferedReader;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                                r2 = bufferedReader;
                            } catch (IOException e4) {
                                e4.printStackTrace();
                                String str3 = b;
                                Object[] objArr2 = new Object[0];
                                HMLog.i(str3, e4.getMessage(), objArr2);
                                i = objArr2;
                                r2 = str3;
                            }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        bufferedReader2 = bufferedReader3;
                        e.printStackTrace();
                        HMLog.i(b, e.getMessage(), new Object[0]);
                        r2 = bufferedReader2;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                                r2 = bufferedReader2;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                String str4 = b;
                                Object[] objArr3 = new Object[0];
                                HMLog.i(str4, e6.getMessage(), objArr3);
                                i = objArr3;
                                r2 = str4;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        r2 = bufferedReader3;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                                HMLog.i(b, e7.getMessage(), new Object[i]);
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader3.close();
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException e8) {
            e = e8;
        } catch (IOException e9) {
            e = e9;
        }
        return sb.toString();
    }

    private File d(Trackdata trackdata, boolean z) {
        File file = null;
        if (GPSSportApplication.getDataStoreDir() == null || GPSSportApplication.getDataStoreDir().isEmpty()) {
            return null;
        }
        String strA = a(trackdata.getTrackid().longValue(), trackdata.getSource().intValue());
        try {
            File file2 = new File(GPSSportApplication.getDataStoreDir(), strA);
            try {
                if (!file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                if (!file2.exists()) {
                    file2.createNewFile();
                } else if (!z) {
                    HMLog.i(b, "file name should not duplicate=" + strA, new Object[0]);
                    return file2;
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(DataFormatter.gson().toJson(trackdata).getBytes());
                fileOutputStream.close();
                return file2;
            } catch (Exception e2) {
                e = e2;
                file = file2;
                HMLog.i(b, e.getMessage(), new Object[0]);
                e.printStackTrace();
                return file;
            }
        } catch (Exception e3) {
            e = e3;
        }
    }

    private Trackdata e(long j, int i) {
        String strC;
        if (GPSSportApplication.getDataStoreDir() == null || GPSSportApplication.getDataStoreDir().isEmpty() || (strC = c(a(j, i))) == null || strC.isEmpty()) {
            return null;
        }
        return (Trackdata) DataFormatter.gson().fromJson(strC, Trackdata.class);
    }

    public static TrackRecordManager getInstance() {
        if (f == null) {
            f = new TrackRecordManager();
        }
        return f;
    }

    public void deleteLocalRunningHistoryRecord(long j, String str) {
        HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.Trackid.eq(Long.valueOf(j)), TrackrecordDao.Properties.Source.eq(Integer.valueOf(DataTypeSource.RunSource.getValueBySource(str)))).buildDelete().executeDeleteWithoutDetachingEntities();
    }

    public long getAllTrackRecordsCount() {
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        List<Integer> list = this.a;
        if (list != null && !list.isEmpty()) {
            queryBuilder.where(TrackrecordDao.Properties.Type.in(this.a), new WhereCondition[0]);
        }
        return queryBuilder.buildCount().count();
    }

    public Trackrecord getLatestIndoorRunRecordBySource(int i) {
        return HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.Source.eq(Integer.valueOf(i)), new WhereCondition[0]).orderDesc(TrackrecordDao.Properties.Trackid).limit(1).unique();
    }

    public Trackrecord getLatestTrackRecord() {
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        Property property = TrackrecordDao.Properties.State;
        List<Trackrecord> list = queryBuilder.where(property.notEq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue())), property.notEq(Integer.valueOf(SyncedState.STATE_TO_BE_DELETED.getValue())), property.notEq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), SportRecordQueryConstrainUtils.querySportRecordBySportType()).orderDesc(TrackrecordDao.Properties.Trackid).limit(1).list();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return parseOriginalJsonData2Trackrecord(list.get(0));
    }

    public Trackrecord getNeedRecoverTrackRecord(@Nullable Long l) {
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        queryBuilder.where(TrackrecordDao.Properties.Source.eq(Integer.valueOf(DataTypeSource.RunSource.RUN_SOURCE_PHONE.getValue())), new WhereCondition[0]).where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue())), new WhereCondition[0]);
        if (l != null) {
            queryBuilder.where(TrackrecordDao.Properties.Trackid.eq(l), new WhereCondition[0]);
        } else {
            queryBuilder.where(TrackrecordDao.Properties.Type.in(1, 8, 25, 26, 9, 6), new WhereCondition[0]);
        }
        queryBuilder.orderDesc(TrackrecordDao.Properties.Trackid).limit(1);
        List<Trackrecord> list = queryBuilder.list();
        if (list == null || list.size() != 1 || list.get(0) == null) {
            return null;
        }
        return list.get(0);
    }

    public long getSyncAgainTrackRecordsCount() {
        return HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.STATE_SYNC_AGAIN.getValue())), new WhereCondition[0]).buildCount().count();
    }

    public Trackdata getTrackData(long j, int i) {
        return getTrackDataCountFromDb(j, i) <= 0 ? e(j, i) : HMDaoManager.getInstance().getTrackdataDao().queryBuilder().where(TrackdataDao.Properties.Trackid.eq(Long.valueOf(j)), new WhereCondition[0]).where(TrackdataDao.Properties.Source.eq(Integer.valueOf(i)), new WhereCondition[0]).unique();
    }

    public long getTrackDataCountFromDb(long j, int i) {
        return HMDaoManager.getInstance().getTrackdataDao().queryBuilder().where(TrackdataDao.Properties.Trackid.eq(Long.valueOf(j)), new WhereCondition[0]).where(TrackdataDao.Properties.Source.eq(Integer.valueOf(i)), new WhereCondition[0]).count();
    }

    public Trackrecord getTrackRecordById(long j, int i) {
        List<Trackrecord> list = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.Trackid.eq(Long.valueOf(j)), new WhereCondition[0]).where(TrackrecordDao.Properties.Source.eq(Integer.valueOf(i)), new WhereCondition[0]).list();
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            StringBuilder sb = new StringBuilder();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Trackrecord trackrecord = list.get(i2);
                sb.append(",id:");
                sb.append(trackrecord.getTrackid());
                sb.append(",source:");
                sb.append(trackrecord.getSource());
                sb.append(",type:");
                sb.append(trackrecord.getType());
                if (trackrecord.getType().intValue() <= 1) {
                    arrayList.add(trackrecord);
                    HMDaoManager.getInstance().getTrackrecordDao().delete(trackrecord);
                }
            }
            list.removeAll(arrayList);
            HMLog.i(b, "duplicate record:" + ((Object) sb), new Object[0]);
            if (list.size() == 1) {
                return list.get(0);
            }
            if (list.size() <= 1) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            for (Trackrecord trackrecord2 : list) {
                sb2.append(",source:");
                sb2.append(trackrecord2.getSource());
                sb2.append(",type:");
                sb2.append(trackrecord2.getType());
            }
            HMLog.i(b, "should only one record. multi record :[" + ((Object) sb2) + "]", new Object[0]);
        }
        return parseOriginalJsonData2Trackrecord(list.get(0));
    }

    public long getTrackRecordsCountByTimeRange(long j, long j2) {
        QueryBuilder<Trackrecord> queryBuilderWhere = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.Trackid.between(Long.valueOf(j / 1000), Long.valueOf(j2 / 1000)), new WhereCondition[0]);
        List<Integer> list = this.a;
        if (list != null && !list.isEmpty()) {
            queryBuilderWhere.where(TrackrecordDao.Properties.Type.in(this.a), new WhereCondition[0]);
        }
        return queryBuilderWhere.buildCount().count();
    }

    public long getUnKnowTrackRecordsCount(int i) {
        return HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), new WhereCondition[0]).where(TrackrecordDao.Properties.Type.eq(Integer.valueOf(i)), new WhereCondition[0]).buildCount().count();
    }

    public List<Trackrecord> getUnKnowTrackRecordsInType(int i) {
        return HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), new WhereCondition[0]).where(TrackrecordDao.Properties.Type.eq(Integer.valueOf(i)), new WhereCondition[0]).list();
    }

    public long getUnSyncedTrackRecordsCount() {
        return HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.State.eq(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue())), new WhereCondition[0]).buildCount().count();
    }

    public QueryBuilder<Trackrecord> getValidPhoneBuilder(long j) {
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        Property property = TrackrecordDao.Properties.State;
        QueryBuilder<Trackrecord> queryBuilderWhere = queryBuilder.where(property.notEq(Integer.valueOf(SyncedState.STATE_TO_BE_DELETED.getValue())), new WhereCondition[0]).where(property.notEq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue())), new WhereCondition[0]).where(property.notEq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), new WhereCondition[0]).where(SportRecordQueryConstrainUtils.querySportRecordBySportType(), new WhereCondition[0]);
        Property property2 = TrackrecordDao.Properties.Trackid;
        queryBuilderWhere.orderDesc(property2);
        if (j > 0) {
            queryBuilder.where(property2.le(Long.valueOf(j)), new WhereCondition[0]);
        }
        return queryBuilder;
    }

    public boolean hasExistedTrackData(long j, int i) {
        return getTrackDataCountFromDb(j, i) > 0 || b(j, i);
    }

    public boolean insertDetailIfNotExist(Trackdata trackdata) {
        if (trackdata == null) {
            return false;
        }
        File fileD = d(trackdata, false);
        if (fileD != null && fileD.length() > 0) {
            return true;
        }
        if (getTrackDataCountFromDb(trackdata.getTrackid().longValue(), trackdata.getSource().intValue()) > 0) {
            return false;
        }
        HMDaoManager.getInstance().getTrackdataDao().insert(trackdata);
        return true;
    }

    public boolean insertOrReplaceDetailData(Trackdata trackdata) {
        if (trackdata == null) {
            return false;
        }
        if (getTrackDataCountFromDb(trackdata.getTrackid().longValue(), trackdata.getSource().intValue()) <= 0) {
            File fileD = d(trackdata, true);
            return fileD != null && fileD.length() > 0;
        }
        HMDaoManager.getInstance().getTrackdataDao().delete(trackdata);
        HMDaoManager.getInstance().getTrackdataDao().insertOrReplace(trackdata);
        return true;
    }

    public boolean insertRecordIfNotExist(Trackrecord trackrecord) {
        if (trackrecord == null || HMDaoManager.getInstance().getTrackrecordDao().queryBuilder().where(TrackrecordDao.Properties.Trackid.eq(trackrecord.getTrackid()), new WhereCondition[0]).where(TrackrecordDao.Properties.Source.eq(trackrecord.getSource()), new WhereCondition[0]).unique() != null) {
            return false;
        }
        Integer type = trackrecord.getType();
        Integer climbDisDescend = trackrecord.getClimbDisDescend();
        Integer v = trackrecord.getV();
        if (type.intValue() == 46 && climbDisDescend != null && climbDisDescend.intValue() != 0 && v.intValue() < 16) {
            trackrecord.setDistance(climbDisDescend);
        }
        trackrecord.setOriginalJsonData(parseTrackrecord2OriginalJsonData(trackrecord));
        HMDaoManager.getInstance().getTrackrecordDao().insert(trackrecord);
        return true;
    }

    public List<Trackrecord> loadLocalTrackRecords(Long l, Long l2, Long l3, int i, boolean z) {
        boolean z2 = (l == null || l2 == null) ? false : true;
        if (l3 == null) {
            l3 = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        QueryBuilder<Trackrecord> validPhoneBuilder = getInstance().getValidPhoneBuilder(-1L);
        if (z2) {
            Property property = TrackrecordDao.Properties.Trackid;
            validPhoneBuilder.where(property.ge(Long.valueOf(l.longValue() / 1000)), property.le(Long.valueOf(l2.longValue() / 1000)));
        } else {
            validPhoneBuilder.where(TrackrecordDao.Properties.Trackid.le(l3), new WhereCondition[0]).limit(i);
        }
        List<Integer> list = this.a;
        if (list != null && !list.isEmpty()) {
            validPhoneBuilder.where(TrackrecordDao.Properties.Type.in(this.a), new WhereCondition[0]);
        }
        if (z) {
            validPhoneBuilder.orderDesc(TrackrecordDao.Properties.Trackid);
        } else {
            validPhoneBuilder.orderAsc(TrackrecordDao.Properties.Trackid);
        }
        List<Trackrecord> list2 = validPhoneBuilder.list();
        ArrayList arrayList = new ArrayList();
        Iterator<Trackrecord> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(parseOriginalJsonData2Trackrecord(it2.next()));
        }
        return arrayList;
    }

    public Observable<Trackrecord> loadLocalTrackRecordsInRx(Long l, Long l2, Long l3, int i) {
        boolean z = (l == null || l2 == null) ? false : true;
        if (l3 == null) {
            l3 = Long.valueOf(System.currentTimeMillis() / 1000);
        }
        QueryBuilder<Trackrecord> validPhoneBuilder = getInstance().getValidPhoneBuilder(-1L);
        if (z) {
            Property property = TrackrecordDao.Properties.Trackid;
            validPhoneBuilder.where(property.ge(Long.valueOf(l.longValue() / 1000)), property.le(Long.valueOf(l2.longValue() / 1000)));
        } else {
            validPhoneBuilder.where(TrackrecordDao.Properties.Trackid.le(l3), new WhereCondition[0]).limit(i);
        }
        List<Integer> list = this.a;
        if (list != null && !list.isEmpty()) {
            validPhoneBuilder.where(TrackrecordDao.Properties.Type.in(this.a), new WhereCondition[0]);
        }
        return validPhoneBuilder.orderDesc(TrackrecordDao.Properties.Trackid).rx().oneByOne().map(new Func1() { // from class: pr7
            @Override // rx.functions.Func1
            public final Object call(Object obj) {
                return this.a.parseOriginalJsonData2Trackrecord((Trackrecord) obj);
            }
        });
    }

    public Trackrecord parseOriginalJsonData2Trackrecord(Trackrecord trackrecord) {
        String originalJsonData = trackrecord.getOriginalJsonData();
        if (!TextUtils.isEmpty(originalJsonData)) {
            try {
                JSONObject jSONObject = new JSONObject(originalJsonData);
                trackrecord.setSportMode(jSONObject.optInt("sport_mode", -1));
                trackrecord.setDownhillNumber(jSONObject.optInt("downhill_num", -1));
                trackrecord.setMaxDownhillFallMileage(jSONObject.optInt("downhill_max_altitude_desend", -1));
                trackrecord.setTennisForeHand(jSONObject.optInt("fore_hand", 0));
                trackrecord.setTennisBackHand(jSONObject.optInt("back_hand", 0));
                trackrecord.setTennisServe(jSONObject.optInt("serve", 0));
                trackrecord.setHalfStartTime(jSONObject.optInt("second_half_start_time", -1));
                trackrecord.setRopeSkippingCount(jSONObject.optInt("rope_skipping_count", 0));
                trackrecord.setRopeSkippingAvgFrequency(jSONObject.optInt("rope_skipping_avg_frequency", 0));
                trackrecord.setRopeSkippingMaxFrequency(jSONObject.optInt("rope_skipping_max_frequency", 0));
                trackrecord.setRopeSkippingRestTime(jSONObject.optLong("rope_skipping_rest_time", 0L));
                trackrecord.setMarathon(jSONObject.optString("marathon"));
                trackrecord.setMaxSFreq(jSONObject.optInt("max_frequency", 0));
                trackrecord.setExtra(jSONObject.optString("extra"));
                trackrecord.setTotalGroup(jSONObject.optInt("total_group", 0));
                trackrecord.setTeAnaerobicValue(Integer.valueOf(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_TE_ANAEROBIC, -1)));
                trackrecord.setTargetType(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_TARGET_TYPE, 0));
                trackrecord.setTargetValue(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_TARGET_VALUE, 0));
                trackrecord.setSpo2Max(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_SPO2_MAX, 0));
                trackrecord.setSpo2Min(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_SPO2_MIN, 0));
                trackrecord.setAvgAltitude(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_ALTITUDE, -20000.0d)));
                trackrecord.setMaxSlope(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_MAX_SLOPE, 0));
                trackrecord.setAvgSlope(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_AVG_SLOPE, 0));
                trackrecord.setAvgPulloarTime(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_PULLOAR_TIME, 0.0d)));
                trackrecord.setAvgReturnTime(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_RETURN_TIME, 0.0d)));
                trackrecord.setFloorNumber(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_FLOOR_NUMBER, 0));
                trackrecord.setUpstairsHeight(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_UPSTAIRS_HEIGHT, 0.0d)));
                trackrecord.setMinUpstairsFloors(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_MIN_UPSTAIRS_FLOORS, 0.0d)));
                trackrecord.setMaxAltitude(jSONObject.optInt("max_altitude", 0));
                trackrecord.setMinAltitude(jSONObject.optInt("min_altitude", 0));
                trackrecord.setAutoRecognition(Boolean.valueOf(jSONObject.optBoolean(SportWebParams.AUTO_RECOGNITION)));
                trackrecord.setAccumulatedGap(jSONObject.optInt(SportWebParams.ACCUMULATED_GAP, 0));
                trackrecord.setPersonalBest(jSONObject.optString("pb"));
                trackrecord.setHrZone(jSONObject.optString(SportWebParams.HEART_RANGE));
                trackrecord.setHrSettingType(Integer.valueOf(jSONObject.optInt(SportWebParams.HEARTRATE_SETTING_TYPE, -1)));
                trackrecord.setPauseTime(Integer.valueOf(jSONObject.optInt(SportWebParams.PAUSE_TIME, -1)));
                trackrecord.setAveragePressure(jSONObject.optInt(SportWebParams.AVERAGE_PRESSURE, -1));
                trackrecord.setMaximumPressure(jSONObject.optInt(SportWebParams.MAXIMUM_PRESSURE, -1));
                trackrecord.setNumberOfBreak(jSONObject.optInt(SportWebParams.NUMBER_OF_BREAK, -1));
                trackrecord.setCourseTitle(jSONObject.optString(SportWebParams.COURSE_TITLE));
                trackrecord.setDownstairsFloors(Integer.valueOf(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_DOWNSTAIRS_FLOORS, -1)));
                trackrecord.setDownstairsHeight(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_DOWNSTAIRS_HEIGHT, -1.0d)));
                trackrecord.setMinPressure(Integer.valueOf(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_MIN_PRESSURE, -1)));
                trackrecord.setAverageTemperature(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_TEMPERATURE, -274.0d)));
                trackrecord.setHighestTemperature(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_MAX_TEMPERATURE, -274.0d)));
                trackrecord.setLowestTemperature(Float.valueOf((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_MIN_TEMPERATURE, -274.0d)));
                trackrecord.setThisExerciseLoad(Integer.valueOf(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_EXERCISE_LOAD, -1)));
                trackrecord.setMaxVO2(Integer.valueOf(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_VO2_MAX, -1)));
                trackrecord.setTotalSwing(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_TOTAL_SWING, -1));
                trackrecord.setAverageBeat((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_BEAT, -1.0d));
                trackrecord.setAverageUpTime((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_UP_TIME, -1.0d));
                trackrecord.setAverageDownTime((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_DOWN_TIME, -1.0d));
                trackrecord.setAverageAngle(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_AVG_ANGLE, -361));
                trackrecord.setAverageScore(jSONObject.optInt(SportWebParams.PARAM_SUMMARY_AVG_SCORE, -1));
                trackrecord.setAveragePower((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_AVG_POWER, -1.0d));
                trackrecord.setMaxPower((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_MAX_POWER, -1.0d));
                trackrecord.setWorkValue((float) jSONObject.optDouble(SportWebParams.PARAM_SUMMARY_WORK_VALUE, -1.0d));
                return trackrecord;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return trackrecord;
    }

    public String parseTrackrecord2OriginalJsonData(Trackrecord trackrecord) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sport_mode", trackrecord.getSportMode());
            jSONObject.put("downhill_num", trackrecord.getDownhillNumber());
            jSONObject.put("downhill_max_altitude_desend", trackrecord.getMaxDownhillFallMileage());
            jSONObject.put("fore_hand", trackrecord.getTennisForeHand());
            jSONObject.put("back_hand", trackrecord.getTennisBackHand());
            jSONObject.put("serve", trackrecord.getTennisServe());
            jSONObject.put("second_half_start_time", trackrecord.getHalfStartTime());
            jSONObject.put("rope_skipping_count", trackrecord.getRopeSkippingCount());
            jSONObject.put("rope_skipping_avg_frequency", trackrecord.getRopeSkippingAvgFrequency());
            jSONObject.put("rope_skipping_max_frequency", trackrecord.getRopeSkippingMaxFrequency());
            jSONObject.put("rope_skipping_rest_time", trackrecord.getRopeSkippingRestTime());
            if (!TextUtils.isEmpty(trackrecord.getMarathon())) {
                jSONObject.put("marathon", trackrecord.getMarathon());
            }
            jSONObject.put("max_frequency", trackrecord.getMaxSFreq());
            if (!TextUtils.isEmpty(trackrecord.getExtra())) {
                jSONObject.put("extra", trackrecord.getExtra());
            }
            jSONObject.put("total_group", trackrecord.getTotalGroup());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_TE_ANAEROBIC, trackrecord.getTeAnaerobicValue());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_TARGET_TYPE, trackrecord.getTargetType());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_TARGET_VALUE, trackrecord.getTargetValue());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_SPO2_MIN, trackrecord.getSpo2Min());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_SPO2_MAX, trackrecord.getSpo2Max());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_ALTITUDE, trackrecord.getAvgAltitude());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_MAX_SLOPE, trackrecord.getMaxSlope());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_SLOPE, trackrecord.getAvgSlope());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_PULLOAR_TIME, trackrecord.getAvgPulloarTime());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_RETURN_TIME, trackrecord.getAvgReturnTime());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_FLOOR_NUMBER, trackrecord.getFloorNumber());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_UPSTAIRS_HEIGHT, trackrecord.getUpstairsHeight());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_MIN_UPSTAIRS_FLOORS, trackrecord.getMinUpstairsFloors());
            jSONObject.put("max_altitude", trackrecord.getMaxAltitude());
            jSONObject.put("min_altitude", trackrecord.getMinAltitude());
            jSONObject.put(SportWebParams.AUTO_RECOGNITION, trackrecord.getAutoRecognition());
            jSONObject.put(SportWebParams.ACCUMULATED_GAP, trackrecord.getAccumulatedGap());
            if (!TextUtils.isEmpty(trackrecord.getPersonalBest())) {
                jSONObject.put("pb", trackrecord.getPersonalBest());
            }
            if (!TextUtils.isEmpty(trackrecord.getHrZone())) {
                jSONObject.put(SportWebParams.HEART_RANGE, trackrecord.getHrZone());
            }
            jSONObject.put(SportWebParams.HEARTRATE_SETTING_TYPE, trackrecord.getHrSettingType());
            jSONObject.put(SportWebParams.PAUSE_TIME, trackrecord.getPauseTime());
            jSONObject.put(SportWebParams.AVERAGE_PRESSURE, trackrecord.getAveragePressure());
            jSONObject.put(SportWebParams.MAXIMUM_PRESSURE, trackrecord.getMaximumPressure());
            jSONObject.put(SportWebParams.NUMBER_OF_BREAK, trackrecord.getNumberOfBreak());
            if (!TextUtils.isEmpty(trackrecord.getCourseTitle())) {
                jSONObject.put(SportWebParams.COURSE_TITLE, trackrecord.getCourseTitle());
            }
            jSONObject.put(SportWebParams.PARAM_SUMMARY_DOWNSTAIRS_FLOORS, trackrecord.getDownstairsFloors());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_DOWNSTAIRS_HEIGHT, trackrecord.getDownstairsHeight());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_MIN_PRESSURE, trackrecord.getMinPressure());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_TEMPERATURE, trackrecord.getAverageTemperature());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_MAX_TEMPERATURE, trackrecord.getHighestTemperature());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_MIN_TEMPERATURE, trackrecord.getLowestTemperature());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_EXERCISE_LOAD, trackrecord.getThisExerciseLoad());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_VO2_MAX, trackrecord.getMaxVO2());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_TOTAL_SWING, trackrecord.getTotalSwing());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_BEAT, trackrecord.getAverageBeat());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_UP_TIME, trackrecord.getAverageUpTime());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_DOWN_TIME, trackrecord.getAverageDownTime());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_ANGLE, trackrecord.getAverageAngle());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_SCORE, trackrecord.getAverageScore());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_AVG_POWER, trackrecord.getAveragePower());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_MAX_POWER, trackrecord.getMaxPower());
            jSONObject.put(SportWebParams.PARAM_SUMMARY_WORK_VALUE, trackrecord.getWorkValue());
            if (!TextUtils.isEmpty(trackrecord.getStrengthTrainingGroup())) {
                jSONObject.put(SportWebParams.PARAM_SUMMARY_STRENGTH_TRAINING_GROUP, trackrecord.getStrengthTrainingGroup());
            }
            return jSONObject.toString();
        } catch (Exception e2) {
            HMLog.i(b, "parseTrackrecord2OriginalJsonData exception:" + e2.getMessage(), new Object[0]);
            return "";
        }
    }

    public void setContionSportTypes(String str) {
        List<Integer> list = this.a;
        if (list != null) {
            list.clear();
        } else {
            this.a = new ArrayList();
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(",")) {
            this.a.add(Integer.valueOf(Integer.parseInt(str2)));
        }
    }

    public void tryDelInvalidRecord(List<Trackrecord> list, String[] strArr, long j, boolean z) {
        ArrayList<Trackrecord> arrayList;
        boolean z2;
        if (list == null || list.size() == 0) {
            return;
        }
        QueryBuilder<Trackrecord> queryBuilder = HMDaoManager.getInstance().getTrackrecordDao().queryBuilder();
        if (j > 0) {
            queryBuilder.where(TrackrecordDao.Properties.Trackid.le(Long.valueOf(j)), new WhereCondition[0]);
            queryBuilder.limit(z ? 20 : 40);
        } else if (strArr != null && strArr.length == 2) {
            Calendar calendar = Calendar.getInstance();
            try {
                calendar.setTime(new SimpleDateFormat("yyyy-MM", Locale.getDefault()).parse(strArr[1]));
                queryBuilder.where(TrackrecordDao.Properties.Date.between(strArr[0] + "-01", strArr[0] + Constants.ACCEPT_TIME_SEPARATOR_SERVER + calendar.getActualMaximum(5)), new WhereCondition[0]);
            } catch (ParseException e2) {
                e2.printStackTrace();
            }
        }
        Property property = TrackrecordDao.Properties.State;
        queryBuilder.where(property.notEq(Integer.valueOf(SyncedState.STATE_TO_BE_DELETED.getValue())), new WhereCondition[0]).where(property.notEq(Integer.valueOf(SyncedState.SYNC_STATE_DEFAULT.getValue())), new WhereCondition[0]).where(property.notEq(Integer.valueOf(SyncedState.STATE_UNSYNCED.getValue())), new WhereCondition[0]).where(property.notEq(Integer.valueOf(SyncedState.STATE_UNKNOW.getValue())), new WhereCondition[0]).orderDesc(TrackrecordDao.Properties.Trackid);
        if (z) {
            queryBuilder.where(TrackrecordDao.Properties.Source.eq(Integer.valueOf(DataTypeSource.RunSource.RUN_SOURCE_WATCH.getValue())), new WhereCondition[0]);
            arrayList = (ArrayList) queryBuilder.list();
        } else {
            arrayList = (ArrayList) queryBuilder.list();
        }
        for (Trackrecord trackrecord : arrayList) {
            Iterator<Trackrecord> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z2 = true;
                    break;
                }
                Trackrecord next = it2.next();
                if (trackrecord.getTrackid().longValue() == next.getTrackid().longValue() && trackrecord.getSource().intValue() == next.getSource().intValue()) {
                    z2 = false;
                    break;
                }
            }
            if (z2) {
                HMDaoManager.getInstance().getTrackrecordDao().delete(trackrecord);
            }
        }
    }

    public long updateTrackRecord(Trackrecord trackrecord) {
        return HMDaoManager.getInstance().getTrackrecordDao().insertOrReplace(trackrecord);
    }
}
