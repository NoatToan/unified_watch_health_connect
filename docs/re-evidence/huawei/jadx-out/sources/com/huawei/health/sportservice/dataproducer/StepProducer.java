package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.STEP_PRODUCER)
public class StepProducer extends BaseProducer implements SportLifecycle {
    private static final String TAG = "SportService_StepProducer";
    private int mPreStep;
    private int mSteps;

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        if (this.mPreStep > iIntValue) {
            return;
        }
        this.mSteps = iIntValue;
        ReleaseLogUtil.d(TAG, "onChange step: ", Integer.valueOf(iIntValue));
        onStagingAndNotification();
        this.mPreStep = iIntValue;
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        BaseSportManager.getInstance().stagingAndNotification("STEP_DATA", Integer.valueOf(this.mSteps));
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
        Object data = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        if (data instanceof MotionPathSimplify) {
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data;
            motionPathSimplify.saveTotalSteps(this.mSteps);
            BaseSportManager.getInstance().stagingData("MOTION_PATH_SIMPLIFY_DATA", motionPathSimplify);
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void recoveryData() {
        Object data = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        if (!(data instanceof MotionPathSimplify)) {
            LogUtil.e(TAG, "recovery failed. data not MotionPathSimplify type");
            return;
        }
        int iRequestTotalSteps = ((MotionPathSimplify) data).requestTotalSteps();
        this.mSteps = iRequestTotalSteps;
        LogUtil.a(TAG, "recovery mSteps ", Integer.valueOf(iRequestTotalSteps));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().subscribeToSource("STEP_DATA", this);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        onSaveData();
    }
}
