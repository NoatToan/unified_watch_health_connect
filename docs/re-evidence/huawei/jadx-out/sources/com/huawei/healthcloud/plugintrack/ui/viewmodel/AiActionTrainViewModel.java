package com.huawei.healthcloud.plugintrack.ui.viewmodel;

import android.os.Bundle;
import com.huawei.health.basesport.viewmodel.BaseSportingViewModel;
import com.huawei.health.sport.model.WorkoutRecord;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.healthcloud.plugintrack.ui.fragment.AiActionTrainFragment;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.AIActionBundle;
import defpackage.jch;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class AiActionTrainViewModel extends SportExamViewModel implements SportDataNotify {
    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public boolean isStopSportByTarget() {
        return true;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel
    protected void playPreSportTipsVoice() {
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel, com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        this.mSportDataOutputApi.setParas(SportParamsType.AI_TRAIN_TEMPLATE_DATA, b());
        super.onPreSport();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public List<String> getSubscribeTagList() {
        ArrayList arrayList = new ArrayList(super.getSubscribeTagList());
        arrayList.add("CALORIES_DATA");
        arrayList.add("AI_TRAIN_RESULT_CODE");
        arrayList.add("AI_TRAIN_VALID_TIMES");
        return arrayList;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initFragment() {
        LogUtil.a("Track_AiActionTrainViewModel", "initFragment");
        addFragment(new AiActionTrainFragment(c()));
    }

    public int c() {
        AIActionBundle aIActionBundleA = a();
        int towards = aIActionBundleA != null ? aIActionBundleA.getTowards() : 0;
        LogUtil.a("Track_AiActionTrainViewModel", "initFragment, sportLaunchParams ", Integer.valueOf(towards));
        return towards;
    }

    @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public int getScreenDirection() {
        return jch.b(c()) == 0 ? 1 : 0;
    }

    public int d() {
        AIActionBundle aIActionBundleA = a();
        if (aIActionBundleA != null) {
            return aIActionBundleA.getAiMeasurement();
        }
        return -1;
    }

    public AIActionBundle a() {
        SportLaunchParams sportLaunchParams = getSportLaunchParams();
        if (sportLaunchParams != null) {
            return (AIActionBundle) sportLaunchParams.getExtra("AI_ACTION_BUNDLE", AIActionBundle.class);
        }
        return null;
    }

    private String b() {
        AIActionBundle aIActionBundleA = a();
        String describe = aIActionBundleA != null ? aIActionBundleA.getDescribe() : null;
        LogUtil.a("Track_AiActionTrainViewModel", "initFragment, template ", describe);
        return describe;
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void initReceivedDataHandlers() {
        super.initReceivedDataHandlers();
        g();
        i();
        receivedAllData();
    }

    @Override // com.huawei.healthcloud.plugintrack.ui.viewmodel.SportExamViewModel, com.huawei.health.basesport.viewmodel.BaseSportingViewModel
    public void init(Bundle bundle) {
        super.init(bundle);
        LogUtil.a("Track_AiActionTrainViewModel", "init");
        addSportDataMap("result_code");
        addSportDataMap("valid_times");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public WorkoutRecord e() {
        WorkoutRecord workoutRecord;
        if (this.mSportDataOutputApi != null) {
            Object data = this.mSportDataOutputApi.getData("AI_TRAIN_WORKOUT_RECORD");
            if (data instanceof WorkoutRecord) {
                workoutRecord = (WorkoutRecord) data;
            } else {
                workoutRecord = null;
            }
        } else {
            workoutRecord = null;
        }
        LogUtil.a("Track_AiActionTrainViewModel", "workoutRecord ", workoutRecord);
        return workoutRecord;
    }

    private void g() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "AI_TRAIN_RESULT_CODE", "result_code", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.AiActionTrainViewModel.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                AiActionTrainViewModel.this.postValue("result_code", num);
            }
        });
    }

    private void i() {
        this.mReceivedData.add(new BaseSportingViewModel.ReceivedDataHandler<Integer>(this, "AI_TRAIN_VALID_TIMES", "valid_times", Integer.class) { // from class: com.huawei.healthcloud.plugintrack.ui.viewmodel.AiActionTrainViewModel.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.huawei.health.basesport.viewmodel.BaseSportingViewModel.ReceivedDataHandler
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void handleInner(Integer num, Map<String, Object> map) {
                AiActionTrainViewModel.this.postValue("valid_times", num);
            }
        });
    }
}
