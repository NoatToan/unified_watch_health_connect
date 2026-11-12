package defpackage;

import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.HiStressMetaData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.syncdata.Electrocardiogram;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBloodOxygenRemind;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBloodOxygenSaturation;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBodyThermometer;
import com.huawei.hihealthservice.sync.syncdata.HiSyncUricAcid;
import com.huawei.hihealthservice.sync.util.CloudIntensity;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.wearengine.sensor.Sensor;
import health.compact.a.HiDateUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lim {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile List<String> f40305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile List<String> f40306b;
    private static volatile List<String> d;

    private static List<HiHealthData> b(HiHealthData hiHealthData) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(hiHealthData);
        return arrayList;
    }

    private static List<HiHealthData> c(SamplePoint samplePoint) {
        HiHealthData hiHealthData = new HiHealthData();
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint so such type");
            return null;
        }
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        try {
            if (Double.parseDouble(samplePoint.getValue()) <= 1.401298464324817E-45d) {
                LogUtil.e("HiDataSwitchUtil", "switchHealthSamplePoint value less than MIN_VALUE");
                return null;
            }
            hiHealthData.setValue(Double.parseDouble(samplePoint.getValue()));
            return b(hiHealthData);
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "switchHealthSamplePoint NumberFormatException", LogAnonymous.b(e));
            return null;
        }
    }

    private static List<HiHealthData> a(SamplePoint samplePoint) {
        HiHealthData hiHealthData = new HiHealthData();
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint so such type");
            return null;
        }
        String value = samplePoint.getValue();
        if (value == null || value.isEmpty()) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint type is ,", Integer.valueOf(iA), " metaData is null");
            return null;
        }
        if (iA == 2034) {
            HiStressMetaData hiStressMetaDataC = c(samplePoint.getValue());
            if (hiStressMetaDataC == null || hiStressMetaDataC.fetchStressScore() <= 0) {
                return null;
            }
            hiHealthData.setValue(hiStressMetaDataC.fetchStressScore());
        }
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        hiHealthData.setMetaData(samplePoint.getValue());
        return b(hiHealthData);
    }

    private static List<HiHealthData> b(SamplePoint samplePoint, HealthDetail healthDetail) {
        HiHealthData hiHealthData = new HiHealthData();
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint so such type");
            return null;
        }
        CloudIntensity cloudIntensityD = lik.d(samplePoint.getValue());
        if (cloudIntensityD == null) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint type is ,", Integer.valueOf(iA), " value is error");
            return null;
        }
        hiHealthData.setValue(cloudIntensityD.e());
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        hiHealthData.setMergedStatus((healthDetail.getMergedFlag() == null || lgp.c()) ? 999 : healthDetail.getMergedFlag().intValue());
        return b(hiHealthData);
    }

    private static List<HiHealthData> b(SamplePoint samplePoint) {
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToBodyThermometer so such type");
            return null;
        }
        HiSyncBodyThermometer hiSyncBodyThermometerB = lik.b(samplePoint.getValue());
        if (hiSyncBodyThermometerB == null) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToBodyThermometer type is ,", Integer.valueOf(iA), " value is error");
            return null;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setValue(hiSyncBodyThermometerB.getBodyThermometer());
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        return b(hiHealthData);
    }

    private static List<HiHealthData> c(SamplePoint samplePoint, HealthDetail healthDetail) {
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToBloodOxygenRemind so such type");
            return null;
        }
        HiSyncBloodOxygenRemind hiSyncBloodOxygenRemindE = lik.e(samplePoint.getValue());
        if (hiSyncBloodOxygenRemindE == null) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToBloodOxygenRemind type is ,", Integer.valueOf(iA), " value is error");
            return null;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setValue(hiSyncBloodOxygenRemindE.getBloodOxygenRemind());
        hiHealthData.setType(iA);
        hiHealthData.setMetaData(healthDetail.getMetadata());
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        return b(hiHealthData);
    }

    private static List<HiHealthData> e(SamplePoint samplePoint) {
        HiHealthData hiHealthData = new HiHealthData();
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint so such type");
            return null;
        }
        HiSyncBloodOxygenSaturation hiSyncBloodOxygenSaturationC = lik.c(samplePoint.getValue());
        if (hiSyncBloodOxygenSaturationC == null) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint type is ,", Integer.valueOf(iA), " value is error");
            return null;
        }
        hiHealthData.setValue(hiSyncBloodOxygenSaturationC.getAvgSaturation());
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        return b(hiHealthData);
    }

    private static List<HiHealthData> c(SamplePoint samplePoint, Integer num) {
        HiHealthData hiHealthData = new HiHealthData();
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint so such type");
            return null;
        }
        Electrocardiogram electrocardiogramA = lik.a(samplePoint.getValue());
        if (electrocardiogramA == null) {
            LogUtil.j("HiDataSwitchUtil", "switchHealthSamplePoint type is ,", Integer.valueOf(iA), " electrocardiogram is error");
            return null;
        }
        hiHealthData.setMetaData(electrocardiogramA.getMetadata());
        hiHealthData.setSequenceData(electrocardiogramA.getDetails());
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(18);
        if (liq.h()) {
            hiHealthData.setMergedStatus(999);
        } else {
            hiHealthData.setMergedStatus(num != null ? num.intValue() : 999);
        }
        List<Float> ecgDataList = electrocardiogramA.getEcgDataList();
        if (njy.b(ecgDataList)) {
            hiHealthData.setSimpleData(ecgDataList.toString());
        }
        return b(hiHealthData);
    }

    private static HiStressMetaData c(String str) {
        try {
            return (HiStressMetaData) HiJsonUtil.d(str, HiStressMetaData.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.e("HiH_HiDataSwitchUtil", "transStress error !", LogAnonymous.b(e));
            return null;
        }
    }

    private static List<HiHealthData> d(SamplePoint samplePoint) {
        HiHealthData hiHealthData = new HiHealthData();
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToUricAcid no such type");
            return null;
        }
        HiSyncUricAcid hiSyncUricAcidH = lik.h(samplePoint.getValue());
        if (hiSyncUricAcidH == null) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToUricAcid type is ", Integer.valueOf(iA), ", value is error");
            return null;
        }
        hiHealthData.setValue(hiSyncUricAcidH.getUricAcid());
        hiHealthData.setType(iA);
        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
        hiHealthData.setPointUnit(0);
        return b(hiHealthData);
    }

    private static List<HiHealthData> d(SamplePoint samplePoint, HealthDetail healthDetail) {
        if (samplePoint != null && healthDetail != null) {
            Map<String, Double> mapA = new lin(samplePoint.getValue()).a();
            if (mapA == null || mapA.isEmpty()) {
                LogUtil.j("HiDataSwitchUtil", "samplePointToBloodSugar error map is null or empty");
            } else {
                ArrayList arrayList = new ArrayList(mapA.size());
                HiHealthData hiHealthData = new HiHealthData();
                Iterator<Map.Entry<String, Double>> it = mapA.entrySet().iterator();
                while (true) {
                    double dDoubleValue = 0.0d;
                    if (it.hasNext()) {
                        Map.Entry<String, Double> next = it.next();
                        int iB = lil.b(next.getKey());
                        double dDoubleValue2 = next.getValue().doubleValue();
                        LogUtil.d("HiDataSwitchUtil", "samplePointToBloodSugar type = " + iB);
                        if (dDoubleValue2 <= 0.0d) {
                            LogUtil.e("HiDataSwitchUtil", "samplePointToBloodSugar error value !");
                            return null;
                        }
                        hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
                        hiHealthData.setType(iB);
                        hiHealthData.setPointUnit(6);
                        hiHealthData.setValue(dDoubleValue2);
                        hiHealthData.setMetaData(healthDetail.getMetadata());
                    } else {
                        Map<String, Double> mapA2 = new lin(samplePoint.getFieldsModifyTime()).a();
                        if (mapA2 != null && !mapA2.isEmpty()) {
                            for (Map.Entry<String, Double> entry : mapA2.entrySet()) {
                                if (entry.getValue().doubleValue() > dDoubleValue) {
                                    dDoubleValue = entry.getValue().doubleValue();
                                }
                            }
                        }
                        hiHealthData.setModifiedTime((long) dDoubleValue);
                        arrayList.add(hiHealthData);
                        return arrayList;
                    }
                }
            }
        }
        return null;
    }

    private static List<HiHealthData> a(SamplePoint samplePoint, HealthDetail healthDetail) {
        int iA = lil.a(samplePoint.getKey(), samplePoint.getValue());
        if (iA <= 0) {
            LogUtil.j("HiDataSwitchUtil", "samplePointToSleep so such type");
            return null;
        }
        long jE = HiDateUtil.e(samplePoint.getStartTime().longValue());
        long jLongValue = samplePoint.getEndTime().longValue();
        String value = samplePoint.getValue();
        ArrayList arrayList = new ArrayList(Math.max((int) Math.ceil((jLongValue - jE) / 60000.0f), 0));
        while (jE < jLongValue) {
            HiHealthData hiHealthData = new HiHealthData();
            hiHealthData.setType(iA);
            hiHealthData.setPointUnit(15);
            int iIntValue = (healthDetail.getMergedFlag() == null || lgp.c()) ? 999 : healthDetail.getMergedFlag().intValue();
            hiHealthData.setMetaData(value);
            hiHealthData.setMergedStatus(iIntValue);
            long j = 60000 + jE;
            hiHealthData.setTimeInterval(jE, j);
            arrayList.add(hiHealthData);
            jE = j;
        }
        return arrayList;
    }

    static List<HiHealthData> e(SamplePoint samplePoint, HealthDetail healthDetail) {
        String key;
        if (samplePoint == null || healthDetail == null || (key = samplePoint.getKey()) == null) {
            return null;
        }
        List<String> listA = a();
        List<String> listD = d();
        List<String> listB = b();
        if (listA.contains(key)) {
            return c(samplePoint);
        }
        if (listD.contains(key)) {
            return a(samplePoint, healthDetail);
        }
        if ("BLOODGLUCOSE_BLOODSUGAR".equals(key)) {
            return d(samplePoint, healthDetail);
        }
        if (listB.contains(key)) {
            return a(samplePoint);
        }
        if ("EXERCISE_INTENSITY".equals(key)) {
            return b(samplePoint, healthDetail);
        }
        if ("BLOOD_OXYGEN_SATURATION".equals(key)) {
            return e(samplePoint);
        }
        if (Sensor.NAME_ECG.equals(key)) {
            return c(samplePoint, healthDetail.getMergedFlag());
        }
        if ("BODY_THERMOMETER".equals(key)) {
            return b(samplePoint);
        }
        if ("BLOOD_OXYGEN_REMIND".equals(key)) {
            return c(samplePoint, healthDetail);
        }
        if ("URIC_ACID".equals(key)) {
            return d(samplePoint);
        }
        return null;
    }

    private static List<String> b() {
        if (d == null) {
            d = Arrays.asList("STRESS_DATA", "BIOFEEDBACK_GAMES", "RELAX_ASSESSMENT", "BREATHE_TRAINING", "HEART_RATE_RISE_ALARM", "BRADYCARDIA_ALARM");
        }
        return d;
    }

    private static List<String> d() {
        if (f40306b == null) {
            f40306b = Arrays.asList("SLEEP_DEEP", "SLEEP_LIGHT", "SLEEP_AWAKE", "PROFESSIONAL_SLEEP_SHALLOW", "PROFESSIONAL_SLEEP_DREAM", "PROFESSIONAL_SLEEP_DEEP", "PROFESSIONAL_SLEEP_WAKE", "PROFESSIONAL_SLEEP_NOON", "PROFESSIONAL_SLEEP_BED", "PROFESSIONAL_SLEEP_ON");
        }
        return f40306b;
    }

    private static List<String> a() {
        if (f40305a == null) {
            f40305a = Arrays.asList("DATA_POINT_DYNAMIC_HEARTRATE", "DATA_POINT_REST_HEARTRATE", "DATA_POINT_NEW_REST_HEARTRATE", "STRESS_PASSIVE_MEASUREMENT", "STRESS_POSITIVE_MEASUREMENT", "BREATHING_RELAXATION");
        }
        return f40305a;
    }
}
