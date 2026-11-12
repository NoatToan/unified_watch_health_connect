package com.huawei.health.sportservice.manager;

import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.TARGET_MANAGER)
public class AerobicSportTargetManager extends BaseTargetManager {
    private static final String TAG = "SportService_AerobicSportTargetManager";

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport");
        if (this.mHasTarget) {
            setTag(TAG);
            LogUtil.a(TAG, "mHasTarget = ", Boolean.valueOf(this.mHasTarget), " mTargetType = ", Integer.valueOf(this.mTargetType), " mTargetValue = ", Float.valueOf(this.mTargetValue));
            int i = this.mTargetType;
            if (i == 0) {
                registerTargetSportData("TIME_ONE_SECOND_DURATION", this.mTargetValue * 1000.0f);
            } else if (i == 1) {
                registerTargetSportData("DISTANCE_DATA", this.mTargetValue);
            } else {
                if (i != 2) {
                    return;
                }
                registerTargetSportData("CALORIES_DATA", this.mTargetValue);
            }
        }
    }

    @Override // com.huawei.health.sportservice.manager.BaseTargetManager, com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        LogUtil.a(TAG, "destroy");
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mCallbackOption);
    }
}
