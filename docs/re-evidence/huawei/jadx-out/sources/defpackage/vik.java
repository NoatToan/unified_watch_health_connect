package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.fatscale.multiusers.MultiUsersManager;
import com.huawei.health.device.wifi.control.claim.ClaimWeightDataManager;
import com.huawei.health.weight.WeightApi;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.hmf.annotation.Singleton;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.stories.health.model.weight.card.CardConstants;
import com.huawei.ui.main.stories.health.util.TrendFragmentCallback;
import com.huawei.ui.main.stories.health.weight.callback.CustomizationRecipe;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryCbk;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryRepository;
import com.huawei.ui.main.stories.health.weight.callback.FastingLiteRepository;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes43.dex */
@ApiDefine(uri = WeightApi.class)
@Singleton
public class vik implements WeightApi {
    @Override // com.huawei.health.weight.WeightApi
    public Class<?> getDietDiaryRepositoryApi() {
        return DietDiaryRepository.class;
    }

    @Override // com.huawei.health.weight.WeightApi
    public Class<?> getFastingLiteRepositoryApi() {
        return FastingLiteRepository.class;
    }

    @Override // com.huawei.health.weight.WeightApi
    public Class<?> getCustomRecipe() {
        return CustomizationRecipe.class;
    }

    @Override // com.huawei.health.weight.WeightApi
    public void syncDietData() {
        DietDiaryRepository.syncDietData();
    }

    @Override // com.huawei.health.weight.WeightApi
    public void addMeal(vgw vgwVar, ResponseCallback<vgo> responseCallback) {
        vil.c(vgwVar, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void updateMeal(vgw vgwVar, ResponseCallback<vgo> responseCallback) {
        vil.b(vgwVar, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void updateOnePointFull() {
        vil.l();
    }

    @Override // com.huawei.health.weight.WeightApi
    public void recordMeals(List<vgw> list, ResponseCallback<List<vgo>> responseCallback) {
        if (vil.i()) {
            vil.e(list, responseCallback);
        } else {
            vil.b(list, responseCallback);
        }
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getDietRecord(int i, int i2, ResponseCallback<List<vgo>> responseCallback) {
        vil.d(i, i2, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getDietRecord(int i, int i2, long j, ResponseCallback<List<vgo>> responseCallback) {
        vil.d(i, i2, j, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getBasicDietRecord(int i, int i2, ResponseCallback<List<vgo>> responseCallback) {
        vil.e(i, i2, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getBasicDietRecord(int i, int i2, long j, ResponseCallback<List<vgo>> responseCallback) {
        vil.e(i, i2, j, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void isSupportDiet(boolean z, ResponseCallback<Boolean> responseCallback) {
        vil.b(z, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getDeviceSyncDietAnalysis(vgo vgoVar, ResponseCallback<eez> responseCallback) {
        vil.b(vgoVar, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getWeightData(HiAggregateOption hiAggregateOption, final WeightCallback weightCallback) {
        vei.d(MultiUsersManager.INSTANCE.getCurrentUser(), hiAggregateOption, new TrendFragmentCallback() { // from class: vik.3
            @Override // com.huawei.ui.main.stories.health.util.TrendFragmentCallback
            public void getWeight(ArrayList<dnb> arrayList, boolean z) {
                weightCallback.getWeight(vei.e(arrayList));
            }
        });
    }

    @Override // com.huawei.health.weight.WeightApi
    public boolean isJoinDietDiary() {
        return CardConstants.e();
    }

    @Override // com.huawei.health.weight.WeightApi
    public void joinDietDiary() {
        CardConstants.a();
    }

    @Override // com.huawei.health.weight.WeightApi
    public int getWeightBondedProducts() {
        return vei.c("HDK_WEIGHT");
    }

    @Override // com.huawei.health.weight.WeightApi
    public double getBmiByHiHealthData(HiHealthData hiHealthData) {
        dnb dnbVar = new dnb();
        vng.b(hiHealthData, dnbVar, Utils.o(), (dnj) null);
        return dnbVar.f();
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getWeightControlSetting(DietDiaryCbk<vgt> dietDiaryCbk) {
        DietDiaryRepository.getWeightControlSetting(dietDiaryCbk);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void checkFatReductionShapingState() {
        vil.d();
    }

    @Override // com.huawei.health.weight.WeightApi
    public String getFastingLiteSetting() {
        return HiJsonUtil.d(vhn.d());
    }

    @Override // com.huawei.health.weight.WeightApi
    public String getFastingLiteStatus() {
        return CardConstants.c();
    }

    @Override // com.huawei.health.weight.WeightApi
    public String getFastingLiteViewData() {
        uxf uxfVarH = uxb.c().h();
        if (uxfVarH == null) {
            return "";
        }
        vhg vhgVar = new vhg();
        vhgVar.d(uxfVarH.d());
        vhgVar.d(uxfVarH.e());
        vhgVar.e(uxfVarH.a());
        LogUtil.d("WeightApiImpl", "getFastingLiteViewData faData = ", vhgVar.toString());
        return HiJsonUtil.d(vhgVar);
    }

    @Override // com.huawei.health.weight.WeightApi
    public boolean isHuaweiWspDataTypeApi(int i) {
        return dxm.e(i);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void registerFastingLite() {
        vgx.d().e("pullPkgService", null);
    }

    @Override // com.huawei.health.weight.WeightApi
    public boolean isSupportAiBodyShape() {
        return vng.b();
    }

    @Override // com.huawei.health.weight.WeightApi
    public String getPeerAnalysis(String str) {
        vif vifVar = (vif) HiJsonUtil.d(str, vif.class);
        wus wusVarB = vdh.b(vifVar.b(), vifVar.e());
        ArrayList arrayList = new ArrayList();
        for (Integer num : vifVar.d()) {
            HashMap map = new HashMap();
            map.put("type", num);
            if (num.intValue() == 0) {
                map.put("data", Float.valueOf(wusVarB.p()));
            } else if (num.intValue() == 1) {
                map.put("data", Float.valueOf(wusVarB.o()));
            } else if (num.intValue() == 2) {
                map.put("data", Float.valueOf(wusVarB.w()));
            } else if (num.intValue() == 3) {
                map.put("data", Float.valueOf(wusVarB.s()));
            } else if (num.intValue() == 4) {
                map.put("data", Float.valueOf(wusVarB.t()));
            } else {
                LogUtil.j("WeightApiImpl", "the type is illegal");
            }
            arrayList.add(map);
        }
        return HiJsonUtil.d(arrayList);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getStartWeight(ResponseCallback<Double> responseCallback) {
        vng.d(responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getTargetWeight(ResponseCallback<Double> responseCallback) {
        vng.e(responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getStartWeightAndTargetWeight(ResponseCallback<HashMap<String, Double>> responseCallback) {
        vng.a(responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getWeightTargetDifferences(ResponseCallback<WeightTargetDifferences> responseCallback) {
        vng.c(responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public String getTrunkFatRateGrades(String str) {
        dyh dyhVar;
        vie vieVar = (vie) HiJsonUtil.d(str, vie.class);
        dnb dnbVarD = vieVar.d();
        int iE = vieVar.e();
        boolean zC = dxm.c(dnbVarD);
        LogUtil.a("WeightApiImpl", "getTrunkFatRateGrades isSupportMult: ", Boolean.valueOf(zC));
        if (zC) {
            dyhVar = new dyh(dnbVarD.r(), (float) dnbVarD.av(), dnbVarD.an(), dnbVarD.c(), iE, 8, dnbVarD.ai(), 2, dnbVarD.t());
        } else {
            dyhVar = new dyh(dnbVarD.r(), (float) dnbVarD.av(), dnbVarD.an(), dnbVarD.c(), iE, dnbVarD.ai());
        }
        LogUtil.a("WeightApiImpl", "getTrunkFatRateGrades hwWeightAlgorithm is ", dyhVar.toString());
        ArrayList<Integer> arrayListE = vei.e(dyhVar, vei.d(exz.f(dnbVarD.an(), dyhVar.l(), dnbVarD.c()), exz.f(dnbVarD.an(), dyhVar.ab(), dnbVarD.c()), UnitUtil.b(dnbVarD.v(), 1), UnitUtil.b(dnbVarD.al(), 1)), vei.d(exz.e(dnbVarD.an(), dyhVar.o(), dnbVarD.c()), exz.e(dnbVarD.an(), dyhVar.ad(), dnbVarD.c()), UnitUtil.b(dnbVarD.u(), 1), UnitUtil.b(dnbVarD.ae(), 1)), dnbVarD);
        HashMap map = new HashMap();
        if (njy.c(arrayListE, 4)) {
            map.put("trunk", Integer.valueOf(exz.g(dnbVarD.an(), dyhVar.aj(), dnbVarD.c())));
            map.put("leftUpperLimb", arrayListE.get(1));
            map.put("rightUpperLimb", arrayListE.get(2));
            map.put("leftLowerLimb", arrayListE.get(3));
            map.put("rightLowerLimb", arrayListE.get(4));
        }
        return HiJsonUtil.d(map);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void saveChildHeightUpdateTime() {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser == null) {
            LogUtil.j("WeightApiImpl", "saveChildHeightUpdateTime user is null");
            return;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        LogUtil.a("WeightApiImpl", "saveChildHeightUpdateTime timeMillis ", strValueOf, " result ", Integer.valueOf(SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "update_child_height_time" + currentUser.i(), strValueOf, null)));
    }

    @Override // com.huawei.health.weight.WeightApi
    public String getChildHeightUpdateTime() {
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser == null) {
            LogUtil.j("WeightApiImpl", "getChildHeightUpdateTime user is null");
            return "";
        }
        String strE = SharedPreferenceManager.e(BaseApplication.b(), Integer.toString(10000), "update_child_height_time" + currentUser.i());
        LogUtil.a("WeightApiImpl", "getChildHeightUpdateTime timeMillis ", strE);
        return strE;
    }

    @Override // com.huawei.health.weight.WeightApi
    public void initUser(final IBaseResponseCallback iBaseResponseCallback) {
        ReleaseLogUtil.c("WeightApiImpl", "initUser callback ", iBaseResponseCallback);
        MultiUsersManager.INSTANCE.getOtherUserData(new IBaseResponseCallback() { // from class: vim
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                vng.a((ResponseCallback<HashMap<String, Double>>) new ResponseCallback() { // from class: vii
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i2, Object obj2) {
                        vik.e(i, iBaseResponseCallback, obj, i2, (HashMap) obj2);
                    }
                });
            }
        });
    }

    static /* synthetic */ void e(int i, IBaseResponseCallback iBaseResponseCallback, Object obj, int i2, HashMap map) {
        LogUtil.a("WeightApiImpl", "initUser errorCode ", Integer.valueOf(i), " status ", map);
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.d("WeightApiImpl", "initUser callback is null");
        } else {
            iBaseResponseCallback.a(i, obj);
        }
    }

    @Override // com.huawei.health.weight.WeightApi
    public void setCurrentUser(String str) {
        dnj singleUserById = MultiUsersManager.INSTANCE.getSingleUserById(vng.c(str));
        LogUtil.a("WeightApiImpl", "setCurrentUser userId ", str, " user ", singleUserById);
        MultiUsersManager.INSTANCE.setCurrentUser(singleUserById);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void gotoWeight(Bundle bundle) {
        vng.e(bundle);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void gotoWeight(String str, Bundle bundle) {
        vng.c(str, bundle);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void gotoWeight(String str, Intent intent) {
        vng.a(str, intent);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void goToWeightDataPage(Map<String, Object> map) {
        vng.c(map);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showUserInfoDialog(Context context, ResponseCallback<Integer> responseCallback) {
        vls.i(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showInputDialog(Context context, ResponseCallback<Integer> responseCallback) {
        vls.h(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showAutoUpdateWeightDialog(Context context, ResponseCallback<Integer> responseCallback) {
        vls.a(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showSetGoalDialog(Context context, ResponseCallback<Integer> responseCallback) {
        vls.f(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showBindDeviceDialog(Context context, ResponseCallback<Integer> responseCallback) {
        vls.b(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showUserInfoDialogForMeasureStart(Context context, ResponseCallback<Integer> responseCallback) {
        vls.g(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showUserInfoDialogForMeasureFinish(Context context, ResponseCallback<Integer> responseCallback) {
        vls.j(context, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showGoalMotivationDialog(Context context, ResponseCallback<Integer> responseCallback, float f, int i, String str) {
        vls.b(context, responseCallback, f, i, str);
    }

    @Override // com.huawei.health.weight.WeightApi
    /* JADX INFO: renamed from: initGoalMotivationCache, reason: merged with bridge method [inline-methods] */
    public void b(final ResponseCallback<WeightTargetDifferences> responseCallback) {
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vih
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51149b.b(responseCallback);
                }
            });
            return;
        }
        WeightTargetDifferences weightTargetDifferencesE = vng.e();
        vdv.d(weightTargetDifferencesE);
        responseCallback.onResponse(0, weightTargetDifferencesE);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void autoUpdateUserWeight(float f, long j, ResponseCallback<Object> responseCallback) {
        vng.a(f, j, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void showBluetoothClaimDataDialog() {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vip
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.showBluetoothClaimDataDialog();
                }
            });
            return;
        }
        dnj currentUser = MultiUsersManager.INSTANCE.getCurrentUser();
        if (currentUser != null) {
            LogUtil.a("WeightApiImpl", "showBluetoothClaimDataDialog currentUser ", currentUser.i());
        }
        ClaimWeightDataManager.INSTANCE.queryBluetoothClaimData();
    }

    @Override // com.huawei.health.weight.WeightApi
    public void initCardRedDot() {
        if (HandlerExecutor.d()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vio
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51172c.initCardRedDot();
                }
            });
        } else {
            ClaimWeightDataManager.INSTANCE.initShowRed();
        }
    }

    @Override // com.huawei.health.weight.WeightApi
    public void saveWeightManagerAndGoal(ResponseCallback<Pair<Long, Object>> responseCallback, String str) {
        vei.b(responseCallback, str);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void refreshDietOverview(int i) {
        ReleaseLogUtil.c("WeightApiImpl", "refreshDietOverview date ", Integer.valueOf(i));
        vil.d(i, i, (ResponseCallback<List<vgo>>) new ResponseCallback() { // from class: vig
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i2, Object obj) {
                LogUtil.a("WeightApiImpl", "refreshDietOverview errorCode ", Integer.valueOf(i2), " list ", (List) obj);
            }
        });
    }

    @Override // com.huawei.health.weight.WeightApi
    public void getGoalDetail(ResponseCallback<iuu> responseCallback) {
        vms.c(responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void calculateGoal(Bundle bundle, ResponseCallback<ivd> responseCallback) {
        vms.c(bundle, responseCallback);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void saveWeightTargetDifferences(ivd ivdVar, long j) {
        vms.d(ivdVar, j);
    }

    @Override // com.huawei.health.weight.WeightApi
    public iuv getOnePointFull(int i) {
        return ezn.a(i);
    }

    @Override // com.huawei.health.weight.WeightApi
    public void scheduleWeightMeasureNextReminder() {
        vng.d();
    }

    @Override // com.huawei.health.weight.WeightApi
    public void syncData() {
        vil.m();
    }
}
