package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwfoundationmodel.trackmodel.StepRateData;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.hau;
import defpackage.njy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.STEP_RATE_PRODUCER)
public class StepRateProducer extends BaseProducer implements SportLifecycle, SportDataNotify {
    private static final int GAIN_FOR_STEP_RATE = 6;
    private static final int MAX_STEP_RATE = 250;
    private static final int MINUTE_TO_MS = 60000;
    private static final int MIN_STEP_RATE = 0;
    private static final String TAG = "SportService_StepRateProducer";
    private int[] mStepInfo;
    private int mStepRate;
    private boolean mIsFirstIn = true;
    private CopyOnWriteArrayList<StepRateData> mStepRateList = new CopyOnWriteArrayList<>();
    private int[] mStepArray = {0, 0, 0, 0, 0, 0};
    private boolean mIsStepCountStop = false;
    private int mStepsWhenCountStop = 0;
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        if (BaseSportManager.getInstance().getStatus() == 1) {
            BaseSportManager.getInstance().stagingAndNotification("STEP_RATE_DATA", Integer.valueOf(this.mStepRate));
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        BaseSportManager.getInstance().stagingAndNotification("STEP_RATE_DATA", -1);
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
        this.mStepInfo = getStepInfo(this.mStepRateList);
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (data instanceof MotionPath) {
            MotionPath motionPath = (MotionPath) data;
            ArrayList<StepRateData> arrayList = new ArrayList<>(this.mStepRateList);
            motionPath.saveStepRateList(arrayList);
            LogUtil.a(TAG, "onStopSport MotionPath saveHeartRateList", Integer.valueOf(arrayList.size()));
            BaseSportManager.getInstance().stagingData(JsUtil.DataFunc.MOTION_PATH_DATA, motionPath);
        }
        Object data2 = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        if (data2 instanceof MotionPathSimplify) {
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data2;
            constructSimplify(motionPathSimplify);
            BaseSportManager.getInstance().stagingData("MOTION_PATH_SIMPLIFY_DATA", motionPathSimplify);
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void recoveryData() {
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (!(data instanceof MotionPath)) {
            LogUtil.e(TAG, "recovery failed. data not MotionPath type");
            return;
        }
        MotionPath motionPath = (MotionPath) data;
        if (njy.b(motionPath.requestStepRateList())) {
            this.mStepRateList.addAll(motionPath.requestStepRateList());
        }
        LogUtil.a(TAG, "recovery mStepRateList.size() ", Integer.valueOf(this.mStepRateList.size()));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("STEP_DATA");
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("TIME_ONE_SECOND_TIMESTAMP");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, this);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        onSaveData();
        cleanStepArray();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    private void cleanStepArray() {
        for (int i = 0; i < 6; i++) {
            this.mStepArray[i] = 0;
        }
        this.mStepRate = 0;
    }

    private void constructSimplify(MotionPathSimplify motionPathSimplify) {
        if (this.mStepRateList.size() > 1) {
            int[] iArr = this.mStepInfo;
            if (iArr != null && iArr.length > 1) {
                motionPathSimplify.saveBestStepRate(iArr[1]);
            }
        } else if (this.mStepRateList.size() > 0) {
            motionPathSimplify.saveBestStepRate(this.mStepRateList.get(0).acquireStepRate());
        } else {
            LogUtil.j(TAG, "mStepRateList is empty");
        }
        Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
        if (data instanceof Integer) {
            LogUtil.e(TAG, "during == 0L");
            return;
        }
        long jLongValue = ((Long) data).longValue() / 1000;
        Integer num = (Integer) BaseSportManager.getInstance().getData("STEP_DATA");
        int iIntValue = num.intValue();
        LogUtil.a(TAG, "totalStep =", num, "during =", Long.valueOf(jLongValue));
        int iFloor = (int) Math.floor(((iIntValue * 1.0f) / jLongValue) * 60.0f);
        if (this.mStepRateList.size() == 1 && this.mStepRateList.get(0).acquireStepRate() < iFloor) {
            iFloor = this.mStepRateList.get(0).acquireStepRate();
        }
        motionPathSimplify.saveAvgStepRate(iFloor);
        if (BaseSportManager.getInstance().getSportType() == 273) {
            String string = Integer.toString(iFloor / 2);
            HashMap map = new HashMap(1);
            map.put("crossTrainerCadence", string);
            motionPathSimplify.saveExtendDataMap(map);
        }
    }

    private int[] getStepInfo(CopyOnWriteArrayList<StepRateData> copyOnWriteArrayList) {
        int iAcquireStepRate;
        int[] iArr = new int[3];
        int iAcquireStepRate2 = 0;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            iAcquireStepRate = 0;
        } else {
            iAcquireStepRate = 0;
            for (StepRateData stepRateData : copyOnWriteArrayList) {
                if (stepRateData != null) {
                    iAcquireStepRate += stepRateData.acquireStepRate();
                    if (stepRateData.acquireStepRate() > iAcquireStepRate2) {
                        iAcquireStepRate2 = stepRateData.acquireStepRate();
                    }
                }
            }
        }
        iArr[1] = iAcquireStepRate2;
        iArr[2] = iAcquireStepRate;
        return iArr;
    }

    @Override // com.huawei.health.sportservice.SportDataNotify
    public void onChange(List<String> list, Map<String, Object> map) {
        if (list.contains("TIME_ONE_SECOND_DURATION")) {
            Long l = (Long) map.get("TIME_ONE_SECOND_DURATION");
            long jLongValue = l.longValue();
            int iIntValue = map.containsKey("STEP_DATA") ? ((Integer) map.get("STEP_DATA")).intValue() : 0;
            if (this.mIsFirstIn && jLongValue > 0) {
                fillStepRatePoint(jLongValue);
                this.mIsFirstIn = false;
            }
            if (needSaveStepRateList(jLongValue)) {
                LogUtil.a(TAG, "duration is ", l);
                long jLongValue2 = map.containsKey("TIME_ONE_SECOND_TIMESTAMP") ? ((Long) map.get("TIME_ONE_SECOND_TIMESTAMP")).longValue() : 0L;
                if (jLongValue2 == 0) {
                    return;
                } else {
                    addStepsToList(jLongValue2, iIntValue);
                }
            }
            if (jLongValue % 2000 == 0) {
                computeStepRateForShow(iIntValue);
            }
        }
    }

    private void fillStepRatePoint(long j) {
        LogUtil.a(TAG, "mIsFirstIn", Long.valueOf(j));
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = j;
        while (j / 60000 > this.mStepRateList.size()) {
            long j3 = jCurrentTimeMillis - j2;
            LogUtil.a(TAG, "currentTime - tempDuration", Long.valueOf(j3));
            this.mStepRateList.add(new StepRateData(j3, 0));
            j2 -= 60000;
        }
    }

    private boolean needSaveStepRateList(long j) {
        if (j <= 0 || j % 60000 != 0) {
            return !this.mIsFirstIn && ((long) this.mStepRateList.size()) < j / 60000;
        }
        return true;
    }

    private void addStepsToList(long j, int i) {
        if (njy.e(this.mStepRateList)) {
            this.mStepRateList.add(new StepRateData(j, i));
            return;
        }
        int iAcquireStepRate = 0;
        for (StepRateData stepRateData : this.mStepRateList) {
            if (stepRateData != null) {
                iAcquireStepRate += stepRateData.acquireStepRate();
            }
        }
        int i2 = i - iAcquireStepRate;
        LogUtil.a(TAG, "now will add steps into list: time is ", Long.valueOf(j), ",step:", Integer.valueOf(i2));
        this.mStepRateList.add(new StepRateData(j, i2));
    }

    private void computeStepRateForShow(int i) {
        addStepIntoArray(i);
        if (stepArrayIsFull()) {
            countStepRate();
        }
    }

    private void addStepIntoArray(int i) {
        if (stepArrayIsFull()) {
            int[] iArr = this.mStepArray;
            System.arraycopy(iArr, 1, iArr, 0, 5);
            this.mStepArray[5] = i;
        } else {
            for (int i2 = 0; i2 < 6; i2++) {
                int[] iArr2 = this.mStepArray;
                if (iArr2[i2] == 0) {
                    iArr2[i2] = i;
                    return;
                }
            }
        }
    }

    private boolean stepArrayIsFull() {
        return this.mStepArray[5] != 0;
    }

    private void countStepRate() {
        int[] iArr = this.mStepArray;
        int i = iArr[5];
        int i2 = iArr[0];
        if (i == i2) {
            this.mIsStepCountStop = true;
            this.mStepsWhenCountStop = i2;
            this.mStepRate = 0;
        } else {
            if (!this.mIsStepCountStop) {
                int i3 = (i - i2) * 6;
                if (i3 >= 0 && i3 <= 250) {
                    this.mStepRate = i3;
                } else {
                    this.mStepRate = 0;
                }
                onStagingAndNotification();
                return;
            }
            if (i2 != this.mStepsWhenCountStop) {
                this.mIsStepCountStop = false;
            }
        }
    }
}
