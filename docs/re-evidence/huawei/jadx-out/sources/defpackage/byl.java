package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import com.huawei.basichealthmodel.listener.TaskDataListener;
import com.huawei.basichealthmodel.listener.TaskDayDataListener;
import com.huawei.basichealthmodel.medicine.MedicineRecord;
import com.huawei.basichealthmodel.medicine.MedicinesRule;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes23.dex */
public class byl extends bxw {
    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    /* JADX INFO: renamed from: getRecord, reason: merged with bridge method [inline-methods] */
    public void d(final HealthLifeBean healthLifeBean, final TaskDayDataListener taskDayDataListener) {
        if (taskDayDataListener == null) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getRecord listener is null");
            return;
        }
        if (healthLifeBean == null) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getRecord bean is null");
            taskDayDataListener.onDataChange(-1, null);
        } else {
            if (HandlerExecutor.c()) {
                cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: byo
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f1320c.d(healthLifeBean, taskDayDataListener);
                    }
                });
                return;
            }
            int recordDay = healthLifeBean.getRecordDay();
            SparseArray<HealthLifeBean> sparseArray = new SparseArray<>();
            sparseArray.put(recordDay, healthLifeBean);
            e(recordDay, recordDay, sparseArray);
            taskDayDataListener.onDataChange(0, sparseArray.get(recordDay));
        }
    }

    @Override // defpackage.bxw, com.huawei.basichealthmodel.listener.TaskInterface
    public void getRecord(SparseArray<HealthLifeBean> sparseArray, TaskDataListener taskDataListener) {
        if (taskDataListener == null) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getRecord listener is null");
            return;
        }
        if (sparseArray == null) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getRecord sparseArray is null");
            taskDataListener.onDataChange(-1, null);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getRecord sparseArray ", sparseArray);
            taskDataListener.onDataChange(-1, sparseArray);
        } else {
            e(sparseArray.keyAt(0), sparseArray.keyAt(size - 1), sparseArray);
            taskDataListener.onDataChange(0, sparseArray);
        }
    }

    private void e(int i, int i2, SparseArray<HealthLifeBean> sparseArray) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        ArrayList arrayList = new ArrayList();
        bzr.e(i, iA, arrayList, countDownLatch);
        SparseArray<Map<Integer, List<MedicinesRule>>> sparseArray2 = new SparseArray<>();
        b(i2, countDownLatch, sparseArray, sparseArray2);
        cbg.b(countDownLatch, "R_HL_MedicineManager");
        SparseArray<Map<Integer, List<MedicineRecord>>> sparseArrayE = e(arrayList);
        for (int i3 = 0; i3 < sparseArray.size(); i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            Map<Integer, List<MedicinesRule>> map = sparseArray2.get(iKeyAt);
            Map<Integer, List<MedicineRecord>> map2 = sparseArrayE.get(iKeyAt);
            int size = map == null ? 0 : map.size();
            int iB = b(map, map2);
            HealthLifeBean healthLifeBean = sparseArray.get(iKeyAt);
            healthLifeBean.setTarget(String.valueOf(size));
            healthLifeBean.setResult(String.valueOf(iB));
            if (healthLifeBean.getComplete() <= 0 && size > 0) {
                healthLifeBean.setComplete(iB >= size ? 1 : 0);
                if (healthLifeBean.getComplete() == 1 && healthLifeBean.getRecordDay() == iA) {
                    cbk.c(healthLifeBean.getId(), healthLifeBean.getComplete());
                }
            }
            healthLifeBean.setExtendInfo(d(map, map2));
        }
    }

    private String d(Map<Integer, List<MedicinesRule>> map, Map<Integer, List<MedicineRecord>> map2) {
        MedicineRecord medicineRecord;
        List<MedicineRecord> listD = d(map);
        if (njy.e(listD)) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getExtendInfo initRecordList ", listD);
            return "";
        }
        List<MedicineRecord> listB = b(map2);
        if (njy.e(listB)) {
            return HiJsonUtil.d(listD);
        }
        HashMap map3 = new HashMap();
        for (MedicineRecord medicineRecord2 : listD) {
            if (medicineRecord2 != null) {
                map3.put(Integer.valueOf(medicineRecord2.getRecordId()), medicineRecord2);
            }
        }
        for (MedicineRecord medicineRecord3 : listB) {
            if (medicineRecord3 != null) {
                int recordId = medicineRecord3.getRecordId();
                if (map3.containsKey(Integer.valueOf(recordId)) && (medicineRecord = (MedicineRecord) map3.get(Integer.valueOf(recordId))) != null) {
                    medicineRecord3.setDrug(medicineRecord.getDrug());
                    medicineRecord3.setName(medicineRecord.getName());
                    medicineRecord3.setMark(medicineRecord.getMark());
                    map3.put(Integer.valueOf(recordId), medicineRecord3);
                }
            }
        }
        List<MedicineRecord> listB2 = bzr.b((Map<Integer, MedicineRecord>) map3);
        if (njy.e(listB2)) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getExtendInfo list ", listB2);
            return HiJsonUtil.d(listD);
        }
        return HiJsonUtil.d(listB2);
    }

    private List<MedicineRecord> d(Map<Integer, List<MedicinesRule>> map) {
        MedicineRecord medicineRecordC;
        if (map == null) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getInitRecordList map is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, List<MedicinesRule>> entry : map.entrySet()) {
            if (entry != null) {
                List<MedicinesRule> value = entry.getValue();
                if (!njy.e(value)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (MedicinesRule medicinesRule : value) {
                        if (medicinesRule != null && (medicineRecordC = bzx.c(medicinesRule)) != null) {
                            arrayList2.add(medicineRecordC);
                        }
                    }
                    List<MedicineRecord> listB = bzx.b(arrayList2);
                    if (!njy.e(listB)) {
                        for (MedicineRecord medicineRecord : listB) {
                            if (medicineRecord != null) {
                                arrayList.add(medicineRecord);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private List<MedicineRecord> b(Map<Integer, List<MedicineRecord>> map) {
        if (map == null) {
            ReleaseLogUtil.d("R_HL_MedicineManager", "getRecordList map is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, List<MedicineRecord>> entry : map.entrySet()) {
            if (entry != null) {
                List<MedicineRecord> value = entry.getValue();
                if (!njy.e(value)) {
                    for (MedicineRecord medicineRecord : value) {
                        if (medicineRecord != null) {
                            arrayList.add(medicineRecord);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private void b(int i, final CountDownLatch countDownLatch, final SparseArray<HealthLifeBean> sparseArray, final SparseArray<Map<Integer, List<MedicinesRule>>> sparseArray2) {
        bzr.b(i, new IBaseResponseCallback() { // from class: byp
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                this.f1321a.b(sparseArray, sparseArray2, countDownLatch, i2, obj);
            }
        });
    }

    /* synthetic */ void b(SparseArray sparseArray, SparseArray sparseArray2, CountDownLatch countDownLatch, int i, Object obj) {
        if (i == 0 && (obj instanceof Map)) {
            Map<Integer, List<MedicinesRule>> map = (Map) obj;
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                Map<Integer, List<MedicinesRule>> mapA = a(iKeyAt, map);
                if (mapA.size() > 0) {
                    sparseArray2.put(iKeyAt, mapA);
                }
            }
        }
        countDownLatch.countDown();
    }

    private SparseArray<Map<Integer, List<MedicineRecord>>> e(List<MedicineRecord> list) {
        SparseArray<Map<Integer, List<MedicineRecord>>> sparseArray = new SparseArray<>();
        for (MedicineRecord medicineRecord : list) {
            if (medicineRecord != null) {
                int iA = DateFormatUtil.a(medicineRecord.getStartTime());
                Map<Integer, List<MedicineRecord>> linkedHashMap = sparseArray.get(iA);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap<>();
                }
                List<MedicineRecord> arrayList = linkedHashMap.get(Integer.valueOf(medicineRecord.getMedicineTime()));
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(medicineRecord);
                linkedHashMap.put(Integer.valueOf(medicineRecord.getMedicineTime()), arrayList);
                sparseArray.put(iA, linkedHashMap);
            }
        }
        return sparseArray;
    }

    private int b(Map<Integer, List<MedicinesRule>> map, Map<Integer, List<MedicineRecord>> map2) {
        int i = 0;
        if (map != null && map2 != null) {
            for (Map.Entry<Integer, List<MedicinesRule>> entry : map.entrySet()) {
                if (entry != null) {
                    List<MedicinesRule> value = entry.getValue();
                    List<MedicineRecord> list = map2.get(entry.getKey());
                    if (!njy.e(value) && !njy.e(list) && d(value, c(list))) {
                        i++;
                    }
                }
            }
        }
        return i;
    }

    private boolean d(List<MedicinesRule> list, SparseArray<MedicineRecord> sparseArray) {
        for (MedicinesRule medicinesRule : list) {
            if (medicinesRule != null) {
                int ruleId = medicinesRule.getRuleId();
                MedicineRecord medicineRecord = sparseArray.get(ruleId);
                if (medicineRecord == null) {
                    medicineRecord = sparseArray.get(ruleId + medicinesRule.getMedicineTime());
                }
                if (medicineRecord == null || medicineRecord.getStatus() <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private SparseArray<MedicineRecord> c(List<MedicineRecord> list) {
        SparseArray<MedicineRecord> sparseArray = new SparseArray<>();
        for (MedicineRecord medicineRecord : list) {
            if (medicineRecord != null) {
                sparseArray.put(medicineRecord.getRecordId(), medicineRecord);
            }
        }
        return sparseArray;
    }

    private Map<Integer, List<MedicinesRule>> a(int i, Map<Integer, List<MedicinesRule>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : new ArrayList(map.entrySet())) {
            if (entry != null) {
                List<MedicinesRule> list = (List) entry.getValue();
                ArrayList arrayList = new ArrayList();
                for (MedicinesRule medicinesRule : list) {
                    if (medicinesRule != null) {
                        long jD = DateFormatUtil.d(i);
                        if (medicinesRule.getStartTime() <= jD) {
                            long endTime = medicinesRule.getEndTime();
                            if (endTime <= 0 || endTime > jD) {
                                if (!TextUtils.isEmpty(medicinesRule.getName())) {
                                    arrayList.add(medicinesRule);
                                }
                            }
                        }
                    }
                }
                if (njy.b(arrayList)) {
                    linkedHashMap.put((Integer) entry.getKey(), arrayList);
                }
            }
        }
        return linkedHashMap;
    }
}
