package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AIActionBundle;
import defpackage.hau;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.RESULT_CODE_PRODUCER)
public class ResultCodeProducer extends BaseProducer implements SportLifecycle {
    private static final String TAG = "SportService_ResultCodeProducer";
    private int mResultCode;
    private int mActionType = -1;
    private List<Integer> mResultCodeList = new ArrayList(16);
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().subscribeToSource("AI_TRAIN_RESULT_CODE", this);
        getActionType();
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_ONE_SECOND_DURATION");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.dataproducer.ResultCodeProducer$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1160x28b25183(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-dataproducer-ResultCodeProducer, reason: not valid java name */
    /* synthetic */ void m1160x28b25183(List list, Map map) {
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            getResultCodeOneSecond();
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
        if (this.mActionType == 1) {
            List<Integer> list = this.mResultCodeList;
            Integer num = (Integer) obj;
            num.intValue();
            list.add(num);
            return;
        }
        this.mResultCode = ((Integer) obj).intValue();
        onStagingAndNotification();
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        BaseSportManager.getInstance().stagingAndNotification("AI_TRAIN_RESULT_CODE", Integer.valueOf(this.mResultCode));
    }

    private void getActionType() {
        AIActionBundle aIActionBundle;
        SportLaunchParams sportLaunchParams = (SportLaunchParams) BaseSportManager.getInstance().getParas(SportParamsType.SPORT_LAUNCH_PARAS);
        if (sportLaunchParams == null || (aIActionBundle = (AIActionBundle) sportLaunchParams.getExtra(AIActionBundle.AI_ACTION_BUNDLE, AIActionBundle.class)) == null) {
            return;
        }
        this.mActionType = aIActionBundle.getAiMeasurement();
    }

    private void getResultCodeOneSecond() {
        if (this.mActionType != 1) {
            return;
        }
        float fIntValue = 0.0f;
        int i = 0;
        for (int i2 = 0; i2 < this.mResultCodeList.size(); i2++) {
            fIntValue += this.mResultCodeList.get(i2).intValue();
            if (this.mResultCodeList.get(i2).intValue() != 0) {
                i++;
            }
        }
        int iRound = i != 0 ? Math.round(fIntValue / i) : 0;
        this.mResultCode = iRound;
        LogUtil.a(TAG, "getResultCodeOneSecond mResultCode ", Integer.valueOf(iRound), " mResultCodeList ", this.mResultCodeList);
        this.mResultCodeList.clear();
        onStagingAndNotification();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
