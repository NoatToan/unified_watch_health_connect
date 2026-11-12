package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.data.model.HiTrackMetaData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import com.huawei.skinner.internal.OnRegisterSkinAttrsListener;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.SportIntensityUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public class xjv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static pqo f53129a;

    private static int a(int i) {
        if (i == 273 || i == 274) {
            return 20001;
        }
        if (i == 281) {
            return 20002;
        }
        switch (i) {
            case 257:
                return 20002;
            case 258:
                return 20003;
            case 259:
                return 20005;
            case 260:
            case 261:
                return 20004;
            case 262:
                return 20007;
            default:
                switch (i) {
                    case 264:
                        return 20003;
                    case OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE /* 265 */:
                        return 20005;
                    case OldToNewMotionPath.SPORT_TYPE_OPEN_AREA_SWIM /* 266 */:
                        return 20007;
                    default:
                        return 20001;
                }
        }
    }

    public static void d(Context context, MotionPathSimplify motionPathSimplify, String str, HiDataInsertOption hiDataInsertOption) {
        String androidId;
        if (context == null || motionPathSimplify == null || hiDataInsertOption == null) {
            LogUtil.j("Track_PluginHealthTrackUtil", "convertTrackDataToHiData context == null || simplifyData == null|| option == null");
            return;
        }
        HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
        d(motionPathSimplify, hiTrackMetaData);
        if (motionPathSimplify.requestMapType() == 1) {
            hiTrackMetaData.setVendor("AMAP");
        } else if (motionPathSimplify.requestMapType() == 2) {
            hiTrackMetaData.setVendor("GOOGLE");
        } else if (motionPathSimplify.requestMapType() != 3) {
            LogUtil.d("Track_PluginHealthTrackUtil", "should not enter this branch,do not set");
        } else {
            hiTrackMetaData.setVendor(Constants.HMS);
        }
        hiTrackMetaData.setCoordinate(motionPathSimplify.requestMapCoordinate());
        hiTrackMetaData.setIsNewCoordinate(motionPathSimplify.isNewCoordinate());
        hiTrackMetaData.setTotalDescent(motionPathSimplify.requestTotalDescent());
        hiTrackMetaData.setMaxAlti(motionPathSimplify.requestMaxAltitude());
        hiTrackMetaData.setMinAlti(motionPathSimplify.requestMinAltitude());
        c(motionPathSimplify, hiTrackMetaData);
        b(motionPathSimplify, hiTrackMetaData);
        hiTrackMetaData.setChildSportItems(motionPathSimplify.requestChildSportItems());
        hiTrackMetaData.setFatherSportItem(motionPathSimplify.requestFatherSportItem());
        hiTrackMetaData.setMaxSpo2(motionPathSimplify.requestMaxSpo2());
        hiTrackMetaData.setMinSpo2(motionPathSimplify.requestMinSpo2());
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setStartTime(motionPathSimplify.requestStartTime());
        hiHealthData.setEndTime(motionPathSimplify.requestEndTime());
        hiHealthData.setType(OnRegisterSkinAttrsListener.REGISTER_BY_SCAN);
        hiHealthData.setSequenceFileUrl(str);
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.serializeSpecialFloatingPointValues();
        hiHealthData.setMetaData(gsonBuilder.create().toJson(hiTrackMetaData, HiTrackMetaData.class));
        if (!TextUtils.isEmpty(motionPathSimplify.requestDeviceUuid())) {
            androidId = motionPathSimplify.requestDeviceUuid();
        } else {
            androidId = FoundationCommonUtil.getAndroidId(context);
        }
        hiHealthData.setDeviceUuid(androidId);
        hiDataInsertOption.addData(hiHealthData);
    }

    private static void d(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        hiTrackMetaData.setAvgStepRate(motionPathSimplify.requestAvgStepRate());
        hiTrackMetaData.setAvgHeartRate(motionPathSimplify.requestAvgHeartRate());
        hiTrackMetaData.setAvgPace(motionPathSimplify.requestAvgPace());
        hiTrackMetaData.setBestPace(motionPathSimplify.requestBestPace());
        hiTrackMetaData.setPaceMap(motionPathSimplify.requestPaceMap());
        hiTrackMetaData.setBritishPaceMap(motionPathSimplify.requestBritishPaceMap());
        hiTrackMetaData.setPartTimeMap(motionPathSimplify.requestPartTimeMap());
        hiTrackMetaData.setBritishPartTimeMap(motionPathSimplify.requestBritishPartTimeMap());
        hiTrackMetaData.setBestStepRate(motionPathSimplify.requestBestStepRate());
        hiTrackMetaData.setMaxHeartRate(motionPathSimplify.requestMaxHeartRate());
        a(motionPathSimplify, hiTrackMetaData);
        hiTrackMetaData.setTotalSteps(motionPathSimplify.requestTotalSteps());
        hiTrackMetaData.setWearSportData(motionPathSimplify.requestSportData());
        hiTrackMetaData.setExtendTrackDataMap(motionPathSimplify.requestExtendDataMap());
        hiTrackMetaData.setCreepingWave(motionPathSimplify.requestCreepingWave());
        hiTrackMetaData.setMinHeartRate(motionPathSimplify.requestMinHeartRate());
        hiTrackMetaData.setCreepingWave(motionPathSimplify.requestCreepingWave());
        hiTrackMetaData.setRuncourseId(motionPathSimplify.requestRunCourseId());
    }

    private static void a(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        hiTrackMetaData.setSportId(motionPathSimplify.requestSportId());
        hiTrackMetaData.setSportType(motionPathSimplify.requestSportType());
        hiTrackMetaData.setTotalCalories(motionPathSimplify.requestTotalCalories());
        hiTrackMetaData.setTotalDistance(motionPathSimplify.requestTotalDistance());
        hiTrackMetaData.setTotalTime(motionPathSimplify.requestTotalTime());
        hiTrackMetaData.setTrackType(motionPathSimplify.requestTrackType());
        hiTrackMetaData.setAbnormalTrack(motionPathSimplify.requestAbnormalTrack());
        hiTrackMetaData.setIsFreeMotion(motionPathSimplify.isFreeMotion());
        hiTrackMetaData.setSportDataSource(motionPathSimplify.requestSportDataSource());
        hiTrackMetaData.setChiefSportDataType(motionPathSimplify.requestChiefSportDataType());
        hiTrackMetaData.setHasTrackPoint(motionPathSimplify.hasTrackPoint());
        hiTrackMetaData.setDuplicated(motionPathSimplify.requestDuplicated());
        hiTrackMetaData.setHeartrateZoneType(motionPathSimplify.requestHeartRateZoneType());
    }

    private static void b(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        hiTrackMetaData.saveAverageHangTime(motionPathSimplify.requestAverageHangTime());
        hiTrackMetaData.saveGroundHangTimeRate(motionPathSimplify.requestGroundHangTimeRate());
        hiTrackMetaData.setAvgGroundContactTime(motionPathSimplify.requestAvgGroundContactTime());
        hiTrackMetaData.setAvgGroundImpactAcceleration(motionPathSimplify.requestAvgGroundImpactAcceleration());
        hiTrackMetaData.setAvgEversionExcursion(motionPathSimplify.requestAvgEversionExcursion());
        hiTrackMetaData.setAvgSwingAngle(motionPathSimplify.requestAvgSwingAngle());
        hiTrackMetaData.setAvgForeFootStrikePattern(motionPathSimplify.requestAvgForeFootStrikePattern());
        hiTrackMetaData.setAvgWholeFootStrikePattern(motionPathSimplify.requestAvgWholeFootStrikePattern());
        hiTrackMetaData.setAvgHindFootStrikePattern(motionPathSimplify.requestAvgHindFootStrikePattern());
    }

    public static void c(Context context, MotionPathSimplify motionPathSimplify, MotionPath motionPath, HiDataInsertOption hiDataInsertOption) {
        if (context == null || motionPathSimplify == null || motionPath == null || hiDataInsertOption == null) {
            LogUtil.j("Track_PluginHealthTrackUtil", "convertHealthTrackDataToHiData context == null", " || simplifyData == null || motionData == null || option == null");
            return;
        }
        HiTrackMetaData hiTrackMetaData = new HiTrackMetaData();
        e(motionPathSimplify, hiTrackMetaData);
        if (motionPathSimplify.requestMapType() == 1) {
            hiTrackMetaData.setVendor("AMAP");
        } else if (motionPathSimplify.requestMapType() == 2) {
            hiTrackMetaData.setVendor("GOOGLE");
        } else if (motionPathSimplify.requestMapType() != 3) {
            LogUtil.d("Track_PluginHealthTrackUtil", "should not enter this branch,do not set");
        } else {
            hiTrackMetaData.setVendor(Constants.HMS);
        }
        hiTrackMetaData.setCoordinate(motionPathSimplify.requestMapCoordinate());
        hiTrackMetaData.setIsNewCoordinate(motionPathSimplify.isNewCoordinate());
        hiTrackMetaData.setCreepingWave(motionPathSimplify.requestCreepingWave());
        c(motionPathSimplify, hiTrackMetaData);
        hiTrackMetaData.setTotalDescent(motionPathSimplify.requestTotalDescent());
        hiTrackMetaData.setMaxAlti(motionPathSimplify.requestMaxAltitude());
        hiTrackMetaData.setMinAlti(motionPathSimplify.requestMinAltitude());
        b(motionPathSimplify, hiTrackMetaData);
        hiTrackMetaData.setChildSportItems(motionPathSimplify.requestChildSportItems());
        hiTrackMetaData.setFatherSportItem(motionPathSimplify.requestFatherSportItem());
        hiTrackMetaData.setMaxSpo2(motionPathSimplify.requestMaxSpo2());
        hiTrackMetaData.setMinSpo2(motionPathSimplify.requestMinSpo2());
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setStartTime(motionPathSimplify.requestStartTime());
        hiHealthData.setEndTime(motionPathSimplify.requestEndTime());
        hiHealthData.setType(30001);
        hiHealthData.setSequenceData(motionPath.toString());
        hiHealthData.setMetaData(new Gson().toJson(hiTrackMetaData, HiTrackMetaData.class));
        hiHealthData.setDeviceUuid(FoundationCommonUtil.getAndroidId(context));
        hiDataInsertOption.addData(hiHealthData);
    }

    private static void e(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        a(motionPathSimplify, hiTrackMetaData);
        hiTrackMetaData.setAvgStepRate(motionPathSimplify.requestAvgStepRate());
        hiTrackMetaData.setAvgHeartRate(motionPathSimplify.requestAvgHeartRate());
        hiTrackMetaData.setPaceMap(motionPathSimplify.requestPaceMap());
        hiTrackMetaData.setBritishPaceMap(motionPathSimplify.requestBritishPaceMap());
        hiTrackMetaData.setPartTimeMap(motionPathSimplify.requestPartTimeMap());
        hiTrackMetaData.setBritishPartTimeMap(motionPathSimplify.requestBritishPartTimeMap());
        hiTrackMetaData.setAvgPace(motionPathSimplify.requestAvgPace());
        hiTrackMetaData.setBestPace(motionPathSimplify.requestBestPace());
        hiTrackMetaData.setBestStepRate(motionPathSimplify.requestBestStepRate());
        hiTrackMetaData.setMaxHeartRate(motionPathSimplify.requestMaxHeartRate());
        hiTrackMetaData.setMinHeartRate(motionPathSimplify.requestMinHeartRate());
        hiTrackMetaData.setTotalSteps(motionPathSimplify.requestTotalSteps());
        hiTrackMetaData.setWearSportData(motionPathSimplify.requestSportData());
        hiTrackMetaData.setExtendTrackDataMap(motionPathSimplify.requestExtendDataMap());
        hiTrackMetaData.setCreepingWave(motionPathSimplify.requestCreepingWave());
    }

    private static void c(MotionPathSimplify motionPathSimplify, HiTrackMetaData hiTrackMetaData) {
        hiTrackMetaData.setSwolfBase(motionPathSimplify.requestSwolfBase());
        hiTrackMetaData.setBritishSwolfBase(motionPathSimplify.requestBritishSwolfBase());
        hiTrackMetaData.setSwimSegments(motionPathSimplify.requestSwimSegments());
        hiTrackMetaData.setBritishSwimSegments(motionPathSimplify.requestBritishSwimSegments());
    }

    public static HiSyncOption b() {
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setForceSync(true);
        hiSyncOption.setSyncDataType(2);
        hiSyncOption.setSyncMethod(2);
        return hiSyncOption;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002c A[SYNTHETIC] */
    public static HiDataInsertOption b(Context context, List<jbw> list, int i) {
        boolean z;
        if (context == null || list == null) {
            ReleaseLogUtil.e("Track_PluginHealthTrackUtil", "buildTrackPointDataToHiData context == null || list == null");
            return null;
        }
        ReleaseLogUtil.d("Track_PluginHealthTrackUtil", "buildTrackPointDataToHiData start size() ", Integer.valueOf(list.size()));
        ArrayList arrayList = new ArrayList(16);
        String androidId = FoundationCommonUtil.getAndroidId(context);
        int iA = a(i);
        for (jbw jbwVar : list) {
            if (jbwVar != null) {
                if (Math.abs(jbwVar.d()) > 0.001f) {
                    HiHealthData hiHealthData = new HiHealthData(3);
                    hiHealthData.setTimeInterval(jbwVar.b(), jbwVar.e());
                    hiHealthData.setValue(jbwVar.d());
                    hiHealthData.setDeviceUuid(androidId);
                    arrayList.add(hiHealthData);
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs(jbwVar.c()) > 0.001f) {
                    HiHealthData hiHealthData2 = new HiHealthData(4);
                    hiHealthData2.setTimeInterval(jbwVar.b(), jbwVar.e());
                    hiHealthData2.setValue(jbwVar.c());
                    hiHealthData2.setDeviceUuid(androidId);
                    arrayList.add(hiHealthData2);
                } else {
                    if (z) {
                    }
                    if (b(iA, jbwVar)) {
                        HiHealthData hiHealthData3 = new HiHealthData(7);
                        hiHealthData3.setTimeInterval(jbwVar.b(), jbwVar.e());
                        LogUtil.a("Track_PluginHealthTrackUtil", "buildTrackPointDataToHiData getStartTime ", Long.valueOf(jbwVar.b()));
                        hiHealthData3.setValue(d(iA));
                        hiHealthData3.setDeviceUuid(androidId);
                        arrayList.add(hiHealthData3);
                    }
                }
                HiHealthData hiHealthData4 = new HiHealthData(iA);
                hiHealthData4.setTimeInterval(jbwVar.b(), jbwVar.e());
                hiHealthData4.setValue(0);
                hiHealthData4.setDeviceUuid(androidId);
                arrayList.add(hiHealthData4);
                if (b(iA, jbwVar)) {
                    HiHealthData hiHealthData5 = new HiHealthData(7);
                    hiHealthData5.setTimeInterval(jbwVar.b(), jbwVar.e());
                    LogUtil.a("Track_PluginHealthTrackUtil", "buildTrackPointDataToHiData getStartTime ", Long.valueOf(jbwVar.b()));
                    hiHealthData5.setValue(d(iA));
                    hiHealthData5.setDeviceUuid(androidId);
                    arrayList.add(hiHealthData5);
                }
            }
        }
        ReleaseLogUtil.d("Track_PluginHealthTrackUtil", "buildTrackPointDataToHiData end size() ", Integer.valueOf(arrayList.size()));
        return new HiDataInsertOption(arrayList);
    }

    private static int d(int i) {
        int i2;
        if (i == 20002) {
            i2 = 1;
        } else if (i != 20003) {
            i2 = i != 20005 ? 8 : 3;
        } else {
            i2 = 2;
        }
        if (i2 == 8) {
            LogUtil.e("Track_PluginHealthTrackUtil", "unknown high intensity");
        }
        return i2;
    }

    public static HiDataInsertOption e(Context context, List<jbj> list) {
        String androidId = FoundationCommonUtil.getAndroidId(context);
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        ArrayList arrayList = new ArrayList();
        for (jbj jbjVar : list) {
            if (jbjVar != null) {
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setTimeInterval(jbjVar.a(), jbjVar.b());
                hiHealthData.setValue(8);
                hiHealthData.setType(7);
                hiHealthData.setDeviceUuid(androidId);
                arrayList.add(hiHealthData);
            }
        }
        hiDataInsertOption.setDatas(arrayList);
        return hiDataInsertOption;
    }

    public static HiDataInsertOption c(Context context, List<jbw> list) {
        if (context == null || list == null) {
            LogUtil.j("Track_PluginHealthTrackUtil", "buildTreadmillStepPointDataToHiData context == null || list == null");
            return null;
        }
        ArrayList arrayList = new ArrayList(16);
        String androidId = FoundationCommonUtil.getAndroidId(context);
        for (jbw jbwVar : list) {
            if (jbwVar != null && jbwVar.i() > 0) {
                HiHealthData hiHealthData = new HiHealthData(2);
                hiHealthData.setTimeInterval(jbwVar.b(), jbwVar.e());
                hiHealthData.setValue(jbwVar.i());
                hiHealthData.setDeviceUuid(androidId);
                arrayList.add(hiHealthData);
                HiHealthData hiHealthData2 = new HiHealthData(20003);
                hiHealthData2.setTimeInterval(jbwVar.b(), jbwVar.e());
                hiHealthData2.setValue(0);
                hiHealthData2.setDeviceUuid(androidId);
                arrayList.add(hiHealthData2);
            }
        }
        return new HiDataInsertOption(arrayList);
    }

    private static boolean b(int i, jbw jbwVar) {
        if (i != 20002 && i != 20003 && i != 20005) {
            return false;
        }
        if (f53129a == null) {
            f53129a = SportIntensityUtil.b();
        }
        int iK = f53129a.k();
        if (i == 20005) {
            iK = f53129a.f();
        }
        float f = (iK * 100.0f) / 60.0f;
        LogUtil.a("Track_PluginHealthTrackUtil", "buildTrackPointDataToHiData speed ", Float.valueOf(jbwVar.a()), " speedThreshold ", Float.valueOf(f));
        return Float.compare(jbwVar.a(), f) >= 0;
    }
}
