package com.huawei.hihealthservice.sync.dataswitch;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiRelationInformation;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.model.HiHealthDictField;
import com.huawei.hihealth.dictionary.model.HiHealthDictType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.kwi;
import defpackage.kwl;
import defpackage.kwt;
import defpackage.kwy;
import defpackage.kyk;
import defpackage.kym;
import defpackage.lgb;
import defpackage.lgo;
import defpackage.lhx;
import defpackage.lhz;
import defpackage.lib;
import defpackage.lif;
import defpackage.lik;
import defpackage.liq;
import health.compact.a.CommonUtil;
import health.compact.a.HiCommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class HealthDataSwitch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private kyk f12594a;
    private Context e;

    public HealthDataSwitch(Context context) {
        this.e = context;
        this.f12594a = kyk.e(context);
    }

    public List<HealthDetail> c(List<HiHealthData> list, int i, int i2) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (i2 != 3 && i2 != 7 && i2 != 9) {
            switch (i2) {
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    break;
                default:
                    return b(list, i);
            }
        }
        return d(list, i, i2);
    }

    public List<lhx> c(List<HiHealthData> list, int i) {
        if (list == null || list.isEmpty()) {
            LogUtil.j("Debug_HealthDataSwitch", "hiHealthDataToCloudExtendedServiceData businessDataList is null");
            return null;
        }
        if (i == 5000 || i == 5001) {
            return a(list, i);
        }
        return null;
    }

    public List<HiHealthData> a(HealthDetail healthDetail, int i) throws lif {
        List<HiHealthData> listC;
        List<SamplePoint> samplePoints = healthDetail.getSamplePoints();
        if (samplePoints == null || samplePoints.isEmpty()) {
            LogUtil.j("Debug_HealthDataSwitch", "cloudToLocal samplePoints is null or empty");
            return null;
        }
        kym kymVarE = this.f12594a.e(liq.e(this.e), i, healthDetail.getDeviceCode().longValue(), true);
        if (kymVarE == null) {
            ReleaseLogUtil.a("Debug_HealthDataSwitch", "cloudToLocal hiHealthContext is null");
            return null;
        }
        kymVarE.h(1);
        String timeZone = healthDetail.getTimeZone();
        long size = samplePoints.size();
        ArrayList arrayList = new ArrayList((int) size);
        int size2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SamplePoint samplePoint = samplePoints.get(i2);
            if (samplePoint != null && (listC = lik.c(samplePoint, healthDetail)) != null && !listC.isEmpty()) {
                for (HiHealthData hiHealthData : listC) {
                    hiHealthData.setTimeZone(timeZone);
                    kym.e(hiHealthData, kymVarE);
                }
                arrayList.add(listC);
                size2 += listC.size();
            }
        }
        ArrayList arrayList2 = new ArrayList(size2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.addAll((List) it.next());
        }
        return arrayList2;
    }

    public List<HiHealthData> a(List<HealthDetail> list, int i, long j) throws lif, IllegalArgumentException {
        List<SamplePoint> listA;
        kym kymVarB;
        SamplePoint samplePoint;
        if (HiCommonUtil.b(list)) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = 0;
        for (HealthDetail healthDetail : list) {
            if (healthDetail != null && healthDetail.getVersion() > j && (listA = a(healthDetail)) != null && (kymVarB = b(i, healthDetail)) != null && (samplePoint = listA.get(0)) != null) {
                if (healthDetail.getType().intValue() == DicDataTypeUtil.DataType.BLOODGLUCOSE_BLOODSUGAR.value()) {
                    a(samplePoint);
                }
                List<HiHealthData> listBuild = lgo.c(samplePoint).build(samplePoint, kymVarB, healthDetail);
                if (TextUtils.isEmpty(samplePoint.getFieldsModifyTime())) {
                    Iterator<HiHealthData> it = listBuild.iterator();
                    while (it.hasNext()) {
                        it.next().setModifiedTime(0L);
                    }
                }
                arrayList.add(listBuild);
                size += listBuild.size();
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.addAll((List) it2.next());
        }
        return arrayList2;
    }

    private void a(SamplePoint samplePoint) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(samplePoint.getValue());
            try {
                if (!jSONObject.has("confirmedStatus")) {
                    ReleaseLogUtil.a("Debug_HealthDataSwitch", "getBloodSugarSamplePoint jsonObject == null ? ", false);
                    return;
                }
                String str = jSONObject.optInt("confirmedStatus", 0) == 0 ? "{\"mIsConfirmed\":false}" : "{\"mIsConfirmed\":true}";
                jSONObject.remove("confirmedStatus");
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    jSONObject.put(itKeys.next(), str);
                }
                if (jSONObject != null) {
                    samplePoint.setFieldsMetadata(jSONObject.toString());
                }
            } catch (JSONException e) {
                e = e;
                ReleaseLogUtil.a("Debug_HealthDataSwitch", "getBloodSugarSamplePoint JSONException ", e.getMessage());
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
    }

    private kym b(int i, HealthDetail healthDetail) throws lif {
        kym kymVarE = this.f12594a.e(liq.e(this.e), i, healthDetail.getDeviceCode().longValue(), true);
        if (kymVarE == null) {
            ReleaseLogUtil.a("Debug_HealthDataSwitch", "hiHealthContext is null, device = ", healthDetail.getDeviceCode());
            return null;
        }
        kymVarE.h(1);
        return kymVarE;
    }

    private List<SamplePoint> a(HealthDetail healthDetail) {
        if (healthDetail == null) {
            return null;
        }
        List<SamplePoint> samplePoints = healthDetail.getSamplePoints();
        if (HiCommonUtil.b(samplePoints)) {
            return null;
        }
        int size = samplePoints.size();
        if (size <= 1) {
            return samplePoints;
        }
        throw new IllegalArgumentException("the data " + healthDetail.getType() + " has " + size + " sample points");
    }

    public List<HealthDetail> b(List<HiHealthData> list, int i, int i2, Map<Long, List<Long>> map) throws IllegalArgumentException {
        HiHealthDictType hiHealthDictType;
        Iterator<b> it;
        ArrayList arrayList;
        HealthDataSwitch healthDataSwitch = this;
        kym kymVarJ = kwt.b().j(i);
        if (kymVarJ == null) {
            return new ArrayList();
        }
        HiHealthDictType hiHealthDictTypeA = HiHealthDictManager.a(healthDataSwitch.e).a(i2);
        if (hiHealthDictTypeA == null) {
            throw new IllegalArgumentException("not dictionary type, " + i2);
        }
        List<b> listA = b.a(list);
        ArrayList arrayList2 = new ArrayList(listA.size());
        Iterator<b> it2 = listA.iterator();
        long j = 0;
        while (it2.hasNext()) {
            b next = it2.next();
            HealthDetail healthDetail = new HealthDetail();
            healthDetail.setDeviceCode(Long.valueOf(kymVarJ.e()));
            healthDetail.setType(Integer.valueOf(i2));
            healthDetail.setStartTime(Long.valueOf(next.f12595a));
            healthDetail.setEndTime(Long.valueOf(next.f12596c));
            SamplePoint samplePoint = new SamplePoint();
            samplePoint.setStartTime(Long.valueOf(next.f12595a));
            samplePoint.setEndTime(Long.valueOf(next.f12596c));
            samplePoint.setKey(hiHealthDictTypeA.j());
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            kym kymVar = kymVarJ;
            ArrayList arrayList3 = new ArrayList(next.d.size());
            try {
                Iterator<HiHealthData> it3 = next.d.iterator();
                try {
                    while (it3.hasNext()) {
                        try {
                            Iterator<HiHealthData> it4 = it3;
                            HiHealthData next2 = it3.next();
                            hiHealthDictType = hiHealthDictTypeA;
                            try {
                                it = it2;
                                try {
                                    HiHealthDictField hiHealthDictFieldC = HiHealthDictManager.a(healthDataSwitch.e).c(next2.getType());
                                    if (hiHealthDictFieldC == null) {
                                        arrayList = arrayList2;
                                        throw new IllegalArgumentException(" type " + next2.getType() + " not in dictionary, id = " + i2);
                                    }
                                    healthDataSwitch.c(jSONObject, hiHealthDictFieldC, next2);
                                    jSONObject2.put(hiHealthDictFieldC.c(), next2.getMetaData());
                                    arrayList = arrayList2;
                                    try {
                                        jSONObject3.put(hiHealthDictFieldC.c(), next2.getModifiedTime());
                                        arrayList3.add(Long.valueOf(next2.getDataId()));
                                        healthDetail.setTimeZone(next2.getTimeZone());
                                        healthDataSwitch = this;
                                        it3 = it4;
                                        arrayList2 = arrayList;
                                        hiHealthDictTypeA = hiHealthDictType;
                                        it2 = it;
                                    } catch (JSONException e) {
                                        e = e;
                                    }
                                    e = e;
                                } catch (JSONException e2) {
                                    e = e2;
                                    arrayList = arrayList2;
                                }
                            } catch (JSONException e3) {
                                e = e3;
                                it = it2;
                                arrayList = arrayList2;
                                ReleaseLogUtil.e("HiH_HealthDataSwitch", "json exception = ", e.getMessage());
                                healthDataSwitch = this;
                                kymVarJ = kymVar;
                                arrayList2 = arrayList;
                                hiHealthDictTypeA = hiHealthDictType;
                                it2 = it;
                            }
                        } catch (JSONException e4) {
                            e = e4;
                            hiHealthDictType = hiHealthDictTypeA;
                        }
                        ReleaseLogUtil.e("HiH_HealthDataSwitch", "json exception = ", e.getMessage());
                        healthDataSwitch = this;
                        kymVarJ = kymVar;
                        arrayList2 = arrayList;
                        hiHealthDictTypeA = hiHealthDictType;
                        it2 = it;
                    }
                    if ("WEIGHT_BODYFAT_BROAD".equals(samplePoint.getKey())) {
                        jSONObject.put("extendAttribute", next.d.get(0).getMetaData());
                    }
                    if (jSONObject.length() > 0) {
                        samplePoint.setValue(jSONObject.toString());
                    }
                    samplePoint.setFieldsMetadata(jSONObject2.toString());
                    samplePoint.setFieldsModifyTime(jSONObject3.toString());
                    ArrayList arrayList4 = new ArrayList(1);
                    j++;
                    arrayList4.add(samplePoint);
                    healthDetail.setSamplePoints(arrayList4);
                    healthDetail.setDataId(j);
                    arrayList.add(healthDetail);
                    map.put(Long.valueOf(j), arrayList3);
                } catch (JSONException e5) {
                    ReleaseLogUtil.e("HiH_HealthDataSwitch", "json exception extendAttribute= ", e5.getMessage());
                }
                hiHealthDictType = hiHealthDictTypeA;
                it = it2;
                arrayList = arrayList2;
            } catch (JSONException e6) {
                e = e6;
                hiHealthDictType = hiHealthDictTypeA;
                it = it2;
                arrayList = arrayList2;
            }
            healthDataSwitch = this;
            kymVarJ = kymVar;
            arrayList2 = arrayList;
            hiHealthDictTypeA = hiHealthDictType;
            it2 = it;
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    private void c(JSONObject jSONObject, HiHealthDictField hiHealthDictField, HiHealthData hiHealthData) throws JSONException {
        byte b2;
        Double dValueOf = Double.valueOf(hiHealthData.getValue());
        String strD = hiHealthDictField.d();
        if (strD == null) {
            jSONObject.put(hiHealthDictField.c(), dValueOf);
            return;
        }
        strD.hashCode();
        int iHashCode = strD.hashCode();
        if (iHashCode != -1808118735) {
            if (iHashCode != -672261858) {
                if (iHashCode == 2374300 && strD.equals("Long")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (strD.equals("Integer")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (strD.equals("String")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 != 0) {
            if (b2 == 1) {
                jSONObject.put(hiHealthDictField.c(), dValueOf.intValue());
            } else if (b2 == 2) {
                jSONObject.put(hiHealthDictField.c(), dValueOf.longValue());
            } else {
                jSONObject.put(hiHealthDictField.c(), dValueOf);
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f12595a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f12596c;
        List<HiHealthData> d = new ArrayList();

        private b() {
        }

        static List<b> a(List<HiHealthData> list) {
            ArrayList arrayList = new ArrayList(list.size());
            boolean[] zArr = new boolean[list.size()];
            for (int i = 0; i < list.size(); i++) {
                if (!zArr[i]) {
                    b bVar = new b();
                    bVar.f12595a = list.get(i).getStartTime();
                    bVar.f12596c = list.get(i).getEndTime();
                    bVar.d.add(list.get(i));
                    zArr[i] = true;
                    for (int i2 = i + 1; i2 < list.size(); i2++) {
                        if (!zArr[i2]) {
                            long startTime = list.get(i2).getStartTime();
                            long endTime = list.get(i2).getEndTime();
                            if (startTime == bVar.f12595a && endTime == bVar.f12596c) {
                                bVar.d.add(list.get(i2));
                                zArr[i2] = true;
                            }
                        }
                    }
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }
    }

    private List<HealthDetail> b(List<HiHealthData> list, int i) {
        HealthDetail healthDetailC;
        kym kymVarJ = kwt.b().j(i);
        if (kymVarJ == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (healthDetailC = lik.c(hiHealthData, lik.d(hiHealthData.getType()))) != null) {
                healthDetailC.setDeviceCode(Long.valueOf(kymVarJ.e()));
                arrayList.add(healthDetailC);
            }
        }
        return arrayList;
    }

    public HiHealthData e(lhx lhxVar, int i) {
        String strC = lhxVar.c();
        if (TextUtils.isEmpty(strC)) {
            LogUtil.j("Debug_HealthDataSwitch", "businessCloudToLocal extendedServiceData is null");
            return null;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setStartTime(lhxVar.b());
        hiHealthData.setEndTime(lhxVar.e());
        hiHealthData.setTimeZone(lhxVar.d());
        hiHealthData.setUserId(i);
        hiHealthData.setAppId(0);
        hiHealthData.setDeviceId(0);
        hiHealthData.setType(lik.c(lhxVar.h()));
        hiHealthData.setDataSource(lhxVar.a());
        kym.e(hiHealthData, this.f12594a.c(0, i, 0));
        hiHealthData.setSyncStatus(1);
        lib libVar = (lib) HiJsonUtil.d(strC, lib.class);
        hiHealthData.setValue(libVar.c());
        hiHealthData.setMetaData(libVar.a());
        List<lhz> listD = libVar.d();
        if (listD == null || listD.isEmpty()) {
            LogUtil.j("Debug_HealthDataSwitch", "businessCloudToLocal relatedDataList is null");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<lhz> it = listD.iterator();
        while (it.hasNext()) {
            c(arrayList, it.next(), i);
        }
        if (arrayList.isEmpty()) {
            LogUtil.j("Debug_HealthDataSwitch", "businessCloudToLocal relationInformations is null");
            return null;
        }
        hiHealthData.setRelationInformations(new Gson().toJson(arrayList, new TypeToken<List<HiRelationInformation>>() { // from class: com.huawei.hihealthservice.sync.dataswitch.HealthDataSwitch.1
        }.getType()));
        hiHealthData.setRelationFlag(true);
        return hiHealthData;
    }

    private void c(List<HiRelationInformation> list, lhz lhzVar, int i) {
        String strB = lhzVar.b();
        String strD = lhzVar.d();
        int iC = kwy.b(this.e).c(strB);
        int iB = kwi.b().b(strD);
        LogUtil.a("Debug_HealthDataSwitch", "deviceUniqueCode is ", Integer.valueOf(iC), ", packageName is ", Integer.valueOf(iB), ", userId is ", Integer.valueOf(i));
        kym kymVarB = kwt.b().b(i, iB, iC);
        if (kymVarB == null) {
            LogUtil.j("Debug_HealthDataSwitch", "buildHiHealthData hiHealthContext is null");
            return;
        }
        int iC2 = lik.c(lhzVar.a());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(kymVarB.c()));
        List<HiHealthData> listB = lgb.a(this.e).b(iC2, lhzVar.c(), lhzVar.e(), arrayList);
        if (listB != null) {
            for (HiHealthData hiHealthData : listB) {
                HiRelationInformation hiRelationInformation = new HiRelationInformation();
                hiRelationInformation.a(CommonUtil.j(String.valueOf(hiHealthData.getDataId())));
                hiRelationInformation.c(hiHealthData.getType());
                list.add(hiRelationInformation);
            }
        }
    }

    private List<lhx> a(List<HiHealthData> list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            lhx lhxVar = new lhx();
            lhxVar.e(i);
            lhxVar.d(hiHealthData.getTimeZone());
            lhxVar.b(hiHealthData.getStartTime());
            lhxVar.c(hiHealthData.getEndTime());
            lhxVar.b(hiHealthData.getDataSource());
            lib libVarB = b(hiHealthData);
            if (libVarB != null) {
                lhxVar.e(HiJsonUtil.d(libVarB));
                arrayList.add(lhxVar);
            }
        }
        return arrayList;
    }

    private lib b(HiHealthData hiHealthData) {
        int iD;
        List<HiHealthData> listB = kwl.e().b(hiHealthData.getDataId(), hiHealthData.getType());
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("Debug_HealthDataSwitch", "buildServiceData businessRelationList is null");
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        int i = 0;
        for (HiHealthData hiHealthData2 : listB) {
            arrayList.add(Integer.valueOf(hiHealthData2.getInt("relation_id")));
            i = hiHealthData2.getInt("relation_type");
        }
        List<HiHealthData> listB2 = lgb.a(this.e).b(i, arrayList);
        if (listB2 == null || listB2.isEmpty()) {
            LogUtil.j("Debug_HealthDataSwitch", "buildServiceData originalDataList is null");
            return null;
        }
        ArrayList arrayList2 = new ArrayList(listB2.size());
        for (HiHealthData hiHealthData3 : listB2) {
            lhz lhzVarE = e(hiHealthData3);
            if (lhzVarE != null && (iD = lik.d(hiHealthData3.getType())) != -1) {
                lhzVarE.c(iD);
                lhzVarE.e(hiHealthData3.getStartTime());
                lhzVarE.b(hiHealthData3.getEndTime());
                arrayList2.add(lhzVarE);
            }
        }
        if (HiCommonUtil.b(arrayList2)) {
            LogUtil.j("Debug_HealthDataSwitch", "relatedDataList is null or empty");
            return null;
        }
        int value = (int) hiHealthData.getValue();
        lib libVar = new lib();
        libVar.d(arrayList2);
        libVar.b(value);
        libVar.d(hiHealthData.getMetaData());
        return libVar;
    }

    private lhz e(HiHealthData hiHealthData) {
        lhz lhzVar = new lhz();
        kym kymVarJ = kwt.b().j(hiHealthData.getClientId());
        if (kymVarJ == null) {
            LogUtil.j("Debug_HealthDataSwitch", "getRelateInfo hiHealthContext is null");
            return null;
        }
        HiAppInfo hiAppInfoC = kwi.b().c(kymVarJ.b());
        if (hiAppInfoC == null) {
            return null;
        }
        lhzVar.e(hiAppInfoC.getPackageName());
        HiDeviceInfo hiDeviceInfoB = kwy.b(this.e).b(kymVarJ.d());
        if (hiDeviceInfoB == null) {
            return null;
        }
        lhzVar.b(hiDeviceInfoB.getDeviceUniqueCode());
        return lhzVar;
    }

    private List<HealthDetail> d(List<HiHealthData> list, int i, int i2) {
        kym kymVarJ = kwt.b().j(i);
        if (kymVarJ == null) {
            return null;
        }
        return lik.b(list, i2, kymVarJ.e());
    }
}
