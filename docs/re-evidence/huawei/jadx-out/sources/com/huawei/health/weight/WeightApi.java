package com.huawei.health.weight;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.huawei.health.weight.bean.WeightTargetDifferences;
import com.huawei.hihealth.HiAggregateOption;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.ui.main.stories.health.weight.callback.DietDiaryCbk;
import com.huawei.ui.main.stories.health.weight.callback.WeightCallback;
import defpackage.eez;
import defpackage.iuu;
import defpackage.iuv;
import defpackage.ivd;
import defpackage.vgo;
import defpackage.vgt;
import defpackage.vgw;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface WeightApi {
    void addMeal(vgw vgwVar, ResponseCallback<vgo> responseCallback);

    void autoUpdateUserWeight(float f, long j, ResponseCallback<Object> responseCallback);

    void calculateGoal(Bundle bundle, ResponseCallback<ivd> responseCallback);

    void checkFatReductionShapingState();

    void getBasicDietRecord(int i, int i2, long j, ResponseCallback<List<vgo>> responseCallback);

    void getBasicDietRecord(int i, int i2, ResponseCallback<List<vgo>> responseCallback);

    double getBmiByHiHealthData(HiHealthData hiHealthData);

    String getChildHeightUpdateTime();

    Class<?> getCustomRecipe();

    void getDeviceSyncDietAnalysis(vgo vgoVar, ResponseCallback<eez> responseCallback);

    Class<?> getDietDiaryRepositoryApi();

    void getDietRecord(int i, int i2, long j, ResponseCallback<List<vgo>> responseCallback);

    void getDietRecord(int i, int i2, ResponseCallback<List<vgo>> responseCallback);

    Class<?> getFastingLiteRepositoryApi();

    String getFastingLiteSetting();

    String getFastingLiteStatus();

    String getFastingLiteViewData();

    void getGoalDetail(ResponseCallback<iuu> responseCallback);

    iuv getOnePointFull(int i);

    String getPeerAnalysis(String str);

    void getStartWeight(ResponseCallback<Double> responseCallback);

    void getStartWeightAndTargetWeight(ResponseCallback<HashMap<String, Double>> responseCallback);

    void getTargetWeight(ResponseCallback<Double> responseCallback);

    String getTrunkFatRateGrades(String str);

    int getWeightBondedProducts();

    void getWeightControlSetting(DietDiaryCbk<vgt> dietDiaryCbk);

    void getWeightData(HiAggregateOption hiAggregateOption, WeightCallback weightCallback);

    void getWeightTargetDifferences(ResponseCallback<WeightTargetDifferences> responseCallback);

    void goToWeightDataPage(Map<String, Object> map);

    void gotoWeight(Bundle bundle);

    void gotoWeight(String str, Intent intent);

    void gotoWeight(String str, Bundle bundle);

    void initCardRedDot();

    void initGoalMotivationCache(ResponseCallback<WeightTargetDifferences> responseCallback);

    void initUser(IBaseResponseCallback iBaseResponseCallback);

    boolean isHuaweiWspDataTypeApi(int i);

    boolean isJoinDietDiary();

    boolean isSupportAiBodyShape();

    void isSupportDiet(boolean z, ResponseCallback<Boolean> responseCallback);

    void joinDietDiary();

    void recordMeals(List<vgw> list, ResponseCallback<List<vgo>> responseCallback);

    void refreshDietOverview(int i);

    void registerFastingLite();

    void saveChildHeightUpdateTime();

    void saveWeightManagerAndGoal(ResponseCallback<Pair<Long, Object>> responseCallback, String str);

    void saveWeightTargetDifferences(ivd ivdVar, long j);

    void scheduleWeightMeasureNextReminder();

    void setCurrentUser(String str);

    void showAutoUpdateWeightDialog(Context context, ResponseCallback<Integer> responseCallback);

    void showBindDeviceDialog(Context context, ResponseCallback<Integer> responseCallback);

    void showBluetoothClaimDataDialog();

    void showGoalMotivationDialog(Context context, ResponseCallback<Integer> responseCallback, float f, int i, String str);

    void showInputDialog(Context context, ResponseCallback<Integer> responseCallback);

    void showSetGoalDialog(Context context, ResponseCallback<Integer> responseCallback);

    void showUserInfoDialog(Context context, ResponseCallback<Integer> responseCallback);

    void showUserInfoDialogForMeasureFinish(Context context, ResponseCallback<Integer> responseCallback);

    void showUserInfoDialogForMeasureStart(Context context, ResponseCallback<Integer> responseCallback);

    void syncData();

    void syncDietData();

    void updateMeal(vgw vgwVar, ResponseCallback<vgo> responseCallback);

    void updateOnePointFull();
}
