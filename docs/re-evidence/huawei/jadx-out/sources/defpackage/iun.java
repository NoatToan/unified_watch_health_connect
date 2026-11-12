package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.reflect.TypeToken;
import com.huawei.basefitnessadvice.callback.UiCallback;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.router.AppRouter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.health.weight.WeightApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiSampleConfig;
import com.huawei.hihealth.data.listener.HiDataOperateListener;
import com.huawei.hihealth.data.listener.HiDataReadResultListener;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.ble.BleConstants;
import com.huawei.pluginhealthzone.interactors.HealthZonePushReceiver;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import com.huawei.up.model.UserInfomation;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class iun {
    private static WeightApi j() {
        return (WeightApi) Services.d("Main", WeightApi.class);
    }

    public static HiAggregateOption c(String str) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setType(new int[]{10006});
        hiAggregateOption.setFilter(d(str));
        hiAggregateOption.setConstantsKey(new String[]{BleConstants.WEIGHT_KEY});
        return hiAggregateOption;
    }

    public static String d(String str) {
        return (TextUtils.isEmpty(str) || TextUtils.equals(str, "NULL") || TextUtils.equals(str, LoginInit.getInstance(BaseApplication.b()).getAccountInfo(1011))) ? "NULL" : str;
    }

    public static void d(String str, Bundle bundle) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "goToWeight weightApi is null from ", str, " bundle ", bundle);
        } else {
            weightApiJ.gotoWeight(str, bundle);
        }
    }

    public static void d(String str, Intent intent) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "goToWeight weightApi is null from ", str, " intent ", intent);
        } else {
            weightApiJ.gotoWeight(str, intent);
        }
    }

    public static void d(Map<String, Object> map) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "goToWeightDataPage weightApi is null timeMillis, params:", String.valueOf(map));
        } else {
            weightApiJ.goToWeightDataPage(map);
        }
    }

    public static void c(Context context) {
        H5ProLaunchOption.Builder statusBarTextBlack = new H5ProLaunchOption.Builder().setImmerse().showStatusBar().setStatusBarTextBlack(true);
        statusBarTextBlack.addPath("#/ManualInput");
        ddv.b().loadH5ProApp(context, "com.huawei.health.h5.weight", statusBarTextBlack);
    }

    public static void c(IBaseResponseCallback iBaseResponseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "initUser weightApi is null callback ", iBaseResponseCallback);
        } else {
            weightApiJ.initUser(iBaseResponseCallback);
        }
    }

    public static void j(String str) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "setCurrentUser weightApi is null userId ", str);
        } else {
            weightApiJ.setCurrentUser(str);
        }
    }

    public static void e(ResponseCallback<Double> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("WeightUtils", "getTargetWeight callback is null");
            return;
        }
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            LogUtil.j("WeightUtils", "getTargetWeight weightApi is null");
            responseCallback.onResponse(-1, Double.valueOf(0.0d));
        } else {
            weightApiJ.getTargetWeight(responseCallback);
        }
    }

    public static void b(ResponseCallback<HashMap<String, Double>> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("WeightUtils", "getStartWeightAndTargetWeight callback is null");
            return;
        }
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            LogUtil.j("WeightUtils", "getStartWeightAndTargetWeight weightApi is null");
            responseCallback.onResponse(-1, new HashMap<>());
        } else {
            weightApiJ.getStartWeightAndTargetWeight(responseCallback);
        }
    }

    public static void a(ResponseCallback<WeightTargetDifferences> responseCallback) {
        if (responseCallback == null) {
            LogUtil.j("WeightUtils", "getWeightTargetDifferences callback is null");
            return;
        }
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            LogUtil.j("WeightUtils", "getWeightTargetDifferences weightApi is null");
            responseCallback.onResponse(-1, null);
        } else {
            weightApiJ.getWeightTargetDifferences(responseCallback);
        }
    }

    public static float a(long j, long j2) {
        HiAggregateOption hiAggregateOption = new HiAggregateOption();
        hiAggregateOption.setTimeRange(j, j2);
        hiAggregateOption.setAggregateType(4);
        hiAggregateOption.setGroupUnitType(0);
        hiAggregateOption.setCount(1);
        hiAggregateOption.setSortOrder(1);
        WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
        final float[] fArr = {0.0f};
        if (weightApi == null) {
            LogUtil.j("WeightUtils", "weightApi is null.");
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            weightApi.getWeightData(hiAggregateOption, new WeightCallback() { // from class: ium
                @Override // com.huawei.ui.main.stories.health.weight.callback.WeightCallback
                public final void getWeight(ArrayList arrayList) {
                    iun.e(fArr, countDownLatch, arrayList);
                }
            });
            try {
                if (!countDownLatch.await(5000L, TimeUnit.MILLISECONDS)) {
                    LogUtil.j("WeightUtils", "readWeight wait timeout");
                }
            } catch (InterruptedException unused) {
                LogUtil.e("WeightUtils", "interrupted while waiting for readWeight");
            }
        }
        return fArr[0];
    }

    static /* synthetic */ void e(float[] fArr, CountDownLatch countDownLatch, ArrayList arrayList) {
        if (njy.b(arrayList)) {
            float fD = (float) ((vfv) arrayList.get(0)).d();
            fArr[0] = fD;
            LogUtil.j("WeightUtils", "getWeightData is ", Float.valueOf(fD));
        } else {
            LogUtil.j("WeightUtils", "getWeightData is null");
        }
        countDownLatch.countDown();
    }

    public static float c() {
        UserInfomation userInfo;
        float fA = a(0L, System.currentTimeMillis());
        if (fA > 0.0f) {
            return fA;
        }
        LogUtil.a("WeightUtils", "get weight from userinfomation.");
        UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
        return (userProfileMgrApi == null || (userInfo = userProfileMgrApi.getUserInfo()) == null) ? fA : userInfo.getWeight();
    }

    public static void e(UiCallback<Float> uiCallback) {
        if (uiCallback == null) {
            LogUtil.j("WeightUtils", "getCurrentWeight uiCallback == null");
            return;
        }
        float fA = a(0L, System.currentTimeMillis());
        if (fA <= 0.0f) {
            LogUtil.a("WeightUtils", "get weight from userinfomation.");
            UserProfileMgrApi userProfileMgrApi = (UserProfileMgrApi) Services.d("HWUserProfileMgr", UserProfileMgrApi.class);
            if (userProfileMgrApi == null) {
                uiCallback.onFailure(-1, "userProfileMgrApi == null");
                return;
            }
            UserInfomation userInfo = userProfileMgrApi.getUserInfo();
            if (userInfo == null) {
                uiCallback.onFailure(-1, "userInfomation == null");
                return;
            }
            fA = userInfo.getWeight();
        }
        uiCallback.onSuccess(Float.valueOf(fA));
    }

    public static boolean d() {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            LogUtil.j("WeightUtils", "isSupportAiBodyShape weightApi is null");
            return false;
        }
        return weightApiJ.isSupportAiBodyShape();
    }

    public static String a(String str) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            LogUtil.j("WeightUtils", "getPeerAnalysis weightApi is null");
            return null;
        }
        return weightApiJ.getPeerAnalysis(str);
    }

    public static String e(String str) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            LogUtil.j("WeightUtils", "getTrunkFatRateGrades weightApi is null");
            return "";
        }
        return weightApiJ.getTrunkFatRateGrades(str);
    }

    public static String a() {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "getChildHeightUpdateTime weightApi is null");
            return "";
        }
        return weightApiJ.getChildHeightUpdateTime();
    }

    public static void e() {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "saveChildHeightUpdateTime weightApi is null");
        } else {
            weightApiJ.saveChildHeightUpdateTime();
        }
    }

    public static void b(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showUserInfoDialog weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showUserInfoDialog(context, responseCallback);
        }
    }

    public static void a(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showInputDialog weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showInputDialog(context, responseCallback);
        }
    }

    public static void c(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showAutoUpdateWeightDialog weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showAutoUpdateWeightDialog(context, responseCallback);
        }
    }

    public static void e(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showSetGoalDialog weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showSetGoalDialog(context, responseCallback);
        }
    }

    public static void d(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showBindDeviceDialog weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showBindDeviceDialog(context, responseCallback);
        }
    }

    public static void f(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showUserInfoDialogForMeasureStart weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showUserInfoDialogForMeasureStart(context, responseCallback);
        }
    }

    public static void j(Context context, ResponseCallback<Integer> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showUserInfoDialogForMeasureStart weightApi is null activity ", context, " callback ", responseCallback);
        } else {
            weightApiJ.showUserInfoDialogForMeasureFinish(context, responseCallback);
        }
    }

    public static void b(Context context, ResponseCallback<Integer> responseCallback, float f, int i, String str) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showGoalMotivationDialog weightApi is null activity ", context, " callback ", responseCallback, " bodyWeightDiff ", Float.valueOf(f), " progress ", Integer.valueOf(i), " json ", str);
        } else {
            weightApiJ.showGoalMotivationDialog(context, responseCallback, f, i, str);
        }
    }

    public static void g(ResponseCallback<WeightTargetDifferences> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "initGoalMotivationCache weightApi is null callback ", responseCallback);
        } else {
            weightApiJ.initGoalMotivationCache(responseCallback);
        }
    }

    public static void e(float f, long j, ResponseCallback<Object> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "autoUpdateUserWeight weightApi is null weight ", Float.valueOf(f), " measureTime ", Long.valueOf(j), " callback ", responseCallback);
        } else {
            weightApiJ.autoUpdateUserWeight(f, j, responseCallback);
        }
    }

    public static void g() {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "showBluetoothClaimDataDialog weightApi is null");
        } else {
            weightApiJ.showBluetoothClaimDataDialog();
        }
    }

    public static void b() {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("WeightUtils", "initCardRedDot weightApi is null");
        } else {
            weightApiJ.initCardRedDot();
        }
    }

    public static void e(ResponseCallback<Pair<Long, Object>> responseCallback, String str) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "saveWeightManager weightApi is null");
        } else {
            weightApiJ.saveWeightManagerAndGoal(responseCallback, str);
        }
    }

    public static void c(ResponseCallback<iuu> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getGoalDetail weightApi is null");
        } else {
            weightApiJ.getGoalDetail(responseCallback);
        }
    }

    public static void b(Bundle bundle, ResponseCallback<ivd> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "calculateGoal weightApi is null");
        } else {
            weightApiJ.calculateGoal(bundle, responseCallback);
        }
    }

    public static void e(ivd ivdVar, long j) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "saveWeightTargetDifferences weightApi is null");
        } else {
            weightApiJ.saveWeightTargetDifferences(ivdVar, j);
        }
    }

    public static void a(vgw vgwVar, ResponseCallback<vgo> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "addMeal weightApi is null meal ", vgwVar, " callback ", responseCallback);
        } else {
            weightApiJ.addMeal(vgwVar, responseCallback);
        }
    }

    public static void e(vgw vgwVar, ResponseCallback<vgo> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "updateMeal weightApi is null meal ", vgwVar, " callback ", responseCallback);
        } else {
            weightApiJ.updateMeal(vgwVar, responseCallback);
        }
    }

    public static void a(List<vgw> list, ResponseCallback<List<vgo>> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "updateMeal weightApi is null", " callback ", responseCallback);
        } else {
            weightApiJ.recordMeals(list, responseCallback);
        }
    }

    public static void i() {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "updateOnePointFullAndSaveWeightManager weightApi is null");
        } else {
            weightApiJ.updateOnePointFull();
        }
    }

    public static void c(int i, int i2, ResponseCallback<List<vgo>> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getDietRecord weightApi is null startDate ", Integer.valueOf(i), " endDate ", Integer.valueOf(i2), " callback ", responseCallback);
        } else {
            weightApiJ.getDietRecord(i, i2, responseCallback);
        }
    }

    public static void b(int i, int i2, long j, ResponseCallback<List<vgo>> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getDietRecord weightApi is null startDate ", Integer.valueOf(i), " endDate ", Integer.valueOf(i2), " timeout ", Long.valueOf(j), " callback ", responseCallback);
        } else {
            weightApiJ.getDietRecord(i, i2, j, responseCallback);
        }
    }

    public static void a(int i, int i2, ResponseCallback<List<vgo>> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getBasicDietRecord weightApi is null startDate ", Integer.valueOf(i), " endDate ", Integer.valueOf(i2), " callback ", responseCallback);
        } else {
            weightApiJ.getBasicDietRecord(i, i2, responseCallback);
        }
    }

    public static void c(int i, int i2, long j, ResponseCallback<List<vgo>> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getBasicDietRecord weightApi is null startDate ", Integer.valueOf(i), " endDate ", Integer.valueOf(i2), " timeout ", Long.valueOf(j), " callback ", responseCallback);
        } else {
            weightApiJ.getBasicDietRecord(i, i2, j, responseCallback);
        }
    }

    public static void e(boolean z, ResponseCallback<Boolean> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "isSupportDiet weightApi is null isFullDiet ", Boolean.valueOf(z), " callback ", responseCallback);
        } else {
            weightApiJ.isSupportDiet(z, responseCallback);
        }
    }

    public static void a(vgo vgoVar, ResponseCallback<eez> responseCallback) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getDeviceSyncDietAnalysis weightApi is null dietRecord ", vgoVar, " callback ", responseCallback);
        } else {
            weightApiJ.getDeviceSyncDietAnalysis(vgoVar, responseCallback);
        }
    }

    public static void i(String str) {
        String str2;
        ReleaseLogUtil.c("WeightUtils", "goToDietDiaryFastRecord pull from is ：", str);
        if (!Utils.o() || iuo.d("THIRD_DIET_TIME_MILLIS")) {
            LogUtil.a("WeightUtils", "goToDietDiaryFastRecord isSupport full Diet");
            str2 = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.diet-diary?h5pro=true&urlType=4&pName=com.huawei.health&path=record_breakfast&statusBarTextBlack&isImmerse&whichMeal=" + f();
        } else {
            LogUtil.a("WeightUtils", "goToDietDiaryFastRecord isSupport not full Diet");
            str2 = "huaweihealth://huaweihealth.app/openwith?address=com.huawei.health.h5.diet-diary?h5pro=true&isImmerse";
        }
        AppRouter.e(Uri.parse(str2)).e(268435456).b(com.huawei.hwcommonmodel.application.BaseApplication.getContext());
    }

    private static String f() {
        int i = Calendar.getInstance().get(11);
        if (i <= 9) {
            return "10";
        }
        if (i <= 13) {
            return HealthZonePushReceiver.DEAUTH_EVENT_NOTIFY;
        }
        return HealthZonePushReceiver.SLEEP_SCORE_NOTIFY;
    }

    public static void b(String str) {
        WeightApi weightApiJ = j();
        if (weightApiJ == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "checkFatReductionShapingState weightApi is null");
        } else {
            ReleaseLogUtil.c("WeightUtils", "checkFatReductionShapingState ：", str);
            weightApiJ.checkFatReductionShapingState();
        }
    }

    public static void d(final ResponseCallback<Pair<Long, List<iut>>> responseCallback) {
        if (responseCallback == null) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getSubUserInfo callback is null");
        } else {
            xkb.e("900100020", new HiDataReadResultListener() { // from class: iun.3
                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResult(Object obj, int i, int i2) {
                    if (!njy.b(obj, HiSampleConfig.class)) {
                        ReleaseLogUtil.d("R_Weight_WeightUtils", "getSubUserInfo object ", obj, " errorCode ", Integer.valueOf(i), " anchor ", Integer.valueOf(i2));
                        responseCallback.onResponse(i, null);
                        return;
                    }
                    List list = (List) obj;
                    if (njy.e(list)) {
                        ReleaseLogUtil.d("R_Weight_WeightUtils", "getSubUserInfo list ", list);
                        responseCallback.onResponse(i, null);
                        return;
                    }
                    HiSampleConfig hiSampleConfig = (HiSampleConfig) list.get(0);
                    if (hiSampleConfig == null) {
                        ReleaseLogUtil.d("R_Weight_WeightUtils", "getSubUserInfo hiSampleConfig is null");
                        responseCallback.onResponse(i, null);
                        return;
                    }
                    long modifiedTime = hiSampleConfig.getModifiedTime();
                    String configData = hiSampleConfig.getConfigData();
                    LogUtil.a("WeightUtils", "getSubUserInfo modifiedTime ", Long.valueOf(modifiedTime), " configData ", configData);
                    responseCallback.onResponse(i, new Pair(Long.valueOf(modifiedTime), (List) HiJsonUtil.d(configData, new TypeToken<List<iut>>() { // from class: com.huawei.health.weight.WeightUtils$1$1
                    }.getType())));
                }

                @Override // com.huawei.hihealth.data.listener.HiDataReadResultListener
                public void onResultIntent(int i, Object obj, int i2, int i3) {
                    LogUtil.a("WeightUtils", "getSubUserInfo intentType ", Integer.valueOf(i), " object ", obj, " errorCode ", Integer.valueOf(i2), " anchor ", Integer.valueOf(i3));
                }
            });
        }
    }

    public static void b(final String str, List<iut> list, long j) {
        boolean zE = lua.e();
        if (!zE || j <= 0) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "setSubUserInfo tag ", str, " isPullAllStatus ", Boolean.valueOf(zE), " modifiedTime ", Long.valueOf(j));
            return;
        }
        String strD = HiJsonUtil.d(list);
        LogUtil.a("WeightUtils", "setSubUserInfo tag ", str, " configData ", strD, " modifiedTime ", Long.valueOf(j));
        xkb.c("900100020", strD, j, new HiDataOperateListener() { // from class: iur
            @Override // com.huawei.hihealth.data.listener.HiDataOperateListener
            public final void onResult(int i, Object obj) {
                LogUtil.a("WeightUtils", "setSubUserInfo tag ", str, " errorCode ", Integer.valueOf(i), " object ", obj);
            }
        });
    }

    public static void e(final String str, final List<dnj> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "setSubUserInfo tag ", str, " list ", list);
            return;
        }
        Map<String, String> mapI = iuo.i();
        if (CollectionUtils.c(mapI)) {
            boolean zE = lua.e();
            ReleaseLogUtil.c("R_Weight_WeightUtils", "setSubUserInfo tag ", str, " isPullAllStatus ", Boolean.valueOf(zE), " map ", mapI);
            if (zE) {
                d((ResponseCallback<Pair<Long, List<iut>>>) new ResponseCallback() { // from class: iul
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        iun.e(str, list, i, (Pair) obj);
                    }
                });
            }
        }
    }

    static /* synthetic */ void e(final String str, final List list, int i, Pair pair) {
        final long jLongValue;
        if (pair == null) {
            jLongValue = System.currentTimeMillis();
            ThreadPoolManager.c().execute(new Runnable() { // from class: iuq
                @Override // java.lang.Runnable
                public final void run() {
                    iun.b(str, iun.b((List<dnj>) list), jLongValue);
                }
            });
        } else {
            jLongValue = ((Long) pair.first).longValue();
        }
        iuo.a(str, jLongValue, a((List<dnj>) list));
    }

    public static List<iut> b(List<dnj> list) {
        List<ius> listA = a(list);
        if (njy.e(listA)) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getSubUserInfoCacheList cacheList ", listA);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (ius iusVar : listA) {
            if (iusVar != null) {
                iut iutVar = new iut(iusVar.h(), iusVar.d(), iusVar.a(), iusVar.b());
                iutVar.c(iusVar.e());
                float fJ = iusVar.j();
                if (fJ > 0.0f) {
                    iutVar.c(fJ);
                }
                String strC = iusVar.c();
                if (!TextUtils.isEmpty(strC) && strC.contains("_")) {
                    iutVar.a(strC.substring(0, strC.indexOf("_")));
                } else {
                    LogUtil.j("WeightUtils", "getSubUserInfoList sid ", strC);
                }
                arrayList.add(iutVar);
            }
        }
        return arrayList;
    }

    public static List<ius> a(List<dnj> list) {
        if (njy.e(list)) {
            ReleaseLogUtil.d("R_Weight_WeightUtils", "getSubUserInfoCacheList list ", list);
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (dnj dnjVar : list) {
            if (dnjVar != null) {
                if (dnjVar.m() != 1) {
                    byte bD = dnjVar.d();
                    ius iusVar = new ius(dnjVar.i(), dnjVar.h(), String.valueOf(dnjVar.j()), bD != 0 ? bD != 1 ? bD : (byte) 0 : (byte) 1);
                    iusVar.c(dnjVar.e());
                    iusVar.c(dnjVar.r());
                    iusVar.d(dnjVar.l());
                    iusVar.a(dnjVar.g());
                    arrayList.add(iusVar);
                }
            }
        }
        LogUtil.a("WeightUtils", "getSubUserInfoCacheList list ", list, " cacheList ", arrayList);
        return arrayList;
    }

    public static void b(Context context, String str, Bundle bundle) {
        if (Utils.h()) {
            H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
            builder.addPath(str);
            LogUtil.a("WeightUtils", "open H5, path = ", str);
            ddv.b().loadH5ProApp(context, "com.huawei.health.h5.weight", builder);
            return;
        }
        if (bundle == null) {
            AppRouter.c("/Main/WeightGoalActivity").b(context);
        } else {
            AppRouter.c("/Main/WeightGoalActivity").d(bundle).b(context);
        }
    }
}
