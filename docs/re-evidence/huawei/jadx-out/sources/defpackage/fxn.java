package defpackage;

import android.text.TextUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.health.constants.ObserveLabels;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.data.model.PPGTypeRstData;
import com.huawei.hihealth.data.model.PPGTypeRstDataWrapper;
import com.huawei.hihealth.data.model.PPGTypeRstPointClone;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import health.compact.a.CommonUtil;
import health.compact.a.EnvironmentInfo;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class fxn {
    public static Map a() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce");
        if (fdiVarD == null) {
            ReleaseLogUtil.e("HeartRateCardUtils", "getExtInfo featureConfig is null");
            return null;
        }
        return fdiVarD.e();
    }

    public static String e(HiHealthData hiHealthData) {
        String metaData = hiHealthData.getMetaData();
        if (TextUtils.isEmpty(metaData)) {
            LogUtil.e("HeartRateCardUtils", "getDrawDataJsonStrWithAlgo failed, cause metaDataStr is empty!");
            return null;
        }
        fxx fxxVar = (fxx) qqt.c(metaData, new TypeToken<fxx>() { // from class: com.huawei.health.marketing.utils.HeartRateCardUtils$1
        }.getType());
        if (fxxVar == null) {
            LogUtil.e("HeartRateCardUtils", "getDrawDataJsonStrWithAlgo failed, cause ppgMetaData is null!");
            return null;
        }
        long startTime = hiHealthData.getStartTime();
        fxa fxaVar = new fxa();
        e(fxaVar, fxxVar, startTime);
        int size = fxaVar.k.size();
        if (size < 4) {
            LogUtil.e("HeartRateCardUtils", "getDrawDataJsonStrWithAlgo failed, cause rriArrayLength is less than!");
            return null;
        }
        double dIntValue = fxaVar.k.get(size - 1).intValue();
        double dIntValue2 = fxaVar.k.get(size - 2).intValue();
        double dIntValue3 = fxaVar.k.get(size - 3).intValue();
        double dPow = Math.pow(65536.0d, 2.0d);
        double dIntValue4 = fxaVar.k.get(size - 4).intValue();
        double dPow2 = Math.pow(65536.0d, 3.0d);
        String sequenceData = hiHealthData.getSequenceData();
        if (TextUtils.isEmpty(sequenceData)) {
            LogUtil.e("HeartRateCardUtils", "getDrawDataJsonStrWithAlgo sequenceData is empty!");
            return null;
        }
        fyc fycVar = new fyc();
        a(fycVar, sequenceData, (long) (dIntValue + (dIntValue2 * 65536.0d) + (dIntValue3 * dPow) + (dIntValue4 * dPow2)), sequenceData.length() / 56, startTime);
        fxv fxvVar = new fxv();
        fxvVar.f34723b.add(fxaVar);
        fxvVar.f34724c = fxvVar.f34723b.size();
        fxvVar.f34722a.add(fycVar);
        fxvVar.d = fxvVar.f34722a.size();
        return a(fxvVar);
    }

    public static void e(fxa fxaVar, fxx fxxVar, long j) {
        String str = fxxVar.f34726c;
        String str2 = fxxVar.d;
        int i = fxxVar.f34725b;
        int i2 = fxxVar.e;
        fxaVar.l = j;
        fxaVar.f34668c = i2;
        fxaVar.m = i;
        int i3 = 0;
        if (!TextUtils.isEmpty(str)) {
            int i4 = 0;
            while (i4 < str.length()) {
                int i5 = i4 + 2;
                if (i5 <= str.length()) {
                    fxaVar.o.add(Integer.valueOf(CommonUtil.c(str.substring(i4, i5), 16)));
                }
                i4 = i5;
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        while (i3 < str2.length()) {
            int i6 = i3 + 4;
            if (i6 <= str2.length()) {
                fxaVar.k.add(Integer.valueOf(CommonUtil.c(l(str2.substring(i3, i6)), 16)));
            }
            i3 = i6;
        }
    }

    public static void a(fyc fycVar, String str, long j, long j2, long j3) {
        int i;
        int i2;
        long j4 = j2;
        for (int i3 = 0; i3 < 300; i3++) {
            int i4 = i3 * 56;
            if (i4 < str.length() && (i = i4 + 16) <= str.length()) {
                long jD = CommonUtil.d(l(str.substring(i4, i)), 16);
                fxu fxuVar = new fxu();
                fxuVar.f34721c = jD;
                if (fxuVar.f34721c < j) {
                    j4--;
                } else {
                    for (int i5 = 0; i5 < 5; i5++) {
                        int i6 = (i5 * 8) + i;
                        if (i6 < str.length() && (i2 = i6 + 8) <= str.length()) {
                            int iD = (int) CommonUtil.d(l(str.substring(i6, i2)), 16);
                            List<Integer> list = fxuVar.d;
                            if ((iD >>> 31) > 0) {
                                iD = -(~iD);
                            }
                            list.add(Integer.valueOf(iD));
                        }
                    }
                    fycVar.f34734c.add(fxuVar);
                }
            }
        }
        if (j4 < 240) {
            LogUtil.e("HeartRateCardUtils", "configPPGSamplePointClone error alignPpgLen = ", Long.valueOf(j4), ", is less than PPG_DATA_SAMPLE_POINT_MIN_LENGTH");
        }
        for (int size = fycVar.f34734c.size(); size < 300; size++) {
            fycVar.f34734c.add(new fxu());
        }
        fycVar.f34733b = j3;
    }

    public static String a(fxv fxvVar) {
        if (!AppBundle.c().isExistLocalModule("PluginHealthAlgorithm") && !AppBundle.c().isBuiltInModule(BaseApplication.b(), "PluginHealthAlgorithm")) {
            LogUtil.j("HeartRateCardUtils", "PpgHeartStudyAlgorithmProxy not exist");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(qqt.b(fxvVar));
            List<JSONObject> listE = e(jSONObject.getJSONArray("ppgSamplePointClonesList"));
            List<JSONObject> listE2 = e(jSONObject.getJSONArray("deviceMeasureRstBeanList"));
            LogUtil.a("HeartRateCardUtils", "getAlgoResult ppgSamplePointClonesList size=", listE, ", deviceMeasureRstBeanList size=", listE2);
            List<PPGTypeRstData> ppgTypeRstBeanList = ((PPGTypeRstDataWrapper) qqt.c(pfi.c().getDrawData(listE, listE2, listE.size(), listE2.size()).toString(), new TypeToken<PPGTypeRstDataWrapper>() { // from class: com.huawei.health.marketing.utils.HeartRateCardUtils$2
            }.getType())).getPpgTypeRstBeanList();
            if (njy.e(ppgTypeRstBeanList)) {
                LogUtil.e("HeartRateCardUtils", "getAlgoResult failed, cause dataList is empty!");
                return null;
            }
            return qqt.a(ppgTypeRstBeanList.get(0), new TypeToken<PPGTypeRstData>() { // from class: com.huawei.health.marketing.utils.HeartRateCardUtils$3
            }.getType());
        } catch (JSONException e) {
            LogUtil.e("HeartRateCardUtils", "getAlgoResult jsonException = ", ExceptionUtils.c(e));
            return null;
        }
    }

    public static List<JSONObject> e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        try {
            LogUtil.a("HeartRateCardUtils", "toJsonList rawList size=", Integer.valueOf(jSONArray.length()));
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getJSONObject(i));
            }
        } catch (JSONException e) {
            LogUtil.e("HeartRateCardUtils", "toJsonList JSONException", e.getMessage());
        }
        return arrayList;
    }

    private static String l(String str) {
        StringBuilder sb = new StringBuilder();
        for (int length = str.length() - 1; length >= 0; length -= 2) {
            int i = length - 1;
            int length2 = length + 1;
            if (i < 0) {
                i = 0;
            }
            if (length2 > str.length()) {
                length2 = str.length();
            }
            sb.append(str.substring(i, length2));
        }
        return sb.toString();
    }

    private static List<gvh> c(PPGTypeRstData pPGTypeRstData) {
        ArrayList<PPGTypeRstPointClone> points = pPGTypeRstData.getPoints();
        ArrayList<Integer> arrayTypeIdx = pPGTypeRstData.getArrayTypeIdx();
        int i = 0;
        for (int i2 = 0; i2 < points.size() && arrayTypeIdx.get(i2).intValue() == 1; i2++) {
            i++;
        }
        ArrayList<Double> arrayOutsideRr = pPGTypeRstData.getArrayOutsideRr();
        ArrayList arrayList = new ArrayList();
        Iterator<Double> it = arrayOutsideRr.iterator();
        while (it.hasNext()) {
            arrayList.add(new gvh(it.next().doubleValue()));
        }
        int end = i > 0 ? points.get(i - 1).getEnd() + 1 : 0;
        if (end >= arrayList.size()) {
            LogUtil.e("HeartRateCardUtils", "getSeqDataCutInvalidStart error validSeqDataStartIndex = ", Integer.valueOf(end), " is greater than seqData.size() = ", Integer.valueOf(arrayList.size()));
            return arrayList;
        }
        while (i < points.size()) {
            if (arrayTypeIdx.get(i).intValue() == 1) {
                PPGTypeRstPointClone pPGTypeRstPointClone = points.get(i);
                int start = pPGTypeRstPointClone.getStart();
                int end2 = pPGTypeRstPointClone.getEnd();
                if (start >= arrayList.size()) {
                    break;
                }
                while (start <= end2) {
                    if (njy.c(arrayList, start)) {
                        ((gvh) arrayList.get(start)).b(true);
                    }
                    start++;
                }
            }
            i++;
        }
        return arrayList.subList(end, arrayList.size());
    }

    public static List<gvh> b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HeartRateCardUtils", "getSeqData failed, cause drawDataJsonStr is empty!");
            return null;
        }
        try {
            PPGTypeRstData pPGTypeRstData = (PPGTypeRstData) qqt.c(str, new TypeToken<PPGTypeRstData>() { // from class: com.huawei.health.marketing.utils.HeartRateCardUtils$4
            }.getType());
            if (pPGTypeRstData == null) {
                LogUtil.e("HeartRateCardUtils", "rstData is null");
                return null;
            }
            List<gvh> listC = c(pPGTypeRstData);
            if (njy.e(listC)) {
                LogUtil.e("HeartRateCardUtils", "parseEcgDiagramSeqData cause seqData is empty");
                return listC;
            }
            int size = listC.size();
            int i = size - 1;
            int i2 = ((int) ((i * 7000) / (i * 40))) + 1;
            return size >= i2 ? listC.subList(0, i2) : listC;
        } catch (Exception e) {
            LogUtil.e("HeartRateCardUtils", "onQueryDetailDone failed, exception: ", e.getMessage(), ", drawDataJsonStr = ", str);
            return null;
        }
    }

    public static List<Double> e(String str) {
        List<gvh> listB = b(str);
        if (njy.e(listB)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (gvh gvhVar : listB) {
            if (gvhVar.a()) {
                i++;
            } else {
                arrayList.add(Double.valueOf(gvhVar.b()));
            }
        }
        LogUtil.a("HeartRateCardUtils", "unValid data list size is ", Integer.valueOf(i));
        return arrayList;
    }

    public static List<gvh> b(List<HiHealthData> list) {
        List<Double> listE = e(list);
        if (listE == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Double> it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(new gvh(it.next().doubleValue()));
        }
        return arrayList;
    }

    public static List<Double> e(List<HiHealthData> list) {
        List<Double> list2;
        try {
            list2 = (List) qqt.c(list.get(0).getSimpleData(), new TypeToken<ArrayList<Double>>() { // from class: com.huawei.health.marketing.utils.HeartRateCardUtils$5
            }.getType());
        } catch (JsonSyntaxException unused) {
            LogUtil.e("HeartRateCardUtils", "JsonSyntaxException");
            list2 = Collections.EMPTY_LIST;
        }
        if (njy.e(list2)) {
            LogUtil.e("HeartRateCardUtils", "parseEcgDiagramSeqData cause seqData is empty");
            return null;
        }
        int size = list2.size();
        int i = size - 1;
        int i2 = ((int) ((i * 7000) / (i * 40))) + 1;
        return size >= i2 ? list2.subList(0, i2) : list2;
    }

    public static boolean g(String str) {
        return fej.a("com.huawei.health_deviceFeature_config", "txt", str);
    }

    public static double c() {
        Map mapA = a();
        if (mapA == null) {
            return 0.0d;
        }
        Object obj = mapA.get("dia");
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HeartRateCardUtils", "checkMedicalType medicalType is null");
            return false;
        }
        Map mapA = a();
        if (mapA == null) {
            LogUtil.e("HeartRateCardUtils", "checkMedicalType extInfo is null!");
            ReleaseLogUtil.a("HeartRateCardUtils", "checkMedicalType extInfo is null!");
            return false;
        }
        Object obj = mapA.get("medical");
        LogUtil.a("HeartRateCardUtils", "checkMedicalType medicalValue = ", obj);
        ReleaseLogUtil.d("HeartRateCardUtils", "checkMedicalType medicalValue = ", obj);
        if (!(obj instanceof Boolean) || !((Boolean) obj).booleanValue()) {
            return false;
        }
        Object obj2 = mapA.get("medicalType");
        LogUtil.a("HeartRateCardUtils", "checkMedicalType medicalTypeValue = ", obj2);
        ReleaseLogUtil.d("HeartRateCardUtils", "checkMedicalType medicalTypeValue = ", obj2);
        if (obj2 instanceof String) {
            return str.equals((String) obj2);
        }
        return false;
    }

    public static boolean b() {
        return Double.compare(c(), 1.0d) == 0;
    }

    public static boolean g() {
        if (CommonUtil.ao() || CommonUtil.cl()) {
            return true;
        }
        return (i() || d()) && j("support_ecg_diagram") && !EnvironmentInfo.m();
    }

    public static boolean j() {
        if (CommonUtil.ao() || CommonUtil.cl()) {
            return true;
        }
        return (g("com.huawei.health.h5.ppg") || f()) && j("support_arrhythmia") && !EnvironmentInfo.m();
    }

    public static boolean h() {
        if (CommonUtil.ao() || CommonUtil.cl()) {
            return true;
        }
        if (g("com.huawei.health.h5.vascular-health") && j("support_vascular")) {
            return ((LoginInit.getInstance(BaseApplication.b()).isBrowseMode() && Utils.h()) || EnvironmentInfo.m()) ? false : true;
        }
        return false;
    }

    public static boolean f() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ppg");
        if (fdiVarD == null || fdiVarD.e() == null) {
            LogUtil.e("HeartRateCardUtils", "isSupportPpg featureConfig or getExtInfo() is null");
            return false;
        }
        Map mapE = fdiVarD.e();
        if (mapE == null) {
            LogUtil.e("HeartRateCardUtils", "isSupportPpg extInfo is null");
            return false;
        }
        Object obj = mapE.get("support_ppg");
        LogUtil.a("HeartRateCardUtils", "isSupportPpg supportPpg:", obj);
        return (obj instanceof Double) && ((Double) obj).doubleValue() > 0.0d;
    }

    public static boolean d() {
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce");
        if (fdiVarD == null) {
            LogUtil.j("HeartRateCardUtils", "isSupportEcgExtInfo featureConfig is null");
            return false;
        }
        Map mapE = fdiVarD.e();
        if (mapE == null) {
            LogUtil.j("HeartRateCardUtils", "isSupportEcgExtInfo extInfo is null!");
            return false;
        }
        Integer numD = fdiVarD.d();
        Object obj = mapE.get("support_ecg");
        if (obj instanceof Double) {
            LogUtil.a("HeartRateCardUtils", "isSupportEcgExtInfo supportEcg is ", obj, " support is ", numD);
            if (Double.compare(((Double) obj).doubleValue(), 1.0d) == 0) {
                Integer num = 0;
                if (num.equals(numD)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i() {
        return g("com.huawei.health.h5.ecgce");
    }

    static boolean j(String str) {
        String strD = lon.c().d(str);
        boolean zEquals = "true".equals(strD);
        boolean zBu = CommonUtil.bu();
        boolean zCa = CommonUtil.ca();
        ReleaseLogUtil.d("HeartRateCardUtils", "isSupportConfig supportKey = ", str, ", supportValue = ", strD, ", isReleaseVersion = ", Boolean.valueOf(zBu), ", isDemoVersion = ", Boolean.valueOf(zCa));
        return !(zBu || zCa) || zEquals;
    }

    public static void b(boolean z, String str) {
        SharedPreferenceManager.a(Integer.toString(10052), f(str), z);
    }

    public static boolean c(String str) {
        return SharedPreferenceManager.b(Integer.toString(10052), f(str), false);
    }

    public static long d(String str) {
        return SharedPreferenceManager.d(Integer.toString(10052), h(str), 0L);
    }

    public static void c(long j, String str) {
        SharedPreferenceManager.c(Integer.toString(10052), h(str), j);
    }

    private static String h(String str) {
        return str + "_newDataDotTimeStamp";
    }

    private static String f(String str) {
        return str + "_newDataDotExists";
    }

    public static boolean e() {
        Map mapE;
        fdi fdiVarD = fej.d("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ppg");
        if (fdiVarD == null || (mapE = fdiVarD.e()) == null) {
            return false;
        }
        Object obj = mapE.get("medicalType");
        LogUtil.a("ArrhythmiaItemHolder", "medicalType: ", obj);
        return (obj instanceof String) && obj.equals("NMPA");
    }

    public static int a(int i) {
        boolean zE = e();
        LogUtil.a("HeartRateCardUtils", "isNMPA:", Boolean.valueOf(zE), " originType:", Integer.valueOf(i));
        if (i == 4) {
            if (zE) {
                return 3;
            }
            return i;
        }
        if (i == 5 && zE) {
            return 2;
        }
        return i;
    }

    public static void i(String str) {
        String str2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            long j = jSONObject.getLong("time");
            if (j <= 0) {
                LogUtil.e("HeartRateCardUtils", "time is unvalid");
                return;
            }
            int i = jSONObject.getInt("type");
            if (i == 0) {
                str2 = "NormalItemHolder";
            } else if (i == 1) {
                str2 = "NormalDiaItemHolder";
            } else if (i == 2) {
                str2 = "ArrhythmiaItemHolder";
            } else {
                if (i != 3) {
                    LogUtil.e("HeartRateCardUtils", "unvalid type");
                    return;
                }
                str2 = "VascularItemHolder";
            }
            if (j >= d(str2)) {
                LogUtil.a("HeartRateCardUtils", "refresh cache: ", str2);
                c(j, str2);
                b(false, str2);
                ObserverManagerUtil.e(ObserveLabels.HEART_RATE, new Object[0]);
            }
        } catch (JSONException e) {
            LogUtil.e("HeartRateCardUtils", "userVisitLatestTime,", e.getMessage());
        }
    }
}
