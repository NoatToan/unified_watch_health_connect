package defpackage;

import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiValidatorUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lgs {
    private kwt d;
    private kwi e;

    private lgs() {
        this.e = kwi.b();
        this.d = kwt.b();
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final lgs f40106a = new lgs();
    }

    public static lgs a() {
        return e.f40106a;
    }

    public List<SportDetail> d(List<HiHealthData> list, int i) {
        if (i == 1) {
            return e(list);
        }
        if (i != 3) {
            return null;
        }
        return a(list);
    }

    public List<SportDetail> b(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                List<SamplePoint> listA = a(hiHealthData);
                SportDetail sportDetail = new SportDetail();
                sportDetail.setSamplePoints(listA);
                sportDetail.setStartTime(Long.valueOf(hiHealthData.getStartTime()));
                sportDetail.setEndTime(Long.valueOf(hiHealthData.getEndTime()));
                sportDetail.setTimeZone(hiHealthData.getTimeZone());
                sportDetail.setMetadata(hiHealthData.getMetaData());
                kym kymVarJ = this.d.j(hiHealthData.getClientId());
                if (kymVarJ != null) {
                    sportDetail.setDeviceCode(Long.valueOf(kymVarJ.e()));
                    HiAppInfo hiAppInfoC = this.e.c(kymVarJ.b());
                    if (hiAppInfoC != null) {
                        sportDetail.setAppType(Integer.valueOf(ljp.a(hiAppInfoC.getPackageName())));
                        arrayList.add(sportDetail);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<SamplePoint> a(HiHealthData hiHealthData) {
        ArrayList arrayList = new ArrayList(5);
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        arrayList.add(c(startTime, endTime, "BASIC_STEP", hiHealthData.getDouble("step"), 1));
        arrayList.add(c(startTime, endTime, "BASIC_CALORIE", hiHealthData.getDouble("calorie"), 3));
        arrayList.add(c(startTime, endTime, "BASIC_DISTANCE", hiHealthData.getDouble("distance"), 2));
        arrayList.add(c(startTime, endTime, "BASIC_ALTITUDE", hiHealthData.getDouble("altitude_offset"), 4));
        arrayList.add(c(startTime, endTime, "BASIC_PUSHES_VAL", hiHealthData.getDouble("pushesVal"), 16));
        arrayList.add(c(startTime, endTime, "BASIC_SESSION_TYPE", hiHealthData.getType(), 0));
        return arrayList;
    }

    private SamplePoint c(long j, long j2, String str, double d, int i) {
        SamplePoint samplePoint = new SamplePoint();
        samplePoint.setStartTime(Long.valueOf(j));
        samplePoint.setEndTime(Long.valueOf(j2));
        samplePoint.setUnit(Integer.toString(i));
        samplePoint.setValue(Double.toString(d));
        samplePoint.setKey(str);
        return samplePoint;
    }

    private List<SportDetail> e(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            SportDetail sportDetail = new SportDetail();
            sportDetail.setSportType(Integer.valueOf(lke.e(hiHealthData.getType())));
            SportBasicInfo[] sportBasicInfoArr = new SportBasicInfo[1];
            SportBasicInfo sportBasicInfo = new SportBasicInfo();
            int i = hiHealthData.getInt("step");
            int i2 = hiHealthData.getInt("calorie");
            float f = hiHealthData.getFloat("altitude_offset");
            int i3 = hiHealthData.getInt("distance");
            int i4 = hiHealthData.getInt("pushesVal");
            if (!HiValidatorUtil.b(i) || !HiValidatorUtil.c(i2) || !HiValidatorUtil.d(f) || !HiValidatorUtil.f(i4)) {
                LogUtil.e("Debug_SportDataSwtich", "localSportToCloud data is out of rang data = ", hiHealthData);
            } else {
                sportBasicInfo.configSteps(i);
                sportBasicInfo.configCalorie(i2);
                sportBasicInfo.configAltitude(f / 10.0f);
                sportBasicInfo.configDistance(i3);
                sportBasicInfo.configFloor(0);
                sportBasicInfo.configPushesVal(i4);
                sportBasicInfo.configDuration(1);
                sportBasicInfoArr[0] = sportBasicInfo;
                sportDetail.setSportBasicInfos(sportBasicInfoArr);
                ArrayList arrayList2 = new ArrayList(4);
                if (i > 0 && hiHealthData.getInt("stepMerged") == 0) {
                    arrayList2.add(MedalConstants.EVENT_STEPS);
                }
                if (i2 > 0 && hiHealthData.getInt("calorieMerged") == 0) {
                    arrayList2.add("calorie");
                }
                if (f > 0.0f && hiHealthData.getInt("altitude_offsetMerged") == 0) {
                    arrayList2.add("altitude");
                }
                if (i3 > 0 && hiHealthData.getInt("distanceMerged") == 0) {
                    arrayList2.add("distance");
                }
                if (i4 > 0 && hiHealthData.getInt("pushesValMerged") == 0) {
                    arrayList2.add("pushesVal");
                }
                if (HiCommonUtil.b(arrayList2)) {
                    arrayList2.add(Constants.LINK);
                }
                sportDetail.setMergedFields(arrayList2);
                sportDetail.setStartTime(Long.valueOf(hiHealthData.getStartTime()));
                sportDetail.setEndTime(Long.valueOf(hiHealthData.getEndTime()));
                sportDetail.setTimeZone(hiHealthData.getTimeZone());
                sportDetail.setMetadata(hiHealthData.getMetaData());
                kym kymVarJ = this.d.j(hiHealthData.getClientId());
                if (kymVarJ != null) {
                    sportDetail.setDeviceCode(Long.valueOf(kymVarJ.e()));
                    HiAppInfo hiAppInfoC = this.e.c(kymVarJ.b());
                    if (hiAppInfoC != null) {
                        sportDetail.setAppType(Integer.valueOf(ljp.a(hiAppInfoC.getPackageName())));
                        sportDetail.setDataId(Long.valueOf(hiHealthData.getDataId()));
                        arrayList.add(sportDetail);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<SportDetail> a(List<HiHealthData> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        kym kymVarJ = this.d.j(list.get(0).getClientId());
        if (kymVarJ == null) {
            return null;
        }
        for (HiHealthData hiHealthData : list) {
            SportDetail sportDetail = new SportDetail();
            sportDetail.setSportType(Integer.valueOf(lke.e(hiHealthData.getType())));
            SportBasicInfo sportBasicInfoE = lik.e(0, 0, 0, Float.valueOf(0.0f), 0, 1, 0);
            sportDetail.setStartTime(Long.valueOf(hiHealthData.getStartTime()));
            sportDetail.setEndTime(Long.valueOf(hiHealthData.getEndTime()));
            sportDetail.setTimeZone(hiHealthData.getTimeZone());
            sportDetail.setMetadata(hiHealthData.getMetaData());
            sportDetail.setDeviceCode(Long.valueOf(kymVarJ.e()));
            sportDetail.setMergedFlag(Integer.valueOf(hiHealthData.getMergedStatus()));
            HiAppInfo hiAppInfoC = this.e.c(kymVarJ.b());
            if (hiAppInfoC != null) {
                sportDetail.setSportBasicInfos(new SportBasicInfo[]{sportBasicInfoE});
                sportDetail.setAppType(Integer.valueOf(ljp.a(hiAppInfoC.getPackageName())));
                arrayList.add(sportDetail);
            }
        }
        return arrayList;
    }
}
