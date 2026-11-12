package defpackage;

import android.text.TextUtils;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartRateThresholdConfig;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class lxt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Integer, Integer> f41100c = new LinkedHashMap(16);
    private static final Map<Integer, Integer> d = new HashMap(16);

    public static int a(byte[] bArr) throws cpy {
        if (bArr == null || bArr.length <= 2) {
            return 0;
        }
        cqk cqkVarC = new cql().c(bArr, 2);
        if (cqkVarC == null) {
            LogUtil.j("FitnessUnTlvSample", "unTlvGetSampleFrameCount is null");
            return 0;
        }
        List<cqk> listC = cqkVarC.c();
        int iA = 0;
        for (int i = 0; i < listC.size(); i++) {
            List<cqi> listD = listC.get(i).d();
            for (int i2 = 0; i2 < listD.size(); i2++) {
                if (listD.get(i2).c() != 2) {
                    LogUtil.j("FitnessUnTlvSample", "unTlvGetSampleFrameCount default");
                } else {
                    iA = eeq.a(listD.get(i2).d(), -1);
                }
            }
        }
        return iA;
    }

    private static List<lym> b(String str) {
        ArrayList arrayList = new ArrayList(16);
        if (str.length() == 0 || str.length() < 2) {
            LogUtil.j("FitnessUnTlvSample", "value.length is 0 or value.length() < position + SINGLE_BYTE_STRING_LEN");
            return arrayList;
        }
        int iD = d(str);
        byte[] bArrC = eeq.c(str.substring(0, iD));
        String strSubstring = str.substring(iD);
        if (TextUtils.isEmpty(strSubstring)) {
            return arrayList;
        }
        Map<Integer, Integer> mapE = e();
        if (!b(bArrC, mapE, strSubstring)) {
            LogUtil.j("FitnessUnTlvSample", "watch or band send tlv is wrong, please check : ", str);
            return arrayList;
        }
        c(bArrC, strSubstring, mapE, arrayList);
        return arrayList;
    }

    private static void c(byte[] bArr, String str, Map<Integer, Integer> map, List<lym> list) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if (CommonUtil.a(bArr, iIntValue)) {
                int iIntValue2 = (entry.getValue().intValue() * 2) + i;
                list.add(d(str.substring(i, iIntValue2), iIntValue));
                i = iIntValue2;
            }
        }
    }

    private static lym d(String str, int i) {
        int iV = CommonUtil.v(str);
        Integer num = a().get(Integer.valueOf(i));
        if (num != null) {
            i = num.intValue();
        }
        return new lym(i, iV);
    }

    private static int d(String str) {
        int i;
        int length = str.length();
        int i2 = 0;
        while (true) {
            i = i2 + 2;
            if (i > length || !CommonUtil.a(eeq.c(str.substring(i2, i)), 7)) {
                break;
            }
            i2 = i;
        }
        return i;
    }

    private static boolean b(byte[] bArr, Map<Integer, Integer> map, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iIntValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (CommonUtil.a(bArr, entry.getKey().intValue())) {
                iIntValue += entry.getValue().intValue() * 2;
            }
        }
        return str.length() >= iIntValue;
    }

    private static Map<Integer, Integer> e() {
        Map<Integer, Integer> map = f41100c;
        if (map.isEmpty()) {
            map.put(0, 2);
            map.put(1, 2);
            map.put(2, 2);
            map.put(3, 2);
            map.put(4, 2);
            map.put(5, 1);
            map.put(6, 1);
            map.put(8, 1);
            map.put(9, 1);
            b();
        }
        return map;
    }

    private static void b() {
        if (CommonUtil.ap()) {
            int i = -1;
            for (Map.Entry<Integer, Integer> entry : f41100c.entrySet()) {
                int iIntValue = entry.getKey().intValue();
                i = i % 8 == 6 ? i + 2 : i + 1;
                if (iIntValue != i) {
                    throw new RuntimeException("PARAMETER_INDEX_AND_LENGTH index must increase 1, if last index is (8 * n + 7),increase 2,you support index is " + iIntValue + ",you should put key is : " + i);
                }
                if (entry.getValue().intValue() <= 0) {
                    throw new RuntimeException("you put support index : " + iIntValue + " byteLength is <= 0, please check.");
                }
            }
        }
    }

    private static Map<Integer, Integer> a() {
        Map<Integer, Integer> map = d;
        if (map.isEmpty()) {
            map.put(0, 4);
            map.put(4, 5);
            map.put(5, 6);
            map.put(6, 7);
        }
        return map;
    }

    private static List<lym> c(List<lym> list, long j, int i, int i2, int i3) {
        long j2 = i * 60;
        for (lym lymVar : list) {
            lymVar.d(j + j2);
            lymVar.b(i2);
            lymVar.c(i3);
        }
        return list;
    }

    public static lyk e(byte[] bArr) throws cpy {
        lyk lykVar = new lyk();
        if (bArr != null && bArr.length > 2) {
            cqk cqkVarC = new cql().c(bArr, 2);
            if (cqkVarC == null) {
                LogUtil.j("FitnessUnTlvSample", "unTlvGetSampleFrame is null");
                return lykVar;
            }
            ArrayList arrayList = new ArrayList(16);
            List<cqk> listC = cqkVarC.c();
            int iA = 0;
            for (int i = 0; i < listC.size(); i++) {
                List<cqi> listD = listC.get(i).d();
                for (int i2 = 0; i2 < listD.size(); i2++) {
                    byte[] bArrD = listD.get(i2).d();
                    if (listD.get(i2).c() != 3) {
                        LogUtil.j("FitnessUnTlvSample", "unTlvGetSampleFrame default");
                    } else {
                        iA = eeq.a(bArrD, -1);
                        lykVar.d(iA);
                    }
                }
                b(arrayList, i, listC, iA);
            }
            lykVar.a(arrayList);
        }
        return lykVar;
    }

    private static void b(List<lym> list, int i, List<cqk> list2, int i2) {
        if (i < 0 || i >= list2.size()) {
            LogUtil.j("FitnessUnTlvSample", "dealSamplePointList out of index");
            return;
        }
        List<cqk> listC = list2.get(i).c();
        for (int i3 = 0; i3 < listC.size(); i3++) {
            List<cqi> listD = listC.get(i3).d();
            ArrayList arrayList = new ArrayList(16);
            int iA = 0;
            int iA2 = 0;
            int iA3 = 0;
            for (int i4 = 0; i4 < listD.size(); i4++) {
                byte[] bArrD = listD.get(i4).d();
                byte bC = listD.get(i4).c();
                if (bC == 5) {
                    iA = eeq.a(bArrD, -1);
                } else if (bC == 6) {
                    arrayList.addAll(b(eeq.e(bArrD)));
                } else if (bC == 8) {
                    iA2 = eeq.a(bArrD, -1);
                } else if (bC == 9) {
                    iA3 = eeq.a(bArrD, -1);
                } else {
                    arrayList.add(new lym(bC, eeq.a(bArrD, -1)));
                }
            }
            c(arrayList, i2, iA, iA2, iA3);
            list.addAll(arrayList);
        }
    }

    public static int d(ees eesVar) {
        int iV = 0;
        if (eesVar == null) {
            LogUtil.j("FitnessUnTlvSample", "unTlvGetDesFrameCount is null");
            return 0;
        }
        for (eew eewVar : eesVar.e()) {
            if (CommonUtil.v(eewVar.e()) != 1) {
                LogUtil.j("FitnessUnTlvSample", "unTlvGetDesFrameCount default");
            } else {
                iV = CommonUtil.v(eewVar.b());
            }
        }
        return iV;
    }

    public static lyh c(ees eesVar) {
        lyh lyhVar = new lyh();
        if (eesVar == null) {
            LogUtil.j("FitnessUnTlvSample", "unTlvGetDesFrame is null");
            return lyhVar;
        }
        List<eew> listE = eesVar.e();
        List<ees> listB = eesVar.b();
        for (eew eewVar : listE) {
            if (CommonUtil.v(eewVar.e()) != 1) {
                LogUtil.j("FitnessUnTlvSample", "unTlvGetDesFrame default");
            } else {
                lyhVar.c(CommonUtil.v(eewVar.b()));
            }
        }
        Iterator<ees> it = listB.iterator();
        while (it.hasNext()) {
            a(lyhVar, it.next());
            LogUtil.d("FitnessUnTlvSample", "desFrame.getDatas().add(frame)", lyhVar.toString());
        }
        return lyhVar;
    }

    public static HeartRateThresholdConfig e(ees eesVar) {
        if (eesVar == null) {
            LogUtil.j("FitnessUnTlvSample", "unTlvGetHeartConfig tlvFather is null");
            return null;
        }
        List<eew> listE = eesVar.e();
        HeartRateThresholdConfig studentHeartRateThresholdData = ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getStudentHeartRateData().getStudentHeartRateThresholdData();
        for (eew eewVar : listE) {
            switch (CommonUtil.v(eewVar.e())) {
                case 2:
                    LogUtil.a("FitnessUnTlvSample", "unTlvGetHeartConfig ", eewVar.b());
                    studentHeartRateThresholdData.setFitnessThreshold(CommonUtil.v(eewVar.b()));
                    break;
                case 3:
                    studentHeartRateThresholdData.setWarmUpThreshold(CommonUtil.v(eewVar.b()));
                    break;
                case 4:
                    studentHeartRateThresholdData.setFatBurnThreshold(CommonUtil.v(eewVar.b()));
                    break;
                case 5:
                    studentHeartRateThresholdData.setAerobicThreshold(CommonUtil.v(eewVar.b()));
                    break;
                case 6:
                    studentHeartRateThresholdData.setAnaerobicThreshold(CommonUtil.v(eewVar.b()));
                    break;
                case 7:
                    studentHeartRateThresholdData.setMaxThreshold(CommonUtil.v(eewVar.b()));
                    break;
                case 8:
                    studentHeartRateThresholdData.setWarningEnable(CommonUtil.v(eewVar.b()) == 1);
                    break;
                case 9:
                    studentHeartRateThresholdData.setWarningLimit(CommonUtil.v(eewVar.b()));
                    break;
                default:
                    e(eewVar, studentHeartRateThresholdData);
                    break;
            }
        }
        e(studentHeartRateThresholdData);
        return studentHeartRateThresholdData;
    }

    private static void e(HeartRateThresholdConfig heartRateThresholdConfig) {
        int maxThreshold = heartRateThresholdConfig.getMaxThreshold();
        heartRateThresholdConfig.setOldMaxThreshold(maxThreshold);
        int studentAge = 220 - ((HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class)).getStudentAge();
        boolean z = maxThreshold != studentAge;
        boolean z2 = heartRateThresholdConfig.getWarningLimit() != studentAge;
        LogUtil.a("FitnessUnTlvSample", "isSetMax ", Boolean.valueOf(z), " isSetLimit ", Boolean.valueOf(z2));
        heartRateThresholdConfig.getHeartZoneStateConfig().setIsSetMaxHeart(z);
        heartRateThresholdConfig.getHeartZoneStateConfig().setIsSetWarningLimit(z2);
    }

    private static void e(eew eewVar, HeartRateThresholdConfig heartRateThresholdConfig) {
        switch (CommonUtil.v(eewVar.e())) {
            case 10:
                heartRateThresholdConfig.setClassifyMethod(CommonUtil.v(eewVar.b()));
                break;
            case 11:
                heartRateThresholdConfig.setMaxThreshold(CommonUtil.v(eewVar.b()));
                break;
            case 12:
                heartRateThresholdConfig.setRestHeartRate(CommonUtil.v(eewVar.b()));
                break;
            case 13:
                heartRateThresholdConfig.setAerobicBaseThreshold(CommonUtil.v(eewVar.b()));
                break;
            case 14:
                heartRateThresholdConfig.setAerobicAdvanceThreshold(CommonUtil.v(eewVar.b()));
                break;
            case 15:
                heartRateThresholdConfig.setLacticAcidThreshold(CommonUtil.v(eewVar.b()));
                break;
            case 16:
                heartRateThresholdConfig.setAnaerobicBaseThreshold(CommonUtil.v(eewVar.b()));
                break;
            case 17:
                heartRateThresholdConfig.setAnaerobicAdvanceThreshold(CommonUtil.v(eewVar.b()));
                break;
            default:
                LogUtil.j("FitnessUnTlvSample", "unTlvGetHeartConfigOther default");
                break;
        }
    }

    private static void a(lyh lyhVar, ees eesVar) {
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            List<eew> listE = it.next().e();
            lyh.c cVar = new lyh.c();
            for (eew eewVar : listE) {
                int iV = CommonUtil.v(eewVar.e());
                if (iV == 4) {
                    cVar.d(CommonUtil.v(eewVar.b()));
                } else if (iV == 5) {
                    cVar.b(CommonUtil.v(eewVar.b()));
                } else if (iV == 6) {
                    cVar.a(CommonUtil.v(eewVar.b()));
                } else {
                    LogUtil.j("FitnessUnTlvSample", "unTlvGetDesFrameCount default");
                }
            }
            lyhVar.a().add(cVar);
        }
    }
}
