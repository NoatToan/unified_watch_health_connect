package defpackage;

import androidx.core.util.Pair;
import com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class fgl extends BaseHeartRateControlModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34027c;
    private float d = -1.0f;
    private List<Integer> e = new ArrayList();
    private int f;
    private int g;
    private int h;
    private float i;
    private int j;
    private int k;
    private float l;

    @Override // com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel
    public void initParas() {
        fgp fgpVarD = fgp.d();
        this.i = fgpVarD.a();
        int iC = fgpVarD.c();
        this.f34027c = iC;
        LogUtil.a("HRControl_TreadmillHeartRateControlModel", "mRunLevel = ", Float.valueOf(this.i), " mAge = ", Integer.valueOf(iC));
    }

    @Override // com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel
    public void setCourseStageInfo(int i, ChoreographedSingleAction choreographedSingleAction) {
        super.setCourseStageInfo(i, choreographedSingleAction);
        d(i, choreographedSingleAction);
        e();
    }

    public void d(int i, int i2, float f) {
        if (i <= 0) {
            LogUtil.a("HRControl_TreadmillHeartRateControlModel", "time less than 0");
            return;
        }
        if (this.mIsCourseFinished) {
            LogUtil.a("HRControl_TreadmillHeartRateControlModel", "the course is finished");
            return;
        }
        if (this.mLockStatus != 0) {
            LogUtil.d("HRControl_TreadmillHeartRateControlModel", "mLockStatus is ", Integer.valueOf(this.mLockStatus));
            this.d = f;
        } else if (b(f)) {
            this.mLockStatus = 1;
            sendHeartRateModelCallback("HEART_RATE_MODEL_STATUS", 1009);
        } else {
            b(i, i2, f);
        }
    }

    private void b(int i, int i2, float f) {
        this.mSportTime = i;
        LogUtil.d("HRControl_TreadmillHeartRateControlModel", "speedAdjustModel: time = ", Integer.valueOf(i), " heartRate = ", Integer.valueOf(i2), " speed = ", Float.valueOf(f));
        if (c(i2, f) && this.f == 1 && this.h == 0) {
            this.f = 2;
        }
        int i3 = this.f;
        if (i3 == 1) {
            LogUtil.d("HRControl_TreadmillHeartRateControlModel", "stage change status");
            int i4 = this.h;
            if (i4 > 0) {
                LogUtil.d("HRControl_TreadmillHeartRateControlModel", "the course is in stage buffer, mStageBufferTime = ", Integer.valueOf(i4));
                this.h--;
                if (this.mCourseStageNo == 0 && this.h == 0) {
                    LogUtil.d("HRControl_TreadmillHeartRateControlModel", "change to heart rate adjust directly in first stage");
                    this.f = 2;
                    return;
                }
                return;
            }
            fgh fghVarB = b(f, i2, this.i, this.f34027c);
            this.h = fghVarB.b();
            a(f, fghVarB.d(), fghVarB.b());
            return;
        }
        if (i3 == 2) {
            LogUtil.d("HRControl_TreadmillHeartRateControlModel", "rate adjust status");
            int i5 = this.j;
            if (i5 > 0) {
                int i6 = i5 - 1;
                this.j = i6;
                LogUtil.d("HRControl_TreadmillHeartRateControlModel", "the course is in rate buffer, mRateAdjustBufferTime = ", Integer.valueOf(i6));
                return;
            } else {
                if (this.e.size() > 0) {
                    this.e.add(Integer.valueOf(i2));
                    LogUtil.d("HRControl_TreadmillHeartRateControlModel", "the course is in rate monitor, mHeartRateCheckList = ", Integer.valueOf(this.e.size()));
                    c(f);
                    return;
                }
                a(i2);
                return;
            }
        }
        LogUtil.d("HRControl_TreadmillHeartRateControlModel", "error status");
    }

    private boolean c(int i, float f) {
        if (i > this.mTargetHeartRate) {
            return f <= this.l;
        }
        return i >= this.mTargetHeartRate || f >= this.l;
    }

    private void d(int i, ChoreographedSingleAction choreographedSingleAction) {
        if (choreographedSingleAction == null) {
            LogUtil.j("HRControl_TreadmillHeartRateControlModel", "initStageData: action == null");
            return;
        }
        this.k = (int) ((choreographedSingleAction.getTargetConfig() == null || choreographedSingleAction.getTargetConfig().getValueType() != 1) ? 0.0d : choreographedSingleAction.getTargetConfig().getValueL());
        try {
            this.l = Float.parseFloat(choreographedSingleAction.getExtendProperty("target_speed"));
            this.f34026b = Float.parseFloat(choreographedSingleAction.getExtendProperty("target_speed_min"));
            this.f34025a = Float.parseFloat(choreographedSingleAction.getExtendProperty("target_speed_max"));
        } catch (NumberFormatException unused) {
            LogUtil.j("HRControl_TreadmillHeartRateControlModel", "NumberFormatException");
        }
        this.l = fgj.a(this.l, 1);
        this.f34026b = fgj.a(this.f34026b, 1);
        float fA = fgj.a(this.f34025a, 1);
        this.f34025a = fA;
        ReleaseLogUtil.d("HRControl_TreadmillHeartRateControlModel", "initStageData mTargetDuration = ", Integer.valueOf(this.k), " mTargetSpeed = ", Float.valueOf(this.l), " mMinTargetSpeed = ", Float.valueOf(this.f34026b), " mMaxTargetSpeed = ", Float.valueOf(fA));
    }

    private void e() {
        this.f = 1;
        this.h = 0;
        this.j = 0;
        List<Integer> list = this.e;
        if (list != null) {
            list.clear();
        }
        if (this.mLockStatus == 1) {
            this.mLockStatus = 0;
        }
    }

    private void a(int i) {
        if (!fgj.c(i)) {
            LogUtil.d("HRControl_TreadmillHeartRateControlModel", "mIsWear = ", Boolean.valueOf(this.mIsWear));
            if (this.mIsWear) {
                checkWearStatus();
                return;
            }
            return;
        }
        this.mIsWear = true;
        if (i >= this.mCourseStageHeartRateMin && i <= this.mCourseStageHeartRateMax) {
            LogUtil.d("HRControl_TreadmillHeartRateControlModel", "in heart rate adjust, heartRate in scope");
            return;
        }
        this.g = this.mSpeedControlConfigInfo != null ? this.mSpeedControlConfigInfo.getCheckSustainTime() : 30;
        this.e.add(Integer.valueOf(i));
        LogUtil.d("HRControl_TreadmillHeartRateControlModel", "in heart rate adjust, start heart rate monitor");
    }

    private void c(float f) {
        List<Integer> list = this.e;
        if (list == null || list.size() < this.g) {
            return;
        }
        if (fgj.d(this.e) >= (this.mSpeedControlConfigInfo != null ? this.mSpeedControlConfigInfo.getAbnormalHeartRateRatio() : 0.5f)) {
            sendHeartRateModelCallback("HEART_RATE_MODEL_STATUS", 1002);
            this.e.clear();
            return;
        }
        int iC = (int) fgj.c(this.e);
        if (iC >= this.mCourseStageHeartRateMin && iC <= this.mCourseStageHeartRateMax) {
            this.e.clear();
            return;
        }
        fgh fghVarB = b(f, fgj.e(this.e), iC, this.i, this.f34027c);
        if (fghVarB == null) {
            LogUtil.j("HRControl_TreadmillHeartRateControlModel", "heartRateDecisionProcess: result == null");
            this.e.clear();
        } else {
            this.j = fghVarB.b();
            a(f, fghVarB.d(), fghVarB.b());
            this.e.clear();
        }
    }

    private fgh b(float f, int i, float f2, int i2) {
        float fA;
        fgh fghVarC;
        ReleaseLogUtil.d("HRControl_TreadmillHeartRateControlModel", "stageChangeSpeedCalculator, input: speed = ", Float.valueOf(f), " heartRate = ", Integer.valueOf(i), " runLevel = ", Float.valueOf(f2), " age = ", Integer.valueOf(i2));
        float fD = fgn.d(fgj.d(i), f2, i2);
        if (this.mCourseStageNo == 0) {
            fghVarC = fgj.c(fD, this.l);
            fA = fghVarC.d();
        } else {
            fgh fghVarE = fgj.e(fD, this.l);
            fA = fgj.a(f, fghVarE.d(), fD, new Pair(Float.valueOf(this.f34026b), Float.valueOf(this.f34025a)), this.l);
            fghVarC = fghVarE;
        }
        fghVarC.b(fgj.a(fA, 1));
        fghVarC.b(fgj.d(f, fghVarC.d()));
        ReleaseLogUtil.d("HRControl_TreadmillHeartRateControlModel", "mCourseStageNo = ", Integer.valueOf(this.mCourseStageNo), " stageChangeSpeedCalculator, output: getAdjustSpeed = ", Float.valueOf(fghVarC.d()), " getAdjustDuration = ", Integer.valueOf(fghVarC.b()));
        return fghVarC;
    }

    private fgh b(float f, int i, int i2, float f2, int i3) {
        fgh fghVarE;
        ReleaseLogUtil.d("HRControl_TreadmillHeartRateControlModel", "heartRateAdjustSpeedCalculator, input: speed = ", Float.valueOf(f), " heartRate = ", Integer.valueOf(i), " runLevel = ", Float.valueOf(f2), " age = ", Integer.valueOf(i3));
        int iA = fgj.a(i, i2);
        float fD = fgn.d(iA, f2, i3);
        int adjustMode = this.mSpeedControlConfigInfo != null ? this.mSpeedControlConfigInfo.getAdjustMode() : 0;
        LogUtil.d("HRControl_TreadmillHeartRateControlModel", "adjustMode is ", Integer.valueOf(adjustMode));
        if (adjustMode == 0) {
            fghVarE = fgj.e(fD, iA, new Pair(Integer.valueOf(this.mCourseStageHeartRateMin), Integer.valueOf(this.mCourseStageHeartRateMax)));
            fghVarE.b(fgj.a(fgj.e(f, fghVarE.d(), fD, new Pair(Float.valueOf(this.f34026b), Float.valueOf(this.f34025a))), 1));
        } else {
            fghVarE = fgj.e(f, i, new Pair(Integer.valueOf(this.mCourseStageHeartRateMin), Integer.valueOf(this.mCourseStageHeartRateMax)), this.mSpeedControlConfigInfo != null ? this.mSpeedControlConfigInfo.getAdjustSpeedMax() : 0.0f, this.mSpeedControlConfigInfo != null ? this.mSpeedControlConfigInfo.getHeartRateStableTime() : 0);
            fghVarE.b(fgj.a(fghVarE.d(), 1));
        }
        fghVarE.b(fgj.d(f, fghVarE.d()));
        ReleaseLogUtil.d("HRControl_TreadmillHeartRateControlModel", "heartRateAdjustSpeedCalculator, output: getAdjustSpeed = ", Float.valueOf(fghVarE.d()), " getAdjustDuration = ", Integer.valueOf(fghVarE.b()));
        return fghVarE;
    }

    private void a(float f, float f2, int i) {
        if (this.mCourseStageEndTime - this.mSportTime < i) {
            LogUtil.a("HRControl_TreadmillHeartRateControlModel", "remain duration less than bufferTime");
            return;
        }
        this.d = f2;
        HashMap map = new HashMap();
        map.put("MODEL_SPEED_CHANGE", Float.valueOf(f2));
        sendHeartRateModelCallback("HEART_RATE_MODEL_RESULT", map);
        if (Float.compare(f, f2) < 0) {
            sendHeartRateModelCallback("HEART_RATE_MODEL_STATUS", Integer.valueOf(this.f == 1 ? 1005 : 1007));
        }
        if (Float.compare(f, f2) > 0) {
            sendHeartRateModelCallback("HEART_RATE_MODEL_STATUS", Integer.valueOf(this.f == 1 ? 1006 : 1008));
        }
    }

    private boolean b(float f) {
        LogUtil.d("HRControl_TreadmillHeartRateControlModel", "judgeSpeedChangeByUser: mLastTimeSpeed = ", Float.valueOf(this.d), " speed = ", Float.valueOf(f));
        if (Float.compare(this.d, -1.0f) == 0) {
            this.d = f;
            return false;
        }
        if (this.h <= 1 && this.j <= 1) {
            if (Float.compare(this.d, f) != 0) {
                ReleaseLogUtil.d("HRControl_TreadmillHeartRateControlModel", "judgeSpeedChangeByUser: mLastTimeSpeed != speed");
                this.d = f;
                return true;
            }
            this.d = f;
        }
        return false;
    }
}
