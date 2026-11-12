package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.healthcloud.plugintrack.model.IStepRateCallback;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.hbv;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.PHONE_STEP_SOURCE)
public class PhoneStepSource extends BaseSource<Integer> implements SportLifecycle, IStepRateCallback {
    private static final String TAG = "SportService_PhoneStepSource";
    private int mPauseSteps;
    private int mPreVibrateSensoryStep;
    private int mStepsDuringPause;
    private int mStartStep = -1;
    private int mCurSteps = 0;

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        int i = (this.mCurSteps - this.mStepsDuringPause) - this.mStartStep;
        if (i > this.mPreVibrateSensoryStep) {
            ReleaseLogUtil.d(TAG, "realVibrateStep: ", Integer.valueOf(i));
            BaseSportManager.getInstance().updateSourceData("00E", "STEP_DATA", Integer.valueOf(i));
            this.mPreVibrateSensoryStep = i;
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
        if (num.intValue() >= 0 && hbv.c(BaseSportManager.getInstance().getSportType())) {
            this.mCurSteps = num.intValue();
            updateSourceData();
        }
    }

    @Override // com.huawei.healthcloud.plugintrack.model.IStepRateCallback
    public void report(int i, int i2) {
        if (this.mStartStep == -1) {
            this.mStartStep = i;
        }
        generateData(Integer.valueOf(i));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        this.mStepsDuringPause += Math.max(this.mCurSteps - this.mPauseSteps, 0);
        BaseSportManager.getInstance().stagingData("StepsDuringPause", Integer.valueOf(this.mStepsDuringPause));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.mPauseSteps = this.mCurSteps;
        BaseSportManager.getInstance().stagingData("PauseSteps", Integer.valueOf(this.mPauseSteps));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().registerStep(this);
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void recoveryData() {
        Object data = BaseSportManager.getInstance().getData("StepsDuringPause");
        if (data instanceof Integer) {
            int iIntValue = ((Integer) data).intValue();
            this.mStepsDuringPause = iIntValue;
            LogUtil.a(TAG, "recoveryData() mStepsDuringPause: ", Integer.valueOf(iIntValue));
        }
        Object data2 = BaseSportManager.getInstance().getData("PauseSteps");
        if (data2 instanceof Integer) {
            int iIntValue2 = ((Integer) data2).intValue();
            this.mPauseSteps = iIntValue2;
            LogUtil.a(TAG, "recoveryData() mPauseSteps: ", Integer.valueOf(iIntValue2));
        }
    }
}
