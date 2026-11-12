package defpackage;

import com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginfitnessadvice.ChoreographedSingleAction;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes28.dex */
public class fgk extends BaseHeartRateControlModel {
    private float g;
    private boolean n;
    private float p;
    private int r;
    private int o = 50;
    private int q = 3;
    private int k = 30;
    private float j = 0.5f;
    private int e = -1;
    private int d = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34024c = -1;
    private final List<Integer> m = new ArrayList();
    private final List<Integer> f = new ArrayList();
    private final List<Integer> i = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<Integer> f34022a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private fgg f34023b = new fgg();
    private int l = 0;
    private AtomicBoolean h = new AtomicBoolean(false);
    private int t = 0;
    private int s = 0;

    @Override // com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel
    public void initParas() {
        int iH = fgp.d().h();
        float fJ = fgp.d().j();
        this.g = fgi.a(iH, fJ);
        float fD = fgi.d(iH, fJ);
        this.p = fD;
        LogUtil.a("HRControl_BikeHeartRateControlModel", "initParas vo2Max = ", Integer.valueOf(iH), ", weight = ", Float.valueOf(fJ), ", mHeartRatePowerFactor = ", Float.valueOf(this.g), ", mRpmPowerFactor = ", Float.valueOf(fD));
    }

    @Override // com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel
    public void setCourseConfigInfo(fgf fgfVar) {
        super.setCourseConfigInfo(fgfVar);
        LogUtil.a("HRControl_BikeHeartRateControlModel", "setCourseConfigInfo configInfo = ", fgfVar);
        if (fgfVar != null) {
            this.r = fgfVar.getMaxPower();
            this.o = fgfVar.getLowerLimitRpm();
            this.q = fgfVar.getMaxChangedNumber();
            this.k = fgfVar.getCheckSustainTime();
            this.j = fgfVar.getAbnormalHeartRateRatio();
        }
        LogUtil.a("HRControl_BikeHeartRateControlModel", "setCourseConfigInfo mMaxPower = ", Integer.valueOf(this.r), ", mLowerRpmLimit = ", Integer.valueOf(this.o), ", mMaxChangeNum = ", Integer.valueOf(this.q), ", mJudgeSustainTime = ", Integer.valueOf(this.k), ", mInvalidHeartRateRatioLimit = ", Float.valueOf(this.j));
    }

    @Override // com.huawei.health.heartratecontrol.algorithm.BaseHeartRateControlModel
    public void setCourseStageInfo(int i, ChoreographedSingleAction choreographedSingleAction) {
        super.setCourseStageInfo(i, choreographedSingleAction);
        if (choreographedSingleAction != null) {
            g();
        }
    }

    public void b(int i, int i2, int i3, int i4, int i5) {
        LogUtil.a("HRControl_BikeHeartRateControlModel", "onDeviceDataChanged time = ", Integer.valueOf(i), ", heartRate = ", Integer.valueOf(i2), ", power = ", Integer.valueOf(i3), ", rpm = ", Integer.valueOf(i4), ", resistance = ", Integer.valueOf(i5));
        if (this.mIsRestart) {
            ReleaseLogUtil.d("R_HRControl_BikeHeartRateControlModel", "onDeviceDataChanged restart not support control");
            return;
        }
        if (this.mSpeedControlConfigInfo != null) {
            LogUtil.a("HRControl_BikeHeartRateControlModel", "onDeviceDataChanged mIsCourseFinished = ", Boolean.valueOf(this.mIsCourseFinished));
            if (this.mIsCourseFinished) {
                return;
            }
            this.mSportTime = i;
            this.e = i2;
            this.d = i3;
            this.f34024c = i4;
            a(i4);
            LogUtil.a("HRControl_BikeHeartRateControlModel", "onDeviceDataChanged mLockStatus = ", Integer.valueOf(this.mLockStatus));
            if (this.mLockStatus == 0 && !d()) {
                e(i5, i2);
                LogUtil.a("HRControl_BikeHeartRateControlModel", "onDeviceDataChanged mAdjustResult.getStableTime = ", Integer.valueOf(this.f34023b.e()));
                if (this.f34023b.e() > 0) {
                    fgg fggVar = this.f34023b;
                    fggVar.a(fggVar.e() - 1);
                    return;
                } else {
                    c(i2);
                    return;
                }
            }
            return;
        }
        ReleaseLogUtil.d("R_HRControl_BikeHeartRateControlModel", "onDeviceDataChanged CourseConfigInfo is null");
    }

    private void e(int i, int i2) {
        if (i2 == 0 || i2 == 255) {
            return;
        }
        if ((i2 < this.mCourseStageHeartRateMin || i2 > this.mCourseStageHeartRateMax) && this.h.get()) {
            if (this.l == 0) {
                this.l = i;
            }
            int i3 = this.t + 1;
            this.t = i3;
            if (i3 < 3) {
                return;
            }
            this.t = 0;
            if (this.l != i) {
                this.l = i;
                f();
                LogUtil.a("HRControl_BikeHeartRateControlModel", "upperPowerAccordResistance resistance has changed, no need to adjust ");
            } else {
                int i4 = this.s;
                if (i4 > 7) {
                    LogUtil.a("HRControl_BikeHeartRateControlModel", "upperPowerAccordResistance has reach limit ");
                } else {
                    this.s = i4 + 1;
                    c();
                }
            }
        }
    }

    private void f() {
        this.s = 0;
        this.h.set(false);
    }

    private void a(int i) {
        LogUtil.a("HRControl_BikeHeartRateControlModel", "lowerRmpRemindJudge rpm = ", Integer.valueOf(i), ", mLowerRpmLimit = ", Integer.valueOf(this.o), ", mIsLowerRpmOfLast = ", Boolean.valueOf(this.n), ", mLowerRpmList.size = ", Integer.valueOf(this.m.size()));
        if (njy.e(this.m)) {
            if (i >= this.o) {
                this.n = false;
                return;
            } else if (this.n) {
                return;
            }
        }
        this.m.add(Integer.valueOf(i));
        if (this.m.size() >= 20) {
            int iD = d(this.m);
            LogUtil.a("HRControl_BikeHeartRateControlModel", "lowerRmpRemindJudge avgRpm = ", Integer.valueOf(iD));
            if (iD < this.o) {
                this.n = true;
                callbackAdjustStatus(1004);
            }
            this.m.clear();
        }
    }

    private void c(int i) {
        LogUtil.a("HRControl_BikeHeartRateControlModel", "heartRateJudge heartRate = ", Integer.valueOf(i), ", mHeartRateList.size = ", Integer.valueOf(this.f.size()));
        if (njy.e(this.f)) {
            if (i == 0 || i == 255) {
                LogUtil.a("HRControl_BikeHeartRateControlModel", "heartRateJudge mIsWear = ", Boolean.valueOf(this.mIsWear));
                if (this.mIsWear) {
                    checkWearStatus();
                    return;
                }
                return;
            }
            this.mIsWear = true;
            LogUtil.a("HRControl_BikeHeartRateControlModel", "heartRateJudge mCourseStageHeartRateMin = ", Integer.valueOf(this.mCourseStageHeartRateMin), ", mCourseStageHeartRateMax = ", Integer.valueOf(this.mCourseStageHeartRateMax));
            if (i >= this.mCourseStageHeartRateMin && i <= this.mCourseStageHeartRateMax) {
                return;
            }
        }
        if (i == 0 || i == 255) {
            this.f.add(Integer.valueOf(i));
            this.f34022a.add(Integer.valueOf(i));
        } else {
            this.f.add(Integer.valueOf(i));
            this.i.add(Integer.valueOf(i));
        }
        LogUtil.a("HRControl_BikeHeartRateControlModel", "heartRateJudge mHeartRateList.size = ", Integer.valueOf(this.f.size()), ",mJudgeSustainTime = ", Integer.valueOf(this.k));
        if (this.f.size() >= this.k) {
            a();
        }
    }

    private void a() {
        LogUtil.a("HRControl_BikeHeartRateControlModel", "computeAndAdjust mCurrentRpm = ", Integer.valueOf(this.f34024c), ", mLowerRpmLimit = ", Integer.valueOf(this.o), ", mCurrentPower = ", Integer.valueOf(this.d));
        int i = this.f34024c;
        if (i < this.o && this.d >= fgi.e(this.p, i)) {
            this.f34023b.e(0);
            this.f34023b.a(30);
        } else {
            float fFloatValue = new BigDecimal(this.f34022a.size()).divide(new BigDecimal(this.f.size()), 1, 4).floatValue();
            LogUtil.a("HRControl_BikeHeartRateControlModel", "computeAndAdjust invalidHeartRateRatio = ", Float.valueOf(fFloatValue), ", mInvalidHeartRateRatioLimit = ", Float.valueOf(this.j));
            if (Float.compare(fFloatValue, this.j) > 0) {
                callbackAdjustStatus(1002);
                e();
                return;
            }
            int iD = d(this.i);
            LogUtil.a("HRControl_BikeHeartRateControlModel", "computeAndAdjust avgHeartRate = ", Integer.valueOf(iD), ", mCourseStageHeartRateMin = ", Integer.valueOf(this.mCourseStageHeartRateMin), ", mCourseStageHeartRateMax = ", Integer.valueOf(this.mCourseStageHeartRateMax));
            if (iD >= this.mCourseStageHeartRateMin && iD <= this.mCourseStageHeartRateMax) {
                e();
                return;
            }
            List<Integer> list = this.i;
            int iIntValue = list.get(list.size() - 1).intValue();
            this.f34023b = fgi.e(this.f34023b, iIntValue, this.mTargetHeartRate, fgi.b(iIntValue, this.mCourseStageHeartRateMin, this.mCourseStageHeartRateMax), this.g);
        }
        b();
        e();
    }

    private void e() {
        this.f.clear();
        this.f34022a.clear();
        this.i.clear();
    }

    private void g() {
        if (this.mIsRestart) {
            ReleaseLogUtil.d("R_HRControl_BikeHeartRateControlModel", "onCourseStageChanged restart not support control");
            return;
        }
        if (this.mSportTime < 0 || this.e < 0 || this.d < 0 || this.f34024c < 0) {
            return;
        }
        LogUtil.a("HRControl_BikeHeartRateControlModel", "onCourseStageChanged mSpeedControlConfigInfo = ", this.mSpeedControlConfigInfo, ", mLockStatus = ", Integer.valueOf(this.mLockStatus), ", mCourseStageNo = ", Integer.valueOf(this.mCourseStageNo));
        if (this.mSpeedControlConfigInfo == null || this.mLockStatus == 2) {
            return;
        }
        e();
        if (this.mLockStatus == 1) {
            this.mLockStatus = 0;
        }
        if (this.mCourseStageNo == 0) {
            this.f34024c = 60;
        }
        f();
        LogUtil.a("HRControl_BikeHeartRateControlModel", "onCourseStageChanged mCurrentRpm = ", Integer.valueOf(this.f34024c), ", mLowerRpmLimit = ", Integer.valueOf(this.o), ", mCurrentPower = ", Integer.valueOf(this.d));
        int i = this.f34024c;
        if (i < this.o && this.d >= fgi.e(this.p, i)) {
            fgg fggVar = new fgg();
            this.f34023b = fggVar;
            fggVar.e(0);
            this.f34023b.a(30);
        } else {
            this.f34023b = fgi.b(new fgg(), this.e, this.mTargetHeartRate, fgi.b(this.e, this.mCourseStageHeartRateMin, this.mCourseStageHeartRateMax), this.g);
        }
        b();
    }

    private int d(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return new BigDecimal(iIntValue).divide(new BigDecimal(list.size()), RoundingMode.HALF_UP).intValue();
    }

    private boolean d() {
        LogUtil.a("HRControl_BikeHeartRateControlModel", "isReachedLimit changedNum = ", Integer.valueOf(this.f34023b.b()), ", mMaxChangeNum = ", Integer.valueOf(this.q), ", changedPowerTotal = ", Integer.valueOf(this.f34023b.c()), ", CHANGE_POWER_LIMIT = ", 150);
        return this.f34023b.b() >= this.q || this.f34023b.c() > 150;
    }

    private void b() {
        LogUtil.a("HRControl_BikeHeartRateControlModel", "callbackAdjustResult mCourseStageEndTime = ", Integer.valueOf(this.mCourseStageEndTime), ", mSportTime = ", Integer.valueOf(this.mSportTime));
        if (this.mCourseStageEndTime - this.mSportTime < this.f34023b.e()) {
            return;
        }
        LogUtil.a("HRControl_BikeHeartRateControlModel", "callbackAdjustResult adjustOrientation = ", Integer.valueOf(this.f34023b.a()));
        if (this.f34023b.a() == 0) {
            return;
        }
        c();
    }

    private void c() {
        if (this.mCourseStageEndTime - this.mSportTime < this.f34023b.e()) {
            return;
        }
        int iD = this.d + ((this.s + 1) * this.f34023b.d());
        LogUtil.a("HRControl_BikeHeartRateControlModel", "callbackAdjustResult resultPower = ", Integer.valueOf(iD), " curPower ", Integer.valueOf(this.d), " changeNum ", Integer.valueOf(this.s), "  changePower ", Integer.valueOf(this.f34023b.d()), ", mMaxPower = ", Integer.valueOf(this.r));
        if (iD > this.r) {
            return;
        }
        HashMap map = new HashMap();
        map.put("RESULT_POWER", Integer.valueOf(iD));
        map.put("RESULT_RPM", Integer.valueOf(this.f34024c));
        if (this.mCallback != null) {
            this.mCallback.onDataUpdate("HEART_RATE_MODEL_RESULT", map);
            this.h.set(true);
        }
    }
}
