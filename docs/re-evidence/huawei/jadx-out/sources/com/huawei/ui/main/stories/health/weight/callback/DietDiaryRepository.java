package com.huawei.ui.main.stories.health.weight.callback;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.reflect.TypeToken;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.fatscale.multiusers.WeightDataManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.h5pro.service.anotation.H5ProMethod;
import com.huawei.health.h5pro.service.anotation.H5ProService;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiGoalInfo;
import com.huawei.hihealth.HiUserPreference;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hihealth.dictionary.utils.DicDataTypeUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.utils.DateFormatUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository;
import defpackage.ddv;
import defpackage.ddx;
import defpackage.dnj;
import defpackage.ivd;
import defpackage.lsl;
import defpackage.njy;
import defpackage.nkf;
import defpackage.nlx;
import defpackage.nsr;
import defpackage.nsv;
import defpackage.oru;
import defpackage.vei;
import defpackage.vgo;
import defpackage.vgt;
import defpackage.vgw;
import defpackage.vil;
import defpackage.vng;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@H5ProService(name = "DietDiary", users = {"9ea3f06fe2dea3e2c7c21ea1ba1e07c370a786c68417a4a96cb986576883e10f"})
public class DietDiaryRepository {
    private static final String TAG = "DietDiaryRepository";
    private static final String TAG_RELEASE = "R_DietDiaryRepository";
    public static final int WEIGHT_DIFF_TO_CALORIE = 7700;
    public static final double WEIGHT_DOUBLE_DIFF_TO_CALORIE = 7.7d;

    private DietDiaryRepository() {
    }

    @H5ProMethod(name = "joinDietDiary")
    public static void joinDietDiary() {
        LogUtil.a(TAG, "joinDietDiary from H5");
        ThreadPoolManager.c().execute(new Runnable() { // from class: vgi
            @Override // java.lang.Runnable
            public final void run() {
                DietDiaryRepository.lambda$joinDietDiary$0();
            }
        });
    }

    public static /* synthetic */ void lambda$joinDietDiary$0() {
        if (CardConstants.e()) {
            return;
        }
        CardConstants.a();
    }

    @H5ProMethod(name = "getWeightControlSetting")
    public static void getWeightControlSetting(DietDiaryCbk<vgt> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWeightControlSetting callback is null");
            return;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(2);
        final vgt vgtVar = new vgt();
        nkf.a().a(new ResponseCallback() { // from class: vgk
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                DietDiaryRepository.lambda$getWeightControlSetting$1(vgtVar, countDownLatch, i, (Float) obj);
            }
        });
        nkf.a().d(new ResponseCallback() { // from class: vgl
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                DietDiaryRepository.lambda$getWeightControlSetting$3(vgtVar, countDownLatch, i, (Pair) obj);
            }
        });
        try {
            ReleaseLogUtil.c(TAG_RELEASE, "getWeightControlSetting isAwait ", Boolean.valueOf(countDownLatch.await(5L, TimeUnit.SECONDS)));
        } catch (InterruptedException e) {
            ReleaseLogUtil.b(TAG_RELEASE, "getWeightControlSetting exception ", ExceptionUtils.c(e));
        }
        LogUtil.a(TAG, "getWeightControlSetting ", vgtVar);
        dietDiaryCbk.onSuccess(vgtVar);
    }

    public static /* synthetic */ void lambda$getWeightControlSetting$1(vgt vgtVar, CountDownLatch countDownLatch, int i, Float f) {
        LogUtil.a(TAG, "getWeightControlSetting onResponse floatData ", f);
        if (f != null) {
            vgtVar.b(f.floatValue());
        }
        countDownLatch.countDown();
    }

    public static /* synthetic */ void lambda$getWeightControlSetting$3(final vgt vgtVar, final CountDownLatch countDownLatch, int i, Pair pair) {
        if (pair != null && pair.second != null && ((ivd) pair.second).c() > 0.0f) {
            vgtVar.c(((ivd) pair.second).c());
            countDownLatch.countDown();
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vgf
                @Override // java.lang.Runnable
                public final void run() {
                    DietDiaryRepository.lambda$getWeightControlSetting$2(vgtVar, countDownLatch);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$getWeightControlSetting$2(vgt vgtVar, CountDownLatch countDownLatch) {
        HiUserPreference userPreference = HiHealthManager.d(BaseApplication.b()).getUserPreference("custom.start_weight_base");
        if (userPreference == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "getWeightControlSetting preference is null");
        } else {
            String value = userPreference.getValue();
            LogUtil.a(TAG, "getWeightControlSetting value ", value);
            vgtVar.c(CommonUtil.f(value));
        }
        countDownLatch.countDown();
    }

    public static void getDietRecordLocal(final long j, final long j2, final DietDiaryCbk<vgo[]> dietDiaryCbk) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vgj
                @Override // java.lang.Runnable
                public final void run() {
                    DietDiaryRepository.getDietRecord(j / 1000, j2 / 1000, dietDiaryCbk);
                }
            });
        } else {
            getDietRecord(j / 1000, j2 / 1000, dietDiaryCbk);
        }
    }

    @H5ProMethod(name = "getDietRecord")
    public static void getDietRecord(long j, long j2, final DietDiaryCbk<vgo[]> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "callback is null startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2));
            return;
        }
        int iA = DateFormatUtil.a(j * 1000);
        int iA2 = DateFormatUtil.a(1000 * j2);
        ReleaseLogUtil.c(TAG_RELEASE, "getDietRecord startTime ", Long.valueOf(j), " endTime ", Long.valueOf(j2), " startDate ", Integer.valueOf(iA), " endDate ", Integer.valueOf(iA2));
        vil.d(iA, iA2, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: vgm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                DietDiaryRepository.lambda$getDietRecord$5(dietDiaryCbk, i, (List) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$getDietRecord$5(DietDiaryCbk dietDiaryCbk, int i, List list) {
        vgo[] vgoVarArr = new vgo[0];
        new ArrayList();
        try {
            String strD = HiJsonUtil.d(list);
            List<vgo> list2 = (List) HiJsonUtil.d(strD, new TypeToken<List<vgo>>() { // from class: com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository.1
            }.getType());
            if (njy.e(list2)) {
                ReleaseLogUtil.d(TAG_RELEASE, "getDietRecord errorCode ", Integer.valueOf(i), " list ", list, " json ", strD, " resultList ", list2);
                dietDiaryCbk.onSuccess(vgoVarArr);
                return;
            }
            for (vgo vgoVar : list2) {
                if (vgoVar != null) {
                    vgoVar.a(lsl.d(DateFormatUtil.d(vgoVar.c()), TimeZone.getDefault()));
                    vgoVar.j();
                }
            }
            LogUtil.a(TAG, "getDietRecord errorCode ", Integer.valueOf(i), " list ", list, " json ", strD, " resultList ", list2);
            dietDiaryCbk.onSuccess((vgo[]) list2.toArray(vgoVarArr));
        } catch (NullPointerException e) {
            LogUtil.e(TAG, "getDietRecord exception ", LogAnonymous.b(e));
            dietDiaryCbk.onSuccess(vgoVarArr);
        }
    }

    @H5ProMethod(name = "addMeal")
    public static void addMeal(vgw vgwVar, final DietDiaryCbk<Object> dietDiaryCbk) {
        if (vgwVar == null) {
            if (dietDiaryCbk != null) {
                dietDiaryCbk.onFailure(-1, "addMeal meal is null");
            }
        } else {
            vgwVar.l();
            LogUtil.a(TAG, "addMeal meal ", vgwVar);
            vil.c(vgwVar, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vgg
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    DietDiaryRepository.lambda$addMeal$6(dietDiaryCbk, i, (vgo) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$addMeal$6(DietDiaryCbk dietDiaryCbk, int i, vgo vgoVar) {
        if (dietDiaryCbk == null) {
            return;
        }
        if (i != 0) {
            dietDiaryCbk.onFailure(i, HiJsonUtil.d(vgoVar));
        } else {
            dietDiaryCbk.onSuccess(vgoVar);
        }
    }

    @H5ProMethod(name = "updateMeal")
    public static void updateMeal(vgw vgwVar, final DietDiaryCbk<Object> dietDiaryCbk) {
        if (vgwVar == null) {
            if (dietDiaryCbk != null) {
                dietDiaryCbk.onFailure(-1, "updateMeal meal is null");
            }
        } else {
            vgwVar.l();
            LogUtil.a(TAG, "updateMeal meal ", vgwVar);
            vil.b(vgwVar, (ResponseCallback<vgo>) new ResponseCallback() { // from class: vgh
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    DietDiaryRepository.lambda$updateMeal$7(dietDiaryCbk, i, (vgo) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$updateMeal$7(DietDiaryCbk dietDiaryCbk, int i, vgo vgoVar) {
        if (dietDiaryCbk == null) {
            return;
        }
        if (i != 0) {
            dietDiaryCbk.onFailure(i, HiJsonUtil.d(vgoVar));
        } else {
            dietDiaryCbk.onSuccess(vgoVar);
        }
    }

    @H5ProMethod(name = "updateOnePointFull")
    public static void updateOnePointFull() {
        ReleaseLogUtil.c(TAG_RELEASE, "updateOnePointFull");
        vil.l();
    }

    @H5ProMethod(name = "syncDietData")
    public static void syncDietData() {
        ReleaseLogUtil.c(TAG_RELEASE, "syncDietData");
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.DIET_RECORD_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.RESTING_METABOLISM_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.CURRENT_BASAL_METABOLISM_SET.value()));
        arrayList.add(Integer.valueOf(DicDataTypeUtil.DataType.BASAL_METABOLISM_AFTER_EXERCISE_SET.value()));
        arrayList.add(10008);
        vil.b(arrayList);
    }

    @H5ProMethod(name = "getBaseUrl")
    public static void getBaseUrl(DietDiaryCbk<String> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            LogUtil.e(TAG, "callback is null");
            return;
        }
        String url = GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl");
        if (!TextUtils.isEmpty(url)) {
            LogUtil.a(TAG, "url is:", url);
            dietDiaryCbk.onSuccess(url);
        } else {
            dietDiaryCbk.onFailure(-1, "url is null");
        }
    }

    public static void jumpDietDetails(Context context, String str) {
        String string;
        if (context == null) {
            ReleaseLogUtil.d(TAG_RELEASE, "jumpDietDetails context is null");
            return;
        }
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        if (TextUtils.isEmpty(str)) {
            string = "#/diet_recording_tool?from=2";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str.contains("&") ? "&" : "?");
            sb.append("from=2");
            string = sb.toString();
        }
        LogUtil.a(TAG, "jumpDietDetails newUri ", string, " uri ", str);
        builder.addPath(string);
        ddv.b().loadH5ProApp(context, ddx.e, builder);
        joinDietDiary();
    }

    public static void saveWeightGoalAsync(final WeightTargetDifferences weightTargetDifferences, final boolean z, final float f, final HiGoalInfo hiGoalInfo, final float f2, final IBaseResponseCallback iBaseResponseCallback) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vgd
                @Override // java.lang.Runnable
                public final void run() {
                    DietDiaryRepository.saveWeightGoalAsync(weightTargetDifferences, z, f, hiGoalInfo, f2, iBaseResponseCallback);
                }
            });
            return;
        }
        if (!vng.a(weightTargetDifferences)) {
            LogUtil.j(TAG, "saveWeightGoal setUserPreference dailyWeightDiff is fail");
            return;
        }
        ArrayList arrayList = new ArrayList(31);
        arrayList.add(hiGoalInfo);
        HiHealthManager.d(BaseApplication.b()).setGoalInfo(0, arrayList, new HiCommonListener() { // from class: com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository.3
            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onSuccess(int i, Object obj) {
                DietDiaryRepository.successRefreshData(weightTargetDifferences.c() / 1000.0d, f, hiGoalInfo, obj, f2, iBaseResponseCallback);
            }

            @Override // com.huawei.hihealth.data.listener.HiCommonListener
            public void onFailure(int i, Object obj) {
                LogUtil.j(DietDiaryRepository.TAG, "saveGoals onFailure");
                iBaseResponseCallback.a(100001, obj);
            }
        });
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            float goalValue = (float) hiGoalInfo.getGoalValue();
            nlx.e(goalValue, jCurrentTimeMillis, (ResponseCallback<Double>) null);
            vei.e(jCurrentTimeMillis, goalValue, f2, weightTargetDifferences, "", new ResponseCallback() { // from class: vge
                @Override // com.huawei.hwbasemgr.ResponseCallback
                public final void onResponse(int i, Object obj) {
                    LogUtil.a(DietDiaryRepository.TAG, "saveWeightGoalAsync weightManager status ", Integer.valueOf(i), " data ", (Pair) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void successRefreshData(double d, float f, HiGoalInfo hiGoalInfo, Object obj, float f2, IBaseResponseCallback iBaseResponseCallback) {
        oru.a(BaseApplication.b()).c(BaseApplication.b(), String.valueOf(1200), new HashMap());
        boolean z = Math.abs(((double) f) - hiGoalInfo.getGoalValue()) < 0.5d;
        LogUtil.a(TAG, "isGoalChanged=", Boolean.valueOf(z), ",daily gaol=", Double.valueOf(d));
        if (!z) {
            nsv.e(BaseApplication.b()).d(20000);
            SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10006), "health_weight_goal_change", String.valueOf(true), null);
        }
        dnj mainUser = MultiUsersManager.INSTANCE.getMainUser();
        if (f2 > 0.0f) {
            nsr.b(BaseApplication.b()).a(BaseApplication.b(), hiGoalInfo.getGoalValue());
            HiUserPreference hiUserPreference = new HiUserPreference();
            hiUserPreference.setKey("custom.start_weight_base");
            hiUserPreference.setValue(String.valueOf(f2));
            HiHealthManager.d(BaseApplication.b()).setUserPreference(hiUserPreference);
            mainUser.a(f2);
        }
        mainUser.c((float) hiGoalInfo.getGoalValue());
        WeightDataManager.INSTANCE.setInitFlag(true);
        CommonUtil.am(BaseApplication.b());
        LogUtil.a(TAG, "data =", obj);
        iBaseResponseCallback.a(0, obj);
    }

    @H5ProMethod(name = "gotoUserInfo")
    public static void gotoUserInfo() {
        AppRouter.c("/HWUserProfileMgr/UserInfoActivity").d(268435456).b(BaseApplication.b());
    }

    @H5ProMethod(name = "getCommonApi")
    public static void getCommonApi(DietDiaryCbk<Object> dietDiaryCbk) {
        if (dietDiaryCbk == null) {
            LogUtil.j(TAG, "getCommonApi callback is null");
            return;
        }
        HashMap map = new HashMap();
        map.put("isSupportTimeZone", true);
        map.put("isSupportScans", true);
        map.put("isNewTargetUI", true);
        map.put("isSupportQuickRecord", true);
        map.put("isNewKaka", true);
        map.put("isSupportActivityResult", true);
        map.put("isSupportShowTradeView", true);
        String strD = HiJsonUtil.d(map);
        LogUtil.a(TAG, "getCommonApi json", strD);
        dietDiaryCbk.onSuccess(strD);
    }
}
