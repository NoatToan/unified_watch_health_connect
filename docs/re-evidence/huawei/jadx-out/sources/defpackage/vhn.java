package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hihealth.HiDataDeleteOption;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiTimeInterval;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class vhn {
    private static final List<Integer> d = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

    public static vgp b() {
        vgp vgpVarD = d("custom.weight_fasting_lite_plan");
        vgp vgpVarD2 = d("custom.weight_fasting_lite_setting");
        if (vgpVarD == null || (vgpVarD2 != null && vgpVarD2.c())) {
            vgpVarD = vgpVarD2;
        }
        if (vgpVarD != null) {
            wvf.e().c(vgpVarD.c() && vgpVarD.e());
        }
        return vgpVarD;
    }

    public static vgp d() {
        vgp vgpVarD;
        vgp vgpVarD2;
        String strD = vng.d("custom.weight_fasting_lite_plan");
        if (TextUtils.isEmpty(strD)) {
            vgpVarD = d("custom.weight_fasting_lite_plan");
            vng.a("custom.weight_fasting_lite_plan", HiJsonUtil.d(vgpVarD));
        } else {
            vgpVarD = (vgp) HiJsonUtil.d(strD, vgp.class);
        }
        String strD2 = vng.d("custom.weight_fasting_lite_setting");
        if (TextUtils.isEmpty(strD2)) {
            vgpVarD2 = d("custom.weight_fasting_lite_setting");
            vng.a("custom.weight_fasting_lite_setting", HiJsonUtil.d(vgpVarD2));
        } else {
            vgpVarD2 = (vgp) HiJsonUtil.d(strD2, vgp.class);
        }
        if (vgpVarD == null || (vgpVarD2 != null && vgpVarD2.c())) {
            vgpVarD = vgpVarD2;
        }
        if (vgpVarD != null) {
            wvf.e().c(vgpVarD.c() && vgpVarD.e());
        }
        return vgpVarD;
    }

    public static vgp d(final String str) {
        final AtomicReference atomicReference = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThreadPoolManager.c().execute(new Runnable() { // from class: vhn.1
            @Override // java.lang.Runnable
            public void run() {
                HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference(str);
                if (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) {
                    LogUtil.j("FastingLiteTaskHelper", "getAppSettingByKey hiUserPreference is null, key = ", str);
                    atomicReference.set(null);
                    countDownLatch.countDown();
                } else {
                    try {
                        LogUtil.a("FastingLiteTaskHelper", "getAppSettingByKey key = ", str, ", value = ", userPreference.getValue());
                        atomicReference.set((vgp) HiJsonUtil.d(userPreference.getValue(), vgp.class));
                    } catch (JsonSyntaxException e) {
                        LogUtil.e("FastingLiteTaskHelper", "getAppSettingByKey jsonException ", ExceptionUtils.c(e));
                        atomicReference.set(null);
                    }
                    countDownLatch.countDown();
                }
            }
        });
        try {
            LogUtil.a("FastingLiteTaskHelper", "getAppSettingByKey await ", Boolean.valueOf(countDownLatch.await(1L, TimeUnit.SECONDS)));
        } catch (InterruptedException e) {
            LogUtil.e("FastingLiteTaskHelper", "getAppSettingByKey exception ", ExceptionUtils.c(e));
        }
        return (vgp) atomicReference.get();
    }

    public static void c(String str) {
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey(str);
        hiUserPreference.setValue("");
        LogUtil.a("FastingLiteTaskHelper", "clear currentTask isSuccess = ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference)), ", ", str);
    }

    public static long c(vhi vhiVar) {
        if (vhiVar != null && vhiVar.g() == 1 && vhiVar.j() > 0) {
            long jD = DateFormatUtil.d(vhiVar.j());
            Pair<Integer, Integer> pairE = vhiVar.e();
            if (jD != 0 && pairE != null) {
                return lsl.a(jD, ((Integer) pairE.first).intValue(), ((Integer) pairE.second).intValue());
            }
        }
        return -1L;
    }

    public static ArrayList<Integer> a(vhi vhiVar) {
        ArrayList<Integer> arrayList = new ArrayList<>(7);
        if (vhiVar != null && !TextUtils.isEmpty(vhiVar.f())) {
            for (String str : vhiVar.f().split(",")) {
                if (!d.contains(Integer.valueOf(qrs.a(str)))) {
                    return new ArrayList<>(7);
                }
                arrayList.add(Integer.valueOf(qrs.a(str)));
            }
        }
        return arrayList;
    }

    public static void c() {
        vgp vgpVarD = d("custom.weight_fasting_lite_plan");
        if (vgpVarD != null) {
            vgpVarD.c(false);
            HiUserPreference hiUserPreference = new HiUserPreference();
            hiUserPreference.setKey("custom.weight_fasting_lite_plan");
            String strD = HiJsonUtil.d(vgpVarD);
            hiUserPreference.setValue(strD);
            boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
            if (userPreference) {
                vng.a("custom.weight_fasting_lite_plan", strD);
            }
            LogUtil.a("FastingLiteTaskHelper", "resetAppSetting new isSuccess ", Boolean.valueOf(userPreference));
        }
        vgp vgpVarD2 = d("custom.weight_fasting_lite_setting");
        if (vgpVarD2 == null || vgpVarD2.d() == null || vgpVarD2.d().d() == null) {
            return;
        }
        vgpVarD2.c(false);
        vgpVarD2.d().d().e(0);
        HiUserPreference hiUserPreference2 = new HiUserPreference();
        hiUserPreference2.setKey("custom.weight_fasting_lite_setting");
        String strD2 = HiJsonUtil.d(vgpVarD2);
        hiUserPreference2.setValue(strD2);
        boolean userPreference2 = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference2);
        if (userPreference2) {
            vng.a("custom.weight_fasting_lite_setting", strD2);
        }
        LogUtil.a("FastingLiteTaskHelper", "resetAppSetting old isSuccess ", Boolean.valueOf(userPreference2));
    }

    public static void e(HiDataReadOption hiDataReadOption, final FastingLiteCbk<List<vhj>> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j("FastingLiteTaskHelper", "callback is null");
        } else {
            HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: vhn.5
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (obj instanceof SparseArray) {
                        SparseArray sparseArray = (SparseArray) obj;
                        if (sparseArray.size() > 0) {
                            if (!(sparseArray.get(DicDataTypeUtil.DataType.LIGHT_FASTING.value()) instanceof List)) {
                                fastingLiteCbk.onSuccess(new ArrayList(16));
                                return;
                            }
                            ArrayList arrayList = new ArrayList(16);
                            Iterator it = ((List) sparseArray.get(DicDataTypeUtil.DataType.LIGHT_FASTING.value())).iterator();
                            while (it.hasNext()) {
                                try {
                                    arrayList.add((vhj) HiJsonUtil.d(((HiHealthData) it.next()).getMetaData(), vhj.class));
                                } catch (JsonSyntaxException unused) {
                                    LogUtil.e("FastingLiteTaskHelper", "parse task fail");
                                }
                            }
                            fastingLiteCbk.onSuccess(arrayList);
                            return;
                        }
                    }
                    fastingLiteCbk.onSuccess(new ArrayList(16));
                }
            });
        }
    }

    public static void b(vhm vhmVar) {
        HiUserPreference userPreference;
        if (vhmVar == null) {
            LogUtil.j("FastingLiteTaskHelper", "can not save empty taskJson");
            return;
        }
        vgp vgpVarD = d("custom.weight_fasting_lite_setting");
        HiUserPreference hiUserPreference = new HiUserPreference();
        if (vgpVarD != null && vgpVarD.c()) {
            hiUserPreference.setKey("custom.weight_fasting_lite_current_task");
            userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_fasting_lite_current_task");
        } else {
            hiUserPreference.setKey("custom.weight_fasting_lite_plan_task");
            userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_fasting_lite_plan_task");
        }
        vhm vhmVar2 = (userPreference == null || TextUtils.isEmpty(userPreference.getValue())) ? null : (vhm) new Gson().fromJson(userPreference.getValue(), vhm.class);
        if (vhmVar2 != null && vhmVar.toString().equals(vhmVar2.toString())) {
            LogUtil.a("FastingLiteTaskHelper", "saveCurrentTask newTask is equals originTask");
            return;
        }
        String json = new Gson().toJson(vhmVar);
        LogUtil.d("FastingLiteTaskHelper", "saveCurrentTask task json ", json);
        hiUserPreference.setValue(json);
        LogUtil.a("FastingLiteTaskHelper", "saveCurrentTaskToUserPreference isSuccess= ", Boolean.valueOf(HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference)));
    }

    public static void c(vhm vhmVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (vhmVar == null) {
            LogUtil.j("FastingLiteTaskHelper", "saveFastingLiteTask is null");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "record is null");
                return;
            }
            return;
        }
        List<vhm.e> listF = vhmVar.f();
        if (njy.e(listF)) {
            LogUtil.a("FastingLiteTaskHelper", "saveFastingLitePhaseList fastingLiteWindows is empty");
            return;
        }
        List<HiHealthData> listE = e(listF);
        if (njy.e(listE)) {
            LogUtil.a("FastingLiteTaskHelper", "saveFastingLitePhaseList healthDataList is empty");
            return;
        }
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.setDatas(listE);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: vhp
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                vhn.b(iBaseResponseCallback, i, obj);
            }
        });
    }

    static /* synthetic */ void b(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a("FastingLiteTaskHelper", "insert fastingLitePhase List ", Integer.valueOf(i));
        if (iBaseResponseCallback == null) {
            LogUtil.j("FastingLiteTaskHelper", "insert callback is null");
        } else {
            iBaseResponseCallback.a(i, obj);
        }
    }

    public static void e(vhm vhmVar, FastingLiteCbk<List<vhm.e>> fastingLiteCbk) {
        e(vhmVar.o(), System.currentTimeMillis(), true, fastingLiteCbk);
    }

    public static void e(final long j, long j2, final boolean z, final FastingLiteCbk<List<vhm.e>> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j("FastingLiteTaskHelper", "callback is null");
            return;
        }
        int[] iArr = {DicDataTypeUtil.DataType.FASTING_LITE_PHASE_SET.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(0);
        hiDataReadOption.setStartTime(j);
        hiDataReadOption.setEndTime(j2);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).readHiHealthData(hiDataReadOption, new HiDataReadResultListener() { // from class: vhn.2
            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResultIntent(int i, Object obj, int i2, int i3) {
            }

            @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
            public void onResult(Object obj, int i, int i2) {
                if (obj instanceof SparseArray) {
                    SparseArray sparseArray = (SparseArray) obj;
                    if (sparseArray.size() > 0) {
                        if (!(sparseArray.get(DicDataTypeUtil.DataType.FASTING_LITE_PHASE_SET.value()) instanceof List)) {
                            fastingLiteCbk.onSuccess(new ArrayList(16));
                            return;
                        }
                        List list = (List) sparseArray.get(DicDataTypeUtil.DataType.FASTING_LITE_PHASE_SET.value());
                        if (!njy.e(list)) {
                            fastingLiteCbk.onSuccess(vhn.b((List<HiHealthData>) list, j, z));
                            return;
                        } else {
                            fastingLiteCbk.onSuccess(new ArrayList(16));
                            return;
                        }
                    }
                }
                fastingLiteCbk.onSuccess(new ArrayList(16));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List<vhm.e> b(List<HiHealthData> list, long j, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (HiHealthData hiHealthData : list) {
            vhm.e eVarB = b(arrayList, hiHealthData.getStartTime(), hiHealthData.getEndTime());
            if (hiHealthData.getType() == DicDataTypeUtil.DataType.FASTINGLITE_STARTTIME.value()) {
                eVarB.c((long) hiHealthData.getValue(), false);
            } else if (hiHealthData.getType() == DicDataTypeUtil.DataType.FASTINGLITE_ENDTIME.value()) {
                eVarB.e((long) hiHealthData.getValue(), false);
            } else if (hiHealthData.getType() == DicDataTypeUtil.DataType.NEXT_EAT_WINDOW_TIME.value()) {
                eVarB.d((long) hiHealthData.getValue(), false);
            } else if (hiHealthData.getType() == DicDataTypeUtil.DataType.FASTINGLITE_RECORD_ID.value()) {
                eVarB.b((long) hiHealthData.getValue(), false);
            } else if (hiHealthData.getType() == DicDataTypeUtil.DataType.FASTINGLITE_IS_EATING.value()) {
                eVarB.a(hiHealthData.getIntValue() == 1);
            } else {
                LogUtil.j("FastingLiteTaskHelper", "HiHealthData getType is Error");
            }
        }
        if (!njy.e(arrayList)) {
            Collections.sort(arrayList, new Comparator() { // from class: vho
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((vhm.e) obj).f(), ((vhm.e) obj2).f());
                }
            });
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                b(arrayList, arrayList2, j);
                return arrayList2;
            }
        }
        return arrayList;
    }

    private static void b(List<vhm.e> list, List<vhm.e> list2, long j) {
        ArrayList arrayList = new ArrayList();
        for (vhm.e eVar : list) {
            if (eVar.c() != j) {
                LogUtil.j("FastingLiteTaskHelper", "fillValidWindows currentWindow is not belong currentTask");
            } else if (eVar.f() < j || eVar.e() == 0 || eVar.d() == 0) {
                arrayList.add(eVar);
            } else if (njy.e(list2)) {
                list2.add(eVar);
            } else {
                vhm.e eVar2 = list2.get(list2.size() - 1);
                if (eVar2.e() == eVar.f() || eVar2.d() == eVar.f()) {
                    list2.add(eVar);
                } else {
                    arrayList.add(eVar);
                }
            }
        }
        a(arrayList);
    }

    private static vhm.e b(List<vhm.e> list, long j, long j2) {
        if (njy.e(list)) {
            return c(list, j, j2);
        }
        for (vhm.e eVar : list) {
            if (eVar.a() == j) {
                return eVar;
            }
        }
        return c(list, j, j2);
    }

    private static vhm.e c(List<vhm.e> list, long j, long j2) {
        vhm.e eVar = new vhm.e(j, j2);
        list.add(eVar);
        return eVar;
    }

    private static List<HiHealthData> e(List<vhm.e> list) {
        ArrayList arrayList = new ArrayList();
        for (vhm.e eVar : list) {
            if (!eVar.g()) {
                LogUtil.j("FastingLiteTaskHelper", "getHiHealthData window is not change");
            } else {
                HiHealthData hiHealthData = new HiHealthData();
                hiHealthData.setType(DicDataTypeUtil.DataType.FASTING_LITE_PHASE_SET.value());
                hiHealthData.setStartTime(eVar.a());
                hiHealthData.setEndTime(eVar.b());
                HashMap map = new HashMap();
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.FASTINGLITE_STARTTIME.value()), Long.valueOf(eVar.f()));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.FASTINGLITE_ENDTIME.value()), Long.valueOf(eVar.e()));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.NEXT_EAT_WINDOW_TIME.value()), Long.valueOf(eVar.d()));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.FASTINGLITE_RECORD_ID.value()), Long.valueOf(eVar.c()));
                map.put(Integer.valueOf(DicDataTypeUtil.DataType.FASTINGLITE_IS_EATING.value()), Integer.valueOf(eVar.j() ? 1 : 0));
                hiHealthData.setFieldsValue(HiJsonUtil.d(map));
                hiHealthData.setDeviceUuid("-1");
                arrayList.add(hiHealthData);
            }
        }
        return arrayList;
    }

    private static void a(List<vhm.e> list) {
        if (njy.e(list)) {
            LogUtil.j("FastingLiteTaskHelper", "deleteFastingLiteWindows errorWindows is empty");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (vhm.e eVar : list) {
            HiTimeInterval hiTimeInterval = new HiTimeInterval();
            hiTimeInterval.setStartTime(eVar.a());
            hiTimeInterval.setEndTime(eVar.b());
            arrayList.add(hiTimeInterval);
        }
        HiDataDeleteOption hiDataDeleteOption = new HiDataDeleteOption();
        hiDataDeleteOption.setTimes(arrayList);
        hiDataDeleteOption.setTypes(new int[]{DicDataTypeUtil.DataType.FASTINGLITE_STARTTIME.value(), DicDataTypeUtil.DataType.FASTINGLITE_ENDTIME.value(), DicDataTypeUtil.DataType.NEXT_EAT_WINDOW_TIME.value(), DicDataTypeUtil.DataType.FASTINGLITE_RECORD_ID.value(), DicDataTypeUtil.DataType.FASTINGLITE_IS_EATING.value()});
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).deleteHiHealthData(hiDataDeleteOption, new HiDataOperateListener() { // from class: vhn.4
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public void onResult(int i, Object obj) {
                LogUtil.a("FastingLiteTaskHelper", "deleteHiHealthData fastingLitePhase List ", Integer.valueOf(i));
            }
        });
    }
}
