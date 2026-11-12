package com.huawei.ui.main.stories.health.weight.callback;

import android.os.Looper;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.weight.WeightApi;
import com.huawei.hihealth.HiDataInsertOption;
import com.huawei.hihealth.HiDataReadOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository;
import defpackage.njy;
import defpackage.uxb;
import defpackage.uxf;
import defpackage.vgp;
import defpackage.vgx;
import defpackage.vhc;
import defpackage.vhj;
import defpackage.vhm;
import defpackage.vhn;
import defpackage.vng;
import defpackage.wvf;
import health.compact.a.DeviceUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.ToIntFunction;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@H5ProService(name = "FastingLite")
public class FastingLiteRepository {
    private static final int AWAIT_READ_TIME_OUT = 5000;
    private static final int ERROR_CODE_FAIL = -1;
    private static final int ERROR_CODE_SUCCESS = 0;
    private static final String FASTING_LITE_CURRENT_TASK_KAY = "currentTask";
    private static final String FASTING_LITE_STATUS_KEY = "status";
    private static final String FASTING_LITE_STATUS_NOT_JOIN = "0";
    private static final String FASTING_LITE_STATUS_VERSION_ERROR = "1";
    private static final long PRECISION = 2;
    private static final String RELEASE_TAG = "R_FastingLiteRepository";
    private static final long SECOND_TO_MILLISECOND = 1000;
    private static final String TAG = "FastingLiteRepository";

    private FastingLiteRepository() {
    }

    @H5ProMethod(name = "addFastingLiteAppSetting")
    public static void addFastingLiteAppSetting(vgp vgpVar, FastingLiteCbk<Object> fastingLiteCbk) {
        updateFastingLiteAppSetting(vgpVar, fastingLiteCbk);
    }

    @H5ProMethod(name = "getFastingLiteAppSetting")
    public static void getFastingLiteAppSetting(FastingLiteCbk<vgp> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "getFastingLiteAppSetting callback is null");
        } else {
            fastingLiteCbk.onSuccess(vhn.d("custom.weight_fasting_lite_setting"));
        }
    }

    @H5ProMethod(name = "updateFastingLiteAppSetting")
    public static void updateFastingLiteAppSetting(vgp vgpVar, FastingLiteCbk<Object> fastingLiteCbk) {
        if (vgpVar == null) {
            LogUtil.j(TAG, "updateFastingLiteAppSetting setting is null");
            return;
        }
        LogUtil.a(TAG, "updateFastingLiteAppSetting setting:", vgpVar.toString());
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_fasting_lite_setting");
        String strD = HiJsonUtil.d(vgpVar);
        hiUserPreference.setValue(strD);
        boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
        if (userPreference) {
            vng.a("custom.weight_fasting_lite_setting", strD);
        }
        LogUtil.a(TAG, "updateFastingLiteAppSetting isSuccess = ", Boolean.valueOf(userPreference));
        if (vgpVar.d() != null && vgpVar.d().d() != null && vgpVar.d().d().g() == 1) {
            vhn.c("custom.weight_fasting_lite_current_task");
        }
        if (vgpVar.c()) {
            saveCurrentTask(uxb.c().a());
        }
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "updateFastingLiteAppSetting fastingLiteCallback is null");
        } else if (userPreference) {
            fastingLiteCbk.onSuccess(0);
        } else {
            fastingLiteCbk.onFailure(-1, "updateFastingLiteAppSetting unknown");
        }
    }

    @H5ProMethod(name = "setFastingLitePlan")
    public static void setFastingLitePlan(vgp vgpVar, FastingLiteCbk<Object> fastingLiteCbk) {
        if (vgpVar == null) {
            LogUtil.j(TAG, "setFastingLitePlan setting is null");
            return;
        }
        LogUtil.a(TAG, "setFastingLitePlan setting: ", vgpVar.toString());
        wvf.e().c(vgpVar.c() && vgpVar.e());
        uxb.c().e(vgpVar);
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_fasting_lite_plan");
        String strD = HiJsonUtil.d(vgpVar);
        hiUserPreference.setValue(strD);
        boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
        if (userPreference) {
            vng.a("custom.weight_fasting_lite_plan", strD);
        }
        LogUtil.a(TAG, "setFastingLitePlan isSuccess = ", Boolean.valueOf(userPreference));
        if (userPreference && DeviceUtil.b()) {
            vgx.d().b("H5_modify", null);
        }
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "setFastingLitePlan fastingLiteCallback is null");
        } else if (userPreference) {
            fastingLiteCbk.onSuccess(0);
        } else {
            fastingLiteCbk.onFailure(-1, "setFastingLitePlan unknown");
        }
    }

    @H5ProMethod(name = "getFastingLitePlan")
    public static void getFastingLitePlan(FastingLiteCbk<vgp> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "getFastingLiteAppSetting callback is null");
        } else {
            fastingLiteCbk.onSuccess(vhn.b());
        }
    }

    @H5ProMethod(name = "addFastingLiteMode")
    public static void addFastingLiteMode(vhc vhcVar, FastingLiteCbk<Object> fastingLiteCbk) {
        updateFastingLiteMode(vhcVar, fastingLiteCbk);
    }

    @H5ProMethod(name = "getFastingLiteModes")
    public static void getFastingLiteModes(FastingLiteCbk<vhc[]> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "getFastingLiteModes callback is null");
            return;
        }
        vhc[] fastingModes = getFastingModes();
        if (fastingModes == null || fastingModes.length == 0) {
            LogUtil.j(TAG, "getFastingLiteModes modes is empty");
        }
        fastingLiteCbk.onSuccess(fastingModes);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    @H5ProMethod(name = "updateFastingLiteMode")
    public static void updateFastingLiteMode(vhc vhcVar, FastingLiteCbk<Object> fastingLiteCbk) {
        if (vhcVar == null) {
            LogUtil.e(TAG, "updateFastingLiteMode mode is null");
            return;
        }
        LogUtil.a(TAG, "updateFastingLiteMode mode:", vhcVar.toString());
        ArrayList arrayList = new ArrayList();
        vhc[] fastingModes = getFastingModes();
        if (njy.c(fastingModes, 0)) {
            boolean z = false;
            for (int i = 0; i < fastingModes.length; i++) {
                vhc vhcVar2 = fastingModes[i];
                if (vhcVar2 != null && vhcVar2.a() == vhcVar.a()) {
                    fastingModes[i] = vhcVar;
                    z = true;
                }
            }
            arrayList.addAll(Arrays.asList(fastingModes));
            if (!z) {
                arrayList.add(vhcVar);
            }
        } else {
            arrayList.add(vhcVar);
        }
        HiUserPreference hiUserPreference = new HiUserPreference();
        hiUserPreference.setKey("custom.weight_fasting_mode");
        hiUserPreference.setValue(new Gson().toJson(arrayList));
        boolean userPreference = HiHealthManager.d(BaseApplication.getContext()).setUserPreference(hiUserPreference);
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "updateFastingLiteMode fastingLiteCallback is null");
        } else if (userPreference) {
            fastingLiteCbk.onSuccess(0);
        } else {
            fastingLiteCbk.onFailure(-1, "addFastingLiteMode unknow error");
        }
    }

    @H5ProMethod(name = "getFastingLiteTasks")
    public static void getFastingLiteTasks(final FastingLiteCbk<vhj[]> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "getFastingLiteTasks fastingLiteCallback is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository.3
                @Override // java.lang.Runnable
                public void run() {
                    FastingLiteRepository.getFastingLiteTasks(fastingLiteCbk, true);
                }
            });
        }
    }

    public static void getFastingLiteTasks(final FastingLiteCbk<vhj[]> fastingLiteCbk, final boolean z) {
        int[] iArr = {DicDataTypeUtil.DataType.LIGHT_FASTING.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime(0L);
        hiDataReadOption.setEndTime(System.currentTimeMillis());
        vhn.e(hiDataReadOption, new FastingLiteCbk<List<vhj>>() { // from class: com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository.1
            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            public void onFailure(int i, String str) {
            }

            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<vhj> list) {
                if (!njy.e(list) && list.get(0).b() <= 0) {
                    list.remove(0);
                }
                if (z) {
                    FastingLiteRepository.readFastingLitePhaseForRecord(list);
                }
                uxb.c().a(list);
                int size = list.size();
                LogUtil.a(FastingLiteRepository.TAG, "record num ", Integer.valueOf(size), ", data ", list.toString());
                vhj[] vhjVarArr = new vhj[list.size()];
                Iterator<vhj> it = list.iterator();
                while (it.hasNext()) {
                    it.next().f();
                }
                fastingLiteCbk.onSuccess((vhj[]) list.toArray(vhjVarArr));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void readFastingLitePhaseForRecord(List<vhj> list) {
        if (njy.e(list)) {
            LogUtil.j(TAG, "readFastingLitePhaseForRecord records is empty");
            return;
        }
        final ArrayList<vhj> arrayList = new ArrayList();
        for (vhj vhjVar : list) {
            if (njy.e(vhjVar.d())) {
                arrayList.add(vhjVar);
            }
        }
        if (njy.e(arrayList)) {
            LogUtil.j(TAG, "readFastingLitePhaseForRecord newRecords is empty");
            return;
        }
        long jC = ((vhj) arrayList.get(arrayList.size() - 1)).c();
        long jB = ((vhj) arrayList.get(0)).b();
        for (vhj vhjVar2 : arrayList) {
            if (vhjVar2.b() > jB) {
                jB = vhjVar2.b();
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis > jB) {
            jB = jCurrentTimeMillis;
        }
        LogUtil.a(TAG, "minStartTime is :", Long.valueOf(jC), "maxEndTime is :", Long.valueOf(jB));
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        vhn.e(jC, jB, false, new FastingLiteCbk<List<vhm.e>>() { // from class: com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository.4
            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onSuccess(List<vhm.e> list2) {
                FastingLiteRepository.fillPhasesToRecord(arrayList, list2);
                countDownLatch.countDown();
            }

            @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
            public void onFailure(int i, String str) {
                LogUtil.e(FastingLiteRepository.TAG, "readFastingLitePhase onFailure, ", str);
                countDownLatch.countDown();
            }
        });
        try {
            LogUtil.a(TAG, "countDownLatch await result isReached:", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            LogUtil.e(TAG, "interrupted while waiting for records data");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void fillPhasesToRecord(List<vhj> list, List<vhm.e> list2) {
        if (njy.e(list) || njy.e(list2)) {
            LogUtil.j(TAG, "fillPhasesToRecord records is empty or windows is empty");
            return;
        }
        HashMap map = new HashMap();
        for (vhm.e eVar : list2) {
            ArrayList arrayList = map.containsKey(Long.valueOf(eVar.c())) ? (ArrayList) map.get(Long.valueOf(eVar.c())) : null;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                map.put(Long.valueOf(eVar.c()), arrayList2);
                arrayList2.add(eVar);
            } else if (judgeValidWindow(arrayList, eVar)) {
                arrayList.add(eVar);
            } else {
                LogUtil.j(TAG, "fillPhasesToRecord currentWindow is invalid");
            }
        }
        for (vhj vhjVar : list) {
            if (map.containsKey(Long.valueOf(vhjVar.c()))) {
                vhjVar.c((List<vhm.e>) map.get(Long.valueOf(vhjVar.c())));
            } else {
                LogUtil.j(TAG, "fillPhasesToRecord windows is empty");
            }
        }
    }

    private static boolean judgeValidWindow(ArrayList<vhm.e> arrayList, vhm.e eVar) {
        return njy.e(arrayList) || arrayList.get(arrayList.size() - 1).e() <= eVar.f();
    }

    @H5ProMethod(name = "attachNoteForFastingLiteTask")
    public static void attachNoteForFastingLiteTask(long j, String str, FastingLiteCbk<Object> fastingLiteCbk) {
        if (fastingLiteCbk == null) {
            LogUtil.j(TAG, "attachNoteForFastingLiteTask callback is null", Long.valueOf(j));
            return;
        }
        LogUtil.a(TAG, "attachNoteForFastingLiteTask startTime ", Long.valueOf(j), " note ", str);
        vhm vhmVarA = uxb.c().a();
        if (vhmVarA != null && Math.abs((vhmVarA.o() / 1000) - j) < 2) {
            LogUtil.j(TAG, "attachNoteForFastingLiteTask to current task");
            uxb.c().b(str);
            return;
        }
        int[] iArr = {DicDataTypeUtil.DataType.LIGHT_FASTING.value()};
        HiDataReadOption hiDataReadOption = new HiDataReadOption();
        hiDataReadOption.setType(iArr);
        hiDataReadOption.setSortOrder(1);
        hiDataReadOption.setStartTime((j - 2) * 1000);
        hiDataReadOption.setEndTime((j + 2) * 1000);
        hiDataReadOption.setCount(1);
        vhn.e(hiDataReadOption, new AnonymousClass5(fastingLiteCbk, str));
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository$5, reason: invalid class name */
    public class AnonymousClass5 implements FastingLiteCbk<List<vhj>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f28226c;
        final /* synthetic */ FastingLiteCbk d;

        @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
        public void onFailure(int i, String str) {
        }

        AnonymousClass5(FastingLiteCbk fastingLiteCbk, String str) {
            this.d = fastingLiteCbk;
            this.f28226c = str;
        }

        @Override // com.huawei.ui.main.stories.health.weight.callback.FastingLiteCbk
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void onSuccess(List<vhj> list) {
            if (njy.e(list)) {
                this.d.onFailure(-1, "records is empty");
                return;
            }
            vhj vhjVar = list.get(0);
            vhjVar.c(this.f28226c);
            final FastingLiteCbk fastingLiteCbk = this.d;
            FastingLiteRepository.saveFastingLiteRecord(vhjVar, new IBaseResponseCallback() { // from class: vgv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    FastingLiteRepository.AnonymousClass5.c(fastingLiteCbk, i, obj);
                }
            });
        }

        public static /* synthetic */ void c(FastingLiteCbk fastingLiteCbk, int i, Object obj) {
            if (i == 0) {
                fastingLiteCbk.onSuccess(new Object());
            } else {
                LogUtil.j(FastingLiteRepository.TAG, "save record fail");
                fastingLiteCbk.onFailure(-1, "save record fail");
            }
        }
    }

    public static void saveFastingLiteRecord(vhj vhjVar, final IBaseResponseCallback iBaseResponseCallback) {
        if (vhjVar == null) {
            LogUtil.j(TAG, "saveFastingLiteTask is null");
            if (iBaseResponseCallback != null) {
                iBaseResponseCallback.a(-1, "record is null");
                return;
            }
            return;
        }
        HiHealthData hiHealthData = new HiHealthData();
        hiHealthData.setType(DicDataTypeUtil.DataType.LIGHT_FASTING_SET.value());
        hiHealthData.setStartTime(vhjVar.c());
        hiHealthData.setEndTime(vhjVar.b());
        HashMap map = new HashMap();
        map.put(Integer.valueOf(DicDataTypeUtil.DataType.LIGHT_FASTING.value()), Double.valueOf(vhjVar.b() - vhjVar.c()));
        hiHealthData.setFieldsValue(HiJsonUtil.d(map));
        HashMap map2 = new HashMap();
        map2.put(Integer.valueOf(DicDataTypeUtil.DataType.LIGHT_FASTING.value()), new Gson().toJson(vhjVar));
        hiHealthData.setFieldsMetaData(HiJsonUtil.d(map2));
        hiHealthData.setDeviceUuid("-1");
        HiDataInsertOption hiDataInsertOption = new HiDataInsertOption();
        hiDataInsertOption.addData(hiHealthData);
        HiHealthNativeApi.a(com.huawei.haf.application.BaseApplication.b()).insertHiHealthData(hiDataInsertOption, new HiDataOperateListener() { // from class: vgs
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                FastingLiteRepository.lambda$saveFastingLiteRecord$0(iBaseResponseCallback, i, obj);
            }
        });
    }

    public static /* synthetic */ void lambda$saveFastingLiteRecord$0(IBaseResponseCallback iBaseResponseCallback, int i, Object obj) {
        LogUtil.a(TAG, "insert task record ", Integer.valueOf(i));
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, obj);
        }
    }

    public static void saveCurrentTask(vhm vhmVar) {
        saveCurrentTask(vhmVar, null);
    }

    public static void saveCurrentTask(final vhm vhmVar, final FastingLiteCbk<Object> fastingLiteCbk) {
        if (vhmVar == null) {
            LogUtil.j(TAG, "can not save empty taskJson");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vgr
                @Override // java.lang.Runnable
                public final void run() {
                    FastingLiteRepository.saveCurrentTask(vhmVar, fastingLiteCbk);
                }
            });
        } else {
            vhn.b(vhmVar.a());
            vhn.c(vhmVar, new IBaseResponseCallback() { // from class: vgq
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    FastingLiteRepository.lambda$saveCurrentTask$2(fastingLiteCbk, i, obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$saveCurrentTask$2(FastingLiteCbk fastingLiteCbk, int i, Object obj) {
        LogUtil.a(TAG, "saveFastingLitePhaseList errorCode= ", Integer.valueOf(i));
        if (fastingLiteCbk != null) {
            ReleaseLogUtil.d(RELEASE_TAG, "saveCurrentTask called by H5, cbk is not null");
            fastingLiteCbk.onSuccess(0);
        }
    }

    private static vhc[] getFastingModes() {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.getContext()).getUserPreference("custom.weight_fasting_mode");
        vhc[] vhcVarArr = new vhc[0];
        if (userPreference != null && !TextUtils.isEmpty(userPreference.getValue())) {
            try {
                vhc[] vhcVarArr2 = (vhc[]) HiJsonUtil.d(userPreference.getValue(), vhc[].class);
                try {
                    Arrays.sort(vhcVarArr2, Comparator.comparingInt(new ToIntFunction() { // from class: vgn
                        @Override // java.util.function.ToIntFunction
                        public final int applyAsInt(Object obj) {
                            return ((vhc) obj).a();
                        }
                    }));
                    return vhcVarArr2;
                } catch (JsonParseException unused) {
                    vhcVarArr = vhcVarArr2;
                    LogUtil.e(TAG, "get fasting lite mode fail");
                    return vhcVarArr;
                }
            } catch (JsonParseException unused2) {
            }
        }
        return vhcVarArr;
    }

    @H5ProMethod(name = "isCanChangeToNextState")
    public static void isCanChangeToNextState(FastingLiteCbk<Object> fastingLiteCbk) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter isCanChangeToNextState");
        fastingLiteCbk.onSuccess(Boolean.valueOf(uxb.c().b()));
    }

    @H5ProMethod(name = "resetCurrentStartTimeAndPost")
    public static void resetCurrentStartTimeAndPost(long j, FastingLiteCbk<Object> fastingLiteCbk) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter resetCurrentStartTimeAndPost");
        uxb.c().c(j);
        fastingLiteCbk.onSuccess(0);
    }

    @H5ProMethod(name = "changeToNextState")
    public static void changeToNextState(FastingLiteCbk<Object> fastingLiteCbk) {
        ReleaseLogUtil.d(RELEASE_TAG, "enter changeToNextState");
        uxb.c().b(fastingLiteCbk);
    }

    @H5ProMethod(name = "getCurrentFastingLiteTask")
    public static void getCurrentFastingLiteTask(final FastingLiteCbk<Object> fastingLiteCbk) {
        ReleaseLogUtil.d(RELEASE_TAG, "getCurrentFastingLiteTask");
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository.2
            @Override // java.lang.Runnable
            public void run() {
                FastingLiteRepository.getCurrentStatusAndTask(fastingLiteCbk);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void getCurrentStatusAndTask(FastingLiteCbk<Object> fastingLiteCbk) {
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        if (weightApi == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "weightApi is null");
            fastingLiteCbk.onFailure(-1, "weightApi is null");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        String fastingLiteStatus = weightApi.getFastingLiteStatus();
        try {
            jSONObject.put("status", fastingLiteStatus);
            ReleaseLogUtil.d(RELEASE_TAG, "getFastingLiteStatus: ", fastingLiteStatus);
            if ("0".equals(fastingLiteStatus) || "1".equals(fastingLiteStatus)) {
                ReleaseLogUtil.d(RELEASE_TAG, "fastingLite not join or version error");
                jSONObject.put(FASTING_LITE_CURRENT_TASK_KAY, (Object) null);
            } else {
                vhm vhmVarA = uxb.c().a();
                if (vhmVarA != null) {
                    uxb.c().j();
                    vhmVarA = uxb.c().a();
                }
                LogUtil.a(TAG, "after update: ", vhmVarA);
                jSONObject.put(FASTING_LITE_CURRENT_TASK_KAY, HiJsonUtil.d(vhmVarA));
            }
            fastingLiteCbk.onSuccess(jSONObject);
        } catch (JSONException e) {
            ReleaseLogUtil.e(RELEASE_TAG, "JSONException: ", ExceptionUtils.c(e));
            fastingLiteCbk.onFailure(-1, "catch JSONException");
        }
    }

    @H5ProMethod(name = "getPreStartTime")
    public static void getPreStartTime(FastingLiteCbk<Object> fastingLiteCbk) {
        ReleaseLogUtil.d(RELEASE_TAG, "getPreStartTime");
        uxf uxfVarH = uxb.c().h();
        if (uxfVarH == null) {
            ReleaseLogUtil.e(RELEASE_TAG, "FastingLiteViewBean is null");
            fastingLiteCbk.onFailure(-1, "FastingLiteViewBean is null");
        } else {
            fastingLiteCbk.onSuccess(Long.valueOf(uxfVarH.b()));
        }
    }
}
