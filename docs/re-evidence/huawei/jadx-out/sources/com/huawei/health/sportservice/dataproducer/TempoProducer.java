package com.huawei.health.sportservice.dataproducer;

import com.huawei.health.sportservice.SportDataNotify;
import com.huawei.health.sportservice.SportLifecycle;
import com.huawei.health.sportservice.manager.BaseSportManager;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.health.sportservice.template.SportComponentType;
import com.huawei.hwfoundationmodel.trackmodel.MotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.jsoperation.JsUtil;
import defpackage.hau;
import defpackage.hby;
import defpackage.nji;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes31.dex */
@SportComponentType(classify = 2, name = ComponentName.TEMPO_PRODUCER)
public class TempoProducer extends BaseProducer implements SportLifecycle {
    private static final String TAG = "SportService_TempoProducer";
    private float mTempo;
    private CopyOnWriteArrayList<nji> mTempoList = new CopyOnWriteArrayList<>();
    private hau mSportCallbackOption = new hau();

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer, com.huawei.health.sportservice.inter.SourceToProducer
    public void onSourceDataChanged(Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        if (fFloatValue < 1.0E-6d) {
            this.mTempo = 0.0f;
        } else {
            this.mTempo = hby.e(fFloatValue, 1);
        }
        onStagingAndNotification();
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onStagingAndNotification() {
        BaseSportManager.getInstance().stagingAndNotification("TEMPO_DATA", Float.valueOf(this.mTempo));
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void onSaveData() {
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (data instanceof MotionPath) {
            MotionPath motionPath = (MotionPath) data;
            motionPath.savePaddleFrequencyList(this.mTempoList);
            LogUtil.a(TAG, "mTempoList ", Integer.valueOf(this.mTempoList.size()));
            BaseSportManager.getInstance().stagingData(JsUtil.DataFunc.MOTION_PATH_DATA, motionPath);
        }
    }

    @Override // com.huawei.health.sportservice.dataproducer.BaseProducer
    void recoveryData() {
        Object data = BaseSportManager.getInstance().getData(JsUtil.DataFunc.MOTION_PATH_DATA);
        if (!(data instanceof MotionPath)) {
            LogUtil.e(TAG, "recovery failed. MotionPath type is wrong");
            return;
        }
        MotionPath motionPath = (MotionPath) data;
        LogUtil.a(TAG, "recovery motionPath ", motionPath.toString());
        if (motionPath.requestPaddleFrequencyList() != null) {
            this.mTempoList.addAll(motionPath.requestPaddleFrequencyList());
        }
        LogUtil.a(TAG, "recovery mTempoList size is ", Integer.valueOf(this.mTempoList.size()));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    public void onPreSport() {
        BaseSportManager.getInstance().subscribeToSource("TEMPO_DATA", this);
        ArrayList arrayList = new ArrayList();
        arrayList.add("TIME_FIVE_SECOND_TIMESTAMP");
        this.mSportCallbackOption.e(arrayList);
        this.mSportCallbackOption.d(TAG);
        BaseSportManager.getInstance().subscribeNotify(this.mSportCallbackOption, new SportDataNotify() { // from class: com.huawei.health.sportservice.dataproducer.TempoProducer$$ExternalSyntheticLambda0
            @Override // com.huawei.health.sportservice.SportDataNotify
            public final void onChange(List list, Map map) {
                this.f$0.m1168x96460f46(list, map);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onPreSport$0$com-huawei-health-sportservice-dataproducer-TempoProducer, reason: not valid java name */
    /* synthetic */ void m1168x96460f46(List list, Map map) {
        this.mTempoList.add(new nji(((Long) map.get("TIME_FIVE_SECOND_TIMESTAMP")).longValue(), this.mTempo));
    }

    @Override // com.huawei.health.sportservice.SportLifecycle
    /* JADX INFO: renamed from: onStopSport */
    public void m825x32b3e3a1() {
        onSaveData();
        BaseSportManager.getInstance().cancelSubscribeNotify(this.mSportCallbackOption);
        hby.e(1);
    }
}
