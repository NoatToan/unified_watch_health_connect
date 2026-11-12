package com.huawei.health.sportservice.dataproducer;

import android.os.Bundle;
import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwfoundationmodel.trackmodel.MotionPathSimplify;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.gzu;
import defpackage.gzv;
import defpackage.hau;
import defpackage.njy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.RUNNING_POSTURE_PRODUCER)
public class RunningPostureProducer extends BaseProducer implements SportLifecycle {
    public static final int FIVE_SECOND = 5000;
    private static final String TAG = "SportService_RunningPostureProducer";
    private long mLastUpdateTime;
    private gzv mRunningPosture;
    private CopyOnWriteArrayList<gzv> mRunningPostureList = new CopyOnWriteArrayList<>();
    private hau mSportCallbackOption = new hau();

    private int getValue(int i) {
        if (i == -1.0f) {
            return 0;
        }
        return i;
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
        this.mLastUpdateTime = ((Long) BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION")).longValue();
        gzv gzvVar = (gzv) obj;
        this.mRunningPosture = gzvVar;
        LogUtil.a(TAG, "onSourceDataChanged mRunningPosture", gzvVar.toString());
        onStagingAndNotification();
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPauseSport() {
        BaseSportManager.getInstance().stagingAndNotification("RUNNING_POSTURE_DATA", -1);
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        if (BaseSportManager.getInstance().getStatus() == 1) {
            gzv gzvVar = new gzv(((int) ((Long) BaseSportManager.getInstance().getData("TIME_ONE_SECOND_DURATION")).longValue()) / 1000, getValue(this.mRunningPosture.a()), getValue(this.mRunningPosture.d()), getValue(this.mRunningPosture.j()), this.mRunningPosture.b() == -101 ? 0 : this.mRunningPosture.b(), getValue(this.mRunningPosture.e()), getValue(this.mRunningPosture.i()), getValue(this.mRunningPosture.c()));
            gzvVar.i(getValue(this.mRunningPosture.l()));
            gzvVar.h(getValue(this.mRunningPosture.k()));
            gzvVar.d(getValue(Float.valueOf(this.mRunningPosture.f())));
            gzvVar.c(getValue(Float.valueOf(this.mRunningPosture.o())));
            gzvVar.f(getValue(this.mRunningPosture.m()));
            gzvVar.a(getValue(Float.valueOf(this.mRunningPosture.t())));
            gzvVar.e(getValue(Float.valueOf(this.mRunningPosture.q())));
            gzvVar.b(getValue(Float.valueOf(this.mRunningPosture.n())));
            LogUtil.a(TAG, "onStagingAndNotification mRunningPosture", gzvVar);
            BaseSportManager.getInstance().stagingAndNotification("RUNNING_POSTURE_DATA", gzvVar);
        }
    }

    private float getValue(Float f) {
        if (f.floatValue() == -1.0f) {
            return 0.0f;
        }
        return f.floatValue();
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        Object data2 = BaseSportManager.getInstance().getData("MOTION_PATH_SIMPLIFY_DATA");
        if ((data instanceof MotionPath) && (data2 instanceof MotionPathSimplify)) {
            MotionPath motionPath = (MotionPath) data;
            ArrayList<gzv> arrayList = new ArrayList<>(this.mRunningPostureList);
            LogUtil.a(TAG, "list.size", Integer.valueOf(arrayList.size()));
            motionPath.saveRunningPostureList(arrayList);
            BaseSportManager.getInstance().stagingData(JsUtil.DataFunc.MOTION_PATH_DATA, motionPath);
            MotionPathSimplify motionPathSimplify = (MotionPathSimplify) data2;
            if (arrayList.size() > 0) {
                getSimplifyDataLowerHalf(motionPathSimplify, arrayList);
            }
            BaseSportManager.getInstance().stagingData("MOTION_PATH_SIMPLIFY_DATA", motionPathSimplify);
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void recoveryData() {
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (data instanceof MotionPath) {
            MotionPath motionPath = (MotionPath) data;
            if (njy.b(motionPath.requestRunningPostureList())) {
                this.mRunningPostureList = new CopyOnWriteArrayList<>(motionPath.requestRunningPostureList());
            }
            LogUtil.a(TAG, "recovery mRunningPostureList.size() ", Integer.valueOf(this.mRunningPostureList.size()));
        }
    }

    private void getSimplifyDataLowerHalf(MotionPathSimplify motionPathSimplify, List<gzv> list) {
        Bundle bundleD = gzu.d(list);
        motionPathSimplify.saveAverageHangTime(bundleD.getInt("averageHangTime", 0));
        motionPathSimplify.saveGroundHangTimeRate(bundleD.getFloat("groundHangTimeRate", 0.0f));
        motionPathSimplify.saveAvgGroundContactTime(bundleD.getInt("avgGroundContactTime", 0));
        motionPathSimplify.saveAvgGroundImpactAcceleration(bundleD.getInt("avgGroundImpactAcceleration", 0));
        motionPathSimplify.saveAvgSwingAngle(bundleD.getInt("avgSwingAngle", 0));
        motionPathSimplify.saveAvgEversionExcursion(bundleD.getInt("avgEversionExcursion", 0));
        motionPathSimplify.saveAvgForeFootStrikePattern(bundleD.getInt("foreFootStrikePatternPercentage", 0));
        motionPathSimplify.saveAvgWholeFootStrikePattern(bundleD.getInt("wholeFootStrikePatternPercentage", 0));
        motionPathSimplify.saveAvgHindFootStrikePattern(bundleD.getInt("hindFootStrikePatternPercentage", 0));
        float f = bundleD.getFloat("averageverticalimpactrate", -1.0f);
        if (f != -1.0f) {
            motionPathSimplify.addExtendDataMap("avg_v_i_r", String.valueOf(f));
        }
        float f2 = bundleD.getFloat("averageimpactpeak", -1.0f);
        if (f2 > 0.0f) {
            motionPathSimplify.addExtendDataMap("avg_i_p", String.valueOf(f2));
        }
        float f3 = bundleD.getFloat("averagegctimebalance", -1.0f);
        if (f3 != -1.0f) {
            motionPathSimplify.addExtendDataMap("avg_gc_tb", String.valueOf(f3));
        }
        float f4 = bundleD.getFloat("averageverticaloscillation", -1.0f);
        if (f4 != -1.0f) {
            motionPathSimplify.addExtendDataMap("avg_v_osc", String.valueOf(f4));
        }
        float f5 = bundleD.getFloat("averageverticalration", -1.0f);
        if (f5 != -1.0f) {
            motionPathSimplify.addExtendDataMap("avg_v_s_r", String.valueOf(f5));
        }
        if (f != -1.0f || f3 != -1.0f || f4 != -1.0f) {
            motionPathSimplify.addExtendDataMap("bolt_connected_flag", "2");
        }
        LogUtil.a(TAG, "saveRunningPostureData verticalImpactRate = ", Float.valueOf(f), " avgImpactPeak = ", Float.valueOf(f2), " gcTimeBalance = ", Float.valueOf(f3), " verticalOscillation = ", Float.valueOf(f4), "avgVerStrikeRatio = ", Float.valueOf(f5), " motionPathSimplify.getExtendDataFloat = ", Float.valueOf(motionPathSimplify.getExtendDataFloat("bolt_connected_flag")));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().subscribeToSource("RUNNING_POSTURE_DATA", this);
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_FIVE_SECOND_DURATION");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.dataproducer.RunningPostureProducer$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1161x7045c962(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-dataproducer-RunningPostureProducer, reason: not valid java name */
    /* synthetic */ void m1161x7045c962(List list, Map map) {
        if (this.mRunningPosture != null) {
            long jLongValue = ((Long) map.get("TIME_FIVE_SECOND_DURATION")).longValue();
            if (jLongValue > this.mLastUpdateTime + 5000) {
                return;
            }
            gzv gzvVar = new gzv(((int) jLongValue) / 1000, this.mRunningPosture.a(), this.mRunningPosture.d(), this.mRunningPosture.j(), this.mRunningPosture.b(), this.mRunningPosture.e(), this.mRunningPosture.i(), this.mRunningPosture.c());
            gzvVar.i(this.mRunningPosture.l());
            gzvVar.h(this.mRunningPosture.k());
            gzvVar.d(this.mRunningPosture.f());
            gzvVar.c(this.mRunningPosture.o());
            gzvVar.f(this.mRunningPosture.m());
            gzvVar.a(this.mRunningPosture.t());
            gzvVar.e(this.mRunningPosture.q());
            gzvVar.b(this.mRunningPosture.n());
            LogUtil.a(TAG, "onPreSport mRunningPosture", gzvVar);
            this.mRunningPostureList.add(gzvVar);
        }
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        onSaveData();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
    }
}
