package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AIActionBundle;
import com.huawei.up.model.UserInfomation;
import defpackage.hau;
import defpackage.pea;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.CALORIE_ALGORITHM_SOURCE_SOURCE)
public class AiTrainCalorieSource extends BaseSource<Integer> implements SportLifecycle {
    private static final String TAG = "SportService_AiTrainCalorieSource";
    protected float mCaloriesValue;
    private SportLaunchParams mSportLaunchParams;
    protected float mUserWeight = 60.0f;
    private hau mSportCallbackOption = new hau();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        UserInfomation userInfo = ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).getUserInfo();
        if (userInfo == null) {
            LogUtil.e(TAG, "accountInfo is null");
            return;
        }
        float weightOrDefaultValue = userInfo.getWeightOrDefaultValue();
        if (Float.compare(weightOrDefaultValue, 0.0f) <= 0) {
            this.mUserWeight = 60.0f;
        } else {
            this.mUserWeight = weightOrDefaultValue;
            LogUtil.a(TAG, "mUserWeight: ", Float.valueOf(weightOrDefaultValue));
        }
        this.mSportLaunchParams = (SportLaunchParams) BaseSportManager.getInstance().getParas(SportParamsType.SPORT_LAUNCH_PARAS);
        this.mSportCallbackOption.e(getSubscribeList());
        this.mSportCallbackOption.d(getLogTag());
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.datasource.AiTrainCalorieSource$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1171xc3247f26(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-datasource-AiTrainCalorieSource, reason: not valid java name */
    /* synthetic */ void m1171xc3247f26(List list, Map map) {
        if (list.contains("AI_TRAIN_VALID_TIMES")) {
            Object obj = map.get("AI_TRAIN_VALID_TIMES");
            if (obj instanceof Integer) {
                float fCalculateAiTrainCalorie = calculateAiTrainCalorie(((Integer) obj).intValue());
                this.mCaloriesValue = fCalculateAiTrainCalorie;
                LogUtil.a(TAG, "ai train, mCaloriesValue ", Float.valueOf(fCalculateAiTrainCalorie));
                updateSourceData();
            }
        }
    }

    private List<String> getSubscribeList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("AI_TRAIN_VALID_TIMES");
        return arrayList;
    }

    private float calculateAiTrainCalorie(int i) {
        AIActionBundle aIActionBundle;
        float f = this.mCaloriesValue;
        SportLaunchParams sportLaunchParams = this.mSportLaunchParams;
        if (sportLaunchParams == null || (aIActionBundle = (AIActionBundle) sportLaunchParams.getExtra(AIActionBundle.AI_ACTION_BUNDLE, AIActionBundle.class)) == null) {
            return f;
        }
        if (aIActionBundle.getAiMeasurement() == 1) {
            return calcCalorieByTimeType(aIActionBundle, i);
        }
        return calcCalorieByCountType(aIActionBundle, i);
    }

    protected float calcCalorieByTimeType(AIActionBundle aIActionBundle, int i) {
        return pea.a(aIActionBundle.getCalorie(), i, this.mUserWeight);
    }

    protected float calcCalorieByCountType(AIActionBundle aIActionBundle, int i) {
        return pea.a((long) aIActionBundle.getDuration(), i, aIActionBundle.getCalorie(), this.mUserWeight);
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(TAG, "CALORIES_DATA", Integer.valueOf(Math.round(this.mCaloriesValue)));
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
