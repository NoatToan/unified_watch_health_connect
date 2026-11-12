package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.jsbridge.system.eventhub.H5ProEventHubManager;
import com.huawei.health.healthmodel.bean.HealthLifeBean;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiAggregateListener;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.HiHealthDictManager;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.motion.IExecuteResult;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.openalliance.ad.constant.ConfigMapDefValues;
import com.huawei.taskplatform.TaskEnum;
import health.compact.a.CommonUtil;
import health.compact.a.CommonUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class kad {
    public static void a(String str, String str2) {
        H5ProEventHubManager.trigger("health-life.01", "");
        ReleaseLogUtil.c(str, str2, " refreshH5 ", "health-life.01");
    }

    public static int d(int i, List<fer> list) {
        int iA = 0;
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getHealthLifeVersion list ", list);
            return 0;
        }
        list.sort(Comparator.comparingInt(new ToIntFunction() { // from class: kat
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return kad.b((fer) obj);
            }
        }));
        for (fer ferVar : list) {
            if (ferVar != null) {
                iA = ferVar.a();
                if (ferVar.e() == i) {
                    return iA;
                }
            }
        }
        LogUtil.b("HL_HealthLifeUtil", "getHealthLifeVersion version ", Integer.valueOf(iA), " recordDay ", Integer.valueOf(i), " list ", list);
        return iA;
    }

    static /* synthetic */ int b(fer ferVar) {
        if (ferVar == null) {
            return 0;
        }
        return ferVar.e();
    }

    public static List<Integer> e(List<fer> list, int i) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getVersionList healthLifeVersionDTOList ", list);
            return Collections.EMPTY_LIST;
        }
        int iE = jyc.c().e();
        ArrayList arrayList = new ArrayList();
        for (fer ferVar : list) {
            if (ferVar != null) {
                int iE2 = ferVar.e();
                if (iE2 < iE) {
                    if (i != 1) {
                        arrayList.add(Integer.valueOf(iE2));
                    }
                } else if (ferVar.a() == i) {
                    arrayList.add(Integer.valueOf(iE2));
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(ResponseCallback<Boolean> responseCallback) {
        final CountDownLatch countDownLatch = new CountDownLatch(3);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ThreadPoolManager.c().execute(new Runnable() { // from class: kas
            @Override // java.lang.Runnable
            public final void run() {
                jyc.c().b(new ResponseCallback() { // from class: kal
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        kad.c(atomicBoolean, countDownLatch, i, (List) obj);
                    }
                });
            }
        });
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        ThreadPoolManager.c().execute(new Runnable() { // from class: kaw
            @Override // java.lang.Runnable
            public final void run() {
                jyc.c().d(new ResponseCallback() { // from class: kaj
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        kad.b(atomicBoolean, countDownLatch, i, (Boolean) obj);
                    }
                });
            }
        });
        final AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
        ThreadPoolManager.c().execute(new Runnable() { // from class: kay
            @Override // java.lang.Runnable
            public final void run() {
                ccu.d(new ResponseCallback() { // from class: kav
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        kad.d(atomicBoolean, countDownLatch, i, (bwx) obj);
                    }
                });
            }
        });
        try {
            ReleaseLogUtil.c("R_HL_HealthLifeUtil", "isHealthLife isAwait ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.b("R_HL_HealthLifeUtil", "isHealthLife exception ", ExceptionUtils.c(e));
        }
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "isHealthLife callback is null");
            return;
        }
        boolean z = atomicBoolean.get();
        if (z || atomicBoolean3.get()) {
            responseCallback.onResponse(0, Boolean.valueOf(z && atomicBoolean2.get()));
        } else {
            responseCallback.onResponse(0, Boolean.valueOf(ffv.t()));
        }
    }

    static /* synthetic */ void c(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i, List list) {
        String strH;
        if (CollectionUtils.a(list)) {
            atomicBoolean.set(false);
            countDownLatch.countDown();
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qey qeyVar = (qey) it.next();
            if (qeyVar != null && qeyVar.f() == 1) {
                strH = qeyVar.h();
                atomicBoolean.set(!TextUtils.isEmpty(strH));
                countDownLatch.countDown();
            }
        }
        strH = "";
        atomicBoolean.set(!TextUtils.isEmpty(strH));
        countDownLatch.countDown();
    }

    static /* synthetic */ void b(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i, Boolean bool) {
        atomicBoolean.set(bool != null && bool.booleanValue());
        countDownLatch.countDown();
    }

    static /* synthetic */ void d(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, int i, bwx bwxVar) {
        atomicBoolean.set(bwxVar != null && bwxVar.d() > 0);
        countDownLatch.countDown();
    }

    public static Map<String, Integer> a(Map<String, Integer> map) {
        boolean z;
        int iE = jyc.c().e();
        int iC = ccy.c();
        LogUtil.b("HL_HealthLifeUtil", "getMapByHealthLifeUserInfo map ", map, " planStartDate ", Integer.valueOf(iE), " cloverJoinDate ", Integer.valueOf(iC));
        if (map == null) {
            HashMap map2 = new HashMap(2);
            map2.put("healthLifeJoinTime", Integer.valueOf(iE));
            map2.put("cloverJoinTime", Integer.valueOf(iC));
            return map2;
        }
        if (iE <= 0 || iE == CommonUtils.j(String.valueOf(map.get("healthLifeJoinTime")))) {
            z = false;
        } else {
            map.put("healthLifeJoinTime", Integer.valueOf(iE));
            z = true;
        }
        if (iC > 0 && iC != CommonUtils.j(String.valueOf(map.get("cloverJoinTime")))) {
            map.put("cloverJoinTime", Integer.valueOf(iC));
        } else if (!z) {
            return Collections.EMPTY_MAP;
        }
        return map;
    }

    public static void c(Map<String, Integer> map) {
        Map<String, Integer> mapA = a(map);
        if (CollectionUtils.c(mapA)) {
            return;
        }
        String strD = HiJsonUtil.d(mapA);
        LogUtil.b("HL_HealthLifeUtil", "updateHealthLifeUserInfo json ", strD);
        xkb.d("900300055", strD, new HiDataOperateListener() { // from class: kau
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                ReleaseLogUtil.c("R_HL_HealthLifeUtil", "updateHealthLifeUserInfo errorCode ", Integer.valueOf(i), " object ", obj);
            }
        });
    }

    public static List<Integer> e(int i, int i2, List<nrh> list) {
        List<Integer> listA = lsl.a(i, i2);
        if (CollectionUtils.a(listA)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getDateList dateList ", listA);
            return Collections.EMPTY_LIST;
        }
        if (i != i2) {
            if (CollectionUtils.a(list)) {
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getDateList arkUiDataList ", list);
                return listA;
            }
            for (nrh nrhVar : list) {
                if (nrhVar != null) {
                    String strB = nrhVar.b();
                    if (!TextUtils.isEmpty(strB)) {
                        c(listA, nrhVar, strB);
                    }
                }
            }
        }
        return listA;
    }

    private static void c(List<Integer> list, final nrh nrhVar, final String str) {
        list.removeIf(new Predicate() { // from class: kah
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return kad.e(nrhVar, str, (Integer) obj);
            }
        });
    }

    static /* synthetic */ boolean e(nrh nrhVar, String str, Integer num) {
        Map<String, Object> mapC = nrhVar.c();
        if (mapC == null || !mapC.containsKey("fourLeafVersion")) {
            return false;
        }
        Object obj = mapC.get("sportLeafIsShow");
        int i = ((obj instanceof Number) && ((Number) obj).intValue() == 1) ? 1 : 0;
        Object obj2 = mapC.get("sleepLeafIsShow");
        if ((obj2 instanceof Number) && ((Number) obj2).intValue() == 1) {
            i++;
        }
        Object obj3 = mapC.get("emotionLeafIsShow");
        if ((obj3 instanceof Number) && ((Number) obj3).intValue() == 1) {
            i++;
        }
        Object obj4 = mapC.get("eatingLeafIsShow");
        if ((obj4 instanceof Number) && ((Number) obj4).intValue() == 1) {
            i++;
        }
        if (i < 3) {
            return false;
        }
        return Objects.equals(DateFormatUtil.e(DateFormatUtil.d(num.intValue()), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY), str);
    }

    private static nrh a(List<nrh> list, int i) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getArkUiData arkUiDataList ", list);
            return null;
        }
        String strE = DateFormatUtil.e(DateFormatUtil.d(i), DateFormatUtil.DateFormatType.DATE_FORMAT_MDY);
        for (nrh nrhVar : list) {
            if (nrhVar != null && Objects.equals(nrhVar.b(), strE)) {
                return nrhVar;
            }
        }
        return null;
    }

    private static float b(qfj qfjVar, String str) {
        if (qfjVar == null || TextUtils.isEmpty(str)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getProgress taskId ", str, " querySchedulesResp ", qfjVar);
            return 0.0f;
        }
        int iJ = CommonUtils.j(qfjVar.e(str));
        if (iJ <= 0) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getProgress goal ", Integer.valueOf(iJ));
            return 0.0f;
        }
        return CommonUtils.j(qfjVar.g(str)) / iJ;
    }

    private static int e(List<Float> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getProgress progressList ", list);
            return -1;
        }
        float fFloatValue = 0.0f;
        for (Float f : list) {
            if (f != null) {
                fFloatValue += f.floatValue();
            }
        }
        return Math.max((int) Math.min(100.0d, UnitUtil.d((fFloatValue / list.size()) * 100.0f, 0)), Float.compare(fFloatValue, 0.0f) > 0 ? 1 : 0);
    }

    private static HiHealthData a(int i, DicDataTypeUtil.DataType dataType, int i2) {
        HiHealthData hiHealthData = new HiHealthData();
        long jD = DateFormatUtil.d(i);
        hiHealthData.setStartTime(lsl.r(jD));
        hiHealthData.setEndTime(lsl.c(jD));
        hiHealthData.setDeviceUuid(String.valueOf(-1));
        hiHealthData.setValue(i2);
        hiHealthData.setType(dataType.value());
        return hiHealthData;
    }

    private static void c(qfj qfjVar, List<Float> list, List<Float> list2, List<Float> list3, List<Float> list4) {
        List<String> listH = qfjVar.h();
        if (CollectionUtils.a(listH)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "buildProgressList taskIdList ", listH);
            return;
        }
        for (String str : listH) {
            if (!TextUtils.isEmpty(str)) {
                TaskEnum taskEnumFromTaskId = TaskEnum.fromTaskId(str);
                if (taskEnumFromTaskId == null) {
                    ReleaseLogUtil.d("R_HL_HealthLifeUtil", "buildProgressList taskEnum is null taskId ", str);
                } else {
                    int iB = qfjVar.b(str);
                    switch (AnonymousClass4.d[taskEnumFromTaskId.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            list.add(Float.valueOf(iB <= 0 ? Math.min(1.0f, b(qfjVar, str)) : 1.0f));
                            break;
                        case 5:
                        case 6:
                        case 7:
                            list2.add(Float.valueOf(iB > 0 ? 1.0f : 0.0f));
                            break;
                        case 8:
                            list3.add(Float.valueOf(iB > 0 ? 1.0f : 0.0f));
                            break;
                        case 9:
                            list3.add(Float.valueOf(iB <= 0 ? Math.min(1.0f, b(qfjVar, str)) : 1.0f));
                            break;
                        case 10:
                            list4.add(Float.valueOf(iB <= 0 ? Math.min(1.0f, b(qfjVar, str)) : 1.0f));
                            break;
                        case 11:
                            list4.add(Float.valueOf(iB > 0 ? 1.0f : 0.0f));
                            break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: kad$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[TaskEnum.values().length];
            d = iArr;
            try {
                iArr[TaskEnum.ACTIVITY_CALORIES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[TaskEnum.ACTIVITY_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[TaskEnum.EXERCISE_DURATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[TaskEnum.STEPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                d[TaskEnum.SLEEP_DURATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                d[TaskEnum.BEDTIME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                d[TaskEnum.WAKEUP_TIME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                d[TaskEnum.AVG_DAILY_PRESSURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[TaskEnum.DECOMP_AND_RELAX.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[TaskEnum.DRINK_WATER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[TaskEnum.CALORIES_INTAKE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private static void c(Map<String, Object> map, int i, String str, String str2) {
        if (i >= 0) {
            map.put(str, 1);
            map.put(str2, Integer.valueOf(i));
        } else {
            map.put(str, 0);
        }
    }

    private static void e(List<HiHealthData> list, int i, int i2, DicDataTypeUtil.DataType dataType, DicDataTypeUtil.DataType dataType2) {
        if (i2 >= 0) {
            list.add(a(i, dataType, 1));
            list.add(a(i, dataType2, i2));
        } else {
            list.add(a(i, dataType, 0));
        }
    }

    private static void a(nrh nrhVar, int i, int i2, int i3, int i4, int i5, int i6) {
        if (nrhVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshArkUiData arkUiData is null");
            return;
        }
        Map<String, Object> mapC = nrhVar.c();
        if (mapC == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshArkUiData map is null");
            mapC = new HashMap<>();
        }
        c(mapC, i, "sportLeafIsShow", "sportLeafProgress");
        c(mapC, i2, "sleepLeafIsShow", "sleepLeafProgress");
        c(mapC, i3, "emotionLeafIsShow", "emotionLeafProgress");
        c(mapC, i4, "eatingLeafIsShow", "eatingLeafProgress");
        mapC.put("perfectFourLeaf", Integer.valueOf(i5));
        mapC.put("fourLeafVersion", Integer.valueOf(i6));
        nrhVar.c(mapC);
    }

    private static void a(qfj qfjVar, int i, int i2, int i3, int i4) {
        if (qfjVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshProgress querySchedulesResp is null");
            return;
        }
        Map<String, Integer> mapD = qfjVar.d();
        if (i >= 0) {
            mapD.put("sport", Integer.valueOf(i));
        }
        if (i2 >= 0) {
            mapD.put("sleep", Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            mapD.put("emotion", Integer.valueOf(i3));
        }
        if (i4 >= 0) {
            mapD.put("diet", Integer.valueOf(i4));
        }
        qep qepVarC = qfjVar.c();
        if (qepVarC == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "refreshProgress metaDataResp is null");
        } else {
            qepVarC.a(mapD);
            qfjVar.h(HiJsonUtil.d(qepVarC));
        }
    }

    public static void a(int i, List<String> list, List<nrh> list2, qfj qfjVar, ResponseCallback<qfj> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateArkUiDataList callback is null");
            return;
        }
        if (qfjVar == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateArkUiDataList querySchedulesResp is null");
            responseCallback.onResponse(-1, null);
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(2);
        ArrayList arrayList4 = new ArrayList(2);
        c(qfjVar, arrayList, arrayList2, arrayList3, arrayList4);
        int iE = e(arrayList);
        int iE2 = e(arrayList2);
        int iE3 = e(arrayList3);
        int iE4 = e(arrayList4);
        a(qfjVar, iE, iE2, iE3, iE4);
        responseCallback.onResponse(0, qfjVar);
        a(a(list2, i), iE, iE2, iE3, iE4, 0, 1);
        if (CollectionUtils.a(list) && DateFormatUtil.a(System.currentTimeMillis()) == i) {
            return;
        }
        ArrayList arrayList5 = new ArrayList();
        e(arrayList5, i, iE, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SPORT_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SPORT_PROGRESS);
        e(arrayList5, i, iE2, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SLEEP_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SLEEP_PROGRESS);
        e(arrayList5, i, iE3, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_EMOTION_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_EMOTION_PROGRESS);
        e(arrayList5, i, iE4, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_EATING_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_EATING_PROGRESS);
        arrayList5.add(a(i, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_PERFECT, 0));
        arrayList5.add(a(i, DicDataTypeUtil.DataType.FOUR_LEAF_VERSION_VALUE, 1));
        final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList5);
        LogUtil.b("HL_HealthLifeUtil", "updateArkUiDataList option ", HiJsonUtil.d(hiDataInsertOption));
        ThreadPoolManager.c().execute(new Runnable() { // from class: kan
            @Override // java.lang.Runnable
            public final void run() {
                HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: kaz
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i2, Object obj) {
                        LogUtil.b("HL_HealthLifeUtil", "updateArkUiDataList errorCode ", Integer.valueOf(i2), " object ", HiJsonUtil.d(obj));
                    }
                });
            }
        });
    }

    public static void b(final List<Integer> list, final List<nrh> list2, final CountDownLatch countDownLatch) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateArkUiDataList lifeDateList ", list);
            c(countDownLatch);
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: kak
                @Override // java.lang.Runnable
                public final void run() {
                    kad.d(list, list2, countDownLatch);
                }
            });
        }
    }

    static /* synthetic */ void d(List list, List list2, final CountDownLatch countDownLatch) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num != null) {
                jyc.c().e(num.intValue(), (List<nrh>) list2, new ResponseCallback() { // from class: kar
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        kad.d(countDownLatch, i, (qfj) obj);
                    }
                });
            }
        }
    }

    static /* synthetic */ void d(CountDownLatch countDownLatch, int i, qfj qfjVar) {
        LogUtil.b("HL_HealthLifeUtil", "updateArkUiDataList errorCode ", Integer.valueOf(i), " querySchedulesResp ", HiJsonUtil.d(qfjVar));
        c(countDownLatch);
    }

    public static void c(List<Integer> list, List<nrh> list2, final CountDownLatch countDownLatch) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateArkUiDataListByClover cloverDateList ", list);
            c(countDownLatch);
            return;
        }
        int i = 1;
        SparseArray<List<HealthLifeBean>> sparseArrayB = byu.c().b(lua.d(), list.get(0).intValue(), list.get(list.size() - 1).intValue());
        if (sparseArrayB == null || sparseArrayB.size() <= 0) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "updateArkUiDataListByClover sparseArray ", sparseArrayB);
            c(countDownLatch);
            return;
        }
        ArrayList arrayList = new ArrayList();
        int iD = ccy.d();
        int size = sparseArrayB.size();
        int i2 = 0;
        while (i2 < size) {
            int iKeyAt = sparseArrayB.keyAt(i2);
            List<HealthLifeBean> list3 = sparseArrayB.get(iKeyAt);
            if (!CollectionUtils.a(list3)) {
                float fC = cbg.c(list3, i, iD);
                float fC2 = cbg.c(list3, 3, iD);
                float fC3 = cbg.c(list3, 2, iD);
                int iMin = (int) Math.min(100.0d, UnitUtil.d(fC * 100.0f, 0));
                int iMin2 = (int) Math.min(100.0d, UnitUtil.d(fC2 * 100.0f, 0));
                int iMin3 = (int) Math.min(100.0d, UnitUtil.d(fC3 * 100.0f, 0));
                int iD2 = d(list3);
                a(a(list2, iKeyAt), iMin, iMin2, iMin3, -1, iD2, 0);
                e(arrayList, iKeyAt, iMin, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SPORT_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SPORT_PROGRESS);
                e(arrayList, iKeyAt, iMin2, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SLEEP_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_SLEEP_PROGRESS);
                e(arrayList, iKeyAt, iMin3, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_EMOTION_SHOW, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_EMOTION_PROGRESS);
                arrayList.add(a(iKeyAt, DicDataTypeUtil.DataType.FOUR_LEAF_ACHIEVEMENT_DATA_PERFECT, iD2));
                arrayList.add(a(iKeyAt, DicDataTypeUtil.DataType.FOUR_LEAF_VERSION_VALUE, 0));
            }
            i2++;
            i = 1;
        }
        final HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(arrayList);
        LogUtil.b("HL_HealthLifeUtil", "updateArkUiDataListByClover option ", HiJsonUtil.d(hiDataInsertOption));
        ThreadPoolManager.c().execute(new Runnable() { // from class: kao
            @Override // java.lang.Runnable
            public final void run() {
                HiHealthManager.d(BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: kai
                    @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
                    public final void onResult(int i3, Object obj) {
                        kad.a(countDownLatch, i3, obj);
                    }
                });
            }
        });
    }

    static /* synthetic */ void a(CountDownLatch countDownLatch, int i, Object obj) {
        LogUtil.b("HL_HealthLifeUtil", "updateArkUiDataListByClover errorCode ", Integer.valueOf(i), " object ", obj);
        c(countDownLatch);
    }

    private static int d(List<HealthLifeBean> list) {
        if (CollectionUtils.a(list)) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getPerfectByClover list ", list);
            return 0;
        }
        for (HealthLifeBean healthLifeBean : list) {
            if (healthLifeBean == null) {
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getPerfectByClover healthLifeBean is null");
            } else if (healthLifeBean.getId() == 1) {
                return healthLifeBean.getComplete() <= 0 ? 0 : 1;
            }
        }
        return 0;
    }

    private static void c(CountDownLatch countDownLatch) {
        if (countDownLatch == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "countDown countDownLatch is null");
        } else {
            countDownLatch.countDown();
        }
    }

    public static void e() {
        xkb.c("900300067", new ResponseCallback() { // from class: kam
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                kad.b(i, (Pair) obj);
            }
        });
    }

    static /* synthetic */ void b(int i, Pair pair) {
        new ArrayList();
        if (pair == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getSampleConfigForHealth pair is null");
            return;
        }
        try {
            c(new JSONObject((String) pair.second).getString("orders"));
        } catch (JSONException unused) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "ConfigDataCallback JSONException ");
        }
    }

    private static void c(String str) {
        LogUtil.b("R_HL_HealthLifeUtil", "saveTaskOrder with ", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        lua.f(String.valueOf(10000), "TASK_ORDER_KEY", str);
    }

    public static void a(final ResponseCallback<Object> responseCallback) {
        fga.d(BaseApplication.b()).e().c(new IExecuteResult() { // from class: kad.2
            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onSuccess(Object obj) {
                LogUtil.b("HL_HealthLifeUtil", "getStepCurrentValue onSuccess object ", obj);
                if (!(obj instanceof Bundle)) {
                    responseCallback.onResponse(-1, String.valueOf(0));
                } else {
                    responseCallback.onResponse(0, String.valueOf(((Bundle) obj).getInt("step")));
                }
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onFailed(Object obj) {
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskValue onFailed object ", obj);
                responseCallback.onResponse(-1, String.valueOf(0));
            }

            @Override // com.huawei.hihealth.motion.IExecuteResult
            public void onServiceException(Object obj) {
                ReleaseLogUtil.d("R_HL_HealthLifeUtil", "getTaskValue onServiceException object ", obj);
                responseCallback.onResponse(-1, String.valueOf(0));
            }
        });
    }

    public static void d(final ResponseCallback<Object> responseCallback) {
        gwa.c().e(new Date(), new Date(), new int[]{3, ConfigMapDefValues.DEFAULT_APPLIST_INTERVAL, 1}, new IBaseResponseCallback() { // from class: kaq
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                kad.c(responseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void c(ResponseCallback responseCallback, int i, Object obj) {
        LogUtil.b("HL_HealthLifeUtil", "getWakeUpTimeValue errorCode ", Integer.valueOf(i), " object ", obj);
        long jO = 0;
        if (!njy.b(obj, gxq.class)) {
            responseCallback.onResponse(0, 0L);
            return;
        }
        List<gxq> list = (List) obj;
        if (CollectionUtils.a(list)) {
            responseCallback.onResponse(0, 0L);
            return;
        }
        for (gxq gxqVar : list) {
            if (gxqVar != null) {
                jO = gxqVar.o();
            }
        }
        responseCallback.onResponse(0, Long.valueOf(jO));
    }

    public static void e(final ResponseCallback<Object> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_HL_HealthLifeUtil", "fetchRelaxationAndBreath callback is null.");
        } else {
            Objects.requireNonNull(responseCallback);
            b((ResponseCallback<Integer>) new ResponseCallback() { // from class: kap
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    responseCallback.onResponse(i, (Integer) obj);
                }
            });
        }
    }

    private static void b(final ResponseCallback<Integer> responseCallback) {
        ArrayList arrayList = new ArrayList(HiHealthDictManager.a(BaseApplication.b()).f(DicDataTypeUtil.DataType.RELAXATION_TYPE.value()));
        arrayList.addAll(HiHealthDictManager.a(BaseApplication.b()).f(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        final ArrayList arrayList2 = new ArrayList(HiHealthDictManager.a(BaseApplication.b()).d(DicDataTypeUtil.DataType.RELAXATION_TYPE.value()));
        arrayList2.addAll(HiHealthDictManager.a(BaseApplication.b()).d(DicDataTypeUtil.DataType.BREATH_TRAIN_SET.value()));
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(CommonUtil.c((List<Integer>) arrayList));
        hiAggregateOption.setConstantsKey((String[]) arrayList2.toArray(new String[0]));
        hiAggregateOption.setAggregateType(2);
        hiAggregateOption.setGroupUnitType(3);
        int iA = DateFormatUtil.a(System.currentTimeMillis());
        hiAggregateOption.setTimeInterval(String.valueOf(iA), String.valueOf(iA), HiDataReadOption.TimeFormatType.DATE_FORMAT_YYYY_MM_DD);
        HiHealthManager.d(BaseApplication.b()).aggregateHiHealthData(hiAggregateOption, new HiAggregateListener() { // from class: kad.5
            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResultIntent(int i, List<HiHealthData> list, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiAggregateListener
            public void onResult(List<HiHealthData> list, int i, int i2) {
                ReleaseLogUtil.c("R_HL_HealthLifeUtil", "queryRelaxationAndBreath onResult errorCode ", Integer.valueOf(i));
                int i3 = 0;
                if (CollectionUtils.a(list)) {
                    ReleaseLogUtil.d("R_HL_HealthLifeUtil", "queryRelaxationAndBreath onResult list ", list);
                    responseCallback.onResponse(i, 0);
                    return;
                }
                HiHealthData hiHealthData = list.get(0);
                if (hiHealthData == null) {
                    ReleaseLogUtil.c("R_HL_HealthLifeUtil", "queryRelaxationAndBreath onResult hiHealthData is null");
                    responseCallback.onResponse(i, 0);
                    return;
                }
                for (String str : arrayList2) {
                    int i4 = hiHealthData.getInt(str);
                    i3 += i4;
                    LogUtil.b("HL_HealthLifeUtil", "queryRelaxationAndBreath onResult value:", Integer.valueOf(i4), "name:", str);
                }
                responseCallback.onResponse(i, Integer.valueOf(i3));
            }
        });
    }
}
