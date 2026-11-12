package com.huawei.health.heartratecontrol.algorithm;

import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import defpackage.fgf;
import defpackage.fgv;

/* JADX INFO: loaded from: classes28.dex */
public abstract class BaseHeartRateControlModel {
    private static final String TAG = "HRControl_BaseHeartRateControlModel";
    private static final String TARGET_HEART_RATE = "target_heart_rate";
    protected HeartRateModelCallback mCallback;
    protected int mCourseStageHeartRateMax;
    protected int mCourseStageHeartRateMin;
    protected boolean mIsCourseFinished;
    protected boolean mIsRestart;
    protected fgf mSpeedControlConfigInfo;
    protected int mCourseStageNo = 0;
    protected int mCourseStageEndTime = 0;
    protected int mSportTime = -1;
    protected int mTargetHeartRate = 0;
    protected boolean mIsWear = true;
    protected int mLockStatus = 0;

    public abstract void initParas();

    public void setCourseConfigInfo(fgf fgfVar) {
        LogUtil.a(TAG, "setCourseConfigInfo configInfo = ", fgfVar);
        if (fgfVar != null) {
            this.mSpeedControlConfigInfo = fgfVar;
        }
    }

    public void setCourseStageInfo(int i, ChoreographedSingleAction choreographedSingleAction) {
        LogUtil.a(TAG, "setCourseStageInfo courseStageNo = ", Integer.valueOf(i), ", courseStageInfo = ", choreographedSingleAction);
        if (choreographedSingleAction != null) {
            this.mCourseStageNo = i;
            if (choreographedSingleAction.getIntensityConfig() != null) {
                this.mCourseStageHeartRateMin = (int) choreographedSingleAction.getIntensityConfig().getValueL();
                this.mCourseStageHeartRateMax = (int) choreographedSingleAction.getIntensityConfig().getValueH();
            }
            if (choreographedSingleAction.getTargetConfig() != null) {
                this.mCourseStageEndTime += (int) choreographedSingleAction.getTargetConfig().getValueL();
            }
            try {
                this.mTargetHeartRate = Integer.parseInt(choreographedSingleAction.getExtendProperty(TARGET_HEART_RATE));
            } catch (NumberFormatException unused) {
                LogUtil.j(TAG, "mTargetHeartRate FormatException");
            }
            LogUtil.a(TAG, "setCourseStageInfo mCourseStageHeartRateMin = ", Integer.valueOf(this.mCourseStageHeartRateMin), ", mCourseStageHeartRateMax = ", Integer.valueOf(this.mCourseStageHeartRateMax), ", mCourseStageEndTime = ", Integer.valueOf(this.mCourseStageEndTime), ", mTargetHeartRate = ", Integer.valueOf(this.mTargetHeartRate));
        }
    }

    public void setLockStatus(int i) {
        LogUtil.a(TAG, "enter setLockStatus, lockStatus = ", Integer.valueOf(i));
        this.mLockStatus = i;
    }

    public void setIsCourseFinished(boolean z) {
        LogUtil.a(TAG, "setCourseData: isCourseFinished = ", Boolean.valueOf(z));
        this.mIsCourseFinished = z;
    }

    public void setRestart(boolean z) {
        LogUtil.a(TAG, "setRestart isRestart = ", Boolean.valueOf(z));
        this.mIsRestart = z;
    }

    public void subscribeModelResult(HeartRateModelCallback heartRateModelCallback) {
        if (heartRateModelCallback == null) {
            LogUtil.j(TAG, "callback == null");
        } else {
            this.mCallback = heartRateModelCallback;
        }
    }

    public void unsubscribeModelResult() {
        this.mCallback = null;
    }

    protected void sendHeartRateModelCallback(String str, Object obj) {
        if (this.mCallback == null) {
            LogUtil.j(TAG, "sendHeartRateModelCallback: callback is null");
        }
        this.mCallback.onDataUpdate(str, obj);
    }

    public void checkWearStatus() {
        LogUtil.a(TAG, "checkWearStatus start");
        fgv.a(new ResponseCallback() { // from class: fgb
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f34016b.m1118x551c9640(i, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$checkWearStatus$0$com-huawei-health-heartratecontrol-algorithm-BaseHeartRateControlModel, reason: not valid java name */
    public /* synthetic */ void m1118x551c9640(int i, Boolean bool) {
        LogUtil.a(TAG, "checkWearStatus end status = ", Integer.valueOf(i), ", isHasWear = ", bool);
        if (i == 2 || i == -2) {
            callbackAdjustStatus(1001);
            this.mIsWear = false;
        }
    }

    public void callbackAdjustStatus(int i) {
        LogUtil.a(TAG, "callbackAdjustStatus status = ", Integer.valueOf(i));
        sendHeartRateModelCallback("HEART_RATE_MODEL_STATUS", Integer.valueOf(i));
    }
}
