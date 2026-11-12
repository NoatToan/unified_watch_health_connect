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
import com.huawei.operation.jsoperation.JsUtil;
import com.huawei.pluginsport.aiforwardflex.OnSportCodeListenerWrapper;
import defpackage.nue;
import health.compact.a.CommonUtil;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 3, name = ComponentName.STAND_FLEXION_DATA_AI_SOURCE)
public class StandFlexionDataAiSource extends BaseSource implements SportLifecycle, OnSportCodeListenerWrapper {
    private static final String TAG = "SportService_StandFlexionDataAiSource";
    private int mHighestScore;
    private int mInitCurrentScore;
    private long mInitCurrentTime;
    private int mTempMaxScore;
    private final nue mPoint = new nue();
    private boolean mIsNeedPlayDistinguish = true;
    private boolean mIsUpdateMaxScore = false;

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
            return;
        }
        getStatus(simpleArrayMap);
        if (BaseSportManager.getInstance().getStatus() != 1) {
            return;
        }
        getBodyPoint(simpleArrayMap);
        getScore(simpleArrayMap);
    }

    private void getScore(SimpleArrayMap simpleArrayMap) {
        if (simpleArrayMap.containsKey(JsUtil.SCORE)) {
            Object obj = simpleArrayMap.get(JsUtil.SCORE);
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                boolean zIsLegalScore = isLegalScore(num.intValue());
                getHighestScore(zIsLegalScore);
                sendDistinguishLegalScoreMsg(zIsLegalScore);
                BaseSportManager.getInstance().stagingAndNotification("STAND_FLEXION_SCORE_DATA", num);
            }
        }
    }

    private void sendDistinguishLegalScoreMsg(boolean z) {
        if (!z) {
            BaseSportManager.getInstance().stagingAndNotification("STAND_FLEXION_IS_LEGAL_SCORE", false);
            this.mIsNeedPlayDistinguish = true;
        } else if (this.mIsNeedPlayDistinguish || this.mIsUpdateMaxScore) {
            BaseSportManager.getInstance().stagingAndNotification("STAND_FLEXION_IS_LEGAL_SCORE", true);
            this.mIsNeedPlayDistinguish = false;
        }
    }

    private boolean isLegalScore(int i) {
        if (CommonUtil.b(this.mInitCurrentTime)) {
            this.mInitCurrentTime = System.currentTimeMillis();
        }
        int i2 = this.mInitCurrentScore;
        boolean z = false;
        if (i < i2 - 10 || i > i2 + 10) {
            this.mInitCurrentScore = i;
            this.mInitCurrentTime = System.currentTimeMillis();
            this.mTempMaxScore = 0;
            return false;
        }
        if (i > this.mTempMaxScore) {
            this.mTempMaxScore = i;
            this.mIsUpdateMaxScore = true;
        } else {
            this.mIsUpdateMaxScore = false;
        }
        if (System.currentTimeMillis() - this.mInitCurrentTime >= 2000 && i > 0) {
            z = true;
        }
        LogUtil.a(TAG, "isLegal:", Boolean.valueOf(z), "mTempMaxScore:", Integer.valueOf(this.mTempMaxScore));
        return z;
    }

    private void getHighestScore(boolean z) {
        LogUtil.a(TAG, "getHighestScore mTempMaxScore:", Integer.valueOf(this.mTempMaxScore), ", isLegal:", Boolean.valueOf(z));
        if (!z || this.mTempMaxScore <= 0) {
            return;
        }
        BaseSportManager.getInstance().stagingAndNotification("STAND_FLEXION_HIGHEST_SCORE_TEMP", Integer.valueOf(this.mTempMaxScore));
    }

    private void getBodyPoint(SimpleArrayMap simpleArrayMap) {
        boolean z;
        Pair<Float, Float> groupPoint = getGroupPoint(simpleArrayMap, "footX", "footY");
        boolean z2 = true;
        if (groupPoint != null) {
            this.mPoint.e(((Float) groupPoint.first).intValue());
            this.mPoint.j(((Float) groupPoint.second).intValue());
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
        Pair<Float, Float> groupPoint3 = getGroupPoint(simpleArrayMap, "handX", "handY");
        if (groupPoint3 != null) {
            this.mPoint.i(((Float) groupPoint3.first).intValue());
            this.mPoint.h(((Float) groupPoint3.second).intValue());
            z = true;
        }
        Pair<Float, Float> groupPoint4 = getGroupPoint(simpleArrayMap, "kneeX", "kneeY");
        if (groupPoint4 != null) {
            this.mPoint.m(((Float) groupPoint4.first).intValue());
            this.mPoint.o(((Float) groupPoint4.second).intValue());
            z = true;
        }
        Pair<Float, Float> groupPoint5 = getGroupPoint(simpleArrayMap, "hipX", "hipY");
        if (groupPoint5 != null) {
            this.mPoint.f(((Float) groupPoint5.first).intValue());
            this.mPoint.g(((Float) groupPoint5.second).intValue());
        } else {
            z2 = z;
        }
        if (isChangeGroupDirectionPoint(simpleArrayMap, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION) || z2) {
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

    private boolean isChangeGroupDirectionPoint(SimpleArrayMap simpleArrayMap, String str) {
        if (!simpleArrayMap.containsKey(str)) {
            return false;
        }
        Object obj = simpleArrayMap.get(str);
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
                num.intValue();
                BaseSportManager.getInstance().stagingAndNotification("STATUS_CODE_DATA", num);
            }
        }
    }

    @Override // com.huawei.health.sportservice.datasource.BaseSource
    protected String getLogTag() {
        return TAG;
    }
}
