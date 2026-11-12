package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.SingleDayRecord;
import com.huawei.pluginachievement.manager.model.TrackData;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes13.dex */
public class oub {
    public static void d(TrackData trackData, otl otlVar, Context context) {
        if (TextUtils.isEmpty(osa.e(context, "personal"))) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "flag is null");
            return;
        }
        osf osfVarB = otlVar.b(2, new HashMap(2));
        SingleDayRecord singleDayRecord = osfVarB instanceof SingleDayRecord ? (SingleDayRecord) osfVarB : null;
        if (singleDayRecord == null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "singleDayRecord is null");
            return;
        }
        int iAcquireType = trackData.acquireType();
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "trackType is ", Integer.valueOf(iAcquireType));
        if (oun.a(iAcquireType)) {
            h(singleDayRecord, trackData, otlVar);
            return;
        }
        if (oun.b(iAcquireType)) {
            c(singleDayRecord, trackData, otlVar);
        } else if (oun.g(iAcquireType)) {
            i(singleDayRecord, trackData, otlVar);
        } else {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealSurmountEvent ", Integer.valueOf(iAcquireType));
        }
    }

    private static void c(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "Enter dealCycleType");
        float fAcquireDistance = trackData.acquireDistance();
        float fAcquireBestPace = trackData.acquireBestPace();
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestCycleDistance());
        if (ozmVarC != null && trackData.acquireTrackTime() != ozmVarC.d()) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            if (paw.a(paw.b(fAcquireDistance), ozmVarC.c() * 1.0d) > 0) {
                d(trackData, otlVar, singleDayRecord, 10);
            }
        } else {
            b(trackData, singleDayRecord, otlVar, 10);
        }
        if (fAcquireDistance < 1.0f) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "distance < 1");
            return;
        }
        double dB = paw.b(fAcquireBestPace);
        if (0.0d == dB) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "bestPace is 0");
            return;
        }
        ozn oznVarB = paw.b(singleDayRecord.acquireBestCycleSpeed());
        if (oznVarB != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealCycleType compareDouble bestPace.");
            if (paw.b(dB, oznVarB.e()) < 0) {
                d(trackData, fAcquireBestPace, otlVar, singleDayRecord, 11);
                return;
            }
            return;
        }
        d(((double) fAcquireBestPace) * 1.0d, singleDayRecord, trackData, otlVar, 11);
    }

    private static void h(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "Enter dealRunType");
        float fAcquireDistance = trackData.acquireDistance();
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestRunDistance());
        if (ozmVarC != null && trackData.acquireTrackTime() != ozmVarC.d()) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            if (paw.a(paw.b(fAcquireDistance), ozmVarC.c() * 1.0d) > 0) {
                d(trackData, otlVar, singleDayRecord, 3);
            }
        } else {
            b(trackData, singleDayRecord, otlVar, 3);
        }
        float fAcquireBestPace = trackData.acquireBestPace();
        double dB = paw.b(fAcquireBestPace);
        if (0.0d == dB) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "No bestPace.");
            return;
        }
        ozn oznVarB = paw.b(singleDayRecord.acquireBestRunPace());
        if (oznVarB != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRunType compareDouble bestPace.");
            if (paw.b(dB, oznVarB.e()) < 0) {
                d(trackData, fAcquireBestPace, otlVar, singleDayRecord, 4);
            }
        } else {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRunType bestMotionPaceOne == null.");
            d(dB, singleDayRecord, trackData, otlVar, 4);
        }
        if (fAcquireDistance < 3.0d) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "distance < THREE_KM");
            return;
        }
        Map<Double, Double> mapAcquirePartTimeMap = trackData.acquirePartTimeMap();
        if (mapAcquirePartTimeMap == null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "map is null");
        } else {
            if (d(singleDayRecord, mapAcquirePartTimeMap, trackData, otlVar)) {
                return;
            }
            b(singleDayRecord, mapAcquirePartTimeMap, trackData, otlVar);
        }
    }

    private static boolean d(SingleDayRecord singleDayRecord, Map<Double, Double> map, TrackData trackData, otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "Enter acquireBestRunPace.");
        Double dValueOf = Double.valueOf(3.0d);
        if (map.get(dValueOf) != null) {
            double dDoubleValue = map.get(dValueOf).doubleValue();
            ozn oznVarB = paw.b(singleDayRecord.acquireBestRun3KMPace());
            if (oznVarB != null) {
                LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRunType acquireBestRun3KMPace.");
                if (paw.b(dDoubleValue, oznVarB.e()) < 0) {
                    d(trackData, dDoubleValue, otlVar, singleDayRecord, 5);
                }
            } else {
                d(dDoubleValue, singleDayRecord, trackData, otlVar, 5);
            }
            if (map.get(Double.valueOf(5.0d)) != null) {
                double dDoubleValue2 = map.get(Double.valueOf(5.0d)).doubleValue();
                ozn oznVarB2 = paw.b(singleDayRecord.acquireBestRun5KMPace());
                if (oznVarB2 != null) {
                    LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRunType acquireBestRun5KMPace.");
                    if (paw.b(dDoubleValue2, oznVarB2.e()) < 0) {
                        d(trackData, dDoubleValue2, otlVar, singleDayRecord, 6);
                    }
                } else {
                    d(dDoubleValue2, singleDayRecord, trackData, otlVar, 6);
                }
                if (map.get(Double.valueOf(10.0d)) != null) {
                    double dDoubleValue3 = map.get(Double.valueOf(10.0d)).doubleValue();
                    ozn oznVarB3 = paw.b(singleDayRecord.acquireBestRun10KMPace());
                    if (oznVarB3 != null) {
                        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRunType acquireBestRun10KMPace.");
                        if (paw.b(dDoubleValue3, oznVarB3.e()) >= 0) {
                            return false;
                        }
                        d(trackData, dDoubleValue3, otlVar, singleDayRecord, 7);
                        return false;
                    }
                    d(dDoubleValue3, singleDayRecord, trackData, otlVar, 7);
                    return false;
                }
                LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "BestMotionPace TEN_KM is null.");
                return true;
            }
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "BestMotionPace FIVE_KM is null.");
            return true;
        }
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "BestMotionPace THREE_KM is null.");
        return true;
    }

    private static boolean b(SingleDayRecord singleDayRecord, Map<Double, Double> map, TrackData trackData, otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "Enter dealMarathonType.");
        Double dValueOf = Double.valueOf(21.0975d);
        if (map.get(dValueOf) == null) {
            return true;
        }
        double dDoubleValue = map.get(dValueOf).doubleValue();
        ozn oznVarB = paw.b(singleDayRecord.acquireBestRunHMPace());
        if (oznVarB != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(oznVarB.c()));
            if (paw.b(dDoubleValue, oznVarB.e()) < 0 && oznVarB.c() != trackData.acquireTrackTime()) {
                d(trackData, dDoubleValue, otlVar, singleDayRecord, 8);
            }
        } else {
            d(dDoubleValue, singleDayRecord, trackData, otlVar, 8);
        }
        if (map.get(Double.valueOf(42.195d)) == null) {
            return true;
        }
        double dDoubleValue2 = map.get(Double.valueOf(42.195d)).doubleValue();
        ozn oznVarB2 = paw.b(singleDayRecord.acquireBestRunFMPace());
        if (oznVarB2 != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(oznVarB2.c()));
            if (paw.b(dDoubleValue2, oznVarB2.e()) >= 0 || oznVarB2.c() == trackData.acquireTrackTime()) {
                return false;
            }
            d(trackData, dDoubleValue2, otlVar, singleDayRecord, 9);
            return false;
        }
        d(dDoubleValue2, singleDayRecord, trackData, otlVar, 9);
        return false;
    }

    private static void i(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "Enter dealWalkType");
        float fAcquireDistance = trackData.acquireDistance();
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestWalkDistance());
        if (ozmVarC != null && trackData.acquireTrackTime() != ozmVarC.d()) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            if (paw.a(((double) fAcquireDistance) * 1.0d, ozmVarC.c() * 1.0d) > 0) {
                d(trackData, otlVar, singleDayRecord, 1);
                return;
            }
            return;
        }
        b(trackData, singleDayRecord, otlVar, 1);
    }

    public static void e(Context context, ArrayList<TrackData> arrayList) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "Enter dealRopeType");
        if (context == null || njy.e(arrayList)) {
            return;
        }
        otl otlVarB = otl.b(context.getApplicationContext());
        if (TextUtils.isEmpty(osa.e(context, "personal"))) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "flag is null");
            return;
        }
        osf osfVarB = otlVarB.b(2, new HashMap(2));
        SingleDayRecord singleDayRecord = osfVarB instanceof SingleDayRecord ? (SingleDayRecord) osfVarB : null;
        if (singleDayRecord == null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "singleDayRecord is null");
            return;
        }
        TrackData trackData = arrayList.get(0);
        TrackData trackData2 = arrayList.get(0);
        TrackData trackData3 = arrayList.get(0);
        TrackData trackData4 = arrayList.get(0);
        for (TrackData trackData5 : arrayList) {
            if (oun.e(trackData5.acquireType())) {
                if (trackData5.acquireTrackNum() > trackData.acquireTrackNum()) {
                    trackData = trackData5;
                }
                if (trackData5.getMaxSkippingTimes() > trackData2.getMaxSkippingTimes()) {
                    trackData2 = trackData5;
                }
                if (trackData5.getSkipSpeed() > trackData3.getSkipSpeed()) {
                    trackData3 = trackData5;
                }
                if (trackData5.getTotalTime() > trackData4.getTotalTime()) {
                    trackData4 = trackData5;
                }
            }
        }
        d(singleDayRecord, trackData, otlVarB);
        a(singleDayRecord, trackData2, otlVarB);
        b(singleDayRecord, trackData3, otlVarB);
        e(singleDayRecord, trackData4, otlVarB);
    }

    private static void e(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        if (trackData == null || !oun.e(trackData.acquireType())) {
            return;
        }
        long totalTime = trackData.getTotalTime() / 1000;
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeDurationType originalTime ", Long.valueOf(totalTime));
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestRopeDuration());
        if (ozmVarC != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            if (totalTime > ozmVarC.c()) {
                d(trackData, otlVar, singleDayRecord, 15, totalTime);
                return;
            }
            return;
        }
        LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeSpeedType bestMotion is null.");
        a(trackData, singleDayRecord, otlVar, 15, totalTime);
    }

    private static void b(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        if (trackData == null || !oun.e(trackData.acquireType())) {
            return;
        }
        int skipSpeed = trackData.getSkipSpeed();
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeSpeedType originalNum ", Integer.valueOf(skipSpeed));
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestRopeSpeed());
        if (ozmVarC != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            long j = skipSpeed;
            if (j > ozmVarC.c()) {
                d(trackData, otlVar, singleDayRecord, 14, j);
                return;
            }
            return;
        }
        LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeSpeedType bestMotion is null.");
        a(trackData, singleDayRecord, otlVar, 14, skipSpeed);
    }

    private static void d(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        if (trackData == null || !oun.e(trackData.acquireType())) {
            return;
        }
        int iAcquireTrackNum = trackData.acquireTrackNum();
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeSingCountType originalNum ", Integer.valueOf(iAcquireTrackNum));
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestRopeSingCount());
        if (ozmVarC != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            long j = iAcquireTrackNum;
            if (j > ozmVarC.c()) {
                d(trackData, otlVar, singleDayRecord, 12, j);
                return;
            }
            return;
        }
        LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeSingCountType bestMotion is null.");
        a(trackData, singleDayRecord, otlVar, 12, iAcquireTrackNum);
    }

    private static void a(SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar) {
        if (trackData == null || !oun.e(trackData.acquireType())) {
            return;
        }
        int maxSkippingTimes = trackData.getMaxSkippingTimes();
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeContinuousCountType originalNum ", Integer.valueOf(maxSkippingTimes));
        ozm ozmVarC = paw.c(singleDayRecord.acquireBestRopeContinuousCount());
        if (ozmVarC != null) {
            LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "acquireTrackTime:", Long.valueOf(trackData.acquireTrackTime()), " bestMotionStartTime:", Long.valueOf(ozmVarC.d()));
            long j = maxSkippingTimes;
            if (j > ozmVarC.c()) {
                d(trackData, otlVar, singleDayRecord, 13, j);
                return;
            }
            return;
        }
        LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "dealRopeContinuousCountType bestMotion is null.");
        a(trackData, singleDayRecord, otlVar, 13, maxSkippingTimes);
    }

    private static void d(TrackData trackData, otl otlVar, SingleDayRecord singleDayRecord, int i) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal showReportDistanceDialog type:", Integer.valueOf(i), " value ", Float.valueOf(trackData.acquireDistance()));
        if (c(trackData.acquireTrackTime())) {
            LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "showReportPaceDialog  exceeds 30 days, time ", Long.valueOf(trackData.acquireTrackTime()));
            return;
        }
        ozm ozmVar = new ozm();
        ozmVar.c((long) trackData.acquireDistance());
        ozmVar.d(trackData.acquireTrackTime());
        ozmVar.e(trackData.acquireEndTime());
        ozmVar.b(0);
        ozmVar.a(0L);
        otlVar.a(paw.d(i, singleDayRecord, paw.e(paw.a(i, singleDayRecord), ozmVar)));
        String strValueOf = String.valueOf(paw.c((long) trackData.acquireDistance()));
        if (UnitUtil.f()) {
            strValueOf = String.valueOf(paw.a((long) trackData.acquireDistance()));
        }
        otlVar.c(i, strValueOf, trackData.acquireTrackTime());
    }

    private static void d(TrackData trackData, double d, otl otlVar, SingleDayRecord singleDayRecord, int i) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal showReportPaceDialog type:", Integer.valueOf(i), " pace ", Double.valueOf(d));
        if (paw.b(d, 0.0d) <= 0) {
            LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal showReportPaceDialog pace <= 0, return.");
            return;
        }
        if (c(trackData.acquireTrackTime())) {
            LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "showReportPaceDialog  exceeds 30 days, time ", Long.valueOf(trackData.acquireTrackTime()));
            return;
        }
        ozn oznVar = new ozn();
        oznVar.c(d);
        oznVar.a(trackData.acquireTrackTime());
        oznVar.e(trackData.acquireEndTime());
        oznVar.c(0);
        oznVar.c(0L);
        otlVar.a(paw.d(i, singleDayRecord, paw.e(paw.a(i, singleDayRecord), oznVar)));
        if (paw.b(i)) {
            otlVar.c(i, paw.a(d), trackData.acquireTrackTime());
        } else {
            otlVar.c(i, paw.d((int) (d + 0.5d)), trackData.acquireTrackTime());
        }
    }

    private static boolean c(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "showReportDialog trackTime ", Long.valueOf(j), " interval ", Long.valueOf(jCurrentTimeMillis));
        if (jCurrentTimeMillis <= 2592000000L) {
            return false;
        }
        LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "showReportDialog the trackTime exceeds 30 days, return!");
        return true;
    }

    private static void a(TrackData trackData, SingleDayRecord singleDayRecord, otl otlVar, int i, long j) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal refreshRopeMotionData type:", Integer.valueOf(i), " num ", Long.valueOf(j));
        ozm ozmVar = new ozm();
        ozmVar.c(j);
        ozmVar.d(trackData.acquireTrackTime());
        ozmVar.e(trackData.acquireEndTime());
        ozmVar.b(0);
        ozmVar.a(0L);
        otlVar.a(paw.d(i, singleDayRecord, paw.e(ozmVar) == null ? "" : paw.d(paw.e(ozmVar))));
    }

    private static void d(TrackData trackData, otl otlVar, SingleDayRecord singleDayRecord, int i, long j) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal showReportRopeDialog type:", Integer.valueOf(i), " num ", Long.valueOf(j));
        if (c(trackData.acquireTrackTime())) {
            LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "showReportRopeDialog  exceeds 30 days, time ", Long.valueOf(trackData.acquireTrackTime()));
            return;
        }
        ozm ozmVar = new ozm();
        ozmVar.c(j);
        ozmVar.d(trackData.acquireTrackTime());
        ozmVar.e(trackData.acquireEndTime());
        ozmVar.b(0);
        ozmVar.a(0L);
        otlVar.a(paw.d(i, singleDayRecord, paw.e(paw.a(i, singleDayRecord), ozmVar)));
        otlVar.c(i, String.valueOf(j), trackData.acquireTrackTime());
    }

    private static void b(TrackData trackData, SingleDayRecord singleDayRecord, otl otlVar, int i) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal refreshMotionDistance type:", Integer.valueOf(i), " value ", Float.valueOf(trackData.acquireDistance()));
        ozm ozmVar = new ozm();
        ozmVar.c((long) trackData.acquireDistance());
        ozmVar.d(trackData.acquireTrackTime());
        ozmVar.e(trackData.acquireEndTime());
        ozmVar.b(0);
        ozmVar.a(0L);
        otlVar.a(paw.d(i, singleDayRecord, paw.e(ozmVar) == null ? "" : paw.d(paw.e(ozmVar))));
    }

    private static void d(double d, SingleDayRecord singleDayRecord, TrackData trackData, otl otlVar, int i) {
        LogUtil.a("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal refreshMotionPaceData type:", Integer.valueOf(i), " pace ", Double.valueOf(d));
        if (paw.b(d, 0.0d) <= 0) {
            LogUtil.j("PLGACHIEVE_AchieveSurmountRecordService", "myAchieveLocal refreshMotionPaceData pace <= 0, return.");
            return;
        }
        ozn oznVar = new ozn();
        oznVar.c(d);
        oznVar.a(trackData.acquireTrackTime());
        oznVar.e(trackData.acquireEndTime());
        oznVar.c(0);
        oznVar.c(0L);
        otlVar.a(paw.d(i, singleDayRecord, paw.c(oznVar) == null ? "" : paw.d(paw.c(oznVar))));
    }
}
