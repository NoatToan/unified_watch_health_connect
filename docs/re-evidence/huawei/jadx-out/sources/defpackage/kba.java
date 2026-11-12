package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.medicine.MedicinesRule;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class kba {
    public static void c(final List<String> list, boolean z, final qgc qgcVar) {
        if (z || qgcVar == null) {
            ReleaseLogUtil.d("R_HL_TakeMedicineUtils", "updateMedicineHiHealthRuleData isSkipSaveGoalToKit ", Boolean.valueOf(z), " queryTasksResp ", qgcVar);
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kax
                @Override // java.lang.Runnable
                public final void run() {
                    kba.c(list, false, qgcVar);
                }
            });
            return;
        }
        List<String> listD = d(list);
        LogUtil.b("TakeMedicineUtils", "updateMedicineHiHealthRuleData deleteList ", list, " deleteIdList ", listD);
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(20140101), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{DicDataTypeUtil.DataType.MEDICATION_RULE.value()});
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).d(true).b(), new AnonymousClass3(iA, listD, qgcVar));
    }

    /* JADX INFO: renamed from: kba$3, reason: invalid class name */
    class AnonymousClass3 implements HiDataReadResultListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f39287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ qgc f39288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39289c;

        AnonymousClass3(int i, List list, qgc qgcVar) {
            this.f39289c = i;
            this.f39287a = list;
            this.f39288b = qgcVar;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.b("TakeMedicineUtils", "updateMedicineHiHealthRuleData object ", HiJsonUtil.d(obj), " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
            HashMap map = new HashMap(16);
            List listE = kba.e((List<HiHealthData>) kba.d(obj), this.f39289c, map);
            LogUtil.b("TakeMedicineUtils", "updateMedicineHiHealthRuleData ruleList ", HiJsonUtil.d(listE));
            ArrayList arrayList = new ArrayList();
            kba.a(this.f39287a, listE, arrayList, this.f39288b);
            LogUtil.b("TakeMedicineUtils", "updateMedicineHiHealthRuleData mergedList ", HiJsonUtil.d(arrayList));
            final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            if (!CollectionUtils.a(arrayList)) {
                hiDataInsertOption.setDatas(kba.a(arrayList, map));
                HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: kbb
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i3, Object obj2) {
                        LogUtil.b("TakeMedicineUtils", "updateMedicineHiHealthRuleData type ", Integer.valueOf(i3), " resultObject ", obj2, " insertOption ", HiJsonUtil.d(hiDataInsertOption));
                    }
                });
            } else {
                ReleaseLogUtil.d("R_HL_TakeMedicineUtils", "updateMedicineHiHealthRuleData mergedList ", arrayList);
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.b("TakeMedicineUtils", "refreshDoctorRule intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> d(Object obj) {
        ArrayList arrayList = new ArrayList();
        if (obj instanceof SparseArray) {
            Object obj2 = ((SparseArray) obj).get(DicDataTypeUtil.DataType.MEDICATION_RULE.value());
            if (njy.b(obj2, HiHealthData.class)) {
                return (List) obj2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(List<String> list, List<MedicinesRule> list2, List<MedicinesRule> list3, qgc qgcVar) {
        LogUtil.b("TakeMedicineUtils", "mergedMedicinesRule deleteList ", list, " ruleList ", HiJsonUtil.d(list2), " mergedList ", HiJsonUtil.d(list3), " queryTasksResp ", HiJsonUtil.d(qgcVar));
        if (!CollectionUtils.a(list)) {
            list3.addAll(e(list2, list));
        }
        List<qfy> listB = qgcVar.b();
        if (CollectionUtils.a(listB)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (qfy qfyVar : listB) {
            if (qfyVar != null && "T120910".equals(qfyVar.d())) {
                e(qfyVar, arrayList);
            }
        }
        list3.addAll(arrayList);
    }

    private static void e(qfy qfyVar, List<MedicinesRule> list) {
        for (qfk qfkVar : qfyVar.n()) {
            if (qfkVar != null) {
                for (qfg qfgVar : qfkVar.n()) {
                    if (qfgVar != null) {
                        String strD = qfgVar.d();
                        if (!TextUtils.isEmpty(strD)) {
                            b(strD, list);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:17:0x004b  */
    private static void b(String str, List<MedicinesRule> list) {
        String strOptString;
        int iOptInt;
        int iOptInt2;
        MedicinesRule medicinesRule;
        String strOptString2 = "";
        int iOptInt3 = 0;
        try {
            JSONObject jSONObject = new JSONObject(str);
            strOptString = jSONObject.optString("medicationMark");
            try {
                iOptInt = jSONObject.optInt("medicationRuleExpectedTime");
                try {
                    strOptString2 = jSONObject.optString("medicationName");
                    iOptInt2 = jSONObject.optInt("medicationRuleId");
                    try {
                        iOptInt3 = jSONObject.optInt("medicinePeriod");
                    } catch (JSONException unused) {
                        ReleaseLogUtil.b("TakeMedicineUtils", "JSONException medicinePeriod");
                    }
                } catch (JSONException unused2) {
                    iOptInt2 = 0;
                }
            } catch (JSONException unused3) {
                iOptInt = 0;
                iOptInt2 = 0;
                ReleaseLogUtil.b("TakeMedicineUtils", "JSONException medicinePeriod");
                medicinesRule = new MedicinesRule();
                if (!TextUtils.isEmpty(strOptString2)) {
                    medicinesRule.setName(strOptString2);
                }
                if (!TextUtils.isEmpty(strOptString)) {
                    medicinesRule.setMark(strOptString);
                }
                medicinesRule.setRuleId(iOptInt2);
                medicinesRule.setMedicineTime(iOptInt);
                medicinesRule.setMedicinePeriod(iOptInt3);
                list.add(medicinesRule);
            }
        } catch (JSONException unused4) {
            strOptString = "";
        }
        medicinesRule = new MedicinesRule();
        if (!TextUtils.isEmpty(strOptString2)) {
            medicinesRule.setName(strOptString2);
        }
        if (!TextUtils.isEmpty(strOptString)) {
            medicinesRule.setMark(strOptString);
        }
        medicinesRule.setRuleId(iOptInt2);
        medicinesRule.setMedicineTime(iOptInt);
        medicinesRule.setMedicinePeriod(iOptInt3);
        list.add(medicinesRule);
    }

    public static List<MedicinesRule> e(List<MedicinesRule> list, List<String> list2) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.a(list) && !CollectionUtils.a(list2)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (MedicinesRule medicinesRule : list) {
                if (list2.contains(String.valueOf(medicinesRule.getRuleId()))) {
                    long startTime = medicinesRule.getStartTime();
                    long endTime = medicinesRule.getEndTime();
                    if (endTime == 0 || (jCurrentTimeMillis >= startTime && jCurrentTimeMillis <= endTime)) {
                        medicinesRule.setEndTime(System.currentTimeMillis());
                        arrayList.add(medicinesRule);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> a(List<MedicinesRule> list, Map<String, Long> map) {
        ArrayList arrayList = new ArrayList();
        if (!CollectionUtils.a(list)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < list.size(); i++) {
                MedicinesRule medicinesRule = list.get(i);
                if (medicinesRule != null) {
                    long j = jCurrentTimeMillis + ((long) i);
                    HashMap map2 = new HashMap();
                    String name = medicinesRule.getName();
                    String mark = medicinesRule.getMark();
                    int ruleId = medicinesRule.getRuleId();
                    if (ruleId <= 0 && !TextUtils.isEmpty(name)) {
                        ruleId = bzx.a(name, mark, j);
                    }
                    int i2 = ruleId;
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_ID.value()), Integer.valueOf(i2));
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_DRUG.value()), Integer.valueOf(i2));
                    int source = medicinesRule.getSource();
                    if (source <= 0) {
                        source = 1;
                    }
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_SOURCE.value()), Integer.valueOf(source));
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_EXPECTED_TIME.value()), Integer.valueOf(medicinesRule.getMedicineTime()));
                    int ruleType = medicinesRule.getRuleType();
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_TYPE.value()), Integer.valueOf(ruleType > 0 ? ruleType : 1));
                    long startTime = medicinesRule.getStartTime();
                    if (startTime <= 0) {
                        startTime = lsl.r(j);
                    }
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_START_TIME.value()), Long.valueOf(startTime));
                    map2.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_PERIOD.value()), Integer.valueOf(medicinesRule.getMedicinePeriod()));
                    HashMap map3 = new HashMap();
                    map3.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_NAME.value()), name);
                    map3.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_MARK.value()), mark);
                    HiHealthData hiHealthDataC = c(map, map3, j, i2, map2, medicinesRule);
                    arrayList.add(hiHealthDataC);
                    LogUtil.b("TakeMedicineUtils", "generatedHiHealthRuleData healthDataList ", hiHealthDataC.toString());
                }
            }
        }
        return arrayList;
    }

    private static HiHealthData c(Map<String, Long> map, Map<Integer, String> map2, long j, int i, HashMap<Integer, Object> map3, MedicinesRule medicinesRule) {
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.MEDICATION_RULE.value());
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
        long jLongValue = map.containsKey(bzx.d(i)) ? map.get(bzx.d(i)).longValue() : j;
        if (map.containsKey(bzx.a(i))) {
            j = map.get(bzx.a(i)).longValue();
        }
        hiHealthData.setStartTime(jLongValue);
        hiHealthData.setEndTime(j);
        map3.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_END_TIME.value()), Long.valueOf(medicinesRule.getEndTime()));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map3));
        hiHealthData.setDeviceUuid(String.valueOf(-1));
        return hiHealthData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MedicinesRule> e(List<HiHealthData> list, int i, Map<String, Long> map) {
        long jC;
        if (CollectionUtils.a(list)) {
            LogUtil.e("TakeMedicineUtils", "getRuleList list null");
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        long jD = DateFormatUtil.d(i);
        if (lsl.aa(jD)) {
            jC = System.currentTimeMillis();
        } else {
            jC = lsl.c(jD);
        }
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                MedicinesRule medicinesRuleD = d(hiHealthData);
                if (bzx.d(medicinesRuleD)) {
                    long endTime = medicinesRuleD.getEndTime();
                    if (endTime == 0 || endTime >= jC) {
                        arrayList.add(medicinesRuleD);
                        e(medicinesRuleD.getRuleId(), hiHealthData, map);
                    }
                }
            }
        }
        return arrayList;
    }

    private static void e(int i, HiHealthData hiHealthData, Map<String, Long> map) {
        map.put(bzx.d(i), Long.valueOf(hiHealthData.getStartTime()));
        map.put(bzx.a(i), Long.valueOf(hiHealthData.getEndTime()));
    }

    private static MedicinesRule d(HiHealthData hiHealthData) {
        MedicinesRule medicinesRule = new MedicinesRule();
        String strB = bzr.b(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_NAME.value())));
        if (!TextUtils.isEmpty(strB)) {
            medicinesRule.setName(strB);
        }
        String strB2 = bzr.b(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_MARK.value())));
        if (!TextUtils.isEmpty(strB2)) {
            medicinesRule.setMark(strB2);
        }
        medicinesRule.setDrug(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_DRUG.value()))));
        medicinesRule.setRuleId(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_ID.value()))));
        medicinesRule.setSource(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_SOURCE.value()))));
        medicinesRule.setRuleType(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_TYPE.value()))));
        medicinesRule.setEndTime(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_END_TIME.value()))));
        medicinesRule.setStartTime(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_START_TIME.value()))));
        medicinesRule.setMedicineTime(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_EXPECTED_TIME.value()))));
        medicinesRule.setMedicinePeriod(bzr.d(hiHealthData.get(String.valueOf(DicDataTypeUtil.DataType.MEDICATION_RULE_PERIOD.value()))));
        return medicinesRule;
    }

    private static List<String> d(List<String> list) {
        qfg qfgVarB;
        if (CollectionUtils.a(list)) {
            return Collections.EMPTY_LIST;
        }
        qfj qfjVarG = jyc.c().g();
        LogUtil.b("TakeMedicineUtils", "convertDeleteId querySchedulesResp ", HiJsonUtil.d(qfjVarG));
        if (qfjVarG == null) {
            return Collections.EMPTY_LIST;
        }
        List<qfz> listI = qfjVarG.i();
        if (CollectionUtils.a(listI)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (qfz qfzVar : listI) {
            if (qfzVar != null && "T120910".equals(qfzVar.g())) {
                for (qfq qfqVar : qfzVar.f()) {
                    if (list.contains(qfqVar.f()) && (qfgVarB = qfqVar.b()) != null) {
                        try {
                            arrayList.add(String.valueOf(new JSONObject(qfgVarB.d()).optInt("medicationRuleId")));
                        } catch (JSONException unused) {
                            ReleaseLogUtil.b("TakeMedicineUtils", "JSONException medicinePeriod");
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
