package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwcloudmodel.model.unite.SportDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import defpackage.kyk;
import defpackage.kym;
import defpackage.lgp;
import defpackage.lgs;
import defpackage.lif;
import defpackage.lik;
import defpackage.liq;
import defpackage.lke;
import health.compact.a.HiCommonUtil;
import health.compact.a.HiDateUtil;
import health.compact.a.HiValidatorUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SportDataSwitch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f12601a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private kyk f12602c;
    private lgs e;

    public SportDataSwitch(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12601a = applicationContext;
        this.f12602c = kyk.e(applicationContext);
        this.e = lgs.a();
    }

    public List<HiHealthData> a(List<SportDetail> list, int i, int i2) throws lif {
        List<HiHealthData> listB;
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = 0;
        for (SportDetail sportDetail : list) {
            if (sportDetail != null && (listB = b(sportDetail, i, i2)) != null && !listB.isEmpty()) {
                arrayList.add(listB);
                size += listB.size();
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll((List) it.next());
        }
        LogUtil.d("Debug_SportDataSwtich", "allCloudDataToHiHealthDatas hiHealthDatas size ", Integer.valueOf(arrayList2.size()));
        return arrayList2;
    }

    private List<HiHealthData> b(SportDetail sportDetail, int i, int i2) throws lif {
        if (i2 == 2) {
            return b(sportDetail, i);
        }
        if (i2 == 3) {
            return a(sportDetail, i);
        }
        LogUtil.j("Debug_SportDataSwtich", "cloudSportDatasToHiHealthDatas no such hiSyncModel");
        return null;
    }

    public List<SportDetail> c(List<HiHealthData> list, int i, int i2) {
        if (i2 == 2) {
            return this.e.d(list, i);
        }
        if (i2 == 3) {
            return this.e.b(list);
        }
        LogUtil.j("Debug_SportDataSwtich", "localDataToCloud no such hiSyncModel");
        return null;
    }

    private List<HiHealthData> b(SportDetail sportDetail, int i) throws lif {
        long jE = HiDateUtil.e(sportDetail.getStartTime().longValue());
        long jLongValue = sportDetail.getEndTime().longValue();
        SportBasicInfo[] sportBasicInfos = sportDetail.getSportBasicInfos();
        long length = sportBasicInfos.length;
        kym kymVarB = this.f12602c.b(sportDetail.getAppType().intValue(), i, sportDetail.getDeviceCode().longValue());
        if (kymVarB == null) {
            ReleaseLogUtil.a("Debug_SportDataSwtich", "switchToHiHealthDatas hiHealthContext is null");
            return null;
        }
        kymVarB.h(1);
        int iC = lke.c(sportDetail.getSportType().intValue());
        String timeZone = sportDetail.getTimeZone();
        String metadata = sportDetail.getMetadata();
        if (iC > 22000 && iC < 22099) {
            int iCeil = (int) Math.ceil((jLongValue - jE) / 60000.0f);
            if (iCeil <= 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(iCeil);
            long j = jE;
            while (j < jLongValue) {
                long j2 = j + 60000;
                kym kymVar = kymVarB;
                arrayList.add(e(j, j2, iC, 0.0d, 1, kymVar, metadata, timeZone, (sportDetail.getMergedFlag() == null || lgp.c()) ? 999 : sportDetail.getMergedFlag().intValue()));
                j = j2;
                kymVarB = kymVar;
                iC = iC;
            }
            return arrayList;
        }
        List<String> mergedFields = sportDetail.getMergedFields();
        ArrayList arrayList2 = new ArrayList(((int) length) * 5);
        int i2 = 0;
        while (true) {
            long j3 = i2;
            if (j3 >= length) {
                return arrayList2;
            }
            long j4 = (j3 * 60000) + jE;
            int i3 = i2;
            List<HiHealthData> listC = c(sportBasicInfos[i2], j4, j4 + 60000, iC, kymVarB, metadata, timeZone, mergedFields);
            if (!listC.isEmpty()) {
                arrayList2.addAll(listC);
            }
            i2 = i3 + 1;
        }
    }

    private List<HiHealthData> a(SportDetail sportDetail, int i) throws lif {
        List<SamplePoint> samplePoints = sportDetail.getSamplePoints();
        if (samplePoints == null || samplePoints.isEmpty()) {
            LogUtil.j("Debug_SportDataSwtich", "cloudSportDataToHiHealthDatasBySamplePoint samplePoints is null or empty");
            return null;
        }
        kym kymVarB = this.f12602c.b(liq.e(this.f12601a), i, sportDetail.getDeviceCode().longValue());
        if (kymVarB == null) {
            LogUtil.e("Debug_SportDataSwtich", "switchToHiHealthDatas hiHealthContext is null");
            return null;
        }
        kymVarB.h(1);
        String timeZone = sportDetail.getTimeZone();
        String metadata = sportDetail.getMetadata();
        long size = samplePoints.size();
        ArrayList arrayList = new ArrayList((int) size);
        for (int i2 = 0; i2 < size; i2++) {
            HiHealthData hiHealthDataD = lik.d(samplePoints.get(i2));
            if (hiHealthDataD != null) {
                hiHealthDataD.setTimeZone(timeZone);
                hiHealthDataD.setMetaData(metadata);
                kym.e(hiHealthDataD, kymVarB);
                arrayList.add(hiHealthDataD);
            }
        }
        return arrayList;
    }

    private List<HiHealthData> c(SportBasicInfo sportBasicInfo, long j, long j2, int i, kym kymVar, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList(5);
        if (i > 0) {
            arrayList.add(e(j, j2, i, 0.0d, 1, kymVar, str, str2, 0));
        }
        int iFetchSteps = sportBasicInfo.fetchSteps();
        int iFetchCalorie = sportBasicInfo.fetchCalorie();
        float fFetchFloor = sportBasicInfo.fetchFloor() * 30;
        float fFetchAltitude = sportBasicInfo.fetchAltitude() * 10.0f;
        float f = ((double) (fFetchFloor - fFetchAltitude)) > 1.0E-6d ? fFetchFloor : fFetchAltitude;
        int iFetchDistance = sportBasicInfo.fetchDistance();
        int iFetchPushesVal = sportBasicInfo.fetchPushesVal();
        if (HiValidatorUtil.b(iFetchSteps) && HiValidatorUtil.c(iFetchCalorie)) {
            double d = f;
            if (HiValidatorUtil.b(d)) {
                if (HiValidatorUtil.e(iFetchSteps)) {
                    arrayList.add(e(j, j2, 2, iFetchSteps, 1, kymVar, str, str2, a(list, MedalConstants.EVENT_STEPS)));
                }
                if (HiValidatorUtil.e(iFetchCalorie)) {
                    arrayList.add(e(j, j2, 4, iFetchCalorie, 1, kymVar, str, str2, a(list, "calorie")));
                }
                if (HiValidatorUtil.e(iFetchDistance)) {
                    arrayList.add(e(j, j2, 3, iFetchDistance, 1, kymVar, str, str2, a(list, "distance")));
                }
                if (HiValidatorUtil.b(f)) {
                    arrayList.add(e(j, j2, 5, d, 1, kymVar, str, str2, a(list, "altitude")));
                }
                if (HiValidatorUtil.f(iFetchPushesVal)) {
                    arrayList.add(e(j, j2, 8, iFetchPushesVal, 1, kymVar, str, str2, a(list, "pushesVal")));
                }
                return arrayList;
            }
        }
        ReleaseLogUtil.a("Debug_SportDataSwtich", "getSportHealth STEP or CALORIE is out of rang sportBasicInfo = ", HiJsonUtil.d(sportBasicInfo));
        return arrayList;
    }

    private int a(List<String> list, String str) {
        if (HiCommonUtil.b(list) || lgp.c()) {
            return 999;
        }
        return (list.contains(str) || list.contains("*")) ? 0 : 1;
    }

    private HiHealthData e(long j, long j2, int i, double d, int i2, kym kymVar, String str, String str2, int i3) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setStartTime(j);
        hiHealthData.setEndTime(j2);
        hiHealthData.setType(i);
        hiHealthData.setValue(d);
        hiHealthData.setMetaData(str);
        hiHealthData.setTimeZone(str2);
        hiHealthData.setMergedStatus(i3);
        hiHealthData.setSyncStatus(i2);
        kym.e(hiHealthData, kymVar);
        return hiHealthData;
    }
}
