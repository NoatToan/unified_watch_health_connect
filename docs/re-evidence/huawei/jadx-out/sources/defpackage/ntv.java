package defpackage;

import android.text.TextUtils;
import com.amap.api.location.AMapLocation;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class ntv {
    public static void a(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify) {
        if (hiHealthData == null || hiHealthData.getMetaData() == null) {
            LogUtil.e("Track_SportDataConvertUtil", "convertHiDataToMergeTrackData hiHealthData is invalidate data");
            return;
        }
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class);
        if (hiTrackMetaData == null) {
            LogUtil.e("Track_SportDataConvertUtil", "trackMetaData is null");
            return;
        }
        a(hiHealthData, motionPathSimplify, hiTrackMetaData);
        if ("AMAP".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplify.saveMapType(1);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplify.saveMapCoordinate(AMapLocation.COORD_TYPE_GCJ02);
            }
        } else if ("GOOGLE".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplify.saveMapType(2);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplify.saveMapCoordinate(AMapLocation.COORD_TYPE_WGS84);
            }
        } else if (!Constants.HMS.equals(hiTrackMetaData.getVendor())) {
            LogUtil.d("Track_SportDataConvertUtil", "should not enter this branch,do not set");
        } else {
            motionPathSimplify.saveMapType(3);
            motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
        }
        d(motionPathSimplify, hiTrackMetaData);
    }

    public static String b(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify) {
        if (hiHealthData == null) {
            LogUtil.e("Track_SportDataConvertUtil", "convertHiDataToTrackData hiHealthData is null");
            return null;
        }
        String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
        if (sequenceFileUrl == null) {
            return null;
        }
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(hiHealthData.getMetaData(), HiTrackMetaData.class);
        a(hiHealthData, motionPathSimplify, hiTrackMetaData);
        if ("AMAP".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplify.saveMapType(1);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplify.saveMapCoordinate(AMapLocation.COORD_TYPE_GCJ02);
            }
        } else if ("GOOGLE".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplify.saveMapType(2);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplify.saveMapCoordinate(AMapLocation.COORD_TYPE_WGS84);
            }
        } else if (!Constants.HMS.equals(hiTrackMetaData.getVendor())) {
            LogUtil.d("Track_SportDataConvertUtil", "should not enter this branch,do not set");
        } else {
            motionPathSimplify.saveMapType(3);
            motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
        }
        d(motionPathSimplify, hiTrackMetaData);
        return sequenceFileUrl;
    }

    private static void d(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        motionPathSimplify.saveIsNewCoordinate(hiTrackMetaData.getIsNewCoordinate());
        motionPathSimplify.saveSwimSegments(hiTrackMetaData.getSwimSegments());
        motionPathSimplify.saveBritishSwimSegments(hiTrackMetaData.getBritishSwimSegments());
        motionPathSimplify.saveSwolfBase(hiTrackMetaData.getSwolfBase());
        motionPathSimplify.saveBritishSwolfBase(hiTrackMetaData.getBritishSwolfBase());
        motionPathSimplify.saveMaxAltitude(hiTrackMetaData.getMaxAlti());
        motionPathSimplify.saveMinAltitude(hiTrackMetaData.getMinAlti());
        motionPathSimplify.saveTotalDescent(hiTrackMetaData.getTotalDescent());
        motionPathSimplify.saveFreeMotion(hiTrackMetaData.getIsFreeMotion());
        motionPathSimplify.saveSportDataSource(hiTrackMetaData.getSportDataSource());
        motionPathSimplify.saveChiefSportDataType(hiTrackMetaData.getChiefSportDataType());
        motionPathSimplify.saveHasTrackPoint(hiTrackMetaData.getHasTrackPoint());
        motionPathSimplify.saveAbnormalTrack(hiTrackMetaData.getAbnormalTrack());
        b(motionPathSimplify, hiTrackMetaData);
        motionPathSimplify.saveExtendDataMap(hiTrackMetaData.getExtendTrackMap());
        motionPathSimplify.saveDuplicated(hiTrackMetaData.getDuplicated());
        motionPathSimplify.saveHeartRateZoneType(hiTrackMetaData.getHeartrateZoneType());
        motionPathSimplify.saveRunCourseId(hiTrackMetaData.getRuncourseId());
        motionPathSimplify.saveChildSportItems(hiTrackMetaData.getChildSportItems());
        motionPathSimplify.saveFatherSportItem(hiTrackMetaData.getFatherSportItem());
        motionPathSimplify.saveMaxSpo2(hiTrackMetaData.getMaxSpo2());
        motionPathSimplify.saveMinSpo2(hiTrackMetaData.getMinSpo2());
    }

    private static void a(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        motionPathSimplify.saveTrackType(hiTrackMetaData.getTrackType());
        motionPathSimplify.saveTotalTime(hiTrackMetaData.getTotalTime());
        motionPathSimplify.saveTotalDistance(hiTrackMetaData.getTotalDistance());
        motionPathSimplify.saveAvgHeartRate(hiTrackMetaData.getAvgHeartRate());
        motionPathSimplify.saveAvgStepRate(hiTrackMetaData.getAvgStepRate());
        motionPathSimplify.saveTotalCalories(hiTrackMetaData.getTotalCalories());
        motionPathSimplify.saveSportId(hiTrackMetaData.getSportId());
        motionPathSimplify.saveSportType(hiTrackMetaData.getSportType());
        motionPathSimplify.saveTotalSteps(hiTrackMetaData.getTotalSteps());
        motionPathSimplify.saveBestStepRate(hiTrackMetaData.getBestStepRate());
        motionPathSimplify.saveMaxHeartRate(hiTrackMetaData.getMaxHeartRate());
        motionPathSimplify.saveEndTime(hiHealthData.getEndTime());
        motionPathSimplify.saveStartTime(hiHealthData.getStartTime());
        motionPathSimplify.saveSportData(hiTrackMetaData.getWearSportData());
        d(hiTrackMetaData, motionPathSimplify);
    }

    private static void b(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        motionPathSimplify.saveAverageHangTime(hiTrackMetaData.requestAverageHangTime());
        motionPathSimplify.saveGroundHangTimeRate(hiTrackMetaData.requestGroundHangTimeRate());
        motionPathSimplify.saveAvgGroundContactTime(hiTrackMetaData.getAvgGroundContactTime());
        motionPathSimplify.saveAvgGroundImpactAcceleration(hiTrackMetaData.getAvgGroundImpactAcceleration());
        motionPathSimplify.saveAvgEversionExcursion(hiTrackMetaData.getAvgEversionExcursion());
        motionPathSimplify.saveAvgSwingAngle(hiTrackMetaData.getAvgSwingAngle());
        motionPathSimplify.saveAvgForeFootStrikePattern(hiTrackMetaData.getAvgForeFootStrikePattern());
        motionPathSimplify.saveAvgWholeFootStrikePattern(hiTrackMetaData.getAvgWholeFootStrikePattern());
        motionPathSimplify.saveAvgHindFootStrikePattern(hiTrackMetaData.getAvgHindFootStrikePattern());
    }

    public static MotionPathSimplify d(HiHealthData hiHealthData) {
        String metaData = hiHealthData.getMetaData();
        if (TextUtils.isEmpty(metaData)) {
            LogUtil.e("Track_SportDataConvertUtil", "metaData is empty");
            return null;
        }
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) qqt.e(metaData, HiTrackMetaData.class);
        if (hiTrackMetaData == null) {
            LogUtil.e("Track_SportDataConvertUtil", "trackMetaData is null");
            return null;
        }
        MotionPathSimplify motionPathSimplifyC = c(hiHealthData, hiTrackMetaData);
        if ("AMAP".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplifyC.saveMapType(1);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplifyC.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplifyC.saveMapCoordinate(AMapLocation.COORD_TYPE_GCJ02);
            }
        } else if ("GOOGLE".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplifyC.saveMapType(2);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplifyC.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplifyC.saveMapCoordinate(AMapLocation.COORD_TYPE_WGS84);
            }
        } else if (Constants.HMS.equals(hiTrackMetaData.getVendor())) {
            motionPathSimplifyC.saveMapType(3);
            motionPathSimplifyC.saveMapCoordinate(hiTrackMetaData.getCoordinate());
        } else {
            LogUtil.d("Track_SportDataConvertUtil", "should not enter this branch,do not set");
        }
        motionPathSimplifyC.saveIsNewCoordinate(hiTrackMetaData.getIsNewCoordinate());
        motionPathSimplifyC.saveFreeMotion(hiTrackMetaData.getIsFreeMotion());
        motionPathSimplifyC.saveSportDataSource(hiTrackMetaData.getSportDataSource());
        motionPathSimplifyC.saveChiefSportDataType(hiTrackMetaData.getChiefSportDataType());
        motionPathSimplifyC.saveHasTrackPoint(hiTrackMetaData.getHasTrackPoint());
        motionPathSimplifyC.saveAbnormalTrack(hiTrackMetaData.getAbnormalTrack());
        motionPathSimplifyC.saveSwolfBase(hiTrackMetaData.getSwolfBase());
        motionPathSimplifyC.saveBritishSwolfBase(hiTrackMetaData.getBritishSwolfBase());
        motionPathSimplifyC.saveMaxAltitude(hiTrackMetaData.getMaxAlti());
        motionPathSimplifyC.saveMinAltitude(hiTrackMetaData.getMinAlti());
        motionPathSimplifyC.saveTotalDescent(hiTrackMetaData.getTotalDescent());
        motionPathSimplifyC.saveSwimSegments(hiTrackMetaData.getSwimSegments());
        motionPathSimplifyC.saveBritishSwimSegments(hiTrackMetaData.getBritishSwimSegments());
        motionPathSimplifyC.saveDuplicated(hiTrackMetaData.getDuplicated());
        motionPathSimplifyC.saveHeartRateZoneType(hiTrackMetaData.getHeartrateZoneType());
        motionPathSimplifyC.saveRunCourseId(hiTrackMetaData.getRuncourseId());
        b(motionPathSimplifyC, hiTrackMetaData);
        motionPathSimplifyC.saveExtendDataMap(hiTrackMetaData.getExtendTrackMap());
        motionPathSimplifyC.saveChildSportItems(hiTrackMetaData.getChildSportItems());
        motionPathSimplifyC.saveFatherSportItem(hiTrackMetaData.getFatherSportItem());
        motionPathSimplifyC.saveMaxSpo2(hiTrackMetaData.getMaxSpo2());
        motionPathSimplifyC.saveMinSpo2(hiTrackMetaData.getMinSpo2());
        return motionPathSimplifyC;
    }

    private static MotionPathSimplify c(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData) {
        MotionPathSimplify motionPathSimplify = new MotionPathSimplify();
        motionPathSimplify.saveTrackType(hiTrackMetaData.getTrackType());
        motionPathSimplify.saveTotalTime(hiTrackMetaData.getTotalTime());
        motionPathSimplify.saveTotalDistance(hiTrackMetaData.getTotalDistance());
        motionPathSimplify.saveAvgHeartRate(hiTrackMetaData.getAvgHeartRate());
        motionPathSimplify.saveAvgStepRate(hiTrackMetaData.getAvgStepRate());
        motionPathSimplify.saveTotalCalories(hiTrackMetaData.getTotalCalories());
        motionPathSimplify.saveSportId(hiTrackMetaData.getSportId());
        motionPathSimplify.saveSportType(hiTrackMetaData.getSportType());
        motionPathSimplify.saveTotalSteps(hiTrackMetaData.getTotalSteps());
        motionPathSimplify.saveBestStepRate(hiTrackMetaData.getBestStepRate());
        motionPathSimplify.saveMaxHeartRate(hiTrackMetaData.getMaxHeartRate());
        motionPathSimplify.saveEndTime(hiHealthData.getEndTime());
        motionPathSimplify.saveStartTime(hiHealthData.getStartTime());
        motionPathSimplify.saveSportData(hiTrackMetaData.getWearSportData());
        d(hiTrackMetaData, motionPathSimplify);
        return motionPathSimplify;
    }

    private static void d(HiTrackMetaData hiTrackMetaData, MotionPathSimplify motionPathSimplify) {
        motionPathSimplify.saveAvgPace(hiTrackMetaData.getAvgPace());
        motionPathSimplify.saveBestPace(hiTrackMetaData.getBestPace());
        motionPathSimplify.savePaceMap(hiTrackMetaData.getPaceMap());
        motionPathSimplify.saveBritishPaceMap(hiTrackMetaData.getBritishPaceMap());
        motionPathSimplify.savePartTimeMap(hiTrackMetaData.getPartTimeMap());
        motionPathSimplify.saveBritishPartTimeMap(hiTrackMetaData.getBritishPartTimeMap());
        motionPathSimplify.saveCreepingWave(hiTrackMetaData.getCreepingWave());
    }
}
