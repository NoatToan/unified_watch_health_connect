package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.dmg;
import defpackage.dsm;
import defpackage.hau;
import defpackage.njg;
import defpackage.njy;
import defpackage.njz;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.SKIP_PRODUCER)
public class SkipProducer extends SkipBaseProducer implements SportLifecycle {
    private static final int DEFAULT_INVALIDATION_DATA = -1;
    private static final int HASHMAP_INSTANTANEOUS_VALUE_DEFAULT_SIZE = 11;
    private static final int HASHMAP_INSTANTANEOUS_VALUE_MAX_SIZE = 10;
    private static final int INITIAL_TIME = -1;
    private static final int INTERVAL_FIVE = 5;
    private static final int INTERVAL_THREE = 3;
    private static final int MAP_INDEX_EIGHT = 8;
    private static final int MAP_INDEX_FOUR = 4;
    private static final int MAP_INDEX_NINE = 9;
    private static final int MAP_INDEX_SEVEN = 7;
    private static final int ROPE_PAUSE_HASHMAP_CLEAR_TIME = 5;
    private static final String TAG = "SportService_SkipProducer";
    private static final int TIME_INTERVAL = 1;
    private int mContinuousJumpTimes;
    private volatile int mExtraInterruptTimes;
    private int mInterruptTimes;
    private boolean mIsSupportPerformanceRope;
    private int mMaxContinuousJumpTimes;
    private long mMaxJumpTimePoint;
    private dsm mRopeSkippingTrick;
    private float mSkipSpeed;
    private int mSkippingTimes;
    private SportLaunchParams mSportLaunchParams;
    private int mLastSkipperTime = -1;
    private int mSportTarget = -1;
    private int mSkippingMode = -1;
    private Map<Integer, Integer> mSkipperNumberMap = new HashMap(11);
    private CopyOnWriteArrayList<njg> mSkippingSpeedList = new CopyOnWriteArrayList<>();
    private hau mSportCallbackOption = new hau();
    private LinkedList<Integer> mSkipSpeedLink = new LinkedList<>();

    static /* synthetic */ int access$808(SkipProducer skipProducer) {
        int i = skipProducer.mExtraInterruptTimes;
        skipProducer.mExtraInterruptTimes = i + 1;
        return i;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        SportLaunchParams sportLaunchParams = (SportLaunchParams) BaseSportManager.getInstance().getParas(SportParamsType.SPORT_LAUNCH_PARAS);
        this.mSportLaunchParams = sportLaunchParams;
        if (sportLaunchParams == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.mIsSupportPerformanceRope = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).isSupportPerformanceByProductId(dmg.a().getProductId());
        BaseSportManager.getInstance().stagingAndNotification("IsSecondRope", Boolean.valueOf(this.mIsSupportPerformanceRope));
        int sportTarget = this.mSportLaunchParams.getSportTarget();
        this.mSportTarget = sportTarget;
        if (sportTarget != 8) {
            arrayList.add("TIME_FIVE_SECOND_DURATION");
        }
        arrayList.add("TIME_ONE_SECOND_DURATION");
        arrayList.add("SKIP_NUM_DATA");
        arrayList.add("STUMBLING_ROPE_DATA");
        arrayList.add("INSTANTANEOUS_SPEED");
        arrayList.add("CONTINUOUS_SKIPPING_JUMP_DATA");
        arrayList.add("ROPE_SKIPPING_MODE_DATA");
        arrayList.add("SKIPPING_SPEED_SECONDS_DATA");
        arrayList.add("ROPE_SKIPPING_TRICK_DATA");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SkipFiveSecond());
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onResumeSport() {
        if (BaseSportManager.getInstance().getDataSource() == 7) {
            int i = this.mInterruptTimes + 1;
            this.mInterruptTimes = i;
            LogUtil.a(TAG, "onResumeSport() mInterruptTimes: ", Integer.valueOf(i));
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        this.mSkipperNumberMap.clear();
        BaseSportManager.getInstance().stagingAndNotification("SKIP_SPEED_DATA", 0);
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        onSaveData();
        if (this.mIsSupportPerformanceRope && this.mSportTarget != 8 && BaseSportManager.getInstance().getDataSource() != 7) {
            stopCalculateSpeedPerformanceScore();
        }
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }

    private int checkSkipTimeToGoal(int i) {
        int targetValue = (int) BaseSportManager.getInstance().getTargetValue();
        return (this.mSportTarget != 5 || i <= targetValue) ? i : targetValue;
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
        LogUtil.a(TAG, "onStopSport skip start onSaveData()");
        HashMap map = new HashMap();
        if (this.mSportTarget == 7) {
            addPatternRopeMap(map);
        }
        int i = this.mSkippingMode;
        if (i != -1) {
            map.put("skippingMode", String.valueOf(i));
        }
        map.put("maxSkippingTimes", String.valueOf(this.mMaxContinuousJumpTimes));
        Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
        int iCalculateAverageSkippingSpeed = calculateAverageSkippingSpeed(this.mSkippingTimes, data instanceof Long ? ((Long) data).longValue() : 0L);
        boolean z = this.mSportTarget == 8;
        if (!z) {
            map.put("skipSpeed", String.valueOf(iCalculateAverageSkippingSpeed));
            map.put("interruptTimes", String.valueOf(adjustFinalInterruptTimes()));
            map.put("skipNum", String.valueOf(checkSkipTimeToGoal(this.mSkippingTimes)));
        }
        map.put("maxJumpsTime", String.valueOf(this.mMaxJumpTimePoint));
        Object data2 = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        if (data2 instanceof MotionPathSimplify) {
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data2;
            if (!z) {
                motionPathSimplify.saveAbnormalTrack(njz.e(iCalculateAverageSkippingSpeed, this.mSkippingSpeedList));
            }
            motionPathSimplify.saveExtendDataMap(map);
            motionPathSimplify.saveHasTrackPoint(false);
            motionPathSimplify.saveSportDataSource(BaseSportManager.getInstance().getDataSource() != 5 ? 7 : 5);
            motionPathSimplify.saveChiefSportDataType(7);
            motionPathSimplify.saveTrackType(0);
            BaseSportManager.getInstance().stagingData("MOTION_PATH_SIMPLIFY_DATA", motionPathSimplify);
        }
        Object data3 = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (data3 instanceof MotionPath) {
            MotionPath motionPath = (MotionPath) data3;
            if (!z) {
                motionPath.saveSkippingSpeed(this.mSkippingSpeedList);
            }
            BaseSportManager.getInstance().stagingData(JsUtil.DataFunc.MOTION_PATH_DATA, motionPath);
        }
    }

    private void addPatternRopeMap(Map<String, String> map) {
        dsm dsmVar = this.mRopeSkippingTrick;
        if (dsmVar != null) {
            map.put("singleShakeNum", String.valueOf(dsmVar.e()));
            map.put("doubleShakeNum", String.valueOf(this.mRopeSkippingTrick.d()));
            map.put("tripleShakeNum", String.valueOf(this.mRopeSkippingTrick.c()));
        }
    }

    class SkipFiveSecond implements SportDataNotify {
        private SkipFiveSecond() {
        }

        @Override // com.huawei.health.sportservice.SportDataNotify
        public void onChange(List<String> list, Map<String, Object> map) {
            if (list.contains("TIME_FIVE_SECOND_DURATION")) {
                if (SkipProducer.this.mSkipSpeed >= 0.0f) {
                    SkipProducer.this.mSkippingSpeedList.add(new njg(((Long) map.get("TIME_FIVE_SECOND_DURATION")).longValue(), Math.round(SkipProducer.this.mSkipSpeed)));
                    return;
                }
                return;
            }
            if (list.contains("TIME_ONE_SECOND_DURATION")) {
                if (SkipProducer.this.mSportTarget == 8) {
                    return;
                }
                Object obj = map.get("SKIP_NUM_DATA");
                if (obj instanceof Integer) {
                    int iIntValue = ((Integer) obj).intValue();
                    Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
                    long jLongValue = data instanceof Long ? ((Long) data).longValue() : 0L;
                    BaseSportManager.getInstance().stagingAndNotification("SKIPPING_AVG_SPEED_DATA", Integer.valueOf(SkipProducer.this.calculateAverageSkippingSpeed(iIntValue, jLongValue)));
                    if (SkipProducer.this.mSportTarget == 7) {
                        SkipProducer skipProducer = SkipProducer.this;
                        skipProducer.mSkipSpeed = skipProducer.calculateInstantaneousValue(jLongValue / 1000);
                        LogUtil.a(SkipProducer.TAG, "getInstantaneousValue mSkipSpeed: ", Float.valueOf(SkipProducer.this.mSkipSpeed));
                        BaseSportManager.getInstance().stagingAndNotification("SKIP_SPEED_DATA", Integer.valueOf((int) SkipProducer.this.mSkipSpeed));
                        SkipProducer skipProducer2 = SkipProducer.this;
                        skipProducer2.calculateSpeedPerformanceScore(jLongValue, skipProducer2.mSkippingTimes);
                        SkipProducer.this.calculateEnduranceValue();
                        return;
                    }
                    SkipProducer skipProducer3 = SkipProducer.this;
                    skipProducer3.mSkipSpeed = skipProducer3.getInstantaneousValue(iIntValue, jLongValue);
                    LogUtil.a(SkipProducer.TAG, "getInstantaneousValue mSkipSpeed: ", Float.valueOf(SkipProducer.this.mSkipSpeed));
                    BaseSportManager.getInstance().stagingAndNotification("SKIP_SPEED_DATA", Integer.valueOf((int) SkipProducer.this.mSkipSpeed));
                    SkipProducer skipProducer4 = SkipProducer.this;
                    skipProducer4.calculatePerformanceScore(map, (int) skipProducer4.mSkipSpeed);
                    return;
                }
                return;
            }
            onChangeSplit(list, map);
        }

        private void onChangeSplit(List<String> list, Map<String, Object> map) {
            if (list.contains("SKIP_NUM_DATA")) {
                Object obj = map.get("SKIP_NUM_DATA");
                if (obj instanceof Integer) {
                    SkipProducer.this.mSkippingTimes = ((Integer) obj).intValue();
                    LogUtil.a(SkipProducer.TAG, "SkipFiveSecond mSkippingTimes: ", Integer.valueOf(SkipProducer.this.mSkippingTimes));
                    SkipProducer.this.mExtraInterruptTimes = 0;
                    return;
                }
                return;
            }
            if (list.contains("STUMBLING_ROPE_DATA")) {
                Object obj2 = map.get("STUMBLING_ROPE_DATA");
                if (obj2 instanceof Integer) {
                    SkipProducer.this.mInterruptTimes = ((Integer) obj2).intValue();
                    SkipProducer.this.mSkipperNumberMap.clear();
                    LogUtil.a(SkipProducer.TAG, "SkipFiveSecond mInterruptTimes: ", Integer.valueOf(SkipProducer.this.mInterruptTimes));
                    SkipProducer.access$808(SkipProducer.this);
                    return;
                }
                return;
            }
            if (list.contains("ROPE_SKIPPING_MODE_DATA")) {
                Object obj3 = map.get("ROPE_SKIPPING_MODE_DATA");
                if (obj3 instanceof Integer) {
                    SkipProducer.this.mSkippingMode = ((Integer) obj3).intValue();
                    return;
                }
                return;
            }
            if (list.contains("ROPE_SKIPPING_TRICK_DATA")) {
                Object obj4 = map.get("ROPE_SKIPPING_TRICK_DATA");
                if (obj4 instanceof dsm) {
                    SkipProducer.this.mRopeSkippingTrick = (dsm) obj4;
                    return;
                }
                return;
            }
            if (list.contains("CONTINUOUS_SKIPPING_JUMP_DATA")) {
                Object obj5 = map.get("CONTINUOUS_SKIPPING_JUMP_DATA");
                if (obj5 instanceof Integer) {
                    SkipProducer.this.mContinuousJumpTimes = ((Integer) obj5).intValue();
                    SkipProducer.this.calculateContinuousJumpsTime();
                    return;
                }
                return;
            }
            if (list.contains("INSTANTANEOUS_SPEED")) {
                Object obj6 = map.get("INSTANTANEOUS_SPEED");
                if (SkipProducer.this.mSportTarget != 7) {
                    return;
                }
                if (SkipProducer.this.mSpeedList == null) {
                    SkipProducer.this.mSpeedList = new CopyOnWriteArrayList<>();
                }
                if (obj6 instanceof Integer) {
                    CopyOnWriteArrayList<Integer> copyOnWriteArrayList = SkipProducer.this.mSpeedList;
                    Integer num = (Integer) obj6;
                    num.intValue();
                    copyOnWriteArrayList.add(num);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x004a A[LOOP:0: B:14:0x0044->B:16:0x004a, LOOP_END] */
    public int calculateInstantaneousValue(long j) {
        Iterator<Integer> it;
        int iIntValue;
        Integer num = (Integer) BaseSportManager.getInstance().getData("INSTANTANEOUS_SPEED");
        int iIntValue2 = num.intValue();
        if (j > 6) {
            this.mSkipSpeedLink.addLast(num);
            if (this.mSkipSpeedLink.size() > 3) {
                this.mSkipSpeedLink.removeFirst();
                it = this.mSkipSpeedLink.iterator();
                iIntValue = 0;
                while (it.hasNext()) {
                    iIntValue += it.next().intValue();
                }
                return iIntValue / 3;
            }
            return iIntValue2;
        }
        if (j != 6) {
            if (j > 3) {
                this.mSkipSpeedLink.addLast(num);
                return iIntValue2;
            }
            return iIntValue2;
        }
        this.mSkipSpeedLink.addLast(num);
        it = this.mSkipSpeedLink.iterator();
        iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue / 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculatePerformanceScore(Map<String, Object> map, int i) {
        if (this.mIsSupportPerformanceRope) {
            LogUtil.d(TAG, "calculatePerformanceScore");
            if (i >= 70) {
                this.mEnduranceValue++;
                BaseSportManager.getInstance().stagingData("EnduranceValue", Integer.valueOf(this.mEnduranceValue));
            }
            Object obj = map.get("TIME_ONE_SECOND_DURATION");
            if (obj instanceof Long) {
                calculateSpeedPerformanceScore(((Long) obj).longValue(), this.mSkippingTimes);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void calculateContinuousJumpsTime() {
        Object data = BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION");
        int i = this.mContinuousJumpTimes;
        if (i <= this.mMaxContinuousJumpTimes || !(data instanceof Long)) {
            return;
        }
        this.mMaxContinuousJumpTimes = i;
        this.mMaxJumpTimePoint = ((Long) data).longValue();
        BaseSportManager.getInstance().stagingData("MaxContinuousJumpTimes", Integer.valueOf(this.mMaxContinuousJumpTimes));
        BaseSportManager.getInstance().stagingData("MaxJumpTimePoint", Long.valueOf(this.mMaxJumpTimePoint));
    }

    private int adjustFinalInterruptTimes() {
        int i;
        LogUtil.a(TAG, "adjustFinalInterruptTimes() mInterruptTimes: ", Integer.valueOf(this.mInterruptTimes), ", mExtraInterruptTimes: ", Integer.valueOf(this.mExtraInterruptTimes));
        if (BaseSportManager.getInstance().getDataSource() == 5) {
            return this.mInterruptTimes;
        }
        if (this.mExtraInterruptTimes >= 1) {
            i = this.mInterruptTimes - 1;
        } else {
            i = this.mInterruptTimes;
        }
        return Math.max(i, 0);
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void recoveryData() {
        Object data = BaseSportManager.getInstance().getData("MaxContinuousJumpTimes");
        if (data instanceof Integer) {
            int iIntValue = ((Integer) data).intValue();
            this.mMaxContinuousJumpTimes = iIntValue;
            LogUtil.a(TAG, "recoveryData() mMaxContinuousJumpTimes: ", Integer.valueOf(iIntValue));
        }
        Object data2 = BaseSportManager.getInstance().getData("MaxJumpTimePoint");
        if (data2 instanceof Long) {
            long jLongValue = ((Long) data2).longValue();
            this.mMaxJumpTimePoint = jLongValue;
            LogUtil.a(TAG, "recoveryData() mMaxJumpTimePoint: ", Long.valueOf(jLongValue));
        }
        Object data3 = BaseSportManager.getInstance().getData("STUMBLING_ROPE_DATA");
        boolean z = data3 instanceof Integer;
        if (z) {
            int iIntValue2 = ((Integer) data3).intValue();
            this.mInterruptTimes = iIntValue2;
            LogUtil.a(TAG, "recoveryData() interruptTimes: ", Integer.valueOf(iIntValue2));
        }
        Object data4 = BaseSportManager.getInstance().getData("SKIP_NUM_DATA");
        if (z) {
            int iIntValue3 = ((Integer) data4).intValue();
            this.mSkippingTimes = iIntValue3;
            LogUtil.a(TAG, "recoveryData() skippingTimes: ", Integer.valueOf(iIntValue3));
        }
        Object data5 = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (data5 instanceof MotionPath) {
            MotionPath motionPath = (MotionPath) data5;
            if (njy.b(motionPath.requestSkippingSpeedList()) && (motionPath.requestSkippingSpeedList() instanceof CopyOnWriteArrayList)) {
                this.mSkippingSpeedList = (CopyOnWriteArrayList) motionPath.requestSkippingSpeedList();
            }
        }
        Object data6 = BaseSportManager.getInstance().getData("IsSecondRope");
        if (data6 instanceof Boolean) {
            boolean zBooleanValue = ((Boolean) data6).booleanValue();
            this.mIsSupportPerformanceRope = zBooleanValue;
            LogUtil.a(TAG, "recoveryData() isSecondRope: ", Boolean.valueOf(zBooleanValue));
        }
        if (this.mIsSupportPerformanceRope) {
            recoveryPerformanceScoreData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getInstantaneousValue(int i, long j) {
        float instantaneousValue;
        int i2 = (int) (j / 1000);
        int i3 = this.mLastSkipperTime;
        if (i3 != -1 && Math.abs(i2 - i3) > 1) {
            this.mSkipperNumberMap.clear();
        }
        if (!this.mSkipperNumberMap.containsKey(Integer.valueOf(i2))) {
            this.mLastSkipperTime = i2;
            this.mSkipperNumberMap.put(Integer.valueOf(i2), Integer.valueOf(i));
        }
        if (this.mSkipperNumberMap.size() > 10) {
            this.mSkipperNumberMap.remove(Integer.valueOf(i2 - 10));
        }
        if (isRopeSkippingPaused(i)) {
            this.mSkipperNumberMap.clear();
        }
        if (this.mSkipperNumberMap.size() >= 4 && this.mSkipperNumberMap.size() < 7) {
            instantaneousValue = getInstantaneousValue(i2, 4, 3);
        } else if (this.mSkipperNumberMap.size() >= 7 && this.mSkipperNumberMap.size() < 10) {
            instantaneousValue = getInstantaneousValue(i2, 7, 5);
        } else if (this.mSkipperNumberMap.size() == 10) {
            instantaneousValue = ((getInstantaneousValue(i2, 10, 5) + getInstantaneousValue(i2, 9, 5)) + getInstantaneousValue(i2, 8, 5)) / 3.0f;
        } else {
            LogUtil.a(TAG, "getInstantaneousValue default");
            instantaneousValue = 0.0f;
        }
        return (int) instantaneousValue;
    }

    private float getInstantaneousValue(int i, int i2, int i3) {
        if (i3 <= 0) {
            return 0.0f;
        }
        int size = i - (this.mSkipperNumberMap.size() - i2);
        int i4 = size - i3;
        int iIntValue = this.mSkipperNumberMap.containsKey(Integer.valueOf(size)) ? this.mSkipperNumberMap.get(Integer.valueOf(size)).intValue() : 0;
        int iIntValue2 = this.mSkipperNumberMap.containsKey(Integer.valueOf(i4)) ? this.mSkipperNumberMap.get(Integer.valueOf(i4)).intValue() : 0;
        float f = ((iIntValue - iIntValue2) / i3) * 60.0f;
        LogUtil.a(TAG, "getInstantaneousValue maxValue", Integer.valueOf(iIntValue), ",minValue = ", Integer.valueOf(iIntValue2), "instantaneousValue = ", Float.valueOf(f));
        return f;
    }

    private boolean isRopeSkippingPaused(int i) {
        if (this.mSkipperNumberMap.size() > 5) {
            Iterator<Map.Entry<Integer, Integer>> it = this.mSkipperNumberMap.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (it.next().getValue().intValue() == i) {
                    i2++;
                }
            }
            if (i2 >= 5) {
                return true;
            }
        }
        return false;
    }
}
