package com.huawei.health.sportservice.datasource;

import androidx.collection.SimpleArrayMap;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.constants.SportParamsType;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginsport.aiforwardflex.OnSportCodeListenerWrapper;
import defpackage.nue;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.LONG_JUMP_DATA_SOURCE)
public class LongJumpDataAiSource extends BaseSource implements SportLifecycle, OnSportCodeListenerWrapper {
    private static final int INTERVAL_TIME = 5000;
    private static final int METERS_TO_CENTIMETERS = 100;
    private static final String TAG = "SportService_LongJumpDataAiSource";
    private final nue mPoint = new nue();
    private long mLeftScreenTime = 0;
    private long mFarTipsTime = 0;

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
            return;
        }
        handleStatus(simpleArrayMap);
        handlePoint(simpleArrayMap);
        getScore(simpleArrayMap);
    }

    private boolean isVailEndPoint(SimpleArrayMap simpleArrayMap) {
        if (!simpleArrayMap.containsKey("endX") || !simpleArrayMap.containsKey("endY")) {
            return false;
        }
        Object obj = simpleArrayMap.get("endX");
        Object obj2 = simpleArrayMap.get("endY");
        if (!(obj instanceof Float) || !(obj2 instanceof Float)) {
            return false;
        }
        float fFloatValue = ((Float) obj).floatValue();
        float fFloatValue2 = ((Float) obj2).floatValue();
        if (fFloatValue <= 0.0f || fFloatValue2 <= 0.0f) {
            return false;
        }
        this.mPoint.a(fFloatValue);
        this.mPoint.d(fFloatValue2);
        return true;
    }

    private void getScore(SimpleArrayMap simpleArrayMap) {
        if (simpleArrayMap.containsKey("length")) {
            Object obj = simpleArrayMap.get("length");
            if (obj instanceof Float) {
                float fFloatValue = ((Float) obj).floatValue() * 100.0f;
                BaseSportManager.getInstance().stagingAndNotification("SPORT_EXAM_SCORE", Integer.valueOf((int) fFloatValue));
                ReleaseLogUtil.d(TAG, "jumpScore:", Float.valueOf(fFloatValue));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0020 A[DONT_INVERT] */
    private void handlePoint(SimpleArrayMap simpleArrayMap) {
        boolean zIsVailEndPoint = isVailEndPoint(simpleArrayMap);
        if (simpleArrayMap.containsKey("footX")) {
            Object obj = simpleArrayMap.get("footX");
            if (obj instanceof Float) {
                this.mPoint.e(((Float) obj).floatValue());
            } else if (!zIsVailEndPoint) {
                return;
            }
        } else if (!zIsVailEndPoint) {
            return;
        }
        BaseSportManager.getInstance().stagingAndNotification("BODY_POINT_DATA", this.mPoint);
    }

    private void handleStatus(SimpleArrayMap simpleArrayMap) {
        if (simpleArrayMap.containsKey("errCode")) {
            Object obj = simpleArrayMap.get("errCode");
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                if (iIntValue == -3 || iIntValue == -2 || iIntValue == -1) {
                    handleLeftScreenStatus(iIntValue);
                } else {
                    if (iIntValue == -3005) {
                        handleFarDistanceStatus(iIntValue);
                        return;
                    }
                    this.mLeftScreenTime = 0L;
                    this.mFarTipsTime = 0L;
                    BaseSportManager.getInstance().stagingAndNotification("STATUS_CODE_DATA", num);
                }
            }
        }
    }

    private void handleLeftScreenStatus(int i) {
        if (this.mLeftScreenTime == 0) {
            this.mLeftScreenTime = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - this.mLeftScreenTime > 5000) {
            BaseSportManager.getInstance().stagingAndNotification("STATUS_CODE_DATA", Integer.valueOf(i));
            this.mLeftScreenTime = 0L;
        }
        this.mFarTipsTime = 0L;
    }

    private void handleFarDistanceStatus(int i) {
        if (this.mFarTipsTime == 0) {
            this.mFarTipsTime = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - this.mFarTipsTime > 5000) {
            BaseSportManager.getInstance().stagingAndNotification("STATUS_CODE_DATA", Integer.valueOf(i));
            this.mFarTipsTime = 0L;
        }
        this.mLeftScreenTime = 0L;
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }
}
