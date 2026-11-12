package com.huawei.health.sportservice.datasource;

import com.huawei.health.device.datatype.IntermitentJumpData;
import com.huawei.health.sportservice.SportLaunchParams;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.inter.IndoorToSource;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwsmartinteractmgr.data.SmartMsgConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.SKIP_GROUP_SOURCE)
public class SkipGroupSource extends BaseSource<Integer> implements SportLifecycle, IndoorToSource {
    private static final int ROPE_CONTROL_INTERMITTENT_REST = 2;
    private static final int ROPE_CONTROL_INTERMITTENT_SPORT = 1;
    private static final String TAG = "SportService_SkipGroupSource";
    private boolean isSendAccumulatedData;
    private int mActionGroup = 1;
    private int mCalorie;
    private IntermitentJumpData mIntermitentJumpData;
    private int mRopeStatus;
    private HashMap<Integer, Integer> mSkipCalorieMap;
    private int mSkipTimes;
    private HashMap<Integer, Integer> mSkipTimesMap;
    private int mSportTime;
    private HashMap<Integer, Integer> mSportTimeMap;
    private int mStumblingTimes;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        SportLaunchParams sportLaunchParams = (SportLaunchParams) BaseSportManager.getInstance().getParas(SportParamsType.SPORT_LAUNCH_PARAS);
        if (sportLaunchParams != null) {
            this.mIntermitentJumpData = (IntermitentJumpData) sportLaunchParams.getExtra("type_intermittent_jump_mode_data", IntermitentJumpData.class);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(SmartMsgConstant.MSG_TYPE_RIDE_USER));
        arrayList.add(40002);
        arrayList.add(40001);
        if (this.mIntermitentJumpData != null) {
            arrayList.add(40011);
            arrayList.add(6);
            arrayList.add(40051);
            arrayList.add(40052);
        }
        BaseSportManager.getInstance().subscribeToIndoorEquipment(arrayList, this);
    }

    @Override // com.huawei.health.sportservice.inter.IndoorToSource
    public void onIndoorDataChanged(int i, Object obj) {
        if (i == 40002) {
            if (obj instanceof Integer) {
                if (this.mIntermitentJumpData != null || this.mStumblingTimes < ((Integer) obj).intValue()) {
                    this.mStumblingTimes = ((Integer) obj).intValue();
                    BaseSportManager.getInstance().stagingAndNotification("STUMBLING_ROPE_DATA", Integer.valueOf(this.mStumblingTimes));
                    return;
                }
                return;
            }
            return;
        }
        if (i != 40005) {
            if (i == 40011) {
                if (obj instanceof Integer) {
                    Integer num = (Integer) obj;
                    if (num.intValue() > 0) {
                        BaseSportManager.getInstance().stagingAndNotification("ROPE_INTERMITTENT_GROUP_NO_DATA", obj);
                    }
                    if (this.mActionGroup < num.intValue()) {
                        sendResetData();
                    }
                    this.mActionGroup = num.intValue();
                    return;
                }
                return;
            }
            onSplitIndoorDataChanged(i, obj);
            return;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            this.mRopeStatus = iIntValue;
            if (iIntValue == 1) {
                this.isSendAccumulatedData = false;
            }
            if (iIntValue == 2 && this.mIntermitentJumpData != null && !this.isSendAccumulatedData) {
                skipRestNotification();
            }
            BaseSportManager.getInstance().stagingAndNotification("ROPE_MACHINE_STATUS_DATA", obj);
        }
    }

    private void sendResetData() {
        LogUtil.a(TAG, "sendResetData");
        BaseSportManager.getInstance().stagingAndNotification("SKIP_NUM_DATA", 0);
        BaseSportManager.getInstance().stagingAndNotification("ROPE_INTERMITTENT_JUMP_ENERGY_DATA", 0);
        BaseSportManager.getInstance().stagingAndNotification("ROPE_INTERMITTENT_JUMP_SPEED_DATA", 0);
        BaseSportManager.getInstance().stagingAndNotification("STUMBLING_ROPE_DATA", 0);
        BaseSportManager.getInstance().stagingAndNotification("SKIPPING_INTERMITTENT_REST_TIME_DATA", 0);
        BaseSportManager.getInstance().stagingAndNotification("ROPE_MACHINE_STATUS_DATA", 1);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:40:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    private void onSplitIndoorDataChanged(int i, Object obj) {
        Integer num;
        if (i == 6) {
            if (obj instanceof Integer) {
                this.mCalorie = ((Integer) obj).intValue();
                BaseSportManager.getInstance().stagingAndNotification("ROPE_INTERMITTENT_JUMP_ENERGY_DATA", obj);
                return;
            }
            return;
        }
        if (i == 40001) {
            if (obj instanceof Integer) {
                if (this.mIntermitentJumpData != null) {
                    Integer num2 = (Integer) obj;
                    if (this.mSkipTimes != num2.intValue()) {
                        this.mSkipTimes = num2.intValue();
                    } else {
                        num = (Integer) obj;
                        if (this.mSkipTimes >= num.intValue()) {
                            return;
                        } else {
                            this.mSkipTimes = num.intValue();
                        }
                    }
                } else {
                    num = (Integer) obj;
                    if (this.mSkipTimes >= num.intValue()) {
                        return;
                    } else {
                        this.mSkipTimes = num.intValue();
                    }
                }
                if (this.mRopeStatus != 2) {
                    BaseSportManager.getInstance().stagingAndNotification("SKIP_NUM_DATA", Integer.valueOf(this.mSkipTimes));
                    return;
                }
                return;
            }
            return;
        }
        switch (i) {
            case 40051:
                if (obj instanceof Integer) {
                    this.mSportTime = ((Integer) obj).intValue();
                    BaseSportManager.getInstance().stagingAndNotification("SKIPPING_INTERMITTENT_SPORT_TIME_DATA", obj);
                    break;
                }
                break;
            case 40052:
                BaseSportManager.getInstance().stagingAndNotification("SKIPPING_INTERMITTENT_REST_TIME_DATA", obj);
                break;
        }
    }

    private void skipRestNotification() {
        this.isSendAccumulatedData = true;
        int intermittentJumpGroups = this.mIntermitentJumpData.getIntermittentJumpGroups();
        if (this.mSportTimeMap == null) {
            this.mSportTimeMap = new HashMap<>(intermittentJumpGroups);
        }
        if (this.mSkipTimesMap == null) {
            this.mSkipTimesMap = new HashMap<>(intermittentJumpGroups);
        }
        if (this.mSkipCalorieMap == null) {
            this.mSkipCalorieMap = new HashMap<>(intermittentJumpGroups);
        }
        this.mSportTimeMap.put(Integer.valueOf(this.mActionGroup), Integer.valueOf(this.mSportTime));
        this.mSkipTimesMap.put(Integer.valueOf(this.mActionGroup), Integer.valueOf(this.mSkipTimes));
        this.mSkipCalorieMap.put(Integer.valueOf(this.mActionGroup), Integer.valueOf(this.mCalorie));
        BaseSportManager.getInstance().stagingAndNotification("SKIPPING_ACCUMULATED_DURATION_DATA", Integer.valueOf(calculateAccumulatedData(this.mSportTimeMap)));
        BaseSportManager.getInstance().stagingAndNotification("SKIPPING_ACCUMULATED_COUNT_DATA", Integer.valueOf(calculateAccumulatedData(this.mSkipTimesMap)));
        BaseSportManager.getInstance().stagingAndNotification("ROPE_ACCUMULATED_ENERGY_DATA", Integer.valueOf(calculateAccumulatedData(this.mSkipCalorieMap)));
        LogUtil.a(TAG, "-mTotalSportTime: ", Integer.valueOf(calculateAccumulatedData(this.mSportTimeMap)), "-mTotalSkipTimes:", Integer.valueOf(calculateAccumulatedData(this.mSkipTimesMap)), "-mTotalCalorie:", Integer.valueOf(calculateAccumulatedData(this.mSkipCalorieMap)));
    }

    private int calculateAccumulatedData(HashMap<Integer, Integer> map) {
        int iIntValue = 0;
        if (map != null && map.size() != 0) {
            Iterator<Integer> it = map.values().iterator();
            while (it.hasNext()) {
                iIntValue += it.next().intValue();
            }
        }
        return iIntValue;
    }
}
