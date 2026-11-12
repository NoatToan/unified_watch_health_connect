package defpackage;

import com.amap.api.location.AMapLocation;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class nlt {
    public static String c(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify) {
        String sequenceFileUrl = hiHealthData.getSequenceFileUrl();
        if (sequenceFileUrl == null) {
            return null;
        }
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) nlu.b(hiHealthData.getMetaData(), HiTrackMetaData.class);
        d(hiHealthData, motionPathSimplify, hiTrackMetaData);
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
        } else if (Constants.HMS.equals(hiTrackMetaData.getVendor())) {
            motionPathSimplify.saveMapType(3);
            motionPathSimplify.saveMapCoordinate(hiTrackMetaData.getCoordinate());
        } else {
            LogUtil.d("Track_PluginUtil", "should not enter this branch,do not set");
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
        a(motionPathSimplify, hiTrackMetaData);
        motionPathSimplify.saveExtendDataMap(hiTrackMetaData.getExtendTrackMap());
        motionPathSimplify.saveDuplicated(hiTrackMetaData.getDuplicated());
        motionPathSimplify.saveHeartRateZoneType(hiTrackMetaData.getHeartrateZoneType());
        motionPathSimplify.saveRunCourseId(hiTrackMetaData.getRuncourseId());
        motionPathSimplify.saveChildSportItems(hiTrackMetaData.getChildSportItems());
        motionPathSimplify.saveFatherSportItem(hiTrackMetaData.getFatherSportItem());
        motionPathSimplify.saveMaxSpo2(hiTrackMetaData.getMaxSpo2());
        motionPathSimplify.saveMinSpo2(hiTrackMetaData.getMinSpo2());
    }

    private static void d(HiHealthData hiHealthData, MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
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
        e(hiTrackMetaData, motionPathSimplify);
    }

    private static void a(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
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
        HiTrackMetaData hiTrackMetaData = (HiTrackMetaData) nlu.b(hiHealthData.getMetaData(), HiTrackMetaData.class);
        MotionPathSimplify motionPathSimplifyD = d(hiHealthData, hiTrackMetaData);
        if ("AMAP".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplifyD.saveMapType(1);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplifyD.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplifyD.saveMapCoordinate(AMapLocation.COORD_TYPE_GCJ02);
            }
        } else if ("GOOGLE".equals(hiTrackMetaData.getVendor())) {
            motionPathSimplifyD.saveMapType(2);
            if (hiTrackMetaData.getIsNewCoordinate()) {
                motionPathSimplifyD.saveMapCoordinate(hiTrackMetaData.getCoordinate());
            } else {
                motionPathSimplifyD.saveMapCoordinate(AMapLocation.COORD_TYPE_WGS84);
            }
        } else if (Constants.HMS.equals(hiTrackMetaData.getVendor())) {
            motionPathSimplifyD.saveMapType(3);
            motionPathSimplifyD.saveMapCoordinate(hiTrackMetaData.getCoordinate());
        } else {
            LogUtil.d("Track_PluginUtil", "should not enter this branch,do not set");
        }
        motionPathSimplifyD.saveIsNewCoordinate(hiTrackMetaData.getIsNewCoordinate());
        motionPathSimplifyD.saveFreeMotion(hiTrackMetaData.getIsFreeMotion());
        motionPathSimplifyD.saveSportDataSource(hiTrackMetaData.getSportDataSource());
        motionPathSimplifyD.saveChiefSportDataType(hiTrackMetaData.getChiefSportDataType());
        motionPathSimplifyD.saveHasTrackPoint(hiTrackMetaData.getHasTrackPoint());
        motionPathSimplifyD.saveAbnormalTrack(hiTrackMetaData.getAbnormalTrack());
        motionPathSimplifyD.saveSwolfBase(hiTrackMetaData.getSwolfBase());
        motionPathSimplifyD.saveBritishSwolfBase(hiTrackMetaData.getBritishSwolfBase());
        motionPathSimplifyD.saveMaxAltitude(hiTrackMetaData.getMaxAlti());
        motionPathSimplifyD.saveMinAltitude(hiTrackMetaData.getMinAlti());
        motionPathSimplifyD.saveTotalDescent(hiTrackMetaData.getTotalDescent());
        motionPathSimplifyD.saveSwimSegments(hiTrackMetaData.getSwimSegments());
        motionPathSimplifyD.saveBritishSwimSegments(hiTrackMetaData.getBritishSwimSegments());
        motionPathSimplifyD.saveDuplicated(hiTrackMetaData.getDuplicated());
        motionPathSimplifyD.saveHeartRateZoneType(hiTrackMetaData.getHeartrateZoneType());
        motionPathSimplifyD.saveRunCourseId(hiTrackMetaData.getRuncourseId());
        a(motionPathSimplifyD, hiTrackMetaData);
        motionPathSimplifyD.saveExtendDataMap(hiTrackMetaData.getExtendTrackMap());
        motionPathSimplifyD.saveChildSportItems(hiTrackMetaData.getChildSportItems());
        motionPathSimplifyD.saveFatherSportItem(hiTrackMetaData.getFatherSportItem());
        motionPathSimplifyD.saveMaxSpo2(hiTrackMetaData.getMaxSpo2());
        motionPathSimplifyD.saveMinSpo2(hiTrackMetaData.getMinSpo2());
        return motionPathSimplifyD;
    }

    private static MotionPathSimplify d(HiHealthData hiHealthData, HiTrackMetaData hiTrackMetaData) {
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
        e(hiTrackMetaData, motionPathSimplify);
        return motionPathSimplify;
    }

    private static void e(HiTrackMetaData hiTrackMetaData, MotionPathSimplify motionPathSimplify) {
        motionPathSimplify.saveAvgPace(hiTrackMetaData.getAvgPace());
        motionPathSimplify.saveBestPace(hiTrackMetaData.getBestPace());
        motionPathSimplify.savePaceMap(hiTrackMetaData.getPaceMap());
        motionPathSimplify.saveBritishPaceMap(hiTrackMetaData.getBritishPaceMap());
        motionPathSimplify.savePartTimeMap(hiTrackMetaData.getPartTimeMap());
        motionPathSimplify.saveBritishPartTimeMap(hiTrackMetaData.getBritishPartTimeMap());
        motionPathSimplify.saveCreepingWave(hiTrackMetaData.getCreepingWave());
    }
}
