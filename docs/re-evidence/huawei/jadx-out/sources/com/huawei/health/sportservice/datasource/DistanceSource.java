package com.huawei.health.sportservice.datasource;

import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.inter.IndoorToSource;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.DISTANCE_SOURCE)
public class DistanceSource extends BaseSource<Integer> implements SportLifecycle, IndoorToSource {
    private static final float DISTANCE_COEFFICIENT = 6.214E-4f;
    private static final int JUMP_LONG_DISTANCE = 200;
    private static final int JUMP_SHORT_DISTANCE = 100;
    private static final int JUMP_SHORT_TIME = 5;
    private static final String TAG = "SportService_DistanceSource";
    private int mDistance;
    private float mDistanceMile = 0.0f;
    private int mLastDistance = 0;
    private long mLastTime;
    private long mTime;

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
        BaseSportManager.getInstance().updateSourceData(getLogTag(), "DISTANCE_DATA", Integer.valueOf(this.mDistance));
        BaseSportManager.getInstance().updateSourceData(getLogTag(), "DISTANCE_MILE_DATA", Float.valueOf(this.mDistanceMile));
        BaseSportManager.getInstance().stagingAndNotification("DISTANCE_MILE_DATA", Float.valueOf(this.mDistanceMile));
        this.mLastDistance = this.mDistance;
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        BaseSportManager.getInstance().subscribeToIndoorEquipment(arrayList, this);
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.sportservice.datasource.BaseSource
    public void generateData(Integer num) {
        if (this.mLastDistance > 0) {
            int iIntValue = num.intValue();
            int i = this.mLastDistance;
            if (iIntValue - i > 100) {
                long j = this.mTime;
                long j2 = this.mLastTime;
                if (j - j2 < 5) {
                    LogUtil.e(TAG, "distance short jump", " distance = ", num, " mLastDistance = ", Integer.valueOf(i), " mLastTime ", Long.valueOf(j2), " mTime ", Long.valueOf(j));
                    return;
                }
            }
            int iIntValue2 = num.intValue();
            int i2 = this.mLastDistance;
            if (iIntValue2 - i2 >= 200 || i2 > num.intValue()) {
                LogUtil.e(TAG, "distance jump or short", " distance = ", num, " mLastDistance = ", Integer.valueOf(this.mLastDistance));
                return;
            }
        }
        this.mDistance = num.intValue();
        this.mDistanceMile = num.intValue() * DISTANCE_COEFFICIENT;
        updateSourceData();
    }

    @Override // com.huawei.health.sportservice.inter.IndoorToSource
    public void onIndoorDataChanged(int i, Object obj) {
        if (!(obj instanceof Integer)) {
            LogUtil.e(TAG, "onIndoorDataChanged object is invalid.");
            return;
        }
        if (i == 1) {
            generateData((Integer) obj);
        } else if (i == 2) {
            this.mLastTime = this.mTime;
            this.mTime = ((Integer) obj).intValue();
        }
    }
}
