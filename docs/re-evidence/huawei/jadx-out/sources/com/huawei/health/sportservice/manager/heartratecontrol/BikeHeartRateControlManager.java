package com.huawei.health.sportservice.manager.heartratecontrol;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fgk;
import defpackage.nxs;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 1, name = ComponentName.HEART_RATE_CONTROL_MANAGER)
public class BikeHeartRateControlManager extends BaseHeartRateControlManager {
    private static final String TAG = "SportService_HRControl_BikeHeartRateControlManager";
    private static final String TAG_RELEASE = "R_SportService_HRControl_BikeHeartRateControlManager";
    private int mPower = -1;
    private int mRpm = -1;
    private int mResistance = -1;

    public BikeHeartRateControlManager() {
        this.mModel = new fgk();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        LogUtil.a(TAG, "onPreSport");
        this.mModel.initParas();
        this.mModel.subscribeModelResult(this);
        this.mSportDataNotify = new SportDataNotify() { // from class: com.huawei.health.sportservice.manager.heartratecontrol.BikeHeartRateControlManager$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1203x65ad35e9(list, map);
            }
        };
        ArrayList arrayList = new ArrayList(10);
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("HEART_RATE_DATA");
        arrayList.add("POWER_DATA");
        arrayList.add("CADENCE_DATA");
        arrayList.add("RESISTANCE_LEVEL_DATA");
        this.mCallbackOption.e(arrayList);
        this.mCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mCallbackOption, this.mSportDataNotify);
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-manager-heartratecontrol-BikeHeartRateControlManager, reason: not valid java name */
    /* synthetic */ void m1203x65ad35e9(List list, Map map) {
        if (list.contains("HEART_RATE_DATA") && (map.get("HEART_RATE_DATA") instanceof Integer)) {
            this.mHeartRate = ((Integer) map.get("HEART_RATE_DATA")).intValue();
        }
        if (list.contains("POWER_DATA") && (map.get("POWER_DATA") instanceof Integer)) {
            this.mPower = ((Integer) map.get("POWER_DATA")).intValue();
        }
        if (list.contains("CADENCE_DATA") && (map.get("CADENCE_DATA") instanceof Integer)) {
            this.mRpm = ((Integer) map.get("CADENCE_DATA")).intValue();
        }
        if (list.contains("RESISTANCE_LEVEL_DATA") && (map.get("RESISTANCE_LEVEL_DATA") instanceof Integer)) {
            this.mResistance = ((Integer) map.get("RESISTANCE_LEVEL_DATA")).intValue();
        }
        if (list.contains("TIME_ONE_SECOND_DURATION") && (map.get("TIME_ONE_SECOND_DURATION") instanceof Long)) {
            this.mSportTime = Math.round(((Long) map.get("TIME_ONE_SECOND_DURATION")).longValue() / 1000);
            if (!isInvalidData() && (this.mModel instanceof fgk)) {
                ((fgk) this.mModel).b(this.mSportTime, this.mHeartRate, this.mPower, this.mRpm, this.mResistance);
            }
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onStartSport() {
        LogUtil.a(TAG, "onStartSport");
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        LogUtil.a(TAG, "onPauseSport");
    }

    @Override // com.huawei.health.sportservice.manager.ManagerComponent
    public void destroy() {
        LogUtil.a(TAG, "destroy");
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mCallbackOption);
        if (this.mModel != null) {
            this.mModel.unsubscribeModelResult();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.health.sportservice.manager.heartratecontrol.BaseHeartRateControlManager, com.huawei.health.heartratecontrol.algorithm.HeartRateModelCallback
    public <T> void onDataUpdate(String str, T t) {
        super.onDataUpdate(str, t);
        str.hashCode();
        if (str.equals("HEART_RATE_MODEL_RESULT")) {
            HashMap map = new HashMap();
            if (t instanceof HashMap) {
                map = (HashMap) t;
            }
            if ((map.get("RESULT_POWER") instanceof Integer) && (map.get("RESULT_RPM") instanceof Integer)) {
                Integer num = (Integer) map.get("RESULT_POWER");
                int iIntValue = num.intValue();
                Integer num2 = (Integer) map.get("RESULT_RPM");
                int iIntValue2 = num2.intValue();
                ReleaseLogUtil.d(TAG_RELEASE, "onDataUpdate adjustingIndoorBikeResistance power = ", num, ", rpm = ", num2);
                ReleaseLogUtil.d(TAG_RELEASE, "onDataUpdate adjustingIndoorBikeResistance isAdjustSuccess = ", Boolean.valueOf(nxs.d().c(iIntValue2, iIntValue)));
            }
        }
    }

    private boolean isInvalidData() {
        LogUtil.a(TAG, "isInvalidData mSportTime = ", Integer.valueOf(this.mSportTime), ", mHeartRate = ", Integer.valueOf(this.mHeartRate), ", mPower = ", Integer.valueOf(this.mPower), ", mRpm = ", Integer.valueOf(this.mRpm), ", mResistance = ", Integer.valueOf(this.mResistance));
        return this.mSportTime < 0 || this.mHeartRate < 0 || this.mPower < 0 || this.mRpm < 0 || this.mResistance < 0;
    }
}
