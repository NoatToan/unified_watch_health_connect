package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.basichealthmodel.medicine.MedicineBean;
import com.huawei.basichealthmodel.medicine.MedicineRecord;
import com.huawei.basichealthmodel.medicine.MedicinesRule;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiDataReadProOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.LogAnonymous;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes23.dex */
public class bzr {
    private static final int d = DicDataTypeUtil.DataType.MEDICATION_RULE.value();
    private static final int k = DicDataTypeUtil.DataType.MEDICATION_RULE_SOURCE.value();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f1366b = DicDataTypeUtil.DataType.MEDICATION_RULE_DRUG.value();
    private static final int j = DicDataTypeUtil.DataType.MEDICATION_RULE_EXPECTED_TIME.value();
    private static final int f = DicDataTypeUtil.DataType.MEDICATION_RULE_PERIOD.value();
    private static final int h = DicDataTypeUtil.DataType.MEDICATION_RULE_ID.value();
    private static final int o = DicDataTypeUtil.DataType.MEDICATION_RULE_TYPE.value();
    private static final int n = DicDataTypeUtil.DataType.MEDICATION_RULE_START_TIME.value();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1367c = DicDataTypeUtil.DataType.MEDICATION_RULE_END_TIME.value();
    private static final int g = DicDataTypeUtil.DataType.MEDICATION_RULE_NAME.value();
    private static final int i = DicDataTypeUtil.DataType.MEDICATION_RULE_MARK.value();
    private static final String[] e = {"punchSource", "punchTaskId", "punchStatus", "punchDrug", "punchExpectedTime", "punchTime"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1365a = {DicDataTypeUtil.DataType.MEDICATION_PUNCH_SOURCE.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_TASK_ID.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_STATUS.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_DRUG.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_EXPECTED_TIME.value(), DicDataTypeUtil.DataType.MEDICATION_PUNCH_TIME.value()};
    private static final Map<String, Long> l = new HashMap(16);

    public static void c(List<MedicineRecord> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HL_MedicationManager", "insertMedicineRecord callback is null");
            return;
        }
        if (njy.e(list)) {
            iBaseResponseCallback.a(-1, "");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(e(list));
        LogUtil.a("HL_MedicationManager", "insertMedicineRecord list ", list.toString(), " option ", hiDataInsertOption);
        HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: bzt
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                bzr.e(iBaseResponseCallback, i2, obj);
            }
        });
    }

    static /* synthetic */ void e(IBaseResponseCallback iBaseResponseCallback, int i2, Object obj) {
        iBaseResponseCallback.a(i2, obj);
        LogUtil.a("HL_MedicationManager", "insertMedicineRecord errorCode ", Integer.valueOf(i2), " object ", obj);
    }

    public static void d(final List<MedicinesRule> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: bzu
                @Override // java.lang.Runnable
                public final void run() {
                    bzr.d(list, iBaseResponseCallback);
                }
            });
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a aVar = new a(1);
        c(list, countDownLatch, aVar);
        cbg.b(countDownLatch, "addMedicineInfo");
        if (aVar.a()) {
            iBaseResponseCallback.a(0, "");
        } else {
            iBaseResponseCallback.a(-1, "addMedicineInfo error");
        }
    }

    private static void g(List<HiHealthData> list, final IBaseResponseCallback iBaseResponseCallback) {
        LogUtil.a("HL_MedicationManager", "updateMedicineRule healthDataList ", list, " callback ", iBaseResponseCallback);
        final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(list);
        HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: bzq
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                bzr.c(hiDataInsertOption, iBaseResponseCallback, i2, obj);
            }
        });
    }

    static /* synthetic */ void c(HiDataInsertOption hiDataInsertOption, IBaseResponseCallback iBaseResponseCallback, int i2, Object obj) {
        LogUtil.a("HL_MedicationManager", "updateMedicineRule insertOption ", hiDataInsertOption, " type ", Integer.valueOf(i2), " object ", obj);
        iBaseResponseCallback.a(i2, "");
    }

    private static void a(List<HiHealthData> list, final CountDownLatch countDownLatch, final a aVar) {
        LogUtil.a("HL_MedicationManager", "updateMedicineRule healthDataList ", list, " countDownLatch ", countDownLatch, " countFlag ", aVar);
        if (njy.e(list)) {
            LogUtil.a("HL_MedicationManager", "updateMedicineRule healthDataList isEmpty");
            aVar.c();
            countDownLatch.countDown();
        } else {
            final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(list);
            HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: bzv
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i2, Object obj) {
                    bzr.d(aVar, countDownLatch, hiDataInsertOption, i2, obj);
                }
            });
        }
    }

    static /* synthetic */ void d(a aVar, CountDownLatch countDownLatch, HiDataInsertOption hiDataInsertOption, int i2, Object obj) {
        if (i2 == 0) {
            aVar.c();
        }
        countDownLatch.countDown();
        LogUtil.a("HL_MedicationManager", "updateMedicineRule insertOption ", hiDataInsertOption, " type ", Integer.valueOf(i2), " object ", obj);
    }

    private static void c(List<MedicinesRule> list, final CountDownLatch countDownLatch, final a aVar) {
        if (njy.e(list)) {
            LogUtil.j("HL_MedicationManager", "addMedicineRule medicinesRuleBeans is empty");
            aVar.c();
            countDownLatch.countDown();
        } else {
            final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
            hiDataInsertOption.setDatas(a(list, false));
            HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: bzp
                @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                public final void onResult(int i2, Object obj) {
                    bzr.a(aVar, countDownLatch, hiDataInsertOption, i2, obj);
                }
            });
        }
    }

    static /* synthetic */ void a(a aVar, CountDownLatch countDownLatch, HiDataInsertOption hiDataInsertOption, int i2, Object obj) {
        if (i2 == 0) {
            aVar.c();
        }
        countDownLatch.countDown();
        LogUtil.a("HL_MedicationManager", "addMedicineRule insertOption ", hiDataInsertOption, " type ", Integer.valueOf(i2), " object ", obj);
    }

    public static void b(List<MedicinesRule> list, final List<MedicinesRule> list2, final IBaseResponseCallback iBaseResponseCallback) {
        if (njy.e(list)) {
            LogUtil.j("HL_MedicationManager", "updateSaveMedicinesRule medicinesRuleBeans is empty");
            if (njy.e(list2)) {
                iBaseResponseCallback.a(0, "");
                return;
            } else {
                g(a(list2, true), iBaseResponseCallback);
                return;
            }
        }
        final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(a(list, false));
        HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: bzs
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i2, Object obj) {
                bzr.e(list2, iBaseResponseCallback, hiDataInsertOption, i2, obj);
            }
        });
    }

    static /* synthetic */ void e(List list, IBaseResponseCallback iBaseResponseCallback, HiDataInsertOption hiDataInsertOption, int i2, Object obj) {
        if (i2 == 0) {
            if (njy.e(list)) {
                iBaseResponseCallback.a(0, "");
            } else {
                g(a((List<MedicinesRule>) list, true), iBaseResponseCallback);
            }
        } else {
            iBaseResponseCallback.a(-1, "");
        }
        LogUtil.a("HL_MedicationManager", "updateSaveMedicinesRule insertOption ", hiDataInsertOption, " type ", Integer.valueOf(i2), " object ", obj);
    }

    private static List<HiHealthData> a(List<MedicinesRule> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (int i2 = 0; i2 < list.size(); i2++) {
            MedicinesRule medicinesRule = list.get(i2);
            if (medicinesRule != null) {
                long jLongValue = ((long) i2) + jCurrentTimeMillis;
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setType(d);
                HashMap map = new HashMap();
                String name = medicinesRule.getName();
                String mark = medicinesRule.getMark();
                int ruleId = medicinesRule.getRuleId();
                if (ruleId <= 0 && !TextUtils.isEmpty(name)) {
                    ruleId = bzx.a(name, mark, jLongValue);
                    medicinesRule.setRuleId(ruleId);
                }
                map.put(Integer.valueOf(h), Integer.valueOf(ruleId));
                map.put(Integer.valueOf(f1366b), Integer.valueOf(ruleId));
                int source = medicinesRule.getSource();
                if (source <= 0) {
                    source = 1;
                }
                map.put(Integer.valueOf(k), Integer.valueOf(source));
                map.put(Integer.valueOf(j), Integer.valueOf(medicinesRule.getMedicineTime()));
                int ruleType = medicinesRule.getRuleType();
                map.put(Integer.valueOf(o), Integer.valueOf(ruleType > 0 ? ruleType : 1));
                long startTime = medicinesRule.getStartTime();
                if (startTime <= 0) {
                    startTime = lsl.r(jLongValue);
                }
                map.put(Integer.valueOf(n), Long.valueOf(startTime));
                HashMap map2 = new HashMap();
                map2.put(Integer.valueOf(g), name);
                map2.put(Integer.valueOf(i), mark);
                hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
                if (z) {
                    map.put(Integer.valueOf(f1367c), Long.valueOf(lsl.r(jLongValue)));
                    Map<String, Long> map3 = l;
                    long jLongValue2 = map3.containsKey(bzx.d(ruleId)) ? map3.get(bzx.d(ruleId)).longValue() : jLongValue;
                    if (map3.containsKey(bzx.a(ruleId))) {
                        jLongValue = map3.get(bzx.a(ruleId)).longValue();
                    }
                    hiHealthData.setStartTime(jLongValue2);
                    hiHealthData.setEndTime(jLongValue);
                } else {
                    map.put(Integer.valueOf(f1367c), Long.valueOf(medicinesRule.getEndTime()));
                    hiHealthData.setEndTime(jLongValue);
                    hiHealthData.setStartTime(jLongValue);
                    c(ruleId, hiHealthData);
                }
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                hiHealthData.setDeviceUuid(String.valueOf(-1));
                arrayList.add(hiHealthData);
            }
        }
        LogUtil.d("HL_MedicationManager", "generatedHiHealthRuleData sStartAndEndTime is", l.toString());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<HiHealthData> c(List<MedicinesRule> list) {
        ArrayList arrayList = new ArrayList();
        if (!njy.e(list)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (int i2 = 0; i2 < list.size(); i2++) {
                MedicinesRule medicinesRule = list.get(i2);
                if (medicinesRule != null) {
                    long jLongValue = ((long) i2) + jCurrentTimeMillis;
                    HiHealthData hiHealthData = new HiHealthData();
                    hiHealthData.setType(d);
                    HashMap map = new HashMap();
                    String name = medicinesRule.getName();
                    String mark = medicinesRule.getMark();
                    int ruleId = medicinesRule.getRuleId();
                    if (ruleId <= 0 && !TextUtils.isEmpty(name)) {
                        ruleId = bzx.a(name, mark, jLongValue);
                    }
                    map.put(Integer.valueOf(h), Integer.valueOf(ruleId));
                    map.put(Integer.valueOf(f1366b), Integer.valueOf(ruleId));
                    int source = medicinesRule.getSource();
                    if (source <= 0) {
                        source = 1;
                    }
                    map.put(Integer.valueOf(k), Integer.valueOf(source));
                    map.put(Integer.valueOf(j), Integer.valueOf(medicinesRule.getMedicineTime()));
                    int ruleType = medicinesRule.getRuleType();
                    map.put(Integer.valueOf(o), Integer.valueOf(ruleType > 0 ? ruleType : 1));
                    long startTime = medicinesRule.getStartTime();
                    if (startTime <= 0) {
                        startTime = lsl.r(jLongValue);
                    }
                    map.put(Integer.valueOf(n), Long.valueOf(startTime));
                    HashMap map2 = new HashMap();
                    map2.put(Integer.valueOf(g), name);
                    map2.put(Integer.valueOf(i), mark);
                    hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
                    Map<String, Long> map3 = l;
                    long jLongValue2 = map3.containsKey(bzx.d(ruleId)) ? map3.get(bzx.d(ruleId)).longValue() : jLongValue;
                    if (map3.containsKey(bzx.a(ruleId))) {
                        jLongValue = map3.get(bzx.a(ruleId)).longValue();
                    }
                    hiHealthData.setStartTime(jLongValue2);
                    hiHealthData.setEndTime(jLongValue);
                    map.put(Integer.valueOf(f1367c), Long.valueOf(medicinesRule.getEndTime()));
                    hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                    hiHealthData.setDeviceUuid(String.valueOf(-1));
                    arrayList.add(hiHealthData);
                    LogUtil.a("HL_MedicationManager", "generatedHiHealthRuleData healthDataList ", hiHealthData.toString());
                }
            }
        }
        return arrayList;
    }

    private static List<HiHealthData> e(List<MedicineRecord> list) {
        ArrayList arrayList = new ArrayList();
        for (MedicineRecord medicineRecord : list) {
            if (medicineRecord != null) {
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setType(DicDataTypeUtil.DataType.MEDICATION_PUNCHING.value());
                HashMap map = new HashMap();
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCH_SOURCE.value()), Integer.valueOf(medicineRecord.getSource()));
                int recordId = medicineRecord.getRecordId();
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCH_TASK_ID.value()), Integer.valueOf(recordId));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCH_STATUS.value()), Integer.valueOf(medicineRecord.getStatus()));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCH_EXPECTED_TIME.value()), Integer.valueOf(medicineRecord.getMedicineTime()));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCH_TIME.value()), Long.valueOf(medicineRecord.getRecordTime()));
                int drug = medicineRecord.getDrug();
                if (drug > 0) {
                    recordId = drug;
                }
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.MEDICATION_PUNCH_DRUG.value()), Integer.valueOf(recordId));
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                hiHealthData.setDeviceUuid(String.valueOf(-1));
                long jCurrentTimeMillis = System.currentTimeMillis();
                long startTime = medicineRecord.getStartTime();
                long endTime = medicineRecord.getEndTime();
                if (startTime <= 0 || endTime <= 0) {
                    hiHealthData.setStartTime(jCurrentTimeMillis);
                    hiHealthData.setEndTime(jCurrentTimeMillis);
                } else {
                    hiHealthData.setStartTime(startTime);
                    hiHealthData.setEndTime(endTime);
                }
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    public static void e(List<MedicinesRule> list, IBaseResponseCallback iBaseResponseCallback) {
        if (njy.e(list)) {
            LogUtil.e("HL_MedicationManager", "deleteMedicineRule is empty");
            return;
        }
        if (iBaseResponseCallback == null) {
            LogUtil.e("HL_MedicationManager", "deleteMedicineRule callback is null");
            return;
        }
        List<HiHealthData> listA = a(list, true);
        if (njy.e(listA)) {
            LogUtil.e("HL_MedicationManager", "changeHiHealData is empty");
        } else {
            g(listA, iBaseResponseCallback);
        }
    }

    public static void b(final int i2, final IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.j("HL_MedicationManager", "getMedicineRulesInfo callback is null endDate ", Integer.valueOf(i2));
            return;
        }
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(20140101), String.valueOf(i2), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{d});
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).d(true).b(), new HiDataReadResultListener() { // from class: bzr.1
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i3, int i4) {
                LogUtil.a("HL_MedicationManager", "getMedicineRulesInfo object ", obj, " errorCode ", Integer.valueOf(i3), " anchor ", Integer.valueOf(i4));
                if (obj instanceof SparseArray) {
                    Object obj2 = ((SparseArray) obj).get(bzr.d);
                    if (njy.b(obj2, HiHealthData.class)) {
                        List listC = bzr.c((List<HiHealthData>) obj2, i2);
                        LogUtil.a("HL_MedicationManager", "getMedicineRulesInfo ruleList ", listC);
                        if (!njy.e(listC)) {
                            bzr.h(listC, iBaseResponseCallback);
                            return;
                        } else {
                            iBaseResponseCallback.a(-1, new HashMap());
                            return;
                        }
                    }
                    iBaseResponseCallback.a(-1, new HashMap());
                    return;
                }
                iBaseResponseCallback.a(-1, new HashMap());
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i3, Object obj, int i4, int i5) {
                LogUtil.a("HL_MedicationManager", "getMedicineRulesInfo intentType ", Integer.valueOf(i3), " object ", obj, " errorCode ", Integer.valueOf(i4), " anchor ", Integer.valueOf(i5));
                iBaseResponseCallback.a(-1, new HashMap());
            }
        });
    }

    private static void d(List<HiHealthData> list) {
        if (njy.e(list)) {
            return;
        }
        Collections.sort(list, new Comparator() { // from class: bzw
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                HiHealthData hiHealthData = (HiHealthData) obj;
                HiHealthData hiHealthData2 = (HiHealthData) obj2;
                return Long.compare(hiHealthData != null ? hiHealthData.getStartTime() : 0L, hiHealthData2 != null ? hiHealthData2.getStartTime() : 0L);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<MedicinesRule> c(List<HiHealthData> list, int i2) {
        long jC;
        if (njy.e(list)) {
            LogUtil.j("HL_MedicationManager", "getRuleList list ", list);
            return new ArrayList();
        }
        d(list);
        ArrayList arrayList = new ArrayList();
        l.clear();
        long jD = DateFormatUtil.d(i2);
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
                        c(medicinesRuleD.getRuleId(), hiHealthData);
                    }
                }
            }
        }
        return arrayList;
    }

    private static Map<String, Object> e(Object obj) {
        if (obj instanceof String) {
            try {
                Map<String, Object> map = (Map) HiJsonUtil.d((String) obj, new TypeToken<HashMap<String, Object>>() { // from class: com.huawei.basichealthmodel.medicine.MedicationManager$2
                }.getType());
                if (map != null) {
                    return map;
                }
                LogUtil.j("HL_MedicationManager", "getMap map is null");
                return new HashMap();
            } catch (JsonParseException | IllegalStateException e2) {
                LogUtil.e("HL_MedicationManager", "getMap exception ", LogAnonymous.b(e2));
                return new HashMap();
            }
        }
        return new HashMap();
    }

    public static int d(Object obj) {
        Object obj2 = e(obj).get("point_value");
        if (obj2 instanceof Double) {
            Double d2 = (Double) obj2;
            d2.doubleValue();
            return d2.intValue();
        }
        LogUtil.j("HL_MedicationManager", "getInt object ", obj, " pointValue ", obj2);
        return -1;
    }

    public static long a(Object obj) {
        Object obj2 = e(obj).get("point_value");
        if (obj2 instanceof Double) {
            Double d2 = (Double) obj2;
            d2.doubleValue();
            return d2.longValue();
        }
        LogUtil.j("HL_MedicationManager", "getLong object ", obj, " pointValue ", obj2);
        return -1L;
    }

    public static String b(Object obj) {
        Object obj2 = e(obj).get("metadata");
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        LogUtil.j("HL_MedicationManager", "getString object ", obj, " metadata ", obj2);
        return "";
    }

    private static MedicinesRule d(HiHealthData hiHealthData) {
        MedicinesRule medicinesRule = new MedicinesRule();
        String strB = b(hiHealthData.get(String.valueOf(g)));
        if (!TextUtils.isEmpty(strB)) {
            medicinesRule.setName(strB);
        }
        String strB2 = b(hiHealthData.get(String.valueOf(i)));
        if (!TextUtils.isEmpty(strB2)) {
            medicinesRule.setMark(strB2);
        }
        medicinesRule.setDrug(d(hiHealthData.get(String.valueOf(f1366b))));
        medicinesRule.setRuleId(d(hiHealthData.get(String.valueOf(h))));
        medicinesRule.setSource(d(hiHealthData.get(String.valueOf(k))));
        medicinesRule.setRuleType(d(hiHealthData.get(String.valueOf(o))));
        medicinesRule.setEndTime(a(hiHealthData.get(String.valueOf(f1367c))));
        medicinesRule.setStartTime(a(hiHealthData.get(String.valueOf(n))));
        medicinesRule.setMedicineTime(d(hiHealthData.get(String.valueOf(j))));
        medicinesRule.setMedicinePeriod(d(hiHealthData.get(String.valueOf(f))));
        return medicinesRule;
    }

    public static SparseArray<ArrayList<MedicineRecord>> b(List<MedicineRecord> list) {
        int medicineTime;
        if (njy.e(list)) {
            LogUtil.j("HL_MedicationManager", "convertSparseArray beanList isEmpty");
            return new SparseArray<>();
        }
        SparseArray<ArrayList<MedicineRecord>> sparseArray = new SparseArray<>();
        for (MedicineRecord medicineRecord : list) {
            if (medicineRecord != null && (medicineTime = medicineRecord.getMedicineTime()) >= 0) {
                if (sparseArray.indexOfKey(medicineTime) >= 0) {
                    ArrayList<MedicineRecord> arrayList = sparseArray.get(medicineTime);
                    if (arrayList != null) {
                        arrayList.add(medicineRecord);
                    }
                } else {
                    ArrayList<MedicineRecord> arrayList2 = new ArrayList<>();
                    arrayList2.add(medicineRecord);
                    sparseArray.append(medicineTime, arrayList2);
                }
            }
        }
        int size = sparseArray.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<MedicineRecord> arrayListValueAt = sparseArray.valueAt(i2);
            if (!njy.e(arrayListValueAt)) {
                Collections.sort(arrayListValueAt, new Comparator() { // from class: bzn
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return bzr.e((MedicineRecord) obj, (MedicineRecord) obj2);
                    }
                });
            }
        }
        return sparseArray;
    }

    static /* synthetic */ int e(MedicineRecord medicineRecord, MedicineRecord medicineRecord2) {
        return (int) (medicineRecord.getStartTime() - medicineRecord2.getStartTime());
    }

    public static List<MedicineRecord> b(Map<Integer, MedicineRecord> map) {
        ArrayList arrayList = new ArrayList(map.values());
        Collections.sort(arrayList, new Comparator() { // from class: bzz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return bzr.c((MedicineRecord) obj, (MedicineRecord) obj2);
            }
        });
        LogUtil.d("HL_MedicationManager", "groupRecordData ", arrayList.toString());
        return arrayList;
    }

    static /* synthetic */ int c(MedicineRecord medicineRecord, MedicineRecord medicineRecord2) {
        int medicineTime = medicineRecord.getMedicineTime() - medicineRecord2.getMedicineTime();
        if (medicineTime > 0) {
            return 1;
        }
        return medicineTime < 0 ? -1 : 0;
    }

    private static void c(int i2, HiHealthData hiHealthData) {
        Map<String, Long> map = l;
        map.put(bzx.d(i2), Long.valueOf(hiHealthData.getStartTime()));
        map.put(bzx.a(i2), Long.valueOf(hiHealthData.getEndTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(List<HiHealthData> list, List<MedicineRecord> list2) {
        for (HiHealthData hiHealthData : list) {
            if (hiHealthData != null) {
                MedicineRecord medicineRecord = new MedicineRecord();
                medicineRecord.setDrug(hiHealthData.getInt("punchDrug"));
                medicineRecord.setMedicineTime(hiHealthData.getInt("punchExpectedTime"));
                medicineRecord.setRecordId(hiHealthData.getInt("punchTaskId"));
                medicineRecord.setRecordTime(hiHealthData.getLong("punchTime"));
                int i2 = hiHealthData.getInt("punchSource");
                if (i2 != 1) {
                    i2 = 1;
                }
                medicineRecord.setSource(i2);
                medicineRecord.setStatus(hiHealthData.getInt("punchStatus"));
                medicineRecord.setStartTime(hiHealthData.getStartTime());
                medicineRecord.setEndTime(hiHealthData.getEndTime());
                list2.add(medicineRecord);
            }
        }
    }

    public static void e(int i2, int i3, final List<MedicineRecord> list, final CountDownLatch countDownLatch) {
        if (list == null) {
            return;
        }
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeInterval(String.valueOf(i2), String.valueOf(i3), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiAggregateOption.setType(f1365a);
        hiAggregateOption.setConstantsKey(e);
        hiAggregateOption.setAggregateType(1);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setSortOrder(0);
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: bzr.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list2, int i4, int i5) {
                if (njy.e(list2)) {
                    LogUtil.e("HL_MedicationManager", "data is empty");
                    countDownLatch.countDown();
                } else {
                    LogUtil.a("HL_MedicationManager", "getMedicineRecord datas", list2.toString());
                    bzr.c(list2, (List<MedicineRecord>) list);
                    countDownLatch.countDown();
                }
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i4, List<HiHealthData> list2, int i5, int i6) {
                LogUtil.j("HL_MedicationManager", "getMedicineRecord errorCode:" + i5);
                countDownLatch.countDown();
            }
        });
    }

    public static void c(List<MedicinesRule> list, List<MedicinesRule> list2, List<Integer> list3, boolean z, IBaseResponseCallback iBaseResponseCallback) {
        if (iBaseResponseCallback == null) {
            LogUtil.e("HL_MedicationManager", "updateMedicine callback is null");
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d(list, list2, arrayList, list3, arrayList2);
        a aVar = new a(1);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        a(c(arrayList), countDownLatch, aVar);
        cbg.b(countDownLatch, "updateMedicine");
        if (!aVar.a()) {
            iBaseResponseCallback.a(-1, "updateMedicine recordChangeRule is err");
            return;
        }
        if (z) {
            LogUtil.e("HL_MedicationManager", "updateMedicine changeTime is true updateSaveMedicinesRule");
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (MedicinesRule medicinesRule : list) {
                if (medicinesRule != null) {
                    jCurrentTimeMillis++;
                    medicinesRule.setRuleId(bzx.a(medicinesRule.getName(), medicinesRule.getMark(), jCurrentTimeMillis));
                }
            }
            b(list, list2, iBaseResponseCallback);
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        c(list, list2, arrayList3);
        b(arrayList2, arrayList3, iBaseResponseCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(final List<MedicinesRule> list, final IBaseResponseCallback iBaseResponseCallback) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: bzo
                @Override // java.lang.Runnable
                public final void run() {
                    bzr.h(list, iBaseResponseCallback);
                }
            });
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (MedicinesRule medicinesRule : list) {
            if (medicinesRule != null) {
                if (TextUtils.isEmpty(medicinesRule.getName())) {
                    String strB = bzx.b(medicinesRule.getDrug());
                    HiUserPreference hiUserPreferenceD = cbg.d(strB);
                    if (hiUserPreferenceD == null || TextUtils.isEmpty(hiUserPreferenceD.getValue())) {
                        LogUtil.j("HL_MedicationManager", "getMedicine hiUserPreference medicineId ", strB);
                    } else {
                        try {
                            MedicineBean medicineBean = (MedicineBean) HiJsonUtil.d(hiUserPreferenceD.getValue(), MedicineBean.class);
                            medicinesRule.setName(medicineBean.getName());
                            medicinesRule.setMark(medicineBean.getRemarks());
                            medicinesRule.setDrug(medicineBean.getId());
                            medicinesRule.setSource(medicineBean.getSource());
                        } catch (JsonParseException e2) {
                            LogUtil.e("HL_MedicationManager", "getMedicine exception ", LogAnonymous.b(e2));
                        }
                    }
                }
                if (!TextUtils.isEmpty(medicinesRule.getName())) {
                    ArrayList arrayList = new ArrayList();
                    int medicineTime = medicinesRule.getMedicineTime();
                    if (linkedHashMap.containsKey(Integer.valueOf(medicineTime))) {
                        List list2 = (List) linkedHashMap.get(Integer.valueOf(medicineTime));
                        if (list2 != null) {
                            list2.add(medicinesRule);
                        }
                    } else {
                        arrayList.add(medicinesRule);
                        linkedHashMap.put(Integer.valueOf(medicineTime), arrayList);
                    }
                }
            }
        }
        if (njy.e(linkedHashMap.entrySet())) {
            iBaseResponseCallback.a(-1, null);
        } else {
            iBaseResponseCallback.a(0, a((Map<Integer, List<MedicinesRule>>) linkedHashMap));
        }
    }

    public static Map<Integer, List<MedicinesRule>> a(Map<Integer, List<MedicinesRule>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null && !njy.e(map.entrySet())) {
            if (map.entrySet().size() == 1) {
                return map;
            }
            ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
            Collections.sort(arrayList, new Comparator() { // from class: cab
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return ((Integer) ((Map.Entry) obj).getKey()).compareTo((Integer) ((Map.Entry) obj2).getKey());
                }
            });
            for (Map.Entry entry : arrayList) {
                linkedHashMap.put((Integer) entry.getKey(), (List) entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static void d(List<MedicinesRule> list, List<MedicinesRule> list2, List<MedicinesRule> list3, List<Integer> list4, List<MedicinesRule> list5) {
        for (MedicinesRule medicinesRule : list) {
            if (medicinesRule != null) {
                if (list4.contains(Integer.valueOf(medicinesRule.getRuleId()))) {
                    MedicinesRule medicinesRule2 = list2.get(list4.indexOf(Integer.valueOf(medicinesRule.getRuleId())));
                    if (medicinesRule2 != null && b(medicinesRule, medicinesRule2)) {
                        medicinesRule.setRuleId(medicinesRule2.getRuleId());
                        list3.add(medicinesRule);
                    }
                } else {
                    list5.add(medicinesRule);
                }
            }
        }
    }

    public static void c(List<MedicinesRule> list, List<MedicinesRule> list2, List<MedicinesRule> list3) {
        ArrayList arrayList = new ArrayList();
        Iterator<MedicinesRule> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getRuleId()));
        }
        for (MedicinesRule medicinesRule : list2) {
            if (!arrayList.contains(Integer.valueOf(medicinesRule.getRuleId()))) {
                list3.add(medicinesRule);
            }
        }
    }

    private static boolean b(MedicinesRule medicinesRule, MedicinesRule medicinesRule2) {
        if (medicinesRule == null || medicinesRule2 == null) {
            return false;
        }
        if (!medicinesRule.getName().equals(medicinesRule2.getName())) {
            return true;
        }
        String mark = medicinesRule.getMark();
        if (TextUtils.isEmpty(mark)) {
            mark = "";
        }
        String mark2 = medicinesRule2.getMark();
        return !mark.equals(TextUtils.isEmpty(mark2) ? "" : mark2);
    }

    public static List<Calendar> c(Map<Integer, List<MedicinesRule>> map, boolean z, Map<Integer, cao> map2) {
        ArrayList arrayList = new ArrayList();
        if (map == null || map.size() == 0) {
            LogUtil.j("HL_MedicationManager", "getMedicinesCalendars medicationMap null");
            return arrayList;
        }
        if (map2 == null || map2.size() == 0) {
            LogUtil.j("HL_MedicationManager", "getMedicinesCalendars medicationMap null");
            return arrayList;
        }
        long jR = lsl.r(System.currentTimeMillis());
        ArrayList<Map.Entry> arrayList2 = new ArrayList(map.entrySet());
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : arrayList2) {
            Calendar calendar = Calendar.getInstance();
            ayx ayxVar = new ayx();
            calendar.setTimeInMillis((((long) ((Integer) entry.getKey()).intValue()) * 1000) + jR);
            ayxVar.d(calendar.get(11));
            ayxVar.c(calendar.get(12));
            ayxVar.b(127);
            arrayList.add(calendar);
            arrayList3.add(ayxVar);
        }
        LogUtil.a("HL_MedicationManager", "getMedicinesCalendars calendars ", arrayList);
        if (z) {
            cao caoVarA = cfb.a(map2, 11);
            caoVarA.e(arrayList3);
            map2.put(11, caoVarA);
            cfb.a(map2);
        }
        return arrayList;
    }

    static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1372b = 0;
        private int d;

        a(int i) {
            this.d = i;
        }

        public void c() {
            this.f1372b++;
        }

        public boolean a() {
            return this.d == this.f1372b;
        }
    }

    public static void b() {
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setTimeInterval(String.valueOf(20140101), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        hiDataReadOption.setType(new int[]{d});
        HiHealthNativeApi.a(BaseApplication.b()).readHiHealthDataPro(HiDataReadProOption.builder().e(hiDataReadOption).d(true).b(), new AnonymousClass2(iA));
    }

    /* JADX INFO: renamed from: bzr$2, reason: invalid class name */
    class AnonymousClass2 implements HiDataReadResultListener {
        final /* synthetic */ int d;

        AnonymousClass2(int i) {
            this.d = i;
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResult(Object obj, int i, int i2) {
            LogUtil.a("HL_MedicationManager", "refreshDoctorRule object ", obj, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
            if (obj instanceof SparseArray) {
                Object obj2 = ((SparseArray) obj).get(bzr.d);
                if (njy.b(obj2, HiHealthData.class)) {
                    List<MedicinesRule> listC = bzr.c((List<HiHealthData>) obj2, this.d);
                    LogUtil.a("HL_MedicationManager", "refreshDoctorRule ruleList ", listC);
                    if (njy.e(listC)) {
                        return;
                    }
                    for (MedicinesRule medicinesRule : listC) {
                        if (medicinesRule != null && medicinesRule.getSource() == 3) {
                            medicinesRule.setSource(1);
                        }
                    }
                    final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
                    hiDataInsertOption.setDatas(bzr.c(listC));
                    HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: caa
                        @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                        public final void onResult(int i3, Object obj3) {
                            LogUtil.a("HL_MedicationManager", "refreshDoctorRule insertOption ", hiDataInsertOption, " type ", Integer.valueOf(i3), " resultObject ", obj3);
                        }
                    });
                }
            }
        }

        @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
        public void onResultIntent(int i, Object obj, int i2, int i3) {
            LogUtil.a("HL_MedicationManager", "refreshDoctorRule intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
        }
    }
}
