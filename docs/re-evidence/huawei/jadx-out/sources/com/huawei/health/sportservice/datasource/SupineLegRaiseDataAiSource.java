package com.huawei.health.sportservice.datasource;

import android.util.Pair;
import androidx.collection.SimpleArrayMap;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.aiforwardflex.OnSportCodeListenerWrapper;
import defpackage.nue;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.SUPINE_LEG_RAISE_DATA_SOURCE)
public class SupineLegRaiseDataAiSource extends BaseSource implements SportLifecycle, OnSportCodeListenerWrapper {
    private static final String TAG = "SportService_SupineLegRaiseDataAiSource";
    private int mContinuousTimes;
    private int mDataTimes;
    private int mInterruptTimes;
    private final nue mPoint = new nue();

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void generateData(Object obj) {
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected void updateSourceData() {
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().setParas(SportParamsType.AI_SPORT_EXAM_SOURCE_LISTENER, this);
    }

    @Override // com.huawei.pluginsport.aiforwardflex.OnSportCodeListenerWrapper
    public void getData(SimpleArrayMap simpleArrayMap) {
        if (simpleArrayMap == null) {
            LogUtil.j(TAG, "getData map == null");
        } else {
            getStatus(simpleArrayMap);
            getPoint(simpleArrayMap);
        }
    }

    private void successCount(int i) {
        if (i == -2000) {
            this.mDataTimes++;
            this.mContinuousTimes++;
            BaseSportManager.getInstance().stagingAndNotification("SPORT_EXAM_SCORE", Integer.valueOf(this.mDataTimes));
            BaseSportManager.getInstance().stagingAndNotification("CONTINUOUS_DATA", Integer.valueOf(this.mContinuousTimes));
        }
    }

    private void interruptTimesCount(int i) {
        if (i == -2008) {
            this.mContinuousTimes = 0;
            BaseSportManager baseSportManager = BaseSportManager.getInstance();
            int i2 = this.mInterruptTimes + 1;
            this.mInterruptTimes = i2;
            baseSportManager.stagingAndNotification("INTERRUPT_DATA", Integer.valueOf(i2));
            BaseSportManager.getInstance().stagingAndNotification("CONTINUOUS_DATA", Integer.valueOf(this.mContinuousTimes));
        }
    }

    private void getPoint(SimpleArrayMap simpleArrayMap) {
        boolean z;
        Pair<Float, Float> groupPoint = getGroupPoint(simpleArrayMap, "pointX", "pointY");
        boolean z2 = true;
        if (groupPoint != null) {
            this.mPoint.k(((Float) groupPoint.first).floatValue());
            this.mPoint.l(((Float) groupPoint.second).floatValue());
            z = true;
        } else {
            z = false;
        }
        Pair<Float, Float> groupPoint2 = getGroupPoint(simpleArrayMap, "ankleX", "ankleY");
        if (groupPoint2 != null) {
            this.mPoint.b(((Float) groupPoint2.first).intValue());
            this.mPoint.c(((Float) groupPoint2.second).intValue());
            z = true;
        }
        Pair<Float, Float> groupPoint3 = getGroupPoint(simpleArrayMap, "hipX", "hipY");
        if (groupPoint3 != null) {
            this.mPoint.f(((Float) groupPoint3.first).intValue());
            this.mPoint.g(((Float) groupPoint3.second).intValue());
        } else {
            z2 = z;
        }
        if (isChangeGroupDirectionPoint(simpleArrayMap) || z2) {
            BaseSportManager.getInstance().stagingAndNotification("BODY_POINT_DATA", this.mPoint);
        }
    }

    private Pair<Float, Float> getGroupPoint(SimpleArrayMap simpleArrayMap, String str, String str2) {
        if (!simpleArrayMap.containsKey(str) || !simpleArrayMap.containsKey(str2)) {
            return null;
        }
        Object obj = simpleArrayMap.get(str);
        Object obj2 = simpleArrayMap.get(str2);
        if (!(obj instanceof Float) || !(obj2 instanceof Float)) {
            return null;
        }
        Float f = (Float) obj;
        f.floatValue();
        Float f2 = (Float) obj2;
        f2.floatValue();
        return new Pair<>(f, f2);
    }

    private boolean isChangeGroupDirectionPoint(SimpleArrayMap simpleArrayMap) {
        if (!simpleArrayMap.containsKey(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
            return false;
        }
        Object obj = simpleArrayMap.get(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
        if (!(obj instanceof Integer)) {
            return false;
        }
        this.mPoint.d(((Integer) obj).intValue());
        return true;
    }

    private void getStatus(SimpleArrayMap simpleArrayMap) {
        if (simpleArrayMap.containsKey("errCode")) {
            Object obj = simpleArrayMap.get("errCode");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                BaseSportManager.getInstance().stagingAndNotification("STATUS_CODE_DATA", num);
                successCount(iIntValue);
                interruptTimesCount(iIntValue);
            }
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }
}
