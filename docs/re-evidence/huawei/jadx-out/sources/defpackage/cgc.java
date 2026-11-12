package defpackage;

import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.health.healthmodel.bean.HealthLifeTaskBean;
import com.huawei.health.healthmodel.bean.ImageBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiAggregateListenerEx;
import com.huawei.hihealth.data.listener.HiSubscribeListener;
import com.huawei.hihealth.data.listener.HiUnSubscribeListener;
import com.huawei.hihealth.data.type.HiSubscribeType;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes23.dex */
public class cgc {
    private static HealthLifeBean a() {
        return (HealthLifeBean) HiJsonUtil.d(ccy.i("step_intensity_bean"), HealthLifeBean.class);
    }

    public static void c(SparseArray<List<HealthLifeBean>> sparseArray) {
        if (sparseArray == null) {
            LogUtil.j("HL_TaskUtils", "refreshWeekRecordSparseArray sparseArray is null");
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_TaskUtils", "refreshWeekRecordSparseArray size ", Integer.valueOf(size));
            return;
        }
        HealthLifeBean healthLifeBeanA = a();
        if (healthLifeBeanA == null) {
            LogUtil.j("HL_TaskUtils", "refreshWeekRecordSparseArray basicSportBean is null");
            return;
        }
        int recordDay = healthLifeBeanA.getRecordDay();
        List<HealthLifeBean> list = null;
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (iKeyAt == recordDay) {
                list = sparseArray.get(iKeyAt);
            }
        }
        e(list);
    }

    public static void e(List<HealthLifeBean> list) {
        HealthLifeBean next;
        if (njy.e(list)) {
            LogUtil.j("HL_TaskUtils", "refreshDayRecordList list ", list);
            return;
        }
        HealthLifeBean healthLifeBeanA = a();
        if (healthLifeBeanA == null) {
            LogUtil.j("HL_TaskUtils", "refreshDayRecordList basicSportBean is null");
            return;
        }
        int id = healthLifeBeanA.getId();
        int recordDay = healthLifeBeanA.getRecordDay();
        Iterator<HealthLifeBean> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && next.getId() == id && next.getRecordDay() == recordDay) {
                LogUtil.a("HL_TaskUtils", "refreshDayRecordList bean ", next, " lifeBean ", next);
                break;
            }
        }
        if (next == null) {
            LogUtil.j("HL_TaskUtils", "refreshDayRecordList bean is null");
            return;
        }
        String result = healthLifeBeanA.getResult();
        int iJ = CommonUtils.j(result);
        int iJ2 = CommonUtils.j(next.getResult());
        LogUtil.a("HL_TaskUtils", "refreshDayRecordList basicSportResult ", Integer.valueOf(iJ), " result ", Integer.valueOf(iJ2));
        if (iJ > iJ2) {
            next.setResult(result);
        }
        if (next.getComplete() <= 0) {
            next.setComplete(healthLifeBeanA.getComplete());
        }
        next.setTimeZone(healthLifeBeanA.getTimeZone());
        next.setIsUpdated(healthLifeBeanA.getIsUpdated());
        next.setTimestamp(healthLifeBeanA.getTimestamp());
        next.setSyncStatus(healthLifeBeanA.getSyncStatus());
    }

    public static void d(List<HealthLifeBean> list) {
        int id;
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_TaskUtils", "refreshLastCache list ", list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null && (id = healthLifeBean.getId()) != 1 && id != 100001) {
                arrayList.add(healthLifeBean);
            }
        }
        if (njy.e(arrayList)) {
            ReleaseLogUtil.d("R_HL_TaskUtils", "refreshLastCache beanList ", arrayList);
        } else {
            ccy.a("health_life_data_cache_last", HiJsonUtil.d(arrayList));
        }
    }

    public static List<HealthLifeBean> e() {
        String strI = ccy.i("health_life_data_cache_last");
        if (TextUtils.isEmpty(strI)) {
            return Collections.EMPTY_LIST;
        }
        try {
            return (List) HiJsonUtil.d(strI, new TypeToken<List<HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.util.TaskUtils$1
            }.getType());
        } catch (JsonParseException | IllegalStateException e) {
            ReleaseLogUtil.b("R_HL_TaskUtils", "getLastCache exception ", LogAnonymous.b(e));
            return Collections.EMPTY_LIST;
        }
    }

    public static void c(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_TaskUtils", "setCache list ", list);
        } else {
            ccy.d("health_model_data_cache", HiJsonUtil.d(list));
            i(list);
        }
    }

    public static List<HealthLifeBean> d() {
        String strC = ccy.c("health_model_data_cache");
        if (TextUtils.isEmpty(strC)) {
            return Collections.EMPTY_LIST;
        }
        try {
            return (List) HiJsonUtil.d(strC, new TypeToken<List<HealthLifeBean>>() { // from class: com.huawei.basichealthmodel.util.TaskUtils$2
            }.getType());
        } catch (JsonParseException | IllegalStateException e) {
            ReleaseLogUtil.b("R_HL_TaskUtils", "getCache exception ", LogAnonymous.b(e));
            return Collections.EMPTY_LIST;
        }
    }

    public static void d(SparseArray<List<HealthLifeBean>> sparseArray) {
        if (sparseArray == null) {
            LogUtil.j("HL_TaskUtils", "setWeekCache sparseArray is null");
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_TaskUtils", "setWeekCache size ", Integer.valueOf(size));
            return;
        }
        HashMap map = new HashMap();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            map.put(Integer.valueOf(iKeyAt), sparseArray.get(iKeyAt));
        }
        String strE = HiJsonUtil.e(map, new TypeToken<HashMap<Integer, List<HealthLifeBean>>>() { // from class: com.huawei.basichealthmodel.util.TaskUtils$3
        }.getType());
        ccy.d("health_model_week_task_records_cache", strE);
        LogUtil.a("HL_TaskUtils", "setWeekCache size ", Integer.valueOf(size), " hashMap ", map, " json ", strE);
    }

    public static SparseArray<List<HealthLifeBean>> b() {
        HashMap map;
        try {
            map = (HashMap) HiJsonUtil.d(ccy.c("health_model_week_task_records_cache"), new TypeToken<HashMap<Integer, List<HealthLifeBean>>>() { // from class: com.huawei.basichealthmodel.util.TaskUtils$4
            }.getType());
        } catch (JsonParseException e) {
            LogUtil.e("HL_TaskUtils", "getWeekCache exception ", LogAnonymous.b(e));
            map = null;
        }
        if (map == null || map.size() <= 0) {
            return new SparseArray<>();
        }
        SparseArray<List<HealthLifeBean>> sparseArray = new SparseArray<>();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                List<HealthLifeBean> list = (List) entry.getValue();
                if (!njy.e(list)) {
                    sparseArray.append(((Integer) entry.getKey()).intValue(), list);
                }
            }
        }
        return sparseArray;
    }

    private static void i(List<HealthLifeBean> list) {
        int i;
        int recordDay;
        Iterator<HealthLifeBean> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                recordDay = 0;
                break;
            }
            HealthLifeBean next = it.next();
            if (next != null) {
                recordDay = next.getRecordDay();
                break;
            }
        }
        if (recordDay <= 0) {
            return;
        }
        SparseArray<List<HealthLifeBean>> sparseArrayB = b();
        int size = sparseArrayB.size();
        SparseArray sparseArray = new SparseArray();
        if (size <= 0) {
            sparseArray.append(recordDay, list);
            LogUtil.a("HL_TaskUtils", "refreshWeekCache recordDay ", Integer.valueOf(recordDay), " list ", list);
        } else {
            int iA = DateFormatUtil.a(lsl.e(DateFormatUtil.d(recordDay), 1, 0));
            int iA2 = DateFormatUtil.a(lsl.e(DateFormatUtil.d(sparseArrayB.keyAt(0)), 1, 0));
            if (iA == iA2) {
                for (i = 0; i < size; i++) {
                    int iKeyAt = sparseArrayB.keyAt(i);
                    sparseArray.append(iKeyAt, iKeyAt == recordDay ? list : sparseArrayB.get(iKeyAt));
                }
            } else {
                sparseArray.append(recordDay, list);
            }
            LogUtil.a("HL_TaskUtils", "refreshWeekCache weekStartDateForRecordDay ", Integer.valueOf(iA), " weekStartDateForDate ", Integer.valueOf(iA2), " recordDay ", Integer.valueOf(recordDay), " list ", list);
        }
        d((SparseArray<List<HealthLifeBean>>) sparseArray);
    }

    public static ArrayList<Integer> c(String str, HiSubscribeListener hiSubscribeListener) {
        if (hiSubscribeListener == null) {
            LogUtil.j("HL_TaskUtils", "subscribeHiHealthData listener is null source ", str);
            return new ArrayList<>();
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(200);
        arrayList.add(14);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(Integer.valueOf(HiSubscribeType.f12259a));
        arrayList.add(Integer.valueOf(HiSubscribeType.f12261c));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.SLEEP_ON_OFF_BED_RECORD.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        HiHealthNativeApi.a(BaseApplication.b()).subscribeHiHealthData(arrayList, hiSubscribeListener);
        return arrayList;
    }

    public static void d(String str, List<Integer> list, HiUnSubscribeListener hiUnSubscribeListener) {
        if (njy.e(list) || hiUnSubscribeListener == null) {
            LogUtil.j("HL_TaskUtils", "unSubscribeHiHealthData list ", list, " listener ", hiUnSubscribeListener, " source ", str);
        } else {
            HiHealthNativeApi.a(BaseApplication.b()).unSubscribeHiHealthData(list, hiUnSubscribeListener);
        }
    }

    private static List<HiAggregateOption> b(SparseArray<HealthLifeBean> sparseArray) {
        if (sparseArray == null) {
            LogUtil.j("HL_TaskUtils", "getDayHiAggregateOptionList recordArray is null");
            return Collections.EMPTY_LIST;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_TaskUtils", "getDayHiAggregateOptionList size ", Integer.valueOf(size));
            return Collections.EMPTY_LIST;
        }
        HealthLifeBean healthLifeBeanValueAt = sparseArray.valueAt(0);
        if (healthLifeBeanValueAt == null) {
            LogUtil.j("HL_TaskUtils", "getDayHiAggregateOptionList bean is null");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < size; i++) {
            arrayList.add(Integer.valueOf(sparseArray.keyAt(i)));
        }
        int recordDay = healthLifeBeanValueAt.getRecordDay();
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.contains(2)) {
            arrayList2.add(cfm.c(recordDay, recordDay));
        }
        if (arrayList.contains(3)) {
            arrayList2.add(cdq.e(recordDay, recordDay));
        }
        if (arrayList.contains(5)) {
            arrayList2.add(ccc.d(recordDay, recordDay));
        }
        if (arrayList.contains(10)) {
            arrayList2.add(ccm.d(recordDay, recordDay));
        }
        if (arrayList.contains(14)) {
            arrayList2.add(cgn.a(recordDay, recordDay));
        }
        return arrayList2;
    }

    public static SparseArray<HealthLifeBean> e(final SparseArray<HealthLifeBean> sparseArray) {
        List<HiAggregateOption> listB = b(sparseArray);
        if (njy.e(listB)) {
            LogUtil.j("HL_TaskUtils", "getDayRecordArray hiAggregateOptionList ", listB);
            return sparseArray;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HiHealthNativeApi.a(BaseApplication.b()).aggregateHiHealthDataEx(listB, new HiAggregateListenerEx() { // from class: cgg
            @Override // com.huawei.hihealth.data.listener.HiAggregateListenerEx
            public final void onResult(SparseArray sparseArray2, int i, int i2) {
                cgc.d(sparseArray, countDownLatch, sparseArray2, i, i2);
            }
        });
        cbg.b(countDownLatch, "getDayRecordArray");
        return sparseArray;
    }

    static /* synthetic */ void d(SparseArray sparseArray, CountDownLatch countDownLatch, SparseArray sparseArray2, int i, int i2) {
        c((SparseArray<List<HiHealthData>>) sparseArray2, (SparseArray<HealthLifeBean>) sparseArray);
        countDownLatch.countDown();
    }

    private static void c(SparseArray<List<HiHealthData>> sparseArray, SparseArray<HealthLifeBean> sparseArray2) {
        HiHealthData hiHealthData;
        if (sparseArray == null || sparseArray2 == null) {
            LogUtil.j("HL_TaskUtils", "refreshDayRecord dataArray ", sparseArray, " recordArray ", sparseArray2);
            return;
        }
        int size = sparseArray.size();
        if (size <= 0) {
            LogUtil.j("HL_TaskUtils", "refreshDayRecord size ", Integer.valueOf(size));
            return;
        }
        for (int i = 0; i < size; i++) {
            List<HiHealthData> list = sparseArray.get(sparseArray.keyAt(i));
            if (!njy.e(list) && (hiHealthData = list.get(0)) != null) {
                a(hiHealthData.getType(), list, sparseArray2);
            }
        }
    }

    private static void a(int i, List<HiHealthData> list, SparseArray<HealthLifeBean> sparseArray) {
        if (i == 10006) {
            cgn.c(list, sparseArray.get(14));
            return;
        }
        if (i == 40002) {
            cfm.d(list, sparseArray.get(2));
            return;
        }
        if (i == 200004) {
            ccm.d(list, sparseArray.get(10));
            return;
        }
        if (i == 500001) {
            ccc.d(list, sparseArray.get(5));
            return;
        }
        switch (i) {
            case 47101:
            case 47102:
            case 47103:
            case 47104:
            case 47105:
                break;
            default:
                switch (i) {
                    case 47107:
                    case 47108:
                    case 47109:
                        break;
                    default:
                        LogUtil.j("HL_TaskUtils", "refreshDayRecord default type ", Integer.valueOf(i));
                        break;
                }
                return;
        }
        cdq.c(list, sparseArray.get(3));
    }

    public static void e(final int i, final List<Integer> list, final ResponseCallback<List<HealthLifeTaskBean>> responseCallback) {
        ReleaseLogUtil.c("R_HL_TaskUtils", "getDayRecordArray date ", Integer.valueOf(i), " idList ", list, " callback ", responseCallback);
        if (responseCallback == null) {
            return;
        }
        if (HandlerExecutor.c()) {
            cbg.b(ThreadPoolManager.c(), new Runnable() { // from class: cgh
                @Override // java.lang.Runnable
                public final void run() {
                    cgc.e(i, (List<Integer>) list, (ResponseCallback<List<HealthLifeTaskBean>>) responseCallback);
                }
            });
            return;
        }
        if (njy.e(list) || i <= 0) {
            responseCallback.onResponse(-1, Collections.EMPTY_LIST);
            return;
        }
        ArrayList<ImageBean> arrayListA = ccl.d().a("1");
        for (Integer num : list) {
            if (num.intValue() == 12) {
                a(i, arrayListA, responseCallback);
            } else {
                LogUtil.a("HL_TaskUtils", "getDayRecordArray id ", num);
            }
        }
    }

    private static void a(final int i, final List<ImageBean> list, final ResponseCallback<List<HealthLifeTaskBean>> responseCallback) {
        cbq.a(b(i), (ResponseCallback<HealthLifeBean>) new ResponseCallback() { // from class: cgj
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                cgc.d(list, i, responseCallback, i2, (HealthLifeBean) obj);
            }
        });
    }

    static /* synthetic */ void d(List list, int i, ResponseCallback responseCallback, int i2, HealthLifeBean healthLifeBean) {
        int complete;
        LogUtil.a("HL_TaskUtils", "handleBloodPressureData object ", healthLifeBean);
        HealthLifeTaskBean healthLifeTaskBean = new HealthLifeTaskBean();
        healthLifeTaskBean.setId(12);
        healthLifeTaskBean.setName(qre.f(ffv.i().get(12)));
        healthLifeTaskBean.setDialogImageBean(e("1", 12, (List<ImageBean>) list));
        healthLifeTaskBean.setIconResourcesId(cbg.m().get(12));
        healthLifeTaskBean.setColorResourcesId(cbg.n().get(12));
        healthLifeTaskBean.setBackgroundColorResourcesId(cbg.l().get(12));
        if (healthLifeBean != null) {
            i = healthLifeBean.getRecordDay();
            complete = healthLifeBean.getComplete();
            healthLifeTaskBean.setHealthLifeBean(healthLifeBean);
            healthLifeTaskBean.setValue(cbg.d(healthLifeBean));
        } else {
            complete = 0;
        }
        healthLifeTaskBean.setRecordDay(i);
        healthLifeTaskBean.setComplete(complete);
        ReleaseLogUtil.c("R_HL_TaskUtils", "handleBloodPressureData errorCode ", Integer.valueOf(i2), " taskRecordDay ", Integer.valueOf(i), " complete ", Integer.valueOf(complete));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(healthLifeTaskBean);
        responseCallback.onResponse(njy.e(arrayList) ? -1 : 0, arrayList);
    }

    private static HealthLifeBean b(int i) {
        HealthLifeBean healthLifeBean = new HealthLifeBean();
        healthLifeBean.setId(12);
        healthLifeBean.setTimeZone(lsl.q(System.currentTimeMillis()));
        healthLifeBean.setRecordDay(i);
        healthLifeBean.setComplete(0);
        healthLifeBean.setResult(String.valueOf(0));
        return healthLifeBean;
    }

    public static List<HealthLifeTaskBean> a(List<HealthLifeBean> list) {
        if (njy.e(list)) {
            LogUtil.j("HL_TaskUtils", "getTaskBeanList healthLifeBeanList ", list);
            return Collections.EMPTY_LIST;
        }
        Collections.sort(list, new cdb());
        SparseIntArray sparseIntArrayM = cbg.m();
        SparseIntArray sparseIntArrayN = cbg.n();
        SparseIntArray sparseIntArrayL = cbg.l();
        SparseIntArray sparseIntArrayI = ffv.i();
        ccl cclVarD = ccl.d();
        ArrayList<ImageBean> arrayListA = cclVarD.a("2");
        ArrayList<ImageBean> arrayListA2 = cclVarD.a("1");
        ArrayList arrayList = new ArrayList();
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean != null) {
                int id = healthLifeBean.getId();
                HealthLifeTaskBean healthLifeTaskBean = new HealthLifeTaskBean();
                healthLifeTaskBean.setId(id);
                healthLifeTaskBean.setComplete(healthLifeBean.getComplete());
                healthLifeTaskBean.setRecordDay(healthLifeBean.getRecordDay());
                if (sparseIntArrayM != null) {
                    healthLifeTaskBean.setIconResourcesId(sparseIntArrayM.get(id));
                }
                if (sparseIntArrayN != null) {
                    healthLifeTaskBean.setColorResourcesId(sparseIntArrayN.get(id));
                }
                if (sparseIntArrayL != null) {
                    healthLifeTaskBean.setBackgroundColorResourcesId(sparseIntArrayL.get(id));
                }
                if (sparseIntArrayI != null) {
                    healthLifeTaskBean.setName(qre.f(sparseIntArrayI.get(id)));
                }
                healthLifeTaskBean.setValue(cbg.d(healthLifeBean));
                healthLifeTaskBean.setImageBean(e("2", id, arrayListA));
                healthLifeTaskBean.setDialogImageBean(e("1", id, arrayListA2));
                healthLifeTaskBean.setHealthLifeBean(healthLifeBean);
                arrayList.add(healthLifeTaskBean);
            }
        }
        return arrayList;
    }

    private static ImageBean e(String str, int i, List<ImageBean> list) {
        if (njy.e(list) || TextUtils.isEmpty(str)) {
            LogUtil.j("HL_TaskUtils", "getImageBean imageBeanList ", list, " scenario ", str);
            return new ImageBean();
        }
        for (ImageBean imageBean : list) {
            if (imageBean != null && str.equals(imageBean.getImageScenario()) && imageBean.getId() == i) {
                return imageBean;
            }
        }
        return new ImageBean();
    }

    public static void c(ffe ffeVar) {
        if (ffeVar == null) {
            ReleaseLogUtil.d("R_HL_TaskUtils", "consInfo is null ");
            ccy.d("health_life_task_cons_info", HiJsonUtil.d(new ffe()));
        } else {
            ccy.d("health_life_task_cons_info", HiJsonUtil.d(ffeVar));
        }
    }

    public static ffe c() {
        String strC = ccy.c("health_life_task_cons_info");
        if (TextUtils.isEmpty(strC)) {
            return new ffe();
        }
        try {
            return (ffe) HiJsonUtil.d(strC, new TypeToken<ffe>() { // from class: com.huawei.basichealthmodel.util.TaskUtils$5
            }.getType());
        } catch (JsonParseException | IllegalStateException e) {
            ReleaseLogUtil.b("R_HL_TaskUtils", "getCache exception ", LogAnonymous.b(e));
            return new ffe();
        }
    }

    public static void b(List<Integer> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_HL_TaskUtils", "ids is null ");
            ccy.d("health_life_task_cons_info", HiJsonUtil.d(new ArrayList()));
        } else {
            HashMap map = new HashMap();
            map.put(Integer.valueOf(DateFormatUtil.a(System.currentTimeMillis())), list);
            ccy.d("health_life_shown_tasks", HiJsonUtil.d(map));
        }
    }

    public static List<Integer> c(int i) {
        String strC = ccy.c("health_life_shown_tasks");
        if (TextUtils.isEmpty(strC)) {
            return new ArrayList();
        }
        try {
            Map map = (Map) HiJsonUtil.d(strC, new TypeToken<Map<Integer, List<Integer>>>() { // from class: com.huawei.basichealthmodel.util.TaskUtils$6
            }.getType());
            if (njy.b(map.keySet()) && map.keySet().contains(Integer.valueOf(i))) {
                LogUtil.a("HL_TaskUtils", "get current day ", Integer.valueOf(i), " tasks: ", map.get(Integer.valueOf(i)));
                return (List) map.get(Integer.valueOf(i));
            }
        } catch (JsonParseException | IllegalStateException e) {
            ReleaseLogUtil.b("R_HL_TaskUtils", "getCache exception ", LogAnonymous.b(e));
        }
        return new ArrayList();
    }
}
