package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.EcgMetaData;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hihealthservice.sync.syncdata.Electrocardiogram;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBloodOxygenRemind;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBloodOxygenSaturation;
import com.huawei.hihealthservice.sync.syncdata.HiSyncBodyThermometer;
import com.huawei.hihealthservice.sync.syncdata.HiSyncUricAcid;
import com.huawei.hihealthservice.sync.util.CloudIntensity;
import com.huawei.hwcloudmodel.model.samplepoint.SamplePoint;
import com.huawei.hwcloudmodel.model.unite.HealthDetail;
import com.huawei.hwcloudmodel.model.unite.SportBasicInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lik {
    public static HiHealthData d(SamplePoint samplePoint) {
        if (samplePoint == null) {
            return null;
        }
        int iC = c(samplePoint.getKey(), samplePoint.getValue());
        if (iC <= 0) {
            LogUtil.j("HiDataSwitchUtil", "switchSportSamplePoint so such type");
            return null;
        }
        HiHealthData hiHealthData = new HiHealthData();
        try {
            hiHealthData.setValue(Double.parseDouble(samplePoint.getValue()));
            hiHealthData.setType(iC);
            hiHealthData.setTimeInterval(samplePoint.getStartTime().longValue(), samplePoint.getEndTime().longValue());
            hiHealthData.setPointUnit(0);
            LogUtil.d("HiDataSwitchUtil", "switchSportSamplePoint hiHealthData is ", hiHealthData);
            return hiHealthData;
        } catch (NumberFormatException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "switchSportSamplePoint NumberFormatException", LogAnonymous.b(e));
            return null;
        }
    }

    private static int c(String str, String str2) {
        return lil.a(str, str2);
    }

    public static List<HiHealthData> c(SamplePoint samplePoint, HealthDetail healthDetail) {
        if (samplePoint == null || healthDetail == null) {
            return null;
        }
        return lim.e(samplePoint, healthDetail);
    }

    public static HealthDetail c(HiHealthData hiHealthData, int i) {
        SamplePoint samplePointG;
        if (hiHealthData == null || i <= -1) {
            return null;
        }
        HealthDetail healthDetail = new HealthDetail();
        ArrayList arrayList = new ArrayList(10);
        if (i == 4) {
            samplePointG = g(hiHealthData);
            healthDetail.setMetadata(hiHealthData.getMetaData());
        } else if (i == 19) {
            samplePointG = f(hiHealthData);
            healthDetail.setMetadata(hiHealthData.getMetaData());
        } else {
            samplePointG = d(hiHealthData, i);
        }
        if (samplePointG == null) {
            return null;
        }
        arrayList.add(samplePointG);
        healthDetail.setStartTime(Long.valueOf(hiHealthData.getStartTime()));
        healthDetail.setEndTime(Long.valueOf(hiHealthData.getEndTime()));
        healthDetail.setTimeZone(hiHealthData.getTimeZone());
        healthDetail.setType(Integer.valueOf(i));
        healthDetail.setSamplePoints(arrayList);
        healthDetail.setDataId(hiHealthData.getDataId());
        return healthDetail;
    }

    public static List<HealthDetail> b(List<HiHealthData> list, int i, long j) {
        SamplePoint samplePointD;
        if (njy.e(list)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null && (samplePointD = d(hiHealthData, i)) != null) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(samplePointD);
                HealthDetail healthDetail = new HealthDetail();
                healthDetail.setType(Integer.valueOf(i));
                healthDetail.setTimeZone(hiHealthData.getTimeZone());
                healthDetail.setDeviceCode(Long.valueOf(j));
                healthDetail.setDataId(hiHealthData.getDataId());
                if (i == 9 || i == 12 || i == 15) {
                    healthDetail.setMergedFlag(Integer.valueOf(hiHealthData.getMergedStatus()));
                }
                a(arrayList, hiHealthData.getEndTime(), hiHealthData.getStartTime(), healthDetail, arrayList2);
            }
        }
        return arrayList;
    }

    private static void a(List<HealthDetail> list, long j, long j2, HealthDetail healthDetail, List<SamplePoint> list2) {
        if (list == null) {
            return;
        }
        healthDetail.setStartTime(Long.valueOf(j2));
        healthDetail.setEndTime(Long.valueOf(j));
        healthDetail.setSamplePoints(list2);
        list.add(healthDetail);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    private static SamplePoint d(HiHealthData hiHealthData, int i) {
        String metaData;
        if (hiHealthData == null) {
            return null;
        }
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        String strH = h(hiHealthData.getType());
        if (strH == null) {
            return null;
        }
        if (i == 3) {
            metaData = "";
        } else if (i != 9) {
            if (i == 18) {
                metaData = b(hiHealthData);
            } else if (i != 21) {
                switch (i) {
                    case 11:
                    case 13:
                    case 14:
                        metaData = hiHealthData.getMetaData();
                        break;
                    case 12:
                        metaData = b((int) hiHealthData.getValue());
                        break;
                    case 15:
                        metaData = a(hiHealthData);
                        break;
                    case 16:
                        metaData = c(hiHealthData.getValue());
                        break;
                    default:
                        metaData = Double.toString(hiHealthData.getValue());
                        break;
                }
            } else {
                metaData = c(hiHealthData);
            }
        } else if (hiHealthData.getMetaData() == null) {
            metaData = "";
        } else {
            metaData = hiHealthData.getMetaData();
        }
        return d(strH, metaData, startTime, endTime, Integer.toString(hiHealthData.getPointUnit()));
    }

    private static SamplePoint g(HiHealthData hiHealthData) {
        String strH = h(hiHealthData.getType());
        if (strH == null) {
            return null;
        }
        String strE = e(hiHealthData.getType());
        lin linVar = new lin();
        linVar.c(strE, hiHealthData.getValue());
        String strB = linVar.b();
        if (strB == null) {
            return null;
        }
        lin linVar2 = new lin();
        linVar2.c(strE, hiHealthData.getModifiedTime());
        linVar2.c(BleConstants.IS_CONFIRMED_DB, hiHealthData.getModifiedTime());
        return c(strH, strB, hiHealthData.getStartTime(), hiHealthData.getEndTime(), Integer.toString(hiHealthData.getPointUnit()), linVar2.b());
    }

    private static SamplePoint f(HiHealthData hiHealthData) {
        long startTime = hiHealthData.getStartTime();
        long endTime = hiHealthData.getEndTime();
        String strH = h(hiHealthData.getType());
        if (strH == null) {
            return null;
        }
        return d(strH, e(hiHealthData), startTime, endTime, Integer.toString(hiHealthData.getPointUnit()));
    }

    private static String h(int i) {
        return lil.c(i);
    }

    public static SamplePoint d(String str, String str2, long j, long j2, String str3) {
        SamplePoint samplePoint = new SamplePoint();
        samplePoint.setKey(str);
        samplePoint.setValue(str2);
        samplePoint.setStartTime(Long.valueOf(j));
        samplePoint.setEndTime(Long.valueOf(j2));
        samplePoint.setUnit(str3);
        return samplePoint;
    }

    public static SamplePoint c(String str, String str2, long j, long j2, String str3, String str4) {
        SamplePoint samplePoint = new SamplePoint();
        samplePoint.setKey(str);
        samplePoint.setValue(str2);
        samplePoint.setStartTime(Long.valueOf(j));
        samplePoint.setEndTime(Long.valueOf(j2));
        samplePoint.setUnit(str3);
        samplePoint.setFieldsModifyTime(str4);
        return samplePoint;
    }

    public static SportBasicInfo e(Integer num, Integer num2, Integer num3, Float f, Integer num4, Integer num5, Integer num6) {
        SportBasicInfo sportBasicInfo = new SportBasicInfo();
        sportBasicInfo.configAltitude(f.floatValue());
        sportBasicInfo.configCalorie(num3.intValue());
        sportBasicInfo.configDistance(num2.intValue());
        sportBasicInfo.configDuration(num5.intValue());
        sportBasicInfo.configFloor(num4.intValue());
        sportBasicInfo.configSteps(num.intValue());
        sportBasicInfo.configCount(num6.intValue());
        return sportBasicInfo;
    }

    public static kuk d(int i, double d, int i2) {
        kuk kukVar = new kuk();
        kukVar.c(d);
        kukVar.d(i);
        kukVar.f(i2);
        return kukVar;
    }

    public static int d(int i) {
        int iA = lil.a(i);
        return (iA != -1 || HiHealthDictManager.a((Context) null).a(i) == null) ? iA : i;
    }

    public static int c(int i) {
        int iD = lil.d(i);
        return (iD != -1 || HiHealthDictManager.a((Context) null).a(i) == null) ? iD : i;
    }

    public static int a(int i) {
        return lil.b(i);
    }

    public static String e(int i) {
        return lil.e(i);
    }

    public static boolean g(int i) {
        return lil.g(i);
    }

    public static String b(int i) {
        return HiJsonUtil.d(new CloudIntensity(i));
    }

    public static String c(double d) {
        return HiJsonUtil.d(new HiSyncBloodOxygenSaturation(d));
    }

    public static String a(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return "";
        }
        Electrocardiogram electrocardiogram = new Electrocardiogram();
        EcgMetaData ecgMetaData = (EcgMetaData) HiJsonUtil.d(hiHealthData.getMetaData(), EcgMetaData.class);
        if (ecgMetaData == null) {
            LogUtil.j("HiDataSwitchUtil", "getCloudEcgStr metadata null");
            return "";
        }
        electrocardiogram.setAverageHeartRate(ecgMetaData.getAverageHeartRate());
        electrocardiogram.setEcgArrhyType(ecgMetaData.getEcgArrhyType());
        electrocardiogram.setEcgDataLength(ecgMetaData.getEcgDataLength());
        electrocardiogram.setUserSymptom(ecgMetaData.getUserSymptom());
        electrocardiogram.setDetails(hiHealthData.getSequenceData());
        List<Float> listD = d(hiHealthData);
        if (njy.b(listD)) {
            electrocardiogram.setEcgDataList(listD);
        }
        electrocardiogram.setMetadata(HiJsonUtil.d(ecgMetaData));
        return HiJsonUtil.d(electrocardiogram);
    }

    private static List d(HiHealthData hiHealthData) {
        String simpleData = hiHealthData.getSimpleData();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(simpleData)) {
            try {
                Float[] fArr = (Float[]) HiJsonUtil.d(simpleData, Float[].class);
                if (fArr != null) {
                    return Arrays.asList(fArr);
                }
            } catch (JsonSyntaxException e) {
                ReleaseLogUtil.e("HiH_HiDataSwitchUtil", "simpleData parse fail", LogAnonymous.b(e));
            }
        }
        return arrayList;
    }

    public static String b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return "";
        }
        return HiJsonUtil.d(new HiSyncBodyThermometer(hiHealthData.getValue()));
    }

    public static String e(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return "";
        }
        return HiJsonUtil.d(new HiSyncBloodOxygenRemind(hiHealthData.getIntValue()));
    }

    public static String c(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return "";
        }
        return HiJsonUtil.d(new HiSyncUricAcid(hiHealthData.getIntValue()));
    }

    public static CloudIntensity d(String str) {
        try {
            return (CloudIntensity) HiJsonUtil.d(str, CloudIntensity.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getCloudIntensityValue JsonSyntaxException", LogAnonymous.b(e));
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getCloudIntensityValue Exception", LogAnonymous.b(e2));
            return null;
        }
    }

    public static HiSyncBloodOxygenSaturation c(String str) {
        try {
            return (HiSyncBloodOxygenSaturation) HiJsonUtil.d(str, HiSyncBloodOxygenSaturation.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncBloodOxygenValue JsonSyntaxException", LogAnonymous.b(e));
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncBloodOxygenValue Exception", LogAnonymous.b(e2));
            return null;
        }
    }

    public static HiSyncBodyThermometer b(String str) {
        try {
            return (HiSyncBodyThermometer) HiJsonUtil.d(str, HiSyncBodyThermometer.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncBodyThermometer JsonSyntaxException", LogAnonymous.b(e));
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncBodyThermometer Exception", LogAnonymous.b(e2));
            return null;
        }
    }

    public static HiSyncBloodOxygenRemind e(String str) {
        try {
            return (HiSyncBloodOxygenRemind) HiJsonUtil.d(str, HiSyncBloodOxygenRemind.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncBloodOxygenRemind JsonSyntaxException", LogAnonymous.b(e));
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncBloodOxygenRemind Exception", LogAnonymous.b(e2));
            return null;
        }
    }

    public static Electrocardiogram a(String str) {
        try {
            return (Electrocardiogram) HiJsonUtil.d(str, Electrocardiogram.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncEcgValue JsonSyntaxException", LogAnonymous.b(e));
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncEcgValue Exception", LogAnonymous.b(e2));
            return null;
        }
    }

    public static HiSyncUricAcid h(String str) {
        try {
            return (HiSyncUricAcid) HiJsonUtil.d(str, HiSyncUricAcid.class);
        } catch (JsonSyntaxException e) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncUricAcid JsonSyntaxException", LogAnonymous.b(e));
            return null;
        } catch (Exception e2) {
            ReleaseLogUtil.a("HiH_HiDataSwitchUtil", "getSyncUricAcid Exception", LogAnonymous.b(e2));
            return null;
        }
    }
}
